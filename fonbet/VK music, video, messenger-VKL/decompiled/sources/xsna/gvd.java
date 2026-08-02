package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;

/* compiled from: ClipsEditSdkCoverSelectionHandlerVk.kt */
/* loaded from: classes16.dex */
public final class gvd implements fvd {
    public final rld a;

    public gvd(rld rldVar) {
        this.a = rldVar;
    }

    @Override // xsna.fvd
    public final void a(Context context, ClipsChoosePreviewParams clipsChoosePreviewParams) {
        xa4.L(context).D(this.a.a(context, new wr0(8)).a(clipsChoosePreviewParams), 1765, null);
    }

    @Override // xsna.fvd
    public final ClipsChoosePreviewResult b(Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        if (intent == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("clip_preview_edit_result_key", ClipsChoosePreviewResult.class);
            parcelable = (Parcelable) parcelableExtra;
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("clip_preview_edit_result_key");
            parcelable = (ClipsChoosePreviewResult) (parcelableExtra2 instanceof ClipsChoosePreviewResult ? parcelableExtra2 : null);
        }
        return (ClipsChoosePreviewResult) parcelable;
    }
}
