package sg.bigo.ads.ba;

import android.content.Context;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import ru.ok.android.commons.http.Http;
import sg.bigo.ads.common.utils.r;
import xsna.efz;
import xsna.ho8;

/* loaded from: classes9.dex */
public final class d implements Runnable {
    private final a a;
    private InputStream b;
    private final File c;
    private final Context d;

    public d(Context context, a aVar) {
        this.d = context;
        this.a = aVar;
        sg.bigo.ads.ay.a aVar2 = aVar.b;
        this.c = new File(aVar2.c, sg.bigo.ads.common.utils.g.d(aVar2.d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r14 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r18.c.length() != r14) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r18.a.e != r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        r0 = r18.c;
        r10 = r18.a.b;
        r0.renameTo(new java.io.File(r10.c, r10.d));
        r18.a.e = sg.bigo.ads.ba.h.f;
        r9 = true;
        sg.bigo.ads.ba.f.a().a(r18.a.a);
        a("download is over.");
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a() {
        long j;
        int i;
        String str = "the download file has a invalid size.";
        a("startDownloadTask");
        if (this.b == null) {
            b("downloadStream is null");
            return;
        }
        this.a.e = h.d;
        f.a().a(this.a.a);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.b);
        byte[] bArr = new byte[ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES];
        boolean z = false;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.c, "rwd");
            try {
                long j2 = this.a.b.g;
                randomAccessFile2.seek(j2);
                String str2 = this.a.a;
                while (true) {
                    int i2 = this.a.e;
                    j = 0;
                    try {
                        i = h.d;
                        if (i2 != i) {
                            break;
                        }
                        int read = bufferedInputStream.read(bArr, 0, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                        if (read == -1) {
                            break;
                        }
                        randomAccessFile2.write(bArr, 0, read);
                        j2 += read;
                        this.a.b(j2);
                        f.a().a(this.a.a);
                    } catch (Exception e) {
                        e = e;
                        randomAccessFile = randomAccessFile2;
                        try {
                            String message = e.getMessage();
                            if (!z) {
                                if (!r.a((CharSequence) message)) {
                                    str = message;
                                } else if (this.a.b.g > j && this.c.length() > j) {
                                    str = this.a.e != h.d ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                                }
                                b("Failed to download due to: ".concat(String.valueOf(str)));
                            }
                            sg.bigo.ads.common.utils.h.a(randomAccessFile);
                            sg.bigo.ads.common.utils.h.a((Closeable) bufferedInputStream);
                            sg.bigo.ads.common.utils.h.a((Closeable) this.b);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (!z) {
                                if (!r.a((CharSequence) "")) {
                                    str = "";
                                } else if (this.a.b.g > j && this.c.length() > j) {
                                    str = this.a.e != h.d ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                                }
                                b("Failed to download due to: ".concat(str));
                            }
                            sg.bigo.ads.common.utils.h.a(randomAccessFile);
                            sg.bigo.ads.common.utils.h.a((Closeable) bufferedInputStream);
                            sg.bigo.ads.common.utils.h.a((Closeable) this.b);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                        if (!z) {
                        }
                        sg.bigo.ads.common.utils.h.a(randomAccessFile);
                        sg.bigo.ads.common.utils.h.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.h.a((Closeable) this.b);
                        throw th;
                    }
                }
                if (!r.a((CharSequence) "")) {
                    str = "";
                } else if (this.a.b.g > 0 && this.c.length() > 0) {
                    str = this.a.e != i ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                }
                b("Failed to download due to: ".concat(str));
                sg.bigo.ads.common.utils.h.a(randomAccessFile2);
                sg.bigo.ads.common.utils.h.a((Closeable) bufferedInputStream);
                sg.bigo.ads.common.utils.h.a((Closeable) this.b);
            } catch (Exception e2) {
                e = e2;
                j = 0;
            } catch (Throwable th3) {
                th = th3;
                j = 0;
            }
        } catch (Exception e3) {
            e = e3;
            j = 0;
        } catch (Throwable th4) {
            th = th4;
            j = 0;
        }
    }

    private void b(String str) {
        StringBuilder b = ho8.b(str, " , ");
        b.append(this.a.a);
        b.append(" has a error ! ");
        b.append(this.a.toString());
        sg.bigo.ads.bn.a.a(0, IDownloadTask.TAG, b.toString());
        a aVar = this.a;
        aVar.f = str;
        aVar.e = h.g;
        f.a().a(this.a.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        while (true) {
            sg.bigo.ads.bs.a aVar = new sg.bigo.ads.bs.a(sg.bigo.ads.bx.a.a(), new sg.bigo.ads.bs.d(this.a.b.b), this.a.b.r, this.d);
            aVar.l = sg.bigo.ads.bp.e.h();
            String b = efz.b(this.a.b.g, "-", new StringBuilder("bytes="));
            aVar.a(Command.HTTP_HEADER_RANGE, b);
            a("Range = ".concat(String.valueOf(b)));
            sg.bigo.ads.bo.c<sg.bigo.ads.bt.a> a = sg.bigo.ads.bo.g.a(aVar);
            sg.bigo.ads.bt.a aVar2 = a.a;
            if (aVar2 != null) {
                sg.bigo.ads.bt.b a2 = sg.bigo.ads.bt.b.a(aVar2.a(Http.Header.CONTENT_RANGE));
                long j = a2 != null ? a2.b : 0L;
                if (j <= 0) {
                    j = a.a.a();
                }
                this.a.a(j);
                sg.bigo.ads.bt.a aVar3 = a.a;
                this.b = aVar3.b;
                this.a.b.q = aVar3.a("Content-Type");
                if (!this.c.exists()) {
                    break;
                }
                sg.bigo.ads.ay.a aVar4 = this.a.b;
                long j2 = aVar4.g;
                long j3 = a2 != null ? a2.a : 0L;
                if (j2 > 0 && j2 == j3) {
                    aVar4.p = true;
                    break;
                }
                a("Delete tmp file.");
                if (!sg.bigo.ads.common.utils.g.a(this.c)) {
                    b("Failed to delete temp file.");
                    return;
                }
                this.a.b(0L);
                if (j3 <= 0) {
                    break;
                }
                sg.bigo.ads.common.utils.h.a((Closeable) this.b);
                this.b = null;
            } else {
                if (a.b != null) {
                    str = "Failed to request url. Error code: " + a.b.a + ", error msg: " + a.b.getMessage();
                } else {
                    str = "Failed to request url.";
                }
                b(str);
                return;
            }
        }
        if (!sg.bigo.ads.common.utils.g.c(this.c)) {
            b("Failed to create temp file.");
            return;
        }
        this.a.e = h.c;
        f.a().a(this.a.a);
        a();
    }

    private void a(String str) {
        a aVar = this.a;
        String str2 = aVar.a;
        aVar.toString();
    }
}
