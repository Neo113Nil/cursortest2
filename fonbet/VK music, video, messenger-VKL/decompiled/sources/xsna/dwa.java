package xsna;

import android.content.Context;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import java.util.List;
import xsna.mwa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dwa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dwa(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        int i2 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) obj3;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                bVar.n.add(Integer.valueOf(i2));
                return com.vk.channels.impl.comments.g.a(gVar, com.vk.channels.impl.comments.b.s(bVar, (mwa.a) obj2, false, 3), null, null, false, 6);
            default:
                Context context = (Context) obj3;
                PostingCreationEntryPoint postingCreationEntryPoint = (PostingCreationEntryPoint) obj2;
                Object a0 = j5g.a0((List) obj);
                Post post = a0 instanceof Post ? (Post) a0 : null;
                if (post != null) {
                    iuc0 iuc0Var = iuc0.b;
                    iuc0.d0(i2, context, post, postingCreationEntryPoint);
                }
                return s3q0.a;
        }
    }
}
