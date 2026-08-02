package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.compose.ui.layout.i;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.FileProvider;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.yandex.go.order.state.instructions.InstructionItemButton;
import com.yandex.go.order.state.instructions.InstructionItemButtonAction;
import com.yandex.go.order.state.instructions.InstructionItemButtonActionType;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;
import com.yandex.go.order.state.instructions.ScheduledOrderItemActionType;
import com.yandex.go.payments.lpm.domain.e;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Animation;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$BezierRoute;
import com.yandex.messaging.MessagingFileProvider;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messenger.websdk.internal.web.MessageType;
import com.ybsdk.feature.persistence.api.StorageType;
import defpackage.xeo;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b;
import kotlin.text.Regex;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.json.JSONObject;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.maas.api.analytics.MultiTransportErrorAnalytics$ErrorButton;
import ru.yandex.taxi.maas.api.analytics.MultiTransportErrorAnalytics$ErrorCode;
import ru.yandex.taxi.maas.impl.ride.metropick.a;
import ru.yandex.taxi.widget.InstructionsView;
import ru.yandex.yx_platform_api.LockScreenReceiver;
import ru.yandex.yx_platform_api.LockScreenStreamHandler$onListen$2;

/* loaded from: classes12.dex */
public class hdu implements xie, hkx, ryu0, zeo, nsd0, ta00, z820, nry0 {
    public final Object a;
    public Object b;

    public hdu(View view) {
        this.a = view;
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        this.b = inputMethodManager;
        view.setOnFocusChangeListener(new bk(22, this));
        if (view.hasWindowFocus()) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            if (view.hasFocus()) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public static JSONObject n(hdu hduVar, MessageType messageType, JSONObject jSONObject, String str) {
        hduVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("channelId", (String) hduVar.b);
        if (str == null) {
            str = udq0.F();
        }
        jSONObject2.put("id", str);
        jSONObject2.put("type", messageType.getRawValue());
        if (jSONObject != null) {
            jSONObject2.put(Constants.KEY_DATA, jSONObject);
        }
        return jSONObject2;
    }

    @Override // defpackage.ryu0
    public boolean a(h2r h2rVar) {
        return true;
    }

    @Override // defpackage.ryu0
    public syu0 apply() {
        return ((i) this.a).d(this.b);
    }

    @Override // defpackage.ryu0
    public boolean b() {
        return true;
    }

    @Override // defpackage.hkx
    public void c(KeyEvent keyEvent, wvb1 wvb1Var) {
        int action = keyEvent.getAction();
        int i = 0;
        if (action != 0 && action != 1) {
            wvb1Var.j(false);
            return;
        }
        Character a = ((gkx) this.b).a(keyEvent.getUnicodeChar());
        boolean z = action != 0;
        fix fixVar = (fix) this.a;
        uhx uhxVar = new uhx(i, wvb1Var);
        m2v m2vVar = fixVar.a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", ConstantDeviceInfo.APP_PLATFORM);
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        m2vVar.z(hashMap, new nd2(2, uhxVar));
    }

    @Override // defpackage.ryu0
    public void cancel() {
    }

    @Override // defpackage.nsd0
    public void d(wqw wqwVar) {
        if (((z80) wqwVar).b) {
            z80 z80Var = (z80) wqwVar;
            PaymentMethod$Type a = z80Var.e().a();
            if (a == null) {
                return;
            }
            ((e) this.a).c(z80Var.c(), a);
            wls wlsVar = (wls) this.b;
            if (wlsVar != null) {
                wlsVar.invoke(z80Var.c(), a);
            }
        }
    }

    @Override // defpackage.nry0
    public boolean e(CharSequence charSequence) {
        TextView textView = (TextView) this.a;
        if (charSequence == null || evu0.J(charSequence)) {
            return true;
        }
        int intValue = (((Number) ((sls) this.b).invoke()).intValue() - textView.getPaddingStart()) - textView.getPaddingEnd();
        return intValue > 0 && new StaticLayout(charSequence, textView.getPaint(), intValue, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= textView.getMaxLines();
    }

    public void f(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        ((ConcurrentHashMap) this.a).put(((nf00) this.b).f(phonemetadata$PhoneMetadata), phonemetadata$PhoneMetadata);
    }

    public List g() {
        a aVar = (a) this.b;
        if (!jl40.l(aVar.J, ik50.d) && aVar.J.a.isEmpty()) {
            return Collections.singletonList(MultiTransportErrorAnalytics$ErrorButton.Close.getEventValue());
        }
        k4o a = MultiTransportErrorAnalytics$ErrorButton.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator<E> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((MultiTransportErrorAnalytics$ErrorButton) it.next()).getEventValue());
        }
        return arrayList;
    }

    @Override // defpackage.xie
    public OutputStream getOutputStream() {
        xp6 xp6Var = (xp6) this.b;
        if (xp6Var != null) {
            return xp6Var;
        }
        ny61.r("verifier not initialised");
        return null;
    }

    public Map h() {
        Map map = (Map) ((oz01) this.a).c.get("common_strings");
        return map == null ? b.f() : map;
    }

    public h2t i(MessageData messageData) {
        if (messageData instanceof ImageMessageData) {
            return m(gvg0.chat_image_message_height, ((ImageMessageData) messageData).fileId);
        }
        if (!(messageData instanceof StickerMessageData)) {
            return null;
        }
        return m(gvg0.emoji_sticker_image_height, ((StickerMessageData) messageData).id);
    }

    public SharedPreferences j() {
        return (SharedPreferences) this.a;
    }

    public SharedPreferences k() {
        return (SharedPreferences) this.b;
    }

    public o9y l(zmk zmkVar) {
        w53 w53Var = (w53) this.b;
        o9y o9yVar = (o9y) w53Var.get(zmkVar);
        if (o9yVar == null) {
            String str = (String) ((q9y) this.a).a.get(zmkVar.a);
            o9yVar = str != null ? new o9y(Integer.parseInt(str)) : null;
            w53Var.put(zmkVar, o9yVar);
        }
        return o9yVar;
    }

    public h2t m(int i, String str) {
        Context context = (Context) this.a;
        if (str != null) {
            try {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
                yn50 yn50Var = (yn50) ((xav) this.b).load(com.yandex.messaging.internal.images.b.f(str));
                xn50 xn50Var = yn50Var.b;
                xn50Var.i = dimensionPixelSize;
                xn50Var.j = dimensionPixelSize;
                Uri c = yn50Var.c(new k9v());
                String path = c != null ? c.getPath() : null;
                if (path != null) {
                    sz10 sz10Var = MessagingFileProvider.Companion;
                    File file = new File(path);
                    sz10Var.getClass();
                    return new h2t(FileProvider.getUriForFile(context, context.getPackageName() + ".messaging.fileprovider", file));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public n1v o(atj0 atj0Var, zzs zzsVar, zzs zzsVar2, CharSequence charSequence) {
        if (atj0Var instanceof vsj0) {
            return new k1v(((vsj0) atj0Var).a);
        }
        if (atj0Var instanceof zsj0) {
            return new m1v(((zsj0) atj0Var).a, charSequence);
        }
        if (atj0Var instanceof ysj0) {
            return new l1v(((ysj0) atj0Var).a);
        }
        if (!(atj0Var instanceof wsj0) && !(atj0Var instanceof xsj0) && zzsVar != null && zzsVar2 != null) {
            q6l0 c = ((oo5) ((mo5) this.a)).c(zzsVar, zzsVar2, new MapRouteAppearance$BezierRoute(Collections.singletonList((Float[]) this.b), "l:#5C5A57;d:#E8EBED", Float.valueOf(3.0f), 64, Float.valueOf(1.0f), new MapRouteAppearance$Animation(MapRouteAppearance$AnimationType.EASY_BOTH, 600L), Float.valueOf(100.0f)));
            if (c != null) {
                if (c.a.size() < 2) {
                    c = null;
                }
                if (c != null) {
                    return new j1v(c);
                }
            }
        }
        return null;
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        LockScreenStreamHandler$onListen$2 lockScreenStreamHandler$onListen$2 = (LockScreenStreamHandler$onListen$2) this.b;
        if (lockScreenStreamHandler$onListen$2 != null) {
            ((Context) this.a).unregisterReceiver(lockScreenStreamHandler$onListen$2);
        }
        this.b = null;
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, final xeo xeoVar) {
        Context context = (Context) this.a;
        LockScreenStreamHandler$onListen$2 lockScreenStreamHandler$onListen$2 = (LockScreenStreamHandler$onListen$2) this.b;
        if (lockScreenStreamHandler$onListen$2 != null) {
            context.unregisterReceiver(lockScreenStreamHandler$onListen$2);
        }
        LockScreenReceiver lockScreenReceiver = new LockScreenReceiver() { // from class: ru.yandex.yx_platform_api.LockScreenStreamHandler$onListen$2
            @Override // ru.yandex.yx_platform_api.LockScreenReceiver
            public void onLockStateChanged(boolean isLocked) {
                xeo.this.success(Boolean.valueOf(isLocked));
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(lockScreenReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(lockScreenReceiver, intentFilter);
        }
        this.b = lockScreenReceiver;
    }

    public void p(boolean z) {
        pj pjVar = (pj) this.a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        pjVar.a.a("AutoEnableUserLiveLocation", hashMap, 1, x4e.r(z, hashMap, "sharing_state"));
    }

    public void q(MultiTransportErrorAnalytics$ErrorCode multiTransportErrorAnalytics$ErrorCode) {
        co40 co40Var = (co40) ((r1s) this.a).w;
        List g = g();
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", g);
        hashMap.put("error_code", multiTransportErrorAnalytics$ErrorCode.getEventValue());
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        co40Var.a.a(sb2.q("MultiTransportErrorShown", hashMap), hashMap, 1, hashMap2);
    }

    public void r(MultiTransportErrorAnalytics$ErrorButton multiTransportErrorAnalytics$ErrorButton, MultiTransportErrorAnalytics$ErrorCode multiTransportErrorAnalytics$ErrorCode) {
        co40 co40Var = (co40) ((r1s) this.a).w;
        List g = g();
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", g);
        hashMap.put("error_code", multiTransportErrorAnalytics$ErrorCode.getEventValue());
        hashMap.put("button_name", multiTransportErrorAnalytics$ErrorButton.getEventValue());
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        co40Var.a.a(sb2.q("MultiTransportErrorTapped", hashMap), hashMap, 1, hashMap2);
    }

    public void s(swm swmVar, boolean z) {
        List list = z ? swmVar.e : swmVar.f;
        boolean isEmpty = list.isEmpty();
        if (!isEmpty) {
            InstructionsView instructionsView = (InstructionsView) this.a;
            List<x3w> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (x3w x3wVar : list2) {
                String a = x3wVar.getA();
                String b = x3wVar.getB();
                String c = x3wVar.getC();
                int c2 = x3wVar.c();
                ScheduledOrderItemAction f = x3wVar.getF();
                v3w v3wVar = null;
                lvm lvmVar = (f != null ? f.a : null) == ScheduledOrderItemActionType.SELECT_TIME_SLOT ? new lvm(f.b) : null;
                InstructionItemButton e = x3wVar.getE();
                if (e != null) {
                    InstructionItemButtonAction instructionItemButtonAction = e.b;
                    kvm kvmVar = (instructionItemButtonAction != null ? instructionItemButtonAction.a : null) == InstructionItemButtonActionType.REMOVE_PREORDER ? kvm.a : null;
                    if (kvmVar != null) {
                        v3wVar = new v3w(e.a, kvmVar);
                    }
                }
                arrayList.add(new h4w(a, b, c, c2, lvmVar, v3wVar));
            }
            instructionsView.setInstructions(arrayList);
        }
        ((Group) this.b).setVisibility(!isEmpty ? 0 : 8);
    }

    @Override // defpackage.xie
    public boolean verify(byte[] bArr) {
        try {
            return ((Signature) this.a).verify(bArr);
        } catch (SignatureException e) {
            throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
        }
    }

    public hdu(Signature signature) {
        this.a = signature;
        xp6 xp6Var = new xp6(2);
        xp6Var.b = signature;
        this.b = xp6Var;
    }

    public hdu(ssr ssrVar) {
        this.a = ssrVar.f;
        this.b = ssrVar.a;
    }

    public hdu(q9y q9yVar) {
        this.a = q9yVar;
        this.b = new w53();
    }

    public /* synthetic */ hdu(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public hdu(mo5 mo5Var) {
        this.a = mo5Var;
        this.b = new Float[]{Float.valueOf(0.5f), Float.valueOf(0.18f)};
    }

    public hdu(fix fixVar) {
        this.b = new gkx();
        this.a = fixVar;
    }

    public hdu(Context context) {
        this.a = context;
    }

    public hdu(xwc xwcVar, ouu ouuVar, bbj bbjVar) {
        this.a = ouuVar;
        this.b = bbjVar;
    }

    public hdu(nf00 nf00Var) {
        this.a = new ConcurrentHashMap();
        this.b = nf00Var;
    }

    public hdu(ufg ufgVar) {
        h2t h2tVar = new h2t(this);
        ea20 ea20Var = new ea20(ufgVar, "flutter/localization", qtb1.G, null);
        this.a = ea20Var;
        ea20Var.b(h2tVar);
    }

    public hdu(a aVar) {
        this.b = aVar;
        this.a = aVar.A;
    }

    public hdu(a1b0 a1b0Var) {
        c1b0 c1b0Var = (c1b0) a1b0Var;
        this.a = c1b0Var.a(StorageType.PERMISSIONS);
        this.b = c1b0Var.a(StorageType.PERMISSIONS_ONCE_PER_INSTALL);
    }
}
