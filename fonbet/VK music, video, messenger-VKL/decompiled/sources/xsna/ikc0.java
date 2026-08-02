package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.C4504q2;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.base.metrics.AttachPickerTechMetricsSession;
import com.vk.comments.core.BoardComment;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.dto.photo.Photo;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.ecomm.market.api.metrics.model.MarketPickerTechMetricsSession;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.posting.SettingsPostingContract$Mode;
import com.vk.newsfeed.api.posting.attachments.AttachType;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.newsfeed.api.posting.dto.PosterSettings;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.newsfeed.api.posting.dto.PostingPrimaryMode;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.api.posting.viewpresenter.CropsForRatio;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vk.newsfeed.impl.posting.dto.BoardCommentNewsEntry;
import com.vk.newsfeed.impl.posting.dto.CommentNewsEntry;
import com.vk.newsfeed.impl.posting.dto.MarketCommentNewsEntry;
import com.vk.newsfeed.impl.posting.dto.PostCommentNewsEntry;
import com.vk.newsfeed.impl.posting.newposter.NewPosterFragment;
import com.vk.newsfeed.impl.posting.newposter.NewPosterResult;
import com.vk.newsfeed.impl.posting.settings.PostingSettingsFragment;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.poll.metrics.PollEditorTechMetricsSession;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.posting.presentation.model.PickerAttachType;
import com.vk.posting.presentation.model.PickerRootParams;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ClickAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$MentionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PosterEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PosterInfo;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingContext;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.ghc0;
import xsna.h7u0;
import xsna.ify;
import xsna.jbc0;
import xsna.k420;
import xsna.scc0;
import xsna.wjg0;
import xsna.z84;

/* compiled from: PostingPresenter.kt */
/* loaded from: classes4.dex */
public final class ikc0 extends ysi implements qdc0, jdc0, jbc0.b, w8i {
    public tac0 A;
    public String A0;
    public z84 B;
    public UserId B0;
    public Object C;
    public boolean C0;
    public Object D;
    public boolean D0;
    public g420 E;
    public PosterSettings E0;
    public final ArrayList F;
    public String F0;
    public boolean G;
    public int G0;
    public boolean H;
    public String H0;
    public boolean I;
    public boolean I0;
    public PostingMetricsCreationEntryPoint J;
    public boolean J0;
    public int K;
    public boolean K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public boolean U;
    public final b V;
    public final c W;
    public a X;
    public boolean Y;
    public final n9o0 Z;
    public final CopyOnWriteArrayList<wjg0.a> a0;
    public final Object b0;
    public final PostingFragment c;
    public final Object c0;
    public final com.vk.newsfeed.impl.posting.a d;
    public boolean d0;
    public final jbc0 e;
    public boolean e0;
    public final j5d0 f;
    public boolean f0;
    public final xoc0 g;
    public boolean g0;
    public final ndc0 h;
    public boolean h0;
    public final Object i;
    public boolean i0;
    public final boolean j;
    public boolean j0;
    public final Object k;
    public PostingVisibilityMode k0;
    public final bpn0 l;
    public boolean l0;
    public final Object m;
    public boolean m0;
    public final Object n;
    public boolean n0;
    public final Object o;
    public boolean o0;
    public final Object p;
    public PostingOrd p0;
    public final Object q;
    public boolean q0;
    public final Object r;
    public String r0;
    public final scc0 s;
    public boolean s0;
    public final bkc0 t;
    public Date t0;
    public final qec0 u;
    public boolean u0;
    public final ptj v;
    public Group v0;
    public final bpn0 w;
    public boolean w0;
    public sbc0 x;
    public Integer x0;
    public wxu y;
    public DonutPostingSettings y0;
    public lko0 z;
    public DonutPostingSettings z0;

    /* compiled from: PostingPresenter.kt */
    public final class b implements a {
        public b() {
        }

        @Override // xsna.ikc0.a
        public final void B1() {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            tac0Var.g();
        }

        @Override // xsna.ikc0.a
        public final void Q(UserId userId, String str, boolean z) {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            q420 q420Var = tac0Var.d;
            q420 q420Var2 = q420Var != null ? q420Var : null;
            if (z) {
                userId = fkq0.e(userId);
            }
            q420Var2.Q(userId, str, (r3 & 4) == 0);
        }

        @Override // xsna.ikc0.a
        public final void W2(String str) {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            dvu dvuVar = tac0Var.e;
            if (dvuVar != null) {
                dvu.a(dvuVar, str);
            }
        }

        @Override // xsna.ikc0.a
        public final void a() {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            tac0Var.c.xe("@");
        }

        @Override // xsna.ikc0.a
        public final Integer b() {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            xac0 xac0Var = tac0Var.n;
            Integer valueOf = xac0Var != null ? Integer.valueOf(xac0Var.a) : null;
            if (valueOf == null) {
                return null;
            }
            return valueOf;
        }

        @Override // xsna.ikc0.a
        public final UserId c() {
            ikc0 ikc0Var = ikc0.this;
            tac0 tac0Var = ikc0Var.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            xac0 xac0Var = tac0Var.n;
            UserId userId = xac0Var != null ? xac0Var.b : null;
            if (userId != null && !userId.equals(PosterBackground.j)) {
                return userId;
            }
            wxu wxuVar = ikc0Var.y;
            Target target = (wxuVar != null ? wxuVar : null).n;
            if (target != null) {
                boolean z = target.k;
                UserId userId2 = target.c;
                if (!z) {
                    userId2 = fkq0.e(userId2);
                }
                if (userId2 != null) {
                    return userId2;
                }
            }
            return t11.b();
        }

        @Override // xsna.ikc0.a
        public final String d() {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            q420 q420Var = tac0Var.d;
            return (q420Var != null ? q420Var : null).b();
        }

        @Override // xsna.ikc0.a
        public final CharSequence getText() {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            return tac0Var.c.F5();
        }

        @Override // xsna.ikc0.a
        public final void k() {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            tac0Var.c.k();
        }

        @Override // xsna.ikc0.a
        public final void w() {
            tac0 tac0Var = ikc0.this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            tac0Var.c.w();
        }
    }

    /* compiled from: PostingPresenter.kt */
    public final class c implements a {
        public c() {
        }

        @Override // xsna.ikc0.a
        public final void B1() {
            ikc0 ikc0Var = ikc0.this;
            lko0 lko0Var = ikc0Var.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            lko0Var.c.clearFocus();
            lko0 lko0Var2 = ikc0Var.z;
            (lko0Var2 != null ? lko0Var2 : null).x();
        }

        @Override // xsna.ikc0.a
        public final void Q(UserId userId, String str, boolean z) {
            lko0 lko0Var = ikc0.this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            lko0Var.e = true;
            q420 q420Var = lko0Var.l;
            q420 q420Var2 = q420Var != null ? q420Var : null;
            if (z) {
                userId = fkq0.e(userId);
            }
            q420Var2.Q(userId, str, (r3 & 4) == 0);
        }

        @Override // xsna.ikc0.a
        public final void W2(String str) {
            lko0 lko0Var = ikc0.this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            lko0Var.e = true;
            dvu dvuVar = lko0Var.m;
            if (dvuVar != null) {
                dvu.a(dvuVar, str);
            }
        }

        @Override // xsna.ikc0.a
        public final void a() {
            lko0 lko0Var = ikc0.this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            lko0Var.g("@");
        }

        @Override // xsna.ikc0.a
        public final Integer b() {
            return null;
        }

        @Override // xsna.ikc0.a
        public final UserId c() {
            return UserId.d;
        }

        @Override // xsna.ikc0.a
        public final String d() {
            lko0 lko0Var = ikc0.this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            q420 q420Var = lko0Var.l;
            return (q420Var != null ? q420Var : null).b();
        }

        @Override // xsna.ikc0.a
        public final CharSequence getText() {
            lko0 lko0Var = ikc0.this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            return lko0Var.c.getText();
        }

        @Override // xsna.ikc0.a
        public final void k() {
            lko0 lko0Var = ikc0.this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            lko0Var.c.k();
        }

        @Override // xsna.ikc0.a
        public final void w() {
            lko0 lko0Var = ikc0.this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            lko0Var.c.w();
        }
    }

    /* compiled from: PostingPresenter.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AttachType.values().length];
            try {
                iArr[AttachType.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachType.ALBUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachType.ARTICLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttachType.GOOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AttachType.DOCUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AttachType.MUSIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AttachType.PHOTO_VK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AttachType.PLACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AttachType.SERVICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AttachType.TAKE_PHOTO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AttachType.VIDEO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AttachType.POLL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PostingVisibilityMode.values().length];
            try {
                iArr2[PostingVisibilityMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PostingVisibilityMode.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[PostingVisibilityMode.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PostingMetricsCreationEntryPoint.values().length];
            try {
                iArr3[PostingMetricsCreationEntryPoint.FeedPlus.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[PostingMetricsCreationEntryPoint.GroupWallButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[PostingMetricsCreationEntryPoint.ProfilePlusButton.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[PostingMetricsCreationEntryPoint.ProfileWallButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[PostingMetricsCreationEntryPoint.ChannelWriteBarButton.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[PostingMetricsCreationEntryPoint.PostThreeDotMenuEditItem.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public ikc0(PostingFragment postingFragment, com.vk.newsfeed.impl.posting.a aVar, jbc0 jbc0Var, j5d0 j5d0Var, xoc0 xoc0Var, ndc0 ndc0Var) {
        this.c = postingFragment;
        this.d = aVar;
        this.e = jbc0Var;
        this.f = j5d0Var;
        this.g = xoc0Var;
        this.h = ndc0Var;
        h13 h13Var = new h13(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, h13Var);
        this.j = ndc0Var.c;
        this.k = msy.a(lazyThreadSafetyMode, new dac0(this, 3));
        this.l = new bpn0(new iia0(this, 8));
        this.m = msy.a(lazyThreadSafetyMode, new lbc0(this, 1));
        this.n = msy.a(lazyThreadSafetyMode, new m130(this, 24));
        this.o = msy.a(lazyThreadSafetyMode, new p5y(this, 26));
        this.p = msy.a(lazyThreadSafetyMode, new i440(this, 20));
        this.q = msy.a(lazyThreadSafetyMode, new zf20(this, 21));
        this.r = msy.a(lazyThreadSafetyMode, new hj60(this, 12));
        wjs0 wjs0Var = wjs0.a;
        scc0 scc0Var = new scc0(this, C7().b(), new v6j(this), new akc0(), new px30(this, 23));
        this.s = scc0Var;
        this.t = new bkc0(this, postingFragment);
        this.u = new qec0(this, scc0Var);
        this.v = new ptj(this);
        this.w = new bpn0(new nuv(this, 26));
        this.F = new ArrayList();
        this.J = PostingMetricsCreationEntryPoint.Other;
        int i = 10;
        this.K = 10;
        this.P = true;
        this.R = msy.a(lazyThreadSafetyMode, new fm20(this, 18));
        this.S = msy.a(lazyThreadSafetyMode, new a040(this, 25));
        this.T = msy.a(lazyThreadSafetyMode, new p6y(this, 28));
        this.V = new b();
        c cVar = new c();
        this.W = cVar;
        this.X = cVar;
        Context context = e43.a;
        this.Z = new n9o0(context == null ? null : context);
        this.a0 = new CopyOnWriteArrayList<>();
        this.b0 = msy.a(lazyThreadSafetyMode, new jz70(this, 9));
        this.c0 = msy.a(lazyThreadSafetyMode, new nm60(this, i));
        jbc0Var.h(this);
        this.d0 = true;
        this.e0 = true;
        this.f0 = true;
        this.g0 = true;
        this.k0 = PostingVisibilityMode.ALL;
        this.B0 = UserId.d;
    }

    public static void K7(Intent intent) {
        tal talVar = new tal();
        if (intent.hasExtra("attachPickerTechMetrics")) {
            AttachPickerTechMetricsSession attachPickerTechMetricsSession = (AttachPickerTechMetricsSession) intent.getParcelableExtra("attachPickerTechMetrics");
            if (attachPickerTechMetricsSession != null) {
                talVar.c = attachPickerTechMetricsSession.b;
                talVar.d = attachPickerTechMetricsSession.c;
            }
            fkl fklVar = new fkl();
            fklVar.b = talVar.d;
            fklVar.a = talVar.c;
            fklVar.c(intent);
        }
    }

    public static void L7(Intent intent) {
        if (intent.hasExtra("marketPickerTechMetricsSession")) {
            fkl fklVar = new fkl();
            MarketPickerTechMetricsSession marketPickerTechMetricsSession = (MarketPickerTechMetricsSession) intent.getParcelableExtra("marketPickerTechMetricsSession");
            fklVar.b = marketPickerTechMetricsSession != null ? marketPickerTechMetricsSession.c : null;
            fklVar.a = marketPickerTechMetricsSession != null ? marketPickerTechMetricsSession.b : null;
            fklVar.c(intent);
        }
    }

    public static void M7(Intent intent) {
        skl sklVar = new skl();
        if (intent.hasExtra("pollEditorPickerTechMetrics")) {
            PollEditorTechMetricsSession pollEditorTechMetricsSession = (PollEditorTechMetricsSession) intent.getParcelableExtra("pollEditorPickerTechMetrics");
            if (pollEditorTechMetricsSession != null) {
                sklVar.c = pollEditorTechMetricsSession.b;
                sklVar.d = pollEditorTechMetricsSession.c;
            }
            fkl fklVar = new fkl();
            fklVar.b = sklVar.d;
            fklVar.a = sklVar.c;
            fklVar.c(intent);
        }
    }

    @Override // xsna.qdc0
    public final void A1(Attachment attachment) {
        this.s.a(attachment);
    }

    public final aac0 A7() {
        Poster.Constants constants;
        if (this.X.b() == null) {
            return null;
        }
        Integer b2 = this.X.b();
        String str = this.F0;
        UserId c2 = this.X.c();
        int i = this.G0;
        PosterSettings posterSettings = this.E0;
        return new aac0(b2, str, c2, i, (posterSettings == null || (constants = posterSettings.c) == null) ? 5 : constants.h, this.H0);
    }

    @Override // xsna.qdc0
    public final void Al() {
        Na();
    }

    @Override // xsna.qdc0
    public final void B1() {
        this.X.B1();
    }

    @Override // xsna.qdc0
    public final List<DonutPostingSettings.Duration> B6() {
        List<DonutPostingSettings.Duration> list;
        Iterable iterable;
        Object obj;
        List<DonutPostingSettings.Duration> list2;
        if (!F7()) {
            DonutPostingSettings donutPostingSettings = this.y0;
            return (donutPostingSettings == null || (list = donutPostingSettings.b) == null) ? EmptyList.b : list;
        }
        String str = this.A0;
        if (str != null && str.length() != 0) {
            DonutPostingSettings donutPostingSettings2 = this.z0;
            return (donutPostingSettings2 == null || (list2 = donutPostingSettings2.b) == null) ? EmptyList.b : list2;
        }
        DonutPostingSettings donutPostingSettings3 = this.y0;
        if (donutPostingSettings3 == null || (iterable = donutPostingSettings3.b) == null) {
            iterable = EmptyList.b;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int i = ((DonutPostingSettings.Duration) obj).b;
            Integer Ld = Ld();
            if (Ld != null && i == Ld.intValue()) {
                break;
            }
        }
        DonutPostingSettings.Duration duration = (DonutPostingSettings.Duration) obj;
        return duration != null ? Collections.singletonList(duration) : EmptyList.b;
    }

    @Override // xsna.qdc0
    public final boolean Bc(int i) {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        return z84Var.Bc(i);
    }

    public final fhc0 C7() {
        return (fhc0) this.l.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r0.Z() > 0) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Ca() {
        CharSequence p0 = drm0.p0(this.X.getText());
        boolean z = false;
        boolean z2 = !((Boolean) this.T.getValue()).booleanValue() || p0.length() <= ((Number) this.S.getValue()).intValue();
        wxu wxuVar = this.y;
        if (wxuVar == null) {
            wxuVar = null;
        }
        if (!myc0.f(p0)) {
            z84 z84Var = this.B;
            if (z84Var == null) {
                z84Var = null;
            }
        }
        z84 z84Var2 = this.B;
        if (z84Var2 == null) {
            z84Var2 = null;
        }
        if (z84Var2.o && !z84Var2.j.b) {
            Collection values = ((Map) z84Var2.k.getValue()).values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!((z84.a) it.next()).b) {
                        break;
                    }
                }
            }
        }
        z84 z84Var3 = this.B;
        if (z84Var3 == null) {
            z84Var3 = null;
        }
        if (!z84Var3.c.j()) {
            lko0 lko0Var = this.z;
            lko0 lko0Var2 = lko0Var != null ? lko0Var : null;
            Regex regex = lko0.o;
            CharSequence p02 = drm0.p0(lko0Var2.c.getText());
            Regex regex2 = lko0.p;
            if (((!regex2.a(p02) && !regex.a(p02)) || (!regex2.f(p02) && !regex.f(p02))) && z2) {
                z = true;
            }
        }
        wxuVar.e0(z);
    }

    @Override // xsna.qdc0
    public final boolean Cc() {
        return this.I0 || this.J0 || this.K0;
    }

    @Override // xsna.qdc0
    public final void Cf() {
        PosterSettings posterSettings;
        String obj = this.X.getText().toString();
        if (obj.length() == 0 && ((posterSettings = this.E0) == null || (obj = posterSettings.d) == null)) {
            obj = "";
        }
        this.d.getClass();
        new b.d("poster_custom_editor_open").e();
        l860 l860Var = new l860(NewPosterFragment.class, null, null);
        Bundle bundle = l860Var.j;
        bundle.putString("text", obj);
        tac0 tac0Var = this.A;
        if (tac0Var == null) {
            tac0Var = null;
        }
        bundle.putInt("textSize", tac0Var.c.Zj());
        int i = ify.a;
        if (ify.e(ify.c)) {
            ify.a(new e(l860Var, this));
            lko0 lko0Var = this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            lko0Var.x();
        } else {
            l860Var.g(50, this.c);
        }
        ghc0.g g = C7().g();
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = this.J;
        g.getClass();
        g.d(MobileOfficialAppsConPostingStat$PosterEvent.PosterEventType.OPEN_POSTER_CUSTOM, null, postingMetricsCreationEntryPoint);
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    @Override // xsna.f420
    public final void D0(b420 b420Var) {
        UserId userId = b420Var.a;
        this.d.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = wmi0.a.e("mentionProfiles").U(new bk1(new nk(27), 22));
        com.vk.newsfeed.impl.util.b bVar = new com.vk.newsfeed.impl.util.b(b420Var);
        int i = kwg0.a;
        U.subscribe(bVar, new iwg0());
        String str = b420Var.b;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '(' && charAt != ')') {
                sb.append(charAt);
            }
        }
        this.X.Q(fkq0.a(userId), sb.toString(), fkq0.b(userId));
        Na();
        Zi();
        Y0();
        ghc0.e e2 = C7().e();
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = this.J;
        e2.getClass();
        MobileOfficialAppsConPostingStat$MentionEvent.MentionEventType mentionEventType = MobileOfficialAppsConPostingStat$MentionEvent.MentionEventType.CLICK_TO_MENTION_SUGGEST;
        ghc0 ghc0Var = ghc0.this;
        ghc0.j(ghc0Var, new ghc0.h(null, null, null, null, null, new MobileOfficialAppsConPostingStat$MentionEvent(mentionEventType, Long.valueOf(userId.b)), null, null, ghc0.k(ghc0Var, postingMetricsCreationEntryPoint), Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
        this.e.d();
    }

    public final Target D7() {
        wxu wxuVar = this.y;
        if (wxuVar == null) {
            wxuVar = null;
        }
        return wxuVar.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // xsna.qdc0
    public final void Da(xac0 xac0Var) {
        Object obj = this.D;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        r0.yj(xac0Var);
        r0.Ja(xac0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // xsna.qdc0
    public final void Dg(int i, String str, String str2) {
        Object obj = this.D;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        r0.ol(i, true);
        this.d.getClass();
        b.d dVar = new b.d("poster_mode_change");
        dVar.b(str, "category_id");
        dVar.b(str2, "background_id");
        dVar.e();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    @Override // xsna.qdc0
    public final void Di() {
        Object obj;
        ArrayList<jk6<?>> arrayList = this.c.Y;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof w68) {
                    break;
                }
            }
        }
        w68 w68Var = (w68) (obj instanceof w68 ? obj : null);
        if (w68Var != null) {
            w68Var.c6();
        }
    }

    @Override // xsna.qdc0
    public final void E6() {
        this.U = false;
        T7(false);
        this.d.getClass();
        new b.d("poster_close").e();
        ghc0.g g = C7().g();
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = this.J;
        g.getClass();
        ghc0.g.e(g, MobileOfficialAppsConPostingStat$PosterEvent.PosterEventType.CLOSE_POSTER, postingMetricsCreationEntryPoint, 2);
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    public final boolean E7() {
        if (!H7()) {
            if (I7()) {
                NewsEntry z7 = z7();
                PostingFragment postingFragment = this.c;
                if (z7 != null) {
                    ((h7u0.a) postingFragment.p0.getValue()).m();
                    return true;
                }
                ((h7u0.a) postingFragment.o0.getValue()).m();
                return true;
            }
            String str = this.F0;
            if (str != null) {
                String U = drm0.U(str, "file://");
                Regex regex = com.vk.core.files.a.a;
                vhk0.c(U);
            }
        }
        return false;
    }

    public final boolean F7() {
        return z7() != null;
    }

    @Override // xsna.qdc0
    public final void Fh(c84 c84Var) {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        z84Var.q.add(c84Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    @Override // xsna.qdc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        FragmentActivity activity;
        sbc0 sbc0Var = this.x;
        if (sbc0Var == null) {
            sbc0Var = null;
        }
        boolean z = sbc0Var.J;
        PostingFragment postingFragment = this.c;
        if (z && !I7()) {
            ((h7u0.a) postingFragment.q0.getValue()).m();
            return;
        }
        Integer Ld = Ld();
        if (Ld != null && Ld.intValue() >= 0) {
            wxu wxuVar = this.y;
            if (wxuVar == null) {
                wxuVar = null;
            }
            Target target = wxuVar.n;
            if (target != null) {
                boolean z2 = target.k;
                UserId userId = target.c;
                if (!z2) {
                    userId = fkq0.e(userId);
                }
                if (userId != null) {
                    z84 z84Var = this.B;
                    if (z84Var == null) {
                        z84Var = null;
                    }
                    Iterator it = ((ArrayList) z84Var.u()).iterator();
                    while (it.hasNext()) {
                        Attachment attachment = (Attachment) it.next();
                        if (attachment instanceof PodcastAttachment) {
                            MusicTrack musicTrack = ((PodcastAttachment) attachment).f;
                            Episode episode = musicTrack.w;
                            if ((episode != null ? episode.k : false) && epx.f(musicTrack.c, userId)) {
                                gkc0 gkc0Var = new gkc0(this, 0);
                                activity = postingFragment.getActivity();
                                if (activity != null) {
                                    return;
                                }
                                h7u0.a aVar = new h7u0.a(activity);
                                aVar.g0(R.string.donut_publish_free_copy_postpone_title);
                                aVar.U(R.string.donut_publish_free_copy_postpone_text);
                                aVar.c0(R.string.donut_publish_free_copy_postpone_yes, new s7o(gkc0Var, 2));
                                aVar.W(R.string.donut_publish_free_copy_postpone_no, null);
                                aVar.m();
                                return;
                            }
                        } else if (attachment instanceof ArticleAttachment) {
                            Article article = ((ArticleAttachment) attachment).f;
                            ArticleDonut articleDonut = article.q;
                            if ((articleDonut != null ? articleDonut.b : false) && epx.f(article.c, userId)) {
                                gkc0 gkc0Var2 = new gkc0(this, 0);
                                activity = postingFragment.getActivity();
                                if (activity != null) {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        R7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if ((r3 != null ? r3 : null).f0 == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // xsna.qdc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G4() {
        boolean z = true;
        if (this.j) {
            Object obj = this.C;
            ?? r0 = obj;
            if (obj == null) {
                r0 = 0;
            }
            sbc0 sbc0Var = this.x;
            r0.k2(true ^ (sbc0Var != null ? sbc0Var : null).f0);
            return;
        }
        Object obj2 = this.D;
        ?? r02 = obj2;
        if (obj2 == null) {
            r02 = 0;
        }
        sbc0 sbc0Var2 = this.x;
        if ((sbc0Var2 == null ? null : sbc0Var2).L) {
        }
        z = false;
        r02.k2(z);
    }

    @Override // xsna.qdc0
    public final boolean G6() {
        return v7() + 1 <= this.K;
    }

    public final boolean G7() {
        Flags flags;
        if (!F7()) {
            return false;
        }
        NewsEntry z7 = z7();
        Post post = z7 instanceof Post ? (Post) z7 : null;
        return (post == null || (flags = post.l) == null || !flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean H7() {
        if (!((Boolean) this.R.getValue()).booleanValue()) {
            return false;
        }
        if (this.u.e > 0) {
            return true;
        }
        sbc0 sbc0Var = this.x;
        if (sbc0Var == null) {
            sbc0Var = null;
        }
        return sbc0Var.a() && !this.M;
    }

    public final boolean I7() {
        String str;
        List<Attachment> A;
        Date Um;
        sbc0 sbc0Var = this.x;
        NewsEntry newsEntry = (sbc0Var == null ? null : sbc0Var).q;
        boolean z = newsEntry instanceof Post;
        Post post = z ? (Post) newsEntry : null;
        if (post == null || (str = post.s) == null) {
            CommentNewsEntry commentNewsEntry = newsEntry instanceof CommentNewsEntry ? (CommentNewsEntry) newsEntry : null;
            if (commentNewsEntry != null) {
                str = commentNewsEntry.j;
            } else {
                if (sbc0Var == null) {
                    sbc0Var = null;
                }
                str = sbc0Var.l;
            }
        }
        if (!epx.f(this.X.getText().toString(), str)) {
            return true;
        }
        if (z) {
            if (((Post) newsEntry).l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && ((Um = Um()) == null || Um.getTime() != r0.r * 1000)) {
                return true;
            }
        }
        Post post2 = z ? (Post) newsEntry : null;
        ArrayList<EntryAttachment> arrayList = post2 != null ? post2.z : null;
        if (arrayList != null) {
            if (v7() != arrayList.size()) {
                return true;
            }
            for (EntryAttachment entryAttachment : arrayList) {
                z84 z84Var = this.B;
                if (z84Var == null) {
                    z84Var = null;
                }
                List<Attachment> u = z84Var.u();
                if (u.isEmpty()) {
                    return true;
                }
                Iterator<T> it = u.iterator();
                while (it.hasNext()) {
                    if (epx.f(entryAttachment.b.toString(), ((Attachment) it.next()).toString())) {
                        break;
                    }
                }
                return true;
            }
            return false;
        }
        CommentNewsEntry commentNewsEntry2 = newsEntry instanceof CommentNewsEntry ? (CommentNewsEntry) newsEntry : null;
        if (commentNewsEntry2 == null || (A = commentNewsEntry2.k) == null) {
            sbc0 sbc0Var2 = this.x;
            if (sbc0Var2 == null) {
                sbc0Var2 = null;
            }
            A = rli0.A(rli0.t(rl3.D(sbc0Var2.m), new juz(16)));
        }
        if (v7() != A.size()) {
            return true;
        }
        for (Attachment attachment : A) {
            z84 z84Var2 = this.B;
            if (z84Var2 == null) {
                z84Var2 = null;
            }
            List<Attachment> u2 = z84Var2.u();
            if (u2.isEmpty()) {
                return true;
            }
            Iterator<T> it2 = u2.iterator();
            while (it2.hasNext()) {
                if (epx.f(attachment.toString(), ((Attachment) it2.next()).toString())) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean J7() {
        lko0 lko0Var = this.z;
        if (lko0Var == null) {
            lko0Var = null;
        }
        CharSequence text = lko0Var.c.getText();
        int length = text.length();
        tac0 tac0Var = this.A;
        if (tac0Var == null) {
            tac0Var = null;
        }
        PosterSettings posterSettings = tac0Var.f;
        Poster.Constants constants = posterSettings != null ? posterSettings.c : null;
        boolean z = length <= (constants != null ? constants.b : 160);
        boolean z2 = x7() == 0;
        int i = 0;
        for (int i2 = 0; i2 < text.length(); i2++) {
            if (text.charAt(i2) == '\n') {
                i++;
            }
        }
        boolean z3 = i <= 3;
        if (z && z2) {
            sbc0 sbc0Var = this.x;
            if ((sbc0Var != null ? sbc0Var : null).K && z3) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.qdc0
    public final boolean Jc() {
        return this.u0;
    }

    @Override // xsna.qdc0
    public final Integer Ld() {
        Target D7 = D7();
        if (this.s0 && D7 != null && D7.s) {
            return this.x0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    @Override // xsna.qdc0
    public final void M6(Integer num) {
        this.x0 = num;
        if (num != null) {
            Object obj = this.C;
            ?? r1 = obj;
            if (obj == null) {
                r1 = 0;
            }
            r1.N1(true);
            Object obj2 = this.C;
            ?? r12 = obj2;
            if (obj2 == null) {
                r12 = 0;
            }
            r12.H0(num.intValue());
            ?? r4 = this.C;
            (r4 != 0 ? r4 : null).f5(true);
        } else {
            X7(D7());
        }
        this.i0 = true;
    }

    @Override // xsna.l420
    public final void N3(UserId userId) {
        this.d.getClass();
        io.reactivex.rxjava3.core.q L = wmi0.a.e("mentionProfiles").L(new ai3(new com.vk.newsfeed.impl.util.a(userId), 27), false);
        wnt wntVar = new wnt(this, 24);
        int i = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe = L.subscribe(wntVar, new iwg0());
        if (subscribe != null) {
            this.c.eo(subscribe);
        }
    }

    public final void N7() {
        qec0 qec0Var = this.u;
        if (qec0Var.e != 0) {
            tac0 tac0Var = this.A;
            if (tac0Var == null) {
                tac0Var = null;
            }
            if (tac0Var.f != null) {
                Integer num = qec0Var.f;
                if (num == null) {
                    num = this.X.b();
                }
                UserId userId = qec0Var.g;
                if (userId == null) {
                    userId = this.X.c();
                }
                if (num != null) {
                    tac0 tac0Var2 = this.A;
                    tac0 tac0Var3 = tac0Var2 != null ? tac0Var2 : null;
                    tac0Var3.e0(userId, num);
                    tac0Var3.b.n5();
                    T7(true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Na() {
        this.h0 = true;
        if (v7() == 0) {
            lko0 lko0Var = this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            q420 q420Var = lko0Var.l;
            if (q420Var == null) {
                q420Var = null;
            }
            if (!q420Var.c(0, q420Var.b.length())) {
                lko0 lko0Var2 = this.z;
                if (lko0Var2 == null) {
                    lko0Var2 = null;
                }
                if (lko0Var2.c.getText().length() <= 100) {
                    lko0Var2.z();
                }
                boolean J7 = J7();
                if (!epx.f(this.X, this.V)) {
                    T7(J7);
                } else if (this.U) {
                    T7(J7);
                    if (J7) {
                        this.d.getClass();
                        new b.d("poster_auto_enable").e();
                    }
                }
                Ca();
                if (((Boolean) this.T.getValue()).booleanValue() || this.j) {
                }
                Object obj = this.D;
                (obj != 0 ? obj : null).n6(drm0.p0(this.X.getText()).length());
                return;
            }
        }
        lko0 lko0Var3 = this.z;
        if (lko0Var3 == null) {
            lko0Var3 = null;
        }
        lko0Var3.Z();
        boolean J72 = J7();
        if (!epx.f(this.X, this.V)) {
        }
        Ca();
        if (((Boolean) this.T.getValue()).booleanValue()) {
        }
    }

    public final void O7(Intent intent) {
        this.g.c(intent);
    }

    @Override // xsna.o9q0
    public final void P6(int i, Throwable th) {
        this.g.P6(i, th);
        Ca();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    public final void P7(NewPosterResult newPosterResult, boolean z) {
        PosterBackground posterBackground;
        ImageSize imageSize = newPosterResult.c;
        this.F0 = imageSize != null ? imageSize.d.d : null;
        int i = newPosterResult.b;
        this.G0 = i;
        UserId userId = PosterBackground.j;
        xac0 xac0Var = new xac0(-2, userId, i, null, true, null);
        PosterBackground posterBackground2 = new PosterBackground(-2, userId, newPosterResult.b, -1, null, new Image((List<ImageSize>) (imageSize != null ? Collections.singletonList(imageSize) : EmptyList.b)), null, null, 128, null);
        tac0 tac0Var = this.A;
        if (tac0Var == null) {
            tac0Var = null;
        }
        tac0Var.q = posterBackground2;
        tac0Var.i = -2;
        tac0Var.j = userId;
        tac0Var.k = xac0Var;
        tac0Var.m = posterBackground2;
        List<xac0> list = tac0Var.g;
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = tac0Var.h;
        if (arrayList == null || (posterBackground = (PosterBackground) j5g.Y(arrayList)) == null || !posterBackground.zb()) {
            list.add(0, xac0Var);
            ArrayList arrayList2 = tac0Var.h;
            if (arrayList2 != null) {
                arrayList2.add(0, posterBackground2);
            }
        } else {
            list.set(0, xac0Var);
            ArrayList arrayList3 = tac0Var.h;
            if (arrayList3 != null) {
            }
        }
        tac0Var.c.Vi(posterBackground2);
        tac0Var.d0(posterBackground2.b, posterBackground2.d, 0, posterBackground2.c);
        tac0Var.b.nl(list, false);
        T7(true);
        if (!z) {
            Object obj = this.D;
            ?? r1 = obj;
            if (obj == null) {
                r1 = 0;
            }
            r1.km(xac0Var);
            r1.Ja(xac0Var);
            tac0 tac0Var2 = this.A;
            if (tac0Var2 == null) {
                tac0Var2 = null;
            }
            qac0.l7(tac0Var2, xac0Var, 0, 4);
        }
        wxu wxuVar = this.y;
        if (wxuVar == null) {
            wxuVar = null;
        }
        Target target = wxuVar.n;
        if (target != null) {
            Owner owner = new Owner(target.k ? target.c : fkq0.e(target.c), target.d, target.f, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null);
            tac0 tac0Var3 = this.A;
            (tac0Var3 != null ? tac0Var3 : null).x(owner);
        }
    }

    @Override // xsna.qdc0
    public final ldc0 Pe() {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        ov9 ov9Var = z84Var.n;
        return !ov9Var.b ? new ldc0(false, true) : new ldc0(ov9Var.d, ov9Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.iqc0
    public final void Q(PostingVisibilityMode postingVisibilityMode) {
        this.k0 = postingVisibilityMode;
        int i = d.$EnumSwitchMapping$1[postingVisibilityMode.ordinal()];
        if (i == 1) {
            Object obj = this.C;
            (obj != 0 ? obj : null).o2();
        } else if (i == 2) {
            Object obj2 = this.C;
            (obj2 != 0 ? obj2 : null).M3();
        } else {
            if (i != 3) {
                return;
            }
            Object obj3 = this.C;
            (obj3 != 0 ? obj3 : null).R0();
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void Q7(PickerAttachType pickerAttachType) {
        Activity b2;
        PickerRootParams pickerRootParams;
        Context context = this.c.getContext();
        if (context == null || (b2 = gnj.b(context)) == null) {
            return;
        }
        sbc0 sbc0Var = this.x;
        boolean z = (sbc0Var == null ? null : sbc0Var).g0;
        ?? r4 = this.o;
        if (z) {
            if ((sbc0Var == null ? null : sbc0Var).g) {
                if (sbc0Var == null) {
                    sbc0Var = null;
                }
                pickerRootParams = new PickerRootParams(fkq0.e(fkq0.a(sbc0Var.f)), ((b25) r4.getValue()).c(), pickerAttachType);
                ((ilc0) this.m.getValue()).a(pickerRootParams, b2);
            }
        }
        pickerRootParams = new PickerRootParams(((b25) r4.getValue()).c(), null, pickerAttachType, 2, null);
        ((ilc0) this.m.getValue()).a(pickerRootParams, b2);
    }

    @Override // xsna.qdc0
    public final UserId Qj() {
        UserId userId;
        if (fkq0.c(this.B0)) {
            return this.B0;
        }
        wxu wxuVar = this.y;
        if (wxuVar == null) {
            wxuVar = null;
        }
        Target target = wxuVar.n;
        return (target == null || (userId = target.c) == null) ? t11.b() : userId;
    }

    @Override // xsna.qdc0
    public final void Qk(CharSequence charSequence) {
        umc0 umc0Var = (umc0) this.w.getValue();
        Handler handler = umc0Var.d;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new e0(6, umc0Var, charSequence), 500L);
        charSequence.toString();
        Na();
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x034a, code lost:
    
        if (xsna.o25.a().a(r0.o.b) == false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0297  */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R7() {
        boolean z;
        UserId userId;
        tfx e2;
        dz2 x;
        Object obj;
        Pair pair;
        z84 z84Var;
        wxu wxuVar;
        sbc0 sbc0Var;
        sbc0 sbc0Var2;
        sbc0 sbc0Var3;
        z84 z84Var2;
        z84 z84Var3;
        lu9 lu9Var;
        boolean z2;
        boolean z3;
        kfk kfkVar;
        ikc0 ikc0Var;
        PostingFragment postingFragment;
        Post post;
        ?? r4;
        io.reactivex.rxjava3.core.t L;
        z84 z84Var4 = this.B;
        if (z84Var4 == null) {
            z84Var4 = null;
        }
        if (z84Var4.c.j()) {
            return;
        }
        int length = this.X.getText().length();
        PostingFragment postingFragment2 = this.c;
        if (length > 16384) {
            postingFragment2.mo(R.string.newsfeed_newpost_long_text);
            return;
        }
        if (Um() != null) {
            xuo0.a.getClass();
            z = yl10.a(xuo0.a(), Um().getTime());
        } else {
            z = true;
        }
        if (!z) {
            postingFragment2.mo(R.string.invalid_date);
            return;
        }
        this.g.e();
        boolean z4 = z7() instanceof BoardCommentNewsEntry;
        com.vk.newsfeed.impl.posting.a aVar = this.d;
        if (z4 || (z7() instanceof MarketCommentNewsEntry)) {
            sbc0 sbc0Var4 = this.x;
            if (sbc0Var4 == null) {
                sbc0Var4 = null;
            }
            if (sbc0Var4.r == null) {
                return;
            }
            wxu wxuVar2 = this.y;
            if (wxuVar2 == null) {
                wxuVar2 = null;
            }
            wxuVar2.e0(false);
            String d2 = this.X.d();
            NewsEntry z7 = z7();
            int zb = z7 != null ? z7.zb() : -1;
            z84 z84Var5 = this.B;
            if (z84Var5 == null) {
                z84Var5 = null;
            }
            List<Attachment> u = z84Var5.u();
            sbc0 sbc0Var5 = this.x;
            if (sbc0Var5 == null) {
                sbc0Var5 = null;
            }
            BoardComment boardComment = sbc0Var5.r;
            CommentNewsEntry commentNewsEntry = z7() instanceof CommentNewsEntry ? (CommentNewsEntry) z7() : null;
            aVar.getClass();
            if (!u.isEmpty()) {
                Iterator<T> it = u.iterator();
                while (it.hasNext()) {
                    if (((Attachment) it.next()) instanceof ju90) {
                        break;
                    }
                }
            }
            int i = com.vkontakte.android.attachments.a.a;
            Collections.sort(u);
            if (boardComment != null) {
                ArrayList<Attachment> arrayList = boardComment.f;
                if (arrayList != null) {
                    arrayList.clear();
                }
                if (arrayList != null) {
                    arrayList.addAll(u);
                }
                boardComment.c = d2;
            }
            if (commentNewsEntry == null || (userId = commentNewsEntry.i) == null) {
                userId = UserId.d;
            }
            if (boardComment != null) {
                int i2 = boardComment.b;
                String str = boardComment.c;
                if (str != null) {
                    List singletonList = Collections.singletonList(!u.isEmpty() ? j5g.g0(u, StringUtils.COMMA, null, null, 0, null, 62) : " ");
                    if (zb == 17) {
                        e2 = ((xd10) aVar.b.getValue()).d(i2, str, singletonList, userId);
                    } else {
                        gi7 gi7Var = (gi7) aVar.c.getValue();
                        BoardCommentNewsEntry boardCommentNewsEntry = commentNewsEntry instanceof BoardCommentNewsEntry ? (BoardCommentNewsEntry) commentNewsEntry : null;
                        e2 = gi7Var.e(boardCommentNewsEntry != null ? boardCommentNewsEntry.m : 0, i2, userId, str, singletonList);
                    }
                    x = yfb.x(e2);
                    if (x == null) {
                        int i3 = 7;
                        postingFragment2.eo(postingFragment2.no(rsg0.y0(x, null, null, 3)).subscribe(new k2y(new w910(this, 14), 11), new qw40(new pf40(this, i3), i3)));
                        return;
                    }
                    return;
                }
            }
            x = null;
            if (x == null) {
            }
        } else {
            Iterator<T> it2 = u().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                Attachment attachment = (Attachment) obj;
                if ((attachment instanceof LinkAttachment) || (attachment instanceof SnippetAttachment)) {
                    break;
                }
            }
            Attachment attachment2 = (Attachment) obj;
            if (attachment2 instanceof SnippetAttachment) {
                SnippetAttachment snippetAttachment = (SnippetAttachment) attachment2;
                if (snippetAttachment.Fb()) {
                    if (snippetAttachment.f.b != null ? !naz.A(r11) : true) {
                        Photo photo = snippetAttachment.p;
                        pair = new Pair(photo != null ? photo.Cb() : null, snippetAttachment.g);
                        String d3 = this.X.d();
                        z84Var = this.B;
                        if (z84Var == null) {
                            z84Var = null;
                        }
                        List<Attachment> u2 = z84Var.u();
                        wxuVar = this.y;
                        Target target = (wxuVar == null ? null : wxuVar).n;
                        boolean z5 = this.k0 == PostingVisibilityMode.FRIENDS;
                        boolean z6 = this.l0;
                        boolean z8 = this.m0;
                        if (wxuVar == null) {
                            wxuVar = null;
                        }
                        Target target2 = wxuVar.n;
                        boolean z9 = target2 == null && !target2.k;
                        boolean z10 = this.u0;
                        Date Um = Um();
                        GeoAttachment y7 = y7();
                        sbc0Var = this.x;
                        if (sbc0Var == null) {
                            sbc0Var = null;
                        }
                        int i4 = sbc0Var.I;
                        Pair pair2 = pair;
                        boolean z11 = this.n0;
                        boolean z12 = this.o0;
                        aac0 A7 = A7();
                        UserId userId2 = this.B0;
                        NewsEntry z72 = z7();
                        boolean z13 = this.D0;
                        boolean z14 = this.C0;
                        Group group = this.v0;
                        sbc0Var2 = this.x;
                        if (sbc0Var2 == null) {
                            sbc0Var2 = null;
                        }
                        String str2 = sbc0Var2.T;
                        String str3 = this.r0;
                        Integer Ld = Ld();
                        sbc0Var3 = this.x;
                        if (sbc0Var3 == null) {
                            sbc0Var3 = null;
                        }
                        UserId userId3 = sbc0Var3.P;
                        boolean z15 = this.k0 == PostingVisibilityMode.BEST_FRIENDS;
                        boolean z16 = (sbc0Var3 == null ? null : sbc0Var3).U;
                        z84Var2 = this.B;
                        if (z84Var2 == null) {
                            z84Var2 = null;
                        }
                        boolean z17 = z15;
                        PostingPrimaryMode postingPrimaryMode = z84Var2.c.i() < 2 ? null : z84Var2.b.Pe().b ? PostingPrimaryMode.GRID : PostingPrimaryMode.CAROUSEL;
                        boolean z18 = this.Y;
                        String str4 = (String) pair2.j();
                        String str5 = (String) pair2.i();
                        PostingOrd postingOrd = this.p0;
                        z84Var3 = this.B;
                        if (z84Var3 == null) {
                            z84Var3 = null;
                        }
                        lu9Var = z84Var3.p;
                        if (lu9Var != null) {
                            z2 = z18;
                            z3 = true;
                            if (lu9Var.n == 1) {
                                kfkVar = lu9Var.a();
                            } else if (!lu9Var.g) {
                                kfkVar = lu9Var.a();
                            }
                            flc0 flc0Var = new flc0();
                            flc0Var.a = d3;
                            flc0Var.b = u2;
                            flc0Var.c = target;
                            flc0Var.d = z5;
                            flc0Var.e = z6;
                            flc0Var.f = z8;
                            flc0Var.g = z9;
                            flc0Var.h = z10;
                            flc0Var.i = Um;
                            flc0Var.j = y7;
                            flc0Var.k = i4;
                            flc0Var.l = z11;
                            flc0Var.m = z12;
                            flc0Var.n = A7;
                            flc0Var.o = userId2;
                            flc0Var.p = z72;
                            flc0Var.q = z14;
                            flc0Var.r = group;
                            flc0Var.s = str2;
                            flc0Var.t = str3;
                            flc0Var.u = Ld;
                            flc0Var.v = z17;
                            flc0Var.w = z16;
                            flc0Var.x = postingPrimaryMode;
                            flc0Var.y = z2;
                            flc0Var.z = str4;
                            flc0Var.A = str5;
                            flc0Var.B = postingOrd;
                            flc0Var.C = kfkVar;
                            int i5 = 21;
                            int i6 = 23;
                            if (BuildInfo.q()) {
                                PostCommentNewsEntry postCommentNewsEntry = z72 instanceof PostCommentNewsEntry ? (PostCommentNewsEntry) z72 : null;
                                NewsComment newsComment = postCommentNewsEntry != null ? postCommentNewsEntry.q : null;
                                if ((newsComment != null ? newsComment.i : 0) > 0 && newsComment != null) {
                                    ikc0Var = this;
                                    postingFragment = postingFragment2;
                                    ver0.a(postingFragment.no(((ics0) ikc0Var.p.getValue()).a(new x1p(flc0Var.a, null, postCommentNewsEntry.i, newsComment.i, flc0Var.b), new defpackage.y(i6, postCommentNewsEntry, newsComment))).subscribe(new xk30(new v53(i5, ikc0Var, postCommentNewsEntry), 14)));
                                    if (z3) {
                                        return;
                                    }
                                    int i7 = 4;
                                    int i8 = 10;
                                    if (ikc0Var.h.e) {
                                        aVar.getClass();
                                        Pair b2 = com.vk.newsfeed.impl.posting.a.b(flc0Var);
                                        Map map = (Map) b2.d();
                                        List list = (List) b2.g();
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj2 : list) {
                                            if (!(((Attachment) obj2) instanceof GeoAttachment)) {
                                                arrayList2.add(obj2);
                                            }
                                        }
                                        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(((Attachment) it3.next()).toString());
                                        }
                                        ArrayList arrayList4 = new ArrayList(arrayList3);
                                        io.reactivex.rxjava3.core.q e3 = com.vk.newsfeed.impl.posting.a.e(flc0Var);
                                        zj0 zj0Var = new zj0(new defpackage.y(i5, aVar, arrayList4), i6);
                                        r4 = 0;
                                        L = e3.L(zj0Var, false).L(new u5(new eo3(aVar, flc0Var, map, 11), 29), false);
                                    } else {
                                        aVar.getClass();
                                        if (!z13) {
                                            post = z72 instanceof Post ? (Post) z72 : null;
                                            if (post != null) {
                                                if (post.n > 0) {
                                                    if (z14) {
                                                    }
                                                    if (post == null) {
                                                        L = rsg0.y0(new j9x0(com.vk.newsfeed.impl.posting.a.a(flc0Var, post, EmptyList.b)), null, null, 3);
                                                        r4 = 0;
                                                    } else {
                                                        Iterable iterable = (Iterable) com.vk.newsfeed.impl.posting.a.b(flc0Var).j();
                                                        ArrayList arrayList5 = new ArrayList();
                                                        for (Object obj3 : iterable) {
                                                            if (!(((Attachment) obj3) instanceof GeoAttachment)) {
                                                                arrayList5.add(obj3);
                                                            }
                                                        }
                                                        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                                                        Iterator it4 = arrayList5.iterator();
                                                        while (it4.hasNext()) {
                                                            arrayList6.add(((Attachment) it4.next()).toString());
                                                        }
                                                        r4 = 0;
                                                        L = com.vk.newsfeed.impl.posting.a.e(flc0Var).L(new q9(new wd3(i6, aVar, new ArrayList(arrayList6)), 28), false).L(new l960(new mh4(25, aVar, flc0Var), i7), false);
                                                    }
                                                }
                                            }
                                        }
                                        post = null;
                                        if (post == null) {
                                        }
                                    }
                                    postingFragment.eo(postingFragment.no(L).L(new hkc0(new l850(flc0Var, i7), (int) r4), r4).subscribe(new ow40(new mgz(ikc0Var, 24), 11), new pw40(new ap30(ikc0Var, i8), 6)));
                                    return;
                                }
                            }
                            ikc0Var = this;
                            postingFragment = postingFragment2;
                            z3 = false;
                            if (z3) {
                            }
                        } else {
                            z2 = z18;
                            z3 = true;
                        }
                        kfkVar = null;
                        flc0 flc0Var2 = new flc0();
                        flc0Var2.a = d3;
                        flc0Var2.b = u2;
                        flc0Var2.c = target;
                        flc0Var2.d = z5;
                        flc0Var2.e = z6;
                        flc0Var2.f = z8;
                        flc0Var2.g = z9;
                        flc0Var2.h = z10;
                        flc0Var2.i = Um;
                        flc0Var2.j = y7;
                        flc0Var2.k = i4;
                        flc0Var2.l = z11;
                        flc0Var2.m = z12;
                        flc0Var2.n = A7;
                        flc0Var2.o = userId2;
                        flc0Var2.p = z72;
                        flc0Var2.q = z14;
                        flc0Var2.r = group;
                        flc0Var2.s = str2;
                        flc0Var2.t = str3;
                        flc0Var2.u = Ld;
                        flc0Var2.v = z17;
                        flc0Var2.w = z16;
                        flc0Var2.x = postingPrimaryMode;
                        flc0Var2.y = z2;
                        flc0Var2.z = str4;
                        flc0Var2.A = str5;
                        flc0Var2.B = postingOrd;
                        flc0Var2.C = kfkVar;
                        int i52 = 21;
                        int i62 = 23;
                        if (BuildInfo.q()) {
                        }
                        ikc0Var = this;
                        postingFragment = postingFragment2;
                        z3 = false;
                        if (z3) {
                        }
                    }
                }
            }
            if (attachment2 instanceof LinkAttachment) {
                LinkAttachment linkAttachment = (LinkAttachment) attachment2;
                if (linkAttachment.f.b != null ? !naz.A(r1) : true) {
                    pair = new Pair(null, linkAttachment.g);
                    String d32 = this.X.d();
                    z84Var = this.B;
                    if (z84Var == null) {
                    }
                    List<Attachment> u22 = z84Var.u();
                    wxuVar = this.y;
                    Target target3 = (wxuVar == null ? null : wxuVar).n;
                    if (this.k0 == PostingVisibilityMode.FRIENDS) {
                    }
                    boolean z62 = this.l0;
                    boolean z82 = this.m0;
                    if (wxuVar == null) {
                    }
                    Target target22 = wxuVar.n;
                    if (target22 == null) {
                    }
                    boolean z102 = this.u0;
                    Date Um2 = Um();
                    GeoAttachment y72 = y7();
                    sbc0Var = this.x;
                    if (sbc0Var == null) {
                    }
                    int i42 = sbc0Var.I;
                    Pair pair22 = pair;
                    boolean z112 = this.n0;
                    boolean z122 = this.o0;
                    aac0 A72 = A7();
                    UserId userId22 = this.B0;
                    NewsEntry z722 = z7();
                    boolean z132 = this.D0;
                    boolean z142 = this.C0;
                    Group group2 = this.v0;
                    sbc0Var2 = this.x;
                    if (sbc0Var2 == null) {
                    }
                    String str22 = sbc0Var2.T;
                    String str32 = this.r0;
                    Integer Ld2 = Ld();
                    sbc0Var3 = this.x;
                    if (sbc0Var3 == null) {
                    }
                    UserId userId32 = sbc0Var3.P;
                    if (this.k0 == PostingVisibilityMode.BEST_FRIENDS) {
                    }
                    boolean z162 = (sbc0Var3 == null ? null : sbc0Var3).U;
                    z84Var2 = this.B;
                    if (z84Var2 == null) {
                    }
                    boolean z172 = z15;
                    if (z84Var2.c.i() < 2) {
                    }
                    boolean z182 = this.Y;
                    String str42 = (String) pair22.j();
                    String str52 = (String) pair22.i();
                    PostingOrd postingOrd2 = this.p0;
                    z84Var3 = this.B;
                    if (z84Var3 == null) {
                    }
                    lu9Var = z84Var3.p;
                    if (lu9Var != null) {
                    }
                    kfkVar = null;
                    flc0 flc0Var22 = new flc0();
                    flc0Var22.a = d32;
                    flc0Var22.b = u22;
                    flc0Var22.c = target3;
                    flc0Var22.d = z5;
                    flc0Var22.e = z62;
                    flc0Var22.f = z82;
                    flc0Var22.g = z9;
                    flc0Var22.h = z102;
                    flc0Var22.i = Um2;
                    flc0Var22.j = y72;
                    flc0Var22.k = i42;
                    flc0Var22.l = z112;
                    flc0Var22.m = z122;
                    flc0Var22.n = A72;
                    flc0Var22.o = userId22;
                    flc0Var22.p = z722;
                    flc0Var22.q = z142;
                    flc0Var22.r = group2;
                    flc0Var22.s = str22;
                    flc0Var22.t = str32;
                    flc0Var22.u = Ld2;
                    flc0Var22.v = z172;
                    flc0Var22.w = z162;
                    flc0Var22.x = postingPrimaryMode;
                    flc0Var22.y = z2;
                    flc0Var22.z = str42;
                    flc0Var22.A = str52;
                    flc0Var22.B = postingOrd2;
                    flc0Var22.C = kfkVar;
                    int i522 = 21;
                    int i622 = 23;
                    if (BuildInfo.q()) {
                    }
                    ikc0Var = this;
                    postingFragment = postingFragment2;
                    z3 = false;
                    if (z3) {
                    }
                }
            }
            pair = new Pair(null, null);
            String d322 = this.X.d();
            z84Var = this.B;
            if (z84Var == null) {
            }
            List<Attachment> u222 = z84Var.u();
            wxuVar = this.y;
            Target target32 = (wxuVar == null ? null : wxuVar).n;
            if (this.k0 == PostingVisibilityMode.FRIENDS) {
            }
            boolean z622 = this.l0;
            boolean z822 = this.m0;
            if (wxuVar == null) {
            }
            Target target222 = wxuVar.n;
            if (target222 == null) {
            }
            boolean z1022 = this.u0;
            Date Um22 = Um();
            GeoAttachment y722 = y7();
            sbc0Var = this.x;
            if (sbc0Var == null) {
            }
            int i422 = sbc0Var.I;
            Pair pair222 = pair;
            boolean z1122 = this.n0;
            boolean z1222 = this.o0;
            aac0 A722 = A7();
            UserId userId222 = this.B0;
            NewsEntry z7222 = z7();
            boolean z1322 = this.D0;
            boolean z1422 = this.C0;
            Group group22 = this.v0;
            sbc0Var2 = this.x;
            if (sbc0Var2 == null) {
            }
            String str222 = sbc0Var2.T;
            String str322 = this.r0;
            Integer Ld22 = Ld();
            sbc0Var3 = this.x;
            if (sbc0Var3 == null) {
            }
            UserId userId322 = sbc0Var3.P;
            if (this.k0 == PostingVisibilityMode.BEST_FRIENDS) {
            }
            boolean z1622 = (sbc0Var3 == null ? null : sbc0Var3).U;
            z84Var2 = this.B;
            if (z84Var2 == null) {
            }
            boolean z1722 = z15;
            if (z84Var2.c.i() < 2) {
            }
            boolean z1822 = this.Y;
            String str422 = (String) pair222.j();
            String str522 = (String) pair222.i();
            PostingOrd postingOrd22 = this.p0;
            z84Var3 = this.B;
            if (z84Var3 == null) {
            }
            lu9Var = z84Var3.p;
            if (lu9Var != null) {
            }
            kfkVar = null;
            flc0 flc0Var222 = new flc0();
            flc0Var222.a = d322;
            flc0Var222.b = u222;
            flc0Var222.c = target32;
            flc0Var222.d = z5;
            flc0Var222.e = z622;
            flc0Var222.f = z822;
            flc0Var222.g = z9;
            flc0Var222.h = z1022;
            flc0Var222.i = Um22;
            flc0Var222.j = y722;
            flc0Var222.k = i422;
            flc0Var222.l = z1122;
            flc0Var222.m = z1222;
            flc0Var222.n = A722;
            flc0Var222.o = userId222;
            flc0Var222.p = z7222;
            flc0Var222.q = z1422;
            flc0Var222.r = group22;
            flc0Var222.s = str222;
            flc0Var222.t = str322;
            flc0Var222.u = Ld22;
            flc0Var222.v = z1722;
            flc0Var222.w = z1622;
            flc0Var222.x = postingPrimaryMode;
            flc0Var222.y = z2;
            flc0Var222.z = str422;
            flc0Var222.A = str522;
            flc0Var222.B = postingOrd22;
            flc0Var222.C = kfkVar;
            int i5222 = 21;
            int i6222 = 23;
            if (BuildInfo.q()) {
            }
            ikc0Var = this;
            postingFragment = postingFragment2;
            z3 = false;
            if (z3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // xsna.f420
    public final void S1() {
        Object obj = this.D;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        r0.f2(true);
        ?? r02 = this.D;
        (r02 != 0 ? r02 : null).zl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final void S7(String str) {
        this.r0 = str;
        Object obj = this.C;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        r0.i5(!(str == null || str.length() == 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v29, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.text.SpannableStringBuilder] */
    public final void T7(boolean z) {
        a aVar = this.X;
        b bVar = this.V;
        if (epx.f(aVar, bVar) != z) {
            if (!z || J7()) {
                this.Q = true;
                if (z) {
                    this.X = bVar;
                    lko0 lko0Var = this.z;
                    if (lko0Var == null) {
                        lko0Var = null;
                    }
                    int t1 = lko0Var.c.t1();
                    lko0 lko0Var2 = this.z;
                    if (lko0Var2 == null) {
                        lko0Var2 = null;
                    }
                    lko0Var2.d0(false);
                    z84 z84Var = this.B;
                    if (z84Var == null) {
                        z84Var = null;
                    }
                    z84Var.Y0(false);
                    tac0 tac0Var = this.A;
                    if (tac0Var == null) {
                        tac0Var = null;
                    }
                    tac0Var.c.zj(true, null);
                    Object obj = this.D;
                    ?? r1 = obj;
                    if (obj == null) {
                        r1 = 0;
                    }
                    r1.vg();
                    lko0 lko0Var3 = this.z;
                    if (lko0Var3 == null) {
                        lko0Var3 = null;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lko0Var3.c.getText());
                    if (myc0.f(spannableStringBuilder)) {
                        int length = spannableStringBuilder.length();
                        lko0 lko0Var4 = this.z;
                        if (lko0Var4 == null) {
                            lko0Var4 = null;
                        }
                        lko0Var4.g.getClass();
                        for (Object obj2 : spannableStringBuilder.getSpans(0, length, i420.class)) {
                            i420 i420Var = (i420) obj2;
                            int spanStart = spannableStringBuilder.getSpanStart(i420Var);
                            int spanEnd = spannableStringBuilder.getSpanEnd(i420Var);
                            spannableStringBuilder.removeSpan(i420Var);
                            tac0 tac0Var2 = this.A;
                            if (tac0Var2 == null) {
                                tac0Var2 = null;
                            }
                            spannableStringBuilder.setSpan(tac0Var2.t.i(i420Var), spanStart, spanEnd, 33);
                        }
                    }
                    tac0 tac0Var3 = this.A;
                    if (tac0Var3 == null) {
                        tac0Var3 = null;
                    }
                    tac0Var3.setText(spannableStringBuilder);
                    tac0 tac0Var4 = this.A;
                    (tac0Var4 != null ? tac0Var4 : null).Z(t1);
                    this.U = true;
                    return;
                }
                this.X = this.W;
                tac0 tac0Var5 = this.A;
                if (tac0Var5 == null) {
                    tac0Var5 = null;
                }
                int t12 = tac0Var5.c.t1();
                tac0 tac0Var6 = this.A;
                if (tac0Var6 == null) {
                    tac0Var6 = null;
                }
                tac0Var6.g();
                Object obj3 = this.D;
                ?? r12 = obj3;
                if (obj3 == null) {
                    r12 = 0;
                }
                r12.ib();
                lko0 lko0Var5 = this.z;
                if (lko0Var5 == null) {
                    lko0Var5 = null;
                }
                lko0Var5.d0(true);
                z84 z84Var2 = this.B;
                if (z84Var2 == null) {
                    z84Var2 = null;
                }
                z84Var2.Y0(true);
                tac0 tac0Var7 = this.A;
                if (tac0Var7 == null) {
                    tac0Var7 = null;
                }
                String obj4 = tac0Var7.c.F5().toString();
                lko0 lko0Var6 = this.z;
                if (lko0Var6 == null) {
                    lko0Var6 = null;
                }
                pil pilVar = lko0Var6.g;
                tac0 tac0Var8 = this.A;
                if (tac0Var8 == null) {
                    tac0Var8 = null;
                }
                sac0 sac0Var = tac0Var8.t;
                if (myc0.f(obj4)) {
                    tac0 tac0Var9 = this.A;
                    if (tac0Var9 == null) {
                        tac0Var9 = null;
                    }
                    ?? spannableStringBuilder2 = new SpannableStringBuilder(tac0Var9.c.F5());
                    int length2 = obj4.length();
                    sac0Var.getClass();
                    i420[] i420VarArr = (i420[]) spannableStringBuilder2.getSpans(0, length2, i420.class);
                    if (i420VarArr.length != 0) {
                        for (i420 i420Var2 : i420VarArr) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(i420Var2);
                            int spanEnd2 = spannableStringBuilder2.getSpanEnd(i420Var2);
                            spannableStringBuilder2.removeSpan(i420Var2);
                            spannableStringBuilder2.setSpan(pilVar.i(i420Var2), spanStart2, spanEnd2, 33);
                        }
                        obj4 = spannableStringBuilder2;
                    }
                }
                lko0 lko0Var7 = this.z;
                if (lko0Var7 == null) {
                    lko0Var7 = null;
                }
                lko0Var7.setText(obj4);
                tac0 tac0Var10 = this.A;
                (tac0Var10 != null ? tac0Var10 : null).c.zj(false, new kor(this, t12, 3));
            }
        }
    }

    @Override // xsna.qdc0
    public final void Te() {
        Object obj;
        if (!this.L0) {
            List<Attachment> u = u();
            if (!u.isEmpty()) {
                Iterator<T> it = u.iterator();
                while (it.hasNext()) {
                    if (((Attachment) it.next()) instanceof f010) {
                        return;
                    }
                }
            }
            boolean z = this.J0;
            scc0 scc0Var = this.s;
            if (z) {
                scc0Var.c();
                return;
            } else if (this.I0) {
                scc0Var.f();
                return;
            } else {
                if (this.K0) {
                    scc0Var.e();
                    return;
                }
                return;
            }
        }
        PostingFragment postingFragment = this.c;
        ikc0 ikc0Var = postingFragment.h0;
        AttachmentType attachmentType = null;
        if (ikc0Var != null) {
            Iterator it2 = ((ArrayList) ikc0Var.u()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (obj instanceof f010) {
                        break;
                    }
                }
            }
            if (!(obj instanceof f010)) {
                obj = null;
            }
            f010 f010Var = (f010) obj;
            if (f010Var != null) {
                attachmentType = f010Var.E9();
            }
        }
        t9b t9bVar = new t9b(13, postingFragment, attachmentType);
        if (!ify.e(ify.c)) {
            t9bVar.invoke();
        } else {
            postingFragment.jo().d0();
            ify.a(new pfc0(t9bVar));
        }
    }

    public final void U7(String str) {
        lko0 lko0Var = this.z;
        if (lko0Var == null) {
            lko0Var = null;
        }
        lko0Var.setText(str);
        lko0 lko0Var2 = this.z;
        kko0 kko0Var = (lko0Var2 != null ? lko0Var2 : null).c;
        kko0Var.w();
        kko0Var.kj();
    }

    @Override // xsna.qdc0
    public final void Uf() {
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    @Override // xsna.qdc0
    public final void Uk(String str) {
        if (this.G) {
            return;
        }
        if (!this.F.isEmpty()) {
            W7(w7(str), myc0.f(str), true);
            return;
        }
        this.G = true;
        this.b.b(rsg0.D0(yfb.x(new tfx("wall.getSuggestedHashtags", new trk0(7), new xga0(10)))).l(new vga0(new ehu(23), 1)).subscribe(new lkz(new eaa(28, this, str), 11), new ljs(new f0z(this, 22), 20)));
    }

    @Override // xsna.qdc0
    public final Date Um() {
        Target D7 = D7();
        if (!this.e0) {
            return null;
        }
        if (fkq0.b(this.B0) && D7 != null && D7.k) {
            return null;
        }
        return this.t0;
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        ArrayList arrayList;
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null || (arrayList = bundleExtra.getParcelableArrayList("result_files")) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.c.ho(300L, new s(17, this, arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final void V7() {
        Object obj = this.D;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        if (!this.Q) {
            r0.ib();
        } else if (epx.f(this.X, this.V)) {
            r0.vg();
        } else {
            r0.ib();
        }
        r0.zl();
    }

    @Override // xsna.qdc0
    public final void W2(String str) {
        this.X.W2(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    public final void W7(ArrayList arrayList, boolean z, boolean z2) {
        if (arrayList.isEmpty() || !z) {
            if (z2) {
                Xl();
                return;
            }
            return;
        }
        if (!this.H) {
            this.I = true;
            Object obj = this.C;
            ?? r0 = obj;
            if (obj == null) {
                r0 = 0;
            }
            r0.hide();
            Object obj2 = this.D;
            ?? r02 = obj2;
            if (obj2 == null) {
                r02 = 0;
            }
            r02.y9();
            this.c.ko(true);
        }
        ?? r3 = this.D;
        (r3 != 0 ? r3 : null).Yj(arrayList);
    }

    @Override // xsna.o9q0
    public final void X3(int i, Attachment attachment) {
        this.g.X3(i, attachment);
        this.s.r(Collections.singletonList(attachment), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:7:0x0018->B:23:?, LOOP_END, SYNTHETIC] */
    @Override // xsna.qdc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X4() {
        boolean z;
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        ArrayList arrayList = (ArrayList) z84Var.u();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Attachment attachment = (Attachment) it.next();
                if (!(attachment instanceof MarketAttachment)) {
                    SnippetAttachment snippetAttachment = attachment instanceof SnippetAttachment ? (SnippetAttachment) attachment : null;
                    if (!(snippetAttachment != null ? snippetAttachment.Gb() : false)) {
                        z = false;
                        if (!z) {
                            return true;
                        }
                    }
                }
                z = true;
                if (!z) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r4v12, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void X7(Target target) {
        if (!this.s0 || target == null || !target.s) {
            Object obj = this.C;
            ?? r4 = obj;
            if (obj == null) {
                r4 = 0;
            }
            r4.N1(false);
            Object obj2 = this.C;
            ?? r42 = obj2;
            if (obj2 == null) {
                r42 = 0;
            }
            r42.f5(false);
            Object obj3 = this.C;
            ?? r43 = obj3;
            if (obj3 == null) {
                r43 = 0;
            }
            sbc0 sbc0Var = this.x;
            r43.j2((sbc0Var != null ? sbc0Var : null).M);
            return;
        }
        Object obj4 = this.C;
        ?? r44 = obj4;
        if (obj4 == null) {
            r44 = 0;
        }
        r44.N1(true);
        Integer Ld = Ld();
        if (Ld != null) {
            int intValue = Ld.intValue();
            Object obj5 = this.C;
            ?? r2 = obj5;
            if (obj5 == null) {
                r2 = 0;
            }
            r2.H0(intValue);
        }
        if (this.w0) {
            Object obj6 = this.C;
            (obj6 != null ? obj6 : 0).f5(true);
        }
    }

    @Override // xsna.qdc0
    public final void Xc() {
        if (this.O) {
            return;
        }
        if (!epx.f(this.X, this.V)) {
            lko0 lko0Var = this.z;
            if (lko0Var == null) {
                lko0Var = null;
            }
            int t1 = lko0Var.c.t1();
            q420 q420Var = lko0Var.l;
            if (q420Var == null) {
                q420Var = null;
            }
            if (q420Var.c(t1 - 1, t1 + 1)) {
                lko0 lko0Var2 = this.z;
                (lko0Var2 != null ? lko0Var2 : null).g(" @");
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                this.e.g();
            }
        }
        if (drm0.F(this.X.getText(), "@")) {
            x0("");
        } else {
            this.X.a();
        }
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // xsna.qdc0
    public final void Xl() {
        if (this.H) {
            return;
        }
        this.I = false;
        V7();
        Object obj = this.C;
        ?? r1 = obj;
        if (obj == null) {
            r1 = 0;
        }
        r1.show();
        this.c.ko(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.l420
    public final void Y0() {
        if (this.I) {
            return;
        }
        this.H = false;
        g420 g420Var = this.E;
        if (g420Var == null) {
            g420Var = null;
        }
        g420Var.hide();
        V7();
        Object obj = this.C;
        (obj != 0 ? obj : null).k2(this.P);
    }

    public final void Y7(AttachType attachType) {
        int i = d.$EnumSwitchMapping$0[attachType.ordinal()];
        jbc0 jbc0Var = this.e;
        switch (i) {
            case 1:
            case 10:
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                return;
            case 2:
                ghc0.b h = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = this.J;
                h.getClass();
                h.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_ALBUM, postingMetricsCreationEntryPoint);
                return;
            case 3:
                ghc0.b h2 = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint2 = this.J;
                h2.getClass();
                h2.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.CLICK_TO_ARTICLE, postingMetricsCreationEntryPoint2);
                return;
            case 4:
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ghc0.b h3 = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint3 = this.J;
                h3.getClass();
                h3.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_PRODUCT, postingMetricsCreationEntryPoint3);
                return;
            case 5:
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType3 = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ghc0.b h4 = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint4 = this.J;
                h4.getClass();
                h4.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_DOC, postingMetricsCreationEntryPoint4);
                return;
            case 6:
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType4 = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                return;
            case 7:
                ghc0.b h5 = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint5 = this.J;
                h5.getClass();
                h5.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_MY_PHOTO, postingMetricsCreationEntryPoint5);
                return;
            case 8:
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType5 = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ghc0.b h6 = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint6 = this.J;
                h6.getClass();
                h6.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_PLACE, postingMetricsCreationEntryPoint6);
                return;
            case 9:
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType6 = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ghc0.b h7 = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint7 = this.J;
                h7.getClass();
                h7.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_SERVICE, postingMetricsCreationEntryPoint7);
                return;
            case 11:
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType7 = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ghc0.b h8 = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint8 = this.J;
                h8.getClass();
                h8.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_MY_VIDEO, postingMetricsCreationEntryPoint8);
                return;
            case 12:
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType8 = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ghc0.b h9 = C7().h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint9 = this.J;
                h9.getClass();
                h9.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_POLL, postingMetricsCreationEntryPoint9);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.qdc0
    public final boolean Zg() {
        return this.w0;
    }

    @Override // xsna.qdc0
    public final void Zi() {
        wxu wxuVar = this.y;
        if (wxuVar == null) {
            wxuVar = null;
        }
        wxuVar.z();
        this.X.w();
        this.X.k();
    }

    @Override // xsna.ysi, xsna.wsi, xsna.qdc0
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        this.c.eo(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // xsna.gm6
    public final boolean a0() {
        g420 g420Var = this.E;
        if (g420Var == null) {
            g420Var = null;
        }
        if (epx.f(g420Var.e(), k420.a.a)) {
            wxu wxuVar = this.y;
            if (!(wxuVar == null ? null : wxuVar).l) {
                return E7();
            }
            (wxuVar != null ? wxuVar : null).z();
            return true;
        }
        g420 g420Var2 = this.E;
        if (g420Var2 == null) {
            g420Var2 = null;
        }
        g420Var2.hide();
        Object obj = this.D;
        (obj != null ? obj : 0).I7();
        return true;
    }

    @Override // xsna.o9q0
    public final void a4(ju90<?> ju90Var, int i) {
        this.g.a4(ju90Var, i);
    }

    @Override // xsna.qdc0
    public final void cf(MediaStoreEntry mediaStoreEntry) {
        boolean z = mediaStoreEntry instanceof MediaStoreVideoEntry;
        jbc0 jbc0Var = this.e;
        scc0 scc0Var = this.s;
        if (z) {
            scc0Var.k(Collections.singletonList(((MediaStoreVideoEntry) mediaStoreEntry).k.toString()));
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
        } else {
            scc0Var.i(Collections.singletonList(mediaStoreEntry.f().toString()));
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
        }
    }

    @Override // xsna.qdc0
    public final boolean cg() {
        return scc0.n(this.s);
    }

    @Override // xsna.gm6
    public final void d() {
        sbc0 sbc0Var = this.x;
        if (sbc0Var == null) {
            sbc0Var = null;
        }
        boolean z = sbc0Var.U;
        jbc0 jbc0Var = this.e;
        if (z) {
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
        } else {
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
        }
    }

    @Override // xsna.f420
    public final void e0() {
        Y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // xsna.qdc0
    public final void e1(Date date) {
        if (!epx.f(this.t0, date)) {
            this.h0 = true;
        }
        this.t0 = date;
        if (date == null) {
            Object obj = this.C;
            ?? r2 = obj;
            if (obj == null) {
                r2 = 0;
            }
            r2.w4();
        } else {
            Object obj2 = this.C;
            ?? r22 = obj2;
            if (obj2 == null) {
                r22 = 0;
            }
            r22.e1(date);
        }
        wxu wxuVar = this.y;
        (wxuVar != null ? wxuVar : null).c.Vb(date != null);
    }

    @Override // xsna.qtj
    public final void f0(String str) {
        S7(str);
        C7().x().a(str, this.J);
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    @Override // xsna.qdc0
    public final int fe() {
        return this.K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00ab, code lost:
    
        if (r2.p == true) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r2.k == true) goto L67;
     */
    @Override // xsna.qdc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g2() {
        Target D7;
        this.i0 = false;
        ulc0 ulc0Var = new ulc0(this.j ? PostingSettingsFragmentMvi.class : PostingSettingsFragment.class, null, null);
        Activity o1 = hd60.a().o1();
        TabletDialogActivity.a d2 = rfc0.d();
        if (o1 != null) {
            HashSet hashSet = iah0.a;
            if (fnj.d(o1)) {
                ulc0Var.i = d2;
            }
        }
        boolean z = this.d0;
        Bundle bundle = ulc0Var.j;
        if (!z || this.k0 == PostingVisibilityMode.FRIENDS || (D7 = D7()) == null || !D7.k) {
            Target D72 = D7();
            if (D72 == null || D72.k) {
                bundle.putBoolean("socialExportForbidden", true);
            } else {
                bundle.putBoolean("socialExportInvisible", false);
            }
        } else {
            if (this.l0) {
                bundle.putBoolean("fb", true);
            }
            if (this.m0) {
                bundle.putBoolean("tw", true);
            }
            s3q0 s3q0Var = s3q0.a;
        }
        if (this.n0) {
            bundle.putBoolean("commentsClosing", true);
        }
        wxu wxuVar = this.y;
        if (wxuVar == null) {
            wxuVar = null;
        }
        Target target = wxuVar.n;
        if ((target == null || !target.k) && !this.D0) {
            bundle.putBoolean("socialExportForbidden", true);
        }
        if (this.q0) {
            if (this.v0 != null) {
                wxu wxuVar2 = this.y;
                if (wxuVar2 == null) {
                    wxuVar2 = null;
                }
                Target target2 = wxuVar2.n;
                if (target2 != null) {
                }
            }
            wxu wxuVar3 = this.y;
            if (wxuVar3 == null) {
                wxuVar3 = null;
            }
            Target target3 = wxuVar3.n;
            if (target3 != null) {
            }
            bundle.putBoolean("keyCommentsClosingEnabled", true);
        } else {
            bundle.putBoolean("keyCommentsClosingAvailable", false);
        }
        wxu wxuVar4 = this.y;
        if (wxuVar4 == null) {
            wxuVar4 = null;
        }
        Target target4 = wxuVar4.n;
        boolean z2 = target4 != null && target4.k;
        sbc0 sbc0Var = this.x;
        boolean z3 = (sbc0Var == null ? null : sbc0Var).g0;
        boolean z4 = (sbc0Var == null ? null : sbc0Var).h0;
        long j = (sbc0Var == null ? null : sbc0Var).f.b;
        if (sbc0Var == null) {
            sbc0Var = null;
        }
        boolean z5 = sbc0Var.g;
        bundle.putBoolean("authorIsUser", z2);
        bundle.putBoolean("openFromGroup", z3);
        bundle.putBoolean("groupIsPublic", z4);
        bundle.putLong("groupId", j);
        bundle.putBoolean("isAdmin", z5);
        bundle.putBoolean("commentsGloballyEnabled", this.q0);
        Date Um = Um();
        bundle.putLong("postponeDate", Um != null ? Um.getTime() : 0L);
        PostingOrd postingOrd = this.p0;
        if (postingOrd != null) {
            bundle.putParcelable("token_advertising_ord", postingOrd);
        }
        bundle.putBoolean("postIsEditing", F7());
        bundle.putBoolean("postponedPostIsEditing", G7());
        if (!this.e0) {
            bundle.putBoolean("postponeSelectorVisible", false);
        }
        sbc0 sbc0Var2 = this.x;
        if (sbc0Var2 == null) {
            sbc0Var2 = null;
        }
        if (sbc0Var2.L) {
            bundle.putBoolean("copyrightAllowed", true);
            String str = this.r0;
            if (str != null) {
                bundle.putString("copyrightLink", str);
            }
        }
        sbc0 sbc0Var3 = this.x;
        if (!(sbc0Var3 != null ? sbc0Var3 : null).a()) {
            bundle.putBoolean("notificationsVisible", false);
        } else if (this.o0) {
            bundle.putBoolean(C4504q2.x, true);
        }
        boolean z6 = this.C0;
        boolean z7 = this.Y;
        bundle.putBoolean("isSuggestedPost", z6);
        bundle.putBoolean("needHideName", z7);
        bundle.putString("creationEntryPoint", this.J.name());
        ulc0Var.g(40, this.c);
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    @Override // xsna.qdc0
    public final CharSequence getText() {
        return this.X.getText();
    }

    @Override // xsna.qdc0
    public final UserId getUid() {
        return this.B0;
    }

    @Override // xsna.qdc0
    public final void h8(xac0 xac0Var) {
        tac0 tac0Var = this.A;
        MobileOfficialAppsConPostingStat$PosterInfo mobileOfficialAppsConPostingStat$PosterInfo = null;
        if (tac0Var == null) {
            tac0Var = null;
        }
        qac0.l7(tac0Var, xac0Var, 0, 6);
        String str = xac0Var.g;
        this.d.getClass();
        b.d dVar = new b.d("poster_background_selected");
        dVar.b(str, "background_id");
        dVar.e();
        ghc0.g g = C7().g();
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = this.J;
        aac0 A7 = A7();
        if (A7 != null) {
            Integer num = A7.a;
            mobileOfficialAppsConPostingStat$PosterInfo = new MobileOfficialAppsConPostingStat$PosterInfo(num != null ? num.intValue() : 0, Long.valueOf(A7.c.b));
        }
        g.getClass();
        g.d(MobileOfficialAppsConPostingStat$PosterEvent.PosterEventType.SELECT_BACKGROUND, mobileOfficialAppsConPostingStat$PosterInfo, postingMetricsCreationEntryPoint);
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdc0
    public final void hb(AttachType attachType) {
        MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType;
        int i = d.$EnumSwitchMapping$0[attachType.ordinal()];
        boolean z = this.j;
        switch (i) {
            case 1:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.PHOTO;
                break;
            case 2:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.ALBUM;
                break;
            case 3:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.ARTICLE;
                break;
            case 4:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.MARKET;
                break;
            case 5:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.DOCUMENT;
                break;
            case 6:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.MUSIC;
                break;
            case 7:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.PHOTO_VK;
                break;
            case 8:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.PLACE;
                break;
            case 9:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.SERVICE;
                break;
            case 10:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.TAKE_PHOTO;
                break;
            case 11:
                if (!z) {
                    mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.VIDEO;
                    break;
                } else {
                    mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.VIDEO_VK;
                    break;
                }
            case 12:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.POLL;
                break;
            default:
                mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.OTHER;
                break;
        }
        this.g.h(mobileOfficialAppsFeedStat$PickerType);
        if (attachType == AttachType.PLACE || scc0.n(this.s)) {
            if ((attachType == AttachType.GOOD || attachType == AttachType.SERVICE) && X4()) {
                return;
            }
            B1();
            wxu wxuVar = this.y;
            if (wxuVar == null) {
                wxuVar = null;
            }
            wxuVar.c.x7();
            wxuVar.l = false;
            if (attachType == AttachType.PHOTO_VK) {
                Q7(PickerAttachType.PhotoVk.b);
                Y7(attachType);
                return;
            }
            if (attachType == AttachType.ARTICLE) {
                Q7(PickerAttachType.Article.b);
                Y7(attachType);
                return;
            }
            if (attachType == AttachType.ALBUM) {
                Q7(PickerAttachType.Album.b);
                Y7(attachType);
                return;
            }
            if (attachType == AttachType.VIDEO && z) {
                Q7(new PickerAttachType.VideoVk(((xgc0) this.c0.getValue()).e));
                return;
            }
            PostingFragment postingFragment = this.c;
            Intent intent = new Intent(postingFragment.getContext(), (Class<?>) PostingAttachActivity.class);
            intent.putExtra("type", attachType).putExtra("currAtt", v7()).putExtra("maxAtt", this.K).putExtra("pollMaxTitleLength", this.N);
            if (attachType == AttachType.POLL) {
                intent.putExtra("ownerId", this.B0);
            }
            int i2 = ify.a;
            if (ify.e(ify.c)) {
                ify.a(new jkc0(this, intent, attachType));
            } else {
                postingFragment.startActivityForResult(intent, 32);
                Y7(attachType);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 xsna.jbc0$a, still in use, count: 2, list:
          (r2v0 xsna.jbc0$a) from 0x00a6: MOVE (r19v0 xsna.jbc0$a) = (r2v0 xsna.jbc0$a) (LINE:167)
          (r2v0 xsna.jbc0$a) from 0x0087: PHI (r2v5 xsna.jbc0$a) = (r2v0 xsna.jbc0$a), (r2v10 xsna.jbc0$a) binds: [B:30:0x0080, B:32:0x0089] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jbc0.b
    public final xsna.jbc0.a i0() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.ikc0.i0():xsna.jbc0$a");
    }

    @Override // xsna.jdc0
    public final void i1() {
        this.s.c();
    }

    @Override // xsna.qdc0
    public final void j2(boolean z) {
        this.w0 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    public final void j7(VkPaginationList<ProfileFriendItem> vkPaginationList) {
        Object obj = this.C;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        if (r0.Q4()) {
            return;
        }
        sbc0 sbc0Var = this.x;
        if (sbc0Var == null) {
            sbc0Var = null;
        }
        PostingVisibilityMode postingVisibilityMode = sbc0Var.S;
        if (postingVisibilityMode == null) {
            return;
        }
        PostingVisibilityMode postingVisibilityMode2 = PostingVisibilityMode.BEST_FRIENDS;
        if (postingVisibilityMode != postingVisibilityMode2 || vkPaginationList == null) {
            Q(postingVisibilityMode);
        } else if (!vkPaginationList.b.isEmpty()) {
            Q(postingVisibilityMode2);
        } else {
            ?? r4 = this.C;
            (r4 != 0 ? r4 : null).R6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0173  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, xsna.t68] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, xsna.t68] */
    /* JADX WARN: Type inference failed for: r3v1, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r4v3, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // xsna.qdc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ll(Target target) {
        boolean z;
        boolean z2 = target.k;
        Object obj = this.C;
        ?? r3 = obj;
        if (obj == null) {
            r3 = 0;
        }
        boolean z3 = this.j;
        if (z3) {
            sbc0 sbc0Var = this.x;
            if (sbc0Var == null) {
                sbc0Var = null;
            }
            r3.q1(fkq0.c(sbc0Var.f) ? SettingsPostingContract$Mode.Community : SettingsPostingContract$Mode.User);
        }
        r3.M5(z2);
        r3.Z4(!z2);
        boolean z4 = false;
        r3.u1(this.e0 && !(fkq0.b(this.B0) && target.k));
        X7(target);
        sbc0 sbc0Var2 = this.x;
        if (sbc0Var2 == null) {
            sbc0Var2 = null;
        }
        if (!sbc0Var2.f0) {
            boolean z5 = (z2 || this.D0) ? false : true;
            boolean z6 = hd60.a().a().e(m6r0.t) || hd60.a().a().e(m6r0.s);
            boolean z7 = this.q0 && this.v0 == null;
            if (F7()) {
                sbc0 sbc0Var3 = this.x;
                if (sbc0Var3 == null) {
                    sbc0Var3 = null;
                }
                if (!sbc0Var3.L) {
                    z = false;
                    if (!z5 || z6 || z7 || z) {
                        z4 = true;
                    }
                }
            }
            z = true;
            if (!z5) {
            }
            z4 = true;
        }
        this.P = z4;
        Owner owner = new Owner(z2 ? fkq0.a(target.c) : fkq0.e(fkq0.a(target.c)), target.d, target.f, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null);
        tac0 tac0Var = this.A;
        if (tac0Var == null) {
            tac0Var = null;
        }
        PosterBackground posterBackground = tac0Var.q;
        if (posterBackground != null && posterBackground.b == -2) {
            String j = wlb0.j(owner);
            rac0 rac0Var = tac0Var.c;
            rac0Var.ih(owner.b, rac0Var.getContext().getString(R.string.masks_author, j));
        }
        if (!z3) {
            ?? r1 = this.D;
            (r1 != null ? r1 : null).k2(this.P);
            return;
        }
        boolean z8 = this.P;
        PostingFragment postingFragment = this.c;
        if (!z8 && !this.d0) {
            sbc0 sbc0Var4 = this.x;
            if (sbc0Var4 == null) {
                sbc0Var4 = null;
            }
            if (!fkq0.c(sbc0Var4.f)) {
                if (postingFragment.c0) {
                    ?? r12 = postingFragment.f0;
                    if (r12 != 0) {
                        r12.Vc(PostingFragment.y0);
                    }
                    ViewGroup viewGroup = postingFragment.d0;
                    if (viewGroup != null) {
                        f4m.q(PostingFragment.z0, viewGroup);
                    }
                    ViewGroup viewGroup2 = postingFragment.e0;
                    if (viewGroup2 != null) {
                        f4m.q(PostingFragment.A0, viewGroup2);
                    }
                }
                Object obj2 = this.C;
                (obj2 != null ? obj2 : 0).k2(this.P);
            }
        }
        if (postingFragment.c0) {
            ?? r13 = postingFragment.f0;
            if (r13 != 0) {
                r13.Vc(PostingFragment.s0);
            }
            ViewGroup viewGroup3 = postingFragment.d0;
            if (viewGroup3 != null) {
                f4m.q(PostingFragment.t0, viewGroup3);
            }
            ViewGroup viewGroup4 = postingFragment.e0;
            if (viewGroup4 != null) {
                f4m.q(PostingFragment.u0, viewGroup4);
            }
        }
        Object obj22 = this.C;
        (obj22 != null ? obj22 : 0).k2(this.P);
    }

    @Override // xsna.qdc0
    public final void n2(Attachment attachment) {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        z84Var.D0(attachment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @Override // xsna.qdc0
    public final void n5() {
        tac0 tac0Var = this.A;
        if (tac0Var == null) {
            tac0Var = null;
        }
        xac0 xac0Var = tac0Var.k;
        Pair pair = xac0Var != null ? new Pair(xac0Var, Integer.valueOf(tac0Var.l)) : null;
        if (pair != null) {
            Object obj = this.D;
            ?? r0 = obj;
            if (obj == null) {
                r0 = 0;
            }
            r0.Ja((xac0) pair.i());
            tac0 tac0Var2 = this.A;
            if (tac0Var2 == null) {
                tac0Var2 = null;
            }
            qac0.l7(tac0Var2, (xac0) pair.i(), 0, 4);
            ?? r02 = this.D;
            (r02 != 0 ? r02 : null).ol(((Number) pair.j()).intValue(), false);
            this.X.k();
        }
    }

    @Override // xsna.qdc0
    public final boolean nb() {
        return this.J0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v7, types: [xsna.t68] */
    @Override // xsna.qdc0
    public final void nl(List<xac0> list, boolean z) {
        Object obj = this.D;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        r0.la(list);
        if (list.isEmpty() && z) {
            return;
        }
        sbc0 sbc0Var = this.x;
        if (sbc0Var == null) {
            sbc0Var = null;
        }
        if (sbc0Var.s != null || this.u.f != null) {
            n5();
            return;
        }
        Object obj2 = this.D;
        ?? r5 = obj2;
        if (obj2 == null) {
            r5 = 0;
        }
        r5.Ja(list.get(0));
        tac0 tac0Var = this.A;
        qac0.l7(tac0Var != null ? tac0Var : null, list.get(0), 1, 2);
    }

    @Override // xsna.qdc0
    public final void o() {
        this.O = true;
        if (E7()) {
            return;
        }
        this.X.B1();
        this.c.finish();
    }

    @Override // xsna.iqc0
    public final PostingVisibilityMode o0() {
        return this.k0;
    }

    @Override // xsna.qdc0
    public final boolean od() {
        return this.L0;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        NewsEntry.TrackData Cb;
        NewsEntry z7 = z7();
        String str = (z7 == null || (Cb = z7.Cb()) == null) ? null : Cb.b;
        xoc0 xoc0Var = this.g;
        xoc0Var.setTrackCode(str);
        xoc0Var.V5(z7() instanceof BoardCommentNewsEntry ? MobileOfficialAppsFeedStat$PostingContext.PostType.COMMENT_BOARD : z7() instanceof MarketCommentNewsEntry ? MobileOfficialAppsFeedStat$PostingContext.PostType.COMMENT_MARKET : Ld() != null ? MobileOfficialAppsFeedStat$PostingContext.PostType.POST_DONUT : this.D0 ? MobileOfficialAppsFeedStat$PostingContext.PostType.COMMENT : Um() != null ? MobileOfficialAppsFeedStat$PostingContext.PostType.POSTPONED : this.C0 ? MobileOfficialAppsFeedStat$PostingContext.PostType.SUGGESTED : MobileOfficialAppsFeedStat$PostingContext.PostType.REGULAR);
        xoc0Var.b6(F7());
        xoc0Var.onDestroy();
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        dispose();
        B1();
        CopyOnWriteArrayList<wjg0.a> copyOnWriteArrayList = this.a0;
        Iterator<wjg0.a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        copyOnWriteArrayList.clear();
        this.v.b.dispose();
        if (this.O) {
            sbc0 sbc0Var = this.x;
            if (sbc0Var == null) {
                sbc0Var = null;
            }
            boolean z = sbc0Var.U;
            jbc0 jbc0Var = this.e;
            if (z) {
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ghc0.f a2 = C7().a();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = this.J;
                a2.getClass();
                a2.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLOSE_POSTING_FROM_PLUS, postingMetricsCreationEntryPoint);
                return;
            }
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
            ghc0.f a3 = C7().a();
            PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint2 = this.J;
            a3.getClass();
            a3.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLOSE, postingMetricsCreationEntryPoint2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01af, code lost:
    
        if (r1.isFinishing() != true) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    @Override // xsna.cc6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPause() {
        boolean z;
        boolean z2;
        boolean z3;
        CropsForRatio cropsForRatio;
        PostingFragment postingFragment;
        boolean z4;
        Object obj = this.D;
        ?? r1 = obj;
        if (obj == null) {
            r1 = 0;
        }
        r1.mj();
        tac0 tac0Var = this.A;
        if (tac0Var == null) {
            tac0Var = null;
        }
        rac0 rac0Var = tac0Var.c;
        ArrayList<hng0> arrayList = gng0.d;
        arrayList.remove(rac0Var);
        gng0 gng0Var = gng0.b;
        if (gng0.e.size() + arrayList.size() == 0) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            Object systemService = context.getSystemService("sensor");
            SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
            if (sensorManager != null) {
                sensorManager.unregisterListener(gng0Var);
            }
            gng0.c.g = false;
        }
        lko0 lko0Var = this.z;
        if (lko0Var == null) {
            lko0Var = null;
        }
        if (lko0Var.f) {
            lko0Var.f = false;
            q420 q420Var = lko0Var.l;
            if (q420Var == null) {
                q420Var = null;
            }
            q420Var.e(false);
        }
        tac0 tac0Var2 = this.A;
        if (tac0Var2 == null) {
            tac0Var2 = null;
        }
        if (tac0Var2.s) {
            tac0Var2.s = false;
            q420 q420Var2 = tac0Var2.d;
            if (q420Var2 == null) {
                q420Var2 = null;
            }
            q420Var2.e(false);
        }
        if (!H7() || this.L) {
            return;
        }
        qec0 qec0Var = this.u;
        long j = qec0Var.e;
        ikc0 ikc0Var = qec0Var.a;
        if (j != 0 && ikc0Var.X.getText().length() <= 0 && ikc0Var.x7() <= 0 && ikc0Var.Um() == null) {
            sec0.a(j);
            return;
        }
        if (ikc0Var.X.getText().length() <= 0 && ikc0Var.x7() <= 0 && ikc0Var.Um() == null) {
            return;
        }
        if (this.h0 || this.i0) {
            bfc0 bfc0Var = sec0.a;
            long j2 = qec0Var.e;
            UserId userId = qec0Var.c;
            Date date = new Date();
            String d2 = ikc0Var.X.d();
            List<Attachment> u = ikc0Var.u();
            GeoAttachment y7 = ikc0Var.y7();
            String str = ikc0Var.r0;
            aac0 A7 = ikc0Var.A7();
            Integer num = A7 != null ? A7.a : null;
            aac0 A72 = ikc0Var.A7();
            UserId userId2 = A72 != null ? A72.c : null;
            aac0 A73 = ikc0Var.A7();
            String str2 = A73 != null ? A73.b : null;
            aac0 A74 = ikc0Var.A7();
            Integer valueOf = A74 != null ? Integer.valueOf(A74.d) : null;
            Target D7 = ikc0Var.D7();
            Date Um = ikc0Var.Um();
            boolean z5 = ikc0Var.l0;
            boolean z6 = ikc0Var.m0;
            PostingVisibilityMode postingVisibilityMode = ikc0Var.k0;
            boolean z7 = ikc0Var.u0;
            boolean z8 = ikc0Var.n0;
            boolean z9 = ikc0Var.o0;
            Integer Ld = ikc0Var.Ld();
            Boolean valueOf2 = Boolean.valueOf(ikc0Var.Pe().b);
            PostingOrd postingOrd = ikc0Var.p0;
            z84 z84Var = ikc0Var.B;
            if (z84Var == null) {
                z84Var = null;
            }
            lu9 lu9Var = z84Var.p;
            if (lu9Var != null) {
                k5d0 k5d0Var = lu9Var.e;
                z = z8;
                if (k5d0Var != null) {
                    z2 = z7;
                    PreviewRatio previewRatio = k5d0Var.a.get(k5d0Var.b);
                    ArrayList arrayList2 = (ArrayList) lu9Var.f.a;
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    z3 = z6;
                    cropsForRatio = new CropsForRatio(previewRatio, arrayList2, null, lu9Var.m);
                    lec0 lec0Var = new lec0(j2, userId, date, d2, u, y7, str, num, userId2, str2, valueOf, D7, Um, z5, z3, postingVisibilityMode, z2, z, z9, Ld, valueOf2, postingOrd, cropsForRatio);
                    postingFragment = this.c;
                    if (postingFragment.g0) {
                        z4 = true;
                        if (!postingFragment.isRemoving()) {
                            FragmentActivity activity = postingFragment.getActivity();
                            if (activity != null) {
                            }
                            z4 = false;
                        }
                    } else {
                        FragmentActivity activity2 = postingFragment.getActivity();
                        if (activity2 != null) {
                            z4 = activity2.isFinishing();
                        }
                        z4 = false;
                    }
                    UserId b2 = t11.b();
                    bfc0 bfc0Var2 = sec0.a;
                    long j3 = b2.b;
                    bfc0Var2.getClass();
                    io.reactivex.rxjava3.internal.operators.single.l h = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new yec0(bfc0Var2, j3)), new nb(new lh(22, b2, lec0Var), 29)).m(io.reactivex.rxjava3.android.schedulers.a.b()).q(asu0.a.c()), new xj50(new rec0(z4), 7)).h(new nex(new ulz(14), 15));
                    le50 le50Var = new le50(this, 9);
                    int i = kwg0.a;
                    h.subscribe(le50Var, new iwg0());
                }
            } else {
                z = z8;
            }
            z2 = z7;
            z3 = z6;
            cropsForRatio = null;
            lec0 lec0Var2 = new lec0(j2, userId, date, d2, u, y7, str, num, userId2, str2, valueOf, D7, Um, z5, z3, postingVisibilityMode, z2, z, z9, Ld, valueOf2, postingOrd, cropsForRatio);
            postingFragment = this.c;
            if (postingFragment.g0) {
            }
            UserId b22 = t11.b();
            bfc0 bfc0Var22 = sec0.a;
            long j32 = b22.b;
            bfc0Var22.getClass();
            io.reactivex.rxjava3.internal.operators.single.l h2 = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new yec0(bfc0Var22, j32)), new nb(new lh(22, b22, lec0Var2), 29)).m(io.reactivex.rxjava3.android.schedulers.a.b()).q(asu0.a.c()), new xj50(new rec0(z4), 7)).h(new nex(new ulz(14), 15));
            le50 le50Var2 = new le50(this, 9);
            int i2 = kwg0.a;
            h2.subscribe(le50Var2, new iwg0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    @Override // xsna.cc6
    public final void onResume() {
        Object obj = this.C;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        r0.n4();
        Object obj2 = this.D;
        ?? r02 = obj2;
        if (obj2 == null) {
            r02 = 0;
        }
        r02.onResume();
        lko0 lko0Var = this.z;
        if (lko0Var == null) {
            lko0Var = null;
        }
        if (!lko0Var.f) {
            lko0Var.f = true;
            q420 q420Var = lko0Var.l;
            if (q420Var == null) {
                q420Var = null;
            }
            q420Var.e(true);
        }
        tac0 tac0Var = this.A;
        if (tac0Var == null) {
            tac0Var = null;
        }
        if (!tac0Var.s) {
            tac0Var.s = true;
            q420 q420Var2 = tac0Var.d;
            if (q420Var2 == null) {
                q420Var2 = null;
            }
            q420Var2.e(true);
        }
        this.O = false;
        bfc0 bfc0Var = sec0.a;
        long j = t11.b().b;
        bfc0Var.getClass();
        io.reactivex.rxjava3.internal.operators.single.b0 m = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.v(new yec0(bfc0Var, j)), new n240(new y8m(25), 11)).m(io.reactivex.rxjava3.android.schedulers.a.b());
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.single.b0 m2 = m.q(asu0Var.c()).h(new m3y(new u620(16), 14)).q(asu0Var.c()).m(io.reactivex.rxjava3.android.schedulers.a.b());
        s520 s520Var = new s520(new w620(this, 19), 10);
        int i = kwg0.a;
        this.c.eo(m2.subscribe(s520Var, new iwg0()));
        tac0 tac0Var2 = this.A;
        if (tac0Var2 == null) {
            tac0Var2 = null;
        }
        rac0 rac0Var = tac0Var2.c;
        ArrayList<hng0> arrayList = gng0.d;
        arrayList.add(rac0Var);
        gng0 gng0Var = gng0.b;
        if (gng0.e.size() + arrayList.size() == 1) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            try {
                Object systemService = context.getSystemService("sensor");
                SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                if (sensorManager != null) {
                    sensorManager.registerListener(gng0Var, sensorManager.getDefaultSensor(15), 1);
                }
                gng0.c.f = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
            } catch (Exception e2) {
                L.i(e2);
            }
        }
    }

    @Override // xsna.qdc0
    public final void q0() {
        S7(null);
    }

    @Override // xsna.qdc0
    public final void qh() {
        T7(false);
        this.d.getClass();
        new b.d("poster_auto_disable").e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qdc0
    public final void s3(AttachmentType attachmentType) {
        Object obj;
        Iterator<T> it = u().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof f010) {
                    break;
                }
            }
        }
        if (!(obj instanceof f010)) {
            obj = null;
        }
        f010 f010Var = (f010) obj;
        if ((f010Var != 0 ? f010Var.E9() : null) != attachmentType) {
            Attachment attachment = f010Var instanceof Attachment ? (Attachment) f010Var : null;
            if (attachment != null) {
                n2(attachment);
            }
            scc0 scc0Var = this.s;
            scc0Var.getClass();
            int i = scc0.a.$EnumSwitchMapping$0[attachmentType.ordinal()];
            if (i == 1) {
                scc0Var.f();
            } else if (i == 2) {
                scc0Var.c();
            } else {
                if (i != 3) {
                    return;
                }
                scc0Var.e();
            }
        }
    }

    @Override // xsna.f420
    public final void s5(Attachment attachment) {
        this.s.a(attachment);
    }

    @Override // xsna.qdc0
    public final List<Attachment> u() {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        return z84Var.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        if (r0.g != false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u7() {
        PostingOrd postingOrd;
        if (this.j) {
            boolean z = true;
            if (!this.l0 && !this.m0 && !this.n0 && !this.o0 && Um() == null) {
                if (this.Y) {
                    sbc0 sbc0Var = this.x;
                    if (sbc0Var == null) {
                        sbc0Var = null;
                    }
                }
                String str = this.r0;
                if ((str == null || !myc0.f(str)) && ((postingOrd = this.p0) == null || !postingOrd.b)) {
                    z = false;
                }
            }
            Object obj = this.C;
            (obj != 0 ? obj : null).L6(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qdc0
    public final void ue(boolean z) {
        this.u0 = z;
        if (z) {
            Object obj = this.C;
            (obj != 0 ? obj : null).P5();
        } else {
            Object obj2 = this.C;
            (obj2 != 0 ? obj2 : null).v1();
        }
        this.i0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    @Override // xsna.f420
    public final void v5(Throwable th) {
        Object obj = this.D;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        r0.f2(false);
        this.t.a(th);
        ?? r4 = this.D;
        (r4 != 0 ? r4 : null).zl();
    }

    public final int v7() {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        return ((ArrayList) z84Var.u()).size() - (z84Var.c.o ? 1 : 0);
    }

    @Override // xsna.qdc0
    public final void w() {
        this.X.w();
    }

    public final ArrayList w7(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (drm0.D((String) next, str, true)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // xsna.qdc0
    public final boolean wh() {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        ArrayList arrayList = (ArrayList) z84Var.u();
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Attachment) it.next()) instanceof PollAttachment) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.qdc0
    public final void wj(c84 c84Var) {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        z84Var.q.remove(c84Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // xsna.l420
    public final void x0(String str) {
        if (this.I) {
            return;
        }
        this.H = true;
        Object obj = this.C;
        ?? r0 = obj;
        if (obj == null) {
            r0 = 0;
        }
        r0.k2(false);
        Object obj2 = this.D;
        ?? r02 = obj2;
        if (obj2 == null) {
            r02 = 0;
        }
        r02.wk();
        g420 g420Var = this.E;
        (g420Var != null ? g420Var : null).j(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // xsna.f420
    public final void x4(boolean z) {
        if (z) {
            Object obj = this.D;
            ?? r2 = obj;
            if (obj == null) {
                r2 = 0;
            }
            r2.Th();
        } else {
            Object obj2 = this.D;
            ?? r22 = obj2;
            if (obj2 == null) {
                r22 = 0;
            }
            r22.zl();
        }
        ?? r23 = this.D;
        (r23 != 0 ? r23 : null).f2(false);
    }

    public final int x7() {
        z84 z84Var = this.B;
        if (z84Var == null) {
            z84Var = null;
        }
        return z84Var.Z();
    }

    @Override // xsna.qdc0
    public final void y0() {
        Context context = this.c.getContext();
        if (context == null) {
            return;
        }
        this.v.a(context, this.r0);
        C7().x().j(this.J);
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        this.e.g();
    }

    public final GeoAttachment y7() {
        Object obj;
        Iterator<T> it = u().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Attachment) obj) instanceof GeoAttachment) {
                break;
            }
        }
        if (obj instanceof GeoAttachment) {
            return (GeoAttachment) obj;
        }
        return null;
    }

    @Override // xsna.qdc0
    public final boolean yd() {
        return this.D0;
    }

    public final NewsEntry z7() {
        sbc0 sbc0Var = this.x;
        if (sbc0Var == null) {
            sbc0Var = null;
        }
        return sbc0Var.q;
    }

    /* compiled from: PostingPresenter.kt */
    public interface a {
        void a();

        default Integer b() {
            return null;
        }

        default UserId c() {
            return UserId.d;
        }

        String d();

        CharSequence getText();

        default void B1() {
        }

        default void k() {
        }

        default void w() {
        }

        default void W2(String str) {
        }

        default void Q(UserId userId, String str, boolean z) {
        }
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }

    /* compiled from: PostingPresenter.kt */
    public static final class e implements ify.a {
        public final /* synthetic */ l860 b;
        public final /* synthetic */ ikc0 c;

        public e(l860 l860Var, ikc0 ikc0Var) {
            this.b = l860Var;
            this.c = ikc0Var;
        }

        @Override // xsna.ify.a
        public final void Y0() {
            int i = ify.a;
            ify.g(this);
            this.b.g(50, this.c.c);
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
        }
    }
}
