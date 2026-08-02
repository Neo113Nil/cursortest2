package defpackage;

import android.net.Uri;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes6.dex */
public final class e1g0 implements c1g0 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;

    public e1g0(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = h3yVar5;
        this.f = h3yVar6;
    }

    public final boolean a(u2h u2hVar, String str, boolean z, NotificationShareData.a aVar) {
        if (!z && !((MainUiAvailabilityMonitor) this.d.get()).a()) {
            return false;
        }
        ((zh11) this.f.get()).a(u2hVar.d);
        String str2 = u2hVar.b;
        if ((str2 == null || evu0.J(str2)) && evu0.J(u2hVar.c)) {
            return false;
        }
        ((xk60) this.c.get()).n(u2hVar, aVar, str);
        return true;
    }

    public final boolean b(u2h u2hVar, String str, boolean z, NotificationShareData.a aVar) {
        f fVar = (f) this.a.get();
        Uri uri = u2hVar.d;
        fVar.getClass();
        if (uri == null) {
            return false;
        }
        if (!"route".equalsIgnoreCase(uri.getAuthority()) && !og21.b(uri)) {
            fVar.f.getClass();
            String authority = uri.getAuthority();
            if ((authority != null && !evu0.J(authority)) || !uri.isHierarchical() || !uri.getQueryParameterNames().contains("ref")) {
                if (fVar.b.a(uri) == null) {
                    return false;
                }
                if ("chat".equalsIgnoreCase(uri.getAuthority())) {
                    jst.e.k(new IllegalStateException("Chat deeplinks should not be checked in this method"), "Chat deeplinks should not be checked in this method");
                    return false;
                }
            }
        }
        a(u2hVar, str, z, aVar);
        return true;
    }
}
