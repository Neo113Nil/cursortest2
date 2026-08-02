package com.ybsdk.feature.stories.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.x4e;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b \u0010\u0019R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/stories/api/StoriesScreensParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "target", "agreementId", "progressType", "", "showBackButton", "showCloseButton", "startStoryId", "", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getTarget", "()Ljava/lang/String;", "getAgreementId", "getProgressType", "Z", "getShowBackButton", "()Z", "getShowCloseButton", "getStartStoryId", "Ljava/util/Map;", "getAdditionalData", "()Ljava/util/Map;", "feature-stories-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoriesScreensParams implements ScreenParams {
    public static final Parcelable.Creator<StoriesScreensParams> CREATOR = new Creator();
    private final Map<String, String> additionalData;
    private final String agreementId;
    private final String progressType;
    private final boolean showBackButton;
    private final boolean showCloseButton;
    private final String startStoryId;
    private final String target;

    public StoriesScreensParams(String str, String str2, String str3, boolean z, boolean z2, String str4, Map<String, String> map) {
        this.target = str;
        this.agreementId = str2;
        this.progressType = str3;
        this.showBackButton = z;
        this.showCloseButton = z2;
        this.startStoryId = str4;
        this.additionalData = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getProgressType() {
        return this.progressType;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final String getStartStoryId() {
        return this.startStoryId;
    }

    public final String getTarget() {
        return this.target;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.target);
        dest.writeString(this.agreementId);
        dest.writeString(this.progressType);
        dest.writeInt(this.showBackButton ? 1 : 0);
        dest.writeInt(this.showCloseButton ? 1 : 0);
        dest.writeString(this.startStoryId);
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
    public static final class Creator implements Parcelable.Creator<StoriesScreensParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final StoriesScreensParams createFromParcel(Parcel parcel) {
            int i;
            LinkedHashMap linkedHashMap;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int i2 = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z2 = parcel.readInt() != 0 ? i : 0;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (i2 != readInt) {
                    i2 = xvz.b(parcel, linkedHashMap2, parcel.readString(), i2, i);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new StoriesScreensParams(readString, readString2, readString3, z, z2, readString4, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoriesScreensParams[] newArray(int i) {
            return new StoriesScreensParams[i];
        }
    }

    public /* synthetic */ StoriesScreensParams(String str, String str2, String str3, boolean z, boolean z2, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, (i & 16) != 0 ? true : z2, str4, map);
    }
}
