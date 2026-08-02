package xsna;

import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.design.view.ad.data.AdLayoutBannerData;
import com.vk.libvideo.design.view.ad.data.a;
import com.vk.libvideo.pip.VideoPipStateHolder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoAdLayoutMapperImpl.kt */
/* loaded from: classes18.dex */
public final class mzr0 implements lzr0 {
    @Override // xsna.lzr0
    public final eg0 a(kzr0 kzr0Var) {
        boolean z = kzr0Var.a;
        boolean z2 = kzr0Var.b;
        boolean z3 = kzr0Var.c;
        io2 io2Var = kzr0Var.d;
        lo2 lo2Var = io2Var != null ? new lo2(io2Var) : null;
        boolean z4 = kzr0Var.e;
        VideoPipStateHolder.a.getClass();
        return new eg0(z, z2, z3, lo2Var, z4, VideoPipStateHolder.d());
    }

    @Override // xsna.lzr0
    public final ofy0 b(je0 je0Var) {
        return new ofy0(je0Var, this);
    }

    @Override // xsna.lzr0
    public final com.vk.libvideo.design.view.ad.data.a c(com.vk.libvideo.api.ad.a aVar) {
        if (aVar instanceof a.AbstractC1195a.C1196a) {
            throw null;
        }
        if (!(aVar instanceof a.AbstractC1195a.b)) {
            if (aVar instanceof a.b) {
                return new a.b(((a.b) aVar).a);
            }
            throw new NoWhenBranchMatchedException();
        }
        a.AbstractC1195a.b bVar = (a.AbstractC1195a.b) aVar;
        AdBannerData.a aVar2 = bVar.d;
        String str = aVar2.a;
        boolean z = aVar2.b;
        int i = aVar2.c;
        int i2 = aVar2.d;
        float f = aVar2.e;
        boolean z2 = aVar2.f;
        AdBannerData.AdRedirectData adRedirectData = aVar2.g;
        AdLayoutBannerData.AdLayoutRedirectData adLayoutRedirectData = new AdLayoutBannerData.AdLayoutRedirectData(adRedirectData.b, adRedirectData.c, adRedirectData.d, adRedirectData.e, adRedirectData.f);
        boolean z3 = aVar2.h;
        int i3 = aVar2.i;
        ArrayList arrayList = aVar2.j;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            jh0 jh0Var = (jh0) it.next();
            arrayList2.add(new fg0(jh0Var.a, jh0Var.b, jh0Var.c, jh0Var.d, jh0Var.e, jh0Var.f, jh0Var.g, jh0Var.h, jh0Var.i));
        }
        AdLayoutBannerData.b bVar2 = new AdLayoutBannerData.b(str, z, i, i2, f, z2, adLayoutRedirectData, z3, i3, arrayList2);
        qh0 qh0Var = bVar.e;
        return new a.AbstractC1232a.b(bVar2, qh0Var != null ? new gg0(qh0Var.a, qh0Var.b, qh0Var.c) : null, bVar.f, bVar.g);
    }
}
