package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ifc implements q7v {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public Paint e;

    public ifc(int i) {
        this.a = (i & 1) != 0 ? ModalContentViewContainer.BASE_SHADOW_COLOR : 0;
        this.b = -1;
        this.c = -1;
        this.d = true;
    }

    @Override // defpackage.q7v
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.q7v
    public final void draw(Canvas canvas) {
        int i;
        Paint paint = this.e;
        if (paint == null) {
            paint = new Paint();
            paint.setColor(this.a);
            this.e = paint;
        }
        Paint paint2 = paint;
        int i2 = this.b;
        if (i2 < 0 || (i = this.c) < 0) {
            canvas.drawPaint(paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, i2, i, paint2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifc)) {
            return false;
        }
        ifc ifcVar = (ifc) obj;
        return this.a == ifcVar.a && this.b == ifcVar.b && this.c == ifcVar.c && this.d == ifcVar.d;
    }

    @Override // defpackage.q7v
    public final int getHeight() {
        return this.c;
    }

    @Override // defpackage.q7v
    public final long getSize() {
        return 0L;
    }

    @Override // defpackage.q7v
    public final int getWidth() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qv10.c(((((this.a * 31) + this.b) * 31) + this.c) * 31, 31, 0L);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ColorImage(color=", ", width=", ", height=");
        s.append(this.c);
        s.append(", size=0, shareable=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public ifc() {
        this(31);
    }
}
