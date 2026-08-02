package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.qjk0;
import defpackage.xuc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$ComboCompanion", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Lqjk0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/s4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$ComboCompanion extends a7 implements qjk0 {
    public static final s4 Companion = new s4();
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final n7v e;
    public final xuc f;
    public final RideCardTimerDto g;

    public RideCardItemDto$ComboCompanion(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, n7v n7vVar, xuc xucVar, RideCardTimerDto rideCardTimerDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = n7vVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = xucVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = rideCardTimerDto;
        }
    }

    @Override // defpackage.qjk0
    /* renamed from: d, reason: from getter */
    public final RideCardTimerDto getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$ComboCompanion)) {
            return false;
        }
        RideCardItemDto$ComboCompanion rideCardItemDto$ComboCompanion = (RideCardItemDto$ComboCompanion) obj;
        return jl40.l(this.a, rideCardItemDto$ComboCompanion.a) && jl40.l(this.b, rideCardItemDto$ComboCompanion.b) && jl40.l(this.c, rideCardItemDto$ComboCompanion.c) && jl40.l(this.d, rideCardItemDto$ComboCompanion.d) && jl40.l(this.e, rideCardItemDto$ComboCompanion.e) && jl40.l(this.f, rideCardItemDto$ComboCompanion.f) && jl40.l(this.g, rideCardItemDto$ComboCompanion.g);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FormattedText formattedText = this.c;
        int hashCode3 = (hashCode2 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.d;
        int hashCode4 = (hashCode3 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        n7v n7vVar = this.e;
        int hashCode5 = (hashCode4 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        xuc xucVar = this.f;
        int hashCode6 = (hashCode5 + (xucVar == null ? 0 : xucVar.hashCode())) * 31;
        RideCardTimerDto rideCardTimerDto = this.g;
        return hashCode6 + (rideCardTimerDto != null ? rideCardTimerDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ComboCompanion(id=", this.a, ", analyticsId=", this.b, ", title=");
        defpackage.n.C(v, this.c, ", subtitle=", this.d, ", image=");
        v.append(this.e);
        v.append(", lottieAnimation=");
        v.append(this.f);
        v.append(", timer=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$ComboCompanion() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
