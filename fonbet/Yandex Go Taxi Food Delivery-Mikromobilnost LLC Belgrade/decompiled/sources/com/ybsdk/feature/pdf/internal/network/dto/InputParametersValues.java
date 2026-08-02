package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.l0w;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValues;", "", "", "Ll0w;", "values", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValues;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getValues", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputParametersValues {
    private final List<l0w> values;

    /* JADX WARN: Multi-variable type inference failed */
    public InputParametersValues(@Json(name = "values") List<? extends l0w> list) {
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputParametersValues copy$default(InputParametersValues inputParametersValues, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inputParametersValues.values;
        }
        return inputParametersValues.copy(list);
    }

    public final List<l0w> component1() {
        return this.values;
    }

    public final InputParametersValues copy(@Json(name = "values") List<? extends l0w> values) {
        return new InputParametersValues(values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InputParametersValues) && jl40.l(this.values, ((InputParametersValues) other).values);
    }

    public final List<l0w> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return tse0.k("InputParametersValues(values=", Extension.C_BRAKE, this.values);
    }
}
