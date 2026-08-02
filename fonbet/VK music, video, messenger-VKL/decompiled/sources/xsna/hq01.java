package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zznz;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class hq01 {
    public final String a;
    public final boolean b;
    public final zzgi c;
    public final BitSet d;
    public final BitSet e;
    public final zk3 f;
    public final zk3 g;
    public final /* synthetic */ fuz0 h;

    public /* synthetic */ hq01(fuz0 fuz0Var, String str) {
        this.h = fuz0Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new zk3();
        this.g = new zk3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final zzfp a(int i) {
        ArrayList arrayList;
        List list;
        zzfo zzb = zzfp.zzb();
        zzb.zza(i);
        zzb.zzc(this.b);
        zzgi zzgiVar = this.c;
        if (zzgiVar != null) {
            zzb.zzd(zzgiVar);
        }
        zzgh zzf = zzgi.zzf();
        zzf.zzb(sj01.H(this.d));
        zzf.zzd(sj01.H(this.e));
        zk3 zk3Var = this.f;
        if (zk3Var == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(zk3Var.d);
            Iterator it = ((zk3.c) zk3Var.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l = (Long) zk3Var.get(num);
                if (l != null) {
                    zzfq zzc = zzfr.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l.longValue());
                    arrayList2.add((zzfr) zzc.zzaC());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzf.zza(arrayList);
        }
        zk3 zk3Var2 = this.g;
        if (zk3Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(zk3Var2.d);
            Iterator it2 = ((zk3.c) zk3Var2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                zzgj zzd = zzgk.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) zk3Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((zzgk) zzd.zzaC());
            }
            list = arrayList3;
        }
        zzf.zzc(list);
        zzb.zzb(zzf);
        return (zzfp) zzb.zzaC();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NonNull rs01 rs01Var) {
        mb01 mb01Var = (mb01) this.h.b;
        int a = rs01Var.a();
        Boolean bool = rs01Var.c;
        if (bool != null) {
            this.e.set(a, bool.booleanValue());
        }
        Boolean bool2 = rs01Var.d;
        if (bool2 != null) {
            this.d.set(a, bool2.booleanValue());
        }
        if (rs01Var.e != null) {
            Integer valueOf = Integer.valueOf(a);
            zk3 zk3Var = this.f;
            Long l = (Long) zk3Var.get(valueOf);
            long longValue = rs01Var.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                zk3Var.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (rs01Var.f != null) {
            Integer valueOf2 = Integer.valueOf(a);
            zk3 zk3Var2 = this.g;
            List list = (List) zk3Var2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                zk3Var2.put(valueOf2, list);
            }
            if (rs01Var.c()) {
                list.clear();
            }
            zznz.zzc();
            kwz0 kwz0Var = mb01Var.h;
            r701 r701Var = s701.W;
            String str = this.a;
            if (kwz0Var.t(str, r701Var) && rs01Var.b()) {
                list.clear();
            }
            zznz.zzc();
            if (!mb01Var.h.t(str, r701Var)) {
                list.add(Long.valueOf(rs01Var.f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(rs01Var.f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hq01(fuz0 fuz0Var, String str, zzgi zzgiVar, BitSet bitSet, BitSet bitSet2, zk3 zk3Var, zk3 zk3Var2) {
        this.h = fuz0Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = zk3Var;
        this.g = new zk3();
        Iterator it = ((zk3.c) zk3Var2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) zk3Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = zzgiVar;
    }
}
