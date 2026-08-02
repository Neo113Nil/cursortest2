package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.e2;
import com.yandex.passport.internal.entities.Filter;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00015B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010 ¨\u00066"}, d2 = {"Lcom/yandex/passport/internal/properties/SocialBindProperties;", "Lcom/yandex/passport/api/e2;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/entities/Filter;", "filter", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "socialBindingConfiguration", "<init>", "(Lcom/yandex/passport/internal/entities/Filter;Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/api/PassportSocialConfiguration;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/entities/Filter;", "component2", "()Lcom/yandex/passport/api/PassportTheme;", "component3", "()Lcom/yandex/passport/api/PassportUidImpl;", "component4", "()Lcom/yandex/passport/api/PassportSocialConfiguration;", "copy", "(Lcom/yandex/passport/internal/entities/Filter;Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/api/PassportSocialConfiguration;)Lcom/yandex/passport/internal/properties/SocialBindProperties;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/entities/Filter;", "getFilter", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "getSocialBindingConfiguration", "Companion", "com/yandex/passport/internal/properties/v", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SocialBindProperties implements e2, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_BIND_PROPERTIES = "passport-bind-properties";
    private final Filter filter;
    private final PassportSocialConfiguration socialBindingConfiguration;
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    public static final v Companion = new v();
    public static final Parcelable.Creator<SocialBindProperties> CREATOR = new Creator();

    public SocialBindProperties(Filter filter, PassportTheme passportTheme, PassportUidImpl passportUidImpl, PassportSocialConfiguration passportSocialConfiguration) {
        this.filter = filter;
        this.theme = passportTheme;
        this.uid = passportUidImpl;
        this.socialBindingConfiguration = passportSocialConfiguration;
    }

    public static /* synthetic */ SocialBindProperties copy$default(SocialBindProperties socialBindProperties, Filter filter, PassportTheme passportTheme, PassportUidImpl passportUidImpl, PassportSocialConfiguration passportSocialConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            filter = socialBindProperties.filter;
        }
        if ((i & 2) != 0) {
            passportTheme = socialBindProperties.theme;
        }
        if ((i & 4) != 0) {
            passportUidImpl = socialBindProperties.uid;
        }
        if ((i & 8) != 0) {
            passportSocialConfiguration = socialBindProperties.socialBindingConfiguration;
        }
        return socialBindProperties.copy(filter, passportTheme, passportUidImpl, passportSocialConfiguration);
    }

    /* renamed from: component1, reason: from getter */
    public final Filter getFilter() {
        return this.filter;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component3, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component4, reason: from getter */
    public final PassportSocialConfiguration getSocialBindingConfiguration() {
        return this.socialBindingConfiguration;
    }

    public final SocialBindProperties copy(Filter filter, PassportTheme theme, PassportUidImpl uid, PassportSocialConfiguration socialBindingConfiguration) {
        return new SocialBindProperties(filter, theme, uid, socialBindingConfiguration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialBindProperties)) {
            return false;
        }
        SocialBindProperties socialBindProperties = (SocialBindProperties) other;
        return jl40.l(this.filter, socialBindProperties.filter) && this.theme == socialBindProperties.theme && jl40.l(this.uid, socialBindProperties.uid) && this.socialBindingConfiguration == socialBindProperties.socialBindingConfiguration;
    }

    @Override // com.yandex.passport.api.e2
    public PassportSocialConfiguration getSocialBindingConfiguration() {
        return this.socialBindingConfiguration;
    }

    @Override // com.yandex.passport.api.e2
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.socialBindingConfiguration.hashCode() + ((this.uid.hashCode() + ((this.theme.hashCode() + (this.filter.hashCode() * 31)) * 31)) * 31);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_BIND_PROPERTIES, this);
        return bundle;
    }

    public String toString() {
        return "SocialBindProperties(filter=" + this.filter + ", theme=" + this.theme + ", uid=" + this.uid + ", socialBindingConfiguration=" + this.socialBindingConfiguration + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.filter.writeToParcel(dest, flags);
        dest.writeString(this.theme.name());
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.socialBindingConfiguration.name());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SocialBindProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialBindProperties createFromParcel(Parcel parcel) {
            return new SocialBindProperties(Filter.CREATOR.createFromParcel(parcel), PassportTheme.valueOf(parcel.readString()), PassportUidImpl.CREATOR.createFromParcel(parcel), PassportSocialConfiguration.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialBindProperties[] newArray(int i) {
            return new SocialBindProperties[i];
        }
    }

    @Override // com.yandex.passport.api.e2
    public Filter getFilter() {
        return this.filter;
    }

    @Override // com.yandex.passport.api.e2
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
