package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.e3s;
import xsna.g3s;
import xsna.l3s;
import xsna.ptf0;
import xsna.qf90;
import xsna.s3s;
import xsna.t3s;

/* compiled from: FollowersListFeature.kt */
/* loaded from: classes15.dex */
public final class h3s extends wk50<w3s, t3s, e3s, l3s> {
    public final p3s f;
    public final e3s.b g;
    public final f4z h;

    public h3s(p3s p3sVar, o3s o3sVar, e3s.b bVar) {
        super(bVar, o3sVar);
        this.f = p3sVar;
        this.g = bVar;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(t3s t3sVar, e3s e3sVar) {
        t3s t3sVar2 = t3sVar;
        e3s e3sVar2 = e3sVar;
        if (e3sVar2 instanceof e3s.b) {
            U((e3s.b) e3sVar2);
            return;
        }
        boolean z = e3sVar2 instanceof e3s.d;
        p3s p3sVar = this.f;
        if (z) {
            e3s.d dVar = (e3s.d) e3sVar2;
            if (dVar instanceof e3s.d.b) {
                U(this.g);
                return;
            }
            if (!(dVar instanceof e3s.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (t3sVar2 instanceof t3s.a) {
                t3s.a aVar = (t3s.a) t3sVar2;
                if (aVar.c instanceof ptf0.a) {
                    T(l3s.f.c.b);
                    g3s g3sVar = aVar.b;
                    if (g3sVar instanceof g3s.a) {
                        p3sVar.getClass();
                        a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(io.reactivex.rxjava3.core.x.k(new k4s(0, EmptyList.b)), p3sVar.a(0), new do3(new wci(4), 15)), new ifg(this, 19), new lwh(this, 10), 1);
                        return;
                    } else {
                        if (!(g3sVar instanceof g3s.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!(e3sVar2 instanceof e3s.c)) {
            boolean z2 = e3sVar2 instanceof e3s.a.C2775a;
            f4z f4zVar = this.h;
            if (z2) {
                e3s.a.C2775a c2775a = (e3s.a.C2775a) e3sVar2;
                UserId userId = c2775a.b;
                boolean z3 = c2775a.c;
                T(new l3s.a(userId, z3));
                if (!z3 || c2775a.d) {
                    f4zVar.b(new s3s.b(userId));
                    return;
                }
                return;
            }
            if (e3sVar2 instanceof e3s.a.d) {
                e3s.a.d dVar2 = (e3s.a.d) e3sVar2;
                UserId userId2 = dVar2.b;
                boolean z4 = dVar2.c;
                T(new l3s.g(userId2, z4));
                if (!z4 || dVar2.d) {
                    f4zVar.b(s3s.c.a);
                    return;
                }
                return;
            }
            if (!(e3sVar2 instanceof e3s.a.b)) {
                if (!(e3sVar2 instanceof e3s.a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new l3s.c(((e3s.a.c) e3sVar2).b));
                return;
            }
            e3s.a.b bVar = (e3s.a.b) e3sVar2;
            UserId userId3 = bVar.b;
            T(new l3s.b(userId3));
            if (!bVar.c || bVar.d) {
                f4zVar.b(new s3s.a(userId3));
                return;
            }
            return;
        }
        e3s.c cVar = (e3s.c) e3sVar2;
        if (t3sVar2 instanceof t3s.a) {
            t3s.a aVar2 = (t3s.a) t3sVar2;
            qf90 qf90Var = aVar2.d;
            ptf0 ptf0Var = aVar2.c;
            g3s g3sVar2 = aVar2.b;
            if (!(g3sVar2 instanceof g3s.a)) {
                if (!(g3sVar2 instanceof g3s.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            g3s.a aVar3 = (g3s.a) g3sVar2;
            List<RequestUserProfile> list = aVar3.d;
            List<RequestUserProfile> list2 = aVar3.d;
            int i = aVar3.b;
            if ((list.size() < i || aVar3.c.size() < i) && (ptf0Var instanceof ptf0.a)) {
                boolean z5 = cVar instanceof e3s.c.b;
                if (!z5 || (qf90Var instanceof qf90.b)) {
                    if (g3sVar2 == null) {
                        if (!(g3sVar2 instanceof g3s.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        if (g3sVar2 == null || list2.size() >= i || ptf0Var == null) {
                            return;
                        }
                        if (!z5 || (qf90Var instanceof qf90.b)) {
                            T(l3s.e.c.b);
                            a7f0.a.f(this, p3sVar.a(list2.size()).l(new zj0(new dam(4), 13)), new bhh(this, 18), new qqe(this, 20), 1);
                        }
                    }
                }
            }
        }
    }

    public final void U(e3s.b bVar) {
        if (!epx.f(bVar, e3s.b.a.b)) {
            if (!epx.f(bVar, e3s.b.C2776b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        T(l3s.d.c.b);
        p3s p3sVar = this.f;
        p3sVar.getClass();
        a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(io.reactivex.rxjava3.core.x.k(new k4s(0, EmptyList.b)), p3sVar.a(0), new qs6(new a76((byte) 0, 4), 14)), new zxo(this, 5), new d9j(this, 9), 1);
    }
}
