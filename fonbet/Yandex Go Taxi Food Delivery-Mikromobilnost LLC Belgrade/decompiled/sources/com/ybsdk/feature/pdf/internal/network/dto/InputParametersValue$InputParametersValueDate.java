package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.l0w;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n¨\u0006\u001f"}, d2 = {"com/ybsdk/feature/pdf/internal/network/dto/InputParametersValue$InputParametersValueDate", "Ll0w;", "", "name", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "type", "value", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "component3", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValue$InputParametersValueDate;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;Ljava/lang/String;)Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValue$InputParametersValueDate;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "getType", "getValue", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class InputParametersValue$InputParametersValueDate implements l0w {
    private final String name;
    private final InputParameterType type;
    private final String value;

    public InputParametersValue$InputParametersValueDate(@Json(name = "name") String str, @Json(name = "type") InputParameterType inputParameterType, @Json(name = "value") String str2) {
        this.name = str;
        this.type = inputParameterType;
        this.value = str2;
    }

    public static /* synthetic */ InputParametersValue$InputParametersValueDate copy$default(InputParametersValue$InputParametersValueDate inputParametersValue$InputParametersValueDate, String str, InputParameterType inputParameterType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputParametersValue$InputParametersValueDate.name;
        }
        if ((i & 2) != 0) {
            inputParameterType = inputParametersValue$InputParametersValueDate.type;
        }
        if ((i & 4) != 0) {
            str2 = inputParametersValue$InputParametersValueDate.value;
        }
        return inputParametersValue$InputParametersValueDate.copy(str, inputParameterType, str2);
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
    public final String getValue() {
        return this.value;
    }

    public final InputParametersValue$InputParametersValueDate copy(@Json(name = "name") String name, @Json(name = "type") InputParameterType type, @Json(name = "value") String value) {
        return new InputParametersValue$InputParametersValueDate(name, type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputParametersValue$InputParametersValueDate)) {
            return false;
        }
        InputParametersValue$InputParametersValueDate inputParametersValue$InputParametersValueDate = (InputParametersValue$InputParametersValueDate) other;
        return jl40.l(this.name, inputParametersValue$InputParametersValueDate.name) && this.type == inputParametersValue$InputParametersValueDate.type && jl40.l(this.value, inputParametersValue$InputParametersValueDate.value);
    }

    public final String getName() {
        return this.name;
    }

    public final InputParameterType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.type.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.name;
        InputParameterType inputParameterType = this.type;
        String str2 = this.value;
        StringBuilder sb = new StringBuilder("InputParametersValueDate(name=");
        sb.append(str);
        sb.append(", type=");
        sb.append(inputParameterType);
        sb.append(", value=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
