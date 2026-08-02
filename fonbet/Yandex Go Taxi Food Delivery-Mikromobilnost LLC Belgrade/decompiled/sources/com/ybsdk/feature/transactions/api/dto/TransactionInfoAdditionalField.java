package com.ybsdk.feature.transactions.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transactions/api/dto/TransactionInfoAdditionalField;", "", "name", "", "value", "image", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getName", "()Ljava/lang/String;", "getValue", "getImage$annotations", "()V", "getImage", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionInfoAdditionalField {
    private final String image;
    private final String name;
    private final Themes<String> themedImage;
    private final String value;

    public TransactionInfoAdditionalField(@Json(name = "name") String str, @Json(name = "value") String str2, @Json(name = "image") String str3, @Json(name = "themed_image") Themes<String> themes) {
        this.name = str;
        this.value = str2;
        this.image = str3;
        this.themedImage = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionInfoAdditionalField copy$default(TransactionInfoAdditionalField transactionInfoAdditionalField, String str, String str2, String str3, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionInfoAdditionalField.name;
        }
        if ((i & 2) != 0) {
            str2 = transactionInfoAdditionalField.value;
        }
        if ((i & 4) != 0) {
            str3 = transactionInfoAdditionalField.image;
        }
        if ((i & 8) != 0) {
            themes = transactionInfoAdditionalField.themedImage;
        }
        return transactionInfoAdditionalField.copy(str, str2, str3, themes);
    }

    @jxi
    public static /* synthetic */ void getImage$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final Themes<String> component4() {
        return this.themedImage;
    }

    public final TransactionInfoAdditionalField copy(@Json(name = "name") String name, @Json(name = "value") String value, @Json(name = "image") String image, @Json(name = "themed_image") Themes<String> themedImage) {
        return new TransactionInfoAdditionalField(name, value, image, themedImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionInfoAdditionalField)) {
            return false;
        }
        TransactionInfoAdditionalField transactionInfoAdditionalField = (TransactionInfoAdditionalField) other;
        return jl40.l(this.name, transactionInfoAdditionalField.name) && jl40.l(this.value, transactionInfoAdditionalField.value) && jl40.l(this.image, transactionInfoAdditionalField.image) && jl40.l(this.themedImage, transactionInfoAdditionalField.themedImage);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.value);
        String str2 = this.image;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Themes<String> themes = this.themedImage;
        return hashCode + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.value;
        String str3 = this.image;
        Themes<String> themes = this.themedImage;
        StringBuilder v = b64.v("TransactionInfoAdditionalField(name=", str, ", value=", str2, ", image=");
        v.append(str3);
        v.append(", themedImage=");
        v.append(themes);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
