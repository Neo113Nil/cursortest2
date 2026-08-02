package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.profile.a;
import ru.yandex.taxi.settings.profile.ProfileAnalyticsReporter$PreviousScreenIdentifier;

/* loaded from: classes14.dex */
public final class ddf0 {
    public final a a;
    public final g b;
    public final u8w c;
    public final jj10 d;
    public final ps21 e;

    public ddf0(a aVar, g gVar, u8w u8wVar, jj10 jj10Var, ps21 ps21Var) {
        this.a = aVar;
        this.b = gVar;
        this.c = u8wVar;
        this.d = jj10Var;
        this.e = ps21Var;
    }

    public final cdf0 a() {
        n150 a = this.a.a();
        kj Ig = this.b.a.Ig();
        String str = a.b;
        if (str == null) {
            str = "";
        }
        String str2 = a.a;
        boolean z = false;
        boolean z2 = !(str2 == null || str2.length() == 0);
        if (Ig != null && !Ig.i) {
            z = true;
        }
        return new cdf0(str, z, z2);
    }

    public final void b(ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier) {
        cdf0 a = a();
        String str = a.a;
        Boolean valueOf = Boolean.valueOf(a.b);
        Boolean valueOf2 = Boolean.valueOf(a.c);
        String context = profileAnalyticsReporter$PreviousScreenIdentifier.getContext();
        jj10 jj10Var = this.d;
        jj10Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("rating", str);
        hashMap.put("photo_flg", valueOf);
        hashMap.put("user_name_flg", valueOf2);
        if (context != null) {
            hashMap.put("context", context);
        }
        jj10Var.a.a("Menu.UserName.RatingShown", hashMap, 1, new HashMap());
    }
}
