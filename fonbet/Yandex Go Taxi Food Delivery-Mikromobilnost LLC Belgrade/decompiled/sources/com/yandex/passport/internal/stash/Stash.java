package com.yandex.passport.internal.stash;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.KPassportStashCell;
import com.yandex.passport.api.g2;
import com.yandex.passport.common.c;
import defpackage.cvu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qke;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.v4r0;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00016B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020!¢\u0006\u0004\b&\u0010'J(\u0010(\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b+\u0010'J\u001a\u0010-\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u001c\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/yandex/passport/internal/stash/Stash;", "Lcom/yandex/passport/api/g2;", "Landroid/os/Parcelable;", "", "", "storage", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "cell", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/yandex/passport/api/KPassportStashCell;", "get", "(Lcom/yandex/passport/api/KPassportStashCell;)Ljava/lang/String;", "Lcom/yandex/passport/internal/stash/StashCell;", "(Lcom/yandex/passport/internal/stash/StashCell;)Ljava/lang/String;", "", CSPDirectoryConstants.SUBDIRECTORY_KEYS, "()Ljava/util/Set;", "value", "", "withTimestamp", "with", "(Lcom/yandex/passport/internal/stash/StashCell;Ljava/lang/String;Z)Lcom/yandex/passport/internal/stash/Stash;", "toJson", "()Ljava/lang/String;", "other", "plus", "(Lcom/yandex/passport/internal/stash/Stash;)Lcom/yandex/passport/internal/stash/Stash;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/Map;)Lcom/yandex/passport/internal/stash/Stash;", "toString", "hashCode", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "Lcom/yandex/passport/common/c;", "timeProvider", "Lcom/yandex/passport/common/c;", "getTimeProvider$annotations", "()V", "Companion", "com/yandex/passport/internal/stash/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Stash implements g2, Parcelable {
    public static final int $stable = 8;
    private static final String TIMESTAMP_CELL_PREFIX = "timestamp.v2_";
    private static final String TIMESTAMP_CELL_PREFIX_BROKEN = "timestamp_";
    private final Map<String, String> storage;
    private c timeProvider = new com.yandex.passport.common.a();
    public static final a Companion = new a();
    public static final Parcelable.Creator<Stash> CREATOR = new Creator();

    public Stash(Map<String, String> map) {
        this.storage = map;
    }

    private final Map<String, String> component1() {
        return this.storage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Stash copy$default(Stash stash, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = stash.storage;
        }
        return stash.copy(map);
    }

    private static /* synthetic */ void getTimeProvider$annotations() {
    }

    public static /* synthetic */ Stash with$default(Stash stash, StashCell stashCell, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return stash.with(stashCell, str, z);
    }

    public final Stash copy(Map<String, String> storage) {
        return new Stash(storage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Stash) && jl40.l(this.storage, ((Stash) other).storage);
    }

    @Override // com.yandex.passport.api.g2
    public String get(KPassportStashCell cell) {
        return this.storage.get(cell.getValue());
    }

    @jxi
    public String getValue(String cell) {
        Object obj;
        Companion.getClass();
        StashCell[] values = StashCell.values();
        ArrayList arrayList = new ArrayList();
        for (StashCell stashCell : values) {
            if (!stashCell.getIsInternal()) {
                arrayList.add(stashCell);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((StashCell) obj).getValue(), cell)) {
                break;
            }
        }
        if (obj != null) {
            return this.storage.get(cell);
        }
        return null;
    }

    public int hashCode() {
        return this.storage.hashCode();
    }

    public final Set<String> keys() {
        return qke.k(this.storage).keySet();
    }

    public final Stash plus(Stash other) {
        StashCell stashCell;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : v4r0.h(this.storage.keySet(), other.storage.keySet())) {
            int i = 0;
            if (!cvu0.x(str, TIMESTAMP_CELL_PREFIX, false) && !cvu0.x(str, TIMESTAMP_CELL_PREFIX_BROKEN, false)) {
                String concat = TIMESTAMP_CELL_PREFIX.concat(str);
                StashCell[] values = StashCell.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        stashCell = null;
                        break;
                    }
                    stashCell = values[i];
                    if (jl40.l(stashCell.getValue(), str)) {
                        break;
                    }
                    i++;
                }
                String str2 = stashCell != null ? TIMESTAMP_CELL_PREFIX_BROKEN + stashCell : concat;
                String str3 = this.storage.get(str2);
                if (str3 == null) {
                    str3 = this.storage.get(concat);
                }
                Long valueOf = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
                String str4 = other.storage.get(str2);
                if (str4 == null) {
                    str4 = other.storage.get(concat);
                }
                Long valueOf2 = str4 != null ? Long.valueOf(Long.parseLong(str4)) : null;
                String str5 = this.storage.get(str);
                String str6 = other.storage.get(str);
                if (valueOf == null || valueOf2 == null) {
                    if (valueOf != null) {
                        linkedHashMap.put(str, str5);
                        linkedHashMap.put(concat, valueOf.toString());
                    } else if (valueOf2 != null) {
                        linkedHashMap.put(str, str6);
                        linkedHashMap.put(concat, valueOf2.toString());
                    } else if (str6 != null) {
                        linkedHashMap.put(str, str6);
                    } else if (str5 != null) {
                        linkedHashMap.put(str, str5);
                    }
                } else if (valueOf.longValue() > valueOf2.longValue()) {
                    linkedHashMap.put(str, str5);
                    linkedHashMap.put(concat, valueOf.toString());
                } else {
                    linkedHashMap.put(str, str6);
                    linkedHashMap.put(concat, valueOf2.toString());
                }
            }
        }
        return new Stash(qke.k(linkedHashMap));
    }

    public final String toJson() {
        if (this.storage.isEmpty()) {
            return null;
        }
        return new JSONObject(this.storage).toString();
    }

    public String toString() {
        return smw0.n(new StringBuilder("Stash(storage="), this.storage, ')');
    }

    public final Stash with(StashCell cell, String value, boolean withTimestamp) {
        Map<String, String> map = this.storage;
        Map j = value == null ? kotlin.collections.b.j(cell.getValue(), map) : kotlin.collections.b.o(map, new Pair(cell.getValue(), value));
        if (withTimestamp) {
            String str = TIMESTAMP_CELL_PREFIX + cell.getValue();
            ((com.yandex.passport.common.a) this.timeProvider).getClass();
            j = kotlin.collections.b.o(j, new Pair(str, String.valueOf(System.currentTimeMillis())));
        }
        return new Stash(j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator x = qv10.x(this.storage, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Stash> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stash createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new Stash(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stash[] newArray(int i) {
            return new Stash[i];
        }
    }

    public final String get(StashCell cell) {
        return this.storage.get(cell.getValue());
    }
}
