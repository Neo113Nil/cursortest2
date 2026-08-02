package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: NewsEntryObsceneTextChangedEvent.kt */
/* loaded from: classes4.dex */
public final class xa60 {
    public final NewsEntry a;
    public final a b;
    public final boolean c;

    /* compiled from: NewsEntryObsceneTextChangedEvent.kt */
    public static final class a {
        public final UserId a;
        public final int b;
        public final int c;

        public a(UserId userId, int i, int i2) {
            this.a = userId;
            this.b = i;
            this.c = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xa60() {
        this((NewsEntry) null, (a) (0 == true ? 1 : 0), 7);
    }

    public /* synthetic */ xa60(NewsEntry newsEntry, a aVar, int i) {
        this((i & 1) != 0 ? null : newsEntry, (i & 2) != 0 ? null : aVar, true);
    }

    public xa60(NewsEntry newsEntry, a aVar, boolean z) {
        this.a = newsEntry;
        this.b = aVar;
        this.c = z;
    }
}
