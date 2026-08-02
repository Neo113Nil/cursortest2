package com.yandex.messaging.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.vfc;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J0\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0012¨\u0006!"}, d2 = {"Lcom/yandex/messaging/sdk/ChatFilterParams;", "Landroid/os/Parcelable;", "", "", "namespaces", "", "guids", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/yandex/messaging/sdk/ChatFilterParams;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getNamespaces", "getGuids", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChatFilterParams implements Parcelable {
    public static final Parcelable.Creator<ChatFilterParams> CREATOR = new Creator();
    private final List<String> guids;
    private final List<Integer> namespaces;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ChatFilterParams(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r5 != 0 ? r0 : list, (i & 2) != 0 ? r0 : list2);
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatFilterParams copy$default(ChatFilterParams chatFilterParams, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatFilterParams.namespaces;
        }
        if ((i & 2) != 0) {
            list2 = chatFilterParams.guids;
        }
        return chatFilterParams.copy(list, list2);
    }

    public final List<Integer> component1() {
        return this.namespaces;
    }

    public final List<String> component2() {
        return this.guids;
    }

    public final ChatFilterParams copy(List<Integer> namespaces, List<String> guids) {
        return new ChatFilterParams(namespaces, guids);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFilterParams)) {
            return false;
        }
        ChatFilterParams chatFilterParams = (ChatFilterParams) other;
        return jl40.l(this.namespaces, chatFilterParams.namespaces) && jl40.l(this.guids, chatFilterParams.guids);
    }

    public final List<String> getGuids() {
        return this.guids;
    }

    public final List<Integer> getNamespaces() {
        return this.namespaces;
    }

    public int hashCode() {
        return this.guids.hashCode() + (this.namespaces.hashCode() * 31);
    }

    public String toString() {
        return xvz.l("ChatFilterParams(namespaces=", this.namespaces, ", guids=", this.guids, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator t = vfc.t(dest, this.namespaces);
        while (t.hasNext()) {
            dest.writeInt(((Number) t.next()).intValue());
        }
        dest.writeStringList(this.guids);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChatFilterParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatFilterParams createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new ChatFilterParams(arrayList, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatFilterParams[] newArray(int i) {
            return new ChatFilterParams[i];
        }
    }

    public ChatFilterParams(List<Integer> list, List<String> list2) {
        this.namespaces = list;
        this.guids = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatFilterParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
