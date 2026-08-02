package xsna;

import android.content.DialogInterface;
import com.vk.avatarpicker.BaseAvatarPickerActivity;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class x66 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x66(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((lz0) this.d).invoke((BaseAvatarPickerActivity.ImageSourceAction) ((List) this.c).get(i));
                break;
            default:
                ((com.vk.profile.community.impl.ui.profile.actions.c) this.c).e.invoke(new CommunityProfileAction.e.AbstractC1583e.h(((d.j.m) this.d).a));
                break;
        }
    }
}
