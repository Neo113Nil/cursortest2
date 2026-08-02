package xsna;

import android.animation.Animator;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class yc7 implements Animator.AnimatorListener {
    public final /* synthetic */ zc7 b;
    public final /* synthetic */ cpv c;
    public final /* synthetic */ aw50 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ gzs g;
    public final /* synthetic */ cpv h;
    public final /* synthetic */ aw50 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Ref$ObjectRef k;

    public yc7(zc7 zc7Var, cpv cpvVar, aw50 aw50Var, boolean z, Ref$ObjectRef ref$ObjectRef, gzs gzsVar, cpv cpvVar2, aw50 aw50Var2, boolean z2, Ref$ObjectRef ref$ObjectRef2) {
        this.b = zc7Var;
        this.c = cpvVar;
        this.d = aw50Var;
        this.e = z;
        this.f = ref$ObjectRef;
        this.g = gzsVar;
        this.h = cpvVar2;
        this.i = aw50Var2;
        this.j = z2;
        this.k = ref$ObjectRef2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zc7.a(this.b, this.h, this.i, this.j, (Bitmap) this.k.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gzs gzsVar;
        Bitmap bitmap = (Bitmap) this.f.element;
        zc7 zc7Var = this.b;
        cpv cpvVar = this.c;
        aw50 aw50Var = this.d;
        zc7.a(zc7Var, cpvVar, aw50Var, this.e, bitmap);
        if (aw50Var.c || (gzsVar = this.g) == null) {
            return;
        }
        gzsVar.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
