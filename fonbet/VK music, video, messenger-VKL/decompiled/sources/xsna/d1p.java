package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.overlaymenu.feature.report.screenshot.ScreenshotEditorActivity;

/* compiled from: EditScreenshotActivityResultContract.kt */
/* loaded from: classes4.dex */
public final class d1p extends va0<String, String> {
    @Override // xsna.va0
    public final Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) ScreenshotEditorActivity.class);
        intent.putExtra("screenshot_path", str);
        return intent;
    }

    @Override // xsna.va0
    public final String c(int i, Intent intent) {
        if (i != 998128457 || intent == null) {
            return null;
        }
        return intent.getStringExtra("edited_screenshot_path");
    }
}
