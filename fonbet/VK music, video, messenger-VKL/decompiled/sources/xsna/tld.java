package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tld implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tld(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((zld) this.c).g.invoke(null);
                dialogInterface.dismiss();
                break;
            default:
                Activity activity = (Activity) this.c;
                ner0 ner0Var = new ner0(activity);
                ner0Var.setMessage(activity.getString(R.string.loading));
                ner0Var.show();
                ner0Var.setCancelable(false);
                asu0.a.getClass();
                asu0.q().submit(new df6(9, ner0Var, activity));
                break;
        }
    }
}
