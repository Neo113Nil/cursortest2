package com.ybsdk.feature.transfer.version2.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.rr51;
import defpackage.tse0;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b2\u00103J \u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b7\u0010 J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bC\u0010$R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bD\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bE\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bH\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bM\u0010$R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u00103¨\u0006P"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferHeaderEntity;", "header", "", Constants.KEY_MESSAGE, "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "image", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "comment", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "primaryButton", "secondaryButton", "Lcom/ybsdk/feature/transfer/version2/api/entities/StatusIconType;", "statusIconType", "Lrr51;", "divkitWidget", "closeAction", "", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferQuickActionEntity;", "quickActions", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/entities/TransferHeaderEntity;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/StatusIconType;Lrr51;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferHeaderEntity;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component4", "component5", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "component8", "component9", "()Lcom/ybsdk/feature/transfer/version2/api/entities/StatusIconType;", "component10", "()Lrr51;", "component11", "component12", "()Ljava/util/List;", "copy", "(Lcom/ybsdk/feature/transfer/version2/api/entities/TransferHeaderEntity;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/StatusIconType;Lrr51;Ljava/lang/String;Ljava/util/List;)Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferHeaderEntity;", "getHeader", "Ljava/lang/String;", "getMessage", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImage", "getTitle", "getDescription", "getComment", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "getPrimaryButton", "getSecondaryButton", "Lcom/ybsdk/feature/transfer/version2/api/entities/StatusIconType;", "getStatusIconType", "Lrr51;", "getDivkitWidget", "getCloseAction", "Ljava/util/List;", "getQuickActions", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferResultPageEntity implements Parcelable {
    public static final Parcelable.Creator<TransferResultPageEntity> CREATOR = new Creator();
    private final String closeAction;
    private final String comment;
    private final String description;
    private final rr51 divkitWidget;
    private final TransferHeaderEntity header;
    private final ThemedImageUrlEntity image;
    private final String message;
    private final ActionButtonEntity primaryButton;
    private final List<TransferQuickActionEntity> quickActions;
    private final ActionButtonEntity secondaryButton;
    private final StatusIconType statusIconType;
    private final String title;

    public TransferResultPageEntity(TransferHeaderEntity transferHeaderEntity, String str, ThemedImageUrlEntity themedImageUrlEntity, String str2, String str3, String str4, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, StatusIconType statusIconType, rr51 rr51Var, String str5, List<TransferQuickActionEntity> list) {
        this.header = transferHeaderEntity;
        this.message = str;
        this.image = themedImageUrlEntity;
        this.title = str2;
        this.description = str3;
        this.comment = str4;
        this.primaryButton = actionButtonEntity;
        this.secondaryButton = actionButtonEntity2;
        this.statusIconType = statusIconType;
        this.divkitWidget = rr51Var;
        this.closeAction = str5;
        this.quickActions = list;
    }

    public static /* synthetic */ TransferResultPageEntity copy$default(TransferResultPageEntity transferResultPageEntity, TransferHeaderEntity transferHeaderEntity, String str, ThemedImageUrlEntity themedImageUrlEntity, String str2, String str3, String str4, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, StatusIconType statusIconType, rr51 rr51Var, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            transferHeaderEntity = transferResultPageEntity.header;
        }
        if ((i & 2) != 0) {
            str = transferResultPageEntity.message;
        }
        if ((i & 4) != 0) {
            themedImageUrlEntity = transferResultPageEntity.image;
        }
        if ((i & 8) != 0) {
            str2 = transferResultPageEntity.title;
        }
        if ((i & 16) != 0) {
            str3 = transferResultPageEntity.description;
        }
        if ((i & 32) != 0) {
            str4 = transferResultPageEntity.comment;
        }
        if ((i & 64) != 0) {
            actionButtonEntity = transferResultPageEntity.primaryButton;
        }
        if ((i & 128) != 0) {
            actionButtonEntity2 = transferResultPageEntity.secondaryButton;
        }
        if ((i & 256) != 0) {
            statusIconType = transferResultPageEntity.statusIconType;
        }
        if ((i & 512) != 0) {
            rr51Var = transferResultPageEntity.divkitWidget;
        }
        if ((i & 1024) != 0) {
            str5 = transferResultPageEntity.closeAction;
        }
        if ((i & 2048) != 0) {
            list = transferResultPageEntity.quickActions;
        }
        String str6 = str5;
        List list2 = list;
        StatusIconType statusIconType2 = statusIconType;
        rr51 rr51Var2 = rr51Var;
        ActionButtonEntity actionButtonEntity3 = actionButtonEntity;
        ActionButtonEntity actionButtonEntity4 = actionButtonEntity2;
        String str7 = str3;
        String str8 = str4;
        return transferResultPageEntity.copy(transferHeaderEntity, str, themedImageUrlEntity, str2, str7, str8, actionButtonEntity3, actionButtonEntity4, statusIconType2, rr51Var2, str6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferHeaderEntity getHeader() {
        return this.header;
    }

    /* renamed from: component10, reason: from getter */
    public final rr51 getDivkitWidget() {
        return this.divkitWidget;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    public final List<TransferQuickActionEntity> component12() {
        return this.quickActions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component7, reason: from getter */
    public final ActionButtonEntity getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component8, reason: from getter */
    public final ActionButtonEntity getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component9, reason: from getter */
    public final StatusIconType getStatusIconType() {
        return this.statusIconType;
    }

    public final TransferResultPageEntity copy(TransferHeaderEntity header, String message, ThemedImageUrlEntity image, String title, String description, String comment, ActionButtonEntity primaryButton, ActionButtonEntity secondaryButton, StatusIconType statusIconType, rr51 divkitWidget, String closeAction, List<TransferQuickActionEntity> quickActions) {
        return new TransferResultPageEntity(header, message, image, title, description, comment, primaryButton, secondaryButton, statusIconType, divkitWidget, closeAction, quickActions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferResultPageEntity)) {
            return false;
        }
        TransferResultPageEntity transferResultPageEntity = (TransferResultPageEntity) other;
        return jl40.l(this.header, transferResultPageEntity.header) && jl40.l(this.message, transferResultPageEntity.message) && jl40.l(this.image, transferResultPageEntity.image) && jl40.l(this.title, transferResultPageEntity.title) && jl40.l(this.description, transferResultPageEntity.description) && jl40.l(this.comment, transferResultPageEntity.comment) && jl40.l(this.primaryButton, transferResultPageEntity.primaryButton) && jl40.l(this.secondaryButton, transferResultPageEntity.secondaryButton) && this.statusIconType == transferResultPageEntity.statusIconType && jl40.l(this.divkitWidget, transferResultPageEntity.divkitWidget) && jl40.l(this.closeAction, transferResultPageEntity.closeAction) && jl40.l(this.quickActions, transferResultPageEntity.quickActions);
    }

    public final String getCloseAction() {
        return this.closeAction;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getDescription() {
        return this.description;
    }

    public final rr51 getDivkitWidget() {
        return this.divkitWidget;
    }

    public final TransferHeaderEntity getHeader() {
        return this.header;
    }

    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ActionButtonEntity getPrimaryButton() {
        return this.primaryButton;
    }

    public final List<TransferQuickActionEntity> getQuickActions() {
        return this.quickActions;
    }

    public final ActionButtonEntity getSecondaryButton() {
        return this.secondaryButton;
    }

    public final StatusIconType getStatusIconType() {
        return this.statusIconType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        TransferHeaderEntity transferHeaderEntity = this.header;
        int b = unr0.b((transferHeaderEntity == null ? 0 : transferHeaderEntity.hashCode()) * 31, 31, this.message);
        ThemedImageUrlEntity themedImageUrlEntity = this.image;
        int b2 = unr0.b(unr0.b((b + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31, 31, this.title), 31, this.description);
        String str = this.comment;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity = this.primaryButton;
        int hashCode2 = (hashCode + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity2 = this.secondaryButton;
        int hashCode3 = (hashCode2 + (actionButtonEntity2 == null ? 0 : actionButtonEntity2.hashCode())) * 31;
        StatusIconType statusIconType = this.statusIconType;
        int hashCode4 = (hashCode3 + (statusIconType == null ? 0 : statusIconType.hashCode())) * 31;
        rr51 rr51Var = this.divkitWidget;
        int hashCode5 = (hashCode4 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        String str2 = this.closeAction;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TransferQuickActionEntity> list = this.quickActions;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TransferHeaderEntity transferHeaderEntity = this.header;
        String str = this.message;
        ThemedImageUrlEntity themedImageUrlEntity = this.image;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.comment;
        ActionButtonEntity actionButtonEntity = this.primaryButton;
        ActionButtonEntity actionButtonEntity2 = this.secondaryButton;
        StatusIconType statusIconType = this.statusIconType;
        rr51 rr51Var = this.divkitWidget;
        String str5 = this.closeAction;
        List<TransferQuickActionEntity> list = this.quickActions;
        StringBuilder sb = new StringBuilder("TransferResultPageEntity(header=");
        sb.append(transferHeaderEntity);
        sb.append(", message=");
        sb.append(str);
        sb.append(", image=");
        sb.append(themedImageUrlEntity);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", description=");
        g8e.D(sb, str3, ", comment=", str4, ", primaryButton=");
        sb.append(actionButtonEntity);
        sb.append(", secondaryButton=");
        sb.append(actionButtonEntity2);
        sb.append(", statusIconType=");
        sb.append(statusIconType);
        sb.append(", divkitWidget=");
        sb.append(rr51Var);
        sb.append(", closeAction=");
        return tse0.j(str5, ", quickActions=", Extension.C_BRAKE, sb, list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        TransferHeaderEntity transferHeaderEntity = this.header;
        if (transferHeaderEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferHeaderEntity.writeToParcel(dest, flags);
        }
        dest.writeString(this.message);
        dest.writeParcelable(this.image, flags);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.comment);
        dest.writeParcelable(this.primaryButton, flags);
        dest.writeParcelable(this.secondaryButton, flags);
        StatusIconType statusIconType = this.statusIconType;
        if (statusIconType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(statusIconType.name());
        }
        dest.writeValue(this.divkitWidget);
        dest.writeString(this.closeAction);
        List<TransferQuickActionEntity> list = this.quickActions;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator m = oo31.m(dest, 1, list);
        while (m.hasNext()) {
            ((TransferQuickActionEntity) m.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferResultPageEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferResultPageEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            TransferHeaderEntity createFromParcel = parcel.readInt() == 0 ? null : TransferHeaderEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            ThemedImageUrlEntity themedImageUrlEntity = (ThemedImageUrlEntity) parcel.readParcelable(TransferResultPageEntity.class.getClassLoader());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ActionButtonEntity actionButtonEntity = (ActionButtonEntity) parcel.readParcelable(TransferResultPageEntity.class.getClassLoader());
            ActionButtonEntity actionButtonEntity2 = (ActionButtonEntity) parcel.readParcelable(TransferResultPageEntity.class.getClassLoader());
            StatusIconType valueOf = parcel.readInt() == 0 ? null : StatusIconType.valueOf(parcel.readString());
            rr51 rr51Var = (rr51) parcel.readValue(TransferResultPageEntity.class.getClassLoader());
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(TransferQuickActionEntity.CREATOR, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
            }
            return new TransferResultPageEntity(createFromParcel, readString, themedImageUrlEntity, readString2, readString3, readString4, actionButtonEntity, actionButtonEntity2, valueOf, rr51Var, readString5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferResultPageEntity[] newArray(int i) {
            return new TransferResultPageEntity[i];
        }
    }
}
