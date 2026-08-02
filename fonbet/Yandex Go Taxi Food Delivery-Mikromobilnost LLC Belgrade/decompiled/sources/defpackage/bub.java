package defpackage;

import android.view.View;
import java.util.function.Predicate;
import ru.yandex.taxi.design.CircleButtonsPanelComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class bub implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ bub(r501 r501Var) {
        this.a = 1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean _get_childWidthSum_$lambda$1;
        switch (this.a) {
            case 0:
                _get_childWidthSum_$lambda$1 = CircleButtonsPanelComponent._get_childWidthSum_$lambda$1((View) obj);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (((View) obj).getVisibility() == 8) {
                    break;
                }
                break;
            default:
                if (((View) obj).getVisibility() == 8) {
                    break;
                }
                break;
        }
        return false;
    }

    public /* synthetic */ bub(int i) {
        this.a = i;
    }

    public /* synthetic */ bub(boolean z) {
        this.a = 3;
    }
}
