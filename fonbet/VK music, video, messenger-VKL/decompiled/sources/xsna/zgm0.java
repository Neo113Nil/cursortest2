package xsna;

import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.stories.dto.StoriesGetStatsV5200ResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetViewersExtendedV5115ResponseDto;
import com.vk.api.generated.stories.dto.StoriesNewReactionDto;
import com.vk.api.generated.stories.dto.StoriesStatCategoryDto;
import com.vk.api.generated.stories.dto.StoriesStatLineDto;
import com.vk.api.generated.stories.dto.StoriesViewersItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: StoryStatisticsRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class zgm0 implements qgm0 {
    public static final List<BaseUserGroupFieldsDto> e;
    public static final List<BaseUserGroupFieldsDto> f;
    public static final List<BaseUserGroupFieldsDto> g;
    public final jzi0 a;
    public final kem0 b;
    public final dem0 c = new dem0();
    public final ysg0<oem0> d = new ysg0<>();

    /* compiled from: StoryStatisticsRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadStrategy.values().length];
            try {
                iArr[LoadStrategy.CACHE_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadStrategy.ONLY_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadStrategy.ONLY_API.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: StoryStatisticsRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<StoriesGetStatsV5200ResponseDto, c3m0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
        @Override // xsna.izs
        public final c3m0 invoke(StoriesGetStatsV5200ResponseDto storiesGetStatsV5200ResponseDto) {
            ?? r3;
            StoriesGetStatsV5200ResponseDto storiesGetStatsV5200ResponseDto2 = storiesGetStatsV5200ResponseDto;
            ((psl0) this.receiver).getClass();
            String g = storiesGetStatsV5200ResponseDto2.g();
            if (g == null) {
                g = "";
            }
            String d = storiesGetStatsV5200ResponseDto2.d();
            String e = storiesGetStatsV5200ResponseDto2.e();
            List<StoriesStatCategoryDto> f = storiesGetStatsV5200ResponseDto2.f();
            if (f != null) {
                List<StoriesStatCategoryDto> list = f;
                r3 = new ArrayList(c5g.u(list, 10));
                for (StoriesStatCategoryDto storiesStatCategoryDto : list) {
                    String d2 = storiesStatCategoryDto.d();
                    List<StoriesStatLineDto> e2 = storiesStatCategoryDto.e();
                    ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
                    for (StoriesStatLineDto storiesStatLineDto : e2) {
                        String e3 = storiesStatLineDto.e();
                        Integer d3 = storiesStatLineDto.d();
                        boolean z = false;
                        int intValue = d3 != null ? d3.intValue() : 0;
                        Boolean f2 = storiesStatLineDto.f();
                        if (f2 != null) {
                            z = f2.booleanValue();
                        }
                        arrayList.add(new wdm0(e3, intValue, z));
                    }
                    r3.add(new vdm0(d2, arrayList));
                }
            } else {
                r3 = EmptyList.b;
            }
            return new c3m0(g, d, e, r3);
        }
    }

    /* compiled from: StoryStatisticsRepositoryImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<StoriesGetViewersExtendedV5115ResponseDto, tnm0> {
        @Override // xsna.izs
        public final tnm0 invoke(StoriesGetViewersExtendedV5115ResponseDto storiesGetViewersExtendedV5115ResponseDto) {
            StoriesGetViewersExtendedV5115ResponseDto storiesGetViewersExtendedV5115ResponseDto2 = storiesGetViewersExtendedV5115ResponseDto;
            ssl0 ssl0Var = (ssl0) this.receiver;
            ssl0Var.getClass();
            List<StoriesViewersItemDto> f = storiesGetViewersExtendedV5115ResponseDto2.f();
            ArrayList arrayList = new ArrayList(c5g.u(f, 10));
            for (StoriesViewersItemDto storiesViewersItemDto : f) {
                UsersUserFullDto e = storiesViewersItemDto.e();
                if (e == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ssl0Var.a.getClass();
                arrayList.add(new StoryUserProfile(j2r0.a(e), storiesViewersItemDto.J(), storiesViewersItemDto.d()));
            }
            VKList vKList = new VKList(arrayList);
            vKList.o(storiesGetViewersExtendedV5115ResponseDto2.getCount());
            vKList.l(storiesGetViewersExtendedV5115ResponseDto2.i() != null);
            vKList.n(storiesGetViewersExtendedV5115ResponseDto2.i());
            Integer d = storiesGetViewersExtendedV5115ResponseDto2.d();
            int intValue = d != null ? d.intValue() : 0;
            Integer j = storiesGetViewersExtendedV5115ResponseDto2.j();
            int intValue2 = j != null ? j.intValue() : 0;
            String e2 = storiesGetViewersExtendedV5115ResponseDto2.e();
            List<StoriesNewReactionDto> g = storiesGetViewersExtendedV5115ResponseDto2.g();
            if (g == null) {
                g = EmptyList.b;
            }
            return new tnm0(vKList, intValue, intValue2, e2, true, g.size());
        }
    }

    static {
        BaseUserGroupFieldsDto baseUserGroupFieldsDto = BaseUserGroupFieldsDto.NAME;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto2 = BaseUserGroupFieldsDto.SCREEN_NAME;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto3 = BaseUserGroupFieldsDto.SEX;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto4 = BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto5 = BaseUserGroupFieldsDto.VERIFIED;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto6 = BaseUserGroupFieldsDto.PHOTO_BASE;
        e = e43.l(baseUserGroupFieldsDto, baseUserGroupFieldsDto2, baseUserGroupFieldsDto3, baseUserGroupFieldsDto4, baseUserGroupFieldsDto5, baseUserGroupFieldsDto6);
        BaseUserGroupFieldsDto baseUserGroupFieldsDto7 = BaseUserGroupFieldsDto.FIRST_NAME_GEN;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto8 = BaseUserGroupFieldsDto.LAST_NAME_GEN;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto9 = BaseUserGroupFieldsDto.FIRST_NAME_DAT;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto10 = BaseUserGroupFieldsDto.LAST_NAME_DAT;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto11 = BaseUserGroupFieldsDto.FRIEND_STATUS;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto12 = BaseUserGroupFieldsDto.IS_MEMBER;
        f = e43.l(baseUserGroupFieldsDto, baseUserGroupFieldsDto2, baseUserGroupFieldsDto3, baseUserGroupFieldsDto5, baseUserGroupFieldsDto4, baseUserGroupFieldsDto7, baseUserGroupFieldsDto8, baseUserGroupFieldsDto9, baseUserGroupFieldsDto10, baseUserGroupFieldsDto11, baseUserGroupFieldsDto12, BaseUserGroupFieldsDto.CAN_UPLOAD_STORY, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, baseUserGroupFieldsDto6);
        g = e43.l(baseUserGroupFieldsDto, baseUserGroupFieldsDto2, baseUserGroupFieldsDto7, baseUserGroupFieldsDto8, BaseUserGroupFieldsDto.FIRST_NAME_ACC, BaseUserGroupFieldsDto.LAST_NAME_ACC, baseUserGroupFieldsDto12, baseUserGroupFieldsDto4, baseUserGroupFieldsDto6);
    }

    public zgm0(jzi0 jzi0Var, kem0 kem0Var) {
        this.a = jzi0Var;
        this.b = kem0Var;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 a(UserId userId, Set set) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(yfb.x(bs.n((es) this.a.a, AccountSetPrivacyKeyDto.STORIES_EXCLUDE, null, j5g.O0(set), Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE))).U(new cfz(new h2h0(4), 14));
        m3y m3yVar = new m3y(new kpk0(4, this, userId), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(m3yVar, lVar, kVar, kVar);
    }

    @Override // xsna.qgm0
    public final void b(final int i, final UserId userId) {
        final ohm0 ohm0Var = this.b.d;
        ohm0Var.getClass();
        asu0.a.getClass();
        asu0.n().execute(new Runnable() { // from class: xsna.lhm0
            @Override // java.lang.Runnable
            public final void run() {
                ohm0.this.b.d(i, userId);
            }
        });
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.internal.operators.single.o c(int i, UserId userId, int i2) {
        tfx tfxVar = new tfx("stories.deleteQuestion", new ky80(8), new ajl0(1));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        tfx.l(tfxVar, "question_id", i2, 0, 0, 8);
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.W(yfb.x(tfxVar), 7).l(new h8e0(new y510(27), 1)), new r7a0(new vgm0(this, userId, i, i2), 12));
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.core.q<c3m0> d(UserId userId, int i, LoadStrategy loadStrategy) {
        tfx tfxVar = new tfx("stories.getDetailedStats", new bzk0(2), new n5e0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(yfb.x(tfxVar)).U(new qw80(new b(1, (psl0) this.c.a.getValue(), psl0.class, "map", "map(Lcom/vk/api/generated/stories/dto/StoriesGetStatsV5200ResponseDto;)Lcom/vk/dto/stories/entities/StoryFullStatContainer;", 0), 9));
        ca10 ca10Var = new ca10(new xva(this, userId, i, 2), 26);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = U.E(ca10Var, lVar, kVar, kVar);
        fch fchVar = this.b.c;
        io.reactivex.rxjava3.core.q<T> r = new io.reactivex.rxjava3.internal.operators.maybe.b0(new io.reactivex.rxjava3.internal.operators.maybe.u(((cfm0) fchVar.b).a(i, userId), new uq80(new exi0(fchVar, 8), 4)).n(asu0.a.c()), lVar, lVar, new j990(new fuh0(4), 9), kVar, kVar).r();
        int i2 = a.$EnumSwitchMapping$0[loadStrategy.ordinal()];
        if (i2 == 1) {
            return E.n0(new io.reactivex.rxjava3.internal.operators.observable.n1(r, io.reactivex.rxjava3.internal.functions.a.g));
        }
        if (i2 == 2) {
            return r.c0(E);
        }
        if (i2 == 3) {
            return E;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.core.q<Set<UserId>> e(UserId userId, UserId userId2) {
        return j(userId, LoadStrategy.ONLY_API).s0(new z250(new ogd(userId2, this, userId, 8), 8));
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.core.q<tnm0> f(v3u0 v3u0Var, LoadStrategy loadStrategy) {
        UserId userId;
        boolean z;
        ArrayList arrayList;
        int i = v3u0Var.b;
        UserId userId2 = v3u0Var.a;
        int i2 = v3u0Var.c;
        String str = v3u0Var.d;
        boolean z2 = v3u0Var.e;
        tfx tfxVar = new tfx("stories.getViewers", new nq(25), new oq(29));
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        if (userId2 != null) {
            userId = userId2;
            z = z2;
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        } else {
            userId = userId2;
            z = z2;
        }
        tfx.l(tfxVar, "count", i2, 0, 0, 8);
        tfxVar.j("extended", true);
        tfxVar.j("with_anons", z);
        List<BaseUserGroupFieldsDto> list = e;
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(yfb.x(tfxVar)).U(new q9f0(new c(1, (ssl0) this.c.b.getValue(), ssl0.class, "map", "map(Lcom/vk/api/generated/stories/dto/StoriesGetViewersExtendedV5115ResponseDto;)Lcom/vk/dto/stories/entities/StoryViewersResponse;", 0), 2));
        o3y o3yVar = new o3y(new nm1(26, v3u0Var, this), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = U.E(o3yVar, lVar, kVar, kVar);
        ohm0 ohm0Var = this.b.d;
        int i3 = v3u0Var.b;
        io.reactivex.rxjava3.core.q<T> r = new io.reactivex.rxjava3.internal.operators.maybe.b0(new io.reactivex.rxjava3.internal.operators.single.t(io.reactivex.rxjava3.core.x.B(ohm0Var.a.d(i3, userId), ohm0Var.b.a(i3, userId).o(new bim0(userId, i3, 0, 0, 0, 0)), new e4t(new hue(ohm0Var, 12), 15)), new tj60(new wgm0(loadStrategy, 0), 13)).n(asu0.a.c()), lVar, lVar, new oo20(new cv1(loadStrategy, this, v3u0Var, 6), 25), kVar, kVar).r();
        int i4 = a.$EnumSwitchMapping$0[loadStrategy.ordinal()];
        if (i4 == 1) {
            return E.n0(new io.reactivex.rxjava3.internal.operators.observable.n1(r, io.reactivex.rxjava3.internal.functions.a.g));
        }
        if (i4 == 2) {
            return r.c0(E);
        }
        if (i4 == 3) {
            return E;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.core.q<Set<UserId>> g(UserId userId, UserId userId2) {
        return j(userId, LoadStrategy.ONLY_API).s0(new a0m0(new yl3(userId2, this, userId, 4), 2));
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 h(int i, UserId userId, boolean z) {
        return rsg0.T(yfb.x(jub0.a((kub0) this.a.b, i, userId, Boolean.valueOf(z), 96))).U(new o860(new fda0(this, 13), 9));
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> i(rqe0 rqe0Var, LoadStrategy loadStrategy, boolean z) {
        ArrayList arrayList;
        UserId userId = rqe0Var.a;
        int i = rqe0Var.b;
        int i2 = rqe0Var.d;
        int i3 = rqe0Var.c;
        tfx tfxVar = new tfx("stories.getQuestions", new wga0(5), new uul0(0));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        tfxVar.j("extended", true);
        tfxVar.j("with_anons", true);
        List<BaseUserGroupFieldsDto> list = g;
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i2, 0, 0, 8);
        tfxVar.f(i3, 1, 100, "count");
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(yfb.x(tfxVar)).U(new t9c0(2, new isb0(4, this, rqe0Var)));
        x150 x150Var = new x150(new r9n(this, rqe0Var, z, 1), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = U.E(x150Var, lVar, kVar, kVar);
        h0b h0bVar = this.b.g;
        UserId userId2 = rqe0Var.a;
        int i4 = rqe0Var.b;
        io.reactivex.rxjava3.core.q<T> r = new io.reactivex.rxjava3.internal.operators.maybe.b0(new io.reactivex.rxjava3.internal.operators.single.t(io.reactivex.rxjava3.core.x.B(((yfm0) h0bVar.b).d(i4, userId2), ((egm0) h0bVar.c).a(i4, userId2).o(new hgm0(userId2, i4, 0)), new ie40(new a86(h0bVar, 15), 13)), new uxb0(new ggb0(loadStrategy, 15), 8)).n(asu0.a.c()), lVar, lVar, new d120(new f55(loadStrategy, this, rqe0Var, 7), 18), kVar, kVar).r();
        int i5 = a.$EnumSwitchMapping$0[loadStrategy.ordinal()];
        if (i5 == 1) {
            return E.n0(new io.reactivex.rxjava3.internal.operators.observable.n1(r, io.reactivex.rxjava3.internal.functions.a.g));
        }
        if (i5 == 2) {
            return r.c0(E);
        }
        if (i5 == 3) {
            return E;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.core.q<Set<UserId>> j(UserId userId, LoadStrategy loadStrategy) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(yfb.x(((es) this.a.a).d(Collections.singletonList(AccountSetPrivacyKeyDto.STORIES_EXCLUDE.i()), Boolean.FALSE, Boolean.TRUE))).U(new mvc0(new t3v(18), 4));
        tl30 tl30Var = new tl30(new s1f0(3, this, userId), 26);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = U.E(tl30Var, lVar, kVar, kVar);
        io.reactivex.rxjava3.core.q<T> r = new io.reactivex.rxjava3.internal.operators.maybe.b0(new io.reactivex.rxjava3.internal.operators.maybe.u(((rem0) this.b.e.b).c(userId), new eq0(new fo20(24), 29)).n(asu0.a.c()), lVar, lVar, new s440(new ygm0(0), 16), kVar, kVar).r();
        int i = a.$EnumSwitchMapping$0[loadStrategy.ordinal()];
        if (i == 1) {
            return E.n0(new io.reactivex.rxjava3.internal.operators.observable.n1(r, io.reactivex.rxjava3.internal.functions.a.g));
        }
        if (i == 2) {
            return r.c0(E);
        }
        if (i == 3) {
            return E;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.internal.operators.single.y k(int i, UserId userId, int i2) {
        tfx tfxVar = new tfx("stories.unbanQuestionAuthor", new tr(28), new ggj0(4));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        tfx.l(tfxVar, "question_id", i2, 0, 0, 8);
        return rsg0.W(yfb.x(tfxVar), 7).l(new ugm0(new x620(25), 0));
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.internal.operators.single.y l(int i, UserId userId, int i2) {
        tfx tfxVar = new tfx("stories.banQuestionAuthor", new trk0(2), new xga0(3));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        tfx.l(tfxVar, "question_id", i2, 0, 0, 8);
        return rsg0.W(yfb.x(tfxVar), 7).l(new x6h0(new dl70(19), 3));
    }

    @Override // xsna.qgm0
    public final io.reactivex.rxjava3.core.q<List<StoriesContainer>> m(UserId userId, int i, String str, LoadStrategy loadStrategy) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("stories.getReplies", new zyk0(2), new azk0(2));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        tfxVar.j("extended", true);
        List<BaseUserGroupFieldsDto> list = f;
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(yfb.x(tfxVar)).U(new ga40(new or50(this, 26), 11));
        wx00 wx00Var = new wx00(new rgm0(this, userId, i, 0), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = U.E(wx00Var, lVar, kVar, kVar);
        io.reactivex.rxjava3.core.q<T> r = new io.reactivex.rxjava3.internal.operators.maybe.b0(new io.reactivex.rxjava3.internal.operators.single.t(((pgm0) this.b.f.b).b(), new x310(new b4u(userId, i, 1), 9)).n(asu0.a.c()), lVar, lVar, new uk40(new pqz(29), 16), kVar, kVar).r();
        int i2 = a.$EnumSwitchMapping$0[loadStrategy.ordinal()];
        if (i2 == 1) {
            return E.n0(new io.reactivex.rxjava3.internal.operators.observable.n1(r, io.reactivex.rxjava3.internal.functions.a.g));
        }
        if (i2 == 2) {
            return r.c0(E);
        }
        if (i2 == 3) {
            return E;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qgm0
    public final void n(List<? extends StoryEntry> list) {
        itg0.l(new io.reactivex.rxjava3.internal.operators.single.s(((pgm0) this.b.f.b).b().l(new ohl0(new p6e0(7), 2)), new si60(new eci0(4, this, list), 9)).q(asu0.a.c()));
    }
}
