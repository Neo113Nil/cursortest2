package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ChannelDonutSupportState.kt */
/* loaded from: classes16.dex */
public final class hya implements km50 {
    public final UserId b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final f0o g;
    public final boolean h;

    public hya() {
        this(null, 127);
    }

    public static hya a(hya hyaVar, boolean z, boolean z2, String str, String str2, f0o f0oVar, int i) {
        UserId userId = hyaVar.b;
        if ((i & 2) != 0) {
            z = hyaVar.c;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = hyaVar.d;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str = hyaVar.e;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = hyaVar.f;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            f0oVar = hyaVar.g;
        }
        f0o f0oVar2 = f0oVar;
        boolean z5 = (i & 64) != 0 ? hyaVar.h : true;
        hyaVar.getClass();
        return new hya(userId, z3, z4, str3, str4, f0oVar2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hya)) {
            return false;
        }
        hya hyaVar = (hya) obj;
        return epx.f(this.b, hyaVar.b) && this.c == hyaVar.c && this.d == hyaVar.d && epx.f(this.e, hyaVar.e) && epx.f(this.f, hyaVar.f) && epx.f(this.g, hyaVar.g) && this.h == hyaVar.h;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        f0o f0oVar = this.g;
        return Boolean.hashCode(this.h) + ((a + (f0oVar == null ? 0 : f0oVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelDonutSupportState(ownerId=");
        sb.append(this.b);
        sb.append(", isGlobalLoading=");
        sb.append(this.c);
        sb.append(", isOperationLoading=");
        sb.append(this.d);
        sb.append(", nameLevel=");
        sb.append(this.e);
        sb.append(", price=");
        sb.append(this.f);
        sb.append(", levelLimit=");
        sb.append(this.g);
        sb.append(", hasTextChanged=");
        return defpackage.q0.a(sb, this.h, ')');
    }

    public hya(UserId userId, boolean z, boolean z2, String str, String str2, f0o f0oVar, boolean z3) {
        this.b = userId;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = f0oVar;
        this.h = z3;
    }

    public /* synthetic */ hya(UserId userId, int i) {
        this((i & 1) != 0 ? new UserId(0L) : userId, true, false, "", "", null, false);
    }
}
