package xsna;

import android.content.DialogInterface;
import com.vk.dto.photo.Photo;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ls1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((gs1) this.c).invoke();
                dialogInterface.dismiss();
                break;
            case 1:
                odg0.a.g((Photo) this.c);
                break;
            default:
                ((UserProfileDialogs) this.c).a.a(new UserProfileAction.s.c.b(3));
                break;
        }
    }
}
