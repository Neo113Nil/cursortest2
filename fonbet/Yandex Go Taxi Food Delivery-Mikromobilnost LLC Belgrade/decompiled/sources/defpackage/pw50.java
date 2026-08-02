package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;

/* loaded from: classes15.dex */
public final /* synthetic */ class pw50 implements Closeable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pw50(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sw50 sw50Var = (sw50) obj2;
                rw50 rw50Var = (rw50) obj;
                Handler handler = sw50Var.x;
                if (jl40.f && !jl40.l(handler.getLooper(), Looper.myLooper())) {
                    dy31.h(handler.getLooper().getThread());
                    break;
                } else {
                    sw50Var.b.remove(rw50Var);
                    break;
                }
                break;
            case 1:
                l8x l8xVar = (l8x) obj;
                ((i0x0) obj2).close();
                if (l8xVar != null) {
                    l8xVar.a(null);
                    break;
                }
                break;
            case 2:
                ((fr31) obj2).b.remove((ydb) obj);
                break;
            default:
                ((do41) obj2).b.remove((ao41) obj);
                break;
        }
    }
}
