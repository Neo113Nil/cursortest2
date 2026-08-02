package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: EditorTooltipsDelegate.kt */
/* loaded from: classes16.dex */
public final class m5p implements w8i {
    public final v76 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public boolean f;
    public final Object g;

    public m5p(v76 v76Var) {
        this.b = v76Var;
        tj2 tj2Var = new tj2(12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, tj2Var);
        this.d = msy.a(lazyThreadSafetyMode, new xqf(this, 18));
        this.e = msy.a(lazyThreadSafetyMode, new sje(this, 24));
        this.g = msy.a(lazyThreadSafetyMode, new cwg(this, 15));
    }

    public static boolean b(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() != 1.0f) {
            return false;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return b((View) parent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xqj0 a() {
        return (xqj0) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.ref.WeakReference] */
    public final boolean c(boolean z, boolean z2, boolean z3) {
        if (!z || z2 || !z3) {
            return false;
        }
        v76 v76Var = this.b;
        View privacyButtonView = v76Var.getBottomControlPanel().getPrivacyButtonView();
        if (privacyButtonView == null) {
            return false;
        }
        WeakReference weakReference = new WeakReference(v76Var.b());
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new WeakReference(null);
        return a().i(new j5p(privacyButtonView, v76Var.getRequireContext().getString(R.string.story_privacy_remove_hint_only_me), ref$ObjectRef, weakReference, new ou5(ref$ObjectRef, 2)));
    }

    public final boolean d(Activity activity, boolean z) {
        if (z && activity != null) {
            Rect moreButtonRect = this.b.getSideControlPanel().getMoreButtonRect();
            if (moreButtonRect.height() * moreButtonRect.width() > 0) {
                return a().e(activity, moreButtonRect);
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean e() {
        ?? r0 = this.g;
        psi0 psi0Var = (psi0) r0.getValue();
        u76 presenter = psi0Var.a.getPresenter();
        boolean z = epx.f(presenter != null ? Boolean.valueOf(presenter.I3()) : null, Boolean.TRUE) && psi0Var.b.b();
        if (z) {
            psi0 psi0Var2 = (psi0) r0.getValue();
            psi0Var2.getClass();
            psi0Var2.b.j(new waf0(psi0Var2, 7));
        }
        return z;
    }
}
