package xsna;

import com.ironsource.X3;
import com.vk.dto.user.RequestUserProfile;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.socialgraph.SocialGraphOpenParams;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.socialgraph.SocialStatSender;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c3q;
import xsna.itx;
import xsna.kdk0;
import xsna.sdk0;

/* compiled from: SocialGraphFriendsFeature.kt */
/* loaded from: classes5.dex */
public final class ldk0 extends wk50<ydk0, xdk0, kdk0, sdk0> {
    public boolean f;
    public final rdk0 g;
    public Object h;
    public final f4z i;

    public ldk0(vdk0 vdk0Var) {
        super(null, vdk0Var);
        this.g = new rdk0();
        this.h = EmptyList.b;
        this.i = new f4z();
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.List] */
    @Override // xsna.wk50
    public final void N(xdk0 xdk0Var, kdk0 kdk0Var) {
        kdk0 kdk0Var2 = kdk0Var;
        boolean z = kdk0Var2 instanceof kdk0.a;
        int i = 19;
        int i2 = 4;
        int i3 = 13;
        int i4 = 3;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        int i5 = 1;
        if (z) {
            RequestUserProfile requestUserProfile = ((kdk0.a) kdk0Var2).b;
            if (!this.f) {
                RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
                RegistrationElementsTracker.a.a(TrackingElement.Registration.FRIEND_ASK, null);
                this.f = true;
            }
            Boolean bool = requestUserProfile.i0;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            boolean z2 = !booleanValue;
            c3q a = c3q.a.a(requestUserProfile.c, requestUserProfile.t0, z2);
            SocialStatSender.Element element = !booleanValue ? SocialStatSender.Element.ADD : SocialStatSender.Element.REMOVE;
            if (dd80.u != null) {
                com.vk.auth.main.j.m(SocialStatSender.Screen.CONTACTS, SocialStatSender.Status.FRIENDS, "click", element);
            }
            String str = requestUserProfile.J;
            if (str != null && !drm0.N(str)) {
                a.H0(requestUserProfile.J);
            }
            bVar.b(rsg0.y0(a, null, null, 3).subscribe(new le50(new plh(requestUserProfile, z2, this), i3), new o3y(new lxh0(this, i2), i)));
            return;
        }
        if (kdk0Var2 instanceof kdk0.c) {
            com.vk.auth.main.j jVar = dd80.u;
            if (jVar != null) {
                jVar.k(SocialStatSender.Screen.CONTACTS, SocialStatSender.Status.FRIENDS);
            }
            com.vk.socialgraph.a aVar = dd80.t;
            if (aVar != null) {
                aVar.d(SocialGraphStrategy.Screen.CONTACTS, new SocialGraphOpenParams(SocialGraphOpenParams.OpenAction.NEXT_BUTTON), false);
                return;
            }
            return;
        }
        if (kdk0Var2 instanceof kdk0.b) {
            if (dd80.u != null) {
                com.vk.auth.main.j.m(SocialStatSender.Screen.CONTACTS, SocialStatSender.Status.FRIENDS, X3.g.e, null);
                return;
            }
            return;
        }
        if (kdk0Var2 instanceof kdk0.d) {
            T(sdk0.b.c.b);
            rdk0 rdk0Var = this.g;
            rdk0Var.getClass();
            io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.s0(new pdk0()).L(new nh40(new skj0(rdk0Var, i5), 15), false).U(new ly80(new z7w(22), i4)).U(new zj0(new rj60(this, 23), 27));
            asu0.a.getClass();
            bVar.b(U.r0(asu0.r()).subscribe(new xk30(new q8i0(this, i2), i), new tmz(new l850(this, 12), i3)));
            return;
        }
        if (!(kdk0Var2 instanceof kdk0.e)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = ((kdk0.e) kdk0Var2).b;
        if (drm0.N(str2)) {
            T(new sdk0.b.C3663b(this.h));
            return;
        }
        ArrayList E = g5g.E((Iterable) this.h, itx.a.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = E.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (drm0.D(((itx.a) next).a.e, str2, true)) {
                arrayList.add(next);
            }
        }
        T(new sdk0.b.d(arrayList));
    }
}
