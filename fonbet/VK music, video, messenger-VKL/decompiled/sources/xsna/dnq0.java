package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import xsna.cvd0;

/* compiled from: UserProfileContentClipsFeatureDelegateHelper.kt */
/* loaded from: classes5.dex */
public final class dnq0 {
    public static final int a = iah0.a(120);
    public static final int b = iah0.a(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);

    public static Clips a(Clips clips, VideoFileOld videoFileOld) {
        cvd0.f fVar = clips.j;
        ArrayList arrayList = fVar != null ? new ArrayList(fVar.a) : new ArrayList();
        arrayList.add(0, videoFileOld);
        return Clips.i(clips, new cvd0.f(arrayList), null, null, null, false, false, null, null, null, null, null, null, false, 524286);
    }

    public static Clips b(Clips clips, ArrayList arrayList, String str, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        List<ClipsPlaylist> list = clips.k;
        if (list != null) {
            arrayList2.addAll(list);
        }
        arrayList2.addAll(arrayList);
        return Clips.i(clips, null, arrayList2, null, str, false, myc0.f(str) && !arrayList.isEmpty(), null, null, z ? CommunityProfileContentItem.State.LOADED : clips.s, null, z ? clips.v : CommunityProfileContentItem.State.LOADED, null, false, 257493);
    }

    public static VideoFileOld c(gud gudVar, UserId userId) {
        int i;
        if (gudVar == null || (i = gudVar.a) == 0) {
            return null;
        }
        VideoFileOld videoFileOld = new VideoFileOld();
        videoFileOld.b = userId;
        Serializer.c<Image> cVar = Image.CREATOR;
        String str = gudVar.b;
        m900<String, ImageSize> m900Var = ImageSize.e;
        int i2 = a;
        int i3 = b;
        videoFileOld.I0 = Image.b.c(str, i2, i3, ImageSize.b.c(i2, i3));
        videoFileOld.l = String.valueOf(i);
        videoFileOld.p = "tab_collection_draft_dummy";
        return videoFileOld;
    }

    public static VideoFileOld d(Clips.ContentTabCollection contentTabCollection) {
        Clips.ContentTabCollection.ContentTabCollectionImage contentTabCollectionImage;
        if (contentTabCollection == null || (contentTabCollectionImage = (Clips.ContentTabCollection.ContentTabCollectionImage) j5g.a0(contentTabCollection.c)) == null) {
            return null;
        }
        VideoFileOld videoFileOld = new VideoFileOld();
        videoFileOld.b = UserId.d;
        Serializer.c<Image> cVar = Image.CREATOR;
        String str = contentTabCollectionImage.a;
        int i = contentTabCollectionImage.b;
        int i2 = contentTabCollectionImage.c;
        m900<String, ImageSize> m900Var = ImageSize.e;
        videoFileOld.I0 = Image.b.c(str, i, i2, ImageSize.b.c(i, i2));
        videoFileOld.l = String.valueOf(contentTabCollection.b);
        videoFileOld.p = "tab_collection_scheduled_dummy";
        return videoFileOld;
    }
}
