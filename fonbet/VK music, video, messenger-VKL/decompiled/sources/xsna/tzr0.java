package xsna;

import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.nzr0;
import xsna.ye0;

/* compiled from: VideoAdProgressMapperImpl.kt */
/* loaded from: classes18.dex */
public final class tzr0 implements szr0 {
    @Override // xsna.szr0
    public final nzr0 a(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        rh0 rh0Var;
        if (!(aVar instanceof a.AbstractC1195a)) {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            og0 og0Var = ye0.this.A;
            sws0 sws0Var = (sws0) og0Var.b;
            og0Var.getClass();
            return new nzr0.b(sws0Var, false, ((a.b) aVar).a);
        }
        a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar;
        if (abstractC1195a instanceof a.AbstractC1195a.b) {
            a.AbstractC1195a.b bVar = (a.AbstractC1195a.b) abstractC1195a;
            qh0 qh0Var = bVar.e;
            if (qh0Var != null) {
                float f = qh0Var.c;
                AdBannerData.a aVar3 = bVar.d;
                int i = (int) ((aVar3.e - f) * 1000.0f);
                rh0Var = new rh0(i, (int) (f * 1000), aVar3.h ? Integer.valueOf(Math.max(((int) (aVar3.i * 1000.0f)) - i, 0)) : null);
                return new nzr0.a(rh0Var, null);
            }
        } else if (!(abstractC1195a instanceof a.AbstractC1195a.C1196a)) {
            throw new NoWhenBranchMatchedException();
        }
        rh0Var = null;
        return new nzr0.a(rh0Var, null);
    }
}
