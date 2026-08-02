package xsna;

import android.view.View;
import java.util.Iterator;
import java.util.Map;

/* compiled from: FeedOverlayComponentRendererDecoration.kt */
/* loaded from: classes4.dex */
public final class a2r implements View.OnAttachStateChangeListener {
    public final /* synthetic */ b2r b;

    public a2r(b2r b2rVar) {
        this.b = b2rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object obj;
        b2r b2rVar = this.b;
        Iterator it = b2rVar.i.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((Map.Entry) obj).getValue(), view)) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return;
        }
        b2rVar.l((pyp0) b2rVar.h.get(entry.getKey()), (qyp0) entry.getKey());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
