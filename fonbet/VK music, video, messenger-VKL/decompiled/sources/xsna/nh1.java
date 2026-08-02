package xsna;

import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.photos.root.albumdetails.presentation.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import xsna.it80;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nh1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nh1(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                xn50.a.c(((oh1) this.d).e, new a.r((Throwable) obj, this.c));
                return s3q0.a;
            case 1:
                final u440 u440Var = (u440) this.d;
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.d()).intValue();
                final tam0 tam0Var = (tam0) pair.g();
                final boolean z = this.c;
                return new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.m440
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        StoryMusicInfo info;
                        io.reactivex.rxjava3.core.x l;
                        it80.a aVar;
                        L l2 = L.a;
                        l2.getClass();
                        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l2, L.LogType.d, new Object[]{"MultiStory", "map story media data"});
                        }
                        u440 u440Var2 = u440.this;
                        StoryUploadParams storyUploadParams = u440Var2.l;
                        storyUploadParams.getClass();
                        StoryUploadParams storyUploadParams2 = new StoryUploadParams(storyUploadParams);
                        tam0 tam0Var2 = tam0Var;
                        u440Var2.C7(tam0Var2, storyUploadParams2, z);
                        zcl0 zcl0Var = tam0Var2.h;
                        if (!zcl0Var.r()) {
                            return io.reactivex.rxjava3.core.x.k(storyUploadParams2);
                        }
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l2, L.LogType.d, new Object[]{"MultiStory", "prepare audio"});
                        }
                        w850 w850Var = u440Var2.u0;
                        u440Var2.n.getClass();
                        w850Var.getClass();
                        CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
                        ArrayList arrayList = new ArrayList();
                        Iterator<nov> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            nov next = it.next();
                            if (next instanceof h7m0) {
                                arrayList.add(next);
                            }
                        }
                        h7m0 h7m0Var = (h7m0) j5g.a0(arrayList);
                        if (h7m0Var == null) {
                            info = null;
                        } else {
                            txl0 txl0Var = tam0Var2.v;
                            if (txl0Var != null) {
                                txl0Var.d = h7m0Var.getInfo().d;
                                txl0Var.e = h7m0Var.getInfo().e;
                            }
                            info = h7m0Var.getInfo();
                        }
                        if (info == null) {
                            aVar = it80.b;
                        } else {
                            if (!info.j) {
                                l = new io.reactivex.rxjava3.internal.operators.single.c(new v850(info.b.Fb(), info.c)).l(new pi40(new f0z(info, 12), 1));
                                return new io.reactivex.rxjava3.internal.operators.single.o(l, new s440(new g1j(tam0Var2, 29), 0)).l(new com.vk.movika.sdk.base.hooks.f(new t440(storyUploadParams2, 0), 23));
                            }
                            aVar = it80.b;
                        }
                        l = tr.b(aVar);
                        return new io.reactivex.rxjava3.internal.operators.single.o(l, new s440(new g1j(tam0Var2, 29), 0)).l(new com.vk.movika.sdk.base.hooks.f(new t440(storyUploadParams2, 0), 23));
                    }
                }).l(new do3(new oa10(u440Var, tam0Var, intValue), 26));
            default:
                hcp0 hcp0Var = (hcp0) this.d;
                hcp0Var.w = this.c;
                lf30 lf30Var = hcp0Var.v;
                if (lf30Var != null) {
                    lf30Var.a();
                }
                pgn pgnVar = hcp0Var.x;
                qcy<Object> qcyVar = hcp0.y[0];
                pgnVar.b(null);
                return s3q0.a;
        }
    }
}
