package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.l0w;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"com/ybsdk/feature/pdf/internal/network/dto/InputParametersValue$InputParametersValueDateRange", "Ll0w;", "", "name", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "type", "valueFrom", "valueTo", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "component3", "component4", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValue$InputParametersValueDateRange;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValue$InputParametersValueDateRange;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "getType", "getValueFrom", "getValueTo", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class InputParametersValue$InputParametersValueDateRange implements l0w {
    private final String name;
    private final InputParameterType type;
    private final String valueFrom;
    private final String valueTo;

    public InputParametersValue$InputParametersValueDateRange(@Json(name = "name") String str, @Json(name = "type") InputParameterType inputParameterType, @Json(name = "valueFrom") String str2, @Json(name = "valueTo") String str3) {
        this.name = str;
        this.type = inputParameterType;
        this.valueFrom = str2;
        this.valueTo = str3;
    }

    public static /* synthetic */ InputParametersValue$InputParametersValueDateRange copy$default(InputParametersValue$InputParametersValueDateRange inputParametersValue$InputParametersValueDateRange, String str, InputParameterType inputParameterType, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputParametersValue$InputParametersValueDateRange.name;
        }
        if ((i & 2) != 0) {
            inputParameterType = inputParametersValue$InputParametersValueDateRange.type;
        }
        if ((i & 4) != 0) {
            str2 = inputParametersValue$InputParametersValueDateRange.valueFrom;
        }
        if ((i & 8) != 0) {
            str3 = inputParametersValue$InputParametersValueDateRange.valueTo;
        }
        return inputParametersValue$InputParametersValueDateRange.copy(str, inputParameterType, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final InputParameterType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValueFrom() {
        return this.valueFrom;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValueTo() {
        return this.valueTo;
    }

    public final InputParametersValue$InputParametersValueDateRange copy(@Json(name = "name") String name, @Json(name = "type") InputParameterType type, @Json(name = "valueFrom") String valueFrom, @Json(name = "valueTo") String valueTo) {
        return new InputParametersValue$InputParametersValueDateRange(name, type, valueFrom, valueTo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputParametersValue$InputParametersValueDateRange)) {
            return false;
        }
        InputParametersValue$InputParametersValueDateRange inputParametersValue$InputParametersValueDateRange = (InputParametersValue$InputParametersValueDateRange) other;
        return jl40.l(this.name, inputParametersValue$InputParametersValueDateRange.name) && this.type == inputParametersValue$InputParametersValueDateRange.type && jl40.l(this.valueFrom, inputParametersValue$InputParametersValueDateRange.valueFrom) && jl40.l(this.valueTo, inputParametersValue$InputParametersValueDateRange.valueTo);
    }

    public final String getName() {
        return this.name;
    }

    public final InputParameterType getType() {
        return this.type;
    }

    public final String getValueFrom() {
        return this.valueFrom;
    }

    public final String getValueTo() {
        return this.valueTo;
    }

    public int hashCode() {
        int b = unr0.b((this.type.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.valueFrom);
        String str = this.valueTo;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.name;
        InputParameterType inputParameterType = this.type;
        String str2 = this.valueFrom;
        String str3 = this.valueTo;
        StringBuilder sb = new StringBuilder("InputParametersValueDateRange(name=");
        sb.append(str);
        sb.append(", type=");
        sb.append(inputParameterType);
        sb.append(", valueFrom=");
        return g8e.r(sb, str2, ", valueTo=", str3, Extension.C_BRAKE);
    }

    public /* synthetic */ InputParametersValue$InputParametersValueDateRange(String str, InputParameterType inputParameterType, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, inputParameterType, str2, (i & 8) != 0 ? null : str3);
    }
}
