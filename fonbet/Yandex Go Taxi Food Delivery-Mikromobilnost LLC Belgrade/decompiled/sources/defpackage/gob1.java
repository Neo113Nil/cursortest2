package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.messaging.auth.AuthTheme;
import com.yandex.passport.api.PassportTheme;
import com.ybsdk.core.utils.ColorModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes15.dex */
public abstract class gob1 {
    public static final void a(View view, ColorModel colorModel) {
        if (colorModel == null) {
            view.setBackground(null);
        } else {
            view.setBackgroundColor(colorModel.get(view.getContext()));
        }
    }

    public static final void b(View view, ColorModel colorModel) {
        view.setBackgroundTintList(colorModel != null ? ColorStateList.valueOf(colorModel.get(view.getContext())) : null);
    }

    public static final void c(View view, List list, ColorModel colorModel, Float f) {
        int[] iArr;
        List list2 = list;
        int i = 0;
        if (list2 == null || list2.isEmpty()) {
            int[] iArr2 = new int[2];
            while (i < 2) {
                iArr2[i] = colorModel.get(view.getContext());
                i++;
            }
            iArr = iArr2;
        } else if (list.size() == 1) {
            iArr = new int[2];
            while (i < 2) {
                iArr[i] = ((ColorModel) a.P(list)).get(view.getContext());
                i++;
            }
        } else {
            List list3 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((ColorModel) it.next()).get(view.getContext())));
            }
            iArr = a.I0(arrayList);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        if (f != null) {
            gradientDrawable.setCornerRadius(f.floatValue());
        }
        view.setBackground(gradientDrawable);
    }

    public static final PassportTheme d(AuthTheme authTheme) {
        int i = awy0.a[authTheme.ordinal()];
        if (i == 1) {
            return PassportTheme.LIGHT;
        }
        if (i == 2) {
            return PassportTheme.DARK;
        }
        if (i == 3) {
            return PassportTheme.LIGHT_CUSTOM;
        }
        if (i == 4) {
            return PassportTheme.FOLLOW_SYSTEM;
        }
        w511.b();
        return null;
    }

    public static long e(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        float rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
