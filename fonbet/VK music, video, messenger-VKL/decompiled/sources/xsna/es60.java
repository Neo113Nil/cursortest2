package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import kotlin.Lazy;

/* compiled from: NewsfeedListTaskExecutorsDependencies.kt */
/* loaded from: classes4.dex */
public final class es60 {
    public final qn60 a;
    public final pn60 b;
    public final com.vk.channels.impl.channel_screen.send_msg.c c;
    public final ysg0<Object> d;
    public final Lazy<NewsFeedComponent> e;
    public final Lazy<NewsFeedBridgeComponent> f;
    public final Lazy<BridgeComponent> g;
    public final Lazy<StoriesComponent> h;
    public final Lazy<LinksGeneratorComponent> i;
    public final Lazy<VideoShareComponent> j;
    public final Lazy<AuthBridgeComponent> k;
    public final h7m l;

    public es60(qn60 qn60Var, pn60 pn60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, ysg0 ysg0Var, Lazy lazy, Lazy lazy2, Lazy lazy3, bpn0 bpn0Var, bpn0 bpn0Var2, Lazy lazy4, Lazy lazy5, h7m h7mVar) {
        this.a = qn60Var;
        this.b = pn60Var;
        this.c = cVar;
        this.d = ysg0Var;
        this.e = lazy;
        this.f = lazy2;
        this.g = lazy3;
        this.h = bpn0Var;
        this.i = bpn0Var2;
        this.j = lazy4;
        this.k = lazy5;
        this.l = h7mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es60)) {
            return false;
        }
        es60 es60Var = (es60) obj;
        return epx.f(this.a, es60Var.a) && epx.f(this.b, es60Var.b) && epx.f(this.c, es60Var.c) && epx.f(this.d, es60Var.d) && epx.f(this.e, es60Var.e) && epx.f(this.f, es60Var.f) && epx.f(this.g, es60Var.g) && epx.f(this.h, es60Var.h) && epx.f(this.i, es60Var.i) && epx.f(this.j, es60Var.j) && epx.f(this.k, es60Var.k) && epx.f(this.l, es60Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + g7r0.a(this.k, g7r0.a(this.j, g7r0.a(this.i, g7r0.a(this.h, g7r0.a(this.g, g7r0.a(this.f, g7r0.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "NewsfeedListTaskExecutorsDependencies(dataSet=" + this.a + ", itemsTransformer=" + this.b + ", util=" + this.c + ", rxBus=" + this.d + ", newsfeedComponentLazy=" + this.e + ", newsfeedBridgeComponentLazy=" + this.f + ", bridgeComponentLazy=" + this.g + ", storiesComponentLazy=" + this.h + ", linksGeneratorComponentLazy=" + this.i + ", videoShareComponentLazy=" + this.j + ", authBridgeComponentLazy=" + this.k + ", diContext=" + this.l + ')';
    }
}
