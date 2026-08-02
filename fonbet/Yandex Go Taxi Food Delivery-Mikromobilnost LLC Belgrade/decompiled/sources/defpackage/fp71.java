package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.TypedValue;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.monetization.ads.network.ssl.browser.ssl.CustomCertificatesProvider;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.X509TrustManager;
import kotlin.a;
import kotlin.collections.b;
import org.json.JSONObject;
import yads.am3;
import yads.e42;
import yads.eq0;
import yads.ih3;
import yads.o11;
import yads.og3;
import yads.pf1;
import yads.q63;
import yads.t52;
import yads.t92;
import yads.tu2;
import yads.xb;
import yads.xz;
import yads.yl2;

/* loaded from: classes7.dex */
public final class fp71 implements io61, wq71 {
    public final Object a;
    public final Object b;
    public Object c;
    public Object w;
    public Object x;

    public fp71(Context context) {
        String c;
        r191 a = bv81.a(context);
        v371 v371Var = new v371(context);
        pf1 a2 = s881.a(context, "YadPreferenceFile");
        Object obj = new Object();
        this.a = a;
        this.b = v371Var;
        this.x = context.getApplicationContext();
        this.c = o11.b;
        synchronized (nea1.a) {
            synchronized (obj) {
                c = a2.c("YmadMauid");
            }
            if (c == null) {
                c = cvu0.v(UUID.randomUUID().toString(), "-", "", false).toLowerCase(Locale.ROOT);
                synchronized (obj) {
                    a2.a("YmadMauid", c);
                }
            }
        }
        this.w = c;
    }

    @Override // defpackage.io61
    public in71 a(String str, String str2, dj81 dj81Var) {
        Context context = (Context) this.x;
        Object obj = this.a;
        Context context2 = ((n291) ((v981) this.b)).a;
        ge71 c = wha1.c(context2, context2);
        zy61 zy61Var = new zy61(context, (fe81) obj, c, str, str2, new sl81(new gh61(context, c)), (i971) this.c, dj81Var, new i871(), wt71.a(context), 7168, 1);
        nl61 nl61Var = ((fe81) obj).e;
        ((ru81) this.w).getClass();
        return zy61Var;
    }

    @Override // defpackage.wq71
    public void b(dl61 dl61Var) {
        String str = dl61Var.b;
        xrr xrrVar = (xrr) this.c;
        String str2 = dl61Var.c;
        xrrVar.c(str, str2);
        ((Handler) this.b).post(new p881(this, new dl61(dl61Var.a, dl61Var.b, str2, (String) this.x), 5));
    }

    public ld71 c(ap81 ap81Var, boolean z) {
        omk omkVar;
        if ("divkit".equals(ap81Var.a)) {
            try {
                String str = ap81Var.b;
                String str2 = ap81Var.c;
                if (z) {
                    ((sm61) this.x).getClass();
                    Charset charset = uza.a;
                    byte[] bytes = str2.getBytes(charset);
                    try {
                        str2 = new String(Base64.decode(bytes, 0), charset);
                    } catch (Exception unused) {
                        str2 = new String(bytes, uza.a);
                    }
                }
                JSONObject jSONObject = new JSONObject(str2);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                ArrayList arrayList = ap81Var.d;
                kg71 kg71Var = (kg71) this.b;
                kg71Var.getClass();
                try {
                    u2l u2lVar = new u2l(eg90.a);
                    if (jSONObject3 != null) {
                        u2lVar.e(jSONObject3);
                    }
                    kvo kvoVar = omk.i;
                    omkVar = gtq0.n(u2lVar, jSONObject2);
                } catch (Throwable th) {
                    kg71Var.a.d("Failed to create DivData", th);
                    omkVar = null;
                }
                ((sm71) this.c).getClass();
                zmk zmkVar = new zmk(UUID.randomUUID().toString());
                Set a = ((nj71) this.w).a(jSONObject2);
                if (omkVar != null) {
                    return new ld71(str, jSONObject2, jSONObject3, arrayList, omkVar, zmkVar, a, new ks81(ap81Var.e));
                }
            } catch (Throwable th2) {
                ((ge71) this.a).d("Failed to parse DivKit design", th2);
            }
        }
        return null;
    }

    public up71 d(ImageView imageView, CustomizableMediaView customizableMediaView) {
        v871 v871Var;
        vd71 vd71Var;
        v881 v881Var;
        uio0 uio0Var;
        j981 j981Var;
        tf81 tf81Var;
        boolean z;
        x071 v081Var;
        i630 i630Var;
        ImageView imageView2;
        i681 i681Var;
        j981 j981Var2;
        Object obj = this.b;
        v871 v871Var2 = imageView != null ? new v871(imageView, (v881) obj, (d881) this.a) : null;
        if (customizableMediaView != null) {
            w040 w040Var = (w040) this.c;
            v881 v881Var2 = (v881) obj;
            rr41 rr41Var = (rr41) this.w;
            ml71 ml71Var = (ml71) this.x;
            Object obj2 = ((ui21) w040Var.a).a.get("media");
            d171 d171Var = obj2 instanceof d171 ? (d171) obj2 : null;
            uio0 uio0Var2 = (uio0) w040Var.d;
            fe81 fe81Var = (fe81) w040Var.b;
            tf81 tf81Var2 = (tf81) w040Var.g;
            bl61 bl61Var = (bl61) w040Var.c;
            nr41 nr41Var = (nr41) w040Var.e;
            j981 j981Var3 = (j981) w040Var.f;
            ak81 ak81Var = (ak81) w040Var.h;
            if (d171Var != null) {
                s781 s781Var = (s781) rr41Var.b;
                sz61 sz61Var = (sz61) rr41Var.c;
                lg71 lg71Var = d171Var.a;
                Context context = customizableMediaView.getContext();
                Context context2 = customizableMediaView.getContext();
                eq0 eq0Var = eq0.e;
                boolean a = b9a1.a(context2, eq0Var);
                if (a) {
                    customizableMediaView.removeAllViews();
                }
                if (s781Var != null) {
                    il81 il81Var = d171Var.b;
                    z4m0 z4m0Var = (z4m0) uio0Var2.b;
                    z4m0Var.getClass();
                    Context context3 = customizableMediaView.getContext();
                    ta81 ta81Var = ((nr71) z4m0Var.y).a;
                    ih3 videoScaleType = customizableMediaView.getVideoScaleType();
                    if (videoScaleType == null) {
                        videoScaleType = ih3.b;
                    }
                    jr81 jr81Var = (jr81) z4m0Var.z;
                    l9s l9sVar = il81Var != null ? il81Var.b : null;
                    jr81Var.getClass();
                    v881Var = v881Var2;
                    boolean z2 = l9sVar != null ? l9sVar.a : true;
                    if (l9sVar != null) {
                        tf81Var = tf81Var2;
                        z = l9sVar.b;
                    } else {
                        tf81Var = tf81Var2;
                        z = false;
                    }
                    Double d = l9sVar != null ? (Double) l9sVar.c : null;
                    i630 i630Var2 = new i630(videoScaleType, z2, z, d);
                    ((ta81) z4m0Var.x).getClass();
                    int videoControlsLayoutId = customizableMediaView.getVideoControlsLayoutId();
                    zn81 zn81Var = (zn81) z4m0Var.A;
                    zn81Var.c.getClass();
                    TextureView textureView = new TextureView(context3);
                    d171 d171Var2 = d171Var;
                    textureView.setVisibility(8);
                    d481 d481Var = zn81Var.a;
                    mm61 mm61Var = d481Var.b.a;
                    if (tf81Var.getMuteControl() == null && tf81Var.getVideoProgress() == null) {
                        v871Var = v871Var2;
                        v081Var = (x071) on71.a(context3, CorePlaybackControlsContainer.class, videoControlsLayoutId, null);
                    } else {
                        v871Var = v871Var2;
                        v081Var = new v081(tf81Var.getMuteControl(), tf81Var.getVideoProgress());
                    }
                    d481Var.a.a.getClass();
                    Button button = new Button(context3);
                    button.setBackground(context3.getDrawable(R$drawable.monetization_ads_video_ic_replay));
                    int a2 = b281.a(context3, 90.0f);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
                    layoutParams.gravity = 17;
                    button.setLayoutParams(layoutParams);
                    button.setTag(la71.a("replay_button"));
                    button.setVisibility(8);
                    yl2 yl2Var = new yl2(context3, button);
                    yl2Var.addView(button);
                    e42 e42Var = new e42(context3, yl2Var, v081Var);
                    d481Var.c.getClass();
                    x071 x071Var = e42Var.b;
                    e42Var.a.setVisibility(8);
                    CheckBox muteControl = x071Var != null ? x071Var.getMuteControl() : null;
                    if (muteControl != null) {
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = x071Var != null ? x071Var.getVideoProgress() : null;
                    if (videoProgress != null) {
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = x071Var != null ? x071Var.getCountDownProgress() : null;
                    if (countDownProgress != null) {
                        countDownProgress.setVisibility(8);
                    }
                    CheckBox muteControl2 = x071Var != null ? x071Var.getMuteControl() : null;
                    if (muteControl2 == null) {
                        i630Var = i630Var2;
                    } else {
                        i630Var = i630Var2;
                        muteControl2.setChecked(jl40.h(d, 0.0d) || d == null);
                    }
                    e42Var.setVisibility(8);
                    e281 e281Var = zn81Var.b;
                    e281Var.b.getClass();
                    if ((il81Var != null ? il81Var.c : null) != null) {
                        imageView2 = new ImageView(context3);
                        imageView2.setAdjustViewBounds(true);
                        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    } else {
                        imageView2 = null;
                    }
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                    e281Var.a.getClass();
                    ProgressBar progressBar = new ProgressBar(context3);
                    progressBar.setIndeterminateDrawable(context3.getDrawable(R$drawable.monetization_ads_video_progress_bar_background));
                    int b = m810.b(TypedValue.applyDimension(1, 45.0f, context3.getResources().getDisplayMetrics()));
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b, b);
                    layoutParams2.gravity = 17;
                    progressBar.setLayoutParams(layoutParams2);
                    progressBar.setVisibility(8);
                    progressBar.setTag(la71.a("video_placeholder_spinner"));
                    og3 og3Var = new og3(context3, progressBar, imageView2);
                    og3Var.addView(progressBar);
                    if (imageView2 != null) {
                        og3Var.addView(imageView2);
                    }
                    og3Var.setBackgroundColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
                    og3Var.setVisibility(8);
                    t52 t52Var = new t52(context3, og3Var, textureView, e42Var);
                    t52Var.addView(og3Var);
                    t52Var.addView(textureView);
                    t52Var.addView(e42Var);
                    t52Var.setTag(la71.a("native_video_view"));
                    ((fc81) z4m0Var.w).getClass();
                    if (!b9a1.a(customizableMediaView.getContext(), eq0Var)) {
                        customizableMediaView.removeAllViews();
                    }
                    customizableMediaView.addView(t52Var, new FrameLayout.LayoutParams(-1, -1));
                    v981 v981Var = (v981) z4m0Var.b;
                    d881 d881Var = (d881) z4m0Var.c;
                    j981Var = j981Var3;
                    i681 i681Var2 = new i681(customizableMediaView, new yp61(v981Var, t52Var, i630Var, fe81Var, d881Var, bl61Var, s781Var, ml71Var, nr41Var, v881Var, ak81Var), j981Var);
                    vn61 vn61Var = ak81Var != null ? ak81Var.e : null;
                    if (vn61Var == null || !a) {
                        uio0Var = uio0Var2;
                        ak81Var = ak81Var;
                        i681Var = i681Var2;
                        d171Var = d171Var2;
                        j981Var2 = j981Var;
                    } else {
                        d171Var = d171Var2;
                        vd71 a3 = uio0Var2.a(customizableMediaView, (v981) uio0Var2.c, v881Var, j981Var, ak81Var, d171Var);
                        uio0Var = uio0Var2;
                        ak81Var = ak81Var;
                        if (a3 != null) {
                            ym81.j.getClass();
                            vd71Var = new ym81(customizableMediaView, i681Var2, a3, j981Var, vn61Var);
                        } else {
                            j981Var2 = j981Var;
                            i681Var = i681Var2;
                        }
                    }
                    vd71Var = i681Var;
                    j981Var = j981Var2;
                } else {
                    v881Var = v881Var2;
                    v871Var = v871Var2;
                    uio0Var = uio0Var2;
                    if (sz61Var != null && lg71Var != null && cs71.a(context)) {
                        try {
                            vd71Var = ((dt71) uio0Var.f).a(customizableMediaView, lg71Var, bl61Var, sz61Var, j981Var3);
                            j981Var = j981Var3;
                        } catch (am3 unused) {
                        }
                    }
                    j981Var = j981Var3;
                    vd71Var = null;
                }
                if (vd71Var == null) {
                    vd71Var = uio0Var.a(customizableMediaView, (v981) uio0Var.c, v881Var, j981Var, ak81Var, d171Var);
                }
                if (v871Var == null || vd71Var != null) {
                    return new up71(v871Var, vd71Var);
                }
                return null;
            }
        }
        v871Var = v871Var2;
        vd71Var = null;
        if (v871Var == null) {
        }
        return new up71(v871Var, vd71Var);
    }

    public void e(String str, Map map) {
        int i = 4;
        yi71 yi71Var = new yi71((Context) this.x, ((jj71) this.w).a(str, map), new vi71(i, dha1.f().a((Context) this.x), (hn71) this.b, (q63) this.a));
        ys81 ys81Var = (ys81) this.c;
        Context context = (Context) this.x;
        synchronized (ys81Var) {
            hba1.b(context).b(yi71Var);
        }
    }

    public void f(LinkedHashMap linkedHashMap) {
        Map map = (Map) this.x;
        if (map == null) {
            map = b.f();
        }
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(b.f());
        ip71 ip71Var = (ip71) this.w;
        Map map2 = ip71Var != null ? (Map) ip71Var.a().b : null;
        if (map2 == null) {
            map2 = b.f();
        }
        linkedHashMap.putAll(map2);
        d881 d881Var = (d881) this.a;
        ((ge71) this.b).c(new zj71("video_ad_rendering_result", new LinkedHashMap(linkedHashMap), d881Var != null ? d881Var.i : null));
    }

    public void g() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        h();
        h();
        if (((KeyStore) this.c) == null) {
            i3y i3yVar = j971.a;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore != null) {
                byte[][] provide = ((CustomCertificatesProvider) this.a).provide();
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : provide) {
                    i3y i3yVar2 = j971.a;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        CertificateFactory certificateFactory = (CertificateFactory) j971.a.getValue();
                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                    } catch (CertificateException unused3) {
                        x509Certificate = null;
                    }
                    if (x509Certificate != null) {
                        arrayList.add(x509Certificate);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), (X509Certificate) it.next());
                    } catch (KeyStoreException unused4) {
                    }
                }
                keyStore2 = keyStore;
            }
            this.c = keyStore2;
        }
        h();
        if (((X509TrustManager) this.w) == null) {
            h();
            if (((KeyStore) this.c) != null) {
                h();
                this.w = j971.a((KeyStore) this.c);
            }
        }
    }

    public void h() {
        if (Thread.holdsLock(this.x)) {
            return;
        }
        ny61.r("Operation should be performed under lock");
    }

    @Override // defpackage.wq71
    public void a(Object obj) {
        ((xrr) this.c).a();
        rr41 rr41Var = (rr41) this.a;
        Context context = (Context) rr41Var.c;
        hn71 hn71Var = (hn71) rr41Var.b;
        context.getApplicationContext();
        new AtomicBoolean();
        new qm71();
        sc71 sc71Var = new sc71();
        new AtomicBoolean(false);
        ((xr81) obj).A = hn71Var;
        ((Handler) this.b).post(new fe71(12, this, sc71Var));
    }

    public fp71(Dialog dialog, xb xbVar, st81 st81Var, gr81 gr81Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = dialog;
        this.b = xbVar;
        this.c = st81Var;
        this.w = gr81Var;
        this.x = handler;
    }

    public fp71(Context context, ViewGroup viewGroup, List list, uid uidVar) {
        au2 au2Var = new au2(list);
        to81 to81Var = new to81();
        uf81 uf81Var = new uf81(uidVar);
        this.x = context;
        this.a = viewGroup;
        this.b = au2Var;
        this.c = to81Var;
        this.w = uf81Var;
    }

    public fp71(Context context, ge71 ge71Var) {
        xf81 xf81Var = new xf81();
        s421 s421Var = new s421(context, ge71Var, new nr41(context, ge71Var, null, 12));
        s421 s421Var2 = new s421(ge71Var);
        this.a = xf81Var;
        this.b = s421Var;
        this.c = s421Var2;
        this.w = new i971(10, new i291());
        this.x = new vi71(16, new b371(), "CreativeExtension", "Tracking");
    }

    public fp71(Context context, v981 v981Var, d881 d881Var, e971 e971Var) {
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        sk71 sk71Var = new sk71(e971Var, 1);
        this.a = d881Var;
        this.b = b;
        this.c = sk71Var;
    }

    public fp71(Context context, fe81 fe81Var, e971 e971Var, v981 v981Var) {
        i971 i971Var = new i971(13, e971Var);
        ru81 ru81Var = new ru81();
        xp71.b.a();
        this.x = context;
        this.a = fe81Var;
        this.b = v981Var;
        this.c = i971Var;
        this.w = ru81Var;
    }

    public fp71(Context context, fe81 fe81Var, v981 v981Var, e971 e971Var, rr41 rr41Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        xrr xrrVar = new xrr(context, fe81Var, e971Var, v981Var);
        this.a = rr41Var;
        this.b = handler;
        this.c = xrrVar;
    }

    public fp71(Context context, fe81 fe81Var, v981 v981Var, q63 q63Var) {
        ys81 ys81Var;
        hn71 hn71Var = new hn71(context, fe81Var, v981Var);
        ys81 ys81Var2 = ys81.b;
        if (ys81Var2 == null) {
            synchronized (ys81.a) {
                ys81Var = ys81.b;
                if (ys81Var == null) {
                    ys81Var = new ys81();
                    ys81.b = ys81Var;
                }
            }
            ys81Var2 = ys81Var;
        }
        jj71 jj71Var = new jj71();
        this.a = q63Var;
        this.b = hn71Var;
        this.c = ys81Var2;
        this.w = jj71Var;
        this.x = context.getApplicationContext();
    }

    public fp71(Context context, n291 n291Var, xz xzVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        c281 c281Var = new c281(context);
        this.x = context;
        this.a = n291Var;
        this.b = xzVar;
        this.c = copyOnWriteArrayList;
        this.w = c281Var;
        c281Var.a();
    }

    public fp71(CustomCertificatesProvider customCertificatesProvider) {
        this.a = customCertificatesProvider;
        this.b = a.a(tu2.w);
        this.x = new Object();
    }

    public fp71(ge71 ge71Var) {
        kg71 kg71Var = new kg71(ge71Var);
        sm71 sm71Var = new sm71();
        nj71 nj71Var = new nj71();
        sm61 sm61Var = new sm61();
        this.a = ge71Var;
        this.b = kg71Var;
        this.c = sm71Var;
        this.w = nj71Var;
        this.x = sm61Var;
    }

    public fp71(List list, b181 b181Var, iz71 iz71Var, bl61 bl61Var, fj71 fj71Var) {
        this.a = list;
        this.b = b181Var;
        this.c = iz71Var;
        this.w = bl61Var;
        this.x = fj71Var;
    }

    public fp71(ej71 ej71Var) {
        this.a = ej71Var;
        this.b = new HashMap();
        this.c = new HashSet();
        this.w = new HashMap();
    }

    public fp71(d881 d881Var, v881 v881Var, w040 w040Var, rr41 rr41Var, ml71 ml71Var, jzz jzzVar) {
        this.a = d881Var;
        this.b = v881Var;
        this.c = w040Var;
        this.w = rr41Var;
        this.x = ml71Var;
    }

    public fp71(v881 v881Var, Resources resources) {
        uh71 uh71Var = new uh71(resources);
        jw81 jw81Var = new jw81();
        iu71 iu71Var = new iu71();
        qn81 qn81Var = new qn81();
        this.a = v881Var;
        this.b = uh71Var;
        this.c = jw81Var;
        this.w = iu71Var;
        this.x = qn81Var;
    }

    public fp71(t92 t92Var, mm81 mm81Var, tj61 tj61Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = t92Var;
        this.b = mm81Var;
        this.c = tj61Var;
        this.w = handler;
    }
}
