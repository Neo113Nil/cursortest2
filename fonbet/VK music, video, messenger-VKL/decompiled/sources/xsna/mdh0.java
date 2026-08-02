package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;

/* compiled from: ScreencastAccessibilityDelegate.kt */
/* loaded from: classes7.dex */
public final class mdh0 {
    public final AccessibilityEvents a;
    public io.reactivex.rxjava3.disposables.c b = EmptyDisposable.INSTANCE;
    public final ArrayList<CallMemberId> c = new ArrayList<>();

    public mdh0(AccessibilityEvents accessibilityEvents) {
        this.a = accessibilityEvents;
    }

    public final void a() {
        com.vk.voip.ui.c.b.getClass();
        this.b = new io.reactivex.rxjava3.internal.operators.observable.y(com.vk.voip.ui.c.G0(true).U(new oe40(new j6e0(4), 8)), io.reactivex.rxjava3.internal.functions.a.a, new i4f0(new qg3(this), 2)).subscribe(new zyu(new w110(this, 23), 23));
    }
}
