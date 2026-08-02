package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import kotlin.NoWhenBranchMatchedException;
import xsna.ugf;

/* compiled from: ClipsEasyPromoteReducer.kt */
/* loaded from: classes17.dex */
public final class zud implements bm50<ClipsUploadState, ugf.c> {
    @Override // xsna.bm50
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.c cVar) {
        EasyPromoteData easyPromoteData;
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.c cVar2 = cVar;
        if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
            return clipsUploadState2;
        }
        if (cVar2 instanceof ugf.c.a) {
            ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData2 = clipsUploadDataInternal.e;
            ugf.c.a aVar = (ugf.c.a) cVar2;
            ConditionalFeature a = ConditionalFeature.a(clipsUploadAuthorRelatedData.c, null, aVar.b, 1);
            ConditionalNumber a2 = ConditionalNumber.a(clipsUploadAuthorRelatedData2.j, null, aVar.c, 1);
            ConditionalFeature<EasyPromoteData> conditionalFeature = clipsUploadAuthorRelatedData2.k;
            EasyPromoteData easyPromoteData2 = conditionalFeature.b;
            return ClipsUploadState.Loaded.a(loaded, ClipsUploadDataInternal.a(clipsUploadDataInternal, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData, null, a, null, null, null, null, null, null, a2, ConditionalFeature.a(conditionalFeature, easyPromoteData2 != null ? EasyPromoteData.a(easyPromoteData2, 0, 0, aVar.a, null, 11) : null, null, 2), false, false, false, false, null, false, false, 261373), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (!(cVar2 instanceof ugf.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsUploadState.Loaded loaded2 = (ClipsUploadState.Loaded) clipsUploadState2;
        ClipsUploadDataInternal clipsUploadDataInternal2 = loaded2.b;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData3 = clipsUploadDataInternal2.e;
        ConditionalFeature<EasyPromoteData> conditionalFeature2 = clipsUploadAuthorRelatedData3.k;
        EasyPromoteData easyPromoteData3 = conditionalFeature2.b;
        if (easyPromoteData3 != null) {
            ugf.c.b bVar = (ugf.c.b) cVar2;
            easyPromoteData = EasyPromoteData.a(easyPromoteData3, bVar.a, bVar.b, false, null, 12);
        } else {
            easyPromoteData = null;
        }
        return ClipsUploadState.Loaded.a(loaded2, ClipsUploadDataInternal.a(clipsUploadDataInternal2, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData3, null, null, null, null, null, null, null, null, null, ConditionalFeature.a(conditionalFeature2, easyPromoteData, null, 2), false, false, false, false, null, false, false, 261631), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.c cVar) {
        return true;
    }
}
