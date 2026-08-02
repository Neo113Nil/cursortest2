package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.d1j;
import xsna.l1j;

/* compiled from: ConfigureRoomParticipantsReducer.kt */
/* loaded from: classes7.dex */
public final class e1j extends dm50<m1j, d1j, l1j> {
    public static Set i(Set set, Set set2) {
        if (set == null || set.isEmpty()) {
            return EmptySet.b;
        }
        if (set2.isEmpty()) {
            return EmptySet.b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (set2.contains((ParticipantId) obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static l1j.e j(l1j.e eVar, Collection collection, Collection collection2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (collection2 != null) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                SessionRoomParticipantModel sessionRoomParticipantModel = (SessionRoomParticipantModel) it.next();
                linkedHashMap.put(sessionRoomParticipantModel.a, sessionRoomParticipantModel);
                linkedHashSet.add(sessionRoomParticipantModel.a);
            }
        }
        if (collection != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                SessionRoomParticipantModel sessionRoomParticipantModel2 = (SessionRoomParticipantModel) it2.next();
                linkedHashMap.put(sessionRoomParticipantModel2.a, sessionRoomParticipantModel2);
                linkedHashSet2.add(sessionRoomParticipantModel2.a);
            }
        }
        return new l1j.e(linkedHashMap, linkedHashSet2, linkedHashSet, i(eVar != null ? eVar.d : null, linkedHashMap.keySet()), i(eVar != null ? eVar.e : null, linkedHashMap.keySet()));
    }

    @Override // xsna.dm50
    public final l1j c(l1j l1jVar, d1j d1jVar) {
        l1j l1jVar2 = l1jVar;
        d1j d1jVar2 = d1jVar;
        if (d1jVar2 instanceof d1j.i) {
            return l1j.a.b;
        }
        if (d1jVar2 instanceof d1j.k) {
            d1j.k kVar = (d1j.k) d1jVar2;
            if (l1jVar2 instanceof l1j.c) {
                return new l1j.d(kVar.b, kVar.c, kVar.d);
            }
        } else if (d1jVar2 instanceof d1j.j) {
            if (l1jVar2 instanceof l1j.d) {
                return new l1j.b();
            }
        } else if (d1jVar2 instanceof d1j.e) {
            d1j.e eVar = (d1j.e) d1jVar2;
            if (l1jVar2 instanceof l1j.f) {
                return l1j.f.a((l1j.f) l1jVar2, false, null, eVar.b, null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            }
        } else if (d1jVar2 instanceof d1j.l) {
            if (l1jVar2 instanceof l1j.f) {
                return new l1j.g(((l1j.f) l1jVar2).b);
            }
        } else if (d1jVar2 instanceof d1j.h) {
            d1j.h hVar = (d1j.h) d1jVar2;
            if (l1jVar2 instanceof l1j.f) {
                l1j.f fVar = (l1j.f) l1jVar2;
                return l1j.f.a(fVar, fVar.d && !epx.f(fVar.b, hVar.b), null, null, null, null, 247);
            }
        } else {
            boolean z = d1jVar2 instanceof d1j.d;
            l1j.f.b.a aVar = l1j.f.b.a.a;
            if (z) {
                d1j.d dVar = (d1j.d) d1jVar2;
                Collection<SessionRoomParticipantModel> collection = dVar.c;
                Collection<SessionRoomParticipantModel> collection2 = dVar.b;
                if (l1jVar2 instanceof l1j.d) {
                    l1j.d dVar2 = (l1j.d) l1jVar2;
                    return new l1j.f(dVar2.b, dVar2.c, dVar2.d, false, "", j(null, collection2, collection), aVar, l1j.f.a.c.a);
                }
                if (l1jVar2 instanceof l1j.f) {
                    l1j.f fVar2 = (l1j.f) l1jVar2;
                    return l1j.f.a(fVar2, false, null, j(fVar2.g, collection2, collection), null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                }
            } else if (d1jVar2 instanceof d1j.m) {
                d1j.m mVar = (d1j.m) d1jVar2;
                if (l1jVar2 instanceof l1j.f) {
                    return l1j.f.a((l1j.f) l1jVar2, false, mVar.b, null, null, null, 239);
                }
            } else if (d1jVar2 instanceof d1j.g) {
                d1j.g gVar = (d1j.g) d1jVar2;
                if (l1jVar2 instanceof l1j.f) {
                    l1j.f fVar3 = (l1j.f) l1jVar2;
                    return fVar3.h instanceof l1j.f.b.a ? l1j.f.a(fVar3, false, null, null, new l1j.f.b.c(gVar.b, gVar.c), null, 191) : fVar3;
                }
            } else if (d1jVar2 instanceof d1j.f) {
                d1j.f fVar4 = (d1j.f) d1jVar2;
                if (l1jVar2 instanceof l1j.f) {
                    l1j.f fVar5 = (l1j.f) l1jVar2;
                    return fVar5.h instanceof l1j.f.b.a ? l1j.f.a(fVar5, false, null, null, new l1j.f.b.C3226b(fVar4.b, fVar4.c), null, 191) : fVar5;
                }
            } else if (d1jVar2 instanceof d1j.c) {
                if (l1jVar2 instanceof l1j.f) {
                    return l1j.f.a((l1j.f) l1jVar2, false, null, null, aVar, null, 191);
                }
            } else if (d1jVar2 instanceof d1j.b) {
                if (l1jVar2 instanceof l1j.f) {
                    return l1j.f.a((l1j.f) l1jVar2, false, null, null, null, l1j.f.a.b.a, 127);
                }
            } else {
                if (!(d1jVar2 instanceof d1j.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (l1jVar2 instanceof l1j.f) {
                    return l1j.f.a((l1j.f) l1jVar2, false, null, null, null, l1j.f.a.C3225a.a, 127);
                }
            }
        }
        return l1jVar2;
    }

    @Override // xsna.dm50
    public final m1j d() {
        return new m1j(e(new y8(15)), e(new af2(10)), e(new sm(15)), e(new vd1(11)), e(new kz0(15)), e(new b40(13)));
    }

    @Override // xsna.dm50
    public final void h(l1j l1jVar, m1j m1jVar) {
        l1j l1jVar2 = l1jVar;
        m1j m1jVar2 = m1jVar;
        if (l1jVar2 instanceof l1j.c) {
            f(m1jVar2.a, l1jVar2);
            return;
        }
        if (l1jVar2 instanceof l1j.d) {
            f(m1jVar2.b, l1jVar2);
            return;
        }
        if (l1jVar2 instanceof l1j.f) {
            f(m1jVar2.c, l1jVar2);
            return;
        }
        if (l1jVar2 instanceof l1j.g) {
            f(m1jVar2.d, l1jVar2);
        } else if (l1jVar2 instanceof l1j.b) {
            f(m1jVar2.e, l1jVar2);
        } else {
            if (!(l1jVar2 instanceof l1j.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(m1jVar2.f, l1jVar2);
        }
    }
}
