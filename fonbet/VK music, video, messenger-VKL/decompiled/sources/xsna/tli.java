package xsna;

import com.vkontakte.android.R;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class tli {
    public static final jai a = new jai(1425358052, b.b, false);
    public static final jai b = new jai(-1179219109, a.b, false);

    /* compiled from: TimePicker.kt */
    public static final class a implements yzs<spg0, androidx.compose.runtime.a, Integer, s3q0> {
        public static final a b = new a();

        @Override // xsna.yzs
        public final s3q0 invoke(spg0 spg0Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1179219109, intValue, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda$-1179219109.<anonymous> (TimePicker.kt:1346)");
                }
                cjo0.c(e7b0.b(R.string.m3c_time_picker_pm, aVar2), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262142);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: TimePicker.kt */
    public static final class b implements yzs<spg0, androidx.compose.runtime.a, Integer, s3q0> {
        public static final b b = new b();

        @Override // xsna.yzs
        public final s3q0 invoke(spg0 spg0Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1425358052, intValue, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda$1425358052.<anonymous> (TimePicker.kt:1328)");
                }
                cjo0.c(e7b0.b(R.string.m3c_time_picker_am, aVar2), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262142);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }
}
