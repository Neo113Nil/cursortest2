package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import kotlin.collections.builders.MapBuilder;

/* compiled from: ClipsAuthorsExternalNpsSettings.kt */
/* loaded from: classes16.dex */
public final class phd {
    public static final MapBuilder a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(ExternalNpsCondition.CLIP_CREATE, 1);
        mapBuilder.put(ExternalNpsCondition.CLIP_CREATE_AUDIO_ATTACHMENT, 1);
        a = mapBuilder.h();
    }
}
