package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public final class mbk implements nbk {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r1 == null) goto L26;
     */
    @Override // defpackage.nbk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        if (!(jbkVar instanceof wak)) {
            return false;
        }
        String str2 = (String) ((wak) jbkVar).b.a.a(rvoVar);
        View findViewWithTag = div2View.findViewWithTag(str2);
        if (findViewWithTag == null) {
            Set entrySet = div2View.getViewComponent().b().f.entrySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                View contentView = ((suz0) ((Map.Entry) it.next()).getValue()).d.getContentView();
                if (contentView != null) {
                    arrayList.add(contentView);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    findViewWithTag = null;
                    break;
                }
                View findViewWithTag2 = ((View) it2.next()).findViewWithTag(str2);
                if (findViewWithTag2 != null) {
                    findViewWithTag = findViewWithTag2;
                    break;
                }
            }
        }
        findViewWithTag.requestFocus();
        if (findViewWithTag instanceof DivInputView) {
            DivInputView divInputView = (DivInputView) findViewWithTag;
            InputMethodManager inputMethodManager = (InputMethodManager) divInputView.getContext().getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(divInputView, 1);
            }
        }
        return true;
    }
}
