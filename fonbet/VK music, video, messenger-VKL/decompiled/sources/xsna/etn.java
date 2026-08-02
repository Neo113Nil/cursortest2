package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashSet;

/* compiled from: Doc2DocConfig.kt */
/* loaded from: classes.dex */
public final class etn {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Integer i;
    public final boolean j;

    public etn() {
        this(false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public final boolean a() {
        return this.c && this.e;
    }

    public final boolean b() {
        return this.c || this.e;
    }

    public final boolean c() {
        return (this.c || this.e) ? false : true;
    }

    public final boolean d() {
        return this.a || this.b || this.f;
    }

    public final boolean e(Boolean bool) {
        return (bool == null || bool.booleanValue() || !d()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etn)) {
            return false;
        }
        etn etnVar = (etn) obj;
        return this.a == etnVar.a && this.b == etnVar.b && this.c == etnVar.c && this.d == etnVar.d && this.e == etnVar.e && this.f == etnVar.f && this.g == etnVar.g && this.h == etnVar.h && epx.f(this.i, etnVar.i) && this.j == etnVar.j;
    }

    public final boolean f(boolean z, Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            if (z ? this.b || this.f : this.a) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(Boolean bool) {
        return (bool == null || bool.booleanValue() || !this.b) ? false : true;
    }

    public final boolean h(Boolean bool) {
        return (bool == null || bool.booleanValue() || !this.f) ? false : true;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Integer num = this.i;
        return Boolean.hashCode(this.j) + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final boolean i(Context context) {
        if (!this.b && !this.f) {
            return false;
        }
        HashSet hashSet = iah0.a;
        return !fnj.d(context);
    }

    public final boolean j(boolean z, Boolean bool) {
        if (bool != null) {
            boolean z2 = z ? this.f : this.a;
            if (!bool.booleanValue() && z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Boolean bool) {
        return (bool == null || bool.booleanValue() || !this.a) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Doc2DocConfig(isVerticalEntryPointEnabled=");
        sb.append(this.a);
        sb.append(", isHorizontalEntryPointEnabled=");
        sb.append(this.b);
        sb.append(", areDiscoveryTabsEnabled=");
        sb.append(this.c);
        sb.append(", areDiscoveryTabsCompact=");
        sb.append(this.d);
        sb.append(", areHorizontalFullscreenTabsEnabled=");
        sb.append(this.e);
        sb.append(", isHorizontalRedesignEnabled=");
        sb.append(this.f);
        sb.append(", isOnboardingAvailable=");
        sb.append(this.g);
        sb.append(", onboardingDebug=");
        sb.append(this.h);
        sb.append(", onboardingHideInterval=");
        sb.append(this.i);
        sb.append(", isMetaChannelBannerEnabled=");
        return defpackage.q0.a(sb, this.j, ')');
    }

    public /* synthetic */ etn(boolean z, int i) {
        this(false, false, false, false, false, (i & 32) != 0 ? false : z, false, false, null, false);
    }

    public etn(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Integer num, boolean z9) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = num;
        this.j = z9;
    }
}
