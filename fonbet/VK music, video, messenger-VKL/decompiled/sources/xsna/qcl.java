package xsna;

import android.graphics.Bitmap;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.ironsource.B5;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingFragment;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.tabs.d;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.dto.stories.model.clickable.ClickablePhotoAlbum;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.folders.impl.model.FoldersListLoaderStateEvents;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchPeopleCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.bex0;
import xsna.bfz;
import xsna.c910;
import xsna.gm50;
import xsna.h7u0;
import xsna.hl10;
import xsna.hls;
import xsna.isr;
import xsna.jns;
import xsna.tj50;
import xsna.uxo;
import xsna.ws00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qcl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qcl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageSize Cb;
        VkBridgeAnalytics E;
        Integer num;
        qvw qvwVar;
        int i = this.b;
        int i2 = 12;
        int i3 = 18;
        boolean z = true;
        Object obj2 = null;
        int i4 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                scl sclVar = (scl) obj3;
                vqt vqtVar = (vqt) obj;
                String str = vqtVar.e;
                com.vk.lists.c cVar = sclVar.i;
                cVar.s(str);
                sclVar.l.f(vqtVar.d);
                String j = cVar.j();
                if (j == null || j.length() == 0) {
                    cVar.r(false);
                }
                return s3q0.a;
            case 1:
                MenuItem menuItem = (MenuItem) obj;
                return Boolean.valueOf(!menuItem.equals((MenuItem) obj3) && menuItem.isVisible());
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                iio iioVar = ((wio) obj3).e.c;
                (iioVar != null ? iioVar : null).a(new zho(bitmap));
                return s3q0.a;
            case 3:
                return new uxo.a(((tj50.a) obj).a(new vl1((oxo) obj3, 29), sd9.d));
            case 4:
                EncryptedFileInfo encryptedFileInfo = (EncryptedFileInfo) obj3;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(encryptedFileInfo.b, "path");
                byte[] bArr = encryptedFileInfo.c;
                if (bArr != null) {
                    char[] cArr = EncryptedFileInfo.a.a;
                    StringBuilder sb = new StringBuilder(bArr.length * 2);
                    int length = bArr.length;
                    while (i4 < length) {
                        byte b = bArr[i4];
                        char[] cArr2 = EncryptedFileInfo.a.a;
                        sb.append(cArr2[(b >> 4) & 15]);
                        sb.append(cArr2[b & AmfConstants.TYPE_XML_DOCUMENT_MARKER ? 1 : 0]);
                        i4++;
                    }
                    obj2 = sb.toString();
                }
                w9yVar.e(obj2, "encryption_iv");
                w9yVar.e(encryptedFileInfo.d, "encryption_key_alias");
                return s3q0.a;
            case 5:
                n3q n3qVar = (n3q) obj3;
                Long l = (Long) obj;
                if (l != null) {
                    n3qVar.h(l.longValue());
                }
                return s3q0.a;
            case 6:
                return ((hjq) obj3).d(Integer.MAX_VALUE);
            case 7:
                FilterType filterType = (FilterType) obj3;
                int i5 = FiltersRecyclerView.j;
                return Boolean.valueOf(((tcr) obj).a == filterType);
            case 8:
                isr.a aVar = (isr.a) obj3;
                VideoFile videoFile = (VideoFile) obj;
                AboutVideoItem.e eVar = aVar.n;
                if (eVar == null) {
                    return s3q0.a;
                }
                aVar.l.invoke(videoFile, eVar.d);
                return s3q0.a;
            case 9:
                ((com.vk.folders.impl.configure.d) obj3).q(new af2(i3));
                return s3q0.a;
            case 10:
                L.i((Throwable) obj);
                ((com.vk.folders.impl.model.a) obj3).e.onNext(FoldersListLoaderStateEvents.LoaderStateEvent.LoadingFinished);
                return s3q0.a;
            case 11:
                ((gls) obj3).T(new hls.d.a((Throwable) obj));
                return s3q0.a;
            case 12:
                xms xmsVar = (xms) obj3;
                hns hnsVar = (hns) obj;
                String str2 = hnsVar.a;
                xmsVar.T(new jns.b.C3132b(new rms(str2 == null ? "" : str2, hnsVar.b, hnsVar.c, hnsVar.d, EmptyList.b, false, ((b25) xmsVar.i.c).d())));
                return s3q0.a;
            case 13:
                ((p5t) obj3).D.sa((NewsfeedExternalAction) obj);
                return s3q0.a;
            case 14:
                bmt bmtVar = (bmt) obj3;
                return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.v(new zkt((utb) bmtVar.f.h.b, i4)), new uq(i2), null), new yh1(new ri0(17, bmtVar, (blt) obj), i3));
            case 15:
                Throwable th = (Throwable) obj;
                if (((xnt) obj3).c) {
                    h03.b(th);
                }
                return s3q0.a;
            case 16:
                GlobalSearchPeopleCatalogRootVh globalSearchPeopleCatalogRootVh = (GlobalSearchPeopleCatalogRootVh) obj3;
                l3a l3aVar = (l3a) obj;
                if (l3aVar instanceof SearchSpellcheckVh.a.C0525a) {
                    uxh0 uxh0Var = globalSearchPeopleCatalogRootVh.r;
                    if (uxh0Var != null) {
                        uxh0Var.X1(((SearchSpellcheckVh.a.C0525a) l3aVar).a, true);
                    }
                } else if (l3aVar instanceof SearchSpellcheckVh.a.b) {
                    String str3 = ((SearchSpellcheckVh.a.b) l3aVar).a;
                    uxh0 uxh0Var2 = globalSearchPeopleCatalogRootVh.r;
                    if (uxh0Var2 != null) {
                        uxh0Var2.X1(str3, true);
                    }
                    xda.D(globalSearchPeopleCatalogRootVh, str3, globalSearchPeopleCatalogRootVh.F.g, null, 16);
                }
                return s3q0.a;
            case 17:
                ((rg50) obj3).C(((Integer) obj).intValue());
                return s3q0.a;
            case 18:
                GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) obj3;
                int i6 = GraffitiDrawingFragment.Q;
                int i7 = h7u0.p;
                h7u0.a c = h7u0.b.c(graffitiDrawingFragment.requireContext());
                c.g0(R.string.confirm);
                c.U(R.string.picker_editor_exit_confirm);
                c.c0(R.string.picker_yes, new tlg(graffitiDrawingFragment, r5 ? 1 : 0));
                c.W(R.string.picker_no, new bcu());
                c.m();
                return s3q0.a;
            case 19:
                Group group = (Group) obj3;
                View view = (View) obj;
                AvatarBorderType avatarBorderType = group.n0 ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
                ImAvatarView imAvatarView = (ImAvatarView) view.findViewById(R.id.voip_caller_image);
                Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                Image image = group.g;
                imAvatarView.p1(ImageList.a.c(-1, -1, (image == null || (Cb = image.Cb(aiu.r, true, false)) == null) ? null : Cb.d.d), null, avatarBorderType);
                ((TextView) view.findViewById(R.id.voip_title)).setText(group.d);
                at.d(view, R.string.voip_change_name_group_desription, (TextView) view.findViewById(R.id.voip_description));
                return s3q0.a;
            case 20:
                GroupedNotificationsFragment groupedNotificationsFragment = (GroupedNotificationsFragment) obj3;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    hou houVar = groupedNotificationsFragment.Z;
                    if (houVar != null) {
                        houVar.notifyItemChanged(intValue);
                    }
                }
                return s3q0.a;
            case 21:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                t5y t5yVar = (t5y) obj;
                t5y.e.getClass();
                LinkedHashMap linkedHashMap2 = t5yVar.d;
                x6y x6yVar = t5yVar.a;
                linkedHashMap2.put("return_by_deeplink", Boolean.TRUE);
                String str4 = t5yVar.c;
                String str5 = (String) linkedHashMap.get("vk_state");
                String str6 = str5 != null ? str5 : "";
                linkedHashMap2.put("vk_state_exists", Boolean.valueOf(str6.length() > 0));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!epx.f(entry.getKey(), "vk_state")) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap3.size());
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    arrayList.add(((String) entry2.getKey()) + B5.U + ((String) entry2.getValue()));
                }
                linkedHashMap2.put("query_without_vk_state", j5g.g0(arrayList, "&", null, null, 0, null, 62));
                if (!str4.equals(str6)) {
                    linkedHashMap2.put("vk_state_matches", Boolean.FALSE);
                    b7y.a(x6yVar, VkAppsErrors.Client.ACCESS_DENIED, linkedHashMap2);
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                linkedHashMap2.put("vk_state_matches", Boolean.TRUE);
                t5y.e.getClass();
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    sb2.append(((String) entry3.getKey()) + B5.U + ((String) entry3.getValue()) + '&');
                }
                JSONObject put = new JSONObject().put("query_params", (drm0.F(sb2, "&") ? sb2.subSequence(0, sb2.length() - "&".length()) : sb2.subSequence(0, sb2.length())).toString());
                fvv0 fvv0Var = t5yVar.b;
                if (fvv0Var != null && (E = fvv0Var.E()) != null) {
                    E.g(VkBridgeAnalytics.RegistrationEvent.EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN);
                }
                bex0.a.b(x6yVar, JsApiMethodType.OPEN_EXTERNAL_LINK, put, null, 12);
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 22:
                ClickablePhotoAlbum clickablePhotoAlbum = (ClickablePhotoAlbum) obj;
                pn0 pn0Var = ((p5z) obj3).a.X;
                if (pn0Var != null) {
                    uov uovVar = (uov) pn0Var.b;
                    uovVar.setActionInProgress(true);
                    uovVar.pause();
                    ((StoryViewerRouter) pn0Var.a).i(uovVar.getView().getContext(), clickablePhotoAlbum.e, clickablePhotoAlbum.f, new x9l0(pn0Var, 5), new mcj0(pn0Var, 9));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                dfz dfzVar = (dfz) obj3;
                bfz.a aVar2 = (bfz.a) obj;
                if (!(aVar2 instanceof bfz.a.f)) {
                    return aVar2;
                }
                InfoBar infoBar = ((bfz.a.f) aVar2).b;
                String str7 = infoBar.b;
                InfoBar.Payload payload = infoBar.m;
                InfoBar.Payload.MaxAd maxAd = payload instanceof InfoBar.Payload.MaxAd ? (InfoBar.Payload.MaxAd) payload : null;
                if (maxAd == null || (num = maxAd.e) == null) {
                    return aVar2;
                }
                int intValue2 = num.intValue();
                cew.b.getClass();
                qvw e = cew.e(str7);
                if (e == null) {
                    qvwVar = new qvw(1, intValue2);
                    cew.j(str7, qvwVar);
                } else {
                    int i8 = e.a + 1;
                    qvw e2 = cew.e(str7);
                    if (e2 != null) {
                        cew.j(str7, qvw.a(e2, i8));
                    }
                    qvwVar = new qvw(i8, e.b);
                }
                if (qvwVar.a <= qvwVar.b) {
                    return aVar2;
                }
                dfzVar.a.D(dfzVar, new vsm(str7, "views_limit"));
                if (str7.equals("max_ad")) {
                    iid0 iid0Var = new iid0();
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("max_ad", MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.HIDE_BY_VIEW_COUNT, null, 4, null), 3);
                    iid0Var.f = c2;
                    iid0Var.g = b2;
                    iid0Var.q();
                    qvw e3 = cew.e(str7);
                    if (e3 != null) {
                        cew.j(str7, qvw.a(e3, 0));
                    }
                }
                return bfz.a.b.a;
            case 24:
                com.vk.ecomm.reviews.impl.allreviews.presentation.b bVar = (com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj3;
                bVar.T(c.i.b);
                bVar.k.b(ws00.a.a);
                return s3q0.a;
            case 25:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj3;
                Image image2 = (Image) obj;
                VKImageView vKImageView = marketItemReviewsFragment.k0;
                bwt0.S(vKImageView != null ? vKImageView : null, new nm1(i3, image2, marketItemReviewsFragment));
                return s3q0.a;
            case 26:
                f910 f910Var = (f910) obj3;
                c910.c cVar3 = (c910.c) obj;
                f910Var.p.setVisibility(0);
                ((wak0) f910Var.t).C(0);
                VkSpinner vkSpinner = f910Var.l;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(8);
                }
                gm50.a.a(f910Var, cVar3.a, new bzw(f910Var, 6));
                return s3q0.a;
            case 27:
                return ((hl10.b) obj3).c(((Integer) obj).intValue());
            case 28:
                return MediaPickerMviState.a((MediaPickerMviState) obj, 0, null, false, null, MediaPickerMviState.Medias.Loaded.a((MediaPickerMviState.Medias.Loaded) obj3, null, null, MediaPickerMviState.Pagination.Error, 7), 31);
            default:
                int i9 = ModalPostReactionsFragment.f0;
                int i10 = com.vk.core.view.components.tabs.d.G;
                return d.a.a(((ModalPostReactionsFragment) obj3).requireContext());
        }
    }
}
