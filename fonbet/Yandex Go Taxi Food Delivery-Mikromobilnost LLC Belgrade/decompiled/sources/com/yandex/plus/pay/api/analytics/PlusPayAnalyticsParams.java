package com.yandex.plus.pay.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&'Ba\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b!\u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/yandex/plus/pay/api/analytics/PlusPayAnalyticsParams;", "Landroid/os/Parcelable;", "", "sessionId", "externalAnalyticsId", "", "Lcom/yandex/plus/pay/api/analytics/PlusPayTestId;", "externalTestIds", "externalTriggeredTestIds", "externalFlags", "", "clientParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;)V", "asString$pay_sdk_release", "()Ljava/lang/String;", "asString", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionId", "getExternalAnalyticsId", "Ljava/util/Set;", "getExternalTestIds", "()Ljava/util/Set;", "getExternalTriggeredTestIds", "getExternalFlags", "Ljava/util/Map;", "getClientParams", "()Ljava/util/Map;", "Companion", "a", "com/yandex/plus/pay/api/analytics/a", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayAnalyticsParams implements Parcelable {
    private final Map<String, String> clientParams;
    private final String externalAnalyticsId;
    private final Set<String> externalFlags;
    private final Set<PlusPayTestId> externalTestIds;
    private final Set<PlusPayTestId> externalTriggeredTestIds;
    private final String sessionId;
    public static final com.yandex.plus.pay.api.analytics.a Companion = new com.yandex.plus.pay.api.analytics.a();
    public static final Parcelable.Creator<PlusPayAnalyticsParams> CREATOR = new Creator();

    public static final class a {
        public String a;
        public Set b;
        public Set c;
        public final LinkedHashMap d = new LinkedHashMap();
    }

    private PlusPayAnalyticsParams(String str, String str2, Set<PlusPayTestId> set, Set<PlusPayTestId> set2, Set<String> set3, Map<String, String> map) {
        this.sessionId = str;
        this.externalAnalyticsId = str2;
        this.externalTestIds = set;
        this.externalTriggeredTestIds = set2;
        this.externalFlags = set3;
        this.clientParams = map;
    }

    public final String asString$pay_sdk_release() {
        StringBuilder sb = new StringBuilder("PlusPayAnalyticsParams(");
        sb.append(this.sessionId);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.externalAnalyticsId);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.externalTestIds);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.externalTriggeredTestIds);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.externalFlags);
        sb.append(Extension.FIX_SPACE);
        return smw0.n(sb, this.clientParams, ')');
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Map<String, String> getClientParams() {
        return this.clientParams;
    }

    public final String getExternalAnalyticsId() {
        return this.externalAnalyticsId;
    }

    public final Set<String> getExternalFlags() {
        return this.externalFlags;
    }

    public final Set<PlusPayTestId> getExternalTestIds() {
        return this.externalTestIds;
    }

    public final Set<PlusPayTestId> getExternalTriggeredTestIds() {
        return this.externalTriggeredTestIds;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.sessionId);
        dest.writeString(this.externalAnalyticsId);
        Set<PlusPayTestId> set = this.externalTestIds;
        if (set == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(set.size());
            Iterator<PlusPayTestId> it = set.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Set<PlusPayTestId> set2 = this.externalTriggeredTestIds;
        if (set2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(set2.size());
            Iterator<PlusPayTestId> it2 = set2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        Set<String> set3 = this.externalFlags;
        if (set3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(set3.size());
            Iterator<String> it3 = set3.iterator();
            while (it3.hasNext()) {
                dest.writeString(it3.next());
            }
        }
        Iterator x = qv10.x(this.clientParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayAnalyticsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayAnalyticsParams createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            LinkedHashSet linkedHashSet3 = null;
            int i = 0;
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashSet = new LinkedHashSet(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    linkedHashSet.add(PlusPayTestId.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashSet2 = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashSet2 = new LinkedHashSet(readInt2);
                for (int i3 = 0; i3 != readInt2; i3++) {
                    linkedHashSet2.add(PlusPayTestId.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                linkedHashSet3 = new LinkedHashSet(readInt3);
                for (int i4 = 0; i4 != readInt3; i4++) {
                    linkedHashSet3.add(parcel.readString());
                }
            }
            int readInt4 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
            while (i != readInt4) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new PlusPayAnalyticsParams(readString, readString2, linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashMap, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayAnalyticsParams[] newArray(int i) {
            return new PlusPayAnalyticsParams[i];
        }
    }

    public /* synthetic */ PlusPayAnalyticsParams(String str, String str2, Set set, Set set2, Set set3, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, set, set2, set3, map);
    }
}
