package defpackage;

import android.animation.AnimatorInflater;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class pif implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(view.getContext(), smg0.ybsdk_click_scale_animator));
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
                if (jl40.l(((bpk) next).a, "tap_scale_animation")) {
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
        view.setStateListAnimator(null);
    }
}
