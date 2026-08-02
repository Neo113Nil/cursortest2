package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import java.util.concurrent.ConcurrentHashMap;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wv implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wv(int i, Object obj, Object obj2) {
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
                ((fw) obj3).c.e((com.vk.core.view.components.spinner.c) obj2, null);
                break;
            default:
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
        }
    }
}
