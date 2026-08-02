package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs20 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vs20(VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign, FragmentActivity fragmentActivity, ViewGroup viewGroup, ComposeView composeView) {
        this.c = videoCatalogAlbumBottomSheetRedesign;
        this.d = fragmentActivity;
        this.e = viewGroup;
        this.f = composeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ws20.a((String) this.c, (String) this.d, (String) this.e, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign = (VideoCatalogAlbumBottomSheetRedesign) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                ViewGroup viewGroup = (ViewGroup) this.e;
                ComposeView composeView = (ComposeView) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1941573723, intValue, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign.show.<anonymous>.<anonymous> (VideoCatalogAlbumBottomSheetRedesign.kt:69)");
                    }
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(Boolean.TRUE);
                        aVar.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    if (((Boolean) wh50Var.getValue()).booleanValue()) {
                        aVar.K(1098322913);
                        VideoCatalogAlbumBottomSheetRedesign.a aVar2 = videoCatalogAlbumBottomSheetRedesign.a;
                        boolean y = aVar.y(videoCatalogAlbumBottomSheetRedesign) | aVar.y(fragmentActivity);
                        Object x2 = aVar.x();
                        if (y || x2 == c0012a) {
                            x2 = new ufg0(9, videoCatalogAlbumBottomSheetRedesign, fragmentActivity);
                            aVar.R(x2);
                        }
                        izs izsVar = (izs) x2;
                        boolean y2 = aVar.y(viewGroup) | aVar.y(composeView);
                        Object x3 = aVar.x();
                        if (y2 || x3 == c0012a) {
                            x3 = new yy0(wh50Var, viewGroup, composeView, 10);
                            aVar.R(x3);
                        }
                        gzs gzsVar = (gzs) x3;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-877718894, 0, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign.VideoAlbumBottomSheetScreen (VideoCatalogAlbumBottomSheetRedesign.kt:91)");
                        }
                        videoCatalogAlbumBottomSheetRedesign.a(6, aVar, kai.c(-51474996, new ws70(gzsVar, videoCatalogAlbumBottomSheetRedesign, aVar2, izsVar), aVar));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar.K(1095254471);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vs20(String str, String str2, String str3, gzs gzsVar, int i) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = gzsVar;
    }
}
