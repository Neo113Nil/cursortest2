package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u001e\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJj\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\fR&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\fR(\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPaymentScreenGradients;", "", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "", "plus", "pro", "split", "corpcard", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "component1", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component2", "component3", "component4", "copy", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)Lcom/ybsdk/rconfig/configs/NfcPaymentScreenGradients;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getPlus", "getPro", "getSplit", "getCorpcard", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcPaymentScreenGradients {

    @Json(name = "corp_card")
    private final ThemedParameter<List<String>> corpcard;

    @Json(name = "plus")
    private final ThemedParameter<List<String>> plus;

    @Json(name = "pro")
    private final ThemedParameter<List<String>> pro;

    @Json(name = "split")
    private final ThemedParameter<List<String>> split;

    public NfcPaymentScreenGradients(ThemedParameter<List<String>> themedParameter, ThemedParameter<List<String>> themedParameter2, ThemedParameter<List<String>> themedParameter3, ThemedParameter<List<String>> themedParameter4) {
        this.plus = themedParameter;
        this.pro = themedParameter2;
        this.split = themedParameter3;
        this.corpcard = themedParameter4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcPaymentScreenGradients copy$default(NfcPaymentScreenGradients nfcPaymentScreenGradients, ThemedParameter themedParameter, ThemedParameter themedParameter2, ThemedParameter themedParameter3, ThemedParameter themedParameter4, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = nfcPaymentScreenGradients.plus;
        }
        if ((i & 2) != 0) {
            themedParameter2 = nfcPaymentScreenGradients.pro;
        }
        if ((i & 4) != 0) {
            themedParameter3 = nfcPaymentScreenGradients.split;
        }
        if ((i & 8) != 0) {
            themedParameter4 = nfcPaymentScreenGradients.corpcard;
        }
        return nfcPaymentScreenGradients.copy(themedParameter, themedParameter2, themedParameter3, themedParameter4);
    }

    public final ThemedParameter<List<String>> component1() {
        return this.plus;
    }

    public final ThemedParameter<List<String>> component2() {
        return this.pro;
    }

    public final ThemedParameter<List<String>> component3() {
        return this.split;
    }

    public final ThemedParameter<List<String>> component4() {
        return this.corpcard;
    }

    public final NfcPaymentScreenGradients copy(ThemedParameter<List<String>> plus, ThemedParameter<List<String>> pro, ThemedParameter<List<String>> split, ThemedParameter<List<String>> corpcard) {
        return new NfcPaymentScreenGradients(plus, pro, split, corpcard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPaymentScreenGradients)) {
            return false;
        }
        NfcPaymentScreenGradients nfcPaymentScreenGradients = (NfcPaymentScreenGradients) other;
        return jl40.l(this.plus, nfcPaymentScreenGradients.plus) && jl40.l(this.pro, nfcPaymentScreenGradients.pro) && jl40.l(this.split, nfcPaymentScreenGradients.split) && jl40.l(this.corpcard, nfcPaymentScreenGradients.corpcard);
    }

    public final ThemedParameter<List<String>> getCorpcard() {
        return this.corpcard;
    }

    public final ThemedParameter<List<String>> getPlus() {
        return this.plus;
    }

    public final ThemedParameter<List<String>> getPro() {
        return this.pro;
    }

    public final ThemedParameter<List<String>> getSplit() {
        return this.split;
    }

    public int hashCode() {
        int d = tse0.d(this.split, tse0.d(this.pro, this.plus.hashCode() * 31, 31), 31);
        ThemedParameter<List<String>> themedParameter = this.corpcard;
        return d + (themedParameter == null ? 0 : themedParameter.hashCode());
    }

    public String toString() {
        return "NfcPaymentScreenGradients(plus=" + this.plus + ", pro=" + this.pro + ", split=" + this.split + ", corpcard=" + this.corpcard + Extension.C_BRAKE;
    }
}
