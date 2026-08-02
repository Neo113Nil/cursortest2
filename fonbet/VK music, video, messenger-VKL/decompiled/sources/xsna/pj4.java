package xsna;

import android.os.Bundle;
import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoOwner;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment.e;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.ok.gl.util.Poolable;
import xsna.hit;
import xsna.i9b;
import xsna.mu4;
import xsna.p810;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pj4 implements io.reactivex.rxjava3.functions.l, Poolable.Pool.Allocator, io.reactivex.rxjava3.functions.h, io.reactivex.rxjava3.functions.c, pcs, Preference.c, ptk0, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.s {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pj4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        x6n x6nVar = ((DiscoverSimilarFeedFragment) this.c).V;
        s3q0 s3q0Var = s3q0.a;
        x6nVar.b.r(s3q0Var, (g9n) lm50Var);
    }

    @Override // ru.ok.gl.util.Poolable.Pool.Allocator
    public Poolable allocate() {
        return new mu4.a(new byte[((mu4) this.c).b.getInteger("channel-count") * 2048]);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Map) ((hkb) this.c).invoke((Map) obj, obj2);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.getClass();
        new oz50(DebugDevImageFragment.class, null, null).k(debugDevSettingsFragment.requireContext());
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        qh8 qh8Var = (qh8) this.c;
        vqk0 vqk0Var = (vqk0) obj;
        qh8Var.k0 = (rit0) obj3;
        qh8Var.Q = (ActionLinks) obj4;
        qh8Var.U = vqk0Var.b;
        return new VideoOwner(vqk0Var.a, (UserProfile) obj2, (Group) null);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
        int i = CommunityReviewsFragment.o0;
        communityReviewsFragment.requireView().postDelayed(communityReviewsFragment.new e(bundle), 150L);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        dt20 dt20Var = (dt20) this.c;
        dt20Var.c = Integer.valueOf(com.vk.upload.impl.a.h(new com.vk.upload.impl.tasks.p(o25.a().c(), o25.a().c(), dt20Var.a), new td0(24, dt20Var, rVar)));
        vre0.e((vre0) dt20Var.e.getValue(), new gaa0(o25.a().o().a), "enhancephoto_tag", null, new defpackage.o(25, rVar, dt20Var), null, null, 108);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((rd1) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (AudioBook) ((p60) this.c).invoke(obj);
            case 1:
            case 6:
            case 12:
            case 15:
            case 17:
            case 19:
            case 25:
            case 27:
            default:
                return (PlaylistLink) ((jz30) this.c).invoke(obj);
            case 2:
                return (MusicDynamicRestriction) ((tw4) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((mu1) this.c).invoke(obj);
            case 4:
                return (StartPlayVkMixSource) ((e5) this.c).invoke(obj);
            case 5:
                return ((s58) this.c).c.f(s58.g, s58.h, s58.i);
            case 7:
                return (Pair) ((e5) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((mu1) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((mu1) this.c).invoke(obj);
            case 10:
                return (List) ((e5) this.c).invoke(obj);
            case 11:
                return (i9b.a) ((rd1) this.c).invoke(obj);
            case 13:
                return (hda) ((e5) this.c).invoke(obj);
            case 14:
                return (ypf) ((izs) this.c).invoke(obj);
            case 16:
                return (Boolean) ((rd1) this.c).invoke(obj);
            case 18:
                return (h6n0) ((wje) this.c).invoke(obj);
            case 20:
                return (ptk) ((wje) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.b0) ((xa9) this.c).invoke(obj);
            case 22:
                return (ProfileNavigationInfo) ((uw4) this.c).invoke(obj);
            case 23:
                return (gcp) ((hit.b) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((wje) this.c).invoke(obj);
            case 26:
                return (p810.q) ((prm) this.c).invoke(obj);
            case 28:
                return (List) ((jz30) this.c).invoke(obj);
        }
    }
}
