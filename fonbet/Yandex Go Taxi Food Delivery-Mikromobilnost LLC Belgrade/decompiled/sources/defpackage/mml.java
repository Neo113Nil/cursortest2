package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import yads.zu0;

/* loaded from: classes10.dex */
public final class mml implements lml {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public mml(Context context) {
        this.c = new aw81(context.getApplicationContext());
    }

    @Override // defpackage.lml
    public final Typeface a() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return wuj0.b(z4h0.finsdk_regular, ((wxk) obj).a);
            default:
                Typeface p = ((aw81) obj).b.p(zu0.e);
                if (p == null) {
                    return null;
                }
                return p;
        }
    }

    @Override // defpackage.lml
    public final Typeface b() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return wuj0.b(z4h0.finsdk_medium, ((wxk) obj).a);
            default:
                Typeface p = ((aw81) obj).b.p(zu0.d);
                if (p == null) {
                    return null;
                }
                return p;
        }
    }

    @Override // defpackage.lml
    public final Typeface c() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return wuj0.b(z4h0.finsdk_bold, ((wxk) obj).a);
            default:
                Typeface p = ((aw81) obj).b.p(zu0.b);
                if (p == null) {
                    return null;
                }
                return p;
        }
    }

    @Override // defpackage.lml
    public final Typeface getLight() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return wuj0.b(z4h0.finsdk_regular, ((wxk) obj).a);
            default:
                Typeface p = ((aw81) obj).b.p(zu0.c);
                if (p == null) {
                    return null;
                }
                return p;
        }
    }

    public mml(wxk wxkVar) {
        this.c = wxkVar;
    }
}
