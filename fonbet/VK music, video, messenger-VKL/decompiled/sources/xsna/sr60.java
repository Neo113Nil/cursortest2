package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.toggle.features.FeedFeatures;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import xsna.hux;

/* compiled from: NewsfeedListReactionsPlugin.kt */
/* loaded from: classes4.dex */
public final class sr60 {
    public final a4r a;
    public final Object b;
    public final b c = new b(new a(this));

    /* compiled from: NewsfeedListReactionsPlugin.kt */
    public static final class a implements h7o {
        public final WeakReference<sr60> a;

        public a(sr60 sr60Var) {
            this.a = new WeakReference<>(sr60Var);
        }

        @Override // xsna.h7o
        public final void a(Context context, NewsEntry newsEntry, String str) {
            c6z Q;
            String str2;
            ReactionMeta reactionMeta;
            Post R = di60.R(newsEntry);
            if ((R == null || !di60.p(R)) && !di60.q(newsEntry)) {
                return;
            }
            Post R2 = di60.R(newsEntry);
            if ((R2 == null || !R2.Z1()) && (Q = di60.Q(newsEntry)) != null) {
                if (Q.J()) {
                    str2 = str;
                    reactionMeta = null;
                } else {
                    o2f0 o2f0Var = Q instanceof o2f0 ? (o2f0) Q : null;
                    ReactionMeta R3 = o2f0Var != null ? o2f0Var.R3() : null;
                    sr60 sr60Var = this.a.get();
                    if (sr60Var != null) {
                        str2 = str;
                        sr60Var.a.g(new hux.b.a(str2, newsEntry));
                    } else {
                        str2 = str;
                    }
                    reactionMeta = R3;
                }
                boolean z = !Q.J();
                String h = AddLikeAction.TriggerType.DOUBLE_TAP.h();
                if (Q instanceof bss0) {
                    Serializer.c<Videos> cVar = Videos.CREATOR;
                    Q = Videos.a.a(((bss0) Q).t());
                }
                iuc0.b.f(context, new l6z(Q, z, reactionMeta, str2, null, h), null, null);
            }
        }
    }

    public sr60(a4r a4rVar, d3f0 d3f0Var) {
        this.a = a4rVar;
        this.b = msy.a(LazyThreadSafetyMode.NONE, new ufk(d3f0Var, 21));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final g3f0 a() {
        return (g3f0) this.b.getValue();
    }

    /* compiled from: NewsfeedListReactionsPlugin.kt */
    public static final class b implements zjf0<ol60> {
        public final a b;
        public final s1v c = new s1v();

        public b(a aVar) {
            this.b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zjf0
        public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
            FeedFeatures feedFeatures = FeedFeatures.SHARED_VIEW_POOL;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures) && (e0Var instanceof qi6) && (e0Var instanceof i7o)) {
                ((qi6) e0Var).Q6(new s6o((i7o) e0Var, this.b, this.c));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zjf0
        public final void e(RecyclerView.e0 e0Var) {
            FeedFeatures feedFeatures = FeedFeatures.SHARED_VIEW_POOL;
            feedFeatures.getClass();
            if (!com.vk.toggle.b.A.a(feedFeatures) && (e0Var instanceof qi6) && (e0Var instanceof i7o)) {
                ((qi6) e0Var).Q6(new s6o((i7o) e0Var, this.b, this.c));
            }
        }

        @Override // xsna.zjf0
        public final void b(RecyclerView.e0 e0Var) {
        }
    }
}
