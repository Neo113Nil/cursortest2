package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallInput;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipEditScheduledCallFragment;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipEditTimeScheduledCallFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.f6h0;
import xsna.ikv0;

/* compiled from: ScheduledCallRouter.kt */
/* loaded from: classes7.dex */
public final class l6h0 {
    public final Context a;

    public l6h0(Context context) {
        this.a = context;
    }

    public final void a(f6h0 f6h0Var) {
        boolean z = f6h0Var instanceof f6h0.b;
        Context context = this.a;
        if (z) {
            VoipEditScheduledCallFragment.a aVar = new VoipEditScheduledCallFragment.a(VoipEditScheduledCallFragment.class, null, null);
            aVar.j.putParcelable("scheduled_call", new VoipScheduledCallInput(((f6h0.b) f6h0Var).a));
            aVar.s(true);
            aVar.k(context);
            return;
        }
        if (f6h0Var instanceof f6h0.c) {
            VoipEditTimeScheduledCallFragment.a aVar2 = new VoipEditTimeScheduledCallFragment.a();
            x5h0 x5h0Var = ((f6h0.c) f6h0Var).a;
            Bundle bundle = new Bundle();
            bundle.putParcelable("scheduled_call", new VoipScheduledCallInput(x5h0Var));
            VoipEditTimeScheduledCallFragment voipEditTimeScheduledCallFragment = aVar2.a;
            voipEditTimeScheduledCallFragment.setArguments(bundle);
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            if (supportFragmentManager != null) {
                voipEditTimeScheduledCallFragment.Td(supportFragmentManager, "VoipScheduledCallEditTimeFragment");
                return;
            }
            return;
        }
        if (f6h0Var instanceof f6h0.d) {
            VoipScheduledCallsFragment.a aVar3 = new VoipScheduledCallsFragment.a(VoipScheduledCallsFragment.class, null, null);
            aVar3.s(true);
            aVar3.k(context);
        } else if (f6h0Var instanceof f6h0.a) {
            mhy.a(context, ((f6h0.a) f6h0Var).a);
        } else {
            if (!f6h0Var.equals(f6h0.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ikv0.a aVar4 = new ikv0.a(context);
            aVar4.u = new ikv0.d(context.getString(R.string.voip_scheduled_snackbar_invite_copied), (String) null, (ikv0.d.a) null, 6);
            aVar4.e = 4000L;
            aVar4.n();
        }
    }
}
