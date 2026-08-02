package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import xsna.z740;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lye implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lye(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                nye nyeVar = (nye) this.d;
                izs izsVar = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1464606304, intValue, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.ThemedContent.<anonymous> (ClipsProfileToolbarView.kt:127)");
                    }
                    rvi.a(ujv0.b.b(udj0.a), kai.c(-799275808, new n9d(nyeVar, izsVar, mtk0Var, 1), aVar), aVar, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((y740) this.d).h((z740.a.C4159a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                du80.a((NotificationsNotificationSettingOptionsDto) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.c.d((d.b) this.d, (gzs) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((VideoPlaylistBottomSheetRedesign) this.d).a((FragmentActivity) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lye(nye nyeVar, izs izsVar, wh50 wh50Var) {
        this.b = 0;
        this.d = nyeVar;
        this.c = izsVar;
        this.e = wh50Var;
    }

    public /* synthetic */ lye(y740 y740Var, z740.a.C4159a c4159a, izs izsVar, int i) {
        this.b = 1;
        this.d = y740Var;
        this.e = c4159a;
        this.c = izsVar;
    }
}
