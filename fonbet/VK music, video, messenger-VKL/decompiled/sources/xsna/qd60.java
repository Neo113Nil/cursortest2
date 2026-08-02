package xsna;

import android.content.Context;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.feed.core.models.cache.CachedNewsEntry;
import com.vk.feed.core.models.news.NewsEntry;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: NewsfeedCacheStorage.kt */
/* loaded from: classes18.dex */
public final class qd60 {
    public final b25 a;
    public final io.reactivex.rxjava3.core.w b;
    public final int c;
    public final File d;
    public final e e = new e();

    /* compiled from: NewsfeedCacheStorage.kt */
    public static final class a implements rv8 {
        public final qd60 b;
        public final String c;
        public final CacheTarget d;

        public a(qd60 qd60Var) {
            CacheTarget cacheTarget = CacheTarget.OTHER;
            this.b = qd60Var;
            this.c = "FeedCacheManager";
            this.d = cacheTarget;
        }

        @Override // xsna.rv8
        public final CacheTarget a() {
            return this.d;
        }

        @Override // xsna.rv8
        public final void b(boolean z) {
            if (z) {
                return;
            }
            qd60 qd60Var = this.b;
            qd60Var.getClass();
            io.reactivex.rxjava3.internal.operators.completable.y q = new io.reactivex.rxjava3.internal.operators.completable.m(new od60(qd60Var, 0)).q(qd60Var.b);
            io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d();
            q.subscribe(dVar);
            dVar.b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.rv8
        public final long e() {
            qd60 qd60Var = this.b;
            qd60Var.getClass();
            return ((Number) new io.reactivex.rxjava3.internal.operators.single.v(new nd60(qd60Var, 0)).q(qd60Var.b).c()).longValue();
        }

        @Override // xsna.rv8
        public final String getDescription() {
            return this.c;
        }
    }

    /* compiled from: NewsfeedCacheStorage.kt */
    public static final class b {
    }

    /* compiled from: NewsfeedCacheStorage.kt */
    public static final class c {
        public final long a;
        public final String b;
        public final int c;
        public final boolean d;
        public final long e;
        public final int f;

        public c(long j, String str, int i, boolean z, long j2, int i2) {
            this.a = j;
            this.b = str;
            this.c = i;
            this.d = z;
            this.e = j2;
            this.f = i2;
        }

        public final NewsfeedData.Info a() {
            return new NewsfeedData.Info(new UserId(this.a), this.b, this.c, this.d, this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            String str = this.b;
            return Integer.hashCode(this.f) + bh10.a(qoy.b(shy.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FileHeader(userId=");
            sb.append(this.a);
            sb.append(", nextFrom=");
            sb.append(this.b);
            sb.append(", listId=");
            sb.append(this.c);
            sb.append(", isSmart=");
            sb.append(this.d);
            sb.append(", createdAt=");
            sb.append(this.e);
            sb.append(", entryCount=");
            return vu5.b(sb, this.f, ')');
        }
    }

    /* compiled from: NewsfeedCacheStorage.kt */
    public static final class d {
        public final long a;
        public final int b;
        public final int c;

        public d(long j, int i, int i2) {
            this.a = j;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "FileIndexEntry(offset=" + this.a + ", length=" + this.b + ", flags=" + ((Object) ("CachedNewsEntryFlags(value=" + this.c + ')')) + ')';
        }
    }

    /* compiled from: NewsfeedCacheStorage.kt */
    public static final class e {
        public final ConcurrentHashMap<UserId, Map<Integer, NewsfeedData>> a = new ConcurrentHashMap<>();

        public final void a(List list, NewsfeedData.Info info) {
            Map<Integer, NewsfeedData> putIfAbsent;
            UserId userId = info.b;
            ConcurrentHashMap<UserId, Map<Integer, NewsfeedData>> concurrentHashMap = this.a;
            Map<Integer, NewsfeedData> map = concurrentHashMap.get(userId);
            if (map == null && (putIfAbsent = concurrentHashMap.putIfAbsent(userId, (map = new ConcurrentHashMap<>()))) != null) {
                map = putIfAbsent;
            }
            map.put(Integer.valueOf((info.d & 255) | ((info.e ? 1 : 0) << 30)), new NewsfeedData(new ArrayList(list), info));
        }
    }

    public qd60(Context context, b25 b25Var, gx8 gx8Var, io.reactivex.rxjava3.core.w wVar, int i) {
        this.a = b25Var;
        this.b = wVar;
        this.c = i;
        this.d = new File(context.getFilesDir(), "newsfeed_file_cache");
        gx8Var.c(new tv8(new a(this)));
    }

    public static ArrayList c(RandomAccessFile randomAccessFile, ArrayList arrayList, List list) {
        ClassLoader classLoader = CachedNewsEntry.class.getClassLoader();
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) arrayList.get(((Number) it.next()).intValue());
            randomAccessFile.seek(dVar.a);
            byte[] bArr = new byte[dVar.b];
            randomAccessFile.readFully(bArr);
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            CachedNewsEntry cachedNewsEntry = (CachedNewsEntry) Serializer.b.a(bArr, classLoader);
            NewsEntry newsEntry = cachedNewsEntry != null ? cachedNewsEntry.b : null;
            if (newsEntry != null) {
                arrayList2.add(newsEntry);
            }
        }
        return arrayList2;
    }

    public static ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(5);
        ArrayList arrayList3 = new ArrayList(5);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int i2 = ((d) arrayList.get(i)).c;
            if (((i2 >> 16) & 255) == 0) {
                if ((i2 & 2) == 0) {
                    arrayList2.add(Integer.valueOf(i));
                } else if (arrayList3.size() < 5) {
                    arrayList3.add(Integer.valueOf(i));
                }
                if (arrayList2.size() >= 5) {
                    break;
                }
            }
        }
        return arrayList2.isEmpty() ? arrayList3 : arrayList2;
    }

    public final File a(int i, UserId userId, boolean z) {
        int i2 = (i & 255) | ((z ? 1 : 0) << 30);
        StringBuilder sb = new StringBuilder();
        sb.append("feed_cache_" + userId.b);
        sb.append('_');
        return new File(this.d, h5s.c(i2, ".dat", sb));
    }

    public final void b() {
        this.d.mkdirs();
    }

    public final c d(RandomAccessFile randomAccessFile, File file, UserId userId) {
        String str = null;
        if (randomAccessFile.readInt() != 1313227843) {
            file.delete();
            return null;
        }
        if (randomAccessFile.readInt() != 1) {
            file.delete();
            return null;
        }
        if (randomAccessFile.readInt() != this.c) {
            file.delete();
            return null;
        }
        int readInt = randomAccessFile.readInt();
        long readLong = randomAccessFile.readLong();
        if (readLong != userId.b) {
            file.delete();
            return null;
        }
        int readInt2 = randomAccessFile.readInt();
        if (readInt2 >= 0) {
            byte[] bArr = new byte[readInt2];
            randomAccessFile.readFully(bArr);
            str = new String(bArr, emb.b);
        }
        return new c(readLong, str, randomAccessFile.readInt(), randomAccessFile.readByte() == 1, randomAccessFile.readLong(), readInt);
    }
}
