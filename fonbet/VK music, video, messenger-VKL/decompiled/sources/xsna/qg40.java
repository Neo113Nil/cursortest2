package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import xsna.xb50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg40 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qg40(int i, Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = i;
        this.c = serializable;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                sg40 sg40Var = (sg40) obj4;
                UserId userId = (UserId) obj3;
                String str = (String) obj2;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                for (MusicTrack musicTrack : (ArrayList) serializable) {
                    MusicTrack s = sg40Var.e.s(userId, musicTrack.Fb());
                    if (s != null) {
                        kgp0.f(sg40Var.e, userId, MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, DownloadingState.Corrupted.b, false, false, null, null, null, -1, 1048571), str, false, null, (CorruptedReason) linkedHashMap.get(musicTrack.Fb()), 24);
                        xb50 xb50Var = sg40Var.m;
                        xb50.a a = xb50.a(xb50Var.c(s), xb50Var.c(musicTrack));
                        sg40Var.a.Y(a.b, a.a);
                    }
                }
                break;
            default:
                Integer num = (Integer) serializable;
                Integer num2 = (Integer) obj4;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj3;
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) obj2;
                sq60 sq60Var = (sq60) obj;
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                if (num != null && num2 != null && linearLayoutManager != null) {
                    linearLayoutManager.K(num.intValue(), num2.intValue());
                }
                if (sq60Var.d) {
                    RecyclerView recyclerView = suggestedPostsFragment.b0;
                    RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                    LinearLayoutManager linearLayoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.K(0, 0);
                    }
                }
                ((o170) suggestedPostsFragment.eo().r.getValue()).b(suggestedPostsFragment.b0);
                suggestedPostsFragment.eo().d().a(sq60Var.a);
                ehv ehvVar = (ehv) suggestedPostsFragment.eo().g.b;
                if (ehvVar != null) {
                    ehvVar.r();
                    break;
                }
                break;
        }
    }
}
