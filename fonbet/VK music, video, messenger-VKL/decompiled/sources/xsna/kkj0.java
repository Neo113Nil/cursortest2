package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoListWithTotalCount;
import java.util.List;
import kotlin.random.Random;
import xsna.l5t0;
import xsna.m5t0;

/* compiled from: ShuffleVideosDelegate.kt */
/* loaded from: classes16.dex */
public final class kkj0 implements hkj0 {
    public final m5t0 a;
    public final com.vk.movika.sdk.android.defaultplayer.control.l b;
    public final b5t0 c;
    public io.reactivex.rxjava3.disposables.c d = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);

    public kkj0(m5t0 m5t0Var, com.vk.movika.sdk.android.defaultplayer.control.l lVar, b5t0 b5t0Var) {
        this.a = m5t0Var;
        this.b = lVar;
        this.c = b5t0Var;
    }

    @Override // xsna.hkj0
    public final void a(UIBlock uIBlock, CatalogConfiguration catalogConfiguration, Context context) {
        if ((uIBlock instanceof UIBlockVideoAlbum) && (catalogConfiguration instanceof n4t0)) {
            int n = swe0.n(new k9x(0, Integer.MAX_VALUE, 1), Random.b);
            this.d.dispose();
            this.d = hg1.n(this.a.a(new m5t0.a(((UIBlockVideoAlbum) uIBlock).y.b, ((n4t0) catalogConfiguration).b, null, new l5t0.a(0), false, null, new m5t0.a.C3323a(Integer.valueOf(n), null))), context, true, null, 38).subscribe(new sl30(new ikj0(this, uIBlock, catalogConfiguration, n), 25), new tl30(new jkj0(this, uIBlock, catalogConfiguration, n), 22));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(UIBlockVideoAlbum uIBlockVideoAlbum, n4t0 n4t0Var, int i, VideoListWithTotalCount videoListWithTotalCount) {
        VideoFile videoFile;
        List list = videoListWithTotalCount.b;
        if (list.isEmpty()) {
            VideoFile videoFile2 = (VideoFile) j5g.w0(n4t0Var.I, Random.b);
            list = n4t0Var.I;
            videoFile = videoFile2;
        } else {
            videoFile = (VideoFile) j5g.Y(list);
        }
        if (videoFile.isEmpty() || !(videoFile.w8() || videoFile.isExternal())) {
            this.c.invoke(videoFile, list, uIBlockVideoAlbum, Integer.valueOf(i));
        } else {
            this.b.invoke(videoFile, uIBlockVideoAlbum);
        }
    }

    @Override // xsna.hkj0
    public final void dispose() {
        this.d.dispose();
    }
}
