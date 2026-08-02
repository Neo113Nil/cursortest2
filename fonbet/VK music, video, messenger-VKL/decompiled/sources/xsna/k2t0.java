package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.posting.presentation.video.a;
import com.vk.posting.presentation.video.c;
import com.vk.posting.presentation.video.e;
import com.vk.posting.presentation.video.model.VideoPickerFilter;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoPickerFeature.kt */
/* loaded from: classes18.dex */
public final class k2t0 extends wk50<com.vk.posting.presentation.video.h, d3t0, com.vk.posting.presentation.video.a, com.vk.posting.presentation.video.c> {
    public final UserId f;
    public final wf90 g;
    public final y2t0 h;
    public final Integer i;
    public final am50 j;
    public final f4z k;
    public final i2t0 l;

    public k2t0(com.vk.posting.presentation.video.d dVar, UserId userId, wf90 wf90Var, y2t0 y2t0Var, Integer num, djl djlVar) {
        super(a.g.b, dVar);
        this.f = userId;
        this.g = wf90Var;
        this.h = y2t0Var;
        this.i = num;
        this.j = djlVar;
        this.k = new f4z();
        this.l = new i2t0(this);
    }

    @Override // xsna.wk50
    public final void N(d3t0 d3t0Var, com.vk.posting.presentation.video.a aVar) {
        com.vk.posting.presentation.video.a aVar2 = aVar;
        VideoPickerFilter videoPickerFilter = d3t0Var.g;
        i2t0 i2t0Var = this.l;
        i2t0Var.a = videoPickerFilter;
        if (aVar2.equals(a.g.b)) {
            return;
        }
        boolean equals = aVar2.equals(a.c.b);
        f4z f4zVar = this.k;
        wf90 wf90Var = this.g;
        if (equals) {
            wf90Var.d = i2t0Var;
            f4zVar.b(new e.b.a(wf90Var));
            return;
        }
        if (aVar2.equals(a.AbstractC1531a.C1532a.b)) {
            f4zVar.b(e.a.C1541a.a);
            return;
        }
        if (aVar2 instanceof a.b.AbstractC1533a) {
            a.b.AbstractC1533a abstractC1533a = (a.b.AbstractC1533a) aVar2;
            if (abstractC1533a instanceof a.b.AbstractC1533a.C1534a) {
                VideoPickerFilter videoPickerFilter2 = VideoPickerFilter.VIDEO;
                if (videoPickerFilter != videoPickerFilter2) {
                    T(new c.a(videoPickerFilter2));
                    i2t0Var.a = videoPickerFilter2;
                    wf90Var.c();
                    return;
                }
                return;
            }
            if (!(abstractC1533a instanceof a.b.AbstractC1533a.C1535b)) {
                throw new NoWhenBranchMatchedException();
            }
            VideoPickerFilter videoPickerFilter3 = VideoPickerFilter.PLAYLIST;
            if (videoPickerFilter != videoPickerFilter3) {
                i2t0Var.a = videoPickerFilter3;
                T(new c.a(videoPickerFilter3));
                wf90Var.c();
                return;
            }
            return;
        }
        boolean z = aVar2 instanceof a.f;
        am50 am50Var = this.j;
        if (z) {
            a.f fVar = (a.f) aVar2;
            if (fVar instanceof a.f.b) {
                am50Var.b();
                f4zVar.b(new e.a.c(((a.f.b) fVar).b, am50Var));
                return;
            } else {
                if (!(fVar instanceof a.f.C1538a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new e.a.b(((a.f.C1538a) fVar).b, this.f));
                return;
            }
        }
        if (aVar2 instanceof a.d) {
            if (!((a.d) aVar2).equals(a.d.C1536a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            wf90Var.b();
        } else {
            if (!(aVar2 instanceof a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            a.e eVar = (a.e) aVar2;
            if (eVar.equals(a.e.b.b)) {
                am50Var.c();
            } else {
                if (!(eVar instanceof a.e.C1537a)) {
                    throw new NoWhenBranchMatchedException();
                }
                am50Var.d();
            }
        }
    }

    @Override // xsna.wk50
    public final List<com.vk.posting.presentation.video.a> Q(d3t0 d3t0Var, d3t0 d3t0Var2, com.vk.posting.presentation.video.c cVar) {
        d3t0 d3t0Var3 = d3t0Var;
        d3t0 d3t0Var4 = d3t0Var2;
        com.vk.posting.presentation.video.c cVar2 = cVar;
        if (cVar2 instanceof c.b.a) {
            Throwable th = ((c.b.a) cVar2).b.a;
            return Collections.singletonList(new a.e.C1537a());
        }
        if (cVar2 instanceof c.b.d) {
            return Collections.singletonList(a.e.b.b);
        }
        super.Q(d3t0Var3, d3t0Var4, cVar2);
        return null;
    }
}
