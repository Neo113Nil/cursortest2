package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.rwl0;
import xsna.uwl0;

/* compiled from: AbsStoryActionVH.kt */
/* loaded from: classes6.dex */
public abstract class cc<T extends uwl0> extends y4h0 {
    public final rwl0.a n;
    public uwl0 o;

    public cc(View view, rwl0.a aVar) {
        super(view, aVar);
        this.n = aVar;
    }

    public static void j6(View view, Integer num) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = num != null ? num.intValue() : -2;
        view.setLayoutParams(layoutParams);
    }

    public abstract void b6(T t);

    public void g6(uwl0.a aVar) {
        this.itemView.setAlpha(aVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h6(uwl0 uwl0Var) {
        this.o = uwl0Var;
        b6(uwl0Var);
        r6m.a.getClass();
        boolean l = r6m.l();
        this.itemView.setImportantForAccessibility(l ? 1 : 2);
        this.itemView.setFocusable(l);
        this.itemView.setClickable(l);
        boolean z = uwl0Var instanceof uwl0.a;
        if (z) {
            final uwl0.a aVar = (uwl0.a) uwl0Var;
            if (aVar.c()) {
                if (l) {
                    this.itemView.setOnClickListener(new bc(this, 0));
                    return;
                }
                if (z) {
                    this.itemView.setAlpha(aVar.a);
                    final Ref$LongRef ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = -1L;
                    final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    final v4h0 v4h0Var = new v4h0(this, aVar, new wm80(ref$BooleanRef, 16), 0);
                    this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.u4h0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Animation animation;
                            cc ccVar = cc.this;
                            x4h0 x4h0Var = ccVar.m;
                            v2d0 v2d0Var = ccVar.l;
                            boolean m = mnh0.m(motionEvent);
                            Ref$LongRef ref$LongRef2 = ref$LongRef;
                            uwl0.a aVar2 = aVar;
                            Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                            v4h0 v4h0Var2 = v4h0Var;
                            if (m) {
                                ccVar.itemView.getParent().requestDisallowInterceptTouchEvent(true);
                                ref$LongRef2.element = System.currentTimeMillis();
                                if ((aVar2 instanceof uwl0.a.AbstractC3841a.C3842a) || (aVar2 instanceof uwl0.a.AbstractC3841a.e)) {
                                    dzl0.a(view, 1.0f, 0.75f);
                                    v2d0Var.c(true);
                                }
                                ViewParent parent = ccVar.itemView.getParent();
                                RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                                if (recyclerView != null) {
                                    recyclerView.addOnItemTouchListener(x4h0Var);
                                }
                                if (ref$BooleanRef2.element) {
                                    return true;
                                }
                                ccVar.itemView.postDelayed(v4h0Var2, ViewConfiguration.getLongPressTimeout());
                                return true;
                            }
                            if (mnh0.q(motionEvent)) {
                                long j = ref$LongRef2.element;
                                if ((aVar2 instanceof uwl0.a.AbstractC3841a.C3842a) || (aVar2 instanceof uwl0.a.AbstractC3841a.e)) {
                                    ccVar.a6(view, true);
                                }
                                if (j <= 0 || System.currentTimeMillis() - j > ViewConfiguration.getLongPressTimeout()) {
                                    ccVar.V5(motionEvent);
                                } else {
                                    ccVar.itemView.removeCallbacks(v4h0Var2);
                                    ccVar.i6();
                                    ViewParent parent2 = ccVar.itemView.getParent();
                                    RecyclerView recyclerView2 = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
                                    if (recyclerView2 != null) {
                                        recyclerView2.removeOnItemTouchListener(x4h0Var);
                                    }
                                }
                                ref$BooleanRef2.element = false;
                                ref$LongRef2.element = -1L;
                                ccVar.itemView.getParent().requestDisallowInterceptTouchEvent(false);
                                return true;
                            }
                            if (motionEvent.getAction() != 3) {
                                if (mnh0.o(motionEvent) && v2d0Var.f().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                                    ccVar.V5(motionEvent);
                                    return true;
                                }
                                if (!mnh0.o(motionEvent) || v2d0Var.f().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                                    return true;
                                }
                                if (view.getScaleX() != 1.0f && (ccVar.itemView.getAnimation() == null || ((animation = ccVar.itemView.getAnimation()) != null && animation.hasEnded()))) {
                                    dzl0.a(view, 0.75f, 1.0f);
                                }
                                v2d0Var.d().onTouchEvent(motionEvent);
                                return false;
                            }
                            long j2 = ref$LongRef2.element;
                            if (j2 <= 0 || System.currentTimeMillis() - j2 > ViewConfiguration.getLongPressTimeout()) {
                                if ((aVar2 instanceof uwl0.a.AbstractC3841a.C3842a) || (aVar2 instanceof uwl0.a.AbstractC3841a.e)) {
                                    ccVar.a6(view, true);
                                }
                                ccVar.V5(motionEvent);
                            } else {
                                ccVar.itemView.removeCallbacks(v4h0Var2);
                                if ((aVar2 instanceof uwl0.a.AbstractC3841a.C3842a) || (aVar2 instanceof uwl0.a.AbstractC3841a.e)) {
                                    ccVar.a6(view, true);
                                }
                                ViewParent parent3 = ccVar.itemView.getParent();
                                RecyclerView recyclerView3 = parent3 instanceof RecyclerView ? (RecyclerView) parent3 : null;
                                if (recyclerView3 != null) {
                                    recyclerView3.removeOnItemTouchListener(x4h0Var);
                                }
                            }
                            ref$LongRef2.element = -1L;
                            ref$BooleanRef2.element = false;
                            if (ccVar.itemView.getParent() == null) {
                                return true;
                            }
                            ccVar.itemView.getParent().requestDisallowInterceptTouchEvent(false);
                            return true;
                        }
                    });
                }
            }
        }
    }

    public void i6() {
        this.itemView.performHapticFeedback(0);
        uwl0 uwl0Var = this.o;
        if (uwl0Var == null) {
            uwl0Var = null;
        }
        this.n.a(uwl0Var);
    }
}
