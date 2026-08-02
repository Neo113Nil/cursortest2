package xsna;

import android.text.Layout;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.vk.core.view.components.formitem.VkInputSelect;
import xsna.ify;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class jnc0 implements ify.a {
    public final /* synthetic */ enc0 b;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ enc0 b;

        public a(enc0 enc0Var) {
            this.b = enc0Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            enc0 enc0Var = this.b;
            VkInputSelect vkInputSelect = enc0Var.n;
            int selectionStart = vkInputSelect.getSelectionStart();
            Layout layout = vkInputSelect.getLayout();
            if (layout == null) {
                return;
            }
            int lineForOffset = layout.getLineForOffset(selectionStart);
            int lineAscent = layout.getLineAscent(lineForOffset) + layout.getLineBaseline(lineForOffset);
            NestedScrollView nestedScrollView = enc0Var.k;
            nestedScrollView.p(0 - nestedScrollView.getScrollX(), (enc0Var.o.getHeight() + lineAscent) - nestedScrollView.getScrollY(), false);
        }
    }

    public jnc0(enc0 enc0Var) {
        this.b = enc0Var;
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        enc0 enc0Var = this.b;
        enc0Var.c.addOnLayoutChangeListener(new a(enc0Var));
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }
}
