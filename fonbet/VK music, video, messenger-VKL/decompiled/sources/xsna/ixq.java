package xsna;

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
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import xsna.qd60;

/* compiled from: FeedCacheManagerImpl.kt */
/* loaded from: classes4.dex */
public final class ixq implements hxq {
    public final qd60 a;

    public ixq(qd60 qd60Var) {
        this.a = qd60Var;
    }

    @Override // xsna.hxq
    public final io.reactivex.rxjava3.internal.operators.completable.y a(UserId userId) {
        qd60 qd60Var = this.a;
        return new io.reactivex.rxjava3.internal.operators.completable.m(new hca(3, qd60Var, userId)).q(qd60Var.b);
    }

    @Override // xsna.hxq
    public final io.reactivex.rxjava3.core.a b(final int i, final String str, final boolean z, List list) {
        final qd60 qd60Var = this.a;
        io.reactivex.rxjava3.core.w wVar = qd60Var.b;
        final UserId c = qd60Var.a.c();
        if (!fkq0.c(c)) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        final ArrayList t = up2.t(list);
        NewsfeedData.Info info = new NewsfeedData.Info(c, str, i, z, 0L, 16, null);
        qd60.e eVar = qd60Var.e;
        ArrayList arrayList = new ArrayList(c5g.u(t, 10));
        Iterator it = t.iterator();
        while (it.hasNext()) {
            arrayList.add(((CachedNewsEntry) it.next()).b);
        }
        eVar.a(arrayList, info);
        return t.isEmpty() ? io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.ld60
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                qd60 qd60Var2 = qd60.this;
                qd60Var2.b();
                qd60Var2.a(i, c, z).delete();
            }
        }).q(wVar) : new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.md60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                qd60 qd60Var2 = qd60.this;
                qd60Var2.b();
                int i2 = i;
                UserId userId = c;
                boolean z2 = z;
                File a = qd60Var2.a(i2, userId, z2);
                File file = qd60Var2.d;
                File file2 = new File(file, a.getName() + ".tmp." + System.nanoTime());
                StringBuilder sb = new StringBuilder();
                sb.append(a.getName());
                sb.append(".tmp.");
                String sb2 = sb.toString();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file3 : listFiles) {
                        if (brm0.B(file3.getName(), sb2, false)) {
                            arrayList2.add(file3);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((File) it2.next()).delete();
                    }
                }
                ArrayList arrayList3 = t;
                int size = arrayList3.size();
                ArrayList arrayList4 = new ArrayList(size);
                ArrayList arrayList5 = new ArrayList(size);
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    CachedNewsEntry cachedNewsEntry = (CachedNewsEntry) it3.next();
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    byte[] e = Serializer.b.e(cachedNewsEntry);
                    NewsEntry newsEntry = cachedNewsEntry.b;
                    int zb = newsEntry.zb();
                    boolean z3 = newsEntry.Cb().e;
                    arrayList5.add(e);
                    int length = e.length;
                    int i3 = (zb & 255) << 16;
                    if (z3) {
                        i3 |= 2;
                    }
                    arrayList4.add(new qd60.d(0L, length, i3));
                    arrayList5 = arrayList5;
                }
                ArrayList arrayList6 = arrayList5;
                String str2 = str;
                byte[] bytes = str2 != null ? str2.getBytes(emb.b) : null;
                int length2 = bytes != null ? bytes.length : -1;
                long max = (size * 16) + Math.max(0, length2) + 41;
                for (int i4 = 0; i4 < size; i4++) {
                    qd60.d dVar = (qd60.d) arrayList4.get(i4);
                    arrayList4.set(i4, new qd60.d(max, dVar.b, dVar.c));
                    max += ((qd60.d) arrayList4.get(i4)).b;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    randomAccessFile.writeInt(1313227843);
                    randomAccessFile.writeInt(1);
                    randomAccessFile.writeInt(qd60Var2.c);
                    randomAccessFile.writeInt(size);
                    randomAccessFile.writeLong(userId.b);
                    randomAccessFile.writeInt(length2);
                    if (bytes != null) {
                        randomAccessFile.write(bytes);
                    }
                    randomAccessFile.writeInt(i2);
                    randomAccessFile.writeByte(z2 ? 1 : 0);
                    randomAccessFile.writeLong(System.currentTimeMillis());
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        qd60.d dVar2 = (qd60.d) it4.next();
                        randomAccessFile.writeLong(dVar2.a);
                        randomAccessFile.writeInt(dVar2.b);
                        randomAccessFile.writeInt(dVar2.c);
                    }
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        randomAccessFile.write((byte[]) it5.next());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    randomAccessFile.close();
                    a.delete();
                    if (!file2.renameTo(a)) {
                        nbr.k(file2, a, true, 4);
                        file2.delete();
                    }
                    return s3q0.a;
                } finally {
                }
            }
        }).q(wVar);
    }

    @Override // xsna.hxq
    public final io.reactivex.rxjava3.core.x<NewsfeedData> c(final int i, final boolean z) {
        final qd60 qd60Var = this.a;
        final UserId c = qd60Var.a.c();
        if (!fkq0.c(c)) {
            return io.reactivex.rxjava3.core.x.i(new IllegalArgumentException("User is not authenticated"));
        }
        Map<Integer, NewsfeedData> map = qd60Var.e.a.get(c);
        NewsfeedData newsfeedData = map == null ? null : map.get(Integer.valueOf(((z ? 1 : 0) << 30) | (i & 255)));
        return newsfeedData != null ? io.reactivex.rxjava3.core.x.k(newsfeedData) : new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.pd60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                NewsfeedData newsfeedData2;
                qd60 qd60Var2 = qd60.this;
                qd60.e eVar = qd60Var2.e;
                qd60Var2.b();
                int i2 = i;
                UserId userId = c;
                boolean z2 = z;
                File a = qd60Var2.a(i2, userId, z2);
                if (!a.exists() || a.length() == 0) {
                    return new NewsfeedData(EmptyList.b, new NewsfeedData.Info(userId, null, i2, z2, 0L, 16, null));
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(a, "r");
                try {
                    qd60.c d = qd60Var2.d(randomAccessFile, a, userId);
                    if (d == null) {
                        newsfeedData2 = new NewsfeedData(EmptyList.b, new NewsfeedData.Info(userId, null, i2, z2, 0L, 16, null));
                    } else {
                        int i3 = d.f;
                        if (i3 == 0) {
                            EmptyList emptyList = EmptyList.b;
                            NewsfeedData newsfeedData3 = new NewsfeedData(emptyList, d.a());
                            eVar.a(emptyList, d.a());
                            newsfeedData2 = newsfeedData3;
                        } else {
                            ArrayList arrayList = new ArrayList(i3);
                            for (int i4 = 0; i4 < i3; i4++) {
                                arrayList.add(new qd60.d(randomAccessFile.readLong(), randomAccessFile.readInt(), randomAccessFile.readInt()));
                            }
                            ArrayList c2 = qd60.c(randomAccessFile, arrayList, z2 ? qd60.e(arrayList) : j5g.O0(e43.g(arrayList)));
                            List list = c2;
                            if (!z2) {
                                Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                                list = NewsfeedData.a.e(c2);
                            }
                            NewsfeedData newsfeedData4 = new NewsfeedData(list, d.a());
                            eVar.a(list, d.a());
                            newsfeedData2 = newsfeedData4;
                        }
                    }
                    randomAccessFile.close();
                    return newsfeedData2;
                } finally {
                }
            }
        }).q(qd60Var.b);
    }
}
