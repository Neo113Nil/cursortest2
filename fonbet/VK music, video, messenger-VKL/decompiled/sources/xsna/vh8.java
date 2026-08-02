package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: BroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class vh8 implements io.reactivex.rxjava3.functions.l, npr {
    public final Object b;

    @Override // xsna.npr
    public lpr a(uor uorVar) {
        lpr lprVar = (lpr) this.b;
        lprVar.c.clear();
        int i = uorVar.c;
        lprVar.a = uorVar.e.size() * i;
        lprVar.b = uorVar.d;
        int i2 = 0;
        for (Object obj : uorVar.e) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            List<u0u0> list = lprVar.c;
            int i4 = ((s0u0) obj).a;
            int i5 = uorVar.f;
            list.add(new u0u0(i4, (i2 * i) + i5, (i3 * i) - i5, uorVar.d, 4, 0));
            i2 = i3;
        }
        return lprVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) throws Throwable {
        VideoOwner videoOwner = (VideoOwner) obj;
        qh8 qh8Var = (qh8) this.b;
        qh8Var.n = videoOwner;
        VideoFile videoFile = videoOwner.f;
        qh8Var.m = videoFile;
        qh8Var.j = videoOwner.g;
        qh8Var.k = videoOwner.h;
        LiveStatNew liveStatNew = qh8Var.g0;
        liveStatNew.b = videoOwner.c;
        liveStatNew.c = videoFile != null ? videoFile.r() : null;
        qh8Var.b0.f = qh8Var.n;
        return io.reactivex.rxjava3.core.q.T(Boolean.TRUE);
    }

    public vh8(int i) {
        switch (i) {
            case 5:
                this.b = new AtomicLong(0L);
                break;
            default:
                this.b = new lpr(0, 0, new ArrayList());
                break;
        }
    }
}
