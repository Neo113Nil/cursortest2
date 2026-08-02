package defpackage;

import android.view.View;
import com.yandex.div.core.d;
import com.yandex.div.core.view2.Div2View;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public interface dpk {
    default void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar);

    default void loadMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    boolean matches(egk egkVar);

    default void preprocess(egk egkVar, rvo rvoVar, qpe0 qpe0Var) {
        ppe0 l = ((d) qpe0Var).l(egkVar.toString());
        preprocess(egkVar, rvoVar);
        l.a(new bsd(EmptyList.a));
    }

    default void releaseMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar);

    default void preprocess(egk egkVar, rvo rvoVar) {
    }
}
