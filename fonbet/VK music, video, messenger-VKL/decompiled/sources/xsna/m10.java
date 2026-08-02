package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vk.voip.dto.RecordType;
import com.vk.voip.dto.broadcast.VoipBroadcastStatus;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.fh8;
import xsna.gh8;
import xsna.hh8;
import xsna.hvl;
import xsna.mhr;
import xsna.nt80;
import xsna.ohr;
import xsna.rmy;
import xsna.t7j0;

/* compiled from: ActionHandler.kt */
/* loaded from: classes7.dex */
public final class m10 {
    public final com.vk.voip.b a;
    public final xj8 b;
    public final dh8 c;
    public final wv2 d;

    public m10(com.vk.voip.b bVar, xj8 xj8Var, dh8 dh8Var, wv2 wv2Var) {
        this.a = bVar;
        this.b = xj8Var;
        this.c = dh8Var;
        this.d = wv2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0239, code lost:
    
        if (r10 == true) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(hh8 hh8Var, fh8 fh8Var) {
        String str;
        Object obj;
        mhr bVar;
        String id;
        boolean c;
        boolean z = fh8Var instanceof fh8.c;
        wv2 wv2Var = this.d;
        dh8 dh8Var = this.c;
        if (z) {
            if (hh8Var instanceof hh8.c) {
                dh8Var.invoke(hh8.e.a);
                wv2Var.invoke(gh8.i.a);
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.o) {
            if (hh8Var instanceof hh8.c) {
                return;
            }
            wv2Var.invoke(gh8.c.a);
            dh8Var.invoke(hh8.c.a);
            return;
        }
        if (fh8Var instanceof fh8.n) {
            if (hh8Var instanceof hh8.b) {
                wv2Var.invoke(gh8.f.b.a);
                wv2Var.invoke(gh8.d.b.a);
                dh8Var.invoke(hh8.d.a);
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.d.c) {
            b(hh8Var, (fh8.d.c) fh8Var);
            return;
        }
        if (fh8Var instanceof fh8.d.b) {
            if (hh8Var instanceof hh8.f.b) {
                b(hh8Var, new fh8.d.c(((hh8.f.b) hh8Var).b));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.d.a) {
            if (hh8Var instanceof hh8.f) {
                wv2Var.invoke(gh8.j.a);
                dh8Var.invoke(hh8.d.a);
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.j.a) {
            fh8.j.a aVar = (fh8.j.a) fh8Var;
            if ((hh8Var instanceof hh8.f.c) || (hh8Var instanceof hh8.f.a)) {
                dh8Var.invoke(new hh8.f.a(aVar.a, aVar.b));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.j.d) {
            fh8.j.d dVar = (fh8.j.d) fh8Var;
            if (hh8Var instanceof hh8.f.a) {
                dh8Var.invoke(new hh8.f.d(dVar.a));
                return;
            }
            return;
        }
        boolean z2 = fh8Var instanceof fh8.j.c;
        xj8 xj8Var = this.b;
        if (z2) {
            hd8 a = xj8Var.a();
            if (!(hh8Var instanceof hh8.f.d) || a == null) {
                return;
            }
            String str2 = a.a;
            String str3 = a.b;
            CallMemberId callMemberId = a.d;
            RecordType recordType = a.f;
            long j = a.e;
            nt80.b bVar2 = nt80.b.a;
            dh8Var.invoke(new hh8.a(str2, str3, callMemberId, recordType, j, bVar2, bVar2, bVar2, ohr.b.a, false, false));
            wv2Var.invoke(gh8.h.a);
            return;
        }
        if (fh8Var instanceof fh8.j.b) {
            fh8.j.b bVar3 = (fh8.j.b) fh8Var;
            if (hh8Var instanceof hh8.f.d) {
                dh8Var.invoke(new hh8.f.b(bVar3.a, bVar3.b));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.b.C2873b) {
            if (!(hh8Var instanceof hh8.a) || epx.f(((hh8.a) hh8Var).i, ohr.c.a)) {
                return;
            }
            wv2Var.invoke(gh8.e.b.a);
            wv2Var.invoke(gh8.e.a.a);
            return;
        }
        if (fh8Var instanceof fh8.b.a) {
            if (hh8Var instanceof hh8.a) {
                hh8.a aVar2 = (hh8.a) hh8Var;
                ohr ohrVar = aVar2.i;
                ohr.b bVar4 = ohr.b.a;
                if (epx.f(ohrVar, bVar4)) {
                    return;
                }
                wv2Var.invoke(gh8.e.b.a);
                dh8Var.invoke(hh8.a.b(aVar2, null, null, null, bVar4, false, false, 1791));
                xj8Var.getClass();
                if (xj8.f(xj8Var)) {
                    return;
                }
                dfw0 a2 = aVar2.f.a();
                qvw0 a3 = aVar2.g.a();
                qvw0 a4 = aVar2.h.a();
                if (a2 == null || a3 == null || a4 == null) {
                    dh8Var.invoke(hh8.d.a);
                    return;
                }
                VoipBroadcastStatus voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                xuo0.a.getClass();
                dh8Var.invoke(new hh8.b(new mhr.b(dfw0.a(a2, voipBroadcastStatus, Math.max(0L, xuo0.a() - a2.g), null, null, 0, 260471)), a3, a4, t7j0.b.a, hvl.c.a, aVar2.d, xj8Var.d(aVar2.c.b)));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.i.b) {
            if (hh8Var instanceof hh8.a) {
                dh8Var.invoke(hh8.a.b((hh8.a) hh8Var, null, null, null, ohr.c.a, false, false, 1791));
                return;
            }
            return;
        }
        boolean z3 = true;
        if (fh8Var instanceof fh8.i.c) {
            fh8.i.c cVar = (fh8.i.c) fh8Var;
            wv2Var.invoke(gh8.b.C2945b.a);
            wv2Var.invoke(gh8.a.b.a);
            if (!(hh8Var instanceof hh8.a)) {
                dh8Var.invoke(hh8.d.a);
                return;
            }
            hh8.a aVar3 = (hh8.a) hh8Var;
            dfw0 a5 = aVar3.f.a();
            qvw0 a6 = aVar3.g.a();
            qvw0 a7 = aVar3.h.a();
            if (a7 != null && (id = a7.getId()) != null) {
                com.vk.voip.b bVar5 = xj8Var.a;
                if (bVar5.d().e()) {
                    c = false;
                } else {
                    CallMemberId c2 = xj8Var.c();
                    c = (id.equals(c2 != null ? c2.b : null) || bVar5.d().d(c2)) ? true : bVar5.d().c(c2);
                }
            }
            z3 = false;
            if (a6 == null || a7 == null || !z3) {
                dh8Var.invoke(hh8.d.a);
                return;
            }
            if (a5 == null) {
                bVar = new mhr.a(z3);
            } else {
                dfw0 dfw0Var = cVar.a;
                dfw0 dfw0Var2 = dfw0Var == null ? a5 : dfw0Var;
                VoipBroadcastStatus voipBroadcastStatus2 = VoipBroadcastStatus.FINISHED;
                int i = a5.m;
                xuo0.a.getClass();
                bVar = new mhr.b(dfw0.a(dfw0Var2, voipBroadcastStatus2, Math.max(0L, xuo0.a() - a5.g), null, null, i, 256375));
            }
            dh8Var.invoke(new hh8.b(bVar, a6, a7, t7j0.b.a, hvl.c.a, aVar3.d, xj8Var.d(aVar3.c.b)));
            return;
        }
        if (fh8Var instanceof fh8.i.a) {
            fh8.i.a aVar4 = (fh8.i.a) fh8Var;
            if (hh8Var instanceof hh8.a) {
                dh8Var.invoke(hh8.a.b((hh8.a) hh8Var, null, null, null, new ohr.a(aVar4.a), false, false, 1791));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.p.b) {
            fh8.p.b bVar6 = (fh8.p.b) fh8Var;
            hh8.b a8 = hh8Var.a();
            obj = a8 != null ? a8.a : null;
            if (a8 != null) {
                t7j0 t7j0Var = a8.d;
                t7j0Var.getClass();
                if ((t7j0Var instanceof t7j0.c) || !(obj instanceof mhr.b)) {
                    return;
                }
                dfw0 dfw0Var3 = ((mhr.b) obj).a;
                String str4 = dfw0Var3.a;
                String str5 = dfw0Var3.b;
                boolean z4 = bVar6.a;
                boolean z5 = bVar6.b;
                wv2Var.invoke(gh8.f.b.a);
                wv2Var.invoke(new gh8.f.a(str4, str5, z4, z5));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.p.a) {
            hh8.b a9 = hh8Var.a();
            if (a9 != null) {
                t7j0 t7j0Var2 = a9.d;
                t7j0Var2.getClass();
                if (t7j0Var2 instanceof t7j0.c) {
                    wv2Var.invoke(gh8.f.b.a);
                    dh8Var.invoke(hh8.b.b(a9, t7j0.b.a, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
                    return;
                }
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.m.b) {
            hh8.b a10 = hh8Var.a();
            if (a10 != null) {
                dh8Var.invoke(hh8.b.b(a10, t7j0.c.a, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.m.c) {
            hh8.b a11 = hh8Var.a();
            if (a11 != null) {
                dh8Var.invoke(hh8.b.b(a11, t7j0.d.a, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.m.a) {
            fh8.m.a aVar5 = (fh8.m.a) fh8Var;
            hh8.b a12 = hh8Var.a();
            if (a12 != null) {
                dh8Var.invoke(hh8.b.b(a12, new t7j0.a(aVar5.c), null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.a.b) {
            hh8.b a13 = hh8Var.a();
            hvl hvlVar = a13 != null ? a13.e : null;
            obj = a13 != null ? a13.a : null;
            if (a13 != null) {
                if (hvlVar == null || !(hvlVar instanceof hvl.d)) {
                    if ((hvlVar == null || !(hvlVar instanceof hvl.a)) && (obj instanceof mhr.b)) {
                        dfw0 dfw0Var4 = ((mhr.b) obj).a;
                        String str6 = dfw0Var4.a;
                        String str7 = dfw0Var4.b;
                        wv2Var.invoke(gh8.d.b.a);
                        wv2Var.invoke(new gh8.d.a(str6, str7));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.a.C2872a) {
            hh8.b a14 = hh8Var.a();
            hvl hvlVar2 = a14 != null ? a14.e : null;
            if (a14 != null) {
                if (hvlVar2 == null || !(hvlVar2 instanceof hvl.c)) {
                    if (hvlVar2 == null || !(hvlVar2 instanceof hvl.a)) {
                        wv2Var.invoke(gh8.d.b.a);
                        dh8Var.invoke(hh8.b.b(a14, null, hvl.c.a, 111));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.h.b) {
            hh8.b a15 = hh8Var.a();
            if (a15 != null) {
                dh8Var.invoke(hh8.b.b(a15, null, hvl.d.a, 111));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.h.c) {
            hh8.b a16 = hh8Var.a();
            if (a16 != null) {
                hh8.b b = hh8.b.b(a16, null, hvl.a.a, 111);
                dh8Var.invoke(b);
                if (b.f == RecordType.RECORD) {
                    fh8.n nVar = fh8.n.a;
                    wv2Var.invoke(gh8.f.b.a);
                    wv2Var.invoke(gh8.d.b.a);
                    dh8Var.invoke(hh8.d.a);
                    return;
                }
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.h.a) {
            fh8.h.a aVar6 = (fh8.h.a) fh8Var;
            hh8.b a17 = hh8Var.a();
            if (a17 != null) {
                dh8Var.invoke(hh8.b.b(a17, null, new hvl.b(aVar6.c), 111));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.l) {
            hd8 hd8Var = ((fh8.l) fh8Var).a;
            if (hd8Var == null) {
                if ((hh8Var instanceof hh8.c) || (hh8Var instanceof hh8.d) || (hh8Var instanceof hh8.b)) {
                    return;
                }
                if ((hh8Var instanceof hh8.a) && epx.f(((hh8.a) hh8Var).i, ohr.c.a)) {
                    return;
                }
                wv2Var.invoke(gh8.e.b.a);
                wv2Var.invoke(gh8.b.C2945b.a);
                wv2Var.invoke(gh8.a.b.a);
                wv2Var.invoke(gh8.j.a);
                wv2Var.invoke(gh8.k.a);
                dh8Var.invoke(hh8.d.a);
                return;
            }
            if (hh8Var instanceof hh8.c) {
                return;
            }
            if (hh8Var instanceof hh8.f) {
                rmy b2 = ((hh8.f) hh8Var).b();
                if (b2 instanceof rmy.a) {
                    str = ((rmy.a) b2).a;
                } else {
                    if (!(b2 instanceof rmy.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((rmy.b) b2).b;
                }
                if (epx.f(str, hd8Var.b)) {
                    return;
                }
            }
            wv2Var.invoke(gh8.e.b.a);
            wv2Var.invoke(gh8.b.C2945b.a);
            wv2Var.invoke(gh8.a.b.a);
            wv2Var.invoke(gh8.j.a);
            wv2Var.invoke(gh8.k.a);
            String str8 = hd8Var.a;
            String str9 = hd8Var.b;
            CallMemberId callMemberId2 = hd8Var.d;
            RecordType recordType2 = hd8Var.f;
            long j2 = hd8Var.e;
            nt80.b bVar7 = nt80.b.a;
            dh8Var.invoke(new hh8.a(str8, str9, callMemberId2, recordType2, j2, bVar7, bVar7, bVar7, ohr.b.a, false, false));
            wv2Var.invoke(gh8.h.a);
            return;
        }
        if (fh8Var instanceof fh8.k.c) {
            if (hh8Var instanceof hh8.a) {
                nt80.d dVar2 = nt80.d.a;
                dh8Var.invoke(hh8.a.b((hh8.a) hh8Var, dVar2, dVar2, dVar2, null, false, false, 1823));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.k.d) {
            if (hh8Var instanceof hh8.a) {
                wv2Var.invoke(gh8.e.b.a);
                wv2Var.invoke(gh8.b.C2945b.a);
                wv2Var.invoke(gh8.a.b.a);
                wv2Var.invoke(gh8.j.a);
                wv2Var.invoke(gh8.k.a);
                dh8Var.invoke(hh8.d.a);
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.k.a) {
            fh8.k.a aVar7 = (fh8.k.a) fh8Var;
            if (hh8Var instanceof hh8.a) {
                com.vk.voip.b bVar8 = this.a;
                boolean f = bVar8.d().f();
                boolean e = bVar8.d().e();
                fvw fvwVar = aVar7.a;
                qvw0 qvw0Var = fvwVar.f;
                dh8Var.invoke(hh8.a.b((hh8.a) hh8Var, new nt80.c(fvwVar.d), new nt80.c(fvwVar.e), new nt80.c(fvwVar.f), null, fvwVar.g, fvwVar.h, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
                if (f) {
                    wv2Var.invoke(gh8.b.a.a);
                }
                if (e && qvw0Var == null) {
                    wv2Var.invoke(gh8.a.C2944a.a);
                    return;
                }
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.k.b) {
            fh8.k.b bVar9 = (fh8.k.b) fh8Var;
            if (hh8Var instanceof hh8.a) {
                Throwable th = bVar9.a;
                dh8Var.invoke(hh8.a.b((hh8.a) hh8Var, new nt80.a(th), new nt80.a(th), new nt80.a(th), null, false, false, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.g) {
            dfw0 dfw0Var5 = ((fh8.g) fh8Var).a;
            if (hh8Var instanceof hh8.a) {
                hh8.a aVar8 = (hh8.a) hh8Var;
                nt80<dfw0> nt80Var = aVar8.f;
                if (!(nt80Var instanceof nt80.c) || epx.f(((nt80.c) nt80Var).a, dfw0Var5)) {
                    return;
                }
                dh8Var.invoke(hh8.a.b(aVar8, new nt80.c(dfw0Var5), null, null, null, false, false, 2015));
                return;
            }
            return;
        }
        if (fh8Var instanceof fh8.f) {
            fh8.f fVar = (fh8.f) fh8Var;
            if (hh8Var instanceof hh8.a) {
                hh8.a aVar9 = (hh8.a) hh8Var;
                boolean z6 = aVar9.k;
                boolean z7 = fVar.a;
                if (z6 != z7) {
                    dh8Var.invoke(hh8.a.b(aVar9, null, null, null, null, false, z7, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
                    return;
                }
                return;
            }
            return;
        }
        if (!(fh8Var instanceof fh8.e)) {
            throw new NoWhenBranchMatchedException();
        }
        fh8.e eVar = (fh8.e) fh8Var;
        if (hh8Var instanceof hh8.a) {
            hh8.a aVar10 = (hh8.a) hh8Var;
            if (aVar10.h instanceof nt80.c) {
                dh8Var.invoke(hh8.a.b(aVar10, null, null, new nt80.c(eVar.a), null, false, false, 1919));
                wv2Var.invoke(gh8.a.b.a);
            }
        }
    }

    public final void b(hh8 hh8Var, fh8.d.c cVar) {
        if ((hh8Var instanceof hh8.d) || (hh8Var instanceof hh8.f.b) || (hh8Var instanceof hh8.b)) {
            this.c.invoke(new hh8.f.c(cVar.a));
            this.d.invoke(new gh8.g(cVar.a));
        }
    }
}
