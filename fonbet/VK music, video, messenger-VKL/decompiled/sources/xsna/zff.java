package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import kotlin.NoWhenBranchMatchedException;
import xsna.ugf;

/* compiled from: ClipsUploadGeolocationReducer.kt */
/* loaded from: classes17.dex */
public final class zff implements bm50<ClipsUploadState, ugf.d> {
    @Override // xsna.bm50
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.d dVar) {
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.d dVar2 = dVar;
        if (dVar2 instanceof ugf.d.b) {
            if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                return clipsUploadState2;
            }
            ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
            return ClipsUploadState.Loaded.a(loaded, ClipsUploadDataInternal.a(clipsUploadDataInternal, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal.d, null, null, false, false, null, null, null, ((ugf.d.b) dVar2).a, null, null, false, false, false, false, 32511), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (!(dVar2 instanceof ugf.d.a)) {
            if (dVar2 instanceof ugf.d.c) {
                return clipsUploadState2 instanceof ClipsUploadState.Loaded ? ClipsUploadState.Loaded.a((ClipsUploadState.Loaded) clipsUploadState2, null, null, null, null, null, ((ugf.d.c) dVar2).a, 0, false, 0, null, false, false, 4063) : clipsUploadState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
            return clipsUploadState2;
        }
        ClipsUploadState.Loaded loaded2 = (ClipsUploadState.Loaded) clipsUploadState2;
        ClipsUploadDataInternal clipsUploadDataInternal2 = loaded2.b;
        return ClipsUploadState.Loaded.a(loaded2, ClipsUploadDataInternal.a(clipsUploadDataInternal2, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal2.d, null, null, false, false, null, null, null, null, null, null, false, false, false, false, 32511), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.d dVar) {
        return true;
    }
}
