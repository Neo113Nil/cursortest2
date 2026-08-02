package xsna;

import androidx.compose.runtime.a;
import com.vk.core.view.interop.model.ContentScale;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.hsk;
import xsna.iiz;
import xsna.phw;
import xsna.rco0;
import xsna.snx;
import xsna.v5g;
import xsna.wkj;
import xsna.xpv;
import xsna.zr5;

/* compiled from: InteropAvatar.kt */
/* loaded from: classes17.dex */
public final class wnx {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [xsna.dhx0] */
    /* JADX WARN: Type inference failed for: r3v19, types: [xsna.ou20] */
    /* JADX WARN: Type inference failed for: r3v25, types: [xsna.iiz] */
    public static final ArrayList a(List list, androidx.compose.runtime.a aVar) {
        rep repVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1813035227, 0, -1, "com.vk.core.view.interop.converter.asCompose (InteropAvatar.kt:91)");
        }
        aVar.K(-1429865710);
        List<snx.a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (snx.a aVar2 : list2) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1924502017, 0, -1, "com.vk.core.view.interop.converter.asCompose (InteropAvatar.kt:66)");
            }
            if (aVar2 instanceof snx.a.C3682a) {
                aVar.K(-678703100);
                ((snx.a.C3682a) aVar2).getClass();
                fko.a(null, aVar);
                y7g.a(null, aVar);
                vua0.E(aVar);
                throw null;
            }
            if (aVar2 instanceof snx.a.b) {
                aVar.K(-1684439633);
                ((snx.a.b) aVar2).getClass();
                ?? a = iiz.a.a(384, 0, aVar, false);
                aVar.j();
                repVar = a;
            } else {
                boolean z = aVar2 instanceof snx.a.c;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z) {
                    aVar.K(-1684435734);
                    ((snx.a.c) aVar2).getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-266960355, 48, -1, "com.vk.core.compose.component.image.badge.MobileOnlineBadge.Companion.invoke (MobileOnlineBadge.kt:59)");
                    }
                    Object x = aVar.x();
                    if (x == c0012a) {
                        x = new ou20();
                        aVar.R(x);
                    }
                    ?? r3 = (ou20) x;
                    ((zak0) r3.a).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                    repVar = r3;
                } else if (aVar2 instanceof snx.a.d) {
                    aVar.K(-1684432089);
                    ((snx.a.d) aVar2).getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1962975051, 48, -1, "com.vk.core.compose.component.image.badge.WebOnlineBadge.Companion.invoke (WebOnlineBadge.kt:61)");
                    }
                    Object x2 = aVar.x();
                    if (x2 == c0012a) {
                        x2 = new dhx0();
                        aVar.R(x2);
                    }
                    ?? r32 = (dhx0) x2;
                    ((zak0) r32.a).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                    repVar = r32;
                } else {
                    if (aVar2 != null) {
                        throw alb0.c(-1684462785, aVar);
                    }
                    aVar.K(-1684429493);
                    aVar.j();
                    repVar = rep.a;
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            arrayList.add(repVar);
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return arrayList;
    }

    public static final k18 b(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2135557373, 0, -1, "com.vk.core.view.interop.converter.asCompose (InteropAvatar.kt:104)");
        }
        aVar.K(723741518);
        aVar.j();
        boolean d = androidx.compose.runtime.b.d();
        wep wepVar = wep.a;
        if (d) {
            androidx.compose.runtime.b.e();
        }
        return wepVar;
    }

    public static final efj c(snx.b bVar, androidx.compose.runtime.a aVar) {
        zr5 zr5Var;
        rek0 rek0Var;
        wkj wkjVar;
        efj efjVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(57462593, 0, -1, "com.vk.core.view.interop.converter.asCompose (InteropAvatar.kt:37)");
        }
        if (bVar instanceof snx.b.a) {
            aVar.K(-613018811);
            efj a = v5g.a.a(y7g.a(((snx.b.a) bVar).a, aVar), aVar);
            aVar.j();
            efjVar = a;
        } else if (bVar instanceof snx.b.C3683b) {
            aVar.K(-613016336);
            snx.b.C3683b c3683b = (snx.b.C3683b) bVar;
            lg90 a2 = fko.a(c3683b.a, aVar);
            long a3 = y7g.a(c3683b.b, aVar);
            aVar.K(-1823521136);
            aVar.j();
            efj a4 = xpv.a.a(a2, a3, null, aVar, 24584, 8);
            aVar.j();
            efjVar = a4;
        } else if (bVar instanceof snx.b.c) {
            aVar.K(-613010398);
            snx.b.c cVar = (snx.b.c) bVar;
            lg90 a5 = tlw.a(cVar.a, aVar, 0);
            ipi ipiVar = cVar.c;
            if (ipiVar == null) {
                aVar.K(-1823378288);
                aVar.j();
                rek0Var = null;
            } else {
                aVar.K(-613007983);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1936436998, 0, -1, "com.vk.core.view.interop.ext.toComposeBrush (ColorSourceExt.kt:16)");
                }
                rek0 rek0Var2 = new rek0(y7g.a(ipiVar, aVar));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                rek0Var = rek0Var2;
            }
            ContentScale contentScale = cVar.b;
            contentScale.getClass();
            switch (ContentScale.a.$EnumSwitchMapping$0[contentScale.ordinal()]) {
                case 1:
                    wkjVar = wkj.a.a;
                    break;
                case 2:
                    wkjVar = wkj.a.b;
                    break;
                case 3:
                    wkjVar = wkj.a.c;
                    break;
                case 4:
                    wkjVar = wkj.a.d;
                    break;
                case 5:
                    wkjVar = wkj.a.e;
                    break;
                case 6:
                    wkjVar = wkj.a.f;
                    break;
                case 7:
                    wkjVar = wkj.a.g;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            efj a6 = phw.a.a(a5, rek0Var, wkjVar, null, null, aVar, 196616, 16);
            aVar.j();
            efjVar = a6;
        } else if (bVar.equals(snx.b.d.a)) {
            aVar.K(-613002159);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-733344492, 48, -1, "com.vk.core.compose.component.image.content.LoadingContent.Companion.invoke (LoadingContent.kt:36)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new ysz();
                aVar.R(x);
            }
            ysz yszVar = (ysz) x;
            ((zak0) yszVar.a).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            efjVar = yszVar;
        } else {
            if (!(bVar instanceof snx.b.e)) {
                throw alb0.c(-613019403, aVar);
            }
            aVar.K(-612999968);
            aVar.K(-612996874);
            Object obj = tnx.a;
            if (obj.equals(obj)) {
                zr5Var = zr5.a.a;
            } else {
                if (!obj.equals(vnx.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                zr5Var = zr5.c.a;
            }
            efj a7 = rco0.a.a(zr5Var, "VK", aVar, 384);
            aVar.j();
            aVar.j();
            efjVar = a7;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return efjVar;
    }

    public static final z190 d(snx.c cVar, androidx.compose.runtime.a aVar) {
        z190 z190Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1518851935, 0, -1, "com.vk.core.view.interop.converter.asCompose (InteropAvatar.kt:94)");
        }
        if (cVar instanceof snx.c.a) {
            aVar.K(672175325);
            snx.c.a aVar2 = (snx.c.a) cVar;
            z190Var = hsk.a.a(fko.a(aVar2.a, aVar), y7g.a(aVar2.b, aVar), aVar, 3080, 4);
            aVar.j();
        } else {
            if (cVar != null) {
                throw alb0.c(672173772, aVar);
            }
            aVar.K(672178637);
            aVar.j();
            z190Var = tgp.a;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return z190Var;
    }
}
