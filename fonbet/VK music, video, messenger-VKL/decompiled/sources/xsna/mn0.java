package xsna;

import com.vk.voip.VoipCallActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class mn0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ mn0(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 1:
                gzsVar.invoke();
                break;
            case 2:
                gzsVar.invoke();
                break;
            default:
                int i2 = VoipCallActivity.P;
                gzsVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
