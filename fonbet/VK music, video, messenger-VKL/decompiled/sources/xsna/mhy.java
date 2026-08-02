package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;

/* compiled from: KeyboardUtils.java */
/* loaded from: classes.dex */
public final class mhy {
    public static final b a = new b(Looper.getMainLooper());

    /* compiled from: KeyboardUtils.java */
    public static class b extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            Object obj = message.obj;
            if (obj != null) {
                if ((i == 23 || i == 24) && (obj instanceof Runnable)) {
                    ((Runnable) obj).run();
                }
            }
        }
    }

    /* compiled from: KeyboardUtils.java */
    public static class c implements Runnable {
        public final WeakReference<View> b;
        public final WeakReference<ResultReceiver> c;
        public final int d;

        public c(@Nullable ResultReceiver resultReceiver, View view, boolean z) {
            this.b = new WeakReference<>(view);
            this.c = new WeakReference<>(resultReceiver);
            this.d = z ? 2 : 1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.b.get();
            if (view != null) {
                b bVar = mhy.a;
                bVar.sendMessageDelayed(bVar.obtainMessage(25), 100L);
                view.requestFocus();
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, this.d, this.c.get());
            }
        }
    }

    public static void a(Context context, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        a aVar = new a(context);
        b bVar = a;
        bVar.sendMessageDelayed(bVar.obtainMessage(24, aVar), 50L);
    }

    public static void c(@Nullable IBinder iBinder, @Nullable Context context) {
        if (iBinder == null || context == null) {
            return;
        }
        a aVar = new a(iBinder, context);
        b bVar = a;
        bVar.sendMessageDelayed(bVar.obtainMessage(24, aVar), 50L);
    }

    public static void d(@Nullable View view) {
        if (view == null) {
            return;
        }
        a aVar = new a(view);
        b bVar = a;
        bVar.sendMessageDelayed(bVar.obtainMessage(24, aVar), 50L);
    }

    public static void e(Window window, int i) {
        if (window == null || window.getAttributes().softInputMode == i) {
            return;
        }
        window.setSoftInputMode(i);
    }

    public static void f(Window window) {
        e(window, 32);
    }

    public static void g(Window window) {
        e(window, 16);
    }

    public static void h(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            e(fragmentActivity.getWindow(), 48);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(@Nullable ResultReceiver resultReceiver, View view, boolean z) {
        boolean z2 = view instanceof m1p;
        EditText editText = view;
        if (z2) {
            editText = ((m1p) view).getEditText();
        }
        c cVar = new c(resultReceiver, editText, z);
        b bVar = a;
        bVar.sendMessageDelayed(bVar.obtainMessage(23, cVar), 50L);
    }

    public static void j(View view) {
        i(null, view, false);
    }

    /* compiled from: KeyboardUtils.java */
    /* loaded from: classes17.dex */
    public static class a implements Runnable {
        public final WeakReference<Context> b;
        public final WeakReference<View> c;
        public final WeakReference<IBinder> d;

        public a(Context context) {
            this.b = new WeakReference<>(null);
            this.c = new WeakReference<>(null);
            this.d = new WeakReference<>(null);
            this.b = new WeakReference<>(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            IBinder iBinder = this.d.get();
            Context context = this.b.get();
            if (iBinder != null && context != null) {
                b bVar = mhy.a;
                bVar.sendMessageDelayed(bVar.obtainMessage(25), 100L);
                ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(iBinder, 0);
            }
            if (context != null) {
                Activity e = fnj.e(context);
                if (e == null) {
                    return;
                }
                b bVar2 = mhy.a;
                bVar2.sendMessageDelayed(bVar2.obtainMessage(25), 100L);
                ((InputMethodManager) e.getSystemService("input_method")).hideSoftInputFromWindow(e.getWindow().getDecorView().getWindowToken(), 0);
                return;
            }
            View view = this.c.get();
            if (view != null) {
                b bVar3 = mhy.a;
                bVar3.sendMessageDelayed(bVar3.obtainMessage(25), 100L);
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public a(View view) {
            this.b = new WeakReference<>(null);
            this.c = new WeakReference<>(null);
            this.d = new WeakReference<>(null);
            this.c = new WeakReference<>(view);
        }

        public a(IBinder iBinder, Context context) {
            this.b = new WeakReference<>(null);
            this.c = new WeakReference<>(null);
            this.d = new WeakReference<>(null);
            this.d = new WeakReference<>(iBinder);
            this.b = new WeakReference<>(context);
        }
    }
}
