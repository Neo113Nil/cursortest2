package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.vk.debug.ui.dev.DebugMockApiResponsesFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class c6l implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ c6l(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ComponentName component;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                int i2 = DebugMockApiResponsesFragment.O;
                cvk.w("Restart! Wait please...", false);
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null) {
                    context.startActivity(Intent.makeRestartActivityTask(component));
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            default:
                dhr0.a.getClass();
                return new l7s(context, dhr0.u().c);
        }
    }
}
