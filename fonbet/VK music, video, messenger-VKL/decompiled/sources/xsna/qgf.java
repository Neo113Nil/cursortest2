package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import kotlin.NoWhenBranchMatchedException;
import xsna.ugf;

/* compiled from: ClipsUploadLinksReducer.kt */
/* loaded from: classes17.dex */
public final class qgf implements bm50<ClipsUploadState, ugf.e> {
    @Override // xsna.bm50
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.e eVar) {
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.e eVar2 = eVar;
        if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
            return clipsUploadState2;
        }
        if (eVar2 instanceof ugf.e.b) {
            ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
            return ClipsUploadState.Loaded.a(loaded, ClipsUploadDataInternal.a(clipsUploadDataInternal, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData, ConditionalFeature.a(clipsUploadAuthorRelatedData.b, null, ((ugf.e.b) eVar2).a, 1), null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, 262142), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (!(eVar2 instanceof ugf.e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsUploadState.Loaded loaded2 = (ClipsUploadState.Loaded) clipsUploadState2;
        ClipsUploadDataInternal clipsUploadDataInternal2 = loaded2.b;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData2 = clipsUploadDataInternal2.e;
        return ClipsUploadState.Loaded.a(loaded2, ClipsUploadDataInternal.a(clipsUploadDataInternal2, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData2, ConditionalFeature.a(clipsUploadAuthorRelatedData2.b, ((ugf.e.a) eVar2).a, null, 2), null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, 262142), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.e eVar) {
        return true;
    }
}
