package defpackage;

import yads.ui;

/* loaded from: classes7.dex */
public final /* synthetic */ class p881 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p881(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fyc) obj).T(zy11.a);
                break;
            case 1:
                ((lh81) obj).b.onInitializationCompleted();
                break;
            case 2:
                ((ui) obj).b();
                break;
            case 3:
                lm71 lm71Var = (lm71) ((cr71) obj).x;
                if (lm71Var != null) {
                    ((fk71) lm71Var.b).a();
                    break;
                }
                break;
            case 4:
                cf71 cf71Var = (cf71) ((hn71) obj).b;
                if (cf71Var != null) {
                    cf71Var.o();
                    break;
                }
                break;
            case 5:
                i971 i971Var = (i971) ((fp71) obj).w;
                if (i971Var != null) {
                    ((fk71) i971Var.b).a();
                    break;
                }
                break;
            default:
                cf71 cf71Var2 = (cf71) ((hn71) obj).b;
                if (cf71Var2 != null) {
                    cf71Var2.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p881(wq71 wq71Var, dl61 dl61Var, int i) {
        this.a = i;
        this.b = wq71Var;
    }
}
