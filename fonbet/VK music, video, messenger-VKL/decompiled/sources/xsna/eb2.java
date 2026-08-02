package xsna;

import android.graphics.PathMeasure;

/* compiled from: AndroidPathMeasure.android.kt */
/* loaded from: classes11.dex */
public final class eb2 implements oq90 {
    public final PathMeasure a;

    public eb2(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // xsna.oq90
    public final boolean a(float f, float f2, androidx.compose.ui.graphics.a aVar) {
        if (aVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.a.getSegment(f, f2, aVar.a, true);
    }

    @Override // xsna.oq90
    public final void b(androidx.compose.ui.graphics.a aVar) {
        this.a.setPath(aVar != null ? aVar.a : null, false);
    }

    @Override // xsna.oq90
    public final float getLength() {
        return this.a.getLength();
    }
}
