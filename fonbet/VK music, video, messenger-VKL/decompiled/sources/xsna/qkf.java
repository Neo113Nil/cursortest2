package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.TooltipsData;
import kotlin.NoWhenBranchMatchedException;
import xsna.ugf;

/* compiled from: ClipsUploadTooltipsReducer.kt */
/* loaded from: classes17.dex */
public final class qkf implements bm50<ClipsUploadState, ugf.i> {
    @Override // xsna.bm50
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.i iVar) {
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.i iVar2 = iVar;
        if (clipsUploadState2 instanceof ClipsUploadState.Loaded) {
            if (iVar2.equals(ugf.i.d.a)) {
                ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) clipsUploadState2;
                TooltipsData a = TooltipsData.a(loaded.b.d.k, 510);
                ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
                return ClipsUploadState.Loaded.a(loaded, ClipsUploadDataInternal.a(clipsUploadDataInternal, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal.d, null, null, false, false, null, null, null, null, a, null, false, false, false, false, 32255), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (iVar2.equals(ugf.i.a.a)) {
                ClipsUploadState.Loaded loaded2 = (ClipsUploadState.Loaded) clipsUploadState2;
                TooltipsData a2 = TooltipsData.a(loaded2.b.d.k, 503);
                ClipsUploadDataInternal clipsUploadDataInternal2 = loaded2.b;
                return ClipsUploadState.Loaded.a(loaded2, ClipsUploadDataInternal.a(clipsUploadDataInternal2, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal2.d, null, null, false, false, null, null, null, null, a2, null, false, false, false, false, 32255), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (iVar2.equals(ugf.i.b.a)) {
                ClipsUploadState.Loaded loaded3 = (ClipsUploadState.Loaded) clipsUploadState2;
                TooltipsData a3 = TooltipsData.a(loaded3.b.d.k, 495);
                ClipsUploadDataInternal clipsUploadDataInternal3 = loaded3.b;
                return ClipsUploadState.Loaded.a(loaded3, ClipsUploadDataInternal.a(clipsUploadDataInternal3, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal3.d, null, null, false, false, null, null, null, null, a3, null, false, false, false, false, 32255), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (iVar2.equals(ugf.i.c.a)) {
                ClipsUploadState.Loaded loaded4 = (ClipsUploadState.Loaded) clipsUploadState2;
                TooltipsData a4 = TooltipsData.a(loaded4.b.d.k, 479);
                ClipsUploadDataInternal clipsUploadDataInternal4 = loaded4.b;
                return ClipsUploadState.Loaded.a(loaded4, ClipsUploadDataInternal.a(clipsUploadDataInternal4, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal4.d, null, null, false, false, null, null, null, null, a4, null, false, false, false, false, 32255), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (iVar2.equals(ugf.i.e.a)) {
                ClipsUploadState.Loaded loaded5 = (ClipsUploadState.Loaded) clipsUploadState2;
                TooltipsData a5 = TooltipsData.a(loaded5.b.d.k, 255);
                ClipsUploadDataInternal clipsUploadDataInternal5 = loaded5.b;
                return ClipsUploadState.Loaded.a(loaded5, ClipsUploadDataInternal.a(clipsUploadDataInternal5, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal5.d, null, null, false, false, null, null, null, null, a5, null, false, false, false, false, 32255), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (iVar2.equals(ugf.i.f.a)) {
                ClipsUploadState.Loaded loaded6 = (ClipsUploadState.Loaded) clipsUploadState2;
                TooltipsData a6 = TooltipsData.a(loaded6.b.d.k, 507);
                ClipsUploadDataInternal clipsUploadDataInternal6 = loaded6.b;
                return ClipsUploadState.Loaded.a(loaded6, ClipsUploadDataInternal.a(clipsUploadDataInternal6, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal6.d, null, null, false, false, null, null, null, null, a6, null, false, false, false, false, 32255), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (iVar2.equals(ugf.i.C3805i.a)) {
                ClipsUploadState.Loaded loaded7 = (ClipsUploadState.Loaded) clipsUploadState2;
                TooltipsData a7 = TooltipsData.a(loaded7.b.d.k, 447);
                ClipsUploadDataInternal clipsUploadDataInternal7 = loaded7.b;
                return ClipsUploadState.Loaded.a(loaded7, ClipsUploadDataInternal.a(clipsUploadDataInternal7, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal7.d, null, null, false, false, null, null, null, null, a7, null, false, false, false, false, 32255), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (iVar2.equals(ugf.i.h.a)) {
                ClipsUploadState.Loaded loaded8 = (ClipsUploadState.Loaded) clipsUploadState2;
                ClipsUploadDataInternal clipsUploadDataInternal8 = loaded8.b;
                return ClipsUploadState.Loaded.a(loaded8, ClipsUploadDataInternal.a(clipsUploadDataInternal8, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadDataInternal8.e, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, 261119), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (iVar2.equals(ugf.i.g.a)) {
                ClipsUploadState.Loaded loaded9 = (ClipsUploadState.Loaded) clipsUploadState2;
                ClipsUploadDataInternal clipsUploadDataInternal9 = loaded9.b;
                return ClipsUploadState.Loaded.a(loaded9, ClipsUploadDataInternal.a(clipsUploadDataInternal9, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal9.d, null, null, false, false, null, null, null, null, null, null, false, false, false, false, 30719), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (!iVar2.equals(ugf.i.j.a)) {
                if (!(iVar2 instanceof vgf)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipsUploadState.Loaded loaded10 = (ClipsUploadState.Loaded) clipsUploadState2;
                ClipsUploadDataInternal clipsUploadDataInternal10 = loaded10.b;
                return ClipsUploadState.Loaded.a(loaded10, ClipsUploadDataInternal.a(clipsUploadDataInternal10, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal10.d, null, null, false, false, null, null, null, null, null, null, false, false, ((vgf) iVar2).a, false, 24575), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
        }
        return clipsUploadState2;
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.i iVar) {
        return true;
    }
}
