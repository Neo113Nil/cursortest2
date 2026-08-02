package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.g3s;
import xsna.j3s;
import xsna.l3s;
import xsna.ptf0;
import xsna.qf90;
import xsna.t3s;

/* compiled from: FollowersListReducer.kt */
/* loaded from: classes15.dex */
public final class o3s extends dm50<w3s, l3s, t3s> {
    public final i3s d;

    public o3s() {
        super(t3s.d.b);
        this.d = new i3s();
    }

    public static t3s i(t3s t3sVar, UserId userId, boolean z) {
        g3s g3sVar;
        Object obj;
        Object obj2;
        if (!(t3sVar instanceof t3s.a)) {
            return t3sVar;
        }
        t3s.a aVar = (t3s.a) t3sVar;
        g3s g3sVar2 = aVar.b;
        if (g3sVar2 instanceof g3s.a) {
            g3s.a aVar2 = (g3s.a) g3sVar2;
            List<RequestUserProfile> list = aVar2.c;
            List list2 = aVar2.d;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((RequestUserProfile) obj).c, userId)) {
                    break;
                }
            }
            RequestUserProfile requestUserProfile = (RequestUserProfile) obj;
            if (requestUserProfile != null) {
                int i = aVar2.a - 1;
                List list3 = aVar2.c;
                if (z) {
                    list3 = j5g.s0(list3, requestUserProfile);
                }
                g3sVar = g3s.a.a(aVar2, i, 0, list3, null, 10);
            } else {
                List list4 = list2;
                Iterator it2 = list4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (epx.f(((RequestUserProfile) obj2).c, userId)) {
                        break;
                    }
                }
                RequestUserProfile requestUserProfile2 = (RequestUserProfile) obj2;
                g3sVar = aVar2;
                if (requestUserProfile2 != null) {
                    int i2 = aVar2.b - 1;
                    if (z) {
                        list2 = j5g.s0(list4, requestUserProfile2);
                    }
                    g3sVar = g3s.a.a(aVar2, 0, i2, null, list2, 5);
                }
            }
        } else {
            if (!(g3sVar2 instanceof g3s.b)) {
                throw new NoWhenBranchMatchedException();
            }
            g3sVar = (g3s.b) g3sVar2;
        }
        return j(g3sVar) ? t3s.b.b : t3s.a.a(aVar, g3sVar, null, null, 6);
    }

    public static boolean j(g3s g3sVar) {
        if (!(g3sVar instanceof g3s.a)) {
            return false;
        }
        g3s.a aVar = (g3s.a) g3sVar;
        return aVar.c.isEmpty() && aVar.d.isEmpty();
    }

    @Override // xsna.dm50
    public final t3s c(t3s t3sVar, l3s l3sVar) {
        g3s g3sVar;
        t3s t3sVar2 = t3sVar;
        l3s l3sVar2 = l3sVar;
        if (l3sVar2 instanceof l3s.e) {
            l3s.e eVar = (l3s.e) l3sVar2;
            if (eVar instanceof l3s.e.a) {
                l3s.e.a aVar = (l3s.e.a) eVar;
                if (t3sVar2 instanceof t3s.a) {
                    return t3s.a.a((t3s.a) t3sVar2, null, null, new qf90.a(aVar.b), 3);
                }
            } else if (eVar instanceof l3s.e.b) {
                l3s.e.b bVar = (l3s.e.b) eVar;
                if (t3sVar2 instanceof t3s.a) {
                    t3s.a aVar2 = (t3s.a) t3sVar2;
                    g3s g3sVar2 = aVar2.b;
                    if (g3sVar2 instanceof g3s.a) {
                        g3s.a aVar3 = (g3s.a) g3sVar2;
                        j3s.b bVar2 = bVar.b;
                        if (bVar2 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g3sVar = g3s.a.a(aVar3, 0, bVar2.a, null, j5g.u0(bVar2.b, aVar3.d), 5);
                    } else {
                        if (!(g3sVar2 instanceof g3s.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g3sVar = (g3s.b) g3sVar2;
                    }
                    return t3s.a.a(aVar2, g3sVar, null, qf90.b.a, 2);
                }
            } else {
                if (!(eVar instanceof l3s.e.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (t3sVar2 instanceof t3s.a) {
                    return t3s.a.a((t3s.a) t3sVar2, null, null, qf90.c.a, 3);
                }
            }
        } else if (l3sVar2 instanceof l3s.f) {
            l3s.f fVar = (l3s.f) l3sVar2;
            if (t3sVar2 instanceof t3s.a) {
                if (fVar instanceof l3s.f.c) {
                    return t3s.a.a((t3s.a) t3sVar2, null, ptf0.b.a, null, 5);
                }
                if (fVar instanceof l3s.f.b) {
                    g3s.a aVar4 = ((l3s.f.b) fVar).b;
                    return j(aVar4) ? t3s.b.b : new t3s.a(aVar4, ptf0.a.a, qf90.b.a);
                }
                if (fVar instanceof l3s.f.a) {
                    return t3s.a.a((t3s.a) t3sVar2, null, ptf0.a.a, null, 5);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (l3sVar2 instanceof l3s.d) {
                l3s.d dVar = (l3s.d) l3sVar2;
                if (dVar instanceof l3s.d.b) {
                    g3s.a aVar5 = ((l3s.d.b) dVar).b;
                    return j(aVar5) ? t3s.b.b : new t3s.a(aVar5, ptf0.a.a, qf90.b.a);
                }
                if (dVar instanceof l3s.d.a) {
                    return new t3s.c(((l3s.d.a) dVar).b);
                }
                if (epx.f(dVar, l3s.d.c.b)) {
                    return t3s.d.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (l3sVar2 instanceof l3s.a) {
                l3s.a aVar6 = (l3s.a) l3sVar2;
                return i(t3sVar2, aVar6.b, aVar6.c);
            }
            if (l3sVar2 instanceof l3s.g) {
                l3s.g gVar = (l3s.g) l3sVar2;
                return i(t3sVar2, gVar.b, gVar.c);
            }
            if (l3sVar2 instanceof l3s.b) {
                return i(t3sVar2, ((l3s.b) l3sVar2).b, true);
            }
            if (!(l3sVar2 instanceof l3s.c)) {
                throw new NoWhenBranchMatchedException();
            }
            UserId userId = ((l3s.c) l3sVar2).b;
            if (t3sVar2 instanceof t3s.a) {
                t3s.a aVar7 = (t3s.a) t3sVar2;
                g3s g3sVar3 = aVar7.b;
                if (!(g3sVar3 instanceof g3s.a)) {
                    return t3sVar2;
                }
                g3s.a aVar8 = (g3s.a) g3sVar3;
                List<RequestUserProfile> list = aVar8.c;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((RequestUserProfile) it.next()).c, userId)) {
                            aVar8 = g3s.a.a(aVar8, aVar8.a + 1, 0, null, null, 14);
                            break;
                        }
                    }
                }
                List<RequestUserProfile> list2 = aVar8.d;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (epx.f(((RequestUserProfile) it2.next()).c, userId)) {
                            aVar8 = g3s.a.a(aVar8, 0, aVar8.b + 1, null, null, 13);
                            break;
                        }
                    }
                }
                return j(aVar8) ? t3s.b.b : t3s.a.a(aVar7, aVar8, null, null, 6);
            }
        }
        return t3sVar2;
    }

    @Override // xsna.dm50
    public final w3s d() {
        return new w3s(e(new z13(20)), e(new amp(3)), e(new f1j(this, 12)), e(new dh5(26)));
    }

    @Override // xsna.dm50
    public final void h(t3s t3sVar, w3s w3sVar) {
        t3s t3sVar2 = t3sVar;
        w3s w3sVar2 = w3sVar;
        if (t3sVar2 instanceof t3s.a) {
            f(w3sVar2.c, t3sVar2);
            return;
        }
        if (t3sVar2 instanceof t3s.c) {
            f(w3sVar2.b, t3sVar2);
        } else if (t3sVar2 instanceof t3s.d) {
            f(w3sVar2.a, t3sVar2);
        } else {
            if (!(t3sVar2 instanceof t3s.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(w3sVar2.d, t3sVar2);
        }
    }
}
