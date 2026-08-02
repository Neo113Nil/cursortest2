package com.yandex.passport.internal.ui.account_upgrade;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lcom/yandex/passport/internal/ui/account_upgrade/UpgraderExtras;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/core/Uid;", "uid", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "<init>", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/api/PassportTheme;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/core/Uid;", "component2", "()Lcom/yandex/passport/api/PassportTheme;", "copy", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/api/PassportTheme;)Lcom/yandex/passport/internal/ui/account_upgrade/UpgraderExtras;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/core/Uid;", "getUid", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Companion", "com/yandex/passport/internal/ui/account_upgrade/k", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UpgraderExtras implements Parcelable {
    private static final String KEY_UPGRADER_EXTRAS = "key-upgrader-extras";
    private final PassportTheme theme;
    private final Uid uid;
    public static final k Companion = new k();
    public static final int $stable = Uid.$stable;
    public static final Parcelable.Creator<UpgraderExtras> CREATOR = new Creator();

    public UpgraderExtras(Uid uid, PassportTheme passportTheme) {
        this.uid = uid;
        this.theme = passportTheme;
    }

    public static /* synthetic */ UpgraderExtras copy$default(UpgraderExtras upgraderExtras, Uid uid, PassportTheme passportTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            uid = upgraderExtras.uid;
        }
        if ((i & 2) != 0) {
            passportTheme = upgraderExtras.theme;
        }
        return upgraderExtras.copy(uid, passportTheme);
    }

    /* renamed from: component1, reason: from getter */
    public final Uid getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    public final UpgraderExtras copy(Uid uid, PassportTheme theme) {
        return new UpgraderExtras(uid, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgraderExtras)) {
            return false;
        }
        UpgraderExtras upgraderExtras = (UpgraderExtras) other;
        return jl40.l(this.uid, upgraderExtras.uid) && this.theme == upgraderExtras.theme;
    }

    public final PassportTheme getTheme() {
        return this.theme;
    }

    public final Uid getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.theme.hashCode() + (this.uid.hashCode() * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_UPGRADER_EXTRAS, this));
    }

    public String toString() {
        return "UpgraderExtras(uid=" + this.uid + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.uid, flags);
        dest.writeString(this.theme.name());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UpgraderExtras> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpgraderExtras createFromParcel(Parcel parcel) {
            return new UpgraderExtras((Uid) parcel.readParcelable(UpgraderExtras.class.getClassLoader()), PassportTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpgraderExtras[] newArray(int i) {
            return new UpgraderExtras[i];
        }
    }
}
