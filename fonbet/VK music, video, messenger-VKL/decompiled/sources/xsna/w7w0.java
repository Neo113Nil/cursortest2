package xsna;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoButtonModel;
import com.vk.voip.ui.group_selector.ui.VoipGroupSelectorFragment;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.media_options.MediaOption;
import xsna.flw0;
import xsna.flx0;
import xsna.g0x0;
import xsna.h7u0;
import xsna.to90;
import xsna.xn50;
import xsna.xow0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class w7w0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w7w0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r12v25, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                maz.c(xwk.d().e(), ((y7w0) obj2).c, ((VmojiProductUnlockInfoButtonModel) obj).c, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 1:
                ((wkw0) obj2).T(new flw0.b(false));
                return s3q0.a;
            case 2:
                VoipGroupSelectorFragment voipGroupSelectorFragment = (VoipGroupSelectorFragment) obj2;
                int i2 = VoipGroupSelectorFragment.R;
                if (!(((xow0) obj) instanceof xow0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                voipGroupSelectorFragment.dismiss();
                return s3q0.a;
            case 3:
                int i3 = qqw0.j1;
                ((qqw0) obj2).startActivity((Intent) obj);
                return s3q0.a;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i4 = otw0.i1;
                ((otw0) obj2).Zn(booleanValue, MediaOption.AUDIO);
                return s3q0.a;
            case 5:
                final VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj2;
                u49 u49Var = (u49) obj;
                int i5 = VoipPastCallsFragment.a0;
                if (u49Var instanceof fp90) {
                    final a59 a59Var = ((fp90) u49Var).a;
                    int i6 = h7u0.p;
                    h7u0.a c = h7u0.b.c(voipPastCallsFragment.requireContext());
                    c.g0(R.string.voip_delete_call_confirm_title);
                    c.c0(R.string.voip_history_past_call_remove, new DialogInterface.OnClickListener() { // from class: xsna.quw0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            int i8 = VoipPastCallsFragment.a0;
                            to90.f fVar = new to90.f(a59Var);
                            VoipPastCallsFragment voipPastCallsFragment2 = VoipPastCallsFragment.this;
                            voipPastCallsFragment2.getClass();
                            xn50.a.c(voipPastCallsFragment2, fVar);
                        }
                    });
                    c.W(R.string.cancel, new ruw0());
                    c.m();
                } else if (u49Var instanceof ep90) {
                    ep90 ep90Var = (ep90) u49Var;
                    boolean z = ep90Var.b;
                    tlo0 tlo0Var = ep90Var.a;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    List<? extends hfz> singletonList = Collections.singletonList(new dqw0(z));
                    k7x k7xVar = new k7x(ref$ObjectRef, voipPastCallsFragment, tlo0Var, 4);
                    cqw0 cqw0Var = new cqw0();
                    cqw0Var.i = singletonList;
                    cqw0Var.x0(dqw0.class, new fvq0(k7xVar, 20));
                    cqw0Var.setHasStableIds(true);
                    VoipPastCallsFragment.b bVar = voipPastCallsFragment.Q;
                    VkTopBar vkTopBar = (bVar == null ? null : bVar).a;
                    if (bVar == null) {
                        bVar = null;
                    }
                    Rect n = zjq.n(bVar.a.getRightMainRect());
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    vkTopBar.getContext();
                    e.c cVar = new e.c(null, n, vkTopBar, l, 1);
                    cVar.l = cqw0Var;
                    ref$ObjectRef.element = cVar.l(false);
                }
                return s3q0.a;
            case 6:
                ((j0x0) obj2).T(new g0x0.a.c.C2906a((Throwable) obj));
                return s3q0.a;
            default:
                ((com.vk.voip.ui.whiteboard.presentation.main.ui.a) obj2).c.invoke(flx0.e.b);
                return s3q0.a;
        }
    }
}
