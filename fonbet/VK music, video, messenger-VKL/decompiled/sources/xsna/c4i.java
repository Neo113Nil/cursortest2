package xsna;

import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c4i implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ c4i(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                if (((Boolean) gzsVar.invoke()).booleanValue()) {
                    qgi0.c(tgi0Var);
                } else {
                    qgi0.r(tgi0Var, "community_top_bar_search");
                }
                break;
            case 1:
                gzsVar.invoke();
                break;
            case 2:
                ((Boolean) obj).booleanValue();
                gzsVar.invoke();
                break;
            default:
                int i2 = VideoNewProfileHeaderViewV2.y;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
