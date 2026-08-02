package xsna;

import com.vk.api.generated.account.dto.AccountInfoSettingsDto;
import java.util.Iterator;
import java.util.List;

/* compiled from: MoneyConfigFromDtoMapper.kt */
/* loaded from: classes2.dex */
public final class h730 {
    public static boolean a(String str, List list) {
        Object obj;
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((AccountInfoSettingsDto) obj).f(), str)) {
                break;
            }
        }
        AccountInfoSettingsDto accountInfoSettingsDto = (AccountInfoSettingsDto) obj;
        if (accountInfoSettingsDto != null) {
            return accountInfoSettingsDto.d();
        }
        return false;
    }
}
