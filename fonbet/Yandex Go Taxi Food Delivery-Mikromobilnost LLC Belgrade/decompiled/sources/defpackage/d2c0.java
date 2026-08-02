package defpackage;

import java.util.List;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public abstract class d2c0 {
    public static final List a;
    public static final List b;

    static {
        PlacemarkType placemarkType = PlacemarkType.DUST;
        PlacemarkType placemarkType2 = PlacemarkType.ICON;
        a = scc.g(placemarkType, placemarkType2, PlacemarkType.ICON_OVERLAY, PlacemarkType.LABEL_S, PlacemarkType.LABEL_M, PlacemarkType.SELECTED);
        b = scc.g(placemarkType2, PlacemarkType.CLUSTER, PlacemarkType.SUPERCLUSTER);
    }
}
