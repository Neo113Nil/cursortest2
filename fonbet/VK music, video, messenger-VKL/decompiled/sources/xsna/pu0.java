package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.stats.AdsPixel;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Serializer.c<AdsAudioPixelsContainer> cVar = AdsAudioPixelsContainer.CREATOR;
        return epx.h(((AdsPixel.Reached) obj).f, ((AdsPixel.Reached) obj2).f);
    }
}
