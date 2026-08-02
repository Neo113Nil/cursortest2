package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import java.util.concurrent.ConcurrentHashMap;
import xsna.dpl0;
import xsna.oml0;
import xsna.xll0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ir60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ir60(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                kr60 kr60Var = (kr60) obj3;
                Post post = (Post) obj2;
                Post post2 = (Post) obj;
                if (!post2.pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                kr60Var.c(new yo60.h(new NewsfeedExternalAction.c.r(post)));
                kr60Var.c(new yo60.h(new NewsfeedExternalAction.c.m(post2)));
                kr60Var.c(new yo60.g.c(R.string.wall_ok));
                break;
            default:
                fpl0 fpl0Var = (fpl0) obj2;
                if (!((dpl0.i) obj3).b) {
                    fpl0Var.e(new oml0.k.b(false));
                    break;
                } else {
                    fpl0Var.c(xll0.a.C4016a.a);
                    break;
                }
        }
    }
}
