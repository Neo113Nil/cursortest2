package defpackage;

import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;

/* loaded from: classes12.dex */
public final class pis0 extends xo4 {
    public final View j;

    public pis0(View view, vo4 vo4Var, float f) {
        super(vo4Var, f, ddb1.e(view.getContext()));
        this.j = view;
    }

    @Override // defpackage.xo4
    public final View a(BalloonAnchor balloonAnchor) {
        return this.j;
    }
}
