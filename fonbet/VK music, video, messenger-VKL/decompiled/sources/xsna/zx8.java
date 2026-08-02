package xsna;

import com.vk.music.search.history.SearchHistoryModel;
import kotlin.Pair;

/* compiled from: CacheUtils.kt */
/* loaded from: classes16.dex */
public final class zx8 {
    public static final Object a;

    static {
        SearchHistoryModel.Type type = SearchHistoryModel.Type.Track;
        SearchHistoryModel.Type type2 = SearchHistoryModel.Type.TrackLyrics;
        a = pn00.k(new Pair(type, type2), new Pair(type2, type));
    }
}
