package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.newsfeed.entries.InterestingStoriesEntry;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: InterestingStoriesPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class bfx extends de {
    public final bpn0 b = new bpn0(new te0(23));

    /* compiled from: InterestingStoriesPrefetchHelper.kt */
    public static abstract class a {

        /* compiled from: InterestingStoriesPrefetchHelper.kt */
        /* renamed from: xsna.bfx$a$a, reason: collision with other inner class name */
        public static final class C2607a extends a {
            public final Throwable a;

            public C2607a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2607a) && epx.f(this.a, ((C2607a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }

        /* compiled from: InterestingStoriesPrefetchHelper.kt */
        public static final class b extends a {
            public final tdx a;

            public b(tdx tdxVar) {
                this.a = tdxVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                tdx tdxVar = this.a;
                if (tdxVar == null) {
                    return 0;
                }
                return tdxVar.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.a + ')';
            }
        }
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        NewsEntry.TrackData trackData;
        ArrayList arrayList = null;
        InterestingStoriesEntry interestingStoriesEntry = newsEntry instanceof InterestingStoriesEntry ? (InterestingStoriesEntry) newsEntry : null;
        String str2 = (interestingStoriesEntry == null || (trackData = interestingStoriesEntry.i) == null) ? null : trackData.b;
        if (interestingStoriesEntry == null || str2 == null) {
            return null;
        }
        List<BaseUserGroupFieldsDto> list = isl0.a;
        tfx tfxVar = new tfx("stories.getInterestingBlock", new dt(28), new s3j0(4));
        tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        tfxVar.j("extended", true);
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        dz2 x = yfb.x(tfxVar);
        x.n = true;
        int i = 21;
        return new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.T(x).h0(3L).y0(5L, TimeUnit.SECONDS).U(new q9(new arf(this, 24), 18)), new com.vk.movika.sdk.base.ui.j(new u4u(6), 24)).a0(asu0.a.d()).U(new m40(new z8f(interestingStoriesEntry, i), i));
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.a);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
