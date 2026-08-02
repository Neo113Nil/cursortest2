package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c5g;
import xsna.fto0;
import xsna.j5g;
import xsna.myc0;
import xsna.o7i;
import xsna.pyx;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class yz1 extends SuspendLambda implements wzs {
    public zz1 b;
    public Collection c;
    public Iterator d;
    public gz1 e;
    public Collection f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ List i;
    public final /* synthetic */ zz1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz1(List list, zz1 zz1Var, spj spjVar) {
        super(2, spjVar);
        this.i = list;
        this.j = zz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        yz1 yz1Var = new yz1(this.i, this.j, spjVar);
        yz1Var.h = obj;
        return yz1Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((yz1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f4  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.coroutines.d, kotlinx.coroutines.CoroutineStart, xsna.eyx, xsna.spj] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00db -> B:5:0x00e0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        zz1 zz1Var;
        Collection arrayList;
        Iterator it;
        pyx pyxVar;
        po1 po1Var;
        we3 we3Var;
        List list;
        yz1 yz1Var = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = yz1Var.g;
        int i2 = 10;
        int i3 = 1;
        ?? r5 = 0;
        Object obj2 = null;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar2 = (yvj) yz1Var.h;
            List list2 = yz1Var.i;
            yvjVar = yvjVar2;
            zz1Var = yz1Var.j;
            arrayList = new ArrayList(c5g.u(list2, 10));
            it = list2.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = yz1Var.f;
            gz1 gz1Var = yz1Var.e;
            Iterator it2 = yz1Var.d;
            Collection collection = yz1Var.c;
            zz1 zz1Var2 = yz1Var.b;
            yvj yvjVar3 = (yvj) yz1Var.h;
            kotlin.a.a(obj);
            yvj yvjVar4 = yvjVar3;
            zz1 zz1Var3 = zz1Var2;
            Iterator it3 = it2;
            gz1 gz1Var2 = gz1Var;
            Collection collection2 = collection;
            Object e = obj;
            List list3 = (List) e;
            List V = j5g.V(list3);
            if (list3.size() == ((ArrayList) V).size()) {
                return obj2;
            }
            arrayList.add(new gz1(gz1Var2.a, V, gz1Var2.c, gz1Var2.d, gz1Var2.e, gz1Var2.f, gz1Var2.g, gz1Var2.h, gz1Var2.i, gz1Var2.j, gz1Var2.k, gz1Var2.l));
            i2 = 10;
            i3 = 1;
            yz1Var = this;
            arrayList = collection2;
            it = it3;
            zz1Var = zz1Var3;
            yvjVar = yvjVar4;
            r5 = 0;
            if (it.hasNext()) {
                return (List) arrayList;
            }
            gz1 gz1Var3 = (gz1) it.next();
            List<oi> list4 = gz1Var3.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(list4, i2));
            for (oi oiVar : list4) {
                zz1Var.c.getClass();
                oi oiVar2 = oiVar.c instanceof po1 ? oiVar : r5;
                if (oiVar2 != null && (po1Var = (po1) oiVar2.c) != null && (we3Var = po1Var.b) != null && (list = we3Var.a) != null && !list.isEmpty()) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (((nf3) it4.next()).b.a) {
                            pyxVar = myc0.b(yvjVar, r5, r5, new xz1(zz1Var, oiVar, r5), 3);
                            break;
                        }
                    }
                }
                pyx o7iVar = new o7i(r5);
                o7iVar.i0(oiVar);
                pyxVar = o7iVar;
                arrayList2.add(pyxVar);
            }
            yz1Var.h = yvjVar;
            yz1Var.b = zz1Var;
            yz1Var.c = arrayList;
            yz1Var.d = it;
            yz1Var.e = gz1Var3;
            yz1Var.f = arrayList;
            yz1Var.g = i3;
            e = fto0.e(arrayList2, yz1Var);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            yvjVar4 = yvjVar;
            zz1Var3 = zz1Var;
            it3 = it;
            gz1Var2 = gz1Var3;
            collection2 = arrayList;
            obj2 = r5;
            List list32 = (List) e;
            List V2 = j5g.V(list32);
            if (list32.size() == ((ArrayList) V2).size()) {
            }
        }
    }
}
