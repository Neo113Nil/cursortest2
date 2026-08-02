package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: NewsfeedStoriesTransformer.kt */
/* loaded from: classes4.dex */
public final class n070 implements gn60<k070, wm60> {
    public final Lazy b;

    public n070(Lazy<? extends NewsFeedBridgeComponent> lazy) {
        this.b = lazy;
    }

    public final List a(k070 k070Var) {
        GetStoriesResponse getStoriesResponse = k070Var.a;
        ArrayList<StoriesContainer> arrayList = getStoriesResponse != null ? getStoriesResponse.c : null;
        if (arrayList == null) {
            arrayList = e43.a(new SimpleStoriesContainer(new StoryOwner.User(((NewsFeedBridgeComponent) this.b.getValue()).Ad().a().H(), null, 2, null), EmptyList.b, null, false, 12, null));
        }
        return Collections.singletonList(new o070(arrayList, k070Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((k070) pair);
    }
}
