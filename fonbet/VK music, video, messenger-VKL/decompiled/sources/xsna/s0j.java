package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.a7f0;
import xsna.d1j;
import xsna.j0j;
import xsna.l1j;
import xsna.v1j;

/* compiled from: ConfigureRoomParticipantsFeature.kt */
/* loaded from: classes7.dex */
public final class s0j extends wk50<m1j, l1j, j0j, d1j> {
    public final com.vk.voip.b f;
    public final k0j g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;

    public s0j(com.vk.voip.b bVar, SessionRoomId.Room room, k0j k0jVar) {
        super(new j0j.e(room), new e1j(l1j.c.b));
        this.f = bVar;
        this.g = k0jVar;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.h = emptyDisposable;
        this.i = emptyDisposable;
    }

    public static Set U(ParticipantId participantId, LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (epx.f(((ParticipantId) obj).id, participantId.id)) {
                arrayList.add(obj);
            }
        }
        return j5g.S0(arrayList);
    }

    public static Set W(ParticipantId participantId, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!epx.f(((ParticipantId) obj).id, participantId.id)) {
                arrayList.add(obj);
            }
        }
        return j5g.S0(arrayList);
    }

    @Override // xsna.wk50
    public final void N(l1j l1jVar, j0j j0jVar) {
        l1j.e a;
        io.reactivex.rxjava3.core.a eVar;
        l1j l1jVar2 = l1jVar;
        j0j j0jVar2 = j0jVar;
        boolean z = j0jVar2 instanceof j0j.e;
        d1j.i iVar = d1j.i.b;
        if (z) {
            SessionRoomId.Room room = ((j0j.e) j0jVar2).b;
            if (room.getId() == 0) {
                T(iVar);
            } else if (l1jVar2 instanceof l1j.c) {
                V(room);
            }
        } else if (j0jVar2 instanceof j0j.g) {
            if (l1jVar2 instanceof l1j.b) {
                ((l1j.b) l1jVar2).getClass();
                V(null);
            } else if (l1jVar2 instanceof l1j.f) {
                V(((l1j.f) l1jVar2).b);
            } else if (l1jVar2 instanceof l1j.g) {
                V(((l1j.g) l1jVar2).b);
            }
        } else if (j0jVar2 instanceof j0j.h) {
            if (l1jVar2 instanceof l1j.f) {
                this.g.invoke(new v1j.k(((l1j.f) l1jVar2).b));
            }
        } else if (j0jVar2 instanceof j0j.f) {
            j0j.f fVar = (j0j.f) j0jVar2;
            SessionRoomId sessionRoomId = fVar.c;
            ParticipantId participantId = fVar.b;
            if (l1jVar2 instanceof l1j.f) {
                l1j.f fVar2 = (l1j.f) l1jVar2;
                if (fVar2.h instanceof l1j.f.b.a) {
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
                    boolean z2 = fVar2.d;
                    SessionRoomId.Room room2 = fVar2.b;
                    if (z2) {
                        dVar.getClass();
                        eVar = new io.reactivex.rxjava3.internal.operators.completable.e(new gwi0(dVar, sessionRoomId, participantId, 0)).g(new dhe(1, fVar, this));
                    } else if (sessionRoomId instanceof SessionRoomId.Room) {
                        Map f = on00.f(new Pair(sessionRoomId, Collections.singletonList(participantId)));
                        Map f2 = on00.f(new Pair(room2, Collections.singletonList(participantId)));
                        dVar.getClass();
                        eVar = new io.reactivex.rxjava3.internal.operators.completable.e(new bwi0(f, f2, dVar));
                    } else {
                        if (!(sessionRoomId instanceof SessionRoomId.MainCall)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Map f3 = on00.f(new Pair(room2, Collections.singletonList(participantId)));
                        dVar.getClass();
                        eVar = new io.reactivex.rxjava3.internal.operators.completable.e(new bwi0(jgp.b, f3, dVar));
                    }
                    this.e.b(io.reactivex.rxjava3.kotlin.c.d(new io.reactivex.rxjava3.internal.operators.completable.h(eVar, new ahe(this, 1)), new nh0(10), new b5h(this, 3)));
                }
            }
        } else if (j0jVar2 instanceof j0j.k) {
            j0j.k kVar = (j0j.k) j0jVar2;
            ParticipantId participantId2 = kVar.b;
            if (l1jVar2 instanceof l1j.f) {
                l1j.f fVar3 = (l1j.f) l1jVar2;
                SessionRoomId.Room room3 = fVar3.b;
                l1j.e eVar2 = fVar3.g;
                SessionRoomParticipantModel sessionRoomParticipantModel = (SessionRoomParticipantModel) eVar2.a.get(participantId2);
                if (sessionRoomParticipantModel != null) {
                    if (fVar3.d) {
                        T(new d1j.f(room3, sessionRoomParticipantModel));
                        return;
                    }
                    if (!kVar.c) {
                        T(new d1j.g(room3, sessionRoomParticipantModel));
                        return;
                    }
                    Set<ParticipantId> set = eVar2.d;
                    LinkedHashSet linkedHashSet = eVar2.c;
                    LinkedHashSet linkedHashSet2 = eVar2.b;
                    Set<ParticipantId> set2 = eVar2.e;
                    if (set.contains(participantId2)) {
                        a = l1j.e.a(eVar2, W(participantId2, set), null, 23);
                    } else if (set2.contains(participantId2)) {
                        a = l1j.e.a(eVar2, null, W(participantId2, set2), 15);
                    } else if (linkedHashSet2.contains(participantId2)) {
                        a = l1j.e.a(eVar2, null, izi0.j(set2, U(participantId2, linkedHashSet2)), 15);
                    } else if (linkedHashSet.contains(participantId2)) {
                        a = l1j.e.a(eVar2, izi0.j(set, U(participantId2, linkedHashSet)), null, 23);
                    }
                    T(new d1j.e(a));
                }
            }
        } else {
            if (!(j0jVar2 instanceof j0j.a)) {
                if (j0jVar2 instanceof j0j.d) {
                    if ((l1jVar2 instanceof l1j.f) && ((l1j.f) l1jVar2).d) {
                        com.vk.voip.ui.c.b.getClass();
                        com.vk.voip.ui.sessionrooms.d dVar2 = com.vk.voip.ui.c.B0;
                        a7f0.a.f(this, dVar2.l().K().l(new p7(new r0j(l1jVar2), 23)), new sf4(5, this, dVar2), new nhe(l1jVar2, 8), 1);
                        return;
                    }
                    return;
                }
                if (j0jVar2 instanceof j0j.i) {
                    j0j.i iVar2 = (j0j.i) j0jVar2;
                    if (l1jVar2 instanceof l1j.f) {
                        T(new d1j.m(iVar2.b));
                        return;
                    }
                    return;
                }
                if (j0jVar2 instanceof j0j.j) {
                    T(new d1j.h(((j0j.j) j0jVar2).b));
                    return;
                } else if (j0jVar2 instanceof j0j.b) {
                    T(iVar);
                    return;
                } else {
                    if (!(j0jVar2 instanceof j0j.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T(d1j.c.b);
                    return;
                }
            }
            if (l1jVar2 instanceof l1j.f) {
                l1j.f fVar4 = (l1j.f) l1jVar2;
                l1j.e eVar3 = fVar4.g;
                SessionRoomId.Room room4 = fVar4.b;
                LinkedHashMap m = pn00.m(new Pair(room4, eVar3.d));
                LinkedHashMap m2 = pn00.m(new Pair(room4, eVar3.e));
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.sessionrooms.d dVar3 = com.vk.voip.ui.c.B0;
                dVar3.getClass();
                io.reactivex.rxjava3.internal.operators.completable.e eVar4 = new io.reactivex.rxjava3.internal.operators.completable.e(new bwi0(m, m2, dVar3));
                ov2 ov2Var = new ov2(new zt4(this, 26), 13);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
                a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.w(eVar4, ov2Var, lVar, kVar2, kVar2, kVar2, kVar2), null, new m4g(this, 7), new trf(this, 10), 1);
            }
        }
    }

    @Override // xsna.wk50
    public final List<j0j> Q(l1j l1jVar, l1j l1jVar2, d1j d1jVar) {
        l1j l1jVar3 = l1jVar;
        l1j l1jVar4 = l1jVar2;
        d1j d1jVar2 = d1jVar;
        boolean z = l1jVar4 instanceof l1j.f;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (z) {
            if (this.i.h()) {
                com.vk.voip.ui.c.b.getClass();
                io.reactivex.rxjava3.disposables.c subscribe = com.vk.voip.ui.c.B0.b().a0(asu0.a.d()).U(new nu0(new la2(17), 15)).subscribe(new c60(new zkh(this, 3), 17));
                this.i = subscribe;
                bVar.b(subscribe);
            }
        } else if (!this.i.h()) {
            bVar.a(this.i);
        }
        super.Q(l1jVar3, l1jVar4, d1jVar2);
        return null;
    }

    public final void V(SessionRoomId.Room room) {
        this.e.a(this.h);
        this.h = a7f0.a.e(this, new com.vk.voip.ui.sessionrooms.dialog.model.a(this.f).e(new a.C2077a(room, new sm0(14), new mo1(23), new eqd(this, 11), 2)).w0(50L, TimeUnit.MILLISECONDS), null, new h6g(this, 7), new p4f(this, 8), null, 9);
    }
}
