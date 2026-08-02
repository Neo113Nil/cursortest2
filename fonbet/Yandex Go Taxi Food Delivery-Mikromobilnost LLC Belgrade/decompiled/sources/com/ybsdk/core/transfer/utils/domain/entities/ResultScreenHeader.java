package com.ybsdk.core.transfer.utils.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.transfer.utils.domain.entities.ResultImage;
import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.e0k0;
import defpackage.jl40;
import defpackage.txg0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006&"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/utils/text/Text;", "title", "Lcom/ybsdk/core/transfer/utils/domain/entities/ResultImage;", "image", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/transfer/utils/domain/entities/ResultImage;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "()Lcom/ybsdk/core/transfer/utils/domain/entities/ResultImage;", "copy", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/transfer/utils/domain/entities/ResultImage;)Lcom/ybsdk/core/transfer/utils/domain/entities/ResultScreenHeader;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "Lcom/ybsdk/core/transfer/utils/domain/entities/ResultImage;", "getImage", "Companion", "e0k0", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ResultScreenHeader implements Parcelable {
    private final ResultImage image;
    private final Text title;
    public static final e0k0 Companion = new e0k0();
    public static final Parcelable.Creator<ResultScreenHeader> CREATOR = new Creator();

    /* renamed from: default, reason: not valid java name */
    private static final ResultScreenHeader f23default = new ResultScreenHeader(unr0.h(Text.Companion, dzh0.ybsdk_transfer_sbp_title), new ResultImage.Resource(txg0.ybsdk_ic_transfers_sbp));

    public ResultScreenHeader(Text text, ResultImage resultImage) {
        this.title = text;
        this.image = resultImage;
    }

    public static /* synthetic */ ResultScreenHeader copy$default(ResultScreenHeader resultScreenHeader, Text text, ResultImage resultImage, int i, Object obj) {
        if ((i & 1) != 0) {
            text = resultScreenHeader.title;
        }
        if ((i & 2) != 0) {
            resultImage = resultScreenHeader.image;
        }
        return resultScreenHeader.copy(text, resultImage);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ResultImage getImage() {
        return this.image;
    }

    public final ResultScreenHeader copy(Text title, ResultImage image) {
        return new ResultScreenHeader(title, image);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultScreenHeader)) {
            return false;
        }
        ResultScreenHeader resultScreenHeader = (ResultScreenHeader) other;
        return jl40.l(this.title, resultScreenHeader.title) && jl40.l(this.image, resultScreenHeader.image);
    }

    public final ResultImage getImage() {
        return this.image;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        Text text = this.title;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        ResultImage resultImage = this.image;
        return hashCode + (resultImage != null ? resultImage.hashCode() : 0);
    }

    public String toString() {
        return "ResultScreenHeader(title=" + this.title + ", image=" + this.image + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.image, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResultScreenHeader> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultScreenHeader createFromParcel(Parcel parcel) {
            return new ResultScreenHeader((Text) parcel.readParcelable(ResultScreenHeader.class.getClassLoader()), (ResultImage) parcel.readParcelable(ResultScreenHeader.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultScreenHeader[] newArray(int i) {
            return new ResultScreenHeader[i];
        }
    }
}
