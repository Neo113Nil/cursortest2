package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil3.ImageDrawable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.common.base.Optional;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.evaluable.b;
import com.yandex.div.internal.drawable.RadialGradientDrawable$Radius$Relative$Type;
import com.yandex.div2.DivRadialGradientRelativeRadius$Value;
import com.yandex.div2.DivSizeUnit;
import com.yandex.plus.pay.inapp.google.common.internal.operation.PlusPayGoogleBillingResponse$Code;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.widget.dialog.BaseDialog$runHideAnimation$1;

/* loaded from: classes.dex */
public abstract class cma1 {
    public static volatile Optional a;
    public static final iwi b = new iwi(1.0f, 1.0f);
    public static final String[] c = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] d = {"ad_impression"};
    public static final String[] e = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] f = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static String[] A(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + w0);
        return createStringArray;
    }

    public static void A0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + w0(parcel, i));
    }

    public static ArrayList B(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + w0);
        return createStringArrayList;
    }

    public static int B0(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Object[] C(Parcel parcel, int i, Parcelable.Creator creator) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w0);
        return createTypedArray;
    }

    public static final hcd0 C0(ns5 ns5Var) {
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code;
        int i = ns5Var.a;
        if (i != 12) {
            switch (i) {
                case -1:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.SERVICE_DISCONNECTED;
                    break;
                case 0:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.OK;
                    break;
                case 1:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.USER_CANCELED;
                    break;
                case 2:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.SERVICE_UNAVAILABLE;
                    break;
                case 3:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.BILLING_UNAVAILABLE;
                    break;
                case 4:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.ITEM_UNAVAILABLE;
                    break;
                case 5:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.DEVELOPER_ERROR;
                    break;
                case 6:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.ERROR;
                    break;
                case 7:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.ITEM_ALREADY_OWNED;
                    break;
                default:
                    plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.UNKNOWN;
                    break;
            }
        } else {
            plusPayGoogleBillingResponse$Code = PlusPayGoogleBillingResponse$Code.NETWORK_ERROR;
        }
        return new hcd0(plusPayGoogleBillingResponse$Code, ns5Var.b);
    }

    public static ArrayList D(Parcel parcel, int i, Parcelable.Creator creator) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + w0);
        return createTypedArrayList;
    }

    public static final kic D0(vyk vykVar, rvo rvoVar) {
        ArrayList arrayList;
        List list = vykVar.b;
        if (list != null) {
            List<uyk> list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            for (uyk uykVar : list2) {
                arrayList.add(new Pair(uykVar.a.a(rvoVar), Float.valueOf((float) ((Number) uykVar.b.a(rvoVar)).doubleValue())));
            }
        } else {
            arrayList = null;
        }
        pvo pvoVar = vykVar.c;
        return l(arrayList, pvoVar != null ? pvoVar.a(rvoVar) : null);
    }

    public static void E(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(unr0.m(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static final kic E0(k5l k5lVar, rvo rvoVar) {
        ArrayList arrayList;
        List list = k5lVar.c;
        if (list != null) {
            List<j5l> list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            for (j5l j5lVar : list2) {
                arrayList.add(new Pair(j5lVar.a.a(rvoVar), Float.valueOf((float) ((Number) j5lVar.b.a(rvoVar)).doubleValue())));
            }
        } else {
            arrayList = null;
        }
        pvo pvoVar = k5lVar.d;
        return l(arrayList, pvoVar != null ? pvoVar.a(rvoVar) : null);
    }

    public static final boolean F(n5l n5lVar, n5l n5lVar2) {
        if (n5lVar == null) {
            return n5lVar2 == null;
        }
        if (n5lVar instanceof l5l) {
            if (n5lVar2 instanceof l5l) {
                l5l l5lVar = (l5l) n5lVar;
                l5l l5lVar2 = (l5l) n5lVar2;
                if (qje.k(l5lVar.c().a, l5lVar2.c().a) && qje.k(l5lVar.c().b, l5lVar2.c().b)) {
                    return true;
                }
            }
        } else {
            if (!(n5lVar instanceof m5l)) {
                w511.b();
                return false;
            }
            if ((n5lVar2 instanceof m5l) && qje.k(((m5l) n5lVar).c().a, ((m5l) n5lVar2).c().a)) {
                return true;
            }
        }
        return false;
    }

    public static final q5i0 F0(n5l n5lVar, DisplayMetrics displayMetrics, rvo rvoVar) {
        if (n5lVar instanceof l5l) {
            l5l l5lVar = (l5l) n5lVar;
            return new o5i0(a.J(((Number) l5lVar.c().b.a(rvoVar)).longValue(), (DivSizeUnit) l5lVar.c().a.a(rvoVar), displayMetrics));
        }
        if (n5lVar instanceof m5l) {
            return new p5i0((float) ((Number) ((m5l) n5lVar).c().a.a(rvoVar)).doubleValue());
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r0 == r12.longValue()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r14.equals(-1L) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Number G(cmz0 cmz0Var, Object obj, Object obj2) {
        double doubleValue;
        long longValue;
        boolean z = obj instanceof Long;
        if (!z || !(obj2 instanceof Long)) {
            if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                b.b(cmz0Var, obj, obj2);
                throw null;
            }
            if (cmz0Var instanceof bmz0) {
                doubleValue = ((Number) obj2).doubleValue() * ((Number) obj).doubleValue();
            } else if (cmz0Var instanceof zlz0) {
                Number number = (Number) obj2;
                if (number.doubleValue() == 0.0d) {
                    b.d(obj + " / " + obj2, "Division by zero is not supported.");
                    throw null;
                }
                doubleValue = ((Number) obj).doubleValue() / number.doubleValue();
            } else {
                if (!(cmz0Var instanceof amz0)) {
                    w511.b();
                    return null;
                }
                Number number2 = (Number) obj2;
                if (number2.doubleValue() == 0.0d) {
                    b.d(obj + " % " + obj2, "Division by zero is not supported.");
                    throw null;
                }
                doubleValue = ((Number) obj).doubleValue() % number2.doubleValue();
            }
            return Double.valueOf(doubleValue);
        }
        if (cmz0Var instanceof bmz0) {
            Number number3 = (Number) obj;
            Number number4 = (Number) obj2;
            long longValue2 = number4.longValue() * number3.longValue();
            if (((Math.abs(number3.longValue()) | Math.abs(number4.longValue())) >>> 31) != 0) {
                if (!obj2.equals(0L)) {
                    long longValue3 = longValue2 / number4.longValue();
                    if (z) {
                    }
                    yhl.a(obj, " * ", obj2);
                    return null;
                }
                if (obj.equals(Long.MIN_VALUE)) {
                }
            }
            return Long.valueOf(longValue2);
        }
        if (cmz0Var instanceof zlz0) {
            if (obj2.equals(0L)) {
                b.d(obj + " / " + obj2, "Division by zero is not supported.");
                throw null;
            }
            longValue = ((Number) obj).longValue() / ((Number) obj2).longValue();
        } else {
            if (!(cmz0Var instanceof amz0)) {
                w511.b();
                return null;
            }
            if (obj2.equals(0L)) {
                b.d(obj + " % " + obj2, "Division by zero is not supported.");
                throw null;
            }
            longValue = ((Number) obj).longValue() % ((Number) obj2).longValue();
        }
        return Long.valueOf(longValue);
    }

    public static final u5i0 G0(h6l h6lVar, DisplayMetrics displayMetrics, rvo rvoVar) {
        RadialGradientDrawable$Radius$Relative$Type radialGradientDrawable$Radius$Relative$Type;
        if (h6lVar instanceof f6l) {
            return new s5i0(a.K(((f6l) h6lVar).a(), displayMetrics, rvoVar));
        }
        if (!(h6lVar instanceof g6l)) {
            w511.b();
            return null;
        }
        int i = fsk.a[((DivRadialGradientRelativeRadius$Value) ((g6l) h6lVar).a().a.a(rvoVar)).ordinal()];
        if (i == 1) {
            radialGradientDrawable$Radius$Relative$Type = RadialGradientDrawable$Radius$Relative$Type.FARTHEST_CORNER;
        } else if (i == 2) {
            radialGradientDrawable$Radius$Relative$Type = RadialGradientDrawable$Radius$Relative$Type.NEAREST_CORNER;
        } else if (i == 3) {
            radialGradientDrawable$Radius$Relative$Type = RadialGradientDrawable$Radius$Relative$Type.FARTHEST_SIDE;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            radialGradientDrawable$Radius$Relative$Type = RadialGradientDrawable$Radius$Relative$Type.NEAREST_SIDE;
        }
        return new t5i0(radialGradientDrawable$Radius$Relative$Type);
    }

    public static Object H(jmz0 jmz0Var, Object obj, Object obj2) {
        double doubleValue;
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (!(jmz0Var instanceof imz0)) {
                b.b(jmz0Var, obj, obj2);
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(obj2);
            return sb.toString();
        }
        if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
            if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                b.b(jmz0Var, obj, obj2);
                throw null;
            }
            if (jmz0Var instanceof imz0) {
                doubleValue = ((Number) obj2).doubleValue() + ((Number) obj).doubleValue();
            } else {
                if (!(jmz0Var instanceof hmz0)) {
                    w511.b();
                    return null;
                }
                doubleValue = ((Number) obj).doubleValue() - ((Number) obj2).doubleValue();
            }
            return Double.valueOf(doubleValue);
        }
        if (jmz0Var instanceof imz0) {
            Number number = (Number) obj;
            Number number2 = (Number) obj2;
            long longValue = number2.longValue() + number.longValue();
            if (((number.longValue() ^ longValue) & (number2.longValue() ^ longValue)) >= 0) {
                return Long.valueOf(longValue);
            }
            yhl.a(obj, " + ", obj2);
            return null;
        }
        if (!(jmz0Var instanceof hmz0)) {
            w511.b();
            return null;
        }
        Number number3 = (Number) obj;
        Number number4 = (Number) obj2;
        long longValue2 = number3.longValue() - number4.longValue();
        if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ longValue2)) >= 0) {
            return Long.valueOf(longValue2);
        }
        yhl.a(obj, " - ", obj2);
        return null;
    }

    public static final String H0(int i) {
        rza.a(16);
        return y5e.P(16, i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static final void I(View view) {
        b(1.0f, view);
    }

    public static final int I0(String str) {
        tq11 J0 = J0(10, str);
        if (J0 != null) {
            return J0.a;
        }
        bvu0.k(str);
        throw null;
    }

    public static final ViewPropertyAnimator J(View view) {
        view.animate().cancel();
        view.setVisibility(0);
        return b(1.0f, view);
    }

    public static final tq11 J0(int i, String str) {
        int i2;
        rza.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (charAt < '0') {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int i4 = 119304647;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i3, i4) > 0) {
                if (i4 != 119304647) {
                    return null;
                }
                i4 = Integer.divideUnsigned(-1, i);
                if (Integer.compareUnsigned(i3, i4) > 0) {
                    return null;
                }
            }
            int i5 = i3 * i;
            int i6 = digit + i5;
            if (Integer.compareUnsigned(i6, i5) < 0) {
                return null;
            }
            i2++;
            i3 = i6;
        }
        return new tq11(i3);
    }

    public static final ViewPropertyAnimator K(View view) {
        view.setEnabled(true);
        return b(1.0f, view);
    }

    public static final yq11 K0(int i, String str) {
        rza.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (charAt < '0') {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j = i;
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, j3) > 0) {
                if (j3 != 512409557603043100L) {
                    return null;
                }
                j3 = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j2, j3) > 0) {
                    return null;
                }
            }
            long j4 = j2 * j;
            long j5 = (digit & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + j4;
            if (Long.compareUnsigned(j5, j4) < 0) {
                return null;
            }
            i2++;
            j2 = j5;
        }
        return new yq11(j2);
    }

    public static final ViewPropertyAnimator L(View view) {
        return b(0.0f, view).withEndAction(new ce0(view, 1));
    }

    public static final Object L0(kotlinx.serialization.json.b bVar) {
        if (bVar instanceof c) {
            return M0((c) bVar);
        }
        if (bVar instanceof kotlinx.serialization.json.a) {
            kotlinx.serialization.json.a aVar = (kotlinx.serialization.json.a) bVar;
            ArrayList arrayList = new ArrayList(tcc.n(aVar, 10));
            Iterator it = aVar.a.iterator();
            while (it.hasNext()) {
                Object L0 = L0((kotlinx.serialization.json.b) it.next());
                if (L0 == null) {
                    ny61.g("Null array elements is forbidden");
                    return null;
                }
                arrayList.add(L0);
            }
            return arrayList;
        }
        if (!(bVar instanceof d)) {
            w511.b();
            return null;
        }
        d dVar = (d) bVar;
        if (dVar instanceof JsonNull) {
            return null;
        }
        if (dVar.b()) {
            return dVar.a();
        }
        Object f2 = qcx.f(dVar);
        if (f2 != null || (f2 = qcx.o(dVar)) != null) {
            return f2;
        }
        Double i = qcx.i(dVar);
        if (i != null) {
            return i;
        }
        kbs.f(dVar, "Unsupported json primitive ");
        return null;
    }

    public static final ViewPropertyAnimator M(View view) {
        return b(0.0f, view).withEndAction(new xd2(view, 0));
    }

    public static final LinkedHashMap M0(c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : cVar.a.entrySet()) {
            String str = (String) entry.getKey();
            Object L0 = L0((kotlinx.serialization.json.b) entry.getValue());
            if (L0 != null) {
                linkedHashMap.put(str, L0);
            }
        }
        return linkedHashMap;
    }

    public static final ViewPropertyAnimator N(View view) {
        view.setEnabled(false);
        return b(0.0f, view);
    }

    public static View O(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static fz2 P(View view) {
        Object tag = view.getTag(ndh0.appear_animation_helper);
        fz2 fz2Var = tag instanceof fz2 ? (fz2) tag : null;
        if (fz2Var != null) {
            return fz2Var;
        }
        fz2 fz2Var2 = new fz2(view);
        view.setTag(ndh0.appear_animation_helper, fz2Var2);
        return fz2Var2;
    }

    public static int P0(Parcel parcel) {
        int readInt = parcel.readInt();
        int w0 = w0(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = w0 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static final long Q(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final kotlinx.serialization.json.b Q0(Object obj) {
        if (obj instanceof Map) {
            return R0((Map) obj);
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            ArrayList arrayList = new ArrayList(tcc.n(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Q0(it.next()));
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            if (obj instanceof String) {
                return qcx.c((String) obj);
            }
            if (obj instanceof Boolean) {
                return qcx.a((Boolean) obj);
            }
            vg10.g(obj.getClass(), "Unsupported for wrapping type ");
            return null;
        }
        return qcx.b((Number) obj);
    }

    public static agc R(fid fidVar) {
        return (agc) ((bts) fidVar).m(dgc.a);
    }

    public static final c R0(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Q0(entry.getValue()));
        }
        return new c(linkedHashMap);
    }

    public static final int S(fid fidVar) {
        fidVar.getClass();
        return Long.hashCode(((bts) fidVar).T);
    }

    public static void S0(int i, Parcel parcel, int i2) {
        int w0 = w0(parcel, i);
        if (w0 == i2) {
            return;
        }
        String hexString = Integer.toHexString(w0);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(w0).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(w0);
        throw new SafeParcelReader$ParseException(unr0.r(sb, " (0x", hexString, Extension.C_BRAKE), parcel);
    }

    public static void T0(int i, Parcel parcel, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new SafeParcelReader$ParseException(unr0.r(sb, " (0x", hexString, Extension.C_BRAKE), parcel);
    }

    public static final String U(bfa0 bfa0Var) {
        if (jl40.l(bfa0Var, zea0.a)) {
            return null;
        }
        if (bfa0Var instanceof afa0) {
            return ((afa0) bfa0Var).a();
        }
        w511.b();
        return null;
    }

    public static final j18 V(Continuation continuation) {
        if (!(continuation instanceof pyj)) {
            return new j18(1, continuation);
        }
        j18 k = ((pyj) continuation).k();
        if (k != null) {
            if (!k.D()) {
                k = null;
            }
            if (k != null) {
                return k;
            }
        }
        return new j18(2, continuation);
    }

    public static bq11 X(fid fidVar) {
        return (bq11) ((bts) fidVar).m(eq11.a);
    }

    public static final long a(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void a0(View view, Animator.AnimatorListener animatorListener) {
        P(view).e(animatorListener);
    }

    public static final ViewPropertyAnimator b(float f2, View view) {
        view.animate().cancel();
        return view.animate().alpha(f2).setDuration(200L);
    }

    public static final void b0() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final ViewPropertyAnimator c(View view) {
        ViewPropertyAnimator animate = view.animate();
        animate.setDuration(300L);
        animate.setStartDelay(0L);
        animate.setListener(null);
        animate.setInterpolator(new LinearInterpolator());
        return animate;
    }

    public static final boolean c0(n5l n5lVar) {
        if (n5lVar == null) {
            return true;
        }
        if (n5lVar instanceof l5l) {
            l5l l5lVar = (l5l) n5lVar;
            return (l5lVar.c().a instanceof kvo) && (l5lVar.c().b instanceof kvo);
        }
        if (n5lVar instanceof m5l) {
            return ((m5l) n5lVar).c().a instanceof kvo;
        }
        w511.b();
        return false;
    }

    public static final void d(View view, int i, int i2, long j, long j2, BaseDialog$runHideAnimation$1 baseDialog$runHideAnimation$1) {
        e(view.getContext().getColor(i), view.getContext().getColor(i2), j, j2, new vd2(0, view), baseDialog$runHideAnimation$1);
    }

    public static final boolean d0(List list) {
        if (list != null) {
            List<uyk> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (uyk uykVar : list2) {
                if (uykVar != null && (!(uykVar.a instanceof kvo) || !(uykVar.b instanceof kvo))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void e(int i, int i2, long j, long j2, Consumer consumer, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        ofObject.setStartDelay(j2);
        ofObject.addUpdateListener(new yd2(0, consumer));
        if (animatorListener != null) {
            ofObject.addListener(animatorListener);
        }
        ofObject.start();
    }

    public static final boolean e0(List list) {
        if (list != null) {
            List<j5l> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (j5l j5lVar : list2) {
                if (j5lVar != null && (!(j5lVar.a instanceof kvo) || !(j5lVar.b instanceof kvo))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final ValueAnimator f(int i, int i2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(animatorUpdateListener);
        return ofInt;
    }

    public static final boolean f0(fid fidVar) {
        return (((Configuration) ((bts) fidVar).m(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
    }

    public static final ViewPropertyAnimator g(float f2, View view) {
        return view.animate().translationX(f2).setDuration(200L);
    }

    public static final ViewPropertyAnimator h(float f2, View view) {
        return view.animate().translationY(f2).setDuration(200L);
    }

    public static xvf0 i(yvf0 yvf0Var) {
        yvf0Var.getClass();
        return yvf0Var instanceof xvf0 ? (xvf0) yvf0Var : new ywf(20, yvf0Var);
    }

    public static final Drawable j(q7v q7vVar, Resources resources) {
        return q7vVar instanceof cbm ? ((cbm) q7vVar).b() : q7vVar instanceof w06 ? new BitmapDrawable(resources, ((w06) q7vVar).a) : new ImageDrawable(q7vVar);
    }

    public static f530 j0(f530 f530Var, pa90 pa90Var, jt1 jt1Var, nhe nheVar, float f2, wec wecVar, int i) {
        if ((i & 4) != 0) {
            jt1Var = x4c.y;
        }
        jt1 jt1Var2 = jt1Var;
        if ((i & 16) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i & 32) != 0) {
            wecVar = null;
        }
        return f530Var.k(new qa90(pa90Var, jt1Var2, nheVar, f3, wecVar));
    }

    public static final q7v k(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new w06(((BitmapDrawable) drawable).getBitmap()) : new cbm(drawable);
    }

    public static boolean k0(Parcel parcel, int i) {
        S0(i, parcel, 4);
        return parcel.readInt() != 0;
    }

    public static final kic l(ArrayList arrayList, List list) {
        if (arrayList == null) {
            return list != null ? new kic(kotlin.collections.a.I0(list), null) : kic.c;
        }
        List x0 = kotlin.collections.a.x0(arrayList, new gsk());
        int size = x0.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Number) ((Pair) x0.get(i)).c()).intValue();
        }
        int size2 = x0.size();
        float[] fArr = new float[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            fArr[i2] = ((Number) ((Pair) x0.get(i2)).f()).floatValue();
        }
        return new kic(iArr, fArr);
    }

    public static byte l0(Parcel parcel, int i) {
        S0(i, parcel, 4);
        return (byte) parcel.readInt();
    }

    public static final int m(float f2, int i) {
        return Color.argb((int) (Math.max(0.0f, f2) * Color.alpha(i)), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static double m0(Parcel parcel, int i) {
        S0(i, parcel, 8);
        return parcel.readDouble();
    }

    public static final void n(int i) {
        if (i >= 1) {
            return;
        }
        w511.f(oyr.i(i, "Expected positive parallelism level, but got "));
    }

    public static Double n0(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        if (w0 == 0) {
            return null;
        }
        T0(w0, parcel, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float o0(Parcel parcel, int i) {
        S0(i, parcel, 4);
        return parcel.readFloat();
    }

    public static final boolean p(vyk vykVar, vyk vykVar2) {
        List list;
        List list2 = vykVar.b;
        List list3 = vykVar2.b;
        List list4 = list2;
        if ((list4 == null || list4.isEmpty()) && ((list = list3) == null || list.isEmpty())) {
            return qje.j(vykVar.c, vykVar2.c);
        }
        EmptyList emptyList = EmptyList.a;
        if (list2 == null) {
            list2 = emptyList;
        }
        if (list3 == null) {
            list3 = emptyList;
        }
        if (list2.size() == list3.size()) {
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                uyk uykVar = (uyk) list3.get(i);
                uyk uykVar2 = (uyk) obj;
                if (uykVar2 != null || uykVar != null) {
                    if (qje.k(uykVar2 != null ? uykVar2.a : null, uykVar != null ? uykVar.a : null)) {
                        if (qje.k(uykVar2 != null ? uykVar2.b : null, uykVar != null ? uykVar.b : null)) {
                        }
                    }
                }
                i = i2;
            }
            return true;
        }
        return false;
    }

    public static Float p0(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        if (w0 == 0) {
            return null;
        }
        T0(w0, parcel, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static final boolean q(k5l k5lVar, k5l k5lVar2) {
        List list;
        List list2 = k5lVar.c;
        List list3 = k5lVar2.c;
        List list4 = list2;
        if ((list4 == null || list4.isEmpty()) && ((list = list3) == null || list.isEmpty())) {
            return qje.j(k5lVar.d, k5lVar2.d);
        }
        EmptyList emptyList = EmptyList.a;
        if (list2 == null) {
            list2 = emptyList;
        }
        if (list3 == null) {
            list3 = emptyList;
        }
        if (list2.size() == list3.size()) {
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                j5l j5lVar = (j5l) list3.get(i);
                j5l j5lVar2 = (j5l) obj;
                if (j5lVar2 != null || j5lVar != null) {
                    if (qje.k(j5lVar2 != null ? j5lVar2.a : null, j5lVar != null ? j5lVar.a : null)) {
                        if (qje.k(j5lVar2 != null ? j5lVar2.b : null, j5lVar != null ? j5lVar.b : null)) {
                        }
                    }
                }
                i = i2;
            }
            return true;
        }
        return false;
    }

    public static IBinder q0(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + w0);
        return readStrongBinder;
    }

    public static BigDecimal r(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + w0);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static int r0(Parcel parcel, int i) {
        S0(i, parcel, 4);
        return parcel.readInt();
    }

    public static Bundle s(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + w0);
        return readBundle;
    }

    public static Integer s0(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        if (w0 == 0) {
            return null;
        }
        T0(w0, parcel, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static byte[] t(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + w0);
        return createByteArray;
    }

    public static final ArrayList t0(Reader reader) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = new a7e(new i73(4, bufferedReader)).iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public static byte[][] u(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + w0);
        return bArr;
    }

    public static long u0(Parcel parcel, int i) {
        S0(i, parcel, 8);
        return parcel.readLong();
    }

    public static float[] v(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + w0);
        return createFloatArray;
    }

    public static Long v0(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        if (w0 == 0) {
            return null;
        }
        T0(w0, parcel, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int[] w(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + w0);
        return createIntArray;
    }

    public static int w0(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static ArrayList x(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + w0);
        return arrayList;
    }

    public static final String x0(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static Parcelable y(Parcel parcel, int i, Parcelable.Creator creator) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w0);
        return parcelable;
    }

    public static final androidx.compose.runtime.c y0(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.b0(206, lid.e);
        if (btsVar.S) {
            ows0.z(btsVar.I);
        }
        Object I = btsVar.I();
        gts gtsVar = I instanceof gts ? (gts) I : null;
        if (gtsVar == null) {
            gtsVar = new l2k0(new zss(new androidx.compose.runtime.c(btsVar, btsVar.T, btsVar.q, btsVar.C, btsVar.h.M)), -1);
            btsVar.p0(gtsVar);
        }
        androidx.compose.runtime.c cVar = ((zss) gtsVar.a).a;
        cVar.f.setValue(btsVar.o());
        btsVar.t(false);
        return cVar;
    }

    public static String z(Parcel parcel, int i) {
        int w0 = w0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w0);
        return readString;
    }

    public static final void z0(View view, Animator.AnimatorListener animatorListener) {
        P(view).f(animatorListener);
    }

    public abstract Object N0(Continuation continuation);

    public abstract Object O0(String str, Continuation continuation);

    public abstract Object T(Continuation continuation);

    public abstract uv51 W(String str, List list);

    public abstract iq51 Y(List list);

    public abstract boolean Z(Map map);

    public abstract Object g0();

    public abstract tpr h0();

    public abstract tpr i0();

    public abstract Object o(String str, BigDecimal bigDecimal, String str2, ContinuationImpl continuationImpl);
}
