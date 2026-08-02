package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;

/* compiled from: ArticleEditorUtils.kt */
/* loaded from: classes15.dex */
public final class wn3 {
    public static void a(Context context, int i, long j) {
        xwk.d().e().l(context, f870.v(InternalVkMiniApps.ARTICLE_EDITOR.h()) + "#owner_id=" + j + "&article_id=" + i, LaunchContext.A, null, null);
    }
}
