package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.toggle.features.ComFeatures;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.d5c0;
import xsna.ds60;
import xsna.jm50;
import xsna.lgj0;
import xsna.qr60;
import xsna.t5c0;
import xsna.xqu;
import xsna.yo60;

/* compiled from: PostPagingMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class l6c0 extends evg0<m5c0, on50, t5c0.d, t5c0, h5c0, d5c0> {
    public final s5c0 f;
    public final fco0 g;
    public final Lazy<AuthBridgeComponent> h;
    public final eh60 i;
    public final io.reactivex.rxjava3.internal.schedulers.d j;
    public final u1r0 k;
    public final j2r0 l;
    public final dqu m;

    /* compiled from: PostPagingMviTaskExecutor.kt */
    public static final class a {
        public final NewsEntry a;
        public final String b;
        public final UserProfile c;

        public a(NewsEntry newsEntry, String str, UserProfile userProfile) {
            this.a = newsEntry;
            this.b = str;
            this.c = userProfile;
        }
    }

    /* compiled from: PostPagingMviTaskExecutor.kt */
    public static final class b implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ t440 b;

        public b(t440 t440Var) {
            this.b = t440Var;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    public l6c0(s5c0 s5c0Var, fco0 fco0Var, Lazy lazy, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = s5c0Var;
        this.g = fco0Var;
        this.h = lazy;
        this.i = s5c0Var.c;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.j = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
        this.k = new u1r0();
        this.l = new j2r0();
        this.m = new dqu();
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        io.reactivex.rxjava3.internal.operators.observable.f0 W;
        t5c0.d dVar = (t5c0.d) hn50Var;
        if (dVar instanceof t5c0.d.a) {
            return s();
        }
        if (dVar instanceof t5c0.d.b) {
            ds60.f fVar = ((t5c0.d.b) dVar).b;
            if ((fVar instanceof ds60.f.c) || (fVar instanceof ds60.f.d) || (fVar instanceof ds60.f.b)) {
                return s();
            }
            if ((fVar instanceof ds60.f.a) || (fVar instanceof ds60.f.e)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(dVar instanceof t5c0.d.c)) {
            throw new NoWhenBranchMatchedException();
        }
        UserId userId = ((t5c0.d.c) dVar).b;
        if (fkq0.b(userId)) {
            ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                List singletonList = Collections.singletonList(fkq0.a(userId));
                List<GroupsFieldsDto> list = fkg.a;
                if ((4 & 2) != 0) {
                    list = null;
                }
                fz2 y = yfb.y(xqu.a.a(null, singletonList, list), new cd10(10));
                ahn.D(y);
                W = rsg0.W(y, 7);
            } else {
                W = rsg0.W(new rpu(fkq0.e(userId)), 7);
            }
        } else {
            W = rsg0.W(new e1r0(userId), 7);
        }
        return g(W, new ysb(), new n6c0(this));
    }

    public final zvg0 s() {
        io.reactivex.rxjava3.core.x<NewsEntry> k;
        n().a(a6c0.a);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
        c(new d5c0.a(yo60.j.c.a));
        e(new j5c0(new qr60.a.e(ListLoadingState.RELOADING)));
        Long l = ((m5c0) this.b.getCurrentState()).j;
        if (l != null) {
            long longValue = l.longValue();
            Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
            k = new io.reactivex.rxjava3.internal.operators.single.n(NewsfeedData.a.f(longValue), new oo20(new nl30(this, 14), 14)).n(t());
        } else {
            NewsEntry newsEntry = this.f.h.p;
            k = newsEntry != null ? io.reactivex.rxjava3.core.x.k(newsEntry) : t();
        }
        int i = 2;
        return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.x.x(new dzw(new ie90(this, 6)).b(new io.reactivex.rxjava3.internal.operators.single.n(k, new pd40(new f410(this, 23), 10)).l(new xx40(new zb60(this, 11), 5)).m(this.j))).h(new hu50(new px30(this, 20), 9)), new o3y(new bq00(this, 24), 15)), new wx40(new yka0(this, i), 3)).l(new fe60(new xka0(this, i), 5)), new qg60(new nt10(this, 13), 7)), new c2y(this, 19), new cx00(this, 15));
    }

    public final io.reactivex.rxjava3.core.x<NewsEntry> t() {
        String str;
        io.reactivex.rxjava3.internal.operators.observable.f0 w0;
        io.reactivex.rxjava3.core.x<List<Post>> l;
        s5c0 s5c0Var = this.f;
        f0c0 f0c0Var = s5c0Var.h;
        String str2 = f0c0Var.u;
        String str3 = f0c0Var.q;
        String a2 = (str3 == null || drm0.N(str3)) ? str2 : v1v.a('_', str2, str3);
        if (a2 == null || drm0.N(a2)) {
            c(x4c0.a);
            return io.reactivex.rxjava3.core.x.i(new IllegalStateException("contentId is null or blank"));
        }
        f0c0 f0c0Var2 = s5c0Var.h;
        boolean z = f0c0Var2.v;
        boolean z2 = f0c0Var2.w;
        int i = 3;
        int i2 = 5;
        int i3 = 4;
        if (z || z2) {
            if (str2 == null) {
                return sn.b("contentId is null or blank");
            }
            if (z2) {
                List singletonList = Collections.singletonList(str2);
                List<String> list = wfj0.b;
                if ((58 & 4) != 0) {
                    list = null;
                }
                w0 = rsg0.w0(yfb.y(lgj0.a.c(singletonList, list), new foh(fgj0.a, 4)));
            } else {
                int H = drm0.H(str2);
                while (true) {
                    if (-1 >= H) {
                        str = "";
                        break;
                    }
                    if (str2.charAt(H) == '_') {
                        str = str2.substring(0, H + 1);
                        break;
                    }
                    H--;
                }
                String w02 = erm0.w0(1, str);
                w0 = rsg0.w0(new gns0(new UserId(Long.parseLong(w02)), Integer.parseInt(erm0.v0(w02.length() + 1, str2)), str3));
            }
            l = w0.l(new bz60(5));
        } else if (f0c0Var2.x) {
            l = rsg0.w0(new yw4(a2, 1)).l(new si60(new ev60(i2), i));
        } else {
            iuc0 iuc0Var = iuc0.b;
            l = iuc0.g0().m(Collections.singletonList(a2));
        }
        pw40 pw40Var = new pw40(new ap30(this, 9), i3);
        l.getClass();
        io.reactivex.rxjava3.internal.operators.single.n nVar = new io.reactivex.rxjava3.internal.operators.single.n(l, pw40Var);
        asu0.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.r(nVar.m(asu0.i()), new fhb0(new m6c0(this), 3));
    }
}
