package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import com.vk.clips.viewer.api.prefs.ClipsTrendsPrefs;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.gx8;

/* compiled from: ClipsPrefsImpl.kt */
/* loaded from: classes17.dex */
public final class kwe implements jwe, gx8.a {
    public static final /* synthetic */ qcy<Object>[] s = {new MutablePropertyReference1Impl(kwe.class, "postingClipPrivacy", "getPostingClipPrivacy()J", 0), p5j.a(0, kwe.class, "postingAllowComment", "getPostingAllowComment()Z", fpf0.a), new MutablePropertyReference1Impl(kwe.class, "clipAllowDuets", "getClipAllowDuets()Z", 0), new MutablePropertyReference1Impl(kwe.class, "postingForbiddenListsFriendsChosen", "getPostingForbiddenListsFriendsChosen()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(kwe.class, "postingForbiddenFriendsChosen", "getPostingForbiddenFriendsChosen()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(kwe.class, "swapHintShowed", "getSwapHintShowed()Z", 0), new MutablePropertyReference1Impl(kwe.class, "authorUserIdLong", "getAuthorUserIdLong()J", 0), new MutablePropertyReference1Impl(kwe.class, "profileSelectedUsedIdsLong", "getProfileSelectedUsedIdsLong()[Ljava/lang/Long;", 0), new MutablePropertyReference1Impl(kwe.class, "newVideoToClipsFlowUsed", "getNewVideoToClipsFlowUsed()Z", 0), new MutablePropertyReference1Impl(kwe.class, "clipsUserTemplatesEnabled", "getClipsUserTemplatesEnabled()Z", 0), new MutablePropertyReference1Impl(kwe.class, "newNegativeFeedBackHighlighted", "getNewNegativeFeedBackHighlighted()Z", 0), new MutablePropertyReference1Impl(kwe.class, "postToWall", "getPostToWall()Z", 0), new MutablePropertyReference1Impl(kwe.class, "userPromotedClip", "getUserPromotedClip()Z", 0), new MutablePropertyReference1Impl(kwe.class, "autoRepostToStories", "getAutoRepostToStories()Z", 0)};
    public final eaf b = new eaf();
    public final mne c = new mne();
    public final vaf d = new vaf();
    public final yid e = new yid();
    public final hn70 f = new hn70("VkVideoBridge", "VkVideoBridge.posting_clip_privacy");
    public final f18 g = new f18("VkVideoBridge", "VkVideoBridge.posting_allow_comments", true);
    public final f18 h = new f18("VkVideoBridge", "VkVideoBridge.clips_allow_duets", true);
    public final pqm0 i = new pqm0("VkVideoBridge", "VkVideoBridge.clips_posting_forbidden_lists_friends_chosen");
    public final pqm0 j = new pqm0("VkVideoBridge", "VkVideoBridge.clips_posting_forbidden_friends_chosen");
    public final hn70 k = new hn70("VkVideoBridge", "VkVideoBridge.author_user_id", UserId.d.b);
    public final aqw l = new aqw();
    public final f18 m = new f18("VkVideoBridge", "VkVideoBridge.new_vtc_flow_used", false);
    public final f18 n = new f18("VkVideoBridge", "VkVideoBridge.user_templates_enabled", true);
    public final f18 o = new f18("VkVideoBridge", "VkVideoBridge.negative_feedback_bottom_sheet", false);
    public final f18 p = new f18("VkVideoBridge", "VkVideoBridge.clips_post_to_wall_switch", true);
    public final f18 q = new f18("VkVideoBridge", "VkVideoBridge.clips_clip_promoted_by_user", false);
    public final f18 r = new f18("VkVideoBridge", "VkVideoBridge.clips_allow_auto_repost_to_stories", true);

    @Override // xsna.jwe
    public final boolean A() {
        qcy<Object> qcyVar = s[9];
        return this.n.a().booleanValue();
    }

    @Override // xsna.jwe
    public final void B(Set<String> set) {
        qcy<Object> qcyVar = s[3];
        pqm0 pqm0Var = this.i;
        Preference.K(set, (String) pqm0Var.b, (String) pqm0Var.c);
    }

    @Override // xsna.jwe
    public final void C(boolean z) {
        qcy<Object> qcyVar = s[9];
        this.n.b(z);
    }

    @Override // xsna.jwe
    public final UserId[] D() {
        qcy<Object> qcyVar = s[7];
        this.l.getClass();
        Long[] n = Preference.n("VkVideoBridge", "VkVideoBridge.selected_user_ids");
        ArrayList arrayList = new ArrayList(n.length);
        for (Long l : n) {
            arrayList.add(new UserId(l.longValue()));
        }
        return (UserId[]) arrayList.toArray(new UserId[0]);
    }

    @Override // xsna.jwe
    public final void E(boolean z) {
        qcy<Object> qcyVar = s[11];
        this.p.b(z);
    }

    @Override // xsna.jwe
    public final boolean F() {
        qcy<Object> qcyVar = s[2];
        return this.h.a().booleanValue();
    }

    @Override // xsna.jwe
    public final void G(boolean z) {
        qcy<Object> qcyVar = s[1];
        this.g.b(z);
    }

    @Override // xsna.jwe
    public final long H() {
        qcy<Object> qcyVar = s[0];
        return this.f.a().longValue();
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.SYSTEM;
    }

    @Override // xsna.jwe
    public final daf b() {
        return this.b;
    }

    @Override // xsna.jwe
    public final Set<String> c() {
        qcy<Object> qcyVar = s[3];
        pqm0 pqm0Var = this.i;
        String str = (String) pqm0Var.b;
        String str2 = (String) pqm0Var.c;
        Preference preference = Preference.a;
        return Preference.u(EmptySet.b, str, str2);
    }

    @Override // xsna.jwe
    public final UserId d() {
        qcy<Object> qcyVar = s[6];
        UserId userId = new UserId(this.k.a().longValue());
        if (userId.equals(UserId.d)) {
            return null;
        }
        return userId;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        Preference.C("VkVideoBridge", "VkVideoBridge.posting_clip_privacy");
    }

    @Override // xsna.jwe
    public final ClipsTrendsPrefs e() {
        return this.d;
    }

    @Override // xsna.jwe
    public final lne f() {
        return this.c;
    }

    @Override // xsna.jwe
    public final void g() {
        f18 f18Var = this.b.a;
        qcy<Object> qcyVar = eaf.h[1];
        f18Var.b(true);
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "ClipsPrefs";
    }

    @Override // xsna.jwe
    public final void h(boolean z) {
        qcy<Object> qcyVar = s[2];
        this.h.b(z);
    }

    @Override // xsna.jwe
    public final void i(UserId[] userIdArr) {
        ArrayList arrayList = new ArrayList(userIdArr.length);
        for (UserId userId : userIdArr) {
            arrayList.add(Long.valueOf(userId.b));
        }
        Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
        qcy<Object> qcyVar = s[7];
        this.l.getClass();
        Preference.J("VkVideoBridge", "VkVideoBridge.selected_user_ids", lArr);
    }

    @Override // xsna.jwe
    public final boolean j() {
        qcy<Object> qcyVar = s[8];
        return this.m.a().booleanValue();
    }

    @Override // xsna.jwe
    public final long k() {
        hn70 hn70Var = this.c.c;
        qcy<Object> qcyVar = mne.g[3];
        return hn70Var.a().longValue();
    }

    @Override // xsna.jwe
    public final boolean l() {
        qcy<Object> qcyVar = s[1];
        return this.g.a().booleanValue();
    }

    @Override // xsna.jwe
    public final xid m() {
        return this.e;
    }

    @Override // xsna.jwe
    public final boolean n() {
        qcy<Object> qcyVar = s[12];
        return this.q.a().booleanValue();
    }

    @Override // xsna.jwe
    public final boolean o() {
        qcy<Object> qcyVar = s[13];
        return this.r.a().booleanValue();
    }

    @Override // xsna.jwe
    public final Set<String> p() {
        qcy<Object> qcyVar = s[4];
        pqm0 pqm0Var = this.j;
        String str = (String) pqm0Var.b;
        String str2 = (String) pqm0Var.c;
        Preference preference = Preference.a;
        return Preference.u(EmptySet.b, str, str2);
    }

    @Override // xsna.jwe
    public final boolean q() {
        qcy<Object> qcyVar = s[11];
        return this.p.a().booleanValue();
    }

    @Override // xsna.jwe
    public final boolean r() {
        f18 f18Var = this.b.a;
        qcy<Object> qcyVar = eaf.h[1];
        return f18Var.a().booleanValue();
    }

    @Override // xsna.jwe
    public final void s(long j) {
        hn70 hn70Var = this.c.c;
        qcy<Object> qcyVar = mne.g[3];
        hn70Var.b(j);
    }

    @Override // xsna.jwe
    public final void t(long j) {
        qcy<Object> qcyVar = s[0];
        this.f.b(j);
    }

    @Override // xsna.gx8.a
    public final long u() {
        return 0L;
    }

    @Override // xsna.jwe
    public final void v(Set<String> set) {
        qcy<Object> qcyVar = s[4];
        pqm0 pqm0Var = this.j;
        Preference.K(set, (String) pqm0Var.b, (String) pqm0Var.c);
    }

    @Override // xsna.jwe
    public final void w() {
        qcy<Object> qcyVar = s[10];
        this.o.b(true);
    }

    @Override // xsna.jwe
    public final void x(UserId userId) {
        long j = userId != null ? userId.b : UserId.d.b;
        qcy<Object> qcyVar = s[6];
        this.k.b(j);
    }

    @Override // xsna.jwe
    public final void y() {
        qcy<Object> qcyVar = s[8];
        this.m.b(true);
    }

    @Override // xsna.jwe
    public final void z(boolean z) {
        qcy<Object> qcyVar = s[13];
        this.r.b(z);
    }
}
