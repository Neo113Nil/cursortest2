package com.yandex.passport.internal.ui.sloth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/StandaloneSlothProperties;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/ui/AppTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/sloth/data/SlothParams;", "slothParams", "<init>", "(Lcom/yandex/passport/common/ui/AppTheme;Lcom/yandex/passport/sloth/data/SlothParams;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/ui/AppTheme;", "component2", "()Lcom/yandex/passport/sloth/data/SlothParams;", "copy", "(Lcom/yandex/passport/common/ui/AppTheme;Lcom/yandex/passport/sloth/data/SlothParams;)Lcom/yandex/passport/internal/ui/sloth/StandaloneSlothProperties;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/ui/AppTheme;", "getTheme", "Lcom/yandex/passport/sloth/data/SlothParams;", "getSlothParams", "Companion", "com/yandex/passport/internal/ui/sloth/z", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StandaloneSlothProperties implements Parcelable {
    public static final int $stable = 8;
    public static final String KEY_STANDALONE_SLOTH_PROPERTIES = "StandaloneSlothProperties";
    private final SlothParams slothParams;
    private final AppTheme theme;
    public static final z Companion = new z();
    public static final Parcelable.Creator<StandaloneSlothProperties> CREATOR = new Creator();

    public StandaloneSlothProperties(AppTheme appTheme, SlothParams slothParams) {
        this.theme = appTheme;
        this.slothParams = slothParams;
    }

    public static /* synthetic */ StandaloneSlothProperties copy$default(StandaloneSlothProperties standaloneSlothProperties, AppTheme appTheme, SlothParams slothParams, int i, Object obj) {
        if ((i & 1) != 0) {
            appTheme = standaloneSlothProperties.theme;
        }
        if ((i & 2) != 0) {
            slothParams = standaloneSlothProperties.slothParams;
        }
        return standaloneSlothProperties.copy(appTheme, slothParams);
    }

    /* renamed from: component1, reason: from getter */
    public final AppTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final SlothParams getSlothParams() {
        return this.slothParams;
    }

    public final StandaloneSlothProperties copy(AppTheme theme, SlothParams slothParams) {
        return new StandaloneSlothProperties(theme, slothParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandaloneSlothProperties)) {
            return false;
        }
        StandaloneSlothProperties standaloneSlothProperties = (StandaloneSlothProperties) other;
        return this.theme == standaloneSlothProperties.theme && jl40.l(this.slothParams, standaloneSlothProperties.slothParams);
    }

    public final SlothParams getSlothParams() {
        return this.slothParams;
    }

    public final AppTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.slothParams.hashCode() + (this.theme.hashCode() * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_STANDALONE_SLOTH_PROPERTIES, this));
    }

    public String toString() {
        return "StandaloneSlothProperties(theme=" + this.theme + ", slothParams=" + this.slothParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        dest.writeParcelable(this.slothParams, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StandaloneSlothProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StandaloneSlothProperties createFromParcel(Parcel parcel) {
            return new StandaloneSlothProperties(AppTheme.valueOf(parcel.readString()), (SlothParams) parcel.readParcelable(StandaloneSlothProperties.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StandaloneSlothProperties[] newArray(int i) {
            return new StandaloneSlothProperties[i];
        }
    }
}
