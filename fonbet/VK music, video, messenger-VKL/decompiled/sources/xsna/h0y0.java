package xsna;

import android.text.ParcelableSpan;
import com.vk.writebar.WriteBar;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h0y0 implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                int i = WriteBar.h0;
                return obj instanceof ParcelableSpan;
            default:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 1;
        }
    }
}
