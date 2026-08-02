package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionAction;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionStatus;
import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.UserType;

/* compiled from: PinReviewManageServiceState.kt */
/* loaded from: classes18.dex */
public final class ana0 implements lm50 {
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final UserId f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final UserId j;
    public final UserType k;
    public final SubscriptionStatus l;
    public final SubscriptionAction m;
    public final mxm0 n;
    public final js90 o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ana0() {
        this(16383, r0, r0);
        UserId userId = null;
    }

    public static ana0 a(ana0 ana0Var, String str, String str2, String str3, boolean z, boolean z2, String str4, UserId userId, UserType userType, SubscriptionStatus subscriptionStatus, SubscriptionAction subscriptionAction, mxm0 mxm0Var, js90 js90Var, int i) {
        UserId userId2 = ana0Var.b;
        String str5 = (i & 2) != 0 ? ana0Var.c : str;
        String str6 = (i & 4) != 0 ? ana0Var.d : str2;
        String str7 = (i & 8) != 0 ? ana0Var.e : str3;
        UserId userId3 = ana0Var.f;
        boolean z3 = (i & 64) != 0 ? ana0Var.h : z2;
        String str8 = (i & 128) != 0 ? ana0Var.i : str4;
        UserId userId4 = (i & 256) != 0 ? ana0Var.j : userId;
        UserType userType2 = (i & 512) != 0 ? ana0Var.k : userType;
        SubscriptionStatus subscriptionStatus2 = (i & 1024) != 0 ? ana0Var.l : subscriptionStatus;
        SubscriptionAction subscriptionAction2 = (i & 2048) != 0 ? ana0Var.m : subscriptionAction;
        mxm0 mxm0Var2 = (i & 4096) != 0 ? ana0Var.n : mxm0Var;
        js90 js90Var2 = (i & 8192) != 0 ? ana0Var.o : js90Var;
        ana0Var.getClass();
        return new ana0(userId2, str5, str6, str7, userId3, z, z3, str8, userId4, userType2, subscriptionStatus2, subscriptionAction2, mxm0Var2, js90Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ana0)) {
            return false;
        }
        ana0 ana0Var = (ana0) obj;
        return epx.f(this.b, ana0Var.b) && epx.f(this.c, ana0Var.c) && epx.f(this.d, ana0Var.d) && epx.f(this.e, ana0Var.e) && epx.f(this.f, ana0Var.f) && this.g == ana0Var.g && this.h == ana0Var.h && epx.f(this.i, ana0Var.i) && epx.f(this.j, ana0Var.j) && this.k == ana0Var.k && this.l == ana0Var.l && this.m == ana0Var.m && epx.f(this.n, ana0Var.n) && epx.f(this.o, ana0Var.o);
    }

    public final int hashCode() {
        int hashCode = (this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + bh10.a(urd0.a(qoy.b(qoy.b(bh10.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f.b), 31, this.g), 31, this.h), 31, this.i), 31, this.j.b)) * 31)) * 31)) * 31;
        mxm0 mxm0Var = this.n;
        int hashCode2 = (hashCode + (mxm0Var == null ? 0 : mxm0Var.hashCode())) * 31;
        js90 js90Var = this.o;
        return hashCode2 + (js90Var != null ? js90Var.hashCode() : 0);
    }

    public final String toString() {
        return "PinReviewManageServiceState(communityId=" + this.b + ", communityName=" + this.c + ", communityImageUrl=" + this.d + ", communitySubscribersCount=" + this.e + ", currentUserId=" + this.f + ", isLoading=" + this.g + ", isError=" + this.h + ", subscriptionName=" + this.i + ", payerId=" + this.j + ", userType=" + this.k + ", subscriptionStatus=" + this.l + ", buttonAction=" + this.m + ", additionalInfo=" + this.n + ", paymentData=" + this.o + ')';
    }

    public ana0(UserId userId, String str, String str2, String str3, UserId userId2, boolean z, boolean z2, String str4, UserId userId3, UserType userType, SubscriptionStatus subscriptionStatus, SubscriptionAction subscriptionAction, mxm0 mxm0Var, js90 js90Var) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = userId2;
        this.g = z;
        this.h = z2;
        this.i = str4;
        this.j = userId3;
        this.k = userType;
        this.l = subscriptionStatus;
        this.m = subscriptionAction;
        this.n = mxm0Var;
        this.o = js90Var;
    }

    public /* synthetic */ ana0(int i, UserId userId, UserId userId2) {
        this((i & 1) != 0 ? UserId.d : userId, "", "", "", (i & 16) != 0 ? UserId.d : userId2, true, false, "", UserId.d, UserType.None, SubscriptionStatus.None, SubscriptionAction.None, null, null);
    }
}
