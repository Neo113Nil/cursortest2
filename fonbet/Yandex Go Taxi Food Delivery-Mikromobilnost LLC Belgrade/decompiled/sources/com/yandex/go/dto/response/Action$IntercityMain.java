package com.yandex.go.dto.response;

import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressesDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/Action$IntercityMain", "Lcom/yandex/go/dto/response/q1;", "Companion", "$serializer", "com/yandex/go/dto/response/v", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$IntercityMain extends q1 {
    public static final v Companion = new v();
    public final String a;
    public final AddressesDto b;

    public Action$IntercityMain(int i, String str, AddressesDto addressesDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) != 0) {
            this.b = addressesDto;
        } else {
            AddressesDto.Companion.getClass();
            this.b = com.yandex.go.taxi.intercity.dashboard.api.data.entity.f.a();
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.INTERCITY_MAIN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$IntercityMain)) {
            return false;
        }
        Action$IntercityMain action$IntercityMain = (Action$IntercityMain) obj;
        return jl40.l(this.a, action$IntercityMain.a) && jl40.l(this.b, action$IntercityMain.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IntercityMain(mode=" + this.a + ", addresses=" + this.b + Extension.C_BRAKE;
    }

    public Action$IntercityMain(String str, AddressesDto addressesDto) {
        this.a = str;
        this.b = addressesDto;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Action$IntercityMain() {
        this("", com.yandex.go.taxi.intercity.dashboard.api.data.entity.f.a());
        AddressesDto.Companion.getClass();
    }
}
