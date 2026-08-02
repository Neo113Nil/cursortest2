package defpackage;

import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class cb7 implements hpg {
    public final ra7 a;
    public final long b;
    public final int c;
    public npg d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public k2k0 j;

    public cb7(ra7 ra7Var) {
        ra7Var.getClass();
        this.a = ra7Var;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            tw21.g(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            this.a.commitFile(file, this.h);
        } catch (Throwable th) {
            tw21.g(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(npg npgVar) {
        long j = npgVar.g;
        long min = j != -1 ? Math.min(j - this.i, this.e) : -1L;
        String str = npgVar.h;
        int i = tw21.a;
        this.f = this.a.startFile(str, npgVar.f + this.i, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        int i2 = this.c;
        if (i2 > 0) {
            k2k0 k2k0Var = this.j;
            if (k2k0Var == null) {
                this.j = new k2k0(fileOutputStream, i2, 0);
            } else {
                k2k0Var.c(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // defpackage.hpg
    public final void close() {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new CacheDataSink$CacheDataSinkException(e);
        }
    }

    @Override // defpackage.hpg
    public final void open(npg npgVar) {
        npgVar.h.getClass();
        if (npgVar.g == -1 && npgVar.c(2)) {
            this.d = null;
            return;
        }
        this.d = npgVar;
        this.e = npgVar.c(4) ? this.b : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.i = 0L;
        try {
            b(npgVar);
        } catch (IOException e) {
            throw new CacheDataSink$CacheDataSinkException(e);
        }
    }

    @Override // defpackage.hpg
    public final void write(byte[] bArr, int i, int i2) {
        npg npgVar = this.d;
        if (npgVar == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.e) {
                    a();
                    b(npgVar);
                }
                int min = (int) Math.min(i2 - i3, this.e - this.h);
                OutputStream outputStream = this.g;
                int i4 = tw21.a;
                outputStream.write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
    }
}
