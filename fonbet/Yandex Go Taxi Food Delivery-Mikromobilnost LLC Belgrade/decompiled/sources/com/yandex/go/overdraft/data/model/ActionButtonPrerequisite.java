package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/ActionButtonPrerequisite;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionButtonPrerequisite {
    public static final b Companion = new b();
    public static final i3y[] e;
    public final ConditionType a;
    public final String b;
    public final RequiredBalance c;
    public final jsq0 d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new lq(24)), null, null, kotlin.a.b(lazyThreadSafetyMode, new lq(25))};
    }

    public /* synthetic */ ActionButtonPrerequisite(int i, ConditionType conditionType, String str, RequiredBalance requiredBalance, jsq0 jsq0Var) {
        this.a = (i & 1) == 0 ? ConditionType.UNKNOWN : conditionType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = requiredBalance;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = jsq0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final RequiredBalance getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButtonPrerequisite)) {
            return false;
        }
        ActionButtonPrerequisite actionButtonPrerequisite = (ActionButtonPrerequisite) obj;
        return this.a == actionButtonPrerequisite.a && jl40.l(this.b, actionButtonPrerequisite.b) && jl40.l(this.c, actionButtonPrerequisite.c) && jl40.l(this.d, actionButtonPrerequisite.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RequiredBalance requiredBalance = this.c;
        int hashCode3 = (hashCode2 + (requiredBalance == null ? 0 : requiredBalance.hashCode())) * 31;
        jsq0 jsq0Var = this.d;
        return hashCode3 + (jsq0Var != null ? jsq0Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "ActionButtonPrerequisite(conditionType=" + this.a + ", paymentType=" + this.b + ", requiredBalance=" + this.c + ", source=" + this.d + Extension.C_BRAKE;
    }

    public ActionButtonPrerequisite() {
        this.a = ConditionType.UNKNOWN;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
