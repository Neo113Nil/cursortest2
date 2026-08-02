package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.fvb0;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/PinIconActionDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/h1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PinIconActionDto {
    public static final h1 Companion = new h1();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(8))};
    public final PinIconActionKind a;

    public /* synthetic */ PinIconActionDto(int i, PinIconActionKind pinIconActionKind) {
        if ((i & 1) == 0) {
            this.a = PinIconActionKind.UNKNOWN;
        } else {
            this.a = pinIconActionKind;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PinIconActionDto) && this.a == ((PinIconActionDto) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PinIconActionDto(kind=" + this.a + Extension.C_BRAKE;
    }

    public PinIconActionDto() {
        this.a = PinIconActionKind.UNKNOWN;
    }
}
