package xsna;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeAddFragment;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditorItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPreview;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeDownloadClip;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeEditorCommon;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeMute;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeUndoRedo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ClipsEditorEventBuilder.kt */
/* loaded from: classes5.dex */
public final class xxd extends iid0 {
    public xxd(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipDraft mobileOfficialAppsClipsStat$TypeClipDraft) {
        this(mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsClipsStat$ClipsCreateContext, mobileOfficialAppsClipsStat$TypeClipDraft, qsk0.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xxd(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipEditorItem.a aVar, irk0 irk0Var) {
        super(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeAction.a.b(null, null, r2, 3), irk0Var);
        MobileOfficialAppsClipsStat$TypeClipEditorItem mobileOfficialAppsClipsStat$TypeClipEditorItem;
        MobileOfficialAppsClipsStat$TypeClipEditorItem mobileOfficialAppsClipsStat$TypeClipEditorItem2;
        if (aVar instanceof MobileOfficialAppsClipsStat$TypeEditorCommon) {
            mobileOfficialAppsClipsStat$TypeClipEditorItem2 = new MobileOfficialAppsClipsStat$TypeClipEditorItem(mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipEditorItem.Type.TYPE_EDITOR_COMMON, (MobileOfficialAppsClipsStat$TypeEditorCommon) aVar, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, null);
        } else {
            if (aVar instanceof MobileOfficialAppsClipsStat$TypeUndoRedo) {
                mobileOfficialAppsClipsStat$TypeClipEditorItem = new MobileOfficialAppsClipsStat$TypeClipEditorItem(mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipEditorItem.Type.TYPE_UNDO_REDO, null, (MobileOfficialAppsClipsStat$TypeUndoRedo) aVar, null, null, null, null, null, 500, null);
            } else if (aVar instanceof MobileOfficialAppsClipsStat$TypeMute) {
                mobileOfficialAppsClipsStat$TypeClipEditorItem = new MobileOfficialAppsClipsStat$TypeClipEditorItem(mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipEditorItem.Type.TYPE_MUTE, null, null, (MobileOfficialAppsClipsStat$TypeMute) aVar, null, null, null, null, 492, null);
            } else if (aVar instanceof MobileOfficialAppsClipsStat$TypeClipDraft) {
                mobileOfficialAppsClipsStat$TypeClipEditorItem = new MobileOfficialAppsClipsStat$TypeClipEditorItem(mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipEditorItem.Type.TYPE_CLIP_DRAFT, null, null, null, (MobileOfficialAppsClipsStat$TypeClipDraft) aVar, null, null, null, 476, null);
            } else if (aVar instanceof MobileOfficialAppsClipsStat$TypeAddFragment) {
                mobileOfficialAppsClipsStat$TypeClipEditorItem = new MobileOfficialAppsClipsStat$TypeClipEditorItem(mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipEditorItem.Type.TYPE_ADD_FRAGMENT, null, null, null, null, (MobileOfficialAppsClipsStat$TypeAddFragment) aVar, null, null, 444, null);
            } else if (aVar instanceof MobileOfficialAppsClipsStat$TypeDownloadClip) {
                mobileOfficialAppsClipsStat$TypeClipEditorItem = new MobileOfficialAppsClipsStat$TypeClipEditorItem(mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipEditorItem.Type.TYPE_DOWNLOAD_CLIP, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeDownloadClip) aVar, null, 380, null);
            } else if (aVar instanceof MobileOfficialAppsClipsStat$TypeClipPreview) {
                mobileOfficialAppsClipsStat$TypeClipEditorItem = new MobileOfficialAppsClipsStat$TypeClipEditorItem(mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$TypeClipEditorItem.Type.TYPE_CLIP_PREVIEW, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipPreview) aVar, 252, null);
            } else {
                throw new IllegalArgumentException("payload must be one of(TypeEditorCommon, TypeUndoRedo, TypeMute, TypeClipDraft, TypeAddFragment, TypeDownloadClip, TypeClipPreview)");
            }
            mobileOfficialAppsClipsStat$TypeClipEditorItem2 = mobileOfficialAppsClipsStat$TypeClipEditorItem;
        }
    }
}
