package com.yandex.passport.internal.network.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.oo31;
import defpackage.tcc;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002$%BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b#\u0010\u001f¨\u0006&"}, d2 = {"Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult;", "Landroid/os/Parcelable;", "", "requestId", "title", "iconUrl", "", "Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult$Scope;", "scopes", "", "isRequireUserConfirm", "alreadyGrantedScopes", "requestedScopes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "getTitle", "getIconUrl", "Ljava/util/List;", "getScopes", "()Ljava/util/List;", "Z", "()Z", "getAlreadyGrantedScopes", "getRequestedScopes", "Scope", "Permission", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalApplicationPermissionsResult implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExternalApplicationPermissionsResult> CREATOR = new Creator();
    private final List<Scope> alreadyGrantedScopes;
    private final String iconUrl;
    private final boolean isRequireUserConfirm;
    private final String requestId;
    private final List<Scope> requestedScopes;
    private final List<Scope> scopes;
    private final String title;

    public ExternalApplicationPermissionsResult(String str, String str2, String str3, List<Scope> list, boolean z, List<Scope> list2, List<Scope> list3) {
        this.requestId = str;
        this.title = str2;
        this.iconUrl = str3;
        this.scopes = list;
        this.isRequireUserConfirm = z;
        this.alreadyGrantedScopes = list2;
        this.requestedScopes = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Scope> getAlreadyGrantedScopes() {
        return this.alreadyGrantedScopes;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final List<Scope> getRequestedScopes() {
        return this.requestedScopes;
    }

    public final List<Scope> getScopes() {
        return this.scopes;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: isRequireUserConfirm, reason: from getter */
    public final boolean getIsRequireUserConfirm() {
        return this.isRequireUserConfirm;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.requestId);
        dest.writeString(this.title);
        dest.writeString(this.iconUrl);
        Iterator t = vfc.t(dest, this.scopes);
        while (t.hasNext()) {
            ((Scope) t.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.isRequireUserConfirm ? 1 : 0);
        Iterator t2 = vfc.t(dest, this.alreadyGrantedScopes);
        while (t2.hasNext()) {
            ((Scope) t2.next()).writeToParcel(dest, flags);
        }
        Iterator t3 = vfc.t(dest, this.requestedScopes);
        while (t3.hasNext()) {
            ((Scope) t3.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult$Permission;", "Landroid/os/Parcelable;", "", "title", AuthSdkActivity.RESPONSE_TYPE_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Permission implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Permission> CREATOR = new Creator();
        private final String code;
        private final String title;

        public Permission(String str, String str2) {
            this.title = str;
            this.code = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.code);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Permission> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Permission createFromParcel(Parcel parcel) {
                return new Permission(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Permission[] newArray(int i) {
                return new Permission[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult$Scope;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult$Permission;", "permissions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "getPermissionTitles", "permissionTitles", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Scope implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Scope> CREATOR = new Creator();
        private final List<Permission> permissions;
        private final String title;

        public Scope(String str, List<Permission> list) {
            this.title = str;
            this.permissions = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<String> getPermissionTitles() {
            List<Permission> list = this.permissions;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Permission) it.next()).getTitle());
            }
            return arrayList;
        }

        public final List<Permission> getPermissions() {
            return this.permissions;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            Iterator t = vfc.t(dest, this.permissions);
            while (t.hasNext()) {
                ((Permission) t.next()).writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Scope> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Scope createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(Permission.CREATOR, parcel, arrayList, i, 1);
                }
                return new Scope(readString, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Scope[] newArray(int i) {
                return new Scope[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExternalApplicationPermissionsResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExternalApplicationPermissionsResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = oo31.d(Scope.CREATOR, parcel, arrayList, i2, 1);
            }
            boolean z = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = oo31.d(Scope.CREATOR, parcel, arrayList2, i3, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = oo31.d(Scope.CREATOR, parcel, arrayList3, i, 1);
            }
            return new ExternalApplicationPermissionsResult(readString, readString2, readString3, arrayList, z, arrayList2, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExternalApplicationPermissionsResult[] newArray(int i) {
            return new ExternalApplicationPermissionsResult[i];
        }
    }
}
