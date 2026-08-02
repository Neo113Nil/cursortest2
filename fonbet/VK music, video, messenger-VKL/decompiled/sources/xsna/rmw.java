package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.chs;

/* compiled from: ImageViewState.kt */
/* loaded from: classes2.dex */
public interface rmw {

    /* compiled from: ImageViewState.kt */
    public static final class a {
        public static d a(int i) {
            return new d(i);
        }
    }

    /* compiled from: ImageViewState.kt */
    public static final class b {
        public static final lg90 a(uco ucoVar, rmw rmwVar, androidx.compose.runtime.a aVar, int i, int i2) {
            Object h;
            lg90 lg90Var;
            uco ucoVar2 = (i2 & 1) != 0 ? null : ucoVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2136929870, i, -1, "com.vk.libvideo.design.compose.utils.ImageViewState.ComposeDefaultImpls.asPainter$default (ImageViewState.kt:-1)");
            }
            int i3 = i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
            rmwVar.getClass();
            aVar.K(-719823318);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-719823318, i3, -1, "com.vk.libvideo.design.compose.utils.ImageViewState.asPainter (ImageViewState.kt:57)");
            }
            if (rmwVar instanceof d) {
                aVar.K(-260467264);
                lg90Var = pg90.a(((d) rmwVar).a, 0, aVar);
                aVar.j();
            } else if (rmwVar instanceof c) {
                aVar.K(-260465429);
                lg90Var = w65.p(null, aVar, 0);
                aVar.j();
            } else {
                boolean z = rmwVar instanceof h;
                Object obj = a.C0011a.a;
                if (z) {
                    aVar.K(515577099);
                    String str = ((h) rmwVar).a;
                    Object x = aVar.x();
                    if (x == obj) {
                        x = new gv3(27);
                        aVar.R(x);
                    }
                    lg90Var = fwu0.l(null, str, (izs) x, null, aVar, ((i3 << 12) & 458752) | 24576, 13);
                    aVar.j();
                } else if (rmwVar instanceof g) {
                    aVar.K(515791991);
                    List list = ((g) rmwVar).a;
                    long j = ucoVar2 != null ? ucoVar2.a : 9205357640488583168L;
                    Object x2 = aVar.x();
                    if (x2 == obj) {
                        x2 = new xpt(3);
                        aVar.R(x2);
                    }
                    izs izsVar = (izs) x2;
                    EmptyList emptyList = EmptyList.b;
                    Object x3 = aVar.x();
                    if (x3 == obj) {
                        x3 = new c24(0);
                        aVar.R(x3);
                    }
                    gzs gzsVar = (gzs) x3;
                    Object x4 = aVar.x();
                    if (x4 == obj) {
                        x4 = new d7l0(15);
                        aVar.R(x4);
                    }
                    izs izsVar2 = (izs) x4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1169804664, 100663296, -1, "com.vk.core.compose.image.fresco.rememberBestPainter (VkFrescoImage.kt:134)");
                    }
                    lg90Var = (lg90) fwu0.h(j, emptyList, list, gzsVar, null, izsVar, izsVar2, aVar, 0).j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                } else {
                    if (!(rmwVar instanceof f)) {
                        throw alb0.c(-260467363, aVar);
                    }
                    aVar.K(516153327);
                    azl azlVar = (azl) aVar.r(uvi.h);
                    f fVar = (f) rmwVar;
                    Image image = fVar.a;
                    boolean J = aVar.J(image);
                    Object x5 = aVar.x();
                    if (J || x5 == obj) {
                        if (ucoVar2 != null) {
                            ImageSize Cb = image.Cb((int) (azlVar.I0(uco.c(ucoVar2.a)) * fVar.b), true, false);
                            h = Cb != null ? Cb.d.d : null;
                        } else {
                            h = ixj0.h(image.b);
                        }
                        aVar.R(h);
                        x5 = h;
                    }
                    String str2 = (String) x5;
                    Object x6 = aVar.x();
                    if (x6 == obj) {
                        x6 = new oqu(3);
                        aVar.R(x6);
                    }
                    lg90Var = (lg90) fwu0.m(null, str2, null, null, (izs) x6, null, aVar, 24576, 77).j();
                    aVar.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return lg90Var;
        }
    }

    /* compiled from: ImageViewState.kt */
    public static final class c implements rmw {
    }

    /* compiled from: ImageViewState.kt */
    public static final class d implements rmw {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DrawableResource(resId="), this.a, ')');
        }
    }

    /* compiled from: ImageViewState.kt */
    public static abstract class e {

        /* compiled from: ImageViewState.kt */
        public static abstract class a extends e {

            /* compiled from: ImageViewState.kt */
            /* renamed from: xsna.rmw$e$a$a, reason: collision with other inner class name */
            public static final class C3614a extends a {
                public static final C3614a a = new C3614a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3614a);
                }

                public final int hashCode() {
                    return -1315121144;
                }

                public final String toString() {
                    return "Ready";
                }
            }
        }

        /* compiled from: ImageViewState.kt */
        public static final class b extends e {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1537957602;
            }

            public final String toString() {
                return "NoImage";
            }
        }

        /* compiled from: ImageViewState.kt */
        public static abstract class c extends e {
            public final String a;

            /* compiled from: ImageViewState.kt */
            public static final class a extends c {
                public final String b;

                public a(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.rmw.e.c
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Cancel(id="), this.b, ')');
                }
            }

            /* compiled from: ImageViewState.kt */
            public static final class b extends c {
                public final String b;
                public final Throwable c;

                public b(String str, Throwable th) {
                    super(str);
                    this.b = str;
                    this.c = th;
                }

                @Override // xsna.rmw.e.c
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
                }

                public final int hashCode() {
                    int hashCode = this.b.hashCode() * 31;
                    Throwable th = this.c;
                    return hashCode + (th == null ? 0 : th.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Error(id=");
                    sb.append(this.b);
                    sb.append(", throwable=");
                    return oq.c(sb, this.c, ')');
                }
            }

            /* compiled from: ImageViewState.kt */
            /* renamed from: xsna.rmw$e$c$c, reason: collision with other inner class name */
            public static final class C3615c extends c {
                public final String b;

                public C3615c(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.rmw.e.c
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3615c) && epx.f(this.b, ((C3615c) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Loading(id="), this.b, ')');
                }
            }

            /* compiled from: ImageViewState.kt */
            public static final class d extends c {
                public final String b;
                public final int c;
                public final int d;

                public d(String str, int i, int i2) {
                    super(str);
                    this.b = str;
                    this.c = i;
                    this.d = i2;
                }

                @Override // xsna.rmw.e.c
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Success(id=");
                    sb.append(this.b);
                    sb.append(", width=");
                    sb.append(this.c);
                    sb.append(", height=");
                    return vu5.b(sb, this.d, ')');
                }
            }

            public c(String str) {
                this.a = str;
            }

            public String a() {
                return this.a;
            }
        }
    }

    /* compiled from: ImageViewState.kt */
    public static final class f implements rmw {
        public final Image a;
        public final float b;

        public f(Image image, float f) {
            this.a = image;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && Float.compare(this.b, fVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteImage(image=");
            sb.append(this.a);
            sb.append(", targetSizePercent=");
            return xq.c(')', this.b, sb);
        }
    }

    /* compiled from: ImageViewState.kt */
    public static final class g implements rmw {
        public final List a;

        public g(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("RemoteSizeableImage(images="), this.a);
        }
    }

    /* compiled from: ImageViewState.kt */
    public static final class h implements rmw {
        public final String a;

        public h(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("RemoteUrlImage(url="), this.a, ')');
        }
    }

    static e a(chs chsVar) {
        int i;
        if (epx.f(chsVar, chs.d.a)) {
            return e.b.a;
        }
        if (chsVar instanceof chs.a) {
            return new e.c.a(((chs.a) chsVar).a);
        }
        if (chsVar instanceof chs.b) {
            chs.b bVar = (chs.b) chsVar;
            return new e.c.b(bVar.a, bVar.b);
        }
        if (chsVar instanceof chs.c) {
            return new e.c.C3615c(((chs.c) chsVar).a);
        }
        if (!(chsVar instanceof chs.e)) {
            throw new NoWhenBranchMatchedException();
        }
        chs.e eVar = (chs.e) chsVar;
        int i2 = eVar.b;
        return (i2 <= 0 || (i = eVar.c) <= 0) ? e.b.a : new e.c.d(eVar.a, i2, i);
    }
}
