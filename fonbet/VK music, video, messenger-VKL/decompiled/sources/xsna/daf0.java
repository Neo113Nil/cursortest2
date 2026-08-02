package xsna;

import java.util.List;

/* compiled from: RecomSettingsService.kt */
/* loaded from: classes2.dex */
public interface daf0 {
    default tfx a(String str) {
        tfx tfxVar = new tfx("recomSettings.getRecomThemes", new n5e0(2), new wga0(2));
        if (str != null) {
            tfx.o(tfxVar, "device_id", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx b() {
        return new tfx("recomSettings.recomThemesShown", new ck70(7), new qr(28));
    }

    default tfx c(String str, List list) {
        tfx tfxVar = new tfx("recomSettings.setRecomThemes", new rr(28), new zn(28));
        if (list != null) {
            tfxVar.i("recom_themes_ids", list);
        }
        if (str != null) {
            tfx.o(tfxVar, "from_screen", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx d() {
        return new tfx("recomSettings.getAvailableRecomThemes", new vga0(3), new caf0(0));
    }
}
