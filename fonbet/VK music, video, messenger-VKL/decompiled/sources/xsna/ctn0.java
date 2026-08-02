package xsna;

import android.app.Activity;
import android.os.Parcelable;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import com.vk.profile.user.impl.util.UserProfileContentTab;
import com.vk.stat.scheme.CommonProfileStat$ContentTabsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.atq0;
import xsna.nyd0;

/* compiled from: TabPinningFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class ctn0 implements huq {
    public final rnq0 b;
    public final dvq0 c;
    public final lyd0 d;
    public io.reactivex.rxjava3.disposables.b e;
    public u5p0 f;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> g;
    public fpq0 h;

    public ctn0(rnq0 rnq0Var, r0e0 r0e0Var, dvq0 dvq0Var, lyd0 lyd0Var) {
        this.b = rnq0Var;
        this.c = dvq0Var;
        this.d = lyd0Var;
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.h = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.g;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    public final void a(UserProfileAction.c0 c0Var, com.vk.profile.user.impl.ui.g gVar) {
        ?? r7;
        List<CommunityProfileContentItem> list;
        if (c0Var instanceof UserProfileAction.c0.c) {
            return;
        }
        if (!(c0Var instanceof UserProfileAction.c0.a)) {
            if (!(c0Var instanceof UserProfileAction.c0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            UserProfileAction.c0.b bVar = (UserProfileAction.c0.b) c0Var;
            String str = bVar.b;
            ContentTab wall = str.equals(UserProfileContentTab.WALL.h()) ? new ContentTab.Wall(false, 3) : str.equals(UserProfileContentTab.PHOTOS.h()) ? new ContentTab.Photo(false, 3) : str.equals(UserProfileContentTab.SHORT_CLIPS.h()) ? new ContentTab.Clip(false, 3) : str.equals(UserProfileContentTab.VIDEOS.h()) ? new ContentTab.Video(false, 3) : str.equals(UserProfileContentTab.AUDIOS.h()) ? new ContentTab.Music(false, 3) : str.equals(UserProfileContentTab.NARRATIVES.h()) ? new ContentTab.Narrative(false, 3) : str.equals(UserProfileContentTab.ARTICLES.h()) ? new ContentTab.Article(false, 3) : str.equals(UserProfileContentTab.GIFTS.h()) ? new ContentTab.Gift(false, 3) : str.equals(UserProfileContentTab.ARCHIVE_WALL.h()) ? new ContentTab.Archive(false, 3) : null;
            if (wall != null) {
                fpq0 fpq0Var = this.h;
                if (fpq0Var == null) {
                    fpq0Var = null;
                }
                fpq0Var.B(new f.h(new atq0.e(bVar.e, wall, bVar.c, bVar.d)));
            }
            u5p0 u5p0Var = this.f;
            (u5p0Var != null ? u5p0Var : null).invoke(UserProfileAction.y.b);
            return;
        }
        nyd0.o(nyd0.this, new nyd0.f(null, null, null, null, null, null, null, null, null, null, null, new CommonProfileStat$ContentTabsEvent(CommonProfileStat$ContentTabsEvent.ContentTabsEventType.CLICK_TO_TAB_SETTINGS_BUTTON, null, null, 6, null), 2047));
        fpq0 fpq0Var2 = this.h;
        if (fpq0Var2 == null) {
            fpq0Var2 = null;
        }
        CommunityProfileContent communityProfileContent = gVar.g;
        ContentTab contentTab = gVar.h;
        if (communityProfileContent == null || (list = communityProfileContent.b) == null) {
            r7 = EmptyList.b;
        } else {
            r7 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContentTab contentTab2 = ((CommunityProfileContentItem) it.next()).a;
                Parcelable wall2 = contentTab2 instanceof ContentTab.Wall ? new ProfileTabOptions.Wall(contentTab instanceof ContentTab.Wall, false, 2, null) : contentTab2 instanceof ContentTab.Article ? new ProfileTabOptions.Article(contentTab instanceof ContentTab.Article, false, 2, null) : contentTab2 instanceof ContentTab.Clip ? new ProfileTabOptions.Clip(contentTab instanceof ContentTab.Clip, false, 2, null) : contentTab2 instanceof ContentTab.Music ? new ProfileTabOptions.Music(contentTab instanceof ContentTab.Music, false, 2, null) : contentTab2 instanceof ContentTab.Narrative ? new ProfileTabOptions.Narrative(contentTab instanceof ContentTab.Narrative, false, 2, null) : contentTab2 instanceof ContentTab.Photo ? new ProfileTabOptions.Photo(contentTab instanceof ContentTab.Photo, false, 2, null) : contentTab2 instanceof ContentTab.Video ? new ProfileTabOptions.Video(contentTab instanceof ContentTab.Video, false, 2, null) : contentTab2 instanceof ContentTab.Gift ? new ProfileTabOptions.Gift(contentTab instanceof ContentTab.Gift, false, 2, null) : null;
                if (wall2 != null) {
                    r7.add(wall2);
                }
            }
        }
        fpq0Var2.B(new f.e.h0(r7));
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.e = bVar;
    }

    @Override // xsna.huq
    public final void j() {
        io.reactivex.rxjava3.disposables.c subscribe = this.b.e().subscribe(new k2y(new mdk0(this, 3), 19), new qw40(new mcl0(6), 22));
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.f = u5p0Var;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.g = r9c0Var;
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onResume() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
