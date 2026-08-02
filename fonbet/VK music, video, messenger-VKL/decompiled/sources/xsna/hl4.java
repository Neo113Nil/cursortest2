package xsna;

import com.vk.im.engine.models.dialogs.DialogsHistory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ hl4(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                nl4 nl4Var = (nl4) obj;
                nl4Var.removeMessages(1);
                nl4Var.removeMessages(2);
                nl4Var.sendMessage(nl4Var.obtainMessage(2, Integer.valueOf(this.c)));
                return s3q0.a;
            default:
                DialogsHistory dialogsHistory = (DialogsHistory) obj;
                return new utk(new xrm(dialogsHistory, null, fsk.l(dialogsHistory), null, 10), dialogsHistory.size() == this.c);
        }
    }
}
