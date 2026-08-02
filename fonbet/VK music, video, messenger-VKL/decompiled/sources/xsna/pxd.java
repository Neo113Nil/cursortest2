package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.clips.external.ClipsDuetInfo;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pxd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ pdo c;
    public final /* synthetic */ MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint d;

    public /* synthetic */ pxd(int i, pdo pdoVar, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint) {
        this.b = i;
        this.c = pdoVar;
        this.d = creationEntryPoint;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String name;
        ClipsDraftVk clipsDraftVk = (ClipsDraftVk) obj;
        ClipsDraftPersistentStore.b.getClass();
        String i = ClipsDraftPersistentStore.i();
        ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
        ClipsDraftVkExtraData clipsDraftVkExtraData = clipsDraftVk.c;
        List<ClipsEditorInputVideoItem> list = clipsDraftCommonData.d;
        pdo pdoVar = this.c;
        String str = pdoVar.h;
        long j = clipsDraftCommonData.f;
        boolean z = clipsDraftCommonData.g;
        int i2 = clipsDraftCommonData.h;
        String str2 = clipsDraftCommonData.j;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint = this.d;
        ClipsDraftCommonData clipsDraftCommonData2 = new ClipsDraftCommonData(i, this.b, list, str, j, z, i2, false, str2, (creationEntryPoint == null || (name = creationEntryPoint.name()) == null) ? null : cqm0.m(name), null, clipsDraftVk.b.m, null, null, 13440, null);
        List<? extends List<? extends CanvasStickerDraft>> list2 = clipsDraftVkExtraData.b;
        ClipsDuetInfo clipsDuetInfo = pdoVar.e;
        yco ycoVar = pdoVar.b;
        ClipsDraftVk clipsDraftVk2 = new ClipsDraftVk(clipsDraftCommonData2, new ClipsDraftVkExtraData(list2, ycoVar != null ? new ClipsDraftMusicInfo(ycoVar.a, ycoVar.b, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, null) : null, null, null, null, null, clipsDuetInfo, null, clipsDraftVkExtraData.j, null, IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, null));
        ClipsDraftPersistentStore.w(clipsDraftVk2);
        ClipsDraftPersistentStore.t();
        nsd nsdVar = fvr.c;
        if (nsdVar != null) {
            nsdVar.c(1);
        } else {
            Preference.F(swe0.i(Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref") + 1, 0L, ClipsDraftPersistentStore.m().size()), "clips_draft_prefs", "unseen_drafts_pref");
        }
        return io.reactivex.rxjava3.core.x.k(clipsDraftVk2);
    }
}
