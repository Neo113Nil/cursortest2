package xsna;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.RequestUserProfile;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.jav;

/* compiled from: BaseFriendsRequestsRedesignHolder.kt */
/* loaded from: classes16.dex */
public abstract class ld6 extends vif0<RequestUserProfile> implements pss, w8i {
    public final mss n;
    public final Object o;

    public ld6(View view, ViewGroup viewGroup, mss mssVar) {
        super(view, viewGroup);
        this.n = mssVar;
        this.o = msy.a(LazyThreadSafetyMode.NONE, new hd(this, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // xsna.vif0
    public final void j6(RequestUserProfile requestUserProfile, Object obj) {
        ?? singletonList;
        Activity h;
        RequestUserProfile requestUserProfile2 = requestUserProfile;
        if (obj instanceof List) {
            singletonList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof jav) {
                    singletonList.add(obj2);
                }
            }
        } else {
            singletonList = obj instanceof jav ? Collections.singletonList(obj) : EmptyList.b;
        }
        if (singletonList.isEmpty()) {
            i6(requestUserProfile2);
            return;
        }
        for (jav javVar : singletonList) {
            if (javVar instanceof jav.c) {
                i6(requestUserProfile2);
            } else if (javVar instanceof jav.d) {
                I1();
            } else if (javVar instanceof jav.b) {
                D2(((jav.b) javVar).a);
            } else if (javVar instanceof jav.a) {
                x5();
            } else {
                if (!(javVar instanceof jav.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                jav.e eVar = (jav.e) javVar;
                List<StoriesContainer> list = eVar.b;
                String str = eVar.a;
                if (!list.isEmpty() && (h = e3m.h(this.itemView.getContext())) != null) {
                    ((StoryViewerRouter) this.o.getValue()).h(h, list, list.get(0).Ob(), null, (r42 & 16) != 0, MobileOfficialAppsConStoriesStat$ViewEntryPoint.AVATAR, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER, str, null, (r42 & 512) != 0 ? null : null, new ed(this, 3), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
                }
            }
        }
    }

    public ld6(int i, ViewGroup viewGroup, mss mssVar) {
        this(tf3.b(viewGroup, i, viewGroup, false), viewGroup, mssVar);
    }
}
