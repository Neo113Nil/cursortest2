package xsna;

import com.vk.attachpicker.impl.graffiti.domain.model.BrushType;

/* compiled from: DrawConfiguration.kt */
/* loaded from: classes15.dex */
public final class rho {
    public final float a;
    public final z5g b;
    public final BrushType c;
    public final float d;

    public rho() {
        this(0);
    }

    public static rho a(rho rhoVar, float f, z5g z5gVar, BrushType brushType, float f2, int i) {
        if ((i & 1) != 0) {
            f = rhoVar.a;
        }
        if ((i & 2) != 0) {
            z5gVar = rhoVar.b;
        }
        if ((i & 4) != 0) {
            brushType = rhoVar.c;
        }
        if ((i & 8) != 0) {
            f2 = rhoVar.d;
        }
        rhoVar.getClass();
        return new rho(f, z5gVar, brushType, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rho)) {
            return false;
        }
        rho rhoVar = (rho) obj;
        return Float.compare(this.a, rhoVar.a) == 0 && epx.f(this.b, rhoVar.b) && this.c == rhoVar.c && Float.compare(this.d, rhoVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawConfiguration(brushSize=");
        sb.append(this.a);
        sb.append(", colorData=");
        sb.append(this.b);
        sb.append(", brushType=");
        sb.append(this.c);
        sb.append(", maxBrushSize=");
        return xq.c(')', this.d, sb);
    }

    public rho(float f, z5g z5gVar, BrushType brushType, float f2) {
        this.a = f;
        this.b = z5gVar;
        this.c = brushType;
        this.d = f2;
    }

    public /* synthetic */ rho(int i) {
        this(0.1f, new z5g(-65536, false), BrushType.Pen, 0.1f);
    }
}
