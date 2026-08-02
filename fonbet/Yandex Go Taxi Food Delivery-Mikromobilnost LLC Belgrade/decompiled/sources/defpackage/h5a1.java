package defpackage;

import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public final class h5a1 extends s7a1 {
    public final zzcc a;
    public final int b;

    public h5a1(zzcc zzccVar) {
        zzccVar.getClass();
        this.a = zzccVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            zzcc zzccVar2 = this.a;
            if (i >= zzccVar2.size()) {
                break;
            }
            int b = ((s7a1) zzccVar2.get(i)).b();
            if (i2 < b) {
                i2 = b;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.s7a1
    public final int a() {
        return s7a1.d(DerValue.TAG_CONTEXT);
    }

    @Override // defpackage.s7a1
    public final int b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        s7a1 s7a1Var = (s7a1) obj;
        int a = s7a1Var.a();
        int d = s7a1.d(DerValue.TAG_CONTEXT);
        if (d != a) {
            return d - s7a1Var.a();
        }
        zzcc zzccVar = ((h5a1) s7a1Var).a;
        zzcc zzccVar2 = this.a;
        if (zzccVar2.size() != zzccVar.size()) {
            return zzccVar2.size() - zzccVar.size();
        }
        for (int i = 0; i < zzccVar2.size(); i++) {
            int compareTo = ((s7a1) zzccVar2.get(i)).compareTo((s7a1) zzccVar.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h5a1.class == obj.getClass()) {
            return this.a.equals(((h5a1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(s7a1.d(DerValue.TAG_CONTEXT)), this.a});
    }

    public final String toString() {
        zzcc zzccVar = this.a;
        if (zzccVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = zzccVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((s7a1) zzccVar.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(jzz.k(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(jzz.k(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }
}
