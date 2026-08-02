package xsna;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: RecommendedElement.java */
/* loaded from: classes3.dex */
public final class zcf0 implements Runnable {
    public final /* synthetic */ vcf0 b;
    public final /* synthetic */ som0 c;

    public zcf0(som0 som0Var, vcf0 vcf0Var) {
        this.c = som0Var;
        this.b = vcf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vcf0 vcf0Var;
        som0 som0Var = this.c;
        xcf0 xcf0Var = (xcf0) som0Var.b;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!xcf0Var.isAttachedToWindow() || (vcf0Var = this.b) == null) {
            return;
        }
        vcf0Var.g0(((xcf0) som0Var.b).i, true);
    }
}
