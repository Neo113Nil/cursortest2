package xsna;

import android.content.Intent;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import com.vk.music.view.player.holders.tracklist.MusicBigPlayerTrackListHolder;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import xsna.wub;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wa5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wa5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        PlayerTrack playerTrack;
        PlayerTrack playerTrack2;
        int i = this.b;
        boolean z = false;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xa5.c((to5) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((kt7) obj3).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                dhr0.a.l0(((wub.a) obj3).o, R.drawable.vk_icon_chevron_right_circle_28, R.attr.vk_ui_icon_accent_themed);
                break;
            case 3:
                try {
                    ((e1l) obj3).h((Long) obj, (Long) obj2);
                } catch (IllegalArgumentException unused) {
                }
                break;
            case 4:
                ((u0d) obj3).invoke();
                break;
            case 5:
                p3u p3uVar = (p3u) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1314832669, intValue, -1, "com.vk.donut.design.compose.banner.GoalCard.<anonymous> (DonutBanner.kt:534)");
                    }
                    String str = p3uVar.b;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.i0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 3, null, frv0Var, aVar, 100663296, 48, 5882);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 6:
                lto ltoVar = (lto) obj3;
                String str2 = (String) obj;
                int intValue2 = ((Integer) obj2).intValue();
                dto dtoVar = ltoVar.E;
                ero eroVar = (ero) ltoVar.C;
                dtoVar.b(intValue2, str2, eroVar != null ? eroVar.k : null);
                ltoVar.X6(new NewsfeedExternalAction.Navigation.i(ltoVar.itemView.getContext(), str2));
                break;
            case 7:
                MusicBigPlayerTrackListHolder musicBigPlayerTrackListHolder = (MusicBigPlayerTrackListHolder) obj3;
                u2b0 u2b0Var = musicBigPlayerTrackListHolder.n;
                int intValue3 = ((Integer) obj).intValue();
                MusicTrack musicTrack = (MusicTrack) obj2;
                if (musicBigPlayerTrackListHolder.o == null) {
                    musicBigPlayerTrackListHolder.o = new PlayerTrack(musicTrack, null, intValue3, 0L, null, 26, null);
                    s3q0 s3q0Var = s3q0.a;
                }
                PlayerTrack playerTrack3 = musicBigPlayerTrackListHolder.o;
                if (playerTrack3 != null) {
                    playerTrack3.b = musicTrack;
                }
                if (playerTrack3 != null) {
                    playerTrack3.d = intValue3;
                }
                ob40 ob40Var = musicBigPlayerTrackListHolder.v;
                if ((!ob40Var.k || (playerTrack2 = ob40Var.j) == null || playerTrack2.d != u2b0Var.k() || !epx.f(playerTrack2.b, u2b0Var.b())) && (playerTrack = musicBigPlayerTrackListHolder.o) != null && playerTrack.d == u2b0Var.k() && epx.f(playerTrack.b, u2b0Var.b())) {
                    z = true;
                }
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                String str3 = (String) obj;
                lfg lfgVar = ((com.vk.newsfeed.impl.presenters.b) obj3).H;
                if (lfgVar != null) {
                    lfgVar.Q1(str3);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                rxe0.b((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 12:
                int intValue4 = ((Integer) obj2).intValue();
                int i2 = d9m0.n1;
                ((d9m0) obj3).startActivityForResult((Intent) obj, intValue4);
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((xpq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((mnr0) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                j3v0.b((qow) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wa5(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
