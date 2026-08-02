package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.appdelegates.BadgeType;
import ru.yandex.taxi.badge.b;

/* loaded from: classes9.dex */
public final class fk4 implements vpr {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ b b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nn4 w;

    public fk4(ViewGroup viewGroup, b bVar, String str, nn4 nn4Var) {
        this.a = viewGroup;
        this.b = bVar;
        this.c = str;
        this.w = nn4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        jn4 jn4Var;
        kn4 a;
        kn4 kn4Var;
        View view;
        BadgeType badgeType = (BadgeType) obj;
        ViewGroup viewGroup = this.a;
        viewGroup.removeAllViews();
        b bVar = this.b;
        kn4 kn4Var2 = bVar.e;
        if (kn4Var2 != null) {
            kn4Var2.b();
        }
        cxq0 cxq0Var = (cxq0) bVar.c.b;
        int i = badgeType == null ? -1 : lk4.a[badgeType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                jn4Var = (jn4) ((h3y) cxq0Var.b).get();
            } else if (i == 2) {
                ((aoj) ((h3y) cxq0Var.w).get()).getClass();
            } else if (i == 3) {
                jn4Var = (jn4) ((h3y) cxq0Var.c).get();
            } else {
                if (i != 4) {
                    w511.b();
                    return null;
                }
                jn4Var = (jn4) ((h3y) cxq0Var.x).get();
            }
            a = jn4Var != null ? jn4Var.a(viewGroup, this.c, this.w) : null;
            bVar.e = a;
            if (a != null && (view = a.a) != null) {
                view.setEnabled(bVar.f);
            }
            kn4Var = bVar.e;
            if (kn4Var != null) {
                kn4Var.a();
            }
            return zy11.a;
        }
        jn4Var = null;
        if (jn4Var != null) {
        }
        bVar.e = a;
        if (a != null) {
            view.setEnabled(bVar.f);
        }
        kn4Var = bVar.e;
        if (kn4Var != null) {
        }
        return zy11.a;
    }
}
