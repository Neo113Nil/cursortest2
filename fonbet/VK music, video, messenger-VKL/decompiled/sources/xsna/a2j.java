package xsna;

import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.sessionrooms.SessionRoomsObserver;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vk.voip.ui.sessionrooms.f;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;
import xsna.a7f0;
import xsna.o2j;
import xsna.q2j;
import xsna.v1j;

/* compiled from: ConfigureSessionRoomsFeature.kt */
/* loaded from: classes7.dex */
public final class a2j extends wk50<r2j, q2j, v1j, o2j> {
    public final com.vk.voip.b f;
    public final qvi0 g;
    public boolean h;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((SessionRoomParticipantModel) t).a.id, ((SessionRoomParticipantModel) t2).a.id);
        }
    }

    /* compiled from: ConfigureSessionRoomsFeature.kt */
    public static final class b implements izs {
        public final /* synthetic */ com.vk.voip.ui.sessionrooms.c b;

        public b(com.vk.voip.ui.sessionrooms.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            Collection collection = (Collection) obj;
            ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a.b) it.next()).a);
            }
            return this.b.f(arrayList);
        }
    }

    public a2j(com.vk.voip.b bVar, qvi0 qvi0Var) {
        super(v1j.h.b, new p2j(bVar));
        this.f = bVar;
        this.g = qvi0Var;
    }

    public static Integer V(a.b bVar, Integer num) {
        int i;
        Collection<SessionRoomParticipantModel> collection = bVar.d;
        Collection<lvi0> collection2 = bVar.c;
        if (collection == null) {
            return null;
        }
        List D0 = j5g.D0(new a(), collection);
        if (D0 == null) {
            return null;
        }
        int size = D0.size();
        Iterator<T> it = collection2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            List<SessionRoomParticipantModel> list = ((lvi0) it.next()).d;
            i2 += list != null ? list.size() : 0;
        }
        int i3 = size + i2;
        int intValue = num != null ? num.intValue() : collection2.size();
        if (i3 > intValue) {
            i = i3 / intValue;
            if (i3 % intValue > 0) {
                i++;
            }
        } else {
            i = 1;
        }
        StringBuilder a2 = odj.a(i, i2, "Will now assign participants to rooms randomly by ", " per room. Total in rooms: ", ", total unassigned: ");
        cgn.a(size, i3, ", total participants: ", ", rooms: ", a2);
        a2.append(intValue);
        L.e(a2.toString());
        return Integer.valueOf(i);
    }

    @Override // xsna.wk50
    public final void N(q2j q2jVar, v1j v1jVar) {
        Pair pair;
        Pair pair2;
        io.reactivex.rxjava3.core.a eVar;
        q2j q2jVar2 = q2jVar;
        v1j v1jVar2 = v1jVar;
        if (v1jVar2 instanceof v1j.h) {
            if (q2jVar2 instanceof q2j.f) {
                T(new o2j.q(true));
                a7f0.a.e(this, new com.vk.voip.ui.sessionrooms.dialog.model.a(this.f).e(new a.C2077a(null, new mo1(23), new kdw(1), null, 51)).w0(50L, TimeUnit.MILLISECONDS), null, new igh(this, 4), new wh1(12), null, 9);
            }
            com.vk.voip.ui.c.b.getClass();
            a7f0.a.e(this, com.vk.voip.ui.c.B0.l(), null, new b2j(this), null, null, 13);
            return;
        }
        if (v1jVar2 instanceof v1j.t) {
            T(new o2j.w(((v1j.t) v1jVar2).b));
            return;
        }
        if (v1jVar2 instanceof v1j.s) {
            v1j.s sVar = (v1j.s) v1jVar2;
            if (q2jVar2 instanceof q2j.c) {
                T(new o2j.z(sVar.b));
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.u) {
            T(new o2j.y(((v1j.u) v1jVar2).b));
            return;
        }
        if (v1jVar2 instanceof v1j.v) {
            v1j.v vVar = (v1j.v) v1jVar2;
            T(new o2j.a0(vVar.b, vVar.c));
            return;
        }
        if (v1jVar2 instanceof v1j.f) {
            boolean z = q2jVar2 instanceof q2j.c;
            if (z) {
                q2j.c cVar = (q2j.c) q2jVar2;
                pair = new Pair(Integer.valueOf(cVar.c), Boolean.valueOf(cVar.d));
            } else {
                if (!(q2jVar2 instanceof q2j.g)) {
                    return;
                }
                q2j.a aVar = ((q2j.g) q2jVar2).c;
                if (!(aVar instanceof q2j.a.C3544a)) {
                    return;
                }
                q2j.a.C3544a c3544a = (q2j.a.C3544a) aVar;
                pair = new Pair(Integer.valueOf(c3544a.a), Boolean.valueOf(c3544a.b));
            }
            int intValue = ((Number) pair.d()).intValue();
            boolean booleanValue = ((Boolean) pair.g()).booleanValue();
            if (z) {
                q2j.c cVar2 = (q2j.c) q2jVar2;
                pair2 = new Pair(Boolean.valueOf(cVar2.f), Integer.valueOf(cVar2.g));
            } else {
                if (!(q2jVar2 instanceof q2j.g)) {
                    return;
                }
                q2j.a aVar2 = ((q2j.g) q2jVar2).c;
                if (!(aVar2 instanceof q2j.a.C3544a)) {
                    return;
                }
                q2j.a.C3544a c3544a2 = (q2j.a.C3544a) aVar2;
                pair2 = new Pair(Boolean.valueOf(c3544a2.c), Integer.valueOf(c3544a2.d));
            }
            boolean booleanValue2 = ((Boolean) pair2.d()).booleanValue();
            int intValue2 = ((Number) pair2.g()).intValue();
            if (booleanValue) {
                eVar = new io.reactivex.rxjava3.internal.operators.single.s(U(), new z8(new x1j(this, intValue, booleanValue2, intValue2), 10));
            } else {
                Integer num = null;
                Integer valueOf = booleanValue2 ? Integer.valueOf(intValue2 * 60) : null;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
                dVar.getClass();
                eVar = new io.reactivex.rxjava3.internal.operators.completable.e(new fwi0(dVar, num, intValue, valueOf));
            }
            io.reactivex.rxjava3.core.a aVar3 = eVar;
            defpackage.p pVar = new defpackage.p(new u4e(this, 6), 19);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.w(aVar3, pVar, lVar, kVar, kVar, kVar, kVar), null, new sz(this, 28), new y1j(booleanValue, this, 0), 1);
            return;
        }
        if (v1jVar2 instanceof v1j.i) {
            if (q2jVar2 instanceof q2j.h) {
                T(o2j.a.b);
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.j) {
            v1j.j jVar = (v1j.j) v1jVar2;
            if (q2jVar2 instanceof q2j.h) {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.sessionrooms.d dVar2 = com.vk.voip.ui.c.B0;
                String str = jVar.b;
                dVar2.getClass();
                a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.e(new xx50(dVar2, str)), null, new com.vk.libvideo.b(12, this, jVar), new dof(jVar, 12), 1);
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.m) {
            v1j.m mVar = (v1j.m) v1jVar2;
            if (q2jVar2 instanceof q2j.h) {
                com.vk.voip.ui.c.b.getClass();
                a7f0.a.d(this, com.vk.voip.ui.c.B0.f(Collections.singletonList(mVar.b)), null, new oh3(12, mVar, this), new com.vk.movika.sdk.android.defaultplayer.interactive.a(mVar, 29), 1);
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.o) {
            v1j.o oVar = (v1j.o) v1jVar2;
            if (q2jVar2 instanceof q2j.h) {
                T(new o2j.s(oVar.b));
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.n) {
            v1j.n nVar = (v1j.n) v1jVar2;
            if (q2jVar2 instanceof q2j.h) {
                com.vk.voip.ui.c.b.getClass();
                final com.vk.voip.ui.sessionrooms.d dVar3 = com.vk.voip.ui.c.B0;
                final SessionRoomId.Room room = nVar.b;
                final String str2 = nVar.c;
                dVar3.getClass();
                a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.e(new io.reactivex.rxjava3.core.d() { // from class: xsna.dwi0
                    @Override // io.reactivex.rxjava3.core.d
                    public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
                        com.vk.voip.ui.sessionrooms.d.this.a.getClass();
                        SessionRoomsManager D = OKVoipEngine.D();
                        if (D != null) {
                            D.updateRooms(new UpdateRoomsParams.Builder().addRoom(new UpdateRoomsParams.Room.Builder().setId(room).setName(str2)).build(), new ofc0(bVar, 6), new qjg0(bVar, 1));
                        }
                    }
                }), null, new com.vk.libvideo.design.view.video.a(11, nVar, this), new ncg(nVar, 10), 1);
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.p) {
            if (q2jVar2 instanceof q2j.h) {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.sessionrooms.d dVar4 = com.vk.voip.ui.c.B0;
                a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.single.s(dVar4.b.a(SessionRoomsObserver.ObserveRoomsScope.ALL).K(), new awi0(new yhu(dVar4, 28), 0)), null, new nhe(this, 9), new h4(6, this, q2jVar2), 1);
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.r) {
            a7f0.a.d(this, W(q2jVar2), null, new qu(this, 28), new x3i(this, 3), 1);
            return;
        }
        if (v1jVar2 instanceof v1j.q) {
            a7f0.a.d(this, W(q2jVar2), null, new omf(this, 6), new ocg(this, 9), 1);
            return;
        }
        if (v1jVar2 instanceof v1j.e) {
            v1j.e eVar2 = (v1j.e) v1jVar2;
            if (q2jVar2 instanceof q2j.h) {
                T(new o2j.m(eVar2.b));
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.c) {
            if ((q2jVar2 instanceof q2j.h) && (((q2j.h) q2jVar2).g instanceof q2j.h.a.g)) {
                T(o2j.b.b);
                int i = 8;
                a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.j(U(), new w1j(this, 0)), new ju1(new z1j(1, this, a2j.class, "assignParticipantsToRooms", "assignParticipantsToRooms(Lcom/vk/voip/ui/sessionrooms/dialog/model/SessionRoomsDataProvider$ObserveSessionRoomsResult;)Lio/reactivex/rxjava3/core/Completable;", 0), 18)), null, new pcg(this, i), new fn4(i), 1);
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.d) {
            T(o2j.v.b);
            return;
        }
        if (v1jVar2 instanceof v1j.k) {
            v1j.k kVar2 = (v1j.k) v1jVar2;
            if (q2jVar2 instanceof q2j.h) {
                T(new o2j.n(kVar2.b));
                return;
            }
            return;
        }
        if (v1jVar2 instanceof v1j.b) {
            v1j.b bVar = (v1j.b) v1jVar2;
            if ((q2jVar2 instanceof q2j.h) && ((q2j.h) q2jVar2).f) {
                T(new o2j.c(bVar.b));
                return;
            }
            return;
        }
        if (!(v1jVar2 instanceof v1j.a)) {
            if (v1jVar2 instanceof v1j.l) {
                T(o2j.r.b);
                return;
            } else {
                if (!(v1jVar2 instanceof v1j.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(o2j.o.b);
                return;
            }
        }
        v1j.a aVar4 = (v1j.a) v1jVar2;
        ParticipantId participantId = aVar4.b;
        if ((q2jVar2 instanceof q2j.h) && (((q2j.h) q2jVar2).g instanceof q2j.h.a.g)) {
            SessionRoomId.Room room2 = aVar4.c;
            T(new o2j.d(room2, participantId));
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.sessionrooms.d dVar5 = com.vk.voip.ui.c.B0;
            Map f = on00.f(new Pair(room2, Collections.singletonList(participantId)));
            dVar5.getClass();
            a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.h(new io.reactivex.rxjava3.internal.operators.completable.e(new bwi0(f, jgp.b, dVar5)), new vy3(this, 3)), null, new ll1(7, aVar4, this), new trf(aVar4, 11), 1);
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 U() {
        return new com.vk.voip.ui.sessionrooms.dialog.model.a(this.f).e(new a.C2077a(null, new mo1(23), null, null, 59)).K();
    }

    public final io.reactivex.rxjava3.core.a W(q2j q2jVar) {
        if (!(q2jVar instanceof q2j.h)) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
        io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(dVar.l().K(), new iw3(new b(dVar), 7));
        ph3 ph3Var = new ph3(new k7f(this, 4), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(sVar, ph3Var, lVar, kVar, kVar, kVar, kVar);
    }
}
