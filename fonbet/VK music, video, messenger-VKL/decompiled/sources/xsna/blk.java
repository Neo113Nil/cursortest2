package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.system.Os;
import android.system.OsConstants;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.zzox;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.common.links.LaunchContext;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.design.compose.booking.BookingCard$BookingCardType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonToken;

/* compiled from: CuratorButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class blk implements l9t0, q701, zy1, gn60, n2n0 {
    public static final jai b = new jai(-353503980, new a9b(1), false);
    public static final jai c = new jai(-1029430794, new nde(0, 1), false);
    public static final blk d = new blk();
    public static final String[] e = {"ru", "en"};
    public static final blk f = new blk();
    public static final /* synthetic */ blk g = new blk();

    public static final alk E() {
        return new alk();
    }

    public static final String F(String str) {
        Object failure;
        Process exec;
        try {
            exec = Runtime.getRuntime().exec(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (exec.waitFor() != 0) {
            return null;
        }
        failure = U(exec);
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    public static final String G(String str) {
        Object failure;
        Process exec;
        try {
            exec = Runtime.getRuntime().exec(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (exec.waitFor() != 0) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), emb.b), 8192);
        try {
            failure = bufferedReader.readLine();
            bufferedReader.close();
            return (String) (failure instanceof Result.Failure ? null : failure);
        } finally {
        }
    }

    public static final Integer H() {
        Object failure;
        Long n;
        try {
            long sysconf = Os.sysconf(OsConstants._SC_PAGESIZE) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            String str = (String) j5g.b0(1, drm0.c0(nbr.r(new File("/proc/self/statm"), emb.b), new String[]{" "}, 0, 6));
            failure = (str == null || (n = arm0.n(str)) == null) ? null : Integer.valueOf((int) ((n.longValue() * sysconf) / 1024));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Integer) (failure instanceof Result.Failure ? null : failure);
    }

    public static final String I(tlo0 tlo0Var, androidx.compose.runtime.a aVar) {
        CharSequence b2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1589172237, 0, -1, "com.vk.core.view.interop.ext.asString (TextSourceExt.kt:14)");
        }
        aVar.r(AndroidCompositionLocals_androidKt.a);
        if (tlo0Var == null) {
            aVar.K(-394224436);
            aVar.j();
            b2 = null;
        } else {
            aVar.K(-1813832235);
            b2 = tlo0Var.b(((Context) aVar.r(AndroidCompositionLocals_androidKt.b)).getResources());
            aVar.j();
        }
        String obj = b2 != null ? b2.toString() : null;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return obj;
    }

    public static final String J(tlo0 tlo0Var, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-34699559, 0, -1, "com.vk.core.view.interop.ext.asStringOrEmpty (TextSourceExt.kt:10)");
        }
        String I = I(tlo0Var, aVar);
        if (I == null) {
            I = "";
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return I;
    }

    public static void K(File file, OutputStream outputStream) throws IOException {
        int length = (int) file.length();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            Z(dataOutputStream, length);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = dataInputStream.read(bArr);
                    if (read <= 0) {
                        s3q0 s3q0Var = s3q0.a;
                        dataInputStream.close();
                        dataOutputStream.close();
                        return;
                    }
                    dataOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } finally {
        }
    }

    public static final Activity L(View view) {
        Context context;
        Activity h;
        do {
            ViewParent parent = view.getParent();
            boolean z = parent instanceof ViewGroup;
            ViewGroup viewGroup = z ? (ViewGroup) parent : null;
            if (viewGroup != null && (context = viewGroup.getContext()) != null && (h = e3m.h(context)) != null) {
                return h;
            }
            view = z ? (ViewGroup) parent : null;
        } while (view != null);
        return null;
    }

    public static String M(String str) {
        char c2;
        int i;
        char c3;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            boolean isUpperCase = Character.isUpperCase(charAt);
            switch (Character.toLowerCase(charAt)) {
                case 'a':
                    c2 = 1072;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case JsonToken.BOOLEAN /* 98 */:
                    c2 = 1073;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                    i = i2 + 1;
                    if (i < str.length() && str.charAt(i) == 'h') {
                        c3 = 1095;
                        i2 = qq.a(c3, isUpperCase, sb, i2, 2);
                        break;
                    } else {
                        sb.append(W((char) 1082, isUpperCase));
                        i2 = i;
                        break;
                    }
                    break;
                case 'd':
                    c2 = 1076;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'e':
                    c2 = 1077;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'f':
                    c2 = 1092;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'g':
                    c2 = 1075;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'h':
                    c2 = 1093;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'i':
                    c2 = 1080;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case INVALID_REQUEST_BUILDER_ERROR_VALUE:
                    i = i2 + 1;
                    if (i < str.length()) {
                        if (str.charAt(i) == 'u') {
                            i2 = qq.a((char) 1102, isUpperCase, sb, i2, 2);
                            break;
                        } else if (str.charAt(i) == 'a') {
                            i2 = qq.a((char) 1103, isUpperCase, sb, i2, 2);
                            break;
                        }
                    }
                    sb.append(W((char) 1081, isUpperCase));
                    i2 = i;
                    break;
                case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
                case 'q':
                    i2 = qq.a((char) 1082, isUpperCase, sb, i2, 1);
                    break;
                case 'l':
                    c2 = 1083;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'm':
                    c2 = 1084;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'n':
                    c2 = 1085;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'o':
                    c2 = 1086;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case 'p':
                    c2 = 1087;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case ASSET_WRITE_ERROR_VALUE:
                    c2 = 1088;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case INVALID_INDEX_URL_VALUE:
                    i = i2 + 1;
                    if (i < str.length() && str.charAt(i) == 'h') {
                        c3 = 1096;
                        i2 = qq.a(c3, isUpperCase, sb, i2, 2);
                        break;
                    } else {
                        int i3 = i2 + 2;
                        if (i3 >= str.length() || str.charAt(i) != 'c' || str.charAt(i3) != 'h') {
                            sb.append(W((char) 1089, isUpperCase));
                            i2 = i;
                            break;
                        } else {
                            i2 = qq.a((char) 1097, isUpperCase, sb, i2, 3);
                            break;
                        }
                    }
                case 't':
                    c2 = 1090;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case ASSET_FAILED_STATUS_CODE_VALUE:
                    c2 = 1091;
                    i2 = qq.a(c2, isUpperCase, sb, i2, 1);
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                case JSON_ENCODE_ERROR_VALUE:
                    i2 = qq.a((char) 1074, isUpperCase, sb, i2, 1);
                    break;
                case 'x':
                    sb.append(cqm0.o("кс", isUpperCase));
                    i2++;
                    break;
                case TPAT_ERROR_VALUE:
                    i = i2 + 1;
                    if (i < str.length()) {
                        if (str.charAt(i) == 'u') {
                            i2 = qq.a((char) 1102, isUpperCase, sb, i2, 2);
                            break;
                        } else if (str.charAt(i) == 'a') {
                            i2 = qq.a((char) 1103, isUpperCase, sb, i2, 2);
                            break;
                        }
                    }
                    sb.append(W((char) 1081, isUpperCase));
                    i2 = i;
                    break;
                case INVALID_ADS_ENDPOINT_VALUE:
                    i = i2 + 1;
                    if (i < str.length() && str.charAt(i) == 'h') {
                        c3 = 1078;
                        i2 = qq.a(c3, isUpperCase, sb, i2, 2);
                        break;
                    } else {
                        sb.append(W((char) 1079, isUpperCase));
                        i2 = i;
                        break;
                    }
                default:
                    sb.append(charAt);
                    i2++;
                    break;
            }
        }
        return sb.toString();
    }

    public static String N(String str) {
        char c2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            boolean isUpperCase = Character.isUpperCase(charAt);
            switch (Character.toLowerCase(charAt)) {
                case 1072:
                    c2 = 'a';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1073:
                    c2 = 'b';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1074:
                    c2 = 'v';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1075:
                    c2 = 'g';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1076:
                    c2 = 'd';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1077:
                case 1101:
                    i = qq.a('e', isUpperCase, sb, i, 1);
                    break;
                case 1078:
                    sb.append(cqm0.o("zh", isUpperCase));
                    i++;
                    break;
                case 1079:
                    c2 = 'z';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1080:
                    c2 = 'i';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1081:
                    c2 = 'j';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1082:
                    c2 = 'k';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1083:
                    c2 = 'l';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1084:
                    c2 = 'm';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1085:
                    c2 = 'n';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1086:
                    c2 = 'o';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1087:
                    c2 = 'p';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1088:
                    c2 = 'r';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1089:
                    c2 = 's';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1090:
                    c2 = 't';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1091:
                    c2 = 'u';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1092:
                    c2 = 'f';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1093:
                    c2 = 'h';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1094:
                    c2 = 'c';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1095:
                    sb.append(cqm0.o("ch", isUpperCase));
                    i++;
                    break;
                case 1096:
                    sb.append(cqm0.o(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, isUpperCase));
                    i++;
                    break;
                case 1097:
                    sb.append(cqm0.o("sch", isUpperCase));
                    i++;
                    break;
                case 1098:
                case 1100:
                    i++;
                    break;
                case 1099:
                    c2 = 'y';
                    i = qq.a(c2, isUpperCase, sb, i, 1);
                    break;
                case 1102:
                    sb.append(cqm0.o("yu", isUpperCase));
                    i++;
                    break;
                case ApiInvocationException.ErrorCodes.FRIENDSHIP_REQUIRED /* 1103 */:
                    sb.append(cqm0.o("ya", isUpperCase));
                    i++;
                    break;
                default:
                    sb.append(charAt);
                    i++;
                    break;
            }
        }
        return sb.toString();
    }

    public static final LaunchContext O(fgx fgxVar) {
        Object obj = fgxVar.a.get("launch_context");
        if (obj != null) {
            return (LaunchContext) obj;
        }
        throw new IllegalStateException("launchContext is null");
    }

    public static final yp80 P(gg50 gg50Var) {
        Object obj = gg50Var.a.get("open_callback");
        if (obj != null) {
            return (yp80) obj;
        }
        throw new IllegalStateException("openCallback is null");
    }

    public static co7 Q(BookingCard$BookingCardType bookingCard$BookingCardType, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-25559701, i, -1, "com.vk.ecomm.design.compose.booking.BookingCard.Companion.invoke (BookingCard.kt:66)");
        }
        int i2 = ((i << 3) & 112) | 6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1591940711, i2, -1, "com.vk.ecomm.design.compose.booking.remember (BookingCard.kt:104)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            x = new co7(bookingCard$BookingCardType, gzsVar, aVar);
            aVar2.R(x);
        }
        co7 co7Var = (co7) x;
        ((zak0) co7Var.a).setValue(bookingCard$BookingCardType);
        ((zak0) co7Var.b).setValue(gzsVar);
        ((zak0) co7Var.c).setValue(aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return co7Var;
    }

    public static final void R(egx egxVar, wzs wzsVar) {
        ttp0.d(2, wzsVar);
        wzsVar.invoke(egxVar, 1);
    }

    public static final boolean S(String str) {
        PackageInfo packageInfo = null;
        if (str != null && str.length() != 0) {
            try {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            } catch (Exception unused) {
            }
        }
        return packageInfo != null;
    }

    public static Bundle T(FullscreenPasswordData fullscreenPasswordData) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("PASSWORD_METHOD_SELECTOR_DATA", fullscreenPasswordData);
        return bundle;
    }

    public static final String U(Process process) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), emb.b), 8192);
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                readLine = "";
            }
            String str = (String) j5g.k0(drm0.c0(readLine, new String[]{" "}, 0, 6));
            bufferedReader.close();
            return str;
        } finally {
        }
    }

    public static final String V(int i) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
    }

    public static String W(char c2, boolean z) {
        return cqm0.o(String.valueOf(c2).toString(), z);
    }

    public static void X(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.write(i);
        dataOutputStream.write(i >> 8);
        dataOutputStream.write(i >> 16);
        dataOutputStream.write(i >> 24);
    }

    public static void Y(DataOutputStream dataOutputStream, String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            dataOutputStream.write(str.charAt(i));
        }
    }

    public static void Z(DataOutputStream dataOutputStream, int i) {
        Y(dataOutputStream, "RIFF");
        X(dataOutputStream, i + 36);
        Y(dataOutputStream, "WAVE");
        Y(dataOutputStream, "fmt ");
        X(dataOutputStream, 16);
        dataOutputStream.write(1);
        dataOutputStream.write(0);
        dataOutputStream.write(1);
        dataOutputStream.write(0);
        X(dataOutputStream, 48000);
        X(dataOutputStream, 96000);
        dataOutputStream.write(2);
        dataOutputStream.write(0);
        dataOutputStream.write(16);
        dataOutputStream.write(0);
        Y(dataOutputStream, "data");
        X(dataOutputStream, i);
    }

    @Override // xsna.l9t0
    public int A() {
        return R.layout.vk_video_profile_catalog_tab_skeleton;
    }

    @Override // xsna.n2n0
    public s2n0 B() {
        return new u2n0();
    }

    @Override // xsna.n2n0
    public v2n0 C() {
        return new x2n0();
    }

    @Override // xsna.zy1
    public /* bridge */ /* synthetic */ boolean D(Object obj) {
        return false;
    }

    @Override // xsna.n2n0
    public i2n0 a() {
        return new d02();
    }

    @Override // xsna.n2n0
    public s2n0 b() {
        return new u2n0();
    }

    @Override // xsna.n2n0
    public k2n0 c() {
        return new m2n0();
    }

    @Override // xsna.l9t0
    public int d() {
        return R.layout.vk_video_profile_catalog_item_skeleton;
    }

    @Override // xsna.l9t0
    public boolean e() {
        return false;
    }

    @Override // xsna.l9t0
    public int f() {
        return R.layout.vk_video_profile_header_new_skeleton_v2;
    }

    @Override // xsna.l9t0
    public int g() {
        return R.layout.vk_video_profile_header_new_v2;
    }

    @Override // xsna.n2n0
    public v2n0 h() {
        return new x2n0();
    }

    @Override // xsna.n2n0
    public i2n0 i() {
        return new d02();
    }

    @Override // xsna.n2n0
    public s2n0 j() {
        return new u2n0();
    }

    @Override // xsna.n2n0
    public k2n0 k() {
        return new m2n0();
    }

    @Override // xsna.n2n0
    public f2n0 l() {
        return new h2n0();
    }

    @Override // xsna.l9t0
    public int m() {
        return R.layout.vk_video_profile_fragment_new_v2;
    }

    @Override // xsna.zy1
    public Object n(frz frzVar) {
        gkx0 nc;
        Dialog dialog = (Dialog) j5g.k0(((xrm) frzVar).b.k());
        return (dialog == null || (nc = dialog.nc()) == null) ? gkx0.e : nc;
    }

    @Override // xsna.n2n0
    public s2n0 o() {
        return new u2n0();
    }

    @Override // xsna.n2n0
    public i2n0 p() {
        return new d02();
    }

    @Override // xsna.n2n0
    public v2n0 q() {
        return new x2n0();
    }

    @Override // xsna.n2n0
    public s2n0 r() {
        return new u2n0();
    }

    @Override // xsna.n2n0
    public s2n0 s() {
        return new u2n0();
    }

    @Override // xsna.l9t0
    public int t() {
        return R.layout.vk_video_profile_fragment_new_appbar_v2;
    }

    @Override // xsna.n2n0
    public p2n0 u() {
        return new r2n0();
    }

    @Override // xsna.n2n0
    public s2n0 v() {
        return new u2n0();
    }

    @Override // xsna.l9t0
    public int w() {
        return R.layout.vk_video_profile_catalog_skeleton;
    }

    @Override // xsna.gn60
    public List x(Pair pair, bp5 bp5Var) {
        Float l;
        SnippetAttachment snippetAttachment = (SnippetAttachment) pair.g();
        Photo photo = snippetAttachment.p;
        return Collections.singletonList(new u9d0(snippetAttachment.g, new Triple(snippetAttachment.i, null, null), snippetAttachment.p, "H," + ((photo == null || (l = his0.l(photo)) == null) ? 1.7777778f : l.floatValue()) + ":1", mnh0.G(bp5Var)));
    }

    @Override // xsna.n2n0
    public i2n0 y() {
        return new d02();
    }

    @Override // xsna.n2n0
    public v2n0 z() {
        return new x2n0();
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzox.zze());
    }
}
