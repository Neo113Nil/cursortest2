package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;

/* compiled from: BottomPlayerState.kt */
/* loaded from: classes3.dex */
public interface b78 {

    /* compiled from: BottomPlayerState.kt */
    public static final class a implements b78, e {
        public final wh50 a;
        public final wh50 b;
        public final kg50 c;
        public final wh50 d;

        public a() {
            throw null;
        }

        public a(boolean z, Thumb thumb, float f, izs izsVar) {
            this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.b = androidx.compose.runtime.k.b(thumb);
            this.c = androidx.compose.runtime.d.a(f);
            this.d = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.b78
        public final izs<sx40, s3q0> a() {
            return (izs) ((zak0) this.d).getValue();
        }

        @Override // xsna.b78
        public final Thumb getImage() {
            return (Thumb) ((zak0) this.b).getValue();
        }

        @Override // xsna.b78
        public final float getProgress() {
            return this.c.getFloatValue();
        }

        @Override // xsna.b78
        public final boolean isPlaying() {
            return ((Boolean) ((zak0) this.a).getValue()).booleanValue();
        }
    }

    /* compiled from: BottomPlayerState.kt */
    public static final class b implements b78 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final kg50 f;
        public final wh50 g;

        public b() {
            throw null;
        }

        public b(String str, boolean z, String str2, boolean z2, Thumb thumb, float f, izs izsVar) {
            this.a = androidx.compose.runtime.k.b(str);
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.c = androidx.compose.runtime.k.b(str2);
            this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
            this.e = androidx.compose.runtime.k.b(thumb);
            this.f = androidx.compose.runtime.d.a(f);
            this.g = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.b78
        public final izs<sx40, s3q0> a() {
            return (izs) ((zak0) this.g).getValue();
        }

        @Override // xsna.b78
        public final Thumb getImage() {
            return (Thumb) ((zak0) this.e).getValue();
        }

        @Override // xsna.b78
        public final float getProgress() {
            return this.f.getFloatValue();
        }

        @Override // xsna.b78
        public final boolean isPlaying() {
            return ((Boolean) ((zak0) this.d).getValue()).booleanValue();
        }
    }

    /* compiled from: BottomPlayerState.kt */
    public interface c {
        boolean b();
    }

    /* compiled from: BottomPlayerState.kt */
    public interface d {
        boolean J();
    }

    /* compiled from: BottomPlayerState.kt */
    public interface e {
    }

    /* compiled from: BottomPlayerState.kt */
    public static final class f implements b78, e {
        public final wh50 a;
        public final Thumb b;
        public final kg50 c;
        public final wh50 d;

        /* compiled from: BottomPlayerState.kt */
        public static final class a {
            public static f a(boolean z, float f, izs izsVar, androidx.compose.runtime.a aVar, int i) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1909117610, i, -1, "com.vk.music.stickyplayer.presentation.components.BottomPlayerState.Loading.Companion.invoke (BottomPlayerState.kt:135)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new f(f, izsVar, z);
                    aVar.R(x);
                }
                f fVar = (f) x;
                ((zak0) fVar.a).setValue(Boolean.valueOf(z));
                ((vak0) fVar.c).g(f);
                ((zak0) fVar.d).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return fVar;
            }
        }

        public f() {
            throw null;
        }

        public f(float f, izs izsVar, boolean z) {
            this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.b = lso0.a;
            this.c = androidx.compose.runtime.d.a(f);
            this.d = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.b78
        public final izs<sx40, s3q0> a() {
            return (izs) ((zak0) this.d).getValue();
        }

        @Override // xsna.b78
        public final Thumb getImage() {
            return this.b;
        }

        @Override // xsna.b78
        public final float getProgress() {
            return this.c.getFloatValue();
        }

        @Override // xsna.b78
        public final boolean isPlaying() {
            return ((Boolean) ((zak0) this.a).getValue()).booleanValue();
        }
    }

    /* compiled from: BottomPlayerState.kt */
    public static final class g implements b78, d, c {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;
        public final wh50 g;
        public final kg50 h;
        public final wh50 i;

        public g() {
            throw null;
        }

        public g(String str, boolean z, String str2, boolean z2, boolean z3, Thumb thumb, float f, boolean z4, izs izsVar) {
            this.a = androidx.compose.runtime.k.b(str);
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.c = androidx.compose.runtime.k.b(str2);
            this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z4));
            this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
            this.f = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
            this.g = androidx.compose.runtime.k.b(thumb);
            this.h = androidx.compose.runtime.d.a(f);
            this.i = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.b78.d
        public final boolean J() {
            return ((Boolean) ((zak0) this.f).getValue()).booleanValue();
        }

        @Override // xsna.b78
        public final izs<sx40, s3q0> a() {
            return (izs) ((zak0) this.i).getValue();
        }

        @Override // xsna.b78.c
        public final boolean b() {
            return ((Boolean) ((zak0) this.d).getValue()).booleanValue();
        }

        @Override // xsna.b78
        public final Thumb getImage() {
            return (Thumb) ((zak0) this.g).getValue();
        }

        @Override // xsna.b78
        public final float getProgress() {
            return this.h.getFloatValue();
        }

        @Override // xsna.b78
        public final boolean isPlaying() {
            return ((Boolean) ((zak0) this.e).getValue()).booleanValue();
        }
    }

    /* compiled from: BottomPlayerState.kt */
    public static final class h implements b78 {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final kg50 f;
        public final wh50 g;

        public h() {
            throw null;
        }

        public h(String str, boolean z, String str2, boolean z2, Thumb thumb, float f, izs izsVar) {
            this.a = androidx.compose.runtime.k.b(str);
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.c = androidx.compose.runtime.k.b(str2);
            this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
            this.e = androidx.compose.runtime.k.b(thumb);
            this.f = androidx.compose.runtime.d.a(f);
            this.g = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.b78
        public final izs<sx40, s3q0> a() {
            return (izs) ((zak0) this.g).getValue();
        }

        @Override // xsna.b78
        public final Thumb getImage() {
            return (Thumb) ((zak0) this.e).getValue();
        }

        @Override // xsna.b78
        public final float getProgress() {
            return this.f.getFloatValue();
        }

        @Override // xsna.b78
        public final boolean isPlaying() {
            return ((Boolean) ((zak0) this.d).getValue()).booleanValue();
        }
    }

    /* compiled from: BottomPlayerState.kt */
    public static final class i implements b78, d {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;

        public i() {
            throw null;
        }

        public i(String str, boolean z, boolean z2, Thumb thumb, izs izsVar) {
            this.a = androidx.compose.runtime.k.b(str);
            this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
            this.d = androidx.compose.runtime.k.b(thumb);
            this.e = androidx.compose.runtime.k.b(izsVar);
        }

        @Override // xsna.b78.d
        public final boolean J() {
            return ((Boolean) ((zak0) this.c).getValue()).booleanValue();
        }

        @Override // xsna.b78
        public final izs<sx40, s3q0> a() {
            return (izs) ((zak0) this.e).getValue();
        }

        @Override // xsna.b78
        public final Thumb getImage() {
            return (Thumb) ((zak0) this.d).getValue();
        }

        @Override // xsna.b78
        public final float getProgress() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.b78
        public final boolean isPlaying() {
            return ((Boolean) ((zak0) this.b).getValue()).booleanValue();
        }
    }

    izs<sx40, s3q0> a();

    Thumb getImage();

    float getProgress();

    boolean isPlaying();
}
