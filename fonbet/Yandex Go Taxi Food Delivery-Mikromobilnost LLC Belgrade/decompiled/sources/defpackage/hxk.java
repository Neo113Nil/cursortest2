package defpackage;

import android.content.Context;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class hxk {
    public static final x4c b = new x4c(22);
    public static final am2 c;
    public static volatile hxk d;
    public final DivKitComponent a;

    static {
        oxk oxkVar = new oxk();
        c = new am2(Executors.newSingleThreadExecutor(), oxkVar.a, oxkVar.b);
    }

    public hxk(Context context, am2 am2Var) {
        DivKitComponent.Builder a = Yatagan$DivKitComponent.builder().a(context.getApplicationContext());
        a.b(am2Var);
        this.a = a.build();
    }
}
