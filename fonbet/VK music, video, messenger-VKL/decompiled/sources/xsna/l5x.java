package xsna;

import android.app.Activity;
import android.graphics.Paint;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class l5x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ l5x(Activity activity, int i) {
        this.b = i;
        this.c = activity;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Paint paint = new Paint(1);
                paint.setColor(krv0.m(R.attr.vk_ui_text_primary, this.c));
                paint.setTextSize(iah0.a(14.0f));
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setStyle(Paint.Style.FILL);
                return paint;
            default:
                tmq.a().j(this.c);
                return s3q0.a;
        }
    }
}
