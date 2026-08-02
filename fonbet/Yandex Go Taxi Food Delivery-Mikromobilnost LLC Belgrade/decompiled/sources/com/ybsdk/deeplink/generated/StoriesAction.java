package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001:B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jj\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0018R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010 R \u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/ybsdk/deeplink/generated/StoriesAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "target", "", "showBack", "showCloseButton", "agreementId", "progress", "startStoryId", "", "additionalData", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/ybsdk/deeplink/generated/StoriesAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarget", "Z", "getShowBack", "getShowCloseButton", "getAgreementId", "getProgress", "getStartStoryId", "Ljava/util/Map;", "getAdditionalData", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "ygb1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoriesAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<StoriesAction> CREATOR = new Creator();
    private final Map<String, String> additionalData;
    private final String agreementId;
    private final Uri deeplinkUri;
    private final String progress;
    private final boolean showBack;
    private final boolean showCloseButton;
    private final String startStoryId;
    private final String target;

    public StoriesAction(String str, boolean z, boolean z2, String str2, String str3, String str4, Map<String, String> map) {
        this.target = str;
        this.showBack = z;
        this.showCloseButton = z2;
        this.agreementId = str2;
        this.progress = str3;
        this.startStoryId = str4;
        this.additionalData = map;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/stories", "target", str);
        j.appendQueryParameter("show_back", String.valueOf(z));
        j.appendQueryParameter("show_close_button", String.valueOf(z2));
        if (str2 != null) {
            j.appendQueryParameter("agreement_id", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("progress", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("start_story_id", str4);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                j.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ StoriesAction copy$default(StoriesAction storiesAction, String str, boolean z, boolean z2, String str2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storiesAction.target;
        }
        if ((i & 2) != 0) {
            z = storiesAction.showBack;
        }
        if ((i & 4) != 0) {
            z2 = storiesAction.showCloseButton;
        }
        if ((i & 8) != 0) {
            str2 = storiesAction.agreementId;
        }
        if ((i & 16) != 0) {
            str3 = storiesAction.progress;
        }
        if ((i & 32) != 0) {
            str4 = storiesAction.startStoryId;
        }
        if ((i & 64) != 0) {
            map = storiesAction.additionalData;
        }
        String str5 = str4;
        Map map2 = map;
        String str6 = str3;
        boolean z3 = z2;
        return storiesAction.copy(str, z, z3, str2, str6, str5, map2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowBack() {
        return this.showBack;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProgress() {
        return this.progress;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStartStoryId() {
        return this.startStoryId;
    }

    public final Map<String, String> component7() {
        return this.additionalData;
    }

    public final StoriesAction copy(String target, boolean showBack, boolean showCloseButton, String agreementId, String progress, String startStoryId, Map<String, String> additionalData) {
        return new StoriesAction(target, showBack, showCloseButton, agreementId, progress, startStoryId, additionalData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoriesAction)) {
            return false;
        }
        StoriesAction storiesAction = (StoriesAction) other;
        return jl40.l(this.target, storiesAction.target) && this.showBack == storiesAction.showBack && this.showCloseButton == storiesAction.showCloseButton && jl40.l(this.agreementId, storiesAction.agreementId) && jl40.l(this.progress, storiesAction.progress) && jl40.l(this.startStoryId, storiesAction.startStoryId) && jl40.l(this.additionalData, storiesAction.additionalData);
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

    public final String getProgress() {
        return this.progress;
    }

    public final boolean getShowBack() {
        return this.showBack;
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

    public int hashCode() {
        int e = unr0.e(unr0.e(this.target.hashCode() * 31, 31, this.showBack), 31, this.showCloseButton);
        String str = this.agreementId;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.progress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startStoryId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.additionalData;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.target;
        boolean z = this.showBack;
        boolean z2 = this.showCloseButton;
        String str2 = this.agreementId;
        String str3 = this.progress;
        String str4 = this.startStoryId;
        Map<String, String> map = this.additionalData;
        StringBuilder l = oo31.l("StoriesAction(target=", str, ", showBack=", ", showCloseButton=", z);
        unr0.A(", agreementId=", str2, ", progress=", l, z2);
        g8e.D(l, str3, ", startStoryId=", str4, ", additionalData=");
        return b64.r(l, map, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.target);
        dest.writeInt(this.showBack ? 1 : 0);
        dest.writeInt(this.showCloseButton ? 1 : 0);
        dest.writeString(this.agreementId);
        dest.writeString(this.progress);
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
    public static final class Creator implements Parcelable.Creator<StoriesAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final StoriesAction createFromParcel(Parcel parcel) {
            int i;
            LinkedHashMap linkedHashMap;
            String readString = parcel.readString();
            int i2 = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z2 = parcel.readInt() != 0 ? i : 0;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
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
            return new StoriesAction(readString, z, z2, readString2, readString3, readString4, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoriesAction[] newArray(int i) {
            return new StoriesAction[i];
        }
    }

    public /* synthetic */ StoriesAction(String str, boolean z, boolean z2, String str2, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : map);
    }
}
