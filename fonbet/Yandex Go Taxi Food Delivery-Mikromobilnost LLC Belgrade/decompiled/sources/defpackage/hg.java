package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class hg extends AccessibilityDelegateCompat {
    public static final hg a = new hg();

    public static final void a(View view) {
        b.p(view, a);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        if (view.isClickable() || (view.getParent() instanceof ListView)) {
            whVar.p("android.widget.Button");
        }
        if ((view.getParent() instanceof ListView) && view.isActivated()) {
            whVar.C(true);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (TextUtils.isEmpty(viewGroup.getContentDescription())) {
                List h = vng.h(viewGroup);
                if (h.isEmpty()) {
                    return;
                }
                whVar.t(TextUtils.join(Extension.FIX_SPACE, h));
            }
        }
    }
}
