package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistViewItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDomainEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioModal;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPopupItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioRestrictionPopup;
import com.vk.stat.scheme.CommonCatalogStat$TypeCatalogItemView;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesTrustMarksView;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityOnboardingView;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityReviewView;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutBanner;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabItemView;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketCommunityReviewView;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemReviewView;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenStoryItemView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenStoryView;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAliexpressView;
import com.vk.stat.scheme.SchemeStat$TypeChannelItem;
import com.vk.stat.scheme.SchemeStat$TypeFeedItem;
import com.vk.stat.scheme.SchemeStat$TypeGameCatalogItem;
import com.vk.stat.scheme.SchemeStat$TypeSuperappWidgetItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UiItemViewed.kt */
/* loaded from: classes17.dex */
public abstract class hzp0 {
    public final MobileOfficialAppsCoreNavStat$EventScreen a;
    public final SchemeStat$EventItem b;
    public Integer c;
    public long d;
    public long e;
    public final boolean f;

    /* compiled from: UiItemViewed.kt */
    public static final class a extends hzp0 {
        public final SchemeStat$TypeAliexpressView g;

        public a(SchemeStat$EventItem schemeStat$EventItem, int i, SchemeStat$TypeAliexpressView schemeStat$TypeAliexpressView) {
            super(schemeStat$EventItem, i);
            this.g = schemeStat$TypeAliexpressView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class a0 extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class b extends hzp0 {
        public final CommonAudioStat$TypeAudioArtistViewItem g;

        public b(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonAudioStat$TypeAudioArtistViewItem commonAudioStat$TypeAudioArtistViewItem, int i) {
            super(schemeStat$EventItem, i, mobileOfficialAppsCoreNavStat$EventScreen);
            this.g = commonAudioStat$TypeAudioArtistViewItem;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class b0 extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class c extends hzp0 {
        public final CommonAudioStat$TypeAudioPopupItem g;

        public c(SchemeStat$EventItem schemeStat$EventItem, CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem) {
            super(schemeStat$EventItem);
            this.g = commonAudioStat$TypeAudioPopupItem;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class c0 extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class d extends hzp0 {
        public final CommonCatalogStat$TypeCatalogItemView g;

        public d(SchemeStat$EventItem schemeStat$EventItem, CommonCatalogStat$TypeCatalogItemView commonCatalogStat$TypeCatalogItemView, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i) {
            super(schemeStat$EventItem, i, mobileOfficialAppsCoreNavStat$EventScreen);
            this.g = commonCatalogStat$TypeCatalogItemView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class d0 extends hzp0 {
        public final CommonAudioStat$TypeAudioDomainEventItem g;

        public d0(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem) {
            super(mobileOfficialAppsCoreNavStat$EventScreen, schemeStat$EventItem);
            this.g = commonAudioStat$TypeAudioDomainEventItem;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class e extends hzp0 {
        public final SchemeStat$TypeChannelItem g;

        public e(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeChannelItem schemeStat$TypeChannelItem, int i) {
            super(schemeStat$EventItem, i, mobileOfficialAppsCoreNavStat$EventScreen);
            this.g = schemeStat$TypeChannelItem;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class e0 extends hzp0 {
        public final CommonAudioStat$TypeAudioModal g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(SchemeStat$EventItem schemeStat$EventItem, CommonAudioStat$TypeAudioModal commonAudioStat$TypeAudioModal) {
            super(UiTracker.c(), schemeStat$EventItem);
            UiTracker uiTracker = UiTracker.a;
            this.g = commonAudioStat$TypeAudioModal;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class f extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class f0 extends hzp0 {
        public final CommonAudioStat$TypeAudioRestrictionPopup g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(SchemeStat$EventItem schemeStat$EventItem, CommonAudioStat$TypeAudioRestrictionPopup commonAudioStat$TypeAudioRestrictionPopup) {
            super(UiTracker.c(), schemeStat$EventItem);
            UiTracker uiTracker = UiTracker.a;
            this.g = commonAudioStat$TypeAudioRestrictionPopup;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class g extends hzp0 {
        public final CommonCommunitiesStat$TypeTabItemView g;

        public g(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonCommunitiesStat$TypeTabItemView commonCommunitiesStat$TypeTabItemView, int i) {
            super(schemeStat$EventItem, i, mobileOfficialAppsCoreNavStat$EventScreen);
            this.g = commonCommunitiesStat$TypeTabItemView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class g0 extends hzp0 {
        public final MobileOfficialAppsMarketStat$TypeMarketView g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g0(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView mobileOfficialAppsMarketStat$TypeMarketView, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            super(mobileOfficialAppsCoreNavStat$EventScreen, schemeStat$EventItem);
            if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
                UiTracker uiTracker = UiTracker.a;
                mobileOfficialAppsCoreNavStat$EventScreen = UiTracker.c();
            }
            this.g = mobileOfficialAppsMarketStat$TypeMarketView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class h extends hzp0 {
        public final CommonCommunitiesStat$TypeDonutBanner g;

        public h(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner) {
            super(schemeStat$EventItem, 0, mobileOfficialAppsCoreNavStat$EventScreen);
            this.g = commonCommunitiesStat$TypeDonutBanner;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class h0 extends hzp0 {
        public final MobileOfficialAppsMarketStat$TypeMarketView g;

        public h0(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView mobileOfficialAppsMarketStat$TypeMarketView) {
            super(schemeStat$EventItem, 0);
            this.g = mobileOfficialAppsMarketStat$TypeMarketView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class i extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class i0 extends hzp0 {
        public final SchemeStat$TypeFeedItem g;

        public i0(SchemeStat$EventItem schemeStat$EventItem, int i, boolean z, long j, long j2, SchemeStat$TypeFeedItem schemeStat$TypeFeedItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            super(schemeStat$EventItem, i, z, j, j2, mobileOfficialAppsCoreNavStat$EventScreen);
            this.g = schemeStat$TypeFeedItem;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class j extends hzp0 {
        public final CommonCommunitiesStat$TypeCommunityReviewView g;

        public j(SchemeStat$EventItem schemeStat$EventItem, CommonCommunitiesStat$TypeCommunityReviewView commonCommunitiesStat$TypeCommunityReviewView) {
            super(schemeStat$EventItem);
            this.g = commonCommunitiesStat$TypeCommunityReviewView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class j0 extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class k extends hzp0 {
        public final CommonCommunitiesStat$TypeCommunitiesTrustMarksView g;

        public k(SchemeStat$EventItem schemeStat$EventItem, CommonCommunitiesStat$TypeCommunitiesTrustMarksView commonCommunitiesStat$TypeCommunitiesTrustMarksView) {
            super(schemeStat$EventItem);
            this.g = commonCommunitiesStat$TypeCommunitiesTrustMarksView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class k0 extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class l extends hzp0 {
        public final com.vk.stat.scheme.f0 g;

        public l(SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, com.vk.stat.scheme.f0 f0Var, int i) {
            super(schemeStat$EventItem, i, mobileOfficialAppsCoreNavStat$EventScreen);
            this.g = f0Var;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class l0 extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class m {
        public static n a(SchemeStat$EventItem schemeStat$EventItem, int i, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
                UiTracker uiTracker = UiTracker.a;
                mobileOfficialAppsCoreNavStat$EventScreen = UiTracker.c();
            }
            n nVar = new n(mobileOfficialAppsCoreNavStat$EventScreen, schemeStat$EventItem);
            nVar.d = 0L;
            nVar.e = 0L;
            nVar.c = Integer.valueOf(i);
            return nVar;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class m0 extends hzp0 {
        public SchemeStat$TypeSuperappWidgetItem g;
    }

    /* compiled from: UiItemViewed.kt */
    public static final class n extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class n0 extends hzp0 {
        public final CommonMarketStat$TypeMarketCommunityReviewView g;

        public n0(SchemeStat$EventItem schemeStat$EventItem, CommonMarketStat$TypeMarketCommunityReviewView commonMarketStat$TypeMarketCommunityReviewView) {
            super(schemeStat$EventItem);
            this.g = commonMarketStat$TypeMarketCommunityReviewView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class o extends hzp0 {
        public final MobileOfficialAppsFeedStat$TypeDzenStoryItemView g;

        public o(SchemeStat$EventItem schemeStat$EventItem, int i, MobileOfficialAppsFeedStat$TypeDzenStoryItemView mobileOfficialAppsFeedStat$TypeDzenStoryItemView) {
            super(schemeStat$EventItem, i);
            this.g = mobileOfficialAppsFeedStat$TypeDzenStoryItemView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class o0 extends hzp0 {
        public final SchemeStat$TypeView.b g;

        public o0(SchemeStat$EventItem schemeStat$EventItem, int i, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent) {
            super(schemeStat$EventItem, i, mobileOfficialAppsCoreNavStat$EventScreen);
            this.g = commonVideoStat$TypeVideoCardEvent;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class p extends hzp0 {
        public final MobileOfficialAppsFeedStat$TypeDzenStoryView g;

        public p(SchemeStat$EventItem schemeStat$EventItem, int i, MobileOfficialAppsFeedStat$TypeDzenStoryView mobileOfficialAppsFeedStat$TypeDzenStoryView) {
            super(schemeStat$EventItem, i);
            this.g = mobileOfficialAppsFeedStat$TypeDzenStoryView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class q extends hzp0 {
        public final SchemeStat$TypeView.b g;

        public q(SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeView.b bVar) {
            super(schemeStat$EventItem, 0);
            this.g = bVar;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class r extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class s extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class t extends hzp0 {
        public final com.vk.stat.scheme.c0 g;

        public t(SchemeStat$EventItem schemeStat$EventItem, int i, com.vk.stat.scheme.c0 c0Var) {
            super(schemeStat$EventItem, i);
            this.g = c0Var;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class u extends hzp0 {
        public final SchemeStat$TypeGameCatalogItem g;

        public u(SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem) {
            super(schemeStat$EventItem);
            this.g = schemeStat$TypeGameCatalogItem;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class v extends hzp0 {
        public final CommonCommunitiesStat$TypeCommunityOnboardingView g;

        public v(SchemeStat$EventItem schemeStat$EventItem, CommonCommunitiesStat$TypeCommunityOnboardingView commonCommunitiesStat$TypeCommunityOnboardingView) {
            super(schemeStat$EventItem);
            this.g = commonCommunitiesStat$TypeCommunityOnboardingView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class w extends hzp0 {
        public final CommonVasStat$TypeIvasItemViews g;

        public w(SchemeStat$EventItem schemeStat$EventItem, CommonVasStat$TypeIvasItemViews commonVasStat$TypeIvasItemViews) {
            super(schemeStat$EventItem);
            this.g = commonVasStat$TypeIvasItemViews;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class x extends hzp0 {
    }

    /* compiled from: UiItemViewed.kt */
    public static final class y extends hzp0 {
        public final CommonMarketStat$TypeMarketItemReviewView g;

        public y(SchemeStat$EventItem schemeStat$EventItem, CommonMarketStat$TypeMarketItemReviewView commonMarketStat$TypeMarketItemReviewView) {
            super(schemeStat$EventItem);
            this.g = commonMarketStat$TypeMarketItemReviewView;
        }
    }

    /* compiled from: UiItemViewed.kt */
    public static final class z extends hzp0 {
    }

    public hzp0(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$EventItem schemeStat$EventItem) {
        this.a = mobileOfficialAppsCoreNavStat$EventScreen;
        this.b = schemeStat$EventItem;
    }

    public final void a() {
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String valueOf = String.valueOf(timeUnit.toMicros(this.d));
        String valueOf2 = String.valueOf(timeUnit.toMicros(this.e));
        Integer num = this.c;
        SchemeStat$TypeView.b bVar = null;
        if (!(this instanceof n)) {
            if (this instanceof m0) {
                bVar = ((m0) this).g;
            } else if (!(this instanceof x)) {
                if (this instanceof g0) {
                    bVar = ((g0) this).g;
                } else if (this instanceof h0) {
                    bVar = ((h0) this).g;
                } else if (!(this instanceof z)) {
                    if (this instanceof a) {
                        bVar = ((a) this).g;
                    } else if (!(this instanceof a0) && !(this instanceof b0) && !(this instanceof c0)) {
                        if (this instanceof u) {
                            bVar = ((u) this).g;
                        } else if (this instanceof t) {
                            bVar = ((t) this).g;
                        } else if (this instanceof j) {
                            bVar = ((j) this).g;
                        } else if (this instanceof y) {
                            bVar = ((y) this).g;
                        } else if (this instanceof n0) {
                            bVar = ((n0) this).g;
                        } else if (this instanceof o) {
                            bVar = ((o) this).g;
                        } else if (this instanceof p) {
                            bVar = ((p) this).g;
                        } else if (!(this instanceof r) && !(this instanceof s)) {
                            if (this instanceof d) {
                                bVar = ((d) this).g;
                            } else if (this instanceof i0) {
                                bVar = ((i0) this).g;
                            } else if (!(this instanceof j0) && !(this instanceof f)) {
                                if (this instanceof w) {
                                    bVar = ((w) this).g;
                                } else if (this instanceof c) {
                                    bVar = ((c) this).g;
                                } else if (this instanceof q) {
                                    bVar = ((q) this).g;
                                } else if (!(this instanceof l0)) {
                                    if (this instanceof v) {
                                        bVar = ((v) this).g;
                                    } else if (this instanceof o0) {
                                        bVar = ((o0) this).g;
                                    } else if (this instanceof d0) {
                                        bVar = ((d0) this).g;
                                    } else if (this instanceof g) {
                                        bVar = ((g) this).g;
                                    } else if (!(this instanceof k0) && !(this instanceof i)) {
                                        if (this instanceof h) {
                                            bVar = ((h) this).g;
                                        } else if (this instanceof l) {
                                            bVar = ((l) this).g;
                                        } else if (this instanceof b) {
                                            bVar = ((b) this).g;
                                        } else if (this instanceof e) {
                                            bVar = ((e) this).g;
                                        } else if (this instanceof k) {
                                            bVar = ((k) this).g;
                                        } else if (this instanceof f0) {
                                            bVar = ((f0) this).g;
                                        } else {
                                            if (!(this instanceof e0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar = ((e0) this).g;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bvt0 bvt0Var = new bvt0(this.a, SchemeStat$TypeView.a.a(this.b, valueOf, valueOf2, num, bVar), uzp0Var.a);
        bvt0Var.c = this.f;
        bvt0Var.q();
    }

    public final String toString() {
        return hzp0.class.getSimpleName() + "(screen=" + this.a + ", displayed=" + ((this.e - this.d) / 1000.0f) + " (s), position=" + this.c + ", item=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hzp0(SchemeStat$EventItem schemeStat$EventItem) {
        this(UiTracker.c(), schemeStat$EventItem);
        UiTracker uiTracker = UiTracker.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzp0(SchemeStat$EventItem schemeStat$EventItem, int i2) {
        this(schemeStat$EventItem, i2, false, 0L, 0L, UiTracker.c());
        UiTracker uiTracker = UiTracker.a;
    }

    public hzp0(SchemeStat$EventItem schemeStat$EventItem, int i2, boolean z2, long j2, long j3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this(mobileOfficialAppsCoreNavStat$EventScreen, schemeStat$EventItem);
        this.c = Integer.valueOf(i2);
        this.f = z2;
        this.d = j2;
        this.e = j3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hzp0(SchemeStat$EventItem schemeStat$EventItem, int i2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this(mobileOfficialAppsCoreNavStat$EventScreen, schemeStat$EventItem);
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            UiTracker uiTracker = UiTracker.a;
            mobileOfficialAppsCoreNavStat$EventScreen = UiTracker.c();
        }
        this.c = Integer.valueOf(i2);
    }
}
