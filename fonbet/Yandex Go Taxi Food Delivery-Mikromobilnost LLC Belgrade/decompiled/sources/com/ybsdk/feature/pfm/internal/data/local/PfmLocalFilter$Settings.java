package com.ybsdk.feature.pfm.internal.data.local;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ybb0;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"com/ybsdk/feature/pfm/internal/data/local/PfmLocalFilter$Settings", "Lybb0;", "", "id", "", "filterIds", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Set;", "Lcom/ybsdk/feature/pfm/internal/data/local/PfmLocalFilter$Settings;", "copy", "(Ljava/lang/String;Ljava/util/Set;)Lcom/ybsdk/feature/pfm/internal/data/local/PfmLocalFilter$Settings;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Set;", "getFilterIds", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmLocalFilter$Settings implements ybb0 {
    private final Set<String> filterIds;
    private final String id;

    public PfmLocalFilter$Settings(@Json(name = "id") String str, @Json(name = "filter_ids") Set<String> set) {
        this.id = str;
        this.filterIds = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PfmLocalFilter$Settings copy$default(PfmLocalFilter$Settings pfmLocalFilter$Settings, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pfmLocalFilter$Settings.id;
        }
        if ((i & 2) != 0) {
            set = pfmLocalFilter$Settings.filterIds;
        }
        return pfmLocalFilter$Settings.copy(str, set);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Set<String> component2() {
        return this.filterIds;
    }

    public final PfmLocalFilter$Settings copy(@Json(name = "id") String id, @Json(name = "filter_ids") Set<String> filterIds) {
        return new PfmLocalFilter$Settings(id, filterIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmLocalFilter$Settings)) {
            return false;
        }
        PfmLocalFilter$Settings pfmLocalFilter$Settings = (PfmLocalFilter$Settings) other;
        return jl40.l(this.id, pfmLocalFilter$Settings.id) && jl40.l(this.filterIds, pfmLocalFilter$Settings.filterIds);
    }

    public final Set<String> getFilterIds() {
        return this.filterIds;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.filterIds.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "Settings(id=" + this.id + ", filterIds=" + this.filterIds + Extension.C_BRAKE;
    }
}
