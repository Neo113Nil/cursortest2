package xsna;

import android.media.MediaFormat;
import android.os.Looper;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.item.VideoRawItem;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.util.List;
import java.util.function.Function;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BaseVideoDecoderController.kt */
/* loaded from: classes3.dex */
public abstract class qq6 {
    public final csp a;
    public final Looper b;
    public final b0u c;
    public final int d;
    public final q6t0 e;
    public klt0 f;

    public qq6(csp cspVar, Looper looper, b0u b0uVar, int i, lzf lzfVar, ErrorStatBuilder errorStatBuilder) {
        this.a = cspVar;
        this.b = looper;
        this.c = b0uVar;
        this.d = i;
        this.e = new q6t0(cspVar, lzfVar, errorStatBuilder);
    }

    public abstract klt0 a(int i, VideoItem videoItem);

    public final void b(int i, VideoItem videoItem) {
        this.f = a(i, videoItem);
        f100 f100Var = this.a.d;
        if (f100Var != null) {
            f100Var.i("BaseVideoDecoderController", "decoder created for fragment " + i);
        }
    }

    public final n6t0 c(VideoItem videoItem, int i, r6t0 r6t0Var, int i2) {
        final o6t0 o6t0Var = new o6t0(r6t0Var, i2, this.b);
        final q6t0 q6t0Var = this.e;
        csp cspVar = q6t0Var.a;
        if (videoItem instanceof VideoEncodedItem) {
            return new les0(cspVar, r6t0Var, new f8l(cspVar.c, cspVar.d, "BaseVideoDecoderController", new Function() { // from class: xsna.p6t0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    lzf lzfVar = q6t0.this.b;
                    o6t0 o6t0Var2 = o6t0Var;
                    return lzfVar.b(o6t0Var2.c, (MediaFormat) obj, o6t0Var2.b);
                }
            }), q6t0Var.c);
        }
        if (!(videoItem instanceof VideoRawItem)) {
            throw new NoWhenBranchMatchedException();
        }
        return new nat0(cspVar, new oat0(o6t0Var, this.c, ((VideoRawItem) videoItem).b, i));
    }

    public void e() {
        f(false);
    }

    public void f(boolean z) {
        klt0 klt0Var = this.f;
        if (klt0Var != null) {
            klt0Var.b(z);
        }
        this.f = null;
    }

    public void d(List<? extends c7s0> list) {
    }
}
