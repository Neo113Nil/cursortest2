package com.yandex.plus.home.api.alerts;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00011BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJd\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001e¨\u00062"}, d2 = {"Lcom/yandex/plus/home/api/alerts/PlusRedAlert;", "Landroid/os/Parcelable;", "", "id", "clickUrl", "", "payloads", "texts", "type", "Lcom/yandex/plus/home/api/alerts/PlusRedAlert$PlusAlertKind;", "kind", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/yandex/plus/home/api/alerts/PlusRedAlert$PlusAlertKind;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "component5", "component6", "()Lcom/yandex/plus/home/api/alerts/PlusRedAlert$PlusAlertKind;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/yandex/plus/home/api/alerts/PlusRedAlert$PlusAlertKind;)Lcom/yandex/plus/home/api/alerts/PlusRedAlert;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getClickUrl", "Ljava/util/Map;", "getPayloads", "getTexts", "getType", "Lcom/yandex/plus/home/api/alerts/PlusRedAlert$PlusAlertKind;", "getKind", "PlusAlertKind", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusRedAlert implements Parcelable {
    public static final Parcelable.Creator<PlusRedAlert> CREATOR = new Creator();
    private final String clickUrl;
    private final String id;
    private final PlusAlertKind kind;
    private final Map<String, String> payloads;
    private final Map<String, String> texts;
    private final String type;

    public PlusRedAlert(String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, PlusAlertKind plusAlertKind) {
        this.id = str;
        this.clickUrl = str2;
        this.payloads = map;
        this.texts = map2;
        this.type = str3;
        this.kind = plusAlertKind;
    }

    public static /* synthetic */ PlusRedAlert copy$default(PlusRedAlert plusRedAlert, String str, String str2, Map map, Map map2, String str3, PlusAlertKind plusAlertKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusRedAlert.id;
        }
        if ((i & 2) != 0) {
            str2 = plusRedAlert.clickUrl;
        }
        if ((i & 4) != 0) {
            map = plusRedAlert.payloads;
        }
        if ((i & 8) != 0) {
            map2 = plusRedAlert.texts;
        }
        if ((i & 16) != 0) {
            str3 = plusRedAlert.type;
        }
        if ((i & 32) != 0) {
            plusAlertKind = plusRedAlert.kind;
        }
        String str4 = str3;
        PlusAlertKind plusAlertKind2 = plusAlertKind;
        return plusRedAlert.copy(str, str2, map, map2, str4, plusAlertKind2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final Map<String, String> component3() {
        return this.payloads;
    }

    public final Map<String, String> component4() {
        return this.texts;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final PlusAlertKind getKind() {
        return this.kind;
    }

    public final PlusRedAlert copy(String id, String clickUrl, Map<String, String> payloads, Map<String, String> texts, String type, PlusAlertKind kind) {
        return new PlusRedAlert(id, clickUrl, payloads, texts, type, kind);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusRedAlert)) {
            return false;
        }
        PlusRedAlert plusRedAlert = (PlusRedAlert) other;
        return jl40.l(this.id, plusRedAlert.id) && jl40.l(this.clickUrl, plusRedAlert.clickUrl) && jl40.l(this.payloads, plusRedAlert.payloads) && jl40.l(this.texts, plusRedAlert.texts) && jl40.l(this.type, plusRedAlert.type) && this.kind == plusRedAlert.kind;
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final PlusAlertKind getKind() {
        return this.kind;
    }

    public final Map<String, String> getPayloads() {
        return this.payloads;
    }

    public final Map<String, String> getTexts() {
        return this.texts;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.kind.hashCode() + unr0.b(unr0.d(unr0.d(unr0.b(this.id.hashCode() * 31, 31, this.clickUrl), 31, this.payloads), 31, this.texts), 31, this.type);
    }

    public String toString() {
        return "PlusRedAlert(id=" + this.id + ", clickUrl=" + this.clickUrl + ", payloads=" + this.payloads + ", texts=" + this.texts + ", type=" + this.type + ", kind=" + this.kind + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.clickUrl);
        Iterator x = qv10.x(this.payloads, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        Iterator x2 = qv10.x(this.texts, dest);
        while (x2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) x2.next();
            dest.writeString((String) entry2.getKey());
            dest.writeString((String) entry2.getValue());
        }
        dest.writeString(this.type);
        this.kind.writeToParcel(dest, flags);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/plus/home/api/alerts/PlusRedAlert$PlusAlertKind;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "BUBBLE", "RED", "UNKNOWN", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlusAlertKind implements Parcelable {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PlusAlertKind[] $VALUES;
        public static final Parcelable.Creator<PlusAlertKind> CREATOR;
        public static final PlusAlertKind BUBBLE = new PlusAlertKind("BUBBLE", 0);
        public static final PlusAlertKind RED = new PlusAlertKind("RED", 1);
        public static final PlusAlertKind UNKNOWN = new PlusAlertKind("UNKNOWN", 2);

        private static final /* synthetic */ PlusAlertKind[] $values() {
            return new PlusAlertKind[]{BUBBLE, RED, UNKNOWN};
        }

        static {
            PlusAlertKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            CREATOR = new Creator();
        }

        private PlusAlertKind(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PlusAlertKind valueOf(String str) {
            return (PlusAlertKind) Enum.valueOf(PlusAlertKind.class, str);
        }

        public static PlusAlertKind[] values() {
            return (PlusAlertKind[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PlusAlertKind> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlusAlertKind createFromParcel(Parcel parcel) {
                return PlusAlertKind.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlusAlertKind[] newArray(int i) {
                return new PlusAlertKind[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusRedAlert> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusRedAlert createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = xvz.b(parcel, linkedHashMap, parcel.readString(), i2, 1);
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            while (i != readInt2) {
                i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
            }
            return new PlusRedAlert(readString, readString2, linkedHashMap, linkedHashMap2, parcel.readString(), PlusAlertKind.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusRedAlert[] newArray(int i) {
            return new PlusRedAlert[i];
        }
    }
}
