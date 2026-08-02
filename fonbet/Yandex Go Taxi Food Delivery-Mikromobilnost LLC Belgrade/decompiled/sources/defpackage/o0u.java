package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* loaded from: classes.dex */
public final class o0u implements m0u {
    public final l28 b;
    public final k28 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public float r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;

    public o0u() {
        l28 l28Var = new l28();
        k28 k28Var = new k28();
        this.b = l28Var;
        this.c = k28Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = ldc.b;
        this.p = j;
        this.q = j;
        this.t = 8.0f;
        this.x = 0;
    }

    public final void a() {
        boolean z = this.u;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        boolean z4 = this.v;
        RenderNode renderNode = this.d;
        if (z3 != z4) {
            this.v = z3;
            renderNode.setClipToBounds(z3);
        }
        if (z2 != this.w) {
            this.w = z2;
            renderNode.setClipToOutline(z2);
        }
    }

    public final void b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void c() {
        int i = this.x;
        RenderNode renderNode = this.d;
        if (i != 1 && this.j == 3) {
            b(renderNode, i);
        } else {
            b(renderNode, 1);
        }
    }
}
