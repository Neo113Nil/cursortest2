package defpackage;

import java.util.Map;
import java.util.Optional;
import kotlin.collections.b;
import kotlinx.serialization.json.a;
import ru.yandex.taxi.map_common.style.source.model.Theme;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public final class ks00 implements qv00 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r11 == null) goto L24;
     */
    @Override // defpackage.qv00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Optional a(Object obj) {
        String str;
        g5l0 g5l0Var;
        ThemeType themeType;
        hs00 hs00Var = (hs00) obj;
        a aVar = hs00Var.a;
        js00 js00Var = null;
        if (aVar != null && (str = hs00Var.b) != null && (g5l0Var = hs00Var.c) != null) {
            Theme theme = hs00Var.d;
            if (theme != null) {
                int i = ls00.a[theme.ordinal()];
                if (i == 1) {
                    themeType = ThemeType.LIGHT;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    themeType = ThemeType.DARK;
                }
            }
            themeType = ThemeType.LIGHT;
            ThemeType themeType2 = themeType;
            String aVar2 = aVar.toString();
            Float f = g5l0Var.d;
            float floatValue = f != null ? f.floatValue() : 0.0f;
            Float f2 = g5l0Var.c;
            float floatValue2 = f2 != null ? f2.floatValue() : 0.0f;
            String str2 = g5l0Var.b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            boolean z = !jl40.l(g5l0Var.a, Boolean.FALSE);
            Map map = g5l0Var.e;
            if (map == null) {
                map = b.f();
            }
            js00Var = new js00(str, aVar2, floatValue, floatValue2, str3, z, map, themeType2);
        }
        return Optional.ofNullable(js00Var);
    }
}
