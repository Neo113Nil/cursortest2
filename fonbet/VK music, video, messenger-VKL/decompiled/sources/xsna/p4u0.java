package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.vlp0;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class p4u0 extends vlp0 {
    private static final String[] sTransitionProperties = {"android:visibility:visibility", "android:visibility:parent"};
    private int mMode;

    /* compiled from: Visibility.java */
    /* loaded from: classes12.dex */
    public static class a extends AnimatorListenerAdapter implements vlp0.i {
        public final View b;
        public final int c;
        public final ViewGroup d;
        public boolean f;
        public boolean g = false;
        public final boolean e = true;

        public a(View view, int i) {
            this.b = view;
            this.c = i;
            this.d = (ViewGroup) view.getParent();
            b(true);
        }

        public final void b(boolean z) {
            ViewGroup viewGroup;
            if (!this.e || this.f == z || (viewGroup = this.d) == null) {
                return;
            }
            this.f = z;
            oxt0.a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.g) {
                y1u0.e(this.c, this.b);
                ViewGroup viewGroup = this.d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            vlp0Var.removeListener(this);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
            b(false);
            if (this.g) {
                return;
            }
            y1u0.e(this.c, this.b);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
            b(true);
            if (this.g) {
                return;
            }
            y1u0.e(0, this.b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                y1u0.e(0, this.b);
                ViewGroup viewGroup = this.d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            if (!this.g) {
                y1u0.e(this.c, this.b);
                ViewGroup viewGroup = this.d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
        }
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes12.dex */
    public class b extends AnimatorListenerAdapter implements vlp0.i {
        public final ViewGroup b;
        public final View c;
        public final View d;
        public boolean e = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.b = viewGroup;
            this.c = view;
            this.d = view2;
        }

        public final void b() {
            this.d.setTag(R.id.save_overlay_view, null);
            this.b.getOverlay().remove(this.c);
            this.e = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.b.getOverlay().remove(this.c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.c;
            if (view.getParent() == null) {
                iut0.a(view, this.b);
            } else {
                p4u0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                View view = this.d;
                View view2 = this.c;
                view.setTag(R.id.save_overlay_view, view2);
                iut0.a(view2, this.b);
                this.e = true;
            }
        }

        @Override // xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
            if (this.e) {
                b();
            }
        }

        @Override // xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            vlp0Var.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            b();
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
        }
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes12.dex */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public p4u0() {
        this.mMode = 3;
    }

    private void captureValues(gnp0 gnp0Var) {
        int visibility = gnp0Var.b.getVisibility();
        HashMap hashMap = gnp0Var.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = gnp0Var.b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private c getVisibilityChangeInfo(gnp0 gnp0Var, gnp0 gnp0Var2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (gnp0Var != null) {
            HashMap hashMap = gnp0Var.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                cVar.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                cVar.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (gnp0Var2 != null) {
                    HashMap hashMap2 = gnp0Var2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        cVar.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        cVar.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (gnp0Var == null && gnp0Var2 != null) {
                            int i = cVar.c;
                            int i2 = cVar.d;
                            if (i != i2 || cVar.e != cVar.f) {
                                if (i != i2) {
                                    if (i == 0) {
                                        cVar.b = false;
                                        cVar.a = true;
                                        return cVar;
                                    }
                                    if (i2 == 0) {
                                        cVar.b = true;
                                        cVar.a = true;
                                        return cVar;
                                    }
                                } else {
                                    if (cVar.f == null) {
                                        cVar.b = false;
                                        cVar.a = true;
                                        return cVar;
                                    }
                                    if (cVar.e == null) {
                                        cVar.b = true;
                                        cVar.a = true;
                                        return cVar;
                                    }
                                }
                            }
                        } else {
                            if (gnp0Var != null && cVar.d == 0) {
                                cVar.b = true;
                                cVar.a = true;
                                return cVar;
                            }
                            if (gnp0Var2 == null && cVar.c == 0) {
                                cVar.b = false;
                                cVar.a = true;
                            }
                        }
                        return cVar;
                    }
                }
                cVar.d = -1;
                cVar.f = null;
                if (gnp0Var == null) {
                }
                if (gnp0Var != null) {
                }
                if (gnp0Var2 == null) {
                    cVar.b = false;
                    cVar.a = true;
                }
                return cVar;
            }
        }
        cVar.c = -1;
        cVar.e = null;
        if (gnp0Var2 != null) {
        }
        cVar.d = -1;
        cVar.f = null;
        if (gnp0Var == null) {
        }
        if (gnp0Var != null) {
        }
        if (gnp0Var2 == null) {
        }
        return cVar;
    }

    @Override // xsna.vlp0
    public void captureEndValues(gnp0 gnp0Var) {
        captureValues(gnp0Var);
    }

    @Override // xsna.vlp0
    public void captureStartValues(gnp0 gnp0Var) {
        captureValues(gnp0Var);
    }

    @Override // xsna.vlp0
    public Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        c visibilityChangeInfo = getVisibilityChangeInfo(gnp0Var, gnp0Var2);
        if (!visibilityChangeInfo.a) {
            return null;
        }
        if (visibilityChangeInfo.e == null && visibilityChangeInfo.f == null) {
            return null;
        }
        return visibilityChangeInfo.b ? onAppear(viewGroup, gnp0Var, visibilityChangeInfo.c, gnp0Var2, visibilityChangeInfo.d) : onDisappear(viewGroup, gnp0Var, visibilityChangeInfo.c, gnp0Var2, visibilityChangeInfo.d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // xsna.vlp0
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // xsna.vlp0
    public boolean isTransitionRequired(gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null && gnp0Var2 == null) {
            return false;
        }
        if (gnp0Var != null && gnp0Var2 != null && gnp0Var2.a.containsKey("android:visibility:visibility") != gnp0Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c visibilityChangeInfo = getVisibilityChangeInfo(gnp0Var, gnp0Var2);
        if (visibilityChangeInfo.a) {
            return visibilityChangeInfo.c == 0 || visibilityChangeInfo.d == 0;
        }
        return false;
    }

    public Animator onAppear(ViewGroup viewGroup, gnp0 gnp0Var, int i, gnp0 gnp0Var2, int i2) {
        if ((this.mMode & 1) != 1 || gnp0Var2 == null) {
            return null;
        }
        View view = gnp0Var2.b;
        if (gnp0Var == null) {
            View view2 = (View) view.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view2, false), getTransitionValues(view2, false)).a) {
                return null;
            }
        }
        return onAppear(viewGroup, view, gnp0Var, gnp0Var2);
    }

    public abstract Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2);

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        if (r10.mCanRemoveViews != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator onDisappear(ViewGroup viewGroup, gnp0 gnp0Var, int i, gnp0 gnp0Var2, int i2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        if ((this.mMode & 2) == 2 && gnp0Var != null) {
            View view3 = gnp0Var.b;
            View view4 = gnp0Var2 != null ? gnp0Var2.b : null;
            View view5 = (View) view3.getTag(R.id.save_overlay_view);
            if (view5 != null) {
                view2 = null;
                z2 = true;
            } else if (view4 == null || view4.getParent() == null) {
                if (view4 != null) {
                    view = null;
                    z = false;
                    if (z) {
                        if (view3.getParent() != null) {
                            if (view3.getParent() instanceof View) {
                                View view6 = (View) view3.getParent();
                                if (getVisibilityChangeInfo(getTransitionValues(view6, true), getMatchedTransitionValues(view6, true)).a) {
                                    int id = view6.getId();
                                    if (view6.getParent() == null) {
                                        if (id != -1) {
                                            if (viewGroup.findViewById(id) != null) {
                                            }
                                        }
                                    }
                                } else {
                                    view4 = enp0.a(viewGroup, view3, view6);
                                }
                            }
                        }
                        view2 = view;
                        z2 = false;
                        view5 = view3;
                    }
                    View view7 = view;
                    view5 = view4;
                    view2 = view7;
                    z2 = false;
                }
                view4 = null;
                view = null;
                z = true;
                if (z) {
                }
                View view72 = view;
                view5 = view4;
                view2 = view72;
                z2 = false;
            } else {
                if (i2 == 4 || view3 == view4) {
                    view = view4;
                    z = false;
                    view4 = null;
                    if (z) {
                    }
                    View view722 = view;
                    view5 = view4;
                    view2 = view722;
                    z2 = false;
                }
                view4 = null;
                view = null;
                z = true;
                if (z) {
                }
                View view7222 = view;
                view5 = view4;
                view2 = view7222;
                z2 = false;
            }
            if (view5 != null) {
                if (!z2) {
                    int[] iArr = (int[]) gnp0Var.a.get("android:visibility:screenLocation");
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view5.offsetLeftAndRight((i3 - iArr2[0]) - view5.getLeft());
                    view5.offsetTopAndBottom((i4 - iArr2[1]) - view5.getTop());
                    iut0.a(view5, viewGroup);
                }
                Animator onDisappear = onDisappear(viewGroup, view5, gnp0Var, gnp0Var2);
                if (!z2) {
                    if (onDisappear == null) {
                        viewGroup.getOverlay().remove(view5);
                        return onDisappear;
                    }
                    view3.setTag(R.id.save_overlay_view, view5);
                    b bVar = new b(viewGroup, view5, view3);
                    onDisappear.addListener(bVar);
                    onDisappear.addPauseListener(bVar);
                    getRootTransition().addListener(bVar);
                }
                return onDisappear;
            }
            if (view2 != null) {
                int visibility = view2.getVisibility();
                y1u0.e(0, view2);
                Animator onDisappear2 = onDisappear(viewGroup, view2, gnp0Var, gnp0Var2);
                if (onDisappear2 == null) {
                    y1u0.e(visibility, view2);
                    return onDisappear2;
                }
                a aVar = new a(view2, i2);
                onDisappear2.addListener(aVar);
                getRootTransition().addListener(aVar);
                return onDisappear2;
            }
        }
        return null;
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    public p4u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jtm0.d);
        int f = ytp0.f(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (f != 0) {
            setMode(f);
        }
    }

    public Animator onAppear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        return null;
    }
}
