package com.ybsdk.feature.divkit.api.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J@\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "Landroid/os/Parcelable;", "", "card", "palette", "templates", "hash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCard", "getPalette", "getTemplates", "getHash", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivDataDto implements Parcelable {
    public static final Parcelable.Creator<DivDataDto> CREATOR = new Creator();
    private final String card;
    private final String hash;
    private final String palette;
    private final String templates;

    public DivDataDto(@Json(name = "card") @RawJsonString String str, @Json(name = "palette") @RawJsonString String str2, @Json(name = "templates") @RawJsonString String str3, @Json(name = "hash") String str4) {
        this.card = str;
        this.palette = str2;
        this.templates = str3;
        this.hash = str4;
    }

    public static /* synthetic */ DivDataDto copy$default(DivDataDto divDataDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = divDataDto.card;
        }
        if ((i & 2) != 0) {
            str2 = divDataDto.palette;
        }
        if ((i & 4) != 0) {
            str3 = divDataDto.templates;
        }
        if ((i & 8) != 0) {
            str4 = divDataDto.hash;
        }
        return divDataDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCard() {
        return this.card;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPalette() {
        return this.palette;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTemplates() {
        return this.templates;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final DivDataDto copy(@Json(name = "card") @RawJsonString String card, @Json(name = "palette") @RawJsonString String palette, @Json(name = "templates") @RawJsonString String templates, @Json(name = "hash") String hash) {
        return new DivDataDto(card, palette, templates, hash);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivDataDto)) {
            return false;
        }
        DivDataDto divDataDto = (DivDataDto) other;
        return jl40.l(this.card, divDataDto.card) && jl40.l(this.palette, divDataDto.palette) && jl40.l(this.templates, divDataDto.templates) && jl40.l(this.hash, divDataDto.hash);
    }

    public final String getCard() {
        return this.card;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getPalette() {
        return this.palette;
    }

    public final String getTemplates() {
        return this.templates;
    }

    public int hashCode() {
        String str = this.card;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.palette;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.templates;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hash;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.card;
        String str2 = this.palette;
        return g8e.r(b64.v("DivDataDto(card=", str, ", palette=", str2, ", templates="), this.templates, ", hash=", this.hash, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.card);
        dest.writeString(this.palette);
        dest.writeString(this.templates);
        dest.writeString(this.hash);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DivDataDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DivDataDto createFromParcel(Parcel parcel) {
            return new DivDataDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DivDataDto[] newArray(int i) {
            return new DivDataDto[i];
        }
    }
}
