package xsna;

import android.content.Context;
import com.google.zxing.pdf417.PDF417Common;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.o0r0;
import xsna.oap;

/* compiled from: SearchAuthorCellDelegate.kt */
/* loaded from: classes16.dex */
public final class cnh0 {
    public final q3a a;
    public final b5a b;
    public final CatalogConfiguration c;
    public final nda d;
    public final SearchStatInfoProvider e;
    public final NotificationsPermission f;
    public final mcc0 g;
    public final g7s0 h;
    public final o0r0 i;
    public final b25 j;
    public final boolean k;
    public final boolean l = BuildInfo.q();
    public UIBlockSearchAuthor m;
    public io.reactivex.rxjava3.disposables.c n;
    public final com.vk.catalog2.common.ui.holders.c o;

    /* compiled from: SearchAuthorCellDelegate.kt */
    public static abstract class a {

        /* compiled from: SearchAuthorCellDelegate.kt */
        /* renamed from: xsna.cnh0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2670a extends a {

            /* compiled from: SearchAuthorCellDelegate.kt */
            /* renamed from: xsna.cnh0$a$a$a, reason: collision with other inner class name */
            public static final class C2671a extends AbstractC2670a {
                public static final C2671a a = new C2671a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2671a);
                }

                public final int hashCode() {
                    return -1012878462;
                }

                public final String toString() {
                    return "Empty";
                }
            }

            /* compiled from: SearchAuthorCellDelegate.kt */
            /* renamed from: xsna.cnh0$a$a$b */
            public static final class b extends AbstractC2670a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1980584130;
                }

                public final String toString() {
                    return "NotSubscribed";
                }
            }

            /* compiled from: SearchAuthorCellDelegate.kt */
            /* renamed from: xsna.cnh0$a$a$c */
            public static final class c extends AbstractC2670a {
                public final baf0 a;

                public c(baf0 baf0Var) {
                    this.a = baf0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Subscribed(icon=" + this.a + ')';
                }
            }
        }

        /* compiled from: SearchAuthorCellDelegate.kt */
        public static abstract class b extends a {

            /* compiled from: SearchAuthorCellDelegate.kt */
            /* renamed from: xsna.cnh0$a$b$a, reason: collision with other inner class name */
            public static final class C2672a extends b {
                public static final C2672a a = new C2672a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2672a);
                }

                public final int hashCode() {
                    return 870795209;
                }

                public final String toString() {
                    return "Empty";
                }
            }

            /* compiled from: SearchAuthorCellDelegate.kt */
            /* renamed from: xsna.cnh0$a$b$b, reason: collision with other inner class name */
            public static final class C2673b extends b {
                public static final C2673b a = new C2673b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2673b);
                }

                public final int hashCode() {
                    return 1276048568;
                }

                public final String toString() {
                    return "Loading";
                }
            }

            /* compiled from: SearchAuthorCellDelegate.kt */
            public static final class c extends b {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -277172727;
                }

                public final String toString() {
                    return "NotSubscribed";
                }
            }

            /* compiled from: SearchAuthorCellDelegate.kt */
            public static final class d extends b {
                public static final d a = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return 1599907494;
                }

                public final String toString() {
                    return "RecentlySubscribed";
                }
            }

            /* compiled from: SearchAuthorCellDelegate.kt */
            public static final class e extends b {
                public final boolean a;

                public e(boolean z) {
                    this.a = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && this.a == ((e) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("Subscribed(canMessage="), this.a, ')');
                }
            }
        }
    }

    /* compiled from: SearchAuthorCellDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UIBlockSearchAuthor.AuthorType.values().length];
            try {
                iArr[UIBlockSearchAuthor.AuthorType.Clips.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIBlockSearchAuthor.AuthorType.Videos.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SearchAuthorCellDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<SearchAuthorAnalyticsInfo.ClickTarget, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(SearchAuthorAnalyticsInfo.ClickTarget clickTarget) {
            SearchAuthorAnalyticsInfo.ClickTarget clickTarget2 = clickTarget;
            cnh0 cnh0Var = (cnh0) this.receiver;
            UIBlockSearchAuthor uIBlockSearchAuthor = cnh0Var.m;
            if (uIBlockSearchAuthor != null) {
                cnh0Var.f(uIBlockSearchAuthor, clickTarget2);
            }
            return s3q0.a;
        }
    }

    public cnh0(q3a q3aVar, b5a b5aVar, CatalogConfiguration catalogConfiguration, nda ndaVar, SearchStatInfoProvider searchStatInfoProvider, NotificationsPermission notificationsPermission, mcc0 mcc0Var, g7s0 g7s0Var, o0r0 o0r0Var, b25 b25Var) {
        this.a = q3aVar;
        this.b = b5aVar;
        this.c = catalogConfiguration;
        this.d = ndaVar;
        this.e = searchStatInfoProvider;
        this.f = notificationsPermission;
        this.g = mcc0Var;
        this.h = g7s0Var;
        this.i = o0r0Var;
        this.j = b25Var;
        this.k = g7s0Var.J().N1();
        this.o = new com.vk.catalog2.common.ui.holders.c(q3aVar, mcc0Var, new c(1, this, cnh0.class, "clickTracker", "clickTracker(Lcom/vk/catalog2/common/ui/core/analytics/tracking/SearchAuthorAnalyticsInfo$ClickTarget;)V", 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UserId a(oap oapVar, boolean z) {
        if (oapVar instanceof oap.b) {
            UserId userId = ((Group) ((oap.b) oapVar).a).c;
            return z ? fkq0.e(userId) : userId;
        }
        if (oapVar instanceof oap.a) {
            return ((UserProfile) ((oap.a) oapVar).a).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(oap oapVar) {
        if (oapVar instanceof oap.b) {
            Group group = (Group) ((oap.b) oapVar).a;
            return group.j || group.C == 4;
        }
        if (oapVar instanceof oap.a) {
            return ((UserProfile) ((oap.a) oapVar).a).M();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void c(Context context, UIBlockSearchAuthor uIBlockSearchAuthor, boolean z) {
        Group b2 = uIBlockSearchAuthor.y.b();
        if (b2 == null) {
            return;
        }
        if (z) {
            this.o.b(context, b2, this.f, null);
        } else {
            f(uIBlockSearchAuthor, SearchAuthorAnalyticsInfo.ClickTarget.Subscribe);
            e(false, context, uIBlockSearchAuthor, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Context context, UIBlockSearchAuthor uIBlockSearchAuthor, boolean z) {
        UserId userId;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto;
        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
        if (oapVar instanceof oap.b) {
            userId = fkq0.e(((Group) ((oap.b) oapVar).a).c);
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            userId = ((UserProfile) ((oap.a) oapVar).a).c;
        }
        f(uIBlockSearchAuthor, SearchAuthorAnalyticsInfo.ClickTarget.Open);
        SearchStatInfoProvider searchStatInfoProvider = this.e;
        if (searchStatInfoProvider != null) {
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
            String str = uIBlockSearchAuthor.D;
            if (str == null) {
                str = "";
            }
            searchStatsLoggingInfo = searchStatInfoProvider.b(type, str, false);
        } else {
            searchStatsLoggingInfo = null;
        }
        SearchStatsLoggingInfo searchStatsLoggingInfo2 = searchStatsLoggingInfo;
        if (z) {
            Group b2 = oapVar.b();
            boolean z2 = b2 != null && this.k && (groupsVideoLivesDataDto = b2.x0) != null && groupsVideoLivesDataDto.e();
            Long valueOf = Long.valueOf(uIBlockSearchAuthor.g.b);
            String str2 = uIBlockSearchAuthor.b;
            UiTracker uiTracker = UiTracker.a;
            new ejc(z2, valueOf, str2, UiTracker.c(), null, 16).q();
        }
        int i = b.$EnumSwitchMapping$0[uIBlockSearchAuthor.z.ordinal()];
        o0r0 o0r0Var = this.i;
        if (i == 1) {
            o0r0Var.m(context, userId, new o0r0.a(false, null, null, null, searchStatsLoggingInfo2, null, null, false, false, true, false, null, null, null, 64495));
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string = context.getString(R.string.videos);
        String str3 = uIBlockSearchAuthor.B;
        if (BuildInfo.q()) {
            o0r0Var.m(context, userId, new o0r0.a(false, uIBlockSearchAuthor.f, uIBlockSearchAuthor.D, null, searchStatsLoggingInfo2, null, null, false, false, false, false, null, null, null, 65513));
        } else if (str3 != null) {
            nda.e(this.d, context, this.c, str3, string, null, searchStatsLoggingInfo2, null, PsExtractor.AUDIO_STREAM);
        } else {
            ydt0.y(this.h.Y(), context, userId, null, string, uIBlockSearchAuthor.D, searchStatsLoggingInfo2, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE);
        }
    }

    public final void e(boolean z, Context context, UIBlockSearchAuthor uIBlockSearchAuthor, boolean z2) {
        MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source source;
        if (j8.d(context)) {
            return;
        }
        int i = b.$EnumSwitchMapping$0[uIBlockSearchAuthor.z.ordinal()];
        if (i == 1) {
            source = MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source.CLIPS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source = MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source.VIDEO_SEARCH_AUTHOR;
        }
        String lowerCase = source.name().toLowerCase(Locale.ROOT);
        if (z) {
            f(uIBlockSearchAuthor, SearchAuthorAnalyticsInfo.ClickTarget.Unsubscribe);
        } else {
            f(uIBlockSearchAuthor, SearchAuthorAnalyticsInfo.ClickTarget.Subscribe);
        }
        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
        boolean b2 = b(oapVar);
        UserId a2 = a(oapVar, false);
        CatalogProfileLocalState.FollowSource followSource = uIBlockSearchAuthor.C.b;
        g(a2, CatalogProfileLocalState.FollowSource.InternalPending, z2);
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c subscribe = o0r0.i(xwk.e(), a(oapVar, true), b2, null, false, lowerCase, 100).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ueh(new x620(21), 2), new lav(new zmh0(this, a2, followSource, z2), 27));
        this.g.a(subscribe);
        this.n = subscribe;
    }

    public final void f(UIBlockSearchAuthor uIBlockSearchAuthor, SearchAuthorAnalyticsInfo.ClickTarget clickTarget) {
        this.b.a(new cfp0(uIBlockSearchAuthor, new SearchAuthorAnalyticsInfo(clickTarget)));
    }

    public final void g(final UserId userId, final CatalogProfileLocalState.FollowSource followSource, final boolean z) {
        this.a.b(new buz(12, new n9w(22), new wzs() { // from class: xsna.anh0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                UIBlockList uIBlockList = (UIBlockList) obj;
                final cnh0 cnh0Var = cnh0.this;
                final UserId userId2 = userId;
                final CatalogProfileLocalState.FollowSource followSource2 = followSource;
                final boolean z2 = z;
                wzs wzsVar = new wzs(cnh0Var, userId2, followSource2, z2) { // from class: xsna.bnh0
                    public final /* synthetic */ UserId b;
                    public final /* synthetic */ CatalogProfileLocalState.FollowSource c;
                    public final /* synthetic */ boolean d;

                    {
                        this.b = userId2;
                        this.c = followSource2;
                        this.d = z2;
                    }

                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        Group b2;
                        UIBlock uIBlock = (UIBlock) obj4;
                        if (!(uIBlock instanceof UIBlockSearchAuthor)) {
                            return s3q0.a;
                        }
                        UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
                        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
                        if (this.b.equals(cnh0.a(oapVar, false))) {
                            uIBlockSearchAuthor.C.b = this.c;
                            if (this.d && (b2 = oapVar.b()) != null) {
                                b2.k0 = VideoNotificationsStatus.PREFERRED.i();
                            }
                        }
                        return s3q0.a;
                    }
                };
                for (UIBlock uIBlock : uIBlockList.y) {
                    wzsVar.invoke(uIBlockList, uIBlock);
                    if (uIBlock instanceof UIBlockList) {
                        UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
                        for (UIBlock uIBlock2 : uIBlockList2.y) {
                            wzsVar.invoke(uIBlockList2, uIBlock2);
                            if (uIBlock2 instanceof UIBlockList) {
                                UIBlockList uIBlockList3 = (UIBlockList) uIBlock2;
                                for (UIBlock uIBlock3 : uIBlockList3.y) {
                                    wzsVar.invoke(uIBlockList3, uIBlock3);
                                    if (uIBlock3 instanceof UIBlockList) {
                                        o19.w((UIBlockList) uIBlock3, wzsVar);
                                    }
                                }
                            }
                        }
                    }
                }
                return uIBlockList;
            }
        }), false);
    }
}
