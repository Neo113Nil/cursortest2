package xsna;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* compiled from: SnapHorizontalScrollHelper.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class u9k0 {
    public final zfc0 a;
    public final ror b;
    public boolean c;
    public final fot d;

    /* compiled from: SnapHorizontalScrollHelper.kt */
    public static final class a implements f00 {
        public a() {
        }

        @Override // xsna.f00
        public final void a(MotionEvent motionEvent) {
            u9k0.this.d.a(motionEvent);
        }
    }

    /* compiled from: SnapHorizontalScrollHelper.kt */
    public static final class b {
        public b() {
        }

        public final boolean a() {
            Object obj;
            u9k0 u9k0Var = u9k0.this;
            int scrollX = u9k0Var.a.getScrollX();
            Iterator it = rli0.A(new ulp0(new jxt0(u9k0Var.b), new eni0(1))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Number) obj).floatValue() > scrollX) {
                    break;
                }
            }
            Float f = (Float) obj;
            Float valueOf = f != null ? Float.valueOf(f.floatValue() - u9k0Var.a()) : null;
            if (valueOf == null) {
                return false;
            }
            u9k0Var.a.smoothScrollTo((int) valueOf.floatValue(), 0);
            return true;
        }

        public final boolean b() {
            Object obj;
            u9k0 u9k0Var = u9k0.this;
            int scrollX = u9k0Var.a.getScrollX();
            Iterator it = j5g.y0(rli0.A(new ulp0(new jxt0(u9k0Var.b), new h2w(27)))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Number) obj).floatValue() < scrollX) {
                    break;
                }
            }
            Float f = (Float) obj;
            Float valueOf = f != null ? Float.valueOf(f.floatValue() - u9k0Var.a()) : null;
            if (valueOf == null) {
                return false;
            }
            u9k0Var.a.smoothScrollTo((int) valueOf.floatValue(), 0);
            return true;
        }
    }

    public u9k0(zfc0 zfc0Var, ror rorVar) {
        this.a = zfc0Var;
        this.b = rorVar;
        b bVar = new b();
        mot motVar = new mot(rorVar.getContext());
        this.d = new fot(zfc0Var.getContext(), motVar, null);
        zfc0Var.setActionDownListener(new a());
        motVar.c = bVar;
        zfc0Var.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.s9k0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object failure;
                Object obj;
                u9k0 u9k0Var = u9k0.this;
                if (u9k0Var.c) {
                    if (!u9k0Var.d.a.onTouchEvent(motionEvent)) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            zfc0 zfc0Var2 = u9k0Var.a;
                            if (u9k0Var.c) {
                                List A = rli0.A(new ulp0(new jxt0(u9k0Var.b), new byo(26)));
                                int scrollX = zfc0Var2.getScrollX();
                                try {
                                    Iterator it = A.iterator();
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (it.hasNext()) {
                                            float f = scrollX;
                                            float abs = Math.abs(f - ((Number) next).floatValue());
                                            do {
                                                Object next2 = it.next();
                                                float abs2 = Math.abs(f - ((Number) next2).floatValue());
                                                if (Float.compare(abs, abs2) > 0) {
                                                    next = next2;
                                                    abs = abs2;
                                                }
                                            } while (it.hasNext());
                                        }
                                        obj = next;
                                    } else {
                                        obj = null;
                                    }
                                    failure = (Float) obj;
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                Object valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                if (failure instanceof Result.Failure) {
                                    failure = valueOf;
                                }
                                Float f3 = (Float) failure;
                                if (f3 != null) {
                                    f2 = f3.floatValue();
                                }
                                zfc0Var2.smoothScrollTo(Math.max((int) (f2 - u9k0Var.a()), 0), 0);
                            }
                        }
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public final int a() {
        return (iah0.f().widthPixels - this.b.getChildAt(0).getWidth()) / 2;
    }
}
