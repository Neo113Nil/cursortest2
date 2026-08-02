package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.p4g;

/* compiled from: ClipsPrivacyImpl.kt */
/* loaded from: classes.dex */
public final class twe implements qwe {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new rwe(0));

    /* compiled from: ClipsPrivacyImpl.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingVisibilityMode.values().length];
            try {
                iArr[PostingVisibilityMode.FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingVisibilityMode.ONLY_ME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingVisibilityMode.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.qwe
    public final PostingVisibilityMode a() {
        return ywe.i();
    }

    @Override // xsna.qwe
    public final List<PrivacySetting.PrivacyRule> b(PostingVisibilityMode postingVisibilityMode) {
        return ywe.h(postingVisibilityMode);
    }

    @Override // xsna.qwe
    public final List<PrivacySetting.PrivacyRule> c(boolean z, boolean z2) {
        return ywe.c(z, z2);
    }

    @Override // xsna.qwe
    public final boolean d(VideoFile videoFile) {
        List g = ywe.g(videoFile, true);
        PrivacySetting.PrivacyRule[] privacyRuleArr = {PrivacyRules.c(), PrivacyRules.d(), PrivacyRules.b()};
        p4g.a aVar = p4g.a;
        return p4g.b(g, rl3.u0(privacyRuleArr));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qwe
    public final io.reactivex.rxjava3.core.x<String> e(Context context, PrivacySetting privacySetting, List<UserId> list, List<Integer> list2, PrivacyViewer privacyViewer) {
        String d = ywe.d(context, privacySetting, list, list2, privacyViewer);
        return d != null ? io.reactivex.rxjava3.core.x.k(d) : ((jed0) this.a.getValue()).a(privacySetting);
    }

    @Override // xsna.qwe
    public final void f(PostingVisibilityMode postingVisibilityMode) {
        boolean z = g620.f().e().p().isEmpty() && g620.f().e().c().isEmpty();
        boolean d = o25.a().d();
        jwe e = g620.f().e();
        if (postingVisibilityMode == PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS && z) {
            postingVisibilityMode = d ? PostingVisibilityMode.FRIENDS : PostingVisibilityMode.ALL;
        } else if (postingVisibilityMode == PostingVisibilityMode.ALL && d) {
            postingVisibilityMode = PostingVisibilityMode.FRIENDS;
        }
        e.t(postingVisibilityMode.h());
    }

    @Override // xsna.qwe
    public final String g(Context context) {
        return ywe.a(g620.f().e().p().size(), g620.f().e().c().size(), context);
    }

    @Override // xsna.qwe
    public final PostingVisibilityMode h() {
        PostingVisibilityMode.a aVar = PostingVisibilityMode.Companion;
        int H = (int) g620.f().e().H();
        aVar.getClass();
        return PostingVisibilityMode.a.a(H);
    }

    @Override // xsna.qwe
    public final String i() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = g620.f().e().p().isEmpty();
        boolean isEmpty2 = g620.f().e().c().isEmpty();
        sb.append(j5g.g0(g620.f().e().p(), StringUtils.COMMA, null, (isEmpty || isEmpty2) ? "" : StringUtils.COMMA, 0, new nt(22), 26));
        sb.append(j5g.g0(g620.f().e().c(), StringUtils.COMMA, null, null, 0, new v7(17), 30));
        if (!isEmpty || !isEmpty2) {
            sb.append(StringUtils.COMMA);
        }
        if (o25.a().d()) {
            sb.append("friends");
        } else {
            sb.append("all");
        }
        return sb.toString();
    }

    @Override // xsna.qwe
    public final void j(l7s l7sVar, View view, VideoFile videoFile, izs izsVar) {
        PrivacySetting privacySetting = new PrivacySetting();
        privacySetting.e = ywe.g(videoFile, true);
        List<PrivacySetting.PrivacyRule> privacy = videoFile.getPrivacy();
        if (privacy == null) {
            privacy = EmptyList.b;
        }
        Pair e = ywe.e(privacy);
        List list = (List) e.d();
        List list2 = (List) e.g();
        PostingVisibilityMode f = ywe.f(privacySetting);
        if (f == null) {
            return;
        }
        gd60.j(hd60.a(), l7sVar, f, new swe(this, l7sVar, view, videoFile, izsVar), new nh0(5), null, list, list2, null, false, 912);
    }

    @Override // xsna.qwe
    public final String k(Context context, List<UserId> list, List<Integer> list2) {
        Object obj = ywe.a;
        return ywe.a(list.size(), list2.size(), context);
    }

    @Override // xsna.qwe
    public final void l(l7s l7sVar, VideoFile videoFile) {
        new nad(l7sVar, videoFile).T0();
    }

    @Override // xsna.qwe
    public final boolean m(VideoFile videoFile) {
        return !ywe.g(videoFile, true).contains(PrivacyRules.a());
    }

    @Override // xsna.qwe
    public final Integer n(VideoFile videoFile) {
        PrivacySetting privacySetting = new PrivacySetting();
        privacySetting.e = videoFile.getPrivacy();
        PostingVisibilityMode f = ywe.f(privacySetting);
        int i = f == null ? -1 : a.$EnumSwitchMapping$0[f.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.string.privacy_clip_friends);
        }
        if (i == 2) {
            return Integer.valueOf(R.string.privacy_clip_viewer_title_only_me);
        }
        if (i != 3) {
            return null;
        }
        return Integer.valueOf(R.string.privacy_clip_best_friends);
    }

    @Override // xsna.qwe
    public final void o(Context context, ht htVar, gzs gzsVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        gd60.j(hd60.a(), context, g620.f().getPrivacy().h(), new e60(htVar, 14), gzsVar, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, false, 992);
    }

    @Override // xsna.qwe
    public final PostingVisibilityMode p(PrivacySetting privacySetting) {
        return ywe.f(privacySetting);
    }
}
