package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChannelMessagesLinkLongClickHandler.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class f3b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3b(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.b = 0;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                d3b.a((d3b) this.receiver);
                break;
            case 1:
                ((i9b) this.receiver).l();
                break;
            default:
                ebd ebdVar = (ebd) this.receiver;
                dw20 dw20Var = ebdVar.y;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                ebdVar.y = null;
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3b(Object obj, int i) {
        super(0, obj, i9b.class, "pinChannel", "pinChannel()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, ebd.class, "bottomSheetDismissAction", "bottomSheetDismissAction()V", 0);
                break;
            default:
                break;
        }
    }
}
