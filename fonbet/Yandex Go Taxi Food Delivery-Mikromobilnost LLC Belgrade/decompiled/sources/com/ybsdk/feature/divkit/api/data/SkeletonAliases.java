package com.ybsdk.feature.divkit.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/divkit/api/data/SkeletonAliases;", "Landroid/os/Parcelable;", "", "hash", "", "Lcom/ybsdk/feature/divkit/api/data/RawSkeletonId;", "aliasToSkeletonIdMapping", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/ybsdk/feature/divkit/api/data/SkeletonAliases;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHash", "Ljava/util/Map;", "getAliasToSkeletonIdMapping", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SkeletonAliases implements Parcelable {
    public static final Parcelable.Creator<SkeletonAliases> CREATOR = new Creator();
    private final Map<String, RawSkeletonId> aliasToSkeletonIdMapping;
    private final String hash;

    public SkeletonAliases(@Json(name = "hash") String str, @Json(name = "alias_to_skeleton_id_mapping") Map<String, RawSkeletonId> map) {
        this.hash = str;
        this.aliasToSkeletonIdMapping = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkeletonAliases copy$default(SkeletonAliases skeletonAliases, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skeletonAliases.hash;
        }
        if ((i & 2) != 0) {
            map = skeletonAliases.aliasToSkeletonIdMapping;
        }
        return skeletonAliases.copy(str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final Map<String, RawSkeletonId> component2() {
        return this.aliasToSkeletonIdMapping;
    }

    public final SkeletonAliases copy(@Json(name = "hash") String hash, @Json(name = "alias_to_skeleton_id_mapping") Map<String, RawSkeletonId> aliasToSkeletonIdMapping) {
        return new SkeletonAliases(hash, aliasToSkeletonIdMapping);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkeletonAliases)) {
            return false;
        }
        SkeletonAliases skeletonAliases = (SkeletonAliases) other;
        return jl40.l(this.hash, skeletonAliases.hash) && jl40.l(this.aliasToSkeletonIdMapping, skeletonAliases.aliasToSkeletonIdMapping);
    }

    public final Map<String, RawSkeletonId> getAliasToSkeletonIdMapping() {
        return this.aliasToSkeletonIdMapping;
    }

    public final String getHash() {
        return this.hash;
    }

    public int hashCode() {
        return this.aliasToSkeletonIdMapping.hashCode() + (this.hash.hashCode() * 31);
    }

    public String toString() {
        return xvz.j("SkeletonAliases(hash=", this.hash, ", aliasToSkeletonIdMapping=", Extension.C_BRAKE, this.aliasToSkeletonIdMapping);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hash);
        Iterator x = qv10.x(this.aliasToSkeletonIdMapping, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            RawSkeletonId.m438writeToParcelimpl(((RawSkeletonId) entry.getValue()).m439unboximpl(), dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SkeletonAliases> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SkeletonAliases createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), RawSkeletonId.CREATOR.createFromParcel(parcel));
            }
            return new SkeletonAliases(readString, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SkeletonAliases[] newArray(int i) {
            return new SkeletonAliases[i];
        }
    }
}
