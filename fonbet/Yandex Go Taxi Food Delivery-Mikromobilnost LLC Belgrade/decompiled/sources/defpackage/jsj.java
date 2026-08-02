package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class jsj extends ffe {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jsj(Context context) {
        super(r0);
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout(context).addView(frameLayout);
    }

    public final void b(View view) {
        ViewGroup viewGroup = this.a;
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(viewGroup);
        }
        c.w(view, viewGroup);
    }
}
