package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsOwnerSwipeMviState.kt */
/* loaded from: classes17.dex */
public final class voe implements km50 {
    public final yrf b;
    public final boolean c;
    public final UserId d;
    public final mme e;
    public final boolean f;
    public final boolean g;
    public final Integer h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public voe() {
        this(null, r0, r0, 127);
        boolean z = false;
    }

    public static voe a(voe voeVar, yrf yrfVar, boolean z, UserId userId, mme mmeVar, boolean z2, Integer num, int i) {
        if ((i & 1) != 0) {
            yrfVar = voeVar.b;
        }
        yrf yrfVar2 = yrfVar;
        if ((i & 2) != 0) {
            z = voeVar.c;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            userId = voeVar.d;
        }
        UserId userId2 = userId;
        if ((i & 8) != 0) {
            mmeVar = voeVar.e;
        }
        mme mmeVar2 = mmeVar;
        if ((i & 16) != 0) {
            z2 = voeVar.f;
        }
        boolean z4 = z2;
        boolean z5 = voeVar.g;
        if ((i & 64) != 0) {
            num = voeVar.h;
        }
        voeVar.getClass();
        return new voe(yrfVar2, z3, userId2, mmeVar2, z4, z5, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voe)) {
            return false;
        }
        voe voeVar = (voe) obj;
        return epx.f(this.b, voeVar.b) && this.c == voeVar.c && epx.f(this.d, voeVar.d) && epx.f(this.e, voeVar.e) && this.f == voeVar.f && this.g == voeVar.g && epx.f(this.h, voeVar.h);
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        UserId userId = this.d;
        int hashCode = (b + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        mme mmeVar = this.e;
        int b2 = qoy.b(qoy.b((hashCode + (mmeVar == null ? 0 : mmeVar.hashCode())) * 31, 31, this.f), 31, this.g);
        Integer num = this.h;
        return b2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsOwnerSwipeMviState(wrapperState=");
        sb.append(this.b);
        sb.append(", isShowingOwner=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", ownerItem=");
        sb.append(this.e);
        sb.append(", disableOwnerSwipe=");
        sb.append(this.f);
        sb.append(", useVideoProfileAsOwner=");
        sb.append(this.g);
        sb.append(", videoId=");
        return uqi.b(sb, this.h, ')');
    }

    public voe(yrf yrfVar, boolean z, UserId userId, mme mmeVar, boolean z2, boolean z3, Integer num) {
        this.b = yrfVar;
        this.c = z;
        this.d = userId;
        this.e = mmeVar;
        this.f = z2;
        this.g = z3;
        this.h = num;
    }

    public /* synthetic */ voe(yrf yrfVar, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? new yrf(null, 15) : yrfVar, false, null, null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, 0);
    }
}
