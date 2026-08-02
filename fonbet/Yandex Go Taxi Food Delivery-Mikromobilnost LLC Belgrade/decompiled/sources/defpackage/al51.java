package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;

/* loaded from: classes10.dex */
public final class al51 implements kpg {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final PreloadLiveDashConfig E;
    public Uri F;
    public npg G;
    public npg H;
    public kpg I;
    public long J;
    public long K;
    public long L;
    public lc7 M;
    public boolean N;
    public boolean O;
    public long P;
    public long Q;
    public boolean R;
    public final ra7 a;
    public final kpg b;
    public final ocy0 c;
    public final kpg w;
    public final pb7 x;
    public final yk51 y;
    public final boolean z;

    public al51(ra7 ra7Var, kpg kpgVar, kpg kpgVar2, hpg hpgVar, pb7 pb7Var, int i, yk51 yk51Var, PreloadLiveDashConfig preloadLiveDashConfig) {
        this.a = ra7Var;
        this.b = kpgVar2;
        this.x = pb7Var == null ? pb7.i1 : pb7Var;
        boolean z = false;
        this.z = (i & 1) != 0;
        this.A = (i & 2) != 0;
        this.B = (i & 4) != 0;
        this.C = (i & 8) != 0;
        this.E = preloadLiveDashConfig;
        if (preloadLiveDashConfig != null && preloadLiveDashConfig.getLiveDashPreloadEnabled()) {
            z = true;
        }
        this.D = z;
        if (kpgVar != null) {
            this.w = kpgVar;
            this.c = hpgVar != null ? new ocy0(kpgVar, hpgVar) : null;
        } else {
            this.w = s3c0.a;
            this.c = null;
        }
        this.y = yk51Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ra7 ra7Var = this.a;
        kpg kpgVar = this.I;
        if (kpgVar == null) {
            return;
        }
        try {
            kpgVar.close();
        } finally {
            this.H = null;
            this.I = null;
            lc7 lc7Var = this.M;
            if (lc7Var != null) {
                ra7Var.releaseHoleSpan(lc7Var);
                this.M = null;
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
        boolean z2 = this.O;
        ra7 ra7Var = this.a;
        if (z2) {
            startReadWrite = null;
        } else {
            long j2 = this.K;
            if (this.z) {
                try {
                    startReadWrite = ra7Var.startReadWrite(str, j2, this.L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                startReadWrite = ra7Var.startReadWriteNonBlocking(str, j2, this.L);
            }
        }
        ocy0 ocy0Var4 = this.c;
        ?? r6 = this.b;
        ?? r7 = this.w;
        if (startReadWrite == null) {
            mpg a2 = npgVar.a();
            a2.f = this.K;
            a2.g = this.L;
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
                long j5 = this.K - j4;
                long j6 = j3 - j5;
                ocy0Var = ocy0Var4;
                ocy0Var2 = r6;
                long j7 = this.L;
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
                long j8 = this.L;
                if (j3 == -1) {
                    j3 = j8;
                } else if (j8 != -1) {
                    j3 = Math.min(j3, j8);
                }
                mpg a4 = npgVar.a();
                a4.f = this.K;
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
        this.Q = (this.O || ocy0Var3 != r7) ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : this.K + 102400;
        if (z) {
            d6z.x(this.I == r7);
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
            this.M = startReadWrite;
        }
        this.I = ocy0Var3;
        this.H = a;
        this.J = 0L;
        long open = ocy0Var3.open(a);
        che cheVar = new che();
        if (a.g == j && open != j) {
            this.L = open;
            cheVar.a(Long.valueOf(this.K + open), "exo_len");
        }
        if (!(this.I == ocy0Var2)) {
            Uri inflatedUri = ocy0Var3.getInflatedUri();
            this.F = inflatedUri;
            Uri uri = !npgVar.a.equals(inflatedUri) ? this.F : null;
            if (uri == null) {
                cheVar.b.add("exo_redir");
                cheVar.a.remove("exo_redir");
            } else {
                cheVar.a(uri.toString(), "exo_redir");
            }
        }
        if (this.I == ocy0Var) {
            ra7Var.applyContentMetadataMutations(str, cheVar);
        }
    }

    public final int c(npg npgVar) {
        npg npgVar2;
        Uri uri = npgVar.a;
        boolean z = tw21.N(uri) == 2;
        boolean z2 = tw21.N(uri) == 0;
        boolean z3 = this.D;
        if (!z3 || z) {
            if ((uri.toString().contains("/kal/") || uri.toString().contains("/live/")) && (z2 || z)) {
                return 2;
            }
        } else if (z2) {
            String uri2 = uri.toString();
            if ((uri2.contains("/kal/") || uri2.contains("/live/")) && z3 && (npgVar2 = this.G) != null) {
                String str = npgVar2.h;
                PreloadLiveDashConfig preloadLiveDashConfig = this.E;
                if (preloadLiveDashConfig != null && str != null) {
                    bhe contentMetadata = this.a.getContentMetadata(str);
                    long currentTimeMillis = System.currentTimeMillis();
                    long d = ((f9h) contentMetadata).d(-9223372036854775807L, ClidProvider.TIMESTAMP);
                    long timeSincePreloadingWhileCacheIsValid = preloadLiveDashConfig.getTimeSincePreloadingWhileCacheIsValid();
                    if (d != -9223372036854775807L && currentTimeMillis - d >= timeSincePreloadingWhileCacheIsValid) {
                        this.R = true;
                    }
                }
            }
        }
        if (this.R && this.C) {
            return 3;
        }
        if (this.A && this.N) {
            return 0;
        }
        return (this.B && npgVar.g == -1) ? 1 : -1;
    }

    @Override // defpackage.kpg
    public final void close() {
        npg npgVar;
        if (this.D && (npgVar = this.G) != null && tw21.N(npgVar.a) == 0) {
            String uri = this.G.a.toString();
            if (uri.contains("/kal/") || uri.contains("/live/")) {
                this.R = true;
            }
        }
        this.G = null;
        this.F = null;
        this.K = 0L;
        yk51 yk51Var = this.y;
        if (yk51Var != null && this.P > 0) {
            yk51Var.onCachedBytesRead(this.a.getCacheSpace(), this.P);
            this.P = 0L;
        }
        try {
            a();
        } catch (Throwable th) {
            if (this.I == this.b || (th instanceof Cache$CacheException)) {
                this.N = true;
            }
            throw th;
        }
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        return !(this.I == this.b) ? this.w.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        return this.F;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        yk51 yk51Var;
        ra7 ra7Var = this.a;
        try {
            String buildCacheKey = this.x.buildCacheKey(npgVar);
            mpg a = npgVar.a();
            long j = npgVar.g;
            long j2 = npgVar.f;
            a.h = buildCacheKey;
            npg a2 = a.a();
            this.G = a2;
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
            this.F = uri;
            this.K = j2;
            int c = c(npgVar);
            boolean z = c != -1;
            this.O = z;
            if (z && (yk51Var = this.y) != null) {
                yk51Var.onCacheIgnored(c);
            }
            if (this.O) {
                this.L = -1L;
            } else {
                long a3 = bhe.a(ra7Var.getContentMetadata(buildCacheKey));
                this.L = a3;
                if (a3 != -1) {
                    long j3 = a3 - j2;
                    this.L = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j != -1) {
                long j4 = this.L;
                this.L = j4 == -1 ? j : Math.min(j4, j);
            }
            long j5 = this.L;
            if (j5 > 0 || j5 == -1) {
                b(a2, false);
            }
            return j != -1 ? j : this.L;
        } catch (Throwable th) {
            kpg kpgVar = this.I;
            kpg kpgVar2 = this.b;
            if (kpgVar == kpgVar2 || (th instanceof Cache$CacheException)) {
                this.N = true;
            }
            if (this.C && !this.R && (kpgVar == kpgVar2 || (th instanceof Cache$CacheException))) {
                this.R = true;
            }
            if (this.R) {
                return open(npgVar);
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
        if (this.L == 0) {
            return -1;
        }
        npg npgVar = this.G;
        npgVar.getClass();
        npg npgVar2 = this.H;
        npgVar2.getClass();
        try {
            if (this.K >= this.Q) {
                b(npgVar, true);
            }
            kpg kpgVar2 = this.I;
            kpgVar2.getClass();
            int read = kpgVar2.read(bArr, i, i2);
            kpg kpgVar3 = this.I;
            if (read != -1) {
                if (kpgVar3 == kpgVar) {
                    this.P += read;
                }
                long j2 = read;
                this.K += j2;
                this.J += j2;
                long j3 = this.L;
                if (j3 == -1) {
                    return read;
                }
                this.L = j3 - j2;
                return read;
            }
            if (!(kpgVar3 == kpgVar)) {
                j = -1;
                long j4 = npgVar2.g;
                if (j4 != -1) {
                    i3 = read;
                    if (this.J < j4) {
                    }
                } else {
                    i3 = read;
                }
                String str = npgVar.h;
                int i4 = tw21.a;
                this.L = 0L;
                if (!(kpgVar3 == this.c)) {
                    return i3;
                }
                che cheVar = new che();
                cheVar.a(Long.valueOf(this.K), "exo_len");
                this.a.applyContentMetadataMutations(str, cheVar);
                return i3;
            }
            i3 = read;
            j = -1;
            long j5 = this.L;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            a();
            b(npgVar, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.I == kpgVar || (th instanceof Cache$CacheException)) {
                this.N = true;
            }
            throw th;
        }
    }
}
