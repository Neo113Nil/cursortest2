package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.d80;
import yads.e80;
import yads.f80;

@gsq0
/* loaded from: classes7.dex */
public final class kc71 {
    public static final k971 Companion = new k971();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, d80.w), a.b(lazyThreadSafetyMode, e80.w), a.b(lazyThreadSafetyMode, f80.w)};
    }

    public kc71(int i, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i & 64)) {
            qje.Z(i, 64, po61.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc71)) {
            return false;
        }
        kc71 kc71Var = (kc71) obj;
        return jl40.l(this.a, kc71Var.a) && jl40.l(this.b, kc71Var.b) && jl40.l(this.c, kc71Var.c) && jl40.l(this.d, kc71Var.d) && jl40.l(this.e, kc71Var.e) && jl40.l(this.f, kc71Var.f) && jl40.l(this.g, kc71Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return this.g.hashCode() + ((hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelRemoteData(pageId=", this.a, ", latestSdkVersion=", this.b, ", appAdsTxtUrl=");
        g8e.D(v, this.c, ", appStatus=", this.d, ", alerts=");
        nnm.w(v, this.e, ", adUnits=", this.f, ", mediationNetworks=");
        return ly3.s(v, this.g, Extension.C_BRAKE);
    }
}
