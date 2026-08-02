package defpackage;

import com.yandex.delivery.mapper.model.LocalIconName;

/* loaded from: classes5.dex */
public final class i3z {
    public static LocalIconName a(String str) {
        LocalIconName localIconName;
        LocalIconName[] values = LocalIconName.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                localIconName = null;
                break;
            }
            localIconName = values[i];
            if (cvu0.t(localIconName.name(), str, true)) {
                break;
            }
            i++;
        }
        return localIconName == null ? LocalIconName.UNKNOWN_ICON_NAME : localIconName;
    }
}
