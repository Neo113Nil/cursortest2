package xsna;

import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$AutoRepostToStoryWithLikes;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.AutoRepostToStoriesData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.OnboardingDetails;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableSwitch;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableSwitch;
import com.vk.dto.group.Group;
import com.vk.dto.posting.PostingVisibilityMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;
import xsna.ugf;

/* compiled from: ClipsUploadSharingOptionsReducer.kt */
/* loaded from: classes17.dex */
public final class cif implements bm50<ClipsUploadState, ugf.g> {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r12 != com.vk.dto.posting.PostingVisibilityMode.FRIENDS) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.bm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.g gVar) {
        oap bVar;
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.g gVar2 = gVar;
        if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
            return clipsUploadState2;
        }
        if (gVar2 instanceof ugf.g.k) {
            ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
            ugf.g.k kVar = (ugf.g.k) gVar2;
            Group b = hif.b(loaded, loaded.f);
            if (b != null) {
                bVar = new oap.a(b);
            } else {
                UploadUserInfo uploadUserInfo = loaded.d;
                if (uploadUserInfo == null) {
                    throw new IllegalStateException("Something went wrong: selected id isn't present in state");
                }
                bVar = new oap.b(uploadUserInfo);
            }
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
            ConditionalFeature<AutoRepostToStoriesData> conditionalFeature = clipsUploadAuthorRelatedData.q;
            Long d = clipsUploadAuthorRelatedData.j.d();
            ClipsUploadPrivacyData clipsUploadPrivacyData = kVar.a;
            PostingVisibilityMode postingVisibilityMode = clipsUploadPrivacyData.b;
            ConditionalFeature.State state = conditionalFeature.c;
            ConditionalFeature.State state2 = ConditionalFeature.State.HIDDEN;
            if (state != state2) {
                if (bVar instanceof oap.b) {
                    if (postingVisibilityMode != PostingVisibilityMode.ALL) {
                    }
                } else {
                    if (!(bVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (d == null) {
                    state2 = ConditionalFeature.State.SHOWN;
                }
                state2 = ConditionalFeature.State.DISABLED;
            }
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData2 = clipsUploadDataInternal.e;
            return ClipsUploadState.Loaded.a(loaded, ClipsUploadDataInternal.a(clipsUploadDataInternal, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData2, null, ConditionalFeature.a(clipsUploadAuthorRelatedData2.c, clipsUploadPrivacyData, null, 2), kVar.c, null, null, null, null, DisableableSwitch.a(clipsUploadAuthorRelatedData.i, false, kVar.b, 1), null, kVar.d, false, false, false, false, ConditionalFeature.a(conditionalFeature, null, state2, 1), false, false, 228729), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.h) {
            ClipsUploadState.Loaded loaded2 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal2 = loaded2.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData3 = clipsUploadDataInternal2.e;
            return ClipsUploadState.Loaded.a(loaded2, ClipsUploadDataInternal.a(clipsUploadDataInternal2, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData3, null, null, null, null, null, null, null, DisableableSwitch.a(clipsUploadAuthorRelatedData3.i, ((ugf.g.h) gVar2).a, false, 2), null, null, false, false, false, false, null, false, false, 262015), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.e) {
            ClipsUploadState.Loaded loaded3 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal3 = loaded3.b;
            return ClipsUploadState.Loaded.a(loaded3, ClipsUploadDataInternal.a(clipsUploadDataInternal3, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal3.d, null, null, ((ugf.g.e) gVar2).a, false, null, null, null, null, null, null, false, false, false, false, 32763), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.d) {
            ClipsUploadState.Loaded loaded4 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal4 = loaded4.b;
            return ClipsUploadState.Loaded.a(loaded4, ClipsUploadDataInternal.a(clipsUploadDataInternal4, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal4.d, null, null, false, ((ugf.g.d) gVar2).a, null, null, null, null, null, null, false, false, false, false, 32759), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.m) {
            ClipsUploadState.Loaded loaded5 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal5 = loaded5.b;
            ClipsUploadStaticData clipsUploadStaticData = clipsUploadDataInternal5.d;
            return ClipsUploadState.Loaded.a(loaded5, ClipsUploadDataInternal.a(clipsUploadDataInternal5, null, null, ClipsUploadStaticData.a(clipsUploadStaticData, null, null, false, false, new HideableSwitch(((ugf.g.m) gVar2).a, clipsUploadStaticData.g.c), null, null, null, null, null, false, false, false, false, 32735), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.a) {
            ClipsUploadState.Loaded loaded6 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal6 = loaded6.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData4 = clipsUploadDataInternal6.e;
            ConditionalFeature<AutoRepostToStoriesData> conditionalFeature2 = clipsUploadAuthorRelatedData4.q;
            AutoRepostToStoriesData autoRepostToStoriesData = conditionalFeature2.b;
            boolean z = ((ugf.g.a) gVar2).a;
            OnboardingDetails onboardingDetails = autoRepostToStoriesData.c;
            autoRepostToStoriesData.getClass();
            return ClipsUploadState.Loaded.a(loaded6, ClipsUploadDataInternal.a(clipsUploadDataInternal6, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData4, null, null, null, null, null, null, null, null, null, null, false, false, false, false, ConditionalFeature.a(conditionalFeature2, new AutoRepostToStoriesData(z, onboardingDetails), null, 2), false, false, 229375), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.c) {
            ClipsUploadState.Loaded loaded7 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal7 = loaded7.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData5 = clipsUploadDataInternal7.e;
            ConditionalFeature<AutoRepostToStoriesData> conditionalFeature3 = clipsUploadAuthorRelatedData5.q;
            AutoRepostToStoriesData autoRepostToStoriesData2 = conditionalFeature3.b;
            OnboardingDetails onboardingDetails2 = ((ugf.g.c) gVar2).a;
            boolean z2 = autoRepostToStoriesData2.b;
            autoRepostToStoriesData2.getClass();
            return ClipsUploadState.Loaded.a(loaded7, ClipsUploadDataInternal.a(clipsUploadDataInternal7, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData5, null, null, null, null, null, null, null, null, null, null, false, false, false, false, ConditionalFeature.a(conditionalFeature3, new AutoRepostToStoriesData(z2, onboardingDetails2), null, 2), false, false, 229375), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.b) {
            ClipsUploadState.Loaded loaded8 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal8 = loaded8.b;
            ConditionalFeature.State state3 = !clipsUploadDataInternal8.f.contains(ClipUploadScreenFeature$AutoRepostToStoryWithLikes.b) ? ConditionalFeature.State.HIDDEN : ConditionalFeature.State.DISABLED;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData6 = clipsUploadDataInternal8.e;
            return ClipsUploadState.Loaded.a(loaded8, ClipsUploadDataInternal.a(clipsUploadDataInternal8, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData6, null, null, null, null, null, null, null, null, null, null, false, false, false, false, ConditionalFeature.a(clipsUploadAuthorRelatedData6.q, null, state3, 1), false, false, 229375), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.j) {
            ClipsUploadState.Loaded loaded9 = (ClipsUploadState.Loaded) clipsUploadState2;
            ugf.g.j jVar = (ugf.g.j) gVar2;
            ClipsUploadDataInternal clipsUploadDataInternal9 = loaded9.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData7 = clipsUploadDataInternal9.e;
            return ClipsUploadState.Loaded.a(loaded9, ClipsUploadDataInternal.a(clipsUploadDataInternal9, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData7, null, null, null, null, null, null, null, null, null, null, false, clipsUploadAuthorRelatedData7.m && (clipsUploadAuthorRelatedData7.p ? jVar.b : jVar.a), false, false, null, false, false, 258047), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.i) {
            ClipsUploadState.Loaded loaded10 = (ClipsUploadState.Loaded) clipsUploadState2;
            ugf.g.i iVar = (ugf.g.i) gVar2;
            ClipsUploadDataInternal clipsUploadDataInternal10 = loaded10.b;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData8 = clipsUploadDataInternal10.e;
            return ClipsUploadState.Loaded.a(loaded10, ClipsUploadDataInternal.a(clipsUploadDataInternal10, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData8, null, null, null, null, null, null, null, null, null, null, false, false, clipsUploadAuthorRelatedData8.p ? iVar.b : iVar.a, false, null, false, false, 253951), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.f) {
            ClipsUploadState.Loaded loaded11 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal11 = loaded11.b;
            return ClipsUploadState.Loaded.a(loaded11, ClipsUploadDataInternal.a(clipsUploadDataInternal11, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal11.d, null, null, false, false, null, null, null, null, null, null, ((ugf.g.f) gVar2).a, false, false, false, 30719), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (gVar2 instanceof ugf.g.C3803g) {
            ClipsUploadState.Loaded loaded12 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal12 = loaded12.b;
            return ClipsUploadState.Loaded.a(loaded12, ClipsUploadDataInternal.a(clipsUploadDataInternal12, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal12.d, null, null, false, false, null, null, null, null, null, null, false, ((ugf.g.C3803g) gVar2).a, false, false, 28671), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (!(gVar2 instanceof ugf.g.l)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsUploadState.Loaded loaded13 = (ClipsUploadState.Loaded) clipsUploadState2;
        ClipsUploadDataInternal clipsUploadDataInternal13 = loaded13.b;
        return ClipsUploadState.Loaded.a(loaded13, ClipsUploadDataInternal.a(clipsUploadDataInternal13, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal13.d, null, null, false, false, null, null, null, null, null, null, false, false, false, ((ugf.g.l) gVar2).a, 16383), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.g gVar) {
        return true;
    }
}
