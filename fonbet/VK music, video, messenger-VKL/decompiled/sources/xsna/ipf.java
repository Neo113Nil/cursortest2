package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import kotlin.collections.builders.MapBuilder;

/* compiled from: ClipsViewersExternalNpsSettings.kt */
/* loaded from: classes16.dex */
public final class ipf {
    public static final MapBuilder a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(ExternalNpsCondition.CLIP_STARTED, 20);
        mapBuilder.put(ExternalNpsCondition.CLIP_LIKED, 1);
        mapBuilder.put(ExternalNpsCondition.CLIP_SHARED, 1);
        mapBuilder.put(ExternalNpsCondition.CLIP_COMMENTED, 1);
        mapBuilder.put(ExternalNpsCondition.CLIP_DOWNLOADED, 1);
        a = mapBuilder.h();
    }
}
