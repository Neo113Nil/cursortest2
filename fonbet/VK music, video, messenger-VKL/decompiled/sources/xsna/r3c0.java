package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: PostHeaderBindTransformer.kt */
/* loaded from: classes4.dex */
public final class r3c0 implements gn60<NewsEntry, wm60> {
    public final t3c0 b;
    public final Object c;
    public final Object d;
    public final Object e;

    public r3c0(t3c0 t3c0Var) {
        this.b = t3c0Var;
        c6 c6Var = new c6(23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, c6Var);
        this.d = msy.a(lazyThreadSafetyMode, new z34(29));
        this.e = msy.a(lazyThreadSafetyMode, new o2a0(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final List x(Pair pair, bp5 bp5Var) {
        return Collections.singletonList(this.b);
    }
}
