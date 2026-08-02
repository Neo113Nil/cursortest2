package xsna;

import android.view.View;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.feed.core.models.Description;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ep30 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializer.StreamParcelable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ep30(Object obj, Serializer.StreamParcelable streamParcelable, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = streamParcelable;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                gp30 gp30Var = (gp30) this.c;
                Msg msg = (Msg) this.d;
                Attach attach = (Attach) this.e;
                pk30 pk30Var = gp30Var.k;
                if (pk30Var != null) {
                    co30 co30Var = gp30Var.j;
                    pk30Var.R(attach, msg, co30Var != null ? co30Var.w : null);
                    break;
                }
                break;
            default:
                VkFeedPostHeaderView vkFeedPostHeaderView = (VkFeedPostHeaderView) this.c;
                Description description = (Description) this.d;
                View view2 = (View) this.e;
                bvu0 bvu0Var = vkFeedPostHeaderView.N;
                if (bvu0Var != null) {
                    bvu0Var.b(description, view2);
                    break;
                }
                break;
        }
    }
}
