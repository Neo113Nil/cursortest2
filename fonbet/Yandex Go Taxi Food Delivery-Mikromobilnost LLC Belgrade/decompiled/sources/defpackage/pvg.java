package defpackage;

import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelGeneralInfoView;

/* loaded from: classes2.dex */
public final class pvg implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DebugPanelGeneralInfoView b;
    public final /* synthetic */ int c;

    public /* synthetic */ pvg(DebugPanelGeneralInfoView debugPanelGeneralInfoView, int i, int i2) {
        this.a = i2;
        this.b = debugPanelGeneralInfoView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        DebugPanelGeneralInfoView debugPanelGeneralInfoView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = debugPanelGeneralInfoView.findViewById(i2);
                    if (findViewById != null) {
                        return (RecyclerView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = debugPanelGeneralInfoView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (ImageButton) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
