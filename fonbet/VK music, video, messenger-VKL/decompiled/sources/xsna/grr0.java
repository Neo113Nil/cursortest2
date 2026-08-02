package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;

/* compiled from: VhFillSpace.kt */
/* loaded from: classes7.dex */
public final class grr0 extends jqr0<CallSettingsItem.FillSpace> {
    public static final /* synthetic */ int n = 0;
    public final View l;
    public final fuw0 m;

    /* compiled from: VhFillSpace.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallSettingsItem.FillSpace.Height.values().length];
            try {
                iArr[CallSettingsItem.FillSpace.Height.DP_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public grr0(View view) {
        super(view);
        this.l = view;
        this.m = fuw0.a;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}
