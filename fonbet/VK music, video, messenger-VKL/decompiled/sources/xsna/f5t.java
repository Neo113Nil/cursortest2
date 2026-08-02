package xsna;

import android.content.Context;
import java.util.List;

/* compiled from: GalleryProvider.kt */
/* loaded from: classes4.dex */
public interface f5t {
    String getDefaultAlbumName(Context context);

    io.reactivex.rxjava3.core.q<List<wc1>> loadAlbums();

    io.reactivex.rxjava3.core.q<wc1> loadDefaultAlbum();

    io.reactivex.rxjava3.core.q<md90> loadEntries(wc1 wc1Var, int i, int i2);

    default void onAlbumSelected(wc1 wc1Var) {
    }
}
