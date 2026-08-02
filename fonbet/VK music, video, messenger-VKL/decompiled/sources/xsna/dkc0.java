package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.dto.common.VideoFile;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dkc0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dkc0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ekc0 ekc0Var = (ekc0) this.c;
                FutureDateTimePickerView futureDateTimePickerView = (FutureDateTimePickerView) this.d;
                izs<? super Date, s3q0> izsVar = ekc0Var.c;
                if (izsVar != null) {
                    izsVar.invoke(futureDateTimePickerView.getDate());
                    break;
                }
                break;
            default:
                fxc0.B().P((Context) this.c, (VideoFile) this.d);
                break;
        }
    }
}
