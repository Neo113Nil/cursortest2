package one.video.exo.offline;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.DownloadService;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.exo.offline.e;
import xsna.ahn;
import xsna.bli0;
import xsna.blk;
import xsna.c5g;
import xsna.eli0;
import xsna.g5g;
import xsna.g5z;
import xsna.io20;
import xsna.j5g;
import xsna.kao;
import xsna.ln00;
import xsna.m8o;
import xsna.mli0;
import xsna.qq;
import xsna.rsk;
import xsna.vki0;
import xsna.vl1;
import xsna.vp4;
import xsna.who0;
import xsna.xp4;
import xsna.y57;
import xsna.ygp0;
import xsna.ym00;

/* compiled from: DownloadPipeline.kt */
/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final String b;
    public final DownloadHelper c;
    public final byte[] d;
    public final m8o e;
    public final qq f;
    public final Class<? extends DownloadService> g;
    public final androidx.media3.exoplayer.offline.c h;
    public final b i = new b();

    /* compiled from: DownloadPipeline.kt */
    /* renamed from: one.video.exo.offline.a$a, reason: collision with other inner class name */
    public static final class C2180a {
        public static void a(Context context, String str, DownloadHelper downloadHelper, byte[] bArr, m8o m8oVar, Class cls, androidx.media3.exoplayer.offline.c cVar) {
            if (m8oVar == null) {
                m8oVar = new ahn();
            }
            downloadHelper.j(new one.video.exo.offline.b(new a(context, str, downloadHelper, bArr, m8oVar, new qq(11), cls, cVar)));
        }
    }

    /* compiled from: DownloadPipeline.kt */
    public final class b implements ygp0 {
        public b() {
        }

        @Override // xsna.ygp0
        public final void a(f fVar) {
            Collection collection;
            boolean z;
            String str;
            e<one.video.player.tracks.b> eVar = fVar.c;
            a aVar = a.this;
            DownloadHelper downloadHelper = aVar.c;
            int i = 0;
            if (downloadHelper.i() > 0 && !((z = eVar instanceof e.b))) {
                ArrayList a = ym00.a(downloadHelper.h(), 3);
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((androidx.media3.common.a) it.next()).d);
                }
                if (eVar instanceof e.c) {
                    Iterable iterable = ((e.c) eVar).a;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str2 = ((who0) ((one.video.player.tracks.b) ((kao) it2.next()).a).c).c;
                        if (str2 != null) {
                            arrayList2.add(str2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (j5g.P(arrayList2, (String) next)) {
                            arrayList3.add(next);
                        }
                    }
                    List V = j5g.V(arrayList3);
                    if (!V.isEmpty()) {
                        String[] strArr = (String[]) V.toArray(new String[0]);
                        downloadHelper.b((String[]) Arrays.copyOf(strArr, strArr.length));
                    }
                } else if (eVar instanceof e.a) {
                    String[] strArr2 = blk.e;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            str = null;
                            break;
                        }
                        str = strArr2[i2];
                        if (arrayList.contains(str)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (str == null) {
                        str = (String) j5g.a0(arrayList);
                    }
                    if (str != null) {
                        downloadHelper.b(str);
                    }
                } else if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            DownloadRequest a2 = downloadHelper.f(aVar.b, aVar.d).a();
            HashSet M0 = j5g.M0(a2.e);
            int i3 = -1;
            if (fVar.b != null) {
                if (downloadHelper.g() instanceof rsk) {
                    rsk rskVar = (rsk) downloadHelper.g();
                    vki0 b = g5z.b(new eli0(new bli0(new xp4(rskVar, null)), new vp4(rskVar, i), mli0.b, null));
                    if (b.hasNext()) {
                        T next2 = b.next();
                        if (b.hasNext()) {
                            ArrayList b2 = y57.b(next2);
                            while (b.hasNext()) {
                                b2.add(b.next());
                            }
                            collection = b2;
                        } else {
                            collection = Collections.singletonList(next2);
                        }
                    } else {
                        collection = EmptyList.b;
                    }
                    M0.addAll(collection);
                }
            } else if (downloadHelper.i() > 0) {
                ln00.a h = downloadHelper.h();
                int i4 = h.a;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        i5 = -1;
                        break;
                    } else if (h.b[i5] == 1) {
                        break;
                    } else {
                        i5++;
                    }
                }
                Iterator it4 = M0.iterator();
                while (it4.hasNext()) {
                    if (((StreamKey) it4.next()).c == i5) {
                        it4.remove();
                    }
                }
            }
            e<one.video.player.tracks.c> eVar2 = fVar.a;
            if (!(eVar2 instanceof e.a) && downloadHelper.i() > 0) {
                ln00.a h2 = downloadHelper.h();
                int i6 = h2.a;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    if (h2.b[i7] == 2) {
                        i3 = i7;
                        break;
                    }
                    i7++;
                }
                Iterator it5 = M0.iterator();
                while (it5.hasNext()) {
                    if (((StreamKey) it5.next()).c == i3) {
                        it5.remove();
                    }
                }
                if (eVar2 instanceof e.c) {
                    Iterable iterable2 = ((e.c) eVar2).a;
                    ArrayList arrayList4 = new ArrayList(c5g.u(iterable2, 10));
                    Iterator it6 = iterable2.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(new StreamKey(0, i3, ym00.b(h2, 2, new vl1((kao) it6.next(), 28))));
                    }
                    g5g.y(arrayList4, M0);
                }
            }
            List O0 = j5g.O0(M0);
            String str3 = aVar.b;
            Uri uri = a2.c;
            byte[] bArr = a2.h;
            byte[] bArr2 = a2.f;
            String str4 = a2.g;
            String q = io20.q(a2.d);
            if (O0 == null) {
                ImmutableList.b bVar = ImmutableList.c;
                O0 = com.google.common.collect.g.f;
            }
            DownloadRequest downloadRequest = new DownloadRequest(str3, uri, q, O0, bArr2, str4, bArr, null, null);
            Class<? extends DownloadService> cls = aVar.g;
            if (cls != null) {
                DownloadService.k(aVar.a, cls, downloadRequest);
            } else {
                aVar.h.a(downloadRequest, 0);
            }
            downloadHelper.k();
        }
    }

    public a(Context context, String str, DownloadHelper downloadHelper, byte[] bArr, m8o m8oVar, qq qqVar, Class cls, androidx.media3.exoplayer.offline.c cVar) {
        this.a = context;
        this.b = str;
        this.c = downloadHelper;
        this.d = bArr;
        this.e = m8oVar;
        this.f = qqVar;
        this.g = cls;
        this.h = cVar;
    }
}
