package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.session.transform.task.transcode.producer.framerate.FrameRateController;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import kotlin.NoWhenBranchMatchedException;
import xsna.k0h0;

/* compiled from: VideoProducer.kt */
/* loaded from: classes3.dex */
public abstract class n6t0 {
    public final csp a;
    public r6t0 b;
    public boolean c;
    public int d;

    /* compiled from: VideoProducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodedSampleStatus.values().length];
            try {
                iArr[DecodedSampleStatus.RENDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecodedSampleStatus.CONSUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecodedSampleStatus.END_OF_STREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DecodedSampleStatus.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DecodedSampleStatus.END_OF_MEDIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n6t0(csp cspVar, r6t0 r6t0Var) {
        this.a = cspVar;
        this.b = r6t0Var;
    }

    public abstract void a(k0h0 k0h0Var);

    public abstract void b(k0h0 k0h0Var, k0h0.b bVar, MediaCodec.BufferInfo bufferInfo);

    public abstract void c(k0h0 k0h0Var);

    public abstract boolean d();

    public abstract boolean e();

    public abstract void f();

    public abstract void g(boolean z);

    public final boolean h(x7l x7lVar) {
        int i = a.$EnumSwitchMapping$0[x7lVar.a.ordinal()];
        if (i == 1 || i == 2) {
            FrameRateController.a aVar = x7lVar.b;
            return (aVar != null ? aVar.a : null) != FrameRateController.ResultType.SKIP;
        }
        csp cspVar = this.a;
        if (i == 3) {
            f100 f100Var = cspVar.d;
            if (f100Var != null) {
                f100Var.d("VideoProducer", "video decoder EOS reached, status=" + x7lVar);
            }
            return false;
        }
        if (i == 4) {
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        this.c = true;
        f100 f100Var2 = cspVar.d;
        if (f100Var2 != null) {
            f100Var2.d("VideoProducer", "video decoder end of media reached, status=" + x7lVar + '}');
        }
        return false;
    }
}
