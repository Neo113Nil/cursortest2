package xsna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import xsna.woo;

/* compiled from: AnimRunningCheckEndListener.kt */
/* loaded from: classes17.dex */
public final class ze2 implements woo.k {
    public final zzs<woo<? extends woo<?>>, Boolean, Float, Float, s3q0> a;
    public final woo<? extends woo<?>>[] b;

    /* compiled from: AnimRunningCheckEndListener.kt */
    public static final class a {
        public static void a(zzs zzsVar, woo... wooVarArr) {
            ze2 ze2Var = new ze2(zzsVar, (woo[]) Arrays.copyOf(wooVarArr, wooVarArr.length));
            for (woo wooVar : wooVarArr) {
                if (wooVar != null) {
                    wooVar.b(ze2Var);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ze2(zzs<? super woo<? extends woo<?>>, ? super Boolean, ? super Float, ? super Float, s3q0> zzsVar, woo<? extends woo<?>>... wooVarArr) {
        this.a = zzsVar;
        this.b = wooVarArr;
    }

    @Override // xsna.woo.k
    public final void a(woo<? extends woo<?>> wooVar, boolean z, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        for (woo<? extends woo<?>> wooVar2 : this.b) {
            if (wooVar2 != null) {
                arrayList.add(wooVar2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            woo wooVar3 = (woo) it.next();
            if (wooVar3 != null && wooVar3.f) {
                return;
            }
        }
        this.a.invoke(wooVar, Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
    }
}
