package defpackage;

import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhi2;", "", "Companion", "fi2", "gi2", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class hi2 {
    public static final gi2 Companion = new gi2();
    public final String a;
    public final long b;
    public final int c;
    public final i3y d;

    public /* synthetic */ hi2(int i, int i2, String str, long j) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        final int i3 = 1;
        if ((i & 4) == 0) {
            this.c = 1;
        } else {
            this.c = i2;
        }
        this.d = a.a(new sls(this) { // from class: ei2
            public final /* synthetic */ hi2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                hi2 hi2Var = this.b;
                switch (i4) {
                    case 0:
                        String str2 = hi2Var.a;
                        int i5 = hi2Var.c;
                        long j2 = hi2Var.b;
                        if (cvu0.x(str2, "file://", false)) {
                            return new t1z(evu0.d0(str2, "file://", str2), j2, i5);
                        }
                        if (cvu0.x(str2, "http://", false) || cvu0.x(str2, "https://", false)) {
                            return new yzo(str2, j2, i5);
                        }
                        return null;
                    default:
                        String str3 = hi2Var.a;
                        int i6 = hi2Var.c;
                        long j3 = hi2Var.b;
                        if (cvu0.x(str3, "file://", false)) {
                            return new t1z(evu0.d0(str3, "file://", str3), j3, i6);
                        }
                        if (cvu0.x(str3, "http://", false) || cvu0.x(str3, "https://", false)) {
                            return new yzo(str3, j3, i6);
                        }
                        return null;
                }
            }
        });
    }

    public hi2() {
        this.a = "";
        this.b = 0L;
        this.c = 1;
        final int i = 0;
        this.d = a.a(new sls(this) { // from class: ei2
            public final /* synthetic */ hi2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i;
                hi2 hi2Var = this.b;
                switch (i4) {
                    case 0:
                        String str2 = hi2Var.a;
                        int i5 = hi2Var.c;
                        long j2 = hi2Var.b;
                        if (cvu0.x(str2, "file://", false)) {
                            return new t1z(evu0.d0(str2, "file://", str2), j2, i5);
                        }
                        if (cvu0.x(str2, "http://", false) || cvu0.x(str2, "https://", false)) {
                            return new yzo(str2, j2, i5);
                        }
                        return null;
                    default:
                        String str3 = hi2Var.a;
                        int i6 = hi2Var.c;
                        long j3 = hi2Var.b;
                        if (cvu0.x(str3, "file://", false)) {
                            return new t1z(evu0.d0(str3, "file://", str3), j3, i6);
                        }
                        if (cvu0.x(str3, "http://", false) || cvu0.x(str3, "https://", false)) {
                            return new yzo(str3, j3, i6);
                        }
                        return null;
                }
            }
        });
    }
}
