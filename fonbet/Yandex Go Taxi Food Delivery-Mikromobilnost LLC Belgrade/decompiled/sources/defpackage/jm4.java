package defpackage;

import java.util.LinkedHashSet;
import ru.yandex.taxi.appdelegates.BadgeType;

/* loaded from: classes9.dex */
public class jm4 {
    public final LinkedHashSet a;

    public jm4() {
        BadgeType[] badgeTypeArr = {BadgeType.Plus};
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(1));
        j73.Z(badgeTypeArr, linkedHashSet);
        this.a = linkedHashSet;
    }

    public LinkedHashSet a() {
        return this.a;
    }
}
