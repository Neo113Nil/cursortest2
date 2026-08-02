package xsna;

import com.vk.dto.newsfeed.entries.Post;
import java.util.Set;
import xsna.dda0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gca0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gca0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((hca0) this.c).j.b(new dda0.a((Set) this.d));
                break;
            default:
                Post post = (Post) this.c;
                com.vk.newsfeed.impl.presenters.b bVar = (com.vk.newsfeed.impl.presenters.b) this.d;
                ce60.b.getClass();
                p870.f().e(101, post);
                bVar.i0().invalidateOptionsMenu();
                if (!post.l0()) {
                    bVar.i0().k0();
                    bVar.i0().Ic(true);
                    bVar.i0().d0();
                    lfg lfgVar = bVar.H;
                    if (lfgVar != null) {
                        lfgVar.k8(false);
                        break;
                    }
                } else {
                    lfg lfgVar2 = bVar.H;
                    if (lfgVar2 != null) {
                        lfgVar2.k8(true);
                    }
                    bVar.i0().y2();
                    break;
                }
                break;
        }
    }
}
