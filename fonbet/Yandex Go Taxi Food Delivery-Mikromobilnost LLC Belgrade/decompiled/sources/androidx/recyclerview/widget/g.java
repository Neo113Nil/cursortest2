package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import defpackage.ndh;
import defpackage.odh;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ h c;

    public /* synthetic */ g(h hVar, ArrayList arrayList, int i) {
        this.a = i;
        this.c = hVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final h hVar = this.c;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    final h hVar2 = this.c;
                    if (!hasNext) {
                        arrayList.clear();
                        hVar2.m.remove(arrayList);
                        break;
                    } else {
                        odh odhVar = (odh) it.next();
                        final x0 x0Var = odhVar.a;
                        int i2 = odhVar.b;
                        int i3 = odhVar.c;
                        int i4 = odhVar.d;
                        int i5 = odhVar.e;
                        final View view = x0Var.a;
                        final int i6 = i4 - i2;
                        final int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        final ViewPropertyAnimator animate = view.animate();
                        hVar2.p.add(x0Var);
                        animate.setDuration(hVar2.e).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator$6
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationCancel(Animator animator) {
                                if (i6 != 0) {
                                    view.setTranslationX(0.0f);
                                }
                                if (i7 != 0) {
                                    view.setTranslationY(0.0f);
                                }
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                animate.setListener(null);
                                h.this.h(x0Var);
                                h.this.p.remove(x0Var);
                                h.this.v();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                h.this.getClass();
                            }
                        }).start();
                    }
                }
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    final ndh ndhVar = (ndh) it2.next();
                    ArrayList arrayList2 = hVar.r;
                    x0 x0Var2 = ndhVar.a;
                    final View view2 = x0Var2 == null ? null : x0Var2.a;
                    x0 x0Var3 = ndhVar.b;
                    final View view3 = x0Var3 != null ? x0Var3.a : null;
                    if (view2 != null) {
                        final ViewPropertyAnimator duration = view2.animate().setDuration(hVar.f);
                        arrayList2.add(ndhVar.a);
                        duration.translationX(ndhVar.e - ndhVar.c);
                        duration.translationY(ndhVar.f - ndhVar.d);
                        duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator$7
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                duration.setListener(null);
                                view2.setAlpha(1.0f);
                                view2.setTranslationX(0.0f);
                                view2.setTranslationY(0.0f);
                                h.this.h(ndhVar.a);
                                h.this.r.remove(ndhVar.a);
                                h.this.v();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                h hVar3 = h.this;
                                x0 x0Var4 = ndhVar.a;
                                hVar3.getClass();
                            }
                        }).start();
                    }
                    if (view3 != null) {
                        final ViewPropertyAnimator animate2 = view3.animate();
                        arrayList2.add(ndhVar.b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(hVar.f).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator$8
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                animate2.setListener(null);
                                view3.setAlpha(1.0f);
                                view3.setTranslationX(0.0f);
                                view3.setTranslationY(0.0f);
                                h.this.h(ndhVar.b);
                                h.this.r.remove(ndhVar.b);
                                h.this.v();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                h hVar3 = h.this;
                                x0 x0Var4 = ndhVar.b;
                                hVar3.getClass();
                            }
                        }).start();
                    }
                }
                arrayList.clear();
                hVar.n.remove(arrayList);
                break;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    final x0 x0Var4 = (x0) it3.next();
                    final View view4 = x0Var4.a;
                    final ViewPropertyAnimator animate3 = view4.animate();
                    hVar.o.add(x0Var4);
                    animate3.alpha(1.0f).setDuration(hVar.l()).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator$5
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            view4.setAlpha(1.0f);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            animate3.setListener(null);
                            h.this.s(x0Var4);
                            h.this.o.remove(x0Var4);
                            h.this.v();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            h.this.getClass();
                        }
                    }).start();
                }
                arrayList.clear();
                hVar.l.remove(arrayList);
                break;
        }
    }
}
