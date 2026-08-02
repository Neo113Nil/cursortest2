package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;

/* compiled from: PostingFeatureFactory.kt */
/* loaded from: classes4.dex */
public final class ffc0 {
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public static WallOwner a(rbc0 rbc0Var) {
        WallOwner wallOwner = (WallOwner) rbc0Var.i.getValue();
        if (wallOwner != null) {
            return wallOwner;
        }
        WallOwner wallOwner2 = new WallOwner(UserId.d);
        com.vk.metrics.eventtracking.b.a.a(new Exception("Owner is null"));
        return wallOwner2;
    }
}
