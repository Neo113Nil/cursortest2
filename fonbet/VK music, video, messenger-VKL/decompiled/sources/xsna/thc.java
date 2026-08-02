package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.media.MediaUtils;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import xsna.vhc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class thc implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ thc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        switch (this.b) {
            case 0:
                vhc vhcVar = (vhc) this.c;
                ((FragmentActivity) ((Activity) this.d)).getApplicationContext();
                nv8 nv8Var = new nv8(vhcVar.c);
                List<CacheTarget> list = vhcVar.a;
                int size = list.size() - 1;
                List<CacheTarget> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                int i2 = 0;
                for (Object obj : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    CacheTarget cacheTarget = (CacheTarget) obj;
                    switch (vhc.a.$EnumSwitchMapping$0[cacheTarget.ordinal()]) {
                        case 1:
                            i = R.string.clear_cache_dialog_item_photos;
                            break;
                        case 2:
                            i = R.string.clear_cache_dialog_item_videos;
                            break;
                        case 3:
                            i = R.string.clear_cache_dialog_item_downloads;
                            break;
                        case 4:
                            i = R.string.clear_cache_dialog_item_downloaded_videos;
                            break;
                        case 5:
                            i = R.string.clear_cache_dialog_item_others;
                            break;
                        case 6:
                            throw new IllegalStateException("Unsupported " + cacheTarget + " string res");
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(new sx8(i3, i, nv8Var.b(cacheTarget), cacheTarget, true, i2 != size));
                    i2 = i3;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((sx8) next).d > 0) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            case 1:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) this.c;
                Photo photo = (Photo) this.d;
                ArrayList arrayList3 = new ArrayList();
                Iterator<NewsEntry> it2 = entriesListPresenter.d.iterator();
                while (it2.hasNext()) {
                    NewsEntry next2 = it2.next();
                    if (next2 instanceof Post) {
                        Post post = (Post) next2;
                        if (post.n == photo.C && epx.f(post.m, photo.e)) {
                            arrayList3.add(next2);
                        }
                    }
                }
                return arrayList3;
            case 2:
                wh60 wh60Var = (wh60) this.c;
                qz60 qz60Var = (qz60) this.d;
                if (qz60Var.h.a.indexOfKey(qz60Var.c) < 0) {
                    LinkedHashSet c = wh60Var.f.c();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : c) {
                        if (obj2 instanceof NewsEntry) {
                            arrayList4.add(obj2);
                        }
                    }
                    ((NewsFeedComponent) wh60Var.g.getValue()).Aa().b(qz60Var.c, qz60Var.b.d, epx.f(qz60Var.d, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP)), arrayList4);
                }
                return s3q0.a;
            default:
                return MediaUtils.a.c(((com.vk.attachpicker.screen.p) this.c).S.q(), ((MediaStoreEntry) this.d).f(), false);
        }
    }
}
