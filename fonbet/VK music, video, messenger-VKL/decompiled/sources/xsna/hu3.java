package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hu3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hu3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ju3 ju3Var = (ju3) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) ju3Var.c.invoke();
                if (fragmentActivity != null) {
                    myc0.h(g5z.a(fragmentActivity), dgn0.f().getMain(), null, new abs(new mu3(ju3Var, fragmentActivity, null), null), 2);
                    break;
                } else {
                    ju3Var.j();
                    break;
                }
            case 1:
                ((v40) this.c).invoke();
                break;
            case 2:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.c;
                h2w h2wVar = eVar.k;
                int i2 = 0;
                int i3 = 0;
                eVar.a(new j9b(i3, eVar, com.vk.newsfeed.posting.market_picker.presentation.base.view.e.class, "onHideAnimation", "onHideAnimation()V", i2), new k9b(i3, eVar, com.vk.newsfeed.posting.market_picker.presentation.base.view.e.class, "onFinishScaleOut", "onFinishScaleOut()V", i2, 2), h2wVar);
                break;
            case 3:
                ((k970) this.c).invoke();
                break;
            default:
                ((rp1) this.c).invoke();
                dialogInterface.dismiss();
                break;
        }
    }
}
