package defpackage;

import com.yandex.go.clarify_address.before_order.ClarifyAddressBeforeOrderOrigin;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;

/* loaded from: classes.dex */
public final class mxb {
    public final c a;
    public ClarifyAddressBeforeOrderOrigin b;
    public boolean c;
    public boolean d = true;

    public mxb(c cVar) {
        this.a = cVar;
    }

    public final void a(ClarifyAddressBeforeOrderOrigin clarifyAddressBeforeOrderOrigin) {
        switch (lxb.a[clarifyAddressBeforeOrderOrigin.ordinal()]) {
            case 1:
                if (this.a.b() != Screen.MAIN_V4) {
                    clarifyAddressBeforeOrderOrigin = ClarifyAddressBeforeOrderOrigin.EXPECTED_DESTINATION_SHORTCUT;
                    break;
                } else {
                    clarifyAddressBeforeOrderOrigin = ClarifyAddressBeforeOrderOrigin.SUPERAPP_SHORTCUT;
                    break;
                }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                w511.b();
                return;
        }
        this.b = clarifyAddressBeforeOrderOrigin;
    }
}
