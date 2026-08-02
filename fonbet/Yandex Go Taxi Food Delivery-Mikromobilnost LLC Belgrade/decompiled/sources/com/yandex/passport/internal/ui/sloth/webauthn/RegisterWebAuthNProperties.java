package com.yandex.passport.internal.ui.sloth.webauthn;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.jl40;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/webauthn/RegisterWebAuthNProperties;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/core/Uid;", "uid", "Lcom/yandex/passport/common/ui/AppTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "<init>", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/ui/AppTheme;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/core/Uid;", "component2", "()Lcom/yandex/passport/common/ui/AppTheme;", "copy", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/ui/AppTheme;)Lcom/yandex/passport/internal/ui/sloth/webauthn/RegisterWebAuthNProperties;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/core/Uid;", "getUid", "Lcom/yandex/passport/common/ui/AppTheme;", "getTheme", "Companion", "com/yandex/passport/internal/ui/sloth/webauthn/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RegisterWebAuthNProperties implements Parcelable {
    private static final String KEY_REGISTER_WEBAUTHN_PROPERTIES = "register_webauthn_props";
    private final AppTheme theme;
    private final Uid uid;
    public static final e Companion = new e();
    public static final int $stable = Uid.$stable;
    public static final Parcelable.Creator<RegisterWebAuthNProperties> CREATOR = new Creator();

    public RegisterWebAuthNProperties(Uid uid, AppTheme appTheme) {
        this.uid = uid;
        this.theme = appTheme;
    }

    public static /* synthetic */ RegisterWebAuthNProperties copy$default(RegisterWebAuthNProperties registerWebAuthNProperties, Uid uid, AppTheme appTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            uid = registerWebAuthNProperties.uid;
        }
        if ((i & 2) != 0) {
            appTheme = registerWebAuthNProperties.theme;
        }
        return registerWebAuthNProperties.copy(uid, appTheme);
    }

    /* renamed from: component1, reason: from getter */
    public final Uid getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final AppTheme getTheme() {
        return this.theme;
    }

    public final RegisterWebAuthNProperties copy(Uid uid, AppTheme theme) {
        return new RegisterWebAuthNProperties(uid, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterWebAuthNProperties)) {
            return false;
        }
        RegisterWebAuthNProperties registerWebAuthNProperties = (RegisterWebAuthNProperties) other;
        return jl40.l(this.uid, registerWebAuthNProperties.uid) && this.theme == registerWebAuthNProperties.theme;
    }

    public final AppTheme getTheme() {
        return this.theme;
    }

    public final Uid getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.theme.hashCode() + (this.uid.hashCode() * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_REGISTER_WEBAUTHN_PROPERTIES, this));
    }

    public String toString() {
        return "RegisterWebAuthNProperties(uid=" + this.uid + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.uid, flags);
        dest.writeString(this.theme.name());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegisterWebAuthNProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterWebAuthNProperties createFromParcel(Parcel parcel) {
            return new RegisterWebAuthNProperties((Uid) parcel.readParcelable(RegisterWebAuthNProperties.class.getClassLoader()), AppTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterWebAuthNProperties[] newArray(int i) {
            return new RegisterWebAuthNProperties[i];
        }
    }
}
