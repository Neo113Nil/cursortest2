package xsna;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes11.dex */
public final class mvj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final kotlin.coroutines.d a(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2, final boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) dVar.fold(bool, new jvj())).booleanValue();
        boolean booleanValue2 = ((Boolean) dVar2.fold(bool, new jvj())).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return dVar.plus(dVar2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = dVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.b;
        kotlin.coroutines.d dVar3 = (kotlin.coroutines.d) dVar.fold(emptyCoroutineContext, new wzs() { // from class: xsna.kvj
            /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.coroutines.d] */
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                kotlin.coroutines.d dVar4 = (kotlin.coroutines.d) obj;
                d.b bVar = (d.b) obj2;
                if (!(bVar instanceof itj)) {
                    return dVar4.plus(bVar);
                }
                Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                if (((kotlin.coroutines.d) ref$ObjectRef2.element).get(bVar.getKey()) != null) {
                    ref$ObjectRef2.element = ((kotlin.coroutines.d) ref$ObjectRef2.element).minusKey(bVar.getKey());
                    return dVar4.plus(((itj) bVar).x());
                }
                itj itjVar = (itj) bVar;
                if (z) {
                    itjVar = itjVar.q();
                }
                return dVar4.plus(itjVar);
            }
        });
        if (booleanValue2) {
            ref$ObjectRef.element = ((kotlin.coroutines.d) ref$ObjectRef.element).fold(emptyCoroutineContext, new lvj());
        }
        return dVar3.plus((kotlin.coroutines.d) ref$ObjectRef.element);
    }

    public static final kotlin.coroutines.d b(yvj yvjVar, kotlin.coroutines.d dVar) {
        kotlin.coroutines.d a = a(yvjVar.getCoroutineContext(), dVar, true);
        xll xllVar = bdn.b;
        return (a == xllVar || a.get(c.a.b) != null) ? a : a.plus(xllVar);
    }

    public static final z2q0<?> c(spj<?> spjVar, kotlin.coroutines.d dVar, Object obj) {
        z2q0<?> z2q0Var = null;
        if ((spjVar instanceof awj) && dVar.get(a3q0.b) != null) {
            awj awjVar = (awj) spjVar;
            while (true) {
                if ((awjVar instanceof ncn) || (awjVar = awjVar.getCallerFrame()) == null) {
                    break;
                }
                if (awjVar instanceof z2q0) {
                    z2q0Var = (z2q0) awjVar;
                    break;
                }
            }
            if (z2q0Var != null) {
                z2q0Var.A0(dVar, obj);
            }
        }
        return z2q0Var;
    }
}
