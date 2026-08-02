package xsna;

import android.text.TextUtils;
import com.vk.dto.common.id.UserId;

/* compiled from: AccountValidateAction.java */
/* loaded from: classes14.dex */
public final class zs extends xsg0 {
    public zs(String str, boolean z) {
        super("account.validateAction");
        K("confirm", z ? "1" : "0");
        K("hash", str);
    }

    public zs(UserId userId, String str, boolean z) {
        super(z ? "wall.subscribe" : "wall.unsubscribe");
        F(userId, "owner_id");
        TextUtils.isEmpty(null);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("ref", str);
    }
}
