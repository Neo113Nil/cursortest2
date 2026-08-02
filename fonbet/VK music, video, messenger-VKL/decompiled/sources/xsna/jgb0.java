package xsna;

import com.vk.dto.podcast.PodcastSliderItem;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* compiled from: PodcastBlockTransformer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class jgb0 extends PropertyReference1Impl {
    public static final jgb0 b = new jgb0(PodcastSliderItem.class, DatabaseHelper.ITEM_COLUMN_NAME, "getItem()Lcom/vk/dto/music/MusicTrack;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return ((PodcastSliderItem) obj).d;
    }
}
