package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import java.util.ArrayList;

/* compiled from: DefaultAvatarGetter.kt */
/* loaded from: classes16.dex */
public final class mbl implements fr5, xj30 {
    public final Object b;

    public /* synthetic */ mbl(Object obj) {
        this.b = obj;
    }

    @Override // xsna.xj30
    public void a(zt90 zt90Var) {
        new com.vk.im.engine.internal.merge.messages.b(zt90Var.a.a, zt90Var.f, zt90Var.b, !zt90Var.d, !zt90Var.e, (Boolean) null, 96).o((w2w) this.b);
    }

    @Override // xsna.fr5
    public io.reactivex.rxjava3.core.x i() {
        return new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.kbl
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                if (o25.a().b()) {
                    final mbl mblVar = mbl.this;
                    return new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.lbl
                        @Override // io.reactivex.rxjava3.functions.n
                        public final Object get() {
                            ImageList imageList = o25.a().o().i;
                            if (imageList != null && !imageList.b.isEmpty()) {
                                return io.reactivex.rxjava3.core.x.k(imageList.Kb());
                            }
                            mbl mblVar2 = mbl.this;
                            return ((jgd) mblVar2.b).c().e(new io.reactivex.rxjava3.internal.operators.single.v(new t19(mblVar2)));
                        }
                    });
                }
                String a = m8f0.a();
                tfx tfxVar = new tfx("shortVideo.getAnonUserInfo", new kq(29), new lq(29));
                tfx.o(tfxVar, "device_id", a, 0, 0, 12);
                dz2 x = yfb.x(tfxVar);
                ahn.D(x);
                return new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.w0(x).l(new m40(new od3(24), 11)), new sn(14), null);
            }
        });
    }

    public mbl(LiveStatNew liveStatNew, pmz pmzVar, wcf0 wcf0Var, VideoFile videoFile) {
        nef0 nef0Var = new nef0(videoFile, false, wcf0Var);
        nef0Var.p = liveStatNew;
        this.b = nef0Var;
        wcf0Var.setPresenter(nef0Var);
        if (pmzVar != null) {
            pmzVar.b.add(nef0Var);
            ArrayList arrayList = pmzVar.v;
            if (arrayList == null || arrayList.size() <= 1) {
                return;
            }
            pmzVar.Q(nef0Var);
        }
    }
}
