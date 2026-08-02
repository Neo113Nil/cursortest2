package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes5.dex */
public final class ayi extends n351 {
    public final String c;
    public final String d;

    public ayi(String str, String str2) {
        super(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, false, 14);
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayi)) {
            return false;
        }
        ayi ayiVar = (ayi) obj;
        return jl40.l(this.c, ayiVar.c) && jl40.l(this.d, ayiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DescriptionState(title=", this.c, ", subtitle=", this.d, Extension.C_BRAKE);
    }
}
