package defpackage;

import android.content.Context;
import android.view.View;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public abstract class jz4 {
    public final KSerializer a;
    public final zcx b = tje.a(sbx.d, new at3(21));

    public jz4(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    public abstract void a(View view, yzh yzhVar);

    public abstract View b(Context context, Object obj, qnh qnhVar);
}
