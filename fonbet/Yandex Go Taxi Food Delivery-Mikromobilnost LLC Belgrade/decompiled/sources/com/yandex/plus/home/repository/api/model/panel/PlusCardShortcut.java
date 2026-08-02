package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.x4e;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "Lcom/yandex/plus/home/repository/api/model/panel/Shortcut;", "RedAlert", "Plus", "NotPlus", "Status", "Promo", "PromoMini", "Family", "StatusAndFamily", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Family;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$NotPlus;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Promo;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$PromoMini;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$RedAlert;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Status;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$StatusAndFamily;", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusCardShortcut extends Shortcut {

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001BBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0088\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b/\u0010\u0016J\u001a\u00102\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u001eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b;\u0010#R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b<\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010'R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b\u000f\u0010)R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010+¨\u0006C"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "", "isWidthMatchParent", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor;", "balanceColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "()Z", "component10", "()Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor;)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "Z", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor;", "getBalanceColor", "BalanceThemedColor", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Plus implements PlusCardShortcut {
        public static final Parcelable.Creator<Plus> CREATOR = new Creator();
        private final ShortcutAction action;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final BalanceThemedColor balanceColor;
        private final String id;
        private final boolean isWidthMatchParent;
        private final String name;
        private final String subtitle;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public Plus(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, boolean z, BalanceThemedColor balanceThemedColor) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.isWidthMatchParent = z;
            this.balanceColor = balanceThemedColor;
        }

        public static /* synthetic */ Plus copy$default(Plus plus, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, boolean z, BalanceThemedColor balanceThemedColor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = plus.id;
            }
            if ((i & 2) != 0) {
                str2 = plus.name;
            }
            if ((i & 4) != 0) {
                str3 = plus.title;
            }
            if ((i & 8) != 0) {
                str4 = plus.subtitle;
            }
            if ((i & 16) != 0) {
                plusThemedColor = plus.titleTextColor;
            }
            if ((i & 32) != 0) {
                plusThemedColor2 = plus.subtitleTextColor;
            }
            if ((i & 64) != 0) {
                plusThemedColor3 = plus.backgroundColor;
            }
            if ((i & 128) != 0) {
                shortcutAction = plus.action;
            }
            if ((i & 256) != 0) {
                z = plus.isWidthMatchParent;
            }
            if ((i & 512) != 0) {
                balanceThemedColor = plus.balanceColor;
            }
            boolean z2 = z;
            BalanceThemedColor balanceThemedColor2 = balanceThemedColor;
            PlusThemedColor plusThemedColor4 = plusThemedColor3;
            ShortcutAction shortcutAction2 = shortcutAction;
            PlusThemedColor plusThemedColor5 = plusThemedColor;
            PlusThemedColor plusThemedColor6 = plusThemedColor2;
            return plus.copy(str, str2, str3, str4, plusThemedColor5, plusThemedColor6, plusThemedColor4, shortcutAction2, z2, balanceThemedColor2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final BalanceThemedColor getBalanceColor() {
            return this.balanceColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final Plus copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, boolean isWidthMatchParent, BalanceThemedColor balanceColor) {
            return new Plus(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, isWidthMatchParent, balanceColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plus)) {
                return false;
            }
            Plus plus = (Plus) other;
            return jl40.l(this.id, plus.id) && jl40.l(this.name, plus.name) && jl40.l(this.title, plus.title) && jl40.l(this.subtitle, plus.subtitle) && jl40.l(this.titleTextColor, plus.titleTextColor) && jl40.l(this.subtitleTextColor, plus.subtitleTextColor) && jl40.l(this.backgroundColor, plus.backgroundColor) && jl40.l(this.action, plus.action) && this.isWidthMatchParent == plus.isWidthMatchParent && jl40.l(this.balanceColor, plus.balanceColor);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BalanceThemedColor getBalanceColor() {
            return this.balanceColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            return this.balanceColor.hashCode() + unr0.e((c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31, this.isWidthMatchParent);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        /* renamed from: isWidthMatchParent */
        public boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public String toString() {
            return "Plus(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", backgroundColor=" + this.backgroundColor + ", action=" + this.action + ", isWidthMatchParent=" + this.isWidthMatchParent + ", balanceColor=" + this.balanceColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isWidthMatchParent ? 1 : 0);
            dest.writeParcelable(this.balanceColor, flags);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor;", "Landroid/os/Parcelable;", "Single", "Separate", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor$Separate;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor$Single;", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface BalanceThemedColor extends Parcelable {

            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J0\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor$Separate;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor;", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "textColor", "iconColor", "<init>", "(Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component2", "copy", "(Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor$Separate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTextColor", "getIconColor", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Separate implements BalanceThemedColor {
                public static final Parcelable.Creator<Separate> CREATOR = new Creator();
                private final PlusThemedColor<PlusColor> iconColor;
                private final PlusThemedColor<PlusColor> textColor;

                public Separate(PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2) {
                    this.textColor = plusThemedColor;
                    this.iconColor = plusThemedColor2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Separate copy$default(Separate separate, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        plusThemedColor = separate.textColor;
                    }
                    if ((i & 2) != 0) {
                        plusThemedColor2 = separate.iconColor;
                    }
                    return separate.copy(plusThemedColor, plusThemedColor2);
                }

                public final PlusThemedColor<PlusColor> component1() {
                    return this.textColor;
                }

                public final PlusThemedColor<PlusColor> component2() {
                    return this.iconColor;
                }

                public final Separate copy(PlusThemedColor<PlusColor> textColor, PlusThemedColor<PlusColor> iconColor) {
                    return new Separate(textColor, iconColor);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Separate)) {
                        return false;
                    }
                    Separate separate = (Separate) other;
                    return jl40.l(this.textColor, separate.textColor) && jl40.l(this.iconColor, separate.iconColor);
                }

                public final PlusThemedColor<PlusColor> getIconColor() {
                    return this.iconColor;
                }

                public final PlusThemedColor<PlusColor> getTextColor() {
                    return this.textColor;
                }

                public int hashCode() {
                    return this.iconColor.hashCode() + (this.textColor.hashCode() * 31);
                }

                public String toString() {
                    return "Separate(textColor=" + this.textColor + ", iconColor=" + this.iconColor + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.writeParcelable(this.textColor, flags);
                    dest.writeParcelable(this.iconColor, flags);
                }

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Separate> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Separate createFromParcel(Parcel parcel) {
                        return new Separate((PlusThemedColor) parcel.readParcelable(Separate.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(Separate.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Separate[] newArray(int i) {
                        return new Separate[i];
                    }
                }
            }

            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor$Single;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor;", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "color", "<init>", "(Lcom/yandex/plus/core/data/common/PlusThemedColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "copy", "(Lcom/yandex/plus/core/data/common/PlusThemedColor;)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus$BalanceThemedColor$Single;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getColor", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Single implements BalanceThemedColor {
                public static final Parcelable.Creator<Single> CREATOR = new Creator();
                private final PlusThemedColor<PlusColor> color;

                public Single(PlusThemedColor<PlusColor> plusThemedColor) {
                    this.color = plusThemedColor;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Single copy$default(Single single, PlusThemedColor plusThemedColor, int i, Object obj) {
                    if ((i & 1) != 0) {
                        plusThemedColor = single.color;
                    }
                    return single.copy(plusThemedColor);
                }

                public final PlusThemedColor<PlusColor> component1() {
                    return this.color;
                }

                public final Single copy(PlusThemedColor<PlusColor> color) {
                    return new Single(color);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Single) && jl40.l(this.color, ((Single) other).color);
                }

                public final PlusThemedColor<PlusColor> getColor() {
                    return this.color;
                }

                public int hashCode() {
                    return this.color.hashCode();
                }

                public String toString() {
                    return "Single(color=" + this.color + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.writeParcelable(this.color, flags);
                }

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Single> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Single createFromParcel(Parcel parcel) {
                        return new Single((PlusThemedColor) parcel.readParcelable(Single.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Single[] newArray(int i) {
                        return new Single[i];
                    }
                }
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Plus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Plus createFromParcel(Parcel parcel) {
                return new Plus(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(Plus.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(Plus.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(Plus.class.getClassLoader()), parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (BalanceThemedColor) parcel.readParcelable(Plus.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Plus[] newArray(int i) {
                return new Plus[i];
            }
        }
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* synthetic */ ShortcutAction getAction();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* synthetic */ PlusThemedColor getBackgroundColor();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* synthetic */ String getId();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* synthetic */ String getName();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* synthetic */ String getSubtitle();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* synthetic */ PlusThemedColor getSubtitleTextColor();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* synthetic */ String getTitle();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* synthetic */ PlusThemedColor getTitleTextColor();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* renamed from: isWidthMatchParent */
    /* synthetic */ boolean getIsWidthMatchParent();

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b*\u0010$J\u001e\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b-\u0010)J \u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b1\u0010\u0017J\u001a\u00104\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u001fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010$R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b=\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\b\u000e\u0010)R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bA\u0010$R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010,R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bD\u0010)¨\u0006E"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Family;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "", "isWidthMatchParent", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "subtitlePluralForms", "sharingFamilyInvitation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/Map;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component8", "()Z", "component9", "component10", "()Ljava/util/Map;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/Map;Z)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Family;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "Z", "getBackgroundColor", "Ljava/util/Map;", "getSubtitlePluralForms", "getSharingFamilyInvitation", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Family implements PlusCardShortcut {
        public static final Parcelable.Creator<Family> CREATOR = new Creator();
        private final ShortcutAction action;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final String id;
        private final boolean isWidthMatchParent;
        private final String name;
        private final boolean sharingFamilyInvitation;
        private final String subtitle;
        private final Map<String, String> subtitlePluralForms;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public Family(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, ShortcutAction shortcutAction, boolean z, PlusThemedColor<PlusColor> plusThemedColor3, Map<String, String> map, boolean z2) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.action = shortcutAction;
            this.isWidthMatchParent = z;
            this.backgroundColor = plusThemedColor3;
            this.subtitlePluralForms = map;
            this.sharingFamilyInvitation = z2;
        }

        public static /* synthetic */ Family copy$default(Family family, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, ShortcutAction shortcutAction, boolean z, PlusThemedColor plusThemedColor3, Map map, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = family.id;
            }
            if ((i & 2) != 0) {
                str2 = family.name;
            }
            if ((i & 4) != 0) {
                str3 = family.title;
            }
            if ((i & 8) != 0) {
                str4 = family.subtitle;
            }
            if ((i & 16) != 0) {
                plusThemedColor = family.titleTextColor;
            }
            if ((i & 32) != 0) {
                plusThemedColor2 = family.subtitleTextColor;
            }
            if ((i & 64) != 0) {
                shortcutAction = family.action;
            }
            if ((i & 128) != 0) {
                z = family.isWidthMatchParent;
            }
            if ((i & 256) != 0) {
                plusThemedColor3 = family.backgroundColor;
            }
            if ((i & 512) != 0) {
                map = family.subtitlePluralForms;
            }
            if ((i & 1024) != 0) {
                z2 = family.sharingFamilyInvitation;
            }
            Map map2 = map;
            boolean z3 = z2;
            boolean z4 = z;
            PlusThemedColor plusThemedColor4 = plusThemedColor3;
            PlusThemedColor plusThemedColor5 = plusThemedColor2;
            ShortcutAction shortcutAction2 = shortcutAction;
            PlusThemedColor plusThemedColor6 = plusThemedColor;
            String str5 = str3;
            return family.copy(str, str2, str5, str4, plusThemedColor6, plusThemedColor5, shortcutAction2, z4, plusThemedColor4, map2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Map<String, String> component10() {
            return this.subtitlePluralForms;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getSharingFamilyInvitation() {
            return this.sharingFamilyInvitation;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        /* renamed from: component7, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final PlusThemedColor<PlusColor> component9() {
            return this.backgroundColor;
        }

        public final Family copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, ShortcutAction action, boolean isWidthMatchParent, PlusThemedColor<PlusColor> backgroundColor, Map<String, String> subtitlePluralForms, boolean sharingFamilyInvitation) {
            return new Family(id, name, title, subtitle, titleTextColor, subtitleTextColor, action, isWidthMatchParent, backgroundColor, subtitlePluralForms, sharingFamilyInvitation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Family)) {
                return false;
            }
            Family family = (Family) other;
            return jl40.l(this.id, family.id) && jl40.l(this.name, family.name) && jl40.l(this.title, family.title) && jl40.l(this.subtitle, family.subtitle) && jl40.l(this.titleTextColor, family.titleTextColor) && jl40.l(this.subtitleTextColor, family.subtitleTextColor) && jl40.l(this.action, family.action) && this.isWidthMatchParent == family.isWidthMatchParent && jl40.l(this.backgroundColor, family.backgroundColor) && jl40.l(this.subtitlePluralForms, family.subtitlePluralForms) && this.sharingFamilyInvitation == family.sharingFamilyInvitation;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        public final boolean getSharingFamilyInvitation() {
            return this.sharingFamilyInvitation;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        public final Map<String, String> getSubtitlePluralForms() {
            return this.subtitlePluralForms;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31);
            ShortcutAction shortcutAction = this.action;
            int c2 = vfc.c(this.backgroundColor, unr0.e((c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31, this.isWidthMatchParent), 31);
            Map<String, String> map = this.subtitlePluralForms;
            return Boolean.hashCode(this.sharingFamilyInvitation) + ((c2 + (map != null ? map.hashCode() : 0)) * 31);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        /* renamed from: isWidthMatchParent */
        public boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Family(id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", titleTextColor=");
            sb.append(this.titleTextColor);
            sb.append(", subtitleTextColor=");
            sb.append(this.subtitleTextColor);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", isWidthMatchParent=");
            sb.append(this.isWidthMatchParent);
            sb.append(", backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", subtitlePluralForms=");
            sb.append(this.subtitlePluralForms);
            sb.append(", sharingFamilyInvitation=");
            return unr0.u(sb, this.sharingFamilyInvitation, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isWidthMatchParent ? 1 : 0);
            dest.writeParcelable(this.backgroundColor, flags);
            Map<String, String> map = this.subtitlePluralForms;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator s = x4e.s(dest, 1, map);
                while (s.hasNext()) {
                    Map.Entry entry = (Map.Entry) s.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }
            dest.writeInt(this.sharingFamilyInvitation ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Family> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Family createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                PlusThemedColor plusThemedColor = (PlusThemedColor) parcel.readParcelable(Family.class.getClassLoader());
                PlusThemedColor plusThemedColor2 = (PlusThemedColor) parcel.readParcelable(Family.class.getClassLoader());
                LinkedHashMap linkedHashMap = null;
                ShortcutAction createFromParcel = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                boolean z = parcel.readInt() != 0;
                PlusThemedColor plusThemedColor3 = (PlusThemedColor) parcel.readParcelable(Family.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Family(readString, readString2, readString3, readString4, plusThemedColor, plusThemedColor2, createFromParcel, z, plusThemedColor3, linkedHashMap, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Family[] newArray(int i) {
                return new Family[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J~\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u0010\u0010+\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b+\u0010\u0014J\u001a\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001cR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010!R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b7\u0010!R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010%R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b\u000f\u0010'¨\u0006<"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$NotPlus;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "", "isWidthMatchParent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Z)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$NotPlus;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "Z", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotPlus implements PlusCardShortcut {
        public static final Parcelable.Creator<NotPlus> CREATOR = new Creator();
        private final ShortcutAction action;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final String id;
        private final boolean isWidthMatchParent;
        private final String name;
        private final String subtitle;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public NotPlus(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, boolean z) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.isWidthMatchParent = z;
        }

        public static /* synthetic */ NotPlus copy$default(NotPlus notPlus, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notPlus.id;
            }
            if ((i & 2) != 0) {
                str2 = notPlus.name;
            }
            if ((i & 4) != 0) {
                str3 = notPlus.title;
            }
            if ((i & 8) != 0) {
                str4 = notPlus.subtitle;
            }
            if ((i & 16) != 0) {
                plusThemedColor = notPlus.titleTextColor;
            }
            if ((i & 32) != 0) {
                plusThemedColor2 = notPlus.subtitleTextColor;
            }
            if ((i & 64) != 0) {
                plusThemedColor3 = notPlus.backgroundColor;
            }
            if ((i & 128) != 0) {
                shortcutAction = notPlus.action;
            }
            if ((i & 256) != 0) {
                z = notPlus.isWidthMatchParent;
            }
            ShortcutAction shortcutAction2 = shortcutAction;
            boolean z2 = z;
            PlusThemedColor plusThemedColor4 = plusThemedColor2;
            PlusThemedColor plusThemedColor5 = plusThemedColor3;
            PlusThemedColor plusThemedColor6 = plusThemedColor;
            String str5 = str3;
            return notPlus.copy(str, str2, str5, str4, plusThemedColor6, plusThemedColor4, plusThemedColor5, shortcutAction2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final NotPlus copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, boolean isWidthMatchParent) {
            return new NotPlus(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, isWidthMatchParent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotPlus)) {
                return false;
            }
            NotPlus notPlus = (NotPlus) other;
            return jl40.l(this.id, notPlus.id) && jl40.l(this.name, notPlus.name) && jl40.l(this.title, notPlus.title) && jl40.l(this.subtitle, notPlus.subtitle) && jl40.l(this.titleTextColor, notPlus.titleTextColor) && jl40.l(this.subtitleTextColor, notPlus.subtitleTextColor) && jl40.l(this.backgroundColor, notPlus.backgroundColor) && jl40.l(this.action, notPlus.action) && this.isWidthMatchParent == notPlus.isWidthMatchParent;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            return Boolean.hashCode(this.isWidthMatchParent) + ((c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        /* renamed from: isWidthMatchParent */
        public boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotPlus(id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", titleTextColor=");
            sb.append(this.titleTextColor);
            sb.append(", subtitleTextColor=");
            sb.append(this.subtitleTextColor);
            sb.append(", backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", isWidthMatchParent=");
            return unr0.u(sb, this.isWidthMatchParent, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isWidthMatchParent ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotPlus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotPlus createFromParcel(Parcel parcel) {
                return new NotPlus(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(NotPlus.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(NotPlus.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(NotPlus.class.getClassLoader()), parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotPlus[] newArray(int i) {
                return new NotPlus[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b/\u0010-J\u009c\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010 J\u0010\u00103\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b3\u0010\u0018J\u001a\u00106\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010 R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010 R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010 R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010%R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b?\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b@\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010)R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\b\u000f\u0010+R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010-R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bF\u0010-R\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bG\u0010-¨\u0006H"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Promo;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "", "isWidthMatchParent", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "backgroundImageUrls", "longLayoutImageUrls", "shortLayoutImageUrls", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "()Z", "component10", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Promo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "Z", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getBackgroundImageUrls", "getLongLayoutImageUrls", "getShortLayoutImageUrls", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Promo implements PlusCardShortcut {
        public static final Parcelable.Creator<Promo> CREATOR = new Creator();
        private final ShortcutAction action;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final PlusThemedImage backgroundImageUrls;
        private final String id;
        private final boolean isWidthMatchParent;
        private final PlusThemedImage longLayoutImageUrls;
        private final String name;
        private final PlusThemedImage shortLayoutImageUrls;
        private final String subtitle;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public Promo(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, boolean z, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.isWidthMatchParent = z;
            this.backgroundImageUrls = plusThemedImage;
            this.longLayoutImageUrls = plusThemedImage2;
            this.shortLayoutImageUrls = plusThemedImage3;
        }

        public static /* synthetic */ Promo copy$default(Promo promo, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, boolean z, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promo.id;
            }
            if ((i & 2) != 0) {
                str2 = promo.name;
            }
            if ((i & 4) != 0) {
                str3 = promo.title;
            }
            if ((i & 8) != 0) {
                str4 = promo.subtitle;
            }
            if ((i & 16) != 0) {
                plusThemedColor = promo.titleTextColor;
            }
            if ((i & 32) != 0) {
                plusThemedColor2 = promo.subtitleTextColor;
            }
            if ((i & 64) != 0) {
                plusThemedColor3 = promo.backgroundColor;
            }
            if ((i & 128) != 0) {
                shortcutAction = promo.action;
            }
            if ((i & 256) != 0) {
                z = promo.isWidthMatchParent;
            }
            if ((i & 512) != 0) {
                plusThemedImage = promo.backgroundImageUrls;
            }
            if ((i & 1024) != 0) {
                plusThemedImage2 = promo.longLayoutImageUrls;
            }
            if ((i & 2048) != 0) {
                plusThemedImage3 = promo.shortLayoutImageUrls;
            }
            PlusThemedImage plusThemedImage4 = plusThemedImage2;
            PlusThemedImage plusThemedImage5 = plusThemedImage3;
            boolean z2 = z;
            PlusThemedImage plusThemedImage6 = plusThemedImage;
            PlusThemedColor plusThemedColor4 = plusThemedColor3;
            ShortcutAction shortcutAction2 = shortcutAction;
            PlusThemedColor plusThemedColor5 = plusThemedColor;
            PlusThemedColor plusThemedColor6 = plusThemedColor2;
            return promo.copy(str, str2, str3, str4, plusThemedColor5, plusThemedColor6, plusThemedColor4, shortcutAction2, z2, plusThemedImage6, plusThemedImage4, plusThemedImage5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final PlusThemedImage getBackgroundImageUrls() {
            return this.backgroundImageUrls;
        }

        /* renamed from: component11, reason: from getter */
        public final PlusThemedImage getLongLayoutImageUrls() {
            return this.longLayoutImageUrls;
        }

        /* renamed from: component12, reason: from getter */
        public final PlusThemedImage getShortLayoutImageUrls() {
            return this.shortLayoutImageUrls;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final Promo copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, boolean isWidthMatchParent, PlusThemedImage backgroundImageUrls, PlusThemedImage longLayoutImageUrls, PlusThemedImage shortLayoutImageUrls) {
            return new Promo(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, isWidthMatchParent, backgroundImageUrls, longLayoutImageUrls, shortLayoutImageUrls);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Promo)) {
                return false;
            }
            Promo promo = (Promo) other;
            return jl40.l(this.id, promo.id) && jl40.l(this.name, promo.name) && jl40.l(this.title, promo.title) && jl40.l(this.subtitle, promo.subtitle) && jl40.l(this.titleTextColor, promo.titleTextColor) && jl40.l(this.subtitleTextColor, promo.subtitleTextColor) && jl40.l(this.backgroundColor, promo.backgroundColor) && jl40.l(this.action, promo.action) && this.isWidthMatchParent == promo.isWidthMatchParent && jl40.l(this.backgroundImageUrls, promo.backgroundImageUrls) && jl40.l(this.longLayoutImageUrls, promo.longLayoutImageUrls) && jl40.l(this.shortLayoutImageUrls, promo.shortLayoutImageUrls);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final PlusThemedImage getBackgroundImageUrls() {
            return this.backgroundImageUrls;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        public final PlusThemedImage getLongLayoutImageUrls() {
            return this.longLayoutImageUrls;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        public final PlusThemedImage getShortLayoutImageUrls() {
            return this.shortLayoutImageUrls;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            return this.shortLayoutImageUrls.hashCode() + ((this.longLayoutImageUrls.hashCode() + ((this.backgroundImageUrls.hashCode() + unr0.e((c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31, this.isWidthMatchParent)) * 31)) * 31);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        /* renamed from: isWidthMatchParent */
        public boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public String toString() {
            return "Promo(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", backgroundColor=" + this.backgroundColor + ", action=" + this.action + ", isWidthMatchParent=" + this.isWidthMatchParent + ", backgroundImageUrls=" + this.backgroundImageUrls + ", longLayoutImageUrls=" + this.longLayoutImageUrls + ", shortLayoutImageUrls=" + this.shortLayoutImageUrls + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isWidthMatchParent ? 1 : 0);
            dest.writeParcelable(this.backgroundImageUrls, flags);
            dest.writeParcelable(this.longLayoutImageUrls, flags);
            dest.writeParcelable(this.shortLayoutImageUrls, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Promo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Promo createFromParcel(Parcel parcel) {
                return new Promo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(Promo.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(Promo.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(Promo.class.getClassLoader()), parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PlusThemedImage) parcel.readParcelable(Promo.class.getClassLoader()), (PlusThemedImage) parcel.readParcelable(Promo.class.getClassLoader()), (PlusThemedImage) parcel.readParcelable(Promo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Promo[] newArray(int i) {
                return new Promo[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0088\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b/\u0010\u0016J\u001a\u00102\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u001eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b;\u0010#R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b<\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010'R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b\u000f\u0010)R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010+¨\u0006B"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$PromoMini;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "", "isWidthMatchParent", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "()Z", "component10", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedImage;)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$PromoMini;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "Z", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getIcon", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PromoMini implements PlusCardShortcut {
        public static final Parcelable.Creator<PromoMini> CREATOR = new Creator();
        private final ShortcutAction action;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final PlusThemedImage icon;
        private final String id;
        private final boolean isWidthMatchParent;
        private final String name;
        private final String subtitle;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public PromoMini(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, boolean z, PlusThemedImage plusThemedImage) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.isWidthMatchParent = z;
            this.icon = plusThemedImage;
        }

        public static /* synthetic */ PromoMini copy$default(PromoMini promoMini, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, boolean z, PlusThemedImage plusThemedImage, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promoMini.id;
            }
            if ((i & 2) != 0) {
                str2 = promoMini.name;
            }
            if ((i & 4) != 0) {
                str3 = promoMini.title;
            }
            if ((i & 8) != 0) {
                str4 = promoMini.subtitle;
            }
            if ((i & 16) != 0) {
                plusThemedColor = promoMini.titleTextColor;
            }
            if ((i & 32) != 0) {
                plusThemedColor2 = promoMini.subtitleTextColor;
            }
            if ((i & 64) != 0) {
                plusThemedColor3 = promoMini.backgroundColor;
            }
            if ((i & 128) != 0) {
                shortcutAction = promoMini.action;
            }
            if ((i & 256) != 0) {
                z = promoMini.isWidthMatchParent;
            }
            if ((i & 512) != 0) {
                plusThemedImage = promoMini.icon;
            }
            boolean z2 = z;
            PlusThemedImage plusThemedImage2 = plusThemedImage;
            PlusThemedColor plusThemedColor4 = plusThemedColor3;
            ShortcutAction shortcutAction2 = shortcutAction;
            PlusThemedColor plusThemedColor5 = plusThemedColor;
            PlusThemedColor plusThemedColor6 = plusThemedColor2;
            return promoMini.copy(str, str2, str3, str4, plusThemedColor5, plusThemedColor6, plusThemedColor4, shortcutAction2, z2, plusThemedImage2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final PromoMini copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, boolean isWidthMatchParent, PlusThemedImage icon) {
            return new PromoMini(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, isWidthMatchParent, icon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromoMini)) {
                return false;
            }
            PromoMini promoMini = (PromoMini) other;
            return jl40.l(this.id, promoMini.id) && jl40.l(this.name, promoMini.name) && jl40.l(this.title, promoMini.title) && jl40.l(this.subtitle, promoMini.subtitle) && jl40.l(this.titleTextColor, promoMini.titleTextColor) && jl40.l(this.subtitleTextColor, promoMini.subtitleTextColor) && jl40.l(this.backgroundColor, promoMini.backgroundColor) && jl40.l(this.action, promoMini.action) && this.isWidthMatchParent == promoMini.isWidthMatchParent && jl40.l(this.icon, promoMini.icon);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            return this.icon.hashCode() + unr0.e((c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31, this.isWidthMatchParent);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        /* renamed from: isWidthMatchParent */
        public boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public String toString() {
            return "PromoMini(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", backgroundColor=" + this.backgroundColor + ", action=" + this.action + ", isWidthMatchParent=" + this.isWidthMatchParent + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isWidthMatchParent ? 1 : 0);
            dest.writeParcelable(this.icon, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PromoMini> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PromoMini createFromParcel(Parcel parcel) {
                return new PromoMini(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(PromoMini.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(PromoMini.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(PromoMini.class.getClassLoader()), parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PlusThemedImage) parcel.readParcelable(PromoMini.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PromoMini[] newArray(int i) {
                return new PromoMini[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b-\u0010(J\u0096\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b1\u0010\u0017J\u001a\u00104\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u001fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010$R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b=\u0010$R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b>\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010(R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\b\u000f\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bD\u0010(¨\u0006E"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$RedAlert;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "", "isWidthMatchParent", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "themedLogoUrls", "additionalAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "()Z", "component10", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$RedAlert;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "Z", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getThemedLogoUrls", "getAdditionalAction", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedAlert implements PlusCardShortcut {
        public static final Parcelable.Creator<RedAlert> CREATOR = new Creator();
        private final ShortcutAction action;
        private final ShortcutAction additionalAction;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final String id;
        private final boolean isWidthMatchParent;
        private final String name;
        private final String subtitle;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final PlusThemedImage themedLogoUrls;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public RedAlert(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, boolean z, PlusThemedImage plusThemedImage, ShortcutAction shortcutAction2) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.isWidthMatchParent = z;
            this.themedLogoUrls = plusThemedImage;
            this.additionalAction = shortcutAction2;
        }

        public static /* synthetic */ RedAlert copy$default(RedAlert redAlert, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, boolean z, PlusThemedImage plusThemedImage, ShortcutAction shortcutAction2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redAlert.id;
            }
            if ((i & 2) != 0) {
                str2 = redAlert.name;
            }
            if ((i & 4) != 0) {
                str3 = redAlert.title;
            }
            if ((i & 8) != 0) {
                str4 = redAlert.subtitle;
            }
            if ((i & 16) != 0) {
                plusThemedColor = redAlert.titleTextColor;
            }
            if ((i & 32) != 0) {
                plusThemedColor2 = redAlert.subtitleTextColor;
            }
            if ((i & 64) != 0) {
                plusThemedColor3 = redAlert.backgroundColor;
            }
            if ((i & 128) != 0) {
                shortcutAction = redAlert.action;
            }
            if ((i & 256) != 0) {
                z = redAlert.isWidthMatchParent;
            }
            if ((i & 512) != 0) {
                plusThemedImage = redAlert.themedLogoUrls;
            }
            if ((i & 1024) != 0) {
                shortcutAction2 = redAlert.additionalAction;
            }
            PlusThemedImage plusThemedImage2 = plusThemedImage;
            ShortcutAction shortcutAction3 = shortcutAction2;
            ShortcutAction shortcutAction4 = shortcutAction;
            boolean z2 = z;
            PlusThemedColor plusThemedColor4 = plusThemedColor2;
            PlusThemedColor plusThemedColor5 = plusThemedColor3;
            PlusThemedColor plusThemedColor6 = plusThemedColor;
            String str5 = str3;
            return redAlert.copy(str, str2, str5, str4, plusThemedColor6, plusThemedColor4, plusThemedColor5, shortcutAction4, z2, plusThemedImage2, shortcutAction3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final PlusThemedImage getThemedLogoUrls() {
            return this.themedLogoUrls;
        }

        /* renamed from: component11, reason: from getter */
        public final ShortcutAction getAdditionalAction() {
            return this.additionalAction;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final RedAlert copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, boolean isWidthMatchParent, PlusThemedImage themedLogoUrls, ShortcutAction additionalAction) {
            return new RedAlert(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, isWidthMatchParent, themedLogoUrls, additionalAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RedAlert)) {
                return false;
            }
            RedAlert redAlert = (RedAlert) other;
            return jl40.l(this.id, redAlert.id) && jl40.l(this.name, redAlert.name) && jl40.l(this.title, redAlert.title) && jl40.l(this.subtitle, redAlert.subtitle) && jl40.l(this.titleTextColor, redAlert.titleTextColor) && jl40.l(this.subtitleTextColor, redAlert.subtitleTextColor) && jl40.l(this.backgroundColor, redAlert.backgroundColor) && jl40.l(this.action, redAlert.action) && this.isWidthMatchParent == redAlert.isWidthMatchParent && jl40.l(this.themedLogoUrls, redAlert.themedLogoUrls) && jl40.l(this.additionalAction, redAlert.additionalAction);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        public final ShortcutAction getAdditionalAction() {
            return this.additionalAction;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        public final PlusThemedImage getThemedLogoUrls() {
            return this.themedLogoUrls;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            int e = unr0.e((c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31, this.isWidthMatchParent);
            PlusThemedImage plusThemedImage = this.themedLogoUrls;
            int hashCode = (e + (plusThemedImage == null ? 0 : plusThemedImage.hashCode())) * 31;
            ShortcutAction shortcutAction2 = this.additionalAction;
            return hashCode + (shortcutAction2 != null ? shortcutAction2.hashCode() : 0);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        /* renamed from: isWidthMatchParent */
        public boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public String toString() {
            return "RedAlert(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", backgroundColor=" + this.backgroundColor + ", action=" + this.action + ", isWidthMatchParent=" + this.isWidthMatchParent + ", themedLogoUrls=" + this.themedLogoUrls + ", additionalAction=" + this.additionalAction + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isWidthMatchParent ? 1 : 0);
            dest.writeParcelable(this.themedLogoUrls, flags);
            ShortcutAction shortcutAction2 = this.additionalAction;
            if (shortcutAction2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction2.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RedAlert> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RedAlert createFromParcel(Parcel parcel) {
                return new RedAlert(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(RedAlert.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(RedAlert.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(RedAlert.class.getClassLoader()), parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PlusThemedImage) parcel.readParcelable(RedAlert.class.getClassLoader()), parcel.readInt() != 0 ? ShortcutAction.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RedAlert[] newArray(int i) {
                return new RedAlert[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0088\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b/\u0010\u0016J\u001a\u00102\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u001eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b;\u0010#R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b<\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010'R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b\u000f\u0010)R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010+¨\u0006B"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Status;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "", "isWidthMatchParent", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "()Z", "component10", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedImage;)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Status;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "Z", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getIcon", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Status implements PlusCardShortcut {
        public static final Parcelable.Creator<Status> CREATOR = new Creator();
        private final ShortcutAction action;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final PlusThemedImage icon;
        private final String id;
        private final boolean isWidthMatchParent;
        private final String name;
        private final String subtitle;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public Status(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, boolean z, PlusThemedImage plusThemedImage) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.isWidthMatchParent = z;
            this.icon = plusThemedImage;
        }

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, boolean z, PlusThemedImage plusThemedImage, int i, Object obj) {
            if ((i & 1) != 0) {
                str = status.id;
            }
            if ((i & 2) != 0) {
                str2 = status.name;
            }
            if ((i & 4) != 0) {
                str3 = status.title;
            }
            if ((i & 8) != 0) {
                str4 = status.subtitle;
            }
            if ((i & 16) != 0) {
                plusThemedColor = status.titleTextColor;
            }
            if ((i & 32) != 0) {
                plusThemedColor2 = status.subtitleTextColor;
            }
            if ((i & 64) != 0) {
                plusThemedColor3 = status.backgroundColor;
            }
            if ((i & 128) != 0) {
                shortcutAction = status.action;
            }
            if ((i & 256) != 0) {
                z = status.isWidthMatchParent;
            }
            if ((i & 512) != 0) {
                plusThemedImage = status.icon;
            }
            boolean z2 = z;
            PlusThemedImage plusThemedImage2 = plusThemedImage;
            PlusThemedColor plusThemedColor4 = plusThemedColor3;
            ShortcutAction shortcutAction2 = shortcutAction;
            PlusThemedColor plusThemedColor5 = plusThemedColor;
            PlusThemedColor plusThemedColor6 = plusThemedColor2;
            return status.copy(str, str2, str3, str4, plusThemedColor5, plusThemedColor6, plusThemedColor4, shortcutAction2, z2, plusThemedImage2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final Status copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, boolean isWidthMatchParent, PlusThemedImage icon) {
            return new Status(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, isWidthMatchParent, icon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return jl40.l(this.id, status.id) && jl40.l(this.name, status.name) && jl40.l(this.title, status.title) && jl40.l(this.subtitle, status.subtitle) && jl40.l(this.titleTextColor, status.titleTextColor) && jl40.l(this.subtitleTextColor, status.subtitleTextColor) && jl40.l(this.backgroundColor, status.backgroundColor) && jl40.l(this.action, status.action) && this.isWidthMatchParent == status.isWidthMatchParent && jl40.l(this.icon, status.icon);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            return this.icon.hashCode() + unr0.e((c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31, this.isWidthMatchParent);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        /* renamed from: isWidthMatchParent */
        public boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public String toString() {
            return "Status(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", backgroundColor=" + this.backgroundColor + ", action=" + this.action + ", isWidthMatchParent=" + this.isWidthMatchParent + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isWidthMatchParent ? 1 : 0);
            dest.writeParcelable(this.icon, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Status> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Status createFromParcel(Parcel parcel) {
                return new Status(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(Status.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(Status.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(Status.class.getClassLoader()), parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PlusThemedImage) parcel.readParcelable(Status.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Status[] newArray(int i) {
                return new Status[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010%J\u008a\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010\u0015J\u001a\u00100\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001dR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\"R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010%R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b\u000e\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b=\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b>\u0010%¨\u0006?"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$StatusAndFamily;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "", "isWidthMatchParent", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "familyAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component8", "()Z", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;ZLcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;)Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$StatusAndFamily;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "Z", "getBackgroundColor", "getFamilyAction", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusAndFamily implements PlusCardShortcut {
        public static final Parcelable.Creator<StatusAndFamily> CREATOR = new Creator();
        private final ShortcutAction action;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final ShortcutAction familyAction;
        private final String id;
        private final boolean isWidthMatchParent;
        private final String name;
        private final String subtitle;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public StatusAndFamily(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, ShortcutAction shortcutAction, boolean z, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction2) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.action = shortcutAction;
            this.isWidthMatchParent = z;
            this.backgroundColor = plusThemedColor3;
            this.familyAction = shortcutAction2;
        }

        public static /* synthetic */ StatusAndFamily copy$default(StatusAndFamily statusAndFamily, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, ShortcutAction shortcutAction, boolean z, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = statusAndFamily.id;
            }
            if ((i & 2) != 0) {
                str2 = statusAndFamily.name;
            }
            if ((i & 4) != 0) {
                str3 = statusAndFamily.title;
            }
            if ((i & 8) != 0) {
                str4 = statusAndFamily.subtitle;
            }
            if ((i & 16) != 0) {
                plusThemedColor = statusAndFamily.titleTextColor;
            }
            if ((i & 32) != 0) {
                plusThemedColor2 = statusAndFamily.subtitleTextColor;
            }
            if ((i & 64) != 0) {
                shortcutAction = statusAndFamily.action;
            }
            if ((i & 128) != 0) {
                z = statusAndFamily.isWidthMatchParent;
            }
            if ((i & 256) != 0) {
                plusThemedColor3 = statusAndFamily.backgroundColor;
            }
            if ((i & 512) != 0) {
                shortcutAction2 = statusAndFamily.familyAction;
            }
            PlusThemedColor plusThemedColor4 = plusThemedColor3;
            ShortcutAction shortcutAction3 = shortcutAction2;
            ShortcutAction shortcutAction4 = shortcutAction;
            boolean z2 = z;
            PlusThemedColor plusThemedColor5 = plusThemedColor;
            PlusThemedColor plusThemedColor6 = plusThemedColor2;
            return statusAndFamily.copy(str, str2, str3, str4, plusThemedColor5, plusThemedColor6, shortcutAction4, z2, plusThemedColor4, shortcutAction3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final ShortcutAction getFamilyAction() {
            return this.familyAction;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        /* renamed from: component7, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final PlusThemedColor<PlusColor> component9() {
            return this.backgroundColor;
        }

        public final StatusAndFamily copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, ShortcutAction action, boolean isWidthMatchParent, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction familyAction) {
            return new StatusAndFamily(id, name, title, subtitle, titleTextColor, subtitleTextColor, action, isWidthMatchParent, backgroundColor, familyAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusAndFamily)) {
                return false;
            }
            StatusAndFamily statusAndFamily = (StatusAndFamily) other;
            return jl40.l(this.id, statusAndFamily.id) && jl40.l(this.name, statusAndFamily.name) && jl40.l(this.title, statusAndFamily.title) && jl40.l(this.subtitle, statusAndFamily.subtitle) && jl40.l(this.titleTextColor, statusAndFamily.titleTextColor) && jl40.l(this.subtitleTextColor, statusAndFamily.subtitleTextColor) && jl40.l(this.action, statusAndFamily.action) && this.isWidthMatchParent == statusAndFamily.isWidthMatchParent && jl40.l(this.backgroundColor, statusAndFamily.backgroundColor) && jl40.l(this.familyAction, statusAndFamily.familyAction);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final ShortcutAction getFamilyAction() {
            return this.familyAction;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31);
            ShortcutAction shortcutAction = this.action;
            int c2 = vfc.c(this.backgroundColor, unr0.e((c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31, this.isWidthMatchParent), 31);
            ShortcutAction shortcutAction2 = this.familyAction;
            return c2 + (shortcutAction2 != null ? shortcutAction2.hashCode() : 0);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        /* renamed from: isWidthMatchParent */
        public boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public String toString() {
            return "StatusAndFamily(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", action=" + this.action + ", isWidthMatchParent=" + this.isWidthMatchParent + ", backgroundColor=" + this.backgroundColor + ", familyAction=" + this.familyAction + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isWidthMatchParent ? 1 : 0);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction2 = this.familyAction;
            if (shortcutAction2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction2.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StatusAndFamily> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StatusAndFamily createFromParcel(Parcel parcel) {
                return new StatusAndFamily(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(StatusAndFamily.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(StatusAndFamily.class.getClassLoader()), parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PlusThemedColor) parcel.readParcelable(StatusAndFamily.class.getClassLoader()), parcel.readInt() != 0 ? ShortcutAction.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StatusAndFamily[] newArray(int i) {
                return new StatusAndFamily[i];
            }
        }
    }
}
