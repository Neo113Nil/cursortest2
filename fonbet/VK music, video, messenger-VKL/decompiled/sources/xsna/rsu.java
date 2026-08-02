package xsna;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.stats.StatsTrackUploadServerStateAPIRequest;
import com.vk.core.files.a;
import com.vk.core.preference.Preference;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.log.L;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.m;
import okhttp3.p;
import ru.ok.android.commons.http.Http;

/* compiled from: HTTPResumableUploadTask.java */
/* loaded from: classes11.dex */
public abstract class rsu<S extends Parcelable> extends com.vk.upload.impl.b<S> {
    public static final boolean s = vx2.d.u();
    public static final String t = rsu.class.getSimpleName();
    public final String i;
    public f8f0 l;
    public long q;
    public boolean j = true;
    public final Object k = new Object();
    public final String m = Preference.f("uploads").getString(g0(this.d, ".session"), UUID.randomUUID().toString());
    public String p = Preference.f("uploads").getString(g0(this.d, ".preprocess"), null);
    public String o = Preference.f("uploads").getString(g0(this.d, ".range"), null);
    public int n = Preference.f("uploads").getInt(g0(this.d, ".attempt"), 0);
    public String r = Preference.f("uploads").getString(g0(this.d, ".last_upload_url"), null);

    /* compiled from: HTTPResumableUploadTask.java */
    /* loaded from: classes6.dex */
    public static class a implements Comparable<a> {
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public long f;
        public final boolean g;

        public a(long j, long j2, long j3, boolean z) {
            this.b = j;
            this.c = j2;
            this.d = (j2 - j) + 1;
            this.e = j3;
            this.g = z;
        }

        public static List e(ArrayList arrayList, boolean z) {
            if (arrayList.size() < 2) {
                return arrayList;
            }
            Collections.sort(arrayList);
            a aVar = (a) arrayList.get(0);
            long j = aVar.e;
            long j2 = aVar.b;
            long j3 = aVar.c;
            ArrayList arrayList2 = new ArrayList();
            long j4 = j3;
            long j5 = j2;
            for (int i = 1; i < arrayList.size(); i++) {
                a aVar2 = (a) arrayList.get(i);
                long j6 = aVar2.b;
                long j7 = aVar2.c;
                if (j6 <= j4) {
                    j4 = Math.max(j7, j4);
                } else {
                    arrayList2.add(new a(j5, j4, j, z));
                    j5 = aVar2.b;
                    j4 = j7;
                }
            }
            arrayList2.add(new a(j5, j4, j, z));
            return arrayList2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull a aVar) {
            return (int) (this.b - aVar.b);
        }

        public final void d(FileInputStream fileInputStream, OutputStream outputStream, long j, com.vk.upload.impl.b bVar) throws IOException {
            a aVar = this;
            byte[] bArr = new byte[16384];
            long j2 = aVar.e;
            long j3 = aVar.d;
            long j4 = 0;
            if (j2 == j3 && aVar.g) {
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        return;
                    }
                    outputStream.write(bArr, 0, read);
                    outputStream.flush();
                    long j5 = j4 + read;
                    aVar.f(bVar, j5, j);
                    j4 = j5;
                }
            } else {
                fileInputStream.skip(aVar.b);
                long j6 = 0;
                while (true) {
                    int read2 = fileInputStream.read(bArr);
                    if (read2 <= 0) {
                        return;
                    }
                    long j7 = read2;
                    long j8 = j3 - j7;
                    if (j8 <= 0) {
                        outputStream.write(bArr, 0, ((int) j8) + read2);
                        outputStream.flush();
                        return;
                    }
                    outputStream.write(bArr, 0, read2);
                    outputStream.flush();
                    long j9 = j6 + j7;
                    aVar.f(bVar, j9, j);
                    aVar = this;
                    j6 = j9;
                    j3 = j8;
                }
            }
        }

        public final void f(com.vk.upload.impl.b bVar, long j, long j2) {
            if (System.currentTimeMillis() - this.f >= 150) {
                bVar.c0((int) (((j2 + j) / this.e) * 100.0f), 100, false);
                this.f = System.currentTimeMillis();
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range{start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", length=");
            sb.append(this.d);
            sb.append(", currentTotal=");
            sb.append(this.e);
            sb.append(", lastUpdate=");
            return vu5.a('}', this.f, sb);
        }
    }

    /* compiled from: HTTPResumableUploadTask.java */
    public static abstract class b<T extends rsu<?>> extends b.a<T> {
    }

    /* compiled from: HTTPResumableUploadTask.java */
    /* loaded from: classes6.dex */
    public class c extends okhttp3.t {
        public final String c;
        public a d;
        public long e;

        public c(String str) {
            this.c = str;
            if (str.startsWith(DomExceptionUtils.SEPARATOR)) {
                this.c = new Uri.Builder().scheme(X3.i.b).path(str).build().toString();
            }
        }

        public final long a() {
            String str = this.c;
            try {
                AssetFileDescriptor openAssetFileDescriptor = e43.a.getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r");
                long length = openAssetFileDescriptor.getLength();
                openAssetFileDescriptor.close();
                return length == 0 ? new File(str).length() : length;
            } catch (Exception unused) {
                return 0L;
            }
        }

        public final void b(a aVar) {
            this.d = aVar;
        }

        public final void c(long j) {
            this.e = j;
        }

        @Override // okhttp3.t
        public final long contentLength() {
            return this.d.d;
        }

        @Override // okhttp3.t
        public final okhttp3.m contentType() {
            Pattern pattern = okhttp3.m.e;
            try {
                return m.a.a(Http.ContentType.APPLICATION_OCTET_STREAM);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // okhttp3.t
        public final void writeTo(@NonNull an8 an8Var) throws IOException {
            Closeable closeable;
            AssetFileDescriptor assetFileDescriptor;
            OutputStream b4 = an8Var.b4();
            FileInputStream fileInputStream = null;
            try {
                try {
                    assetFileDescriptor = e43.a.getContentResolver().openAssetFileDescriptor(Uri.parse(this.c), "r");
                    if (assetFileDescriptor != null) {
                        try {
                            FileInputStream createInputStream = assetFileDescriptor.createInputStream();
                            try {
                                this.d.d(createInputStream, b4, this.e, rsu.this);
                                fileInputStream = createInputStream;
                            } catch (IOException e) {
                                e = e;
                                IOException iOException = e;
                                L.C("vk", iOException);
                                throw iOException;
                            }
                        } catch (IOException e2) {
                            e = e2;
                        } catch (Throwable th) {
                            th = th;
                            closeable = null;
                            Throwable th2 = th;
                            a.c.a(closeable);
                            a.c.a(assetFileDescriptor);
                            throw th2;
                        }
                    }
                    a.c.a(fileInputStream);
                    a.c.a(assetFileDescriptor);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
                closeable = null;
                assetFileDescriptor = null;
            }
        }
    }

    public rsu(String str) {
        this.i = str;
    }

    public static String f0(Uri uri) {
        String F = HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(uri.getScheme()) ? com.vk.core.files.a.F(uri) : uri.getLastPathSegment();
        return !TextUtils.isEmpty(F) ? xhr0.c(F) : "video.mp4";
    }

    public static String g0(int i, String str) {
        return tgw.b(i, "http.resumable.upload.task.", str);
    }

    public static a h0(long j, long j2, boolean z) {
        return new a(j, (Math.min(j2 - j, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + j) - 1, j2, z);
    }

    @Override // xsna.sp6
    public void L(S s2) throws Exception {
        Preference.f("uploads").edit().clear().apply();
        j0();
    }

    @Override // xsna.sp6
    public final void V() {
        this.n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0462 A[EDGE_INSN: B:127:0x0462->B:128:0x0462 BREAK  A[LOOP:0: B:11:0x0032->B:126:0x0032], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03fc  */
    @Override // xsna.sp6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Z(@NonNull String str) throws UploadException, InterruptedException {
        int i;
        boolean z;
        long j;
        int i2;
        List list;
        a aVar;
        okhttp3.u uVar;
        String str2;
        okhttp3.u uVar2;
        StatsTrackUploadServerStateAPIRequest.State state;
        boolean z2;
        StatsTrackUploadServerStateAPIRequest.State state2;
        long j2;
        String str3 = str;
        if (!str3.equals(this.r)) {
            this.o = null;
            this.r = str3;
        }
        if (this.p == null) {
            this.p = i0();
            k0();
        }
        String str4 = this.p;
        if (str4 == null) {
            str4 = this.i;
        }
        String str5 = "vk";
        c cVar = new c(str4);
        int i3 = 0;
        boolean z3 = false;
        while (!this.e && this.n < 5) {
            boolean z4 = s;
            if (z4) {
                L.e(t, "--------------------");
            }
            synchronized (this) {
                z = this.j;
            }
            if (z) {
                j = cVar.a();
            } else {
                synchronized (this) {
                    j = this.q;
                }
            }
            if (z4) {
                L.e(t, defpackage.k0.a(j, "File length: "));
            }
            String str6 = this.o;
            if (str6 == null || !str6.matches("\\d*-\\d*\\/(\\d*|\\*)(,\\d*-\\d*\\/(\\d*|\\*))*$")) {
                i2 = 1;
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] split = str6.split(StringUtils.COMMA);
                int length = split.length;
                int i4 = i3;
                while (i4 < length) {
                    String str7 = split[i4];
                    String[] strArr = split;
                    int indexOf = str7.indexOf("-");
                    int indexOf2 = str7.indexOf(DomExceptionUtils.SEPARATOR);
                    String substring = str7.substring(i3, indexOf);
                    int i5 = indexOf + 1;
                    if (indexOf2 <= 0) {
                        indexOf2 = str7.length();
                    }
                    arrayList.add(new a(Long.parseLong(substring), Long.parseLong(str7.substring(i5, indexOf2)), j, z));
                    i4++;
                    split = strArr;
                    i3 = 0;
                }
                i2 = 1;
                list = a.e(arrayList, z);
            }
            boolean z5 = s;
            if (z5) {
                L.e(t, "Uploaded ranges: " + Arrays.toString(list.toArray(new a[0])));
            }
            int i6 = (!list.isEmpty() || j > m0()) ? 0 : i2;
            boolean z6 = !list.isEmpty() && ((a) ji.a(i2, list)).c == j - 1;
            if (z || (i6 == 0 && !z6)) {
                long m0 = m0();
                String str8 = str5;
                if (list.isEmpty()) {
                    aVar = z ? h0(0L, j, z) : h0(m0, j, z);
                } else if (list.size() == 1) {
                    a aVar2 = (a) list.get(0);
                    if (aVar2.c == j - 1) {
                        aVar = new a(Math.max(aVar2.b - PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 0L), aVar2.b - 1, j, z);
                        z = z;
                    } else {
                        aVar = h0(aVar2.c, j, z);
                    }
                } else {
                    a aVar3 = (a) list.get(0);
                    a aVar4 = (a) list.get(1);
                    aVar = aVar4.b - aVar3.c <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? new a(aVar3.c + 1, aVar4.b - 1, j, z) : h0(aVar3.c, j, z);
                }
                Iterator it = list.iterator();
                long j3 = 0;
                while (it.hasNext()) {
                    j3 += ((a) it.next()).d;
                }
                cVar.c(j3);
                cVar.b(aVar);
                boolean z7 = s;
                if (z7) {
                    L.e(t, "Next upload range: " + aVar);
                }
                StringBuilder e = fw3.e(aVar.b + "-" + aVar.c + DomExceptionUtils.SEPARATOR);
                e.append(z ? Long.valueOf(j) : "*");
                String sb = e.toString();
                p.a aVar5 = new p.a();
                aVar5.i(str3);
                aVar5.f("POST", cVar);
                aVar5.c.h("Session-ID", this.m);
                aVar5.c.h("Connection", "Keep-Alive");
                aVar5.c.h(Http.Header.CONTENT_DISPOSITION, "attachment; filename=\"" + f0(Uri.parse(Uri.encode(this.i))) + "\"");
                StringBuilder sb2 = new StringBuilder("bytes ");
                sb2.append(sb);
                aVar5.c.h(Http.Header.CONTENT_RANGE, sb2.toString());
                okhttp3.p b2 = aVar5.b();
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                o260Var.getClass();
                okhttp3.d a2 = o260Var.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(b2);
                this.l = (f8f0) a2;
                if (z7) {
                    L.e(t, go9.b("Request Content-Range: bytes ", sb));
                }
                String str9 = "";
                int i7 = -1;
                try {
                    uVar2 = ((f8f0) a2).execute();
                    try {
                        try {
                            this.o = uVar2.q();
                            i7 = uVar2.o();
                            str9 = uVar2.m().string();
                            if (z7) {
                                String str10 = t;
                                L.e(str10, "Response code: " + i7);
                                L.e(str10, "Response range: " + this.o);
                                L.e(str10, "Response body: " + str9);
                            }
                            if (vx2.d.u()) {
                                str2 = str8;
                                try {
                                    L.e(str2, str9);
                                } catch (SocketTimeoutException e2) {
                                    e = e2;
                                    state = StatsTrackUploadServerStateAPIRequest.State.TIMEOUT;
                                    a.c.a(uVar2);
                                    z2 = z3;
                                    Exception exc = e;
                                    int i8 = i7;
                                    String str11 = str9;
                                    this.l = null;
                                    k0();
                                    if (!z) {
                                    }
                                    StatsTrackUploadServerStateAPIRequest.State state3 = state;
                                    i = 5;
                                    d0(exc, str3, j, f0(Uri.parse(Uri.encode(this.i))), state3, i8, str11);
                                    if (z2) {
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    state = ozg0.a().x() ? StatsTrackUploadServerStateAPIRequest.State.UNKNOWN : StatsTrackUploadServerStateAPIRequest.State.NO_NETWORK;
                                    a.c.a(uVar2);
                                    z2 = z3;
                                    Exception exc2 = e;
                                    int i82 = i7;
                                    String str112 = str9;
                                    this.l = null;
                                    k0();
                                    if (!z) {
                                    }
                                    StatsTrackUploadServerStateAPIRequest.State state32 = state;
                                    i = 5;
                                    d0(exc2, str3, j, f0(Uri.parse(Uri.encode(this.i))), state32, i82, str112);
                                    if (z2) {
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    state = StatsTrackUploadServerStateAPIRequest.State.UNKNOWN;
                                    a.c.a(uVar2);
                                    z2 = z3;
                                    Exception exc22 = e;
                                    int i822 = i7;
                                    String str1122 = str9;
                                    this.l = null;
                                    k0();
                                    if (!z) {
                                    }
                                    StatsTrackUploadServerStateAPIRequest.State state322 = state;
                                    i = 5;
                                    d0(exc22, str3, j, f0(Uri.parse(Uri.encode(this.i))), state322, i822, str1122);
                                    if (z2) {
                                    }
                                }
                            } else {
                                str2 = str8;
                            }
                        } catch (Throwable th) {
                            th = th;
                            uVar = uVar2;
                            a.c.a(uVar);
                            throw th;
                        }
                    } catch (SocketTimeoutException e5) {
                        e = e5;
                        str2 = str8;
                    } catch (IOException e6) {
                        e = e6;
                        str2 = str8;
                    } catch (Exception e7) {
                        e = e7;
                        str2 = str8;
                    }
                } catch (SocketTimeoutException e8) {
                    e = e8;
                    str2 = str8;
                    uVar2 = null;
                } catch (IOException e9) {
                    e = e9;
                    str2 = str8;
                    uVar2 = null;
                } catch (Exception e10) {
                    e = e10;
                    str2 = str8;
                    uVar2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    uVar = null;
                }
                if (uVar2.t()) {
                    this.n = 0;
                    if (i7 == 200) {
                        try {
                            e0(str9);
                            state = StatsTrackUploadServerStateAPIRequest.State.SUCCESS;
                            e = null;
                            z3 = true;
                        } catch (UploadException e11) {
                            e = e11;
                            state = StatsTrackUploadServerStateAPIRequest.State.BAD_RESPONSE;
                        }
                        a.c.a(uVar2);
                        z2 = z3;
                        Exception exc222 = e;
                        int i8222 = i7;
                        String str11222 = str9;
                        this.l = null;
                        k0();
                        if (!z) {
                            j = 0;
                        }
                        StatsTrackUploadServerStateAPIRequest.State state3222 = state;
                        i = 5;
                        d0(exc222, str3, j, f0(Uri.parse(Uri.encode(this.i))), state3222, i8222, str11222);
                        if (z2) {
                            break;
                        }
                        if (exc222 != null) {
                            if (exc222 instanceof UploadException) {
                                L.E(exc222, new Object[0]);
                                throw ((UploadException) exc222);
                            }
                            if (!h03.a(exc222)) {
                                L.E(exc222, new Object[0]);
                                throw new UploadException("can't upload", str11222, exc222);
                            }
                            synchronized (this.k) {
                                this.k.wait(5000L);
                            }
                        }
                        str3 = str;
                        z3 = z2;
                        i3 = 0;
                        str5 = str2;
                    } else {
                        state2 = StatsTrackUploadServerStateAPIRequest.State.SUCCESS;
                    }
                } else {
                    L.G(str2, "Unexpected response " + uVar2);
                    state2 = StatsTrackUploadServerStateAPIRequest.State.BAD_SERVER;
                    this.n = this.n + 1;
                }
                state = state2;
                e = null;
                a.c.a(uVar2);
                z2 = z3;
                Exception exc2222 = e;
                int i82222 = i7;
                String str112222 = str9;
                this.l = null;
                k0();
                if (!z) {
                }
                StatsTrackUploadServerStateAPIRequest.State state32222 = state;
                i = 5;
                d0(exc2222, str3, j, f0(Uri.parse(Uri.encode(this.i))), state32222, i82222, str112222);
                if (z2) {
                }
            } else {
                if (z5) {
                    L.e(t, "Waiting for new bytes...");
                }
                synchronized (this) {
                    j2 = this.q;
                }
                if (j2 == j) {
                    synchronized (this.k) {
                        this.k.wait(3000L);
                    }
                }
                i3 = 0;
            }
        }
        i = 5;
        if (this.n >= i) {
            throw new UploadException("can't upload: max attempts reached");
        }
    }

    public String i0() {
        return null;
    }

    public final void j0() {
        synchronized (this.k) {
            this.k.notifyAll();
        }
    }

    public final void k0() {
        Preference.f("uploads").edit().putString(g0(this.d, ".preprocess"), this.p).putString(g0(this.d, ".session"), this.m).putString(g0(this.d, ".range"), this.o).putInt(g0(this.d, ".attempt"), this.n).putString(g0(this.d, ".last_upload_url"), this.r).apply();
    }

    public final synchronized void l0(boolean z) {
        this.j = z;
    }

    public abstract long m0();

    @Override // com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public void u(Object obj) {
        super.u(obj);
        j0();
        asu0.a.getClass();
        asu0.q().submit(new n93(this, 4));
    }

    public void e0(String str) throws UploadException {
    }
}
