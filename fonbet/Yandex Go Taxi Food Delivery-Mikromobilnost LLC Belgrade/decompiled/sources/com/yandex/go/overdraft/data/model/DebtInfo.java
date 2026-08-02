package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.rsf;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtInfo;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtInfo {
    public static final o Companion = new o();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final List c;
    public final t0 d;
    public final PlusPoints e;
    public final List f;
    public final boolean g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new rsf(15)), null, null, kotlin.a.b(lazyThreadSafetyMode, new rsf(16)), null};
    }

    public DebtInfo(int i, String str, String str2, List list, t0 t0Var, PlusPoints plusPoints, List list2, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = s0.INSTANCE;
        } else {
            this.d = t0Var;
        }
        if ((i & 16) == 0) {
            PlusPoints.Companion.getClass();
            this.e = PlusPoints.d;
        } else {
            this.e = plusPoints;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtInfo)) {
            return false;
        }
        DebtInfo debtInfo = (DebtInfo) obj;
        return jl40.l(this.a, debtInfo.a) && jl40.l(this.b, debtInfo.b) && jl40.l(this.c, debtInfo.c) && jl40.l(this.d, debtInfo.d) && jl40.l(this.e, debtInfo.e) && jl40.l(this.f, debtInfo.f) && this.g == debtInfo.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + unr0.c((this.e.hashCode() + ((this.d.hashCode() + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebtInfo(title=", this.a, ", subtitle=", this.b, ", rides=");
        v.append(this.c);
        v.append(", paymentMethodAction=");
        v.append(this.d);
        v.append(", plusPoints=");
        v.append(this.e);
        v.append(", actionButtons=");
        v.append(this.f);
        v.append(", hasDivider=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }

    public DebtInfo() {
        s0 s0Var = s0.INSTANCE;
        PlusPoints.Companion.getClass();
        PlusPoints plusPoints = PlusPoints.d;
        this.a = "";
        this.b = "";
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = s0Var;
        this.e = plusPoints;
        this.f = emptyList;
        this.g = false;
    }
}
