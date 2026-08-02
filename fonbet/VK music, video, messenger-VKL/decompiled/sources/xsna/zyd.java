package xsna;

import android.content.Context;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;

/* compiled from: ClipsEditorPermissionsHelperImpl.kt */
/* loaded from: classes16.dex */
public final class zyd implements mpe {
    @Override // xsna.mpe
    public final void a(Context context, String[] strArr, v40 v40Var, qb qbVar) {
        PermissionHelper.a.d(context, strArr, R.string.clips_editor_audio_permission_rational, R.string.clips_editor_audio_settings_rational, v40Var, qbVar);
    }
}
