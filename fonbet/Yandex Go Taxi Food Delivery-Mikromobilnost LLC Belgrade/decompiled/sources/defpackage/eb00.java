package defpackage;

import com.yandex.go.flex.main_screen.shared_data.MainScreenResolvedPosition;
import java.util.List;

/* loaded from: classes.dex */
public final class eb00 implements i3m {
    public final atx a;

    public eb00(atx atxVar) {
        this.a = atxVar;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, xzl xzlVar, List list) {
        MainScreenResolvedPosition mainScreenResolvedPosition;
        if (xzlVar.c == q5z.d || (mainScreenResolvedPosition = (MainScreenResolvedPosition) xzlVar.a.c.b(qoi0.a(MainScreenResolvedPosition.class))) == null) {
            return;
        }
        this.a.a(new zzs(mainScreenResolvedPosition.a, mainScreenResolvedPosition.b, 0, null, Long.valueOf(mainScreenResolvedPosition.c), 12));
    }
}
