package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

/* loaded from: classes6.dex */
public final class fiu0 implements giu0 {
    public final String a;
    public final LineState b;
    public final String c;
    public final wp2 d;
    public final String e;
    public final int f;

    public fiu0(String str, LineState lineState, String str2, AppColor$Palette appColor$Palette, String str3, int i) {
        this.a = str;
        this.b = lineState;
        this.c = str2;
        this.d = appColor$Palette;
        this.e = str3;
        this.f = i;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }
}
