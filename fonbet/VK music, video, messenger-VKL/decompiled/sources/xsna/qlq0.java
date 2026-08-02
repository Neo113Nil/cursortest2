package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.libvideo.ui.VideoHideView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator;
import com.vk.video.profile.presentation.f;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.data.FriendsUtils;
import xsna.atq0;
import xsna.dkq0;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qlq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qlq0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008b, code lost:
    
        if (r15 == null) goto L13;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Window window;
        Object subscribe;
        int i = 1;
        switch (this.b) {
            case 0:
                rlq0 rlq0Var = (rlq0) this.c;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.d;
                fo0 fo0Var = (fo0) obj;
                int i2 = fo0Var.a;
                if (i2 == 1) {
                    atq0 atq0Var = extendedUserProfile.a.a0 ? atq0.c.e.a : !extendedUserProfile.A1 ? atq0.c.d.a : null;
                    if (atq0Var != null) {
                        fpq0 fpq0Var = rlq0Var.k;
                        if (fpq0Var == null) {
                            fpq0Var = null;
                        }
                        fpq0Var.B(new f.h(atq0Var));
                    }
                    extendedUserProfile.a1 = 1;
                } else if (i2 == 2) {
                    atq0 atq0Var2 = rlq0Var.c.h().a0 ? atq0.c.a.a : atq0.c.b.a;
                    fpq0 fpq0Var2 = rlq0Var.k;
                    if (fpq0Var2 == null) {
                        fpq0Var2 = null;
                    }
                    fpq0Var2.B(new f.h(atq0Var2));
                    extendedUserProfile.a1 = 3;
                    extendedUserProfile.a.v = 3;
                    FriendsUtils.a(1);
                    UserId userId = extendedUserProfile.a.c;
                    if (userId != null) {
                        rlq0Var.g.b(new dkq0.a(userId));
                    }
                } else if (i2 == 4) {
                    fpq0 fpq0Var3 = rlq0Var.k;
                    if (fpq0Var3 == null) {
                        fpq0Var3 = null;
                    }
                    fpq0Var3.B(new f.h(atq0.c.C2572c.a));
                    extendedUserProfile.a1 = 1;
                }
                ProfilesRecommendations profilesRecommendations = fo0Var.b;
                if (profilesRecommendations != null) {
                    extendedUserProfile.M = profilesRecommendations;
                }
                FriendsUtils.d(extendedUserProfile.a1, rlq0Var.b.a);
                u5p0 u5p0Var = rlq0Var.i;
                if (u5p0Var == null) {
                    u5p0Var = null;
                }
                u5p0Var.invoke(new UserProfileAction.x(null, 15));
                break;
            case 1:
                VideoHideView videoHideView = (VideoHideView) this.c;
                Context context = (Context) this.d;
                videoHideView.z.invoke();
                VideoFile videoFile = videoHideView.v;
                if (videoFile != null) {
                    if (!videoHideView.x) {
                        subscribe = hg1.m(rsg0.y0(yfb.x(tft0.b(new uft0(), videoFile.I0(), videoFile.o0(), Boolean.TRUE, videoFile.r(), videoHideView.y, 8)), null, null, 3), context, 0L, false, 62).subscribe(new xvr0(new i0b0(videoFile, 27), i), new jw80(new wql0(9), 23));
                        break;
                    } else {
                        g7s0 B = fxc0.B();
                        MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator.ObjectType objectType = MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator.ObjectType.CANCEL_ACTION_BANNER;
                        B.getClass();
                        subscribe = s3q0.a;
                        break;
                    }
                }
                wjs0.a(new uwr0(videoHideView.w, false));
                Activity h = e3m.h(context);
                if (h != null && (window = h.getWindow()) != null) {
                    int i3 = ikv0.e;
                    ikv0.b.a(window);
                }
                s3q0 s3q0Var = s3q0.a;
                break;
            default:
                ((com.vk.video.profile.presentation.c) this.c).T(new f.g.a((Throwable) obj, (UserId) this.d));
                break;
        }
        return s3q0.a;
    }
}
