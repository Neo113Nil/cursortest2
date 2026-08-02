package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.money.createtransfer.people.VkPayInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;

/* compiled from: VkPayCreateHandler.kt */
/* loaded from: classes3.dex */
public final class sbv0 {
    public gzs<s3q0> a = new qpt0(2);
    public final rbv0 b = new tb0() { // from class: xsna.rbv0
        @Override // xsna.tb0
        public final void onActivityResult(int i, int i2, Intent intent) {
            if (i == 1004 && i2 == -1) {
                sbv0.this.a.invoke();
            }
        }
    };

    /* compiled from: VkPayCreateHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkPayInfo.VkPayState.values().length];
            try {
                iArr[VkPayInfo.VkPayState.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkPayInfo.VkPayState.Anonymous.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(FragmentActivity fragmentActivity, VkPayInfo.VkPayState vkPayState, gzs gzsVar) {
        this.a = gzsVar;
        int i = a.$EnumSwitchMapping$0[vkPayState.ordinal()];
        if (i == 1) {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            superappUiRouterBridge.L(fragmentActivity);
        } else if (i == 2) {
            SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
            if (superappUiRouterBridge2 == null) {
                superappUiRouterBridge2 = null;
            }
            superappUiRouterBridge2.L(fragmentActivity);
        }
        aeg0 aeg0Var = fragmentActivity instanceof aeg0 ? (aeg0) fragmentActivity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this.b);
        }
    }
}
