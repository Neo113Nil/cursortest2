package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: LottieCompositionResult.kt */
/* loaded from: classes12.dex */
public final class t700 implements s700 {
    public final o7i b = p7i.a();
    public final wh50 c = androidx.compose.runtime.k.b(null);
    public final wh50 d = androidx.compose.runtime.k.b(null);
    public final f1m e;
    public final f1m f;

    /* compiled from: LottieCompositionResult.kt */
    public static final class a extends Lambda implements gzs<Boolean> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf((((i700) ((zak0) t700.this.c).getValue()) == null && ((Throwable) ((zak0) t700.this.d).getValue()) == null) ? false : true);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    public static final class b extends Lambda implements gzs<Boolean> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((Throwable) ((zak0) t700.this.d).getValue()) != null);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    public static final class c extends Lambda implements gzs<Boolean> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((i700) ((zak0) t700.this.c).getValue()) == null && ((Throwable) ((zak0) t700.this.d).getValue()) == null);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    public static final class d extends Lambda implements gzs<Boolean> {
        public d() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((i700) ((zak0) t700.this.c).getValue()) != null);
        }
    }

    public t700() {
        bbk0.b(new c());
        this.e = bbk0.b(new a());
        bbk0.b(new b());
        this.f = bbk0.b(new d());
    }

    @Override // xsna.mtk0
    public final i700 getValue() {
        return (i700) ((zak0) this.c).getValue();
    }
}
