package com.ybsdk.core.utils.dto.common;

import defpackage.b64;
import defpackage.ct11;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.mzz0;
import defpackage.wx21;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/utils/dto/common/FailDataException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lmzz0;", "", "error", "Ljava/lang/String;", "b", "()Ljava/lang/String;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "a", "Lwx21;", "icon", "Lwx21;", "c", "()Lwx21;", "supportUrl", "f", "techInfo", "g", "traceId", "getTraceId", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FailDataException extends Exception implements mzz0 {
    private final String description;
    private final String error;
    private final wx21 icon;
    private final String supportUrl;
    private final String techInfo;
    private final String traceId;

    public FailDataException(ct11 ct11Var) {
        this(ct11Var.getError(), ct11Var.getDescription(), ct11Var.getIcon(), ct11Var.a(), ct11Var.b(), ct11Var.getTraceId());
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final wx21 getIcon() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailDataException)) {
            return false;
        }
        FailDataException failDataException = (FailDataException) obj;
        return jl40.l(this.error, failDataException.error) && jl40.l(this.description, failDataException.description) && jl40.l(this.icon, failDataException.icon) && jl40.l(this.supportUrl, failDataException.supportUrl) && jl40.l(this.techInfo, failDataException.techInfo) && jl40.l(this.traceId, failDataException.traceId);
    }

    /* renamed from: f, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: g, reason: from getter */
    public final String getTechInfo() {
        return this.techInfo;
    }

    @Override // defpackage.mzz0
    public final String getTraceId() {
        return this.traceId;
    }

    public final int hashCode() {
        int hashCode = this.error.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        wx21 wx21Var = this.icon;
        int hashCode3 = (hashCode2 + (wx21Var == null ? 0 : wx21Var.hashCode())) * 31;
        String str2 = this.supportUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.techInfo;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.traceId;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = this.error;
        String str2 = this.description;
        wx21 wx21Var = this.icon;
        String str3 = this.supportUrl;
        String str4 = this.techInfo;
        String str5 = this.traceId;
        StringBuilder v = b64.v("FailDataException(error=", str, ", description=", str2, ", icon=");
        v.append(wx21Var);
        v.append(", supportUrl=");
        v.append(str3);
        v.append(", techInfo=");
        return g8e.r(v, str4, ", traceId=", str5, Extension.C_BRAKE);
    }

    public FailDataException(String str, String str2, wx21 wx21Var, String str3, String str4, String str5) {
        super(str);
        this.error = str;
        this.description = str2;
        this.icon = wx21Var;
        this.supportUrl = str3;
        this.techInfo = str4;
        this.traceId = str5;
    }

    public /* synthetic */ FailDataException(String str, String str2, String str3, String str4, int i, String str5) {
        this(str, (i & 2) != 0 ? null : str2, (wx21) null, str3, (i & 16) != 0 ? null : str4, str5);
    }
}
