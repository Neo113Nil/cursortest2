package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h720 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ h720(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        String str = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qcy<Object>[] qcyVarArr = MusicPlaceholderVh.o;
                qgi0.r(tgi0Var, "MusicUiHolderPlaceholderImage");
                sgi0<String> sgi0Var = k7e0.b;
                qcy<Object> qcyVar = k7e0.a[0];
                sgi0Var.getClass();
                tgi0Var.a(sgi0Var, str);
                break;
            default:
                tgi0 tgi0Var2 = (tgi0) obj;
                if (str != null) {
                    qgi0.e(tgi0Var2, str, new c24(i2));
                }
                break;
        }
        return s3q0.a;
    }
}
