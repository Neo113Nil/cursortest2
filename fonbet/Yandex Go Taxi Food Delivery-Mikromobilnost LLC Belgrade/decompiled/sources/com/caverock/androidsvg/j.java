package com.caverock.androidsvg;

import defpackage.pt3;
import defpackage.ynl0;

/* loaded from: classes10.dex */
public final class j implements Cloneable {
    public final float a;
    public final SVG$Unit b;

    public j(float f) {
        this.a = f;
        this.b = SVG$Unit.px;
    }

    public final float a(m mVar) {
        if (this.b != SVG$Unit.percent) {
            return d(mVar);
        }
        ynl0 ynl0Var = mVar.c;
        pt3 pt3Var = ynl0Var.g;
        if (pt3Var == null) {
            pt3Var = ynl0Var.f;
        }
        float f = this.a;
        if (pt3Var == null) {
            return f;
        }
        float f2 = pt3Var.d;
        if (f2 != pt3Var.e) {
            f2 = (float) (Math.sqrt((r0 * r0) + (f2 * f2)) / 1.414213562373095d);
        }
        return (f * f2) / 100.0f;
    }

    public final float b(m mVar, float f) {
        return this.b == SVG$Unit.percent ? (this.a * f) / 100.0f : d(mVar);
    }

    public final float c() {
        float f;
        float f2;
        int i = h.a[this.b.ordinal()];
        float f3 = this.a;
        if (i == 1) {
            return f3;
        }
        switch (i) {
            case 4:
                return f3 * 96.0f;
            case 5:
                f = f3 * 96.0f;
                f2 = 2.54f;
                break;
            case 6:
                f = f3 * 96.0f;
                f2 = 25.4f;
                break;
            case 7:
                f = f3 * 96.0f;
                f2 = 72.0f;
                break;
            case 8:
                f = f3 * 96.0f;
                f2 = 6.0f;
                break;
            default:
                return f3;
        }
        return f / f2;
    }

    public final float d(m mVar) {
        float textSize;
        int i = h.a[this.b.ordinal()];
        float f = this.a;
        switch (i) {
            case 2:
                textSize = mVar.c.d.getTextSize();
                break;
            case 3:
                textSize = mVar.c.d.getTextSize() / 2.0f;
                break;
            case 4:
                mVar.getClass();
                return f * 96.0f;
            case 5:
                mVar.getClass();
                return (f * 96.0f) / 2.54f;
            case 6:
                mVar.getClass();
                return (f * 96.0f) / 25.4f;
            case 7:
                mVar.getClass();
                return (f * 96.0f) / 72.0f;
            case 8:
                mVar.getClass();
                return (f * 96.0f) / 6.0f;
            case 9:
                ynl0 ynl0Var = mVar.c;
                pt3 pt3Var = ynl0Var.g;
                if (pt3Var == null) {
                    pt3Var = ynl0Var.f;
                }
                if (pt3Var != null) {
                    return (f * pt3Var.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float e(m mVar) {
        if (this.b != SVG$Unit.percent) {
            return d(mVar);
        }
        ynl0 ynl0Var = mVar.c;
        pt3 pt3Var = ynl0Var.g;
        if (pt3Var == null) {
            pt3Var = ynl0Var.f;
        }
        float f = this.a;
        return pt3Var == null ? f : (f * pt3Var.e) / 100.0f;
    }

    public final boolean f() {
        return this.a < 0.0f;
    }

    public final boolean g() {
        return this.a == 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.a) + this.b;
    }

    public j(float f, SVG$Unit sVG$Unit) {
        this.a = f;
        this.b = sVG$Unit;
    }
}
