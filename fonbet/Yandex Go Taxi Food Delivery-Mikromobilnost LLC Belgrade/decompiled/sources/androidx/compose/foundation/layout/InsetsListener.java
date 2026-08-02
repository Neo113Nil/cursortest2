package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.e;
import defpackage.an91;
import defpackage.bx60;
import defpackage.k751;
import defpackage.n751;
import defpackage.q651;
import defpackage.u651;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R$\u00100\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/InsetsListener;", "Landroidx/core/view/e;", "Ljava/lang/Runnable;", "Lbx60;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/foundation/layout/a;", "composeInsets", "<init>", "(Landroidx/compose/foundation/layout/a;)V", "Lu651;", "animation", "Lzy11;", "onPrepare", "(Lu651;)V", "Lq651;", "bounds", "onStart", "(Lu651;Lq651;)Lq651;", "Ln751;", "insets", "", "runningAnimations", "onProgress", "(Ln751;Ljava/util/List;)Ln751;", "onEnd", "Landroid/view/View;", "view", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Landroidx/compose/foundation/layout/a;", "getComposeInsets", "()Landroidx/compose/foundation/layout/a;", "", "prepared", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "runningAnimation", "getRunningAnimation", "setRunningAnimation", "savedInsets", "Ln751;", "getSavedInsets", "()Ln751;", "setSavedInsets", "(Ln751;)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsetsListener extends e implements Runnable, bx60, View.OnAttachStateChangeListener {
    private final a composeInsets;
    private boolean prepared;
    private boolean runningAnimation;
    private n751 savedInsets;

    public InsetsListener(a aVar) {
        super(!aVar.t ? 1 : 0);
        this.composeInsets = aVar;
    }

    public final a getComposeInsets() {
        return this.composeInsets;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    public final n751 getSavedInsets() {
        return this.savedInsets;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 insets) {
        this.savedInsets = insets;
        this.composeInsets.r.f(an91.p(insets.a.g(8)));
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.s.f(an91.p(insets.a.g(8)));
            a.b(this.composeInsets, insets);
        }
        return this.composeInsets.t ? n751.b : insets;
    }

    @Override // androidx.core.view.e
    public void onEnd(u651 animation) {
        this.prepared = false;
        this.runningAnimation = false;
        n751 n751Var = this.savedInsets;
        if (animation.a.b() > 0 && n751Var != null) {
            k751 k751Var = n751Var.a;
            this.composeInsets.s.f(an91.p(k751Var.g(8)));
            this.composeInsets.r.f(an91.p(k751Var.g(8)));
            a.b(this.composeInsets, n751Var);
        }
        this.savedInsets = null;
    }

    @Override // androidx.core.view.e
    public void onPrepare(u651 animation) {
        this.prepared = true;
        this.runningAnimation = true;
    }

    @Override // androidx.core.view.e
    public n751 onProgress(n751 insets, List<u651> runningAnimations) {
        a.b(this.composeInsets, insets);
        return this.composeInsets.t ? n751.b : insets;
    }

    @Override // androidx.core.view.e
    public q651 onStart(u651 animation, q651 bounds) {
        this.prepared = false;
        return bounds;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            n751 n751Var = this.savedInsets;
            if (n751Var != null) {
                this.composeInsets.s.f(an91.p(n751Var.a.g(8)));
                a.b(this.composeInsets, n751Var);
                this.savedInsets = null;
            }
        }
    }

    public final void setPrepared(boolean z) {
        this.prepared = z;
    }

    public final void setRunningAnimation(boolean z) {
        this.runningAnimation = z;
    }

    public final void setSavedInsets(n751 n751Var) {
        this.savedInsets = n751Var;
    }
}
