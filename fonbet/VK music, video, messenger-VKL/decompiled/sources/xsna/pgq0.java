package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MentionModels.kt */
/* loaded from: classes17.dex */
public class pgq0 extends vg6 {
    public final UserId d;
    public final boolean e;

    public pgq0(int i, UserId userId, int i2, String str) {
        super(i, i2, str);
        this.d = userId;
        this.e = fkq0.b(userId);
    }
}
