package xsna;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
public final class vl5 extends hbk {
    public final Context a;
    public final zuf b;
    public final zuf c;
    public final String d;

    public vl5(Context context, zuf zufVar, zuf zufVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (zufVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = zufVar;
        if (zufVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = zufVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // xsna.hbk
    public final Context a() {
        return this.a;
    }

    @Override // xsna.hbk
    @NonNull
    public final String b() {
        return this.d;
    }

    @Override // xsna.hbk
    public final zuf c() {
        return this.c;
    }

    @Override // xsna.hbk
    public final zuf d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hbk)) {
            return false;
        }
        hbk hbkVar = (hbk) obj;
        return this.a.equals(hbkVar.a()) && this.b.equals(hbkVar.d()) && this.c.equals(hbkVar.c()) && this.d.equals(hbkVar.b());
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return i5s.a(sb, this.d, "}");
    }
}
