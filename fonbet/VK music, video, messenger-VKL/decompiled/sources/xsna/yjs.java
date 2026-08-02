package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: FriendsAdd.java */
/* loaded from: classes14.dex */
public final class yjs extends rsg0<Integer> {
    public yjs(UserId userId) {
        super("friends.add");
        F(userId, "user_id");
    }

    public final void F0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("source", str);
    }

    public final void H0(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("track_code", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(@NonNull JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            return Integer.valueOf(jSONObject.getInt("response"));
        } catch (Exception unused) {
            return null;
        }
    }

    public yjs(UserId userId, String str) {
        this(userId, str, 0, 0, UserId.d);
    }

    public yjs(UserId userId, int i) {
        this(userId, null, i, 0, UserId.d);
    }

    public yjs(UserId userId, String str, int i, int i2, UserId userId2) {
        super("friends.add");
        F(userId, "user_id");
        if (i != 0) {
            C(i, "follow");
        }
        if (!TextUtils.isEmpty(str)) {
            K("text", str);
        }
        if (i2 != 0) {
            C(i2, "video_id");
        }
        if (fkq0.c(userId2)) {
            F(userId2, "owner_id");
        }
    }
}
