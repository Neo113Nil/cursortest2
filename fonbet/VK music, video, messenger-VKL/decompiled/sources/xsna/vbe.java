package xsna;

import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ybe;

/* compiled from: ClipsGridBlockReducer.kt */
/* loaded from: classes17.dex */
public final class vbe extends dm50<cce, com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c, ybe> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dm50
    public final ybe c(ybe ybeVar, com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c cVar) {
        kih0 kih0Var;
        kih0 kih0Var2;
        kih0 kih0Var3;
        ybe ybeVar2 = ybeVar;
        com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c cVar2 = cVar;
        if (cVar2 instanceof tbe) {
            tbe tbeVar = (tbe) cVar2;
            String str = tbeVar.b;
            ArrayList arrayList = tbeVar.c;
            yae yaeVar = tbeVar.d;
            zg5 zg5Var = (zg5) j5g.a0(arrayList);
            if (zg5Var != null && (kih0Var3 = zg5Var.b) != null) {
                r4 = new fi5(0, kih0Var3);
            }
            return new ybe.a(str, arrayList, yaeVar, false, false, r4, null, null, new k4b0(false, false), false, tbeVar.e, false, new HashSet());
        }
        if (cVar2 instanceof ube) {
            return ybe.b.b;
        }
        if (cVar2 instanceof c.a) {
            c.a aVar = (c.a) cVar2;
            if (ybeVar2 instanceof ybe.a) {
                return ybe.a.a((ybe.a) ybeVar2, null, aVar instanceof c.a.C0666a, false, null, null, null, null, false, false, null, 8183);
            }
        } else if (cVar2 instanceof c.b) {
            c.b bVar = (c.b) cVar2;
            if (ybeVar2 instanceof ybe.a) {
                if (bVar instanceof c.b.a) {
                    c.b.a aVar2 = (c.b.a) bVar;
                    return ybe.a.a((ybe.a) ybeVar2, null, false, true, null, null, new fi5(aVar2.b, aVar2.c), null, false, false, null, 8047);
                }
                if (bVar instanceof c.b.C0667b) {
                    return ybe.a.a((ybe.a) ybeVar2, null, false, false, null, null, null, null, false, false, null, 8175);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.g) {
            c.g gVar = (c.g) cVar2;
            if (ybeVar2 instanceof ybe.a) {
                if (gVar instanceof c.g.a) {
                    return ybe.a.a((ybe.a) ybeVar2, null, false, false, null, null, null, null, true, false, null, 7679);
                }
                if (gVar instanceof c.g.b) {
                    return ybe.a.a((ybe.a) ybeVar2, null, false, false, null, null, null, null, false, false, null, 7679);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.h) {
            c.h hVar = (c.h) cVar2;
            if (ybeVar2 instanceof ybe.a) {
                ybe.a aVar3 = (ybe.a) ybeVar2;
                ArrayList arrayList2 = hVar.b;
                zg5 zg5Var2 = (zg5) j5g.a0(arrayList2);
                if (zg5Var2 != null && (kih0Var2 = zg5Var2.b) != null) {
                    r4 = new fi5(0, kih0Var2);
                }
                return ybe.a.a(aVar3, arrayList2, false, false, r4, aVar3.g, null, new k4b0(false, false), false, true, new HashSet(), 1693);
            }
        } else if (cVar2 instanceof c.d) {
            if (ybeVar2 instanceof ybe.a) {
                ybe.a aVar4 = (ybe.a) ybeVar2;
                List<zg5> list = aVar4.c;
                fi5 fi5Var = aVar4.g;
                if (fi5Var == null) {
                    return ybeVar2;
                }
                int size = (fi5Var.a + 1) % list.size();
                zg5 zg5Var3 = (zg5) j5g.b0(size, list);
                return (zg5Var3 == null || (kih0Var = zg5Var3.b) == null) ? ybeVar2 : ybe.a.a(aVar4, null, false, false, new fi5(size, kih0Var), aVar4.g, null, new k4b0(false, false), false, false, null, 7839);
            }
        } else if (cVar2 instanceof c.f) {
            c.f fVar = (c.f) cVar2;
            if (ybeVar2 instanceof ybe.a) {
                ybe.a aVar5 = (ybe.a) ybeVar2;
                qi5 qi5Var = fVar.b;
                fi5 fi5Var2 = aVar5.g;
                return ybe.a.a(aVar5, null, false, false, null, null, null, qi5Var.equals(fi5Var2 != null ? fi5Var2.b : null) ? fVar.c : aVar5.j, false, false, null, 7935);
            }
        } else if (cVar2 instanceof c.C0668c) {
            if (ybeVar2 instanceof ybe.a) {
                return ybe.a.a((ybe.a) ybeVar2, null, false, false, null, null, null, null, false, false, null, 6143);
            }
        } else {
            if (!(cVar2 instanceof c.e)) {
                throw new NoWhenBranchMatchedException();
            }
            c.e eVar = (c.e) cVar2;
            if (ybeVar2 instanceof ybe.a) {
                return ybe.a.a((ybe.a) ybeVar2, null, false, false, null, null, null, null, false, false, eVar.b, 4095);
            }
        }
        return ybeVar2;
    }

    @Override // xsna.dm50
    public final cce d() {
        return new cce(e(new c2(15)));
    }

    @Override // xsna.dm50
    public final void h(ybe ybeVar, cce cceVar) {
        ybe ybeVar2 = ybeVar;
        cce cceVar2 = cceVar;
        if (ybeVar2 instanceof ybe.a) {
            f(cceVar2.a, ybeVar2);
        }
    }
}
