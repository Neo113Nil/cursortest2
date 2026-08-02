package com.yandex.go.taxi.order.chat.experiments;

import defpackage.gsq0;
import defpackage.nzs;
import defpackage.w96;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/experiments/RideWebMessengerEnabledExperiment;", "Lw96;", "Companion", "com/yandex/go/taxi/order/chat/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RideWebMessengerEnabledExperiment extends w96 {
    public static final a Companion = new a();
    public static final RideWebMessengerEnabledExperiment c = new RideWebMessengerEnabledExperiment(0);
    public final boolean b;

    public /* synthetic */ RideWebMessengerEnabledExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RideWebMessengerEnabledExperiment) && this.b == ((RideWebMessengerEnabledExperiment) obj).b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return nzs.b("RideWebMessengerEnabledExperiment(enabled=", Extension.C_BRAKE, this.b);
    }

    public RideWebMessengerEnabledExperiment(int i) {
        this.b = false;
    }

    public RideWebMessengerEnabledExperiment() {
        this(0);
    }
}
