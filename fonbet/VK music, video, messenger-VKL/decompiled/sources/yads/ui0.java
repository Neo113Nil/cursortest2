package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* loaded from: classes10.dex */
public final class ui0 implements DivTypefaceProvider {
    public final sw0 a;

    public /* synthetic */ ui0(Context context) {
        this(new sw0(context.getApplicationContext()));
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface a = this.a.b.a(tw0.b);
        return a == null ? DivTypefaceProvider.DEFAULT.getBold() : a;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        Typeface a = this.a.b.a(tw0.c);
        return a == null ? DivTypefaceProvider.DEFAULT.getLight() : a;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        Typeface a = this.a.b.a(tw0.d);
        return a == null ? DivTypefaceProvider.DEFAULT.getMedium() : a;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        Typeface a = this.a.b.a(tw0.e);
        return a == null ? DivTypefaceProvider.DEFAULT.getRegular() : a;
    }

    public ui0(sw0 sw0Var) {
        this.a = sw0Var;
    }
}
