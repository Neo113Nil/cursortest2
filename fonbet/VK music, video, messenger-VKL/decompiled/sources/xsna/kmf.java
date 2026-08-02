package xsna;

import com.vk.clips.attachments.api.di.f;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.hmf;
import xsna.lmf;

/* compiled from: ClipsVideoAttachmentFeature.kt */
/* loaded from: classes16.dex */
public final class kmf extends wk50<com.vk.clips.attachments.impl.views.video.b, rmf, com.vk.clips.attachments.impl.views.video.a, lmf> {
    public static final int i = iah0.a(128);
    public final com.vk.clips.attachments.api.di.f f;
    public final pmf g;
    public final f4z h;

    public kmf(com.vk.clips.attachments.api.di.f fVar, pmf pmfVar) {
        super(a.c.b, pmfVar);
        this.f = fVar;
        this.g = pmfVar;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(rmf rmfVar, com.vk.clips.attachments.impl.views.video.a aVar) {
        Object obj;
        UserId userId;
        String str;
        UserId I0;
        Image image;
        ArrayList arrayList;
        ImageSize imageSize;
        UserId I02;
        rmf rmfVar2 = rmfVar;
        com.vk.clips.attachments.impl.views.video.a aVar2 = aVar;
        List<VideoFile> list = rmfVar2.d;
        String str2 = rmfVar2.b;
        Boolean bool = rmfVar2.c;
        String str3 = rmfVar2.f;
        int i2 = rmfVar2.i;
        if (aVar2 instanceof a.c) {
            T(new lmf.c(i2, rmfVar2.j));
            return;
        }
        if (aVar2 instanceof a.d) {
            T(new lmf.b(((a.d) aVar2).b));
            return;
        }
        Long l = null;
        r10 = null;
        Long l2 = null;
        l = null;
        if (aVar2 instanceof a.C0549a) {
            String str4 = ((a.C0549a) aVar2).b;
            T(new lmf.a((str3 == null || !str3.equals(str4)) ? str4 : null));
            return;
        }
        if (aVar2 instanceof a.j) {
            T(new lmf.e());
            return;
        }
        if (aVar2 instanceof a.i) {
            T(new lmf.d(((a.i) aVar2).b));
            return;
        }
        boolean z = aVar2 instanceof a.e;
        f4z f4zVar = this.h;
        if (z) {
            a.e eVar = (a.e) aVar2;
            boolean z2 = !epx.f(rmfVar2.g, str3);
            boolean f = epx.f(bool, Boolean.TRUE);
            Long n = arm0.n(str2);
            VideoFile videoFile = (VideoFile) j5g.a0(list);
            if (videoFile != null && (I02 = videoFile.I0()) != null) {
                l2 = Long.valueOf(I02.b);
            }
            U(eVar, f, n, l2);
            f4zVar.b(new hmf.b(z2));
            return;
        }
        if (aVar2 instanceof a.f) {
            f4zVar.b(new hmf.c(rmfVar2.e));
            return;
        }
        if (aVar2 instanceof a.k) {
            f4zVar.b(new hmf.e(i2, ((a.k) aVar2).b));
            return;
        }
        boolean z3 = aVar2 instanceof a.h;
        hmf.d dVar = hmf.d.a;
        if (z3) {
            a.h hVar = (a.h) aVar2;
            T(new lmf.c(hVar.b, hVar.c));
            f4zVar.b(dVar);
            return;
        }
        if (aVar2 instanceof a.g) {
            f4zVar.b(dVar);
            return;
        }
        if (!(aVar2 instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar2;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((VideoFile) obj).a1().equals(str3)) {
                    break;
                }
            }
        }
        VideoFile videoFile2 = (VideoFile) obj;
        if (videoFile2 == null || (userId = videoFile2.I0()) == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        if (videoFile2 == null || (str = videoFile2.a1()) == null) {
            str = new String();
        }
        ClipsVideoAttachmentData clipsVideoAttachmentData = new ClipsVideoAttachmentData(str2, true, userId2, str, (videoFile2 == null || (image = videoFile2.getImage()) == null || (arrayList = image.b) == null || (imageSize = (ImageSize) ixj0.d(arrayList, i, true)) == null) ? null : imageSize.d.d, videoFile2 != null ? videoFile2.getTitle() : null, Integer.valueOf(i2));
        boolean f2 = epx.f(bool, Boolean.TRUE);
        Long n2 = arm0.n(str2);
        if (videoFile2 != null && (I0 = videoFile2.I0()) != null) {
            l = Long.valueOf(I0.b);
        }
        U(bVar, f2, n2, l);
        f4zVar.b(new hmf.a(clipsVideoAttachmentData));
    }

    public final void U(com.vk.clips.attachments.impl.views.video.a aVar, boolean z, Long l, Long l2) {
        f.b aVar2;
        if (epx.f(aVar, a.b.b)) {
            aVar2 = new f.b.C0545b(l, l2, z);
        } else if (!epx.f(aVar, a.e.b)) {
            return;
        } else {
            aVar2 = new f.b.a(l, l2, z);
        }
        com.vk.clips.attachments.api.di.f fVar = this.f;
        if (fVar != null) {
            fVar.a(aVar2);
        }
    }
}
