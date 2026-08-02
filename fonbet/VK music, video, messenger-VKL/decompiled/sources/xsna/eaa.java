package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.catalog.mvi.domain.CatalogExtraDo;
import com.vk.catalog.mvi.section.domain.CatalogBlockDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.clips.design.view.nps.internal.stars.CatalogStarsFeedbackView;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplatesInputVideoItem;
import com.vk.clips.editor.templates.impl.domain.ClipsVideoTemplateEditorInputModel;
import com.vk.clips.favorites.impl.ui.folders.content.d;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.external.ClipsDuetInfo;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.model.ClipsEditorInputAudioItem;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.inappreview.ReviewActionResult$Failed;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.photos.ui.editalbum.domain.PrivacySettingData;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.pushes.receivers.c;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b9a0;
import xsna.cuy;
import xsna.cwb0;
import xsna.e3m;
import xsna.n7a;
import xsna.p8a0;
import xsna.q8a0;
import xsna.svm;
import xsna.tlo0;
import xsna.tra0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class eaa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eaa(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 10;
        switch (this.b) {
            case 0:
                laa laaVar = (laa) this.c;
                String str = (String) this.d;
                List<MusicTrack> list = (List) obj;
                ld20 ld20Var = laaVar.s;
                nt70 nt70Var = new nt70((String) ld20Var.b);
                nt70Var.d = true;
                nt70Var.l = list;
                List singletonList = Collections.singletonList(new CatalogReplacement(Collections.singletonList(((laa) ((defpackage.h) ld20Var.c).c).h), lu70.d(nt70Var.a(str))));
                List<MusicTrack> list2 = list;
                HashMap hashMap = new HashMap(list2.size());
                for (MusicTrack musicTrack : list2) {
                    hashMap.put(musicTrack.Fb(), musicTrack);
                }
                CatalogReplacementResponse catalogReplacementResponse = new CatalogReplacementResponse(singletonList, new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, -1, 7, null), null);
                laaVar.h = str;
                break;
            case 1:
                ((orb) this.c).b.a(((MenuItem) this.d).getItemId());
                break;
            case 2:
                String str2 = (String) this.d;
                jpd jpdVar = (jpd) this.c;
                ((ClipsDraftPersistentStore) obj).getClass();
                ClipsDraftPersistentStore.v(str2);
                ClipsDraftVk k = ClipsDraftPersistentStore.k();
                if (k == null) {
                    break;
                } else {
                    ClipsDraftCommonData clipsDraftCommonData = k.b;
                    jpdVar.b.h.a.a = wrp.b(wrp.a(clipsDraftCommonData.k));
                    StoryCameraParams storyCameraParams = jpdVar.x;
                    boolean isFullHdCamera = jpdVar.c.getIsFullHdCamera();
                    List list3 = EmptyList.b;
                    ClipsEditorInputData clipsEditorInputData = new ClipsEditorInputData(list3, null, null, false, false, null, 0, storyCameraParams.t, isFullHdCamera, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, null);
                    List<ClipsEditorInputVideoItem> list4 = clipsDraftCommonData.d;
                    int i2 = clipsDraftCommonData.c;
                    ClipsDraftVkExtraData clipsDraftVkExtraData = k.c;
                    ClipsDuetInfo clipsDuetInfo = clipsDraftVkExtraData.h;
                    ClipsDraftMusicInfo clipsDraftMusicInfo = clipsDraftVkExtraData.c;
                    ClipsEditorInputAudioItem clipsEditorInputAudioItem = clipsDraftMusicInfo != null ? new ClipsEditorInputAudioItem(clipsDraftMusicInfo.b, clipsDraftMusicInfo.c, clipsDraftMusicInfo.d, clipsDraftMusicInfo.e) : null;
                    List list5 = clipsDraftCommonData.l;
                    if (list5 != null) {
                        list3 = list5;
                    }
                    jpdVar.d.g(ClipsEditorInputData.a(clipsEditorInputData, list4, clipsEditorInputAudioItem, w0e.a(list3), true, true, clipsDuetInfo, i2, clipsDraftCommonData.e, clipsDraftCommonData.m, 256));
                    break;
                }
            case 3:
                ClipsEditorInputData clipsEditorInputData2 = (ClipsEditorInputData) this.c;
                ClipsEditorInputAudioItem clipsEditorInputAudioItem2 = (ClipsEditorInputAudioItem) this.d;
                break;
            case 4:
                String str3 = (String) this.d;
                com.vk.clips.favorites.impl.ui.folders.content.b bVar = (com.vk.clips.favorites.impl.ui.folders.content.b) this.c;
                j3e j3eVar = (j3e) obj;
                if (str3 == null) {
                    bVar.T(new d.c.g(j3eVar));
                } else {
                    bVar.T(new d.c.C0592d(j3eVar));
                }
                break;
            case 5:
                ClipsInterestsFragment.b bVar2 = (ClipsInterestsFragment.b) this.c;
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) this.d;
                int i3 = ClipsInterestsFragment.Y;
                bwt0.p0(bVar2.c, false);
                bwt0.p0(bVar2.g, false);
                bwt0.p0(bVar2.h, false);
                bwt0.p0(bVar2.j, false);
                bwt0.p0(bVar2.i, true);
                xn50.a.a(clipsInterestsFragment, ((ClipsInterestsViewState.h) obj).a, new u6(i, clipsInterestsFragment, bVar2.f));
                break;
            case 6:
                kne kneVar = (kne) this.c;
                jne jneVar = (jne) this.d;
                ((Boolean) obj).booleanValue();
                kneVar.a.b(jneVar.b);
                break;
            case 7:
                ClipsVideoTemplateEditorInputModel clipsVideoTemplateEditorInputModel = (ClipsVideoTemplateEditorInputModel) this.c;
                final y7f y7fVar = (y7f) this.d;
                final z7f z7fVar = (z7f) obj;
                final List<ClipsTemplatesInputVideoItem> list6 = clipsVideoTemplateEditorInputModel.e;
                if (list6.isEmpty()) {
                    y7fVar.C(z7fVar);
                    break;
                } else {
                    final i8f i8fVar = y7fVar.h;
                    i8fVar.getClass();
                    io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.g8f
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Iterator<n7f> it = z7fVar.d.iterator();
                            ArrayList arrayList = new ArrayList();
                            for (ClipsTemplatesInputVideoItem clipsTemplatesInputVideoItem : list6) {
                                if (it.hasNext()) {
                                    n7f next = it.next();
                                    ClipsProcessedItem clipsProcessedItem = clipsTemplatesInputVideoItem.b;
                                    VideoTransform videoTransform = clipsTemplatesInputVideoItem.f;
                                    i8fVar.getClass();
                                    arrayList.add(ClipsTemplateEditorVideoItem.a(i8f.u7(clipsProcessedItem, next, videoTransform), clipsTemplatesInputVideoItem.c, clipsTemplatesInputVideoItem.d, null, 975));
                                }
                            }
                            return j5g.O0(arrayList);
                        }
                    });
                    List<ClipsTemplatesInputVideoItem> list7 = list6;
                    ArrayList arrayList = new ArrayList(c5g.u(list7, 10));
                    Iterator it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((ClipsTemplatesInputVideoItem) it.next()).e));
                    }
                    break;
                }
            case 8:
                ((m900) ((wak) this.c).c).put((String) this.d, (gcp) obj);
                break;
            case 9:
                com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) this.c;
                zhm zhmVar = (zhm) this.d;
                new wfm(new com.vk.im.engine.models.dialogs.a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, aVar.p, aVar.q, aVar.r, aVar.s, zhmVar.e, aVar.u, aVar.v, aVar.w, aVar.x, aVar.y, aVar.z, aVar.A, aVar.B, aVar.C, aVar.D, aVar.E, aVar.F, aVar.G, aVar.H, aVar.I, aVar.J, aVar.K, aVar.L), null).o(zhmVar.c);
                ((xgl0) obj).b().e().s(zhmVar.d.b, zhmVar.e);
                break;
            case 10:
                ((asm) this.c).e().c(new cwb0.p(((DialogExt) this.d).getTitle()), new l9h((io.reactivex.rxjava3.disposables.c) obj, 9));
                break;
            case 11:
                break;
            case 12:
                rvm rvmVar = (rvm) this.c;
                svm.c cVar = (svm.c) ((yn50) this.d);
                rvmVar.j.invoke(Long.valueOf(cVar.a), Boolean.valueOf(cVar.b));
                break;
            case 13:
                ((com.vk.photos.ui.editalbum.domain.c) this.c).T(new e.i(new PrivacySettingData(((a.k) this.d).b, (String) obj)));
                break;
            case 14:
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                fVar.onNext((List) obj);
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) ref$ObjectRef.element;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                break;
            case 15:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                gzs gzsVar = (gzs) this.d;
                List<MediaStoreEntry> list8 = (List) obj;
                com.vk.attachpicker.b bVar3 = galleryFragmentImpl.Q;
                LinkedHashMap linkedHashMap = galleryFragmentImpl.E0;
                if (linkedHashMap != null) {
                    int i4 = 0;
                    for (MediaStoreEntry mediaStoreEntry : list8) {
                        int i5 = i4 + 1;
                        String lastPathSegment = mediaStoreEntry.f().getLastPathSegment();
                        if (linkedHashMap.containsKey(lastPathSegment)) {
                            if (bVar3 != null && !bVar3.q(mediaStoreEntry)) {
                                Integer num = (Integer) linkedHashMap.get(lastPathSegment);
                                PhotoSmallAdapter photoSmallAdapter = galleryFragmentImpl.c0;
                                int f = bVar3.f(i4 - (photoSmallAdapter != null ? photoSmallAdapter.K0() : 0), num, mediaStoreEntry);
                                if (f < 0 && f != Integer.MIN_VALUE && bVar3.v() <= bVar3.k()) {
                                    cvk.w(galleryFragmentImpl.getResources().getString(bVar3.e() ? R.string.picker_attachments_limit_one : R.string.picker_attachments_limit, Integer.valueOf(bVar3.v())), false);
                                }
                                if (num != null) {
                                    bVar3.j(num.intValue() + 1);
                                }
                            }
                            ttp0.c(linkedHashMap).remove(lastPathSegment);
                        }
                        i4 = i5;
                    }
                }
                gzsVar.invoke();
                break;
            case 16:
                fyu fyuVar = (fyu) this.c;
                ClipFeedTab.WithPayload.Payload payload = (ClipFeedTab.WithPayload.Payload) this.d;
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : (List) obj) {
                    fyuVar.getClass();
                    ClipFeedTab a = eyu.a(str4, payload);
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                break;
            case 17:
                brw brwVar = (brw) this.c;
                InAppReviewConditionKey inAppReviewConditionKey = (InAppReviewConditionKey) this.d;
                if (((Boolean) obj).booleanValue()) {
                    gzs<? extends io.reactivex.rxjava3.core.x<hgg0>> gzsVar2 = brwVar.h;
                    if (gzsVar2 == null || (r3 = gzsVar2.invoke()) == null) {
                        io.reactivex.rxjava3.core.x<hgg0> i6 = io.reactivex.rxjava3.core.x.i(new ReviewActionResult$Failed(ReviewActionResult$Failed.ErrorReason.UNKNOWN));
                    }
                    int i7 = 14;
                    break;
                } else {
                    break;
                }
            case 18:
                CatalogStarsFeedbackView catalogStarsFeedbackView = (CatalogStarsFeedbackView) this.c;
                kjx kjxVar = (kjx) this.d;
                catalogStarsFeedbackView.g = null;
                ImageView imageView = catalogStarsFeedbackView.b;
                ImageView imageView2 = catalogStarsFeedbackView.c;
                ImageView imageView3 = catalogStarsFeedbackView.d;
                ImageView imageView4 = catalogStarsFeedbackView.e;
                ImageView imageView5 = catalogStarsFeedbackView.f;
                for (ImageView imageView6 : rl3.I(new ImageView[]{imageView, imageView2, imageView3, imageView4, imageView5})) {
                    Context context = catalogStarsFeedbackView.getContext();
                    e3m.a aVar2 = e3m.a;
                    Drawable a2 = m33.a(R.drawable.vk_icon_favorite_outline_28, context);
                    sjo.b(a2, e3m.f(R.attr.vk_ui_icon_secondary, context), PorterDuff.Mode.SRC_IN);
                    imageView6.setImageDrawable(a2);
                }
                y01 y01Var = catalogStarsFeedbackView.h;
                imageView.setOnClickListener(y01Var);
                imageView2.setOnClickListener(y01Var);
                imageView3.setOnClickListener(y01Var);
                imageView4.setOnClickListener(y01Var);
                imageView5.setOnClickListener(y01Var);
                kjxVar.f.invoke();
                kjxVar.e.invoke(n7a.c.b);
                break;
            case 19:
                wxm wxmVar = (wxm) this.c;
                CatalogBlockDo catalogBlockDo = (CatalogBlockDo) this.d;
                CatalogSectionState catalogSectionState = (CatalogSectionState) obj;
                ArrayList arrayList3 = (ArrayList) wxmVar.b;
                CatalogExtraDo catalogExtraDo = catalogSectionState.m;
                CatalogExtraDo catalogExtraDo2 = catalogBlockDo.c;
                break;
            case 20:
                tra0.a.x((tra0.a) obj, (tra0) this.c, 0, an10.b(((v6p0) this.d).getState().b()));
                break;
            case 21:
                ft30 ft30Var = (ft30) this.c;
                Msg msg = (Msg) this.d;
                int intValue = ((Integer) obj).intValue();
                pk30 pk30Var = ft30Var.g;
                if (pk30Var != null) {
                    pk30Var.N(msg, intValue);
                }
                break;
            case 22:
                break;
            case 23:
                pq50 pq50Var = (pq50) this.c;
                ((NewsfeedRouter) pq50Var.F.getValue()).U(pq50Var.itemView.getContext(), ((jr50) this.d).c(), (String[]) obj);
                break;
            case 24:
                c.a aVar3 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) this.c, (Intent) this.d, (Throwable) obj);
                break;
            case 25:
                wzs wzsVar = (wzs) this.c;
                ya90 ya90Var = (ya90) this.d;
                Integer valueOf = Integer.valueOf(((cuy.c) obj).getIndex());
                tb90 tb90Var = ya90Var.b;
                wzsVar.invoke(valueOf, Integer.valueOf((tb90Var != null ? tb90Var : null).b));
                break;
            case 26:
                com.vk.photos.root.photoflow.presentation.b bVar4 = (com.vk.photos.root.photoflow.presentation.b) this.c;
                bVar4.h.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_delete_photos_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new defpackage.u(27, bVar4, (List) this.d), null, 32)));
                kwg0.b().accept((Throwable) obj);
                break;
            case 27:
                ((izs) this.c).invoke((q8a0.a) ((p8a0.b) this.d).m);
                break;
            case 28:
                ikc0 ikc0Var = (ikc0) this.c;
                String str5 = (String) this.d;
                ikc0Var.F.addAll((List) obj);
                ikc0Var.W7(ikc0Var.w7(str5), myc0.f(str5), false);
                ikc0Var.G = false;
                break;
            default:
                Iterator<f360> it2 = ((r9e0) this.c).d.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ eaa(int i, String str, Object obj) {
        this.b = i;
        this.d = str;
        this.c = obj;
    }

    public /* synthetic */ eaa(zi50 zi50Var, List list, ArrayList arrayList) {
        this.b = 22;
        this.c = list;
        this.d = arrayList;
    }

    public /* synthetic */ eaa(r9e0 r9e0Var, okhttp3.d dVar, u3j u3jVar) {
        this.b = 29;
        this.c = r9e0Var;
        this.d = dVar;
    }
}
