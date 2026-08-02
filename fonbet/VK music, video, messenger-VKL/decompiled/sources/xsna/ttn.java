package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vk.dto.common.id.UserId;

/* compiled from: DocsAdd.java */
/* loaded from: classes14.dex */
public final class ttn extends xsg0 {
    public ttn(UserId userId, int i, @Nullable String str) {
        super("docs.add");
        F(userId, "oid");
        F(userId, "owner_id");
        C(i, "did");
        C(i, "doc_id");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("access_key", str);
    }
}
