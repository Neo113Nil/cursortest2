package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hi10;
import defpackage.jl40;
import defpackage.smw0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0001\"B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Lcoil/memory/MemoryCache$Key;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcoil/memory/MemoryCache$Key;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getKey", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "Companion", "hi10", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MemoryCache$Key implements Parcelable {
    private final Map<String, String> extras;
    private final String key;
    private static final hi10 Companion = new hi10();

    @Deprecated
    public static final Parcelable.Creator<MemoryCache$Key> CREATOR = new Parcelable.Creator<MemoryCache$Key>() { // from class: coil.memory.MemoryCache$Key$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MemoryCache$Key createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i < readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MemoryCache$Key(readString, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MemoryCache$Key[] newArray(int size) {
            return new MemoryCache$Key[size];
        }
    };

    public /* synthetic */ MemoryCache$Key(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? b.f() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemoryCache$Key copy$default(MemoryCache$Key memoryCache$Key, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoryCache$Key.key;
        }
        if ((i & 2) != 0) {
            map = memoryCache$Key.extras;
        }
        return memoryCache$Key.copy(str, map);
    }

    public final MemoryCache$Key copy(String key, Map<String, String> extras) {
        return new MemoryCache$Key(key, extras);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoryCache$Key)) {
            return false;
        }
        MemoryCache$Key memoryCache$Key = (MemoryCache$Key) other;
        return jl40.l(this.key, memoryCache$Key.key) && jl40.l(this.extras, memoryCache$Key.extras);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.extras.hashCode() + (this.key.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Key(key=");
        sb.append(this.key);
        sb.append(", extras=");
        return smw0.n(sb, this.extras, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.key);
        parcel.writeInt(this.extras.size());
        for (Map.Entry<String, String> entry : this.extras.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public MemoryCache$Key(String str, Map<String, String> map) {
        this.key = str;
        this.extras = map;
    }
}
