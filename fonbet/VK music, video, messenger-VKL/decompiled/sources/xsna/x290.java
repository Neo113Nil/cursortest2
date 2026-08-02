package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity;
import com.vk.overlaymenu.launcher.OverlayMenuActivity;
import com.vk.overlaymenu.utils.ObservableArrayList;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: OverlayMenuManagerImpl.kt */
/* loaded from: classes4.dex */
public final class x290 implements w290 {
    public static int c;
    public static boolean e;
    public static boolean g;
    public static Application h;
    public static y290 j;
    public static l370 k;
    public static final x290 a = new x290();
    public static yzs<? super Activity, ? super Integer, ? super Fragment, Boolean> b = new yi4(8);
    public static final Handler d = new Handler(Looper.getMainLooper());

    @SuppressLint({"StaticFieldLeak"})
    public static final err f = new err(new y84(17));
    public static v290 i = new v290();
    public static WeakReference<Activity> l = new WeakReference<>(null);
    public static final a m = new a();
    public static final b n = new b();
    public static final aa0 o = new aa0(new svz(16), new azt(14));

    /* compiled from: OverlayMenuManagerImpl.kt */
    public static final class b extends FragmentManager.m {
        @Override // androidx.fragment.app.FragmentManager.m
        public final void e(Fragment fragment) {
            x290.a.update(false);
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void g(Fragment fragment) {
            FragmentActivity activity = fragment.getActivity();
            if (activity == null) {
                return;
            }
            x290 x290Var = x290.a;
            if (activity.isInPictureInPictureMode() || (activity instanceof OverlayMenuActivity) || (activity instanceof ScreenshotEditorActivity)) {
                return;
            }
            if (!(fragment instanceof androidx.fragment.app.d) || x290.e) {
                x290Var.update(false);
            } else {
                x290Var.update(true);
            }
        }
    }

    public static Activity b() {
        return l.get();
    }

    public static void c(Application application) {
        try {
            WindowManager windowManager = (WindowManager) application.getSystemService(WindowManager.class);
            Field declaredField = windowManager.getClass().getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(windowManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mViews");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new ObservableArrayList((List) declaredField2.get(obj), new y8m(20)));
            e = true;
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.w290
    public final synchronized void a(Application application, b4j0 b4j0Var, y290 y290Var, l370 l370Var, Activity activity) {
        if (g) {
            return;
        }
        g = true;
        b = b4j0Var;
        k = l370Var;
        j = y290Var;
        h = application;
        c = (activity == 0 ? application : activity).getResources().getConfiguration().orientation;
        application.registerComponentCallbacks(m);
        application.registerActivityLifecycleCallbacks(o);
        c(application);
        if (activity != 0) {
            e(activity);
        }
    }

    public final void d(Configuration configuration) {
        int i2 = configuration.smallestScreenWidthDp;
        if (i2 <= 0 || i2 >= 150) {
            int i3 = c;
            int i4 = configuration.orientation;
            boolean z = i3 != i4;
            c = i4;
            if (z) {
                reset();
            }
        }
    }

    public final void e(Activity activity) {
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        b bVar = n;
        if (fragmentActivity != null && (supportFragmentManager2 = fragmentActivity.getSupportFragmentManager()) != null) {
            supportFragmentManager2.r0(bVar);
            supportFragmentManager2.c0(bVar, true);
        }
        if (epx.f(activity, b()) || activity.isInPictureInPictureMode() || (activity instanceof OverlayMenuActivity) || (activity instanceof ScreenshotEditorActivity)) {
            return;
        }
        Activity b2 = b();
        if (b2 != null) {
            f.c(b2, true);
            FragmentActivity fragmentActivity2 = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
            if (fragmentActivity2 != null && (supportFragmentManager = fragmentActivity2.getSupportFragmentManager()) != null) {
                supportFragmentManager.r0(bVar);
            }
        }
        l = new WeakReference<>(activity);
        update(true);
        d(activity.getResources().getConfiguration());
    }

    @Override // xsna.w290
    public final u290 getConfig() {
        return i;
    }

    @Override // xsna.w290
    public final boolean isInitialized() {
        return g;
    }

    @Override // xsna.w290
    public final void reset() {
        i = new v290();
        update(true);
    }

    @Override // xsna.w290
    public final void update(boolean z) {
        Activity b2;
        if (g && (b2 = b()) != null) {
            Handler handler = d;
            handler.removeMessages(1);
            Message obtain = Message.obtain(handler, new v7q0(b2, z));
            obtain.what = 1;
            handler.sendMessageDelayed(obtain, 100L);
        }
    }

    /* compiled from: OverlayMenuManagerImpl.kt */
    public static final class a implements ComponentCallbacks {
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
            x290.a.d(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }
    }
}
