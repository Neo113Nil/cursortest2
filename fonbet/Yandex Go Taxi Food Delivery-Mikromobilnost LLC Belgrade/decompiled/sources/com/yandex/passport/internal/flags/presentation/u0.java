package com.yandex.passport.internal.flags.presentation;

import com.google.ar.core.ImageMetadata;
import defpackage.bts;
import defpackage.fid;
import defpackage.sls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.yx40;
import defpackage.zy11;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class u0 implements wls {
    public final /* synthetic */ sls a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ ArrayList x;
    public final /* synthetic */ androidx.compose.foundation.lazy.b y;
    public final /* synthetic */ yx40 z;

    public u0(sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, ArrayList arrayList, androidx.compose.foundation.lazy.b bVar, yx40 yx40Var) {
        this.a = slsVar;
        this.b = slsVar2;
        this.c = slsVar3;
        this.w = slsVar4;
        this.x = arrayList;
        this.y = bVar;
        this.z = yx40Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        c1.a(this.a, this.b, this.c, this.w, null, wwg.S(-1683488522, true, new t0(this.x, this.y, this.z), fidVar), fidVar, ImageMetadata.EDGE_MODE);
        return zy11.a;
    }
}
