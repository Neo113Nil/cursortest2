package xsna;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executor;
import xsna.el3;
import xsna.g40;
import xsna.l23;
import xsna.o23;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class l23 {
    public static final c b = new c(new d());
    public static int c = -100;
    public static mwz d = null;
    public static mwz e = null;
    public static Boolean f = null;
    public static boolean g = false;
    public static final el3<WeakReference<l23>> h = new el3<>();
    public static final Object i = new Object();
    public static final Object j = new Object();

    /* compiled from: AppCompatDelegate.java */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    public static class c implements Executor {
        public final Object b = new Object();
        public final ArrayDeque c = new ArrayDeque();
        public final d d;
        public Runnable e;

        public c(d dVar) {
            this.d = dVar;
        }

        public final void a() {
            synchronized (this.b) {
                try {
                    Runnable runnable = (Runnable) this.c.poll();
                    this.e = runnable;
                    if (runnable != null) {
                        this.d.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.b) {
                try {
                    this.c.add(new m23(0, this, runnable));
                    if (this.e == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: AppCompatDelegate.java */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A(@NonNull mwz mwzVar) {
        Objects.requireNonNull(mwzVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object l = l();
            if (l != null) {
                b.b(l, a.a(mwzVar.a.a.toLanguageTags()));
                return;
            }
            return;
        }
        if (mwzVar.equals(d)) {
            return;
        }
        synchronized (i) {
            d = mwzVar;
            el3<WeakReference<l23>> el3Var = h;
            el3Var.getClass();
            el3.a aVar = new el3.a();
            while (aVar.hasNext()) {
                l23 l23Var = (l23) ((WeakReference) aVar.next()).get();
                if (l23Var != null) {
                    l23Var.d();
                }
            }
        }
    }

    public static void I(final Context context) {
        if (q(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (g) {
                    return;
                }
                b.execute(new Runnable() { // from class: xsna.k23
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
                    
                        if (r0 != null) goto L14;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        mwz mwzVar;
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 33) {
                            Context context2 = context;
                            ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                            if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                                if (i2 >= 33) {
                                    Object l = l23.l();
                                    if (l != null) {
                                        mwzVar = mwz.b(l23.b.a(l));
                                        if (mwzVar.a.a.isEmpty()) {
                                            String i3 = m63.i(context2);
                                            Object systemService = context2.getSystemService("locale");
                                            if (systemService != null) {
                                                l23.b.b(systemService, l23.a.a(i3));
                                            }
                                        }
                                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                                    }
                                    mwzVar = mwz.b;
                                    if (mwzVar.a.a.isEmpty()) {
                                    }
                                    context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                                } else {
                                    mwzVar = l23.d;
                                }
                            }
                        }
                        l23.g = true;
                    }
                });
                return;
            }
            synchronized (j) {
                try {
                    mwz mwzVar = d;
                    if (mwzVar == null) {
                        if (e == null) {
                            e = mwz.a(m63.i(context));
                        }
                        if (e.a.a.isEmpty()) {
                        } else {
                            d = e;
                        }
                    } else if (!mwzVar.equals(e)) {
                        mwz mwzVar2 = d;
                        e = mwzVar2;
                        m63.h(context, mwzVar2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object l() {
        Context i2;
        el3<WeakReference<l23>> el3Var = h;
        el3Var.getClass();
        el3.a aVar = new el3.a();
        while (aVar.hasNext()) {
            l23 l23Var = (l23) ((WeakReference) aVar.next()).get();
            if (l23Var != null && (i2 = l23Var.i()) != null) {
                return i2.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean q(Context context) {
        if (f == null) {
            try {
                int i2 = AppLocalesMetadataHolderService.b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.a.a() | 128).metaData;
                if (bundle != null) {
                    f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f = Boolean.FALSE;
            }
        }
        return f.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(@NonNull l23 l23Var) {
        synchronized (i) {
            try {
                el3<WeakReference<l23>> el3Var = h;
                el3Var.getClass();
                el3.a aVar = new el3.a();
                while (aVar.hasNext()) {
                    l23 l23Var2 = (l23) ((WeakReference) aVar.next()).get();
                    if (l23Var2 == l23Var || l23Var2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void B(int i2);

    public abstract void C(View view);

    public abstract void D(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void E(@Nullable Toolbar toolbar);

    public abstract void G(@Nullable CharSequence charSequence);

    @Nullable
    public abstract g40 H(@NonNull g40.a aVar);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    public abstract View g(@NonNull Context context, @Nullable View view, String str, @NonNull AttributeSet attributeSet);

    @Nullable
    public abstract <T extends View> T h(int i2);

    @Nullable
    public Context i() {
        return null;
    }

    @Nullable
    public abstract o23.b j();

    public int k() {
        return -100;
    }

    public abstract MenuInflater m();

    @Nullable
    public abstract eu n();

    public abstract void o();

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return g(context, view, str, attributeSet);
    }

    public abstract void p();

    public abstract void r(Configuration configuration);

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract void w();

    public abstract void x();

    public abstract boolean z(int i2);

    public void d() {
    }

    public void F(int i2) {
    }

    @NonNull
    public Context f(@NonNull Context context) {
        return context;
    }
}
