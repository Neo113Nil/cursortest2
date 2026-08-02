package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionErrorResponse;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionErrorResponse {
    private final int code;
    private final String description;
    private final String title;

    public TransactionErrorResponse(@Json(name = "code") int i, @Json(name = "title") String str, @Json(name = "description") String str2) {
        this.code = i;
        this.title = str;
        this.description = str2;
    }

    public static /* synthetic */ TransactionErrorResponse copy$default(TransactionErrorResponse transactionErrorResponse, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transactionErrorResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = transactionErrorResponse.title;
        }
        if ((i2 & 4) != 0) {
            str2 = transactionErrorResponse.description;
        }
        return transactionErrorResponse.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final TransactionErrorResponse copy(@Json(name = "code") int code, @Json(name = "title") String title, @Json(name = "description") String description) {
        return new TransactionErrorResponse(code, title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionErrorResponse)) {
            return false;
        }
        TransactionErrorResponse transactionErrorResponse = (TransactionErrorResponse) other;
        return this.code == transactionErrorResponse.code && jl40.l(this.title, transactionErrorResponse.title) && jl40.l(this.description, transactionErrorResponse.description);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + unr0.b(Integer.hashCode(this.code) * 31, 31, this.title);
    }

    public String toString() {
        int i = this.code;
        String str = this.title;
        return oyr.t(unr0.v(i, "TransactionErrorResponse(code=", ", title=", str, ", description="), this.description, Extension.C_BRAKE);
    }
}
