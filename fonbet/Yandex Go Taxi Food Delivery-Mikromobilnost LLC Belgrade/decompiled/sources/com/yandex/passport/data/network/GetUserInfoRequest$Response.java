package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.p53;
import defpackage.psq0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.yjd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@gsq0
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NOBm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010!Jv\u0010+\u001a\u00020*2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u001a\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010:\u001a\u00020\u00192\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010?\u0012\u0004\b@\u0010>\u001a\u0004\b\u0005\u0010!R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010?\u0012\u0004\bA\u0010>\u001a\u0004\b\u0006\u0010!R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010?\u0012\u0004\bB\u0010>\u001a\u0004\b\u0007\u0010!R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bC\u0010>\u001a\u0004\b\b\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\bE\u0010>\u001a\u0004\bD\u0010\u001fR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010F\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010;\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010\u001fR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010?\u0012\u0004\bL\u0010>\u001a\u0004\bK\u0010!¨\u0006P"}, d2 = {"com/yandex/passport/data/network/GetUserInfoRequest$Response", "Landroid/os/Parcelable;", "", ACSPConstants.STATUS, "", "isComplete", "isCompletionAvailable", "isCompletionRecommended", "isCompletionRequired", "completionUrl", "", "Lcom/yandex/passport/data/network/GetChildrenInfoRequest$Member;", "members", "xTokenClientId", "xTokenNeedReset", "<init>", "(Ljava/lang/String;ZZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;ZZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZLpsq0;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "Lcom/yandex/passport/data/network/GetUserInfoRequest$Response;", "copy", "(Ljava/lang/String;ZZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Z)Lcom/yandex/passport/data/network/GetUserInfoRequest$Response;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$passport_data_release", "(Lcom/yandex/passport/data/network/GetUserInfoRequest$Response;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getStatus", "getStatus$annotations", "()V", "Z", "isComplete$annotations", "isCompletionAvailable$annotations", "isCompletionRecommended$annotations", "isCompletionRequired$annotations", "getCompletionUrl", "getCompletionUrl$annotations", "Ljava/util/List;", "getMembers", "getMembers$annotations", "getXTokenClientId", "getXTokenClientId$annotations", "getXTokenNeedReset", "getXTokenNeedReset$annotations", "Companion", "com/yandex/passport/data/network/x9", "com/yandex/passport/data/network/y9", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetUserInfoRequest$Response implements Parcelable {
    private final String completionUrl;
    private final boolean isComplete;
    private final boolean isCompletionAvailable;
    private final boolean isCompletionRecommended;
    private final boolean isCompletionRequired;
    private final List<GetChildrenInfoRequest$Member> members;
    private final String status;
    private final String xTokenClientId;
    private final boolean xTokenNeedReset;
    public static final y9 Companion = new y9();
    public static final Parcelable.Creator<GetUserInfoRequest$Response> CREATOR = new Creator();
    private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, new p53(z3.a, 0), null, null};

    public /* synthetic */ GetUserInfoRequest$Response(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, List list, String str3, boolean z5, psq0 psq0Var) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.isComplete = false;
        } else {
            this.isComplete = z;
        }
        if ((i & 4) == 0) {
            this.isCompletionAvailable = false;
        } else {
            this.isCompletionAvailable = z2;
        }
        if ((i & 8) == 0) {
            this.isCompletionRecommended = false;
        } else {
            this.isCompletionRecommended = z3;
        }
        if ((i & 16) == 0) {
            this.isCompletionRequired = false;
        } else {
            this.isCompletionRequired = z4;
        }
        if ((i & 32) == 0) {
            this.completionUrl = null;
        } else {
            this.completionUrl = str2;
        }
        if ((i & 64) == 0) {
            this.members = EmptyList.a;
        } else {
            this.members = list;
        }
        if ((i & 128) == 0) {
            this.xTokenClientId = null;
        } else {
            this.xTokenClientId = str3;
        }
        if ((i & 256) == 0) {
            this.xTokenNeedReset = false;
        } else {
            this.xTokenNeedReset = z5;
        }
    }

    public static /* synthetic */ GetUserInfoRequest$Response copy$default(GetUserInfoRequest$Response getUserInfoRequest$Response, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, List list, String str3, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUserInfoRequest$Response.status;
        }
        if ((i & 2) != 0) {
            z = getUserInfoRequest$Response.isComplete;
        }
        if ((i & 4) != 0) {
            z2 = getUserInfoRequest$Response.isCompletionAvailable;
        }
        if ((i & 8) != 0) {
            z3 = getUserInfoRequest$Response.isCompletionRecommended;
        }
        if ((i & 16) != 0) {
            z4 = getUserInfoRequest$Response.isCompletionRequired;
        }
        if ((i & 32) != 0) {
            str2 = getUserInfoRequest$Response.completionUrl;
        }
        if ((i & 64) != 0) {
            list = getUserInfoRequest$Response.members;
        }
        if ((i & 128) != 0) {
            str3 = getUserInfoRequest$Response.xTokenClientId;
        }
        if ((i & 256) != 0) {
            z5 = getUserInfoRequest$Response.xTokenNeedReset;
        }
        String str4 = str3;
        boolean z6 = z5;
        String str5 = str2;
        List list2 = list;
        boolean z7 = z4;
        boolean z8 = z2;
        return getUserInfoRequest$Response.copy(str, z, z8, z3, z7, str5, list2, str4, z6);
    }

    public static /* synthetic */ void getCompletionUrl$annotations() {
    }

    public static /* synthetic */ void getMembers$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static /* synthetic */ void getXTokenClientId$annotations() {
    }

    public static /* synthetic */ void getXTokenNeedReset$annotations() {
    }

    public static /* synthetic */ void isComplete$annotations() {
    }

    public static /* synthetic */ void isCompletionAvailable$annotations() {
    }

    public static /* synthetic */ void isCompletionRecommended$annotations() {
    }

    public static /* synthetic */ void isCompletionRequired$annotations() {
    }

    public static final /* synthetic */ void write$Self$passport_data_release(GetUserInfoRequest$Response self, yjd output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.F() || self.status != null) {
            output.g(serialDesc, 0, auu0.a, self.status);
        }
        if (output.F() || self.isComplete) {
            output.n(serialDesc, 1, self.isComplete);
        }
        if (output.F() || self.isCompletionAvailable) {
            output.n(serialDesc, 2, self.isCompletionAvailable);
        }
        if (output.F() || self.isCompletionRecommended) {
            output.n(serialDesc, 3, self.isCompletionRecommended);
        }
        if (output.F() || self.isCompletionRequired) {
            output.n(serialDesc, 4, self.isCompletionRequired);
        }
        if (output.F() || self.completionUrl != null) {
            output.g(serialDesc, 5, auu0.a, self.completionUrl);
        }
        if (output.F() || !jl40.l(self.members, EmptyList.a)) {
            output.e(serialDesc, 6, kSerializerArr[6], self.members);
        }
        if (output.F() || self.xTokenClientId != null) {
            output.g(serialDesc, 7, auu0.a, self.xTokenClientId);
        }
        if (output.F() || self.xTokenNeedReset) {
            output.n(serialDesc, 8, self.xTokenNeedReset);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCompletionAvailable() {
        return this.isCompletionAvailable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCompletionRecommended() {
        return this.isCompletionRecommended;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCompletionRequired() {
        return this.isCompletionRequired;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCompletionUrl() {
        return this.completionUrl;
    }

    public final List<GetChildrenInfoRequest$Member> component7() {
        return this.members;
    }

    /* renamed from: component8, reason: from getter */
    public final String getXTokenClientId() {
        return this.xTokenClientId;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getXTokenNeedReset() {
        return this.xTokenNeedReset;
    }

    public final GetUserInfoRequest$Response copy(String status, boolean isComplete, boolean isCompletionAvailable, boolean isCompletionRecommended, boolean isCompletionRequired, String completionUrl, List<GetChildrenInfoRequest$Member> members, String xTokenClientId, boolean xTokenNeedReset) {
        return new GetUserInfoRequest$Response(status, isComplete, isCompletionAvailable, isCompletionRecommended, isCompletionRequired, completionUrl, members, xTokenClientId, xTokenNeedReset);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUserInfoRequest$Response)) {
            return false;
        }
        GetUserInfoRequest$Response getUserInfoRequest$Response = (GetUserInfoRequest$Response) other;
        return jl40.l(this.status, getUserInfoRequest$Response.status) && this.isComplete == getUserInfoRequest$Response.isComplete && this.isCompletionAvailable == getUserInfoRequest$Response.isCompletionAvailable && this.isCompletionRecommended == getUserInfoRequest$Response.isCompletionRecommended && this.isCompletionRequired == getUserInfoRequest$Response.isCompletionRequired && jl40.l(this.completionUrl, getUserInfoRequest$Response.completionUrl) && jl40.l(this.members, getUserInfoRequest$Response.members) && jl40.l(this.xTokenClientId, getUserInfoRequest$Response.xTokenClientId) && this.xTokenNeedReset == getUserInfoRequest$Response.xTokenNeedReset;
    }

    public final String getCompletionUrl() {
        return this.completionUrl;
    }

    public final List<GetChildrenInfoRequest$Member> getMembers() {
        return this.members;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getXTokenClientId() {
        return this.xTokenClientId;
    }

    public final boolean getXTokenNeedReset() {
        return this.xTokenNeedReset;
    }

    public int hashCode() {
        String str = this.status;
        int e = unr0.e(unr0.e(unr0.e(unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.isComplete), 31, this.isCompletionAvailable), 31, this.isCompletionRecommended), 31, this.isCompletionRequired);
        String str2 = this.completionUrl;
        int c = unr0.c((e + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.members);
        String str3 = this.xTokenClientId;
        return Boolean.hashCode(this.xTokenNeedReset) + ((c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public final boolean isCompletionAvailable() {
        return this.isCompletionAvailable;
    }

    public final boolean isCompletionRecommended() {
        return this.isCompletionRecommended;
    }

    public final boolean isCompletionRequired() {
        return this.isCompletionRequired;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(status=");
        sb.append(this.status);
        sb.append(", isComplete=");
        sb.append(this.isComplete);
        sb.append(", isCompletionAvailable=");
        sb.append(this.isCompletionAvailable);
        sb.append(", isCompletionRecommended=");
        sb.append(this.isCompletionRecommended);
        sb.append(", isCompletionRequired=");
        sb.append(this.isCompletionRequired);
        sb.append(", completionUrl=");
        sb.append(this.completionUrl);
        sb.append(", members=");
        sb.append(this.members);
        sb.append(", xTokenClientId=");
        sb.append(this.xTokenClientId);
        sb.append(", xTokenNeedReset=");
        return unr0.u(sb, this.xTokenNeedReset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.status);
        dest.writeInt(this.isComplete ? 1 : 0);
        dest.writeInt(this.isCompletionAvailable ? 1 : 0);
        dest.writeInt(this.isCompletionRecommended ? 1 : 0);
        dest.writeInt(this.isCompletionRequired ? 1 : 0);
        dest.writeString(this.completionUrl);
        Iterator t = vfc.t(dest, this.members);
        while (t.hasNext()) {
            ((GetChildrenInfoRequest$Member) t.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.xTokenClientId);
        dest.writeInt(this.xTokenNeedReset ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetUserInfoRequest$Response> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final GetUserInfoRequest$Response createFromParcel(Parcel parcel) {
            int i;
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z2 = parcel.readInt() != 0 ? i : 0;
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            boolean z4 = parcel.readInt() != 0 ? i : 0;
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = oo31.d(GetChildrenInfoRequest$Member.CREATOR, parcel, arrayList, i2, i);
            }
            return new GetUserInfoRequest$Response(readString, z, z2, z3, z4, readString2, arrayList, parcel.readString(), parcel.readInt() != 0 ? i : 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetUserInfoRequest$Response[] newArray(int i) {
            return new GetUserInfoRequest$Response[i];
        }
    }

    public GetUserInfoRequest$Response() {
        this((String) null, false, false, false, false, (String) null, (List) null, (String) null, false, 511, (DefaultConstructorMarker) null);
    }

    public GetUserInfoRequest$Response(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, List<GetChildrenInfoRequest$Member> list, String str3, boolean z5) {
        this.status = str;
        this.isComplete = z;
        this.isCompletionAvailable = z2;
        this.isCompletionRecommended = z3;
        this.isCompletionRequired = z4;
        this.completionUrl = str2;
        this.members = list;
        this.xTokenClientId = str3;
        this.xTokenNeedReset = z5;
    }

    public /* synthetic */ GetUserInfoRequest$Response(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, List list, String str3, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? EmptyList.a : list, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? false : z5);
    }
}
