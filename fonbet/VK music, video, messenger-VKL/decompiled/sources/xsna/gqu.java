package xsna;

import android.text.TextUtils;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.data.groups.FullSourceJoinApi;

/* compiled from: GroupsJoin.kt */
/* loaded from: classes15.dex */
public final class gqu extends xsg0 {
    public final UserId s;
    public final boolean t;

    public /* synthetic */ gqu(UserId userId, boolean z, boolean z2, int i) {
        this(userId, (i & 2) != 0 ? false : z, null, 0, UserId.d, (i & 64) != 0 ? false : z2);
    }

    public final UserId H0() {
        return this.s;
    }

    public final void K0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("ad_attribution", str);
    }

    public final void N0(FullSourceJoinApi fullSourceJoinApi) {
        if (this.t && fullSourceJoinApi != null) {
            K("full_source", fullSourceJoinApi.a());
        }
    }

    public final void P0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("source", str);
    }

    public final void S0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("source_ui", str);
    }

    public final void U0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("track_code", str);
    }

    public gqu(UserId userId, boolean z, String str, int i, UserId userId2, boolean z2) {
        super("groups.join");
        this.s = userId;
        this.t = z2;
        F(userId, "group_id");
        if (z) {
            C(1, "not_sure");
        }
        P0(str);
        if (i != 0) {
            C(i, "video_id");
        }
        if (fkq0.c(userId2)) {
            F(userId2, "owner_id");
        }
    }
}
