package xsna;

import android.text.style.EasyEditSpan;
import android.text.style.ParagraphStyle;
import android.text.style.TtsSpan;
import android.text.style.UpdateAppearance;
import com.vk.writebar.WriteBar;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g0y0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ g0y0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                int i = WriteBar.h0;
                return (obj instanceof UpdateAppearance) || (obj instanceof ParagraphStyle) || (obj instanceof TtsSpan) || (obj instanceof EasyEditSpan);
            default:
                return ((xmy0) obj).b.s();
        }
    }
}
