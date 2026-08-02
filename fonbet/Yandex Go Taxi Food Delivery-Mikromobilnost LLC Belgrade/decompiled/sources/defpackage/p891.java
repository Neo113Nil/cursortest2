package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzlr;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.play.core.splitinstall.internal.zzbl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class p891 implements dma1, dsa1, qua1, id91, l2a1 {
    public static p891 x;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;

    public p891(String str, int i) {
        this.a = i;
        switch (i) {
            case 2:
                p891 p891Var = new p891(1);
                this.c = p891Var;
                this.w = p891Var;
                this.b = str;
                break;
            case 11:
                p891 p891Var2 = new p891(10);
                this.c = p891Var2;
                this.w = p891Var2;
                this.b = str;
                break;
            default:
                gr81 gr81Var = new gr81(6);
                this.c = gr81Var;
                this.w = gr81Var;
                this.b = str;
                break;
        }
    }

    public static p891 b(g gVar) {
        if (x == null) {
            x = new p891(gVar.a, gVar);
        }
        return x;
    }

    @Override // defpackage.dma1
    public void a(ZipFile zipFile, HashSet hashSet) {
        HashSet hashSet2 = (HashSet) this.b;
        a3b1 a3b1Var = (a3b1) this.w;
        a891 a891Var = (a891) this.c;
        HashSet hashSet3 = new HashSet();
        a3b1Var.c(a891Var, hashSet, new p891(6, (Object) hashSet3, (Object) a891Var, (Object) zipFile));
        hashSet2.addAll(hashSet3);
    }

    @Override // defpackage.dsa1
    public void c(xxa1 xxa1Var, File file, boolean z) {
        ((HashSet) this.b).add(file);
        if (z) {
            return;
        }
        a891 a891Var = (a891) this.c;
        String str = a891Var.b;
        String str2 = xxa1Var.a;
        ZipEntry zipEntry = xxa1Var.b;
        String absolutePath = a891Var.a.getAbsolutePath();
        String name = zipEntry.getName();
        String absolutePath2 = file.getAbsolutePath();
        StringBuilder v = b64.v("NativeLibraryExtractor: split '", str, "' has native library '", str2, "' that does not exist; extracting from '");
        g8e.D(v, absolutePath, "!", name, "' to '");
        v.append(absolutePath2);
        v.append("'");
        Log.i("SplitCompat", v.toString());
        ZipFile zipFile = (ZipFile) this.w;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }

    public void d(float f, String str) {
        String valueOf = String.valueOf(f);
        mqb1 mqb1Var = new mqb1(10);
        ((p891) this.w).w = mqb1Var;
        this.w = mqb1Var;
        mqb1Var.c = valueOf;
        mqb1Var.b = str;
    }

    public synchronized void e(int i, int i2, long j, long j2) {
        ((g) this.b).D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.w;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((e091) this.c).e(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2)))).d(new qgg(this, elapsedRealtime, 10));
    }

    public void f(int i, String str) {
        String valueOf = String.valueOf(i);
        mqb1 mqb1Var = new mqb1(10);
        ((p891) this.w).w = mqb1Var;
        this.w = mqb1Var;
        mqb1Var.c = valueOf;
        mqb1Var.b = str;
    }

    public void g(Object obj, String str) {
        p891 p891Var = new p891(1);
        ((p891) this.w).w = p891Var;
        this.w = p891Var;
        p891Var.c = obj;
        p891Var.b = str;
    }

    public Object h() {
        Object obj = this.b;
        Field field = (Field) this.c;
        Class cls = (Class) this.w;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e) {
            String name = field.getName();
            String name2 = obj.getClass().getName();
            String name3 = cls.getName();
            StringBuilder v = b64.v("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            v.append(name3);
            throw new zzbl(v.toString(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // defpackage.qua1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(int i, Throwable th, byte[] bArr) {
        zzlr zzlrVar;
        AtomicReference atomicReference;
        j jVar = (j) this.b;
        jVar.Gg();
        zzom zzomVar = (zzom) this.w;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            y1a1 y1a1Var = ((g) jVar.b).y;
            g.g(y1a1Var);
            y1a1Var.C.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.zza), Integer.valueOf(i), th);
            zzlrVar = !Arrays.asList(((String) nw91.u.a(null)).split(",")).contains(String.valueOf(i)) ? zzlr.BACKOFF : zzlr.FAILURE;
            atomicReference = (AtomicReference) this.c;
            j5b1 j = ((g) jVar.b).j();
            long j2 = zzomVar.zza;
            zzaf zzafVar = new zzaf(j2, zzlrVar.a(), zzomVar.zzf);
            j.Gg();
            j.Hg();
            j.Ug(new ju61(13, j, j.Wg(true), zzafVar));
            y1a1 y1a1Var2 = ((g) jVar.b).y;
            g.g(y1a1Var2);
            y1a1Var2.H.c("[sgtm] Updated status for row_id", Long.valueOf(j2), zzlrVar);
            synchronized (atomicReference) {
                atomicReference.set(zzlrVar);
                atomicReference.notifyAll();
            }
            return;
        }
        if (th == null) {
            y1a1 y1a1Var3 = ((g) jVar.b).y;
            g.g(y1a1Var3);
            y1a1Var3.H.b(Long.valueOf(zzomVar.zza), "[sgtm] Upload succeeded for row_id");
            zzlrVar = zzlr.SUCCESS;
            atomicReference = (AtomicReference) this.c;
            j5b1 j3 = ((g) jVar.b).j();
            long j22 = zzomVar.zza;
            zzaf zzafVar2 = new zzaf(j22, zzlrVar.a(), zzomVar.zzf);
            j3.Gg();
            j3.Hg();
            j3.Ug(new ju61(13, j3, j3.Wg(true), zzafVar2));
            y1a1 y1a1Var22 = ((g) jVar.b).y;
            g.g(y1a1Var22);
            y1a1Var22.H.c("[sgtm] Updated status for row_id", Long.valueOf(j22), zzlrVar);
            synchronized (atomicReference) {
            }
        }
        y1a1 y1a1Var4 = ((g) jVar.b).y;
        g.g(y1a1Var4);
        y1a1Var4.C.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.zza), Integer.valueOf(i), th);
        if (!Arrays.asList(((String) nw91.u.a(null)).split(",")).contains(String.valueOf(i))) {
        }
        atomicReference = (AtomicReference) this.c;
        j5b1 j32 = ((g) jVar.b).j();
        long j222 = zzomVar.zza;
        zzaf zzafVar22 = new zzaf(j222, zzlrVar.a(), zzomVar.zzf);
        j32.Gg();
        j32.Hg();
        j32.Ug(new ju61(13, j32, j32.Wg(true), zzafVar22));
        y1a1 y1a1Var222 = ((g) jVar.b).y;
        g.g(y1a1Var222);
        y1a1Var222.H.c("[sgtm] Updated status for row_id", Long.valueOf(j222), zzlrVar);
        synchronized (atomicReference) {
        }
    }

    public void j(Object obj, String str) {
        p891 p891Var = new p891(10);
        ((p891) this.w).w = p891Var;
        this.w = p891Var;
        p891Var.c = obj;
        p891Var.b = str;
    }

    public void k(Object obj) {
        Object obj2 = this.b;
        Field field = (Field) this.c;
        try {
            field.set(obj2, obj);
        } catch (Exception e) {
            String name = field.getName();
            String name2 = obj2.getClass().getName();
            String name3 = ((Class) this.w).getName();
            StringBuilder v = b64.v("Failed to set value of field ", name, " of type ", name2, " on object of type ");
            v.append(name3);
            throw new zzbl(v.toString(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    @Override // defpackage.l2a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(String str, int i, Throwable th, byte[] bArr, Map map) {
        long j = ((jdb1) this.c).a;
        n nVar = (n) this.w;
        String str2 = (String) this.b;
        nVar.M1().Gg();
        nVar.f0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                nVar.N = false;
                nVar.J();
                throw th2;
            }
        }
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            String str3 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str3.substring(0, Math.min(32, str3.length()));
            l1a1 l1a1Var = nVar.B0().E;
            Integer valueOf = Integer.valueOf(i);
            if (th == null) {
                th = substring;
            }
            l1a1Var.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf, th);
            b bVar = nVar.c;
            n.O(bVar);
            bVar.Sg(Long.valueOf(j));
            nVar.I();
            nVar.N = false;
            nVar.J();
        }
        if (th == null) {
            b bVar2 = nVar.c;
            n.O(bVar2);
            bVar2.Ng(Long.valueOf(j));
            nVar.B0().H.c("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
            f3a1 f3a1Var = nVar.b;
            n.O(f3a1Var);
            if (f3a1Var.ah()) {
                b bVar3 = nVar.c;
                n.O(bVar3);
                if (bVar3.Mg(str2)) {
                    nVar.o(str2);
                    nVar.N = false;
                    nVar.J();
                }
            }
            nVar.I();
            nVar.N = false;
            nVar.J();
        }
        String str32 = new String(bArr, StandardCharsets.UTF_8);
        ?? substring2 = str32.substring(0, Math.min(32, str32.length()));
        l1a1 l1a1Var2 = nVar.B0().E;
        Integer valueOf2 = Integer.valueOf(i);
        if (th == null) {
        }
        l1a1Var2.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, th);
        b bVar4 = nVar.c;
        n.O(bVar4);
        bVar4.Sg(Long.valueOf(j));
        nVar.I();
        nVar.N = false;
        nVar.J();
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                gr81 gr81Var = (gr81) ((gr81) this.c).c;
                while (gr81Var != null) {
                    Object obj = gr81Var.b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
                    }
                    gr81Var = (gr81) gr81Var.c;
                    str = Extension.FIX_SPACE;
                }
                sb.append('}');
                return sb.toString();
            case 2:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                p891 p891Var = (p891) ((p891) this.c).w;
                while (p891Var != null) {
                    Object obj2 = p891Var.c;
                    sb2.append(str);
                    String str2 = (String) p891Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    p891Var = (p891) p891Var.w;
                    str = Extension.FIX_SPACE;
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                p891 p891Var2 = (p891) ((p891) this.c).w;
                while (p891Var2 != null) {
                    Object obj3 = p891Var2.c;
                    sb3.append(str);
                    String str3 = (String) p891Var2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb3.append(obj3);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj3}), 1, r5.length() - 1);
                    }
                    p891Var2 = (p891) p891Var2.w;
                    str = Extension.FIX_SPACE;
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.id91
    public /* bridge */ /* synthetic */ Object zza() {
        return new esa1(rb91.a((id91) this.b), rb91.a((id91) this.c), rb91.a((id91) this.w));
    }

    public /* synthetic */ p891(int i, Serializable serializable, Object obj, Object obj2) {
        this.a = i;
        this.w = obj;
        this.b = serializable;
        this.c = obj2;
    }

    public /* synthetic */ p891(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public p891(Context context, g gVar) {
        this.a = 4;
        this.w = new AtomicLong(-1L);
        this.c = vez0.v(context, new qdy0("measurement:api"));
        this.b = gVar;
    }

    public /* synthetic */ p891(int i) {
        this.a = i;
    }
}
