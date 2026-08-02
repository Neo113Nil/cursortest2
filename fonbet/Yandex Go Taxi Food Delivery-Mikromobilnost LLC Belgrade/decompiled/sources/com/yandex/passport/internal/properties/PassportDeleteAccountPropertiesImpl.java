package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.o0;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.wwg;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00015B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010!¨\u00066"}, d2 = {"Lcom/yandex/passport/internal/properties/PassportDeleteAccountPropertiesImpl;", "Lcom/yandex/passport/api/o0;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "progressProperties", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "", "", "headers", "<init>", "(Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;Lcom/yandex/passport/api/PassportTheme;Ljava/util/Map;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportUidImpl;", "component2", "()Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "component3", "()Lcom/yandex/passport/api/PassportTheme;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;Lcom/yandex/passport/api/PassportTheme;Ljava/util/Map;)Lcom/yandex/passport/internal/properties/PassportDeleteAccountPropertiesImpl;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Lcom/yandex/passport/internal/properties/ProgressPropertiesImpl;", "getProgressProperties", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Ljava/util/Map;", "getHeaders", "Companion", "com/yandex/passport/internal/properties/k", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportDeleteAccountPropertiesImpl implements o0, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_DELETE_ACCOUNT_PROPERTIES = "passport-delete-account-properties";
    private final Map<String, String> headers;
    private final ProgressPropertiesImpl progressProperties;
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    public static final k Companion = new k();
    public static final Parcelable.Creator<PassportDeleteAccountPropertiesImpl> CREATOR = new Creator();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PassportDeleteAccountPropertiesImpl(PassportUidImpl passportUidImpl, ProgressPropertiesImpl progressPropertiesImpl, PassportTheme passportTheme, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passportUidImpl, progressPropertiesImpl, (i & 4) != 0 ? PassportTheme.FOLLOW_SYSTEM : passportTheme, (i & 8) != 0 ? kotlin.collections.b.f() : map);
        if ((i & 2) != 0) {
            ProgressPropertiesImpl.Companion.getClass();
            progressPropertiesImpl = m.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PassportDeleteAccountPropertiesImpl copy$default(PassportDeleteAccountPropertiesImpl passportDeleteAccountPropertiesImpl, PassportUidImpl passportUidImpl, ProgressPropertiesImpl progressPropertiesImpl, PassportTheme passportTheme, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            passportUidImpl = passportDeleteAccountPropertiesImpl.uid;
        }
        if ((i & 2) != 0) {
            progressPropertiesImpl = passportDeleteAccountPropertiesImpl.progressProperties;
        }
        if ((i & 4) != 0) {
            passportTheme = passportDeleteAccountPropertiesImpl.theme;
        }
        if ((i & 8) != 0) {
            map = passportDeleteAccountPropertiesImpl.headers;
        }
        return passportDeleteAccountPropertiesImpl.copy(passportUidImpl, progressPropertiesImpl, passportTheme, map);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final ProgressPropertiesImpl getProgressProperties() {
        return this.progressProperties;
    }

    /* renamed from: component3, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    public final PassportDeleteAccountPropertiesImpl copy(PassportUidImpl uid, ProgressPropertiesImpl progressProperties, PassportTheme theme, Map<String, String> headers) {
        return new PassportDeleteAccountPropertiesImpl(uid, progressProperties, theme, headers);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportDeleteAccountPropertiesImpl)) {
            return false;
        }
        PassportDeleteAccountPropertiesImpl passportDeleteAccountPropertiesImpl = (PassportDeleteAccountPropertiesImpl) other;
        return jl40.l(this.uid, passportDeleteAccountPropertiesImpl.uid) && jl40.l(this.progressProperties, passportDeleteAccountPropertiesImpl.progressProperties) && this.theme == passportDeleteAccountPropertiesImpl.theme && jl40.l(this.headers, passportDeleteAccountPropertiesImpl.headers);
    }

    @Override // com.yandex.passport.api.o0
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.yandex.passport.api.o0
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.headers.hashCode() + ((this.theme.hashCode() + ((this.progressProperties.hashCode() + (this.uid.hashCode() * 31)) * 31)) * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_DELETE_ACCOUNT_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PassportDeleteAccountPropertiesImpl(uid=");
        sb.append(this.uid);
        sb.append(", progressProperties=");
        sb.append(this.progressProperties);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", headers=");
        return smw0.n(sb, this.headers, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.uid.writeToParcel(dest, flags);
        this.progressProperties.writeToParcel(dest, flags);
        dest.writeString(this.theme.name());
        Iterator x = qv10.x(this.headers, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportDeleteAccountPropertiesImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportDeleteAccountPropertiesImpl createFromParcel(Parcel parcel) {
            PassportUidImpl createFromParcel = PassportUidImpl.CREATOR.createFromParcel(parcel);
            ProgressPropertiesImpl createFromParcel2 = ProgressPropertiesImpl.CREATOR.createFromParcel(parcel);
            PassportTheme valueOf = PassportTheme.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new PassportDeleteAccountPropertiesImpl(createFromParcel, createFromParcel2, valueOf, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportDeleteAccountPropertiesImpl[] newArray(int i) {
            return new PassportDeleteAccountPropertiesImpl[i];
        }
    }

    @Override // com.yandex.passport.api.o0
    public ProgressPropertiesImpl getProgressProperties() {
        return this.progressProperties;
    }

    @Override // com.yandex.passport.api.o0
    public PassportUidImpl getUid() {
        return this.uid;
    }

    public PassportDeleteAccountPropertiesImpl(PassportUidImpl passportUidImpl, ProgressPropertiesImpl progressPropertiesImpl, PassportTheme passportTheme, Map<String, String> map) {
        this.uid = passportUidImpl;
        this.progressProperties = progressPropertiesImpl;
        this.theme = passportTheme;
        this.headers = map;
    }
}
