package com.yandex.plus.pay.repository.api.model.upsale;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\fJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0017¨\u0006&"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsales;", "Landroid/os/Parcelable;", "", "sessionId", "offersBatchId", "", "Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsale;", "list", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/yandex/plus/pay/repository/api/model/upsale/CompositeUpsales;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getOffersBatchId", "Ljava/util/List;", "getList", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompositeUpsales implements Parcelable {
    public static final Parcelable.Creator<CompositeUpsales> CREATOR = new Creator();
    private final List<CompositeUpsale> list;
    private final String offersBatchId;
    private final String sessionId;

    public CompositeUpsales(String str, String str2, List<CompositeUpsale> list) {
        this.sessionId = str;
        this.offersBatchId = str2;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompositeUpsales copy$default(CompositeUpsales compositeUpsales, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = compositeUpsales.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = compositeUpsales.offersBatchId;
        }
        if ((i & 4) != 0) {
            list = compositeUpsales.list;
        }
        return compositeUpsales.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOffersBatchId() {
        return this.offersBatchId;
    }

    public final List<CompositeUpsale> component3() {
        return this.list;
    }

    public final CompositeUpsales copy(String sessionId, String offersBatchId, List<CompositeUpsale> list) {
        return new CompositeUpsales(sessionId, offersBatchId, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompositeUpsales)) {
            return false;
        }
        CompositeUpsales compositeUpsales = (CompositeUpsales) other;
        return jl40.l(this.sessionId, compositeUpsales.sessionId) && jl40.l(this.offersBatchId, compositeUpsales.offersBatchId) && jl40.l(this.list, compositeUpsales.list);
    }

    public final List<CompositeUpsale> getList() {
        return this.list;
    }

    public final String getOffersBatchId() {
        return this.offersBatchId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.list.hashCode() + unr0.b(this.sessionId.hashCode() * 31, 31, this.offersBatchId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CompositeUpsales(sessionId=");
        sb.append(this.sessionId);
        sb.append(", offersBatchId=");
        sb.append(this.offersBatchId);
        sb.append(", list=");
        return unr0.t(sb, this.list, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.sessionId);
        dest.writeString(this.offersBatchId);
        Iterator t = vfc.t(dest, this.list);
        while (t.hasNext()) {
            ((CompositeUpsale) t.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CompositeUpsales> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeUpsales createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(CompositeUpsale.CREATOR, parcel, arrayList, i, 1);
            }
            return new CompositeUpsales(readString, readString2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeUpsales[] newArray(int i) {
            return new CompositeUpsales[i];
        }
    }
}
