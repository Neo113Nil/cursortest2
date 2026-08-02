package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabLayoutVh;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.core.util.TrafficSaverInfo;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.market.GoodVariantItem;
import com.vk.dto.music.NftAudio;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import com.vk.log.L;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.music.informer.mvi.h;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefRequestReason;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.c910;
import xsna.gm50;
import xsna.ikv0;
import xsna.le8;
import xsna.nn20;
import xsna.no90;
import xsna.p130;
import xsna.phg0;
import xsna.pnb0;
import xsna.qy40;
import xsna.tlz;
import xsna.tmd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class eiz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eiz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        r80 a;
        ud8 ud8Var;
        int i = this.b;
        int i2 = 1;
        int i3 = 7;
        int i4 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((fiz) obj2).a.invoke();
                break;
            case 1:
                ((qlz) obj2).T(tlz.a.b);
                break;
            case 2:
                final MainActivity mainActivity = (MainActivity) obj2;
                TrafficSaverInfo trafficSaverInfo = (TrafficSaverInfo) obj;
                String str = MainActivity.P;
                TrafficSaverInfo trafficSaverInfo2 = TrafficSaverInfo.SWITCH_ON;
                String string = trafficSaverInfo == trafficSaverInfo2 ? mainActivity.getString(R.string.you_are_in_roaming) : mainActivity.getString(R.string.you_are_not_in_roaming);
                String string2 = trafficSaverInfo == trafficSaverInfo2 ? mainActivity.getString(R.string.enable_tarifc_saver) : mainActivity.getString(R.string.disable_tarifc_saver);
                final boolean z = trafficSaverInfo == trafficSaverInfo2;
                ikv0.a aVar = new ikv0.a(mainActivity);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_data_saver_circle_fill_green_24, (Integer) null, (Size) null);
                aVar.u = new ikv0.d(string, string2, (ikv0.d.a) null);
                aVar.g = new gzs() { // from class: xsna.ed00
                    @Override // xsna.gzs
                    public final Object invoke() {
                        String str2 = MainActivity.P;
                        MainActivity mainActivity2 = MainActivity.this;
                        mainActivity2.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("pref_to_highlight", "isRoamingState");
                        bundle.putBoolean("highlight_value", z);
                        new oz50(SettingsGeneralFragment.class, null, bundle).k(mainActivity2);
                        return Boolean.TRUE;
                    }
                };
                ikv0 b = aVar.b();
                sr10 sr10Var = dy2.a;
                if (sr10Var != null) {
                    itg0.k(sa30.c(new io.reactivex.rxjava3.internal.operators.single.v(new rr10(i4, trafficSaverInfo, sr10Var))), null, new yte(L.a, 7), 1);
                    s3q0 s3q0Var = s3q0.a;
                }
                b.c();
                break;
            case 3:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj2;
                Good good = (Good) obj;
                int i5 = MarketEditAlbumGoodsFragment.c1;
                long j = good.b;
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = marketEditAlbumGoodsFragment.Y0;
                if (goodAlbumEditFlowEntity != null) {
                    List<Good> list = goodAlbumEditFlowEntity.j;
                    List<Long> list2 = goodAlbumEditFlowEntity.i;
                    List<GoodVariantItem> list3 = good.u;
                    if (list3 == null || list3.isEmpty()) {
                        if (list2.contains(Long.valueOf(j))) {
                            list2.remove(Long.valueOf(j));
                            list.remove(good);
                        } else {
                            list2.add(Long.valueOf(j));
                            list.add(good);
                        }
                        tx00 tx00Var = marketEditAlbumGoodsFragment.Z0;
                        tx00Var.f = list2;
                        tx00Var.notifyItemChanged(tx00Var.e.indexOf(good));
                    } else {
                        MarketEditAlbumGoodVariantsFragment.a aVar2 = new MarketEditAlbumGoodVariantsFragment.a(MarketEditAlbumGoodVariantsFragment.class, null, null);
                        Bundle bundle = aVar2.j;
                        bundle.putParcelable(DatabaseHelper.ITEM_COLUMN_NAME, good);
                        bundle.putParcelable("album", GoodAlbumEditFlowEntity.zb(goodAlbumEditFlowEntity, null, null, null, 0, false, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
                        aVar2.g(20, marketEditAlbumGoodsFragment);
                    }
                }
                break;
            case 4:
                f910 f910Var = (f910) obj2;
                c910.a aVar3 = (c910.a) obj;
                VkSpinner vkSpinner = f910Var.l;
                int i6 = 8;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(8);
                }
                f910Var.p.setVisibility(8);
                gm50.a.a(f910Var, aVar3.d, new cqv(f910Var, 13));
                gm50.a.a(f910Var, aVar3.a, new u3u(f910Var, i6));
                gm50.a.a(f910Var, aVar3.b, new tcn(f910Var, 17));
                gm50.a.a(f910Var, aVar3.c, new w7u(f910Var, 10));
                gm50.a.a(f910Var, aVar3.e, new w110(f910Var, i2));
                gm50.a.a(f910Var, aVar3.g, new e2s(f910Var, 9));
                gm50.a.a(f910Var, aVar3.h, new yr00(f910Var, 2));
                gm50.a.a(f910Var, aVar3.k, new bbw(f910Var, 4));
                int i7 = 26;
                gm50.a.a(f910Var, aVar3.f, new k0j(f910Var, i7));
                int i8 = 19;
                gm50.a.a(f910Var, aVar3.j, new f2s(f910Var, i8));
                gm50.a.a(f910Var, aVar3.l, new wpg(f910Var, i7));
                gm50.a.a(f910Var, aVar3.i, new kdn(f910Var, i8));
                break;
            case 5:
                vf20 vf20Var = (vf20) obj2;
                vf20Var.m.onNext(new fo1(vf20Var, 3));
                break;
            case 6:
                ((zak0) ((nn20.a) obj2).c).setValue((String) obj);
                break;
            case 7:
                ((l130) obj2).T(new p130.d((o130) obj));
                break;
            case 8:
                Playlist playlist = (Playlist) obj2;
                break;
            case 9:
                MoneyTransferLinkFragment moneyTransferLinkFragment = (MoneyTransferLinkFragment) obj2;
                Bitmap bitmap = (Bitmap) obj;
                View view = moneyTransferLinkFragment.q0;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(0);
                ImageView imageView = moneyTransferLinkFragment.p0;
                (imageView != null ? imageView : null).setImageBitmap(bitmap);
                break;
            case 10:
                Throwable th = (Throwable) obj;
                enj.q(((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).J()) ? R.string.access_error : R.string.error, 0, ((com.vk.im.ui.components.msg_list.a) obj2).k);
                L.i(th);
                break;
            case 11:
                xu30 xu30Var = (xu30) obj2;
                yu30 yu30Var = xu30Var.f;
                if (yu30Var != null) {
                    int i9 = yu30Var.c;
                    pk30 pk30Var = xu30Var.e;
                    if (pk30Var != null) {
                        pk30Var.b0(i9);
                    }
                }
                break;
            case 12:
                ((u440) obj2).c8();
                break;
            case 13:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj2;
                ArrayList<UIBlock> arrayList = ((sa80) obj).a.y;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof UIBlockList) {
                        arrayList2.add(obj3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ArrayList<UIBlock> arrayList3 = ((UIBlockList) it.next()).y;
                            if (arrayList3 == null || !arrayList3.isEmpty()) {
                                Iterator<T> it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    if (((UIBlock) it2.next()) instanceof UiBlockInteractiveVkMix) {
                                        boolean h = MusicFeatures.CATALOG_GENERAL_SECTION_CACHE.h();
                                        UiBlockInteractiveVkMix uiBlockInteractiveVkMix = h ? (UiBlockInteractiveVkMix) rli0.n(rli0.j(rli0.p(new i5g(arrayList2), new ulz(i3)), MusicCatalogRootVh.c.b)) : null;
                                        String str2 = "";
                                        if (h) {
                                            String str3 = uiBlockInteractiveVkMix != null ? uiBlockInteractiveVkMix.y : null;
                                            if (str3 != null) {
                                                str2 = str3;
                                            }
                                        }
                                        l4v0 l4v0Var = musicCatalogRootVh.m.b.Q;
                                        if (l4v0Var != null && (a = l4v0Var.a()) != null) {
                                            a.a = str2;
                                            if (h) {
                                                a.c = uiBlockInteractiveVkMix != null ? uiBlockInteractiveVkMix.C : null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                SwitchCatalogVh switchCatalogVh = musicCatalogRootVh.I;
                VkTabLayoutVh vkTabLayoutVh = musicCatalogRootVh.G;
                if (switchCatalogVh.r instanceof alj) {
                    vkTabLayoutVh.show();
                } else {
                    vkTabLayoutVh.hide();
                }
                break;
            case 14:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj2;
                if (musicMyAudiosCatalogRootVh.v) {
                    break;
                } else {
                    ro40 ro40Var = musicMyAudiosCatalogRootVh.x;
                    if (ro40Var != null && !ro40Var.k) {
                        musicMyAudiosCatalogRootVh.m.b.e.b(new ktf0(musicMyAudiosCatalogRootVh.L.l()), false);
                    }
                    break;
                }
                break;
            case 15:
                ((com.vk.music.informer.mvi.d) obj2).T(h.c.b);
                break;
            case 16:
                ((fa10) obj2).invoke(j5g.a0((List) obj));
                break;
            case 17:
                w9y w9yVar = (w9y) obj;
                Image image = ((NftAudio) obj2).c;
                w9yVar.e(image != null ? image.Gb() : null, "sizes");
                break;
            case 18:
                e690 e690Var = (e690) obj2;
                z590 z590Var = e690Var.q;
                if (z590Var != null && (ud8Var = e690Var.r) != null) {
                    ud8Var.invoke(new le8.a(z590Var.a.getId()));
                }
                break;
            case 19:
                ((bo90) obj2).T((no90.b.C3407b) obj);
                break;
            case 20:
                lv90 lv90Var = (lv90) obj2;
                break;
            case 21:
                agb0 agb0Var = (agb0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    agb0Var.c.b(qy40.a.g.b);
                }
                break;
            case 22:
                ((job0) obj2).a.b(pnb0.c.e.b);
                break;
            case 23:
                ((ml1) obj2).invoke(new tmd0.c((ProductCardTopBarControlAction) obj));
                break;
            case 24:
                Pair pair = (Pair) obj;
                ((exd0) obj2).c.no((Set) pair.i(), (Set) pair.j());
                break;
            case 25:
                List list4 = (List) obj;
                i0e0 i0e0Var = ((c0e0) obj2).l1;
                if (i0e0Var != null) {
                    yzd0 yzd0Var = i0e0Var.e;
                    yzd0Var.setItems(list4);
                    yzd0Var.notifyDataSetChanged();
                }
                break;
            case 26:
                com.vk.reefton.trackers.f fVar = (com.vk.reefton.trackers.f) obj2;
                ReefEvent reefEvent = (ReefEvent) obj;
                if (reefEvent instanceof ReefEvent.j) {
                    ReefEvent.j jVar = (ReefEvent.j) reefEvent;
                    ArrayList<qnf0> arrayList4 = fVar.d;
                    arrayList4.add(jVar.b);
                    if (arrayList4.size() == fVar.c) {
                        fVar.a.a(fVar, ReefRequestReason.IMAGES_IMAGE_LOADED, jVar.a);
                    }
                }
                break;
            case 27:
                ((ohg0) obj2).T(new phg0.b((Throwable) obj));
                break;
            case 28:
                ((zak0) ((sjg0) obj2).t).setValue((String) obj);
                break;
            default:
                zrh0 zrh0Var = (zrh0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                owi.b(zrh0Var);
                if (booleanValue) {
                    owi.a(zrh0Var, 1000L, new b410(zrh0Var, 25));
                } else {
                    zrh0Var.b.d(false);
                }
                break;
        }
        return s3q0.a;
    }
}
