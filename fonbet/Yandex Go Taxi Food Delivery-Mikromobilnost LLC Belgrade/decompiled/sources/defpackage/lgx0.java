package defpackage;

import android.text.SpannableStringBuilder;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.TariffModifierInfo;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class lgx0 {
    public final c a;

    public lgx0(c cVar) {
        this.a = cVar;
    }

    public final SpannableStringBuilder a(List list, TariffModifierInfo.ModifierShowMode modifierShowMode) {
        ServiceLevel.Branding branding;
        Object obj;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ServiceLevel.Branding branding2 = (ServiceLevel.Branding) obj;
                if (branding2.c == ServiceLevel.Branding.Type.TARIFF_MODIFIER && branding2.m.b.contains(modifierShowMode)) {
                    break;
                }
            }
            branding = (ServiceLevel.Branding) obj;
        } else {
            branding = null;
        }
        if (branding == null) {
            return null;
        }
        return c.f(this.a, branding.m.a, false, null, 14);
    }
}
