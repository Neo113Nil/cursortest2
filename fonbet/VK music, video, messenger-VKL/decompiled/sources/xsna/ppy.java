package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.HashMap;
import java.util.LinkedList;

/* compiled from: LayoutPreInflater.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class ppy {
    public static final a<Integer, b> a = new a<>();
    public static volatile io.reactivex.rxjava3.disposables.c b = EmptyDisposable.INSTANCE;
    public static volatile boolean c;
    public static volatile boolean d;

    /* compiled from: LayoutPreInflater.kt */
    public static final class a<K, T> {
        public final Object a = new Object();
        public final HashMap<K, LinkedList<T>> b = new HashMap<>();
    }

    /* compiled from: LayoutPreInflater.kt */
    public static final class b {
        public final View a;
        public final boolean b;
        public final boolean c;

        public b(View view, boolean z, boolean z2) {
            this.a = view;
            this.b = z;
            this.c = z2;
        }
    }

    /* compiled from: LayoutPreInflater.kt */
    public static final class c extends MutableContextWrapper {
        public final Object a;
        public final ThreadLocal<gdr0> b;

        public c(Context context) {
            super(context);
            this.a = new Object();
            this.b = new ThreadLocal<>();
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            gdr0 gdr0Var;
            if (!"layout_inflater".equals(str) || e3m.h(getBaseContext()) != null) {
                return super.getSystemService(str);
            }
            gdr0 gdr0Var2 = this.b.get();
            if (gdr0Var2 != null) {
                return gdr0Var2;
            }
            synchronized (this.a) {
                try {
                    if (e3m.h(getBaseContext()) != null) {
                        gdr0Var = super.getSystemService("layout_inflater");
                    } else {
                        gdr0Var = this.b.get();
                        if (gdr0Var == null) {
                            a<Integer, b> aVar = ppy.a;
                            final v33 v33Var = new v33();
                            gdr0 gdr0Var3 = new gdr0(LayoutInflater.from(getBaseContext()), this);
                            gdr0Var3.setFactory2(new vhr0(gdr0Var3, new zzs() { // from class: xsna.fpy
                                @Override // xsna.zzs
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    Context context = (Context) obj3;
                                    return v33.this.f(context, (View) obj, (String) obj2, (AttributeSet) obj4);
                                }
                            }));
                            this.b.set(gdr0Var3);
                            gdr0Var = gdr0Var3;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gdr0Var;
        }
    }

    public static final View a(Context context, View view) {
        Context context2 = view.getContext();
        if (!(context2 instanceof MutableContextWrapper) || e3m.h(context) == null) {
            return null;
        }
        ((MutableContextWrapper) context2).setBaseContext(context);
        return view;
    }
}
