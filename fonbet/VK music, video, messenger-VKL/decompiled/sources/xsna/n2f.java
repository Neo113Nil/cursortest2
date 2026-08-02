package xsna;

import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import xsna.loh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class n2f implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n2f(PostingStepScreen postingStepScreen, izs izsVar, int i) {
        this.b = 3;
        this.d = postingStepScreen;
        this.e = izsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                o2f o2fVar = (o2f) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                o2fVar.z(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            case 1:
                ((Integer) obj2).intValue();
                r1h.b((loh0.d) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ccz.b((String) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                oxf0.a((PostingStepScreen) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                String str = (String) this.d;
                frv0 frv0Var = (frv0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1404668476, intValue, -1, "com.vk.libvideo.tool.compose.textwithsuffix.measureTextContent.<anonymous> (TextWithSuffixLayout.kt:117)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, this.c, null, frv0Var, aVar, 100663296, 0, 5882);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign = (VideoCatalogAlbumBottomSheetRedesign) this.d;
                jai jaiVar2 = (jai) this.e;
                ((Integer) obj2).getClass();
                videoCatalogAlbumBottomSheetRedesign.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n2f(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ n2f(String str, int i, frv0 frv0Var) {
        this.b = 4;
        this.d = str;
        this.c = i;
        this.e = frv0Var;
    }
}
