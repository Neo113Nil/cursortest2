package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.location.Location;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.gms.maps.model.CameraPosition;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.Timetable;
import com.vk.location.common.LocationCommon;
import com.vk.permission.PermissionHelper;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import xsna.it80;

/* compiled from: AddressesUtils.kt */
/* loaded from: classes5.dex */
public final class nt0 {
    public static final int a = iah0.a(24);
    public static final SpannableString b = new SpannableString(" · ");

    public static final void a(u9h0 u9h0Var, oj00 oj00Var, fo9 fo9Var, zzs zzsVar, nrg nrgVar) {
        WeakReference weakReference = new WeakReference(oj00Var);
        sar0 h = oj00Var.h();
        CameraPosition cameraPosition = h.a;
        if (cameraPosition.e != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            oj00Var.g(fo9Var.a((fk9) zzsVar.invoke(h.getTarget(), Float.valueOf(cameraPosition.c), Float.valueOf(cameraPosition.d), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), 350, new mt0(nrgVar, weakReference, fo9Var, u9h0Var));
            return;
        }
        oj00 oj00Var2 = (oj00) weakReference.get();
        if (oj00Var2 != null) {
            oj00Var2.a(fo9Var.b(a, u9h0Var), nrgVar);
        }
    }

    public static final SpannableString b(int i, int i2, Context context) {
        SpannableString spannableString = new SpannableString(context.getString(i));
        c(context, spannableString, i2);
        return spannableString;
    }

    public static final void c(Context context, SpannableString spannableString, int i) {
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i)), 0, spannableString.length(), 33);
        Typeface a2 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        spannableString.setSpan(new pup0(a2), 0, spannableString.length(), 0);
    }

    public static final String d(Address address) {
        StringBuilder sb = new StringBuilder();
        sb.append(address.f);
        if (address.h != null) {
            sb.append(", ");
            sb.append(address.h.c);
        }
        return sb.toString();
    }

    public static final io.reactivex.rxjava3.core.q<it80<Location>> e(Context context, boolean z) {
        PermissionHelper.a.getClass();
        if (!PermissionHelper.b(context, PermissionHelper.h) || (z && !txz.b())) {
            it80.b.getClass();
            return io.reactivex.rxjava3.core.q.T(it80.a.a());
        }
        io.reactivex.rxjava3.internal.operators.observable.b0 F = new io.reactivex.rxjava3.internal.operators.observable.s0(new c3d(context, 1)).F(new ez(new azt(false), 26));
        LocationCommon.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.p1(F.d0(LocationCommon.b).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new e10(new lt0(0), 1)), new c7(new am0(1), 2));
    }

    public static final String f(int i) {
        return i == 1440 ? "00:00" : String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
    }

    public static final CharSequence g(int i, Timetable.WorkTime[] workTimeArr, Context context) {
        int i2 = (i + 1) % 7;
        if (workTimeArr[i2] != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) b(R.string.address_closed, R.color.vk_red, context));
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append((CharSequence) context.getString(R.string.address_will_open_tomorrov));
            return spannableStringBuilder;
        }
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = (i2 + 1) % 7;
            if (workTimeArr[i2] != null) {
                String str = context.getResources().getStringArray(R.array.address_will_be_opened)[i2];
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) b(R.string.address_closed, R.color.vk_red, context));
                spannableStringBuilder2.append((CharSequence) " · ");
                spannableStringBuilder2.append((CharSequence) str);
                return spannableStringBuilder2;
            }
        }
        return "";
    }
}
