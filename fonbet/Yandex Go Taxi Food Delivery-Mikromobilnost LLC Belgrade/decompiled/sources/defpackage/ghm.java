package defpackage;

import com.yandex.go.zone.dto.objects.DriveExtra;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lghm;", "Lrjx0;", "Companion", "ehm", "fhm", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ghm extends rjx0 {
    public static final fhm Companion = new fhm();
    public final String a;
    public final DriveExtra.LayersExtra b;
    public final boolean c;

    public ghm(int i, String str, DriveExtra.LayersExtra layersExtra, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new DriveExtra.LayersExtra(0);
        } else {
            this.b = layersExtra;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
    }

    @Override // defpackage.rjx0
    /* renamed from: a, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final DriveExtra.LayersExtra getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghm)) {
            return false;
        }
        ghm ghmVar = (ghm) obj;
        return jl40.l(this.a, ghmVar.a) && jl40.l(this.b, ghmVar.b) && this.c == ghmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriveTariffOverrideExtra(offerId=");
        sb.append(this.a);
        sb.append(", layersExtra=");
        sb.append(this.b);
        sb.append(", overrideVerticals=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public ghm() {
        this(null, null, 7);
    }

    public ghm(String str, DriveExtra.LayersExtra layersExtra, int i) {
        str = (i & 1) != 0 ? "" : str;
        layersExtra = (i & 2) != 0 ? new DriveExtra.LayersExtra(0) : layersExtra;
        this.a = str;
        this.b = layersExtra;
        this.c = true;
    }
}
