package xsna;

import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.models.VideoUrlPack;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.upload.edit.api.preview.PreviewThumbs;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkThumbsItem;
import com.vk.clips.viewer.edit.presentation.feature.ClipEditSdkFeatures;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkCoverImage;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import com.vk.clips.viewer.edit.presentation.feature.state.CoverImageUrl;
import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;
import com.vk.clips.viewer.edit.presentation.feature.state.ord.ClipsEditOrdState;
import com.vk.clips.viewer.edit.presentation.feature.state.trends.ClipsTrendingHashtagsState;
import com.vk.clips.viewer.edit.presentation.feature.state.videoattach.ClipEditVideoAttachState;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.htc;

/* compiled from: ClipEditSdkMviBootstrapper.kt */
/* loaded from: classes17.dex */
public final class xsc implements vj50<ClipEditSdkMviState, on50, htc, zsc> {
    public final ClipEditSdkItem a;
    public final Set<ClipEditSdkFeatures> b;
    public final gzs<ClipEditSdkMviState> c;

    /* JADX WARN: Multi-variable type inference failed */
    public xsc(ClipEditSdkItem clipEditSdkItem, Set<? extends ClipEditSdkFeatures> set, gzs<ClipEditSdkMviState> gzsVar) {
        this.a = clipEditSdkItem;
        this.b = set;
        this.c = gzsVar;
    }

    @Override // xsna.vj50
    public final ClipEditSdkMviState a() {
        String str;
        ClipEditSdkMviState invoke = this.c.invoke();
        if (invoke != null) {
            return invoke;
        }
        ClipEditSdkItem clipEditSdkItem = this.a;
        String str2 = clipEditSdkItem.h;
        List<ClipCoauthorSdkItem> list = clipEditSdkItem.m;
        SdkImages sdkImages = clipEditSdkItem.i;
        ClipEditAttachedVideo clipEditAttachedVideo = clipEditSdkItem.l;
        ClipEditSdkFeatures clipEditSdkFeatures = ClipEditSdkFeatures.VideoAttach;
        Set<ClipEditSdkFeatures> set = this.b;
        boolean contains = set.contains(clipEditSdkFeatures);
        ClipEditVideoAttachState clipEditVideoAttachState = ClipEditVideoAttachState.Disabled.b;
        if (contains) {
            if (clipEditAttachedVideo == null) {
                clipEditVideoAttachState = ClipEditVideoAttachState.Empty.b;
            } else {
                String id = clipEditAttachedVideo.getId();
                if (id != null) {
                    clipEditVideoAttachState = new ClipEditVideoAttachState.Loading(id);
                }
            }
        }
        ClipEditVideoAttachState clipEditVideoAttachState2 = clipEditVideoAttachState;
        ClipsEditCoauthorsState enabled = !set.contains(ClipEditSdkFeatures.Coauthors) ? ClipsEditCoauthorsState.Disabled.b : new ClipsEditCoauthorsState.Enabled(list, set.contains(ClipEditSdkFeatures.CoauthorsRedesign), ClipsEditCoauthorsState.Enabled.InactiveReason.LoadingInfo);
        ClipsEditOrdState clipsEditOrdState = set.contains(ClipEditSdkFeatures.Ord) ? ClipsEditOrdState.Enabled.b : ClipsEditOrdState.Disabled.b;
        String str3 = clipEditSdkItem.b;
        UserId userId = clipEditSdkItem.c;
        UserId userId2 = clipEditSdkItem.d;
        String str4 = clipEditSdkItem.h;
        List<ImageUrl> list2 = sdkImages.b;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ImageUrl imageUrl : list2) {
            arrayList.add(new CoverImageUrl(imageUrl.b, imageUrl.f, imageUrl.e));
        }
        ClipEditSdkCoverImage clipEditSdkCoverImage = new ClipEditSdkCoverImage(arrayList, sdkImages.c);
        VideoUrlPack videoUrlPack = clipEditSdkItem.e;
        int i = clipEditSdkItem.g;
        int i2 = clipEditSdkItem.f;
        ClipEditSdkThumbsItem clipEditSdkThumbsItem = clipEditSdkItem.j;
        PreviewThumbs previewThumbs = new PreviewThumbs(clipEditSdkThumbsItem.b, clipEditSdkThumbsItem.c, clipEditSdkThumbsItem.d, clipEditSdkThumbsItem.e, clipEditSdkThumbsItem.f, clipEditSdkThumbsItem.g);
        SdkClipOrdData sdkClipOrdData = clipEditSdkItem.k;
        if (clipEditAttachedVideo == null || (str = clipEditAttachedVideo.getId()) == null) {
            str = null;
        }
        return new ClipEditSdkMviState(str2, "", null, clipEditVideoAttachState2, enabled, clipsEditOrdState, set.contains(ClipEditSdkFeatures.TrendingHashtags) ? new ClipsTrendingHashtagsState.Enabled(EmptyList.b) : ClipsTrendingHashtagsState.Disabled.b, new ImmutableClipState(str3, userId, userId2, str4, clipEditSdkCoverImage, videoUrlPack, i2, i, previewThumbs, sdkClipOrdData, str != null ? new ImmutableClipState.AttachedVideo.RawId(str) : null, list, clipEditSdkItem.p), false, null, !clipEditSdkItem.o, !clipEditSdkItem.n, null, set.contains(ClipEditSdkFeatures.ClipAttachVideoNewNaming), 4096, null);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ zsc b() {
        return null;
    }

    @Override // xsna.vj50
    public final List<htc> c(ClipEditSdkMviState clipEditSdkMviState) {
        ClipEditSdkMviState clipEditSdkMviState2 = clipEditSdkMviState;
        ListBuilder e = e43.e();
        ClipEditVideoAttachState clipEditVideoAttachState = clipEditSdkMviState2.e;
        if (clipEditVideoAttachState instanceof ClipEditVideoAttachState.Loading) {
            e.add(new htc.a(((ClipEditVideoAttachState.Loading) clipEditVideoAttachState).b));
        }
        if (clipEditSdkMviState2.f instanceof ClipsEditCoauthorsState.Enabled) {
            e.add(htc.b.b);
        }
        if (clipEditSdkMviState2.h instanceof ClipsTrendingHashtagsState.Enabled) {
            e.add(htc.c.b);
        }
        return e.g();
    }
}
