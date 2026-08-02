package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.media.ExifInterface;
import android.text.TextUtils;
import android.util.Log;
import android.view.inputmethod.ExtractedText;
import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.notifications.dto.NotificationsNotificationGroupSettingsSectionDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsGroupSectionItemDto;
import com.vk.dto.profile.Occupation;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.R;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import one.video.exo.offline.e;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.tgv0;

/* compiled from: HitTestResult.kt */
@vby
/* loaded from: classes11.dex */
public final class ahn implements zjr0, m8o {
    public static final ahn b = new ahn();
    public static final ahn c = new ahn();
    public static final Object d = new Object();
    public static final Object e = new Object();

    public static final Occupation A(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        long optLong = jSONObject.optLong("id");
        String optString2 = jSONObject.optString("name");
        Long valueOf = Long.valueOf(jSONObject.optLong("graduate_year"));
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        return new Occupation(optString, optLong, optString2, valueOf);
    }

    public static String B(String str) {
        return new Regex("--.*\n?").g(new Regex("/\\*.*?(\\*/)", RegexOption.DOT_MATCHES_ALL).g(str, ""), "");
    }

    public static io.reactivex.rxjava3.core.q C(io.reactivex.rxjava3.core.q qVar) {
        return qVar.L(new e40(new p2u(21), 26), false);
    }

    public static final void D(rsg0 rsg0Var) {
        if (o25.a().b()) {
            return;
        }
        rsg0Var.d = true;
        rsg0Var.c = true;
    }

    public static final q630 E(q630 q630Var, String str) {
        return q630Var.g(new yao0(str));
    }

    public static void F(String str) {
        synchronized (d) {
            h(str, null);
        }
    }

    public static void G(String str, @Nullable Throwable th) {
        synchronized (d) {
            h(str, th);
        }
    }

    public static final po40 c() {
        return new po40();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:10:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d(xsna.eu5 r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof xsna.ckg0
            if (r0 == 0) goto L13
            r0 = r8
            xsna.ckg0 r0 = (xsna.ckg0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            xsna.ckg0 r0 = new xsna.ckg0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            xsna.eu5 r7 = (xsna.eu5) r7
            kotlin.a.a(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.a.a(r8)
        L36:
            r0.L$0 = r7
            r0.label = r3
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            java.lang.Object r8 = r7.I1(r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            xsna.plb0 r8 = (xsna.plb0) r8
            int r2 = r8.d
            java.util.List<xsna.xlb0> r8 = r8.a
            r2 = r2 & 66
            if (r2 == 0) goto L36
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
            r5 = r4
        L56:
            if (r5 >= r2) goto L68
            java.lang.Object r6 = r8.get(r5)
            xsna.xlb0 r6 = (xsna.xlb0) r6
            boolean r6 = xsna.fdi.l(r6)
            if (r6 != 0) goto L65
            goto L36
        L65:
            int r5 = r5 + 1
            goto L56
        L68:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.ahn.d(xsna.eu5, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final cdg0 e() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        knf knfVar = a1wVar.r().h0;
        return ddg0.a;
    }

    public static final ExtractedText f(tho0 tho0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = tho0Var.a.c;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = tho0Var.b;
        extractedText.selectionStart = qko0.f(j);
        extractedText.selectionEnd = qko0.e(j);
        extractedText.flags = !drm0.E(tho0Var.a.c, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void g(DeprecatedStatisticInterface deprecatedStatisticInterface, int i, int i2, int i3, String str) {
        for (DeprecatedStatisticUrl deprecatedStatisticUrl : deprecatedStatisticInterface.R6(str)) {
            int Y7 = deprecatedStatisticInterface.Y7(str);
            String str2 = deprecatedStatisticUrl.f;
            com.vkontakte.android.data.b.p(new DeprecatedStatisticUrl(drm0.D(str2, "reason=", false) ? brm0.y(str2, "reason=", "reason=" + i) : str2 + i, str, i2, i3, Y7, deprecatedStatisticInterface));
        }
    }

    public static String h(String str, @Nullable Throwable th) {
        String replace;
        if (th != null) {
            synchronized (d) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder b2 = ho8.b(str, "\n  ");
        b2.append(replace.replace("\n", "\n  "));
        b2.append('\n');
        return b2.toString();
    }

    public static float i(lif0 lif0Var, luu luuVar) {
        return luuVar.n().d().i(lif0Var).o();
    }

    public static float j(lif0 lif0Var, luu luuVar) {
        return luuVar.n().d().i(lif0Var).o() - luuVar.n().d().o();
    }

    public static final int k(long j, long j2) {
        boolean x = x(j);
        if (x != x(j2)) {
            return x ? -1 : 1;
        }
        return (Math.min(q(j), q(j2)) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && w(j) != w(j2)) ? w(j) ? -1 : 1 : (int) Math.signum(q(j) - q(j2));
    }

    public static void l(@Nullable Exception exc) {
        synchronized (d) {
            h("MediaCodec error", exc);
        }
    }

    public static void m(String str) {
        synchronized (d) {
            h(str, null);
        }
    }

    public static void n(String str, String str2) {
        synchronized (d) {
            Log.e(str, h(str2, null));
        }
    }

    public static void o(String str, String str2, @Nullable Throwable th) {
        synchronized (d) {
            Log.e(str, h(str2, th));
        }
    }

    public static final String p(long j, Context context) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long days = timeUnit.toDays(j);
        long minutes = timeUnit.toMinutes(j);
        long hours = timeUnit.toHours(j);
        dyo0 dyo0Var = new dyo0(j, minutes, hours, days, days / 30, days / 365);
        return String.format(context.getString(R.string.vk_live_stream_time), Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(dyo0Var.h), Long.valueOf(dyo0Var.g)}, 3));
    }

    public static final float q(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final baf0 r(int i) {
        int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
        abg0 abg0Var = dhr0.t;
        return new baf0(abg0Var.a(i), new ColorStateList(iArr, new int[]{abg0Var.c(R.attr.vk_ui_text_accent), abg0Var.c(R.attr.vk_ui_icon_secondary)}));
    }

    public static final String s() {
        return i5s.a(new StringBuilder("https://static."), a0a.d, "/gifts_catalog/");
    }

    public static int t(File file) {
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return atv0.b;
        } catch (IOException unused) {
            return 0;
        }
    }

    public static void u(String str) {
        synchronized (d) {
            h(str, null);
        }
    }

    public static pgv0 v(vgv0 vgv0Var, ugv0 ugv0Var, qgv0 qgv0Var, sgv0 sgv0Var, tgv0.a aVar, ogv0 ogv0Var, ogv0 ogv0Var2, int i) {
        return new pgv0(vgv0Var, (i & 2) != 0 ? null : ugv0Var, (i & 4) != 0 ? null : qgv0Var, (i & 8) != 0 ? null : sgv0Var, (i & 16) != 0 ? null : aVar, null, (i & 64) != 0 ? null : ogv0Var, (i & 128) != 0 ? null : ogv0Var2, null);
    }

    public static final boolean w(long j) {
        return (j & 2) != 0;
    }

    public static final boolean x(long j) {
        return (j & 1) != 0;
    }

    public static p3j0 y(NotificationsNotificationGroupSettingsSectionDto notificationsNotificationGroupSettingsSectionDto) {
        p3j0 p3j0Var = new p3j0();
        p3j0Var.a = notificationsNotificationGroupSettingsSectionDto.e();
        List<NotificationsNotificationSettingsGroupSectionItemDto> d2 = notificationsNotificationGroupSettingsSectionDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
        for (NotificationsNotificationSettingsGroupSectionItemDto notificationsNotificationSettingsGroupSectionItemDto : d2) {
            q3j0 q3j0Var = new q3j0();
            q3j0Var.a = notificationsNotificationSettingsGroupSectionItemDto.getId();
            q3j0Var.b = notificationsNotificationSettingsGroupSectionItemDto.f();
            q3j0Var.c = notificationsNotificationSettingsGroupSectionItemDto.e();
            q3j0Var.d = notificationsNotificationSettingsGroupSectionItemDto.g();
            if (notificationsNotificationSettingsGroupSectionItemDto.d() != null) {
                q3j0Var.e = !r2.booleanValue();
            }
            arrayList.add(q3j0Var);
        }
        p3j0Var.b = p4g.q(arrayList);
        return p3j0Var;
    }

    public static double z(lif0 lif0Var, List list, luu luuVar) {
        BoundingBox i = luuVar.n().d().i(lif0Var);
        Iterator it = list.iterator();
        double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        while (it.hasNext()) {
            if (!epx.f((luu) it.next(), luuVar)) {
                d2 += i.l0(r2.n().d());
            }
        }
        return d2;
    }

    @Override // xsna.m8o
    public void a(rr1 rr1Var, ygp0 ygp0Var) {
        ygp0Var.a(new one.video.exo.offline.f((e.c) null, (e.c) null, 7));
    }

    @Override // xsna.zjr0
    public Object b(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(mby.d(jsonReader) * f));
    }
}
