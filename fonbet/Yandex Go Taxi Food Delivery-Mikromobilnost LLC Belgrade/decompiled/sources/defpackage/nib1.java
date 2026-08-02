package defpackage;

import android.view.View;
import com.yandex.go.design.compose.modal.bottomsheet.c;

/* loaded from: classes11.dex */
public abstract class nib1 {
    public static final void a(gea geaVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-995769240);
        int i2 = (btsVar.k(geaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c.a(null, null, null, false, false, null, null, null, null, null, null, wwg.S(-1377365048, true, new l0(7, geaVar, tlsVar), btsVar), btsVar, 0, 48, 2047);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(geaVar, tlsVar, i, 1);
        }
    }

    public static final void b(View view, boolean z, boolean z2) {
        view.setBackgroundResource((z && z2) ? wwg0.msg_bg_layout_suggest_clickable : (!z || z2) ? (z || !z2) ? wwg0.msg_bg_regular_suggest : wwg0.msg_bg_regular_suggest_clickable : wwg0.msg_bg_layout_suggest);
    }

    public static final String c(String str) {
        return g8e.o("market://details?id=", str);
    }

    public static final String d(String str) {
        return g8e.o("https://play.google.com/store/apps/details?id=", str);
    }
}
