package defpackage;

import com.google.android.gms.internal.play_billing.zzco;
import defpackage.ie91;
import defpackage.jg91;
import defpackage.le91;
import defpackage.mf91;
import defpackage.ny61;
import defpackage.uf91;
import defpackage.xqa1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class fb91 {
    public static final Collector a = Collector.of(new Supplier() { // from class: t991
        @Override // java.util.function.Supplier
        public final Object get() {
            return new ie91(4);
        }
    }, new BiConsumer() { // from class: ca91
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ie91) obj).m0(obj2);
        }
    }, new BinaryOperator() { // from class: fa91
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            ie91 ie91Var = (ie91) obj;
            ie91 ie91Var2 = (ie91) obj2;
            Object[] objArr = ie91Var2.f;
            int i = ie91Var2.g;
            for (int i2 = 0; i2 < i; i2++) {
                ie91Var.getClass();
                rta1.h(i2, objArr[i2]);
            }
            ie91Var.n0(i);
            System.arraycopy(objArr, 0, ie91Var.f, ie91Var.g, i);
            ie91Var.g += i;
            return ie91Var;
        }
    }, new Function() { // from class: ia91
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ie91 ie91Var = (ie91) obj;
            ie91Var.h = true;
            return zzco.l(ie91Var.g, ie91Var.f);
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() { // from class: oa91
            @Override // java.util.function.Supplier
            public final Object get() {
                return new uf91();
            }
        }, new BiConsumer() { // from class: ra91
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                uf91 uf91Var = (uf91) obj;
                uf91Var.getClass();
                obj2.getClass();
                uf91Var.m0(obj2);
            }
        }, new BinaryOperator() { // from class: ta91
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                uf91 uf91Var = (uf91) obj;
                uf91 uf91Var2 = (uf91) obj2;
                Object[] objArr = uf91Var2.f;
                int i = uf91Var2.g;
                for (int i2 = 0; i2 < i; i2++) {
                    uf91Var.getClass();
                    rta1.h(i2, objArr[i2]);
                }
                uf91Var.n0(i);
                System.arraycopy(objArr, 0, uf91Var.f, uf91Var.g, i);
                uf91Var.g += i;
                return uf91Var;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                uf91 uf91Var = (uf91) obj;
                int i = uf91Var.g;
                if (i == 0) {
                    return zzdq.B;
                }
                Object[] objArr = uf91Var.f;
                if (i == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new zzdt(obj2);
                }
                zzcv l = zzcv.l(i, objArr);
                uf91Var.g = l.size();
                uf91Var.h = true;
                return l;
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() { // from class: za91
            @Override // java.util.function.Supplier
            public final Object get() {
                return new mf91();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.d
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                mf91 mf91Var = (mf91) obj;
                zzdh zzdhVar = (zzdh) obj2;
                mf91Var.getClass();
                if (zzdhVar.zza.equals(zzdhVar.zzb)) {
                    ny61.g(xqa1.e("range must not be empty, but was %s", zzdhVar));
                } else {
                    mf91Var.a.add(zzdhVar);
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.a
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                mf91 mf91Var = (mf91) obj;
                mf91Var.getClass();
                Iterator it = ((mf91) obj2).a.iterator();
                while (it.hasNext()) {
                    zzdh zzdhVar = (zzdh) it.next();
                    if (zzdhVar.zza.equals(zzdhVar.zzb)) {
                        ny61.g(xqa1.e("range must not be empty, but was %s", zzdhVar));
                        return null;
                    }
                    mf91Var.a.add(zzdhVar);
                }
                return mf91Var;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzdh zzdhVar;
                ArrayList arrayList = ((mf91) obj).a;
                ie91 ie91Var = new ie91(arrayList.size());
                Collections.sort(arrayList, zzdg.a);
                Iterator it = arrayList.iterator();
                jg91 jg91Var = it instanceof jg91 ? (jg91) it : new jg91(it);
                while (true) {
                    if (!jg91Var.hasNext()) {
                        ie91Var.h = true;
                        zzco l = zzco.l(ie91Var.g, ie91Var.f);
                        if (l.isEmpty()) {
                            return zzct.b;
                        }
                        if (((zzdk) l).w == 1) {
                            le91 p = l.p(0);
                            Object next = p.next();
                            if (p.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i = 0; i < 4 && p.hasNext(); i++) {
                                    sb.append(Extension.FIX_SPACE);
                                    sb.append(p.next());
                                }
                                if (p.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((zzdh) next).equals(zzdh.a)) {
                                return zzct.c;
                            }
                        }
                        return new zzct(l);
                    }
                    zzdh zzdhVar2 = (zzdh) jg91Var.next();
                    while (jg91Var.hasNext()) {
                        if (!jg91Var.b) {
                            jg91Var.c = jg91Var.a.next();
                            jg91Var.b = true;
                        }
                        zzdh zzdhVar3 = (zzdh) jg91Var.c;
                        if (zzdhVar2.zza.a(zzdhVar3.zzb) <= 0 && zzdhVar3.zza.a(zzdhVar2.zzb) <= 0) {
                            int a2 = zzdhVar2.zza.a(zzdhVar3.zza);
                            int a3 = zzdhVar2.zzb.a(zzdhVar3.zzb);
                            if (a2 >= 0 && a3 <= 0) {
                                zzdhVar = zzdhVar2;
                            } else if (a2 > 0 || a3 < 0) {
                                zzce zzceVar = a2 >= 0 ? zzdhVar2.zza : zzdhVar3.zza;
                                zzce zzceVar2 = a3 <= 0 ? zzdhVar2.zzb : zzdhVar3.zzb;
                                if (!(zzceVar.a(zzceVar2) <= 0)) {
                                    ny61.g(xqa1.e("intersection is undefined for disconnected ranges %s and %s", zzdhVar2, zzdhVar3));
                                    return null;
                                }
                                zzdhVar = new zzdh(zzceVar, zzceVar2);
                            } else {
                                zzdhVar = zzdhVar3;
                            }
                            if (!zzdhVar.zza.equals(zzdhVar.zzb)) {
                                ny61.g(xqa1.e("Overlapping ranges not permitted but found %s overlapping %s", zzdhVar2, zzdhVar3));
                                return null;
                            }
                            zzdh zzdhVar4 = (zzdh) jg91Var.next();
                            int a4 = zzdhVar2.zza.a(zzdhVar4.zza);
                            int a5 = zzdhVar2.zzb.a(zzdhVar4.zzb);
                            if (a4 > 0 || a5 < 0) {
                                if (a4 < 0 || a5 > 0) {
                                    zzce zzceVar3 = a4 <= 0 ? zzdhVar2.zza : zzdhVar4.zza;
                                    if (a5 < 0) {
                                        zzdhVar2 = zzdhVar4;
                                    }
                                    zzdhVar4 = new zzdh(zzceVar3, zzdhVar2.zzb);
                                }
                                zzdhVar2 = zzdhVar4;
                            }
                        }
                        ie91Var.m0(zzdhVar2);
                    }
                    ie91Var.m0(zzdhVar2);
                }
            }
        }, new Collector.Characteristics[0]);
    }
}
