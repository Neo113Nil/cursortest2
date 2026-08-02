package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.settings.api.SettingsOpeningSource;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/settings/internal/screens/settings/presentation/SettingsScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/settings/api/SettingsOpeningSource;", "source", "<init>", "(Lcom/ybsdk/feature/settings/api/SettingsOpeningSource;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/ybsdk/feature/settings/api/SettingsOpeningSource;", "getSource", "()Lcom/ybsdk/feature/settings/api/SettingsOpeningSource;", "feature-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsScreenParams implements ScreenParams {
    public static final Parcelable.Creator<SettingsScreenParams> CREATOR = new Creator();
    private final SettingsOpeningSource source;

    public SettingsScreenParams(SettingsOpeningSource settingsOpeningSource) {
        this.source = settingsOpeningSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SettingsOpeningSource getSource() {
        return this.source;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.source.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SettingsScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingsScreenParams createFromParcel(Parcel parcel) {
            return new SettingsScreenParams(SettingsOpeningSource.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingsScreenParams[] newArray(int i) {
            return new SettingsScreenParams[i];
        }
    }
}
