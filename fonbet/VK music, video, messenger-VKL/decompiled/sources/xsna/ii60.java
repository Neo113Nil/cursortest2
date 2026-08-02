package xsna;

import com.vk.newsfeed.api.di.NewsFeedComponent;
import kotlin.Lazy;

/* compiled from: NewsfeedExternalActionSender.kt */
/* loaded from: classes4.dex */
public final class ii60 {
    public final Lazy<NewsFeedComponent> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ii60(Lazy<? extends NewsFeedComponent> lazy) {
        this.a = lazy;
    }

    public final p870 a() {
        return this.a.getValue().w();
    }
}
