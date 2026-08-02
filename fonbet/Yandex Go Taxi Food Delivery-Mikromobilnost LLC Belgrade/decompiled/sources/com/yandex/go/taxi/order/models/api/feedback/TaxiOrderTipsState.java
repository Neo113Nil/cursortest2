package com.yandex.go.taxi.order.models.api.feedback;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.z2y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/feedback/TaxiOrderTipsState;", "", "Companion", "com/yandex/go/taxi/order/models/api/feedback/e", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderTipsState {
    public static final e Companion = new e();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2y0(28)), null, null};
    public static final TaxiOrderTipsState f = new TaxiOrderTipsState(null, 0 == true ? 1 : 0, 15);
    public final String a;
    public final List b;
    public final boolean c;
    public final TaxiOrderSelectedTipsChoiceState d;

    public /* synthetic */ TaxiOrderTipsState(int i, String str, List list, boolean z, TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = taxiOrderSelectedTipsChoiceState;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static TaxiOrderTipsState a(TaxiOrderTipsState taxiOrderTipsState, ArrayList arrayList, TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState, int i) {
        String str = taxiOrderTipsState.a;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = taxiOrderTipsState.b;
        }
        boolean z = (i & 4) != 0 ? taxiOrderTipsState.c : false;
        if ((i & 8) != 0) {
            taxiOrderSelectedTipsChoiceState = taxiOrderTipsState.d;
        }
        taxiOrderTipsState.getClass();
        return new TaxiOrderTipsState(str, arrayList2, z, taxiOrderSelectedTipsChoiceState);
    }

    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final TaxiOrderSelectedTipsChoiceState getD() {
        return this.d;
    }

    public final TaxiOrderTipsState d(String str) {
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = this.d;
        return a(this, null, taxiOrderSelectedTipsChoiceState != null ? TaxiOrderSelectedTipsChoiceState.a(taxiOrderSelectedTipsChoiceState, null, str, 3) : new TaxiOrderSelectedTipsChoiceState(3, (TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType) null, str), 7);
    }

    public final TaxiOrderTipsState e(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType) {
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = this.d;
        return a(this, null, taxiOrderSelectedTipsChoiceState != null ? TaxiOrderSelectedTipsChoiceState.a(taxiOrderSelectedTipsChoiceState, taxiOrderTipsValueType, null, 5) : new TaxiOrderSelectedTipsChoiceState(5, taxiOrderTipsValueType, (String) null), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderTipsState)) {
            return false;
        }
        TaxiOrderTipsState taxiOrderTipsState = (TaxiOrderTipsState) obj;
        return jl40.l(this.a, taxiOrderTipsState.a) && jl40.l(this.b, taxiOrderTipsState.b) && this.c == taxiOrderTipsState.c && jl40.l(this.d, taxiOrderTipsState.d);
    }

    public final int hashCode() {
        String str = this.a;
        int e2 = unr0.e(unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = this.d;
        return e2 + (taxiOrderSelectedTipsChoiceState != null ? taxiOrderSelectedTipsChoiceState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("TaxiOrderTipsState(customTipsLastValue=", this.a, ", lastShownTips=", this.b, ", canPreselectPreferredTips=");
        r.append(this.c);
        r.append(", selectedTipsState=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxiOrderTipsState() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public TaxiOrderTipsState(String str, List list, boolean z, TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = taxiOrderSelectedTipsChoiceState;
    }

    public /* synthetic */ TaxiOrderTipsState(String str, TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState, int i) {
        this((i & 1) != 0 ? null : str, EmptyList.a, true, (i & 8) != 0 ? null : taxiOrderSelectedTipsChoiceState);
    }
}
