package xsna;

import android.media.MediaMetadataRetriever;
import android.util.LruCache;
import com.vk.dto.stickers.AnimatedStickerInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jv2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ jv2(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                int i2 = com.vk.profile.questions.impl.a.o1;
                qgi0.r(tgi0Var, "answer_question_name");
                qgi0.s(tgi0Var, new us2(str));
                break;
            case 1:
                ((MediaMetadataRetriever) obj).setDataSource(str);
                break;
            case 2:
                qgi0.r((tgi0) obj, str);
                break;
            default:
                bpn0 bpn0Var = c7r0.a;
                ((LruCache) c7r0.b.getValue()).put(str, (AnimatedStickerInfo) obj);
                break;
        }
        return s3q0.a;
    }
}
