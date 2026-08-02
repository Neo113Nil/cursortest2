package defpackage;

import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionSubtypeDto;

/* loaded from: classes13.dex */
public final class j670 {
    public static dq a(String str, ActionDto$OpenNavigatorActionSubtypeDto actionDto$OpenNavigatorActionSubtypeDto) {
        OpenNavigatorActionSubtype openNavigatorActionSubtype;
        int i = i670.a[actionDto$OpenNavigatorActionSubtypeDto.ordinal()];
        if (i == 1) {
            openNavigatorActionSubtype = OpenNavigatorActionSubtype.GO_VIA_ACTION;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            openNavigatorActionSubtype = OpenNavigatorActionSubtype.GO_TO_ACTION;
        }
        return new dq(openNavigatorActionSubtype, str);
    }
}
