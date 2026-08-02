package xsna;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import xsna.k0h0;
import xsna.zq10;

/* compiled from: MediaExtractorVideoSource.kt */
/* loaded from: classes3.dex */
public final class cr10 extends zq10 implements tht0 {
    public final int m;
    public final ju4 n;
    public final MediaFormat o;
    public final int p;
    public final int q;
    public final Integer r;
    public final int s;

    public cr10(int i, MediaExtractor mediaExtractor, int i2, Uri uri, ju4 ju4Var, f100 f100Var) {
        super(uri, i2, f100Var, mediaExtractor, ju4Var != null ? (ejp0) ju4Var.a : null, "MediaExtractorVideoSource");
        this.m = i;
        this.n = ju4Var;
        gr10 gr10Var = this.i;
        this.o = gr10Var.a;
        this.p = gr10Var.g.intValue();
        this.q = this.i.h.intValue();
        gr10 gr10Var2 = this.i;
        this.r = gr10Var2.k;
        Integer num = gr10Var2.i;
        this.s = num != null ? num.intValue() : 0;
    }

    @Override // xsna.tht0
    public final int b() {
        return this.s;
    }

    @Override // xsna.tht0
    public final Integer e() {
        return this.r;
    }

    @Override // xsna.zq10, xsna.k0h0
    public final k0h0.b g() {
        ju4 ju4Var;
        ErrorStatBuilder errorStatBuilder;
        k0h0.b g = super.g();
        if (g != null) {
            k0h0.a.getClass();
            zq10.b bVar = (zq10.b) g;
            if (bVar.d == 0 && bVar.a.remaining() == 0 && bVar.b == 0 && (ju4Var = this.n) != null && (errorStatBuilder = (ErrorStatBuilder) ju4Var.b) != null) {
                errorStatBuilder.k.add(ErrorStatBuilder.EmptySampleDataOrigin.EXTRACTOR.toString());
            }
        }
        return g;
    }

    @Override // xsna.k0h0
    public final MediaFormat getFormat() {
        return this.o;
    }

    @Override // xsna.tht0
    public final int getHeight() {
        return this.q;
    }

    @Override // xsna.tht0
    public final int getWidth() {
        return this.p;
    }

    @Override // xsna.k0h0
    public final int m() {
        return this.m;
    }
}
