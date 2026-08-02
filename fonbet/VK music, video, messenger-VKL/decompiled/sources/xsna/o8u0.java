package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import com.vk.oauth.tinkoff.VkTinkoffBaseActivity;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item;
import xsna.p8u0;
import xsna.rhw0;
import xsna.shw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o8u0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8u0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                try {
                    ((Dialog) obj).show();
                } catch (Exception e) {
                    String canonicalName = p8u0.a.class.getCanonicalName();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    Log.e(canonicalName, message);
                }
                return s3q0.a;
            case 1:
                final com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                return new Activity.ScreenCaptureCallback() { // from class: xsna.vfu0
                    @Override // android.app.Activity.ScreenCaptureCallback
                    public final void onScreenCaptured() {
                        com.vk.superapp.browser.ui.a.this.un().getState().g().a.J().l1();
                    }
                };
            case 2:
                ((k2v0) obj).a();
                return s3q0.a;
            case 3:
                int i2 = VkTinkoffBaseActivity.o;
                return (com.vk.oauth.tinkoff.b) ((VkTinkoffBaseActivity) obj).V1().d.getValue();
            case 4:
                return ((VoipCallComponent) ((k7m) m7m.f((zcw0) obj)).a(fpf0.a(VoipCallComponent.class))).L1();
            case 5:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i3 = VoipCallServiceFragment.Y;
                rhw0.i iVar = new rhw0.i(shw0.b.a);
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, iVar);
                return s3q0.a;
            case 6:
                VoipScheduledCallSettingsFragment.c cVar = ((VoipScheduledCallSettingsFragment) obj).S;
                ayw0 ayw0Var = new ayw0();
                ayw0Var.x0(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.class, new k7l0(cVar, 29));
                ayw0Var.x0(VoipScheduledCallSettingsContentViewState$ScreenState$Item.a.class, new qyn0(8));
                return ayw0Var;
            default:
                return ((com.vk.writebar.c) obj).b.getState().u;
        }
    }

    public /* synthetic */ o8u0(k2v0 k2v0Var, Context context) {
        this.b = 2;
        this.c = k2v0Var;
    }
}
