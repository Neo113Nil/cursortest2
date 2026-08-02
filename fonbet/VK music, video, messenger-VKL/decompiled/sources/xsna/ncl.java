package xsna;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.Trace;
import android.util.Size;
import android.view.Surface;
import com.vk.media.pipeline.codec.MediaCodecException;
import com.vk.media.pipeline.gl.GlException;
import com.vk.media.pipeline.session.transform.task.transcode.TranscodeException;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kes0;
import xsna.q0u;

/* compiled from: DefaultCodecFactory.kt */
/* loaded from: classes3.dex */
public final class ncl implements lzf {
    public final f100 a;
    public final ju4 b;
    public final jpa0 c;
    public final boolean d;
    public final jq10 e;

    /* compiled from: DefaultCodecFactory.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<uzf> {
        @Override // xsna.gzs
        public final uzf invoke() {
            return ((zis0) this.receiver).g.a();
        }
    }

    /* compiled from: DefaultCodecFactory.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<uzf> {
        @Override // xsna.gzs
        public final uzf invoke() {
            return ((ies0) this.receiver).g.a();
        }
    }

    public ncl(f100 f100Var, ju4 ju4Var, jpa0 jpa0Var, boolean z) {
        this.a = f100Var;
        this.b = ju4Var;
        this.c = jpa0Var;
        this.d = z;
        this.e = new jq10(f100Var);
    }

    public static void f(MediaCodec mediaCodec, String str) {
        Trace.beginSection("Start MediaCodec for ".concat(str));
        mediaCodec.start();
        Trace.endSection();
    }

    @Override // xsna.lzf
    public final qm4 a(MediaFormat mediaFormat) {
        Object failure;
        f100 f100Var = this.a;
        if (mediaFormat.containsKey("encoder-delay")) {
            mediaFormat.setInteger("encoder-delay", 0);
        }
        MediaCodec a2 = this.e.a(null, mediaFormat, false, null, this.d);
        try {
            f(a2, "audio decoder");
            return new qm4(a2, f100Var, "AudioDecoder");
        } catch (Throwable th) {
            try {
                failure = a2.getName();
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            String str = (String) failure;
            try {
                a2.release();
            } catch (Throwable th3) {
                if (f100Var != null) {
                    f100Var.a("DefaultCodecFactory", th3);
                }
            }
            throw new MediaCodecException("start", str, th, null);
        }
    }

    @Override // xsna.lzf
    public final ies0 b(Looper looper, MediaFormat mediaFormat, int i) {
        gr10 gr10Var = new gr10(mediaFormat);
        Integer num = gr10Var.h;
        Integer num2 = gr10Var.g;
        try {
            kes0 a2 = kes0.a.a(null, i, new Size(num2.intValue(), num.intValue()), looper, this.a, false);
            try {
                MediaCodec c = c(mediaFormat, a2, this.d);
                if (c == null) {
                    c = c(mediaFormat, a2, true);
                }
                if (c == null) {
                    throw new IllegalStateException("exception from fallback selection wasn't thrown, video decoder is null");
                }
                ies0 ies0Var = new ies0(a2, c, this.a);
                ((ErrorStatBuilder) this.b.b).n = new b(0, ies0Var, ies0.class, "getStat", "getStat$impl_release()Lcom/vk/media/pipeline/codec/CodecStat;", 0);
                return ies0Var;
            } catch (Throwable th) {
                a2.a();
                throw th;
            }
        } catch (Throwable th2) {
            throw new GlException("Failed to create video decoder surface (" + num2 + 'x' + num + ')', th2);
        }
    }

    public final MediaCodec c(MediaFormat mediaFormat, kes0 kes0Var, boolean z) {
        boolean z2;
        Object failure;
        f100 f100Var = this.a;
        try {
            g(mediaFormat, false, z);
            z2 = z;
        } catch (Throwable th) {
            th = th;
            z2 = z;
        }
        try {
            MediaCodec a2 = this.e.a(null, mediaFormat, false, kes0Var.a, z2);
            ((ErrorStatBuilder) this.b.b).d = a2.getName();
            try {
                f(a2, "video decoder");
                return a2;
            } catch (Throwable th2) {
                try {
                    failure = a2.getName();
                } catch (Throwable th3) {
                    failure = new Result.Failure(th3);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                String str = (String) failure;
                try {
                    a2.release();
                } catch (Throwable th4) {
                    if (f100Var != null) {
                        f100Var.a("DefaultCodecFactory", th4);
                    }
                }
                MediaCodecException mediaCodecException = new MediaCodecException(zhy0.a("start, isFallback=", z2), str, th2, null);
                if (z2) {
                    throw mediaCodecException;
                }
                if (f100Var != null) {
                    f100Var.c("DefaultCodecFactory", mediaCodecException);
                }
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            Throwable th6 = th;
            if (z2) {
                throw th6;
            }
            if (f100Var != null) {
                f100Var.c("DefaultCodecFactory", new MediaCodecException("create", null, th6, null));
            }
            return null;
        }
    }

    public final zis0 d(b0u b0uVar, MediaFormat mediaFormat, String str, boolean z) {
        Object failure;
        f100 f100Var = this.a;
        g(mediaFormat, true, z);
        MediaCodec a2 = this.e.a(str, mediaFormat, true, null, z);
        String name = a2.getName();
        ju4 ju4Var = this.b;
        ((ejp0) ju4Var.a).m = name;
        ErrorStatBuilder errorStatBuilder = (ErrorStatBuilder) ju4Var.b;
        errorStatBuilder.b = name;
        try {
            Surface createInputSurface = a2.createInputSurface();
            try {
                ajs0 ajs0Var = new ajs0(createInputSurface, q0u.a.b(b0uVar, createInputSurface, b0uVar.d), f100Var);
                try {
                    f(a2, "video encoder");
                    zis0 zis0Var = new zis0(ajs0Var, a2, f100Var);
                    errorStatBuilder.m = new a(0, zis0Var, zis0.class, "getStat", "getStat$impl_release()Lcom/vk/media/pipeline/codec/CodecStat;", 0);
                    return zis0Var;
                } catch (Throwable th) {
                    ajs0Var.a();
                    try {
                        failure = a2.getName();
                    } catch (Throwable th2) {
                        failure = new Result.Failure(th2);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    String str2 = (String) failure;
                    try {
                        a2.release();
                    } catch (Throwable th3) {
                        if (f100Var != null) {
                            f100Var.a("DefaultCodecFactory", th3);
                        }
                    }
                    MediaCodecException mediaCodecException = new MediaCodecException("start", str2, th, null);
                    if (z) {
                        throw mediaCodecException;
                    }
                    if (f100Var != null) {
                        f100Var.c("DefaultCodecFactory", mediaCodecException);
                    }
                    return null;
                }
            } finally {
            }
        } catch (Throwable th4) {
            try {
                a2.release();
            } catch (Throwable th5) {
                if (f100Var != null) {
                    f100Var.a("DefaultCodecFactory", th5);
                }
            }
            if (z) {
                throw th4;
            }
            if (f100Var != null) {
                f100Var.c("DefaultCodecFactory", new TranscodeException(th4));
            }
            return null;
        }
    }

    public final in4 e(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat) {
        Object failure;
        f100 f100Var = this.a;
        MediaCodec a2 = this.e.a(mediaCodecInfo != null ? mediaCodecInfo.getName() : null, mediaFormat, true, null, this.d);
        try {
            f(a2, "audio encoder");
            return new in4(a2, f100Var, "AudioEncoder");
        } catch (Throwable th) {
            try {
                failure = a2.getName();
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            String str = (String) failure;
            try {
                a2.release();
            } catch (Throwable th3) {
                if (f100Var != null) {
                    f100Var.a("DefaultCodecFactory", th3);
                }
            }
            throw new MediaCodecException("start", str, th, null);
        }
    }

    public final void g(MediaFormat mediaFormat, boolean z, boolean z2) {
        List<String> c = this.e.c(mediaFormat, z, z2);
        ju4 ju4Var = this.b;
        if (z) {
            ((ejp0) ju4Var.a).l = c;
            ((ErrorStatBuilder) ju4Var.b).a = c;
        } else {
            ArrayList<String> arrayList = ((ErrorStatBuilder) ju4Var.b).c;
            arrayList.addAll(c);
            arrayList.add("||");
        }
    }
}
