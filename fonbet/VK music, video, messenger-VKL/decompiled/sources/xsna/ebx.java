package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.api.generated.apps.dto.AppsStartCallResponseDto;
import com.vk.api.generated.video.dto.VideoGetInteractiveVideoInfoResponseDto;
import com.vk.api.generated.video.dto.VideoInteractiveVideoChapterInfoDto;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Good;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.ecomm.products_multipicker.impl.presentation.adapters.itemadapter.paginationerror.TypeOfItems;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.music.snippet.player.analytics.model.MusicLongtapExitType;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.photos.root.selectalbum.domain.h;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.bex0;
import xsna.cda0;
import xsna.dyz;
import xsna.ge10;
import xsna.gm50;
import xsna.ikv0;
import xsna.oea0;
import xsna.tlo0;
import xsna.xaz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ebx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ebx(com.vk.im.ui.components.msg_list.a aVar, fi30 fi30Var) {
        this.b = 7;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0439, code lost:
    
        if (r0 != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (xsna.epx.f(r9, "ShareLinkFromGroupCallTip") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024a, code lost:
    
        if (r7.a.L == 2) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.util.Size, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List list;
        Dialog dialog;
        io.reactivex.rxjava3.core.e eVar;
        int i = this.b;
        int i2 = 12;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Map map = (Map) obj2;
                VideoGetInteractiveVideoInfoResponseDto videoGetInteractiveVideoInfoResponseDto = (VideoGetInteractiveVideoInfoResponseDto) obj;
                List<Integer> e = videoGetInteractiveVideoInfoResponseDto.e();
                if (e != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = e.iterator();
                    while (it.hasNext()) {
                        String str = (String) map.get(String.valueOf(((Number) it.next()).intValue()));
                        com.vk.movika.sdk.base.model.c cVar = str != null ? new com.vk.movika.sdk.base.model.c(str) : null;
                        if (cVar != null) {
                            arrayList.add(cVar);
                        }
                    }
                    list = j5g.y0(arrayList);
                    break;
                }
                list = EmptyList.b;
                MapBuilder mapBuilder = new MapBuilder();
                for (VideoInteractiveVideoChapterInfoDto videoInteractiveVideoChapterInfoDto : videoGetInteractiveVideoInfoResponseDto.d()) {
                    String d = videoInteractiveVideoChapterInfoDto.d();
                    if (d != null) {
                        mapBuilder.put(Integer.valueOf(videoInteractiveVideoChapterInfoDto.e()), d);
                    }
                }
                return new yax(list, mapBuilder.h());
            case 1:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiProtocol.KEY_JOIN_LINK, ((AppsStartCallResponseDto) obj).d());
                jSONObject.put("result", true);
                bex0.a.b(((r2y) obj2).a, JsApiMethodType.CALL_START, jSONObject, null, 12);
                return s3q0.a;
            case 2:
                ((Integer) obj).intValue();
                int i3 = jyz.r1;
                ((jyz) obj2).oo().C(dyz.d.b);
                return s3q0.a;
            case 3:
                MarketEditAlbumGoodVariantsFragment marketEditAlbumGoodVariantsFragment = (MarketEditAlbumGoodVariantsFragment) obj2;
                Good good = (Good) obj;
                int i4 = MarketEditAlbumGoodVariantsFragment.M0;
                long j = good.b;
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = marketEditAlbumGoodVariantsFragment.K0;
                if (goodAlbumEditFlowEntity == null) {
                    goodAlbumEditFlowEntity = null;
                }
                if (goodAlbumEditFlowEntity.i.remove(Long.valueOf(j))) {
                    GoodAlbumEditFlowEntity goodAlbumEditFlowEntity2 = marketEditAlbumGoodVariantsFragment.K0;
                    if (goodAlbumEditFlowEntity2 == null) {
                        goodAlbumEditFlowEntity2 = null;
                    }
                    goodAlbumEditFlowEntity2.j.remove(good);
                } else {
                    GoodAlbumEditFlowEntity goodAlbumEditFlowEntity3 = marketEditAlbumGoodVariantsFragment.K0;
                    if (goodAlbumEditFlowEntity3 == null) {
                        goodAlbumEditFlowEntity3 = null;
                    }
                    goodAlbumEditFlowEntity3.i.add(Long.valueOf(j));
                    GoodAlbumEditFlowEntity goodAlbumEditFlowEntity4 = marketEditAlbumGoodVariantsFragment.K0;
                    if (goodAlbumEditFlowEntity4 == null) {
                        goodAlbumEditFlowEntity4 = null;
                    }
                    goodAlbumEditFlowEntity4.j.add(good);
                }
                tx00 tx00Var = marketEditAlbumGoodVariantsFragment.L0;
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity5 = marketEditAlbumGoodVariantsFragment.K0;
                tx00Var.f = (goodAlbumEditFlowEntity5 != null ? goodAlbumEditFlowEntity5 : 0).i;
                tx00Var.notifyItemChanged(tx00Var.e.indexOf(good));
                return s3q0.a;
            case 4:
                u810 u810Var = (u810) obj2;
                y810 y810Var = (y810) obj;
                ListBuilder e2 = e43.e();
                boolean z = y810Var.l;
                List<ha10> list2 = y810Var.g;
                final boolean z2 = !z;
                r5 = y810Var.k.length() > 0;
                final boolean isEmpty = list2.isEmpty();
                gzs gzsVar = new gzs() { // from class: xsna.r810
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return Boolean.valueOf(z2 && r2 && isEmpty);
                    }
                };
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a = msy.a(lazyThreadSafetyMode, gzsVar);
                Lazy a2 = msy.a(lazyThreadSafetyMode, new dgm(u810Var, y810Var));
                Lazy a3 = msy.a(lazyThreadSafetyMode, new s810(z2, a2, 0));
                if (((Boolean) a.getValue()).booleanValue()) {
                    e2.add(t540.b);
                } else if (((Boolean) a3.getValue()).booleanValue()) {
                    q810 q810Var = (q810) a2.getValue();
                    if (q810Var != null) {
                        e2.add(new v540(q810Var));
                    }
                } else {
                    e2.addAll(u810.k(list2, y810Var));
                    if (y810Var.m) {
                        e2.add(new q540());
                    }
                    if (y810Var.G) {
                        e2.add(new m810(tq.h(tlo0.Companion, R.string.liblists_err_text), new tlo0.f(R.string.liblists_retry), TypeOfItems.GROUP_ITEMS));
                    }
                }
                return e2.g();
            case 5:
                ee10 ee10Var = (ee10) obj2;
                final ge10 ge10Var = (ge10) obj;
                if (ge10Var instanceof ge10.a) {
                    ee10Var.hide();
                } else {
                    if (!(ge10Var instanceof ge10.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final DialogInterface.OnDismissListener onDismissListener = ee10Var.c0;
                    ee10Var.c0 = new DialogInterface.OnDismissListener() { // from class: xsna.de10
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                            if (onDismissListener2 != null) {
                                onDismissListener2.onDismiss(dialogInterface);
                            }
                            ((ge10.b) ge10Var).a.invoke();
                        }
                    };
                    ee10Var.hide();
                }
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((Attach) obj).xb() == ((Attach) obj2).xb());
            case 7:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj2;
                Context context = aVar.k;
                ikv0.a aVar2 = new ikv0.a(context);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_animated_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) r4, i2);
                aVar2.u = new ikv0.d(context.getString(R.string.vkim_msg_report_spam_dialog_toast_message), (String) r4, (ikv0.d.a) r4, 6);
                pkv0.f(aVar2);
                vm30 vm30Var = aVar.o;
                if (vm30Var != null) {
                    vm30Var.e0.dismiss();
                }
                aVar.c0 = null;
                return s3q0.a;
            case 8:
                zl30 zl30Var = (zl30) obj2;
                Msg msg = (Msg) obj;
                if (msg instanceof MsgFromUser) {
                    MsgFromUser msgFromUser = (MsgFromUser) msg;
                    gzn gznVar = new gzn(17);
                    msgFromUser.getClass();
                    if (com.vk.im.engine.models.messages.a.Q7(msgFromUser, gznVar, true) != null) {
                        break;
                    }
                }
                r5 = false;
                return Boolean.valueOf(r5);
            case 9:
                pk30 pk30Var = ((hq30) obj2).d;
                if (pk30Var != null) {
                    pk30Var.b();
                }
                return s3q0.a;
            case 10:
                return (Playlist) obj2;
            case 11:
                ((MusicOfflineCatalogRootVh) obj2).m.b.e.b(new oon0("podcast_episode_download", Collections.singleton(OfflineCatalogCategories.Podcasts.i()), false, false, 12), false);
                return s3q0.a;
            case 12:
                z550 z550Var = (z550) obj2;
                z550Var.n().b(MusicLongtapExitType.CLICK_EXIT);
                z550Var.dismiss();
                return s3q0.a;
            case 13:
                e860 e860Var = (e860) obj2;
                int i5 = e860.z1;
                e860Var.y1 = VkBridgeAnalytics.PersonalDiscountExitReason.ACTION_BUTTON;
                if (e860Var.isAdded() && (dialog = e860Var.s) != null && dialog.isShowing()) {
                    e860Var.hide();
                }
                return s3q0.a;
            case 14:
                ol60 ol60Var = (ol60) obj;
                return Boolean.valueOf(ol60Var instanceof z1c0 ? epx.f((u1c0) obj2, ((z1c0) ol60Var).h) : false);
            case 15:
                cda0 cda0Var = (cda0) obj2;
                cda0.a aVar3 = (cda0.a) obj;
                io.reactivex.rxjava3.core.q<R> L = io.reactivex.rxjava3.core.q.O(aVar3.a).L(new i630(new w7u(cda0Var, 29), 9), false);
                L.getClass();
                io.reactivex.rxjava3.internal.operators.observable.b1 b1Var = new io.reactivex.rxjava3.internal.operators.observable.b1(L);
                List<oea0.a> list3 = aVar3.b;
                if (list3.isEmpty()) {
                    eVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
                } else {
                    aha0 aha0Var = cda0Var.a;
                    ArrayList e3 = cda0.e(list3);
                    aha0Var.getClass();
                    tfx tfxVar = new tfx("photos.declineTags", new io.reactivex.rxjava3.internal.operators.mixed.j(22), new io.reactivex.rxjava3.internal.operators.mixed.k(27));
                    tfxVar.i("tags", e3);
                    eVar = new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(tfxVar)));
                }
                return io.reactivex.rxjava3.core.a.n(b1Var, eVar);
            case 16:
                mha0 mha0Var = (mha0) obj2;
                BasePhotoListFragment basePhotoListFragment = mha0Var.c;
                ((iha0) basePhotoListFragment).P((PhotosGetAlbums.a) obj);
                ((iha0) basePhotoListFragment).q();
                com.vk.lists.c cVar2 = mha0Var.e;
                (cVar2 != null ? cVar2 : null).p(true);
                return s3q0.a;
            case 17:
                int i6 = PictureInPictureOverlayService.g;
                ((PictureInPictureOverlayService) obj2).stopSelf();
                return s3q0.a;
            case 18:
                ((nma0) obj2).e.vn();
                return s3q0.a;
            case 19:
                ((hpb0) obj2).p = ((Integer) obj).intValue();
                return s3q0.a;
            case 20:
                ((u6c0) obj2).a.Mf(-1, new Intent().putExtra("postId", ((Post) obj).n));
                return s3q0.a;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((wh50) obj2).setValue(bool);
                return s3q0.a;
            case 22:
                int intValue = ((Integer) obj).intValue();
                Serializer.c<Narrative> cVar3 = Narrative.CREATOR;
                return Narrative.a.b((Narrative) obj2, intValue);
            case 23:
                ((izd0) obj2).i = true;
                return s3q0.a;
            case 24:
                n6i0 n6i0Var = (n6i0) obj2;
                h.a aVar4 = (h.a) obj;
                n6i0Var.d.setIsShow(false);
                gm50.a.a(n6i0Var, aVar4.b, new xc50(n6i0Var, 16));
                gm50.a.a(n6i0Var, aVar4.c, new i750(n6i0Var, 24));
                gm50.a.a(n6i0Var, aVar4.a, new ece0(n6i0Var, 5));
                return s3q0.a;
            case 25:
                p7j0 p7j0Var = (p7j0) obj2;
                xaz xazVar = (xaz) obj;
                if (xazVar instanceof xaz.d) {
                    String str2 = ((xaz.d) xazVar).b;
                    p7j0Var.getClass();
                    break;
                }
                r5 = false;
                return Boolean.valueOf(r5);
            case 26:
                return SignalingTransport.a((SignalingTransport) obj2, ((Long) obj).longValue());
            case 27:
                h7k0 h7k0Var = (h7k0) obj2;
                ikv0.d.b bVar = (ikv0.d.b) obj;
                ey2.i(h7k0Var.x, bVar != null ? bVar.a : null);
                if ((bVar != null ? bVar.b : null) != null) {
                    h7k0Var.x.setMaxLines(bVar.b.intValue());
                }
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((List) obj).retainAll((Collection) obj2));
            default:
                ny3 ny3Var = new ny3(((ViewGroup) obj).getContext(), -1, cn70.b(48), R.layout.sticker_settings_popup);
                ny3Var.a(new pf40((com.vk.stickers.settings.g) obj2, 23));
                return new m6l0(ny3Var);
        }
    }

    public /* synthetic */ ebx(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
