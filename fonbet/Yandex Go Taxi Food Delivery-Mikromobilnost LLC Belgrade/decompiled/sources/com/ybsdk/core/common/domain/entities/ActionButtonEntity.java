package com.ybsdk.core.common.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J<\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b\u0007\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b(\u0010\u0015¨\u0006)"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/utils/text/Text;", "text", "", "action", "", "isSupportButton", "subtitle", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;ZLcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "copy", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;ZLcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getText", "Ljava/lang/String;", "getAction", "Z", "getSubtitle", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionButtonEntity implements Parcelable {
    public static final Parcelable.Creator<ActionButtonEntity> CREATOR = new Creator();
    private final String action;
    private final boolean isSupportButton;
    private final Text subtitle;
    private final Text text;

    public /* synthetic */ ActionButtonEntity(Text text, String str, boolean z, Text text2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(text, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : text2);
    }

    public static /* synthetic */ ActionButtonEntity copy$default(ActionButtonEntity actionButtonEntity, Text text, String str, boolean z, Text text2, int i, Object obj) {
        if ((i & 1) != 0) {
            text = actionButtonEntity.text;
        }
        if ((i & 2) != 0) {
            str = actionButtonEntity.action;
        }
        if ((i & 4) != 0) {
            z = actionButtonEntity.isSupportButton;
        }
        if ((i & 8) != 0) {
            text2 = actionButtonEntity.subtitle;
        }
        return actionButtonEntity.copy(text, str, z, text2);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSupportButton() {
        return this.isSupportButton;
    }

    /* renamed from: component4, reason: from getter */
    public final Text getSubtitle() {
        return this.subtitle;
    }

    public final ActionButtonEntity copy(Text text, String action, boolean isSupportButton, Text subtitle) {
        return new ActionButtonEntity(text, action, isSupportButton, subtitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButtonEntity)) {
            return false;
        }
        ActionButtonEntity actionButtonEntity = (ActionButtonEntity) other;
        return jl40.l(this.text, actionButtonEntity.text) && jl40.l(this.action, actionButtonEntity.action) && this.isSupportButton == actionButtonEntity.isSupportButton && jl40.l(this.subtitle, actionButtonEntity.subtitle);
    }

    public final String getAction() {
        return this.action;
    }

    public final Text getSubtitle() {
        return this.subtitle;
    }

    public final Text getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.action;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSupportButton);
        Text text = this.subtitle;
        return e + (text != null ? text.hashCode() : 0);
    }

    public final boolean isSupportButton() {
        return this.isSupportButton;
    }

    public String toString() {
        return "ActionButtonEntity(text=" + this.text + ", action=" + this.action + ", isSupportButton=" + this.isSupportButton + ", subtitle=" + this.subtitle + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.text, flags);
        dest.writeString(this.action);
        dest.writeInt(this.isSupportButton ? 1 : 0);
        dest.writeParcelable(this.subtitle, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Creator implements Parcelable.Creator<ActionButtonEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionButtonEntity createFromParcel(Parcel parcel) {
            return new ActionButtonEntity((Text) parcel.readParcelable(ActionButtonEntity.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (Text) parcel.readParcelable(ActionButtonEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionButtonEntity[] newArray(int i) {
            return new ActionButtonEntity[i];
        }
    }

    public ActionButtonEntity(Text text, String str, boolean z, Text text2) {
        this.text = text;
        this.action = str;
        this.isSupportButton = z;
        this.subtitle = text2;
    }
}
