package xsna;

import android.content.Context;
import android.view.View;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.market.dto.MarketCommunityExternalLinkDetailsDto;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorPatch;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.common.view.EditText;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.music.view.ThumbsImageView;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapperImpl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import xsna.bya;
import xsna.chd;
import xsna.dhd;
import xsna.ea6;
import xsna.eya;
import xsna.g69;
import xsna.ot5;
import xsna.qy3;
import xsna.rcb;
import xsna.tj50;
import xsna.y6d;
import xsna.yg8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Type inference failed for: r13v111, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        UserId userId;
        int i = this.b;
        boolean z2 = true;
        ot5.a aVar = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                EditText editText = (EditText) obj2;
                View view = (View) obj;
                int i2 = ym0.k1;
                view.requestFocus();
                mhy.j(view);
                editText.setSelection(editText.length());
                return s3q0.a;
            case 1:
                ((wt0) obj2).l.g();
                return s3q0.a;
            case 2:
                ((b.d) obj).b(((StoryEntry) obj2).u, "track_code");
                return s3q0.a;
            case 3:
                com.vk.photos.root.albumdetails.presentation.c cVar = (com.vk.photos.root.albumdetails.presentation.c) obj2;
                k.b bVar = (k.b) obj;
                bh1 bh1Var = cVar.n;
                PhotoFlowToolbarView photoFlowToolbarView = cVar.k;
                bh1Var.submitList(Collections.singletonList(bVar));
                cVar.l.setTitle(bVar.a);
                if (bVar.d) {
                    photoFlowToolbarView.T4(R.drawable.vk_icon_more_vertical_24, R.string.album_details_setting_button_content_description);
                } else {
                    photoFlowToolbarView.t.setVisibility(8);
                }
                return s3q0.a;
            case 4:
                return AnimojiRenderWrapperImpl.b((AnimojiRenderWrapperImpl) obj2, (CallOpenGLContext) obj);
            case 5:
                ((w43) obj2).C();
                return s3q0.a;
            case 6:
                np20 np20Var = (np20) obj2;
                Pair pair = (Pair) obj;
                WebApiApplication webApiApplication = (WebApiApplication) pair.d();
                String str = (String) pair.g();
                int i3 = 2;
                webApiApplication.y = 2;
                Integer num = np20Var.e.f;
                if (num != null) {
                    webApiApplication.v = num.intValue();
                }
                mq20 mq20Var = np20Var.c;
                String str2 = mq20Var.a;
                if (str2 != null) {
                    str = str2;
                }
                mq20Var.a = str;
                op20 op20Var = new op20(chx0.b(webApiApplication), np20Var.b, np20Var.c, np20Var.d, np20Var.e);
                return hf3.b(op20Var).K().l(new w7(new uf1(3, webApiApplication, op20Var), i3));
            case 7:
                ((e5) obj2).invoke(j5g.a0((VKList) obj));
                return s3q0.a;
            case 8:
                qy3 qy3Var = (qy3) obj2;
                qy3.a.C3581a c3581a = (qy3.a.C3581a) obj;
                float f = c3581a.a - qy3Var.f;
                float f2 = c3581a.b - qy3Var.g;
                if (Math.abs(f) <= 0.001d && Math.abs(f2) <= 0.001d) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 9:
                Context context = (Context) obj;
                ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
                thumbsImageView.setId(R.id.image_thumb);
                thumbsImageView.setHasBorderLine(true);
                thumbsImageView.setRadiusCorner(context.getResources().getDimension(((nf4) obj2).b ? R.dimen.music_image_corners_8 : R.dimen.music_image_corners_12));
                thumbsImageView.setBackgroundImageAttr(R.attr.vk_ui_image_placeholder);
                return thumbsImageView;
            case 10:
                MarketCommunityExternalLinkDetailsDto marketCommunityExternalLinkDetailsDto = (MarketCommunityExternalLinkDetailsDto) obj;
                ne6 ne6Var = ((yt5) obj2).b;
                List singletonList = Collections.singletonList(marketCommunityExternalLinkDetailsDto.e());
                ne6Var.getClass();
                Image a = ne6.a(singletonList);
                String title = marketCommunityExternalLinkDetailsDto.getTitle();
                String f3 = marketCommunityExternalLinkDetailsDto.f();
                BaseLinkButtonDto d = marketCommunityExternalLinkDetailsDto.d();
                if (d != null) {
                    String title2 = d.getTitle();
                    if (title2 == null) {
                        title2 = "";
                    }
                    BaseLinkButtonActionDto e = d.e();
                    String url = e != null ? e.getUrl() : null;
                    aVar = new ot5.a(title2, url != null ? url : "");
                }
                return new ot5(a, title, f3, aVar);
            case 11:
                ea6.c cVar2 = (ea6.c) obj2;
                e1b e1bVar = cVar2.c;
                ea6.e eVar = (ea6.e) obj;
                if (eVar instanceof ea6.e.b) {
                    e1bVar.i(((ea6.e.b) eVar).a);
                } else if (eVar instanceof ea6.e.c) {
                    ea6.e.c cVar3 = (ea6.e.c) eVar;
                    e1bVar.f(cVar3.b, cVar3.a);
                } else if (eVar instanceof ea6.e.d) {
                    ea6.e.d dVar = (ea6.e.d) eVar;
                    e1bVar.c(dVar.b, dVar.a);
                } else {
                    if (!(eVar instanceof ea6.e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e1bVar.h(cVar2.b);
                }
                return s3q0.a;
            case 12:
                BiometricsLockSettingsFragment biometricsLockSettingsFragment = (BiometricsLockSettingsFragment) obj2;
                ug5 ug5Var = (ug5) obj;
                dw20 dw20Var = biometricsLockSettingsFragment.X;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                biometricsLockSettingsFragment.getFeature().C(new a.g(ug5Var));
                return s3q0.a;
            case 13:
                u76 u76Var = ((u48) obj2).m;
                if (u76Var != null) {
                    u76Var.U2();
                }
                return Boolean.TRUE;
            case 14:
                xg8 xg8Var = (xg8) obj2;
                yg8.b bVar2 = yg8.b.a;
                if (xg8Var.k) {
                    xg8Var.i.onNext(bVar2);
                }
                return s3q0.a;
            case 15:
                ((lj8) obj2).j.setItems((List) obj);
                return s3q0.a;
            case 16:
                ((h69) obj2).d.onNext(new g69.d((List) obj));
                return s3q0.a;
            case 17:
                ((k9k) obj2).b((s730) obj);
                return s3q0.a;
            case 18:
                yxa yxaVar = (yxa) obj2;
                yxaVar.T(eya.a.b);
                f4z f4zVar = yxaVar.h;
                f4zVar.b(new bya.b(yxaVar.f));
                f4zVar.b(bya.a.a);
                return s3q0.a;
            case 19:
                ((e4b) obj2).c = null;
                return s3q0.a;
            case 20:
                ecb ecbVar = ((rcb) obj2).o;
                AvatarAction avatarAction = (AvatarAction) obj;
                if (rcb.c.$EnumSwitchMapping$0[avatarAction.ordinal()] == 1) {
                    ecbVar.b0();
                } else {
                    ecbVar.O(avatarAction);
                }
                return s3q0.a;
            case 21:
                ((zx) obj2).invoke((nbc) obj);
                return s3q0.a;
            case 22:
                onh0 onh0Var = new onh0();
                SearchStatInfoProvider searchStatInfoProvider = ((ClassifiedsCatalogBaseRootVh) obj2).m.b.m;
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM;
                String e2 = onh0Var.e(((hwh0) obj).a);
                return searchStatInfoProvider.b(type, e2 != null ? e2 : "", false);
            case 23:
                u2d u2dVar = ((com.vk.clips.sdk.shared.item.clip.b) obj2).e;
                u2dVar.getClass();
                return new y6d.a(((tj50.a) obj).a(new fb(u2dVar, 24), ao8.d));
            case 24:
                mid midVar = (mid) obj2;
                Optional optional = (Optional) obj;
                ArrayList arrayList = new ArrayList();
                if (optional.isPresent()) {
                    dhd dhdVar = (dhd) ((Pair) optional.get()).i();
                    dhd.c cVar4 = new dhd.c(new chd.d(o25.a().o()));
                    List<Group> list = (List) ((Pair) optional.get()).j();
                    if (dhdVar instanceof dhd.c) {
                        UserId userId2 = cVar4.b;
                        Long valueOf = userId2 != null ? Long.valueOf(userId2.b) : null;
                        UserId userId3 = ((dhd.c) dhdVar).a.c;
                        if (epx.f(valueOf, userId3 != null ? Long.valueOf(userId3.b) : null)) {
                            z = true;
                            ghd ghdVar = new ghd(cVar4, z);
                            midVar.c.getClass();
                            p4g.a(ghdVar, arrayList, true);
                            for (Group group : list) {
                                UserId userId4 = group.c;
                                arrayList.add(new ghd(new dhd.a(new chd.b(userId4, group.d), group), (dhdVar instanceof dhd.a) && (userId = ((dhd.a) dhdVar).b.c) != null && userId4.b == userId.b));
                            }
                        }
                    }
                    z = false;
                    ghd ghdVar2 = new ghd(cVar4, z);
                    midVar.c.getClass();
                    p4g.a(ghdVar2, arrayList, true);
                    while (r13.hasNext()) {
                    }
                }
                return arrayList;
            case 25:
                bnd bndVar = (bnd) obj2;
                Result result = (Result) obj;
                if (!(result.d() instanceof Result.Failure)) {
                    Object d2 = result.d();
                    if (d2 instanceof Result.Failure) {
                        d2 = null;
                    }
                    smd smdVar = (smd) d2;
                    List list2 = smdVar != null ? smdVar.a : null;
                    if (list2 == null) {
                        list2 = EmptyList.b;
                    }
                    bndVar.T(new ClipsCoauthorsSelectorPatch.i(list2));
                } else if (result.d() instanceof Result.Failure) {
                    Throwable a2 = Result.a(result.d());
                    ClipsCoauthorsException clipsCoauthorsException = a2 instanceof ClipsCoauthorsException ? (ClipsCoauthorsException) a2 : null;
                    if (clipsCoauthorsException != null) {
                        if (clipsCoauthorsException instanceof ClipsCoauthorsException.CoauthorsEmptyResponseException) {
                            bndVar.T(new ClipsCoauthorsSelectorPatch.i(EmptyList.b));
                        } else {
                            if (!(clipsCoauthorsException instanceof ClipsCoauthorsException.CoauthorsNetworkException)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j03.l(clipsCoauthorsException);
                            bndVar.T(new ClipsCoauthorsSelectorPatch.b(clipsCoauthorsException));
                        }
                    }
                }
                return s3q0.a;
            case 26:
                rwd rwdVar = (rwd) obj2;
                rwdVar.a0();
                rwdVar.d.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                return s3q0.a;
            case 27:
                k0e k0eVar = (k0e) obj2;
                int intValue = ((Integer) obj).intValue();
                i0e i0eVar = k0eVar.f;
                i0eVar.g(intValue);
                ((gvc) k0eVar.l.getValue()).b(i0eVar.f());
                return s3q0.a;
            case 28:
                ((afe) obj2).p((ClipsGridHeaderEntry.Author) obj);
                return s3q0.a;
            default:
                ((hjc) obj2).onClick();
                return s3q0.a;
        }
    }
}
