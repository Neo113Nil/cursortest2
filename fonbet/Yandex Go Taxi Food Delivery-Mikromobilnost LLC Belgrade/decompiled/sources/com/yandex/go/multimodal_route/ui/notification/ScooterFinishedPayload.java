package com.yandex.go.multimodal_route.ui.notification;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/ui/notification/ScooterFinishedPayload;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/ui/notification/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ScooterFinishedPayload {
    public static final a Companion = new a();
    public final String a;

    public /* synthetic */ ScooterFinishedPayload(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ScooterFinishedPayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScooterFinishedPayload) && jl40.l(this.a, ((ScooterFinishedPayload) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("ScooterFinishedPayload(totalPrice=", this.a, Extension.C_BRAKE);
    }

    public ScooterFinishedPayload(String str) {
        this.a = str;
    }
}
