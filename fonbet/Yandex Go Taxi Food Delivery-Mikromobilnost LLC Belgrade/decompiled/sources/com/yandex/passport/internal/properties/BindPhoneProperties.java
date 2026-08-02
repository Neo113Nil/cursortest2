package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportPartition;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.m3;
import com.yandex.passport.api.r1;
import com.yandex.passport.api.s1;
import com.yandex.passport.internal.entities.Partitions;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.wwg;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002JKBW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001c\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-Jf\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0010HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b1\u0010\u001fJ\u001a\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010%\"\u0004\b<\u0010=R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010>\u001a\u0004\b\u000b\u0010'\"\u0004\b?\u0010@R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010)R \u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010+R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010-¨\u0006L"}, d2 = {"Lcom/yandex/passport/internal/properties/BindPhoneProperties;", "Lcom/yandex/passport/api/c0;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/b0;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", "phoneNumber", "", "isPhoneEditable", "Lcom/yandex/passport/internal/properties/WebAmProperties;", "webAmProperties", "Lcom/yandex/passport/api/s1;", "partitions", "", "headers", "<init>", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;ZLcom/yandex/passport/internal/properties/WebAmProperties;Lcom/yandex/passport/api/s1;Ljava/util/Map;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportTheme;", "component2", "()Lcom/yandex/passport/api/PassportUidImpl;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "()Lcom/yandex/passport/internal/properties/WebAmProperties;", "component6", "()Lcom/yandex/passport/api/s1;", "component7", "()Ljava/util/Map;", "copy", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;ZLcom/yandex/passport/internal/properties/WebAmProperties;Lcom/yandex/passport/api/s1;Ljava/util/Map;)Lcom/yandex/passport/internal/properties/BindPhoneProperties;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Ljava/lang/String;", "getPhoneNumber", "setPhoneNumber", "(Ljava/lang/String;)V", "Z", "setPhoneEditable", "(Z)V", "Lcom/yandex/passport/internal/properties/WebAmProperties;", "getWebAmProperties", "Lcom/yandex/passport/api/s1;", "getPartitions", "getPartitions$annotations", "()V", "Ljava/util/Map;", "getHeaders", "Companion", "a", "com/yandex/passport/internal/properties/f", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BindPhoneProperties implements com.yandex.passport.api.c0, Parcelable, com.yandex.passport.internal.b0 {
    public static final int $stable = 8;
    private static final String KEY_BIND_PHONE_PROPERTIES = "bind_phone_properties";
    private final Map<String, String> headers;
    private boolean isPhoneEditable;
    private final s1 partitions;
    private String phoneNumber;
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    private final WebAmProperties webAmProperties;
    public static final f Companion = new f();
    public static final Parcelable.Creator<BindPhoneProperties> CREATOR = new Creator();

    public static final class a implements com.yandex.passport.api.c0 {
        public k2 b;
        public String c;
        public final s1 x;
        public final Map y;
        public PassportTheme a = PassportTheme.FOLLOW_SYSTEM;
        public final boolean w = true;

        public a() {
            s1.v5.getClass();
            this.x = r1.b;
            this.y = kotlin.collections.b.f();
        }

        public final a a(String str) {
            this.c = str;
            return this;
        }

        public final a b(PassportTheme passportTheme) {
            this.a = passportTheme;
            return this;
        }

        public final a c(PassportUidImpl passportUidImpl) {
            this.b = passportUidImpl;
            return this;
        }

        @Override // com.yandex.passport.api.c0
        public final Map getHeaders() {
            return this.y;
        }

        @Override // com.yandex.passport.api.c0
        public final s1 getPartitions() {
            return this.x;
        }

        @Override // com.yandex.passport.api.c0
        public final String getPhoneNumber() {
            return this.c;
        }

        @Override // com.yandex.passport.api.c0, com.yandex.passport.internal.b0
        public final PassportTheme getTheme() {
            return this.a;
        }

        @Override // com.yandex.passport.api.c0
        public final k2 getUid() {
            k2 k2Var = this.b;
            if (k2Var != null) {
                return k2Var;
            }
            return null;
        }

        @Override // com.yandex.passport.api.c0
        public final m3 getWebAmProperties() {
            return null;
        }

        @Override // com.yandex.passport.api.c0
        public final boolean isPhoneEditable() {
            return this.w;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BindPhoneProperties(PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, boolean z, WebAmProperties webAmProperties, s1 s1Var, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passportTheme, passportUidImpl, r3, r4, webAmProperties, s1Var, (i & 64) != 0 ? kotlin.collections.b.f() : map);
        String str2 = (i & 4) != 0 ? null : str;
        boolean z2 = (i & 8) != 0 ? false : z;
        if ((i & 32) != 0) {
            s1.v5.getClass();
            s1Var = r1.b;
        }
    }

    public static /* synthetic */ BindPhoneProperties copy$default(BindPhoneProperties bindPhoneProperties, PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, boolean z, WebAmProperties webAmProperties, s1 s1Var, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            passportTheme = bindPhoneProperties.theme;
        }
        if ((i & 2) != 0) {
            passportUidImpl = bindPhoneProperties.uid;
        }
        if ((i & 4) != 0) {
            str = bindPhoneProperties.phoneNumber;
        }
        if ((i & 8) != 0) {
            z = bindPhoneProperties.isPhoneEditable;
        }
        if ((i & 16) != 0) {
            webAmProperties = bindPhoneProperties.webAmProperties;
        }
        if ((i & 32) != 0) {
            s1Var = bindPhoneProperties.partitions;
        }
        if ((i & 64) != 0) {
            map = bindPhoneProperties.headers;
        }
        s1 s1Var2 = s1Var;
        Map map2 = map;
        WebAmProperties webAmProperties2 = webAmProperties;
        String str2 = str;
        return bindPhoneProperties.copy(passportTheme, passportUidImpl, str2, z, webAmProperties2, s1Var2, map2);
    }

    public static /* synthetic */ void getPartitions$annotations() {
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
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPhoneEditable() {
        return this.isPhoneEditable;
    }

    /* renamed from: component5, reason: from getter */
    public final WebAmProperties getWebAmProperties() {
        return this.webAmProperties;
    }

    /* renamed from: component6, reason: from getter */
    public final s1 getPartitions() {
        return this.partitions;
    }

    public final Map<String, String> component7() {
        return this.headers;
    }

    public final BindPhoneProperties copy(PassportTheme theme, PassportUidImpl uid, String phoneNumber, boolean isPhoneEditable, WebAmProperties webAmProperties, s1 partitions, Map<String, String> headers) {
        return new BindPhoneProperties(theme, uid, phoneNumber, isPhoneEditable, webAmProperties, partitions, headers);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindPhoneProperties)) {
            return false;
        }
        BindPhoneProperties bindPhoneProperties = (BindPhoneProperties) other;
        return this.theme == bindPhoneProperties.theme && jl40.l(this.uid, bindPhoneProperties.uid) && jl40.l(this.phoneNumber, bindPhoneProperties.phoneNumber) && this.isPhoneEditable == bindPhoneProperties.isPhoneEditable && jl40.l(this.webAmProperties, bindPhoneProperties.webAmProperties) && jl40.l(this.partitions, bindPhoneProperties.partitions) && jl40.l(this.headers, bindPhoneProperties.headers);
    }

    @Override // com.yandex.passport.api.c0
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.yandex.passport.api.c0
    public s1 getPartitions() {
        return this.partitions;
    }

    @Override // com.yandex.passport.api.c0
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // com.yandex.passport.api.c0, com.yandex.passport.internal.b0
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = (this.uid.hashCode() + (this.theme.hashCode() * 31)) * 31;
        String str = this.phoneNumber;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isPhoneEditable);
        WebAmProperties webAmProperties = this.webAmProperties;
        int hashCode2 = webAmProperties != null ? webAmProperties.hashCode() : 0;
        return this.headers.hashCode() + ((this.partitions.hashCode() + ((e + hashCode2) * 31)) * 31);
    }

    @Override // com.yandex.passport.api.c0
    public boolean isPhoneEditable() {
        return this.isPhoneEditable;
    }

    public void setPhoneEditable(boolean z) {
        this.isPhoneEditable = z;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_BIND_PHONE_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BindPhoneProperties(theme=");
        sb.append(this.theme);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", isPhoneEditable=");
        sb.append(this.isPhoneEditable);
        sb.append(", webAmProperties=");
        sb.append(this.webAmProperties);
        sb.append(", partitions=");
        sb.append(this.partitions);
        sb.append(", headers=");
        return smw0.n(sb, this.headers, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.phoneNumber);
        dest.writeInt(this.isPhoneEditable ? 1 : 0);
        WebAmProperties webAmProperties = this.webAmProperties;
        if (webAmProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            webAmProperties.writeToParcel(dest, flags);
        }
        s1 s1Var = this.partitions;
        ArrayList arrayList = new ArrayList(tcc.n(s1Var, 10));
        Iterator it = s1Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((PassportPartition) it.next()).m240unboximpl());
        }
        dest.writeStringList(arrayList);
        Iterator x = qv10.x(this.headers, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BindPhoneProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindPhoneProperties createFromParcel(Parcel parcel) {
            int i;
            PassportTheme valueOf = PassportTheme.valueOf(parcel.readString());
            PassportUidImpl createFromParcel = PassportUidImpl.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int i2 = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            WebAmProperties createFromParcel2 = parcel.readInt() == 0 ? null : WebAmProperties.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(PassportPartition.m231boximpl(PassportPartition.m232constructorimpl((String) it.next())));
            }
            Partitions partitions = new Partitions(arrayList2);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (i2 != readInt) {
                i2 = xvz.b(parcel, linkedHashMap, parcel.readString(), i2, i);
            }
            return new BindPhoneProperties(valueOf, createFromParcel, readString, z, createFromParcel2, partitions, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindPhoneProperties[] newArray(int i) {
            return new BindPhoneProperties[i];
        }
    }

    @Override // com.yandex.passport.api.c0
    public PassportUidImpl getUid() {
        return this.uid;
    }

    @Override // com.yandex.passport.api.c0
    public WebAmProperties getWebAmProperties() {
        return this.webAmProperties;
    }

    public BindPhoneProperties(PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, boolean z, WebAmProperties webAmProperties, s1 s1Var, Map<String, String> map) {
        this.theme = passportTheme;
        this.uid = passportUidImpl;
        this.phoneNumber = str;
        this.isPhoneEditable = z;
        this.webAmProperties = webAmProperties;
        this.partitions = s1Var;
        this.headers = map;
    }
}
