package xsna;

import android.view.View;
import android.widget.TextView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mfb0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mfb0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                fsv fsvVar = (fsv) this.c;
                TextView textView = (TextView) this.d;
                if (!jjc.b()) {
                    fsvVar.Ig(textView.getId(), 0);
                    break;
                }
                break;
            default:
                izs izsVar = (izs) this.c;
                yai0 yai0Var = (yai0) this.d;
                view.performHapticFeedback(0);
                izsVar.invoke(((zai0) yai0Var.m).a);
                break;
        }
    }
}
