package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJX\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010\u0010J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b-\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b.\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b1\u0010\u001a¨\u00062"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "textColor", "url", Constants.DEEPLINK, "Lcom/yandex/plus/home/repository/api/model/panel/ActionType;", "actionType", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/panel/ActionType;Lcom/yandex/plus/core/data/common/PlusThemedColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component3", "component4", "component5", "()Lcom/yandex/plus/home/repository/api/model/panel/ActionType;", "component6", "copy", "(Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/panel/ActionType;Lcom/yandex/plus/core/data/common/PlusThemedColor;)Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTextColor", "getUrl", "getDeeplink", "Lcom/yandex/plus/home/repository/api/model/panel/ActionType;", "getActionType", "getBackgroundColor", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShortcutAction implements Parcelable {
    public static final Parcelable.Creator<ShortcutAction> CREATOR = new Creator();
    private final ActionType actionType;
    private final PlusThemedColor<PlusColor> backgroundColor;
    private final String deeplink;
    private final PlusThemedColor<PlusColor> textColor;
    private final String title;
    private final String url;

    public ShortcutAction(String str, PlusThemedColor<PlusColor> plusThemedColor, String str2, String str3, ActionType actionType, PlusThemedColor<PlusColor> plusThemedColor2) {
        this.title = str;
        this.textColor = plusThemedColor;
        this.url = str2;
        this.deeplink = str3;
        this.actionType = actionType;
        this.backgroundColor = plusThemedColor2;
    }

    public static /* synthetic */ ShortcutAction copy$default(ShortcutAction shortcutAction, String str, PlusThemedColor plusThemedColor, String str2, String str3, ActionType actionType, PlusThemedColor plusThemedColor2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shortcutAction.title;
        }
        if ((i & 2) != 0) {
            plusThemedColor = shortcutAction.textColor;
        }
        if ((i & 4) != 0) {
            str2 = shortcutAction.url;
        }
        if ((i & 8) != 0) {
            str3 = shortcutAction.deeplink;
        }
        if ((i & 16) != 0) {
            actionType = shortcutAction.actionType;
        }
        if ((i & 32) != 0) {
            plusThemedColor2 = shortcutAction.backgroundColor;
        }
        ActionType actionType2 = actionType;
        PlusThemedColor plusThemedColor3 = plusThemedColor2;
        return shortcutAction.copy(str, plusThemedColor, str2, str3, actionType2, plusThemedColor3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final PlusThemedColor<PlusColor> component2() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    public final PlusThemedColor<PlusColor> component6() {
        return this.backgroundColor;
    }

    public final ShortcutAction copy(String title, PlusThemedColor<PlusColor> textColor, String url, String deeplink, ActionType actionType, PlusThemedColor<PlusColor> backgroundColor) {
        return new ShortcutAction(title, textColor, url, deeplink, actionType, backgroundColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutAction)) {
            return false;
        }
        ShortcutAction shortcutAction = (ShortcutAction) other;
        return jl40.l(this.title, shortcutAction.title) && jl40.l(this.textColor, shortcutAction.textColor) && jl40.l(this.url, shortcutAction.url) && jl40.l(this.deeplink, shortcutAction.deeplink) && this.actionType == shortcutAction.actionType && jl40.l(this.backgroundColor, shortcutAction.backgroundColor);
    }

    public final ActionType getActionType() {
        return this.actionType;
    }

    public final PlusThemedColor<PlusColor> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final PlusThemedColor<PlusColor> getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + ((this.actionType.hashCode() + unr0.b(unr0.b(vfc.c(this.textColor, this.title.hashCode() * 31, 31), 31, this.url), 31, this.deeplink)) * 31);
    }

    public String toString() {
        return "ShortcutAction(title=" + this.title + ", textColor=" + this.textColor + ", url=" + this.url + ", deeplink=" + this.deeplink + ", actionType=" + this.actionType + ", backgroundColor=" + this.backgroundColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeParcelable(this.textColor, flags);
        dest.writeString(this.url);
        dest.writeString(this.deeplink);
        dest.writeString(this.actionType.name());
        dest.writeParcelable(this.backgroundColor, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShortcutAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortcutAction createFromParcel(Parcel parcel) {
            return new ShortcutAction(parcel.readString(), (PlusThemedColor) parcel.readParcelable(ShortcutAction.class.getClassLoader()), parcel.readString(), parcel.readString(), ActionType.valueOf(parcel.readString()), (PlusThemedColor) parcel.readParcelable(ShortcutAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortcutAction[] newArray(int i) {
            return new ShortcutAction[i];
        }
    }
}
