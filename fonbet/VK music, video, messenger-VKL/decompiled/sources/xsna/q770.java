package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q770 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ q770(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Toast.makeText(this.c, R.string.video_do_not_notify_toast, 0).show();
                return s3q0.a;
            case 1:
                LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, this.c);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.weight = 1.0f;
                a.setLayoutParams(layoutParams);
                a.setGravity(16);
                return a;
            default:
                return new n8w0(new s8w0(this.c, new wql0(14)));
        }
    }
}
