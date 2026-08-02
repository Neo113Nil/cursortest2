package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpf10;", "", "Companion", "nf10", "of10", "go-client-android.libs:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class pf10 {
    public static final of10 Companion = new of10();
    public final int a;
    public final int b;
    public final float c;

    public /* synthetic */ pf10(int i, int i2, int i3, float f) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 0.0f;
        } else {
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf10)) {
            return false;
        }
        pf10 pf10Var = (pf10) obj;
        return this.a == pf10Var.a && this.b == pf10Var.b && Float.compare(this.c, pf10Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return uw51.i(b64.s(this.a, this.b, "MediaSizeInfo(screenHeight=", ", screenWidth=", ", scale="), this.c, Extension.C_BRAKE);
    }

    public pf10(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public pf10() {
        this(0);
    }

    public /* synthetic */ pf10(int i) {
        this(0, 0, 0.0f);
    }
}
