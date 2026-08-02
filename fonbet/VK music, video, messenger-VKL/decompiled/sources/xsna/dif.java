package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ProductsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableFeature;
import com.vk.dto.group.Group;
import com.vk.dto.posting.PostingVisibilityMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.oap;
import xsna.ugf;

/* compiled from: ClipsUploadSimpleFeaturesReducer.kt */
/* loaded from: classes17.dex */
public final class dif implements bm50<ClipsUploadState, ugf.h> {
    @Override // xsna.bm50
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.h hVar) {
        oap bVar;
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.h hVar2 = hVar;
        if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
            return clipsUploadState2;
        }
        if (hVar2 instanceof ugf.h.f) {
            ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
            return ClipsUploadState.Loaded.a(loaded, ClipsUploadDataInternal.a(clipsUploadDataInternal, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData, null, null, null, HideableFeature.a(clipsUploadAuthorRelatedData.e, ((ugf.h.f) hVar2).a, false, 2), null, null, null, null, null, null, false, false, false, false, null, false, false, 262135), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2 instanceof ugf.h.b) {
            ClipsUploadState.Loaded loaded2 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal2 = loaded2.b;
            ClipsUploadStaticData clipsUploadStaticData = clipsUploadDataInternal2.d;
            return ClipsUploadState.Loaded.a(loaded2, ClipsUploadDataInternal.a(clipsUploadDataInternal2, null, null, ClipsUploadStaticData.a(clipsUploadStaticData, null, null, false, false, null, null, null, null, null, HideableFeature.a(clipsUploadStaticData.l, new ProductsData(((ugf.h.b) hVar2).a), false, 2), false, false, false, false, 31743), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2 instanceof ugf.h.a) {
            ClipsUploadState.Loaded loaded3 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal3 = loaded3.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData2 = clipsUploadDataInternal3.e;
            return ClipsUploadState.Loaded.a(loaded3, ClipsUploadDataInternal.a(clipsUploadDataInternal3, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData2, null, null, null, null, HideableFeature.a(clipsUploadAuthorRelatedData2.f, ((ugf.h.a) hVar2).a, false, 2), null, null, null, null, null, false, false, false, false, null, false, false, 262127), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2 instanceof ugf.h.g) {
            ClipsUploadState.Loaded loaded4 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal4 = loaded4.b;
            ugf.h.g gVar = (ugf.h.g) hVar2;
            Group b = hif.b(loaded4, loaded4.f);
            if (b != null) {
                bVar = new oap.a(b);
            } else {
                UploadUserInfo uploadUserInfo = loaded4.d;
                if (uploadUserInfo == null) {
                    throw new IllegalStateException("Something went wrong: selected id isn't present in state");
                }
                bVar = new oap.b(uploadUserInfo);
            }
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData3 = clipsUploadDataInternal4.e;
            ConditionalFeature<ClipsUploadPrivacyData> conditionalFeature = clipsUploadAuthorRelatedData3.c;
            PostingVisibilityMode postingVisibilityMode = conditionalFeature.b.b;
            Long l = gVar.a;
            Pair c = kff.c(postingVisibilityMode, b, bVar, l != null, clipsUploadDataInternal4.f);
            ConditionalFeature.State state = (ConditionalFeature.State) c.i();
            EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = (EasyPromoteUnavalabilityReason) c.j();
            EasyPromoteData easyPromoteData = clipsUploadAuthorRelatedData3.k.b;
            EasyPromoteData a = easyPromoteData != null ? EasyPromoteData.a(easyPromoteData, 0, 0, false, easyPromoteUnavalabilityReason, 7) : null;
            ConditionalFeature.State i = kff.i(loaded4, l, conditionalFeature.b.b, bVar);
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData4 = clipsUploadDataInternal4.e;
            return ClipsUploadState.Loaded.a(loaded4, ClipsUploadDataInternal.a(clipsUploadDataInternal4, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData4, null, null, null, null, null, null, null, null, ConditionalNumber.a(clipsUploadAuthorRelatedData4.j, l, null, 2), new ConditionalFeature(a, state), false, false, false, false, ConditionalFeature.a(clipsUploadAuthorRelatedData3.q, null, i, 1), false, false, 228607), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2 instanceof ugf.h.e) {
            ClipsUploadState.Loaded loaded5 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal5 = loaded5.b;
            return ClipsUploadState.Loaded.a(loaded5, ClipsUploadDataInternal.a(clipsUploadDataInternal5, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal5.d, null, null, false, false, null, null, ((ugf.h.e) hVar2).a, null, null, null, false, false, false, false, 32639), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2 instanceof ugf.h.i) {
            ClipsUploadState.Loaded loaded6 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal6 = loaded6.b;
            return ClipsUploadState.Loaded.a(loaded6, ClipsUploadDataInternal.a(clipsUploadDataInternal6, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadDataInternal6.e, null, null, null, null, null, null, new DisableableFeature(((ugf.h.i) hVar2).a, true), null, null, null, false, false, false, false, null, false, false, 262079), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2.equals(ugf.h.c.a)) {
            ClipsUploadState.Loaded loaded7 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal7 = loaded7.b;
            return ClipsUploadState.Loaded.a(loaded7, ClipsUploadDataInternal.a(clipsUploadDataInternal7, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal7.d, null, null, false, false, null, null, null, null, null, null, false, false, false, false, 28671), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2.equals(ugf.h.d.a)) {
            ClipsUploadState.Loaded loaded8 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal8 = loaded8.b;
            return ClipsUploadState.Loaded.a(loaded8, ClipsUploadDataInternal.a(clipsUploadDataInternal8, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal8.d, null, null, false, false, null, null, null, null, null, null, false, false, false, false, 30719), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2.equals(ugf.h.C3804h.a)) {
            ClipsUploadState.Loaded loaded9 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal9 = loaded9.b;
            return ClipsUploadState.Loaded.a(loaded9, ClipsUploadDataInternal.a(clipsUploadDataInternal9, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal9.d, null, null, false, false, null, null, null, null, null, null, false, false, false, false, 16383), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (hVar2 instanceof ugf.h.j) {
            return ClipsUploadState.Loaded.a((ClipsUploadState.Loaded) clipsUploadState2, null, null, null, null, null, null, 0, false, 0, null, false, ((ugf.h.j) hVar2).a, 2047);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.h hVar) {
        return true;
    }
}
