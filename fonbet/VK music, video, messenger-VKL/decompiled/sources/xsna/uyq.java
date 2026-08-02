package xsna;

import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.List;

/* compiled from: FeedEvent.kt */
/* loaded from: classes17.dex */
public interface uyq {

    /* compiled from: FeedEvent.kt */
    public static final class a implements uyq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1758242070;
        }

        public final String toString() {
            return "CloseFeed";
        }
    }

    /* compiled from: FeedEvent.kt */
    public static final class b implements uyq {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("DislikeStaticAd(adUniqueKey="), this.a, ')');
        }
    }

    /* compiled from: FeedEvent.kt */
    public static final class c implements uyq {
        public final String a;
        public final ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType b;
        public final ClipViewerAnalyticsEvent.FloatingButtonEvent.a c;

        public c(String str, ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType eventType, ClipViewerAnalyticsEvent.FloatingButtonEvent.a aVar) {
            this.a = str;
            this.b = eventType;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "FloatingButtonAnalytics(buttonId=" + this.a + ", eventType=" + this.b + ", videoParamsModel=" + this.c + ')';
        }
    }

    /* compiled from: FeedEvent.kt */
    public static final class d implements uyq {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1131282461;
        }

        public final String toString() {
            return "OnPulledToRefresh";
        }
    }

    /* compiled from: FeedEvent.kt */
    public static abstract class e implements uyq {

        /* compiled from: FeedEvent.kt */
        public static abstract class a extends e {

            /* compiled from: FeedEvent.kt */
            /* renamed from: xsna.uyq$e$a$a, reason: collision with other inner class name */
            public static final class C3856a extends a {
                public final ClipsPlaylist a;

                public C3856a(ClipsPlaylist clipsPlaylist) {
                    this.a = clipsPlaylist;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3856a) && epx.f(this.a, ((C3856a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "FromBeginning(playlist=" + this.a + ')';
                }
            }

            /* compiled from: FeedEvent.kt */
            public static final class b extends a {
                public final ClipsPlaylist a;
                public final String b;
                public final PaginationKey c;
                public final PaginationKey d;

                public b(ClipsPlaylist clipsPlaylist, String str, PaginationKey paginationKey, PaginationKey paginationKey2) {
                    this.a = clipsPlaylist;
                    this.b = str;
                    this.c = paginationKey;
                    this.d = paginationKey2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
                }

                public final int hashCode() {
                    return this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
                }

                public final String toString() {
                    return "FromMiddle(playlist=" + this.a + ", focusedVideoId=" + this.b + ", paginationKeyBackward=" + this.c + ", paginationKeyForward=" + this.d + ')';
                }
            }
        }

        /* compiled from: FeedEvent.kt */
        public static final class b extends e {
            public final ClipsPlaylist a;
            public final SdkVideoFile b;

            public b(ClipsPlaylist clipsPlaylist, SdkVideoFile sdkVideoFile) {
                this.a = clipsPlaylist;
                this.b = sdkVideoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenFeed(playlist=" + this.a + ", focusedVideo=" + this.b + ')';
            }
        }

        /* compiled from: FeedEvent.kt */
        public static final class c implements uyq {
            public final FeedItem.f a;
            public final List<ClipsPlaylist> b;

            public c(FeedItem.f fVar, List<ClipsPlaylist> list) {
                this.a = fVar;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowGroupBadgeModal(item=");
                sb.append(this.a);
                sb.append(", playlists=");
                return ms9.a(')', sb, this.b);
            }
        }
    }

    /* compiled from: FeedEvent.kt */
    public static final class f implements uyq {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -781973519;
        }

        public final String toString() {
            return "ResetCacheAnchorPosition";
        }
    }

    /* compiled from: FeedEvent.kt */
    public static abstract class g implements uyq {

        /* compiled from: FeedEvent.kt */
        public static abstract class a extends g {

            /* compiled from: FeedEvent.kt */
            /* renamed from: xsna.uyq$g$a$a, reason: collision with other inner class name */
            public static final class C3857a extends a {
                public final qvq a;

                public C3857a(qvq qvqVar) {
                    this.a = qvqVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3857a) && epx.f(this.a, ((C3857a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "WithAction(actionOnScrollFinished=" + this.a + ')';
                }
            }
        }

        /* compiled from: FeedEvent.kt */
        public static final class b extends g {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return h5s.c(this.a, ", withAnimation=false)", new StringBuilder("ToPosition(position="));
            }
        }
    }

    /* compiled from: FeedEvent.kt */
    public static final class h implements uyq {
        public final String a;
        public final SdkAdsChoices b;

        public h(SdkAdsChoices sdkAdsChoices, String str) {
            this.a = str;
            this.b = sdkAdsChoices;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SdkAdsChoices sdkAdsChoices = this.b;
            return hashCode + (sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode());
        }

        public final String toString() {
            return "ShowAdHideChoices(adUniqueKey=" + this.a + ", adsChoices=" + this.b + ')';
        }
    }

    /* compiled from: FeedEvent.kt */
    public static final class i implements uyq {
        public final xgq a;
        public final ClipViewerAnalyticsEvent.FloatingButtonEvent.a b;

        public i(xgq xgqVar, ClipViewerAnalyticsEvent.FloatingButtonEvent.a aVar) {
            this.a = xgqVar;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowFloatingButton(data=" + this.a + ", videoParamsModel=" + this.b + ')';
        }
    }

    /* compiled from: FeedEvent.kt */
    public static final class j implements uyq {
        public final String a;
        public final SdkAdsChoices b;

        public j(SdkAdsChoices sdkAdsChoices, String str) {
            this.a = str;
            this.b = sdkAdsChoices;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SdkAdsChoices sdkAdsChoices = this.b;
            return hashCode + (sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode());
        }

        public final String toString() {
            return "ShowReportChoices(adUniqueKey=" + this.a + ", adsChoices=" + this.b + ')';
        }
    }
}
