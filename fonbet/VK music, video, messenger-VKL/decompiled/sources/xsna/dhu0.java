package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkButtonSkeleton.kt */
/* loaded from: classes17.dex */
public final class dhu0 {

    /* compiled from: VkButtonSkeleton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyle.Outline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonStyle.Tertiary.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonStyle.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ButtonSize buttonSize, ButtonStyle buttonStyle, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1732819767);
        int i2 = i | 224256;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1732819767, i2, -1, "com.vk.core.compose.component.button.VkButtonSkeleton (VkButtonSkeleton.kt:80)");
            }
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            q630Var2 = q630Var;
            q630 a2 = qri.a(q630Var2, a5x.a, new tpd(3, buttonSize, buttonStyle));
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new qc00(20);
                M.R(x);
            }
            bhu0.d((gzs) x, buttonStyle, buttonAppearance, a2, buttonSize, null, null, null, false, null, M, 114844086, 3616);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new an7(i, 11, buttonSize, buttonStyle, q630Var2);
        }
    }

    public static final void b(final ButtonSize buttonSize, final ButtonStyle buttonStyle, q630 q630Var, final r5j0 r5j0Var, final boolean z, final lg90 lg90Var, final String str, final Integer num, final lg90 lg90Var2, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-957285550);
        int i2 = i | (M.o(buttonSize.ordinal()) ? 4 : 2) | (M.o(buttonStyle.ordinal()) ? 32 : 16) | (M.J(r5j0Var) ? 2048 : 1024) | (M.l(z) ? 16384 : 8192) | (M.y(lg90Var) ? 131072 : 65536) | 1572864 | (M.J(str) ? 8388608 : 4194304) | (M.J(num) ? 67108864 : 33554432) | (M.y(lg90Var2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (M.t(i2 & 1, (306783379 & i2) != 306783378)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-957285550, i2, 6, "com.vk.core.compose.component.button.VkButtonSkeleton (VkButtonSkeleton.kt:43)");
            }
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            q630Var2 = q630Var;
            q630 c = c(q630Var2, buttonSize, buttonStyle, r5j0Var, hr80.z().c(buttonSize, buttonStyle, false, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 4).getValue());
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new pm60(17);
                M.R(x);
            }
            int i3 = i2 << 3;
            int i4 = (i3 & 112) | 3078 | (i3 & 896) | ((i2 << 9) & 29360128) | 1073741824 | ((i2 << 12) & 1879048192);
            int i5 = i2 >> 15;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, c, null, z, false, lg90Var, null, null, str, num, lg90Var2, null, null, false, null, null, null, M, i4, (i5 & 57344) | (i5 & 8176) | 32768 | 1572864, 0, 4097376);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(buttonStyle, q630Var2, r5j0Var, z, lg90Var, str, num, lg90Var2, i) { // from class: xsna.chu0
                public final /* synthetic */ ButtonStyle c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ r5j0 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ lg90 g;
                public final /* synthetic */ String h;
                public final /* synthetic */ Integer i;
                public final /* synthetic */ lg90 j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1074004353);
                    dhu0.b(ButtonSize.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final q630 c(q630 q630Var, ButtonSize buttonSize, ButtonStyle buttonStyle, r5j0 r5j0Var, s890 s890Var) {
        int i = a.$EnumSwitchMapping$0[buttonStyle.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return bu00.e(q630Var, new z7t0(r5j0Var, 2));
        }
        if (i == 4 || i == 5) {
            return bu00.e(q630Var, new fgm0(4, s890Var, buttonSize));
        }
        throw new NoWhenBranchMatchedException();
    }
}
