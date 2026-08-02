package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ChannelEditApiCmd.kt */
/* loaded from: classes2.dex */
public final class jya extends nx2<Boolean> {
    public final UserId b;
    public final String c;
    public final String d;
    public final boolean e;

    public jya(UserId userId, boolean z, String str, String str2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        try {
            UserId userId = this.b;
            String str = this.c;
            String str2 = this.d;
            boolean z = this.e;
            tfx tfxVar = new tfx("channels.edit", new gr(7), new sn(11));
            tfx.n(tfxVar, "channel_id", userId, 0L, -1L, 4);
            if (str != null) {
                tfx.o(tfxVar, "title", str, 0, 0, 12);
            }
            if (str2 != null) {
                tfx.o(tfxVar, "photo", str2, 0, 0, 12);
            }
            tfxVar.j("can_comment", z);
            return Boolean.valueOf(((BaseBoolIntDto) bz2.d(tfxVar)) == BaseBoolIntDto.YES);
        } catch (Throwable th) {
            th.printStackTrace();
            throw th;
        }
    }
}
