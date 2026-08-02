package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class jwv implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        Text text;
        iwv iwvVar = (iwv) obj;
        boolean z = iwvVar instanceof ewv;
        boolean z2 = iwvVar instanceof hwv;
        kao kaoVar = null;
        kaoVar = null;
        hwv hwvVar = z2 ? (hwv) iwvVar : null;
        String str = hwvVar != null ? hwvVar.a : null;
        if (str == null) {
            str = "";
        }
        if (!iwvVar.equals(cwv.a) && !iwvVar.equals(ewv.a)) {
            if (iwvVar.equals(fwv.a)) {
                kaoVar = r501.a(null, new Text.Resource(dzh0.ybsdk_common_need_update_title), Text.Empty.INSTANCE, new Text.Resource(dzh0.ybsdk_common_button_cancel), null, null, null, null, null, null, null, null, "NeedUpdate", 32739);
            } else if (z2) {
                hwv hwvVar2 = (hwv) iwvVar;
                kaoVar = r501.a(null, new Text.Resource(dzh0.ybsdk_common_support_title), new Text.Resource(dzh0.ybsdk_common_support_message), new Text.Resource(dzh0.ybsdk_common_send_message_to_support), hwvVar2.b ? unr0.h(Text.Companion, dzh0.ybsdk_dashboard_menu_logout) : null, null, null, null, null, null, new nbv(rxg0.ybsdk_ic_blocked, null), null, hwvVar2.c, 30659);
            } else if (iwvVar instanceof bwv) {
                bwv bwvVar = (bwv) iwvVar;
                Text a = xty0.a(Integer.valueOf(dzh0.ybsdk_common_support_title), bwvVar.a);
                String str2 = bwvVar.b;
                String str3 = bwvVar.i;
                if (str2 == null || evu0.J(str2)) {
                    text = Text.Empty.INSTANCE;
                } else {
                    b bVar = Text.Companion;
                    String format = String.format(str2, Arrays.copyOf(new Object[]{str3 != null ? str3 : ""}, 1));
                    bVar.getClass();
                    text = new Text.Constant(format);
                }
                Text text2 = text;
                Text a2 = xty0.a(null, bwvVar.c);
                String str4 = bwvVar.e;
                Text a3 = xty0.a(null, str4 != null ? unr0.p("<a href=\"", bwvVar.f, "\">", str4, "</a>") : null);
                rbv c = fob1.c(bwvVar.g, bwvVar.h, new xuv(3));
                if (c == null) {
                    c = new nbv(rxg0.ybsdk_ic_blocked, null);
                }
                kaoVar = r501.a(null, a, text2, a2, null, null, null, null, null, null, c, a3, "DeeplinkError", 26595);
            } else if (iwvVar instanceof dwv) {
                kaoVar = r501.a(((dwv) iwvVar).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534);
            } else {
                if (!(iwvVar instanceof gwv)) {
                    w511.b();
                    return null;
                }
                kaoVar = r501.a(((gwv) iwvVar).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534);
            }
        }
        return new qwv(z, str, kaoVar);
    }
}
