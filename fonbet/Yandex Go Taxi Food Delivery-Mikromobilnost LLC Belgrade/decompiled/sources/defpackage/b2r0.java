package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb2r0;", "Lig5;", "Companion", "z1r0", "a2r0", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b2r0 implements ig5 {
    public static final a2r0 Companion = new a2r0();
    public final Float a;

    public /* synthetic */ b2r0(int i, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2r0) && jl40.l(this.a, ((b2r0) obj).a);
    }

    public final int hashCode() {
        Float f = this.a;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }

    public final String toString() {
        return "SetBrightnessAction(value=" + this.a + Extension.C_BRAKE;
    }

    public b2r0() {
        this.a = null;
    }
}
