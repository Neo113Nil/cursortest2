package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes10.dex */
public class nw60 implements r430 {
    public static volatile OkHttpClient b;
    public final xf7 a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nw60() {
        this(b);
        if (b == null) {
            synchronized (nw60.class) {
                try {
                    if (b == null) {
                        b = new OkHttpClient();
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.r430
    public final q430 a(ul40 ul40Var) {
        return new k67(3, this.a);
    }

    public nw60(xf7 xf7Var) {
        this.a = xf7Var;
    }
}
