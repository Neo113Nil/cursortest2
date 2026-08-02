package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class eb7 implements kpg {
    public final boolean A;
    public Uri B;
    public npg C;
    public npg D;
    public kpg E;
    public long F;
    public long G;
    public long H;
    public lc7 I;
    public boolean J;
    public boolean K;
    public long L;
    public final ra7 a;
    public final kpg b;
    public final ocy0 c;
    public final kpg w;
    public final pb7 x;
    public final boolean y;
    public final boolean z;

    public eb7(ra7 ra7Var, kpg kpgVar, kpg kpgVar2, hpg hpgVar, pb7 pb7Var, int i, PriorityTaskManager priorityTaskManager, int i2) {
        this.a = ra7Var;
        this.b = kpgVar2;
        this.x = pb7Var == null ? pb7.i1 : pb7Var;
        this.y = (i & 1) != 0;
        this.z = (i & 2) != 0;
        this.A = (i & 4) != 0;
        if (kpgVar == null) {
            this.w = s3c0.a;
            this.c = null;
        } else {
            kpgVar = priorityTaskManager != null ? new g3f0(kpgVar, priorityTaskManager, i2) : kpgVar;
            this.w = kpgVar;
            this.c = hpgVar != null ? new ocy0(kpgVar, hpgVar) : null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ra7 ra7Var = this.a;
        kpg kpgVar = this.E;
        if (kpgVar == null) {
            return;
        }
        try {
            kpgVar.close();
        } finally {
            this.D = null;
            this.E = null;
            lc7 lc7Var = this.I;
            if (lc7Var != null) {
                ra7Var.releaseHoleSpan(lc7Var);
                this.I = null;
            }
        }
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        cj01Var.getClass();
        this.b.addTransferListener(cj01Var);
        this.w.addTransferListener(cj01Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [kpg] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kpg] */
    public final void b(npg npgVar, boolean z) {
        lc7 startReadWrite;
        ocy0 ocy0Var;
        ocy0 ocy0Var2;
        long j;
        npg a;
        ocy0 ocy0Var3;
        String str = npgVar.h;
        int i = tw21.a;
        boolean z2 = this.K;
        ra7 ra7Var = this.a;
        if (z2) {
            startReadWrite = null;
        } else {
            long j2 = this.G;
            if (this.y) {
                try {
                    startReadWrite = ra7Var.startReadWrite(str, j2, this.H);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                startReadWrite = ra7Var.startReadWriteNonBlocking(str, j2, this.H);
            }
        }
        ocy0 ocy0Var4 = this.c;
        ?? r6 = this.b;
        ?? r7 = this.w;
        if (startReadWrite == null) {
            mpg a2 = npgVar.a();
            a2.f = this.G;
            a2.g = this.H;
            a = a2.a();
            ocy0Var = ocy0Var4;
            ocy0Var2 = r6;
            ocy0Var3 = r7;
            j = -1;
        } else {
            long j3 = startReadWrite.c;
            if (startReadWrite.w) {
                Uri fromFile = Uri.fromFile(startReadWrite.x);
                long j4 = startReadWrite.b;
                j = -1;
                long j5 = this.G - j4;
                long j6 = j3 - j5;
                ocy0Var = ocy0Var4;
                ocy0Var2 = r6;
                long j7 = this.H;
                if (j7 != -1) {
                    j6 = Math.min(j6, j7);
                }
                mpg a3 = npgVar.a();
                a3.a = fromFile;
                a3.b = j4;
                a3.f = j5;
                a3.g = j6;
                a = a3.a();
                ocy0Var3 = ocy0Var2;
            } else {
                ocy0Var = ocy0Var4;
                ocy0Var2 = r6;
                j = -1;
                long j8 = this.H;
                if (j3 == -1) {
                    j3 = j8;
                } else if (j8 != -1) {
                    j3 = Math.min(j3, j8);
                }
                mpg a4 = npgVar.a();
                a4.f = this.G;
                a4.g = j3;
                a = a4.a();
                if (ocy0Var != null) {
                    ocy0Var3 = ocy0Var;
                } else {
                    ra7Var.releaseHoleSpan(startReadWrite);
                    ocy0Var3 = r7;
                    startReadWrite = null;
                }
            }
        }
        this.L = (this.K || ocy0Var3 != r7) ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : this.G + 102400;
        if (z) {
            d6z.x(this.E == r7);
            if (ocy0Var3 == r7) {
                return;
            }
            try {
                a();
            } catch (Throwable th) {
                if (!startReadWrite.w) {
                    ra7Var.releaseHoleSpan(startReadWrite);
                }
                throw th;
            }
        }
        if (startReadWrite != null && !startReadWrite.w) {
            this.I = startReadWrite;
        }
        this.E = ocy0Var3;
        this.D = a;
        this.F = 0L;
        long open = ocy0Var3.open(a);
        che cheVar = new che();
        if (a.g == j && open != j) {
            this.H = open;
            cheVar.a(Long.valueOf(this.G + open), "exo_len");
        }
        if (!(this.E == ocy0Var2)) {
            Uri inflatedUri = ocy0Var3.getInflatedUri();
            this.B = inflatedUri;
            Uri uri = !npgVar.a.equals(inflatedUri) ? this.B : null;
            if (uri == null) {
                cheVar.b.add("exo_redir");
                cheVar.a.remove("exo_redir");
            } else {
                cheVar.a(uri.toString(), "exo_redir");
            }
        }
        if (this.E == ocy0Var) {
            ra7Var.applyContentMetadataMutations(str, cheVar);
        }
    }

    @Override // defpackage.kpg
    public final void close() {
        this.C = null;
        this.B = null;
        this.G = 0L;
        try {
            a();
        } catch (Throwable th) {
            if (this.E == this.b || (th instanceof Cache$CacheException)) {
                this.J = true;
            }
            throw th;
        }
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        return !(this.E == this.b) ? this.w.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0003, B:5:0x002e, B:10:0x0041, B:12:0x004c, B:16:0x005c, B:18:0x0062, B:21:0x0089, B:24:0x0095, B:25:0x0091, B:26:0x0097, B:33:0x00a7, B:35:0x00a1, B:36:0x0067, B:38:0x0075, B:41:0x007d, B:42:0x0084, B:43:0x0051, B:48:0x003a), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0003, B:5:0x002e, B:10:0x0041, B:12:0x004c, B:16:0x005c, B:18:0x0062, B:21:0x0089, B:24:0x0095, B:25:0x0091, B:26:0x0097, B:33:0x00a7, B:35:0x00a1, B:36:0x0067, B:38:0x0075, B:41:0x007d, B:42:0x0084, B:43:0x0051, B:48:0x003a), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0003, B:5:0x002e, B:10:0x0041, B:12:0x004c, B:16:0x005c, B:18:0x0062, B:21:0x0089, B:24:0x0095, B:25:0x0091, B:26:0x0097, B:33:0x00a7, B:35:0x00a1, B:36:0x0067, B:38:0x0075, B:41:0x007d, B:42:0x0084, B:43:0x0051, B:48:0x003a), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0003, B:5:0x002e, B:10:0x0041, B:12:0x004c, B:16:0x005c, B:18:0x0062, B:21:0x0089, B:24:0x0095, B:25:0x0091, B:26:0x0097, B:33:0x00a7, B:35:0x00a1, B:36:0x0067, B:38:0x0075, B:41:0x007d, B:42:0x0084, B:43:0x0051, B:48:0x003a), top: B:2:0x0003 }] */
    @Override // defpackage.kpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(npg npgVar) {
        boolean z;
        long j;
        ra7 ra7Var = this.a;
        try {
            String buildCacheKey = this.x.buildCacheKey(npgVar);
            mpg a = npgVar.a();
            long j2 = npgVar.f;
            long j3 = npgVar.g;
            a.h = buildCacheKey;
            npg a2 = a.a();
            this.C = a2;
            Uri uri = a2.a;
            byte[] bArr = (byte[]) ((f9h) ra7Var.getContentMetadata(buildCacheKey)).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.B = uri;
            this.G = j2;
            if ((!this.z || !this.J) && (!this.A || j3 != -1)) {
                z = false;
                this.K = z;
                if (z) {
                    long a3 = bhe.a(ra7Var.getContentMetadata(buildCacheKey));
                    this.H = a3;
                    if (a3 != -1) {
                        long j4 = a3 - j2;
                        this.H = j4;
                        if (j4 < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                } else {
                    this.H = -1L;
                }
                if (j3 != -1) {
                    long j5 = this.H;
                    this.H = j5 == -1 ? j3 : Math.min(j5, j3);
                }
                j = this.H;
                if (j <= 0 || j == -1) {
                    b(a2, false);
                }
                return j3 == -1 ? j3 : this.H;
            }
            z = true;
            this.K = z;
            if (z) {
            }
            if (j3 != -1) {
            }
            j = this.H;
            if (j <= 0) {
            }
            b(a2, false);
            if (j3 == -1) {
            }
        } catch (Throwable th) {
            if (this.E == this.b || (th instanceof Cache$CacheException)) {
                this.J = true;
            }
            throw th;
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        kpg kpgVar = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.H == 0) {
            return -1;
        }
        npg npgVar = this.C;
        npgVar.getClass();
        npg npgVar2 = this.D;
        npgVar2.getClass();
        try {
            if (this.G >= this.L) {
                b(npgVar, true);
            }
            kpg kpgVar2 = this.E;
            kpgVar2.getClass();
            int read = kpgVar2.read(bArr, i, i2);
            kpg kpgVar3 = this.E;
            if (read != -1) {
                long j2 = read;
                this.G += j2;
                this.F += j2;
                long j3 = this.H;
                if (j3 == -1) {
                    return read;
                }
                this.H = j3 - j2;
                return read;
            }
            if (!(kpgVar3 == kpgVar)) {
                j = -1;
                long j4 = npgVar2.g;
                if (j4 != -1) {
                    i3 = read;
                    if (this.F < j4) {
                    }
                } else {
                    i3 = read;
                }
                String str = npgVar.h;
                int i4 = tw21.a;
                this.H = 0L;
                if (!(kpgVar3 == this.c)) {
                    return i3;
                }
                che cheVar = new che();
                cheVar.a(Long.valueOf(this.G), "exo_len");
                this.a.applyContentMetadataMutations(str, cheVar);
                return i3;
            }
            i3 = read;
            j = -1;
            long j5 = this.H;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            a();
            b(npgVar, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.E == kpgVar || (th instanceof Cache$CacheException)) {
                this.J = true;
            }
            throw th;
        }
    }
}
