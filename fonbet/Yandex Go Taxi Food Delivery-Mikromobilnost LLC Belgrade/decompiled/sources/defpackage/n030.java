package defpackage;

import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class n030 extends jq31 {
    public final /* synthetic */ ModalViewBehavior a;

    public n030(ModalViewBehavior modalViewBehavior) {
        this.a = modalViewBehavior;
    }

    @Override // defpackage.jq31
    public final int a(View view) {
        return view.getLeft();
    }

    @Override // defpackage.jq31
    public final int b(int i) {
        ModalViewBehavior modalViewBehavior = this.a;
        return sb2.k(i, modalViewBehavior.z(), modalViewBehavior.Q ? modalViewBehavior.f0 : modalViewBehavior.O);
    }

    @Override // defpackage.jq31
    public final int c() {
        ModalViewBehavior modalViewBehavior = this.a;
        return modalViewBehavior.Q ? modalViewBehavior.f0 : modalViewBehavior.O;
    }

    @Override // defpackage.jq31
    public final void d(int i) {
        if (i == 1) {
            ModalViewBehavior modalViewBehavior = this.a;
            if (modalViewBehavior.V) {
                modalViewBehavior.D(1);
            }
        }
    }

    @Override // defpackage.jq31
    public final void e(int i) {
        this.a.w(i);
    }

    @Override // defpackage.jq31
    public final void f(View view, float f, float f2) {
        int i;
        int i2 = 6;
        ModalViewBehavior modalViewBehavior = this.a;
        if (f2 < 0.0f) {
            if (modalViewBehavior.b) {
                i = modalViewBehavior.L;
            } else {
                int top = view.getTop();
                int i3 = modalViewBehavior.M;
                if (top > i3) {
                    i = i3;
                } else {
                    i = modalViewBehavior.K;
                }
            }
            i2 = 3;
        } else if (modalViewBehavior.Q && modalViewBehavior.F(f2, view)) {
            if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                if (view.getTop() <= (modalViewBehavior.z() + modalViewBehavior.f0) / 2) {
                    if (modalViewBehavior.b) {
                        i = modalViewBehavior.L;
                    } else if (Math.abs(view.getTop() - modalViewBehavior.K) < Math.abs(view.getTop() - modalViewBehavior.M)) {
                        i = modalViewBehavior.K;
                    } else {
                        i = modalViewBehavior.M;
                    }
                    i2 = 3;
                }
            }
            i = modalViewBehavior.f0;
            i2 = 5;
        } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
            int top2 = view.getTop();
            if (!modalViewBehavior.b) {
                int i4 = modalViewBehavior.M;
                int i5 = modalViewBehavior.O;
                if (top2 < i4) {
                    if (top2 < Math.abs(top2 - i5)) {
                        i = modalViewBehavior.K;
                        i2 = 3;
                    } else {
                        i = modalViewBehavior.M;
                    }
                } else if (Math.abs(top2 - i4) < Math.abs(top2 - i5)) {
                    i = modalViewBehavior.M;
                } else {
                    i = modalViewBehavior.O;
                    i2 = 4;
                }
            } else if (Math.abs(top2 - modalViewBehavior.L) < Math.abs(top2 - modalViewBehavior.O)) {
                i = modalViewBehavior.L;
                i2 = 3;
            } else {
                i = modalViewBehavior.O;
                i2 = 4;
            }
        } else {
            if (modalViewBehavior.b) {
                i = modalViewBehavior.O;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - modalViewBehavior.M) < Math.abs(top3 - modalViewBehavior.O)) {
                    i = modalViewBehavior.M;
                } else {
                    i = modalViewBehavior.O;
                }
            }
            i2 = 4;
        }
        modalViewBehavior.G(view, i2, i, true);
    }

    @Override // defpackage.jq31
    public final boolean g(int i, View view) {
        ModalViewBehavior modalViewBehavior = this.a;
        int i2 = modalViewBehavior.W;
        if (i2 == 1 || modalViewBehavior.p0) {
            return false;
        }
        if (i2 == 3 && modalViewBehavior.k0 == i) {
            WeakReference weakReference = modalViewBehavior.h0;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = modalViewBehavior.g0;
        return weakReference2 != null && weakReference2.get() == view;
    }
}
