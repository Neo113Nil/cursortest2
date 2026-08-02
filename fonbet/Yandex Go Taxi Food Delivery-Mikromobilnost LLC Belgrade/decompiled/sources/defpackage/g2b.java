package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes15.dex */
public final /* synthetic */ class g2b implements hxy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g2b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hxy
    public final void cancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((yn50) ((g9v) obj)).a();
                break;
            case 1:
                ((yn50) obj).a();
                break;
            case 2:
                ((hbv) obj).dispose();
                break;
            case 3:
                ((pzt0) obj).a(null);
                break;
            case 4:
                yf7 yf7Var = (yf7) obj;
                if (yf7Var != null) {
                    yf7Var.cancel();
                    break;
                }
                break;
            default:
                gr71 gr71Var = (gr71) ((Ref$ObjectRef) obj).element;
                if (gr71Var != null) {
                    gr71Var.a();
                    break;
                }
                break;
        }
    }
}
