package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vk.friends.requests.api.di.ScreenType;

/* compiled from: FriendsRequestsHolderFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class oss implements ris {
    public final String a;
    public final mss b;
    public final cis c;
    public final UserId d;
    public final ScreenType e;

    public oss(String str, mss mssVar, cis cisVar, UserId userId, ScreenType screenType) {
        this.a = str;
        this.b = mssVar;
        this.c = cisVar;
        this.d = userId;
        this.e = screenType;
    }

    @Override // xsna.ris
    public final ld6 a(ViewGroup viewGroup, hss hssVar) {
        cis cisVar = this.c;
        if (cisVar == null) {
            cisVar = cis.k;
        }
        cis cisVar2 = cisVar;
        boolean I = hssVar.I();
        String str = this.a;
        mss mssVar = this.b;
        if (I) {
            return new cjs(viewGroup, str, mssVar, hssVar);
        }
        boolean a = hssVar.a();
        boolean z = !hssVar.a();
        boolean z2 = !hssVar.a();
        if (cisVar2.e) {
            return new cjs(viewGroup, str, mssVar, hssVar);
        }
        if (cisVar2.h) {
            wis wisVar = new wis(viewGroup, this.a, mssVar, cisVar2, hssVar);
            wisVar.L = a && wisVar.q.d;
            wisVar.J = z;
            wisVar.K = z2;
            return wisVar;
        }
        if (!cisVar2.f && !cisVar2.g) {
            return new cjs(viewGroup, str, mssVar, hssVar);
        }
        if (cisVar2.j) {
            return new yis(viewGroup, this.a, mssVar, cisVar2, hssVar, this.d, this.e);
        }
        ajs ajsVar = new ajs(viewGroup, this.a, mssVar, cisVar2, hssVar);
        ajsVar.I = a && ajsVar.q.d;
        ajsVar.H = z2;
        return ajsVar;
    }
}
