package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.model.ClipsEditorInputAudioItem;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.upload.ClipsEditorEntry;
import com.vk.dto.common.clips.AudioConfig;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.music.StoryMusicInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsEditorVkMapper.kt */
/* loaded from: classes16.dex */
public final class w0e {

    /* compiled from: ClipsEditorVkMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsEditorEntry.values().length];
            try {
                iArr[ClipsEditorEntry.CAMERA_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEditorEntry.CAMERA_FRONT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsEditorEntry.GALLERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ArrayList a(List list) {
        List<List> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (List<ClipsDraftMusicInfo> list3 : list2) {
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (ClipsDraftMusicInfo clipsDraftMusicInfo : list3) {
                arrayList2.add(new ClipsEditorInputAudioItem(clipsDraftMusicInfo.b, clipsDraftMusicInfo.c, clipsDraftMusicInfo.d, clipsDraftMusicInfo.e));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public static final ClipsEditorInputData b(ClipsDraftVk clipsDraftVk, boolean z) {
        ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
        List<ClipsEditorInputVideoItem> list = clipsDraftCommonData.d;
        ClipsDraftVkExtraData clipsDraftVkExtraData = clipsDraftVk.c;
        ClipsDraftMusicInfo clipsDraftMusicInfo = clipsDraftVkExtraData.c;
        ClipsEditorInputAudioItem clipsEditorInputAudioItem = clipsDraftMusicInfo != null ? new ClipsEditorInputAudioItem(clipsDraftMusicInfo.b, clipsDraftMusicInfo.c, clipsDraftMusicInfo.d, clipsDraftMusicInfo.e) : null;
        List list2 = clipsDraftCommonData.l;
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        return new ClipsEditorInputData(list, clipsEditorInputAudioItem, a(list2), z, true, clipsDraftVkExtraData.h, clipsDraftCommonData.c, clipsDraftCommonData.e, false, clipsDraftCommonData.m, 256, null);
    }

    public static ClipsEditorInputVideoItem c(ClipVideoItem clipVideoItem) {
        File file = new File(clipVideoItem.b);
        String str = clipVideoItem.d;
        File file2 = str != null ? new File(str) : null;
        long j = clipVideoItem.i;
        long j2 = clipVideoItem.j;
        StoryMusicInfo storyMusicInfo = clipVideoItem.e;
        ClipsEditorMusicInfo a2 = storyMusicInfo != null ? hxd.a(storyMusicInfo) : null;
        MaskLight maskLight = clipVideoItem.f;
        TranscodingState transcodingState = clipVideoItem.l;
        FilterInfo filterInfo = clipVideoItem.k;
        boolean z = clipVideoItem.m;
        VideoTransform videoTransform = clipVideoItem.n;
        boolean z2 = clipVideoItem.o;
        AudioEffectType audioEffectType = clipVideoItem.p;
        AudioConfig audioConfig = clipVideoItem.q;
        return new ClipsEditorInputVideoItem(file, j, j2, maskLight, a2, file2, transcodingState, filterInfo, z, clipVideoItem.h, videoTransform, z2, audioEffectType, audioConfig != null ? new AudioConfigEditor(audioConfig.b, audioConfig.c) : null, null, clipVideoItem.r, new ClipsEditorVideoVolumeItem(clipVideoItem.s, false, 2, null));
    }
}
