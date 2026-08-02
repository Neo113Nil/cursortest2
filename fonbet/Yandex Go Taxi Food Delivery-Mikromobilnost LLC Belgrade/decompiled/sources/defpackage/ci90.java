package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.di.modules.features.l;
import com.ybsdk.feature.partnerselection.internal.data.a;
import com.ybsdk.feature.partnerselection.internal.data.b;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ci90 implements ai90, kcs {
    public final /* synthetic */ tc9 a;
    public final mi90 b;
    public final a c;
    public final b d;
    public final gi90 e;
    public final l f;
    public final j3h g;
    public final pi90 h;
    public final tfl0 i;
    public final com.ybsdk.utils.poller.b j;
    public final tv3 k;

    public ci90(mi90 mi90Var, a aVar, b bVar, gi90 gi90Var, l lVar, j3h j3hVar, pi90 pi90Var, tfl0 tfl0Var, com.ybsdk.utils.poller.b bVar2, tv3 tv3Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = mi90Var;
        this.c = aVar;
        this.d = bVar;
        this.e = gi90Var;
        this.f = lVar;
        this.g = j3hVar;
        this.h = pi90Var;
        this.i = tfl0Var;
        this.j = bVar2;
        this.k = tv3Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }
}
