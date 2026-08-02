package xsna;

import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.clips.uploader.impl.model.ClipUploadJobInternal;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import xsna.ded;
import xsna.fef;

/* compiled from: ClipsUploadControllerImpl.kt */
/* loaded from: classes17.dex */
public final class gef implements voc {
    public final /* synthetic */ fef a;
    public final /* synthetic */ File b;
    public final /* synthetic */ ClipUploadJobInternal c;

    public gef(fef fefVar, File file, ClipUploadJobInternal clipUploadJobInternal) {
        this.a = fefVar;
        this.b = file;
        this.c = clipUploadJobInternal;
    }

    @Override // xsna.voc
    public final void a(Exception exc) {
        this.a.a.getLogger().a("ClipsUploadControllerImpl", exc);
    }

    @Override // xsna.voc
    public final void b(List<VideoVideoImageDto> list) {
        fef fefVar = this.a;
        nlf nlfVar = fefVar.a;
        if (nlfVar.getConfig().a()) {
            vhk0.b(this.b);
        }
        ded.d dVar = new ded.d(list);
        ClipUploadJobInternal clipUploadJobInternal = this.c;
        Pair pair = new Pair(clipUploadJobInternal, dVar);
        Set<ClipUploadJobInternal> a = fefVar.g.a();
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        for (ClipUploadJobInternal clipUploadJobInternal2 : a) {
            arrayList.add(new Pair(clipUploadJobInternal2, fef.a.a(clipUploadJobInternal2.f)));
        }
        ArrayList v0 = j5g.v0(pair, arrayList);
        nlfVar.getLogger().d("ClipsUploadControllerImpl", h5s.c(clipUploadJobInternal.b.b, " done", new StringBuilder("cover upload task for ")));
        fefVar.k(v0);
        fefVar.m((ClipUploadJobInternal) pair.i(), (ded) pair.j());
    }
}
