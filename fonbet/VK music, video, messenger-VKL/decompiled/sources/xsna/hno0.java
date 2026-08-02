package xsna;

import android.content.res.ColorStateList;
import android.os.Build;
import android.text.PrecomputedText;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.dxc0;

/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public final class hno0 {

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes12.dex */
    public static class a {
        public static PrecomputedText.Params a(AppCompatTextView appCompatTextView) {
            return appCompatTextView.getTextMetricsParams();
        }

        public static void b(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes12.dex */
    public static class b {
        public static void a(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes12.dex */
    public static class c implements ActionMode.Callback {
        public final ActionMode.Callback a() {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            throw null;
        }
    }

    public static void a(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void b(TextView textView, int i) {
        obr.d(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void c(AppCompatTextView appCompatTextView, dxc0 dxc0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            appCompatTextView.setText(dxc0Var.b());
        } else {
            if (!new dxc0.a(a.a(appCompatTextView)).a(dxc0Var.a())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            appCompatTextView.setText(dxc0Var);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        return callback instanceof c ? ((c) callback).a() : callback;
    }
}
