package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: HighlightHelper.java */
/* loaded from: classes17.dex */
public final class e5v {
    public static void a(View view) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(546286023), new ColorDrawable(9415111)});
        b(view, transitionDrawable);
        view.invalidate();
        transitionDrawable.setCrossFadeEnabled(true);
        Object tag = view.getTag(R.id.tag_comment_highlight);
        if (tag != null) {
            i0q0.g((Runnable) tag);
        }
        wv4 wv4Var = new wv4(9, transitionDrawable, view);
        view.setTag(R.id.tag_comment_highlight, wv4Var);
        i0q0.d(3000L, wv4Var);
    }

    public static void b(View view, TransitionDrawable transitionDrawable) {
        if (gz80.a(23)) {
            view.setForeground(transitionDrawable);
            return;
        }
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).setForeground(transitionDrawable);
            return;
        }
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        view.setBackground(transitionDrawable);
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }
}
