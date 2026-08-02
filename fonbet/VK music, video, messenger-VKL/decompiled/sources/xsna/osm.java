package xsna;

import com.vk.dto.user.RequestUserProfile;
import xsna.jav;
import xsna.ytm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class osm implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ osm(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ytm ytmVar = (ytm) this.c;
                psm psmVar = (psm) this.d;
                ytm.r rVar = (ytm.r) ytmVar;
                if (rVar.d) {
                    psmVar.k.c().b(rVar.b);
                    break;
                }
                break;
            default:
                uzb0 uzb0Var = (uzb0) this.c;
                RequestUserProfile requestUserProfile = (RequestUserProfile) this.d;
                uzb0Var.c.a(ne7.s(requestUserProfile), jav.a.a, new x8m(29));
                break;
        }
    }
}
