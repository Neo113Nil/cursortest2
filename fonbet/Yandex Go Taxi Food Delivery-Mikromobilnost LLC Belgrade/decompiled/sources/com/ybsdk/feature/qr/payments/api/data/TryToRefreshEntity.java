package com.ybsdk.feature.qr.payments.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.n;
import defpackage.xvz;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b$\u0010\u0015J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001e¨\u00064"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/utils/text/Text;", Constants.KEY_MESSAGE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "themedImage", "Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header;", "header", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "button", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "component3", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component4", "()Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header;", "component5", "()Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "copy", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;)Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getMessage", "getDescription", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getThemedImage", "Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header;", "getHeader", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "getButton", "Header", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TryToRefreshEntity implements Parcelable {
    public static final Parcelable.Creator<TryToRefreshEntity> CREATOR = new Creator();
    private final ActionButtonEntity button;
    private final Text description;
    private final Header header;
    private final Text message;
    private final ThemedImageUrlEntity themedImage;

    public TryToRefreshEntity(Text text, Text text2, ThemedImageUrlEntity themedImageUrlEntity, Header header, ActionButtonEntity actionButtonEntity) {
        this.message = text;
        this.description = text2;
        this.themedImage = themedImageUrlEntity;
        this.header = header;
        this.button = actionButtonEntity;
    }

    public static /* synthetic */ TryToRefreshEntity copy$default(TryToRefreshEntity tryToRefreshEntity, Text text, Text text2, ThemedImageUrlEntity themedImageUrlEntity, Header header, ActionButtonEntity actionButtonEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            text = tryToRefreshEntity.message;
        }
        if ((i & 2) != 0) {
            text2 = tryToRefreshEntity.description;
        }
        if ((i & 4) != 0) {
            themedImageUrlEntity = tryToRefreshEntity.themedImage;
        }
        if ((i & 8) != 0) {
            header = tryToRefreshEntity.header;
        }
        if ((i & 16) != 0) {
            actionButtonEntity = tryToRefreshEntity.button;
        }
        ActionButtonEntity actionButtonEntity2 = actionButtonEntity;
        ThemedImageUrlEntity themedImageUrlEntity2 = themedImageUrlEntity;
        return tryToRefreshEntity.copy(text, text2, themedImageUrlEntity2, header, actionButtonEntity2);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImageUrlEntity getThemedImage() {
        return this.themedImage;
    }

    /* renamed from: component4, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionButtonEntity getButton() {
        return this.button;
    }

    public final TryToRefreshEntity copy(Text message, Text description, ThemedImageUrlEntity themedImage, Header header, ActionButtonEntity button) {
        return new TryToRefreshEntity(message, description, themedImage, header, button);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TryToRefreshEntity)) {
            return false;
        }
        TryToRefreshEntity tryToRefreshEntity = (TryToRefreshEntity) other;
        return jl40.l(this.message, tryToRefreshEntity.message) && jl40.l(this.description, tryToRefreshEntity.description) && jl40.l(this.themedImage, tryToRefreshEntity.themedImage) && jl40.l(this.header, tryToRefreshEntity.header) && jl40.l(this.button, tryToRefreshEntity.button);
    }

    public final ActionButtonEntity getButton() {
        return this.button;
    }

    public final Text getDescription() {
        return this.description;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final Text getMessage() {
        return this.message;
    }

    public final ThemedImageUrlEntity getThemedImage() {
        return this.themedImage;
    }

    public int hashCode() {
        return this.button.hashCode() + ((this.header.hashCode() + xvz.c(this.themedImage, n.c(this.description, this.message.hashCode() * 31, 31), 31)) * 31);
    }

    public String toString() {
        Text text = this.message;
        Text text2 = this.description;
        ThemedImageUrlEntity themedImageUrlEntity = this.themedImage;
        Header header = this.header;
        ActionButtonEntity actionButtonEntity = this.button;
        StringBuilder p = n.p("TryToRefreshEntity(message=", text, ", description=", text2, ", themedImage=");
        p.append(themedImageUrlEntity);
        p.append(", header=");
        p.append(header);
        p.append(", button=");
        p.append(actionButtonEntity);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.message, flags);
        dest.writeParcelable(this.description, flags);
        dest.writeParcelable(this.themedImage, flags);
        dest.writeParcelable(this.header, flags);
        dest.writeParcelable(this.button, flags);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header;", "Landroid/os/Parcelable;", "Default", "Image", "Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header$Default;", "Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header$Image;", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Header extends Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header$Default;", "Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header;", "Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;", "value", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;", "copy", "(Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;)Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header$Default;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/transfer/utils/domain/entities/PageHeaderEntity;", "getValue", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Default implements Header {
            public static final Parcelable.Creator<Default> CREATOR = new Creator();
            private final PageHeaderEntity value;

            public Default(PageHeaderEntity pageHeaderEntity) {
                this.value = pageHeaderEntity;
            }

            public static /* synthetic */ Default copy$default(Default r0, PageHeaderEntity pageHeaderEntity, int i, Object obj) {
                if ((i & 1) != 0) {
                    pageHeaderEntity = r0.value;
                }
                return r0.copy(pageHeaderEntity);
            }

            /* renamed from: component1, reason: from getter */
            public final PageHeaderEntity getValue() {
                return this.value;
            }

            public final Default copy(PageHeaderEntity value) {
                return new Default(value);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Default) && jl40.l(this.value, ((Default) other).value);
            }

            public final PageHeaderEntity getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Default(value=" + this.value + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.value, flags);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Default> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    return new Default((PageHeaderEntity) parcel.readParcelable(Default.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i) {
                    return new Default[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header$Image;", "Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header;", "Lcom/ybsdk/feature/qr/payments/api/data/PageImageHeaderEntity;", "value", "<init>", "(Lcom/ybsdk/feature/qr/payments/api/data/PageImageHeaderEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/qr/payments/api/data/PageImageHeaderEntity;", "copy", "(Lcom/ybsdk/feature/qr/payments/api/data/PageImageHeaderEntity;)Lcom/ybsdk/feature/qr/payments/api/data/TryToRefreshEntity$Header$Image;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/qr/payments/api/data/PageImageHeaderEntity;", "getValue", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Image implements Header {
            public static final Parcelable.Creator<Image> CREATOR = new Creator();
            private final PageImageHeaderEntity value;

            public Image(PageImageHeaderEntity pageImageHeaderEntity) {
                this.value = pageImageHeaderEntity;
            }

            public static /* synthetic */ Image copy$default(Image image, PageImageHeaderEntity pageImageHeaderEntity, int i, Object obj) {
                if ((i & 1) != 0) {
                    pageImageHeaderEntity = image.value;
                }
                return image.copy(pageImageHeaderEntity);
            }

            /* renamed from: component1, reason: from getter */
            public final PageImageHeaderEntity getValue() {
                return this.value;
            }

            public final Image copy(PageImageHeaderEntity value) {
                return new Image(value);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Image) && jl40.l(this.value, ((Image) other).value);
            }

            public final PageImageHeaderEntity getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Image(value=" + this.value + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                this.value.writeToParcel(dest, flags);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Image> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    return new Image(PageImageHeaderEntity.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i) {
                    return new Image[i];
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TryToRefreshEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TryToRefreshEntity createFromParcel(Parcel parcel) {
            return new TryToRefreshEntity((Text) parcel.readParcelable(TryToRefreshEntity.class.getClassLoader()), (Text) parcel.readParcelable(TryToRefreshEntity.class.getClassLoader()), (ThemedImageUrlEntity) parcel.readParcelable(TryToRefreshEntity.class.getClassLoader()), (Header) parcel.readParcelable(TryToRefreshEntity.class.getClassLoader()), (ActionButtonEntity) parcel.readParcelable(TryToRefreshEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TryToRefreshEntity[] newArray(int i) {
            return new TryToRefreshEntity[i];
        }
    }
}
