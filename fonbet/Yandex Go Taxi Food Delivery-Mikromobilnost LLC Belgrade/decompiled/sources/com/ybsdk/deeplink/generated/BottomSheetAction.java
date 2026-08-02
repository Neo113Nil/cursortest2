package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001/B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JJ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018R \u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/ybsdk/deeplink/generated/BottomSheetAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "target", "agreementId", "skeletonId", "", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/ybsdk/deeplink/generated/BottomSheetAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarget", "getAgreementId", "getSkeletonId", "Ljava/util/Map;", "getAdditionalData", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "hab1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BottomSheetAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<BottomSheetAction> CREATOR = new Creator();
    private final Map<String, String> additionalData;
    private final String agreementId;
    private final Uri deeplinkUri;
    private final String skeletonId;
    private final String target;

    public BottomSheetAction(String str, String str2, String str3, Map<String, String> map) {
        this.target = str;
        this.agreementId = str2;
        this.skeletonId = str3;
        this.additionalData = map;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/bottom_sheet", "target", str);
        if (str2 != null) {
            j.appendQueryParameter("agreement_id", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("skeleton_id", str3);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                j.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        this.deeplinkUri = j.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BottomSheetAction copy$default(BottomSheetAction bottomSheetAction, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bottomSheetAction.target;
        }
        if ((i & 2) != 0) {
            str2 = bottomSheetAction.agreementId;
        }
        if ((i & 4) != 0) {
            str3 = bottomSheetAction.skeletonId;
        }
        if ((i & 8) != 0) {
            map = bottomSheetAction.additionalData;
        }
        return bottomSheetAction.copy(str, str2, str3, map);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSkeletonId() {
        return this.skeletonId;
    }

    public final Map<String, String> component4() {
        return this.additionalData;
    }

    public final BottomSheetAction copy(String target, String agreementId, String skeletonId, Map<String, String> additionalData) {
        return new BottomSheetAction(target, agreementId, skeletonId, additionalData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetAction)) {
            return false;
        }
        BottomSheetAction bottomSheetAction = (BottomSheetAction) other;
        return jl40.l(this.target, bottomSheetAction.target) && jl40.l(this.agreementId, bottomSheetAction.agreementId) && jl40.l(this.skeletonId, bottomSheetAction.skeletonId) && jl40.l(this.additionalData, bottomSheetAction.additionalData);
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getSkeletonId() {
        return this.skeletonId;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        int hashCode = this.target.hashCode() * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skeletonId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.additionalData;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.target;
        String str2 = this.agreementId;
        String str3 = this.skeletonId;
        Map<String, String> map = this.additionalData;
        StringBuilder v = b64.v("BottomSheetAction(target=", str, ", agreementId=", str2, ", skeletonId=");
        v.append(str3);
        v.append(", additionalData=");
        v.append(map);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.target);
        dest.writeString(this.agreementId);
        dest.writeString(this.skeletonId);
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
    public static final class Creator implements Parcelable.Creator<BottomSheetAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BottomSheetAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
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
            return new BottomSheetAction(readString, readString2, readString3, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BottomSheetAction[] newArray(int i) {
            return new BottomSheetAction[i];
        }
    }

    public /* synthetic */ BottomSheetAction(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : map);
    }
}
