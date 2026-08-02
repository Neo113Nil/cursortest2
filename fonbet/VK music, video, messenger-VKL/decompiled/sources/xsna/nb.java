package xsna;

import android.view.View;
import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Image;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.photos.root.presentation.a;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.controls.view.faskseek.DownEventProcessor;
import one.video.controls.view.faskseek.FastSeekView;
import one.video.controls.view.faskseek.a;
import xsna.ga90;
import xsna.uhe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class nb implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, Preference.b, a.b, io.reactivex.rxjava3.functions.d, PhotoFlowToolbarView.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l o2lVar = o2l.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o2lVar.getClass();
        o2l.h("__dbg_thumbhash_debug_enabled_", booleanValue);
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(mms mmsVar) {
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
        int i = FriendsCleanupFragment.W;
        xms xmsVar = (xms) ref$ObjectRef.element;
        if (xmsVar != null) {
            xmsVar.C(mmsVar);
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 9:
                return (ohe) ((uhe.b) obj3).invoke(obj, obj2);
            case 21:
                int i2 = MarketEditAlbumGoodsFragment.c1;
                return (Pair) ((kli) obj3).invoke(obj, obj2);
            default:
                return (ga90.a) ((hq5) obj3).invoke(obj, obj2);
        }
    }

    @Override // one.video.controls.view.faskseek.a.b
    public void c() {
        FastSeekView fastSeekView = (FastSeekView) this.c;
        DownEventProcessor.a aVar = fastSeekView.g;
        if ((aVar != null ? aVar.a : null) == DownEventProcessor.Side.LEFT) {
            DownEventProcessor downEventProcessor = fastSeekView.h;
            downEventProcessor.e = false;
            downEventProcessor.f = null;
            downEventProcessor.g = 0;
        }
        fastSeekView.b.b.setPressed(false);
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.b
    public void onClick(View view) {
        ((com.vk.photos.root.presentation.h) this.c).d.invoke(a.h.b);
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((nde) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((k60) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((mb) obj2).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.e) ((pw4) obj2).invoke(obj);
            case 2:
                return (VkPaginationList) ((xi6) obj2).invoke(obj);
            case 3:
            case 9:
            case 12:
            case 15:
            case 18:
            case 21:
            case 22:
            default:
                return (io.reactivex.rxjava3.core.b0) ((lh) obj2).invoke(obj);
            case 4:
                return (Pair) ((mb) obj2).invoke(obj);
            case 5:
                return (List) ((lh) obj2).invoke(obj);
            case 6:
                return (xxd0) ((mb) obj2).invoke(obj);
            case 7:
                return (Collection) ((mb) obj2).invoke(obj);
            case 8:
                return (Image) ((pw4) obj2).invoke(obj);
            case 10:
                return (GroupsGroupFullDto) ((k60) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.t) ((k60) obj2).invoke(obj);
            case 13:
                return (NewsEntry) ((ire) obj2).invoke(obj);
            case 14:
                kpp kppVar = opp.T;
                return (String) ((gzn) obj2).invoke(obj);
            case 16:
                return (Pair) ((k60) obj2).invoke(obj);
            case 17:
                int i2 = FiltersRecyclerView.j;
                return (Pair) ((lh) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.b0) ((xht) obj2).invoke(obj);
            case 20:
                return (Optional) ((j4x) obj2).invoke(obj);
            case 23:
                return (Playlist) ((svz) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((nh1) obj2).invoke(obj);
            case 25:
                return (List) ((uh40) obj2).invoke(obj);
            case 26:
                return (NewsfeedGetResponse) ((xht) obj2).invoke(obj);
        }
    }
}
