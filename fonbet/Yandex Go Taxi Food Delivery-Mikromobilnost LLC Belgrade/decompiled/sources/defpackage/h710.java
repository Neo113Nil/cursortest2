package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import com.google.android.material.button.MaterialButtonGroup;

/* loaded from: classes15.dex */
public final /* synthetic */ class h710 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h710(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean lambda$addMenuItemForButton$2;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lambda$addMenuItemForButton$2 = MaterialButtonGroup.lambda$addMenuItemForButton$2((Button) obj, menuItem);
                return lambda$addMenuItemForButton$2;
            default:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT < 34) {
                    actionIntent.send();
                    return true;
                }
                try {
                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                    actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    return true;
                } catch (PendingIntent.CanceledException e) {
                    Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    return true;
                }
        }
    }
}
