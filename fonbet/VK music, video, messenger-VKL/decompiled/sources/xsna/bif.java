package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadErrorType;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ugf;

/* compiled from: ClipsUploadServiceTasksReducer.kt */
/* loaded from: classes17.dex */
public final class bif implements bm50<ClipsUploadState, ugf.f> {
    @Override // xsna.bm50
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.f fVar) {
        UserId userId;
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.f fVar2 = fVar;
        if (fVar2 instanceof ugf.f.d) {
            return new ClipsUploadState.Loading(((ugf.f.d) fVar2).a);
        }
        if (fVar2 instanceof ugf.f.c) {
            ugf.f.c cVar = (ugf.f.c) fVar2;
            ClipsUploadDataInternal clipsUploadDataInternal = cVar.a;
            ArrayList arrayList = cVar.c;
            UploadUserInfo uploadUserInfo = cVar.b;
            Group group = cVar.f;
            if (group == null || (userId = group.c) == null) {
                userId = uploadUserInfo != null ? uploadUserInfo.b : ((Group) j5g.Y(arrayList)).c;
            }
            return new ClipsUploadState.Loaded(clipsUploadDataInternal, arrayList, uploadUserInfo, group, userId, EmptyList.b, 0, cVar.d, cVar.e, null, false, false, 3136, null);
        }
        if (fVar2 instanceof ugf.f.C3802f) {
            return clipsUploadState2 instanceof ClipsUploadState.Loaded ? ClipsUploadState.Loaded.a((ClipsUploadState.Loaded) clipsUploadState2, null, null, null, null, null, null, ((ugf.f.C3802f) fVar2).a, false, 0, null, false, false, 4031) : clipsUploadState2;
        }
        if (fVar2 instanceof ugf.f.e) {
            ugf.f.e eVar = (ugf.f.e) fVar2;
            return new ClipsUploadState.Error(new ClipsUploadErrorType.InitialNetworkLoad(eVar.a, eVar.b));
        }
        if (fVar2 instanceof ugf.f.a) {
            ugf.f.a aVar = (ugf.f.a) fVar2;
            return new ClipsUploadState.Error(new ClipsUploadErrorType.InitialParamsCompactSetup(aVar.a, aVar.b));
        }
        if (!(fVar2 instanceof ugf.f.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ugf.f.b bVar = (ugf.f.b) fVar2;
        return new ClipsUploadState.Error(new ClipsUploadErrorType.InitialParamsFullSetup(bVar.a, bVar.b));
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.f fVar) {
        return true;
    }
}
