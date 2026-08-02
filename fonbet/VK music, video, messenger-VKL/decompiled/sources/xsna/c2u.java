package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalScrollableListVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.im.ui.components.group.vc.GroupProfileView;
import com.vk.music.informer.mvi.h;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVhOld;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.pip.impl.overlay.MiniAppPiPOverlayService;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import xsna.a750;
import xsna.b750;
import xsna.gm50;
import xsna.jq60;
import xsna.k840;
import xsna.m8v;
import xsna.p410;
import xsna.tr20;
import xsna.xh60;
import xsna.xn50;
import xsna.yo60;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c2u implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c2u(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        ArrayList<UIBlock> arrayList2;
        Object obj2;
        Object obj3;
        int i;
        int i2;
        int i3 = 0;
        switch (this.b) {
            case 0:
                SearchLocation searchLocation = (SearchLocation) obj;
                SearchParams searchParams = ((GlobalSearchGroupsCatalogRootVhOld) this.c).y;
                VkGroupsSearchParams vkGroupsSearchParams = searchParams instanceof VkGroupsSearchParams ? (VkGroupsSearchParams) searchParams : null;
                if (vkGroupsSearchParams != null) {
                    vkGroupsSearchParams.f = searchLocation;
                    ysg0.b.a(new eru0(vkGroupsSearchParams));
                    break;
                } else {
                    break;
                }
            case 1:
                GroupProfileView groupProfileView = (GroupProfileView) this.c;
                int i4 = GroupProfileView.K;
                groupProfileView.getClass();
                break;
            case 2:
                int i5 = 0;
                HorizontalScrollableListVh horizontalScrollableListVh = (HorizontalScrollableListVh) this.c;
                n3a n3aVar = (n3a) obj;
                qcy<Object>[] qcyVarArr = HorizontalScrollableListVh.m;
                if (n3aVar instanceof z8s0) {
                    UIBlockButtons uIBlockButtons = horizontalScrollableListVh.g;
                    if (uIBlockButtons == null || (arrayList = uIBlockButtons.y) == null) {
                        break;
                    } else {
                        lw3 lw3Var = ((z8s0) n3aVar).a;
                        Iterator<UIBlock> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i5 = -1;
                            } else if (!((Boolean) lw3Var.invoke(it.next())).booleanValue()) {
                                i5++;
                            }
                        }
                        ViewGroup viewGroup = horizontalScrollableListVh.h;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        View childAt = viewGroup.getChildAt(i5);
                        childAt.post(new zv4(5, horizontalScrollableListVh, childAt));
                    }
                }
                break;
            case 3:
                cbw cbwVar = (cbw) this.c;
                cew.b.getClass();
                cbwVar.g = cew.h().getInt("reactions_assets_version", 1);
                cbwVar.h = f370.J(cqm0.i(cew.h().getString("reactions_available_ids", "[]")));
                cbwVar.i = cbwVar.l();
                cbwVar.d.set(0L);
                cbwVar.r();
                break;
            case 4:
                qgi0.m((tgi0) obj, new t1e0(((Number) ((gzs) this.c).invoke()).floatValue(), new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), 0));
                break;
            case 5:
                ((j1z) this.c).r.a(((qnw) obj).a);
                break;
            case 6:
                ((ti00) this.c).d.onNext((List) obj);
                break;
            case 7:
                break;
            case 8:
                int i6 = MarketEditAlbumGoodsFragment.c1;
                ((MarketEditAlbumGoodsFragment) this.c).onError((Throwable) obj);
                break;
            case 9:
                a410 a410Var = (a410) this.c;
                int intValue = ((Integer) obj).intValue();
                a410Var.T(new p410.a(intValue >= 2, intValue >= 1));
                break;
            case 10:
                f910 f910Var = (f910) this.c;
                xn50.a.c(f910Var.d, new z710.m((UserId) obj));
                VkContextMenu vkContextMenu = f910Var.n;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                break;
            case 11:
                w920 w920Var = (w920) this.c;
                if (!(((m8v) obj) instanceof m8v.d) && !w920Var.s) {
                    r4 = false;
                }
                break;
            case 12:
                ((sf20) this.c).q = (xf20) obj;
                break;
            case 13:
                MiniAppPiPOverlayService miniAppPiPOverlayService = (MiniAppPiPOverlayService) this.c;
                Long l = MiniAppPiPOverlayService.f;
                miniAppPiPOverlayService.stopSelf();
                break;
            case 14:
                xn50.a.c((pr20) this.c, new tr20.a((String) obj));
                break;
            case 15:
                break;
            case 16:
                wq30 wq30Var = (wq30) this.c;
                maz e = xwk.d().e();
                Context context = wq30Var.d;
                maz.c(e, context == null ? null : context, i5s.a(new StringBuilder("https://"), a0a.d, "/status"), LaunchContext.A, null, null, 24);
                break;
            case 17:
                Bitmap bitmap = (Bitmap) obj;
                ImageView imageView = ((qu30) this.c).f;
                (imageView == null ? null : imageView).setImageBitmap(bitmap);
                break;
            case 18:
                break;
            case 19:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) this.c;
                t8f0 t8f0Var = (t8f0) obj;
                UIBlockList uIBlockList = musicArtistCatalogRootVh.K;
                if (uIBlockList != null ? t8f0Var.a.invoke(uIBlockList).booleanValue() : false) {
                    UIBlockList uIBlockList2 = musicArtistCatalogRootVh.K;
                    if (uIBlockList2 == null || (arrayList2 = uIBlockList2.y) == null) {
                        uIBlock = null;
                    } else {
                        Iterator<T> it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (((UIBlock) obj2) instanceof UIBlockMusicArtistNew) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        uIBlock = (UIBlock) obj2;
                        if (uIBlock == null) {
                            Iterator<T> it3 = arrayList2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (((UIBlock) next) instanceof UIBlockMusicArtist) {
                                        obj3 = next;
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            uIBlock = (UIBlock) obj3;
                        }
                    }
                    if (uIBlock != null) {
                        musicArtistCatalogRootVh.i0(uIBlock);
                    }
                }
                break;
            case 20:
                dwj dwjVar = (dwj) obj;
                break;
            case 21:
                ((com.vk.music.informer.mvi.d) this.c).T(new h.a(((Boolean) obj).booleanValue()));
                break;
            case 22:
                j650 j650Var = (j650) this.c;
                yzt0<a750.a> yzt0Var = ((b750.c) obj).a;
                f4m.j(j650Var.f);
                RecyclerView recyclerView = j650Var.e;
                recyclerView.setVisibility(0);
                recyclerView.removeOnItemTouchListener(j650Var.h);
                gm50.a.a(j650Var, yzt0Var, new iou(j650Var, 20));
                break;
            case 23:
                Object[] objArr = (Object[]) obj;
                break;
            case 24:
                break;
            case 25:
                jq60 jq60Var = (jq60) this.c;
                ?? r1 = jq60Var.k;
                Lazy lazy = jq60Var.h;
                qg50 qg50Var = jq60Var.j;
                int[] iArr = qg50Var.b;
                long[] jArr = qg50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            int i9 = i3;
                            while (i9 < i8) {
                                if ((255 & j) < 128) {
                                    i2 = i3;
                                    ((NewsFeedComponent) lazy.getValue()).w().b(iArr[(i7 << 3) + i9], (dr60) r1.getValue());
                                } else {
                                    i2 = i3;
                                }
                                j >>= 8;
                                i9++;
                                i3 = i2;
                            }
                            i = i3;
                            if (i8 != 8) {
                            }
                        } else {
                            i = i3;
                        }
                        if (i7 != length) {
                            i7++;
                            i3 = i;
                        }
                    }
                }
                ((NewsFeedComponent) lazy.getValue()).w().a(113, 100, (dr60) r1.getValue());
                ((NewsFeedComponent) lazy.getValue()).w().a(102, 100, (dr60) r1.getValue());
                uc60 uc60Var = jq60Var.l;
                uc60Var.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED");
                intentFilter.addAction("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED");
                intentFilter.addAction("com.vkontakte.android.USER_PHOTO_CHANGED");
                intentFilter.addAction("com.vkontakte.android.AD_REPORTED");
                intentFilter.addAction("com.vkontakte.android.AD_REPORT_CANCELLED");
                intentFilter.addAction("com.vkontakte.android.AD_HANDLE_BLS_RESULT");
                intentFilter.addAction("com.vkontakte.android.AD_HANDLE_BLS_CLICK");
                intentFilter.addAction("com.vkontakte.android.ACTION_AD_SAVE_SELECTED_BLS_ANSWERS");
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                anj.d(context2, uc60Var.d, intentFilter, null, 4);
                jq60Var.i = ((StoriesComponent) jq60Var.g.getValue()).Pa().a(new jq60.a(1, jq60Var, jq60.class, "markStoriesAsSeenLocal", "markStoriesAsSeenLocal(Lcom/vk/dto/common/id/UserId;)V", 0));
                break;
            case 26:
                dv60 dv60Var = (dv60) this.c;
                if (((List) obj).isEmpty()) {
                    dv60Var.c(new xh60.e(new yo60.g.b.c(R.string.newsfeed_open_post_error)));
                }
                break;
            case 27:
                el50 el50Var = (el50) this.c;
                awg0 awg0Var = (awg0) obj;
                r5v0 r5v0Var = k840.a.h;
                break;
            case 28:
                xz70 xz70Var = (xz70) this.c;
                mru0 mru0Var = (mru0) obj;
                SearchParams searchParams2 = xz70Var.g;
                if (searchParams2 != null) {
                    searchParams2.h5(mru0Var.a);
                }
                xz70Var.a(xz70Var.f.b());
                xz70Var.c();
                break;
            default:
                ohk0 f = ((ks80) this.c).f().f((String) obj);
                if (f != null) {
                    f.c("onFirstFrameDecoded");
                }
                break;
        }
        return s3q0.a;
    }
}
