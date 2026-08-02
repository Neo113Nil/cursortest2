package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class g591 implements r691 {
    public final r691 a;
    public final String b;

    public g591() {
        this.a = r691.z5;
        this.b = "return";
    }

    @Override // defpackage.r691
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.r691
    public final r691 e() {
        return new g591(this.b, this.a.e());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g591)) {
            return false;
        }
        g591 g591Var = (g591) obj;
        return this.b.equals(g591Var.b) && this.a.equals(g591Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.r691
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.r691
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.r691
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.r691
    public final Iterator zzf() {
        return null;
    }

    public g591(String str) {
        this.a = r691.z5;
        this.b = str;
    }

    public g591(String str, r691 r691Var) {
        this.a = r691Var;
        this.b = str;
    }
}
