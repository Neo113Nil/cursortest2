package xsna;

import com.vk.clips.sdk.drafts.models.ClipsDraftAudioEffectType;
import com.vk.clips.sdk.drafts.models.video.ClipsDraftTranscodingState;
import com.vk.clips.sdk.drafts.models.video.filter.ClipsDraftFilterType;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.filters.CorrectionsInfo;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.filters.HslInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import java.io.File;
import xsna.tsd;

/* compiled from: ClipsDraftVideoExt.kt */
/* loaded from: classes17.dex */
public final class bud {
    public static final tsd.a a(HslInfo.Params params) {
        return new tsd.a(params.b, params.c, params.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cud b(ClipsEditorInputVideoItem clipsEditorInputVideoItem) {
        dtd dtdVar;
        urd urdVar;
        urd urdVar2;
        rsd rsdVar;
        dud dudVar;
        btd btdVar;
        MaskLight maskLight = clipsEditorInputVideoItem.e;
        ctd ctdVar = maskLight != null ? new ctd(maskLight.b, maskLight.c, maskLight.d, maskLight.e) : null;
        FilterInfo filterInfo = clipsEditorInputVideoItem.i;
        ClipsDraftFilterType clipsDraftFilterType = (ClipsDraftFilterType) ClipsDraftFilterType.h().get(filterInfo.b.ordinal());
        float f = filterInfo.c;
        CorrectionsInfo correctionsInfo = filterInfo.d;
        ssd ssdVar = new ssd(correctionsInfo.b, correctionsInfo.c, correctionsInfo.d, correctionsInfo.e, correctionsInfo.f, correctionsInfo.g, correctionsInfo.h, correctionsInfo.i, correctionsInfo.j, correctionsInfo.k);
        HslInfo hslInfo = filterInfo.e;
        rsd rsdVar2 = new rsd(clipsDraftFilterType, f, ssdVar, new tsd(a(hslInfo.b), a(hslInfo.c), a(hslInfo.d), a(hslInfo.e), a(hslInfo.f), a(hslInfo.g), a(hslInfo.h), a(hslInfo.i)));
        VideoTransform videoTransform = clipsEditorInputVideoItem.l;
        dud dudVar2 = videoTransform != null ? new dud(videoTransform.b, videoTransform.c, videoTransform.d, videoTransform.e, videoTransform.f, videoTransform.g) : null;
        File file = clipsEditorInputVideoItem.b;
        File file2 = clipsEditorInputVideoItem.g;
        ClipsEditorMusicInfo clipsEditorMusicInfo = clipsEditorInputVideoItem.f;
        dtd B = clipsEditorMusicInfo != null ? p490.B(clipsEditorMusicInfo) : null;
        float f2 = clipsEditorInputVideoItem.k;
        long j = clipsEditorInputVideoItem.c;
        long j2 = clipsEditorInputVideoItem.d;
        ClipsDraftTranscodingState clipsDraftTranscodingState = (ClipsDraftTranscodingState) ClipsDraftTranscodingState.h().get(clipsEditorInputVideoItem.h.ordinal());
        boolean z = clipsEditorInputVideoItem.j;
        boolean z2 = clipsEditorInputVideoItem.m;
        ClipsDraftAudioEffectType clipsDraftAudioEffectType = (ClipsDraftAudioEffectType) ClipsDraftAudioEffectType.h().get(clipsEditorInputVideoItem.n.ordinal());
        AudioConfigEditor audioConfigEditor = clipsEditorInputVideoItem.o;
        if (audioConfigEditor != null) {
            dtdVar = B;
            urdVar = new urd(audioConfigEditor.b, audioConfigEditor.c);
        } else {
            dtdVar = B;
            urdVar = null;
        }
        ClipsVideoItemLocation clipsVideoItemLocation = clipsEditorInputVideoItem.q;
        if (clipsVideoItemLocation != null) {
            rsdVar = rsdVar2;
            dudVar = dudVar2;
            urdVar2 = urdVar;
            btdVar = new btd(clipsVideoItemLocation.b, clipsVideoItemLocation.c);
        } else {
            urdVar2 = urdVar;
            rsdVar = rsdVar2;
            dudVar = dudVar2;
            btdVar = null;
        }
        ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem = clipsEditorInputVideoItem.r;
        eud eudVar = new eud(clipsEditorVideoVolumeItem.b, clipsEditorVideoVolumeItem.c);
        boolean z3 = z2;
        if ((16384 & 16) != 0) {
            dtdVar = null;
        }
        File file3 = (16384 & 32) != 0 ? null : file2;
        rsd rsdVar3 = (16384 & 128) != 0 ? new rsd(0) : rsdVar;
        if ((16384 & 256) != 0) {
            z = false;
        }
        if ((16384 & 1024) != 0) {
            dudVar = null;
        }
        if ((16384 & 2048) != 0) {
            z3 = false;
        }
        if ((16384 & 4096) != 0) {
            clipsDraftAudioEffectType = ClipsDraftAudioEffectType.DEFAULT;
        }
        ClipsDraftAudioEffectType clipsDraftAudioEffectType2 = clipsDraftAudioEffectType;
        urd urdVar3 = (16384 & 8192) != 0 ? null : urdVar2;
        if ((16384 & 65536) != 0) {
            eudVar = new eud(1.0f, false);
        }
        return new cud(file, j, j2, ctdVar, dtdVar, file3, clipsDraftTranscodingState, rsdVar3, z, f2, dudVar, z3, clipsDraftAudioEffectType2, urdVar3, btdVar, eudVar);
    }
}
