package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import xsna.o23;

/* compiled from: ActionBar.java */
/* loaded from: classes11.dex */
public abstract class eu {

    /* compiled from: ActionBar.java */
    public interface b {
        void a();
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    public static abstract class c {
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(@Nullable ColorDrawable colorDrawable);

    public abstract void m(boolean z);

    public abstract void n(boolean z);

    public abstract void o(boolean z);

    public abstract void p();

    public abstract void q();

    public abstract void r(@Nullable Drawable drawable);

    public abstract void s(boolean z);

    public abstract void t(String str);

    public abstract void u(String str);

    public abstract void v(CharSequence charSequence);

    public g40 w(o23.e eVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int a;

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }

    public void h() {
    }
}
