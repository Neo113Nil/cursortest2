package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.ironsource.InterfaceC4258c7;
import com.ironsource.Y6;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecords;
import com.vk.dto.video.VideoAlbum;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photoviewer.PhotoViewer;
import com.vk.rlottie.RLottieDrawable;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.widget.indicator.PagerIndicatorView;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import xsna.h8z0;
import xsna.hox;
import xsna.p4z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ie40 implements io.reactivex.rxjava3.functions.l, DivPagerView.OnItemsUpdatedCallback, Toolbar.h, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g, Tooltip.c, yads.ng1, h8z0.b, InterfaceC4258c7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ie40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.ironsource.InterfaceC4258c7
    public void a(Y6 y6) {
        ((com.ironsource.sdk.controller.v) this.c).a(y6);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (tt70) ((hyu) this.c).invoke(obj);
            case 1:
                return (x960) ((hyu) this.c).invoke(obj);
            case 2:
                return (VKList) ((h57) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((g110) this.c).invoke(obj);
            case 4:
            case 6:
            case 8:
            case 9:
            case 12:
            case 13:
            case 15:
            case 17:
            case 20:
            case 21:
            case 22:
            default:
                return (jf8) ((q4x0) this.c).invoke(obj);
            case 5:
                return (AlbumsRepository.a) ((hyu) this.c).invoke(obj);
            case 7:
                return (com.vk.newsfeed.posting.geo_picker.presentation.g) ((hxl) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.e) ((pwi0) this.c).invoke(obj);
            case 11:
                return (StickersBonusHistoryRecords) ((hyu) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.e) ((arb0) this.c).invoke(obj);
            case 16:
                return (List) ((hyu) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.b0) ((gsq0) this.c).invoke(obj);
            case 19:
                return (RLottieDrawable) ((y6r0) this.c).invoke(obj);
            case 23:
                return (VideoAlbum) ((hyu) this.c).invoke(obj);
            case 24:
                return (File) ((qit0) this.c).invoke(obj);
        }
    }

    public void b() {
        PagerIndicatorView.attachPager$lambda$3((PagerIndicatorView) this.c);
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        ((wmd0) this.c).invoke();
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (List) ((t0r) this.c).invoke(obj, obj2, obj3);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        return photoViewer.c.w((PhotoViewer.g) photoViewer.p.get(photoViewer.r), photoViewer.r, menuItem, photoViewer.D.findViewById(menuItem.getItemId()));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 9:
                return ((Boolean) ((arb0) obj2).invoke(obj)).booleanValue();
            case 15:
                return ((Boolean) ((hyu) obj2).invoke(obj)).booleanValue();
            default:
                int i2 = VideoAlbumFragment.i1;
                ((VideoAlbumFragment) obj2).getClass();
                return obj instanceof bwr0;
        }
    }

    @Override // xsna.h8z0.b
    public void a() {
        pdz0 pdz0Var = (pdz0) this.c;
        if (pdz0Var.k == null) {
            return;
        }
        p4z0.a aVar = pdz0Var.g;
        aVar.a.a.a(new hox.a());
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 8:
                return (Pair) ((kxa) this.c).invoke(obj, obj2);
            case 12:
                return (ned0) ((kb10) this.c).invoke(obj, obj2);
            case 13:
                return (VKList) ((a86) this.c).invoke(obj, obj2);
            case 17:
                return (kyo0) ((kxa) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((kxa) this.c).invoke(obj, obj2);
        }
    }
}
