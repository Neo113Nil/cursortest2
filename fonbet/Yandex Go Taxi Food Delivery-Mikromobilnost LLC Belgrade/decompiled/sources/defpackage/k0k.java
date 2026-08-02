package defpackage;

import android.content.Context;
import com.yandex.go.loyalty.api.data.model.common.ColorDto;
import com.yandex.go.loyalty.api.data.model.common.ColorSettings;
import com.yandex.go.loyalty.api.data.model.common.LinearColorSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.plus.api.dto.state.plaque.d;
import ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings;

/* loaded from: classes6.dex */
public final class k0k {
    public final hld0 a;
    public final wwx0 b;

    public k0k(hld0 hld0Var, wwx0 wwx0Var) {
        this.a = hld0Var;
        this.b = wwx0Var;
    }

    public final ne20 a(ShapeSettings.CornerSettings cornerSettings) {
        int i = i0k.b[cornerSettings.a.ordinal()];
        if (i == 1) {
            return new ke20(tje.x(this.a.a, cornerSettings.b));
        }
        if (i == 2) {
            return l76.G;
        }
        w511.b();
        return null;
    }

    public final g0k b(d dVar, boolean z) {
        pe20 pe20Var;
        ee20 ee20Var = vvb1.F;
        d.a aVar = dVar.a;
        float f = aVar.a;
        hld0 hld0Var = this.a;
        float x = tje.x(hld0Var.a, f);
        float f2 = aVar.d;
        Context context = hld0Var.a;
        d0k d0kVar = new d0k(x, tje.x(context, f2), tje.x(context, aVar.b), tje.x(context, aVar.c));
        ColorSettings colorSettings = (ColorSettings) a.R(dVar.b);
        ColorSettings.Type type = colorSettings != null ? colorSettings.a : null;
        if ((type == null ? -1 : i0k.a[type.ordinal()]) == 1) {
            LinearColorSettings linearColorSettings = colorSettings.b;
            wwx0 wwx0Var = this.b;
            if (linearColorSettings == null) {
                wwx0Var.c("DisplaySettingsMapper:EMPTY_LINEAR_STRUCTURE", "Empty linear structure for LINEAR background type", null);
            } else {
                List<ColorDto> list = linearColorSettings.a;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (ColorDto colorDto : list) {
                    String str = colorDto.a;
                    float f3 = colorDto.b;
                    Integer S = q5z.S(str);
                    if (S == null) {
                        wwx0Var.c("DisplaySettingsMapper:PARSE_COLOR_ERROR", "Error with parse color=" + colorDto.a, null);
                        pe20Var = new pe20(0, f3);
                    } else {
                        pe20Var = new pe20(S.intValue(), f3);
                    }
                    arrayList.add(pe20Var);
                }
                ee20Var = new ae20(arrayList, LinearColorSettings.e(linearColorSettings.b), LinearColorSettings.e(linearColorSettings.c));
            }
        }
        ShapeSettings shapeSettings = dVar.c;
        return new g0k(d0kVar, new te20(ee20Var, new re20(a(shapeSettings.a), a(shapeSettings.b), a(shapeSettings.d), a(shapeSettings.c)), z));
    }
}
