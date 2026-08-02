package xsna;

import com.vk.api.generated.calls.dto.CallsGetGroupHistoryFilterDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryFilterDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.prodstat.analytics.base.common.VoipCallTypeAnalytics;
import com.vk.voip.ui.prodstat.analytics.call.click.VoipStartCallClickAnalytics;
import com.vk.voip.ui.prodstat.analytics.max.view.VoipMaxAppViewAnalytics;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;
import xsna.a7f0;
import xsna.a990;
import xsna.avw0;
import xsna.dd9;
import xsna.hg1;
import xsna.ho80;
import xsna.hp90;
import xsna.itw0;
import xsna.oo80;
import xsna.rp90;
import xsna.tlo0;
import xsna.to90;
import xsna.up90;
import xsna.vhg;
import xsna.vo90;
import xsna.vuw0;
import xsna.whg;
import xsna.wuw0;
import xsna.xuw0;
import xsna.y49;

/* compiled from: VoipPastCallsFeature.kt */
/* loaded from: classes7.dex */
public final class puw0 extends wk50<cvw0, avw0, r49, b59> {
    public final rd9 f;
    public final xp90 g;
    public final emu h;
    public final b25 i;
    public final kdw0<mdw0> j;
    public final f4z<x49> k;
    public final f4z<zhg> l;
    public final f4z<u49> m;
    public final xx1 n;
    public final qp90 o;
    public final bpn0 p;
    public final tp90 q;
    public final xhg r;
    public final vp90 s;
    public final so80 t;
    public final bpn0 u;

    public puw0(rd9 rd9Var, xp90 xp90Var, emu emuVar, q7h0 q7h0Var, rte0 rte0Var, cd9 cd9Var, b25 b25Var, kdw0 kdw0Var) {
        super(vhg.a.b, new zuw0());
        this.f = rd9Var;
        this.g = xp90Var;
        this.h = emuVar;
        this.i = b25Var;
        this.j = kdw0Var;
        f4z<x49> f4zVar = new f4z<>();
        this.k = f4zVar;
        f4z<zhg> f4zVar2 = new f4z<>();
        this.l = f4zVar2;
        f4z<u49> f4zVar3 = new f4z<>();
        this.m = f4zVar3;
        ouw0 ouw0Var = new ouw0(this);
        xx1 xx1Var = new xx1(9);
        this.n = xx1Var;
        qp90 qp90Var = new qp90();
        this.o = qp90Var;
        this.p = new bpn0(new vqe0(17));
        this.q = new tp90(xp90Var, qp90Var, xx1Var, new nuw0(this), ouw0Var);
        this.r = new xhg(f4zVar, f4zVar2, rte0Var, ouw0Var);
        this.s = new vp90(f4zVar, f4zVar3);
        this.t = new so80(f4zVar, f4zVar3, f4zVar2, q7h0Var, new v6h0(), ouw0Var);
        this.u = new bpn0(new m0t0(this, 7));
        io.reactivex.rxjava3.core.q<dd9.a> d = cd9Var.d(b25Var.c());
        hg1.v4 v4Var = new hg1.v4();
        d.getClass();
        a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0(d, v4Var).U(new hg1.u4()).w0(3L, TimeUnit.SECONDS), null, new ehm0(this, 18), new emh0(this, 27), null, 9);
    }

    public static VoipCallTypeAnalytics V(a59 a59Var) {
        a59.d a = a59Var.a();
        if (a instanceof a59.d.a) {
            return VoipCallTypeAnalytics.GROUP;
        }
        if (a instanceof a59.d.b) {
            return ((a59.d.b) a).a instanceof CallsUserId.ContactId ? VoipCallTypeAnalytics.CONTACT : VoipCallTypeAnalytics.USER;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.wk50
    public final void N(avw0 avw0Var, r49 r49Var) {
        CallsUserId callsUserId;
        UserId b;
        a59 a59Var;
        a59.d a;
        io.reactivex.rxjava3.internal.operators.observable.b1 Z;
        io.reactivex.rxjava3.core.x<CallsGetHistoryResponseDto> b2;
        tlo0 h;
        avw0 avw0Var2 = avw0Var;
        r49 r49Var2 = r49Var;
        int i = 19;
        int i2 = 18;
        int i3 = 4;
        int i4 = 22;
        VoipStartCallClickAnalytics.Event.OutgoingCall outgoingCall = null;
        mdw0 dVar = null;
        r10 = null;
        r10 = null;
        r10 = null;
        VoipCallTypeAnalytics voipCallTypeAnalytics = null;
        if (r49Var2 instanceof vhg.a) {
            if (avw0Var2 instanceof avw0.c) {
                T(vuw0.c.b);
                a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(xp90.a(this.g, null, 3), rsg0.w0(yfb.x(this.h.a.c())), new bj50(new nx7(this, i2), i4)), new vcw0(this, i3), new kvm0(this, i), 1);
            }
        } else if (!(r49Var2 instanceof luw0)) {
            int i5 = 14;
            boolean z = false;
            if (!(r49Var2 instanceof vhg.d)) {
                int i6 = 24;
                if (r49Var2 instanceof vhg.b) {
                    vhg.b bVar = (vhg.b) r49Var2;
                    if (avw0Var2 instanceof avw0.a) {
                        avw0.a aVar = (avw0.a) avw0Var2;
                        a990<Long> a990Var = aVar.c;
                        if (a990Var.b && (a990Var.d instanceof a990.b.a) && (!(bVar instanceof vhg.b.C3891b) || (a990Var.c instanceof a990.a.b))) {
                            T(wuw0.c.b);
                            int i7 = 23;
                            a7f0.a.f(this, U(aVar, a990Var.a).l(new je40(new gyo0(this, i4), i7)), new svk0(this, i6), new ptl0(this, i7), 1);
                        }
                    }
                } else {
                    boolean z2 = r49Var2 instanceof vhg.c;
                    kdw0<mdw0> kdw0Var = this.j;
                    if (z2) {
                        vhg.c cVar = (vhg.c) r49Var2;
                        if (cVar instanceof vhg.c.g) {
                            vhg.c.g gVar = (vhg.c.g) cVar;
                            outgoingCall = new VoipStartCallClickAnalytics.Event.OutgoingCall(gVar.d ? VoipStartCallClickAnalytics.Event.OutgoingCall.Type.VIDEO : VoipStartCallClickAnalytics.Event.OutgoingCall.Type.AUDIO, gVar.e ? VoipStartCallClickAnalytics.Source.PAST_CALLS_OTHER : VoipStartCallClickAnalytics.Source.PAST_CALLS, V(gVar.b));
                        }
                        if (outgoingCall != null) {
                            kdw0Var.b(outgoingCall);
                        }
                        this.r.a(cVar);
                    } else if (r49Var2 instanceof ho80.a) {
                        ho80.a aVar2 = (ho80.a) r49Var2;
                        f4z f4zVar = this.t.a;
                        if (aVar2 instanceof ho80.a.g) {
                            throw null;
                        }
                        if (aVar2 instanceof ho80.a.h) {
                            throw null;
                        }
                        if (aVar2 instanceof ho80.a.f.C3013a) {
                            ho80.a.f.C3013a c3013a = (ho80.a.f.C3013a) aVar2;
                            y49 y49Var = c3013a.b;
                            boolean z3 = c3013a.c;
                            y49.a.c cVar2 = y49Var.d.a;
                            if (cVar2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f4zVar.b(new whg.k(cVar2.a, z3));
                        } else if (aVar2 instanceof ho80.a.f.b) {
                            f4zVar.b(whg.d.a);
                        } else if (aVar2 instanceof ho80.a.b) {
                            f4zVar.b(new oo80.b());
                        } else if (aVar2 instanceof ho80.a.C3012a) {
                            ((ho80.a.C3012a) aVar2).getClass();
                            f4zVar.b(new oo80.a(MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST));
                        } else {
                            if (aVar2 instanceof ho80.a.d) {
                                throw null;
                            }
                            if (aVar2 instanceof ho80.a.c) {
                                f4zVar.b(new whg.w());
                            } else {
                                if (!(aVar2 instanceof ho80.a.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f4zVar.b(new whg.y(null));
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        boolean z4 = r49Var2 instanceof to90.e;
                        int i8 = 29;
                        int i9 = 7;
                        tp90 tp90Var = this.q;
                        if (z4) {
                            to90.e eVar = (to90.e) r49Var2;
                            if (avw0Var2 instanceof avw0.a) {
                                rp90 rp90Var = ((avw0.a) avw0Var2).b;
                                xp90 xp90Var = tp90Var.a;
                                nuw0 nuw0Var = tp90Var.c;
                                rp90.b bVar2 = rp90Var.f;
                                if (bVar2 instanceof rp90.b.a) {
                                    z = eVar instanceof to90.e.a;
                                } else if (bVar2 instanceof rp90.b.d) {
                                    z = eVar instanceof to90.e.d;
                                } else if (bVar2 instanceof rp90.b.c) {
                                    z = eVar instanceof to90.e.c;
                                } else if ((bVar2 instanceof rp90.b.C3620b) && (eVar instanceof to90.e.b) && epx.f(((rp90.b.C3620b) bVar2).a, ((to90.e.b) eVar).b)) {
                                    z = true;
                                }
                                if (!z) {
                                    if (eVar instanceof to90.e.a) {
                                        nuw0Var.a(up90.c.a.b);
                                        b2 = xp90.a(xp90Var, null, 3);
                                    } else if (eVar instanceof to90.e.d) {
                                        nuw0Var.a(up90.c.d.b);
                                        b2 = xp90.a(xp90Var, null, 3);
                                    } else if (eVar instanceof to90.e.c) {
                                        nuw0Var.a(up90.c.C3815c.b);
                                        b2 = xp90.a(xp90Var, CallsGetHistoryFilterDto.ONLY_MISSED, 1);
                                    } else {
                                        if (!(eVar instanceof to90.e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        LinkedHashMap linkedHashMap = rp90Var.d;
                                        CallsUserId.VkUserId vkUserId = ((to90.e.b) eVar).b;
                                        if (linkedHashMap.containsKey(vkUserId)) {
                                            nuw0Var.a(new up90.c.b(vkUserId));
                                            List<UsersFieldsDto> list = xp90.b;
                                            b2 = xp90Var.b(null, vkUserId, null);
                                        }
                                    }
                                    tp90Var.d.a(b2.l(new q40(new xd40(tp90Var, i9), i8)), new f0z(tp90Var, i2), new jjx(tp90Var, i4));
                                }
                            }
                        } else if (!(r49Var2 instanceof to90.a)) {
                            boolean z5 = r49Var2 instanceof to90.c;
                            vp90 vp90Var = this.s;
                            if (z5) {
                                to90.c cVar3 = (to90.c) r49Var2;
                                if (avw0Var2 instanceof avw0.a) {
                                    if (cVar3 instanceof to90.c.a) {
                                        vp90Var.a.b(hp90.b.a);
                                    } else {
                                        if (!(cVar3 instanceof to90.c.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        rp90 rp90Var2 = ((avw0.a) avw0Var2).b;
                                        f4z f4zVar2 = vp90Var.a;
                                        rp90.b bVar3 = rp90Var2.f;
                                        rp90.b.C3620b c3620b = bVar3 instanceof rp90.b.C3620b ? (rp90.b.C3620b) bVar3 : null;
                                        f4zVar2.b(new hp90.d(c3620b != null ? c3620b.a : null));
                                    }
                                }
                            } else if (r49Var2 instanceof to90.d) {
                                to90.d dVar2 = (to90.d) r49Var2;
                                if (avw0Var2 instanceof avw0.a) {
                                    boolean z6 = dVar2 instanceof to90.d.b;
                                    if (z6) {
                                        dVar = new VoipStartCallClickAnalytics.Event.OutgoingCall(VoipStartCallClickAnalytics.Event.OutgoingCall.Type.AUDIO, VoipStartCallClickAnalytics.Source.PAST_CALLS, V(((to90.d.b) dVar2).b));
                                    } else if (dVar2 instanceof to90.d.c) {
                                        dVar = new itw0.b.a.d(V(((to90.d.c) dVar2).b));
                                    } else if (!epx.f(dVar2, to90.d.a.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (dVar != null) {
                                        kdw0Var.b(dVar);
                                    }
                                    nuw0 nuw0Var2 = tp90Var.c;
                                    if (z6) {
                                        nuw0Var2.a(new vo90.b(((to90.d.b) dVar2).b, false));
                                    } else if (dVar2 instanceof to90.d.c) {
                                        nuw0Var2.a(new vo90.b(((to90.d.c) dVar2).b, true));
                                    } else {
                                        if (!(dVar2 instanceof to90.d.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        nuw0Var2.a(vo90.a.b);
                                    }
                                }
                            } else if (r49Var2 instanceof to90.b) {
                                to90.b bVar4 = (to90.b) r49Var2;
                                if (avw0Var2 instanceof avw0.a) {
                                    vp90Var.b.b(new fp90(bVar4.b));
                                }
                            } else if (r49Var2 instanceof to90.f) {
                                to90.f fVar = (to90.f) r49Var2;
                                if (avw0Var2 instanceof avw0.a) {
                                    tp90Var.a(((avw0.a) avw0Var2).b, fVar.b, new vpn0(this, 19));
                                }
                            } else if (r49Var2 instanceof to90.h) {
                                if (avw0Var2 instanceof avw0.a) {
                                    int i10 = 9;
                                    a7f0.a.f(this, U((avw0.a) avw0Var2, null).l(new l340(new ubt0(this, i10), 24)), new xau0(this, 8), new z7t0(this, i10), 1);
                                }
                            } else if (r49Var2 instanceof to90.i.a) {
                                ((bvw0) this.p.getValue()).getClass();
                                if (avw0Var2 instanceof avw0.a) {
                                    rp90.a aVar3 = ((avw0.a) avw0Var2).b.g;
                                    rp90.a.b bVar5 = aVar3 instanceof rp90.a.b ? (rp90.a.b) aVar3 : null;
                                    if (bVar5 != null && (a59Var = bVar5.a) != null && (a = a59Var.a()) != null) {
                                        if (a instanceof a59.d.a) {
                                            voipCallTypeAnalytics = VoipCallTypeAnalytics.GROUP;
                                        } else {
                                            if (!(a instanceof a59.d.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            voipCallTypeAnalytics = ((a59.d.b) a).a instanceof CallsUserId.ContactId ? VoipCallTypeAnalytics.CONTACT : VoipCallTypeAnalytics.USER;
                                        }
                                    }
                                }
                                kdw0Var.b(new VoipMaxAppViewAnalytics.Event.ShowCallButton(voipCallTypeAnalytics, VoipMaxAppViewAnalytics.Event.ShowCallButton.Source.HISTORY_FRIENDS_LIST_SERVICES_OTHER));
                            } else if (r49Var2 instanceof to90.g) {
                                to90.g gVar2 = (to90.g) r49Var2;
                                if (avw0Var2 instanceof avw0.a) {
                                    ohw0 ohw0Var = (ohw0) this.u.getValue();
                                    rp90 rp90Var3 = ((avw0.a) avw0Var2).b;
                                    a59 a59Var2 = gVar2.b;
                                    ohw0Var.getClass();
                                    r3y.a("VKWebAppReturnReason", new wyg(ohw0Var, rp90Var3, a59Var2, i9));
                                    a59.d a2 = a59Var2.a();
                                    a59.d.b bVar6 = a2 instanceof a59.d.b ? (a59.d.b) a2 : null;
                                    if (bVar6 != null && (callsUserId = bVar6.a) != null && (b = com.vk.voip.userid.a.b(callsUserId)) != null) {
                                        ohw0Var.a.b(new whg.b(b));
                                    }
                                }
                            } else {
                                L l = L.a;
                                l.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l, L.LogType.e, new Object[]{"Unhandled action " + r49Var2});
                                }
                            }
                        } else if (avw0Var2 instanceof avw0.a) {
                            rp90.b bVar7 = ((avw0.a) avw0Var2).b.f;
                            UserId b3 = bVar7 instanceof rp90.b.C3620b ? com.vk.voip.userid.a.b(((rp90.b.C3620b) bVar7).a) : null;
                            rd9 rd9Var = this.f;
                            if (b3 == null) {
                                rd9Var.getClass();
                                Z = rsg0.Z(yfb.x(new tfx("calls.clearHistory", new tq(5), new uq(4))));
                            } else {
                                rd9Var.getClass();
                                tfx tfxVar = new tfx("calls.clearGroupHistory", new xq(6), new yq(4));
                                tfx.n(tfxVar, "group_id", b3, 0L, 0L, 12);
                                Z = rsg0.Z(yfb.x(tfxVar));
                            }
                            a7f0.a.d(this, Z, null, new jan0(this, i5), new y3l0(this, i8), 1);
                        }
                    }
                }
            } else if (avw0Var2 instanceof avw0.a) {
                avw0.a aVar4 = (avw0.a) avw0Var2;
                if (aVar4.c.d instanceof a990.b.a) {
                    T(xuw0.b.b);
                    a7f0.a.f(this, U(aVar4, null).l(new he40(new kyq0(this, i5), 25)), new gsq0(this, 12), new skj0(this, 25), 1);
                }
            } else {
                C(vhg.a.b);
            }
        } else if (avw0Var2 instanceof avw0.a) {
            rp90 rp90Var4 = ((avw0.a) avw0Var2).b;
            rp90.b bVar8 = rp90Var4.f;
            if ((bVar8 instanceof rp90.b.a) || (bVar8 instanceof rp90.b.d)) {
                h = tq.h(tlo0.Companion, R.string.voip_delete_call_history_personal);
            } else if (bVar8 instanceof rp90.b.C3620b) {
                rp90.b.C3620b c3620b2 = (rp90.b.C3620b) bVar8;
                w49 w49Var = (w49) rp90Var4.d.get(c3620b2.a);
                if (w49Var == null) {
                    throw new IllegalStateException("Group must exist in state: " + c3620b2.a);
                }
                tlo0.a aVar5 = tlo0.Companion;
                Object[] objArr = {w49Var.b};
                aVar5.getClass();
                h = tlo0.a.c(R.string.voip_delete_call_history_personal_from_group, objArr);
            } else {
                if (!(bVar8 instanceof rp90.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                h = tq.h(tlo0.Companion, R.string.voip_delete_call_history_personal_missed);
            }
            this.m.b(new ep90(h, !rp90Var4.a.isEmpty()));
        }
        s3q0 s3q0Var2 = s3q0.a;
    }

    public final io.reactivex.rxjava3.core.x<CallsGetHistoryResponseDto> U(avw0.a aVar, Long l) {
        CallsGetGroupHistoryFilterDto callsGetGroupHistoryFilterDto;
        CallsGetHistoryFilterDto callsGetHistoryFilterDto;
        rp90 rp90Var = aVar.b;
        rp90.b bVar = rp90Var.f;
        rp90.b bVar2 = rp90Var.f;
        rp90.b.C3620b c3620b = bVar instanceof rp90.b.C3620b ? (rp90.b.C3620b) bVar : null;
        CallsUserId callsUserId = c3620b != null ? c3620b.a : null;
        qp90 qp90Var = this.o;
        xp90 xp90Var = this.g;
        if (callsUserId == null) {
            qp90Var.getClass();
            if (bVar2 instanceof rp90.b.a) {
                callsGetHistoryFilterDto = CallsGetHistoryFilterDto.ALL;
            } else if (bVar2 instanceof rp90.b.d) {
                callsGetHistoryFilterDto = CallsGetHistoryFilterDto.ALL;
            } else if (bVar2 instanceof rp90.b.C3620b) {
                callsGetHistoryFilterDto = CallsGetHistoryFilterDto.ALL;
            } else {
                if (!(bVar2 instanceof rp90.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                callsGetHistoryFilterDto = CallsGetHistoryFilterDto.ONLY_MISSED;
            }
            return rsg0.w0(yfb.x(xp90Var.a.d(l, callsGetHistoryFilterDto, xp90.b)));
        }
        qp90Var.getClass();
        if (bVar2 instanceof rp90.b.a) {
            callsGetGroupHistoryFilterDto = CallsGetGroupHistoryFilterDto.ALL;
        } else if (bVar2 instanceof rp90.b.d) {
            callsGetGroupHistoryFilterDto = CallsGetGroupHistoryFilterDto.ALL;
        } else if (bVar2 instanceof rp90.b.C3620b) {
            callsGetGroupHistoryFilterDto = CallsGetGroupHistoryFilterDto.ALL;
        } else {
            if (!(bVar2 instanceof rp90.b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            callsGetGroupHistoryFilterDto = CallsGetGroupHistoryFilterDto.ONLY_MISSED;
        }
        return xp90Var.b(l, callsUserId, callsGetGroupHistoryFilterDto);
    }
}
