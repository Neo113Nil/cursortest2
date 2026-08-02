package xsna;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Property;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.BaseFragment;
import com.vk.log.L;
import com.vkontakte.android.VKActivity;
import java.lang.reflect.Field;
import java.util.HashMap;
import xsna.g40;

/* compiled from: ViewUtils.java */
/* loaded from: classes7.dex */
public final class u1u0 {
    public static final int[] a = {R.attr.textColorSecondary};
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final HashMap<View, ObjectAnimator> c = new HashMap<>();

    /* compiled from: ViewUtils.java */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public a(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b.setVisibility(this.c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.c;
            View view = this.b;
            view.setVisibility(i);
            u1u0.c.remove(view);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.b.setVisibility(this.c);
        }
    }

    public static void a(@Nullable SubMenu subMenu, int i) {
        if (subMenu != null) {
            for (int i2 = 0; i2 < subMenu.size(); i2++) {
                MenuItem item = subMenu.getItem(i2);
                if (item != null) {
                    Drawable icon = item.getIcon();
                    SubMenu subMenu2 = item.getSubMenu();
                    if (icon != null) {
                        icon.mutate().setColorFilter(i, PorterDuff.Mode.SRC_IN);
                    }
                    if (subMenu2 != null) {
                        a(subMenu2, i);
                    }
                }
            }
        }
    }

    public static void b(@Nullable Dialog dialog) {
        if (dialog == null) {
            return;
        }
        pro0.e(new qc9(dialog, 12));
    }

    public static void c(VKActivity vKActivity, g40 g40Var) {
        if (g40Var instanceof xok0) {
            try {
                Field declaredField = g40Var.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(g40Var);
                Field declaredField2 = obj.getClass().getDeclaredField("mWrapped");
                declaredField2.setAccessible(true);
                g40.a aVar = (g40.a) declaredField2.get(obj);
                Field declaredField3 = AppCompatActivity.class.getDeclaredField("mDelegate");
                declaredField3.setAccessible(true);
                declaredField.set(g40Var, new s1u0(aVar, declaredField3.get(vKActivity)));
            } catch (Exception e) {
                L.g("error ", e);
            }
        }
    }

    public static void d(@NonNull BaseFragment baseFragment, @Nullable Toolbar toolbar) {
        if (toolbar != null) {
            try {
                toolbar.getMenu().clear();
            } catch (Throwable unused) {
                Log.e("AppKit", "error invalidateToolbarMenu");
                return;
            }
        }
        baseFragment.onCreateOptionsMenu(toolbar.getMenu(), baseFragment.getActivity().getMenuInflater());
    }

    public static void e(Runnable runnable) {
        b.post(runnable);
    }

    public static void f(long j, Runnable runnable) {
        b.postDelayed(runnable, j);
    }

    public static void g(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                    g(viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void h(@Nullable Window window, int i) {
        if (window == null) {
            return;
        }
        try {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        } catch (Exception unused) {
        }
    }

    public static void i(@Nullable TextView textView, Object obj, boolean z) {
        if (textView == null) {
            return;
        }
        if (obj instanceof Integer) {
            textView.setText(((Integer) obj).intValue());
        } else {
            textView.setText((CharSequence) obj);
        }
        if (z) {
            textView.setVisibility(textView.getText().length() == 0 ? 8 : 0);
        }
    }

    public static void j(@Nullable Toolbar toolbar, int i) {
        k(toolbar, i, com.vkontakte.android.R.string.accessibility_back);
    }

    public static void k(@Nullable Toolbar toolbar, int i, int i2) {
        if (toolbar != null) {
            toolbar.setNavigationIcon(i);
            if (!dhr0.a.V(toolbar)) {
                l(toolbar, m33.a(i, toolbar.getContext()));
            }
            toolbar.setNavigationContentDescription(i2);
        }
    }

    public static void l(@Nullable Toolbar toolbar, @Nullable Drawable drawable) {
        if (toolbar != null) {
            TypedArray obtainStyledAttributes = toolbar.getContext().getTheme().obtainStyledAttributes(a);
            try {
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList == null || drawable == null) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon(new baf0(drawable, colorStateList));
                }
                dhr0.a.V(toolbar);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public static void m(int i, @Nullable View view) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void n(int i, View view) {
        if (view == null) {
            return;
        }
        boolean z = i == 0;
        if (z == (view.getVisibility() == 0 && view.getTag(com.vkontakte.android.R.id.tag_visibility_anim) == null)) {
            return;
        }
        HashMap<View, ObjectAnimator> hashMap = c;
        if (hashMap.containsKey(view)) {
            hashMap.get(view).cancel();
            hashMap.remove(view);
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.addListener(new b(view, i));
            view.setTag(com.vkontakte.android.R.id.tag_visibility_anim, Boolean.TRUE);
            ofFloat.setDuration(300L);
            hashMap.put(view, ofFloat);
            ofFloat.start();
            return;
        }
        Property property = View.ALPHA;
        if (view.getAlpha() < 1.0f) {
            f = view.getAlpha();
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, 1.0f);
        ofFloat2.addListener(new a(view, i));
        ofFloat2.setDuration(300L);
        hashMap.put(view, ofFloat2);
        ofFloat2.start();
    }

    public static void o(@Nullable Dialog dialog) {
        if (dialog != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = b;
            if (myLooper != handler.getLooper()) {
                handler.post(new xq3(dialog, 16));
                return;
            }
            try {
                dialog.show();
            } catch (Exception e) {
                L.i(e);
            }
        }
    }

    /* compiled from: ViewUtils.java */
    public class b extends AnimatorListenerAdapter {
        public boolean b = false;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;

        public b(View view, int i) {
            this.c = view;
            this.d = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.c;
            view.setTag(com.vkontakte.android.R.id.tag_visibility_anim, null);
            u1u0.c.remove(view);
            if (this.b) {
                return;
            }
            view.setVisibility(this.d);
            view.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
