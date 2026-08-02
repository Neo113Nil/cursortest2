package com.yandex.mobile.drive.sdk.map.tools;

import android.content.res.AssetManager;
import com.yandex.mapkit.map.Map;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.ps00;
import defpackage.pzt0;
import defpackage.tje;
import java.util.IdentityHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a {
    public final AssetManager a;
    public final ike b;
    public pzt0 c;
    public final ike d;
    public final r0 e;
    public final IdentityHashMap f;
    public String g;

    public a(AssetManager assetManager) {
        this.a = assetManager;
        ike b = bvf0.b();
        this.b = b;
        this.d = bvf0.b();
        this.e = bvf0.c(null);
        this.c = tje.N(b, null, null, new MapStylizer$loadFromFile$1(this, null), 3);
        this.f = new IdentityHashMap();
    }

    public final void a(Map map) {
        ps00 ps00Var = new ps00(map);
        this.f.put(map, ps00Var);
        String str = this.g;
        if (str != null) {
            map.setMapStyle(42, str);
            ps00Var.b = str;
            return;
        }
        if (this.c == null) {
            this.c = tje.N(this.b, null, null, new MapStylizer$loadFromFile$1(this, null), 3);
        }
        tje.N(this.d, null, null, new MapStylizer$applyStyleFromFile$1(this, null), 3);
    }
}
