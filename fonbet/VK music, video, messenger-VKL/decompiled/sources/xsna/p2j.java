package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c2j;
import xsna.o2j;
import xsna.q2j;
import xsna.r2j;

/* compiled from: ConfigureSessionRoomsReducer.kt */
/* loaded from: classes7.dex */
public final class p2j extends dm50<r2j, o2j, q2j> {
    public final com.vk.voip.b d;
    public final bpn0 e;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str;
            String str2;
            wk90 wk90Var = ((SessionRoomParticipantModel) t).g;
            String str3 = "";
            if (wk90Var == null || (str = wk90Var.b) == null) {
                str = "";
            }
            wk90 wk90Var2 = ((SessionRoomParticipantModel) t2).g;
            if (wk90Var2 != null && (str2 = wk90Var2.b) != null) {
                str3 = str2;
            }
            return jw5.b(str, str3);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((lvi0) t).a.a.getId()), Integer.valueOf(((lvi0) t2).a.a.getId()));
        }
    }

    public p2j(com.vk.voip.b bVar) {
        super(q2j.f.b);
        this.d = bVar;
        this.e = new bpn0(new wzh(this, 4));
    }

    public static q2j i(q2j q2jVar, q2j.d dVar) {
        return q2jVar instanceof q2j.c ? q2j.c.a((q2j.c) q2jVar, 0, false, false, false, 0, dVar, 63) : q2jVar instanceof q2j.h ? q2j.h.a((q2j.h) q2jVar, null, dVar, 127) : q2jVar;
    }

    public static r2j.c k(q2j.d dVar) {
        if (dVar instanceof q2j.d.i) {
            return r2j.c.b.a;
        }
        if (dVar instanceof q2j.d.f) {
            return new r2j.c.a(R.string.voip_session_room_admin_move_participant_error);
        }
        if (dVar instanceof q2j.d.b) {
            return new r2j.c.a(R.string.voip_session_room_admin_assign_participants_error);
        }
        if (dVar instanceof q2j.d.e) {
            return new r2j.c.a(R.string.voip_session_room_admin_create_rooms_error);
        }
        if (dVar instanceof q2j.d.a) {
            return new r2j.c.a(R.string.voip_session_room_admin_activate_rooms_error);
        }
        if (dVar instanceof q2j.d.h) {
            return new r2j.c.d(R.string.voip_session_room_admin_rename_room_error, ((q2j.d.h) dVar).a);
        }
        if (dVar instanceof q2j.d.C3545d) {
            return new r2j.c.a(0);
        }
        if (dVar instanceof q2j.d.c) {
            return new r2j.c.a(R.string.voip_session_room_admin_close_rooms_error);
        }
        if (dVar instanceof q2j.d.g) {
            return new r2j.c.d(R.string.voip_session_room_admin_remove_room_error, ((q2j.d.g) dVar).a);
        }
        if (dVar instanceof q2j.d.j) {
            return new r2j.c.C3594c(((q2j.d.j) dVar).a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static q2j.h m(o2j.x xVar) {
        svi0 svi0Var = xVar.g;
        svi0 svi0Var2 = new svi0(svi0Var.a, svi0Var.b, svi0Var.c);
        f.a aVar = xVar.b;
        boolean z = xVar.c;
        List D0 = j5g.D0(new a(), xVar.e);
        return new q2j.h(aVar, xVar.d, D0, j5g.D0(new b(), xVar.f), z, q2j.h.a.g.a, svi0Var2, q2j.d.i.a);
    }

    @Override // xsna.dm50
    public final q2j c(q2j q2jVar, o2j o2jVar) {
        c2j.a aVar;
        q2j q2jVar2 = q2jVar;
        o2j o2jVar2 = o2jVar;
        if (o2jVar2 instanceof o2j.q) {
            boolean z = q2jVar2 instanceof q2j.f;
            q2j.a.b bVar = q2j.a.b.a;
            return z ? new q2j.g(true, bVar) : q2jVar2 instanceof q2j.h ? new q2j.g(false, bVar) : q2jVar2;
        }
        if (o2jVar2 instanceof o2j.x) {
            o2j.x xVar = (o2j.x) o2jVar2;
            if (q2jVar2 instanceof q2j.c) {
                return xVar.f.isEmpty() ? q2jVar2 : m(xVar);
            }
            if (q2jVar2 instanceof q2j.g) {
                return l(((q2j.g) q2jVar2).b, xVar);
            }
            if (!(q2jVar2 instanceof q2j.h)) {
                return q2jVar2;
            }
            if (epx.f(xVar.b.getId(), ((q2j.h) q2jVar2).b.getId())) {
                return l(false, xVar);
            }
        } else {
            boolean z2 = o2jVar2 instanceof o2j.w;
            q2j.d dVar = q2j.d.i.a;
            if (z2) {
                o2j.w wVar = (o2j.w) o2jVar2;
                if (!(q2jVar2 instanceof q2j.c)) {
                    return q2jVar2;
                }
                int i = wVar.b;
                q2j.d jVar = ((i == 0 || i >= 1) && i <= 50) ? dVar : new q2j.d.j(i);
                q2j.c a2 = q2j.c.a((q2j.c) q2jVar2, i, false, false, false, 0, jVar, 61);
                if (jVar.equals(dVar)) {
                    n(a2);
                }
                return a2;
            }
            if (o2jVar2 instanceof o2j.z) {
                o2j.z zVar = (o2j.z) o2jVar2;
                if (!(q2jVar2 instanceof q2j.c)) {
                    return q2jVar2;
                }
                q2j.c a3 = q2j.c.a((q2j.c) q2jVar2, 0, zVar.b, false, false, 0, null, 123);
                n(a3);
                return a3;
            }
            if (o2jVar2 instanceof o2j.y) {
                o2j.y yVar = (o2j.y) o2jVar2;
                if (!(q2jVar2 instanceof q2j.c)) {
                    return q2jVar2;
                }
                q2j.c a4 = q2j.c.a((q2j.c) q2jVar2, 0, false, false, yVar.b, 0, null, 111);
                n(a4);
                return a4;
            }
            if (o2jVar2 instanceof o2j.a0) {
                o2j.a0 a0Var = (o2j.a0) o2jVar2;
                if (!(q2jVar2 instanceof q2j.c)) {
                    return q2jVar2;
                }
                q2j.c a5 = q2j.c.a((q2j.c) q2jVar2, 0, false, a0Var.b, false, a0Var.c, null, 87);
                n(a5);
                return a5;
            }
            if (o2jVar2 instanceof o2j.p) {
                return q2j.e.b;
            }
            if (!(o2jVar2 instanceof o2j.v)) {
                if (o2jVar2 instanceof o2j.c) {
                    o2j.c cVar = (o2j.c) o2jVar2;
                    if (!(q2jVar2 instanceof q2j.h)) {
                        return q2jVar2;
                    }
                    q2j.h hVar = (q2j.h) q2jVar2;
                    return hVar.g instanceof q2j.h.a.g ? q2j.h.a(hVar, new q2j.h.a.c(cVar.b), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : q2jVar2;
                }
                if (o2jVar2 instanceof o2j.d) {
                    o2j.d dVar2 = (o2j.d) o2jVar2;
                    if (!(q2jVar2 instanceof q2j.h)) {
                        return q2jVar2;
                    }
                    q2j.h hVar2 = (q2j.h) q2jVar2;
                    if (hVar2.g instanceof q2j.h.a.c) {
                        return q2j.h.a(hVar2, new q2j.h.a.d(dVar2.c, dVar2.b), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                    }
                    return hVar2;
                }
                if (o2jVar2 instanceof o2j.r) {
                    return q2jVar2 instanceof q2j.h ? q2j.h.a((q2j.h) q2jVar2, q2j.h.a.g.a, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : q2jVar2;
                }
                if (o2jVar2 instanceof o2j.b) {
                    if (!(q2jVar2 instanceof q2j.h)) {
                        return q2jVar2;
                    }
                    q2j.h hVar3 = (q2j.h) q2jVar2;
                    return hVar3.g instanceof q2j.h.a.g ? q2j.h.a(hVar3, q2j.h.a.b.a, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : q2jVar2;
                }
                if (o2jVar2 instanceof o2j.n) {
                    o2j.n nVar = (o2j.n) o2jVar2;
                    if (!(q2jVar2 instanceof q2j.h)) {
                        return q2jVar2;
                    }
                    q2j.h hVar4 = (q2j.h) q2jVar2;
                    return hVar4.g instanceof q2j.h.a.g ? q2j.h.a(hVar4, new q2j.h.a.e(nVar.b), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : q2jVar2;
                }
                if (o2jVar2 instanceof o2j.s) {
                    o2j.s sVar = (o2j.s) o2jVar2;
                    if (!(q2jVar2 instanceof q2j.h)) {
                        return q2jVar2;
                    }
                    q2j.h hVar5 = (q2j.h) q2jVar2;
                    return hVar5.g instanceof q2j.h.a.g ? q2j.h.a(hVar5, new q2j.h.a.C3547h(sVar.b), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : q2jVar2;
                }
                if (o2jVar2 instanceof o2j.m) {
                    o2j.m mVar = (o2j.m) o2jVar2;
                    if (!(q2jVar2 instanceof q2j.h)) {
                        return q2jVar2;
                    }
                    q2j.h hVar6 = (q2j.h) q2jVar2;
                    return hVar6.g instanceof q2j.h.a.g ? q2j.h.a(hVar6, new q2j.h.a.f(mVar.b), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : q2jVar2;
                }
                if (o2jVar2 instanceof o2j.a) {
                    if (!(q2jVar2 instanceof q2j.h)) {
                        return q2jVar2;
                    }
                    q2j.h hVar7 = (q2j.h) q2jVar2;
                    return hVar7.g instanceof q2j.h.a.g ? q2j.h.a(hVar7, q2j.h.a.C3546a.a, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : q2jVar2;
                }
                if (o2jVar2 instanceof o2j.i) {
                    return i(q2jVar2, q2j.d.e.a);
                }
                if (o2jVar2 instanceof o2j.e) {
                    return i(q2jVar2, q2j.d.a.a);
                }
                if (o2jVar2 instanceof o2j.k) {
                    return i(q2jVar2, new q2j.d.g(((o2j.k) o2jVar2).b));
                }
                if (o2jVar2 instanceof o2j.h) {
                    return i(q2jVar2, q2j.d.C3545d.a);
                }
                if (o2jVar2 instanceof o2j.g) {
                    return i(q2jVar2, q2j.d.c.a);
                }
                if (o2jVar2 instanceof o2j.f) {
                    return i(q2jVar2, q2j.d.b.a);
                }
                if (o2jVar2 instanceof o2j.j) {
                    return i(q2jVar2, q2j.d.f.a);
                }
                if (o2jVar2 instanceof o2j.l) {
                    return i(q2jVar2, new q2j.d.h(((o2j.l) o2jVar2).b));
                }
                if (o2jVar2 instanceof o2j.t) {
                    c2j.b bVar2 = (c2j.b) c2j.b.get(j().a.b());
                    aVar = bVar2 != null ? bVar2.d : null;
                    if (aVar == null) {
                        return q2jVar2;
                    }
                    j().b(c2j.a.a(aVar, true));
                    return q2jVar2;
                }
                if (!(o2jVar2 instanceof o2j.u)) {
                    if (o2jVar2 instanceof o2j.o) {
                        return q2jVar2 instanceof q2j.h ? q2j.h.a((q2j.h) q2jVar2, null, dVar, 127) : q2jVar2 instanceof q2j.c ? q2j.c.a((q2j.c) q2jVar2, 0, false, false, false, 0, dVar, 63) : q2jVar2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c2j.b bVar3 = (c2j.b) c2j.b.get(j().a.b());
                aVar = bVar3 != null ? bVar3.d : null;
                if (aVar == null) {
                    return q2jVar2;
                }
                j().b(c2j.a.a(aVar, false));
                return q2jVar2;
            }
        }
        return q2j.b.b;
    }

    @Override // xsna.dm50
    public final r2j d() {
        return new r2j(e(new nj(14)), e(new y40(23)), e(new wl0(this, 29)), e(new srg(this, 2)), e(new x90(11)), e(new y90(19)));
    }

    @Override // xsna.dm50
    public final void h(q2j q2jVar, r2j r2jVar) {
        q2j q2jVar2 = q2jVar;
        r2j r2jVar2 = r2jVar;
        if (q2jVar2 instanceof q2j.f) {
            f(r2jVar2.a, q2jVar2);
            return;
        }
        if (q2jVar2 instanceof q2j.g) {
            f(r2jVar2.b, q2jVar2);
            return;
        }
        if (q2jVar2 instanceof q2j.c) {
            f(r2jVar2.d, q2jVar2);
            return;
        }
        if (q2jVar2 instanceof q2j.h) {
            f(r2jVar2.c, q2jVar2);
        } else if (q2jVar2 instanceof q2j.e) {
            f(r2jVar2.e, q2jVar2);
        } else {
            if (!(q2jVar2 instanceof q2j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(r2jVar2.f, q2jVar2);
        }
    }

    public final c2j j() {
        return (c2j) this.e.getValue();
    }

    public final q2j l(boolean z, o2j.x xVar) {
        int i;
        int i2;
        if (!xVar.f.isEmpty()) {
            return m(xVar);
        }
        if (z) {
            c2j.b bVar = (c2j.b) c2j.b.get(j().a.b());
            c2j.a aVar = bVar != null ? bVar.d : null;
            if (aVar != null && aVar.b && 1 <= (i = aVar.a) && i < 51 && 1 <= (i2 = aVar.f) && i2 < 1000) {
                return new q2j.g(false, new q2j.a.C3544a(i, i2, aVar.c, aVar.e));
            }
        }
        int i3 = xVar.d;
        c2j.a a2 = j().a();
        return new q2j.c(i3, a2.a, a2.c, a2.d, a2.e, a2.f, q2j.d.i.a);
    }

    public final void n(q2j.c cVar) {
        j().b(new c2j.a(cVar.c, cVar.g, false, cVar.d, cVar.e, cVar.f));
    }
}
