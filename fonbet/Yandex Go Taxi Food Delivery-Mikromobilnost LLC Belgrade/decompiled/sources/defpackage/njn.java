package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextWithBulletPoint;

/* loaded from: classes4.dex */
public final class njn implements zo31 {
    public final CustomizableTextWithBulletPoint a;
    public final ImageView b;
    public final TextView c;

    public njn(CustomizableTextWithBulletPoint customizableTextWithBulletPoint, ImageView imageView, TextView textView) {
        this.a = customizableTextWithBulletPoint;
        this.b = imageView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
