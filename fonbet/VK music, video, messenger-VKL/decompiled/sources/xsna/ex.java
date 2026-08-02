package xsna;

import android.content.Context;
import android.view.View;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.camera.clips.core.drafts.DraftUserRelatedData;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockProfileClipDrafts;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.actions.UiBlockActionUploadVideoButton;
import com.vk.catalog2.common.ui.mvp.holder.video.ClipDraftsBlockVh;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.OriginalSoundStatus;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.design.compose.movie.poster.PosterCardState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.e0j;
import xsna.q630;
import xsna.ry;
import xsna.u710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ex implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ex(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.collections.EmptyList] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Iterable arrayList;
        ClipsEditorMusicInfo clipsEditorMusicInfo;
        ClipsEditorMusicTrack clipsEditorMusicTrack;
        egg0 egg0Var;
        ClipDraftsBlockVh clipDraftsBlockVh;
        Iterable iterable;
        Context context;
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                kx kxVar = (kx) obj5;
                oy oyVar = (oy) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1359473, intValue, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.ThemedContent.<anonymous> (ActionButtonsContentView.kt:65)");
                    }
                    ry ryVar = (ry) kxVar.d(ry.a.a, (n0u0[]) Arrays.copyOf(new n0u0[]{oyVar.a, oyVar.b}, 2), aVar, 518).getValue();
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i2 = 0;
                    phv0.b(d, kai.c(1038269918, new gx(i2, kxVar, izsVar), aVar), kai.c(-1431061601, new hx(kxVar, ryVar, izsVar, i2), aVar), null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(1250589161, new qw(ryVar, kxVar, izsVar, i2), aVar), aVar, 805306806, 376);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                UIBlockProfileClipDrafts uIBlockProfileClipDrafts = (UIBlockProfileClipDrafts) obj5;
                ClipDraftsBlockVh clipDraftsBlockVh2 = (ClipDraftsBlockVh) obj4;
                egg0 egg0Var2 = (egg0) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList2 = uIBlockList.y;
                ArrayList arrayList3 = new ArrayList();
                for (UIBlock uIBlock : arrayList2) {
                    CatalogDataType catalogDataType = uIBlock.e;
                    CatalogDataType catalogDataType2 = uIBlockProfileClipDrafts.e;
                    List<String> list = uIBlockProfileClipDrafts.h;
                    if (catalogDataType != catalogDataType2) {
                        iterable = Collections.singletonList(uIBlock);
                        egg0Var = egg0Var2;
                        clipDraftsBlockVh = clipDraftsBlockVh2;
                    } else {
                        if (egg0Var2.isEmpty()) {
                            View view = clipDraftsBlockVh2.c;
                            if (view == null || (context = view.getContext()) == null) {
                                arrayList = EmptyList.b;
                            } else {
                                String string = context.getString(R.string.clips_drafts_placeholder_title);
                                String string2 = context.getString(R.string.clips_drafts_placeholder_text);
                                String string3 = context.getString(R.string.clips_drafts_placeholder_button_title);
                                String str = uIBlockProfileClipDrafts.b;
                                CatalogViewType catalogViewType = CatalogViewType.PLACEHOLDER;
                                CatalogDataType catalogDataType3 = CatalogDataType.DATA_TYPE_PLACEHOLDER;
                                arrayList = Collections.singletonList(new UIBlockPlaceholder(str, catalogViewType, catalogDataType3, uIBlockProfileClipDrafts.f, uIBlockProfileClipDrafts.g, j5g.v0("short_video_drafts_list_reload", list), uIBlockProfileClipDrafts.Db(), uIBlockProfileClipDrafts.j, String.valueOf(uIBlockProfileClipDrafts.k), string, null, null, string2, null, null, Collections.singletonList(new UiBlockActionUploadVideoButton(new com.vk.catalog2.common.dto.api.ui.a(uIBlockProfileClipDrafts.b, uIBlockProfileClipDrafts.c, CatalogViewType.SYNTHETIC_ACTION_UPLOAD_CLIP, catalogDataType3, uIBlockProfileClipDrafts.f, uIBlockProfileClipDrafts.g, uIBlockProfileClipDrafts.h, uIBlockProfileClipDrafts.Db(), uIBlockProfileClipDrafts.j, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), null, string3, 0, null)), null, null, null, null, null, null, null, CatalogLaunchOrigin.UNKNOWN, null, null, 33554432, null));
                            }
                        } else {
                            arrayList = new ArrayList(c5g.u(egg0Var2, 10));
                            Iterator it = egg0Var2.iterator();
                            while (it.hasNext()) {
                                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) it.next();
                                String str2 = uIBlockProfileClipDrafts.b;
                                CatalogViewType catalogViewType2 = CatalogViewType.SHORT_VIDEO_LIST;
                                CatalogDataType catalogDataType4 = CatalogDataType.DATA_TYPE_VIDEO_VIDEOS;
                                String str3 = uIBlockProfileClipDrafts.f;
                                UserId userId = uIBlockProfileClipDrafts.g;
                                Iterator it2 = it;
                                ArrayList v0 = j5g.v0("short_video_drafts_list_reload", list);
                                Set<UIBlockDragDropAction> Db = uIBlockProfileClipDrafts.Db();
                                UIBlockHint uIBlockHint = uIBlockProfileClipDrafts.j;
                                UserId userId2 = uIBlockProfileClipDrafts.g;
                                egg0 egg0Var3 = egg0Var2;
                                ClipsDraftVkExtraData clipsDraftVkExtraData = clipsDraftVk.c;
                                ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
                                ClipDraftsBlockVh clipDraftsBlockVh3 = clipDraftsBlockVh2;
                                ClipsDraftMusicInfo clipsDraftMusicInfo = clipsDraftVkExtraData.c;
                                MusicTrack c = (clipsDraftMusicInfo == null || (clipsEditorMusicInfo = clipsDraftMusicInfo.b) == null || (clipsEditorMusicTrack = clipsEditorMusicInfo.b) == null) ? null : hxd.c(clipsEditorMusicTrack);
                                List list2 = EmptyList.b;
                                OriginalSoundStatus originalSoundStatus = OriginalSoundStatus.NONE;
                                ClipLinkModerationStatus clipLinkModerationStatus = ClipLinkModerationStatus.UNDEFINED;
                                TemplateDraftData templateDraftData = clipsDraftVkExtraData.i;
                                ClipAudioTemplate clipAudioTemplate = templateDraftData != null ? templateDraftData.b : null;
                                DraftUserRelatedData draftUserRelatedData = clipsDraftVkExtraData.j;
                                List m = e43.m(draftUserRelatedData != null ? draftUserRelatedData.d : null);
                                DraftUserRelatedData draftUserRelatedData2 = clipsDraftVkExtraData.j;
                                List list3 = draftUserRelatedData2 != null ? draftUserRelatedData2.c : null;
                                ClipVideoFile clipVideoFile = new ClipVideoFile(null, c, list2, list2, null, null, originalSoundStatus, false, clipLinkModerationStatus, clipAudioTemplate, m, list3 == null ? list2 : list3, jgp.b, null, null, list2, null, null, null);
                                clipVideoFile.p = "short_video";
                                clipVideoFile.b = userId2;
                                clipVideoFile.P0 = clipsDraftCommonData.b;
                                clipVideoFile.B = true;
                                clipVideoFile.v = 0;
                                clipVideoFile.C = true;
                                clipVideoFile.u = 0;
                                clipVideoFile.H = true;
                                clipVideoFile.w = 0;
                                clipVideoFile.T = true;
                                clipVideoFile.t0 = false;
                                clipVideoFile.D = true;
                                clipVideoFile.X1 = false;
                                clipVideoFile.q1 = true;
                                clipVideoFile.I0 = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(clipsDraftCommonData.j, -1, (char) 0, false, 12, (zcl) null)));
                                arrayList.add(new UIBlockVideo(str2, catalogViewType2, catalogDataType4, str3, userId, v0, Db, uIBlockHint, new UIBlockVideo.a(null, clipVideoFile, false, null, false, null, null, null, 32764), null, 512, null));
                                it = it2;
                                egg0Var2 = egg0Var3;
                                clipDraftsBlockVh2 = clipDraftsBlockVh3;
                            }
                        }
                        egg0Var = egg0Var2;
                        clipDraftsBlockVh = clipDraftsBlockVh2;
                        iterable = arrayList;
                    }
                    g5g.y(iterable, arrayList3);
                    egg0Var2 = egg0Var;
                    clipDraftsBlockVh2 = clipDraftsBlockVh;
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                pqh.c(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj5, (izs) obj3, (q630) obj4);
                break;
            case 3:
                ((Integer) obj2).getClass();
                rzi.a((e0j.a) obj5, (izs) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((ffn) obj5).h((com.vk.music.playlist.display.domain.i) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 5:
                ((Integer) obj2).getClass();
                j710.c((u710) obj5, (u710.a.C3787a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                pd10.a((kd10) obj5, (gzs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.movie.poster.a.b((PosterCardState.Size) obj5, (PosterCardState.b) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ex(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ex(e0j.a aVar, izs izsVar, q630 q630Var, int i) {
        this.b = 3;
        this.c = aVar;
        this.e = izsVar;
        this.d = q630Var;
    }
}
