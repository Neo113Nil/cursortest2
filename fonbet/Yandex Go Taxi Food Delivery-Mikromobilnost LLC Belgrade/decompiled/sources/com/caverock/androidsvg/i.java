package com.caverock.androidsvg;

import android.graphics.Matrix;
import defpackage.anl0;
import defpackage.sml0;
import defpackage.wml0;
import defpackage.yml0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class i extends yml0 implements wml0 {
    public List h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public SVG$GradientSpread k;
    public String l;

    @Override // defpackage.wml0
    public final List getChildren() {
        return this.h;
    }

    @Override // defpackage.wml0
    public final void i(anl0 anl0Var) {
        if (anl0Var instanceof sml0) {
            this.h.add(anl0Var);
            return;
        }
        throw new SVGParseException("Gradient elements cannot contain " + anl0Var + " elements.");
    }
}
