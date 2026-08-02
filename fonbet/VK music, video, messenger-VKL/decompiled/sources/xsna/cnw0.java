package xsna;

import android.content.Context;
import android.os.Handler;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.events.VoipException;
import com.vk.voip.ui.members.VoipDataProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.bnw0;
import xsna.c8x0;
import xsna.zmw0;

/* compiled from: VoipCoreDependenciesFactory.kt */
/* loaded from: classes7.dex */
public final class cnw0 implements zmw0 {
    public final h19 a;
    public final /* synthetic */ bnw0.a b;
    public final /* synthetic */ bnw0.b c;

    public cnw0(bnw0.a aVar, bnw0.b bVar) {
        this.b = aVar;
        this.c = bVar;
        this.a = new h19(bnw0.b, bnw0.c, new bpc0(11), aVar);
    }

    @Override // xsna.zmw0
    public final CallEffectsDependency a() {
        return this.c.a;
    }

    @Override // xsna.zmw0
    public final String[] b() {
        return (String[]) this.b.d.b.invoke();
    }

    @Override // xsna.zmw0
    public final io.reactivex.rxjava3.internal.operators.single.y c(String str) {
        com.vk.voip.ui.c.b.getClass();
        VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
        if (voipDataProvider == null) {
            voipDataProvider = null;
        }
        return voipDataProvider.h(Collections.singletonList(str)).l(new ao90(new ieo(str, 3), 12));
    }

    @Override // xsna.zmw0
    public final boolean d() {
        return ((Boolean) this.b.c.invoke()).booleanValue();
    }

    @Override // xsna.zmw0
    public final void e(zmw0.a aVar) {
        Handler handler = bnw0.a;
        Set<CallMemberId> set = aVar.a.h;
        if (set.isEmpty() || aVar.c == 1) {
            aVar.h.invoke(bnw0.b(aVar, EmptyList.b));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            UserId Bb = ((CallMemberId) it.next()).Bb();
            if (Bb != null) {
                arrayList.add(Bb);
            }
        }
        io.reactivex.rxjava3.kotlin.c.f(2, rsg0.y0(new kwt(arrayList), null, null, 3), null, new anw0(aVar, 0), new fda0(aVar, 26));
    }

    @Override // xsna.zmw0
    public final boolean f() {
        return ((Boolean) this.b.d.a.invoke()).booleanValue();
    }

    @Override // xsna.zmw0
    public final irw0 g() {
        return this.c.c;
    }

    @Override // xsna.zmw0
    public final Context getContext() {
        Context context = e43.a;
        if (context != null) {
            return context;
        }
        return null;
    }

    @Override // xsna.zmw0
    public final h19 h() {
        return this.a;
    }

    @Override // xsna.zmw0
    public final or2 i() {
        return this.c.d;
    }

    @Override // xsna.zmw0
    public final String[] j() {
        return (String[]) this.b.d.c.invoke();
    }

    @Override // xsna.zmw0
    public final fq4 k() {
        return this.c.b;
    }

    public final i3x0 l() {
        return this.c.e;
    }

    public final String m() {
        UserId userId;
        OKVoipEngine.b.getClass();
        io70 x = OKVoipEngine.x();
        x.getClass();
        dhw0 dhw0Var = OKVoipEngine.B;
        if (dhw0Var == null || !fkq0.c(dhw0Var.M)) {
            return x.e() ? x.a().a : bnw0.a().a() ? String.valueOf(bnw0.a().f().b) : "";
        }
        dhw0 dhw0Var2 = OKVoipEngine.B;
        if (dhw0Var2 == null || (userId = dhw0Var2.M) == null) {
            userId = UserId.d;
        }
        return String.valueOf(userId.b);
    }

    public final void n() {
        String m = m();
        if (drm0.N(m)) {
            return;
        }
        Serializer.c<CallMemberId> cVar = CallMemberId.CREATOR;
        CallMemberId.a.a(m);
    }

    public final String o() {
        OKVoipEngine.b.getClass();
        io70 x = OKVoipEngine.x();
        if (!bnw0.a().a()) {
            return "";
        }
        x.getClass();
        dhw0 dhw0Var = OKVoipEngine.B;
        return (dhw0Var == null || !fkq0.c(dhw0Var.M)) ? "" : String.valueOf(bnw0.a().f().b);
    }

    public final boolean p() {
        return ((Boolean) this.b.b.invoke()).booleanValue();
    }

    public final void q(String str, Throwable th) {
        com.vk.metrics.eventtracking.b.a.q(new VoipException(go9.b("Voip failed with info: tag=OKVoipEngine, message = ", str), th));
    }

    public final void r(boolean z) {
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.v = !z;
        com.vk.voip.ui.c.D0();
    }

    public final void s(k8x0 k8x0Var) {
        dhw0 dhw0Var;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        dhw0 dhw0Var2 = com.vk.voip.ui.c.O;
        if (dhw0Var2 != null) {
            cVar.getClass();
            dhw0Var = dhw0.a(dhw0Var2, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, k8x0Var, null, -1, 479);
        } else {
            dhw0Var = null;
        }
        cVar.X0(dhw0Var);
        com.vk.voip.ui.c.x.onNext(new c8x0.c(k8x0Var));
    }
}
