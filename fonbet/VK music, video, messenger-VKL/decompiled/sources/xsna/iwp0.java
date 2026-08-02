package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.HashMap;

/* compiled from: UGCStickersStorage.kt */
/* loaded from: classes5.dex */
public final class iwp0 {
    public final kyp0 a;
    public final zvp0 b;

    public iwp0() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        this.a = StickersDatabase.a.b().J();
        this.b = StickersDatabase.a.b().I();
    }

    public final UGCChatSettingsModel a(long j) {
        bwp0 a = this.b.a(j);
        if (a != null) {
            return new UGCChatSettingsModel(a.a, a.b, a.c, a.d, a.e, a.f, a.g);
        }
        return null;
    }
}
