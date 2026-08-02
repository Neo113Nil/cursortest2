package xsna;

import android.content.Context;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class guc0 implements izs {
    public final /* synthetic */ Post b;
    public final /* synthetic */ PostingCreationEntryPoint c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;

    public /* synthetic */ guc0(int i, Context context, Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
        this.b = post;
        this.c = postingCreationEntryPoint;
        this.d = context;
        this.e = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = rfc0.a;
        q860 q860Var = new q860();
        Post post = this.b;
        q860Var.o(post, (Group) obj);
        q860Var.g = this.c;
        iuc0 iuc0Var = iuc0.b;
        boolean zb = post.l.zb(8388608L);
        Context context = this.d;
        int i2 = this.e;
        if (zb) {
            la60 e0 = iuc0.e0();
            xtc0 xtc0Var = new xtc0(context, q860Var, i2);
            e0.getClass();
            la60.h(context, xtc0Var);
        } else if (i2 != -1) {
            q860Var.d(xa4.L(context), i2);
        } else {
            q860Var.l(context);
        }
        return s3q0.a;
    }
}
