package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/rconfig/CommonExperiment;", "T", "", Constants.KEY_DATA, "applyType", "Lcom/ybsdk/rconfig/ExperimentApplyType;", "<init>", "(Ljava/lang/Object;Lcom/ybsdk/rconfig/ExperimentApplyType;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getApplyType", "()Lcom/ybsdk/rconfig/ExperimentApplyType;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/ybsdk/rconfig/ExperimentApplyType;)Lcom/ybsdk/rconfig/CommonExperiment;", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CommonExperiment<T> {

    @Json(name = "type")
    private final ExperimentApplyType applyType;

    @Json(name = Constants.KEY_DATA)
    private final T data;

    public CommonExperiment(T t, ExperimentApplyType experimentApplyType) {
        this.data = t;
        this.applyType = experimentApplyType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonExperiment copy$default(CommonExperiment commonExperiment, Object obj, ExperimentApplyType experimentApplyType, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = commonExperiment.data;
        }
        if ((i & 2) != 0) {
            experimentApplyType = commonExperiment.applyType;
        }
        return commonExperiment.copy(obj, experimentApplyType);
    }

    public final T component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final ExperimentApplyType getApplyType() {
        return this.applyType;
    }

    public final CommonExperiment<T> copy(T data, ExperimentApplyType applyType) {
        return new CommonExperiment<>(data, applyType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonExperiment)) {
            return false;
        }
        CommonExperiment commonExperiment = (CommonExperiment) other;
        return jl40.l(this.data, commonExperiment.data) && this.applyType == commonExperiment.applyType;
    }

    public final ExperimentApplyType getApplyType() {
        return this.applyType;
    }

    public final T getData() {
        return this.data;
    }

    public int hashCode() {
        T t = this.data;
        return this.applyType.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public String toString() {
        return "CommonExperiment(data=" + this.data + ", applyType=" + this.applyType + Extension.C_BRAKE;
    }
}
