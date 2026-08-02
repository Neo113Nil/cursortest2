package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: BookingRecordCell.kt */
/* loaded from: classes18.dex */
public final class mt7 {

    /* compiled from: BookingRecordCell.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingButton.Action.values().length];
            try {
                iArr[BookingButton.Action.Reschedule.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingButton.Action.Cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingButton.Action.Other.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(BookingButton bookingButton, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        int i3;
        BookingButton.Action action = bookingButton.a;
        androidx.compose.runtime.a M = aVar.M(-1675274329);
        int i4 = i | (M.J(bookingButton) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1675274329, i4, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingButtonItem (BookingRecordCell.kt:226)");
            }
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            int i5 = i4 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-34591902, i5, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.<get-appearance> (BookingRecordCell.kt:240)");
            }
            ButtonAppearance buttonAppearance = BookingButton.Action.Cancel == action ? ButtonAppearance.Negative : ButtonAppearance.Accent;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1986642085, i5, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.<get-actionText> (BookingRecordCell.kt:245)");
            }
            int i6 = a.$EnumSwitchMapping$0[action.ordinal()];
            if (i6 == 1) {
                i2 = -2097399389;
                i3 = R.string.booking_record_reschedule_button;
            } else if (i6 == 2) {
                i2 = -2097396129;
                i3 = R.string.booking_record_cancel_button;
            } else {
                if (i6 != 3) {
                    throw alb0.c(-2097401172, M);
                }
                i2 = -2097393025;
                i3 = R.string.booking_record_repeat_button;
            }
            String a2 = zq.a(M, i2, i3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z = ((i4 & 896) == 256) | (i5 == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.logic.processor.actions.e(3, izsVar, bookingButton);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, q630Var, null, false, false, null, null, null, a2, null, null, null, null, false, null, null, null, aVar2, ((i4 << 9) & 57344) | Tensorflow.FRAME_WIDTH, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new er3(bookingButton, q630Var, izsVar, i, 2);
        }
    }

    public static final void b(final av7 av7Var, final String str, q630 q630Var, final izs<? super BookingButton.Action, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        androidx.compose.runtime.a M = aVar.M(7771454);
        int i3 = (M.J(av7Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        int i5 = i3 | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(7771454, i5, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingRecordCell (BookingRecordCell.kt:64)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new kt7(av7Var, str, izsVar);
                M.R(x);
            }
            kt7 kt7Var = (kt7) x;
            ((zak0) kt7Var.a).setValue(av7Var);
            ((zak0) kt7Var.b).setValue(str);
            ((zak0) kt7Var.c).setValue(izsVar);
            kt7Var.a(q630Var, M, (i5 >> 6) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lt7
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mt7.b(av7.this, str, q630Var2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
