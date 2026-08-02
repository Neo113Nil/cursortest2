package xsna;

import com.vk.media.pipeline.bitrate.EncoderBitrateProvider$Companion$VideoEncoderMotionFactor;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MaxVideoBitrateProvider.kt */
/* loaded from: classes3.dex */
public final class uo10 implements bjp {
    public final a b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new nef(this, 19));

    /* compiled from: MaxVideoBitrateProvider.kt */
    public static final class a {
        public final csp a;
        public final ArrayList b;
        public final ofy0 c;

        public a(csp cspVar, ArrayList arrayList, ofy0 ofy0Var) {
            this.a = cspVar;
            this.b = arrayList;
            this.c = ofy0Var;
        }
    }

    public uo10(a aVar) {
        this.b = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bjp
    public final int a(int i, int i2, int i3) {
        Double d = (Double) this.c.getValue();
        if (d == null) {
            return this.b.c.a(i, i2, i3);
        }
        return (int) (Math.max(EncoderBitrateProvider$Companion$VideoEncoderMotionFactor.LOW.h(), Math.min(d.doubleValue(), EncoderBitrateProvider$Companion$VideoEncoderMotionFactor.HIGH.h())) * i * i2 * i3);
    }

    @Override // xsna.bjp
    public final int c(int i, int i2, int i3) {
        return this.b.c.c(i, i2, i3);
    }
}
