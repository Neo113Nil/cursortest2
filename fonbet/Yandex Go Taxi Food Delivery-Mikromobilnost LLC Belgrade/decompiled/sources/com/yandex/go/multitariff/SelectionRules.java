package com.yandex.go.multitariff;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multitariff/SelectionRules;", "", "Companion", "com/yandex/go/multitariff/e", "$serializer", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SelectionRules {
    public static final e Companion = new e();
    public static final SelectionRules b = new SelectionRules(0);
    public final MinSelectedCount a;

    public /* synthetic */ SelectionRules(int i, MinSelectedCount minSelectedCount) {
        if ((i & 1) == 0) {
            this.a = MinSelectedCount.c;
        } else {
            this.a = minSelectedCount;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectionRules) && jl40.l(this.a, ((SelectionRules) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectionRules(minSelectedCount=" + this.a + Extension.C_BRAKE;
    }

    public SelectionRules(int i) {
        this.a = MinSelectedCount.c;
    }

    public SelectionRules() {
        this(0);
    }
}
