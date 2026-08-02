package xsna;

import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.newsfeed.posting.impl.domain.model.UserType;

/* compiled from: AdditionalSettingsViewState.kt */
/* loaded from: classes4.dex */
public final class is0 implements fm50<AdditionalSettingsState.Data> {
    public final yzt0<Boolean> a;
    public final yzt0<Boolean> b;
    public final yzt0<Boolean> c;
    public final yzt0<Boolean> d;
    public final yzt0<Boolean> e;
    public final yzt0<Boolean> f;
    public final yzt0<Boolean> g;
    public final yzt0<String> h;
    public final yzt0<String> i;
    public final yzt0<Boolean> j;
    public final yzt0<Boolean> k;
    public final yzt0<AdditionalSettingsConfiguration> l;
    public final yzt0<Boolean> m;
    public final yzt0<Boolean> n;
    public final yzt0<Boolean> o;
    public final yzt0<UserType> p;

    public is0(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13, h0u0 h0u0Var14, h0u0 h0u0Var15, h0u0 h0u0Var16) {
        this.a = h0u0Var;
        this.b = h0u0Var2;
        this.c = h0u0Var3;
        this.d = h0u0Var4;
        this.e = h0u0Var5;
        this.f = h0u0Var6;
        this.g = h0u0Var7;
        this.h = h0u0Var8;
        this.i = h0u0Var9;
        this.j = h0u0Var10;
        this.k = h0u0Var11;
        this.l = h0u0Var12;
        this.m = h0u0Var13;
        this.n = h0u0Var14;
        this.o = h0u0Var15;
        this.p = h0u0Var16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is0)) {
            return false;
        }
        is0 is0Var = (is0) obj;
        return epx.f(this.a, is0Var.a) && epx.f(this.b, is0Var.b) && epx.f(this.c, is0Var.c) && epx.f(this.d, is0Var.d) && epx.f(this.e, is0Var.e) && epx.f(this.f, is0Var.f) && epx.f(this.g, is0Var.g) && epx.f(this.h, is0Var.h) && epx.f(this.i, is0Var.i) && epx.f(this.j, is0Var.j) && epx.f(this.k, is0Var.k) && epx.f(this.l, is0Var.l) && epx.f(this.m, is0Var.m) && epx.f(this.n, is0Var.n) && epx.f(this.o, is0Var.o) && epx.f(this.p, is0Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + sr.a(this.o, sr.a(this.n, sr.a(this.m, sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(isEditMode=");
        sb.append(this.a);
        sb.append(", isDraft=");
        sb.append(this.b);
        sb.append(", shouldShowNotificationsSwitch=");
        sb.append(this.c);
        sb.append(", shouldShowSignSwitch=");
        sb.append(this.d);
        sb.append(", shouldShowAdvertiseButton=");
        sb.append(this.e);
        sb.append(", isSuggestPost=");
        sb.append(this.f);
        sb.append(", isAdmin=");
        sb.append(this.g);
        sb.append(", signerFirstNameGen=");
        sb.append(this.h);
        sb.append(", signerLastNameGen=");
        sb.append(this.i);
        sb.append(", isPostInCommunity=");
        sb.append(this.j);
        sb.append(", isCommentChangeAvailable=");
        sb.append(this.k);
        sb.append(", additionalSettingsConfiguration=");
        sb.append(this.l);
        sb.append(", isCommunity=");
        sb.append(this.m);
        sb.append(", hasCoauthors=");
        sb.append(this.n);
        sb.append(", showTurnOnCommentsAlert=");
        sb.append(this.o);
        sb.append(", userType=");
        return tr.c(sb, this.p, ')');
    }
}
