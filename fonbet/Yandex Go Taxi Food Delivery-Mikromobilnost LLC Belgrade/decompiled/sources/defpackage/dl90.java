package defpackage;

import android.text.Editable;
import com.yandex.go.account.user_verification.domain.i;
import java.util.HashMap;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.profile.a;
import ru.yandex.taxi.settings.profile.ProfileAnalyticsReporter$PreviousScreenIdentifier;
import ru.yandex.taxi.settings.profile.rating.PassengerNamePresenter$attachView$$inlined$safeCollectIn$1;
import ru.yandex.taxi.settings.profile.rating.b;
import ru.yandex.taxi.settings.profile.rating.d;

/* loaded from: classes6.dex */
public final class dl90 extends ad5 {
    public final ddf0 A;
    public final i B;
    public String C;
    public ProfileAnalyticsReporter$PreviousScreenIdentifier D;
    public cl90 E;
    public final a x;
    public final zuj0 y;
    public final g z;

    public dl90(a aVar, zuj0 zuj0Var, g gVar, ddf0 ddf0Var, i iVar) {
        super(bl90.class);
        this.x = aVar;
        this.y = zuj0Var;
        this.z = gVar;
        this.A = ddf0Var;
        this.B = iVar;
        this.C = "";
    }

    public final void Kg(bl90 bl90Var) {
        Bg(bl90Var);
        tje.N(Jg(), null, null, new PassengerNamePresenter$attachView$$inlined$safeCollectIn$1(new b(e.T(new d(this.x.d), 1), this), null, this, bl90Var), 3);
        ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier = this.D;
        if (profileAnalyticsReporter$PreviousScreenIdentifier != null) {
            ddf0 ddf0Var = this.A;
            cdf0 a = ddf0Var.a();
            jj10 jj10Var = ddf0Var.d;
            String str = a.a;
            Boolean valueOf = Boolean.valueOf(a.b);
            Boolean valueOf2 = Boolean.valueOf(a.c);
            String context = profileAnalyticsReporter$PreviousScreenIdentifier.getContext();
            jj10Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("rating", str);
            hashMap.put("photo_flg", valueOf);
            hashMap.put("user_name_flg", valueOf2);
            if (context != null) {
                hashMap.put("context", context);
            }
            jj10Var.a.a("Menu.UserName.CardShown", hashMap, 1, new HashMap());
        }
    }

    public final void Lg(Editable editable) {
        String obj = editable != null ? editable.toString() : null;
        if (obj == null) {
            obj = "";
        }
        this.C = obj;
        ((bl90) Dg()).makeButtonActive(!evu0.J(this.C));
    }

    public final void Mg() {
        ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier = this.D;
        if (profileAnalyticsReporter$PreviousScreenIdentifier != null) {
            ddf0 ddf0Var = this.A;
            cdf0 a = ddf0Var.a();
            jj10 jj10Var = ddf0Var.d;
            String str = a.a;
            Boolean valueOf = Boolean.valueOf(a.b);
            Boolean valueOf2 = Boolean.valueOf(a.c);
            String context = profileAnalyticsReporter$PreviousScreenIdentifier.getContext();
            jj10Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("rating", str);
            hashMap.put("photo_flg", valueOf);
            hashMap.put("user_name_flg", valueOf2);
            if (context != null) {
                hashMap.put("context", context);
            }
            jj10Var.a.a("Menu.UserName.Closed", hashMap, 1, new HashMap());
        }
    }
}
