package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;
import com.yandex.plus.pay.repository.api.model.contacts.CollectContactsWebUrlParams$Theme;

/* loaded from: classes2.dex */
public final class df41 {
    public static kbc a(PlusPayWebCollectContactsParams plusPayWebCollectContactsParams) {
        CollectContactsWebUrlParams$Theme collectContactsWebUrlParams$Theme;
        int i = cf41.a[plusPayWebCollectContactsParams.getPageTheme().ordinal()];
        if (i == 1) {
            collectContactsWebUrlParams$Theme = CollectContactsWebUrlParams$Theme.LIGHT;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            collectContactsWebUrlParams$Theme = CollectContactsWebUrlParams$Theme.DARK;
        }
        return new kbc(collectContactsWebUrlParams$Theme);
    }
}
