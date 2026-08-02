package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.semantics.f;
import defpackage.aa10;
import defpackage.e530;
import defpackage.ehr0;
import defpackage.gnq0;
import defpackage.jw01;
import defpackage.mnq0;
import defpackage.tls;
import defpackage.uh6;
import defpackage.v0y;
import defpackage.x910;
import defpackage.xvz;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final class e extends e530 implements v0y, gnq0 {
    public float A;
    public long B;
    public ehr0 C;
    public boolean D;
    public long E;
    public long F;
    public int G;
    public tls H;
    public float a;
    public float b;
    public float c;
    public float w;
    public float x;
    public float y;
    public float z;

    @Override // defpackage.gnq0
    public final boolean U() {
        return false;
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        final o l0 = x910Var.l0(j);
        return kVar.w(l0.a, l0.b, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a.x((o.a) obj, o.this, 0, 0, this.H, 4);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha = ");
        sb.append(this.c);
        sb.append(", translationX=");
        sb.append(this.w);
        sb.append(", translationY=");
        sb.append(this.x);
        sb.append(", shadowElevation=");
        sb.append(this.y);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.z);
        sb.append(", cameraDistance=");
        sb.append(this.A);
        sb.append(", transformOrigin=");
        sb.append((Object) jw01.b(this.B));
        sb.append(", shape=");
        sb.append(this.C);
        sb.append(", clip=");
        sb.append(this.D);
        sb.append(", renderEffect=null, ambientShadowColor=");
        xvz.w(this.E, ", spotShadowColor=", sb);
        xvz.w(this.F, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) uh6.U(this.G));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        if (this.D) {
            f.r(mnq0Var, this.C);
        }
    }
}
