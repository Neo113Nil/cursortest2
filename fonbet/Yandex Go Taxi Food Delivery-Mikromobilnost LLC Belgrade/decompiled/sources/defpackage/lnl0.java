package defpackage;

import com.caverock.androidsvg.SVGParseException;

/* loaded from: classes10.dex */
public abstract class lnl0 extends vml0 {
    @Override // defpackage.vml0, defpackage.wml0
    public final void i(anl0 anl0Var) {
        if (anl0Var instanceof knl0) {
            this.i.add(anl0Var);
            return;
        }
        throw new SVGParseException("Text content elements cannot contain " + anl0Var + " elements.");
    }
}
