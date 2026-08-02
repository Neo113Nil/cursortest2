package xsna;

import android.text.TextUtils;
import com.vk.dto.common.id.UserId;

/* compiled from: DocsGetUploadServer.kt */
/* loaded from: classes14.dex */
public final class vtn extends nd6 {
    public vtn(UserId userId, String str, String str2) {
        super(str);
        if (fkq0.b(userId)) {
            F(fkq0.e(userId), "group_id");
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        K("type", str2);
    }

    public vtn(UserId userId, boolean z) {
        this(userId, z ? "docs.getWallUploadServer" : "docs.getUploadServer", null);
    }

    public vtn(UserId userId, String str) {
        this(userId, "docs.getUploadServer", str);
    }
}
