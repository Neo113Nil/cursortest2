package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: DrawModifier.kt */
/* loaded from: classes11.dex */
public final class kw8 implements azl {
    public in8 b = yep.b;
    public jod c;

    /* compiled from: DrawModifier.kt */
    public static final class a extends Lambda implements izs<ggj, s3q0> {
        final /* synthetic */ izs<oio, s3q0> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super oio, s3q0> izsVar) {
            super(1);
            this.$block = izsVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(ggj ggjVar) {
            ggj ggjVar2 = ggjVar;
            this.$block.invoke(ggjVar2);
            ggjVar2.s1();
            return s3q0.a;
        }
    }

    public final jod c(izs<? super oio, s3q0> izsVar) {
        return e(new a(izsVar));
    }

    public final jod e(izs<? super ggj, s3q0> izsVar) {
        jod jodVar = new jod();
        jodVar.a = izsVar;
        this.c = jodVar;
        return jodVar;
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.b.getDensity().getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.b.getDensity().getFontScale();
    }
}
