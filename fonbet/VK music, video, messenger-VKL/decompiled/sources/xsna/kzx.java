package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vk.voip.ui.change_name.ui.result.VoipChangeNameResult;
import com.vk.voip.ui.join.directly.withpreview.JoinCallConfig;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.bzx;
import xsna.mzx;
import xsna.pzx;
import xsna.s0y;
import xsna.uzx;
import xsna.wqu;

/* compiled from: JoinCallFeature.kt */
/* loaded from: classes7.dex */
public final class kzx extends wk50<yzx, uzx, bzx, pzx> {
    public final JoinCallConfig f;
    public final jsa g;
    public final emu h;
    public final lyk0 i;
    public final fhw0 j;
    public final b25 k;
    public final w89 l;
    public final bpn0 m;
    public final f4z<mzx> n;
    public final f4z<vzx> o;
    public final f4z<hxw> p;

    public kzx(tzx tzxVar, boolean z, JoinCallConfig joinCallConfig, jsa jsaVar, emu emuVar, lyk0 lyk0Var, fhw0 fhw0Var, b25 b25Var, w89 w89Var) {
        super(bzx.b.b, tzxVar);
        this.f = joinCallConfig;
        this.g = jsaVar;
        this.h = emuVar;
        this.i = lyk0Var;
        this.j = fhw0Var;
        this.k = b25Var;
        this.l = w89Var;
        this.m = new bpn0(new vi0(24));
        this.n = new f4z<>();
        this.o = new f4z<>();
        this.p = new f4z<>();
        lyk0Var.f(z);
    }

    @Override // xsna.wk50
    public final void N(uzx uzxVar, bzx bzxVar) {
        String str;
        s0y.a aVar;
        boolean z;
        uzx uzxVar2 = uzxVar;
        bzx bzxVar2 = bzxVar;
        boolean z2 = bzxVar2 instanceof bzx.b;
        int i = 0;
        w89 w89Var = this.l;
        jsa jsaVar = this.g;
        lyk0 lyk0Var = this.i;
        JoinCallConfig joinCallConfig = this.f;
        if (z2) {
            fhw0 fhw0Var = this.j;
            if (fhw0Var.isInitialized()) {
                T(pzx.a.c.b);
                JoinCallConfig.ConfigCallPreview configCallPreview = joinCallConfig.c;
                CallId callId = joinCallConfig.e;
                String str2 = joinCallConfig.b;
                JoinData joinData = joinCallConfig.d;
                int i2 = 19;
                int i3 = 29;
                int i4 = 3;
                int i5 = 5;
                if ((configCallPreview == null || joinData == null) && myc0.f(str2)) {
                    String str3 = joinCallConfig.b;
                    io.reactivex.rxjava3.core.x xVar = (io.reactivex.rxjava3.core.x) w89Var.b.getValue();
                    jo3 jo3Var = new jo3(new o9(i5, str3, w89Var), i4);
                    xVar.getClass();
                    a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.r(xVar, jo3Var), new eph(this, i3), new sop(this, i2), 1);
                } else if (callId.c && myc0.f(str2)) {
                    String str4 = joinCallConfig.b;
                    io.reactivex.rxjava3.core.x xVar2 = (io.reactivex.rxjava3.core.x) w89Var.b.getValue();
                    jo3 jo3Var2 = new jo3(new o9(i5, str4, w89Var), i4);
                    xVar2.getClass();
                    a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.r(xVar2, jo3Var2), new eph(this, i3), new sop(this, i2), 1);
                } else {
                    JoinCallConfig.ConfigCallPreview configCallPreview2 = joinCallConfig.c;
                    if (configCallPreview2 != null && joinData != null) {
                        String str5 = configCallPreview2.c;
                        String str6 = joinCallConfig.b;
                        int i6 = configCallPreview2.b;
                        CallId callId2 = joinCallConfig.e;
                        String a = jsaVar.a();
                        JoinData joinData2 = joinCallConfig.d;
                        if (callId.d) {
                            JoinCallConfig.JoinAs joinAs = joinCallConfig.g;
                            if (joinAs.b || joinAs.c || joinAs.d) {
                                z = true;
                                T(new pzx.a.b(a, callId2, str5, str6, i6, joinData2, z, joinCallConfig.f, lyk0Var.c(), lyk0Var.e()));
                            }
                        }
                        z = false;
                        T(new pzx.a.b(a, callId2, str5, str6, i6, joinData2, z, joinCallConfig.f, lyk0Var.c(), lyk0Var.e()));
                    }
                }
            } else {
                this.e.b(io.reactivex.rxjava3.kotlin.c.d(fhw0Var.a(), new yqf(this, 28), new xa9(L.a, 6)));
            }
        } else {
            boolean z3 = bzxVar2 instanceof bzx.c;
            VoipChangeNameConfig.PreselectedUser anonym = null;
            f4z<mzx> f4zVar = this.n;
            if (z3) {
                if (uzxVar2 instanceof uzx.a) {
                    uzx.a aVar2 = (uzx.a) uzxVar2;
                    uzx.a.AbstractC3860a abstractC3860a = aVar2.f;
                    if (abstractC3860a instanceof uzx.a.AbstractC3860a.c) {
                        anonym = VoipChangeNameConfig.PreselectedUser.User.b;
                    } else if (abstractC3860a instanceof uzx.a.AbstractC3860a.b) {
                        anonym = new VoipChangeNameConfig.PreselectedUser.Group(((uzx.a.AbstractC3860a.b) abstractC3860a).b.P0());
                    } else if (abstractC3860a instanceof uzx.a.AbstractC3860a.C3861a) {
                        anonym = new VoipChangeNameConfig.PreselectedUser.Anonym(((uzx.a.AbstractC3860a.C3861a) abstractC3860a).b);
                    } else if (!(abstractC3860a instanceof uzx.a.AbstractC3860a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VoipChangeNameConfig.PreselectedUser preselectedUser = anonym;
                    if (preselectedUser != null) {
                        CallId callId3 = aVar2.b;
                        JoinCallConfig.JoinAs joinAs2 = joinCallConfig.g;
                        f4zVar.b(new mzx.c(preselectedUser, callId3, joinAs2.b, joinAs2.c, joinAs2.d));
                    }
                }
            } else if (!(bzxVar2 instanceof bzx.e)) {
                boolean z4 = bzxVar2 instanceof bzx.f;
                bpn0 bpn0Var = this.m;
                if (z4) {
                    if (uzxVar2 instanceof uzx.a) {
                        uzx.a aVar3 = (uzx.a) uzxVar2;
                        boolean z5 = aVar3.i.a;
                        boolean z6 = !z5;
                        fzx fzxVar = (fzx) bpn0Var.getValue();
                        CallId callId4 = aVar3.b;
                        pvw0 pvw0Var = fzxVar.a;
                        if (z5) {
                            pvw0Var.R(callId4);
                        } else {
                            pvw0Var.T(callId4);
                        }
                        lyk0Var.f(z6);
                        T(pzx.c.a.b);
                    }
                } else if (bzxVar2 instanceof bzx.g) {
                    if (uzxVar2 instanceof uzx.a) {
                        uzx.a aVar4 = (uzx.a) uzxVar2;
                        boolean z7 = aVar4.j;
                        boolean z8 = !z7;
                        fzx fzxVar2 = (fzx) bpn0Var.getValue();
                        CallId callId5 = aVar4.b;
                        pvw0 pvw0Var2 = fzxVar2.a;
                        if (z7) {
                            pvw0Var2.I0(callId5);
                        } else {
                            pvw0Var2.C0(callId5);
                        }
                        Object obj = lyk0Var.c;
                        Preference.I("JoinCallStorage", "mic_state", z8);
                        T(pzx.c.b.b);
                    }
                } else if (bzxVar2 instanceof bzx.d) {
                    bzx.d dVar = (bzx.d) bzxVar2;
                    if (uzxVar2 instanceof uzx.a) {
                        VoipChangeNameResult.JoinAs joinAs3 = dVar.b.b;
                        if (joinAs3 instanceof VoipChangeNameResult.JoinAs.CurrentUser) {
                            T(new pzx.b.C3541b(this.k.o(), new og0(((VoipChangeNameResult.JoinAs.CurrentUser) joinAs3).b, jsaVar.a())));
                        } else {
                            int i7 = 2;
                            int i8 = 25;
                            int i9 = 24;
                            if (joinAs3 instanceof VoipChangeNameResult.JoinAs.Group) {
                                UserId a2 = fkq0.a(((VoipChangeNameResult.JoinAs.Group) joinAs3).b);
                                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(wqu.a.b(this.h.b, Collections.singletonList(a2), null, null, 6))).l(new y7(new dmu(a2, i), i9)), new v8(new k7f(this, i8), i9)), new cdd(this, i7)), new igh(this, 21), new dwg(this, 26), 1);
                            } else {
                                if (!(joinAs3 instanceof VoipChangeNameResult.JoinAs.Anonym)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                String str7 = ((VoipChangeNameResult.JoinAs.Anonym) joinAs3).b;
                                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(w89Var.a(((uzx.a) uzxVar2).d, str7), new v8(new k7f(this, i8), i9)), new cdd(this, i7)), new cq3(17, this, str7), new jzx(1, this, kzx.class, "handleAnonJoinError", "handleAnonJoinError(Ljava/lang/Throwable;)V", 0), 1);
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } else if (bzxVar2 instanceof dzx) {
                    uzx.a aVar5 = uzxVar2 instanceof uzx.a ? (uzx.a) uzxVar2 : null;
                    String str8 = aVar5 != null ? aVar5.d : null;
                    if (str8 != null && !drm0.N(str8)) {
                        ((fzx) bpn0Var.getValue()).a.n(((uzx.a) uzxVar2).b);
                        f4zVar.b(new mzx.d(joinCallConfig.f.c, str8));
                    }
                } else if (bzxVar2 instanceof czx) {
                    f4zVar.b(mzx.a.a);
                } else if (bzxVar2 instanceof ezx) {
                    uzx.a aVar6 = uzxVar2 instanceof uzx.a ? (uzx.a) uzxVar2 : null;
                    if (aVar6 != null && (str = aVar6.d) != null && !drm0.N(str)) {
                        if (BuildInfo.s() || BuildInfo.t()) {
                            f4zVar.b(new mzx.f(((uzx.a) uzxVar2).b, str));
                        } else {
                            ((fzx) bpn0Var.getValue()).a.C(((uzx.a) uzxVar2).b);
                            f4zVar.b(new mzx.e(str));
                        }
                    }
                } else {
                    if (!(bzxVar2 instanceof bzx.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if ((uzxVar2 instanceof uzx.a) && ((uzx.a) uzxVar2).i.a) {
                        this.p.b(new hxw());
                    }
                }
            } else if (uzxVar2 instanceof uzx.a) {
                uzx.a aVar7 = (uzx.a) uzxVar2;
                CallId callId6 = aVar7.b;
                boolean z9 = aVar7.i.a;
                boolean z10 = aVar7.j;
                kyv j = g2v.c().j();
                uzx.a.AbstractC3860a abstractC3860a2 = aVar7.f;
                if (abstractC3860a2 instanceof uzx.a.AbstractC3860a.c) {
                    uzx.a.AbstractC3860a.c cVar = (uzx.a.AbstractC3860a.c) abstractC3860a2;
                    aVar = new s0y.a.c(cVar.a, cVar.b, cVar.c);
                } else if (abstractC3860a2 instanceof uzx.a.AbstractC3860a.b) {
                    uzx.a.AbstractC3860a.b bVar = (uzx.a.AbstractC3860a.b) abstractC3860a2;
                    aVar = new s0y.a.b(bVar.a, bVar.b);
                } else if (abstractC3860a2 instanceof uzx.a.AbstractC3860a.C3861a) {
                    uzx.a.AbstractC3860a.C3861a c3861a = (uzx.a.AbstractC3860a.C3861a) abstractC3860a2;
                    aVar = new s0y.a.C3646a(c3861a.b, c3861a.a);
                } else {
                    if (!(abstractC3860a2 instanceof uzx.a.AbstractC3860a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = s0y.a.d.a;
                }
                f4zVar.b(new mzx.b(new s0y(callId6, z9, z10, j, aVar, aVar7.h, aVar7.k)));
                f4zVar.b(mzx.a.a);
            }
        }
        s3q0 s3q0Var2 = s3q0.a;
    }
}
