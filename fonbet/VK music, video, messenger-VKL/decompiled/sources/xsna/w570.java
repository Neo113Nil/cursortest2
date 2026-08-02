package xsna;

import android.content.Context;
import android.view.View;
import java.util.List;
import xsna.b5x;

/* compiled from: isNonDsComponent.kt */
/* loaded from: classes18.dex */
public final class w570 extends fl10 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fl10, xsna.el10
    public final boolean d(b5x b5xVar) {
        return b(b5xVar.getDesignInspectorParams(), ((View) b5xVar).getContext());
    }

    @Override // xsna.fl10
    public final tao0 e(b5x.c cVar, Context context) {
        List<String> list;
        List<String> list2;
        if (cVar == null || (list = cVar.g) == null || !list.contains("NonDesignUiComponent") || cVar == null || (list2 = cVar.g) == null || list2.contains("ToolUiComponent")) {
            return null;
        }
        return v570.a;
    }
}
