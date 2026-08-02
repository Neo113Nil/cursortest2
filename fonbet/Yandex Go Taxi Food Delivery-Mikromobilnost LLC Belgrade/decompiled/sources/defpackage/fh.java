package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.recyclerview.widget.y0;
import androidx.recyclerview.widget.z0;
import com.yandex.div.core.view2.a;

/* loaded from: classes11.dex */
public final class fh extends y0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ z0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh(z0 z0Var, int i) {
        super(z0Var);
        this.c = i;
        this.w = z0Var;
    }

    @Override // androidx.recyclerview.widget.y0, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        int i = this.c;
        z0 z0Var = this.w;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(qoi0.a(Button.class).c());
                view.setImportantForAccessibility(((a) z0Var).z ? 1 : 4);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                bv4 bv4Var = (bv4) z0Var;
                AccessibilityNodeInfo accessibilityNodeInfo = whVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                uh uhVar = null;
                uh uhVar2 = collectionItemInfo != null ? new uh(collectionItemInfo) : null;
                int b = bv4Var.b();
                if (b == 0) {
                    uhVar = uhVar2;
                } else if (uhVar2 != null) {
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) uhVar2.a;
                    uhVar = uh.a(collectionItemInfo2.getRowIndex() % b, collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex() % b, collectionItemInfo2.getColumnSpan(), accessibilityNodeInfo.isHeading(), collectionItemInfo2.isSelected());
                }
                whVar.s(uhVar);
                break;
        }
    }
}
