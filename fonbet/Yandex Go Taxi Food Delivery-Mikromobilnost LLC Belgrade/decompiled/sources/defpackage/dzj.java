package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class dzj implements lml {
    public final /* synthetic */ int b;
    public final Context c;

    public /* synthetic */ dzj(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // defpackage.lml
    public final Typeface a() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return wuj0.b(v5h0.ya_display_regular, context);
            case 1:
                return wuj0.b(y4h0.ya_regular, context);
            case 2:
                return wuj0.b(v5h0.ya_display_regular, context);
            default:
                return wuj0.b(y4h0.ya_regular, context);
        }
    }

    @Override // defpackage.lml
    public final Typeface b() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return wuj0.b(u5h0.ya_display_medium, context);
            case 1:
                return wuj0.b(x4h0.ya_medium, context);
            case 2:
                return wuj0.b(u5h0.ya_display_medium, context);
            default:
                return wuj0.b(x4h0.ya_medium, context);
        }
    }

    @Override // defpackage.lml
    public final Typeface c() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return wuj0.b(r5h0.ya_display_bold, context);
            case 1:
                return wuj0.b(e5h0.ya_bold, context);
            case 2:
                return wuj0.b(r5h0.ya_display_bold, context);
            default:
                return wuj0.b(e5h0.ya_bold, context);
        }
    }

    @Override // defpackage.lml
    public final Typeface getLight() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return wuj0.b(t5h0.ya_display_light, context);
            case 1:
                return wuj0.b(v4h0.ya_light, context);
            case 2:
                return wuj0.b(t5h0.ya_display_light, context);
            default:
                return wuj0.b(v4h0.ya_light, context);
        }
    }
}
