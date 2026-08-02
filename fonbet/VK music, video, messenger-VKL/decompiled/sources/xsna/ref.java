package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.dto.common.id.UserId;
import xsna.lbf;

/* compiled from: ClipsUploadEventsBroadcastMiddleware.kt */
/* loaded from: classes17.dex */
public final class ref implements h7f0<ClipsUploadState, lbf, Object, mjf, ugf, qef> {
    public final sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> b;

    public ref(sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> sl50Var) {
        this.b = sl50Var;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        if (((lbf) lj50Var) instanceof lbf.b.d) {
            ClipsUploadState currentState = this.b.getCurrentState();
            ClipsUploadState.Loaded loaded = currentState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState : null;
            if (loaded == null) {
                return;
            }
            ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
            if (clipsUploadDataInternal.f.contains(ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser.b)) {
                UserId userId = loaded.f;
                String str = clipsUploadDataInternal.c.c;
                if (userId == null || str.length() == 0) {
                    return;
                }
                Intent putExtra = new Intent("com.vk.clips.intent.DRAFT_SAVED").putExtra("extra_clips_draft_author_id", userId.b).putExtra("extra_clips_draft_entry_point", str);
                Context context = e43.a;
                cuz.a(context != null ? context : null).c(putExtra);
            }
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
