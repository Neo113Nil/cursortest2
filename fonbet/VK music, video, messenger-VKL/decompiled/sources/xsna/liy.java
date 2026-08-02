package xsna;

import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vkontakte.android.R;

/* compiled from: KidsModeRestriction.kt */
/* loaded from: classes3.dex */
public final class liy {

    /* compiled from: KidsModeRestriction.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KidsModeRestrictionRenderer.Source.values().length];
            try {
                iArr[KidsModeRestrictionRenderer.Source.KIDS_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KidsModeRestrictionRenderer.Source.MUSIC_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KidsModeRestrictionRenderer.Source.ADULT_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(KidsModeRestrictionRenderer.Source source, gzs gzsVar, Integer num, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1443361634);
        if ((i & 6) == 0) {
            i2 = (M.o(source.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                num = Integer.valueOf(R.string.unavailable_kids_mode_screen_stay_kids_mode_button_title);
            } else {
                M.h();
            }
            int i3 = i2 & (-897);
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1443361634, i3, -1, "com.vk.musc.kidsmode.impl.presentation.EnabledKidsModeRestrictionContent (KidsModeRestriction.kt:44)");
            }
            rrv0.d(null, null, null, null, kai.c(600503965, new jiy(source, gzsVar, gzsVar2, num), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        Integer num2 = num;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kiy(source, gzsVar, num2, gzsVar2, i);
        }
    }
}
