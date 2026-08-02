package xsna;

import android.content.Context;
import com.vk.api.generated.donut.dto.DonutGetInfoFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: CommunityProfileLoadFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class arh {
    public final csh a;
    public final a b;
    public final bhu c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final b e;
    public final neh f;
    public final boolean g;
    public final yte h;
    public final kp1 i;
    public final ioh j;
    public final Object k;
    public final io.reactivex.rxjava3.disposables.g l;
    public final io.reactivex.rxjava3.disposables.g m;
    public final quh n;
    public final bz o;
    public final bwh p;
    public final veh q;
    public final Object r;
    public final Object s;

    /* compiled from: CommunityProfileLoadFeatureDelegate.kt */
    public static final class a {
        public final ExtendedProfilesRepository a;
        public final zof b;
        public final bpn0 c;

        public a(ExtendedProfilesRepository extendedProfilesRepository, zof zofVar, bpn0 bpn0Var) {
            this.a = extendedProfilesRepository;
            this.b = zofVar;
            this.c = bpn0Var;
        }
    }

    /* compiled from: CommunityProfileLoadFeatureDelegate.kt */
    public static final class b {
        public final cih a;
        public final mth b;
        public final ouh c;
        public final yrh d;
        public final yqh e;
        public final gul0 f;
        public final ceh g;
        public final mmh h;

        public b(cih cihVar, mth mthVar, ouh ouhVar, yrh yrhVar, yqh yqhVar, gul0 gul0Var, ceh cehVar, mmh mmhVar) {
            this.a = cihVar;
            this.b = mthVar;
            this.c = ouhVar;
            this.d = yrhVar;
            this.e = yqhVar;
            this.f = gul0Var;
            this.g = cehVar;
            this.h = mmhVar;
        }
    }

    public arh(csh cshVar, a aVar, bhu bhuVar, io.reactivex.rxjava3.disposables.b bVar, b bVar2, neh nehVar, boolean z, yte yteVar, kp1 kp1Var, ioh iohVar) {
        this.a = cshVar;
        this.b = aVar;
        this.c = bhuVar;
        this.d = bVar;
        this.e = bVar2;
        this.f = nehVar;
        this.g = z;
        this.h = yteVar;
        this.i = kp1Var;
        this.j = iohVar;
        brh brhVar = new brh(0, this, arh.class, "createAdditionalFields", "createAdditionalFields()Ljava/lang/String;", 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, brhVar);
        this.l = new io.reactivex.rxjava3.disposables.g();
        this.m = new io.reactivex.rxjava3.disposables.g();
        Context context = e43.a;
        this.n = new quh(context == null ? null : context);
        this.o = new bz(15);
        this.p = new bwh(kp1Var);
        this.q = new veh(bVar, kp1Var);
        this.r = msy.a(lazyThreadSafetyMode, new jb(13));
        this.s = msy.a(lazyThreadSafetyMode, new pr6(7));
    }

    public final void a() {
        this.h.invoke(new d.g(new CommunityProfileContent(this.a.a, (List) EmptyList.b, (ContentTab) null, (String) null, false, (Integer) null, (CommunityProfileContent.InitialPosition) null, false, false, (Pair) null, 1916)));
    }

    public final void b(ExtendedCommunityProfile extendedCommunityProfile) {
        if (this.g) {
            neh nehVar = this.f;
            io.reactivex.rxjava3.internal.operators.observable.j1 U = nehVar.a(extendedCommunityProfile).U(new w7(new wv2(nehVar, 2), 14));
            c60 c60Var = new c60(new mmf(this, 10), 16);
            int i = kwg0.a;
            this.l.b(U.subscribe(c60Var, new iwg0()));
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    public final ExtendedProfilesRepository.a c(ExtendedProfilesRepository.LoadStrategy loadStrategy) {
        csh cshVar = this.a;
        UserId userId = cshVar.a;
        boolean k = this.b.b.k();
        j0r j0rVar = yts.c;
        String str = cshVar.d;
        String str2 = (String) this.k.getValue();
        boolean booleanValue = ((Boolean) this.s.getValue()).booleanValue();
        mmh mmhVar = this.e.h;
        return new ExtendedProfilesRepository.a(userId, k, j0rVar, this.o, loadStrategy, str, null, str2, booleanValue, !mmhVar.b().g(cshVar.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.core.q<ptk<ExtendedCommunityProfile>> d(ExtendedProfilesRepository.a aVar) {
        byn bynVar = (byn) this.r.getValue();
        return this.b.a.S0(aVar).L(new bl(new h6g(new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.T(yfb.x(bynVar.a.b(aVar.a, Collections.singletonList(DonutGetInfoFieldsDto.GROUP_DONUT_BLOCK)))).U(new n7(new vt1(20), 23)), new rf1(new a60(27), 22)).g0().M0(0, new bn3(new j6e(this, 8), 18)), 5), 19), false);
    }

    public final void e(ExtendedCommunityProfile extendedCommunityProfile) {
        quh quhVar = this.n;
        quhVar.getClass();
        this.d.b((extendedCommunityProfile.W1 == null ? io.reactivex.rxjava3.internal.operators.observable.g0.b : nt0.e(quhVar.a, true).L(new y7(new oce(extendedCommunityProfile, 6), 11), false)).subscribe(new eu0(new b5h(extendedCommunityProfile, 1), 16)));
    }
}
