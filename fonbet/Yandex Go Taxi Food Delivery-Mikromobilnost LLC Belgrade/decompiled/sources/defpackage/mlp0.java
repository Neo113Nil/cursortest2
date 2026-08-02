package defpackage;

import com.yandex.go.dto.response.Action$SdcRouteSelection;
import com.yandex.go.sdc.api.SdcRouteSelectionAction$Origin;
import com.yandex.go.sdc.api.SdcRouteSelectionAction$ScreenType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class mlp0 {
    public static final ArrayList a(List list) {
        List<Action$SdcRouteSelection.Screen> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Action$SdcRouteSelection.Screen screen : list2) {
            Action$SdcRouteSelection.ScreenType screenType = screen.a;
            int i = screenType == null ? -1 : llp0.a[screenType.ordinal()];
            SdcRouteSelectionAction$ScreenType sdcRouteSelectionAction$ScreenType = null;
            if (i != -1) {
                if (i == 1) {
                    sdcRouteSelectionAction$ScreenType = SdcRouteSelectionAction$ScreenType.SOURCE;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    sdcRouteSelectionAction$ScreenType = SdcRouteSelectionAction$ScreenType.DESTINATION;
                }
            }
            String str = screen.b;
            String str2 = screen.c;
            Action$SdcRouteSelection.Button button = screen.d;
            arrayList.add(new lmp0(sdcRouteSelectionAction$ScreenType, str, str2, new rg7(button.a, button.b, button.c)));
        }
        return arrayList;
    }

    public static vmn0 b(Action$SdcRouteSelection action$SdcRouteSelection) {
        return new vmn0(action$SdcRouteSelection.a, action$SdcRouteSelection.b, a(action$SdcRouteSelection.c), action$SdcRouteSelection.e, action$SdcRouteSelection.d, SdcRouteSelectionAction$Origin.Undefined);
    }
}
