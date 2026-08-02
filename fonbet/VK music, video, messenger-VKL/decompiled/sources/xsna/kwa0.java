package xsna;

import java.util.function.Consumer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kwa0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kwa0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                mwa0 mwa0Var = (mwa0) this.b;
                Throwable th = (Throwable) obj;
                xu10 xu10Var = mwa0Var.d;
                if (xu10Var != null) {
                    xu10Var.a(new awa0(th));
                }
                mwa0Var.c.c();
                break;
            default:
                rky0 rky0Var = (rky0) this.b;
                rky0Var.c.c.j((ihy0) obj, new kwa0(rky0Var, 1), false);
                break;
        }
    }
}
