package defpackage;

import kotlinx.serialization.json.ClassDiscriminatorMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ccx {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ClassDiscriminatorMode m;
    public final boolean n;

    public ccx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, String str2, boolean z8, boolean z9, boolean z10, ClassDiscriminatorMode classDiscriminatorMode, boolean z11) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = str;
        this.h = z7;
        this.i = str2;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = classDiscriminatorMode;
        this.n = z11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.a);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.b);
        sb.append(", isLenient=");
        sb.append(this.c);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.d);
        sb.append(", prettyPrint=");
        sb.append(this.e);
        sb.append(", explicitNulls=");
        sb.append(this.f);
        sb.append(", prettyPrintIndent='");
        sb.append(this.g);
        sb.append("', coerceInputValues=");
        sb.append(this.h);
        sb.append(", useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.i);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.j);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=");
        sb.append(this.k);
        sb.append(", allowTrailingComma=");
        sb.append(this.l);
        sb.append(", allowComments=false, classDiscriminatorMode=");
        sb.append(this.m);
        sb.append(", exceptionsWithDebugInfo=");
        return unr0.u(sb, this.n, ')');
    }

    public ccx() {
        this(0);
    }

    public /* synthetic */ ccx(int i) {
        this(false, false, false, false, false, true, Extension.TAB_CHAR, false, "type", true, false, false, ClassDiscriminatorMode.POLYMORPHIC, true);
    }
}
