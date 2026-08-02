package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: VideoCommentRequestStrategy.kt */
/* loaded from: classes4.dex */
public final class ubs0 implements dcg {
    public final qzo a = new qzo();

    @Override // xsna.dcg
    public final io.reactivex.rxjava3.core.q<JSONObject> a(rzo rzoVar) {
        UserId userId = rzoVar.a;
        int i = rzoVar.b;
        String str = rzoVar.e;
        String str2 = rzoVar.f;
        int i2 = rzoVar.d;
        return rsg0.y0(new y1p("video.editComment", userId, i, str, str2, Integer.valueOf(i2), rzoVar.g, rzoVar.h), null, null, 3).L(new gwn0(new tbs0(0, rzoVar, this), 4), false);
    }
}
