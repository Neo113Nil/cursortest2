package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.dak0;

/* compiled from: LazyGridState.kt */
/* loaded from: classes11.dex */
public final class bsy {
    public final /* synthetic */ dsy a;

    public bsy(dsy dsyVar) {
        this.a = dsyVar;
    }

    public final ArrayList a(int i) {
        ArrayList arrayList = new ArrayList();
        dsy dsyVar = this.a;
        dak0 a = dak0.a.a();
        izs<Object, s3q0> e = a != null ? a.e() : null;
        dak0 b = dak0.a.b(a);
        try {
            mry mryVar = dsyVar.b ? dsyVar.c : (mry) ((zak0) dsyVar.e).getValue();
            if (mryVar != null) {
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = 1;
                List<Pair<Integer, o6j>> invoke = mryVar.k.invoke(Integer.valueOf(i));
                int size = invoke.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair<Integer, o6j> pair = invoke.get(i2);
                    cuy cuyVar = dsyVar.o;
                    int intValue = pair.i().intValue();
                    long j = pair.j().a;
                    fh9 fh9Var = dsy.w;
                    ref$IntRef = ref$IntRef;
                    arrayList.add(cuyVar.a(intValue, j, false, new asy((ArrayList) null, ref$IntRef, invoke, i, mryVar)));
                }
                s3q0 s3q0Var = s3q0.a;
            }
            dak0.a.d(a, b, e);
            return arrayList;
        } catch (Throwable th) {
            dak0.a.d(a, b, e);
            throw th;
        }
    }
}
