package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Consumable.kt */
/* loaded from: classes17.dex */
public final class a7j<T> {
    public final AtomicReference<T> a;

    public a7j(ClipFeedOpenAction clipFeedOpenAction) {
        this.a = new AtomicReference<>(clipFeedOpenAction);
    }
}
