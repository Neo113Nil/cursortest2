package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;

/* loaded from: classes11.dex */
public final class mzx implements kzx {
    public final Context a;
    public final wls b;
    public ViewManager c;

    public mzx(Context context, wls wlsVar) {
        this.a = context;
        this.b = wlsVar;
    }

    @Override // defpackage.kzx
    public final void addToParent(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent.equals(this.c) || parent.equals(this.c)) {
                return;
            }
            if (!(parent instanceof ViewGroup)) {
                yhl.d(parent, "View is attached to unknown parent ");
                return;
            }
            ((ViewGroup) parent).removeView(view);
        }
        ViewManager viewManager = this.c;
        if (viewManager instanceof ViewGroup) {
            ((ViewGroup) viewManager).addView(view);
            return;
        }
        if (viewManager instanceof Activity) {
            viewManager.addView(view, null);
        } else {
            if (viewManager == null) {
                ny61.r("viewManager is not attached");
                return;
            }
            throw new IllegalStateException(viewManager + " is the wrong parent");
        }
    }

    @Override // defpackage.kzx
    public final void attachTo(ViewManager viewManager) {
        this.c = viewManager;
    }

    @Override // defpackage.kzx
    public final ViewGroup.LayoutParams generateLayoutParams(int i, int i2) {
        return (ViewGroup.LayoutParams) this.b.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // defpackage.jp31
    public final Context getCtx() {
        return this.a;
    }

    @Override // defpackage.kzx
    public final View invoke(View view, tls tlsVar) {
        addToParent(view);
        tlsVar.invoke(view);
        return view;
    }
}
