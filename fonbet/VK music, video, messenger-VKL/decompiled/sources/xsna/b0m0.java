package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.files.a;
import com.vk.log.L;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import xsna.l9r;

/* compiled from: StoryBoxPrepare.kt */
/* loaded from: classes6.dex */
public final class b0m0 {
    public final bpn0 a = new bpn0(new ml7(28));

    /* compiled from: StoryBoxPrepare.kt */
    public static final class a {
        public static io.reactivex.rxjava3.core.q a(oap oapVar) {
            return new io.reactivex.rxjava3.internal.operators.observable.s0(new lfk(oapVar, 1)).L(new a0m0(new zzl0(0), 0), false);
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.t a(String str, final String str2) {
        if (str != null && str2 != null) {
            throw new IllegalStateException("You can't pass both url and blob not null");
        }
        if (str != null) {
            return new io.reactivex.rxjava3.internal.operators.observable.t(new y2a(1, this, str));
        }
        if (str2 != null) {
            return new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.xzl0
                @Override // io.reactivex.rxjava3.functions.n
                public final Object get() {
                    String str3 = str2;
                    int length = str3.length();
                    int hashCode = str3.hashCode();
                    String E0 = erm0.E0(20, str3);
                    StringBuilder a2 = odj.a(length, hashCode, "length=", ", hash=", ", tail=");
                    a2.append(E0);
                    String sb = a2.toString();
                    b0m0 b0m0Var = b0m0.this;
                    File file = ((l9r) b0m0Var.a.getValue()).get(sb);
                    return file != null ? io.reactivex.rxjava3.core.q.T(file) : new io.reactivex.rxjava3.internal.operators.observable.s0(new ppa(str3, 2)).U(new s1j0(new defpackage.v(23, b0m0Var, sb), 4));
                }
            });
        }
        throw new IllegalStateException("Can't download content for story box without url or blob");
    }

    public final File b(String str, final long j, final InputStream inputStream) {
        kbr kbrVar = null;
        try {
            kbrVar = ((l9r) this.a.getValue()).a(str);
            izs<? super OutputStream, s3q0> izsVar = new izs() { // from class: xsna.yzl0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    OutputStream outputStream = (OutputStream) obj;
                    int i = (int) j;
                    InputStream inputStream2 = inputStream;
                    if (inputStream2 == null || i == 0) {
                        L.G("incorrect input args!");
                    } else {
                        try {
                            try {
                                byte[] bArr = new byte[4096];
                                boolean z = i == -1;
                                if (z) {
                                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                }
                                int i2 = 0;
                                while (true) {
                                    int read = inputStream2.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    outputStream.write(bArr, 0, read);
                                    i2 += read;
                                    if (z && i2 > i) {
                                        i *= 2;
                                    }
                                }
                                outputStream.flush();
                                a.c.b(inputStream2, outputStream);
                            } catch (Exception e) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            a.c.b(inputStream2, outputStream);
                            throw th;
                        }
                    }
                    return s3q0.a;
                }
            };
            l9r.a aVar = (l9r.a) kbrVar;
            aVar.g(izsVar);
            File commit = aVar.commit();
            aVar.close();
            return commit;
        } catch (Throwable th) {
            if (kbrVar != null) {
                ((l9r.a) kbrVar).close();
            }
            throw th;
        }
    }
}
