package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.audio.dto.AudioSpecialProjectDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ReviewStatus;
import com.vk.ecomm.reviews.impl.allreviews.presentation.MarketAllReviewsTabTypes;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.music.bottomsheets.domain.model.LinkButtonEntity;
import com.vk.music.bottomsheets.domain.model.PromoInfoEntity;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.posting.presentation.video.search.c;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stickers.settings.i;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import xsna.asl0;
import xsna.dra0;
import xsna.drz;
import xsna.evd0;
import xsna.i8a0;
import xsna.ij20;
import xsna.q8a0;
import xsna.rwi0;
import xsna.sl90;
import xsna.tj50;
import xsna.usf0;
import xsna.y2u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d0w implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x06da, code lost:
    
        if (r2.f == true) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0735, code lost:
    
        if (r2.f == true) goto L283;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        ?? r13;
        Iterator it;
        int i;
        ?? r14;
        int i2;
        Bundle bundle;
        String url;
        int i3 = 10;
        Context context = null;
        boolean z4 = false;
        boolean z5 = true;
        switch (this.b) {
            case 0:
                ImCreateChatFragment imCreateChatFragment = (ImCreateChatFragment) this.c;
                FrameLayout frameLayout = imCreateChatFragment.W;
                if (frameLayout == null) {
                    frameLayout = null;
                }
                View view = imCreateChatFragment.S;
                f4m.v((view == null ? null : view).getMeasuredHeight(), frameLayout);
                return s3q0.a;
            case 1:
                c5w c5wVar = ((z5w) this.c).d;
                com.vk.im.engine.models.im_item.a aVar = ((n5w) ((drz.a) obj).a).b.h;
                if (aVar != null) {
                    z = true;
                    break;
                } else {
                    z = true;
                }
                if (aVar == null || aVar.g != z) {
                    if (aVar != null) {
                        z2 = true;
                        break;
                    } else {
                        z2 = true;
                    }
                    if (aVar == null || aVar.g != z2) {
                        c5wVar.a();
                    }
                    return s3q0.a;
                }
                if (!hg1.d(c5wVar.f) && !hg1.d(c5wVar.g)) {
                    c5wVar.e = z;
                    int i4 = 17;
                    c5wVar.f = hg1.i(xa4.I(new io.reactivex.rxjava3.internal.operators.single.o(c5wVar.a.b(c5wVar, c5wVar.b.f()), new ir0(new igh(c5wVar, i4), i4)), 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE).q(c5wVar.c), new xcd(c5wVar, 27));
                }
                return s3q0.a;
            case 2:
                ((ArrayList) this.c).clear();
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 3:
                LocalMediaPickerFragment localMediaPickerFragment = (LocalMediaPickerFragment) this.c;
                PostingAction postingAction = (PostingAction) obj;
                int i5 = LocalMediaPickerFragment.d0;
                efc0 go = localMediaPickerFragment.go();
                if (go != null) {
                    go.C(postingAction);
                }
                return s3q0.a;
            case 4:
                ((ij20.a) obj).l(((ni00) this.c).b);
                return s3q0.a;
            case 5:
                return new dt00((ViewGroup) obj, ((wr00) this.c).i);
            case 6:
                ft00 ft00Var = (ft00) obj;
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.d) this.c).d.getClass();
                List<cf10> list = ft00Var.l;
                Throwable th = ft00Var.s;
                int i6 = ft00Var.g;
                boolean z6 = ft00Var.q;
                List<df10> list2 = ft00Var.h;
                ListBuilder e = e43.e();
                List<a610> list3 = ft00Var.e;
                if (list3.isEmpty()) {
                    z3 = false;
                } else {
                    z3 = false;
                    e.add(new us00(String.valueOf(ft00Var.c), new h610(ft00Var.d, list3)));
                }
                List<a610> list4 = list3;
                e.add(new gt00(!list4.isEmpty(), list3.isEmpty() ? R.drawable.market_all_reviews_tabs_view_holder_without_offers_view_background : R.drawable.market_all_reviews_tabs_view_holder_background, String.valueOf(i6), String.valueOf(ft00Var.j), ft00Var.t));
                if (ft00Var.t == MarketAllReviewsTabTypes.MARKET_ITEM) {
                    if (!list2.isEmpty()) {
                        int i7 = ft00Var.g;
                        boolean z7 = true;
                        for (df10 df10Var : list2) {
                            List<List<BaseImageDto>> list5 = df10Var.o;
                            if (list5 != null) {
                                List<List<BaseImageDto>> list6 = list5;
                                r14 = new ArrayList(c5g.u(list6, i3));
                                Iterator it2 = list6.iterator();
                                while (it2.hasNext()) {
                                    r14.add(y2u0.a.a((List) it2.next()));
                                }
                            } else {
                                r14 = context;
                            }
                            if (r14 == 0) {
                                r14 = EmptyList.b;
                            }
                            List list7 = r14;
                            boolean z8 = !list4.isEmpty();
                            String str = df10Var.l;
                            String str2 = df10Var.m;
                            String str3 = df10Var.n;
                            Context context2 = e43.a;
                            boolean z9 = z5;
                            SpannableStringBuilder c = nig0.c(context2 != null ? context2 : context, str, str2, str3);
                            if (df10Var.t) {
                                e.add(new ct00(df10Var.d, df10Var.k, df10Var.a, z7 ? R.drawable.market_all_reviews_first_item_view_holder_background : R.drawable.market_all_reviews_item_view_holder_background));
                                i2 = i7;
                            } else {
                                String str4 = df10Var.d;
                                int i8 = df10Var.e;
                                BaseImageDto baseImageDto = df10Var.k;
                                String str5 = df10Var.a;
                                int i9 = df10Var.h;
                                boolean z10 = df10Var.q;
                                i2 = i7;
                                int i10 = df10Var.i;
                                ReviewStatus reviewStatus = df10Var.b;
                                e.add(new os00(str4, i8, baseImageDto, str5, i9, list7, c, z10, i10, reviewStatus, df10Var.c, kt00.a(reviewStatus), z7 ? R.drawable.market_all_reviews_first_item_view_holder_background : R.drawable.market_all_reviews_item_view_holder_background, (df10Var.s || df10Var.r) ? z9 : z3, z8, i2));
                            }
                            z7 = z3;
                            i7 = i2;
                            z5 = z9;
                            i3 = 10;
                            context = null;
                        }
                        if (z6) {
                            e.add(hig0.b);
                        }
                        if (i6 > 0 && th != null) {
                            e.add(new he90());
                        }
                    } else if (list3.isEmpty()) {
                        e.add(new as00(R.string.market_all_reviews_good_empty_list_without_offers_title, Integer.valueOf(R.string.market_all_reviews_good_empty_list_without_offers_description)));
                    } else {
                        e.add(new as00(R.string.market_all_reviews_good_empty_list_title, Integer.valueOf(R.string.market_all_reviews_good_empty_list_description)));
                    }
                } else if (list.isEmpty()) {
                    e.add(new as00(R.string.market_all_reviews_community_empty_list_title, null));
                } else {
                    List list8 = null;
                    int i11 = ft00Var.j;
                    Iterator it3 = list.iterator();
                    boolean z11 = true;
                    while (it3.hasNext()) {
                        cf10 cf10Var = (cf10) it3.next();
                        List<List<BaseImageDto>> list9 = cf10Var.k;
                        boolean z12 = cf10Var.m;
                        if (list9 != null) {
                            List<List<BaseImageDto>> list10 = list9;
                            r13 = new ArrayList(c5g.u(list10, 10));
                            Iterator it4 = list10.iterator();
                            while (it4.hasNext()) {
                                r13.add(y2u0.a.a((List) it4.next()));
                            }
                        } else {
                            r13 = list8;
                        }
                        if (r13 == 0) {
                            r13 = EmptyList.b;
                        }
                        List list11 = r13;
                        boolean z13 = !list4.isEmpty();
                        BaseImageDto baseImageDto2 = cf10Var.j;
                        List singletonList = baseImageDto2 != null ? Collections.singletonList(baseImageDto2) : list8;
                        if (singletonList == null) {
                            singletonList = EmptyList.b;
                        }
                        List list12 = singletonList;
                        if (cf10Var.o) {
                            e.add(new at00(cf10Var.a, cf10Var.b, z11 ? R.drawable.market_all_reviews_first_item_view_holder_background : R.drawable.market_all_reviews_item_view_holder_background, cf10Var.c));
                            it = it3;
                            i = i11;
                        } else {
                            int i12 = cf10Var.a;
                            int i13 = cf10Var.b;
                            String str6 = cf10Var.c;
                            int i14 = cf10Var.f;
                            String str7 = cf10Var.i;
                            it = it3;
                            boolean z14 = cf10Var.l;
                            int i15 = cf10Var.g;
                            ReviewStatus reviewStatus2 = cf10Var.d;
                            i = i11;
                            e.add(new xr00(i12, i13, list12, str6, i14, list11, str7, z14, i15, reviewStatus2, cf10Var.e, kt00.a(reviewStatus2), z11 ? R.drawable.market_all_reviews_first_item_view_holder_background : R.drawable.market_all_reviews_item_view_holder_background, (cf10Var.n || z12) ? true : z3, (z12 && reviewStatus2 == ReviewStatus.REJECTED) ? true : z3, z13, i));
                        }
                        z11 = z3;
                        it3 = it;
                        i11 = i;
                        list8 = null;
                    }
                    if (z6) {
                        e.add(hig0.b);
                    }
                    if (i6 > 0 && th != null) {
                        e.add(new he90());
                    }
                }
                return e.g();
            case 7:
                return new uvl((ViewGroup) obj, ((n310) this.c).k);
            case 8:
                m340 m340Var = (m340) this.c;
                m340Var.c = true;
                BaseSharingExternalActivity baseSharingExternalActivity = m340Var.a.get();
                if (baseSharingExternalActivity != null) {
                    m340Var.c(baseSharingExternalActivity);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 9:
                gz60 gz60Var = (gz60) this.c;
                bfr bfrVar = (bfr) obj;
                cfr<UserProfile> cfrVar = bfrVar.a;
                int i16 = cfrVar.a;
                cfr<Group> cfrVar2 = bfrVar.b;
                afr afrVar = new afr(i16, cfrVar2.a);
                shb shbVar = gz60Var.b;
                shbVar.a = cfrVar;
                io.reactivex.rxjava3.core.a aVar2 = io.reactivex.rxjava3.internal.operators.completable.i.b;
                shbVar.b = cfrVar2;
                return aVar2.c(aVar2).e(io.reactivex.rxjava3.core.x.k(afrVar));
            case 10:
                wl90 wl90Var = (wl90) this.c;
                rl90 rl90Var = (rl90) obj;
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PASSKEY_SCREEN_OPEN, null, null, null, null, null, null, 254);
                sl90.b bVar = sl90.b.c;
                ul90 ul90Var = (ul90) wl90Var.a;
                if (ul90Var != null) {
                    ul90Var.Yl(bVar);
                }
                wl90Var.z.signInViaPasskey(wl90Var.y, rl90Var.a);
                return s3q0.a;
            case 11:
                return ((Dialog) ((wpp) obj).c.get(Long.valueOf(((Peer) this.c).b))).Hb().b;
            case 12:
                ((z8a0) this.c).e.invoke(new i8a0.d((q8a0.a) obj));
                return s3q0.a;
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((lx60) this.c).invoke((dra0.c) obj);
            case 14:
                Playlist playlist = (Playlist) this.c;
                Playlist playlist2 = (Playlist) obj;
                if (playlist2 != null && playlist2.Db() == playlist.Db()) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 15:
                ojb0 ojb0Var = (ojb0) this.c;
                Context context3 = (Context) obj;
                ThumbsImageView thumbsImageView = new ThumbsImageView(context3, null, 6, 0);
                thumbsImageView.setId(R.id.image_thumb);
                thumbsImageView.setHasBorderLine(true);
                thumbsImageView.setRadiusCorner(context3.getResources().getDimension(ojb0Var.b ? R.dimen.music_image_corners_8 : R.dimen.music_image_corners_12));
                thumbsImageView.setBackgroundImageAttr(R.attr.vk_ui_image_placeholder);
                thumbsImageView.h(R.drawable.vk_icon_podcast_48);
                return thumbsImageView;
            case 16:
                pgc0 pgc0Var = pgc0.this;
                if (pgc0Var.m && g620.f().getExperiments().c()) {
                    z4 = true;
                }
                pgc0Var.v0(z4, pgc0Var.r, null);
                return s3q0.a;
            case 17:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) this.c;
                RecyclerView recyclerView = productsSelectionBottomSheet.i1;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.setVisibility(8);
                VkSpinner vkSpinner = productsSelectionBottomSheet.n1;
                if (vkSpinner == null) {
                    vkSpinner = null;
                }
                vkSpinner.setVisibility(8);
                ComposeView composeView = productsSelectionBottomSheet.m1;
                if (composeView == null) {
                    composeView = null;
                }
                composeView.setVisibility(0);
                ComposeView composeView2 = productsSelectionBottomSheet.m1;
                (composeView2 != null ? composeView2 : null).setContent(new jai(-874414618, new a86(productsSelectionBottomSheet, 14), true));
                return s3q0.a;
            case 18:
                evd0.d dVar = (evd0.d) this.c;
                Narrative narrative = (Narrative) dVar.m;
                if (narrative != null) {
                    dVar.n.invoke(narrative, new WeakReference<>(dVar.itemView));
                }
                return s3q0.a;
            case 19:
                ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) this.c;
                int i17 = ProfileMainPhotosFragment.F0;
                new PhotoAlbumFragment.a(profileMainPhotosFragment.y0.f, (PhotoAlbum) obj, false).l(profileMainPhotosFragment);
                return s3q0.a;
            case 20:
                com.vk.upload.impl.tasks.u uVar = (com.vk.upload.impl.tasks.u) this.c;
                ncq0 ncq0Var = (ncq0) obj;
                String i0 = uVar.i0(ncq0Var.a);
                String str8 = ncq0Var.b;
                return new ncq0(i0, str8 != null ? uVar.i0(str8) : null, null, null, null, 28);
            case 21:
                Integer num = (Integer) this.c;
                AudioSpecialProjectDto audioSpecialProjectDto = (AudioSpecialProjectDto) obj;
                ic40 w = lyd.g().w();
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null) {
                    return s3q0.a;
                }
                int intValue = num.intValue();
                String title = audioSpecialProjectDto.getTitle();
                String i18 = audioSpecialProjectDto.i();
                String title2 = audioSpecialProjectDto.e().getTitle();
                String str9 = "";
                if (title2 == null) {
                    title2 = "";
                }
                BaseLinkButtonActionDto e2 = audioSpecialProjectDto.e().e();
                if (e2 != null && (url = e2.getUrl()) != null) {
                    str9 = url;
                }
                BaseLinkButtonActionDto e3 = audioSpecialProjectDto.e().e();
                Object e4 = e3 != null ? e3.e() : null;
                JSONObject jSONObject = e4 instanceof JSONObject ? (JSONObject) e4 : null;
                if (jSONObject != null) {
                    Serializer.c<AwayLink> cVar = AwayLink.CREATOR;
                    bundle = AwayLink.a.a(jSONObject);
                } else {
                    bundle = null;
                }
                LinkButtonEntity linkButtonEntity = new LinkButtonEntity(title2, str9, bundle);
                String str10 = epx.f(audioSpecialProjectDto.g().i(), "avatar") ? "avatar" : "image";
                List<BaseImageDto> f = audioSpecialProjectDto.f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                for (BaseImageDto baseImageDto3 : f) {
                    arrayList.add(new ImageSize(baseImageDto3.getUrl(), baseImageDto3.getWidth(), baseImageDto3.getHeight(), baseImageDto3.e(), (char) 0, false, 48, null));
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                Image image = arrayList != null ? new Image(arrayList) : null;
                List<BaseImageDto> d = audioSpecialProjectDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (BaseImageDto baseImageDto4 : d) {
                    arrayList2.add(new ImageSize(baseImageDto4.getUrl(), baseImageDto4.getWidth(), baseImageDto4.getHeight(), baseImageDto4.e(), (char) 0, false, 48, null));
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                w.h(b, intValue, new PromoInfoEntity(title, i18, linkButtonEntity, str10, image, arrayList2 != null ? new Image(arrayList2) : null, audioSpecialProjectDto.r()));
                return s3q0.a;
            case 22:
                return new usf0.a(((tj50.a) obj).a(new nyq((qsf0) this.c), sd9.d));
            case 23:
                ((rzh0) this.c).T(new c.a.C1547a(new ewp((Throwable) obj)));
                return s3q0.a;
            case 24:
                ((dfi0) this.c).b.a((nov) obj);
                return s3q0.a;
            case 25:
                ((mwi0) this.c).V(rwi0.a.f.a);
                return s3q0.a;
            case 26:
                SizeSeekBarView sizeSeekBarView = (SizeSeekBarView) this.c;
                sizeSeekBarView.i = true;
                sizeSeekBarView.b();
                return s3q0.a;
            case 27:
                return new i6l0((ViewGroup) obj, new com.vk.stickers.settings.h(2, (com.vk.stickers.settings.g) this.c, i.b.class, "onSettingChanged", "onSettingChanged(Lcom/vk/stickers/settings/StickerSettingsCheckItem$Setting;Z)V", 0));
            case 28:
                return (mol0) this.c;
            default:
                qtl0 qtl0Var = (qtl0) this.c;
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) obj;
                qtl0Var.b.j(getStoriesResponse);
                qtl0Var.c.g(getStoriesResponse.f);
                qtl0Var.d.i(true);
                qtl0Var.h(getStoriesResponse, false);
                qtl0Var.f.a(new asl0.c(getStoriesResponse.c));
                return s3q0.a;
        }
    }
}
