package xsna;

import android.os.Bundle;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.audio.dto.AudioGetAudioPreviewUrlPreviewTypeDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.Iterator;

/* compiled from: AudioSnippetInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class nx4 implements lx4 {
    public final wx4 a;
    public final bq4 b;
    public final kx4 c;

    public nx4(wx4 wx4Var, bq4 bq4Var, kx4 kx4Var) {
        this.a = wx4Var;
        this.b = bq4Var;
        this.c = kx4Var;
    }

    @Override // xsna.lx4
    public final io.reactivex.rxjava3.core.x a() {
        ((ix4) this.a.b).getClass();
        tfx tfxVar = new tfx("audio.getSnippets", new v11(3), new w11(4));
        tfxVar.f(3, 0, 100, "count");
        return rsg0.w0(yfb.x(tfxVar)).l(new c7(new ym1(this.c, 1), 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r11 == null) goto L18;
     */
    @Override // xsna.lx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.x<i600> b(MusicTrack musicTrack) {
        String b;
        Object obj;
        io.reactivex.rxjava3.core.x l;
        String string;
        if (musicTrack.f < 30) {
            long j = musicTrack.c0;
            String str = musicTrack.i;
            l = io.reactivex.rxjava3.core.x.k(new i600(0L, j, str == null ? "" : str, true));
        } else {
            Serializer.c<MusicTrack> cVar = MusicTrack.CREATOR;
            UserId userId = musicTrack.c;
            int i = musicTrack.b;
            String str2 = musicTrack.r;
            Bundle bundle = musicTrack.v;
            if (bundle != null && (string = bundle.getString("contentId")) != null) {
                StringBuilder e = fw3.e(string);
                e.append(str2 != null ? BundleUtil.UNDERLINE_TAG.concat(str2) : "");
                b = e.toString();
            }
            b = MusicTrack.a.b(i, userId, str2);
            ix4 ix4Var = (ix4) this.a.b;
            Iterator<E> it = AudioGetAudioPreviewUrlPreviewTypeDto.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((AudioGetAudioPreviewUrlPreviewTypeDto) obj).j(), "longtap")) {
                    break;
                }
            }
            l = rsg0.w0(yfb.x(ix4Var.j(b, (AudioGetAudioPreviewUrlPreviewTypeDto) obj))).l(new com.vk.movika.sdk.base.ui.p0(new mx4(this.b, 0), 3));
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(l, new e10(new lt0(4), 6));
    }
}
