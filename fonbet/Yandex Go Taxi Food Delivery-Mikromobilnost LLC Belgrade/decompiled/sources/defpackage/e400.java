package defpackage;

import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes5.dex */
public final class e400 {
    public final pho a;

    public e400(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("main_screen_version", str);
        }
        this.a.a("Main.MainScreenShown", hashMap, 1, new HashMap());
    }

    public final void b(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("position", str);
        }
        if (str2 != null) {
            hashMap.put("content", str2);
        }
        if (str3 != null) {
            hashMap.put("id", str3);
        }
        x4e.B(this.a, "Main.PromoObject.Shown", hashMap, 1);
    }

    public final void c(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("id", str);
        }
        this.a.a("Main.Splash.Opened", hashMap, 1, new HashMap());
    }

    public final void d(String str, String str2) {
        HashMap u = g8e.u(MetaDataField.SCREEN_FIELD, str, "ErrorType", "shortcuts_not_loaded");
        if (str2 != null) {
            u.put("ErrorInfo", str2);
        }
        this.a.a("Main.SuggestCard.Error", u, 1, tse0.r("main_screen_version", u, "shortcuts"));
    }
}
