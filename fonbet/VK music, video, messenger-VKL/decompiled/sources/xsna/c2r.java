package xsna;

import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivitiesTarget;
import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ClipSpinnerEntryPoint;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FeedPatch.kt */
/* loaded from: classes17.dex */
public interface c2r extends xl50 {

    /* compiled from: FeedPatch.kt */
    public interface a extends c2r {

        /* compiled from: FeedPatch.kt */
        /* renamed from: xsna.c2r$a$a, reason: collision with other inner class name */
        public static final class C2634a implements a {
            public final Map<SdkClipActivitiesTarget, SdkClipActivities> b;

            public C2634a(Map<SdkClipActivitiesTarget, SdkClipActivities> map) {
                this.b = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2634a) && epx.f(this.b, ((C2634a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return cjl0.a(new StringBuilder("Success(activities="), this.b, ')');
            }
        }
    }

    /* compiled from: FeedPatch.kt */
    public static final class b implements c2r {
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
            return ho8.a(new StringBuilder("ChangeFocusedItem(uniqueKey="), this.b, ')');
        }
    }

    /* compiled from: FeedPatch.kt */
    public static final class c implements c2r {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2135700532;
        }

        public final String toString() {
            return "ClearPendingFloatingButton";
        }
    }

    /* compiled from: FeedPatch.kt */
    public interface d extends c2r {

        /* compiled from: FeedPatch.kt */
        public static final class a implements d {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Error(error="), this.b, ')');
            }
        }

        /* compiled from: FeedPatch.kt */
        public static final class b implements d {
            public final boolean b;
            public final boolean c;
            public final PaginationKey d;
            public final PaginationKey e;

            public /* synthetic */ b() {
                this(true, false, null, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
                PaginationKey paginationKey = this.d;
                int hashCode = (b + (paginationKey == null ? 0 : paginationKey.hashCode())) * 31;
                PaginationKey paginationKey2 = this.e;
                return hashCode + (paginationKey2 != null ? paginationKey2.hashCode() : 0);
            }

            public final String toString() {
                return "Start(forwardWithLoadingState=" + this.b + ", backwardWithLoadingState=" + this.c + ", paginationKeyForward=" + this.d + ", paginationKeyBackward=" + this.e + ')';
            }

            public b(boolean z, boolean z2, PaginationKey paginationKey, PaginationKey paginationKey2) {
                this.b = z;
                this.c = z2;
                this.d = paginationKey;
                this.e = paginationKey2;
            }
        }

        /* compiled from: FeedPatch.kt */
        public static final class c implements d {
            public final List<FeedItem> b;
            public final PaginationKey c;
            public final PaginationKey d;
            public final s4r e;
            public final ubx f;
            public final String g;
            public final wrr h;

            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends FeedItem> list, PaginationKey paginationKey, PaginationKey paginationKey2, s4r s4rVar, ubx ubxVar, String str, wrr wrrVar) {
                this.b = list;
                this.c = paginationKey;
                this.d = paginationKey2;
                this.e = s4rVar;
                this.f = ubxVar;
                this.g = str;
                this.h = wrrVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h);
            }

            public final int hashCode() {
                int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
                String str = this.g;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                wrr wrrVar = this.h;
                return hashCode2 + (wrrVar != null ? wrrVar.hashCode() : 0);
            }

            public final String toString() {
                return "Success(items=" + this.b + ", paginationKeyBackward=" + this.c + ", paginationKeyForward=" + this.d + ", title=" + this.e + ", interactiveState=" + this.f + ", itemKeyToFocus=" + this.g + ", floatingButton=" + this.h + ')';
            }
        }
    }

    /* compiled from: FeedPatch.kt */
    public interface e extends c2r {

        /* compiled from: FeedPatch.kt */
        public static final class a implements e {
            public final FeedItem.e.a b;

            public a(FeedItem.e.a aVar) {
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b.equals(((a) obj).b);
            }

            public final int hashCode() {
                return this.b.b.hashCode();
            }

            public final String toString() {
                return "AddNextItem(item=" + this.b + ')';
            }
        }
    }

    /* compiled from: FeedPatch.kt */
    public interface f extends c2r {

        /* compiled from: FeedPatch.kt */
        public static final class a implements f {
            public final Throwable b;
            public final boolean c;

            public a(Throwable th, boolean z) {
                this.b = th;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(error=");
                sb.append(this.b);
                sb.append(", isForward=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: FeedPatch.kt */
        public static final class b implements f {
            public final PaginationKey b;
            public final boolean c;

            public b(PaginationKey paginationKey, boolean z) {
                this.b = paginationKey;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Retry(paginationKey=");
                sb.append(this.b);
                sb.append(", isForward=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: FeedPatch.kt */
        public static final class c implements f {
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

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Start(isForward="), this.b, ')');
            }
        }

        /* compiled from: FeedPatch.kt */
        public static final class d implements f {
            public final ArrayList b;
            public final PaginationKey c;
            public final wrr d;
            public final boolean e;

            public d(ArrayList arrayList, PaginationKey paginationKey, wrr wrrVar, boolean z) {
                this.b = arrayList;
                this.c = paginationKey;
                this.d = wrrVar;
                this.e = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.b.equals(dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && this.e == dVar.e;
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
                wrr wrrVar = this.d;
                return Boolean.hashCode(this.e) + ((hashCode + (wrrVar == null ? 0 : wrrVar.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(items=");
                sb.append(this.b);
                sb.append(", paginationKey=");
                sb.append(this.c);
                sb.append(", floatingButton=");
                sb.append(this.d);
                sb.append(", isForward=");
                return defpackage.q0.a(sb, this.e, ')');
            }
        }
    }

    /* compiled from: FeedPatch.kt */
    public interface g extends c2r {

        /* compiled from: FeedPatch.kt */
        public interface a extends g {

            /* compiled from: FeedPatch.kt */
            /* renamed from: xsna.c2r$g$a$a, reason: collision with other inner class name */
            public static final class C2635a implements a {
                public static final C2635a b = new C2635a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2635a);
                }

                public final int hashCode() {
                    return -1206262758;
                }

                public final String toString() {
                    return "Error";
                }
            }

            /* compiled from: FeedPatch.kt */
            public static final class b implements a {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 34477461;
                }

                public final String toString() {
                    return "Success";
                }
            }
        }

        /* compiled from: FeedPatch.kt */
        public static final class b implements g {
            public static final b b = new b();
        }

        /* compiled from: FeedPatch.kt */
        public static final class c implements g {
            public final ClipSpinnerEntryPoint b;

            public c(ClipSpinnerEntryPoint clipSpinnerEntryPoint) {
                this.b = clipSpinnerEntryPoint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SetLoading(reason=" + this.b + ')';
            }
        }
    }

    /* compiled from: FeedPatch.kt */
    public interface h extends c2r {

        /* compiled from: FeedPatch.kt */
        public static final class a implements h {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Error(error="), this.b, ')');
            }
        }

        /* compiled from: FeedPatch.kt */
        public static final class b implements h {
            public static final b b = new b();
        }

        /* compiled from: FeedPatch.kt */
        public static final class c implements h {
            public static final c b = new c();
        }

        /* compiled from: FeedPatch.kt */
        public static final class d implements h {
            public final List<FeedItem> b;
            public final PaginationKey c;
            public final String d;
            public final wrr e;

            /* JADX WARN: Multi-variable type inference failed */
            public d(List<? extends FeedItem> list, PaginationKey paginationKey, String str, wrr wrrVar) {
                this.b = list;
                this.c = paginationKey;
                this.d = str;
                this.e = wrrVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
                String str = this.d;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                wrr wrrVar = this.e;
                return hashCode2 + (wrrVar != null ? wrrVar.hashCode() : 0);
            }

            public final String toString() {
                return "Success(items=" + this.b + ", paginationKeyForward=" + this.c + ", itemKeyToFocus=" + this.d + ", floatingButton=" + this.e + ')';
            }
        }
    }

    /* compiled from: FeedPatch.kt */
    public static final class i implements c2r {
        public final Set<Integer> b;

        public i(Set<Integer> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("RemoveHiddenById(videoIds="), this.b, ')');
        }
    }

    /* compiled from: FeedPatch.kt */
    public static final class j implements c2r {
        public final UserId b;
        public final boolean c;

        public j(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && this.c == jVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubscriptionStatusUpdate(userId=");
            sb.append(this.b);
            sb.append(", isSubscribed=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: FeedPatch.kt */
    public static final class k implements c2r {
    }
}
