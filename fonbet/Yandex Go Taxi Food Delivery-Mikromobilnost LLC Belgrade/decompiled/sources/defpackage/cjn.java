package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableScreenIcon;

/* loaded from: classes4.dex */
public final class cjn implements zo31 {
    public final CustomizableScreenIcon a;
    public final ImageView b;
    public final View c;

    public cjn(CustomizableScreenIcon customizableScreenIcon, ImageView imageView, View view) {
        this.a = customizableScreenIcon;
        this.b = imageView;
        this.c = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
