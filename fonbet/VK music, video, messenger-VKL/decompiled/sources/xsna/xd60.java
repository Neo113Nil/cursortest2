package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.toggle.features.FeedFeatures;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xd60 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ xd60(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        List list = this.c;
        switch (i) {
            case 0:
                ce60.b.getClass();
                NewsfeedData newsfeedData = (NewsfeedData) j5g.Y(list);
                NewsfeedData.Info info = newsfeedData.c;
                NewsfeedData.Info info2 = newsfeedData.c;
                if (!ce60.f(info.f)) {
                    NewsfeedGetResponse newsfeedGetResponse = new NewsfeedGetResponse(info2.c);
                    newsfeedGetResponse.addAll(newsfeedData.b);
                    newsfeedGetResponse.lists = newsfeedGetResponse.lists;
                    newsfeedGetResponse.isSmartNews = Boolean.valueOf(info2.e);
                    newsfeedGetResponse.reqListId = 0;
                    newsfeedGetResponse.isFromCache = true;
                    return io.reactivex.rxjava3.core.q.T(newsfeedGetResponse);
                }
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                FeedFeatures feedFeatures = FeedFeatures.FILE_CACHE;
                feedFeatures.getClass();
                if (!com.vk.toggle.b.A.a(feedFeatures)) {
                    Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                    NewsfeedData.a.a(info2.d, info2.e);
                }
                NewsfeedGetResponse newsfeedGetResponse2 = new NewsfeedGetResponse(null);
                newsfeedGetResponse2.isSmartNews = Boolean.valueOf(info2.e);
                newsfeedGetResponse2.reqListId = info2.d;
                return io.reactivex.rxjava3.core.q.T(newsfeedGetResponse2);
            case 1:
                ((gys) obj).a(list, cji.a);
                return s3q0.a;
            default:
                return new Pair(list, (Boolean) obj);
        }
    }
}
