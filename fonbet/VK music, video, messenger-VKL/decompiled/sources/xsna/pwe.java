package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: ClipsPreviewUpdaterImpl.kt */
/* loaded from: classes16.dex */
public final class pwe {
    public final Context a;
    public final ClipsDraftVk b;
    public final MediaPipelineComponent c;

    public pwe(Context context, ClipsDraftVk clipsDraftVk, MediaPipelineComponent mediaPipelineComponent) {
        this.a = context;
        this.b = clipsDraftVk;
        this.c = mediaPipelineComponent;
        ClipsDraftPersistentStore.b.getClass();
        ClipsDraftPersistentStore.j();
    }

    public final io.reactivex.rxjava3.core.x<File> a(final Timeline timeline, final List<? extends uq10> list, final Size size) {
        String path;
        ClipsDraftPersistentStore.b.getClass();
        ClipsDraftVk j = ClipsDraftPersistentStore.j();
        if (j != null) {
            ClipsDraftCommonData clipsDraftCommonData = j.b;
            if (clipsDraftCommonData.i && com.vk.core.files.a.y(clipsDraftCommonData.j)) {
                String str = clipsDraftCommonData.j;
                return io.reactivex.rxjava3.core.x.k((str == null || (path = Uri.parse(str).getPath()) == null) ? null : new File(path));
            }
        }
        final long j2 = j != null ? j.b.f : 0L;
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.owe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                PrivateFiles.a b;
                Uri g;
                Timeline timeline2 = timeline;
                long j3 = swe0.j(j2, new q500(0L, timeline2.d / 1000));
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((uq10) it.next()).f();
                }
                pwe pweVar = this;
                Context context = pweVar.a;
                MediaPipelineComponent mediaPipelineComponent = pweVar.c;
                Bitmap a = mediaPipelineComponent.O9(timeline2, new apk(list2, context, mediaPipelineComponent.Gd())).a(1000 * j3, size);
                b = e8r.a.b(r7, PrivateSubdir.TEMP_UPLOADS.h(), true);
                File file = new File(b.a, UUID.randomUUID().toString());
                com.vk.stories.b.a.getClass();
                File f = com.vk.stories.b.f(a, file);
                if (f == null) {
                    throw new IllegalStateException("bitmap was to saved to " + file.getPath());
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((uq10) it2.next()).e();
                }
                ClipsDraftVk clipsDraftVk = pweVar.b;
                if (clipsDraftVk != null) {
                    ClipsDraftVk.b bVar = ClipsDraftVk.d;
                    String n = com.vk.core.files.a.n(Uri.fromFile(f));
                    if (n != null) {
                        ClipsDraftCommonData clipsDraftCommonData2 = clipsDraftVk.b;
                        String str2 = clipsDraftCommonData2.j;
                        clipsDraftCommonData2.j = n;
                        clipsDraftCommonData2.f = j3;
                        ClipsDraftPersistentStore.b.getClass();
                        ClipsDraftPersistentStore.t();
                        vhk0.c((str2 == null || (g = jeq0.g(str2)) == null) ? null : g.getPath());
                    }
                }
                return f;
            }
        }).q(asu0.a.A(10, "clips-preview-thread"));
    }
}
