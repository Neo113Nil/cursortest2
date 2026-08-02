package xsna;

import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.t4c0;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8c0 implements z960, Optional.Action {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u8c0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onVerificationSucceeded$22((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }

    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        y8c0 y8c0Var = (y8c0) this.b;
        NewsEntry newsEntry = (NewsEntry) this.c;
        yzb0 yzb0Var = (yzb0) y8c0Var.w.getValue();
        t4c0.b bVar = new t4c0.b(new xn60.a(new NewsfeedExternalAction.d.a(newsEntry, newsEntry, i, 0)));
        n5c0 c = ((y8c0) yzb0Var.a.c).c();
        if (c != null) {
            c.b(bVar);
        }
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        y8c0Var.p = null;
    }
}
