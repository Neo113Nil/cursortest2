package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.clips.edit.editor.ClipsChoosePreviewActivity;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import xsna.rld;

/* compiled from: ClipsChoosePreviewActivityResultLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class old implements rld.a {
    public final Context a;
    public final izs<ClipsChoosePreviewResult, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public old(Context context, izs<? super ClipsChoosePreviewResult, s3q0> izsVar) {
        this.a = context;
        this.b = izsVar;
    }

    @Override // xsna.rld.a
    public final Intent a(ClipsChoosePreviewParams clipsChoosePreviewParams) {
        Intent intent = new Intent(this.a, (Class<?>) ClipsChoosePreviewActivity.class);
        intent.putExtra("choose_preview_settings_key", clipsChoosePreviewParams);
        return intent;
    }
}
