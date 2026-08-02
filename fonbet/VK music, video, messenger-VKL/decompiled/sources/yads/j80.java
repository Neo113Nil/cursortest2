package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.n6j;
import xsna.vp;
import xsna.vq;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class j80 {
    public static final i80 Companion = new i80();
    public static final KSerializer[] h = {null, null, null, null, new xsna.yk3(e50.a), new xsna.yk3(c40.a), new xsna.yk3(e80.a)};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;

    public /* synthetic */ j80(int i, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i & 64)) {
            xsna.sp.x(i, 64, h80.a.getDescriptor());
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
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return epx.f(this.a, j80Var.a) && epx.f(this.b, j80Var.b) && epx.f(this.c, j80Var.c) && epx.f(this.d, j80Var.d) && epx.f(this.e, j80Var.e) && epx.f(this.f, j80Var.f) && epx.f(this.g, j80Var.g);
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
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        List list = this.e;
        List list2 = this.f;
        List list3 = this.g;
        StringBuilder a = xe9.a("DebugPanelRemoteData(pageId=", str, ", latestSdkVersion=", str2, ", appAdsTxtUrl=");
        n6j.b(a, str3, ", appStatus=", str4, ", alerts=");
        vq.d(a, list, ", adUnits=", list2, ", mediationNetworks=");
        return vp.b(")", a, list3);
    }
}
