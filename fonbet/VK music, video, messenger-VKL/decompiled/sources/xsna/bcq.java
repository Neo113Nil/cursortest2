package xsna;

import android.location.Location;
import android.util.LruCache;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.owners.dto.OwnersGetContentTabsResponseDto;
import com.vk.api.generated.users.dto.UsersPinContentTabTabDto;
import com.vk.api.request.rx.batch.BatchRxApiRequest;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutFriendPreviewUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.functions.a;
import java.net.ConnectException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import xsna.wqu;
import xsna.z4h;

/* compiled from: ExtendedProfilesRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class bcq implements ExtendedProfilesRepository {
    public final klq0 a;
    public volatile ExtendedUserProfile b;
    public final LruCache<UserId, ExtendedUserProfile> c = new LruCache<>(32);
    public final LruCache<UserId, JSONObject> d = new LruCache<>(32);
    public final LruCache<UserId, OwnersGetContentTabsResponseDto> e = new LruCache<>(32);
    public final sj4 f = new sj4(this, 12);
    public final rf1 g = new rf1(this, 25);
    public final io.reactivex.rxjava3.subjects.h h = new io.reactivex.rxjava3.subjects.f().M0();
    public final u1r0 i = new u1r0();
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public bcq(klq0 klq0Var) {
        this.a = klq0Var;
        lg lgVar = new lg(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, lgVar);
        this.k = msy.a(lazyThreadSafetyMode, new mg(9));
        this.l = msy.a(lazyThreadSafetyMode, new ob0(10));
        this.m = msy.a(lazyThreadSafetyMode, new vg0(12));
    }

    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final void D(ExtendedProfilesRepository.b bVar) {
        g1(bVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.internal.operators.single.r L(UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.D0(yfb.x(nib.d((nib) this.j.getValue(), null, null, userId, null, null, 458751))), new gv(new n82(19), 19));
    }

    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final ExtendedUserProfile L0(UserId userId) {
        return c1(userId, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.internal.operators.observable.b1 P(int i, UserId userId) {
        return rsg0.Z(yfb.x(((c690) this.k.getValue()).b(i, fkq0.e(userId))));
    }

    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.internal.operators.observable.j1 S0(ExtendedProfilesRepository.a aVar) {
        List list;
        b9 b9Var;
        Float f;
        Float f2;
        ptk ptkVar;
        ExtendedProfilesRepository.LoadStrategy loadStrategy = aVar.e;
        UserId userId = aVar.a;
        boolean z = aVar.i;
        Location location = aVar.g;
        aay aayVar = z ? DonutFriendPreviewUserProfile.i0 : UserProfile.g0;
        String str = aVar.f;
        boolean z2 = aVar.b;
        qj4 qj4Var = new qj4(aVar.c, 14);
        b9 b9Var2 = new b9(aVar.d, 18);
        String str2 = aVar.h;
        List c0 = str2 != null ? drm0.c0(str2, new String[]{StringUtils.COMMA}, 0, 6) : null;
        Float valueOf = location != null ? Float.valueOf((float) location.getLatitude()) : null;
        if (location != null) {
            list = c0;
            b9Var = b9Var2;
            f = valueOf;
            f2 = Float.valueOf((float) location.getLongitude());
        } else {
            list = c0;
            b9Var = b9Var2;
            f = valueOf;
            f2 = null;
        }
        ort ortVar = new ort(userId, str, z2, qj4Var, b9Var, list, aayVar, f, f2, Boolean.valueOf(aVar.j));
        ExtendedUserProfile c1 = c1(userId, null);
        ExtendedCommunityProfile extendedCommunityProfile = c1 instanceof ExtendedCommunityProfile ? (ExtendedCommunityProfile) c1 : null;
        b.d i = com.vk.toggle.b.A.i(ComFeatures.COM_SECTIONS_REDESIGN);
        String d = i != null ? i.d() : null;
        if (!epx.f(d, "B") && !epx.f(d, "C")) {
            return e1(userId, loadStrategy, ortVar, null).L(new nz(new mre(this, 18), 19), false).U(new pj4(new wje(extendedCommunityProfile, 19), 20));
        }
        tfx tfxVar = new tfx("owners.getContentTabs", new dt(22), new et(26));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        com.vk.api.request.rx.batch.e eVar = new com.vk.api.request.rx.batch.e(ortVar.d(), yfb.x(tfxVar), new ncb(ortVar, 2));
        eVar.t = true;
        eVar.u = BatchRxApiRequest.FailStrategy.DoNotFailOnError;
        io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(eVar);
        ez ezVar = new ez(new fre(this, 21), 20);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.core.q U = T.E(ezVar, lVar, kVar, kVar).U(new z8(new com.vk.movika.sdk.base.observable.s(27), 16));
        ExtendedUserProfile c12 = c1(userId, null);
        if (c12 != null) {
            c12.K1 = true;
            ptkVar = new ptk(c12, true);
        } else {
            ptkVar = null;
        }
        if (loadStrategy == ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST && ptkVar != null) {
            io.reactivex.rxjava3.internal.operators.observable.g1 T2 = io.reactivex.rxjava3.core.q.T(ptkVar);
            U = U.n0(T2).c0(T2);
        }
        return U.L(new kf3(new kdn(this, 3), 17), false).U(new iw3(new dwg(extendedCommunityProfile, 13), 11));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.internal.operators.observable.b1 T(int i, UserId userId) {
        return rsg0.Z(yfb.x(((c690) this.k.getValue()).d(i, fkq0.e(userId))));
    }

    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.internal.operators.observable.a X(com.vk.repository.data.api.a aVar, ListBuilder listBuilder) {
        ptk ptkVar;
        ComFeatures comFeatures = ComFeatures.COM_GET_FULL_PROFILE_NEW_NEW_LEGACY_API;
        comFeatures.getClass();
        qrt b1 = com.vk.toggle.b.A.a(comFeatures) ? b1(aVar) : a1(aVar);
        UserId userId = aVar.a;
        ExtendedProfilesRepository.LoadStrategy loadStrategy = aVar.j;
        String str = aVar.e;
        ovq0 ovq0Var = new ovq0("owners.getMainTab");
        ovq0Var.F(userId, "owner_id");
        ovq0Var.C(30, "count");
        ovq0Var.K("fields", "photo_base,sex,first_name_dat,last_name_dat,video_files,verified,trending,friend_status,first_name_gen,first_name_acc,emoji_status,image_status,can_write_private_message,can_message,has_unseen_stories,is_government_organization,is_verified,last_name_gen,deactivated,url,trust_mark,followers_count,members_count");
        ovq0Var.K("ref", CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        if (str != null) {
            ovq0Var.K("track_code", str);
        }
        Iterator<E> it = listBuilder.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ovq0Var.K((String) pair.d(), (String) pair.g());
        }
        com.vk.api.request.rx.batch.e eVar = new com.vk.api.request.rx.batch.e(b1.d(), ovq0Var, new com.vk.movika.tools.controls.seekbar.t(b1, 5));
        eVar.u = BatchRxApiRequest.FailStrategy.DoNotFailOnError;
        io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(eVar);
        iu1 iu1Var = new iu1(new rop(this, 2), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = T.E(iu1Var, lVar, kVar, kVar).U(new ju1(new gzn(3), 25));
        ExtendedUserProfile c1 = c1(userId, aVar.k);
        if (c1 != null) {
            c1.K1 = true;
            ptkVar = new ptk(c1, true);
        } else {
            ptkVar = null;
        }
        Pair pair2 = new Pair(ptkVar, this.d.get(userId));
        ptk ptkVar2 = (ptk) pair2.d();
        JSONObject jSONObject = (JSONObject) pair2.g();
        if (loadStrategy != ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST || ptkVar2 == null) {
            return U;
        }
        io.reactivex.rxjava3.internal.operators.observable.g1 T2 = io.reactivex.rxjava3.core.q.T(new Pair(ptkVar2, jSONObject));
        return U.n0(T2).c0(T2);
    }

    public final acq a1(com.vk.repository.data.api.a aVar) {
        UserId userId = aVar.a;
        if (!fkq0.c(userId)) {
            String str = aVar.k;
            userId = (str == null || str.length() == 0) ? o25.a().c() : UserId.d;
        }
        return new acq(aVar, this, userId);
    }

    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.core.q<List<ExtendedUserProfile.m>> b(UserId userId, boolean z) {
        ExtendedUserProfile extendedUserProfile = o25.a().a(userId) ? this.b : this.c.get(userId);
        if (extendedUserProfile != null && !z) {
            return io.reactivex.rxjava3.core.q.T(extendedUserProfile.P1);
        }
        this.i.getClass();
        tfx tfxVar = new tfx("users.getContentTabs", new qjk0(6), new rjk0(6));
        tfx.n(tfxVar, "user_id", userId, 1L, 0L, 8);
        tfxVar.j("scrollable_tabs", true);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new fq1(new uoh(this, 12), 16));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.internal.operators.observable.b1 b0(UserId userId) {
        return rsg0.Z(yfb.x(((c690) this.k.getValue()).a(fkq0.e(userId))));
    }

    public final rrt b1(com.vk.repository.data.api.a aVar) {
        UserId userId = aVar.a;
        if (!fkq0.c(userId)) {
            String str = aVar.k;
            userId = (str == null || str.length() == 0) ? o25.a().c() : UserId.d;
        }
        UserId userId2 = userId;
        rrt rrtVar = new rrt(userId2, aVar.k, aVar.l, aVar.b, aVar.c, aVar.d, aVar.g, new t7(aVar.h, 14), new bl(aVar.i, 21), this.g, this.f, o25.a().a(userId2));
        rrtVar.K("ref", aVar.m);
        rrtVar.K("track_code", aVar.e);
        rrtVar.R("track_events", aVar.f);
        return rrtVar;
    }

    public final ExtendedUserProfile c1(UserId userId, String str) {
        return (qr.f(userId) || (!fkq0.c(userId) && (str == null || str.length() == 0))) ? this.b : this.c.get(userId);
    }

    @Override // xsna.xic
    public final void clear() {
        this.c.evictAll();
        this.b = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.core.q<ptk<ExtendedCommunityProfile>> d1(ExtendedCommunityProfile extendedCommunityProfile) {
        boolean z = false;
        if (((Boolean) this.m.getValue()).booleanValue()) {
            z4h z4hVar = extendedCommunityProfile.g2;
            List<z4h.a> list = z4hVar != null ? z4hVar.a : null;
            if (list != null && !list.isEmpty()) {
                if (extendedCommunityProfile.a0 >= 3 && !extendedCommunityProfile.g()) {
                    z = true;
                }
                return rsg0.T(yfb.x(wqu.a.b((xqu) this.l.getValue(), Collections.singletonList(fkq0.e(extendedCommunityProfile.a.c)), Collections.singletonList(GroupsFieldsDto.MENU), null, 4))).U(new d9(new oo1(extendedCommunityProfile, z), 14));
            }
        }
        return io.reactivex.rxjava3.core.q.T(new ptk(extendedCommunityProfile, false));
    }

    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.subjects.h e() {
        return this.h;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.a e1(UserId userId, ExtendedProfilesRepository.LoadStrategy loadStrategy, qrt qrtVar, String str) {
        ptk ptkVar;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(qrtVar.d()).U(new w7(new dsc(qrtVar, 27), 19));
        fu0 fu0Var = new fu0(new oce(this, 22), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = U.E(fu0Var, lVar, kVar, kVar).U(new b8(new py(25), 21));
        ExtendedUserProfile c1 = c1(userId, str);
        if (c1 != null) {
            c1.K1 = true;
            ptkVar = new ptk(c1, true);
        } else {
            ptkVar = null;
        }
        if (loadStrategy != ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST || ptkVar == null) {
            return U2;
        }
        io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(ptkVar);
        return U2.n0(T).c0(T);
    }

    public final void f1(xy2<BaseOkResponseDto> xy2Var, ExtendedProfilesRepository.b bVar) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(xy2Var), null, null, 3);
        xf1 xf1Var = new xf1(new gb(17, this, bVar), 19);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        new io.reactivex.rxjava3.internal.operators.observable.n1(y0.E(xf1Var, lVar, kVar, kVar).F(new az(new wze(this, 23), 23)), io.reactivex.rxjava3.internal.functions.a.g).subscribe();
    }

    public final void g1(ExtendedProfilesRepository.b bVar) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            this.h.onNext(new Result(new Result.Failure(new ConnectException())));
        }
        boolean z = bVar.b;
        u1r0 u1r0Var = this.i;
        if (!z) {
            u1r0Var.getClass();
            tfx tfxVar = new tfx("users.unpinContentTab", new rq(28), new sq(28));
            tfxVar.j("scrollable_tabs", true);
            f1(tfxVar, bVar);
            return;
        }
        String str = bVar.a;
        UsersPinContentTabTabDto usersPinContentTabTabDto = null;
        if (str != null) {
            UsersPinContentTabTabDto[] values = UsersPinContentTabTabDto.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                UsersPinContentTabTabDto usersPinContentTabTabDto2 = values[i];
                if (epx.f(usersPinContentTabTabDto2.i(), str)) {
                    usersPinContentTabTabDto = usersPinContentTabTabDto2;
                    break;
                }
                i++;
            }
        }
        if (usersPinContentTabTabDto != null) {
            u1r0Var.getClass();
            tfx tfxVar2 = new tfx("users.pinContentTab", new fyp0(1), new qq(26));
            tfx.o(tfxVar2, "tab", usersPinContentTabTabDto.i(), 0, 0, 12);
            tfxVar2.j("scrollable_tabs", true);
            f1(tfxVar2, bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.internal.operators.observable.b1 l(int i, UserId userId) {
        return rsg0.Z(yfb.x(((c690) this.k.getValue()).c(i, fkq0.e(userId))));
    }

    @Override // xsna.xic
    public final long u() {
        return 0L;
    }

    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final void u0(ExtendedProfilesRepository.b bVar) {
        g1(bVar);
    }

    @Override // com.vk.repository.data.api.ExtendedProfilesRepository
    public final io.reactivex.rxjava3.internal.operators.observable.a w(com.vk.repository.data.api.a aVar) {
        ComFeatures comFeatures = ComFeatures.COM_GET_FULL_PROFILE_NEW_NEW_LEGACY_API;
        comFeatures.getClass();
        return e1(aVar.a, aVar.j, com.vk.toggle.b.A.a(comFeatures) ? b1(aVar) : a1(aVar), aVar.k);
    }
}
