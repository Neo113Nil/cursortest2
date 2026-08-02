package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.superapp.qr.web2app.QrWebToAppActivity;

/* compiled from: QrWebToAppRouter.kt */
/* loaded from: classes6.dex */
public final class qoe0 {
    public final Context a;

    public qoe0(Context context) {
        this.a = context;
    }

    public final void a() {
        boolean z;
        Context context = this.a;
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context : null);
        if (fragmentActivity != null) {
            joe0 joe0Var = new joe0();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
            b.f(0, joe0Var, "camera_fragment", 1);
            b.k(false);
        }
    }

    public final void b(Uri uri) {
        int i = QrWebToAppActivity.f;
        Context context = this.a;
        Intent addFlags = new Intent(context, (Class<?>) QrWebToAppActivity.class).addFlags(268435456);
        addFlags.putExtra("uri", uri);
        context.startActivity(addFlags);
    }
}
