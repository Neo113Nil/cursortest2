package xsna;

import android.view.View;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tb2 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return epx.g(((hcd0) obj2).a, ((hcd0) obj).a);
            default:
                return epx.g(((View) obj).getTop(), ((View) obj2).getTop());
        }
    }
}
