package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import kotlin.NoWhenBranchMatchedException;
import xsna.dxs;
import xsna.fxs;
import xsna.gi0;
import xsna.y31;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gxs implements izs {
    public final /* synthetic */ fxs b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ uh0 e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ y31.a g;
    public final /* synthetic */ WebAdConfig h;
    public final /* synthetic */ long i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ j11 k;
    public final /* synthetic */ AdvertisementType l;

    public /* synthetic */ gxs(fxs fxsVar, boolean z, boolean z2, uh0 uh0Var, Activity activity, y31.a aVar, WebAdConfig webAdConfig, long j, boolean z3, j11 j11Var, AdvertisementType advertisementType) {
        this.b = fxsVar;
        this.c = z;
        this.d = z2;
        this.e = uh0Var;
        this.f = activity;
        this.g = aVar;
        this.h = webAdConfig;
        this.i = j;
        this.j = z3;
        this.k = j11Var;
        this.l = advertisementType;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        uh0 uh0Var = this.e;
        String str = (String) uh0Var.b;
        gi0 gi0Var = (gi0) obj;
        fxs fxsVar = this.b;
        sni sniVar = fxsVar.g;
        y31.b bVar = fxsVar.e;
        long i = sniVar.i();
        boolean z = gi0Var instanceof gi0.a;
        boolean z2 = this.c;
        boolean z3 = this.d;
        y31.a aVar = this.g;
        if (z) {
            dxs s = fxsVar.s();
            gi0.a aVar2 = (gi0.a) gi0Var;
            AdvertisementType advertisementType = aVar2.c;
            dxs.a a = s.a(advertisementType);
            Activity activity = this.f;
            WebAdConfig webAdConfig = this.h;
            if (a == null || !(a.g || a.a(i))) {
                fxsVar.v(uh0Var, activity, aVar, aVar2, new fxs.a(z2, z3), webAdConfig);
            } else if (a.a(i)) {
                if (z2) {
                    AdvertisementType advertisementType2 = aVar.d;
                    cxs cxsVar = a.f;
                    int i2 = a.b;
                    long j = this.i;
                    y31.a aVar3 = new y31.a(j, advertisementType2, this.j, advertisementType2);
                    gnl gnlVar = e370.m;
                    if (gnlVar == null) {
                        gnlVar = null;
                    }
                    gnlVar.a().c(advertisementType2, j, i2);
                    cxsVar.b(new com.vk.im.ui.fragments.chat.a(fxsVar, activity, aVar3, webAdConfig, 2));
                    r31 r31Var = (r31) fxsVar.b;
                    gnl gnlVar2 = e370.m;
                    if (gnlVar2 == null) {
                        gnlVar2 = null;
                    }
                    r31Var.f = gnlVar2.a().d();
                    fxsVar.s().a.put(advertisementType, null);
                    cxsVar.show(activity);
                } else if (z3) {
                    bVar.d(advertisementType, true, str);
                }
            } else if (a.g) {
                if (z2) {
                    a.d = true;
                } else if (z3) {
                    a.e = true;
                }
            }
        } else {
            if (!epx.f(gi0Var, gi0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2 || z3) {
                bVar.f(aVar.d, true ^ z2, this.k, str);
                fxsVar.s().a.put(this.l, null);
            }
        }
        return s3q0.a;
    }
}
