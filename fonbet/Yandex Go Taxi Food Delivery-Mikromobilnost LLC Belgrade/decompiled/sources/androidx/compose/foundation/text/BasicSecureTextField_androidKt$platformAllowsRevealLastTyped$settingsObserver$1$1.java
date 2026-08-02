package androidx.compose.foundation.text;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import defpackage.h5b1;
import defpackage.lhe;
import defpackage.oz40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1", "Landroid/database/ContentObserver;", "", "selfChange", "Lzy11;", "onChange", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1 extends ContentObserver {
    final /* synthetic */ lhe $resolver;
    final /* synthetic */ oz40 $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1(lhe lheVar, oz40 oz40Var, Handler handler) {
        super(handler);
        this.$resolver = lheVar;
        this.$state$delegate = oz40Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) {
        oz40 oz40Var = this.$state$delegate;
        ((h5b1) this.$resolver).getClass();
        boolean z = true;
        try {
            if (Settings.System.getInt(null, "show_password") <= 0) {
                z = false;
            }
        } catch (Exception unused) {
        }
        oz40Var.setValue(Boolean.valueOf(z));
    }
}
