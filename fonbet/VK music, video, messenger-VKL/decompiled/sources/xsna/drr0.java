package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem$ChangeBackground$Background;

/* compiled from: VhDivider.kt */
/* loaded from: classes7.dex */
public final class drr0 extends jqr0<CallSettingsItem.d> {
    public static final /* synthetic */ int n = 0;
    public final fuw0 l;
    public final View m;

    /* compiled from: VhDivider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallSettingsItem$ChangeBackground$Background.values().length];
            try {
                iArr[CallSettingsItem$ChangeBackground$Background.TOP_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallSettingsItem$ChangeBackground$Background.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallSettingsItem$ChangeBackground$Background.BOTTOM_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallSettingsItem$ChangeBackground$Background.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public drr0(LinearLayout linearLayout) {
        super(linearLayout);
        this.l = fuw0.a;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view = new View(this.itemView.getContext());
        linearLayout.addView(view);
        bwt0.m0(-1, iah0.a(1), view);
        float f = 16;
        bwt0.f0(view, iah0.a(f), 0, iah0.a(f), 0, 10);
        this.m = view;
    }
}
