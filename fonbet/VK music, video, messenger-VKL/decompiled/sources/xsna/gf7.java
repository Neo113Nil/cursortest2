package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;

/* compiled from: BlockHeaderUiDtoFactory.kt */
/* loaded from: classes4.dex */
public final class gf7 {
    public final b25 a;

    public gf7(b25 b25Var) {
        this.a = b25Var;
    }

    public static u1c0 b(NewsEntry newsEntry) {
        u1c0 u1c0Var = new u1c0(252, newsEntry);
        u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new cyj0(newsEntry, newsEntry.f)));
        return u1c0Var;
    }

    public final u1c0 a(NewsEntry newsEntry) {
        u1c0 u1c0Var = new u1c0(202, newsEntry);
        u1c0Var.h = (ol60) j5g.a0(new ef7(this.a).x(newsEntry, null));
        return u1c0Var;
    }
}
