package defpackage;

import com.ybsdk.feature.divkit.common.screen.api.DivkitScreenConfig;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class msl {
    public final String a;
    public final String b;
    public final DivkitScreenConfig c;
    public final u8j0 d;
    public final List e;
    public final boolean f;

    public msl(String str, String str2, DivkitScreenConfig divkitScreenConfig, u8j0 u8j0Var, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = divkitScreenConfig;
        this.d = u8j0Var;
        this.e = list;
        this.f = z;
    }

    public static msl a(msl mslVar, u8j0 u8j0Var, boolean z, int i) {
        String str = mslVar.a;
        String str2 = mslVar.b;
        DivkitScreenConfig divkitScreenConfig = mslVar.c;
        if ((i & 8) != 0) {
            u8j0Var = mslVar.d;
        }
        u8j0 u8j0Var2 = u8j0Var;
        List list = mslVar.e;
        if ((i & 32) != 0) {
            z = mslVar.f;
        }
        mslVar.getClass();
        return new msl(str, str2, divkitScreenConfig, u8j0Var2, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msl)) {
            return false;
        }
        msl mslVar = (msl) obj;
        return jl40.l(this.a, mslVar.a) && jl40.l(this.b, mslVar.b) && jl40.l(this.c, mslVar.c) && jl40.l(this.d, mslVar.d) && this.e.equals(mslVar.e) && this.f == mslVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        u8j0 u8j0Var = this.d;
        return Boolean.hashCode(this.f) + unr0.c((hashCode2 + (u8j0Var != null ? u8j0Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("DivkitCommonState(path=", this.a, ", skeletonId=", this.b, ", screenConfig=");
        v.append(this.c);
        v.append(", requestStatus=");
        v.append(this.d);
        v.append(", bottomBarItems=");
        v.append(this.e);
        v.append(", canShowEducationV2=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
