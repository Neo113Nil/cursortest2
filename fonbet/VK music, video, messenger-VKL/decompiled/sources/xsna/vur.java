package xsna;

import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.rlottie.RLottieDrawable;
import xsna.dds0;
import xsna.qql;
import xsna.s0u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vur implements io.reactivex.rxjava3.functions.l, s0u.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vur(Object obj, int i) {
        this.c = obj;
        this.b = i;
    }

    @Override // xsna.s0u.a
    public void a(s0u s0uVar, r0u r0uVar, long j) {
        e840 e840Var = (e840) this.c;
        int i = this.b;
        a7l.a();
        qql qqlVar = e840Var.p;
        qqlVar.getClass();
        m6g m6gVar = e840Var.b;
        synchronized (qqlVar) {
            try {
                fxc0.z(y2r0.l(qqlVar.f, i));
                qql.c cVar = qqlVar.f.get(i);
                fxc0.z(!cVar.b);
                fxc0.A(!m6g.h(m6gVar), "HDR input is not supported.");
                if (qqlVar.l == null) {
                    qqlVar.l = m6gVar;
                }
                fxc0.A(qqlVar.l.equals(m6gVar), "Mixing different ColorInfos is not supported.");
                bwo0 bwo0Var = new bwo0(r0uVar, j);
                ((dds0.a) qqlVar.k).getClass();
                cVar.a.add(new qql.b(s0uVar, bwo0Var, new cds0()));
                if (i == qqlVar.o) {
                    qqlVar.c();
                } else {
                    qqlVar.d(cVar);
                }
                qqlVar.e.f(new oql(qqlVar), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int imageSize = ((xur) this.c).c.getImageSize();
        String str = ((AnimatedStickerInfo) obj).e;
        if (str != null) {
            return new RLottieDrawable(str, String.valueOf(this.b), imageSize, imageSize, null, false, false, null, 480);
        }
        throw new IllegalStateException("Loaded Lottie animation data is invalid");
    }
}
