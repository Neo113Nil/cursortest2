package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportPartition;
import com.yandex.passport.api.s1;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@gsq0(with = m.class)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001,B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u001a\u0010%\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001dR\u0014\u0010)\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/yandex/passport/internal/entities/Partitions;", "Lcom/yandex/passport/api/s1;", "Landroid/os/Parcelable;", "", "Lcom/yandex/passport/api/PassportPartition;", "partitions", "<init>", "(Ljava/util/List;)V", "partition", "", "contains-Uefey00", "(Ljava/lang/String;)Z", "contains", "", "iterator", "()Ljava/util/Iterator;", "other", "intersects", "(Lcom/yandex/passport/api/s1;)Z", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/yandex/passport/internal/entities/Partitions;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPartitions", "isEmpty", "()Z", "Companion", "com/yandex/passport/internal/entities/l", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Partitions implements s1, Parcelable {
    public static final int $stable = 8;
    private final List<PassportPartition> partitions;
    public static final l Companion = new l();
    public static final Parcelable.Creator<Partitions> CREATOR = new Creator();

    public Partitions(List<PassportPartition> list) {
        this.partitions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Partitions copy$default(Partitions partitions, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = partitions.partitions;
        }
        return partitions.copy(list);
    }

    public final List<PassportPartition> component1() {
        return this.partitions;
    }

    @Override // com.yandex.passport.api.s1
    /* renamed from: contains-Uefey00 */
    public boolean mo244containsUefey00(String partition) {
        return getPartitions().contains(PassportPartition.m231boximpl(partition));
    }

    public final Partitions copy(List<PassportPartition> partitions) {
        return new Partitions(partitions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Partitions) && jl40.l(this.partitions, ((Partitions) other).partitions);
    }

    @Override // com.yandex.passport.api.s1
    public List<PassportPartition> getPartitions() {
        return this.partitions;
    }

    public int hashCode() {
        return this.partitions.hashCode();
    }

    public boolean intersects(s1 other) {
        Iterator<T> it = getPartitions().iterator();
        while (it.hasNext()) {
            if (other.mo244containsUefey00(((PassportPartition) it.next()).m240unboximpl())) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return getPartitions().isEmpty() || PassportPartition.m237isEmptyimpl(getPartitions().get(0).m240unboximpl());
    }

    @Override // java.lang.Iterable
    public Iterator<PassportPartition> iterator() {
        return getPartitions().iterator();
    }

    public String toString() {
        return unr0.t(new StringBuilder("Partitions(partitions="), this.partitions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator t = vfc.t(dest, this.partitions);
        while (t.hasNext()) {
            PassportPartition.m239writeToParcelimpl(((PassportPartition) t.next()).m240unboximpl(), dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Partitions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Partitions createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(PassportPartition.CREATOR, parcel, arrayList, i, 1);
            }
            return new Partitions(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Partitions[] newArray(int i) {
            return new Partitions[i];
        }
    }
}
