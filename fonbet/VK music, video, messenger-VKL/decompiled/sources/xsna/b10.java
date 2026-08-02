package xsna;

import android.content.DialogInterface;
import android.view.View;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b10(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((ActionFollowVh) this.c).onClick((View) this.d);
                break;
            default:
                ((izs) this.c).invoke(((UserId[]) this.d)[i]);
                break;
        }
    }
}
