package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class nnj implements dpk {
    public static final int a = xah0.ybsdk_should_restore_nested_scroll_id;

    public static void a(View view) {
        if (view.isNestedScrollingEnabled()) {
            view.setTag(a, Boolean.TRUE);
        }
        view.setNestedScrollingEnabled(false);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(viewGroup.getChildAt(i));
            }
        }
    }

    public static void b(View view) {
        int i = a;
        Object tag = view.getTag(i);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            view.setTag(i, null);
            view.setNestedScrollingEnabled(booleanValue);
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                b(viewGroup.getChildAt(i2));
            }
        }
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        a(view);
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        Object obj = null;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((bpk) next).a, "disable_nested_scroll")) {
                    obj = next;
                    break;
                }
            }
            obj = (bpk) obj;
        }
        return obj != null;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        b(view);
    }
}
