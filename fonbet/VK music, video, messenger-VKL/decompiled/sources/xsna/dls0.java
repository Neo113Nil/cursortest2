package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoApiHelperRepository.kt */
/* loaded from: classes3.dex */
public final class dls0 {
    public final UserId a;
    public final int b;
    public final String c;

    public dls0(UserId userId, int i, String str) {
        this.a = userId;
        this.b = i;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public final UserId b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dls0)) {
            return false;
        }
        dls0 dls0Var = (dls0) obj;
        return epx.f(this.a, dls0Var.a) && this.b == dls0Var.b && epx.f(this.c, dls0Var.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFileData(oid=");
        sb.append(this.a);
        sb.append(", vid=");
        sb.append(this.b);
        sb.append(", accessKey=");
        return ho8.a(sb, this.c, ')');
    }
}
