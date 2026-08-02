package xsna;

import android.app.Activity;
import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: CameraEditorProgressDialogListener.java */
/* loaded from: classes6.dex */
public class gi9 {
    public final ner0 a;

    public gi9(Context context) {
        ner0 ner0Var = new ner0(context);
        ner0Var.setMessage(context.getResources().getString(R.string.video_saving));
        ner0Var.setProgressStyle(1);
        ner0Var.setMax(100);
        ner0Var.setIndeterminate(false);
        ner0Var.setCancelable(true);
        ner0Var.setCanceledOnTouchOutside(false);
        Activity h = e3m.h(context);
        if (h != null && !p90.e(h)) {
            ner0Var.show();
        }
        this.a = ner0Var;
    }
}
