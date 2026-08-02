package xsna;

import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.im.ui.components.chat_profile.ChatProfileBottomSheetBuilder;
import java.util.List;
import xsna.zxd0;

/* compiled from: ChatProfileVc.kt */
/* loaded from: classes2.dex */
public final class dyb implements ChatProfileActionsView.a {
    public final /* synthetic */ com.vk.im.ui.components.chat_profile.a a;

    public dyb(com.vk.im.ui.components.chat_profile.a aVar) {
        this.a = aVar;
    }

    @Override // com.vk.im.design.view.chat_profile.ChatProfileActionsView.a
    public final void a(xub xubVar) {
        this.a.t(new zxd0.l(xubVar));
    }

    @Override // com.vk.im.design.view.chat_profile.ChatProfileActionsView.a
    public final void b(List list) {
        com.vk.im.ui.components.chat_profile.a aVar = this.a;
        ChatProfileBottomSheetBuilder.c(list, new zt4(aVar, 11)).a(aVar.b, null);
    }
}
