package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import xsna.fb80;

/* compiled from: EntriesListContract.kt */
/* loaded from: classes3.dex */
public interface dqp extends fb80.b<Object>, eqp {
    void A0(FragmentImpl fragmentImpl);

    yg5 B0(int i);

    boolean C0(NewsEntry newsEntry);

    void D0(Bundle bundle);

    String E0(int i);

    void F0(Context context, NewsfeedExternalAction newsfeedExternalAction);

    void G0(u1c0 u1c0Var);

    String a();

    boolean a0();

    List<NewsEntry> c();

    String getRef();

    default VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    void onDestroy();

    void onDestroyView();

    ListDataSet<u1c0> r0();

    default boolean s0() {
        return false;
    }

    void t0(FragmentImpl fragmentImpl);

    void u0(boolean z);

    void v0(FragmentImpl fragmentImpl);

    void w0(Context context, jc60 jc60Var);

    MobileOfficialAppsCoreNavStat$EventScreen x0();

    boolean y0(NewsEntry newsEntry);

    String z0(int i);
}
