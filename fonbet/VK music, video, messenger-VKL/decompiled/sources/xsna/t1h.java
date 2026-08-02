package xsna;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.friend.FriendsSubscribersVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import org.json.JSONObject;
import ru.ok.android.webrtc.Privacy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class t1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t1h(FriendsSubscribersVh friendsSubscribersVh, Context context, UIBlockProfile uIBlockProfile) {
        this.b = 1;
        this.d = friendsSubscribersVh;
        this.c = context;
        this.e = uIBlockProfile;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                enj.o((Context) this.c, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(((ExtendedCommunityProfile) this.d).t0, new StringBuilder("tel:"))), ((v1h) this.e).r);
                return s3q0.a;
            case 1:
                FriendsSubscribersVh friendsSubscribersVh = (FriendsSubscribersVh) this.d;
                Context context = (Context) this.c;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) this.e;
                friendsSubscribersVh.c(FriendsAnalyticsInfo.ClickTarget.AddToFriends);
                ((io.reactivex.rxjava3.disposables.b) friendsSubscribersVh.i.getValue()).b(hg1.m(rsg0.y0(yfb.x(nts.d((nts) friendsSubscribersVh.f.getValue(), uIBlockProfile.A.c, null, null, Privacy.FRIENDS, null, uIBlockProfile.y.d, null, 86)), null, null, 3), context, 0L, false, 62).subscribe(new vl0(new yd6(uIBlockProfile, friendsSubscribersVh, context, 2), 22), new mp0(new rl2(23), 24)));
                return s3q0.a;
            case 2:
                iy30 iy30Var = (iy30) this.c;
                return new ua90(iy30Var.c, iy30Var.a, iy30Var.g, (k7y) this.d, iy30Var.d, iy30Var.e, iy30Var.f, (g6o0) this.e);
            case 3:
                ubb0 ubb0Var = (ubb0) this.c;
                UserId userId = (UserId) this.d;
                String str = (String) this.e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " query pid=" + str});
                }
                uab0 f = ubb0Var.c.f(String.valueOf(userId.b), str);
                if (f == null) {
                    return null;
                }
                Playlist playlist = new Playlist(new JSONObject(f.e));
                playlist.H = f.d;
                return playlist;
            default:
                qgp0 qgp0Var = (qgp0) this.c;
                UserId userId2 = (UserId) this.d;
                MusicTrack musicTrack = (MusicTrack) this.e;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId2.b + " query storage of mid=" + musicTrack.Fb()});
                }
                return qgp0Var.b(userId2, musicTrack);
        }
    }

    public /* synthetic */ t1h(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
