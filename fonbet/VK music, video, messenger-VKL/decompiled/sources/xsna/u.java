package xsna;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5v0;
import xsna.tlo0;

/* compiled from: APlusModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final class u extends jmu0 {
    public static final /* synthetic */ int h1 = 0;

    /* compiled from: APlusModalBottomSheet.kt */
    public static final class a {
        public static void a(Context context, String str, gzs gzsVar) {
            new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_blogger_mark_10k_outline_56), new x7g(R.attr.vk_ui_icon_accent_themed), null, 12), new c5v0.b(12, tq.h(tlo0.Companion, R.string.profile_aplus_modal_title), new tlo0.f(R.string.profile_aplus_modal_text)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.profile_aplus_modal_button), new s(0, context, str), null, VkButton.Mode.Tertiary, null, false, 444), (c5v0.a.C2643a) null, 6), 52), new t(0, gzsVar), false, 20).b(context, fpf0.a(u.class).l());
        }
    }

    /* compiled from: APlusModalBottomSheet.kt */
    public static final class b implements w8i {
        public static final b b = new b();
    }

    /* compiled from: APlusModalBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((u) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    static {
        int i = ComposeView.n;
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        return null;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-495579593);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-495579593, i, -1, "com.vk.profile.core.aplus.APlusModalBottomSheet.ThemedContent (APlusModalBottomSheet.kt:58)");
        }
        rrv0.a(null, null, kai.c(-1057843057, new com.vk.movika.tools.controls.seekbar.l(this, 1), M), M, 24576, 15);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.m(this, i, 1);
        }
    }
}
