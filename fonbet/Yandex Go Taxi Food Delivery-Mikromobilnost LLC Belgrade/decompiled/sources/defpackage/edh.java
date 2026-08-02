package defpackage;

import android.content.Context;
import android.util.Size;
import androidx.lifecycle.Lifecycle;
import kotlin.Pair;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a;

/* loaded from: classes6.dex */
public final class edh {
    public final Context a;
    public final Lifecycle b;
    public final tt2 c;
    public final fva0 d;

    public edh(Context context, Lifecycle lifecycle, tt2 tt2Var, fva0 fva0Var) {
        this.a = context;
        this.b = lifecycle;
        this.c = tt2Var;
        this.d = fva0Var;
    }

    public static Pair a(edh edhVar, boolean z, dfv dfvVar, Integer num, Size size, Size size2, int i) {
        Integer num2 = (i & 4) != 0 ? null : num;
        Size size3 = (i & 8) != 0 ? null : size;
        Size size4 = (i & 16) != 0 ? null : size2;
        edhVar.getClass();
        a aVar = new a(edhVar.c, z);
        return new Pair(new gdh(edhVar.a, num2, edhVar.b, z, size3, size4, edhVar.d, aVar, dfvVar), aVar);
    }
}
