package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftOld;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.camera.clips.core.drafts.DraftUserRelatedData;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftOrdDataInfo;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.clips.AudioConfig;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.common.clips.ClipsDraftMusicOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.entities.OrdData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: ClipDraftJsonMigration6to7.kt */
/* loaded from: classes14.dex */
public final class prc extends be {
    @Override // xsna.be
    public final JSONObject S(JSONObject jSONObject) {
        ArrayList arrayList;
        UserId userId;
        UserId userId2;
        DraftUserRelatedData draftUserRelatedData;
        DraftUserRelatedData draftUserRelatedData2;
        boolean z;
        AudioConfigEditor audioConfigEditor;
        ClipsDraftOld.B.getClass();
        ClipsDraftOld clipsDraftOld = new ClipsDraftOld(jSONObject);
        List<ClipVideoItem> list = clipsDraftOld.d;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClipVideoItem clipVideoItem = (ClipVideoItem) it.next();
            File file = new File(clipVideoItem.b);
            String str = clipVideoItem.d;
            File file2 = str != null ? new File(str) : null;
            long j = clipVideoItem.i;
            long j2 = clipVideoItem.j;
            StoryMusicInfo storyMusicInfo = clipVideoItem.e;
            ClipsEditorMusicInfo a = storyMusicInfo != null ? hxd.a(storyMusicInfo) : null;
            MaskLight maskLight = clipVideoItem.f;
            TranscodingState transcodingState = clipVideoItem.l;
            FilterInfo filterInfo = clipVideoItem.k;
            boolean z2 = clipVideoItem.m;
            VideoTransform videoTransform = clipVideoItem.n;
            Iterator it2 = it;
            boolean z3 = clipVideoItem.o;
            AudioEffectType audioEffectType = clipVideoItem.p;
            AudioConfig audioConfig = clipVideoItem.q;
            if (audioConfig != null) {
                z = z2;
                audioConfigEditor = new AudioConfigEditor(audioConfig.b, audioConfig.c);
            } else {
                z = z2;
                audioConfigEditor = null;
            }
            arrayList2.add(new ClipsEditorInputVideoItem(file, j, j2, maskLight, a, file2, transcodingState, filterInfo, z, clipVideoItem.h, videoTransform, z3, audioEffectType, audioConfigEditor, null, clipVideoItem.r, null, 65536, null));
            it = it2;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        List<? extends List<ClipsDraftMusicOld>> list2 = clipsDraftOld.t;
        if (list2 != null) {
            List<? extends List<ClipsDraftMusicOld>> list3 = list2;
            ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                List<ClipsDraftMusicOld> list4 = (List) it3.next();
                ArrayList arrayList5 = new ArrayList(c5g.u(list4, 10));
                for (ClipsDraftMusicOld clipsDraftMusicOld : list4) {
                    arrayList5.add(new ClipsDraftMusicInfo(hxd.a(clipsDraftMusicOld.b), clipsDraftMusicOld.c, clipsDraftMusicOld.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, null));
                }
                arrayList4.add(arrayList5);
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        OrdData ordData = clipsDraftOld.u;
        ClipsDraftCommonData clipsDraftCommonData = new ClipsDraftCommonData(clipsDraftOld.b, clipsDraftOld.c, arrayList3, clipsDraftOld.e, clipsDraftOld.f, clipsDraftOld.g, clipsDraftOld.h, clipsDraftOld.i, clipsDraftOld.j, clipsDraftOld.q, arrayList, clipsDraftOld.w, ordData != null ? new ClipsDraftOrdDataInfo(ordData.b, ordData.c, ordData.d) : null, clipsDraftOld.o);
        ClipsDraftablePlaylist clipsDraftablePlaylist = clipsDraftOld.x;
        UserId userId3 = clipsDraftablePlaylist != null ? clipsDraftablePlaylist.e : null;
        ClipsVideoAttachmentData clipsVideoAttachmentData = clipsDraftOld.z;
        if (epx.f(userId3, clipsVideoAttachmentData != null ? clipsVideoAttachmentData.d : null)) {
            if (clipsDraftablePlaylist != null) {
                userId = clipsDraftablePlaylist.e;
                userId2 = userId;
            }
            userId2 = null;
        } else {
            if (clipsDraftablePlaylist == null || (userId = clipsDraftablePlaylist.e) == null) {
                if (clipsVideoAttachmentData != null) {
                    userId = clipsVideoAttachmentData.d;
                }
                userId2 = null;
            }
            userId2 = userId;
        }
        ClipsDraftMusicOld clipsDraftMusicOld2 = clipsDraftOld.n;
        ClipsDraftMusicInfo clipsDraftMusicInfo = clipsDraftMusicOld2 != null ? new ClipsDraftMusicInfo(hxd.a(clipsDraftMusicOld2.b), clipsDraftMusicOld2.c, clipsDraftMusicOld2.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, null) : null;
        DraftUserRelatedData draftUserRelatedData3 = clipsDraftOld.A;
        if (draftUserRelatedData3 != null) {
            draftUserRelatedData2 = new DraftUserRelatedData(draftUserRelatedData3.b, draftUserRelatedData3.c, clipsDraftOld.x, clipsVideoAttachmentData != null ? clipsVideoAttachmentData.e : null, draftUserRelatedData3.f);
        } else {
            if (userId2 == null) {
                draftUserRelatedData = null;
                return new ClipsDraftVk(clipsDraftCommonData, new ClipsDraftVkExtraData(clipsDraftOld.k, clipsDraftMusicInfo, clipsDraftOld.p, clipsDraftOld.r, clipsDraftOld.s, null, clipsDraftOld.v, clipsDraftOld.y, draftUserRelatedData, null, 544, null)).e5();
            }
            draftUserRelatedData2 = new DraftUserRelatedData(userId2, null, clipsDraftOld.x, clipsVideoAttachmentData != null ? clipsVideoAttachmentData.e : null, null, 18, null);
        }
        draftUserRelatedData = draftUserRelatedData2;
        return new ClipsDraftVk(clipsDraftCommonData, new ClipsDraftVkExtraData(clipsDraftOld.k, clipsDraftMusicInfo, clipsDraftOld.p, clipsDraftOld.r, clipsDraftOld.s, null, clipsDraftOld.v, clipsDraftOld.y, draftUserRelatedData, null, 544, null)).e5();
    }
}
