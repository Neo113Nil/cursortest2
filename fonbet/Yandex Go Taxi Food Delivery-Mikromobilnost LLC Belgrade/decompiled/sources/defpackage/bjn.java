package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;

/* loaded from: classes4.dex */
public final class bjn implements zo31 {
    public final CustomizableHeader a;
    public final ImageView b;
    public final CustomizableTextView c;

    public bjn(CustomizableHeader customizableHeader, ImageView imageView, CustomizableTextView customizableTextView) {
        this.a = customizableHeader;
        this.b = imageView;
        this.c = customizableTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
