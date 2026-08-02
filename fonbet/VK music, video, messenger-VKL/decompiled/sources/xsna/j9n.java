package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.newsfeed.common.discover.media.cells.DiscoverMediaLayoutManagerImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;

/* compiled from: DiscoverSkeletonCreatorV2.kt */
/* loaded from: classes4.dex */
public final class j9n {
    public static Pair a(Context context) {
        ThemableShimmer a = new ThemableShimmer.a(context).a();
        a.u = a.a();
        DiscoverMediaLayoutManagerImpl discoverMediaLayoutManagerImpl = new DiscoverMediaLayoutManagerImpl();
        ArrayList o = e43.o(new jyj0(2, 1), new jyj0(1, 1), new jyj0(1, 1), new jyj0(1, 1), new jyj0(1, 1), new jyj0(1, 1), new jyj0(1, 1), new jyj0(2, 1), new jyj0(1, 1), new jyj0(1, 1), new jyj0(2, 3));
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.discover_media_screen_skeleton_v2, (ViewGroup) null).findViewById(R.id.discover_media_block);
        iyj0 iyj0Var = new iyj0(a);
        discoverMediaLayoutManagerImpl.o(iah0.a(2));
        discoverMediaLayoutManagerImpl.i = new oyj0(iyj0Var);
        recyclerView.setLayoutManager(discoverMediaLayoutManagerImpl);
        recyclerView.addItemDecoration(new j2n(R.attr.vk_ui_background_content));
        recyclerView.setAdapter(iyj0Var);
        discoverMediaLayoutManagerImpl.p(6);
        iyj0Var.setItems(o);
        return new Pair(recyclerView, a);
    }
}
