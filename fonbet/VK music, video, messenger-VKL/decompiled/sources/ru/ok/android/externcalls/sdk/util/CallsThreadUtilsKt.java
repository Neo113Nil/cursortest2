package ru.ok.android.externcalls.sdk.util;

import com.vk.movika.sdk.base.hooks.k;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.single.b;
import io.reactivex.rxjava3.schedulers.a;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.gzs;

/* compiled from: CallsThreadUtils.kt */
/* loaded from: classes9.dex */
public final class CallsThreadUtilsKt {
    public static final <T> c executeOnIoThread(gzs<? extends T> gzsVar, final Consumer<T> consumer, final Runnable runnable) {
        return new b(new k(gzsVar, 7)).q(a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt$executeOnIoThread$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(T t) {
                consumer.accept(t);
            }
        }, new f() { // from class: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt$executeOnIoThread$3
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOnIoThread$lambda$0(gzs gzsVar, y yVar) {
        try {
            yVar.onSuccess(gzsVar.invoke());
        } catch (Throwable th) {
            yVar.onError(th);
        }
    }
}
