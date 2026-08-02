package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: MusicPlaylistHandler.kt */
/* loaded from: classes7.dex */
public final class xz40 implements fhd0, lao0 {
    public final a550 a;

    public xz40(a550 a550Var) {
        this.a = a550Var;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        int i;
        String str = blk.O(fgxVar).d;
        if (str == null) {
            str = MusicPlaybackLaunchContext.P.t();
        }
        String str2 = str;
        long l = cqm0.l(fgxVar.c("uid"));
        gzs<s3q0> gzsVar = fkq0.a;
        UserId userId = new UserId(l);
        try {
            i = Integer.parseInt(fgxVar.c("albumId"));
        } catch (Throwable unused) {
            i = 0;
        }
        int i2 = i;
        String str3 = (String) fgxVar.f.get("accessKey");
        a550 a550Var = this.a;
        Context context = fgxVar.e;
        String str4 = blk.O(fgxVar).e;
        if (str4 == null) {
            str4 = "";
        }
        a550.b(a550Var, context, userId, i2, str3, str2, null, str4, 96);
        blk.P(fgxVar).onSuccess();
    }
}
