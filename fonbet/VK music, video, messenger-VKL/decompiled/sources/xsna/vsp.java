package xsna;

import com.vk.dto.stickers.AnimatedStickerContent;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vsp implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ vsp(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                qyg0 V0 = ((hyg0) obj).V0("SELECT storage FROM episode WHERE mid = ?");
                try {
                    V0.D3(1, str);
                    MusicOfflineCacheStorage musicOfflineCacheStorage = null;
                    String l2 = null;
                    if (V0.step()) {
                        if (!V0.isNull(0)) {
                            l2 = V0.l2(0);
                        }
                        musicOfflineCacheStorage = uh.a(l2);
                    }
                    return musicOfflineCacheStorage;
                } finally {
                    V0.close();
                }
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                if (str != null) {
                    qgi0.h(tgi0Var, str);
                }
                return s3q0.a;
            default:
                String f = sni.f(((AnimatedStickerContent) obj).c);
                bpn0 bpn0Var = c7r0.a;
                c7r0.c().put(str, f);
                return f;
        }
    }

    public /* synthetic */ vsp(String str, wsp wspVar) {
        this.b = 0;
        this.c = str;
    }
}
