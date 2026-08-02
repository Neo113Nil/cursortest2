package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tse0;
import defpackage.x4e;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u00011B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0017R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0019R \u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/ybsdk/deeplink/generated/PdfLoadByIdAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "id", "target", "", "lifetimeInSeconds", "", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)Lcom/ybsdk/deeplink/generated/PdfLoadByIdAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTarget", "Ljava/lang/Integer;", "getLifetimeInSeconds", "Ljava/util/Map;", "getAdditionalData", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "gh91", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PdfLoadByIdAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<PdfLoadByIdAction> CREATOR = new Creator();
    private final Map<String, String> additionalData;
    private final Uri deeplinkUri;
    private final String id;
    private final Integer lifetimeInSeconds;
    private final String target;

    public PdfLoadByIdAction(String str, String str2, Integer num, Map<String, String> map) {
        this.id = str;
        this.target = str2;
        this.lifetimeInSeconds = num;
        this.additionalData = map;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/pdf_load_by_id", "id", str);
        if (str2 != null) {
            j.appendQueryParameter("target", str2);
        }
        if (num != null) {
            j.appendQueryParameter("lifetime_in_seconds", String.valueOf(num.intValue()));
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                j.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        this.deeplinkUri = j.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdfLoadByIdAction copy$default(PdfLoadByIdAction pdfLoadByIdAction, String str, String str2, Integer num, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdfLoadByIdAction.id;
        }
        if ((i & 2) != 0) {
            str2 = pdfLoadByIdAction.target;
        }
        if ((i & 4) != 0) {
            num = pdfLoadByIdAction.lifetimeInSeconds;
        }
        if ((i & 8) != 0) {
            map = pdfLoadByIdAction.additionalData;
        }
        return pdfLoadByIdAction.copy(str, str2, num, map);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getLifetimeInSeconds() {
        return this.lifetimeInSeconds;
    }

    public final Map<String, String> component4() {
        return this.additionalData;
    }

    public final PdfLoadByIdAction copy(String id, String target, Integer lifetimeInSeconds, Map<String, String> additionalData) {
        return new PdfLoadByIdAction(id, target, lifetimeInSeconds, additionalData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfLoadByIdAction)) {
            return false;
        }
        PdfLoadByIdAction pdfLoadByIdAction = (PdfLoadByIdAction) other;
        return jl40.l(this.id, pdfLoadByIdAction.id) && jl40.l(this.target, pdfLoadByIdAction.target) && jl40.l(this.lifetimeInSeconds, pdfLoadByIdAction.lifetimeInSeconds) && jl40.l(this.additionalData, pdfLoadByIdAction.additionalData);
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getLifetimeInSeconds() {
        return this.lifetimeInSeconds;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.target;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.lifetimeInSeconds;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.additionalData;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.target;
        Integer num = this.lifetimeInSeconds;
        Map<String, String> map = this.additionalData;
        StringBuilder v = b64.v("PdfLoadByIdAction(id=", str, ", target=", str2, ", lifetimeInSeconds=");
        v.append(num);
        v.append(", additionalData=");
        v.append(map);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.target);
        Integer num = this.lifetimeInSeconds;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
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
    public static final class Creator implements Parcelable.Creator<PdfLoadByIdAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PdfLoadByIdAction createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PdfLoadByIdAction(readString, readString2, valueOf, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PdfLoadByIdAction[] newArray(int i) {
            return new PdfLoadByIdAction[i];
        }
    }

    public /* synthetic */ PdfLoadByIdAction(String str, String str2, Integer num, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : map);
    }
}
