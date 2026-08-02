package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: BroadcastInfoFragmentConfig.kt */
/* loaded from: classes7.dex */
public final class ng8 {
    public final CharSequence a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ng8() {
        this(r0, r0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        String str = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng8)) {
            return false;
        }
        ng8 ng8Var = (ng8) obj;
        return epx.f(this.a, ng8Var.a) && epx.f(this.b, ng8Var.b) && this.c == ng8Var.c && this.d == ng8Var.d && this.e == ng8Var.e && this.f == ng8Var.f && this.g == ng8Var.g && this.h == ng8Var.h && this.i == ng8Var.i && this.j == ng8Var.j;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return Boolean.hashCode(this.j) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BroadcastInfoFragmentConfig(forceTitle=");
        sb.append((Object) this.a);
        sb.append(", forceStatsSectionTitle=");
        sb.append((Object) this.b);
        sb.append(", canShowViewsTotalCount=");
        sb.append(this.c);
        sb.append(", canShowViewsUniqueCount=");
        sb.append(this.d);
        sb.append(", canShowLikesCount=");
        sb.append(this.e);
        sb.append(", canShowCommentsCount=");
        sb.append(this.f);
        sb.append(", canShowElapsedTime=");
        sb.append(this.g);
        sb.append(", canShowSpectators=");
        sb.append(this.h);
        sb.append(", canShare=");
        sb.append(this.i);
        sb.append(", canFinish=");
        return defpackage.q0.a(sb, this.j, ')');
    }

    public ng8(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
    }

    public /* synthetic */ ng8(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, true, (i & 8) != 0, true, true, true, (i & 128) != 0, (i & 256) != 0, (i & 512) != 0);
    }
}
