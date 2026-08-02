package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public final /* synthetic */ class f891 implements Callable {
    public static final /* synthetic */ f891 b = new f891(0);
    public static final /* synthetic */ f891 c = new f891(1);
    public final /* synthetic */ int a;

    public /* synthetic */ f891(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                ga0 ga0Var = hv20.x;
                return null;
            default:
                return new yvb1();
        }
    }
}
