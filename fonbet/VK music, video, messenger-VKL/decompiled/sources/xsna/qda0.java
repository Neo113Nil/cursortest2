package xsna;

import android.content.DialogInterface;
import android.content.Intent;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class qda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Cloneable d;

    public /* synthetic */ qda0(Object obj, Cloneable cloneable, int i) {
        this.b = i;
        this.c = obj;
        this.d = cloneable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Cloneable cloneable = this.d;
        Object obj = this.c;
        switch (i2) {
            case 0:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj;
                Intent intent = (Intent) cloneable;
                int i3 = PhotoVideoAttachActivity.g0;
                photoVideoAttachActivity.getClass();
                intent.putExtra("chosen_option", i);
                photoVideoAttachActivity.setResult(-1, intent);
                photoVideoAttachActivity.finish();
                break;
            default:
                ((izs) obj).invoke(((lwb0) ((ArrayList) cloneable).get(i)).f);
                break;
        }
    }
}
