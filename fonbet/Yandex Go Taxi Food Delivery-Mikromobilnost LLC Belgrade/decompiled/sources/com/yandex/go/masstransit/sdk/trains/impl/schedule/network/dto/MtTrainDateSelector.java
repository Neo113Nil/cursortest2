package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelectorDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelector;", "", "Companion", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainDateSelector {
    public static final b Companion = new b();
    public static final MtTrainDateSelector f = new MtTrainDateSelector(0);
    public final MtTrainDateSelectorDto.DatePicker a;
    public final String b;
    public final MtTrainFilterState c;
    public final MtTrainFilterState d;
    public final String e;

    public MtTrainDateSelector(int i, MtTrainDateSelectorDto.DatePicker datePicker, String str, MtTrainFilterState mtTrainFilterState, MtTrainFilterState mtTrainFilterState2, String str2) {
        this.a = (i & 1) == 0 ? new MtTrainDateSelectorDto.DatePicker(0) : datePicker;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        int i2 = i & 4;
        MtTrainFilterState mtTrainFilterState3 = MtTrainFilterState.d;
        if (i2 == 0) {
            MtTrainFilterState.Companion.getClass();
            this.c = mtTrainFilterState3;
        } else {
            this.c = mtTrainFilterState;
        }
        if ((i & 8) == 0) {
            MtTrainFilterState.Companion.getClass();
            this.d = mtTrainFilterState3;
        } else {
            this.d = mtTrainFilterState2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainDateSelector)) {
            return false;
        }
        MtTrainDateSelector mtTrainDateSelector = (MtTrainDateSelector) obj;
        return jl40.l(this.a, mtTrainDateSelector.a) && jl40.l(this.b, mtTrainDateSelector.b) && jl40.l(this.c, mtTrainDateSelector.c) && jl40.l(this.d, mtTrainDateSelector.d) && jl40.l(this.e, mtTrainDateSelector.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTrainDateSelector(datePicker=");
        sb.append(this.a);
        sb.append(", selectedDate=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", selectedState=");
        sb.append(this.d);
        sb.append(", icon=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public MtTrainDateSelector() {
        this(0);
    }

    public MtTrainDateSelector(int i) {
        MtTrainDateSelectorDto.DatePicker datePicker = new MtTrainDateSelectorDto.DatePicker(0);
        m mVar = MtTrainFilterState.Companion;
        mVar.getClass();
        mVar.getClass();
        this.a = datePicker;
        this.b = "";
        MtTrainFilterState mtTrainFilterState = MtTrainFilterState.d;
        this.c = mtTrainFilterState;
        this.d = mtTrainFilterState;
        this.e = null;
    }
}
