package xsna;

import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ClipSpinnerEntryPoint;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FeedAction.kt */
/* loaded from: classes17.dex */
public interface qvq extends kj50 {

    /* compiled from: FeedAction.kt */
    public interface a extends qvq {

        /* compiled from: FeedAction.kt */
        /* renamed from: xsna.qvq$a$a, reason: collision with other inner class name */
        public static final class C3575a implements a {
            public final List<FeedItem> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C3575a(List<? extends FeedItem> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3575a) && epx.f(this.b, ((C3575a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Load(items="), this.b);
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public static abstract class b implements qvq {

        /* compiled from: FeedAction.kt */
        public static final class a extends b {
            public final i b;
            public final Throwable c;

            public a(i iVar, Throwable th) {
                this.b = iVar;
                this.c = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(originalAction=");
                sb.append(this.b);
                sb.append(", error=");
                return oq.c(sb, this.c, ')');
            }
        }

        /* compiled from: FeedAction.kt */
        /* renamed from: xsna.qvq$b$b, reason: collision with other inner class name */
        public static final class C3576b extends b {
            public final i b;
            public final qih0 c;
            public final boolean d;

            public C3576b(i iVar, qih0 qih0Var, boolean z) {
                this.b = iVar;
                this.c = qih0Var;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3576b)) {
                    return false;
                }
                C3576b c3576b = (C3576b) obj;
                return epx.f(this.b, c3576b.b) && epx.f(this.c, c3576b.c) && this.d == c3576b.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(originalAction=");
                sb.append(this.b);
                sb.append(", response=");
                sb.append(this.c);
                sb.append(", isExtendWithBlocksRequired=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class c extends b {
            public final i b;
            public final bpd c;

            public c(i iVar, bpd bpdVar) {
                this.b = iVar;
                this.c = bpdVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "SuccessWithDecoration(originalAction=" + this.b + ", response=" + this.c + ')';
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class c implements qvq {
        public static final c b = new c();
    }

    /* compiled from: FeedAction.kt */
    public interface d extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements d {
            public final SdkExternalNpsCondition b;

            public a(SdkExternalNpsCondition sdkExternalNpsCondition) {
                this.b = sdkExternalNpsCondition;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "AddBlock(condition=" + this.b + ')';
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class b implements d {
            public final SdkExternalNpsCondition b;

            public b(SdkExternalNpsCondition sdkExternalNpsCondition) {
                this.b = sdkExternalNpsCondition;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Completed(condition=" + this.b + ')';
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class c implements d {
            public final FeedItem.e.a b;

            public c(FeedItem.e.a aVar) {
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.b.hashCode();
            }

            public final String toString() {
                return "ItemHiddenAfterScroll(item=" + this.b + ')';
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class e implements qvq {
        public final String b;
        public final ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType c;

        public e(String str, ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType eventType) {
            this.b = str;
            this.c = eventType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "FloatingButtonAnalytics(buttonId=" + this.b + ", eventType=" + this.c + ')';
        }
    }

    /* compiled from: FeedAction.kt */
    public interface f extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements f {
            public static final a b = new a();
        }

        /* compiled from: FeedAction.kt */
        public static final class b implements f {
            public final ArrayList b;
            public final int c;

            public b(ArrayList arrayList, int i) {
                this.b = arrayList;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b.equals(bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WithCacheData(initialItems=");
                sb.append(this.b);
                sb.append(", cacheSessionId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class c implements f {
        }

        /* compiled from: FeedAction.kt */
        public static final class d implements f {
            public final List<FeedItem> b;
            public final boolean c;
            public final boolean d;
            public final PaginationKey e;
            public final PaginationKey f;

            /* JADX WARN: Multi-variable type inference failed */
            public d(List<? extends FeedItem> list, boolean z, boolean z2, PaginationKey paginationKey, PaginationKey paginationKey2) {
                this.b = list;
                this.c = z;
                this.d = z2;
                this.e = paginationKey;
                this.f = paginationKey2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f);
            }

            public final int hashCode() {
                int b = qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
                PaginationKey paginationKey = this.e;
                int hashCode = (b + (paginationKey == null ? 0 : paginationKey.hashCode())) * 31;
                PaginationKey paginationKey2 = this.f;
                return hashCode + (paginationKey2 != null ? paginationKey2.hashCode() : 0);
            }

            public final String toString() {
                return "WithNavigationData(initialItems=" + this.b + ", withForwardLoadingItem=" + this.c + ", withBackwardLoadingItem=" + this.d + ", paginationKeyForward=" + this.e + ", paginationKeyBackward=" + this.f + ')';
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public interface g extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements g {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 450624279;
            }

            public final String toString() {
                return "CancelSendResultLoading";
            }
        }

        /* compiled from: FeedAction.kt */
        public interface b extends g {

            /* compiled from: FeedAction.kt */
            public static final class a implements b {
                public final String b;
                public final String c;

                public a(String str, String str2) {
                    this.b = str;
                    this.c = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("HandleAnswer(uniqueKey=");
                    sb.append(this.b);
                    sb.append(", answerValue=");
                    return ho8.a(sb, this.c, ')');
                }
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class h implements qvq {
        public final String b;

        public h(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ItemFocused(uniqueKey="), this.b, ')');
        }
    }

    /* compiled from: FeedAction.kt */
    public interface i extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements i {
            public final zv8 b;

            public a(zv8 zv8Var) {
                this.b = zv8Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            @Override // xsna.qvq.i
            public final boolean n() {
                return true;
            }

            public final String toString() {
                return "ByCacheHit(cacheData=" + this.b + ')';
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class b implements i {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            @Override // xsna.qvq.i
            public final boolean n() {
                return this.b;
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ByLoad(isForward="), this.b, ')');
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class c implements i {
            public final boolean b;

            public c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            @Override // xsna.qvq.i
            public final boolean n() {
                return this.b;
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ByRetryClick(isForward="), this.b, ')');
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class d implements i {
            public final boolean b;

            public d(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.b == ((d) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            @Override // xsna.qvq.i
            public final boolean n() {
                return this.b;
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ByRetryOnEmptyPage(isForward="), this.b, ')');
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class e implements i {
            public final boolean b;
            public final String c;

            public e(boolean z, String str) {
                this.b = z;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.b == eVar.b && epx.f(this.c, eVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
            }

            @Override // xsna.qvq.i
            public final boolean n() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ByScrollOverItem(isForward=");
                sb.append(this.b);
                sb.append(", uniqueKey=");
                return ho8.a(sb, this.c, ')');
            }
        }

        boolean n();
    }

    /* compiled from: FeedAction.kt */
    public interface j extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements j {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 318978082;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: FeedAction.kt */
        public interface b extends j {

            /* compiled from: FeedAction.kt */
            public static final class a implements b {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1297779829;
                }

                public final String toString() {
                    return "Error";
                }
            }

            /* compiled from: FeedAction.kt */
            /* renamed from: xsna.qvq$j$b$b, reason: collision with other inner class name */
            public static final class C3577b implements b {
                public static final C3577b b = new C3577b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3577b);
                }

                public final int hashCode() {
                    return 1237717808;
                }

                public final String toString() {
                    return "Success";
                }
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class c implements j {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -348114710;
            }

            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class d implements j {
            public final ClipSpinnerEntryPoint b;

            public d(ClipSpinnerEntryPoint clipSpinnerEntryPoint) {
                this.b = clipSpinnerEntryPoint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.b == ((d) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Start(reason=" + this.b + ')';
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public interface k extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements k {
            public final String b;
            public final SdkAdsChoices c;

            public a(SdkAdsChoices sdkAdsChoices, String str) {
                this.b = str;
                this.c = sdkAdsChoices;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                SdkAdsChoices sdkAdsChoices = this.c;
                return hashCode + (sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode());
            }

            public final String toString() {
                return "NotInterestedClicked(adUniqueKey=" + this.b + ", adsChoices=" + this.c + ')';
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class b implements k {
            public final String b;
            public final SdkAdsChoices c;

            public b(SdkAdsChoices sdkAdsChoices, String str) {
                this.b = str;
                this.c = sdkAdsChoices;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                SdkAdsChoices sdkAdsChoices = this.c;
                return hashCode + (sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode());
            }

            public final String toString() {
                return "ReportClicked(adUniqueKey=" + this.b + ", adsChoices=" + this.c + ')';
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public interface l extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements l {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -486703144;
            }

            public final String toString() {
                return "CancelLoading";
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public interface m extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements m {
            public final List<ClipsPlaylist> b;
            public final SdkVideoFile c;

            public a(List list, SdkClipVideoFile sdkClipVideoFile) {
                this.b = list;
                this.c = sdkClipVideoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "BadgeClickMultiple(playlists=" + this.b + ", video=" + this.c + ')';
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class b implements m {
            public final ClipsPlaylist b;
            public final SdkVideoFile c;

            public b(ClipsPlaylist clipsPlaylist, SdkClipVideoFile sdkClipVideoFile) {
                this.b = clipsPlaylist;
                this.c = sdkClipVideoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "BadgeClickSingle(playlist=" + this.b + ", video=" + this.c + ')';
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class c implements m {
            public final eqe b;

            public c(eqe eqeVar) {
                this.b = eqeVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ExternalEvent(event=" + this.b + ')';
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class n implements qvq {
        public static final n b = new n();
    }

    /* compiled from: FeedAction.kt */
    public interface o extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements o {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 783418681;
            }

            public final String toString() {
                return "ApplyNextClipReplacement";
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class p implements qvq {
        public final String b;

        public p(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("RemoveFeedItem(uniqueKey="), this.b, ')');
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class q implements qvq {
        public final SdkVideoFile b;

        public q(SdkVideoFile sdkVideoFile) {
            this.b = sdkVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RequestVideoUpdate(videoFile=" + this.b + ')';
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class r implements qvq {
        public final boolean b;

        public r(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.b == ((r) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("RetryLoad(isForward="), this.b, ')');
        }
    }

    /* compiled from: FeedAction.kt */
    public interface s extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements s {
            public final String b;

            public a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Dislike(adUniqueKey="), this.b, ')');
            }
        }

        /* compiled from: FeedAction.kt */
        public static final class b implements s {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("NotInterestedClicked(adUniqueKey="), this.b, ')');
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class t implements qvq {
        public static final t b = new t();
    }

    /* compiled from: FeedAction.kt */
    public static final class u implements qvq {
        public final xkh0 b;

        public u(xkh0 xkh0Var) {
            this.b = xkh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.b, ((u) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SubscriptionStatusUpdate(subscriptionInfo=" + this.b + ')';
        }
    }

    /* compiled from: FeedAction.kt */
    public interface v extends qvq {

        /* compiled from: FeedAction.kt */
        public static final class a implements v {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1029112406;
            }

            public final String toString() {
                return "WithNewInterests";
            }
        }
    }

    /* compiled from: FeedAction.kt */
    public static final class w implements qvq {
        public static final w b = new w();
    }

    /* compiled from: FeedAction.kt */
    public static final class x implements qvq {
        public final llh0 b;

        public x(llh0 llh0Var) {
            this.b = llh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && epx.f(this.b, ((x) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VideoUpdate(videoAction=" + this.b + ')';
        }
    }
}
