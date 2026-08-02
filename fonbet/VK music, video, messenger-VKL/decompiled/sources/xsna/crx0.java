package xsna;

import android.widget.EditText;
import android.widget.ImageView;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingAddressDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingBookableStaffDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetStaffResponseDto;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.m1h0;

/* compiled from: WindowInsets.kt */
@vby
/* loaded from: classes11.dex */
public final class crx0 implements mlb0, ea60, v4g {
    public static final int b = 9;
    public static final int c = 6;
    public static final int d = 10;
    public static final int e = 5;
    public static final int f = 15;
    public static final jai g = new jai(1452417671, new jue(2), false);
    public static final jai h = new jai(-1506466048, new zdi(0), false);
    public static final blx0 i = new blx0(0.31006f, 0.31616f);
    public static final blx0 j = new blx0(0.34567f, 0.3585f);
    public static final blx0 k = new blx0(0.32168f, 0.33767f);
    public static final blx0 l = new blx0(0.31271f, 0.32902f);
    public static final float[] m = {0.964212f, 1.0f, 0.825188f};
    public static final String[] n = {"first_name", "last_name", "photo_base"};
    public static final char[] o = {JwtParser.SEPARATOR_CHAR, ',', '!', '?', ';', ':'};
    public static final zym0 p = new zym0(R.drawable.vk_icon_download_outline_28, R.string.music_subscription_paywall_no_internet_title, false);
    public static final zym0 q = new zym0(R.drawable.vk_icon_globe_outline_28, R.string.music_buy_subscription_bottomsheet_paid_title_global_access, false);
    public static final zym0 r = new zym0(R.drawable.vk_icon_smile_outline_28, R.string.music_buy_subscription_bottomsheet_paid_title_no_ad, false);
    public static final zym0 s = new zym0(R.drawable.vk_icon_headphones_outline_28, R.string.music_buy_subscription_bottomsheet_paid_title_display_off_listening, false);
    public static final zym0 t = new zym0(R.drawable.vk_icon_book_spread_outline_28, R.string.music_subscription_paywall_book_title, false);
    public static final zym0 u = new zym0(R.drawable.vk_icon_play_rectangle_stack_outline_28, R.string.music_buy_subscription_bottomsheet_free_title_limited_background, false);
    public static final zym0 v = new zym0(R.drawable.vk_icon_magic_wand_outline_28, R.string.music_buy_subscription_bottomsheet_free_title_advertisement, false);
    public static final zym0 w = new zym0(R.drawable.vk_icon_compass_outline_28, R.string.music_buy_subscription_bottomsheet_free_title_prohibited_background, false);
    public static final zym0 x = new zym0(R.drawable.vk_icon_play_rectangle_stack_outline_28, R.string.music_buy_subscription_bottomsheet_free_title_unlimited_access, false);
    public static final zym0 y = new zym0(R.drawable.vk_icon_horse_toy_outline_28, R.string.music_buy_subscription_bottomsheet_kids_section_title, false);
    public static final zym0 z = new zym0(R.drawable.vk_icon_users_3_outline_28, R.string.music_buy_subscription_bottomsheet_combo_no_ads, false);
    public static final zym0 A = new zym0(R.drawable.vk_icon_download_outline_28, R.string.music_buy_subscription_bottomsheet_combo_offline, false);
    public static final zym0 B = new zym0(R.drawable.vk_icon_download_outline_28, R.string.music_buy_subscription_offline_vk_download, true);
    public static final zym0 C = new zym0(R.drawable.vk_icon_smartphone_outline_28, R.string.music_buy_subscription_offline_screen_off, false);
    public static final zym0 D = new zym0(R.drawable.vk_icon_loudspeaker_slash_outline_28, R.string.music_buy_subscription_offline_remove_ad, false);
    public static final zym0 E = new zym0(R.drawable.vk_icon_logo_wink_28, R.string.music_buy_subscription_offline_wink, false);
    public static final zym0 F = new zym0(R.drawable.vk_icon_education_outline_28, R.string.music_buy_subscription_offline_skillbox, false);
    public static final zym0 G = new zym0(R.drawable.vk_icon_services_outline_28, R.string.music_buy_subscription_offline_delivery, false);
    public static final crx0 H = new crx0();

    public static final Object A(Object[] objArr, gzs gzsVar, androidx.compose.runtime.a aVar, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1564532345, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        Object B2 = B(Arrays.copyOf(objArr, objArr.length), xa4.g, gzsVar, aVar, ((i2 << 6) & 7168) | 384);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return B2;
    }

    @ozl
    public static final Object B(Object[] objArr, e2h0 e2h0Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i2) {
        Object[] objArr2;
        e2h0 e2h0Var2;
        final Object obj;
        Object e2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(441892779, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long n2 = n34.n(aVar);
        ro.d(36);
        final String l2 = Long.toString(n2, 36);
        final m1h0 m1h0Var = (m1h0) aVar.r(o1h0.a);
        Object x2 = aVar.x();
        Object obj2 = a.C0011a.a;
        if (x2 == obj2) {
            Object k2 = (m1h0Var == null || (e2 = m1h0Var.e(l2)) == null) ? null : e2h0Var.k(e2);
            if (k2 == null) {
                k2 = gzsVar.invoke();
            }
            objArr2 = objArr;
            e2h0Var2 = e2h0Var;
            Object i1h0Var = new i1h0(e2h0Var2, m1h0Var, l2, k2, objArr2);
            aVar.R(i1h0Var);
            x2 = i1h0Var;
        } else {
            objArr2 = objArr;
            e2h0Var2 = e2h0Var;
        }
        final i1h0 i1h0Var2 = (i1h0) x2;
        Object obj3 = Arrays.equals(objArr2, i1h0Var2.f) ? i1h0Var2.e : null;
        if (obj3 == null) {
            obj3 = gzsVar.invoke();
        }
        boolean y2 = aVar.y(i1h0Var2) | ((((i2 & 112) ^ 48) > 32 && aVar.y(e2h0Var2)) || (i2 & 48) == 32) | aVar.y(m1h0Var) | aVar.J(l2) | aVar.y(obj3) | aVar.y(objArr2);
        Object x3 = aVar.x();
        if (y2 || x3 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final e2h0 e2h0Var3 = e2h0Var2;
            Object obj4 = new gzs() { // from class: xsna.juf0
                /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
                @Override // xsna.gzs
                public final Object invoke() {
                    boolean z2;
                    i1h0 i1h0Var3 = i1h0.this;
                    m1h0 m1h0Var2 = i1h0Var3.c;
                    m1h0 m1h0Var3 = m1h0Var;
                    boolean z3 = true;
                    if (m1h0Var2 != m1h0Var3) {
                        i1h0Var3.c = m1h0Var3;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str = i1h0Var3.d;
                    String str2 = l2;
                    if (epx.f(str, str2)) {
                        z3 = z2;
                    } else {
                        i1h0Var3.d = str2;
                    }
                    i1h0Var3.b = e2h0Var3;
                    i1h0Var3.e = obj;
                    i1h0Var3.f = objArr3;
                    m1h0.a aVar2 = i1h0Var3.g;
                    if (aVar2 != null && z3) {
                        aVar2.a();
                        i1h0Var3.g = null;
                        i1h0Var3.b();
                    }
                    return s3q0.a;
                }
            };
            aVar.R(obj4);
            x3 = obj4;
        } else {
            obj = obj3;
        }
        bap.i((gzs) x3, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return obj;
    }

    public static final wh50 C(Object[] objArr, e2h0 e2h0Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-746165481, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:203)");
        }
        wh50 wh50Var = (wh50) B(Arrays.copyOf(objArr, objArr.length), new fh9(new com.vk.movika.tools.controls.seekbar.r(e2h0Var, 10), new b810(e2h0Var, 22)), gzsVar, aVar, ((i2 << 3) & 7168) | 384);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static final Object D(Object[] objArr, e2h0 e2h0Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(674689872, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:175)");
        }
        Object B2 = B(Arrays.copyOf(objArr, objArr.length), e2h0Var, gzsVar, aVar, ((i2 << 3) & 7168) | 384);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return B2;
    }

    public static final void E(EditText editText, boolean z2) {
        if (!z2) {
            mhy.d(editText);
            return;
        }
        editText.requestFocus();
        editText.setSelection(editText.getText().length());
        mhy.j(editText);
    }

    public static final void F(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final od50 G(kjy kjyVar, wdp0 wdp0Var) {
        return new od50(wdp0Var, kjyVar);
    }

    public static final int c(LogRecord logRecord) {
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static final ArrayList d(ServiceBookingGetStaffResponseDto serviceBookingGetStaffResponseDto) {
        List<ServiceBookingBookableStaffDto> d2 = serviceBookingGetStaffResponseDto.d();
        ArrayList arrayList = new ArrayList();
        for (ServiceBookingBookableStaffDto serviceBookingBookableStaffDto : d2) {
            int id = serviceBookingBookableStaffDto.getId();
            String g2 = serviceBookingBookableStaffDto.g();
            boolean l2 = serviceBookingBookableStaffDto.l();
            String k2 = serviceBookingBookableStaffDto.k();
            boolean z2 = serviceBookingBookableStaffDto.j() == 1;
            String d3 = serviceBookingBookableStaffDto.i().d();
            int f2 = serviceBookingBookableStaffDto.f();
            String e2 = serviceBookingBookableStaffDto.e();
            ServiceBookingAddressDto d4 = serviceBookingBookableStaffDto.d();
            BookingMaster bookingMaster = new BookingMaster(id, g2, l2, k2, z2, d3, f2, e2, d4 != null ? d4.d() : null);
            if (!bookingMaster.d && serviceBookingGetStaffResponseDto.d().size() != 1) {
                bookingMaster = null;
            }
            if (bookingMaster != null) {
                arrayList.add(bookingMaster);
            }
        }
        return arrayList;
    }

    public static int e(byte b2) {
        return b2 < 0 ? b2 + AmfConstants.TYPE_NUMBER_MARKER : b2;
    }

    public static void f(ImageView imageView, int i2) {
        j6r0.a(imageView);
        if (i2 != 0) {
            imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            imageView.setScaleX(0.1f);
            imageView.setScaleY(0.1f);
            imageView.setVisibility(i2);
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setVisibility(0);
        imageView.setEnabled(true);
    }

    public static pml g(long j2, long j3, long j4, long j5, long j6, long j7, androidx.compose.runtime.a aVar, int i2) {
        long j8;
        long j9;
        long j10;
        long j11;
        if ((i2 & 1) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
            }
            k9g k9gVar = (k9g) aVar.r(l9g.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j8 = k9gVar.b();
        } else {
            j8 = j2;
        }
        if ((i2 & 2) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
            }
            iyk0 iyk0Var = l9g.a;
            k9g k9gVar2 = (k9g) aVar.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long c2 = l5g.c(14, k9gVar2.a(), fsk.r(6, aVar));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
            }
            k9g k9gVar3 = (k9g) aVar.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j9 = f870.i(c2, k9gVar3.c());
        } else {
            j9 = j3;
        }
        if ((i2 & 4) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
            }
            k9g k9gVar4 = (k9g) aVar.r(l9g.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j10 = k9gVar4.b();
        } else {
            j10 = j4;
        }
        long c3 = (i2 & 8) != 0 ? l5g.c(14, j10, 0.24f) : j5;
        if ((i2 & 16) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
            }
            k9g k9gVar5 = (k9g) aVar.r(l9g.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j11 = l5g.c(14, k9gVar5.a(), 0.32f);
        } else {
            j11 = j6;
        }
        long c4 = (i2 & 32) != 0 ? l5g.c(14, j11, 0.12f) : j7;
        long c5 = l5g.c(14, l9g.a(0, j10, aVar), 0.54f);
        long c6 = l5g.c(14, j10, 0.54f);
        long c7 = l5g.c(14, c5, 0.12f);
        long c8 = l5g.c(14, c4, 0.12f);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(436017687, 0, 0, "androidx.compose.material.SliderDefaults.colors (Slider.kt:605)");
        }
        pml pmlVar = new pml(j8, j9, j10, c3, j11, c4, c5, c6, c7, c8);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return pmlVar;
    }

    public static final int h(Matcher matcher, int i2) {
        String group = matcher.group(i2);
        int start = matcher.start(i2);
        int end = matcher.end(i2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = start; i6 < end; i6++) {
            char charAt = group.charAt(i6 - start);
            if (charAt == '(') {
                i3++;
            } else if (charAt == ')') {
                i3--;
            } else if (charAt == '[') {
                i4++;
            } else if (charAt == ']') {
                i4--;
            } else if (charAt == '{') {
                i5++;
            } else if (charAt == '}') {
                i5--;
            }
            if (i3 < 0 || i4 < 0 || i5 < 0) {
                end = i6;
                break;
            }
        }
        while (end > start) {
            if (!rl3.F(o, group.charAt((end - start) - 1))) {
                break;
            }
            end--;
        }
        return end;
    }

    public static final int i(Matcher matcher) {
        if (matcher.group(1) != null) {
            return 1;
        }
        return matcher.group(7) != null ? 7 : -1;
    }

    public static final String j(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final String l(int i2) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setGroupingSize(3);
        decimalFormat.setMaximumFractionDigits(0);
        return decimalFormat.format(i2);
    }

    public static cjq m(JSONObject jSONObject) {
        try {
            long j2 = jSONObject.getLong("channel_id");
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            return new cjq(j2, new djq(Integer.valueOf(jSONObject2.optInt("code")), jSONObject2.optString("description")));
        } catch (JSONException e2) {
            throw new VKApiIllegalResponseException(e2);
        }
    }

    public static String n(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static double o(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << AmfConstants.TYPE_TYPED_OBJECT_MARKER) & 16711680)) | ((r0[2] << 8) & 65280)) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static double p(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << AmfConstants.TYPE_TYPED_OBJECT_MARKER) & 16711680)) | ((r0[2] << 8) & 65280)) | (r0[3] & 255)) / 65536.0d;
    }

    public static float q(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[2]);
        return ((short) (((short) ((r0[0] << 8) & 65280)) | (r0[1] & 255))) / 256.0f;
    }

    public static String r(ByteBuffer byteBuffer) {
        int u2 = u(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            sb.append((char) (((u2 >> ((2 - i2) * 5)) & 31) + 96));
        }
        return sb.toString();
    }

    public static String s(int i2, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return imj0.a(bArr);
    }

    public static String t(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b2 = byteBuffer.get();
            if (b2 == 0) {
                return imj0.a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b2);
        }
    }

    public static int u(ByteBuffer byteBuffer) {
        return e(byteBuffer.get()) + (e(byteBuffer.get()) << 8);
    }

    public static int v(ByteBuffer byteBuffer) {
        return e(byteBuffer.get()) + (u(byteBuffer) << 8);
    }

    public static long w(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    public static long x(ByteBuffer byteBuffer) {
        long w2 = w(byteBuffer) << 32;
        if (w2 >= 0) {
            return w(byteBuffer) + w2;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int y(ByteBuffer byteBuffer) {
        return e(byteBuffer.get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r21.l(r18) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r21.J(r19) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final xvy z(boolean z2, gzs gzsVar, int i2, androidx.compose.runtime.a aVar, int i3, int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        Object x2;
        int i5;
        int i6;
        boolean z6;
        Object x3;
        xvy a = zvy.a(0, 3, aVar);
        int i7 = (i4 & 8) != 0 ? 6 : i2;
        Object x4 = aVar.x();
        Object obj = a.C0011a.a;
        if (x4 == obj) {
            x4 = new fd90(0);
            aVar.R(x4);
        }
        gzs gzsVar2 = (gzs) x4;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1895097064, i3, -1, "com.vk.core.compose.utils.paging.rememberPaginatableLazyListState (PaginatableLazyListState.kt:19)");
        }
        Boolean valueOf = Boolean.valueOf(z2);
        int i8 = (i3 & 896) ^ 384;
        int i9 = (i3 & 7168) ^ 3072;
        boolean z7 = ((i8 > 256 && aVar.J(a)) || (i3 & 384) == 256) | ((i9 > 2048 && aVar.o(i7)) || (i3 & 3072) == 2048);
        int i10 = i3 & 14;
        if ((i10 ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
            z3 = false;
            boolean z8 = z3 | z7;
            if (((i3 & 112) ^ 48) <= 32) {
            }
            if ((i3 & 48) != 32) {
                z4 = false;
                z5 = z8 | z4;
                x2 = aVar.x();
                if (!z5 || x2 == obj) {
                    i5 = 2048;
                    i6 = i10;
                    Object jd90Var = new jd90(a, i7, z2, gzsVar, null);
                    aVar.R(jd90Var);
                    x2 = jd90Var;
                } else {
                    i6 = i10;
                    i5 = 2048;
                }
                bap.g(valueOf, (wzs) x2, aVar, i6);
                z6 = ((i8 <= 256 && aVar.J(a)) || (i3 & 384) == 256) | ((i9 <= i5 && aVar.o(i7)) || (i3 & 3072) == i5) | ((((57344 & i3) ^ 24576) <= 16384 && aVar.l(false)) || (i3 & 24576) == 16384) | ((((458752 & i3) ^ 196608) <= 131072 && aVar.J(gzsVar2)) || (i3 & 196608) == 131072);
                x3 = aVar.x();
                if (!z6 || x3 == obj) {
                    Object ld90Var = new ld90(a, i7, false, gzsVar2, null);
                    aVar.R(ld90Var);
                    x3 = ld90Var;
                }
                bap.g(false, (wzs) x3, aVar, (i3 >> 12) & 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
            z4 = true;
            z5 = z8 | z4;
            x2 = aVar.x();
            if (z5) {
            }
            i5 = 2048;
            i6 = i10;
            Object jd90Var2 = new jd90(a, i7, z2, gzsVar, null);
            aVar.R(jd90Var2);
            x2 = jd90Var2;
            bap.g(valueOf, (wzs) x2, aVar, i6);
            z6 = ((i8 <= 256 && aVar.J(a)) || (i3 & 384) == 256) | ((i9 <= i5 && aVar.o(i7)) || (i3 & 3072) == i5) | ((((57344 & i3) ^ 24576) <= 16384 && aVar.l(false)) || (i3 & 24576) == 16384) | ((((458752 & i3) ^ 196608) <= 131072 && aVar.J(gzsVar2)) || (i3 & 196608) == 131072);
            x3 = aVar.x();
            if (!z6) {
            }
            Object ld90Var2 = new ld90(a, i7, false, gzsVar2, null);
            aVar.R(ld90Var2);
            x3 = ld90Var2;
            bap.g(false, (wzs) x3, aVar, (i3 >> 12) & 14);
            if (androidx.compose.runtime.b.d()) {
            }
            return a;
        }
        z3 = true;
        boolean z82 = z3 | z7;
        if (((i3 & 112) ^ 48) <= 32) {
        }
        if ((i3 & 48) != 32) {
        }
        z4 = true;
        z5 = z82 | z4;
        x2 = aVar.x();
        if (z5) {
        }
        i5 = 2048;
        i6 = i10;
        Object jd90Var22 = new jd90(a, i7, z2, gzsVar, null);
        aVar.R(jd90Var22);
        x2 = jd90Var22;
        bap.g(valueOf, (wzs) x2, aVar, i6);
        z6 = ((i8 <= 256 && aVar.J(a)) || (i3 & 384) == 256) | ((i9 <= i5 && aVar.o(i7)) || (i3 & 3072) == i5) | ((((57344 & i3) ^ 24576) <= 16384 && aVar.l(false)) || (i3 & 24576) == 16384) | ((((458752 & i3) ^ 196608) <= 131072 && aVar.J(gzsVar2)) || (i3 & 196608) == 131072);
        x3 = aVar.x();
        if (!z6) {
        }
        Object ld90Var22 = new ld90(a, i7, false, gzsVar2, null);
        aVar.R(ld90Var22);
        x3 = ld90Var22;
        bap.g(false, (wzs) x3, aVar, (i3 >> 12) & 14);
        if (androidx.compose.runtime.b.d()) {
        }
        return a;
    }

    @Override // xsna.mlb0
    public void b(List list, List list2, boolean z2) {
        list2.clear();
        list2.addAll(list);
    }

    public io.reactivex.rxjava3.core.x k(UserId userId, String str) {
        return rsg0.w0(new a0u(userId, str, "suggests", "photo_base,sex,first_name_dat,last_name_dat,video_files,first_name_gen,can_write_private_message,can_message,is_government_organization,is_verified,check_sign,last_name_gen,trust_mark", true));
    }
}
