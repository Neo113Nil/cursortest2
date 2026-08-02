package xsna;

import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.concurrent.Future;
import ru.mail.libverify.j0.j;
import ru.mail.libverify.requests.VerifyApiRequest;
import xsna.xn60;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3n implements z960, j.c {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3n(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.j0.j.c
    public void a(Future future) {
        ((ru.mail.libverify.api.s) this.b).a((VerifyApiRequest) this.c, future);
    }

    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        c3n c3nVar = (c3n) this.b;
        yo60.e.C4117e c4117e = (yo60.e.C4117e) this.c;
        c3nVar.a.a(new xn60.a(new NewsfeedExternalAction.d.a(c4117e.b, c4117e.c, i, c4117e.d)));
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        c3nVar.d = null;
        c3nVar.a(null);
    }
}
