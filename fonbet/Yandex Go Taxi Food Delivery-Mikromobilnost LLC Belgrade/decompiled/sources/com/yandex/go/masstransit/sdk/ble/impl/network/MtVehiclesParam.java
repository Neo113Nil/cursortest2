package com.yandex.go.masstransit.sdk.ble.impl.network;

import defpackage.ah40;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xvz;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/impl/network/MtVehiclesParam;", "", "Companion", "BleInfo", "$serializer", "com/yandex/go/masstransit/sdk/ble/impl/network/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtVehiclesParam {
    public static final d Companion = new d();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(5)), null, null};
    public final List a;
    public final String b;
    public final zzs c;

    public /* synthetic */ MtVehiclesParam(int i, zzs zzsVar, String str, List list) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtVehiclesParam)) {
            return false;
        }
        MtVehiclesParam mtVehiclesParam = (MtVehiclesParam) obj;
        return jl40.l(this.a, mtVehiclesParam.a) && jl40.l(this.b, mtVehiclesParam.b) && jl40.l(this.c, mtVehiclesParam.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        zzs zzsVar = this.c;
        return hashCode2 + (zzsVar != null ? zzsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = xvz.s("MtVehiclesParam(ble=", this.a, ", zoneName=", this.b, ", location=");
        s.append(this.c);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/impl/network/MtVehiclesParam$BleInfo;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/ble/impl/network/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BleInfo {
        public static final c Companion = new c();
        public final String a;
        public final int b;
        public final int c;

        public /* synthetic */ BleInfo(int i, int i2, int i3, String str) {
            this.a = (i & 1) == 0 ? "" : str;
            this.b = (i & 2) == 0 ? 0 : i2;
            if ((i & 4) == 0) {
                this.c = 999;
            } else {
                this.c = i3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BleInfo)) {
                return false;
            }
            BleInfo bleInfo = (BleInfo) obj;
            return jl40.l(this.a, bleInfo.a) && this.b == bleInfo.b && this.c == bleInfo.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "BleInfo(uuid=", this.a, ", major=", ", minor="));
        }

        public BleInfo(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public BleInfo() {
            this("", 0, 999);
        }
    }

    public MtVehiclesParam() {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
    }
}
