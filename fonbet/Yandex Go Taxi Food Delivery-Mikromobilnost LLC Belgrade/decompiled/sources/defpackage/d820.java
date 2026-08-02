package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes5.dex */
public final class d820 implements mp11 {
    public final /* synthetic */ int b;
    public final Context c;

    public /* synthetic */ d820(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // defpackage.mp11
    public final Typeface a() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                Typeface b = wuj0.b(y4h0.ys_text_regular, context);
                if (b == null) {
                    break;
                }
                break;
            default:
                Typeface b2 = wuj0.b(y4h0.ys_text_regular, context);
                if (b2 == null) {
                    break;
                }
                break;
        }
        return Typeface.DEFAULT;
    }

    @Override // defpackage.mp11
    public final Typeface b() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                Typeface b = wuj0.b(x4h0.ys_text_medium, context);
                if (b == null) {
                    break;
                }
                break;
            default:
                Typeface b2 = wuj0.b(x4h0.ys_text_medium, context);
                if (b2 == null) {
                    break;
                }
                break;
        }
        return Typeface.DEFAULT;
    }

    @Override // defpackage.mp11
    public final Typeface c() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                Typeface b = wuj0.b(e5h0.ys_text_bold, context);
                if (b == null) {
                    break;
                }
                break;
            default:
                Typeface b2 = wuj0.b(e5h0.ys_text_bold, context);
                if (b2 == null) {
                    break;
                }
                break;
        }
        return Typeface.DEFAULT;
    }

    @Override // defpackage.mp11
    public final Typeface getLight() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                Typeface b = wuj0.b(v4h0.ys_text_light, context);
                if (b == null) {
                    break;
                }
                break;
            default:
                Typeface b2 = wuj0.b(v4h0.ys_text_light, context);
                if (b2 == null) {
                    break;
                }
                break;
        }
        return Typeface.DEFAULT;
    }
}
