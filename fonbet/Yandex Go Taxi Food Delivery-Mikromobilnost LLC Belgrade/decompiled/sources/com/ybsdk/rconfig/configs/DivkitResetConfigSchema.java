package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/DivkitResetConfigSchema;", "", "", "", "logIdsRegexesToResetLocalVariables", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/ybsdk/rconfig/configs/DivkitResetConfigSchema;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLogIdsRegexesToResetLocalVariables", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DivkitResetConfigSchema {

    @Json(name = "log_ids_regexes_to_reset_local_variables")
    private final List<String> logIdsRegexesToResetLocalVariables;

    public DivkitResetConfigSchema(List<String> list) {
        this.logIdsRegexesToResetLocalVariables = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivkitResetConfigSchema copy$default(DivkitResetConfigSchema divkitResetConfigSchema, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = divkitResetConfigSchema.logIdsRegexesToResetLocalVariables;
        }
        return divkitResetConfigSchema.copy(list);
    }

    public final List<String> component1() {
        return this.logIdsRegexesToResetLocalVariables;
    }

    public final DivkitResetConfigSchema copy(List<String> logIdsRegexesToResetLocalVariables) {
        return new DivkitResetConfigSchema(logIdsRegexesToResetLocalVariables);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DivkitResetConfigSchema) && jl40.l(this.logIdsRegexesToResetLocalVariables, ((DivkitResetConfigSchema) other).logIdsRegexesToResetLocalVariables);
    }

    public final List<String> getLogIdsRegexesToResetLocalVariables() {
        return this.logIdsRegexesToResetLocalVariables;
    }

    public int hashCode() {
        return this.logIdsRegexesToResetLocalVariables.hashCode();
    }

    public String toString() {
        return tse0.k("DivkitResetConfigSchema(logIdsRegexesToResetLocalVariables=", Extension.C_BRAKE, this.logIdsRegexesToResetLocalVariables);
    }
}
