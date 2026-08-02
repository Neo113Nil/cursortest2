package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.model.MtAnimationSourceType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh040;", "Lwc30;", "Companion", "f040", "g040", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class h040 extends wc30 {
    public static final g040 Companion = new g040();
    public final String a;
    public final String b;

    public /* synthetic */ h040(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    @Override // defpackage.wc30
    public final MtAnimationSourceType a() {
        return MtAnimationSourceType.STATIC_IMAGE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h040)) {
            return false;
        }
        h040 h040Var = (h040) obj;
        return jl40.l(this.a, h040Var.a) && jl40.l(this.b, h040Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MtStaticImage(imageUrl=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }

    public h040() {
        this.a = "";
        this.b = "";
    }
}
