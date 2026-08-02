package defpackage;

import android.content.Context;
import com.yandex.plus.resources.core.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class omm0 {
    public final /* synthetic */ pmm0 a;

    public omm0(pmm0 pmm0Var) {
        this.a = pmm0Var;
    }

    public final String a(int i) {
        pmm0 pmm0Var = this.a;
        return pmm0Var.a().a().getString(((a) pmm0Var.o.a).a(i));
    }

    public final String b(int i, Object... objArr) {
        pmm0 pmm0Var = this.a;
        yo40 yo40Var = pmm0Var.o;
        Context a = pmm0Var.a().a();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return a.getString(((a) yo40Var.a).a(i), Arrays.copyOf(copyOf, copyOf.length));
    }
}
