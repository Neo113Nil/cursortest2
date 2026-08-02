package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import ru.yandex.taxi.deeplinks.f;

/* loaded from: classes9.dex */
public final class a60 implements y50 {
    public final ComponentActivity a;
    public final f b;

    public a60(ComponentActivity componentActivity, f fVar) {
        this.a = componentActivity;
        this.b = fVar;
    }

    public final void a(String str) {
        try {
            e(143, new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", this.a.getApplication().getPackageName()).putExtra("android.provider.extra.CHANNEL_ID", str));
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final void b(Intent intent) {
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            jst.e.r("Trying start activity with incorrect or unsupported intent=" + intent, e);
        }
    }

    public final void c(String str, v770 v770Var) {
        this.b.b(this.a, str, v770Var);
    }

    public final void d() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.a.getPackageName(), null));
        b(intent);
    }

    public final void e(int i, Intent intent) {
        try {
            this.a.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            jst.e.r("Trying start activity for result with incorrect or unsupported intent=" + intent, e);
            throw e;
        }
    }
}
