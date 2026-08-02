package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.builders.SetBuilder;
import xsna.g1e0;

/* compiled from: DialogsListProfilesSupplierImpl.kt */
/* loaded from: classes18.dex */
public final class itm implements htm, g4z {
    public final a1w b;
    public final io.reactivex.rxjava3.core.w c;
    public final LinkedHashSet d;
    public final io.reactivex.rxjava3.subjects.d<gtm> e;
    public final io.reactivex.rxjava3.disposables.b f;

    public itm(a1w a1wVar) {
        this.b = a1wVar;
        io.reactivex.rxjava3.core.w c = asu0.a.c();
        this.c = c;
        this.d = new LinkedHashSet();
        this.e = io.reactivex.rxjava3.subjects.d.O0(new gtm(0));
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f = bVar;
        bVar.b(a1wVar.l.a().a0(c).r0(c).subscribe(new x8(new frg(this, 8), 18)));
    }

    @Override // xsna.htm
    public final void a(SetBuilder setBuilder) {
        Set<? extends Peer> g;
        synchronized (this) {
            g = izi0.g(setBuilder, this.d);
            s3q0 s3q0Var = s3q0.a;
        }
        if (g.isEmpty()) {
            return;
        }
        i(this, Source.CACHE, g);
    }

    @Override // xsna.htm
    public final io.reactivex.rxjava3.subjects.d d() {
        return this.e;
    }

    @Override // xsna.htm
    public final void f(ProfilesInfo profilesInfo) {
        if (profilesInfo.isEmpty()) {
            return;
        }
        SetBuilder h = profilesInfo.Nb().h();
        LinkedHashSet linkedHashSet = this.d;
        linkedHashSet.addAll(izi0.g(izi0.g(h, linkedHashSet), profilesInfo.Ab().h()));
        j(profilesInfo);
    }

    public final void i(Object obj, Source source, Set<? extends Peer> set) {
        g1e0.a aVar = new g1e0.a();
        aVar.h(set);
        aVar.b = source;
        aVar.c = true;
        io.reactivex.rxjava3.internal.operators.single.c C = this.b.C(obj, new d1e0(new g1e0(aVar)));
        io.reactivex.rxjava3.core.w wVar = this.c;
        io.reactivex.rxjava3.internal.operators.single.b0 m = C.q(wVar).m(wVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new io.reactivex.rxjava3.internal.operators.flowable.o0(io.reactivex.rxjava3.core.g.i(0L));
        Optional.empty();
        Optional empty = Optional.empty();
        pq60 pq60Var = new pq60(1);
        int i = io.reactivex.rxjava3.core.g.b;
        if (1 + 2147483646 > 2147483647L) {
            throw new IllegalArgumentException("Integer overflow");
        }
        io.reactivex.rxjava3.core.g c0Var = new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.l0(), new b630(new u620(), 9));
        if (Optional.of(2).isPresent()) {
            c0Var = c0Var.n(((Number) r11.get()).intValue());
        }
        this.f.b(hg1.i(new io.reactivex.rxjava3.internal.operators.flowable.u0(new io.reactivex.rxjava3.internal.operators.flowable.r0(m.u(), new lfg0(c0Var, new kfg0(io.reactivex.rxjava3.internal.functions.a.g, arrayList2, arrayList), pq60Var, empty.isPresent() ? (io.reactivex.rxjava3.core.w) empty.get() : io.reactivex.rxjava3.schedulers.a.a()))), new defpackage.m(13, source, this)));
    }

    public final void j(ProfilesInfo profilesInfo) {
        synchronized (this) {
            gtm P0 = this.e.P0();
            Serializer.c<ProfilesInfo> cVar = ProfilesInfo.CREATOR;
            ProfilesInfo profilesInfo2 = new ProfilesInfo(P0.a);
            profilesInfo2.Hb(profilesInfo);
            this.e.onNext(new gtm(profilesInfo2, profilesInfo.Nb().h()));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.f.e();
    }
}
