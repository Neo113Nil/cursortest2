package xsna;

import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.yo60;

/* compiled from: ItemActionEventFactory.kt */
/* loaded from: classes4.dex */
public final class mtx {
    public static yo60.a a(NewsfeedExternalAction.c.a aVar) {
        if (aVar instanceof NewsfeedExternalAction.c.a.C1437a) {
            NewsfeedExternalAction.c.a.C1437a c1437a = (NewsfeedExternalAction.c.a.C1437a) aVar;
            return new yo60.a.C4113a(c1437a.a, c1437a.b, c1437a.c, c1437a.d);
        }
        if (aVar instanceof NewsfeedExternalAction.c.a.C1438c) {
            NewsfeedExternalAction.c.a.C1438c c1438c = (NewsfeedExternalAction.c.a.C1438c) aVar;
            return new yo60.a.c(c1438c.a, c1438c.b, c1438c.c, c1438c.d, c1438c.e);
        }
        if (!(aVar instanceof NewsfeedExternalAction.c.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        NewsfeedExternalAction.c.a.b bVar = (NewsfeedExternalAction.c.a.b) aVar;
        return new yo60.a.b(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
    }
}
