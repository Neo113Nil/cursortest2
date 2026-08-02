package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbarComposeVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.user.RelativeProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.feed.design.view.newsfeed.ads_carousel.VkFeedOverlayProductCarousel;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeChannelItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stories.design.view.camera.StoryTabType;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.profile.presentation.views.VideoNewProfileToolbarV2;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.bex0;
import xsna.daw0;
import xsna.ddw0;
import xsna.e6w0;
import xsna.equ0;
import xsna.lam0;
import xsna.mot0;
import xsna.qr60;
import xsna.qyr0;
import xsna.tj50;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yyl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yyl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        t2l0 t2l0Var;
        equ0.b bVar;
        xqm xqmVar;
        equ0.b bVar2;
        xqm xqmVar2;
        int i = this.b;
        int i2 = 3;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((fv6) ((com.vk.upload.impl.b) it.next())).g()));
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object obj3 = it2.next();
                while (it2.hasNext()) {
                    obj3 = Integer.valueOf(((Number) obj3).intValue() + ((Number) it2.next()).intValue());
                }
                ref$IntRef.element = ((Number) obj3).intValue();
                return s3q0.a;
            case 1:
                StoryMediaPickerFragment.b bVar3 = (StoryMediaPickerFragment.b) obj2;
                int i3 = StoryMediaPickerFragment.d0;
                int i4 = StoryMediaPickerFragment.c.$EnumSwitchMapping$1[((StoryTabType) obj).ordinal()];
                if (i4 == 1) {
                    bVar3.a.e(0, true);
                } else if (i4 == 2) {
                    bVar3.a.e(1, true);
                }
                return s3q0.a;
            case 2:
                return new lam0.a(((tj50.a) obj).a(new o99((y9m0) obj2, 12), ao8.d));
            case 3:
                int i5 = StoryStatisticsViewersFragment.f0;
                ((StoryStatisticsViewersFragment) obj2).getFeature().m.b((com.vk.stories.design.view.stats.tabs.viewers.mvi.i) obj);
                return s3q0.a;
            case 4:
                return new BitmapDrawable(((acn0) obj2).z.getContext().getResources(), xjo.b((Drawable) obj, 0, 0, 7));
            case 5:
                cmo0 cmo0Var = (cmo0) obj2;
                omo0 omo0Var = (omo0) obj;
                imo0 imo0Var = cmo0Var.f;
                nco0 nco0Var = omo0Var.a;
                imo0Var.g = nco0Var.a;
                imo0Var.j = Boolean.valueOf(nco0Var.b);
                boolean z = omo0Var.c;
                if (!z && (t2l0Var = imo0Var.i) != null) {
                    t2l0Var.a = false;
                }
                cmo0Var.f();
                if (z) {
                    kmo0 kmo0Var = kmo0.CHOOSE_PIPETTE;
                    cmo0Var.w = kmo0Var;
                    cmo0Var.b(kmo0Var);
                }
                return s3q0.a;
            case 6:
                ((Map) obj2).put("long", xa4.K(jgz.j((tny) obj, true)));
                return s3q0.a;
            case 7:
                rhq0 rhq0Var = (rhq0) obj2;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                ArrayList arrayList2 = new ArrayList();
                String str = extendedUserProfile.q0;
                if (str != null) {
                    arrayList2.add(new x4m(R.string.profile_hometown, str));
                }
                String str2 = extendedUserProfile.P0;
                if (str2 != null) {
                    arrayList2.add(new x4m(R.string.personal_langs, str2));
                }
                RelativeProfile[] relativeProfileArr = extendedUserProfile.E;
                if (relativeProfileArr != null && relativeProfileArr.length != 0) {
                    arrayList2.add(rhq0Var.d(relativeProfileArr, R.string.profile_relative_grandparent_f, R.string.profile_relative_grandparent_m, R.string.profile_grandparents));
                }
                RelativeProfile[] relativeProfileArr2 = extendedUserProfile.B;
                if (relativeProfileArr2 != null && relativeProfileArr2.length != 0) {
                    arrayList2.add(rhq0Var.d(relativeProfileArr2, R.string.profile_relative_parent_f, R.string.profile_relative_parent_m, R.string.profile_parents));
                }
                RelativeProfile[] relativeProfileArr3 = extendedUserProfile.C;
                if (relativeProfileArr3 != null && relativeProfileArr3.length != 0) {
                    arrayList2.add(rhq0Var.d(relativeProfileArr3, R.string.profile_relative_sibling_f, R.string.profile_relative_sibling_m, R.string.profile_siblings));
                }
                RelativeProfile[] relativeProfileArr4 = extendedUserProfile.D;
                if (relativeProfileArr4 != null && relativeProfileArr4.length != 0) {
                    arrayList2.add(rhq0Var.d(relativeProfileArr4, R.string.profile_relative_child_f, R.string.profile_relative_child_m, R.string.profile_children));
                }
                RelativeProfile[] relativeProfileArr5 = extendedUserProfile.F;
                if (relativeProfileArr5 != null && relativeProfileArr5.length != 0) {
                    arrayList2.add(rhq0Var.d(relativeProfileArr5, R.string.profile_relative_grandchild_f, R.string.profile_relative_grandchild_m, R.string.profile_grandchildren));
                }
                if (!arrayList2.isEmpty()) {
                    arrayList2.add(0, new o4m(R.string.edit_name_header, 14, null));
                }
                return arrayList2;
            case 8:
                return ((isq0) obj2).b.e(new awq0((qr60.a) obj));
            case 9:
                pqr0 pqr0Var = (pqr0) obj2;
                i0b i0bVar = pqr0Var.n;
                boolean z2 = (i0bVar == null ? null : i0bVar) instanceof lcf0;
                mkr0 mkr0Var = pqr0Var.m;
                if (i0bVar == null) {
                    i0bVar = null;
                }
                mkr0Var.B(i0bVar.getId(), z2);
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CHANNEL;
                i0b i0bVar2 = pqr0Var.n;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, null, null, (i0bVar2 != null ? i0bVar2 : null).r(), null, 46, null), new SchemeStat$TypeChannelItem(pqr0Var.K4()), 2);
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHANNELS;
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(mobileOfficialAppsCoreNavStat$EventScreen, b, uzp0Var.a).q();
                return s3q0.a;
            case 10:
                qcy<Object>[] qcyVarArr = qyr0.m1;
                return new cn50(up2.d(new dp0(i2, (gzs) obj, (qyr0.d) ((qyr0) obj2).h1.getValue()), new z88(), svj.b));
            case 11:
                UIBlock uIBlock = (UIBlock) obj;
                return Boolean.valueOf((uIBlock instanceof UIBlockVideo) && drm0.D(((UIBlockVideo) uIBlock).Sb(), "my/bookmarks", false) && ((UIBlockList) obj2).y.size() == 1);
            case 12:
                VideoLargeListTabletView.b bVar4 = new VideoLargeListTabletView.b((b2a) obj);
                w1a.b(bVar4, null, new com.vk.catalog.mvi.block.video.impl.video.largelisttablet.a((m7a) obj2, bVar4, null), 3);
                return bVar4;
            case 13:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).T(new n.a((List) obj));
                return s3q0.a;
            case 14:
                int i6 = VideoNewProfileToolbarV2.m;
                ((mwm0) obj2).invoke();
                return s3q0.a;
            case 15:
                ((h4t0) obj2).h(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 16:
                Context context = (Context) obj;
                VideoAlbum videoAlbum = ((VideoPlaylistToolbarComposeVh) obj2).i;
                VideoAlbum videoAlbum2 = videoAlbum != null ? videoAlbum : null;
                mot0.b(mot0.a.a, context, videoAlbum2.c, videoAlbum2.b, null, 24);
                return s3q0.a;
            case 17:
                ((xv2) obj2).invoke(b.g.b);
                ((ikv0) obj).a();
                return s3q0.a;
            case 18:
                gqu0 gqu0Var = (gqu0) obj2;
                int itemId = ((MenuItem) obj).getItemId();
                if (itemId == R.id.call) {
                    if (gqu0Var.g && (bVar2 = gqu0Var.d) != null && (xqmVar2 = equ0.this.l) != null) {
                        xqmVar2.b();
                    }
                } else if (itemId == R.id.add) {
                    equ0.b bVar5 = gqu0Var.d;
                    if (bVar5 != null) {
                        equ0 equ0Var = equ0.this;
                        xqm xqmVar3 = equ0Var.l;
                        if (xqmVar3 != null) {
                            xqmVar3.c();
                        }
                        equ0Var.i.D(equ0Var, new puu());
                        gqu0 gqu0Var2 = equ0Var.n;
                        s5o s5oVar = (gqu0Var2 != null ? gqu0Var2 : null).h;
                        if (s5oVar != null) {
                            s5oVar.e = false;
                            s5oVar.invalidateSelf();
                        }
                    }
                } else if (itemId == R.id.search && (bVar = gqu0Var.d) != null && (xqmVar = equ0.this.l) != null) {
                    xqmVar.e();
                }
                return Boolean.TRUE;
            case 19:
                int i7 = VkFeedOverlayProductCarousel.A;
                ((VkFeedOverlayProductCarousel) obj2).V4(false);
                return s3q0.a;
            case 20:
                Toast.makeText(((iwu0) obj2).b, R.string.vk_common_network_error, 0).show();
                return s3q0.a;
            case 21:
                ts tsVar = (ts) obj;
                r6y r6yVar = ((fwv0) obj2).b;
                if (r6yVar != null) {
                    JsApiMethodType jsApiMethodType = JsApiMethodType.GET_EMAIL;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sign", tsVar.a);
                    jSONObject.put("email", tsVar.b);
                    bex0.a.b(r6yVar, jsApiMethodType, jSONObject, null, 12);
                }
                return s3q0.a;
            case 22:
                m6w0 m6w0Var = (m6w0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m6w0Var.C(e6w0.m.b);
                }
                return s3q0.a;
            case 23:
                return new n6w0((ViewGroup) obj, (b8w0) obj2);
            case 24:
                daw0 daw0Var = (daw0) obj2;
                VmojiProductModel vmojiProductModel = (VmojiProductModel) obj;
                daw0.a aVar = daw0Var.k;
                RecyclerView recyclerView = daw0Var.g;
                f6w0 f6w0Var = daw0Var.j;
                ArrayList arrayList3 = new ArrayList(aVar.h);
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        hfz hfzVar = (hfz) it3.next();
                        if (hfzVar instanceof l9w0) {
                            l9w0 l9w0Var = (l9w0) hfzVar;
                            VmojiProductModel vmojiProductModel2 = l9w0Var.b;
                            VmojiProductModel vmojiProductModel3 = l9w0Var.b;
                            if (epx.f(vmojiProductModel2, vmojiProductModel)) {
                                l9w0Var = new l9w0(vmojiProductModel3, true);
                            } else if (l9w0Var.c) {
                                l9w0Var = new l9w0(vmojiProductModel3, false);
                            }
                            arrayList4.add(l9w0Var);
                        }
                    } else {
                        aVar.setItems(arrayList4);
                    }
                }
                if (vmojiProductModel == null) {
                    f6w0Var.a(false);
                    f4m.v(0, recyclerView);
                } else {
                    f6w0Var.b(vmojiProductModel);
                    f4m.v(daw0Var.i.getHeight(), recyclerView);
                }
                return s3q0.a;
            case 25:
                cdw0 cdw0Var = (cdw0) obj2;
                int i8 = cdw0.o1;
                if (!(((ddw0) obj) instanceof ddw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Dialog dialog = cdw0Var.s;
                nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                if (nw20Var != null) {
                    nw20Var.cancel();
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 26:
                ((mjw0) obj2).setControlsAreHidden(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 27:
                ((nrw0) obj2).q(xcw0.e0.a);
                return s3q0.a;
            case 28:
                Intent intent = (Intent) obj;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.startActivityForResult(intent, 2023);
                }
                return s3q0.a;
            default:
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.w();
                ((xkx0) obj2).B0();
                return s3q0.a;
        }
    }

    public /* synthetic */ yyl0(dks0 dks0Var, UIBlockList uIBlockList) {
        this.b = 11;
        this.c = uIBlockList;
    }
}
