package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y2b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ y2b(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c);
                qgi0.r(tgi0Var, "clip_edit_description_click_listener");
                return s3q0.a;
            case 2:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.n(tgi0Var2, 3);
                qgi0.h(tgi0Var2, this.c);
                return s3q0.a;
            default:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM user_values WHERE storage_name = ?");
                try {
                    V0.D3(1, str);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }
}
