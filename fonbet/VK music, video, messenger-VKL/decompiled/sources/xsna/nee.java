package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClipsGridSourcesData.kt */
/* loaded from: classes14.dex */
public final class nee {
    public final List<ClipVideoFile> a;
    public final PaginationKey b;
    public final List<VideoFile> c;
    public final long d;
    public final PaginationKey e;
    public final List<ClipVideoFile> f;
    public final String g;
    public final String h;
    public final HashMap<String, Long> i;
    public final long j;
    public final long k;
    public final List<ClipGridParams.Data.Profile> l;
    public final Object m;
    public final List<ClipVideoFile> n;
    public final PaginationKey o;
    public final Map<UserId, Owner> p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ nee(List list, PaginationKey paginationKey, List list2, long j, PaginationKey paginationKey2, List list3, String str, String str2, HashMap hashMap, long j2, long j3, List list4, List list5, PaginationKey paginationKey3) {
        this(list, paginationKey, list2, j, paginationKey2, list3, str, str2, hashMap, j2, j3, list4, r16, list5, paginationKey3, r16);
        jgp jgpVar = jgp.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nee)) {
            return false;
        }
        nee neeVar = (nee) obj;
        return epx.f(this.a, neeVar.a) && epx.f(this.b, neeVar.b) && epx.f(this.c, neeVar.c) && this.d == neeVar.d && epx.f(this.e, neeVar.e) && epx.f(this.f, neeVar.f) && epx.f(this.g, neeVar.g) && epx.f(this.h, neeVar.h) && epx.f(this.i, neeVar.i) && this.j == neeVar.j && this.k == neeVar.k && epx.f(this.l, neeVar.l) && epx.f(this.m, neeVar.m) && epx.f(this.n, neeVar.n) && epx.f(this.o, neeVar.o) && epx.f(this.p, neeVar.p);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        List<VideoFile> list = this.c;
        int hashCode2 = (this.e.hashCode() + bh10.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.d)) * 31;
        List<ClipVideoFile> list2 = this.f;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HashMap<String, Long> hashMap = this.i;
        return this.p.hashCode() + ((this.o.hashCode() + fw3.a(vul0.a(fw3.a(bh10.a(bh10.a((hashCode5 + (hashMap != null ? hashMap.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGridSourcesData(clips=");
        sb.append(this.a);
        sb.append(", clipsKey=");
        sb.append(this.b);
        sb.append(", lives=");
        sb.append(this.c);
        sb.append(", livesCount=");
        sb.append(this.d);
        sb.append(", livesKey=");
        sb.append(this.e);
        sb.append(", likedClips=");
        sb.append(this.f);
        sb.append(", likedClipsKey=");
        sb.append(this.g);
        sb.append(", authorDescription=");
        sb.append(this.h);
        sb.append(", clipsCounters=");
        sb.append(this.i);
        sb.append(", viewsCount=");
        sb.append(this.j);
        sb.append(", likesCount=");
        sb.append(this.k);
        sb.append(", clipsProfiles=");
        sb.append(this.l);
        sb.append(", counters=");
        sb.append(this.m);
        sb.append(", delayedPublications=");
        sb.append(this.n);
        sb.append(", delayedPublicationsKey=");
        sb.append(this.o);
        sb.append(", profiles=");
        return cjl0.a(sb, this.p, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nee(List<ClipVideoFile> list, PaginationKey paginationKey, List<? extends VideoFile> list2, long j, PaginationKey paginationKey2, List<ClipVideoFile> list3, String str, String str2, HashMap<String, Long> hashMap, long j2, long j3, List<ClipGridParams.Data.Profile> list4, Map<UserId, Long> map, List<ClipVideoFile> list5, PaginationKey paginationKey3, Map<UserId, Owner> map2) {
        this.a = list;
        this.b = paginationKey;
        this.c = list2;
        this.d = j;
        this.e = paginationKey2;
        this.f = list3;
        this.g = str;
        this.h = str2;
        this.i = hashMap;
        this.j = j2;
        this.k = j3;
        this.l = list4;
        this.m = map;
        this.n = list5;
        this.o = paginationKey3;
        this.p = map2;
    }
}
