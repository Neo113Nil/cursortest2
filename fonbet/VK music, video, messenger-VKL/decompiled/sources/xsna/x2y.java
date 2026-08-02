package xsna;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.catalog2.feature.music.holders.MusicActionSaveAsPlaylistButtonVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.clips.design.view.interests.NextButton;
import com.vk.content.design.view.photo.flow.PhotoFlowHeaderView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.imageloader.view.VKImageView;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.multiplecoownership.model.MultipleCoownershipModel;
import com.vk.multiplecoownership.model.MultipleCoownershipType;
import com.vk.music.informer.mvi.d;
import com.vk.music.informer.mvi.h;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.toggle.features.MusicFeatures;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vk.voip.ui.picture_in_picture.view.PictureInPictureViewMode;
import com.vk.voip.ui.view.VideoView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.b7c0;
import xsna.bex0;
import xsna.c7c0;
import xsna.cca0;
import xsna.g34;
import xsna.nov;
import xsna.nsz;
import xsna.q14;
import xsna.tj50;
import xsna.tlo0;
import xsna.xja0;
import xsna.z430;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x2y implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x2y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [com.vk.music.onboarding.impl.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tlo0.a aVar;
        int i;
        g530 g530Var;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                x6y x6yVar = ((y2y) obj2).a;
                List<lhn0> list = (List) obj;
                if (list.isEmpty()) {
                    bex0.a.a(x6yVar, JsApiMethodType.GET_PRODUCT_INFO, VkAppsErrors.Client.UNKNOWN_ERROR, "List is empty", null, null, 56);
                } else {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (lhn0 lhn0Var : list) {
                        JSONObject jSONObject = new JSONObject();
                        String str = lhn0Var.e;
                        boolean z = lhn0Var.d;
                        jSONObject.put("id", str);
                        jSONObject.put("price", lhn0Var.c);
                        jSONObject.put("title", lhn0Var.b);
                        jSONObject.put("purchase_type", z ? "mini_app_subs" : "mini_app_inapp");
                        jSONObject.put("period", lhn0Var.f);
                        if (z) {
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray2.put(jSONObject);
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(InAppPurchaseMetaData.KEY_CURRENCY, ((lhn0) j5g.Y(list)).a);
                    jSONObject2.put("items", jSONArray2);
                    jSONObject2.put("subs", jSONArray);
                    bex0.a.b(x6yVar, JsApiMethodType.GET_PRODUCT_INFO, jSONObject2, null, 12);
                }
                return s3q0.a;
            case 1:
                return ((gzs) obj2).invoke();
            case 2:
                return Boolean.valueOf(((j1z) obj2).r.a(((qnw) obj).a));
            case 3:
                float f = ListGroupCallView.o0;
                ((ListGroupCallView) obj2).c5();
                return s3q0.a;
            case 4:
                return new rlz((ViewGroup) obj, ((olz) obj2).i);
            case 5:
                return new nsz.a(((tj50.a) obj).a(new h6g((lsz) obj2, 28), ao8.d));
            case 6:
                v800 v800Var = (v800) obj2;
                v800 v800Var2 = new v800((i700) obj, v800Var.j, v800Var.i, v800Var.k);
                nov.a.b(v800Var, v800Var2);
                return v800Var2;
            case 7:
                ((ti00) obj2).d.onNext((List) obj);
                return s3q0.a;
            case 8:
                a510 a510Var = (a510) obj2;
                x410 x410Var = (x410) obj;
                boolean z2 = x410Var.g;
                boolean z3 = x410Var.l;
                boolean z4 = x410Var.p == MarketItemType.OZON || x410Var.q != null;
                a510Var.getClass();
                if (z4) {
                    aVar = tlo0.Companion;
                    i = R.string.market_item_empty_list_description_for_ozon;
                } else if (z2 || !z3) {
                    aVar = tlo0.Companion;
                    i = R.string.market_item_empty_list_description_for_user;
                } else {
                    aVar = tlo0.Companion;
                    i = R.string.market_item_empty_list_description_for_admin;
                }
                return tq.h(aVar, i);
            case 9:
                sf20 sf20Var = (sf20) obj2;
                q14 q14Var = (q14) obj;
                h34 h34Var = sf20Var.e;
                SparseIntArray sparseIntArray = sf20Var.v;
                SparseIntArray sparseIntArray2 = sf20Var.u;
                if (q14Var instanceof q14.c) {
                    q14.c cVar = (q14.c) q14Var;
                    int xb = cVar.a.xb();
                    int i3 = cVar.b;
                    sparseIntArray2.put(xb, i3);
                    int i4 = cVar.c;
                    sparseIntArray.put(xb, i4);
                    h34Var.b(xb, i3, i4);
                } else if (q14Var instanceof q14.b) {
                    int xb2 = ((q14.b) q14Var).a.xb();
                    sparseIntArray2.delete(xb2);
                    sparseIntArray.delete(xb2);
                    g34.a aVar2 = (g34.a) h34Var.a.get(Integer.valueOf(xb2));
                    if (aVar2 != null) {
                        aVar2.f(xb2);
                    }
                } else {
                    if (!(q14Var instanceof q14.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int xb3 = ((q14.a) q14Var).a.xb();
                    sparseIntArray2.delete(xb3);
                    sparseIntArray.delete(xb3);
                    g34.a aVar3 = (g34.a) h34Var.a.get(Integer.valueOf(xb3));
                    if (aVar3 != null) {
                        aVar3.c(xb3);
                    }
                }
                return s3q0.a;
            case 10:
                v530 v530Var = (v530) obj2;
                z430 z430Var = (z430) obj;
                if (z430Var instanceof z430.d) {
                    g530 g530Var2 = v530Var.b;
                    if (g530Var2 != null) {
                        g530Var2.H2();
                    }
                } else if (z430Var instanceof z430.a) {
                    g530 g530Var3 = v530Var.b;
                    if (g530Var3 != null) {
                        g530Var3.g3();
                    }
                } else if ((z430Var instanceof z430.c) && (g530Var = v530Var.b) != null) {
                    g530Var.H2();
                }
                return s3q0.a;
            case 11:
                MoneyTransferLinkFragment moneyTransferLinkFragment = (MoneyTransferLinkFragment) obj2;
                Throwable th = (Throwable) obj;
                int i5 = MoneyTransferLinkFragment.u0;
                moneyTransferLinkFragment.onError(th instanceof Exception ? (Exception) th : null);
                int i6 = kwg0.a;
                return s3q0.a;
            case 12:
                com.vk.im.design.view.pagination.pin.e eVar = (com.vk.im.design.view.pagination.pin.e) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                t9w t9wVar = eVar.j;
                bcr0<? extends ImageView> bcr0Var = eVar.k;
                if (bcr0Var != null) {
                    return new com.vk.im.design.view.pagination.pin.f(t9wVar, bcr0Var, viewGroup);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 13:
                MusicActionSaveAsPlaylistButtonVh musicActionSaveAsPlaylistButtonVh = (MusicActionSaveAsPlaylistButtonVh) obj2;
                musicActionSaveAsPlaylistButtonVh.i = null;
                int i7 = musicActionSaveAsPlaylistButtonVh.g;
                VkButton vkButton = musicActionSaveAsPlaylistButtonVh.e;
                VkButton vkButton2 = vkButton != null ? vkButton : null;
                if (vkButton == null) {
                    vkButton = null;
                }
                Drawable e = enj.e(i7, R.attr.vk_ui_background_accent_themed, vkButton.getContext());
                int[] iArr = VkButton.W;
                vkButton2.Z4(e, true);
                int i8 = musicActionSaveAsPlaylistButtonVh.h;
                VkButton vkButton3 = musicActionSaveAsPlaylistButtonVh.e;
                (vkButton3 != null ? vkButton3 : null).setText(i8);
                return s3q0.a;
            case 14:
                ((MusicCatalogRootVh) obj2).i8((bnn0) obj);
                return s3q0.a;
            case 15:
                return rsg0.T(yfb.x(hx4.C((hx4) ((vh40) obj2).l.getValue(), o25.a().c(), null, null, Integer.valueOf(((Integer) obj).intValue() * 1000), 1000, null, null, 16190))).U(new qj4(new t3v(4), 21));
            case 16:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new bj40((ej40) obj2, null), 3));
            case 17:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj2;
                if (musicMyAudiosCatalogRootVh.v) {
                    return s3q0.a;
                }
                ro40 ro40Var = musicMyAudiosCatalogRootVh.x;
                if (ro40Var != null && !ro40Var.k) {
                    musicMyAudiosCatalogRootVh.m.b.e.b(new ktf0(musicMyAudiosCatalogRootVh.L.l()), false);
                }
                return s3q0.a;
            case 18:
                com.vk.music.informer.mvi.d dVar = (com.vk.music.informer.mvi.d) obj2;
                lt3 lt3Var = (lt3) obj;
                if (lt3Var == null) {
                    dVar.T(h.c.b);
                }
                d.c cVar2 = dVar.k;
                d.b a = d.b.a(cVar2.b, lt3Var, lt3Var != null && MusicFeatures.AUDIO_ARTIST_CONCERTS_INFORMER.h(), false, false, false, false, 60);
                cVar2.b = a;
                lt3 lt3Var2 = a.a;
                if (lt3Var2 != null && a.b && a.c && !a.d && a.e && !a.f) {
                    cVar2.a.invoke(lt3Var2);
                }
                return s3q0.a;
            case 19:
                Pair pair = (Pair) obj;
                ((MusicRecommendationOnboardingContract$Presenter) obj2).c.x3((List) pair.i(), (Artist) pair.j());
                return s3q0.a;
            case 20:
                return new fym0((ViewGroup) obj, (obh) obj2);
            case 21:
                int i9 = NextButton.d;
                ((NextButton.a) obj2).a((View) obj, NextButton.ClickType.NEXT);
                return s3q0.a;
            case 22:
                ohk0 f2 = ((ks80) obj2).f().f((String) obj);
                if (f2 != null) {
                    f2.c("onFirstBytes");
                }
                return s3q0.a;
            case 23:
                ((h990) obj2).n.invoke((String) obj);
                return s3q0.a;
            case 24:
                return (io.reactivex.rxjava3.core.q) obj2;
            case 25:
                PhotoFlowHeaderView.a aVar4 = ((PhotoFlowHeaderView) obj2).y;
                if (aVar4 != null) {
                    aVar4.a();
                }
                return s3q0.a;
            case 26:
                ((kca0) obj2).a.getFeature().C(new cca0.b((qba0) obj));
                return s3q0.a;
            case 27:
                eka0 eka0Var = (eka0) obj2;
                PictureInPictureViewMode pictureInPictureViewMode = eka0Var.a;
                VideoView videoView = eka0Var.n;
                VideoView videoView2 = eka0Var.m;
                View view = eka0Var.l;
                VKImageView vKImageView = eka0Var.e;
                View view2 = eka0Var.k;
                View view3 = eka0Var.j;
                if (epx.f((xja0) obj, xja0.b.a)) {
                    bwt0.p0(eka0Var.d, false);
                    bwt0.p0(vKImageView, false);
                    bwt0.p0(eka0Var.f, false);
                    bwt0.p0(eka0Var.g, false);
                    bwt0.p0(eka0Var.h, false);
                    bwt0.p0(eka0Var.i, false);
                    bwt0.p0(view3, false);
                    bwt0.p0(view2, false);
                    bwt0.p0(view, false);
                    bwt0.p0(videoView2, false);
                    videoView2.b();
                    bwt0.p0(videoView, false);
                    videoView.b();
                } else {
                    bwt0.p0(vKImageView, true);
                    PictureInPictureViewMode pictureInPictureViewMode2 = PictureInPictureViewMode.OVERLAY;
                    bwt0.p0(view3, pictureInPictureViewMode == pictureInPictureViewMode2);
                    bwt0.p0(view2, pictureInPictureViewMode == pictureInPictureViewMode2);
                    bwt0.p0(view, bwt0.K(view3) || bwt0.K(view2));
                }
                return s3q0.a;
            case 28:
                j1c0 j1c0Var = (j1c0) obj2;
                m1c0 m1c0Var = (m1c0) j1c0Var.C;
                if (m1c0Var != null) {
                    Owner owner = m1c0Var.i;
                    Post post = m1c0Var.h;
                    NewsfeedCoowners newsfeedCoowners = post.f0;
                    List list2 = newsfeedCoowners != null ? newsfeedCoowners.g : null;
                    if (list2 == null) {
                        list2 = EmptyList.b;
                    }
                    if (!((t740) j1c0Var.F.getValue()).a(j1c0Var.itemView.getContext(), new MultipleCoownershipModel(list2, MultipleCoownershipType.Approve, post, owner.b))) {
                        ((c1c0) j1c0Var.E.getValue()).n(j1c0Var.itemView.getContext(), post, owner.b, m1c0Var.j.b);
                    }
                }
                return s3q0.a;
            default:
                c7c0.c cVar3 = (c7c0.c) obj2;
                b7c0.a aVar5 = cVar3.m;
                if (aVar5 != null) {
                    cVar3.l.h(aVar5.b);
                }
                return s3q0.a;
        }
    }
}
