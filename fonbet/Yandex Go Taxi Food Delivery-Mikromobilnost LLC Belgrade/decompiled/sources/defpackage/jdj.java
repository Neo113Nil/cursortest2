package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.yandex.go.taxi.order.models.api.preorder.extraphone.ExtraPhoneContact;
import com.yandex.messaging.core.net.entities.GetStaffDataParam;
import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.CreateChannel;
import com.yandex.messaging.internal.CreateFamilyChat;
import com.yandex.messaging.internal.CreateGroupChat;
import com.yandex.messaging.internal.ExistingChat;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.net.a;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.dayspicker.DaysTimePicker;
import ru.yandex.taxi.preorder.extraphone.e;

/* loaded from: classes12.dex */
public final class jdj implements d4x, al7, puj0, izn, k8b, qt5, k5t0, vwo, rdq0, l6e0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;

    public jdj(JSONObject jSONObject) {
        String str;
        this.a = 4;
        this.c = new r9l(b4x.b("element", jSONObject), 1);
        String str2 = null;
        try {
            str = b4x.m("position", jSONObject);
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
            str = null;
        }
        if ("left".equals(str)) {
            this.b = "left";
        } else if ("right".equals(str)) {
            this.b = "right";
        } else {
            this.b = "left";
        }
        try {
            str2 = b4x.m("size", jSONObject);
        } catch (JSONException e2) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e2);
            }
        }
        if ("zero".equals(str2)) {
            this.w = "zero";
            return;
        }
        if ("xxs".equals(str2)) {
            this.w = "xxs";
            return;
        }
        if ("xs".equals(str2)) {
            this.w = "xs";
            return;
        }
        if ("s".equals(str2)) {
            this.w = "s";
            return;
        }
        if ("m".equals(str2)) {
            this.w = "m";
            return;
        }
        if ("l".equals(str2)) {
            this.w = "l";
            return;
        }
        if ("xl".equals(str2)) {
            this.w = "xl";
            return;
        }
        if ("xxl".equals(str2)) {
            this.w = "xxl";
        } else if ("match_parent".equals(str2)) {
            this.w = "match_parent";
        } else {
            this.w = "s";
        }
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        e eVar = (e) this.c;
        String str = bgq0Var.a;
        String str2 = bgq0Var.b;
        String str3 = ((dqe0) this.b).a.O.a;
        if (str3 == null) {
            str3 = "";
        }
        eVar.c.put(str3, new ExtraPhoneContact(str, str2));
        eVar.d.g(zy11.a);
        if (bgq0Var.c == SelectedFrom.CONTACTS) {
            b1 b1Var = (b1) ((u1n) this.w).c;
            b1Var.getClass();
            b1Var.a.a("ExtraPhoneContact.UserSelected", new HashMap(), 1, new HashMap());
        }
        b1 b1Var2 = (b1) ((u1n) this.w).c;
        b1Var2.getClass();
        b1Var2.a.a("ExtraPhoneContact.DoneButtonTapped", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.l6e0
    public Object a() {
        Object a = ((n6e0) this.w).a();
        if (a == null) {
            a = ((w7p) this.c).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                a.getClass().toString();
            }
        }
        if (a instanceof x7p) {
            ((x7p) a).d().a = false;
        }
        return a;
    }

    @Override // defpackage.l6e0
    public boolean a0(Object obj) {
        if (obj instanceof x7p) {
            ((x7p) obj).d().a = true;
        }
        ((y7p) this.b).h(obj);
        return ((n6e0) this.w).a0(obj);
    }

    @Override // defpackage.puj0
    public otj0 b(otj0 otj0Var, mg70 mg70Var) {
        Drawable drawable = (Drawable) otj0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((zz5) this.b).b(h16.c((b16) this.c, ((BitmapDrawable) drawable).getBitmap()), mg70Var);
        }
        if (drawable instanceof GifDrawable) {
            return ((ngt) this.w).b(otj0Var, mg70Var);
        }
        return null;
    }

    @Override // defpackage.k8b
    public Object c(ExistingChat existingChat) {
        d1o d1oVar = (d1o) this.w;
        return d1oVar.l(d1oVar.y.b(existingChat.id()), (aj20) this.c);
    }

    @Override // defpackage.k5t0
    public void cancel() {
        ((pjo) ((q66) this.w).x).cancel();
    }

    public x08 d(eoc eocVar) {
        t2r t2rVar = (t2r) this.c;
        a1r a1rVar = t2rVar.e;
        String str = eocVar.c;
        a1rVar.d.post(new v0r(a1rVar, str, 2));
        q2r q2rVar = (q2r) this.b;
        izq izqVar = (izq) this.w;
        if (!(eocVar instanceof hk51)) {
            h2r h2rVar = new h2r(0, t2rVar, eocVar);
            hzq b = t2rVar.d.b(izqVar, 0L);
            izq izqVar2 = b.b;
            q2rVar.x = izqVar2;
            oif0 oif0Var = new oif0(b.a, h2rVar);
            to3 to3Var = t2rVar.a;
            return to3Var.a.a(new ro3(to3Var, eocVar.a, str, izqVar2.b.a, oif0Var, q2rVar));
        }
        wwf wwfVar = t2rVar.f;
        hk51 hk51Var = (hk51) eocVar;
        wwfVar.getClass();
        z8g z8gVar = (z8g) wwfVar.a;
        p8g p8gVar = (p8g) wwfVar.b;
        d9g d9gVar = (d9g) wwfVar.c;
        yj51 yj51Var = (yj51) d9gVar.W0.get();
        Context context = d9gVar.b.a.a;
        q5z.i(context);
        kzq kzqVar = new kzq(context, (ras0) d9gVar.c.v1.get());
        a1r a1rVar2 = (a1r) p8gVar.T0.get();
        cfu cfuVar = new cfu();
        vse vseVar = (vse) z8gVar.g.get();
        a aVar = (a) p8gVar.n0.get();
        x22 x22Var = (x22) z8gVar.y.get();
        gl glVar = new gl();
        glVar.c = x22Var;
        glVar.w = izqVar;
        glVar.b = hk51Var.g;
        glVar.x = new HashMap();
        lqo lqoVar = z8gVar.a.d;
        q5z.i(lqoVar);
        return new gk51(hk51Var, q2rVar, yj51Var, kzqVar, a1rVar2, cfuVar, vseVar, aVar, glVar, lqoVar);
    }

    @Override // defpackage.k5t0
    public uis0 e() {
        return (mjo) this.c;
    }

    public zs90 f() {
        return new zs90(new gym(this), (at90) this.b, new jln(this));
    }

    @Override // defpackage.vwo
    public ViewGroup.LayoutParams g() {
        int i;
        int i2;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.w;
        i = extendedFloatingActionButton.originalWidth;
        int i3 = i == 0 ? -2 : extendedFloatingActionButton.originalWidth;
        i2 = extendedFloatingActionButton.originalHeight;
        return new ViewGroup.LayoutParams(i3, i2 != 0 ? extendedFloatingActionButton.originalHeight : -2);
    }

    @Override // defpackage.vwo
    public int getHeight() {
        int i;
        int i2;
        int i3;
        int i4;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.w;
        i = extendedFloatingActionButton.originalHeight;
        if (i == -1) {
            return ((zrm) this.c).getHeight();
        }
        i2 = extendedFloatingActionButton.originalHeight;
        if (i2 != 0) {
            i3 = extendedFloatingActionButton.originalHeight;
            if (i3 != -2) {
                i4 = extendedFloatingActionButton.originalHeight;
                return i4;
            }
        }
        return ((ExtendedFloatingActionButton) ((mum) this.b).a).getMeasuredHeight();
    }

    @Override // defpackage.vwo
    public int getPaddingEnd() {
        int i;
        i = ((ExtendedFloatingActionButton) this.w).extendedPaddingEnd;
        return i;
    }

    @Override // defpackage.vwo
    public int getPaddingStart() {
        int i;
        i = ((ExtendedFloatingActionButton) this.w).extendedPaddingStart;
        return i;
    }

    @Override // defpackage.k5t0
    public y9t0 getSource() {
        return (njo) this.b;
    }

    @Override // defpackage.vwo
    public int getWidth() {
        int i;
        int i2;
        int i3;
        int i4;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.w;
        i = extendedFloatingActionButton.originalWidth;
        if (i == -1) {
            return ((zrm) this.c).getWidth();
        }
        i2 = extendedFloatingActionButton.originalWidth;
        if (i2 != 0) {
            i3 = extendedFloatingActionButton.originalWidth;
            if (i3 != -2) {
                i4 = extendedFloatingActionButton.originalWidth;
                return i4;
            }
        }
        return ((mum) this.b).getWidth();
    }

    public mzn h(int i) {
        izn iznVar = (izn) this.c;
        HashMap hashMap = (HashMap) this.w;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (mzn) hashMap.get(Integer.valueOf(i));
        }
        e64 e64Var = null;
        if (iznVar.s(i)) {
            mzn o = iznVar.o(i);
            q8n q8nVar = (q8n) this.b;
            if (o != null) {
                ArrayList arrayList = new ArrayList();
                for (lzn lznVar : o.d()) {
                    if (t8n.a(lznVar, q8nVar)) {
                        arrayList.add(lznVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    e64Var = kzn.e(o.c(), o.a(), o.b(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), e64Var);
        }
        return e64Var;
    }

    public void i(String str) {
        fva0.b((fva0) this.c, oyr.p("Eats.", ((h1p) this.w).getValue(), ".Authorization"), null, new wwb(str, 27), 2);
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object j(CreateChannel createChannel) {
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object k(InviteThread inviteThread) {
        return null;
    }

    public void l(swm swmVar, swm swmVar2) {
        ((View) this.c).setVisibility(8);
        ((ListItemComponent) this.b).setVisibility(8);
        DaysTimePicker daysTimePicker = (DaysTimePicker) this.w;
        daysTimePicker.setVisibility(0);
        j7z0 j7z0Var = swmVar.c;
        j7z0 j7z0Var2 = swmVar2.c;
        if (j7z0Var != j7z0Var2) {
            daysTimePicker.setValues(j7z0Var2, swmVar2.d);
        }
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object m(InviteChat inviteChat) {
        return null;
    }

    @Override // defpackage.k8b
    public Object n(StaffChat staffChat) {
        d1o d1oVar = (d1o) this.w;
        d9g d9gVar = (d9g) ((cl21) this.b);
        to3 a = d9gVar.a();
        gym gymVar = new gym(d1oVar);
        String nickname = staffChat.nickname();
        a.getClass();
        GetStaffDataParam getStaffDataParam = new GetStaffDataParam();
        getStaffDataParam.nickname = nickname;
        return new h4b(1, a.a.a(new io3(14, a, getStaffDataParam, gymVar)), new h7b(d9gVar.c(), staffChat, new uhm(21, d1oVar)));
    }

    @Override // defpackage.izn
    public mzn o(int i) {
        return h(i);
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        ew2 ew2Var = (ew2) ((q4g) this.c).c;
        String message = iOException.getMessage();
        if (message == null) {
            message = "";
        }
        ew2Var.c("wm_download_file_error", gw00.e(new Pair(Constants.KEY_MESSAGE, message)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[SYNTHETIC] */
    @Override // defpackage.al7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        List W;
        List W2;
        String str;
        List W3;
        q4g q4gVar = (q4g) this.c;
        if (!kvj0Var.J) {
            ((ew2) q4gVar.c).c("wm_download_file_error", b.i(new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, Integer.valueOf(kvj0Var.w)), new Pair(Constants.KEY_MESSAGE, kvj0Var.c)));
            return;
        }
        String a = kvj0Var.y.a("Content-Disposition");
        if (a == null) {
            a = null;
        }
        if (a == null) {
            a = "";
        }
        q4gVar.getClass();
        W = evu0.W(a, new String[]{Extension.SEMICOLON_SPACE}, (r2 & 4) != 0 ? 0 : 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = W.iterator();
        while (it.hasNext()) {
            W2 = evu0.W((String) it.next(), new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
            if (W2.size() == 2) {
                String str2 = (String) kotlin.collections.a.P(W2);
                if (jl40.l(str2, "filename")) {
                    str = (String) kotlin.collections.a.Z(W2);
                } else if (jl40.l(str2, "filename*")) {
                    W3 = evu0.W((String) kotlin.collections.a.Z(W2), new String[]{"''"}, (r2 & 4) != 0 ? 0 : 2);
                    str = (String) kotlin.collections.a.b0(W3);
                }
                if (str == null) {
                    arrayList.add(str);
                }
            }
            str = null;
            if (str == null) {
            }
        }
        String str3 = (String) kotlin.collections.a.R(arrayList);
        String T = str3 != null ? evu0.T(str3, "\"", "\"") : null;
        if (T == null) {
            ((ew2) q4gVar.c).c("wm_download_file_error", b.i(new Pair(Constants.KEY_MESSAGE, "no filename in Content-Disposition header"), new Pair("header", a), new Pair("url", kvj0Var.a.a.i)));
            return;
        }
        DownloadManager.Request request = new DownloadManager.Request((Uri) this.b);
        request.setTitle(T);
        request.setDescription(((FragmentActivity) q4gVar.b).getString(qyh0.download_descr));
        request.allowScanningByMediaScanner();
        String g = ((rl3) q4gVar.w).g();
        if (g != null) {
            request.addRequestHeader("Authorization", g);
        }
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, T);
        ((DownloadManager) this.w).enqueue(request);
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object p(ChatAlias chatAlias) {
        return null;
    }

    @Override // defpackage.qt5
    public void q(ByteBuffer byteBuffer, yfg yfgVar) {
        AtomicReference atomicReference = (AtomicReference) this.b;
        zeo zeoVar = (zeo) this.c;
        afo afoVar = (afo) this.w;
        String str = afoVar.b;
        fa20 fa20Var = afoVar.c;
        x920 a = fa20Var.a(byteBuffer);
        String str2 = a.a;
        Object obj = a.b;
        if (!str2.equals("listen")) {
            if (!str2.equals("cancel")) {
                yfgVar.a(null);
                return;
            }
            if (((xeo) atomicReference.getAndSet(null)) == null) {
                yfgVar.a(fa20Var.d("error", "No active stream to cancel", null));
                return;
            }
            try {
                zeoVar.onCancel(obj);
                yfgVar.a(fa20Var.e(null));
                return;
            } catch (RuntimeException e) {
                Log.e("EventChannel#" + str, "Failed to close event stream", e);
                yfgVar.a(fa20Var.d("error", e.getMessage(), null));
                return;
            }
        }
        yeo yeoVar = new yeo(this);
        if (((xeo) atomicReference.getAndSet(yeoVar)) != null) {
            try {
                zeoVar.onCancel(null);
            } catch (RuntimeException e2) {
                Log.e("EventChannel#" + str, "Failed to close existing event stream", e2);
            }
        }
        try {
            zeoVar.onListen(obj, yeoVar);
            yfgVar.a(fa20Var.e(null));
        } catch (RuntimeException e3) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str, "Failed to open event stream", e3);
            yfgVar.a(fa20Var.d("error", e3.getMessage(), null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c7, code lost:
    
        if (r7 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d2, code lost:
    
        if (r8 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dd, code lost:
    
        if (r8 > 0) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(udb udbVar, List list, ph9 ph9Var) {
        boolean z;
        String str = udbVar.b;
        i3y i3yVar = (i3y) this.w;
        Set N0 = kotlin.collections.a.N0((List) androidx.room.util.a.b(((g4r) i3yVar.getValue()).a, true, false, new vsq(str, 2)));
        String str2 = udbVar.b;
        int i = udbVar.e;
        long j = udbVar.i;
        boolean z2 = udbVar.m;
        boolean z3 = udbVar.o;
        long j2 = udbVar.A;
        long j3 = udbVar.B;
        boolean a = ChatFlags.a(j, 1L);
        boolean a2 = ChatFlags.a(j, 4L);
        boolean a3 = ChatFlags.a(j, 128L);
        boolean a4 = ChatFlags.a(j, 8L);
        boolean b = ChatNamespaces.b(str2);
        boolean z4 = z2 || z3;
        ChatNamespaces.a(str2);
        if (!a4 && !a2 && !a && !ChatId.Companion.f(str2)) {
            ChatNamespaces.b(str2);
        }
        ChatId.Companion.b(str2);
        if (j2 <= 0 || j3 == -1 || !z4) {
        }
        z83.c(null, z2 && z3);
        if (a3) {
            z83.i();
        }
        p1b p1bVar = (p1b) this.b;
        List<k4r> list2 = list;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (k4r k4rVar : list2) {
            String str3 = k4rVar.a;
            Set set = k4rVar.b;
            boolean z5 = a4;
            ArrayList arrayList2 = new ArrayList(tcc.n(set, i2));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Iterator it2 = it;
                Object obj = (zcb) zcb.b.get(Integer.valueOf(intValue));
                if (obj == null) {
                    obj = new xcb(intValue);
                }
                arrayList2.add(obj);
                it = it2;
            }
            arrayList.add(new yvr(str3, kotlin.collections.a.N0(arrayList2), k4rVar.c));
            a4 = z5;
            i2 = 10;
        }
        boolean z6 = a4;
        p1bVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            yvr yvrVar = (yvr) next;
            y5b y5bVar = (y5b) p1bVar.a;
            Set set2 = yvrVar.c;
            y5bVar.getClass();
            if (!set2.isEmpty()) {
                int b2 = ChatId.Companion.b(str2);
                Set set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it4 = set3.iterator();
                    while (it4.hasNext()) {
                        if (((Number) it4.next()).intValue() == b2) {
                        }
                    }
                }
            }
            adb adbVar = (adb) p1bVar.b;
            Set set4 = yvrVar.b;
            adbVar.getClass();
            if (!set4.isEmpty()) {
                Set<zcb> set5 = set4;
                if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                    for (zcb zcbVar : set5) {
                        if (jl40.l(zcbVar, rcb.c)) {
                            z = a2;
                        } else if (jl40.l(zcbVar, scb.c)) {
                            z = b;
                        } else if (jl40.l(zcbVar, tcb.c)) {
                            if (!a) {
                            }
                            z = false;
                        } else if (jl40.l(zcbVar, ucb.c)) {
                            if (!z6) {
                                if (a) {
                                }
                                z = false;
                            }
                            z = true;
                        } else if (!jl40.l(zcbVar, vcb.c)) {
                            if (!jl40.l(zcbVar, ycb.c)) {
                                if (jl40.l(zcbVar, wcb.c)) {
                                    z = a3;
                                } else {
                                    if (!(zcbVar instanceof xcb)) {
                                        w511.b();
                                        return;
                                    }
                                    z83.i();
                                }
                            }
                            z = false;
                        }
                        if (z) {
                        }
                    }
                }
            }
            arrayList3.add(next);
        }
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((yvr) it5.next()).a);
        }
        Set N02 = kotlin.collections.a.N0(arrayList4);
        if (N0.equals(N02)) {
            return;
        }
        Set set6 = N0;
        Set set7 = N02;
        Set M0 = kotlin.collections.a.M0(set6);
        ycc.r(set7, M0);
        LinkedHashSet y0 = kotlin.collections.a.y0(M0, kotlin.collections.a.U(set6, set7));
        g4r g4rVar = (g4r) i3yVar.getValue();
        androidx.room.util.a.b(g4rVar.a, false, true, new ynn(1, g4rVar, str, kotlin.collections.a.J0(set7)));
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = y0.iterator();
        while (it6.hasNext()) {
            ycc.r((List) androidx.room.util.a.b(((g4r) i3yVar.getValue()).a, true, false, new vsq((String) it6.next(), 1)), arrayList5);
        }
        Set N03 = kotlin.collections.a.N0(arrayList5);
        if (N03.isEmpty()) {
            return;
        }
        ph9Var.d(EmptySet.a, N03);
    }

    @Override // defpackage.izn
    public boolean s(int i) {
        return ((izn) this.c).s(i) && h(i) != null;
    }

    @Override // defpackage.k8b
    public Object t(ThreadChat threadChat) {
        d9g d9gVar = (d9g) ((cl21) this.b);
        d9gVar.getClass();
        return new b1s(new c1s((h9b) d9gVar.H.get()), threadChat, new c1o(0, this));
    }

    public String toString() {
        switch (this.a) {
            case 4:
                tjz0 tjz0Var = new tjz0();
                tjz0Var.a((r9l) this.c, "element");
                tjz0Var.a((String) this.b, "position");
                tjz0Var.a((String) this.w, "size");
                return tjz0Var.a.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object u(CreateFamilyChat createFamilyChat) {
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object v() {
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object w(CreateGroupChat createGroupChat) {
        return null;
    }

    @Override // defpackage.k8b
    public Object z(PrivateChat privateChat) {
        d1o d1oVar = (d1o) this.w;
        return new h4b(2, d1oVar.l(privateChat.addressee(), (aj20) this.c), new h7b(((d9g) ((cl21) this.b)).c(), privateChat, new uhm(21, d1oVar)));
    }

    public /* synthetic */ jdj(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.w = obj3;
    }

    public /* synthetic */ jdj(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.w = xvf0Var3;
    }

    public /* synthetic */ jdj(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.w = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public jdj(me1 me1Var, i4u i4uVar) {
        this.a = 28;
        this.c = me1Var;
        this.b = i4uVar;
        this.w = new LinkedHashMap();
    }

    public jdj(Context context, String str, String str2) {
        this.a = 7;
        this.c = str;
        this.b = str2;
        this.w = context.getApplicationContext();
    }

    public jdj(k020 k020Var, at2 at2Var, lqo lqoVar) {
        this.a = 29;
        this.c = k020Var;
        this.b = lqoVar;
        this.w = kotlin.a.a(new neb(at2Var, 2));
    }

    public jdj(at2 at2Var, p1b p1bVar) {
        this.a = 26;
        this.c = at2Var;
        this.b = p1bVar;
        this.w = kotlin.a.a(new c1o(24, this));
    }

    public jdj(izf izfVar, n3w n3wVar, izf izfVar2) {
        this.a = 9;
        this.c = izfVar;
        this.w = n3wVar;
        this.b = izfVar2;
    }

    public jdj(izn iznVar, q8n q8nVar) {
        this.a = 11;
        this.w = new HashMap();
        this.c = iznVar;
        this.b = q8nVar;
    }

    public jdj(q66 q66Var) {
        this.a = 19;
        this.w = q66Var;
        pjo pjoVar = (pjo) q66Var.x;
        this.c = new mjo(q66Var, pjoVar.c().e(), -1L, true);
        this.b = new njo(q66Var, pjoVar.c().getSource(), -1L, true);
    }

    public jdj(afo afoVar, zeo zeoVar) {
        this.a = 17;
        this.w = afoVar;
        this.b = new AtomicReference(null);
        this.c = zeoVar;
    }

    public jdj(Signature signature) {
        this.a = 27;
        this.c = signature;
        this.b = null;
        this.w = null;
    }

    public jdj(Cipher cipher) {
        this.a = 27;
        this.b = cipher;
        this.c = null;
        this.w = null;
    }

    public jdj(Mac mac) {
        this.a = 27;
        this.w = mac;
        this.b = null;
        this.c = null;
    }

    public jdj(int i) {
        this.a = i;
        switch (i) {
            case 13:
                break;
            default:
                this.c = new int[10];
                this.b = new int[10];
                this.w = new int[10];
                break;
        }
    }

    public jdj(c cVar, com.bumptech.glide.request.a aVar, x1o x1oVar) {
        this.a = 15;
        this.w = cVar;
        this.b = aVar;
        this.c = x1oVar;
    }
}
