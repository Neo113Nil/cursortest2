package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jvt implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jvt(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                kvt kvtVar = (kvt) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                bbs.a(fragmentActivity, EmptyCoroutineContext.b, new ovt(kvtVar, fragmentActivity, null));
                break;
            default:
                ubr0 ubr0Var = (ubr0) this.c;
                l6n0 l6n0Var = (l6n0) this.d;
                VkBridgeAnalytics E = ubr0Var.a.E();
                if (E != null) {
                    E.m(VkBridgeAnalytics.ExitGameAlertEvent.STAY_IN_GAME, (Integer) l6n0Var.invoke());
                    break;
                }
                break;
        }
    }
}
