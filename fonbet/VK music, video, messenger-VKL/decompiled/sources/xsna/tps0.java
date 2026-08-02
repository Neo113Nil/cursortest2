package xsna;

import com.vkontakte.android.R;

/* compiled from: VideoHolderSize.kt */
/* loaded from: classes4.dex */
public interface tps0 {

    /* compiled from: VideoHolderSize.kt */
    public static final class a implements tps0 {
        public final int a;
        public final int b;
        public final Float c;
        public final int d;
        public final int e;
        public final Integer f;
        public final Integer g;

        /* compiled from: VideoHolderSize.kt */
        /* renamed from: xsna.tps0$a$a, reason: collision with other inner class name */
        public static final class C3761a {
        }

        public a(int i, int i2, Float f, int i3, int i4, C3761a c3761a, int i5) {
            Integer valueOf = (i5 & 64) != 0 ? null : Integer.valueOf(R.drawable.video_simple_attach_bg_2dp);
            this.a = i;
            this.b = i2;
            this.c = f;
            this.d = i3;
            this.e = i4;
            this.f = valueOf;
            this.g = null;
        }

        @Override // xsna.tps0
        public final Float E0() {
            return this.c;
        }
    }

    /* compiled from: VideoHolderSize.kt */
    public static final class b implements tps0 {
        public final Float a;
        public final boolean b;

        public b() {
            this(0);
        }

        @Override // xsna.tps0
        public final Float E0() {
            return this.a;
        }

        public /* synthetic */ b(int i) {
            this(null, false);
        }

        public b(Float f, boolean z) {
            this.a = f;
            this.b = z;
        }
    }

    Float E0();
}
