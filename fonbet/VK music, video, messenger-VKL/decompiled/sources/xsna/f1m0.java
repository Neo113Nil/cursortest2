package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.story.api.LoadContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: StoryDataLoader.kt */
/* loaded from: classes6.dex */
public final class f1m0 implements w8i {
    public static final f1m0 b = new f1m0();
    public static final bpn0 c = new bpn0(new cy20(13));
    public static final bpn0 d = new bpn0(new e1m0(0));

    public static final io.reactivex.rxjava3.core.x<ArrayList<StoriesContainer>> a(String str, LoadContext loadContext) {
        io.reactivex.rxjava3.core.x<GetStoriesResponse> e;
        List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
        if (c0.size() < 2) {
            return io.reactivex.rxjava3.core.x.i(new Exception("invalid story full id"));
        }
        UserId userId = new UserId(cqm0.l((String) c0.get(0)));
        boolean equals = loadContext.equals(LoadContext.Owner.b);
        bpn0 bpn0Var = d;
        if (equals) {
            e = otl0.e((otl0) bpn0Var.getValue(), userId, null, 10);
        } else if (loadContext.equals(LoadContext.New.b) || loadContext.equals(LoadContext.All.b)) {
            e = otl0.e((otl0) bpn0Var.getValue(), null, userId, 6);
        } else if (loadContext.equals(LoadContext.AllBySingleStory.b)) {
            e = ((otl0) bpn0Var.getValue()).f(str, (r3 & 2) == 0, true);
        } else if (loadContext instanceof LoadContext.StoryList) {
            otl0 otl0Var = (otl0) bpn0Var.getValue();
            StringBuilder b2 = v1v.b(str, ',');
            b2.append(((LoadContext.StoryList) loadContext).b);
            e = otl0Var.f(b2.toString(), false, false);
        } else {
            e = ((otl0) bpn0Var.getValue()).f(str, (r3 & 2) == 0, true);
        }
        return e.f(500L, TimeUnit.MILLISECONDS).l(new rjk0(new ha40(16))).l(new j630(new xv2(1, new ll1(25, loadContext, userId), izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, 15), 17)).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
