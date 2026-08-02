package defpackage;

/* loaded from: classes9.dex */
public final class gku {
    public final fku a;

    public gku(fku fkuVar) {
        this.a = fkuVar;
    }

    public static yju a(eku ekuVar) {
        hst hstVar;
        String str;
        boolean h = ekuVar.h();
        String str2 = ekuVar.d;
        boolean z = ekuVar.e;
        yju yjuVar = yju.n;
        if (!h) {
            return yjuVar;
        }
        if (!z && evu0.J(str2)) {
            hstVar = jst.e;
            str = "no landing url for non-native flow";
        } else if (z && evu0.J(d6z.Y(ekuVar, "hire_driver_native_send_button_title"))) {
            hstVar = jst.e;
            str = "no button title for native flow";
        } else if (z && !evu0.J(d6z.Y(ekuVar, "hire_driver_native_info_title")) && evu0.J(str2)) {
            hstVar = jst.e;
            str = "no landing url for info in native flow";
        } else if (z && evu0.J(d6z.Y(ekuVar, "hire_driver_native_success_notification_title"))) {
            hstVar = jst.e;
            str = "no notification title for native flow";
        } else {
            if (!z || !evu0.J(d6z.Y(ekuVar, "hire_driver_agreement"))) {
                return new yju(ekuVar.d, d6z.Y(ekuVar, "hire_driver_menu_button_text"), d6z.Y(ekuVar, "hire_driver_native_title"), d6z.Y(ekuVar, "hire_driver_native_subtitle"), d6z.Y(ekuVar, "hire_driver_native_info_title"), d6z.Y(ekuVar, "hire_driver_native_info_subtitle"), d6z.Y(ekuVar, "hire_driver_native_send_button_title"), d6z.Y(ekuVar, "hire_driver_native_send_button_subtitle"), d6z.Y(ekuVar, "hire_driver_native_success_notification_title"), d6z.Y(ekuVar, "hire_driver_native_success_notification_subtitle"), d6z.Y(ekuVar, "hire_driver_agreement"), ekuVar.f, ekuVar.e);
            }
            hstVar = jst.e;
            str = "no agreement text for native flow";
        }
        g8e.C(str, hstVar);
        return yjuVar;
    }
}
