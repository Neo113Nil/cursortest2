package xsna;

import android.net.Uri;
import android.util.Log;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.google.common.collect.ImmutableList;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.offline.api.domain.download.DownloadType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.SimpleTimeZone;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;
import xsna.ju70;
import xsna.lt70;

/* compiled from: OneVideoMigrationController.kt */
/* loaded from: classes.dex */
public final class gm80 {
    public final bu70 a;
    public final Cache b;
    public final androidx.media3.exoplayer.offline.c c;
    public final t2j0 d;
    public final bpn0 f;
    public final boolean e = com.vk.toggle.d.A().b;
    public final bpn0 g = new bpn0(new gb3(this, 11));
    public final bpn0 h = new bpn0(new g3o(this, 6));
    public final HlsPlaylistParser i = new HlsPlaylistParser();

    /* compiled from: OneVideoMigrationController.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CachePair(inputKey=");
            sb.append(this.a);
            sb.append(", outputKey=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: OneVideoMigrationController.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public final Cache a;
        public final zzx0 b;
        public final String c;

        public b(Cache cache, zzx0 zzx0Var, String str) {
            this.a = cache;
            this.b = zzx0Var;
            this.c = str;
        }

        public final Cache a() {
            return this.a;
        }

        public final zzx0 b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MigrationParams(cache=");
            sb.append(this.a);
            sb.append(", downloadIndex=");
            sb.append(this.b);
            sb.append(", manifestKey=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: OneVideoMigrationController.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadType.values().length];
            try {
                iArr[DownloadType.PODCAST_EPISODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadType.MUSIC_TRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadType.AUDIO_BOOK_CHAPTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gm80(bu70 bu70Var, mu70 mu70Var, androidx.media3.exoplayer.offline.c cVar, t2j0 t2j0Var, bpn0 bpn0Var) {
        this.a = bu70Var;
        this.b = mu70Var;
        this.c = cVar;
        this.d = t2j0Var;
        this.f = bpn0Var;
    }

    public static void a(String str, String str2, Cache cache, Cache cache2) {
        if (j5g.P(cache2.getKeys(), str2) || str2 == null) {
            return;
        }
        for (qx8 qx8Var : cache.getCachedSpans(str)) {
            File file = qx8Var.f;
            if (file != null) {
                cache2.a(qx8Var.c, qx8Var.d, str2);
                File startFile = cache2.startFile(str2, qx8Var.c, qx8Var.d);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(startFile);
                    try {
                        i7o0.b(fileInputStream, fileOutputStream, 8192);
                        fileOutputStream.close();
                        fileInputStream.close();
                        cij contentMetadata = cache.getContentMetadata(str);
                        dij dijVar = new dij();
                        dijVar.b(cij.b(contentMetadata));
                        Uri a2 = cij.a(contentMetadata);
                        if (a2 != null) {
                            dijVar.c(a2.toString());
                        }
                        cache2.f(str2, dijVar);
                        cache2.e(startFile, qx8Var.d);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(fileInputStream, th);
                        throw th2;
                    }
                }
            }
        }
    }

    public static String c(String str) {
        String A = d370.A(str);
        if (A == null) {
            return null;
        }
        int i = c.$EnumSwitchMapping$0[d370.Q(str).ordinal()];
        if (i == 1 || i == 2) {
            return A;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Serializer.c<AudioBookChapter> cVar = AudioBookChapter.CREATOR;
        return AudioBookChapter.a.a(A);
    }

    public final List<a> b(String str, String str2, o7o o7oVar, b bVar, b bVar2) {
        Object obj;
        String str3;
        HashSet hashSet = new HashSet();
        hashSet.add(new a(bVar.c(), bVar2.c()));
        Iterator<T> it = bVar.a().getCachedSpans(bVar.c()).iterator();
        while (it.hasNext()) {
            File file = ((qx8) it.next()).f;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                Uri uri = o7oVar.a.c;
                o9v a2 = this.i.a(uri, fileInputStream);
                androidx.media3.exoplayer.hls.playlist.b bVar3 = a2 instanceof androidx.media3.exoplayer.hls.playlist.b ? (androidx.media3.exoplayer.hls.playlist.b) a2 : null;
                if (bVar3 == null) {
                    throw new IllegalArgumentException(i6n0.a(uri, "Can't parse manifest by uri : "));
                }
                ImmutableList immutableList = bVar3.r;
                Iterator<E> it2 = immutableList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    b.e eVar = (b.e) obj;
                    if (eVar.h != null && j5g.P(bVar.a().getKeys(), eVar.h)) {
                        break;
                    }
                }
                b.e eVar2 = (b.e) obj;
                if (eVar2 == null || (str3 = eVar2.h) == null) {
                    throw new IllegalArgumentException("Can't find keyPubUrl in inputCache. Segments count " + immutableList.size() + " in manifest " + uri);
                }
                hashSet.add(new a(str3, str3));
                String uri2 = uri.toString();
                int K = drm0.K(0, 6, uri2, "index.m3u8", false);
                String c2 = K < 0 ? null : neq0.c(str3, uri2.substring(K));
                if (!epx.f(c2, uri.toString())) {
                    if (!j5g.P(bVar.a().getKeys(), c2) || c2 == null) {
                        hashSet.add(new a(bVar.c(), c2));
                    } else {
                        this.d.b(str, str2, c2);
                        hashSet.add(new a(c2, null));
                    }
                }
                Iterator<E> it3 = immutableList.iterator();
                while (it3.hasNext()) {
                    String c3 = neq0.c(str3, ((b.e) it3.next()).b);
                    p4g.a(new a(c3, c3), hashSet, bVar.a().getKeys().contains(c3));
                }
            }
        }
        return j5g.O0(hashSet);
    }

    public final boolean d() {
        bpn0 bpn0Var = this.f;
        if (BuildInfo.h()) {
            return true;
        }
        SimpleTimeZone simpleTimeZone = pvo0.a;
        xuo0.a.getClass();
        long a2 = xuo0.a();
        if (a2 - ((com.vk.music.pref.a) bpn0Var.getValue()).X() < TimeUtils.MILLISECONDS_PER_DAY) {
            return false;
        }
        ((com.vk.music.pref.a) bpn0Var.getValue()).a0(a2);
        return true;
    }

    public final void e() {
        if (this.e) {
            Iterator it = j5g.C0(this.b.getKeys()).iterator();
            while (it.hasNext()) {
                drm0.D((String) it.next(), "image", false);
            }
            Cache cache = (Cache) this.h.getValue();
            if (cache != null) {
                for (String str : cache.getKeys()) {
                }
            }
        }
    }

    public final void f(o7o o7oVar, ekh ekhVar) {
        Cache cache;
        DownloadRequest downloadRequest = o7oVar.a;
        String str = downloadRequest.b;
        String c2 = c(str);
        if (c2 == null || (cache = (Cache) this.h.getValue()) == null) {
            return;
        }
        h(str, c2, new b(this.b, this.c.b, ju70.a.g(c2)), new b(cache, ((androidx.media3.exoplayer.offline.c) this.g.getValue()).b, downloadRequest.c.toString()), ekhVar, true);
    }

    public final void g(o7o o7oVar, fm80 fm80Var) {
        Cache cache;
        DownloadRequest downloadRequest = o7oVar.a;
        String str = downloadRequest.b;
        String c2 = c(str);
        if (c2 == null || (cache = (Cache) this.h.getValue()) == null) {
            return;
        }
        h(str, c2, new b(cache, ((androidx.media3.exoplayer.offline.c) this.g.getValue()).b, downloadRequest.c.toString()), new b(this.b, this.c.b, ju70.a.g(c2)), fm80Var, false);
    }

    public final void h(String str, String str2, b bVar, b bVar2, izs<? super o7o, s3q0> izsVar, boolean z) {
        Exception exc;
        boolean z2;
        o7o b2 = bVar.b().b(str);
        if (b2 == null) {
            return;
        }
        try {
            DownloadRequest downloadRequest = b2.a;
            boolean z3 = this.e;
            if (z3) {
                Objects.toString(downloadRequest.c);
            }
            if (ju70.a.c(downloadRequest.c.toString())) {
                List<a> b3 = b(str, str2, b2, bVar, bVar2);
                if (z3) {
                    b3.size();
                }
                if (b3.size() <= 1) {
                    throw new IllegalArgumentException("No segments for track " + str);
                }
                for (a aVar : b3) {
                    a(aVar.a(), aVar.b(), bVar.a(), bVar2.a());
                }
                zzx0 b4 = bVar2.b();
                if (b4 == null) {
                    b4 = null;
                }
                if (b4 != null) {
                    b4.d(b2);
                    try {
                        Iterator<T> it = b3.iterator();
                        while (it.hasNext()) {
                            String a2 = ((a) it.next()).a();
                            Cache a3 = bVar.a();
                            if (a3.getKeys().contains(a2)) {
                                a3.c(a2);
                            }
                        }
                        zzx0 b5 = bVar.b();
                        zzx0 zzx0Var = b5 != null ? b5 : null;
                        if (zzx0Var != null) {
                            zzx0Var.a(str);
                        }
                        izsVar.invoke(b2);
                    } catch (Exception e) {
                        exc = e;
                        z2 = true;
                        new lt70.b(str, exc, z, bVar.c(), bVar2.c(), z2).q();
                        Log.e("OneVideoMigration", mnh0.A(exc));
                    }
                }
            }
        } catch (Exception e2) {
            exc = e2;
            z2 = false;
        }
    }
}
