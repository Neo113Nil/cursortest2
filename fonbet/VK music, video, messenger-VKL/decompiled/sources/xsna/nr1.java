package xsna;

import android.content.DialogInterface;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nr1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nr1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Runnable runnable;
        switch (this.b) {
            case 0:
                Pair pair = (Pair) j5g.b0(i, ((or1) this.c).b);
                if (pair != null && (runnable = (Runnable) pair.j()) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ((ew3) this.c).invoke();
                break;
            default:
                ((UserProfileDialogs) this.c).a.a(UserProfileAction.s.b.C1693b.b);
                break;
        }
    }
}
