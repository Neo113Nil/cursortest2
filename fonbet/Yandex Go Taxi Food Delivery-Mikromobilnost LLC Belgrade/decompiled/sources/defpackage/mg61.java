package defpackage;

import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes7.dex */
public final class mg61 implements m271 {
    @Override // defpackage.m271
    public final hz61 a(AdActivity adActivity, RelativeLayout relativeLayout, cf71 cf71Var, o3 o3Var, Intent intent, Window window, lk81 lk81Var) {
        a081 a081Var;
        if (lk81Var != null) {
            a081 a081Var2 = a081.g;
            if (a081Var2 == null) {
                synchronized (a081.f) {
                    a081Var = a081.g;
                    if (a081Var == null) {
                        a081Var = new a081();
                        a081.g = a081Var;
                    }
                }
                a081Var2 = a081Var;
            }
            a081Var2.a(window.getContext());
        }
        return null;
    }
}
