package defpackage;

import androidx.compose.ui.graphics.layer.a;

/* loaded from: classes.dex */
public interface j390 {
    void destroy();

    void drawLayer(i28 i28Var, a aVar);

    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    float[] mo78getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc */
    void mo79inverseTransform58bKbWc(float[] fArr);

    /* renamed from: isInLayer-k-4lQ0M */
    boolean mo80isInLayerk4lQ0M(long j);

    void mapBounds(gz40 gz40Var, boolean z);

    /* renamed from: mapOffset-8S9VItk */
    long mo81mapOffset8S9VItk(long j, boolean z);

    /* renamed from: move--gyyYBs */
    void mo82movegyyYBs(long j);

    /* renamed from: resize-ozmzZPI */
    void mo83resizeozmzZPI(long j);

    void reuseLayer(wls wlsVar, sls slsVar);

    /* renamed from: transform-58bKbWc */
    void mo84transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(m2k0 m2k0Var);
}
