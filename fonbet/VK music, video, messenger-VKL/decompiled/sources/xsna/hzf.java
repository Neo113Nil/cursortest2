package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.codec.MediaCodecException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.uzf;

/* compiled from: Codec.kt */
/* loaded from: classes3.dex */
public abstract class hzf {
    public final MediaCodec a;
    public final f100 b;
    public final String c;
    public final String d = (String) d("codec init getName", b.b);
    public boolean e;
    public boolean f;
    public final uzf.a g;

    /* compiled from: Codec.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<MediaCodec, s3q0> {
        public static final a b = new a(1, MediaCodec.class, "flush", "flush()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(MediaCodec mediaCodec) {
            mediaCodec.flush();
            return s3q0.a;
        }
    }

    /* compiled from: Codec.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<MediaCodec, String> {
        public static final b b = new b(1, MediaCodec.class, "getName", "getName()Ljava/lang/String;", 0);

        @Override // xsna.izs
        public final String invoke(MediaCodec mediaCodec) {
            return mediaCodec.getName();
        }
    }

    public hzf(MediaCodec mediaCodec, f100 f100Var, String str) {
        this.a = mediaCodec;
        this.b = f100Var;
        this.c = str;
        this.g = new uzf.a(mediaCodec);
    }

    public final MediaCodecException a(String str, Throwable th) {
        uzf.a aVar = this.g;
        return new MediaCodecException(str, aVar.a, th, aVar.a());
    }

    public final void b() {
        d("flush", a.b);
        this.f = false;
        this.e = false;
        this.g.c++;
        f100 f100Var = this.b;
        if (f100Var != null) {
            f100Var.d(this.c, "flushed: " + this);
        }
    }

    public void c() {
        String str = this.c;
        f100 f100Var = this.b;
        uzf.a aVar = this.g;
        try {
            this.a.release();
            aVar.b++;
            if (f100Var != null) {
                f100Var.v(str, "codec released, " + aVar.a());
            }
        } catch (Throwable th) {
            if (f100Var != null) {
                f100Var.e(str, "failed to release media codec", a("release", th));
            }
        }
    }

    public final <T> T d(String str, izs<? super MediaCodec, ? extends T> izsVar) {
        try {
            return izsVar.invoke(this.a);
        } catch (Throwable th) {
            throw a(str, th);
        }
    }

    public final String toString() {
        return String.valueOf(this.g.a());
    }
}
