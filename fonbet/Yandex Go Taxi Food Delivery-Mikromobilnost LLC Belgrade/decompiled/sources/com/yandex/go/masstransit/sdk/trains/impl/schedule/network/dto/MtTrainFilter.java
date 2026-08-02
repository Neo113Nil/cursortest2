package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainFilter;", "", "Companion", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/k", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainFilter {
    public static final k Companion = new k();
    public final String a;
    public final String b;
    public final String c;
    public final MtTrainFilterState d;
    public final MtTrainFilterState e;
    public final l f;

    static {
        new MtTrainFilter(0);
    }

    public MtTrainFilter(int i, String str, String str2, String str3, MtTrainFilterState mtTrainFilterState, MtTrainFilterState mtTrainFilterState2, l lVar) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        int i2 = i & 8;
        MtTrainFilterState mtTrainFilterState3 = MtTrainFilterState.d;
        if (i2 == 0) {
            MtTrainFilterState.Companion.getClass();
            this.d = mtTrainFilterState3;
        } else {
            this.d = mtTrainFilterState;
        }
        if ((i & 16) == 0) {
            MtTrainFilterState.Companion.getClass();
            this.e = mtTrainFilterState3;
        } else {
            this.e = mtTrainFilterState2;
        }
        if ((i & 32) == 0) {
            this.f = a.INSTANCE;
        } else {
            this.f = lVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainFilter)) {
            return false;
        }
        MtTrainFilter mtTrainFilter = (MtTrainFilter) obj;
        return jl40.l(this.a, mtTrainFilter.a) && jl40.l(this.b, mtTrainFilter.b) && jl40.l(this.c, mtTrainFilter.c) && jl40.l(this.d, mtTrainFilter.d) && jl40.l(this.e, mtTrainFilter.e) && jl40.l(this.f, mtTrainFilter.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainFilter(id=", this.a, ", icon=", this.b, ", title=");
        v.append(this.c);
        v.append(", state=");
        v.append(this.d);
        v.append(", selectedState=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public MtTrainFilter() {
        this(0);
    }

    public MtTrainFilter(int i) {
        m mVar = MtTrainFilterState.Companion;
        mVar.getClass();
        mVar.getClass();
        a aVar = a.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = "";
        MtTrainFilterState mtTrainFilterState = MtTrainFilterState.d;
        this.d = mtTrainFilterState;
        this.e = mtTrainFilterState;
        this.f = aVar;
    }
}
