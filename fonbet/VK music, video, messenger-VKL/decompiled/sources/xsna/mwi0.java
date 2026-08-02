package xsna;

import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.voip.ui.sessionrooms.f;
import com.vk.voip.utils.timer.CountDownTimer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.a7f0;
import xsna.qwi0;
import xsna.rwi0;
import xsna.swi0;
import xsna.wwi0;

/* compiled from: SessionRoomsFeature.kt */
/* loaded from: classes7.dex */
public final class mwi0 extends wk50<ywi0, wwi0, qwi0, swi0> {
    public final OKVoipEngine f;
    public final s12 g;
    public final tog h;
    public final io.reactivex.rxjava3.subjects.f<rwi0> i;
    public final nwi0 j;
    public CountDownTimer k;
    public final io.reactivex.rxjava3.subjects.f<a> l;
    public final io.reactivex.rxjava3.subjects.d<Boolean> m;

    /* compiled from: SessionRoomsFeature.kt */
    public static final class a {
        public final boolean a;
        public final wwi0.b b;

        public a(boolean z, wwi0.b bVar) {
            this.a = z;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "CloseRoomsParams(isShowClosedDialog=" + this.a + ", presence=" + this.b + ')';
        }
    }

    public mwi0(OKVoipEngine oKVoipEngine, s12 s12Var, tog togVar) {
        super(qwi0.c.b, new hxi0());
        this.f = oKVoipEngine;
        this.g = s12Var;
        this.h = togVar;
        this.i = new io.reactivex.rxjava3.subjects.f<>();
        nwi0 nwi0Var = new nwi0(this);
        this.j = nwi0Var;
        this.l = new io.reactivex.rxjava3.subjects.f<>();
        this.m = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        oKVoipEngine.getClass();
        OKVoipEngine.r.add(nwi0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        if (xsna.epx.f(((xsna.wwi0.c.C3962c) r13).a, r0) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        if (xsna.epx.f(((xsna.wwi0.b.C3961b) r2).a.a, r0) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0173, code lost:
    
        if (xsna.epx.f(((xsna.wwi0.b.C3961b) r2).a.a, r12 != null ? r12.a : null) == false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(wwi0 wwi0Var, qwi0 qwi0Var) {
        boolean z;
        boolean z2;
        wwi0 wwi0Var2 = wwi0Var;
        qwi0 qwi0Var2 = qwi0Var;
        boolean z3 = wwi0Var2.d;
        wwi0.c cVar = wwi0Var2.b;
        Collection<wwi0.c.C3962c> collection = wwi0Var2.c;
        wwi0.b bVar = wwi0Var2.e;
        boolean z4 = qwi0Var2 instanceof qwi0.c;
        OKVoipEngine oKVoipEngine = this.f;
        if (z4) {
            W(oKVoipEngine.isMeCreatorOrAdmin());
            return;
        }
        if (qwi0Var2 instanceof qwi0.d) {
            qwi0.d dVar = (qwi0.d) qwi0Var2;
            if (!(cVar instanceof wwi0.c.a)) {
                T(new swi0.e(new wwi0.c.C3962c(dVar.b, dVar.c, dVar.d, dVar.e)));
            }
        } else {
            if (qwi0Var2 instanceof qwi0.p) {
                T(new swi0.e(wwi0.c.b.a));
                return;
            }
            if (qwi0Var2 instanceof qwi0.m) {
                qwi0.m mVar = (qwi0.m) qwi0Var2;
                Long l = mVar.g;
                boolean z5 = mVar.d;
                if (l != null && this.k == null && z5) {
                    owi0 owi0Var = new owi0(this, wwi0Var2);
                    CountDownTimer countDownTimer = new CountDownTimer();
                    countDownTimer.a = CountDownTimer.d;
                    CountDownTimer.State state = CountDownTimer.State.FINISHED;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    countDownTimer.c = linkedHashSet;
                    linkedHashSet.add(owi0Var);
                    ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.a(new com.vk.catalog2.common.ui.holders.a(26, countDownTimer, mVar));
                    this.k = countDownTimer;
                }
                SessionRoomId.Room room = mVar.b;
                String str = mVar.c;
                wwi0.c.C3962c c3962c = new wwi0.c.C3962c(room, str, z5, mVar.e);
                if (bVar instanceof wwi0.b.C3961b) {
                    wwi0.b.C3961b c3961b = (wwi0.b.C3961b) bVar;
                    if (c3961b.b && room.equals(c3961b.a.a) && str.length() > 0) {
                        V(new rwi0.c.g(c3962c));
                    }
                }
                T(new swi0.i(c3962c));
                return;
            }
            if (qwi0Var2 instanceof qwi0.j) {
                qwi0.j jVar = (qwi0.j) qwi0Var2;
                SessionRoomId.Room room2 = jVar.b;
                String str2 = jVar.c;
                wwi0.c.C3962c c3962c2 = new wwi0.c.C3962c(room2, str2, jVar.d, jVar.e);
                if (!(bVar instanceof wwi0.b.a)) {
                    if (bVar instanceof wwi0.b.c) {
                        wwi0.c cVar2 = ((wwi0.b.c) bVar).a;
                        if (!(cVar2 instanceof wwi0.c.b)) {
                            if (cVar2 instanceof wwi0.c.C3962c) {
                            }
                            r6 = false;
                            T(new swi0.c(c3962c2, r6));
                            return;
                        }
                    } else if (!(bVar instanceof wwi0.b.C3961b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (str2.length() != 0) {
                    V(new rwi0.c.g(c3962c2));
                    r6 = false;
                }
                T(new swi0.c(c3962c2, r6));
                return;
            }
            boolean z6 = qwi0Var2 instanceof qwi0.k;
            io.reactivex.rxjava3.subjects.d<Boolean> dVar2 = this.m;
            if (z6) {
                if (!(bVar instanceof wwi0.b.C3961b) && (!(bVar instanceof wwi0.b.c) || (((wwi0.b.c) bVar).a instanceof wwi0.c.b))) {
                    r6 = false;
                }
                dVar2.onNext(Boolean.valueOf(r6));
                T(swi0.h.b);
                return;
            }
            if (qwi0Var2 instanceof qwi0.i) {
                T(swi0.b.b);
                return;
            }
            wwi0.c.C3962c c3962c3 = null;
            if (qwi0Var2 instanceof qwi0.e) {
                f.a.b bVar2 = ((qwi0.e) qwi0Var2).b;
                if (!(bVar instanceof wwi0.b.c)) {
                    if (bVar instanceof wwi0.b.C3961b) {
                    }
                    if (cVar instanceof wwi0.c.C3962c) {
                        c3962c3 = (wwi0.c.C3962c) cVar;
                    } else {
                        boolean z7 = cVar instanceof wwi0.c.a;
                        if (z7 && bVar2 == null) {
                            V(rwi0.a.c.a);
                        } else if (z7 && bVar2 != null) {
                            c3962c3 = new wwi0.c.C3962c(bVar2.a, bVar2.b, bVar2.c, bVar2.d);
                        }
                    }
                    if (c3962c3 != null) {
                        oKVoipEngine.getClass();
                        SessionRoomsManager D = OKVoipEngine.D();
                        if (D != null) {
                            D.joinRoom(c3962c3.a, new ax5(wwi0Var2, this, c3962c3, 7), new hsc0(this, 11));
                        }
                    }
                }
            } else {
                int i = 25;
                if (qwi0Var2 instanceof qwi0.f) {
                    if (bVar instanceof wwi0.b.C3961b) {
                        oKVoipEngine.getClass();
                        SessionRoomsManager D2 = OKVoipEngine.D();
                        if (D2 != null) {
                            D2.leaveRoom(new rp1(20, this, wwi0Var2), new d0w(this, i));
                        }
                    }
                } else if (!(qwi0Var2 instanceof qwi0.h)) {
                    if (qwi0Var2 instanceof qwi0.n) {
                        T(new swi0.d(((qwi0.n) qwi0Var2).b));
                        return;
                    }
                    if (qwi0Var2 instanceof qwi0.l) {
                        SessionRoomId.Room room3 = ((qwi0.l) qwi0Var2).b;
                        L.e("SessionRoomsFeature", "Room " + room3 + " removed. Our state is " + wwi0Var2);
                        Collection<wwi0.c.C3962c> collection2 = collection;
                        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                            Iterator<T> it = collection2.iterator();
                            while (it.hasNext()) {
                                if (((wwi0.c.C3962c) it.next()).c) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : collection2) {
                            if (!epx.f(((wwi0.c.C3962c) obj).a, room3)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (((wwi0.c.C3962c) it2.next()).c) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        T(new swi0.f(arrayList));
                        if (z && !z2) {
                            CountDownTimer countDownTimer2 = this.k;
                            if (countDownTimer2 != null) {
                                android.os.CountDownTimer countDownTimer3 = countDownTimer2.b;
                                if (countDownTimer3 != null) {
                                    countDownTimer3.cancel();
                                }
                                com.vk.voip.utils.timer.a aVar = com.vk.voip.utils.timer.a.b;
                                countDownTimer2.b = null;
                                CountDownTimer.State state2 = CountDownTimer.State.FINISHED;
                                Iterator it3 = countDownTimer2.c.iterator();
                                while (it3.hasNext()) {
                                    aVar.invoke(it3.next());
                                }
                            }
                            this.k = null;
                            tog togVar = this.h;
                            this.l.onNext(new a(!z3 && ((Boolean) togVar.invoke()).booleanValue(), wwi0Var2.g));
                            dVar2.onNext(Boolean.FALSE);
                            L.e("SessionRoomsFeature", "Rooms closed notification");
                            if (!((Boolean) togVar.invoke()).booleanValue()) {
                                L.e("SessionRoomsFeature", "Rooms closed notification suppressed because the call is not alive anymore");
                            }
                        }
                    } else if (qwi0Var2 instanceof qwi0.g) {
                        SessionRoomId sessionRoomId = ((qwi0.g) qwi0Var2).b;
                        if (sessionRoomId instanceof SessionRoomId.MainCall) {
                            V(rwi0.c.e.a);
                            s3q0 s3q0Var = s3q0.a;
                            return;
                        }
                        Iterator<T> it4 = collection.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            Object next = it4.next();
                            if (epx.f(((wwi0.c.C3962c) next).a, sessionRoomId)) {
                                c3962c3 = next;
                                break;
                            }
                        }
                        wwi0.c.C3962c c3962c4 = c3962c3;
                        if (c3962c4 != null) {
                            V(new rwi0.c.f(c3962c4.b));
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                    } else if (qwi0Var2 instanceof qwi0.a) {
                        qwi0.a aVar2 = (qwi0.a) qwi0Var2;
                        if (z3) {
                            com.vk.voip.ui.c.b.getClass();
                            com.vk.voip.ui.sessionrooms.d dVar3 = com.vk.voip.ui.c.B0;
                            ParticipantId participantId = aVar2.b;
                            dVar3.a.getClass();
                            SessionRoomsManager D3 = OKVoipEngine.D();
                            a7f0.a.f(this, D3 == null ? io.reactivex.rxjava3.core.x.i(new RuntimeException("not permitted")) : new io.reactivex.rxjava3.internal.operators.single.b(new ll2(D3, participantId)), new ndg0(2, this, aVar2), new d220(15), 1);
                        }
                    } else {
                        if (!(qwi0Var2 instanceof qwi0.b)) {
                            if (!(qwi0Var2 instanceof qwi0.o)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qwi0.o oVar = (qwi0.o) qwi0Var2;
                            if (bVar instanceof wwi0.b.C3961b) {
                                V(new rwi0.c.h(oVar.b));
                                return;
                            }
                            return;
                        }
                        qwi0.b bVar3 = (qwi0.b) qwi0Var2;
                        SessionRoomId sessionRoomId2 = bVar3.c;
                        if (!(sessionRoomId2 instanceof SessionRoomId.MainCall)) {
                            Iterator<T> it5 = collection.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                Object next2 = it5.next();
                                if (epx.f(((wwi0.c.C3962c) next2).a, sessionRoomId2)) {
                                    c3962c3 = next2;
                                    break;
                                }
                            }
                            wwi0.c.C3962c c3962c5 = c3962c3;
                            if (c3962c5 != null) {
                                a7f0.a.f(this, ((VoipDataProvider) this.g.invoke()).h(Collections.singletonList(bVar3.b.id)), new j4c(bVar3, this, c3962c5, wwi0Var2, 2), new uuz(i), 1);
                            }
                        }
                    }
                } else if (bVar instanceof wwi0.b.C3961b) {
                    oKVoipEngine.getClass();
                    SessionRoomsManager D4 = OKVoipEngine.D();
                    if (D4 != null) {
                        D4.requestAttention(new x850(this, i), new el30(this, 28));
                    }
                }
            }
        }
    }

    public final io.reactivex.rxjava3.subjects.f U() {
        return this.i;
    }

    public final void V(rwi0 rwi0Var) {
        this.i.onNext(rwi0Var);
    }

    public final void W(boolean z) {
        C(new qwi0.n(z));
    }

    public final void X() {
        A();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a7f0.a.e(this, this.l.y(300L, timeUnit), null, new aj50(this, 20), null, null, 13);
        a7f0.a.e(this, this.m.y(500L, timeUnit), null, new arb0(this, 13), null, null, 13);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.f.getClass();
        OKVoipEngine.r.remove(this.j);
    }
}
