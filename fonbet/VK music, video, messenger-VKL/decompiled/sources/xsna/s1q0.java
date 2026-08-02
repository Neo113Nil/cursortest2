package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import java.util.Stack;

/* compiled from: UiTrackingPagerAdapter.kt */
/* loaded from: classes.dex */
public abstract class s1q0 extends PagerAdapter implements m0q0 {
    public Object b;
    public boolean d;
    public final tzb0 c = new tzb0();
    public final a e = new a();

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        tzb0 tzb0Var = this.c;
        int indexOf = tzb0Var.a.indexOf(Integer.valueOf(i));
        if (indexOf != -1) {
            tzb0Var.a.remove(indexOf).intValue();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (epx.f(this.b, obj) || this.d) {
            return;
        }
        tzb0 tzb0Var = this.c;
        boolean a2 = tzb0Var.a(i);
        Stack<Integer> stack = tzb0Var.a;
        if (tzb0Var.a(i)) {
            stack.push(Integer.valueOf(i));
        } else {
            stack.pop();
        }
        if (obj instanceof Fragment) {
            l1q0 l1q0Var = UiTracker.i;
            Object obj2 = this.b;
            l1q0Var.i(obj2 instanceof Fragment ? (Fragment) obj2 : null, (Fragment) obj, a2);
        } else if (obj instanceof View) {
            l1q0 l1q0Var2 = UiTracker.i;
            Object obj3 = this.b;
            l1q0Var2.l(obj3 instanceof View ? (View) obj3 : null, (View) obj, a2);
        } else if (obj instanceof m0q0) {
            l1q0 l1q0Var3 = UiTracker.i;
            Object obj4 = this.b;
            l1q0Var3.k(obj4 instanceof m0q0 ? (m0q0) obj4 : null, (m0q0) obj, a2);
        }
        this.b = obj;
    }

    /* compiled from: UiTrackingPagerAdapter.kt */
    public static final class a implements obs {
        public a() {
        }

        @Override // xsna.obs
        public final void onResume() {
            s1q0 s1q0Var = s1q0.this;
            Object obj = s1q0Var.b;
            if (s1q0Var.d || !(obj instanceof m0q0)) {
                return;
            }
            UiTracker uiTracker = UiTracker.a;
            l1q0 l1q0Var = UiTracker.i;
            l1q0Var.c = true;
            l1q0Var.k(null, (m0q0) obj, false);
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroy() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onPause() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }

    @Override // xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
    }
}
