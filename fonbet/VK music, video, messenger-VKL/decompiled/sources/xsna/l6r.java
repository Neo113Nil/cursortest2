package xsna;

import com.vk.dto.masks.Mask;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.masks.MasksController;
import com.vk.newsfeed.posting.impl.domain.model.e;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class l6r implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l6r(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((m6r) this.c).a.a(new e.a.h((Set) this.d));
                break;
            case 1:
                MasksController masksController = (MasksController) this.c;
                masksController.d.remove((Mask) this.d);
                break;
            default:
                xzb0 xzb0Var = (xzb0) this.c;
                NewsEntry newsEntry = (NewsEntry) this.d;
                xzb0Var.e.a(((Post) newsEntry).m, true);
                ((p870) xzb0Var.l.getValue()).e(141, newsEntry);
                break;
        }
    }
}
