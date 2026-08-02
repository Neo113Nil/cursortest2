package xsna;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.g40;
import xsna.idy;
import xsna.l23;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes11.dex */
public class b33 extends y8i implements g23 {
    public o23 f;
    public final a33 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.a33] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b33(@NonNull Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.g = new idy.a() { // from class: xsna.a33
            @Override // xsna.idy.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return b33.this.l(keyEvent);
            }
        };
        l23 h = h();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((o23) h).V = i;
        h.s();
    }

    @Override // xsna.y8i, android.app.Dialog
    public final void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        g();
        h().c(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        h().t();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return idy.b(this.g, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public final <T extends View> T findViewById(int i) {
        return (T) h().h(i);
    }

    @NonNull
    public final l23 h() {
        if (this.f == null) {
            l23.c cVar = l23.b;
            this.f = new o23(getContext(), getWindow(), this, this);
        }
        return this.f;
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        h().p();
    }

    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean m(int i) {
        return h().z(1);
    }

    @Override // xsna.y8i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        h().o();
        super.onCreate(bundle);
        h().s();
    }

    @Override // xsna.y8i, android.app.Dialog
    public void onStop() {
        super.onStop();
        h().x();
    }

    @Override // xsna.g23
    @Nullable
    public final g40 onWindowStartingSupportActionMode(g40.a aVar) {
        return null;
    }

    @Override // xsna.y8i, android.app.Dialog
    public void setContentView(int i) {
        g();
        h().B(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h().G(charSequence);
    }

    @Override // xsna.y8i, android.app.Dialog
    public void setContentView(@NonNull View view) {
        g();
        h().C(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        h().G(getContext().getString(i));
    }

    @Override // xsna.y8i, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        g();
        h().D(view, layoutParams);
    }

    @Override // xsna.g23
    public final void onSupportActionModeFinished(g40 g40Var) {
    }

    @Override // xsna.g23
    public final void onSupportActionModeStarted(g40 g40Var) {
    }
}
