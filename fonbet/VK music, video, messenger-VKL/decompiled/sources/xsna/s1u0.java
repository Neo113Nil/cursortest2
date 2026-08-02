package xsna;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import xsna.g40;

/* compiled from: ViewUtils.java */
/* loaded from: classes7.dex */
public final class s1u0 implements g40.a {
    public final /* synthetic */ g40.a a;
    public final /* synthetic */ Object b;

    /* compiled from: ViewUtils.java */
    public class a extends f0u0 {
        public final /* synthetic */ ActionBarContextView a;
        public final /* synthetic */ PopupWindow b;
        public final /* synthetic */ b0u0 c;
        public final /* synthetic */ Field d;
        public final /* synthetic */ g40 e;
        public final /* synthetic */ g23 f;
        public final /* synthetic */ g40 g;
        public final /* synthetic */ Field h;

        public a(ActionBarContextView actionBarContextView, PopupWindow popupWindow, b0u0 b0u0Var, Field field, g40 g40Var, g23 g23Var, g40 g40Var2, Field field2) {
            this.a = actionBarContextView;
            this.b = popupWindow;
            this.c = b0u0Var;
            this.d = field;
            this.e = g40Var;
            this.f = g23Var;
            this.g = g40Var2;
            this.h = field2;
        }

        @Override // xsna.e0u0
        public final void b() {
            s1u0 s1u0Var = s1u0.this;
            Object obj = s1u0Var.b;
            ActionBarContextView actionBarContextView = this.a;
            actionBarContextView.setVisibility(8);
            PopupWindow popupWindow = this.b;
            if (popupWindow != null) {
                popupWindow.dismiss();
            } else if (actionBarContextView.getParent() instanceof View) {
                View view = (View) actionBarContextView.getParent();
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.requestApplyInsets();
            }
            actionBarContextView.removeAllViews();
            this.c.d(null);
            try {
                Field field = this.d;
                if (field != null) {
                    field.set(obj, null);
                }
            } catch (IllegalAccessException e) {
                L.g("error ", e);
            }
            s1u0Var.a.d(this.e);
            g23 g23Var = this.f;
            if (g23Var != null) {
                g23Var.onSupportActionModeFinished(this.g);
            }
            try {
                Field field2 = this.h;
                if (field2 != null) {
                    field2.set(obj, null);
                }
            } catch (IllegalAccessException e2) {
                L.g("error ", e2);
            }
        }
    }

    public s1u0(g40.a aVar, Object obj) {
        this.a = aVar;
        this.b = obj;
    }

    @Override // xsna.g40.a
    public final boolean a(g40 g40Var, MenuItem menuItem) {
        return this.a.a(g40Var, menuItem);
    }

    @Override // xsna.g40.a
    public final boolean b(g40 g40Var, Menu menu) {
        return this.a.b(g40Var, menu);
    }

    @Override // xsna.g40.a
    public final boolean c(g40 g40Var, Menu menu) {
        return this.a.c(g40Var, menu);
    }

    @Override // xsna.g40.a
    public final void d(g40 g40Var) {
        ActionBarContextView actionBarContextView;
        g40 g40Var2;
        PopupWindow popupWindow;
        Object obj = this.b;
        Class<?> superclass = obj.getClass().getSuperclass();
        Window window = null;
        PopupWindow popupWindow2 = null;
        Runnable runnable = null;
        ActionBarContextView actionBarContextView2 = null;
        g23 g23Var = null;
        b0u0 b0u0Var = null;
        Field field = null;
        Field field2 = null;
        while (true) {
            if (superclass == null) {
                actionBarContextView = actionBarContextView2;
                g40Var2 = null;
                popupWindow = popupWindow2;
                break;
            }
            try {
            } catch (Exception e) {
                e = e;
            }
            if (TextUtils.equals("AppCompatDelegate", superclass.getSimpleName())) {
                superclass = obj.getClass();
                Field declaredField = superclass.getDeclaredField("mActionModePopup");
                declaredField.setAccessible(true);
                PopupWindow popupWindow3 = (PopupWindow) declaredField.get(obj);
                try {
                    Field declaredField2 = superclass.getDeclaredField("mShowActionModePopup");
                    declaredField2.setAccessible(true);
                    Runnable runnable2 = (Runnable) declaredField2.get(obj);
                    try {
                        Field declaredField3 = superclass.getDeclaredField("mActionModeView");
                        declaredField3.setAccessible(true);
                        ActionBarContextView actionBarContextView3 = (ActionBarContextView) declaredField3.get(obj);
                        try {
                            field = superclass.getDeclaredField("mFadeAnim");
                            field.setAccessible(true);
                            b0u0 b0u0Var2 = (b0u0) field.get(obj);
                            try {
                                field2 = superclass.getDeclaredField("mActionMode");
                                field2.setAccessible(true);
                                g40 g40Var3 = (g40) field2.get(obj);
                                actionBarContextView = actionBarContextView3;
                                b0u0Var = b0u0Var2;
                                popupWindow = popupWindow3;
                                g40Var2 = g40Var3;
                                runnable = runnable2;
                                break;
                            } catch (Exception e2) {
                                e = e2;
                                b0u0Var = b0u0Var2;
                                actionBarContextView2 = actionBarContextView3;
                                runnable = runnable2;
                                popupWindow2 = popupWindow3;
                                L.g("can't get fields ", e);
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } else {
                if (TextUtils.equals("AppCompatDelegateImplBase", superclass.getSimpleName())) {
                    Field declaredField4 = superclass.getDeclaredField("mAppCompatCallback");
                    declaredField4.setAccessible(true);
                    g23 g23Var2 = (g23) declaredField4.get(obj);
                    try {
                        Field declaredField5 = superclass.getDeclaredField("mWindow");
                        declaredField5.setAccessible(true);
                        window = (Window) declaredField5.get(obj);
                        g23Var = g23Var2;
                    } catch (Exception e6) {
                        e = e6;
                        g23Var = g23Var2;
                    }
                }
                superclass = superclass.getSuperclass();
            }
            L.g("can't get fields ", e);
        }
        if (popupWindow != null) {
            window.getDecorView().removeCallbacks(runnable);
        }
        if (actionBarContextView != null) {
            if (b0u0Var != null) {
                b0u0Var.b();
            }
            b0u0 b = iut0.b(actionBarContextView);
            b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            b.d(new a(actionBarContextView, popupWindow, b, field, g40Var, g23Var, g40Var2, field2));
        }
    }
}
