package com.ybsdk.feature.deeplink.api.actions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/NotifyLocalVariablesChanged;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "Landroid/net/Uri;", "deeplinkUri", "", "Lcom/ybsdk/feature/deeplink/api/actions/LocalVariable;", "localVariables", "<init>", "(Landroid/net/Uri;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/util/List;", "copy", "(Landroid/net/Uri;Ljava/util/List;)Lcom/ybsdk/feature/deeplink/api/actions/NotifyLocalVariablesChanged;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getDeeplinkUri", "Ljava/util/List;", "getLocalVariables", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NotifyLocalVariablesChanged implements BaseDeeplinkAction {
    public static final Parcelable.Creator<NotifyLocalVariablesChanged> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final List<LocalVariable> localVariables;

    public NotifyLocalVariablesChanged(Uri uri, List<LocalVariable> list) {
        this.deeplinkUri = uri;
        this.localVariables = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotifyLocalVariablesChanged copy$default(NotifyLocalVariablesChanged notifyLocalVariablesChanged, Uri uri, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = notifyLocalVariablesChanged.deeplinkUri;
        }
        if ((i & 2) != 0) {
            list = notifyLocalVariablesChanged.localVariables;
        }
        return notifyLocalVariablesChanged.copy(uri, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final List<LocalVariable> component2() {
        return this.localVariables;
    }

    public final NotifyLocalVariablesChanged copy(Uri deeplinkUri, List<LocalVariable> localVariables) {
        return new NotifyLocalVariablesChanged(deeplinkUri, localVariables);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyLocalVariablesChanged)) {
            return false;
        }
        NotifyLocalVariablesChanged notifyLocalVariablesChanged = (NotifyLocalVariablesChanged) other;
        return jl40.l(this.deeplinkUri, notifyLocalVariablesChanged.deeplinkUri) && jl40.l(this.localVariables, notifyLocalVariablesChanged.localVariables);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final List<LocalVariable> getLocalVariables() {
        return this.localVariables;
    }

    public int hashCode() {
        return this.localVariables.hashCode() + (this.deeplinkUri.hashCode() * 31);
    }

    public String toString() {
        return "NotifyLocalVariablesChanged(deeplinkUri=" + this.deeplinkUri + ", localVariables=" + this.localVariables + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.deeplinkUri, flags);
        Iterator t = vfc.t(dest, this.localVariables);
        while (t.hasNext()) {
            ((LocalVariable) t.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotifyLocalVariablesChanged> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotifyLocalVariablesChanged createFromParcel(Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(NotifyLocalVariablesChanged.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(LocalVariable.CREATOR, parcel, arrayList, i, 1);
            }
            return new NotifyLocalVariablesChanged(uri, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotifyLocalVariablesChanged[] newArray(int i) {
            return new NotifyLocalVariablesChanged[i];
        }
    }
}
