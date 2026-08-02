package ru.ok.android.externcalls.sdk.api.interceptor;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.sdk.api.OkApiInterceptor;
import ru.ok.android.sdk.api.OkApiResponse;
import xsna.epx;

/* compiled from: MethodListenerInterceptor.kt */
/* loaded from: classes9.dex */
public final class MethodListenerInterceptor<T> implements OkApiInterceptor {
    private final Class<T> clazz;
    private final CopyOnWriteArrayList<Listener<T>> listeners = new CopyOnWriteArrayList<>();
    private final String methodName;

    /* compiled from: MethodListenerInterceptor.kt */
    public interface Listener<T> {
        void onMethod(T t);
    }

    public MethodListenerInterceptor(String str, Class<T> cls) {
        this.methodName = str;
        this.clazz = cls;
    }

    public final void addListener(Listener<T> listener) {
        this.listeners.addIfAbsent(listener);
    }

    public final Class<T> getClazz() {
        return this.clazz;
    }

    @Override // ru.ok.android.sdk.api.OkApiInterceptor
    public OkApiResponse intercept(OkApiInterceptor.Chain chain) {
        String method = InterceptorUtilsKt.getMethod(chain.request().getRequest());
        OkApiResponse proceed = chain.proceed(chain.request());
        Object response = proceed.getResponse();
        if (epx.f(method, this.methodName) && this.clazz.isInstance(response)) {
            T cast = this.clazz.cast(response);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (cast != null) {
                    listener.onMethod(cast);
                }
            }
        }
        return proceed;
    }

    public final void removeListener(Listener<T> listener) {
        this.listeners.remove(listener);
    }
}
