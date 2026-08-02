package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import xsna.epx;
import xsna.ikn;
import xsna.zkn;

/* loaded from: classes10.dex */
public final class oi0 implements DivExtensionHandler {
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
        Object obj;
        JSONObject jSONObject;
        String string;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setHyphenationFrequency(2);
            List<zkn> m = iknVar.m();
            Locale locale = null;
            if (m != null) {
                Iterator<T> it = m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((zkn) obj).a, "hyphenation")) {
                            break;
                        }
                    }
                }
                zkn zknVar = (zkn) obj;
                if (zknVar != null && (jSONObject = zknVar.b) != null && (string = jSONObject.getString("locale")) != null) {
                    locale = new Locale(string);
                }
            }
            if (locale != null) {
                textView.setTextLocale(locale);
            }
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(ikn iknVar) {
        List<zkn> m = iknVar.m();
        if (m == null || m.isEmpty()) {
            return false;
        }
        Iterator<T> it = m.iterator();
        while (it.hasNext()) {
            if (epx.f(((zkn) it.next()).a, "hyphenation")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
    }
}
