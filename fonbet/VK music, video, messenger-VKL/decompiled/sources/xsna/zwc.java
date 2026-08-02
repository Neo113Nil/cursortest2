package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.tags.Tag;
import com.vk.newsfeed.impl.di.NewsfeedRouterComponentImpl;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.olh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zwc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zwc(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // xsna.gzs
    public final Object invoke() {
        ?? r5;
        int i = this.b;
        ?? r1 = this.e;
        ?? r2 = this.d;
        ?? r3 = this.c;
        switch (i) {
            case 0:
                VideoFile videoFile = (VideoFile) r3;
                nlh0 nlh0Var = (nlh0) r2;
                axc axcVar = (axc) r1;
                if (videoFile instanceof ClipVideoFile) {
                    nlh0Var.d(Collections.singletonList(new olh0.d(true)));
                    ClipVideoFile clipVideoFile = (ClipVideoFile) videoFile;
                    axcVar.getClass();
                    Integer num = clipVideoFile.x1;
                    if (num != null && num.intValue() > 0) {
                        axcVar.f(clipVideoFile);
                    }
                }
                break;
            case 1:
                ((iqd) r3).a((String) r2, ((mqd) r1).getUnformattedText());
                break;
            case 2:
                qcy<Object>[] qcyVarArr = NewsfeedRouterComponentImpl.b;
                break;
            case 3:
                x0o0 x0o0Var = (x0o0) r3;
                Tag tag = (Tag) r2;
                zzq zzqVar = (zzq) x0o0Var.p.getValue();
                int i2 = tag.b;
                long j = tag.d.b;
                String str = x0o0Var.c;
                int i3 = x0o0Var.m;
                zzqVar.getClass();
                zzq.b(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PHOTO_VIEWER_AUTHOR_MENU, i2, j, str, Integer.valueOf(i3), null);
                x0o0Var.l(tag, (PhotoAttachment) r1);
                break;
            default:
                JSONObject jSONObject = (JSONObject) r2;
                rgx0 rgx0Var = (rgx0) r1;
                pnx pnxVar = ((qgx0) r3).c;
                String optString = jSONObject.optString("title");
                JSONArray optJSONArray = jSONObject.optJSONArray("actions");
                if (optJSONArray != null) {
                    r5 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                        String optString2 = jSONObject2.optString("title");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("handler");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        r5.add(new VkAlertData.a(optString2, optJSONObject));
                    }
                } else {
                    r5 = EmptyList.b;
                }
                pnxVar.c(new VkAlertData.c(optString, r5), rgx0Var);
                break;
        }
        return s3q0.a;
    }
}
