package xsna;

import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: PhotosHandler.kt */
/* loaded from: classes7.dex */
public final class jfa0 implements fhd0, lao0 {
    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        int i;
        int i2;
        String str = blk.O(fgxVar).d;
        if (str == null) {
            str = MusicPlaybackLaunchContext.P.t();
        }
        String str2 = str;
        String c = fgxVar.c("photoId");
        String a = fgxVar.a("display_mode");
        String a2 = fgxVar.a("reply");
        String a3 = fgxVar.a("access_key");
        String a4 = fgxVar.a("recognition_tags");
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(a4);
        } catch (Throwable unused) {
            i = 0;
        }
        try {
            i2 = Integer.parseInt(fgxVar.a("real_tags"));
        } catch (Throwable unused2) {
            i2 = 0;
        }
        com.vk.common.links.c.Q(fgxVar.e, c, epx.f(a, "fullscreen"), a2, a3, blk.P(fgxVar), i == 1, i2 == 1, str2);
    }
}
