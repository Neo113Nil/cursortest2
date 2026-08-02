package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.u0;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00013B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001eJB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b1\u0010\u001e¨\u00064"}, d2 = {"Lcom/yandex/passport/internal/properties/EsiaBindProperties;", "Lcom/yandex/passport/api/u0;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", ClidProvider.APPLICATION, "consumer", "scope", "<init>", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportTheme;", "component2", "()Lcom/yandex/passport/api/PassportUidImpl;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/properties/EsiaBindProperties;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Ljava/lang/String;", "getApplication", "getConsumer", "getScope", "Companion", "com/yandex/passport/internal/properties/h", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EsiaBindProperties implements u0, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_BIND_PROPERTIES = "esia-bind-properties";
    private final String application;
    private final String consumer;
    private final String scope;
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    public static final h Companion = new h();
    public static final Parcelable.Creator<EsiaBindProperties> CREATOR = new Creator();

    public EsiaBindProperties(PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, String str2, String str3) {
        this.theme = passportTheme;
        this.uid = passportUidImpl;
        this.application = str;
        this.consumer = str2;
        this.scope = str3;
    }

    public static /* synthetic */ EsiaBindProperties copy$default(EsiaBindProperties esiaBindProperties, PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            passportTheme = esiaBindProperties.theme;
        }
        if ((i & 2) != 0) {
            passportUidImpl = esiaBindProperties.uid;
        }
        if ((i & 4) != 0) {
            str = esiaBindProperties.application;
        }
        if ((i & 8) != 0) {
            str2 = esiaBindProperties.consumer;
        }
        if ((i & 16) != 0) {
            str3 = esiaBindProperties.scope;
        }
        String str4 = str3;
        String str5 = str;
        return esiaBindProperties.copy(passportTheme, passportUidImpl, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApplication() {
        return this.application;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConsumer() {
        return this.consumer;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final EsiaBindProperties copy(PassportTheme theme, PassportUidImpl uid, String application, String consumer, String scope) {
        return new EsiaBindProperties(theme, uid, application, consumer, scope);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsiaBindProperties)) {
            return false;
        }
        EsiaBindProperties esiaBindProperties = (EsiaBindProperties) other;
        return this.theme == esiaBindProperties.theme && jl40.l(this.uid, esiaBindProperties.uid) && jl40.l(this.application, esiaBindProperties.application) && jl40.l(this.consumer, esiaBindProperties.consumer) && jl40.l(this.scope, esiaBindProperties.scope);
    }

    @Override // com.yandex.passport.api.u0
    public String getApplication() {
        return this.application;
    }

    @Override // com.yandex.passport.api.u0
    public String getConsumer() {
        return this.consumer;
    }

    @Override // com.yandex.passport.api.u0
    public String getScope() {
        return this.scope;
    }

    @Override // com.yandex.passport.api.u0
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.scope.hashCode() + unr0.b(unr0.b((this.uid.hashCode() + (this.theme.hashCode() * 31)) * 31, 31, this.application), 31, this.consumer);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_BIND_PROPERTIES, this);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EsiaBindProperties(theme=");
        sb.append(this.theme);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", application=");
        sb.append(this.application);
        sb.append(", consumer=");
        sb.append(this.consumer);
        sb.append(", scope=");
        return b64.p(sb, this.scope, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.application);
        dest.writeString(this.consumer);
        dest.writeString(this.scope);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EsiaBindProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EsiaBindProperties createFromParcel(Parcel parcel) {
            return new EsiaBindProperties(PassportTheme.valueOf(parcel.readString()), PassportUidImpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EsiaBindProperties[] newArray(int i) {
            return new EsiaBindProperties[i];
        }
    }

    @Override // com.yandex.passport.api.u0
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
