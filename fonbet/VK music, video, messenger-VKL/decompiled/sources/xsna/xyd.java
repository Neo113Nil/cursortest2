package xsna;

import android.app.Activity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.dto.clips.external.VideoToClipInput;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.clips.model.ClipsEditorInputAudioItem;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.vyd;

/* compiled from: ClipsEditorNavigatorImpl.kt */
/* loaded from: classes.dex */
public final class xyd implements vyd {
    public final lbk a;

    public xyd(lbk lbkVar) {
        this.a = lbkVar;
    }

    @Override // xsna.vyd
    public final void a(Activity activity, vyd.d dVar, vyd.c cVar) {
        ClipsDraftPersistentStore.d(ClipsDraftPersistentStore.b);
        VideoToClipInput c = dVar.c();
        ClipsEditorInputData clipsEditorInputData = new ClipsEditorInputData(Collections.singletonList(jyd.a(c.e())), null, null, false, false, null, 0, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 998, null);
        kbk kbkVar = new kbk(dVar.b(), new SecureRandom().nextInt(Integer.MAX_VALUE), true, dVar.a());
        this.a.j(kbkVar);
        c(activity, new ClipsEditorInitParams(clipsEditorInputData, new ClipsEditorUploadParams(kbkVar.c(), null, null, 1, null, null, null, null, null, false, null, null, null, 0, false, false, false, false, null, wrp.b(kbkVar.b()), null, c.d(), null, null, null, null, 64487414, null), null, 4, null), cVar);
    }

    @Override // xsna.vyd
    public final void b(Activity activity, vyd.a aVar, vyd.c cVar, ClipsEditorSessionParams clipsEditorSessionParams) {
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        wyd wydVar = new wyd(aVar, this, clipsEditorSessionParams, activity, cVar, 0);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(wydVar);
    }

    @Override // xsna.vyd
    public final void c(Activity activity, ClipsEditorInitParams clipsEditorInitParams, vyd.c cVar) {
        ClipsEditorFragment.a aVar = new ClipsEditorFragment.a(clipsEditorInitParams);
        aVar.y(cVar.a());
        aVar.s(true);
        aVar.t();
        Integer b = cVar.b();
        if (b != null) {
            aVar.h(activity, b.intValue());
        } else {
            aVar.k(activity);
        }
    }

    @Override // xsna.vyd
    public final void e(Activity activity, vyd.b bVar, vyd.c cVar, ClipsEditorSessionParams clipsEditorSessionParams) {
        ClipsEditorInputAudioItem clipsEditorInputAudioItem;
        ClipsDraftPersistentStore.d(ClipsDraftPersistentStore.b);
        ClipsEditorMusicInfo b = bVar.b();
        if (b != null) {
            clipsEditorInputAudioItem = new ClipsEditorInputAudioItem(b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, null);
        } else {
            clipsEditorInputAudioItem = null;
        }
        ClipsEditorInputAudioItem clipsEditorInputAudioItem2 = clipsEditorInputAudioItem;
        List<ClipsProcessedItem> e = bVar.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(jyd.a((ClipsProcessedItem) it.next()));
        }
        ClipsEditorInputData clipsEditorInputData = new ClipsEditorInputData(arrayList, clipsEditorInputAudioItem2, null, false, false, null, 0, bVar.d(), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 868, null);
        lbk lbkVar = this.a;
        kbk context = lbkVar.getContext();
        if (context == null) {
            context = new kbk(bVar.c(), new SecureRandom().nextInt(Integer.MAX_VALUE), true);
            lbkVar.j(context);
        }
        c(activity, new ClipsEditorInitParams(clipsEditorInputData, new ClipsEditorUploadParams(context.c(), null, null, bVar.e().size(), null, null, null, null, null, false, null, null, null, 0, false, false, false, false, null, wrp.b(context.b()), null, null, null, null, null, bVar.a(), 33030134, null), clipsEditorSessionParams), cVar);
    }
}
