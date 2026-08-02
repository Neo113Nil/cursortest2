package xsna;

import com.vk.newsfeed.api.data.NewsComment;
import org.json.JSONObject;

/* compiled from: GetCommentsRequest.kt */
/* loaded from: classes4.dex */
public final class uqt extends aay<NewsComment> {
    public final /* synthetic */ bcg a;

    public uqt(bcg bcgVar) {
        this.a = bcgVar;
    }

    @Override // xsna.aay
    public final NewsComment a(JSONObject jSONObject) {
        return new NewsComment(jSONObject, this.a);
    }
}
