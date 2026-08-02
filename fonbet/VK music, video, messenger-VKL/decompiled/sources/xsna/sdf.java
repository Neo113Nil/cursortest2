package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.dto.common.clips.CoOwnerItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ugf;

/* compiled from: ClipsUploadCoauthorsReducer.kt */
/* loaded from: classes17.dex */
public final class sdf implements bm50<ClipsUploadState, ugf.b> {
    @Override // xsna.bm50
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.b bVar) {
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.b bVar2 = bVar;
        if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
            return clipsUploadState2;
        }
        if (!(bVar2 instanceof ugf.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) clipsUploadState2;
        ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
        ConditionalFeature<CoauthorsData> conditionalFeature = clipsUploadAuthorRelatedData.d;
        CoauthorsData coauthorsData = conditionalFeature.b;
        List<CoOwnerItem> list = ((ugf.b.a) bVar2).a;
        coauthorsData.getClass();
        return ClipsUploadState.Loaded.a(loaded, ClipsUploadDataInternal.a(clipsUploadDataInternal, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData, null, null, ConditionalFeature.a(conditionalFeature, new CoauthorsData(list), null, 2), null, null, null, null, null, null, null, false, false, false, false, null, false, false, 262139), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.b bVar) {
        return true;
    }
}
