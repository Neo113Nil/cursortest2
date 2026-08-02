package xsna;

import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.ArrayList;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ nf5(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT auto_download_track.mid\n        FROM auto_download_track\n        WHERE auto_download_track.uid = ? \n    ");
                try {
                    V0.D3(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        arrayList.add(V0.l2(0));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, str);
                qgi0.r(tgi0Var, "CropEditorPhotoEditorButton");
                qgi0.n(tgi0Var, 0);
                return s3q0.a;
            case 2:
                qyg0 V02 = ((hyg0) obj).V0("SELECT storage FROM audio_track WHERE mid = ?");
                try {
                    V02.D3(1, str);
                    MusicOfflineCacheStorage musicOfflineCacheStorage = null;
                    String l2 = null;
                    if (V02.step()) {
                        if (!V02.isNull(0)) {
                            l2 = V02.l2(0);
                        }
                        musicOfflineCacheStorage = uh.a(l2);
                    }
                    return musicOfflineCacheStorage;
                } finally {
                }
            default:
                aag0 aag0Var = (aag0) obj;
                if (!aag0Var.a()) {
                    return io.reactivex.rxjava3.core.q.H(new IllegalArgumentException(go9.b("Can't resolve screen for ", str)));
                }
                Regex regex = ugx0.a;
                return ugx0.b(aag0Var.a, aag0Var.b, str);
        }
    }

    public /* synthetic */ nf5(String str, fb50 fb50Var) {
        this.b = 2;
        this.c = str;
    }
}
