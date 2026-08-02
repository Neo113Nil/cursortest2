package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.io.ByteArrayInputStream;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h3q0 implements izs {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ h3q0(TextView textView, int i, int i2, int i3) {
        this.b = textView;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Drawable createFromStream = Drawable.createFromStream((ByteArrayInputStream) obj, "");
        if (createFromStream != null) {
            createFromStream.setColorFilter(new PorterDuffColorFilter(this.c, PorterDuff.Mode.SRC_ATOP));
            createFromStream.setBounds(0, 0, this.d, this.e);
        } else {
            createFromStream = null;
        }
        this.b.setCompoundDrawables(createFromStream, null, null, null);
        return s3q0.a;
    }
}
