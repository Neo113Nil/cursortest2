package xsna;

/* compiled from: ClipsPublishButtonsState.kt */
/* loaded from: classes17.dex */
public final class gze {
    public final boolean a;
    public final boolean b;
    public final yzs<q630, androidx.compose.runtime.a, Integer, s3q0> c;
    public final zzs<q630, gzs<s3q0>, androidx.compose.runtime.a, Integer, s3q0> d;

    public gze(boolean z, boolean z2, yzs yzsVar, zzs zzsVar) {
        this.a = z;
        this.b = z2;
        this.c = yzsVar;
        this.d = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gze)) {
            return false;
        }
        gze gzeVar = (gze) obj;
        return this.a == gzeVar.a && this.b == gzeVar.b && epx.f(this.c, gzeVar.c) && epx.f(this.d, gzeVar.d);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, true), 31, this.b);
        yzs<q630, androidx.compose.runtime.a, Integer, s3q0> yzsVar = this.c;
        int hashCode = (b + (yzsVar == null ? 0 : yzsVar.hashCode())) * 31;
        zzs<q630, gzs<s3q0>, androidx.compose.runtime.a, Integer, s3q0> zzsVar = this.d;
        return hashCode + (zzsVar != null ? zzsVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsPublishButtonsState(draftButtonVisible=" + this.a + ", postingRulesVisible=true, buttonsEnabled=" + this.b + ", aboveContent=" + this.c + ", disclaimerRulesContent=" + this.d + ')';
    }
}
