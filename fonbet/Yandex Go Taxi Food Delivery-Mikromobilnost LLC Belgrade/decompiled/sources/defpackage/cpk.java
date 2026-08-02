package defpackage;

import android.view.View;
import com.yandex.div.core.d;
import com.yandex.div.core.extension.DivExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1;
import com.yandex.div.core.extension.DivExtensionController$unbindView$lambda$5$$inlined$executeOnMainThreadBlocking$1;
import com.yandex.div.core.view2.Div2View;
import java.util.List;

/* loaded from: classes.dex */
public final class cpk {
    public final List a;

    public cpk(List list) {
        this.a = list;
    }

    public final void a(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Div2View div2View2;
        rvo rvoVar2;
        View view2;
        egk egkVar2;
        if (b(egkVar)) {
            for (dpk dpkVar : this.a) {
                if (dpkVar.matches(egkVar)) {
                    ngd0.G.p();
                    if (fu11.a.a()) {
                        dpkVar.bindView(div2View, rvoVar, view, egkVar);
                    } else {
                        sjh sjhVar = uyj.a;
                        div2View2 = div2View;
                        rvoVar2 = rvoVar;
                        view2 = view;
                        egkVar2 = egkVar;
                        tje.Y(o400.a, new DivExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1(null, dpkVar, div2View2, rvoVar2, view2, egkVar2));
                        div2View = div2View2;
                        rvoVar = rvoVar2;
                        view = view2;
                        egkVar = egkVar2;
                    }
                }
                div2View2 = div2View;
                rvoVar2 = rvoVar;
                view2 = view;
                egkVar2 = egkVar;
                div2View = div2View2;
                rvoVar = rvoVar2;
                view = view2;
                egkVar = egkVar2;
            }
        }
    }

    public final boolean b(egk egkVar) {
        List extensions = egkVar.getExtensions();
        return (extensions == null || extensions.isEmpty() || this.a.isEmpty()) ? false : true;
    }

    public final void c(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        if (b(egkVar)) {
            for (dpk dpkVar : this.a) {
                if (dpkVar.matches(egkVar)) {
                    dpkVar.loadMedia(div2View, rvoVar, view, egkVar);
                }
            }
        }
    }

    public final void d(egk egkVar, rvo rvoVar, d dVar) {
        if (b(egkVar)) {
            for (dpk dpkVar : this.a) {
                if (dpkVar.matches(egkVar)) {
                    dpkVar.preprocess(egkVar, rvoVar, dVar);
                }
            }
        }
    }

    public final void e(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Div2View div2View2;
        rvo rvoVar2;
        View view2;
        egk egkVar2;
        if (b(egkVar)) {
            for (dpk dpkVar : this.a) {
                if (dpkVar.matches(egkVar)) {
                    ngd0.G.p();
                    if (fu11.a.a()) {
                        dpkVar.unbindView(div2View, rvoVar, view, egkVar);
                    } else {
                        sjh sjhVar = uyj.a;
                        div2View2 = div2View;
                        rvoVar2 = rvoVar;
                        view2 = view;
                        egkVar2 = egkVar;
                        tje.Y(o400.a, new DivExtensionController$unbindView$lambda$5$$inlined$executeOnMainThreadBlocking$1(null, dpkVar, div2View2, rvoVar2, view2, egkVar2));
                        div2View = div2View2;
                        rvoVar = rvoVar2;
                        view = view2;
                        egkVar = egkVar2;
                    }
                }
                div2View2 = div2View;
                rvoVar2 = rvoVar;
                view2 = view;
                egkVar2 = egkVar;
                div2View = div2View2;
                rvoVar = rvoVar2;
                view = view2;
                egkVar = egkVar2;
            }
        }
    }
}
