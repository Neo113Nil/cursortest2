package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes10.dex */
public final class ry2 {
    public final List a;
    public final q83[] b;

    public ry2(List list) {
        this.a = list;
        this.b = new q83[list.size()];
    }

    public final void a(qq0 qq0Var, pa3 pa3Var) {
        for (int i = 0; i < this.b.length; i++) {
            pa3Var.a();
            pa3Var.b();
            q83 a = qq0Var.a(pa3Var.d, 3);
            nx0 nx0Var = (nx0) this.a.get(i);
            String str = nx0Var.m;
            ni.a("Invalid closed caption mime type provided: " + str, MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str));
            String str2 = nx0Var.b;
            if (str2 == null) {
                pa3Var.b();
                str2 = pa3Var.e;
            }
            mx0 mx0Var = new mx0();
            mx0Var.a = str2;
            mx0Var.k = str;
            mx0Var.d = nx0Var.e;
            mx0Var.c = nx0Var.d;
            mx0Var.C = nx0Var.E;
            mx0Var.m = nx0Var.o;
            a.a(new nx0(mx0Var));
            this.b[i] = a;
        }
    }
}
