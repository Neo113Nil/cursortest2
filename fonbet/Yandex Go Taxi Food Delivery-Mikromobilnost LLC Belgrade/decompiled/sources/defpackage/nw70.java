package defpackage;

import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.k;
import androidx.fragment.app.Fragment;
import com.adjust.sdk.Constants;
import com.yandex.alicekit.core.views.animator.DslAnimatorBuilder;
import com.yandex.mapkit.map.Callback;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$ModalHeightType;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$OpenType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ModalHeight$Type;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$OpenFormat;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ToolbarNavigationType;
import com.yandex.runtime.image.ImageProvider;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$ClipboardContentFormat;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$SoundType;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode;
import io.flutter.plugin.platform.a;
import io.flutter.plugin.platform.d;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.taxi.delivery.ui.photocomment.AddPhotocommentButtonView;
import ru.yandex.taxi.parks.api.ParksApi;
import ru.yandex.taxi.phone_select.PhoneSelectModalView;

/* loaded from: classes2.dex */
public final class nw70 implements lds, z87, jp90, r89, nlr, abq0, Callback, uub0, ca20, ppu, sj10, nmo, ryj0 {
    public final /* synthetic */ int a;
    public final Object b;

    public nw70(t7w t7wVar) {
        Long m;
        this.a = 10;
        String uid = t7wVar.e.getUid();
        this.b = bvf0.c((uid == null || (m = bvu0.m(10, uid)) == null) ? ou11.a : new pu11(m.longValue()));
    }

    public static Object C(yt80 yt80Var) {
        try {
            Uri parse = Uri.parse(yt80Var.b);
            o(parse);
            return new szg(parse, yt80Var.c, null);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public static Object F(du80 du80Var) {
        try {
            Uri parse = Uri.parse(du80Var.a);
            o(parse);
            return new szg(parse, du80Var.d, null);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        if (r4 != '\b') goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa A[Catch: JSONException -> 0x00a7, TryCatch #3 {JSONException -> 0x00a7, blocks: (B:5:0x0015, B:8:0x0023, B:51:0x009b, B:53:0x00aa, B:60:0x00c8, B:62:0x00d4, B:64:0x00dc, B:74:0x00e0, B:67:0x00f0, B:69:0x00fa, B:71:0x010a, B:76:0x00e5, B:77:0x0112, B:84:0x0134, B:86:0x0140, B:106:0x017f, B:108:0x018b, B:110:0x0193, B:113:0x01b7, B:115:0x01aa, B:118:0x01b1, B:119:0x01c9, B:121:0x01d1, B:123:0x01e4, B:126:0x01ec, B:128:0x01fe, B:129:0x020b, B:133:0x0214, B:135:0x0220, B:138:0x0228, B:142:0x023e, B:144:0x024a, B:154:0x0280, B:156:0x028c, B:158:0x0294, B:160:0x02a3, B:162:0x02ab, B:164:0x02d2, B:166:0x02da, B:169:0x02fe, B:171:0x02eb, B:173:0x02f1, B:174:0x02fb, B:175:0x0306, B:177:0x030e, B:179:0x033c, B:181:0x0344, B:183:0x035e, B:11:0x002b, B:12:0x0030, B:14:0x0039, B:24:0x0061, B:26:0x0053, B:27:0x0056, B:28:0x0059, B:29:0x005c, B:33:0x0068, B:45:0x0085, B:56:0x00b2, B:80:0x011a, B:89:0x0148, B:92:0x0171, B:93:0x0176, B:96:0x015d, B:99:0x0164, B:102:0x016b, B:147:0x0252, B:149:0x025c, B:150:0x025f), top: B:4:0x0015, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a A[Catch: JSONException -> 0x00a7, TryCatch #3 {JSONException -> 0x00a7, blocks: (B:5:0x0015, B:8:0x0023, B:51:0x009b, B:53:0x00aa, B:60:0x00c8, B:62:0x00d4, B:64:0x00dc, B:74:0x00e0, B:67:0x00f0, B:69:0x00fa, B:71:0x010a, B:76:0x00e5, B:77:0x0112, B:84:0x0134, B:86:0x0140, B:106:0x017f, B:108:0x018b, B:110:0x0193, B:113:0x01b7, B:115:0x01aa, B:118:0x01b1, B:119:0x01c9, B:121:0x01d1, B:123:0x01e4, B:126:0x01ec, B:128:0x01fe, B:129:0x020b, B:133:0x0214, B:135:0x0220, B:138:0x0228, B:142:0x023e, B:144:0x024a, B:154:0x0280, B:156:0x028c, B:158:0x0294, B:160:0x02a3, B:162:0x02ab, B:164:0x02d2, B:166:0x02da, B:169:0x02fe, B:171:0x02eb, B:173:0x02f1, B:174:0x02fb, B:175:0x0306, B:177:0x030e, B:179:0x033c, B:181:0x0344, B:183:0x035e, B:11:0x002b, B:12:0x0030, B:14:0x0039, B:24:0x0061, B:26:0x0053, B:27:0x0056, B:28:0x0059, B:29:0x005c, B:33:0x0068, B:45:0x0085, B:56:0x00b2, B:80:0x011a, B:89:0x0148, B:92:0x0171, B:93:0x0176, B:96:0x015d, B:99:0x0164, B:102:0x016b, B:147:0x0252, B:149:0x025c, B:150:0x025f), top: B:4:0x0015, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Type inference failed for: r11v26, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void H(x920 x920Var, da20 da20Var) {
        ClipDescription primaryClipDescription;
        int i;
        PlatformChannel$ClipboardContentFormat a;
        CharSequence d;
        y4a0 y4a0Var = (y4a0) this.b;
        if (((a) y4a0Var.c) == null) {
            return;
        }
        String str = x920Var.a;
        Object obj = x920Var.b;
        try {
            boolean z = false;
            r7 = 0;
            int i2 = 0;
            z = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        ((yvc0) ((a) y4a0Var.c).a).c.setFrameworkHandlesBack(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        yvc0 yvc0Var = (yvc0) ((a) y4a0Var.c).a;
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", (String) obj);
                        yvc0Var.a.startActivity(Intent.createChooser(intent, null));
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        yvc0 yvc0Var2 = (yvc0) ((a) y4a0Var.c).a;
                        if (!yvc0Var2.c.popSystemNavigator()) {
                            ?? r11 = yvc0Var2.a;
                            if (r11 instanceof rx60) {
                                ((rx60) r11).getOnBackPressedDispatcher().c();
                            } else {
                                r11.finish();
                            }
                        }
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        ((ClipboardManager) ((yvc0) ((a) y4a0Var.c).a).a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        ((a) y4a0Var.c).i();
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            int i3 = jSONObject.getInt("primaryColor");
                            if (i3 != 0) {
                                i3 |= ModalContentViewContainer.BASE_SHADOW_COLOR;
                            }
                            ((yvc0) ((a) y4a0Var.c).a).a.setTaskDescription(new ActivityManager.TaskDescription(jSONObject.getString("label"), 0, i3));
                            ((ba20) da20Var).success(null);
                            break;
                        } catch (JSONException e) {
                            ((ba20) da20Var).error("error", e.getMessage(), null);
                            return;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        try {
                            ((a) y4a0Var.c).k(PlatformChannel$HapticFeedbackType.a((String) obj));
                            ((ba20) da20Var).success(null);
                            break;
                        } catch (NoSuchFieldException e2) {
                            ((ba20) da20Var).error("error", e2.getMessage(), null);
                            return;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        try {
                            PlatformChannel$SoundType a2 = PlatformChannel$SoundType.a((String) obj);
                            yvc0 yvc0Var3 = (yvc0) ((a) y4a0Var.c).a;
                            if (a2 == PlatformChannel$SoundType.CLICK) {
                                yvc0Var3.a.getWindow().getDecorView().playSoundEffect(0);
                            }
                            ((ba20) da20Var).success(null);
                            break;
                        } catch (NoSuchFieldException e3) {
                            ((ba20) da20Var).error("error", e3.getMessage(), null);
                            return;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        ((yvc0) ((a) y4a0Var.c).a).b();
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        ClipboardManager clipboardManager = (ClipboardManager) ((yvc0) ((a) y4a0Var.c).a).a.getSystemService("clipboard");
                        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                            z = primaryClipDescription.hasMimeType("text/*");
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("value", z);
                        ((ba20) da20Var).success(jSONObject2);
                        break;
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        try {
                            PlatformChannel$SystemUiMode c = y4a0.c(y4a0Var, (String) obj);
                            yvc0 yvc0Var4 = (yvc0) ((a) y4a0Var.c).a;
                            if (c != PlatformChannel$SystemUiMode.LEAN_BACK) {
                                if (c != PlatformChannel$SystemUiMode.IMMERSIVE) {
                                    if (c != PlatformChannel$SystemUiMode.IMMERSIVE_STICKY) {
                                        if (c == PlatformChannel$SystemUiMode.EDGE_TO_EDGE) {
                                            i = 1792;
                                        }
                                        ((ba20) da20Var).success(null);
                                        break;
                                    } else {
                                        i = 5894;
                                    }
                                } else {
                                    i = 3846;
                                }
                            } else {
                                i = 1798;
                            }
                            yvc0Var4.e = i;
                            yvc0Var4.b();
                            ((ba20) da20Var).success(null);
                        } catch (NoSuchFieldException | JSONException e4) {
                            ((ba20) da20Var).error("error", e4.getMessage(), null);
                            return;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        try {
                            ((yvc0) ((a) y4a0Var.c).a).a(y4a0.e(y4a0Var, (JSONObject) obj));
                            ((ba20) da20Var).success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e5) {
                            ((ba20) da20Var).error("error", e5.getMessage(), null);
                            return;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        String str2 = (String) obj;
                        if (str2 != null) {
                            try {
                                a = PlatformChannel$ClipboardContentFormat.a(str2);
                            } catch (NoSuchFieldException unused) {
                                ((ba20) da20Var).error("error", "No such clipboard content format: ".concat(str2), null);
                            }
                            d = ((a) y4a0Var.c).d(a);
                            if (d != null) {
                                ((ba20) da20Var).success(null);
                                break;
                            } else {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("text", d);
                                ((ba20) da20Var).success(jSONObject3);
                                break;
                            }
                        }
                        a = null;
                        d = ((a) y4a0Var.c).d(a);
                        if (d != null) {
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        try {
                            ((a) y4a0Var.c).j(y4a0.b(y4a0Var, (JSONArray) obj));
                            ((ba20) da20Var).success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e6) {
                            ((ba20) da20Var).error("error", e6.getMessage(), null);
                            return;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            int i4 = 0;
                            char c2 = 0;
                            char c3 = 0;
                            while (i4 < jSONArray.length()) {
                                int i5 = hvc0.a[PlatformChannel$DeviceOrientation.a(jSONArray.getString(i4)).ordinal()];
                                char c4 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? c2 : (c2 == true ? 1 : 0) | '\b' : (c2 == true ? 1 : 0) | 2 : (c2 == true ? 1 : 0) | 4 : (c2 == true ? 1 : 0) | 1;
                                if (c3 == 0) {
                                    c3 = c4 == true ? 1 : 0;
                                }
                                i4++;
                                c2 = c4;
                                c3 = c3;
                            }
                            if (c2 != 0) {
                                switch (c2 == true ? 1 : 0) {
                                    case true:
                                        break;
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                        if (c3 != 2) {
                                            if (c3 != 4) {
                                            }
                                            i2 = 9;
                                            break;
                                        }
                                        break;
                                    case true:
                                        i2 = 9;
                                        break;
                                    case true:
                                        i2 = 12;
                                        break;
                                    case true:
                                        i2 = 8;
                                        break;
                                    case true:
                                        i2 = 11;
                                        break;
                                    case true:
                                        i2 = 2;
                                        break;
                                    case true:
                                        i2 = 13;
                                        break;
                                    default:
                                        i2 = 1;
                                        break;
                                }
                            } else {
                                i2 = -1;
                            }
                            ((yvc0) ((a) y4a0Var.c).a).a.setRequestedOrientation(i2);
                            ((ba20) da20Var).success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e7) {
                            ((ba20) da20Var).error("error", e7.getMessage(), null);
                            return;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    break;
                default:
                    ((ba20) da20Var).notImplemented();
                    break;
            }
        } catch (JSONException e8) {
            ((ba20) da20Var).error("error", "JSON error: " + e8.getMessage(), null);
        }
    }

    public static void o(Uri uri) {
        if (cvu0.t(uri.getScheme(), "http", true) || cvu0.t(uri.getScheme(), Constants.SCHEME, true)) {
            return;
        }
        throw new IllegalStateException((uri + " is not weblink!").toString());
    }

    public static Object y(vt80 vt80Var) {
        Deeplink$WebViewFormat deeplink$WebViewFormat;
        Deeplink$ModalHeightType deeplink$ModalHeightType;
        Boolean bool;
        xwe0 xwe0Var;
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType;
        xwe0 xwe0Var2;
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType2;
        xwe0 xwe0Var3;
        xwe0 xwe0Var4;
        bxe0 bxe0Var;
        bxe0 bxe0Var2;
        exe0 exe0Var = vt80Var.d;
        try {
            Uri parse = Uri.parse(vt80Var.b);
            o(parse);
            String str = vt80Var.c;
            Boolean bool2 = null;
            PresentationOptionsDto$OpenFormat presentationOptionsDto$OpenFormat = exe0Var != null ? exe0Var.a : null;
            int i = presentationOptionsDto$OpenFormat == null ? -1 : qw80.a[presentationOptionsDto$OpenFormat.ordinal()];
            boolean z = true;
            if (i == -1) {
                deeplink$WebViewFormat = null;
            } else if (i == 1) {
                deeplink$WebViewFormat = Deeplink$WebViewFormat.CARD;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                deeplink$WebViewFormat = Deeplink$WebViewFormat.FULL;
            }
            PresentationOptionsDto$ModalHeight$Type presentationOptionsDto$ModalHeight$Type = (exe0Var == null || (bxe0Var2 = exe0Var.c) == null) ? null : bxe0Var2.a;
            int i2 = presentationOptionsDto$ModalHeight$Type == null ? -1 : qw80.b[presentationOptionsDto$ModalHeight$Type.ordinal()];
            if (i2 == -1) {
                deeplink$ModalHeightType = null;
            } else if (i2 == 1) {
                deeplink$ModalHeightType = Deeplink$ModalHeightType.PERCENT;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                deeplink$ModalHeightType = Deeplink$ModalHeightType.FIXED;
            }
            Integer valueOf = (exe0Var == null || (bxe0Var = exe0Var.c) == null) ? null : Integer.valueOf(bxe0Var.b);
            Integer num = exe0Var != null ? exe0Var.d : null;
            Boolean bool3 = exe0Var != null ? exe0Var.e : null;
            Boolean bool4 = (exe0Var == null || (xwe0Var4 = exe0Var.b) == null) ? null : xwe0Var4.a;
            Boolean bool5 = (exe0Var == null || (xwe0Var3 = exe0Var.b) == null) ? null : xwe0Var3.b;
            if (exe0Var == null || (xwe0Var2 = exe0Var.b) == null || (presentationOptionsDto$ToolbarNavigationType2 = xwe0Var2.c) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(presentationOptionsDto$ToolbarNavigationType2 == PresentationOptionsDto$ToolbarNavigationType.CROSS_AND_ARROW);
            }
            if (exe0Var != null && (xwe0Var = exe0Var.b) != null && (presentationOptionsDto$ToolbarNavigationType = xwe0Var.c) != null) {
                if (presentationOptionsDto$ToolbarNavigationType != PresentationOptionsDto$ToolbarNavigationType.CROSS_AND_ARROW && presentationOptionsDto$ToolbarNavigationType != PresentationOptionsDto$ToolbarNavigationType.ONLY_ARROW) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            return new rzg(parse, deeplink$WebViewFormat, deeplink$ModalHeightType, valueOf, str, num, bool3, bool4, bool5, bool, bool2, null);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    @Override // defpackage.uub0
    public i2c0 A(Object obj) {
        return ((i5c0) this.b).p(obj);
    }

    @Override // defpackage.uub0
    public f2c0 B(r7c r7cVar) {
        throw new IllegalStateException("imageCluster called on non-clustering provider");
    }

    @Override // defpackage.abq0
    public void B0() {
        wfb0 wfb0Var;
        wfb0Var = ((PhoneSelectModalView) this.b).presenter;
        wfb0Var.x.B0();
    }

    @Override // defpackage.t65
    public PointF D(Object obj, c3c0 c3c0Var) {
        i5c0 i5c0Var = (i5c0) this.b;
        d3c0 d3c0Var = new d3c0(c3c0Var);
        i5c0Var.getClass();
        kn00 kn00Var = (kn00) obj;
        return kn00Var instanceof hn00 ? i5c0Var.f.f((hn00) kn00Var, i5c0.w(d3c0Var)) : i5c0.f(d3c0Var);
    }

    @Override // defpackage.t65
    public f2c0 E(Object obj, boolean z) {
        ImageProvider fromBitmap;
        zwy0 zwy0Var;
        i5c0 i5c0Var = (i5c0) this.b;
        i5c0Var.getClass();
        kn00 kn00Var = (kn00) obj;
        if (kn00Var instanceof gn00) {
            fo00 fo00Var = ((gn00) kn00Var).g;
            vn00 vn00Var = fo00Var instanceof vn00 ? (vn00) fo00Var : null;
            Drawable g = i5c0Var.g(vn00Var != null ? vn00Var.d : null);
            fromBitmap = i5c0Var.n(g != null ? ffx.d0(g, 0, 0, 7) : null);
        } else if (kn00Var instanceof jn00) {
            fromBitmap = i5c0Var.n(null);
        } else {
            if (!(kn00Var instanceof hn00)) {
                w511.b();
                return null;
            }
            zfc0 zfc0Var = i5c0Var.f;
            zfc0Var.getClass();
            fo00 fo00Var2 = ((hn00) kn00Var).g;
            do00 do00Var = fo00Var2 instanceof do00 ? (do00) fo00Var2 : null;
            if (do00Var != null && (zwy0Var = do00Var.a) != null) {
                r0 = zwy0Var.a(zfc0Var.g.getThemeType());
            }
            if (r0 == null) {
                r0 = (Bitmap) zfc0Var.b.c.getValue();
            }
            fromBitmap = ImageProvider.fromBitmap(r0);
        }
        return new lb51(fromBitmap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r4 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(ju80 ju80Var) {
        Deeplink$WebViewFormat deeplink$WebViewFormat;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        xwe0 xwe0Var;
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType;
        xwe0 xwe0Var2;
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType2;
        xwe0 xwe0Var3;
        xwe0 xwe0Var4;
        PresentationOptionsDto$OpenFormat presentationOptionsDto$OpenFormat;
        exe0 exe0Var = ju80Var.f;
        v920 v920Var = (v920) this.b;
        Object j = v920Var.j(ju80Var.b);
        if (j instanceof Result.Failure) {
            return j;
        }
        vzg vzgVar = (vzg) j;
        if (vzgVar instanceof qzg) {
            Uri uri = ju80Var.b;
            boolean z = ju80Var.d == OutMessage$OpenUrl$OpenType.OUT;
            if (exe0Var != null && (presentationOptionsDto$OpenFormat = exe0Var.a) != null) {
                int i = qw80.a[presentationOptionsDto$OpenFormat.ordinal()];
                if (i == 1) {
                    deeplink$WebViewFormat = Deeplink$WebViewFormat.CARD;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    deeplink$WebViewFormat = Deeplink$WebViewFormat.FULL;
                }
            }
            deeplink$WebViewFormat = ((qzg) vzgVar).c;
            if (exe0Var == null || (xwe0Var4 = exe0Var.b) == null || (bool = xwe0Var4.a) == null) {
                bool = ((qzg) vzgVar).d;
            }
            if (exe0Var == null || (xwe0Var3 = exe0Var.b) == null || (bool2 = xwe0Var3.b) == null) {
                bool2 = ((qzg) vzgVar).e;
            }
            if (exe0Var == null || (xwe0Var2 = exe0Var.b) == null || (presentationOptionsDto$ToolbarNavigationType2 = xwe0Var2.c) == null) {
                bool3 = ((qzg) vzgVar).f;
            } else {
                bool3 = Boolean.valueOf(presentationOptionsDto$ToolbarNavigationType2 == PresentationOptionsDto$ToolbarNavigationType.CROSS_AND_ARROW);
            }
            if (exe0Var == null || (xwe0Var = exe0Var.b) == null || (presentationOptionsDto$ToolbarNavigationType = xwe0Var.c) == null) {
                bool4 = ((qzg) vzgVar).g;
            } else {
                bool4 = Boolean.valueOf(presentationOptionsDto$ToolbarNavigationType == PresentationOptionsDto$ToolbarNavigationType.CROSS_AND_ARROW || presentationOptionsDto$ToolbarNavigationType == PresentationOptionsDto$ToolbarNavigationType.ONLY_ARROW);
            }
            vzgVar = new qzg(uri, z, deeplink$WebViewFormat, bool, bool2, bool3, bool4, ju80Var.e);
        }
        int i2 = qw80.c[ju80Var.c.ordinal()];
        if (i2 == 1) {
            return new tzg(v920Var.p(vzgVar));
        }
        if (i2 == 2) {
            return vzgVar;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.abq0
    public void I(bgq0 bgq0Var) {
        wfb0 wfb0Var;
        wfb0Var = ((PhoneSelectModalView) this.b).presenter;
        wfb0Var.y.c();
        wfb0Var.x.I(bgq0Var);
        ((vfb0) wfb0Var.Dg()).phoneSelected();
    }

    @Override // defpackage.nmo, defpackage.nrf, defpackage.stf
    public tc5 a() {
        return ((PreselectActivity) this.b).getActivityViewModel();
    }

    @Override // defpackage.nmo, defpackage.nrf, defpackage.stf
    public Object b(Fragment fragment, Class cls) {
        return ((y8h) ((p7u) dpb1.c(fragment)).componentDispatcher()).b(xxk.class);
    }

    @Override // defpackage.r89
    public void c() {
        n891.n(new ak80(16, this));
    }

    @Override // defpackage.t65
    public i2c0 d(Object obj) {
        i5c0 i5c0Var = (i5c0) this.b;
        i5c0Var.getClass();
        kn00 kn00Var = (kn00) obj;
        Context context = i5c0Var.a;
        if (!(kn00Var instanceof hn00)) {
            return new i2c0(tje.r(eug0.discovery_map_selected_pin_width, context), context.getResources().getDimensionPixelSize(eug0.discovery_map_selected_pin_height));
        }
        zfc0 zfc0Var = i5c0Var.f;
        zfc0Var.getClass();
        fo00 fo00Var = ((hn00) kn00Var).i;
        if (fo00Var instanceof eo00) {
            return new i2c0(((Number) zfc0Var.i.getValue()).intValue(), ((Number) zfc0Var.j.getValue()).intValue());
        }
        if (fo00Var instanceof bo00) {
            yfc0 b = zfc0Var.b(zfc0Var.k((bo00) fo00Var));
            return new i2c0(b.b, b.c);
        }
        if (fo00Var instanceof ao00) {
            return zfc0Var.c();
        }
        if (!(fo00Var instanceof yn00)) {
            return new i2c0(0, 0);
        }
        kn1 d = zfc0Var.d();
        return new i2c0(((i2c0) d.w).a, d.c);
    }

    @Override // defpackage.jp90
    public n4u0 e() {
        return (r0) this.b;
    }

    @Override // defpackage.t65
    public PointF f(Object obj, c3c0 c3c0Var) {
        i5c0 i5c0Var = (i5c0) this.b;
        d3c0 d3c0Var = new d3c0(c3c0Var);
        i5c0Var.getClass();
        kn00 kn00Var = (kn00) obj;
        return kn00Var instanceof hn00 ? i5c0Var.f.f((hn00) kn00Var, i5c0.w(d3c0Var)) : i5c0.f(d3c0Var);
    }

    @Override // defpackage.uub0
    public f2c0 g(ArrayList arrayList) {
        throw new IllegalStateException("imageSuperCluster called on non-clustering provider");
    }

    @Override // defpackage.q87
    public Object getContent() {
        return (a2) this.b;
    }

    @Override // defpackage.t65
    public i2c0 h(Object obj, c3c0 c3c0Var) {
        return ((i5c0) this.b).v(obj, new d3c0(c3c0Var));
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        PaymentKitError paymentKitError = (PaymentKitError) obj;
        wve0 wve0Var = (wve0) this.b;
        ResultScreenClosing resultScreenClosing = wve0Var.A;
        dy40 dy40Var = wve0Var.D;
        boolean hideFinalState$paymentsdk_release = resultScreenClosing.hideFinalState$paymentsdk_release();
        dy40 dy40Var2 = wve0Var.B;
        rve0 rve0Var = rve0.a;
        if (hideFinalState$paymentsdk_release) {
            dy40Var2.l(mve0.a);
            dy40Var.l(rve0Var);
        } else {
            dy40Var2.l(new lve0(false, paymentKitError));
            dy40Var.l(rve0Var);
            wve0Var.y.postDelayed(new ii30(15, wve0Var), 1500L);
        }
    }

    @Override // defpackage.t65
    public f2c0 j(Object obj, c3c0 c3c0Var) {
        return new lb51(((i5c0) this.b).m(obj, new d3c0(c3c0Var)));
    }

    @Override // defpackage.t65
    public f2c0 k(Object obj, boolean z) {
        return new lb51(((i5c0) this.b).i(obj, z));
    }

    @Override // defpackage.r89
    public void l(wx90 wx90Var) {
    }

    @Override // defpackage.t65
    public List m(Object obj) {
        Iterable g;
        i5c0 i5c0Var = (i5c0) this.b;
        i5c0Var.getClass();
        kn00 kn00Var = (kn00) obj;
        boolean z = kn00Var instanceof hn00;
        f5c0 f5c0Var = f5c0.b;
        g5c0 g5c0Var = g5c0.b;
        if (z) {
            hn00 hn00Var = (hn00) kn00Var;
            if (i5c0Var.f.n(hn00Var)) {
                g = EmptyList.a;
            } else {
                fo00 fo00Var = hn00Var.h;
                boolean z2 = fo00Var instanceof zn00;
                e5c0 e5c0Var = e5c0.b;
                g = (z2 || (fo00Var instanceof xn00)) ? Collections.singletonList(e5c0Var) : scc.g(g5c0Var, f5c0Var, e5c0Var);
            }
        } else {
            g = scc.g(g5c0Var, f5c0Var);
        }
        Iterable iterable = g;
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new c3c0((rcc0) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.t65
    public i2c0 n(Object obj, c3c0 c3c0Var) {
        return ((i5c0) this.b).t(obj, new d3c0(c3c0Var));
    }

    @Override // defpackage.abq0
    public void onBackPressed() {
        ((PhoneSelectModalView) this.b).onBackPressed();
    }

    @Override // defpackage.nlr
    public void onClose() {
        ((lma0) ((pma0) this.b).z.a).r(new qu(9));
    }

    @Override // defpackage.sj10
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        boolean showPopupMenu$lambda$0;
        e90 e90Var = ((k) this.b).d;
        if (e90Var == null) {
            return false;
        }
        showPopupMenu$lambda$0 = AddPhotocommentButtonView.showPopupMenu$lambda$0((AddPhotocommentButtonView) e90Var.b, (hki) e90Var.c, menuItem);
        return showPopupMenu$lambda$0;
    }

    @Override // defpackage.sj10
    public void onMenuModeChange(MenuBuilder menuBuilder) {
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj;
        boolean z;
        switch (this.a) {
            case 22:
                H(x920Var, da20Var);
                return;
            default:
                y4a0 y4a0Var = (y4a0) this.b;
                if (((a) y4a0Var.c) == null) {
                    return;
                }
                String str = x920Var.a;
                obj = x920Var.b;
                str.getClass();
                z = false;
                switch (str) {
                    case "create":
                        Map map = (Map) obj;
                        boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (z2) {
                                ywc0 ywc0Var = new ywc0(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode.HYBRID_ONLY, wrap);
                                d dVar = (d) ((a) y4a0Var.c).a;
                                d.f(19);
                                d.b(dVar, ywc0Var);
                                if (dVar.x.IsSurfaceControlEnabled()) {
                                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                                }
                                dVar.c(ywc0Var, false);
                                d.f(19);
                                if (dVar.x.IsSurfaceControlEnabled()) {
                                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                z = true;
                            }
                            long b = ((a) y4a0Var.c).b(new ywc0(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z ? PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                            if (b != -2) {
                                ((ba20) da20Var).success(Long.valueOf(b));
                                return;
                            } else {
                                if (!z) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                        } catch (IllegalStateException e) {
                            ((ba20) da20Var).error("error", Log.getStackTraceString(e), null);
                            return;
                        }
                    case "offset":
                        Map map2 = (Map) obj;
                        try {
                            ((a) y4a0Var.c).e(((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue(), ((Integer) map2.get("id")).intValue());
                            ((ba20) da20Var).success(null);
                            return;
                        } catch (IllegalStateException e2) {
                            ((ba20) da20Var).error("error", Log.getStackTraceString(e2), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj;
                        try {
                            ((a) y4a0Var.c).g(new zwc0(((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue(), ((Integer) map3.get("id")).intValue()), new y920((ba20) da20Var));
                            return;
                        } catch (IllegalStateException e3) {
                            ((ba20) da20Var).error("error", Log.getStackTraceString(e3), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((a) y4a0Var.c).a(((Integer) obj).intValue());
                            ((ba20) da20Var).success(null);
                            return;
                        } catch (IllegalStateException e4) {
                            ((ba20) da20Var).error("error", Log.getStackTraceString(e4), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((d) ((a) y4a0Var.c).a).K = ((Boolean) obj).booleanValue();
                            ((ba20) da20Var).success(null);
                            return;
                        } catch (IllegalStateException e5) {
                            ((ba20) da20Var).error("error", Log.getStackTraceString(e5), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj;
                        try {
                            ((a) y4a0Var.c).f(new axc0(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((ba20) da20Var).success(null);
                            return;
                        } catch (IllegalStateException e6) {
                            ((ba20) da20Var).error("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj;
                        try {
                            ((a) y4a0Var.c).h(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            ((ba20) da20Var).success(null);
                            return;
                        } catch (IllegalStateException e7) {
                            ((ba20) da20Var).error("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case "dispose":
                        try {
                            ((a) y4a0Var.c).c(((Integer) ((Map) obj).get("id")).intValue());
                            ((ba20) da20Var).success(null);
                            return;
                        } catch (IllegalStateException e8) {
                            ((ba20) da20Var).error("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    default:
                        ((ba20) da20Var).notImplemented();
                        return;
                }
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        wve0 wve0Var = (wve0) this.b;
        ResultScreenClosing resultScreenClosing = wve0Var.A;
        dy40 dy40Var = wve0Var.D;
        boolean hideSuccessState$paymentsdk_release = resultScreenClosing.hideSuccessState$paymentsdk_release();
        dy40 dy40Var2 = wve0Var.B;
        rve0 rve0Var = rve0.a;
        if (hideSuccessState$paymentsdk_release) {
            dy40Var2.l(mve0.a);
            dy40Var.l(rve0Var);
        } else {
            dy40Var2.l(new pve0(false));
            dy40Var.l(rve0Var);
            wve0Var.y.postDelayed(new ii30(15, wve0Var), 1500L);
        }
    }

    @Override // com.yandex.mapkit.map.Callback
    public void onTaskFinished() {
        ((sls) this.b).invoke();
    }

    @Override // defpackage.t65
    public PointF p(Object obj) {
        return ((i5c0) this.b).b(obj);
    }

    @Override // defpackage.uub0
    public i2c0 q(Object obj) {
        return ((i5c0) this.b).r(obj);
    }

    @Override // defpackage.t65
    public f2c0 r(Object obj) {
        ImageProvider n;
        i3y i3yVar;
        Bitmap a;
        k7v a2;
        i5c0 i5c0Var = (i5c0) this.b;
        i5c0Var.getClass();
        kn00 kn00Var = (kn00) obj;
        String str = null;
        if (kn00Var instanceof in00) {
            in00 in00Var = (in00) kn00Var;
            if (in00Var.b()) {
                if (in00Var instanceof gn00) {
                    fo00 fo00Var = ((gn00) kn00Var).f;
                    un00 un00Var = fo00Var instanceof un00 ? (un00) fo00Var : null;
                    ixy0 ixy0Var = un00Var != null ? un00Var.a : null;
                    if (ixy0Var != null && (a2 = ixy0Var.a(i5c0Var.c.getThemeType())) != null) {
                        str = a2.a;
                    }
                    if (str == null) {
                        str = "";
                    }
                    n = new zg21(i5c0Var.b, str, 0.5f, 0.5f, new ob0(8, i5c0Var));
                } else {
                    if (!(in00Var instanceof hn00)) {
                        w511.b();
                        return null;
                    }
                    zfc0 zfc0Var = i5c0Var.f;
                    zfc0Var.getClass();
                    i3y i3yVar2 = zfc0Var.l;
                    i3y i3yVar3 = zfc0Var.k;
                    i3y i3yVar4 = zfc0Var.t;
                    i3y i3yVar5 = zfc0Var.o;
                    i3y i3yVar6 = zfc0Var.s;
                    fo00 fo00Var2 = ((hn00) kn00Var).i;
                    if (fo00Var2 instanceof eo00) {
                        a = zfc0Var.b.a(((eo00) fo00Var2).a, ((Number) i3yVar3.getValue()).intValue(), ((Number) i3yVar3.getValue()).intValue(), (r24 & 8) != 0 ? 0 : ((Number) i3yVar2.getValue()).intValue(), (r24 & 16) != 0 ? 0 : ((Number) i3yVar2.getValue()).intValue(), (r24 & 32) != 0 ? 0 : ((Number) zfc0Var.m.getValue()).intValue(), (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? 0 : 0, (r24 & 256) == 0, null, null);
                        int intValue = ((Number) zfc0Var.i.getValue()).intValue();
                        int intValue2 = ((Number) zfc0Var.j.getValue()).intValue();
                        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float f = intValue / 2.0f;
                        float l = intValue2 - zfc0Var.l();
                        canvas.drawCircle(f, l, zfc0Var.l(), (Paint) i3yVar6.getValue());
                        canvas.drawCircle(f, l, ((Number) i3yVar5.getValue()).intValue(), (Paint) i3yVar4.getValue());
                        canvas.drawBitmap(a, 0.0f, 0.0f, new Paint(1));
                        n = ImageProvider.fromBitmap(createBitmap);
                    } else if (fo00Var2 instanceof bo00) {
                        bo00 bo00Var = (bo00) fo00Var2;
                        wcc0 k = zfc0Var.k(bo00Var);
                        yfc0 b = zfc0Var.b(k);
                        i2c0 i2c0Var = b.a;
                        int i = i2c0Var.a;
                        float f2 = b.d;
                        w040 w040Var = zfc0Var.d;
                        ofc0 ofc0Var = (ofc0) w040Var.b;
                        int i2 = (int) (ofc0Var.a * 1.2f);
                        int i3 = (int) (ofc0Var.b * 1.2f);
                        Pair g = w040Var.g(bo00Var.g);
                        Bitmap a3 = ((tcc0) w040Var.c).a(bo00Var.b, i2, i3, w040Var.h(), ((Number) ((i3y) w040Var.e).getValue()).intValue(), ((Number) ((i3y) w040Var.f).getValue()).intValue(), bo00Var.c, ((Number) ((i3y) w040Var.g).getValue()).intValue(), true, (Integer) g.getFirst(), (Integer) g.getSecond());
                        Bitmap bitmap = bo00Var.d;
                        if (bitmap != null) {
                            Canvas canvas2 = new Canvas(a3);
                            tcc0 tcc0Var = (tcc0) w040Var.c;
                            i3yVar = i3yVar4;
                            tcc0Var.getClass();
                            tcc0.c(canvas2, bitmap, w040Var.i(), (canvas2.getWidth() / 2) - (w040Var.i() / 2.0f), (canvas2.getHeight() / 2) - (w040Var.i() / 2.0f));
                        } else {
                            i3yVar = i3yVar4;
                        }
                        Bitmap createBitmap2 = Bitmap.createBitmap(b.b, b.c, Bitmap.Config.ARGB_8888);
                        Canvas canvas3 = new Canvas(createBitmap2);
                        float f3 = i / 2.0f;
                        float f4 = i2c0Var.b + f2 + b.e;
                        canvas3.drawCircle(f3, f4, zfc0Var.l(), (Paint) i3yVar6.getValue());
                        canvas3.drawCircle(f3, f4, ((Number) i3yVar5.getValue()).intValue(), (Paint) i3yVar.getValue());
                        canvas3.drawBitmap(a3, 0.0f, f2, new Paint(1));
                        if (k != null) {
                            canvas3.drawBitmap(((ddc0) zfc0Var.u.getValue()).b(k), i, ((r8 - r0.getHeight()) / 2.0f) + f2, new Paint(1));
                        }
                        n = ImageProvider.fromBitmap(createBitmap2);
                    } else if (fo00Var2 instanceof ao00) {
                        Bitmap e = zfc0Var.e.e(((ao00) fo00Var2).a);
                        i2c0 c = zfc0Var.c();
                        int i4 = c.a;
                        int i5 = c.b;
                        Bitmap createBitmap3 = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                        Canvas canvas4 = new Canvas(createBitmap3);
                        float f5 = i4 / 2.0f;
                        float l2 = i5 - zfc0Var.l();
                        canvas4.drawCircle(f5, l2, zfc0Var.l(), (Paint) i3yVar6.getValue());
                        canvas4.drawCircle(f5, l2, ((Number) i3yVar5.getValue()).intValue(), (Paint) i3yVar4.getValue());
                        canvas4.drawBitmap(e, 0.0f, 0.0f, new Paint(1));
                        n = ImageProvider.fromBitmap(createBitmap3);
                    } else if (fo00Var2 instanceof yn00) {
                        yn00 yn00Var = (yn00) fo00Var2;
                        kn1 d = zfc0Var.d();
                        int i6 = d.b;
                        int i7 = ((i2c0) d.w).a;
                        bu0 bu0Var = zfc0Var.f;
                        bu0Var.getClass();
                        Bitmap b2 = bu0Var.b(yn00Var.a, 1.2f);
                        zwy0 zwy0Var = yn00Var.b;
                        if (zwy0Var != null) {
                            bu0Var.c(b2, zwy0Var, 1.2f);
                        }
                        Bitmap createBitmap4 = Bitmap.createBitmap(i7, d.c, Bitmap.Config.ARGB_8888);
                        Canvas canvas5 = new Canvas(createBitmap4);
                        canvas5.drawBitmap(b2, 0.0f, 0.0f, new Paint(1));
                        float f6 = i7 / 2.0f;
                        float f7 = i6;
                        canvas5.drawCircle(f6, f7, zfc0Var.l(), (Paint) i3yVar6.getValue());
                        canvas5.drawCircle(f6, f7, ((Number) i3yVar5.getValue()).intValue(), (Paint) i3yVar4.getValue());
                        n = ImageProvider.fromBitmap(createBitmap4);
                    } else {
                        n = ImageProvider.fromBitmap((Bitmap) zfc0Var.b.c.getValue());
                    }
                }
                return new lb51(n);
            }
        }
        n = i5c0Var.n(null);
        return new lb51(n);
    }

    @Override // defpackage.r89
    public void s(anh anhVar) {
        n891.n(new xw90(10, this, anhVar));
    }

    @Override // defpackage.t65
    public PointF t(Object obj) {
        i5c0 i5c0Var = (i5c0) this.b;
        i5c0Var.getClass();
        kn00 kn00Var = (kn00) obj;
        if (!(kn00Var instanceof hn00)) {
            return new PointF(0.5f, 0.86f);
        }
        zfc0 zfc0Var = i5c0Var.f;
        zfc0Var.getClass();
        fo00 fo00Var = ((hn00) kn00Var).i;
        if (fo00Var instanceof bo00) {
            yfc0 b = zfc0Var.b(zfc0Var.k((bo00) fo00Var));
            float f = b.d;
            i2c0 i2c0Var = b.a;
            return new PointF(i2c0Var.a / (b.b * 2.0f), ((f + i2c0Var.b) + b.e) / b.c);
        }
        if (fo00Var instanceof yn00) {
            kn1 d = zfc0Var.d();
            return new PointF(0.5f, d.b / d.c);
        }
        if (!(fo00Var instanceof ao00)) {
            return new PointF(0.5f, 0.89f);
        }
        return new PointF(0.5f, (r5 - zfc0Var.l()) / zfc0Var.c().b);
    }

    @Override // defpackage.t65
    public f2c0 u(Object obj, c3c0 c3c0Var) {
        return new lb51(((i5c0) this.b).k(obj, new d3c0(c3c0Var)));
    }

    @Override // defpackage.uub0
    public i2c0 v(r7c r7cVar) {
        throw new IllegalStateException("sizeCluster called on non-clustering provider");
    }

    @Override // defpackage.nmo
    public wmo w() {
        return new wmo();
    }

    @Override // defpackage.q87
    public void write(OutputStream outputStream) {
        a2 a2Var = (a2) this.b;
        if (!(a2Var instanceof i3)) {
            byte[] encoded = a2Var.toASN1Primitive().getEncoded("DER");
            int i = 1;
            while ((encoded[i] & 255) > 127) {
                i++;
            }
            int i2 = i + 1;
            outputStream.write(encoded, i2, encoded.length - i2);
            return;
        }
        Iterator it = i3.z(a2Var).iterator();
        while (true) {
            b73 b73Var = (b73) it;
            if (!b73Var.hasNext()) {
                return;
            } else {
                outputStream.write(((a2) b73Var.next()).toASN1Primitive().getEncoded("DER"));
            }
        }
    }

    @Override // defpackage.uub0
    public i2c0 x(ArrayList arrayList) {
        throw new IllegalStateException("sizeSuperCluster called on non-clustering provider");
    }

    @Override // defpackage.t65
    public PointF z(Object obj) {
        ((i5c0) this.b).getClass();
        return j5c0.a;
    }

    public nw70(u2 u2Var, a2 a2Var) {
        this.a = 6;
        this.b = a2Var;
    }

    public nw70(ParksApi parksApi, cf90 cf90Var, bko bkoVar, ru.yandex.taxi.parks.a aVar, tt2 tt2Var) {
        this.a = 9;
        this.b = parksApi;
    }

    public /* synthetic */ nw70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public nw70(i4b0 i4b0Var) {
        this.a = 24;
        this.b = i4b0Var;
        new pxc0(this, 0).invoke(new DslAnimatorBuilder());
    }
}
