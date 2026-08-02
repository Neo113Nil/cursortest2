package xsna;

import android.content.DialogInterface;
import com.vk.dto.stories.model.StoryViewAction;
import xsna.fdg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                fw fwVar = (fw) obj;
                elm0 elm0Var = fwVar.a.i0.c;
                if (elm0Var != null) {
                    elm0Var.finish();
                }
                m9n m9nVar = m9n.b;
                hg1.i(((bsl0) m9n.e.getValue()).c(false).m(io.reactivex.rxjava3.android.schedulers.a.b()), new defpackage.c(15, fwVar.a.i0.getContext(), new f1(fwVar, 2)));
                fwVar.a.i0.f1(StoryViewAction.DISCOVER_HIDE, null);
                break;
            default:
                ((ycg0) obj).a.a(fdg0.a.a);
                break;
        }
    }
}
