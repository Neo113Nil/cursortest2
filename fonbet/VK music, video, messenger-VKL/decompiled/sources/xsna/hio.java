package xsna;

import android.graphics.Bitmap;
import com.vk.photo.editor.features.markup.draw.internal.mvi.model.BrushType;
import java.util.Collections;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: DrawEditState.kt */
/* loaded from: classes4.dex */
public final class hio implements nwx {
    public final float a;
    public final x5g b;
    public final int c;
    public final BrushType d;
    public final List<vlo> e;
    public final a f;
    public final boolean g;
    public final boolean h;
    public final a i;

    /* compiled from: DrawEditState.kt */
    public interface a {

        /* compiled from: DrawEditState.kt */
        /* renamed from: xsna.hio$a$a, reason: collision with other inner class name */
        public static final class C3000a implements a {
            public static final C3000a a = new C3000a();
        }

        /* compiled from: DrawEditState.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: DrawEditState.kt */
        public static final class c implements a {
            public static final c a = new c();
        }

        /* compiled from: DrawEditState.kt */
        public static final class d implements a {
            public final Bitmap a;

            public d(Bitmap bitmap) {
                this.a = bitmap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                Bitmap bitmap = this.a;
                if (bitmap == null) {
                    return 0;
                }
                return bitmap.hashCode();
            }

            public final String toString() {
                return "Pipette(bitmap=" + this.a + ")";
            }
        }
    }

    public hio() {
        this(null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }

    public static hio a(hio hioVar, float f, x5g x5gVar, int i, BrushType brushType, List list, a aVar, boolean z, boolean z2, a aVar2, int i2) {
        if ((i2 & 1) != 0) {
            f = hioVar.a;
        }
        float f2 = f;
        if ((i2 & 2) != 0) {
            x5gVar = hioVar.b;
        }
        x5g x5gVar2 = x5gVar;
        if ((i2 & 4) != 0) {
            i = hioVar.c;
        }
        int i3 = i;
        BrushType brushType2 = (i2 & 8) != 0 ? hioVar.d : brushType;
        List list2 = (i2 & 16) != 0 ? hioVar.e : list;
        a aVar3 = (i2 & 32) != 0 ? hioVar.f : aVar;
        boolean z3 = (i2 & 64) != 0 ? hioVar.g : z;
        boolean z4 = (i2 & 128) != 0 ? hioVar.h : z2;
        hioVar.getClass();
        return new hio(f2, x5gVar2, i3, brushType2, list2, aVar3, z3, z4, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hio)) {
            return false;
        }
        hio hioVar = (hio) obj;
        return Float.compare(this.a, hioVar.a) == 0 && epx.f(this.b, hioVar.b) && this.c == hioVar.c && this.d == hioVar.d && epx.f(this.e, hioVar.e) && epx.f(this.f, hioVar.f) && this.g == hioVar.g && this.h == hioVar.h && epx.f(this.i, hioVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + qoy.b(qoy.b((this.f.hashCode() + fw3.a((this.d.hashCode() + shy.a(this.c, (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawEditState(size=");
        sb.append(this.a);
        sb.append(", colorData=");
        sb.append(this.b);
        sb.append(", currentIndex=");
        sb.append(this.c);
        sb.append(", brushType=");
        sb.append(this.d);
        sb.append(", history=");
        sb.append(this.e);
        sb.append(", prevState=");
        sb.append(this.f);
        sb.append(", forceFlag=");
        gsi0.c(sb, this.g, ", needRestartDraw=", this.h, ", currentState=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public hio(float f, x5g x5gVar, int i, BrushType brushType, List<vlo> list, a aVar, boolean z, boolean z2, a aVar2) {
        this.a = f;
        this.b = x5gVar;
        this.c = i;
        this.d = brushType;
        this.e = list;
        this.f = aVar;
        this.g = z;
        this.h = z2;
        this.i = aVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hio(x5g x5gVar, List list, int i) {
        this(0.1f, r4, 0, r6, r7, r8, true, r10, r13 != 0 ? a.b.a : r8);
        x5g x5gVar2 = (i & 2) != 0 ? new x5g(-1, false) : x5gVar;
        BrushType brushType = BrushType.Pen;
        List singletonList = (i & 16) != 0 ? Collections.singletonList(new vlo((kif0) null, 3)) : list;
        boolean z = (i & 128) != 0;
        int i2 = i & 256;
        a aVar = a.c.a;
    }
}
