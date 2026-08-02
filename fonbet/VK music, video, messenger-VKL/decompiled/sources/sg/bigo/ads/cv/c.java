package sg.bigo.ads.cv;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.Omid;
import com.iab.omid.library.bigosg.ScriptInjector;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.AdSessionConfiguration;
import com.iab.omid.library.bigosg.adsession.AdSessionContext;
import com.iab.omid.library.bigosg.adsession.CreativeType;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bigosg.adsession.ImpressionType;
import com.iab.omid.library.bigosg.adsession.Owner;
import com.iab.omid.library.bigosg.adsession.Partner;
import com.iab.omid.library.bigosg.adsession.UniversalAdId;
import com.iab.omid.library.bigosg.adsession.VerificationScriptResource;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import sg.bigo.ads.an.o;
import sg.bigo.ads.ay.d;

/* loaded from: classes9.dex */
public final class c extends d {
    protected String e;

    public static class a {
        private static final c a = new c(0);
    }

    private c() {
        this.e = "";
    }

    public static String f() {
        try {
            return Omid.getVersion();
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a("OMSDK", "getOMVersion error: " + th.getMessage());
            return "";
        }
    }

    private static String g(Context context) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStream;
        InputStream inputStream2;
        BufferedReader bufferedReader2;
        InputStream open;
        try {
            try {
                open = context.getAssets().open("omsdk-1.6.5.js");
            } catch (Throwable th2) {
                th = th2;
                inputStream = context;
            }
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(open));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    String sb2 = sb.toString();
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused) {
                    }
                    if (open != null) {
                        try {
                            open.close();
                        } catch (Exception unused2) {
                        }
                    }
                    return sb2;
                } catch (Exception e) {
                    e = e;
                    inputStream2 = open;
                    sg.bigo.ads.bn.a.a(0, "OMSDK", "fetch js from assets error: " + e.getMessage());
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception unused4) {
                        }
                    }
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader2 = null;
                inputStream2 = open;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
                inputStream = open;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused5) {
                    }
                }
                if (inputStream == null) {
                    throw th;
                }
                try {
                    inputStream.close();
                    throw th;
                } catch (Exception unused6) {
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            inputStream2 = null;
            bufferedReader2 = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            inputStream = null;
        }
    }

    @Override // sg.bigo.ads.ay.d
    public final String a() {
        return "OMSDK";
    }

    @Override // sg.bigo.ads.ay.d
    public final String b() {
        return "omsdk-v1.js";
    }

    @Override // sg.bigo.ads.ay.d
    public final String c() {
        return "";
    }

    @Override // sg.bigo.ads.ay.d
    public final String d() {
        return this.e;
    }

    @Override // sg.bigo.ads.ay.d
    public final String e() {
        return sg.bigo.ads.bw.a.g();
    }

    public /* synthetic */ c(byte b) {
        this();
    }

    private static String d(@NonNull String str) {
        try {
            return new URI(str).getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    private void f(final Context context) {
        String g = g(context);
        if (TextUtils.isEmpty(g)) {
            sg.bigo.ads.bn.a.a(0, "OMSDK", "Failed to fetch omsdk js from assets.");
            return;
        }
        this.a = g;
        this.b = true;
        sg.bigo.ads.bh.d.a(0, new Runnable() { // from class: sg.bigo.ads.cv.c.2
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                cVar.a(context, cVar.a, "omsdk-1.6.5.js");
            }
        });
    }

    @Override // sg.bigo.ads.ay.d
    public final String a(Context context) {
        return o.g(context);
    }

    @Override // sg.bigo.ads.ay.d
    public final boolean b(String str) {
        return str.contains("omidGlobal");
    }

    public final String c(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.a, str);
        } catch (Exception unused) {
            return str;
        }
    }

    @Nullable
    public final b a(@NonNull WebView webView, @Nullable View... viewArr) {
        AdSession adSession;
        if (!this.b) {
            return null;
        }
        try {
            adSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Bigosg", "5.9.0"), webView, null, null));
            try {
                adSession.registerAdView(webView);
                for (View view : viewArr) {
                    if (view != null) {
                        adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
                    }
                }
                adSession.start();
                return new b(adSession, null);
            } catch (Exception e) {
                e = e;
                sg.bigo.ads.bn.a.a("OMSDK", "createHtmlOmsdkEvent error: " + e.getMessage());
                if (adSession != null) {
                    adSession.finish();
                }
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            adSession = null;
        }
    }

    @Nullable
    public final b a(List<sg.bigo.ads.cv.a> list, boolean z, @NonNull View view, String str, String str2, @Nullable View... viewArr) {
        Exception exc;
        AdSession adSession;
        String str3;
        if (!this.b) {
            str3 = "Fail to create native OM AdSession: OMSDK is not ready";
        } else if (list == null) {
            str3 = "Fail to create native OM AdSession: OM configs is null";
        } else {
            try {
                Partner createPartner = Partner.createPartner("Bigosg", "5.9.0");
                ArrayList arrayList = new ArrayList();
                for (sg.bigo.ads.cv.a aVar : list) {
                    if (!TextUtils.isEmpty(aVar.a)) {
                        arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(aVar.b, new URL(aVar.a), aVar.c));
                    }
                }
                if (arrayList.size() == 0) {
                    sg.bigo.ads.bn.a.a("OMSDK", "Fail to create native OM AdSession: no verification script resources");
                    return null;
                }
                AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(createPartner, this.a, arrayList, null, "", (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? null : UniversalAdId.createUniversalAdId(str, str2));
                CreativeType creativeType = z ? CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                Owner owner = Owner.NATIVE;
                AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, z ? owner : Owner.NONE, false), createNativeAdSessionContext);
                try {
                    createAdSession.registerAdView(view);
                    if (viewArr != null) {
                        for (View view2 : viewArr) {
                            if (view2 != null) {
                                createAdSession.addFriendlyObstruction(view2, FriendlyObstructionPurpose.OTHER, null);
                            }
                        }
                    }
                    MediaEvents createMediaEvents = z ? MediaEvents.createMediaEvents(createAdSession) : null;
                    createAdSession.start();
                    return new b(createAdSession, createMediaEvents);
                } catch (Exception e) {
                    adSession = createAdSession;
                    exc = e;
                    sg.bigo.ads.bn.a.a("OMSDK", "Fail to create native OM Session: : " + exc.getMessage());
                    if (adSession != null) {
                        adSession.finish();
                    }
                    return null;
                }
            } catch (Exception e2) {
                exc = e2;
                adSession = null;
            }
        }
        sg.bigo.ads.bn.a.a("OMSDK", str3);
        return null;
    }

    public final void a(@NonNull final Context context, String str) {
        try {
            Omid.activate(context);
            this.e = str;
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.cv.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(c.this, context);
                }
            });
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(1, 5, "OMSDK", "Failed to initialize OM SDK initialize: " + th.getMessage());
        }
    }

    @Override // sg.bigo.ads.ay.d
    public final void a(Context context, String str, String str2) {
        super.a(context, str, str2);
        if (e(context)) {
            sg.bigo.ads.bw.a.c(f());
        }
    }

    @Override // sg.bigo.ads.ay.d
    public final void a(String str) {
        sg.bigo.ads.bw.a.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(c cVar, Context context) {
        String f = f();
        String h = sg.bigo.ads.bw.a.h();
        if (!TextUtils.isEmpty(f) && f.equals(h) && cVar.e(context)) {
            String d = cVar.d(context);
            cVar.a = d;
            if (!TextUtils.isEmpty(d)) {
                cVar.b = true;
                if (TextUtils.isEmpty(cVar.e)) {
                    cVar.b(context);
                    return;
                }
                return;
            }
        } else {
            sg.bigo.ads.bw.a.b("");
        }
        cVar.f(context);
        if (TextUtils.isEmpty(cVar.e)) {
        }
    }

    @Override // sg.bigo.ads.ay.d
    public final boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return !((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? true : Objects.equals(d(str), d(str2)));
    }
}
