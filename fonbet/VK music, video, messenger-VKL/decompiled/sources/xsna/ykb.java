package xsna;

import com.vk.music.offline.api.model.MusicOfflineCacheStorage;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ykb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ ykb(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT storage FROM audio_book_chapter WHERE chapter_id = ?");
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
                rh90 rh90Var = (rh90) obj;
                String str2 = rh90Var.a;
                rh90Var.getClass();
                return new rh90(str2, this.c);
            case 2:
                return new gt9(((b0l0) obj).a(), this.c);
            case 3:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
        }
    }

    public /* synthetic */ ykb(String str, elb elbVar) {
        this.b = 0;
        this.c = str;
    }
}
