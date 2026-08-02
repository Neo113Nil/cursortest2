package xsna;

import android.view.animation.PathInterpolator;
import java.util.TreeMap;
import xsna.nb30;
import xsna.nmp0;

/* compiled from: TransitionLayoutBuilder.kt */
/* loaded from: classes7.dex */
public abstract class vmp0 {
    public final ei a;
    public final hq2 b;
    public final TreeMap c;

    /* compiled from: TransitionLayoutBuilder.kt */
    public static final class a extends vmp0 {
        public a(nb30 nb30Var) {
            super(new ei(nmp0.a.b, nb30.a.a, nb30Var), new hq2((PathInterpolator) null, 2));
        }
    }

    public vmp0(ei eiVar, hq2 hq2Var, TreeMap treeMap) {
        this.a = eiVar;
        this.b = hq2Var;
        this.c = treeMap;
    }

    public /* synthetic */ vmp0(ei eiVar, hq2 hq2Var) {
        this(eiVar, hq2Var, new TreeMap());
    }
}
