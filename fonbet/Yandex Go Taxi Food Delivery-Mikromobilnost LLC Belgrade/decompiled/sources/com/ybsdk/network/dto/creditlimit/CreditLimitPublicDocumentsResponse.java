package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPublicDocumentsResponse;", "", "html", "", "urls", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getHtml", "()Ljava/lang/String;", "getUrls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPublicDocumentsResponse {
    private final String html;
    private final List<String> urls;

    public CreditLimitPublicDocumentsResponse(@Json(name = "html") String str, @Json(name = "urls") List<String> list) {
        this.html = str;
        this.urls = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditLimitPublicDocumentsResponse copy$default(CreditLimitPublicDocumentsResponse creditLimitPublicDocumentsResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitPublicDocumentsResponse.html;
        }
        if ((i & 2) != 0) {
            list = creditLimitPublicDocumentsResponse.urls;
        }
        return creditLimitPublicDocumentsResponse.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    public final List<String> component2() {
        return this.urls;
    }

    public final CreditLimitPublicDocumentsResponse copy(@Json(name = "html") String html, @Json(name = "urls") List<String> urls) {
        return new CreditLimitPublicDocumentsResponse(html, urls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPublicDocumentsResponse)) {
            return false;
        }
        CreditLimitPublicDocumentsResponse creditLimitPublicDocumentsResponse = (CreditLimitPublicDocumentsResponse) other;
        return jl40.l(this.html, creditLimitPublicDocumentsResponse.html) && jl40.l(this.urls, creditLimitPublicDocumentsResponse.urls);
    }

    public final String getHtml() {
        return this.html;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return this.urls.hashCode() + (this.html.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("CreditLimitPublicDocumentsResponse(html=", this.html, ", urls=", Extension.C_BRAKE, this.urls);
    }
}
