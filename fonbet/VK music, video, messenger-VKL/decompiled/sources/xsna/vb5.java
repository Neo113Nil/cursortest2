package xsna;

import com.vk.libvideo.offline.settings.api.domain.objects.QualityOptionTypeDo;
import xsna.dz40;
import xsna.gfp0;
import xsna.ggp0;
import xsna.hq80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vb5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vb5(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                wb5.a((ld5) this.c, (gzs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((r7p) this.c).g((com.vk.search.params.impl.presentation.modal.education.mvi.model.d) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                String str = (String) this.c;
                q630 q630Var = (q630) this.e;
                gzs gzsVar = (gzs) this.d;
                ((Integer) obj2).getClass();
                bzv.a(ne7.I(1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var);
                break;
            case 3:
                nc70 nc70Var = (nc70) this.c;
                ad70 ad70Var = (ad70) this.d;
                izs<? super oa70, s3q0> izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1717543151, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ThemedContent.<anonymous> (NotificationListView.kt:101)");
                    }
                    nc70Var.l(ad70Var, izsVar, aVar, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 4:
                one.video.exo.offline.f fVar = (one.video.exo.offline.f) obj2;
                ((hq80) this.c).g.invoke(new hq80.a((QualityOptionTypeDo) obj, oao.b(fVar, (tdm) this.d), null, new g4(16, (ygp0) this.e, fVar)));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((i1b0) this.c).k((n1b0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cgb0.b((gfp0.c) this.c, (dz40.a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((ofl0) this.c).f((q630) this.e, (jai) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 8:
                vfp0 vfp0Var = (vfp0) this.c;
                izs<? super tfp0, s3q0> izsVar2 = (izs) this.d;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(877728354, intValue2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.TrackMenuContentView.ThemedContent.<anonymous> (TrackMenuContentView.kt:62)");
                    }
                    vfp0Var.i((ggp0.a) mtk0Var.getValue(), izsVar2, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((txs0) this.c).b((ao50) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                q630 q630Var2 = (q630) this.e;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                ((Integer) obj2).getClass();
                nyu0.c(ne7.I(1), (androidx.compose.runtime.a) obj, str2, str3, q630Var2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vb5(int i, int i2, Object obj, xzs xzsVar, q630 q630Var) {
        this.b = i2;
        this.c = obj;
        this.e = q630Var;
        this.d = xzsVar;
    }

    public /* synthetic */ vb5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ vb5(q630 q630Var, String str, String str2, int i) {
        this.b = 10;
        this.e = q630Var;
        this.c = str;
        this.d = str2;
    }
}
