package xsna;

import android.content.Context;
import com.vk.dto.common.Direction;
import com.vk.onboarding.api.di.VkOnboardingComponent;

/* compiled from: AdapterEntryListProcessor.kt */
/* loaded from: classes16.dex */
public final class nj0 {
    public final tk30 a;

    /* compiled from: AdapterEntryListProcessor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nj0(Context context, VkOnboardingComponent vkOnboardingComponent, v1o v1oVar, w530 w530Var) {
        Context context2 = e43.a;
        tk30 tk30Var = new tk30(new com.vk.movika.sdk.android.defaultplayer.layout.a(context2 == null ? null : context2), null, new tz30(context.getApplicationContext()), new com.vk.im.ui.formatters.a(context.getApplicationContext()), null, v1oVar, vkOnboardingComponent, 806);
        tk30Var.n(w530Var);
        this.a = tk30Var;
    }
}
