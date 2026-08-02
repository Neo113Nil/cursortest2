package ru.ok.android.externcalls.analytics.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import xsna.epx;
import xsna.n23;
import xsna.n6j;
import xsna.xe9;
import xsna.y57;
import xsna.zcl;

/* compiled from: EventChannel.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class EventChannel implements Parcelable {
    private final String apiMethod;
    private final String application;
    private final String collector;
    private final boolean isExternal;
    private final String key;
    private final String platform;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EventChannel> CREATOR = new Parcelable.Creator<EventChannel>() { // from class: ru.ok.android.externcalls.analytics.internal.event.EventChannel$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public EventChannel createFromParcel(Parcel parcel) {
            if (parcel == null) {
                return null;
            }
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            return new EventChannel(readString, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() > 0);
        }

        @Override // android.os.Parcelable.Creator
        public EventChannel[] newArray(int i) {
            return new EventChannel[i];
        }
    };

    /* compiled from: EventChannel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public EventChannel(String str, String str2, String str3, String str4, boolean z) {
        this.apiMethod = str;
        this.collector = str2;
        this.application = str3;
        this.platform = str4;
        this.isExternal = z;
        this.key = y57.a("m_", str, "_c_", str2 == null ? "" : str2);
    }

    public static /* synthetic */ EventChannel copy$default(EventChannel eventChannel, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventChannel.apiMethod;
        }
        if ((i & 2) != 0) {
            str2 = eventChannel.collector;
        }
        if ((i & 4) != 0) {
            str3 = eventChannel.application;
        }
        if ((i & 8) != 0) {
            str4 = eventChannel.platform;
        }
        if ((i & 16) != 0) {
            z = eventChannel.isExternal;
        }
        boolean z2 = z;
        String str5 = str3;
        return eventChannel.copy(str, str2, str5, str4, z2);
    }

    public final String component1() {
        return this.apiMethod;
    }

    public final String component2() {
        return this.collector;
    }

    public final String component3() {
        return this.application;
    }

    public final String component4() {
        return this.platform;
    }

    public final boolean component5() {
        return this.isExternal;
    }

    public final EventChannel copy(String str, String str2, String str3, String str4, boolean z) {
        return new EventChannel(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventChannel)) {
            return false;
        }
        EventChannel eventChannel = (EventChannel) obj;
        return epx.f(this.apiMethod, eventChannel.apiMethod) && epx.f(this.collector, eventChannel.collector) && epx.f(this.application, eventChannel.application) && epx.f(this.platform, eventChannel.platform) && this.isExternal == eventChannel.isExternal;
    }

    public final String getApiMethod() {
        return this.apiMethod;
    }

    public final String getApplication() {
        return this.application;
    }

    public final String getCollector() {
        return this.collector;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        int hashCode = this.apiMethod.hashCode() * 31;
        String str = this.collector;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.application;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        return Boolean.hashCode(this.isExternal) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    public final boolean matches(CallAnalyticsEvent callAnalyticsEvent) {
        return epx.f(callAnalyticsEvent.getApiMethodName(), this.apiMethod) && epx.f(callAnalyticsEvent.getCollector(), this.collector);
    }

    public String toString() {
        String str = this.apiMethod;
        String str2 = this.collector;
        String str3 = this.application;
        String str4 = this.platform;
        boolean z = this.isExternal;
        StringBuilder a = xe9.a("EventChannel(apiMethod=", str, ", collector=", str2, ", application=");
        n6j.b(a, str3, ", platform=", str4, ", isExternal=");
        return n23.b(a, z, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.apiMethod);
        parcel.writeString(this.collector);
        parcel.writeString(this.application);
        parcel.writeString(this.platform);
        parcel.writeInt(this.isExternal ? 1 : 0);
    }

    public /* synthetic */ EventChannel(String str, String str2, String str3, String str4, boolean z, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z);
    }
}
