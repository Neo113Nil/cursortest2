package xsna;

import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.im.ui.components.chat_profile.ChatProfileBottomSheetBuilder;
import java.util.List;
import xsna.zxd0;

/* compiled from: ChannelProfileVkAppVc.kt */
/* loaded from: classes2.dex */
public final class y9b implements ChatProfileActionsView.a {
    public final /* synthetic */ w9b a;

    public y9b(w9b w9bVar) {
        this.a = w9bVar;
    }

    @Override // com.vk.im.design.view.chat_profile.ChatProfileActionsView.a
    public final void a(xub xubVar) {
        this.a.s(new zxd0.l(xubVar));
    }

    @Override // com.vk.im.design.view.chat_profile.ChatProfileActionsView.a
    public final void b(List list) {
        w9b w9bVar = this.a;
        ChatProfileBottomSheetBuilder.c(list, new fm0(w9bVar, 14)).a(w9bVar.b, null);
    }
}
