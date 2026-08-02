package xsna;

import android.content.Context;
import android.view.View;
import com.ironsource.Hf;
import com.ironsource.M5;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.mentions.MentionProfileVO;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import kotlin.Pair;
import kotlin.Triple;
import xsna.by1;
import xsna.i2y;
import xsna.ihz;
import xsna.mwa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ed implements wut0, io.reactivex.rxjava3.functions.l, StoryViewerRouter.a, ihz.a, io.reactivex.rxjava3.functions.c, Hf.a, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ed(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(com.vk.feed.settings.impl.presentation.filtered.tab.b bVar) {
        NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.c;
        int i = NewsfeedFilterListFragment2.X;
        newsfeedFilterListFragment2.getFeature().C(bVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                return (AboutVideoItem.d.a) ((fd5) obj2).invoke(obj);
            case 3:
            case 11:
            case 20:
            case 21:
            default:
                return (io.reactivex.rxjava3.core.t) ((zl20) obj2).invoke(obj);
            case 4:
                return (byte[]) ((nk0) obj2).invoke(obj);
            case 5:
                return (Boolean) ((sd4) obj2).invoke(obj);
            case 6:
                return (Boolean) ((w5) obj2).invoke(obj);
            case 7:
                return (Pair) ((w5) obj2).invoke(obj);
            case 8:
                return (Boolean) ((sd4) obj2).invoke(obj);
            case 9:
                return (mwa.a) ((fh4) obj2).invoke(obj);
            case 10:
                return (Triple) ((sd4) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((tbm) obj2).invoke(obj);
            case 13:
                return (b0l0) ((oj) obj2).invoke(obj);
            case 14:
                return (pao) ((lrk) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.e) ((lrk) obj2).invoke(obj);
            case 16:
                int i2 = FeedAnimatedView.y;
                return (io.reactivex.rxjava3.core.t) ((r3h) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.x) ((r3h) obj2).invoke(obj);
            case 18:
                return (List) ((n8) obj2).invoke(obj);
            case 19:
                return (WebGroupShortInfo) ((dam) obj2).invoke(obj);
            case 22:
                return (j2g0) ((fh4) obj2).invoke(obj);
            case 23:
                return (MentionProfileVO) ((s6x) obj2).invoke(obj);
            case 24:
                return (ng20) ((s6x) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.t) ((zl20) obj2).invoke(obj);
            case 26:
                return (Integer) ((s6x) obj2).invoke(obj);
        }
    }

    @Override // com.ironsource.Hf.a
    public void cancel() {
        M5.a((ScheduledFuture) this.c);
    }

    @Override // xsna.wut0
    public vut0 create(Context context) {
        return ((fd) this.c).b;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public View k(String str) {
        return ((ld6) this.c).m4();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((s6x) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ ed(by1.a aVar, List list) {
        this.b = 11;
        this.c = list;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (i2y.a) ((b06) this.c).invoke(obj, obj2);
    }
}
