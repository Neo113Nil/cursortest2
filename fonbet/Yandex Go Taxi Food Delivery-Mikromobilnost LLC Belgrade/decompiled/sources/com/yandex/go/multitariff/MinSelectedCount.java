package com.yandex.go.multitariff;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multitariff/MinSelectedCount;", "", "Companion", "com/yandex/go/multitariff/b", "$serializer", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MinSelectedCount {
    public static final b Companion = new b();
    public static final MinSelectedCount c = new MinSelectedCount(0);
    public final int a;
    public final String b;

    public /* synthetic */ MinSelectedCount(int i, int i2, String str) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinSelectedCount)) {
            return false;
        }
        MinSelectedCount minSelectedCount = (MinSelectedCount) obj;
        return this.a == minSelectedCount.a && jl40.l(this.b, minSelectedCount.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "MinSelectedCount(value=", ", text=", this.b, Extension.C_BRAKE);
    }

    public MinSelectedCount(int i) {
        this.a = 0;
        this.b = "";
    }

    public MinSelectedCount() {
        this(0);
    }
}
