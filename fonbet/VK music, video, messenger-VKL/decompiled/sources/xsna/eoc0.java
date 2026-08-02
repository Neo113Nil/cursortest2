package xsna;

import android.view.View;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.newsfeed.posting.impl.presentation.model.ToolbarNavButtonType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.enc0;
import xsna.gko;
import xsna.tlo0;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class eoc0 extends FunctionReferenceImpl implements izs<chc0, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(chc0 chc0Var) {
        VkTopBar.b bVar;
        VkTopBar.c.f fVar;
        chc0 chc0Var2 = chc0Var;
        enc0 enc0Var = (enc0) this.receiver;
        View view = enc0Var.c;
        VkTopBar vkTopBar = enc0Var.v;
        ToolbarNavButtonType toolbarNavButtonType = chc0Var2.b;
        int[] iArr = enc0.a.$EnumSwitchMapping$2;
        int i = iArr[toolbarNavButtonType.ordinal()];
        if (i == 1) {
            bVar = null;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fr20 fr20Var = new fr20(enc0Var, 21);
            tlo0.a aVar = tlo0.Companion;
            String string = view.getContext().getString(R.string.previous_step_talkback_title);
            aVar.getClass();
            bVar = new VkTopBar.b(fr20Var, new tlo0.h(string), null, null, com.vk.core.compose.component.semantics.b.a(null, new b4r(26), 3), 12);
        }
        vkTopBar.setBack(bVar);
        int i2 = iArr[toolbarNavButtonType.ordinal()];
        if (i2 == 1) {
            gko.b bVar2 = gko.Companion;
            tlo0.a aVar2 = tlo0.Companion;
            String string2 = view.getContext().getString(R.string.close_posting_talkback_title);
            aVar2.getClass();
            fVar = new VkTopBar.c.f(new gko(R.drawable.vk_icon_cancel_outline_28), new tlo0.h(string2), new a040(enc0Var, 26), null, com.vk.core.compose.component.semantics.b.a(null, new uuz(14), 3), 24);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = null;
        }
        vkTopBar.setBefore(fVar);
        VkTopBar.Middle.Text.Title title = new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, chc0Var2.a), null, null, null, null, 30);
        String str = chc0Var2.c;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(title, str != null ? new VkTopBar.Middle.Text.c(new tlo0.h(str), null, null, 24) : null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new arb0(chc0Var2, 4), 2), 4));
        return s3q0.a;
    }
}
