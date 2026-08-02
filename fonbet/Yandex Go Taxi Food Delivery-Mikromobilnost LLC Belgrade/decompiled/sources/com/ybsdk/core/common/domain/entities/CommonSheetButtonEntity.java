package com.ybsdk.core.common.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/core/common/domain/entities/CommonSheetButtonEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/utils/text/Text;", "text", "", Constants.DEEPLINK, "<init>", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;)Lcom/ybsdk/core/common/domain/entities/CommonSheetButtonEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getText", "Ljava/lang/String;", "getDeeplink", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommonSheetButtonEntity implements Parcelable {
    public static final Parcelable.Creator<CommonSheetButtonEntity> CREATOR = new Creator();
    private final String deeplink;
    private final Text text;

    public CommonSheetButtonEntity(Text text, String str) {
        this.text = text;
        this.deeplink = str;
    }

    public static /* synthetic */ CommonSheetButtonEntity copy$default(CommonSheetButtonEntity commonSheetButtonEntity, Text text, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            text = commonSheetButtonEntity.text;
        }
        if ((i & 2) != 0) {
            str = commonSheetButtonEntity.deeplink;
        }
        return commonSheetButtonEntity.copy(text, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final CommonSheetButtonEntity copy(Text text, String deeplink) {
        return new CommonSheetButtonEntity(text, deeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSheetButtonEntity)) {
            return false;
        }
        CommonSheetButtonEntity commonSheetButtonEntity = (CommonSheetButtonEntity) other;
        return jl40.l(this.text, commonSheetButtonEntity.text) && jl40.l(this.deeplink, commonSheetButtonEntity.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Text getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.deeplink;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CommonSheetButtonEntity(text=" + this.text + ", deeplink=" + this.deeplink + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.text, flags);
        dest.writeString(this.deeplink);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonSheetButtonEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonSheetButtonEntity createFromParcel(Parcel parcel) {
            return new CommonSheetButtonEntity((Text) parcel.readParcelable(CommonSheetButtonEntity.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonSheetButtonEntity[] newArray(int i) {
            return new CommonSheetButtonEntity[i];
        }
    }
}
