package defpackage;

import android.os.Handler;
import androidx.media3.ui.PlayerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final /* synthetic */ class czc0 implements InvocationHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ czc0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object lambda$new$0;
        Method method2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lambda$new$0 = ((PlayerView) obj2).lambda$new$0(obj, method, objArr);
                return lambda$new$0;
            case 1:
                zxf0 zxf0Var = (zxf0) ((AtomicReference) obj2).getAndSet(null);
                return zxf0Var == null ? pwf0.a(method) : method.invoke(zxf0Var, Arrays.copyOf(objArr, objArr.length));
            default:
                i2k0 i2k0Var = (i2k0) obj2;
                Thread currentThread = Thread.currentThread();
                Handler handler = pwf0.b;
                if (currentThread == handler.getLooper().getThread()) {
                    method.invoke(i2k0Var, Arrays.copyOf(objArr, objArr.length));
                    method2 = method;
                } else {
                    method2 = method;
                    handler.post(new l9(method2, i2k0Var, objArr, new Throwable(), 28));
                }
                return pwf0.a(method2);
        }
    }
}
