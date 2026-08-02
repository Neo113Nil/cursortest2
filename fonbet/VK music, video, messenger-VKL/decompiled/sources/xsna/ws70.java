package xsna;

import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import xsna.dt70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws70 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ws70(gzs gzsVar, VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign, VideoCatalogAlbumBottomSheetRedesign.a aVar, izs izsVar) {
        this.d = gzsVar;
        this.e = videoCatalogAlbumBottomSheetRedesign;
        this.f = aVar;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                zs70.a((dt70.a) this.d, (lf4) this.e, this.c, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                gzs gzsVar = (gzs) this.d;
                VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign = (VideoCatalogAlbumBottomSheetRedesign) this.e;
                VideoCatalogAlbumBottomSheetRedesign.a aVar = (VideoCatalogAlbumBottomSheetRedesign.a) this.f;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-51474996, intValue, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign.VideoAlbumBottomSheetScreen.<anonymous> (VideoCatalogAlbumBottomSheetRedesign.kt:93)");
                    }
                    b5v0.a(gzsVar, null, null, null, kai.c(-1308676113, new s0(videoCatalogAlbumBottomSheetRedesign, aVar, this.c, gzsVar, 7), aVar2), null, false, false, null, aVar2, 14180352, 302);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ws70(dt70.a aVar, lf4 lf4Var, izs izsVar, q630 q630Var, int i) {
        this.d = aVar;
        this.e = lf4Var;
        this.c = izsVar;
        this.f = q630Var;
    }
}
