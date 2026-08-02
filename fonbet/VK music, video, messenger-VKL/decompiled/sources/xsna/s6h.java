package xsna;

import android.content.Context;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.profile.community.subscription.api.tracker.SubscriptionEvent;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: CommunityJoinDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class s6h implements n6h {
    public final Context a;
    public final b3i b;
    public final o0r0 c;
    public final gxh d;
    public final zzx e;
    public final x2i f;
    public final wzs<UserId, Integer, s3q0> g;

    /* JADX WARN: Multi-variable type inference failed */
    public s6h(Context context, b3i b3iVar, o0r0 o0r0Var, gxh gxhVar, zzx zzxVar, x2i x2iVar, wzs<? super UserId, ? super Integer, s3q0> wzsVar) {
        this.a = context;
        this.b = b3iVar;
        this.c = o0r0Var;
        this.d = gxhVar;
        this.e = zzxVar;
        this.f = x2iVar;
        this.g = wzsVar;
    }

    @Override // xsna.n6h
    public final void a(ExtendedCommunityProfile extendedCommunityProfile, boolean z, String str, String str2, boolean z2, FullSourceJoinApi fullSourceJoinApi) {
        e(new oap.a(extendedCommunityProfile), z, str, str2, z2, fullSourceJoinApi);
    }

    @Override // xsna.n6h
    public final void c(Group group, boolean z, String str, String str2, FullSourceJoinApi fullSourceJoinApi) {
        e(new oap.b(group), z, str, str2, false, fullSourceJoinApi);
    }

    @Override // xsna.n6h
    public final void d(ExtendedCommunityProfile extendedCommunityProfile, String str) {
        oap.a aVar = new oap.a(extendedCommunityProfile);
        zzx zzxVar = this.e;
        if (zzxVar != null) {
            zzxVar.a(xus.t(aVar), str).subscribe(new c60(new qt5(6, this, aVar), 13), new bn3(new sm0(11), 16));
        }
        o1e0.a.a(new h8q0(xus.t(aVar), false));
    }

    public final void e(oap<ExtendedCommunityProfile, ? extends Group> oapVar, boolean z, String str, String str2, boolean z2, FullSourceJoinApi fullSourceJoinApi) {
        itg0.m(com.vkontakte.android.data.b.d());
        UserId a = fkq0.a(xus.t(oapVar));
        boolean z3 = !z;
        if (str == null) {
            str = "community_page";
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new j0y(a, z3, str, true, str2, fullSourceJoinApi), null, null, 3);
        tf1 tf1Var = new tf1(new h6g(this, 4), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = y0.E(tf1Var, lVar, kVar, kVar);
        (z2 ? new io.reactivex.rxjava3.internal.operators.observable.c0(E, new pp3(new i4e(this, 10), 12), kVar).C(new cm4(this, 3)).F(new m20(new com.vk.im.engine.internal.api_commands.messages.a(this, 25), 15)) : hg1.m(E, this.a, 0L, false, 62)).subscribe(new um0(new q6h(this, oapVar, z, 0), 18), new wf1(new r6h(oapVar, z, this), 16));
        o1e0.a.a(new h8q0(xus.t(oapVar), false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(oap<ExtendedCommunityProfile, ? extends Group> oapVar, boolean z, m0y m0yVar) {
        int i;
        int i2;
        ExtendedCommunityProfile a;
        if (xus.h(oapVar) == 5) {
            int i3 = dpu.a;
            o1e0.a.a(new a9l(2));
        }
        int h = xus.h(oapVar);
        int h2 = xus.h(oapVar);
        boolean z2 = oapVar instanceof oap.b;
        if (z2) {
            i = ((Group) ((oap.b) oapVar).a).m;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = ((ExtendedCommunityProfile) ((oap.a) oapVar).a).Z;
        }
        if (z2) {
            i2 = ((Group) ((oap.b) oapVar).a).s;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = ((ExtendedCommunityProfile) ((oap.a) oapVar).a).a0;
        }
        int i4 = z ? 1 : 2;
        if (i != 0 && h2 != 5 && i2 <= 0) {
            i4 = 4;
        }
        xus.u(oapVar, i4);
        if (xus.h(oapVar) == 1 && (a = oapVar.a()) != null) {
            a.z1 = null;
        }
        int h3 = xus.h(oapVar);
        b3i b3iVar = this.b;
        if (h3 == 1) {
            if (b3iVar != null) {
                b3iVar.a(SubscriptionEvent.JOIN_GROUP_OUT);
            }
        } else if (xus.h(oapVar) == 2 && h == 1 && b3iVar != null) {
            b3iVar.a(SubscriptionEvent.LEAVE_GROUP_OUT);
        }
        GroupsSuggestions groupsSuggestions = m0yVar != null ? m0yVar.b : null;
        ExtendedCommunityProfile a2 = oapVar.a();
        if (a2 != null) {
            a2.n2 = groupsSuggestions;
        }
        e4h h0 = this.c.h0();
        Context context = e43.a;
        h0.h(xus.h(oapVar), context != null ? context : null, xus.t(oapVar));
        wzs<UserId, Integer, s3q0> wzsVar = this.g;
        if (wzsVar != null) {
            wzsVar.invoke(xus.t(oapVar), Integer.valueOf(xus.h(oapVar)));
        }
    }
}
