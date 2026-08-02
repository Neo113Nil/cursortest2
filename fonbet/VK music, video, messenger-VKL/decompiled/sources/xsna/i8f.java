package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.log.L;
import com.vk.media.MediaFilteringStrategy;
import com.vk.media.MediaUtils;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.l3e0;
import xsna.y7f;

/* compiled from: ClipsTemplateEditorRequestsHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class i8f extends ysi {
    public final y7f.h c;
    public final z8d d;
    public final k8f e;
    public final m8f f;
    public final d9f g;
    public final j7f h;
    public List<n7f> i;

    public i8f(y7f.h hVar, z8d z8dVar, k8f k8fVar, m8f m8fVar, d9f d9fVar, h6f h6fVar, j7f j7fVar) {
        this.c = hVar;
        this.d = z8dVar;
        this.e = k8fVar;
        this.f = m8fVar;
        this.g = d9fVar;
        this.h = j7fVar;
    }

    public static ClipsTemplateEditorVideoItem u7(ClipsProcessedItem clipsProcessedItem, n7f n7fVar, VideoTransform videoTransform) {
        int d = n7fVar.b.d();
        MediaUtils.f d2 = MediaUtils.a.d(clipsProcessedItem.b);
        ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = new ClipsTemplateEditorVideoItem(clipsProcessedItem.b, d2.a, d2.b, clipsProcessedItem.c, 0L, d, clipsProcessedItem.g, clipsProcessedItem.d, videoTransform, false);
        L.e("ClipsTemplateEditorRequestsHandlerImpl", "galleryItem = " + clipsProcessedItem + " for fragment = " + n7fVar + " to clipsTemplateEditorVideoItem = " + clipsTemplateEditorVideoItem);
        return clipsTemplateEditorVideoItem;
    }

    public static void w7(Intent intent) {
        intent.putExtra("media_type", 111);
        intent.putExtra("camera_enabled", false);
        intent.putExtra("clips_picker", true);
        intent.putExtra("prevent_styling", true);
        intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC_HEVC);
        intent.putExtra("long_previews", true);
        intent.putExtra("short_divider", true);
        intent.putExtra("prevent_styling_photo", false);
        intent.putExtra("video_max_length_ms", TimeUnit.MINUTES.toMillis(30L));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r j7(z7f z7fVar, io.reactivex.rxjava3.core.x xVar, Set set) {
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(xVar.m(asu0.i()), new h7(new z63(this, z7fVar, set, 4), 14)), new qa(new ng3(9, this, set), 12)), new l7(new n6f(this, 1), 12)).m(asu0Var.d()), new n7(new i4e(this, 6), 16));
    }

    public final io.reactivex.rxjava3.core.x v7(final Intent intent, Context context, gzs gzsVar) {
        if (intent == null) {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.e8f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                i8f i8fVar = this;
                new s9e(new bpn0(new com.vk.movika.sdk.base.model.b(i8fVar, 27)), new bpn0(new bb(i8fVar, 22)), new bpn0(new cb(i8fVar, 21)));
                return s9e.a(intent);
            }
        }).l(new p7(new com.vk.im.engine.internal.api_commands.messages.a(this, 22), 19)), new tt0(new gq0(context, this, new l3e0.a(context, gzsVar), 2), 12));
    }
}
