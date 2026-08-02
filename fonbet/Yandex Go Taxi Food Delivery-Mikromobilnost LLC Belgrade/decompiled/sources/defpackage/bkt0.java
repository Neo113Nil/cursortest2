package defpackage;

import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;

/* loaded from: classes13.dex */
public final class bkt0 {
    public final lhn a;

    public bkt0(lhn lhnVar) {
        this.a = lhnVar;
    }

    public static zjt0 a(ShortcutViewSourceType shortcutViewSourceType, Object[] objArr) {
        Object obj;
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = objArr[i];
            if ((obj instanceof zjt0) && ((zjt0) obj).a == shortcutViewSourceType) {
                break;
            }
            i++;
        }
        return (zjt0) obj;
    }
}
