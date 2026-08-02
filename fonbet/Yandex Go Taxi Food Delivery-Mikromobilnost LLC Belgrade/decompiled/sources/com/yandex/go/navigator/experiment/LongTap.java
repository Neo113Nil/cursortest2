package com.yandex.go.navigator.experiment;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/experiment/LongTap;", "", "Companion", "$serializer", "com/yandex/go/navigator/experiment/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LongTap {
    public static final a Companion = new a();
    public final boolean a;
    public final String b;

    public /* synthetic */ LongTap(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongTap)) {
            return false;
        }
        LongTap longTap = (LongTap) obj;
        return this.a == longTap.a && jl40.l(this.b, longTap.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xvz.m("LongTap(isLongTapEnabled=", this.a, ", ugcDeeplink=", this.b, Extension.C_BRAKE);
    }

    public LongTap(int i) {
        this.a = false;
        this.b = null;
    }

    public LongTap() {
        this(0);
    }
}
