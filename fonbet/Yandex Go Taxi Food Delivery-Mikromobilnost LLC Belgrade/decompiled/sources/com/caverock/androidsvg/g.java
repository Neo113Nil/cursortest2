package com.caverock.androidsvg;

import defpackage.pt3;
import defpackage.w97;

/* loaded from: classes10.dex */
public class g {
    public w97 a = null;
    public pt3 b = null;

    public final void a(String str) {
        f fVar = new f(CSSParser$MediaType.screen, CSSParser$Source.RenderOptions);
        c cVar = new c(str);
        cVar.q();
        this.a = fVar.e(cVar);
    }
}
