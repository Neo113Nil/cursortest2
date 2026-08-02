package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.List;

/* compiled from: ToggleUpdatesEventBuilder.kt */
/* loaded from: classes5.dex */
public final class x0p0 extends l5m {
    public final List<String> h;

    public x0p0(List<String> list) {
        super(null, null, 3);
        this.h = list;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        List<String> list = this.h;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(list.size() * 30);
        int size = list.size();
        sb.append('[');
        int i = IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE;
        for (String str : list) {
            int length = str.length() + 3;
            if (length <= i) {
                sb.append('\"');
                sb.append(str);
                sb.append("\",");
                i -= length;
                size--;
            }
        }
        sb.setCharAt(sb.length() - 1, ']');
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.TOGGLE_UPDATES.h(), sb.toString(), null, Integer.valueOf(size), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -12, 3, null);
        return super.p();
    }
}
