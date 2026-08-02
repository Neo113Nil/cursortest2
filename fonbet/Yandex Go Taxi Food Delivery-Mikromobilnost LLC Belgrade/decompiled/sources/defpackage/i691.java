package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public class i691 implements r691, a691 {
    public final HashMap a = new HashMap();

    @Override // defpackage.a691
    public final r691 a(String str) {
        HashMap hashMap = this.a;
        return hashMap.containsKey(str) ? (r691) hashMap.get(str) : r691.z5;
    }

    @Override // defpackage.r691
    public r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        return "toString".equals(str) ? new a791(toString()) : a691.g(this, new a791(str), cr71Var, arrayList);
    }

    @Override // defpackage.a691
    public final boolean d(String str) {
        return this.a.containsKey(str);
    }

    @Override // defpackage.r691
    public final r691 e() {
        i691 i691Var = new i691();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof a691;
            HashMap hashMap = i691Var.a;
            if (z) {
                hashMap.put((String) entry.getKey(), (r691) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((r691) entry.getValue()).e());
            }
        }
        return i691Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i691) {
            return this.a.equals(((i691) obj).a);
        }
        return false;
    }

    @Override // defpackage.a691
    public final void f(String str, r691 r691Var) {
        HashMap hashMap = this.a;
        if (r691Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, r691Var);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.r691
    public final String zzc() {
        return "[object Object]";
    }

    @Override // defpackage.r691
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.r691
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.r691
    public final Iterator zzf() {
        return new v591(this.a.keySet().iterator());
    }
}
