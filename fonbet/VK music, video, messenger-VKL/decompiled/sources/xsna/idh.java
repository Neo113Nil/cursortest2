package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import xsna.mut0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class idh implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ idh(ComposeView composeView, VideoPlaylistBottomSheetRedesign videoPlaylistBottomSheetRedesign, FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        this.c = composeView;
        this.d = videoPlaylistBottomSheetRedesign;
        this.e = fragmentActivity;
        this.f = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                jdh.a((fdh) this.c, (i7d0) this.d, (q630) this.e, (k7d0) this.f, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                ComposeView composeView = (ComposeView) this.c;
                VideoPlaylistBottomSheetRedesign videoPlaylistBottomSheetRedesign = (VideoPlaylistBottomSheetRedesign) this.d;
                FragmentActivity fragmentActivity = (FragmentActivity) this.e;
                ViewGroup viewGroup = (ViewGroup) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1858022329, intValue, -1, "com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign.show.<anonymous>.<anonymous> (VideoPlaylistBottomSheetRedesign.kt:48)");
                    }
                    composeView.setViewCompositionStrategy(mut0.a.a);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(Boolean.TRUE);
                        aVar.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    if (((Boolean) wh50Var.getValue()).booleanValue()) {
                        aVar.K(-1195096497);
                        boolean y = aVar.y(videoPlaylistBottomSheetRedesign) | aVar.y(viewGroup) | aVar.y(composeView);
                        Object x2 = aVar.x();
                        if (y || x2 == c0012a) {
                            ih40 ih40Var = new ih40(videoPlaylistBottomSheetRedesign, wh50Var, viewGroup, composeView, 2);
                            aVar.R(ih40Var);
                            x2 = ih40Var;
                        }
                        videoPlaylistBottomSheetRedesign.a(fragmentActivity, (gzs) x2, aVar, 0);
                    } else {
                        aVar.K(-1197294583);
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

    public /* synthetic */ idh(fdh fdhVar, i7d0 i7d0Var, q630 q630Var, k7d0 k7d0Var, int i) {
        this.c = fdhVar;
        this.d = i7d0Var;
        this.e = q630Var;
        this.f = k7d0Var;
    }
}
