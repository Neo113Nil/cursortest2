package xsna;

import com.vk.instantjobs.InstantJob;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: DownloadReactionsAssetsCmd.kt */
/* loaded from: classes2.dex */
public final class p9o extends le6<s3q0> {
    public final List<yaw> b;
    public final int c;

    public p9o(List<yaw> list, int i) {
        this.b = list;
        this.c = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        String str;
        String str2;
        for (yaw yawVar : this.b) {
            final int i = yawVar.a;
            f8v0 c = w2wVar.M0().c();
            c.getClass();
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            x6x x6xVar = (x6x) c.a;
            final int i2 = this.c;
            x6xVar.c(new izs() { // from class: xsna.v8w
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    InstantJob instantJob = (InstantJob) obj;
                    boolean z = false;
                    if (instantJob instanceof o9o) {
                        o9o o9oVar = (o9o) instantJob;
                        if (o9oVar.c == i) {
                            if (o9oVar.g < i2) {
                                z = true;
                            } else {
                                ref$BooleanRef.element = true;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
            });
            if (!ref$BooleanRef.element) {
                f8v0 c2 = w2wVar.M0().c();
                int i3 = yawVar.a;
                String str3 = yawVar.i;
                if (str3 != null && (str = yawVar.h) != null && (str2 = yawVar.g) != null) {
                    ((x6x) c2.a).a(new o9o(i3, this.c, str3, str, str2));
                }
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9o)) {
            return false;
        }
        p9o p9oVar = (p9o) obj;
        return epx.f(this.b, p9oVar.b) && this.c == p9oVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadReactionsAssetsCmd(assets=");
        sb.append(this.b);
        sb.append(", version=");
        return vu5.b(sb, this.c, ')');
    }
}
