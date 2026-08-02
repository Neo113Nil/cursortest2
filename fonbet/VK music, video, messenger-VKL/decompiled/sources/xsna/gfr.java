package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.upstream.c;
import java.io.IOException;
import java.util.List;
import xsna.uer;

/* compiled from: FilteringManifestParser.java */
/* loaded from: classes12.dex */
public final class gfr<T extends uer<T>> implements c.a<T> {
    public final c.a<? extends T> a;

    @Nullable
    public final List<StreamKey> b;

    public gfr(c.a<? extends T> aVar, @Nullable List<StreamKey> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    public final Object a(Uri uri, bvk bvkVar) throws IOException {
        uer uerVar = (uer) this.a.a(uri, bvkVar);
        List<StreamKey> list = this.b;
        return (list == null || list.isEmpty()) ? uerVar : (uer) uerVar.copy(list);
    }
}
