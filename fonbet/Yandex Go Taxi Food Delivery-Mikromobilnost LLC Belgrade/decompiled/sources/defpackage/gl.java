package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.net.http.SslError;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.mlkit_vision_barcode.n;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.common.MlKitException;
import com.yandex.messaging.internal.view.timeline.common.MessageSendStatus;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.domesticroots.webview.d;
import ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c;
import ru.yandex.taxi.vendor_api.google.b;

/* loaded from: classes11.dex */
public final class gl implements dzh, yi51, txa1 {
    public boolean a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    public gl(Context context, uv4 uv4Var, n nVar) {
        zzah zzahVar = new zzah();
        this.c = zzahVar;
        this.b = context;
        zzahVar.zza = uv4Var.a;
        this.w = nVar;
    }

    public static void r(gl glVar, String str, Integer num, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        Uri parse;
        String str5 = null;
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            bool2 = null;
        }
        if ((i & 256) != 0) {
            bool3 = null;
        }
        if ((i & 512) != 0) {
            bool4 = null;
        }
        Boolean bool5 = Boolean.TRUE;
        String str6 = jl40.l(bool, bool5) ? "ConnectionError" : jl40.l(bool2, bool5) ? "SslError" : jl40.l(bool3, bool5) ? "ServerError" : jl40.l(bool4, bool5) ? "ClientError" : "";
        trp0 trp0Var = trp0.a;
        if (str != null && (parse = Uri.parse(str)) != null) {
            str5 = sd90.m(parse);
        }
        trp0.e(new arp0(str5, num, str2, str3, str4, str6));
    }

    @Override // defpackage.txa1
    public ArrayList a(xzv xzvVar) {
        zzu[] zzf;
        if (((zzaj) this.x) == null) {
            zzc();
        }
        zzaj zzajVar = (zzaj) this.x;
        if (zzajVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzan zzanVar = new zzan(xzvVar.d, xzvVar.e, 0, 0L, qnc.a(xzvVar.f));
        try {
            int i = xzvVar.g;
            if (i == -1) {
                zzf = zzajVar.zzf(ObjectWrapper.wrap(xzvVar.a), zzanVar);
            } else if (i == 17) {
                zzf = zzajVar.zze(ObjectWrapper.wrap(xzvVar.b), zzanVar);
            } else if (i == 35) {
                Image.Plane[] a = xzvVar.a();
                cvw.l(a);
                zzanVar.zza = a[0].getRowStride();
                zzf = zzajVar.zze(ObjectWrapper.wrap(a[0].getBuffer()), zzanVar);
            } else {
                if (i != 842094169) {
                    throw new MlKitException("Unsupported image format: " + xzvVar.g, 3);
                }
                zzf = zzajVar.zze(ObjectWrapper.wrap(i4b1.a(xzvVar)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzf) {
                arrayList.add(new fv4(new lm71(26, zzuVar), xzvVar.h));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to detect with legacy barcode detector");
        }
    }

    @Override // defpackage.dzh
    public void b() {
        if (this.a) {
            ((s030) this.b).q4();
        }
        ((c) this.c).d.a.addLast(new w230(((c9x0) this.w).a, (czh) this.x));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yi51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(wi51 wi51Var, vi51 vi51Var) {
        Boolean bool;
        Throwable th;
        qq31 qq31Var;
        String valueOf = String.valueOf(wi51Var != null ? ((WebResourceRequest) ((zch) wi51Var).a).getUrl() : null);
        Integer valueOf2 = vi51Var != null ? Integer.valueOf(((qj41) ((qnh) vi51Var).a).b()) : null;
        String str = "errorMessage=" + ((Object) (vi51Var != null ? ((qj41) ((qnh) vi51Var).a).a() : null));
        Boolean valueOf3 = vi51Var != null ? Boolean.valueOf(((qnh) vi51Var).a()) : null;
        if (vi51Var != null) {
            bool = Boolean.valueOf(((qj41) ((qnh) vi51Var).a).b() == -11);
        } else {
            bool = null;
        }
        r(this, valueOf, valueOf2, "Non HTTP web view error", null, str, valueOf3, bool, null, null, 792);
        if (wi51Var == null) {
            return;
        }
        WebResourceRequest webResourceRequest = (WebResourceRequest) ((zch) wi51Var).a;
        if (!webResourceRequest.isForMainFrame()) {
            return;
        }
        if (vi51Var != null) {
            qnh qnhVar = (qnh) vi51Var;
            if (qnhVar.a()) {
                th = new IOException(oyr.j(((qj41) qnhVar.a).b(), "Problems with internet connection (WebView ErrorCode = ", Extension.C_BRAKE));
                qq31Var = (qq31) this.c;
                if (qq31Var == null) {
                    qq31Var.invoke(th);
                    return;
                }
                return;
            }
        }
        th = new Throwable("On receive error on loading page: " + sd90.m(webResourceRequest.getUrl()) + " (WebView ErrorCode = " + (vi51Var != null ? Integer.valueOf(((qj41) ((qnh) vi51Var).a).b()) : null) + Extension.C_BRAKE);
        qq31Var = (qq31) this.c;
        if (qq31Var == null) {
        }
    }

    @Override // defpackage.yi51
    public void d() {
    }

    @Override // defpackage.yi51
    public void e(boh bohVar, String str) {
        Uri parse;
        ((AppAnalyticsReporter) this.b).u0.a.a("webView.3ds.start", g8e.w(1, "url", (str == null || (parse = Uri.parse(str)) == null) ? "null" : sd90.m(parse)));
    }

    @Override // defpackage.yi51
    public void f(boh bohVar, ui51 ui51Var, ti51 ti51Var) {
        if (ti51Var != null) {
            d dVar = (d) this.x;
            SslError sslError = (SslError) ((zch) ti51Var).a;
            dVar.b(new SslError(sslError.getPrimaryError(), sslError.getCertificate(), sslError.getUrl()), new s421(this, ti51Var, ui51Var, bohVar, 8));
        } else {
            if (ui51Var != null) {
                ((zmf) ui51Var).a.cancel();
            }
            m(ti51Var, bohVar);
        }
    }

    @Override // defpackage.yi51
    public void g(boh bohVar, String str) {
    }

    @Override // defpackage.yi51
    public void h(wi51 wi51Var, xi51 xi51Var) {
        Boolean bool;
        Boolean bool2;
        Map<String, String> responseHeaders;
        String valueOf = String.valueOf(wi51Var != null ? ((WebResourceRequest) ((zch) wi51Var).a).getUrl() : null);
        Integer valueOf2 = xi51Var != null ? Integer.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode()) : null;
        String str = (xi51Var == null || (responseHeaders = ((WebResourceResponse) ((zgf) xi51Var).b).getResponseHeaders()) == null) ? null : responseHeaders.get(yu50.d);
        String o = g8e.o("reasonPhrase=", xi51Var != null ? ((WebResourceResponse) ((zgf) xi51Var).b).getReasonPhrase() : null);
        if (xi51Var != null) {
            d6w d6wVar = uuu.a;
            bool = Boolean.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode() / 100 == 4);
        } else {
            bool = null;
        }
        if (xi51Var != null) {
            d6w d6wVar2 = uuu.a;
            bool2 = Boolean.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode() / 100 == 5);
        } else {
            bool2 = null;
        }
        r(this, valueOf, valueOf2, "Web view HTTP-error", str, o, null, null, bool2, bool, 208);
        if (wi51Var != null) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) ((zch) wi51Var).a;
            if (webResourceRequest.isForMainFrame()) {
                String m = sd90.m(webResourceRequest.getUrl());
                Integer valueOf3 = xi51Var != null ? Integer.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode()) : null;
                String reasonPhrase = xi51Var != null ? ((WebResourceResponse) ((zgf) xi51Var).b).getReasonPhrase() : null;
                StringBuilder q = n.q("Web 3DS view HTTP-error: ", valueOf3, m, Extension.COLON_SPACE, Extension.COLON_SPACE);
                q.append(reasonPhrase);
                Throwable th = new Throwable(q.toString());
                qq31 qq31Var = (qq31) this.c;
                if (qq31Var != null) {
                    qq31Var.invoke(th);
                }
            }
        }
    }

    @Override // defpackage.yi51
    public boolean i(boh bohVar, wi51 wi51Var) {
        if (wi51Var == null) {
            return false;
        }
        WebResourceRequest webResourceRequest = (WebResourceRequest) ((zch) wi51Var).a;
        if (!webResourceRequest.isForMainFrame()) {
            return false;
        }
        l0p l0pVar = ((AppAnalyticsReporter) this.b).u0;
        l0pVar.a.a("webView.3ds.redirect", g8e.w(1, "url", sd90.m(webResourceRequest.getUrl())));
        return false;
    }

    @Override // defpackage.yi51
    public void j(wi51 wi51Var) {
        if (wi51Var != null) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) ((zch) wi51Var).a;
            if (webResourceRequest.isForMainFrame()) {
                l0p l0pVar = ((AppAnalyticsReporter) this.b).u0;
                l0pVar.a.a("webView.3ds.intercept_request", g8e.w(1, "url", sd90.m(webResourceRequest.getUrl())));
            }
        }
    }

    public boolean k(View view) {
        hw10 hw10Var = (hw10) this.x;
        if (hw10Var != null) {
            hw10Var.c(false);
        }
        Object tag = view.getTag(e9h0.messenger_message_status_view_tag);
        hw10 hw10Var2 = tag instanceof hw10 ? (hw10) tag : null;
        if (hw10Var2 == null) {
            hw10Var2 = new hw10(view, this.a, (arg) this.c);
            view.setTag(e9h0.messenger_message_status_view_tag, hw10Var2);
        }
        this.x = hw10Var2;
        gw10 gw10Var = (gw10) this.w;
        hw10Var2.c(true);
        Date date = gw10Var.e;
        ht10 ht10Var = hw10Var2.g;
        TextView textView = (TextView) ht10Var.c;
        if (date == null) {
            textView.setVisibility(4);
            textView.setText((CharSequence) null);
        } else {
            textView.setVisibility(0);
            textView.setText(((arg) ht10Var.b).a.format(date));
        }
        ((ImageView) hw10Var2.f.c).setVisibility(gw10Var.b ? 0 : 8);
        int i = gw10Var.d;
        TextView textView2 = hw10Var2.d.a;
        textView2.setVisibility(i != 0 ? 0 : 8);
        textView2.setText(wtb1.a(i));
        int i2 = gw10Var.c;
        TextView textView3 = hw10Var2.c.a;
        textView3.setVisibility(i2 != 0 ? 0 : 8);
        textView3.setText(wtb1.a(i2));
        MessageSendStatus messageSendStatus = gw10Var.a;
        MessageSendStatus messageSendStatus2 = MessageSendStatus.Seen;
        hw10Var2.b(messageSendStatus == MessageSendStatus.Sent || messageSendStatus == messageSendStatus2, messageSendStatus == messageSendStatus2);
        return !jl40.l(hw10Var, (hw10) this.x);
    }

    public int l() {
        int i;
        int i2;
        hw10 hw10Var = (hw10) this.x;
        if (hw10Var == null) {
            return 0;
        }
        jas jasVar = hw10Var.c;
        TextView textView = jasVar.a;
        if (textView.getVisibility() == 0) {
            int measureText = ((int) textView.getPaint().measureText(textView.getText().toString())) + jasVar.b;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            i = textView.getCompoundDrawablePadding() + measureText + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0);
        } else {
            i = 0;
        }
        jas jasVar2 = hw10Var.d;
        TextView textView2 = jasVar2.a;
        if (textView2.getVisibility() == 0) {
            int measureText2 = ((int) textView2.getPaint().measureText(textView2.getText().toString())) + jasVar2.b;
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            i2 = textView2.getCompoundDrawablePadding() + measureText2 + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
        } else {
            i2 = 0;
        }
        int i3 = i + i2;
        tpq0 tpq0Var = hw10Var.e;
        int i4 = i3 + (((ImageView) tpq0Var.c).getVisibility() == 0 ? tpq0Var.b : 0);
        we6 we6Var = hw10Var.f;
        int i5 = i4 + (((ImageView) we6Var.c).getVisibility() == 0 ? we6Var.b : 0);
        TextView textView3 = (TextView) hw10Var.g.c;
        int measureText3 = i5 + (textView3.getVisibility() == 0 ? (int) textView3.getPaint().measureText(textView3.getText().toString()) : 0);
        if (measureText3 == 0) {
            hw10Var.c(false);
            return 0;
        }
        hw10Var.c(true);
        return kjs0.b(8) + measureText3;
    }

    public void m(ti51 ti51Var, aj51 aj51Var) {
        String url;
        Uri parse;
        String str = null;
        r(this, ti51Var != null ? ((SslError) ((zch) ti51Var).a).getUrl() : null, null, "Web 3DS view SSL error", null, ti51Var != null ? ((SslError) ((zch) ti51Var).a).toString() : null, null, Boolean.TRUE, null, null, 856);
        if (ti51Var != null) {
            SslError sslError = (SslError) ((zch) ti51Var).a;
            Uri parse2 = Uri.parse(sslError.getUrl());
            if (parse2 == null) {
                return;
            }
            String host = parse2.getHost();
            if (aj51Var != null && (url = ((boh) aj51Var).a.getUrl()) != null && (parse = Uri.parse(url)) != null) {
                str = parse.getHost();
            }
            if (jl40.l(host, str)) {
                Throwable th = new Throwable("Web3DSView: ssl error ".concat(sslError.toString()));
                qq31 qq31Var = (qq31) this.c;
                if (qq31Var != null) {
                    qq31Var.invoke(th);
                }
            }
        }
    }

    public fgg0 n(Image image, int i) {
        byte[] bArr;
        if (((b) ((tst) this.b)).b()) {
            return (fgg0) a.R(((aye0) this.w).l(image, i));
        }
        ((k421) this.c).getClass();
        int i2 = 0;
        if (this.a) {
            this.a = false;
            zgz.a(null, new IllegalStateException("QR recognition is failed because no vendors are available. Using fallback"));
        }
        eqo0 eqo0Var = (eqo0) this.x;
        eqo0Var.getClass();
        try {
            Image.Plane[] planes = image.getPlanes();
            if (planes.length == 0) {
                bArr = null;
            } else {
                ByteBuffer buffer = planes[0].getBuffer();
                byte[] bArr2 = new byte[buffer.remaining()];
                buffer.get(bArr2);
                bArr = bArr2;
            }
            if (bArr != null) {
                lhc0 lhc0Var = new lhc0(bArr, image.getWidth(), image.getHeight(), image.getWidth(), image.getHeight());
                m2v m2vVar = new m2v();
                m2vVar.a = lhc0Var;
                m2vVar.b = m2v.x;
                m2vVar.c = new int[32];
                q6c0 a = ((r5g0) eqo0Var.a.getValue()).a(new h0w(m2vVar), (Map) eqo0Var.b.getValue());
                wzj0[] wzj0VarArr = (wzj0[]) a.c;
                if (wzj0VarArr.length >= 3) {
                    ArrayList arrayList = new ArrayList(wzj0VarArr.length);
                    for (wzj0 wzj0Var : wzj0VarArr) {
                        float f = wzj0Var.a;
                        float f2 = wzj0Var.b;
                        float width = image.getWidth();
                        float height = image.getHeight();
                        arrayList.add(new ior(i != 90 ? i != 180 ? i != 270 ? ior.a(f, f2) : ior.a(f2, width - f) : ior.a(width - f, height - f2) : ior.a(height - f2, f)));
                    }
                    long a2 = (i == 90 || i == 270) ? ior.a(image.getHeight(), image.getWidth()) : ior.a(image.getWidth(), image.getHeight());
                    Iterator it = arrayList.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int intBitsToFloat = (int) Float.intBitsToFloat((int) (((ior) it.next()).a >> 32));
                    while (it.hasNext()) {
                        int intBitsToFloat2 = (int) Float.intBitsToFloat((int) (((ior) it.next()).a >> 32));
                        if (intBitsToFloat > intBitsToFloat2) {
                            intBitsToFloat = intBitsToFloat2;
                        }
                    }
                    if (intBitsToFloat < 0) {
                        intBitsToFloat = 0;
                    }
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int intBitsToFloat3 = (int) Float.intBitsToFloat((int) (((ior) it2.next()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    while (it2.hasNext()) {
                        int intBitsToFloat4 = (int) Float.intBitsToFloat((int) (((ior) it2.next()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        if (intBitsToFloat3 > intBitsToFloat4) {
                            intBitsToFloat3 = intBitsToFloat4;
                        }
                    }
                    if (intBitsToFloat3 >= 0) {
                        i2 = intBitsToFloat3;
                    }
                    Iterator it3 = arrayList.iterator();
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int intBitsToFloat5 = (int) Float.intBitsToFloat((int) (((ior) it3.next()).a >> 32));
                    while (it3.hasNext()) {
                        int intBitsToFloat6 = (int) Float.intBitsToFloat((int) (((ior) it3.next()).a >> 32));
                        if (intBitsToFloat5 < intBitsToFloat6) {
                            intBitsToFloat5 = intBitsToFloat6;
                        }
                    }
                    int i3 = (int) (a2 >> 32);
                    int intBitsToFloat7 = (int) Float.intBitsToFloat(i3);
                    if (intBitsToFloat5 > intBitsToFloat7) {
                        intBitsToFloat5 = intBitsToFloat7;
                    }
                    Iterator it4 = arrayList.iterator();
                    if (!it4.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int intBitsToFloat8 = (int) Float.intBitsToFloat((int) (((ior) it4.next()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    while (it4.hasNext()) {
                        int intBitsToFloat9 = (int) Float.intBitsToFloat((int) (((ior) it4.next()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        if (intBitsToFloat8 < intBitsToFloat9) {
                            intBitsToFloat8 = intBitsToFloat9;
                        }
                    }
                    int i4 = (int) (a2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    int intBitsToFloat10 = (int) Float.intBitsToFloat(i4);
                    if (intBitsToFloat8 > intBitsToFloat10) {
                        intBitsToFloat8 = intBitsToFloat10;
                    }
                    fgg0 fgg0Var = new fgg0(Uri.parse((String) a.b), new Rect(intBitsToFloat, i2, intBitsToFloat5, intBitsToFloat8), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
                    image.close();
                    return fgg0Var;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            image.close();
            throw th;
        }
        image.close();
        return null;
    }

    public void o() {
        hw10 hw10Var = (hw10) this.x;
        if (hw10Var != null) {
            boolean z = this.a;
            Context context = (Context) this.b;
            hw10Var.a((z ? fxa1.c(jng0.messagingOutgoingSecondaryColor, context) : fxa1.c(jng0.messagingIncomingSecondaryColor, context)).data);
        }
        hw10 hw10Var2 = (hw10) this.x;
        if (hw10Var2 != null) {
            hw10Var2.a.setBackgroundResource(0);
        }
    }

    @Override // defpackage.dzh
    public void onDismiss() {
        ((s030) this.b).onDismiss();
        ((c) this.c).d.a(((c9x0) this.w).a);
    }

    @Override // defpackage.yi51
    public void onPageFinished(String str) {
        Uri parse;
        String m = (str == null || (parse = Uri.parse(str)) == null) ? "null" : sd90.m(parse);
        ia41 ia41Var = (ia41) this.w;
        if (ia41Var != null) {
            ia41Var.invoke();
        }
        ((AppAnalyticsReporter) this.b).u0.a.a("webView.3ds.finish", g8e.w(1, "url", m));
    }

    public void p() {
        hw10 hw10Var = (hw10) this.x;
        if (hw10Var != null) {
            hw10Var.a(drb1.c(jng0.messagingChatImageTimeForegroundColor, (Context) this.b));
        }
        hw10 hw10Var2 = (hw10) this.x;
        if (hw10Var2 != null) {
            hw10Var2.a.setBackgroundResource(wwg0.msg_bg_message_time);
        }
    }

    public void q(boolean z) {
        AnimatedVectorDrawable animatedVectorDrawable;
        ImageView imageView = (ImageView) this.x;
        if (z) {
            Drawable drawable = imageView.getDrawable();
            animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
            if (animatedVectorDrawable != null) {
                animatedVectorDrawable.start();
            }
            ai91.f(imageView, false);
            return;
        }
        Drawable drawable2 = imageView.getDrawable();
        animatedVectorDrawable = drawable2 instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable2 : null;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.stop();
        }
        ai91.c(imageView, false);
    }

    @Override // defpackage.txa1
    public void zzb() {
        zzaj zzajVar = (zzaj) this.x;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.x = null;
        }
    }

    @Override // defpackage.txa1
    public boolean zzc() {
        n nVar = (n) this.w;
        Context context = (Context) this.b;
        if (((zzaj) this.x) != null) {
            return false;
        }
        try {
            zzaj zzd = zzal.zza(gan.c(context, gan.b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(context), (zzah) this.c);
            this.x = zzd;
            if (zzd == null && !this.a) {
                bg70.b(context, "barcode");
                this.a = true;
                e891.c(nVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            e891.c(nVar, zzrb.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy barcode detector.");
        } catch (DynamiteModule$LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }
}
