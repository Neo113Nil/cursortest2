package defpackage;

import android.os.SystemClock;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class na00 implements i3m {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ na00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // defpackage.i3m
    public final void dispose() {
        int i = this.a;
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        switch (this.a) {
            case 0:
                if (((ArrayList) list).contains("fromNetwork")) {
                    mb7 mb7Var = (mb7) this.b;
                    mb7Var.a.getClass();
                    mb7Var.c = SystemClock.elapsedRealtime();
                    break;
                }
                break;
            default:
                if (((ArrayList) list).contains("fromNetwork")) {
                    jb00 jb00Var = (jb00) xzlVar.a.c.b(qoi0.a(jb00.class));
                    if ((jb00Var != null ? jb00Var.a : null) != null) {
                        hof0 hof0Var = (hof0) ((h3y) this.b).get();
                        PromoMode promoMode = jb00Var.a;
                        hof0Var.a.l(promoMode);
                        ((yww0) hof0Var.b.getValue()).b(promoMode);
                        break;
                    }
                }
                break;
        }
    }
}
