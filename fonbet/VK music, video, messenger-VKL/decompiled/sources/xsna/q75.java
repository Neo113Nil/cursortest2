package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: AuthorActionHandler.kt */
/* loaded from: classes2.dex */
public final class q75 {
    public final Context a;
    public final yks0 b;
    public final vit0 c;
    public final lzh0 d;
    public final ows0 e;
    public final y1s0 f;
    public final fjs0 g;

    public q75(FragmentActivity fragmentActivity, yks0 yks0Var, vit0 vit0Var, lzh0 lzh0Var, ows0 ows0Var, y1s0 y1s0Var, fjs0 fjs0Var) {
        this.a = fragmentActivity;
        this.b = yks0Var;
        this.c = vit0Var;
        this.d = lzh0Var;
        this.e = ows0Var;
        this.f = y1s0Var;
        this.g = fjs0Var;
    }

    public final void a(gzs<s3q0> gzsVar) {
        if (this.f.G()) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_APP_STABILITY_OFFLINE;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                d6q0.a.getClass();
                d6q0.l(true, false);
                return;
            }
        }
        gzsVar.invoke();
    }

    public final void b() {
        ydt0 Y = fxc0.B().Y();
        yks0 yks0Var = this.b;
        ydt0.f(Y, this.a, yks0Var.e, yks0Var.a, null, null, 24);
        lzh0 lzh0Var = this.d;
        if (lzh0Var != null) {
            lzh0Var.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT, yks0Var.e.r());
        }
        c(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
    }

    public final void c(CommonVideoStat$CommunityClickInfo.Direction direction) {
        boolean z;
        yks0 yks0Var = this.b;
        Owner s = yks0Var.e.s();
        if (!epx.f(yks0Var.e.getType(), "video") || s == null) {
            return;
        }
        if (s.w) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                z = true;
                new ejc(z, Long.valueOf(s.b.b), null, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY, direction, 4).q();
            }
        }
        z = false;
        new ejc(z, Long.valueOf(s.b.b), null, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY, direction, 4).q();
    }
}
