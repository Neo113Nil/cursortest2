package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.compose.foundation.pager.d;
import androidx.compose.runtime.f;
import androidx.concurrent.futures.b;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import ru.CryptoPro.AdES.AdESConfig;
import ru.CryptoPro.CAdES.EncryptionKeyAlgorithm;
import ru.CryptoPro.CAdES.exception.EnvelopedException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_IV;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_ParamSet;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Parameters;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost3412_15_Encryption_Parameters;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.G3412ParamsSpec;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import yads.ck0;
import yads.p9;

/* loaded from: classes7.dex */
public final class no6 implements lu61 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object w;
    public Object x;
    public Object y;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056 A[Catch: IOException -> 0x0022, GeneralSecurityException -> 0x0025, TryCatch #4 {IOException -> 0x0022, GeneralSecurityException -> 0x0025, blocks: (B:3:0x0005, B:6:0x001b, B:7:0x001f, B:8:0x0048, B:10:0x0056, B:11:0x005b, B:13:0x0061, B:14:0x0064, B:16:0x0080, B:18:0x009e, B:19:0x00e0, B:24:0x00a3, B:25:0x00aa, B:26:0x00ab, B:29:0x00bc, B:31:0x00d4, B:32:0x00d7, B:35:0x00fe, B:36:0x0105, B:38:0x0028, B:40:0x002c, B:41:0x0031, B:43:0x0035, B:44:0x0044, B:46:0x003c, B:48:0x0040), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[Catch: IOException -> 0x0022, GeneralSecurityException -> 0x0025, TryCatch #4 {IOException -> 0x0022, GeneralSecurityException -> 0x0025, blocks: (B:3:0x0005, B:6:0x001b, B:7:0x001f, B:8:0x0048, B:10:0x0056, B:11:0x005b, B:13:0x0061, B:14:0x0064, B:16:0x0080, B:18:0x009e, B:19:0x00e0, B:24:0x00a3, B:25:0x00aa, B:26:0x00ab, B:29:0x00bc, B:31:0x00d4, B:32:0x00d7, B:35:0x00fe, B:36:0x0105, B:38:0x0028, B:40:0x002c, B:41:0x0031, B:43:0x0035, B:44:0x0044, B:46:0x003c, B:48:0x0040), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080 A[Catch: IOException -> 0x0022, GeneralSecurityException -> 0x0025, TRY_LEAVE, TryCatch #4 {IOException -> 0x0022, GeneralSecurityException -> 0x0025, blocks: (B:3:0x0005, B:6:0x001b, B:7:0x001f, B:8:0x0048, B:10:0x0056, B:11:0x005b, B:13:0x0061, B:14:0x0064, B:16:0x0080, B:18:0x009e, B:19:0x00e0, B:24:0x00a3, B:25:0x00aa, B:26:0x00ab, B:29:0x00bc, B:31:0x00d4, B:32:0x00d7, B:35:0x00fe, B:36:0x0105, B:38:0x0028, B:40:0x002c, B:41:0x0031, B:43:0x0035, B:44:0x0044, B:46:0x003c, B:48:0x0040), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[Catch: IOException -> 0x0022, GeneralSecurityException -> 0x0025, TryCatch #4 {IOException -> 0x0022, GeneralSecurityException -> 0x0025, blocks: (B:3:0x0005, B:6:0x001b, B:7:0x001f, B:8:0x0048, B:10:0x0056, B:11:0x005b, B:13:0x0061, B:14:0x0064, B:16:0x0080, B:18:0x009e, B:19:0x00e0, B:24:0x00a3, B:25:0x00aa, B:26:0x00ab, B:29:0x00bc, B:31:0x00d4, B:32:0x00d7, B:35:0x00fe, B:36:0x0105, B:38:0x0028, B:40:0x002c, B:41:0x0031, B:43:0x0035, B:44:0x0044, B:46:0x003c, B:48:0x0040), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public no6(EncryptionKeyAlgorithm encryptionKeyAlgorithm, EllipticParamsInterface ellipticParamsInterface, et61 et61Var, boolean z) {
        u2 u2Var;
        u2 u2Var2;
        try {
            this.x = et61Var;
            this.y = encryptionKeyAlgorithm;
            this.a = z;
            String str = "GOST28147/CFB/NoPadding";
            String str2 = lu61.c5.a;
            String str3 = "GOST3412_2015_K";
            if (encryptionKeyAlgorithm == EncryptionKeyAlgorithm.ekaKuznechik) {
                str = "GOST3412_2015_K/CTR_ACPKM/NoPadding";
                u2Var2 = lu61.e5;
            } else {
                if (encryptionKeyAlgorithm != EncryptionKeyAlgorithm.ekaKuznechikMac) {
                    if (encryptionKeyAlgorithm == EncryptionKeyAlgorithm.ekaMagma) {
                        str = "GOST3412_2015_M/CTR_ACPKM/NoPadding";
                        u2Var = lu61.d5;
                    } else {
                        if (encryptionKeyAlgorithm != EncryptionKeyAlgorithm.ekaMagmaMac) {
                            str3 = "GOST28147";
                            KeyGenerator keyGenerator = KeyGenerator.getInstance(str3, AdESConfig.getDefaultEncryptionProvider());
                            if (str3.equals("GOST28147")) {
                                keyGenerator.init(lu61.l5);
                            }
                            if (!AdESConfig.isJCP()) {
                                keyGenerator.init(ellipticParamsInterface);
                            }
                            SecretKey generateKey = keyGenerator.generateKey();
                            this.b = generateKey;
                            Cipher cipher = Cipher.getInstance(str, AdESConfig.getDefaultEncryptionProvider());
                            this.w = cipher;
                            Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                            if (str3.equals("GOST28147")) {
                                cipher.init(1, generateKey);
                                byte[] iv = cipher.getIV();
                                Gost28147_89_Parameters gost28147_89_Parameters = new Gost28147_89_Parameters();
                                gost28147_89_Parameters.iv = new Gost28147_89_IV(iv);
                                gost28147_89_Parameters.encryptionParamSet = new Gost28147_89_ParamSet(lu61.k5.value);
                                try {
                                    gost28147_89_Parameters.encode(asn1BerEncodeBuffer);
                                } catch (Asn1Exception e) {
                                    throw new EnvelopedException("ASN.1 invalid params structure", e);
                                }
                            } else {
                                Gost3412_15_Encryption_Parameters gost3412_15_Encryption_Parameters = new Gost3412_15_Encryption_Parameters();
                                byte[] bArr = new byte[((str3.equals("GOST3412_2015_M") ? 8 : 16) >> 1) + 8];
                                SecureRandom.getInstance(JCP.CP_RANDOM, AdESConfig.getDefaultDigestSignatureProvider()).nextBytes(bArr);
                                gost3412_15_Encryption_Parameters.ukm = new Asn1OctetString(bArr);
                                try {
                                    gost3412_15_Encryption_Parameters.encode(asn1BerEncodeBuffer);
                                    cipher.init(1, generateKey, new G3412ParamsSpec(bArr, true), (SecureRandom) null);
                                } catch (Asn1Exception e2) {
                                    throw new EnvelopedException("ASN.1 invalid params structure.", e2);
                                }
                            }
                            j2 j2Var = new j2(asn1BerEncodeBuffer.getMsgCopy());
                            b3 n = j2Var.n();
                            j2Var.close();
                            this.c = new xr1(new u2(str2), n);
                        }
                        str = "GOST3412_2015_M/OMAC_CTR/NoPadding";
                        u2Var = lu61.f5;
                    }
                    str2 = u2Var.a;
                    str3 = "GOST3412_2015_M";
                    KeyGenerator keyGenerator2 = KeyGenerator.getInstance(str3, AdESConfig.getDefaultEncryptionProvider());
                    if (str3.equals("GOST28147")) {
                    }
                    if (!AdESConfig.isJCP()) {
                    }
                    SecretKey generateKey2 = keyGenerator2.generateKey();
                    this.b = generateKey2;
                    Cipher cipher2 = Cipher.getInstance(str, AdESConfig.getDefaultEncryptionProvider());
                    this.w = cipher2;
                    Asn1BerEncodeBuffer asn1BerEncodeBuffer2 = new Asn1BerEncodeBuffer();
                    if (str3.equals("GOST28147")) {
                    }
                    j2 j2Var2 = new j2(asn1BerEncodeBuffer2.getMsgCopy());
                    b3 n2 = j2Var2.n();
                    j2Var2.close();
                    this.c = new xr1(new u2(str2), n2);
                }
                str = "GOST3412_2015_K/OMAC_CTR/NoPadding";
                u2Var2 = lu61.g5;
            }
            str2 = u2Var2.a;
            KeyGenerator keyGenerator22 = KeyGenerator.getInstance(str3, AdESConfig.getDefaultEncryptionProvider());
            if (str3.equals("GOST28147")) {
            }
            if (!AdESConfig.isJCP()) {
            }
            SecretKey generateKey22 = keyGenerator22.generateKey();
            this.b = generateKey22;
            Cipher cipher22 = Cipher.getInstance(str, AdESConfig.getDefaultEncryptionProvider());
            this.w = cipher22;
            Asn1BerEncodeBuffer asn1BerEncodeBuffer22 = new Asn1BerEncodeBuffer();
            if (str3.equals("GOST28147")) {
            }
            j2 j2Var22 = new j2(asn1BerEncodeBuffer22.getMsgCopy());
            b3 n22 = j2Var22.n();
            j2Var22.close();
            this.c = new xr1(new u2(str2), n22);
        } catch (IOException e3) {
            throw new EnvelopedException("Output cipher initiation failed.", e3);
        } catch (GeneralSecurityException e4) {
            throw new EnvelopedException("Output cipher initiation failed.", e4);
        }
    }

    public static ye61 d(ep7 ep7Var) {
        Range range;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) ep7Var.a(key);
            } catch (AssertionError unused) {
                sgb1.g(5, "ZoomControl");
                range = null;
            }
            if (range != null) {
                return new xb2(ep7Var);
            }
        }
        return new an8(ep7Var);
    }

    public void a(cu81 cu81Var, zq81 zq81Var) {
        v881 v881Var = (v881) this.c;
        v881Var.getClass();
        LinkedHashMap linkedHashMap = v881Var.c;
        String str = cu81Var.g;
        String str2 = cu81Var.c;
        int i = cu81Var.b;
        int i2 = cu81Var.a;
        m581 m581Var = str != null ? new m581(str, new vn61(i2, i)) : null;
        Bitmap bitmap = m581Var != null ? (Bitmap) linkedHashMap.get(m581Var) : null;
        zq81Var.d(bitmap != null ? new BitmapDrawable((Resources) this.y, bitmap) : null);
        if (!this.a) {
            gs51 gs51Var = new gs51(3, zq81Var, this);
            Bitmap a = v881Var.a(cu81Var);
            if (a != null) {
                gs51Var.e(a);
                return;
            }
            String str3 = cu81Var.g;
            m581 m581Var2 = str3 != null ? new m581(str3, new vn61(i2, i)) : null;
            gs51Var.e(m581Var2 != null ? (Bitmap) linkedHashMap.get(m581Var2) : null);
            if (((w7o) this.b).a) {
                ((z4m0) this.w).b(str2, new vi71(24, this, str2, gs51Var), i2, i);
                return;
            }
            return;
        }
        w071 w071Var = (w071) this.x;
        lw81 lw81Var = new lw81(zq81Var);
        HashMap hashMap = w071Var.d;
        ti81 ti81Var = (ti81) w071Var.c.a.get(str2);
        if (ti81Var != null) {
            Drawable drawable = ti81Var.a;
            if (drawable != null) {
                zq81Var.d(drawable);
                return;
            }
            return;
        }
        ki61 ki61Var = (ki61) hashMap.get(str2);
        if (ki61Var != null) {
            ki61Var.a.add(lw81Var);
            return;
        }
        b771 b771Var = new b771(str2, w071Var.b, new ck0(w071Var, str2), new gs51(4, w071Var, str2));
        hashMap.put(str2, new ki61(lw81Var));
        w071Var.a.b(b771Var);
    }

    public void b() {
        tje.e();
        this.a = true;
        Handler handler = (Handler) this.x;
        handler.removeCallbacksAndMessages(null);
        handler.post(new xfy(this, 0));
    }

    public void c() {
        b bVar = (b) this.x;
        if (bVar != null) {
            bVar.d(new CameraControl$OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.x = null;
        }
        fvo fvoVar = (fvo) this.y;
        if (fvoVar != null) {
            ((androidx.camera.camera2.internal.b) this.b).B(fvoVar);
            this.y = null;
        }
    }

    public void e(b bVar, y64 y64Var) {
        y64 e;
        if (this.a) {
            ((ye61) this.y).d(y64Var.a, bVar);
            ((androidx.camera.camera2.internal.b) this.b).F();
            return;
        }
        synchronized (((lf61) this.w)) {
            ((lf61) this.w).f(1.0f);
            e = uiv.e((lf61) this.w);
        }
        f(e);
        bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
    }

    public void f(y64 y64Var) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        dy40 dy40Var = (dy40) this.x;
        if (myLooper == mainLooper) {
            dy40Var.l(y64Var);
        } else {
            dy40Var.m(y64Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r5.L0 == true) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public no6(Context context, w7o w7oVar, v881 v881Var) {
        a081 a081Var;
        d671 d671Var = mf71.d;
        z4m0 z4m0Var = d671Var.a(context).a;
        w071 w071Var = d671Var.a(context).b;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        this.b = w7oVar;
        this.c = v881Var;
        this.w = z4m0Var;
        this.x = w071Var;
        this.y = context.getResources();
        boolean z = w7oVar.a && (r5 = a081Var2.a(context)) != null;
        this.a = z;
    }

    public no6(Context context, rr41 rr41Var, d881 d881Var, fe81 fe81Var, v981 v981Var, p9 p9Var, hn71 hn71Var, bl61 bl61Var, iz71 iz71Var, ArrayList arrayList) {
        vi71 vi71Var = new vi71(context, d881Var, fe81Var, v981Var, p9Var, arrayList);
        this.b = hn71Var;
        this.c = bl61Var;
        this.w = iz71Var;
        this.x = vi71Var;
        this.y = new kzo(rr41Var, this);
    }

    public no6(String str, String str2, String str3, ArrayList arrayList, fgz0 fgz0Var, boolean z) {
        this.b = str;
        this.c = str2;
        this.w = str3;
        this.x = arrayList;
        this.y = fgz0Var;
        this.a = z;
    }

    public no6(View view) {
        this.b = view;
        BubbleComponent bubbleComponent = new BubbleComponent(view.getContext(), null, 0, 6, null);
        this.c = bubbleComponent;
        dgr0 dgr0Var = new dgr0(view.getContext());
        this.w = dgr0Var;
        View inflate = LayoutInflater.from(view.getContext()).inflate(yrh0.summary_bubble_onboarding_content, (ViewGroup) bubbleComponent, false);
        bubbleComponent.addView(inflate);
        int i = zfh0.surge_bubble_subtitle;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = zfh0.surge_bubble_title;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView2 != null) {
                this.x = new a1x((LinearLayout) inflate, robotoTextView, robotoTextView2, 1);
                this.y = new u90(9, this);
                bubbleComponent.setDecorator(dgr0Var);
                dgr0Var.b(new bdc(xng0.bgMain));
                bubbleComponent.setAlpha(0.0f);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public no6(xqi0 xqi0Var, uf60 uf60Var) {
        tje.e();
        this.b = xqi0Var;
        this.c = uf60Var;
        this.w = new Handler();
        Handler handler = new Handler(xqi0Var.b.getLooper());
        this.x = handler;
        handler.post(new xfy(this, 1));
    }

    public no6(int i, float f, d dVar) {
        this.b = dVar;
        this.c = f.g(i);
        this.w = f.f(f);
        this.y = new w5y(i, 30, 100);
    }

    public no6(androidx.camera.camera2.internal.b bVar, ep7 ep7Var, androidx.camera.core.impl.utils.executor.b bVar2, int i) {
        switch (i) {
            case 5:
                this.a = false;
                xe61 xe61Var = new xe61(this);
                this.b = bVar;
                this.c = bVar2;
                ye61 d = d(ep7Var);
                this.y = d;
                lf61 lf61Var = new lf61(d.getMaxZoom(), d.getMinZoom());
                this.w = lf61Var;
                lf61Var.f(1.0f);
                this.x = new dy40(uiv.e(lf61Var));
                bVar.r(xe61Var);
                break;
            default:
                this.a = false;
                this.b = bVar;
                this.c = new hvo(ep7Var);
                this.w = bVar2;
                break;
        }
    }
}
