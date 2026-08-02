package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.x4e;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014R \u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ybsdk/deeplink/generated/CloseSdkWithResultAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "scenario", "", "additionalData", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/ybsdk/deeplink/generated/CloseSdkWithResultAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScenario", "Ljava/util/Map;", "getAdditionalData", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "snb1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CloseSdkWithResultAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<CloseSdkWithResultAction> CREATOR = new Creator();
    private final Map<String, String> additionalData;
    private final Uri deeplinkUri;
    private final String scenario;

    public CloseSdkWithResultAction(String str, Map<String, String> map) {
        this.scenario = str;
        this.additionalData = map;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/close_sdk_with_result", "scenario", str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                j.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        this.deeplinkUri = j.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CloseSdkWithResultAction copy$default(CloseSdkWithResultAction closeSdkWithResultAction, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closeSdkWithResultAction.scenario;
        }
        if ((i & 2) != 0) {
            map = closeSdkWithResultAction.additionalData;
        }
        return closeSdkWithResultAction.copy(str, map);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final Map<String, String> component2() {
        return this.additionalData;
    }

    public final CloseSdkWithResultAction copy(String scenario, Map<String, String> additionalData) {
        return new CloseSdkWithResultAction(scenario, additionalData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseSdkWithResultAction)) {
            return false;
        }
        CloseSdkWithResultAction closeSdkWithResultAction = (CloseSdkWithResultAction) other;
        return jl40.l(this.scenario, closeSdkWithResultAction.scenario) && jl40.l(this.additionalData, closeSdkWithResultAction.additionalData);
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int hashCode = this.scenario.hashCode() * 31;
        Map<String, String> map = this.additionalData;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return xvz.j("CloseSdkWithResultAction(scenario=", this.scenario, ", additionalData=", Extension.C_BRAKE, this.additionalData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.scenario);
        Map<String, String> map = this.additionalData;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator s = x4e.s(dest, 1, map);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CloseSdkWithResultAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CloseSdkWithResultAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CloseSdkWithResultAction(readString, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CloseSdkWithResultAction[] newArray(int i) {
            return new CloseSdkWithResultAction[i];
        }
    }

    public /* synthetic */ CloseSdkWithResultAction(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
