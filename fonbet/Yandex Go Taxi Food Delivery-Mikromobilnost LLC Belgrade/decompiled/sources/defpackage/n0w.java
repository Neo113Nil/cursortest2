package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class n0w implements dpk {
    @Override // defpackage.dpk
    public final void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.setLongClickable(false);
            editText.setTextIsSelectable(false);
        }
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
                if (jl40.l(((bpk) next).a, "inputSecure")) {
                    obj = next;
                    break;
                }
            }
            obj = (bpk) obj;
        }
        return obj != null;
    }

    @Override // defpackage.dpk
    public final void preprocess(egk egkVar, rvo rvoVar) {
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.setLongClickable(false);
            editText.setTextIsSelectable(false);
        }
    }
}
