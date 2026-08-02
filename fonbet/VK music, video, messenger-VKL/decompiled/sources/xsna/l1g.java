package xsna;

import android.widget.FrameLayout;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import java.util.Map;

/* compiled from: CollageGridView.kt */
/* loaded from: classes4.dex */
public abstract class l1g extends FrameLayout {
    public izs<? super n2k0, s3q0> b;
    public wzs<? super n2k0, ? super d2g, s3q0> c;
    public izs<? super n2k0, s3q0> d;

    public final void a(w1g w1gVar) {
        for (Map.Entry<n2k0, CollageSlotView> entry : getSlots().entrySet()) {
            entry.getValue().setConfig(w1gVar.g.a.get(entry.getKey()));
        }
    }

    public final void b() {
        for (Map.Entry<n2k0, CollageSlotView> entry : getSlots().entrySet()) {
            n2k0 key = entry.getKey();
            CollageSlotView value = entry.getValue();
            value.setOnClick(new fqd(2, this, key));
            value.setOnTransform(new o43(11, this, key));
            value.setOnTransformEnd(new hc1(7, this, key));
        }
    }

    public final izs<n2k0, s3q0> getOnSlotClick() {
        return this.b;
    }

    public final wzs<n2k0, d2g, s3q0> getOnSlotTransform() {
        return this.c;
    }

    public final izs<n2k0, s3q0> getOnSlotTransformEnd() {
        return this.d;
    }

    public abstract Map<n2k0, CollageSlotView> getSlots();

    public final void setOnSlotClick(izs<? super n2k0, s3q0> izsVar) {
        this.b = izsVar;
    }

    public final void setOnSlotTransform(wzs<? super n2k0, ? super d2g, s3q0> wzsVar) {
        this.c = wzsVar;
    }

    public final void setOnSlotTransformEnd(izs<? super n2k0, s3q0> izsVar) {
        this.d = izsVar;
    }

    public final void setSlotSelected(n2k0 n2k0Var) {
        for (Map.Entry<n2k0, CollageSlotView> entry : getSlots().entrySet()) {
            entry.getValue().setSlotSelected(epx.f(n2k0Var, entry.getKey()));
        }
    }
}
