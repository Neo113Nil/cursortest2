package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.superapp.browser.ui.dialogs.DialogResultState;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VKGameViewDelegate.kt */
/* loaded from: classes6.dex */
public final class ubr0 {
    public final fvv0 a;
    public final ggu0 b;
    public final mfu0 c;
    public final tfu0 d;
    public final tdr0 e;
    public final hbj0 f;
    public final egu0 g;
    public final zu0 h;
    public int i;

    /* compiled from: VKGameViewDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogResultState.values().length];
            try {
                iArr[DialogResultState.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogResultState.EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogResultState.OUTSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogResultState.SHOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DialogResultState.GAME_CLICKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ubr0(fvv0 fvv0Var, ggu0 ggu0Var, mfu0 mfu0Var, tfu0 tfu0Var, tdr0 tdr0Var, hbj0 hbj0Var, egu0 egu0Var, zu0 zu0Var) {
        this.a = fvv0Var;
        this.b = ggu0Var;
        this.c = mfu0Var;
        this.d = tfu0Var;
        this.e = tdr0Var;
        this.f = hbj0Var;
        this.g = egu0Var;
        this.h = zu0Var;
    }

    public final void a(Bundle bundle, FragmentManager fragmentManager, gzs<Integer> gzsVar, gzs<s3q0> gzsVar2) {
        Object obj;
        String string = bundle.getString("DIALOG_RESULT_STATE_KEY");
        if (string != null) {
            DialogResultState.Companion.getClass();
            Iterator<E> it = DialogResultState.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((DialogResultState) obj).name(), string)) {
                        break;
                    }
                }
            }
            DialogResultState dialogResultState = (DialogResultState) obj;
            if (dialogResultState == null) {
                dialogResultState = DialogResultState.OUTSIDE;
            }
            int i = a.$EnumSwitchMapping$0[dialogResultState.ordinal()];
            fvv0 fvv0Var = this.a;
            if (i == 1) {
                fragmentManager.f("GAMES_CONFIRM_EXIT_DIALOG_KEY");
                VkBridgeAnalytics E = fvv0Var.E();
                if (E != null) {
                    E.m(VkBridgeAnalytics.ExitGameAlertEvent.STAY_IN_GAME, gzsVar.invoke());
                    return;
                }
                return;
            }
            if (i == 2) {
                this.i = 0;
                fragmentManager.f("GAMES_CONFIRM_EXIT_DIALOG_KEY");
                VkBridgeAnalytics E2 = fvv0Var.E();
                if (E2 != null) {
                    E2.m(VkBridgeAnalytics.ExitGameAlertEvent.EXIT_FROM_GAME, gzsVar.invoke());
                }
                gzsVar2.invoke();
                return;
            }
            if (i == 3) {
                fragmentManager.f("GAMES_CONFIRM_EXIT_DIALOG_KEY");
                VkBridgeAnalytics E3 = fvv0Var.E();
                if (E3 != null) {
                    E3.m(VkBridgeAnalytics.ExitGameAlertEvent.STAY_IN_GAME, gzsVar.invoke());
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                VkBridgeAnalytics E4 = fvv0Var.E();
                if (E4 != null) {
                    E4.m(VkBridgeAnalytics.ExitGameAlertEvent.SHOW_ALERT, gzsVar.invoke());
                }
            }
        }
    }

    public final void b(Bundle bundle, gzs<Integer> gzsVar) {
        VkBridgeAnalytics E;
        VkBridgeAnalytics E2;
        String[] stringArray = bundle.getStringArray("DIALOG_RESULT_SHOWN_RECOMMENDED_GAMES");
        fvv0 fvv0Var = this.a;
        if (stringArray != null && stringArray.length != 0 && (E2 = fvv0Var.E()) != null) {
            E2.h(VkBridgeAnalytics.ExitGameAlertEvent.SHOW_GAMES_RECOMMENDATIONS, gzsVar.invoke(), stringArray, Integer.valueOf(this.i));
        }
        String string = bundle.getString("DIALOG_RESULT_APP_VIEW");
        if (string == null || !myc0.f(string) || (E = fvv0Var.E()) == null) {
            return;
        }
        E.h(VkBridgeAnalytics.ExitGameAlertEvent.RECOMMENDATION_APP_VIEW, gzsVar.invoke(), new String[]{string}, Integer.valueOf(this.i));
    }
}
