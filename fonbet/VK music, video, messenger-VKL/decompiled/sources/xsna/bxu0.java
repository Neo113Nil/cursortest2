package xsna;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.lang.ref.WeakReference;

/* compiled from: AuthUiManager.kt */
/* loaded from: classes.dex */
public final class bxu0 implements qcv0 {
    public final WeakReference<Fragment> a;
    public final zbaq b;

    public bxu0(a66 a66Var) {
        this.a = new WeakReference<>(a66Var);
        this.b = qjg.c(a66Var.requireContext());
    }

    @Override // xsna.qcv0
    public final String a(Intent intent) {
        try {
            return this.b.getPhoneNumberFromIntent(intent);
        } catch (Throwable th) {
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.m();
            par0.a.getClass();
            par0.d(th);
            return null;
        }
    }

    @Override // xsna.qcv0
    public final void b(final int i) {
        this.b.getPhoneNumberHintIntent(new GetPhoneNumberHintIntentRequest(0)).addOnCompleteListener(new OnCompleteListener() { // from class: xsna.axu0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                bxu0 bxu0Var = bxu0.this;
                int i2 = i;
                if (!task.isSuccessful()) {
                    com.vk.registration.funnels.b.a.getClass();
                    com.vk.registration.funnels.b.m();
                    par0 par0Var = par0.a;
                    Exception exception = task.getException();
                    par0Var.getClass();
                    par0.d(exception);
                    return;
                }
                try {
                    PendingIntent pendingIntent = (PendingIntent) task.getResult();
                    Fragment fragment = bxu0Var.a.get();
                    if (fragment != null && !fragment.isRemoving() && !fragment.isDetached()) {
                        fragment.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0, null);
                        com.vk.registration.funnels.b.a.getClass();
                        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.GOOGLE_PHONE_HINT_OPENED, null, null, null, null, null, null, 254);
                    }
                } catch (Throwable th) {
                    com.vk.registration.funnels.b.a.getClass();
                    com.vk.registration.funnels.b.m();
                    par0.a.getClass();
                    par0.d(th);
                }
            }
        });
    }
}
