package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.core.transfer.utils.CashbackView;

/* loaded from: classes2.dex */
public final class q061 implements zo31 {
    public final CashbackView a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public q061(CashbackView cashbackView, ImageView imageView, TextView textView, TextView textView2) {
        this.a = cashbackView;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
