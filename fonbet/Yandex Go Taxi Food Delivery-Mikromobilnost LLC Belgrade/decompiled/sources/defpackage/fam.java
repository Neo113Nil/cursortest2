package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes12.dex */
public final /* synthetic */ class fam implements v52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ AnchorBottomSheetBehavior x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fam(View view, ViewGroup viewGroup, int[] iArr, Object obj, AnchorBottomSheetBehavior anchorBottomSheetBehavior, int i) {
        this.a = i;
        this.b = view;
        this.c = viewGroup;
        this.w = iArr;
        this.y = obj;
        this.x = anchorBottomSheetBehavior;
    }

    @Override // defpackage.v52
    public final Integer f(int i, int i2) {
        boolean z;
        int i3 = this.a;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.x;
        Object obj = this.y;
        int[] iArr = this.w;
        View view = this.c;
        View view2 = this.b;
        switch (i3) {
            case 0:
                gam gamVar = (gam) obj;
                boolean z2 = view2 != null && view2.canScrollVertically(-1);
                view.getLocationOnScreen(iArr);
                z = iArr[1] + gamVar.a > gamVar.b;
                if (i2 > 0) {
                    if (z2 || !z) {
                        break;
                    }
                }
                break;
            default:
                ham hamVar = (ham) obj;
                boolean z3 = view2 != null && view2.canScrollVertically(-1);
                view.getLocationOnScreen(iArr);
                int i4 = iArr[1];
                int i5 = hamVar.a;
                z = i4 + i5 > hamVar.c;
                if (i2 > 0) {
                    if (z3 || ((!z && i5 != -1) || !((Boolean) hamVar.b.invoke()).booleanValue())) {
                        break;
                    }
                }
                break;
        }
        return Integer.valueOf(Math.min(i, j73.N(anchorBottomSheetBehavior.w)));
    }
}
