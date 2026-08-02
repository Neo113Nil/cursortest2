package com.yandex.go.taxi.order.models.api.response;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/StateInfo;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/s7", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StateInfo {
    public static final s7 Companion = new s7();
    public static final StateInfo h = new StateInfo(0);
    public final String a;
    public final StateInfoTimer b;
    public final String c;
    public final String d;
    public final String e;
    public final StateInfoTranslations f;
    public final Number g;

    public /* synthetic */ StateInfo(int i, String str, StateInfoTimer stateInfoTimer, String str2, String str3, String str4, StateInfoTranslations stateInfoTranslations, Number number) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new StateInfoTimer(0);
        } else {
            this.b = stateInfoTimer;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = stateInfoTranslations;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = number;
        }
    }

    /* renamed from: a, reason: from getter */
    public final StateInfoTranslations getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateInfo)) {
            return false;
        }
        StateInfo stateInfo = (StateInfo) obj;
        return jl40.l(this.a, stateInfo.a) && jl40.l(this.b, stateInfo.b) && jl40.l(this.c, stateInfo.c) && jl40.l(this.d, stateInfo.d) && jl40.l(this.e, stateInfo.e) && jl40.l(this.f, stateInfo.f) && jl40.l(this.g, stateInfo.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StateInfoTranslations stateInfoTranslations = this.f;
        return this.g.hashCode() + ((hashCode4 + (stateInfoTranslations != null ? stateInfoTranslations.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StateInfo(freeWaitingUntil=");
        sb.append(this.a);
        sb.append(", timer=");
        sb.append(this.b);
        sb.append(", titleColor=");
        g8e.D(sb, this.c, ", subtitleColor=", this.d, ", prepaidTimeEndAt=");
        sb.append(this.e);
        sb.append(", infoTranslations=");
        sb.append(this.f);
        sb.append(", waitingPrice=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public StateInfo() {
        this(0);
    }

    public StateInfo(int i) {
        StateInfoTimer stateInfoTimer = new StateInfoTimer(0);
        this.a = "";
        this.b = stateInfoTimer;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0;
    }
}
