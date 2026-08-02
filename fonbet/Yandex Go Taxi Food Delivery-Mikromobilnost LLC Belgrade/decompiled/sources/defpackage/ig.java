package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import androidx.core.view.AccessibilityDelegateCompat;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class ig extends AccessibilityDelegateCompat {
    public static final ig a = new ig();

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        if (view.isClickable() || (view.getParent() instanceof ListView)) {
            whVar.p(Button.class.getName());
        }
        if ((view.getParent() instanceof ListView) && view.isActivated()) {
            whVar.C(true);
        }
        if ((view instanceof ViewGroup) && TextUtils.isEmpty(view.getContentDescription())) {
            ArrayList arrayList = new ArrayList();
            nja1.e((ViewGroup) view, arrayList);
            if (arrayList.size() > 0) {
                whVar.t(TextUtils.join(Extension.FIX_SPACE, arrayList));
            }
        }
    }
}
