package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.admin_change_name.VoipAdminChangeNameConfig;
import com.vk.voip.userid.CallsUserId;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.adw0;
import xsna.ddw0;
import xsna.edw0;
import xsna.gdw0;

/* compiled from: VoipAdminChangeNameFeature.kt */
/* loaded from: classes7.dex */
public final class bdw0 extends wk50<hdw0, gdw0, adw0, edw0> {
    public final VoipAdminChangeNameConfig f;
    public final jsa g;
    public final f4z<ddw0> h;
    public final f4z<fmw0> i;

    public bdw0(fdw0 fdw0Var, VoipAdminChangeNameConfig voipAdminChangeNameConfig, jsa jsaVar) {
        super(adw0.c.b, fdw0Var);
        this.f = voipAdminChangeNameConfig;
        this.g = jsaVar;
        this.h = new f4z<>();
        this.i = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(gdw0 gdw0Var, adw0 adw0Var) {
        gdw0 gdw0Var2 = gdw0Var;
        adw0 adw0Var2 = adw0Var;
        boolean z = adw0Var2 instanceof adw0.c;
        VoipAdminChangeNameConfig voipAdminChangeNameConfig = this.f;
        if (z) {
            CallId callId = voipAdminChangeNameConfig.b;
            VoipAdminChangeNameConfig.ParticipantToChangeName participantToChangeName = voipAdminChangeNameConfig.d;
            Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
            String str = participantToChangeName.b;
            Long n = arm0.n(str);
            T(new edw0.a(callId, n == null ? new CallsUserId.ContactId(str) : new CallsUserId.VkUserId(new UserId(n.longValue())), participantToChangeName.d, participantToChangeName.c));
        } else if (adw0Var2 instanceof adw0.b) {
            adw0.b bVar = (adw0.b) adw0Var2;
            if (gdw0Var2 instanceof gdw0.a) {
                if (bVar instanceof adw0.b.C2537b) {
                    T(new edw0.c(((adw0.b.C2537b) bVar).b));
                } else {
                    if (!(bVar instanceof adw0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T(new edw0.c(""));
                }
            }
        } else if (adw0Var2 instanceof adw0.d.a) {
            this.h.b(ddw0.a.a);
        } else {
            if (!(adw0Var2 instanceof adw0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (gdw0Var2 instanceof gdw0.a) {
                gdw0.a aVar = (gdw0.a) gdw0Var2;
                CallsUserId callsUserId = aVar.d;
                String str2 = aVar.b;
                if (str2.length() <= 0 || str2.equals(aVar.c)) {
                    str2 = null;
                }
                io.reactivex.rxjava3.disposables.b bVar2 = this.e;
                final jsa jsaVar = this.g;
                if (str2 != null) {
                    CallId callId2 = voipAdminChangeNameConfig.b;
                    final UserId userId = voipAdminChangeNameConfig.c;
                    dz2 x = yfb.x(qd9.c(jsaVar.a, callId2.b, str2, callsUserId.getStringValue(), 120));
                    if (userId != null) {
                        x.j.put("group_id", String.valueOf(fkq0.e(userId).b));
                    }
                    io.reactivex.rxjava3.internal.operators.completable.w g = rsg0.Z(x).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.hsa
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            UserId userId2 = UserId.this;
                            jsa jsaVar2 = jsaVar;
                            if (userId2 == null) {
                                am0 am0Var = new am0(16);
                                jsaVar2.getClass();
                                jsa.c(am0Var);
                            } else {
                                ci3 ci3Var = new ci3(5);
                                jsaVar2.getClass();
                                jsa.c(ci3Var);
                            }
                        }
                    });
                    aas0 aas0Var = new aas0(new rzl0(this, 29), 7);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    io.reactivex.rxjava3.internal.operators.completable.h hVar = new io.reactivex.rxjava3.internal.operators.completable.h(new io.reactivex.rxjava3.internal.operators.completable.w(g, aas0Var, lVar, kVar, kVar, kVar, kVar), new cpd(this, 2));
                    asu0 asu0Var = asu0.a;
                    bVar2.b(io.reactivex.rxjava3.kotlin.c.d(hVar.q(asu0Var.c()).o(asu0Var.d()), new h6m0(this, 26), new bjm0(this, 20)));
                } else {
                    CallId callId3 = voipAdminChangeNameConfig.b;
                    UserId userId2 = voipAdminChangeNameConfig.c;
                    dz2 x2 = yfb.x(qd9.a(jsaVar.a, callId3.b, callsUserId.getStringValue(), 60));
                    if (userId2 != null) {
                        x2.j.put("group_id", String.valueOf(fkq0.e(userId2).b));
                    }
                    io.reactivex.rxjava3.internal.operators.completable.w g2 = rsg0.Z(x2).g(new hea(1, userId2, jsaVar));
                    asu0 asu0Var2 = asu0.a;
                    bVar2.b(io.reactivex.rxjava3.kotlin.c.d(g2.q(asu0Var2.c()).o(asu0Var2.d()), new ufu0(this, 6), new bws(29)));
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
