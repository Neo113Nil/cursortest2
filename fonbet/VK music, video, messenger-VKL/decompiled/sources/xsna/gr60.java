package xsna;

import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.toggle.features.FeedFeatures;
import java.util.regex.Pattern;
import xsna.ds60;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gr60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gr60(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        CharSequence b;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                kr60 kr60Var = (kr60) obj3;
                PostingCreationEntryPoint postingCreationEntryPoint = (PostingCreationEntryPoint) obj2;
                Post post = (Post) obj;
                Post post2 = post.D;
                String str = post.t;
                if (post2 == null) {
                    if (!epx.f(str, "suggest")) {
                        if (!post.l.zb(8388608L)) {
                            kr60Var.c(epx.f(str, "reply") ? new yo60.f.s.b(post, postingCreationEntryPoint) : new yo60.f.s.c(post, postingCreationEntryPoint));
                            break;
                        } else {
                            kr60Var.c(new yo60.e.l(epx.f(str, "reply") ? new yo60.f.s.b(post, postingCreationEntryPoint) : new yo60.f.s.c(post, postingCreationEntryPoint)));
                            break;
                        }
                    } else {
                        kr60Var.a(new ds60.d.g(post, postingCreationEntryPoint));
                        break;
                    }
                } else {
                    if (post.P != null) {
                        FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
                        feedFeatures.getClass();
                        if (!com.vk.toggle.b.A.a(feedFeatures)) {
                            ej90 ej90Var = post.P;
                            if (ej90Var == null || (b = ej90Var.c) == null) {
                                b = "";
                            }
                            kr60Var.c(new yo60.e.j(post, b));
                            break;
                        }
                    }
                    Pattern pattern = n420.a;
                    b = n420.b(post.s);
                    kr60Var.c(new yo60.e.j(post, b));
                }
                break;
            default:
                ((com.vk.story.viewer.impl.presentation.stories.b) obj3).K.add((Narrative) obj2);
                break;
        }
    }
}
