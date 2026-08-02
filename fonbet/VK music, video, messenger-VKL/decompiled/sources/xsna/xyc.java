package xsna;

import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import xsna.b9p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xyc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xyc(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                yyc yycVar = (yyc) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                yycVar.z(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((qxj) this.d).a((lgu0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.vk.donut.design.compose.banner.b.i((DonutBannerSkeletonContent) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.o((PreviewViewState.DurationBadge) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.market.good.ui.j) this.d).e((hid0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                q630 q630Var = (q630) this.d;
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                zzk0.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 6:
                ((Integer) obj2).intValue();
                ((TopBar$Before.b) this.d).e((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                ((b9p0.d) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                String str = (String) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).intValue();
                com.vk.profile.design.view.profileheader.b.e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, str, izsVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xyc(qxj qxjVar, lgu0 lgu0Var, int i) {
        this.b = 1;
        this.d = qxjVar;
        this.e = lgu0Var;
        this.c = i;
    }
}
