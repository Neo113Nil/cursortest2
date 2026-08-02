package defpackage;

import android.graphics.Bitmap;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ei70 {
    public final String a;
    public final zzs b;
    public final float c;
    public final float d;
    public final MapObject.AlignType e;
    public final Bitmap f;

    public ei70(String str, zzs zzsVar, float f, float f2, MapObject.AlignType alignType, Bitmap bitmap) {
        this.a = str;
        this.b = zzsVar;
        this.c = f;
        this.d = f2;
        this.e = alignType;
        this.f = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei70)) {
            return false;
        }
        ei70 ei70Var = (ei70) obj;
        return jl40.l(this.a, ei70Var.a) && this.b.equals(ei70Var.b) && Float.compare(this.c, ei70Var.c) == 0 && Float.compare(this.d, ei70Var.d) == 0 && this.e == ei70Var.e && jl40.l(this.f, ei70Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + g8e.c(this.d, g8e.c(this.c, nnm.b(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderBubbleMapObjectUiState(id=");
        sb.append(this.a);
        sb.append(", geoPoint=");
        sb.append(this.b);
        sb.append(", zoomMin=");
        vfc.x(sb, this.c, ", zoomMax=", this.d, ", alignType=");
        sb.append(this.e);
        sb.append(", bitmap=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
