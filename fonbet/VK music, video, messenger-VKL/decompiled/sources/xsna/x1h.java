package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import com.vk.profile.community.details.api.CommunityAddContactsParams;
import com.vk.profile.community.details.api.di.links.data.LinkItemModel;
import com.vk.profile.community.details.impl.contacts.b;
import com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkFragment;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.details.links.feature.CommunityProfileLinksArgs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.hqg;

/* compiled from: CommunityDetailsRouterImpl.kt */
/* loaded from: classes.dex */
public final class x1h implements w1h {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new q57(2));

    @Override // xsna.w1h
    public final void a(Context context, List<LinkItemModel> list) {
        new CommunityProfileLinksFragment.a(new CommunityProfileLinksArgs(list)).k(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.w1h
    public final void b(Context context, String str, String str2, ic icVar, com.vk.movika.sdk.base.observable.p pVar) {
        ver0.c(context, hg1.n(((com.vk.profile.community.details.impl.invitelink.b) this.a.getValue()).a(str), context, false, null, 62).subscribe(new mf1(new v63(this, context, str2, icVar, 4), 15), new nf1(new l22(10, pVar, icVar), 21)));
    }

    @Override // xsna.w1h
    public final void c(Context context, z63 z63Var) {
        new hqg.a(context, z63Var).I0(null);
    }

    @Override // xsna.w1h
    public final void d(Context context, UserId userId) {
        new CommunityNameHistoryFragment.a(userId).k(context);
    }

    @Override // xsna.w1h
    public final void e(Context context, CommunityAddContactsParams communityAddContactsParams, UserId userId, String str, ng1 ng1Var) {
        new b.a(context, new CommunityAddContactsParams(communityAddContactsParams.f(), communityAddContactsParams.g(), communityAddContactsParams.e(), communityAddContactsParams.i(), communityAddContactsParams.d()), userId, str, ng1Var).I0(null);
    }

    @Override // xsna.w1h
    public final void f(Context context, UserId userId) {
        new CommunityInviteLinkFragment.a(userId).k(context);
    }
}
