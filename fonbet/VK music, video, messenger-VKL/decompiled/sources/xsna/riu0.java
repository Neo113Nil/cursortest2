package xsna;

import android.widget.FrameLayout;
import com.vk.core.view.components.cell.h;
import com.vk.core.view.components.cell.slot.Slot;
import java.util.Collections;

/* compiled from: VkCellButtonLego.kt */
/* loaded from: classes17.dex */
public final class riu0 extends FrameLayout {
    public com.vk.core.view.components.cell.h b;
    public Slot<?> c;
    public Slot<?> d;
    public String e;

    public final Slot<?> getBeforeSlot() {
        return this.c;
    }

    public final Slot<?> getMiddleSlot() {
        return this.d;
    }

    public final String getTestTag() {
        return this.e;
    }

    public final void setBeforeSlot(Slot<?> slot) {
        this.c = slot;
        this.b.setBefore(slot != null ? new h.b(Collections.singletonList(slot)) : null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setMiddleSlot(Slot<?> slot) {
        this.d = slot;
        this.b.setMiddle(slot != null ? new h.c(slot, null, null) : null);
    }

    public final void setSize(Slot.Size size) {
        this.b.setSize(size);
    }

    public final void setTestTag(String str) {
        this.e = str;
        this.b.setTag(str);
    }
}
