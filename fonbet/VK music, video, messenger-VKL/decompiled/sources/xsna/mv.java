package xsna;

import android.content.DialogInterface;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.method.selector.impl.MethodSelectorView;
import com.vk.video.profile.presentation.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mv(Object obj, int i) {
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
                fwVar.getClass();
                fwVar.a(StoryViewAction.CHANGE_PRIVACY_WITHIN_DELETING);
                break;
            case 1:
                ((wlg) obj).c.invoke(a.e.b);
                break;
            case 2:
                dvt dvtVar = (dvt) obj;
                bbs.b(dvtVar.m, new fvt(dvtVar, null));
                break;
            default:
                gzs gzsVar = (gzs) obj;
                int i3 = MethodSelectorView.g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
