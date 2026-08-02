package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.camera.core.impl.CameraCaptureFailure$Reason;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import com.fluttercandies.photo_manager.core.b;
import com.google.common.collect.ImmutableListMultimap;
import com.google.firebase.encoders.EncodingException;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import org.bouncycastle.asn1.ASN1Exception;
import org.brotli.dec.a;
import org.brotli.dec.c;
import org.xmlpull.v1.XmlPullParserException;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.rt.ebs.cryptosdk.entities.exceptions.UnsupportedCommandNavigationEbsException;
import ru.rt.ebs.cryptosdk.presentation.processing.ProcessingFragment;
import ru.rt.ebs.cryptosdk.presentation.verification.EbsVerificationActivity;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class o3 implements cgg, au5, m0b0, l0r0, g3v, pqg, kk71 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object w;

    public o3(AdActivity adActivity) {
        this.a = 23;
        this.w = Collections.newSetFromMap(new ConcurrentHashMap());
        this.c = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = adActivity.getResources().getConfiguration().orientation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e6, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o3 q(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader radialGradient;
        Resources resources2 = resources;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b = xgc.b(resources2, theme, asAttributeSet, xml);
                return new o3((Shader) null, b, b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray i2 = uvb1.i(resources2, theme, asAttributeSet, j4i0.GradientColor);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? i2.getFloat(j4i0.GradientColor_android_startX, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? i2.getFloat(j4i0.GradientColor_android_startY, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? i2.getFloat(j4i0.GradientColor_android_endX, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? i2.getFloat(j4i0.GradientColor_android_endY, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? i2.getFloat(j4i0.GradientColor_android_centerX, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? i2.getFloat(j4i0.GradientColor_android_centerY, 0.0f) : 0.0f;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? i2.getInt(j4i0.GradientColor_android_type, 0) : 0;
        int i4 = 1;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? i2.getColor(j4i0.GradientColor_android_startColor, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? i2.getColor(j4i0.GradientColor_android_centerColor, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? i2.getColor(j4i0.GradientColor_android_endColor, 0) : 0;
        float f9 = f3;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? i2.getInt(j4i0.GradientColor_android_tileMode, 0) : 0;
        float f10 = f4;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? i2.getFloat(j4i0.GradientColor_android_gradientRadius, 0.0f) : 0.0f;
        i2.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f11;
            if (next2 == i4) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2) {
                if (depth2 <= depth) {
                    if (xml.getName().equals("item")) {
                        TypedArray i6 = uvb1.i(resources2, theme, asAttributeSet, j4i0.GradientColorItem);
                        boolean hasValue = i6.hasValue(j4i0.GradientColorItem_android_color);
                        boolean hasValue2 = i6.hasValue(j4i0.GradientColorItem_android_offset);
                        if (!hasValue || !hasValue2) {
                            break;
                        }
                        int color4 = i6.getColor(j4i0.GradientColorItem_android_color, 0);
                        float f12 = i6.getFloat(j4i0.GradientColorItem_android_offset, 0.0f);
                        i6.recycle();
                        arrayList2.add(Integer.valueOf(color4));
                        arrayList.add(Float.valueOf(f12));
                    } else {
                        continue;
                    }
                }
                resources2 = resources;
            }
            f11 = f;
            f5 = f2;
            i4 = 1;
        }
        zrm zrmVar = arrayList2.size() > 0 ? new zrm(arrayList2, arrayList) : null;
        if (zrmVar == null) {
            zrmVar = z ? new zrm(color, color2, color3) : new zrm(color, color3);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                radialGradient = new LinearGradient(f9, f10, f2, f6, (int[]) zrmVar.b, (float[]) zrmVar.c, i5 != 1 ? i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) zrmVar.b, (float[]) zrmVar.c);
            }
        } else {
            if (f <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f7, f8, f, (int[]) zrmVar.b, (float[]) zrmVar.c, i5 != 1 ? i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new o3(radialGradient, (ColorStateList) null, 0);
    }

    public static void r(o3 o3Var, a aVar) {
        int length = ((int[]) o3Var.c).length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ((int[]) o3Var.c)[i2] = i;
            c.e(o3Var.b, (int[]) o3Var.w, i, aVar);
            i += 1080;
        }
    }

    public void A(char c, int i, boolean z) {
        if (z) {
            int i2 = this.b;
            if (i2 == 0) {
                return;
            }
            if (i2 == 3) {
                this.b = 0;
                return;
            }
        }
        if (c != "[]()".charAt(this.b)) {
            if (this.b == 2) {
                this.b = 0;
                A(c, i, z);
                return;
            }
            return;
        }
        int[] iArr = (int[]) this.c;
        int i3 = this.b;
        iArr[i3] = i;
        int i4 = i3 + 1;
        this.b = i4;
        if (i4 == iArr.length) {
            if (iArr[1] - iArr[0] > 1 && iArr[3] - iArr[2] > 1) {
                ((r3k0) this.w).a(iArr);
            }
            this.b = 0;
        }
    }

    public void B(boolean z) {
        int i = this.b;
        long[] jArr = (long[]) this.w;
        int length = jArr.length;
        m9b m9bVar = (m9b) this.c;
        m9bVar.D.setVisibility(8);
        m9bVar.F.setEnabled(i > 0);
        m9bVar.E.setEnabled(i < length + (-1));
        m9bVar.C.setText(m9bVar.y.getQuantityString(ewh0.messaging_chat_search_result, length, Integer.valueOf(i + 1), Integer.valueOf(length)));
        long j = jArr[this.b];
        xcz0 xcz0Var = m9bVar.I;
        if (xcz0Var == null || !z) {
            return;
        }
        ycz0 ycz0Var = xcz0Var.a;
        ycz0Var.g.a("timeline search");
        ((i) ((ucz0) ycz0Var.e.get())).u(j, null);
    }

    public a2 C(int i) {
        if (i == 3) {
            return new dd4(this);
        }
        if (i == 4) {
            return new ld4(this);
        }
        if (i == 8) {
            return new ppf(this);
        }
        if (i == 16) {
            pd4 pd4Var = new pd4(1);
            pd4Var.b = this;
            return pd4Var;
        }
        if (i != 17) {
            throw new ASN1Exception(oyr.r(new StringBuilder("unknown DL object encountered: 0x"), i));
        }
        awf awfVar = new awf();
        awfVar.a = this;
        return awfVar;
    }

    public a2 D(int i) {
        if (i == 3) {
            return new dd4(this);
        }
        if (i == 4) {
            return new ld4(this);
        }
        if (i == 8) {
            return new ppf(this);
        }
        if (i == 16) {
            pd4 pd4Var = new pd4(0);
            pd4Var.b = this;
            return pd4Var;
        }
        if (i != 17) {
            throw new ASN1Exception(oyr.r(new StringBuilder("unknown BER object encountered: 0x"), i));
        }
        sd4 sd4Var = new sd4();
        sd4Var.a = this;
        return sd4Var;
    }

    public a2 E(int i, cph cphVar) {
        if (i == 3) {
            return new rvf(cphVar);
        }
        if (i == 4) {
            ld4 ld4Var = new ld4();
            ld4Var.b = cphVar;
            return ld4Var;
        }
        if (i == 8) {
            throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i == 16) {
            throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i == 17) {
            throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return j2.c(i, cphVar, (byte[][]) this.c);
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e, "corrupted stream detected");
        }
    }

    public Object F(SpannableStringBuilder spannableStringBuilder, int i) {
        Object obj = this.c;
        if (obj == null) {
            this.c = ((t3k0) this.w).e();
            this.b = spannableStringBuilder.length() - i;
            return null;
        }
        spannableStringBuilder.setSpan(obj, this.b, spannableStringBuilder.length(), 33);
        Object obj2 = this.c;
        this.c = null;
        return obj2;
    }

    public a2 G() {
        int read = ((InputStream) this.w).read();
        if (read < 0) {
            return null;
        }
        return v(read);
    }

    public b2 H() {
        tfy tfyVar = (tfy) this.w;
        int read = tfyVar.read();
        if (read < 0) {
            return new b2(0);
        }
        b2 b2Var = new b2();
        do {
            z1 u = u(read);
            if (u instanceof llv) {
                b2Var.a(((llv) u).a());
            } else {
                b2Var.a(u.toASN1Primitive());
            }
            read = tfyVar.read();
        } while (read >= 0);
        return b2Var;
    }

    public c2 I() {
        InputStream inputStream = (InputStream) this.w;
        int read = inputStream.read();
        if (read < 0) {
            return new c2(0);
        }
        c2 c2Var = new c2();
        do {
            a2 v = v(read);
            c2Var.a(v instanceof mlv ? ((mlv) v).a() : v.toASN1Primitive());
            read = inputStream.read();
        } while (read >= 0);
        return c2Var;
    }

    public void J() {
        d6z.z((pjl0) this.w);
        ImmutableListMultimap immutableListMultimap = ((pjl0) this.w).c.a;
        HashMap hashMap = new HashMap();
        for (String str : immutableListMultimap.w.keySet()) {
            if (!str.equals("CSeq") && !str.equals(ExtFunctionsKt.HEADER_USER_AGENT) && !str.equals("Session") && !str.equals("Authorization")) {
                hashMap.put(str, (String) eab1.c(immutableListMultimap.f(str)));
            }
        }
        pjl0 pjl0Var = (pjl0) this.w;
        K(t(pjl0Var.b, ((bjl0) this.c).D, hashMap, pjl0Var.a));
    }

    public void K(pjl0 pjl0Var) {
        String b = pjl0Var.c.b("CSeq");
        b.getClass();
        int parseInt = Integer.parseInt(b);
        bjl0 bjl0Var = (bjl0) this.c;
        SparseArray sparseArray = bjl0Var.y;
        d6z.x(sparseArray.get(parseInt) == null);
        sparseArray.append(parseInt, pjl0Var);
        bjl0Var.B.c(ojl0.g(pjl0Var));
        this.w = pjl0Var;
    }

    public byte[] L(int i) {
        yf91 yf91Var;
        ip60 ip60Var;
        sd91 sd91Var;
        ip60 ip60Var2;
        mg91 mg91Var;
        ip60 ip60Var3;
        os91 os91Var;
        ip60 ip60Var4;
        switch (this.a) {
            case 26:
                o501 o501Var = o501.y;
                rqa1 rqa1Var = (rqa1) this.w;
                ((u1b1) this.c).i = Boolean.valueOf(1 == (i ^ 1));
                u1b1 u1b1Var = (u1b1) this.c;
                u1b1Var.g = Boolean.FALSE;
                rqa1Var.a = new c2b1(u1b1Var);
                try {
                    dab1.t();
                    if (i == 0) {
                        dra1 dra1Var = new dra1(rqa1Var);
                        mcx mcxVar = new mcx();
                        o501Var.C(mcxVar);
                        mcxVar.d = true;
                        StringWriter stringWriter = new StringWriter();
                        try {
                            zex zexVar = new zex(stringWriter, mcxVar.a, mcxVar.b, mcxVar.c, mcxVar.d);
                            zexVar.g(dra1Var);
                            zexVar.i();
                            zexVar.b.flush();
                        } catch (IOException unused) {
                        }
                        return stringWriter.toString().getBytes("utf-8");
                    }
                    dra1 dra1Var2 = new dra1(rqa1Var);
                    gg91 gg91Var = new gg91();
                    o501Var.C(gg91Var);
                    HashMap hashMap = new HashMap(gg91Var.a);
                    HashMap hashMap2 = new HashMap(gg91Var.b);
                    w591 w591Var = gg91Var.c;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        yf91Var = new yf91(byteArrayOutputStream, hashMap, hashMap2, w591Var);
                        ip60Var = (ip60) hashMap.get(dra1.class);
                    } catch (IOException unused2) {
                    }
                    if (ip60Var == null) {
                        throw new EncodingException("No encoder for ".concat(String.valueOf(dra1.class)));
                    }
                    ip60Var.a(dra1Var2, yf91Var);
                    return byteArrayOutputStream.toByteArray();
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 27:
                q501 q501Var = q501.x;
                l8b1 l8b1Var = (l8b1) this.w;
                ((inb1) this.c).i = Boolean.valueOf(1 == (i ^ 1));
                inb1 inb1Var = (inb1) this.c;
                inb1Var.g = Boolean.FALSE;
                l8b1Var.a = new onb1(inb1Var);
                try {
                    msb1.l();
                    if (i == 0) {
                        r8b1 r8b1Var = new r8b1(l8b1Var);
                        mcx mcxVar2 = new mcx();
                        q501Var.t(mcxVar2);
                        mcxVar2.d = true;
                        StringWriter stringWriter2 = new StringWriter();
                        try {
                            zex zexVar2 = new zex(stringWriter2, mcxVar2.a, mcxVar2.b, mcxVar2.c, mcxVar2.d);
                            zexVar2.g(r8b1Var);
                            zexVar2.i();
                            zexVar2.b.flush();
                        } catch (IOException unused3) {
                        }
                        return stringWriter2.toString().getBytes("utf-8");
                    }
                    r8b1 r8b1Var2 = new r8b1(l8b1Var);
                    ae91 ae91Var = new ae91();
                    q501Var.t(ae91Var);
                    HashMap hashMap3 = new HashMap(ae91Var.a);
                    HashMap hashMap4 = new HashMap(ae91Var.b);
                    w591 w591Var2 = ae91Var.c;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        sd91Var = new sd91(byteArrayOutputStream2, hashMap3, hashMap4, w591Var2);
                        ip60Var2 = (ip60) hashMap3.get(r8b1.class);
                    } catch (IOException unused4) {
                    }
                    if (ip60Var2 == null) {
                        throw new EncodingException("No encoder for ".concat(String.valueOf(r8b1.class)));
                    }
                    ip60Var2.a(r8b1Var2, sd91Var);
                    return byteArrayOutputStream2.toByteArray();
                } catch (UnsupportedEncodingException e2) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
                }
            case 28:
                wly0 wly0Var = wly0.y;
                ebb1 ebb1Var = (ebb1) this.w;
                ((jpb1) this.c).i = Boolean.valueOf(1 == (i ^ 1));
                jpb1 jpb1Var = (jpb1) this.c;
                jpb1Var.g = Boolean.FALSE;
                ebb1Var.a = new opb1(jpb1Var);
                try {
                    qtb1.s();
                    if (i == 0) {
                        jbb1 jbb1Var = new jbb1(ebb1Var);
                        mcx mcxVar3 = new mcx();
                        wly0Var.n(mcxVar3);
                        mcxVar3.d = true;
                        StringWriter stringWriter3 = new StringWriter();
                        try {
                            zex zexVar3 = new zex(stringWriter3, mcxVar3.a, mcxVar3.b, mcxVar3.c, mcxVar3.d);
                            zexVar3.g(jbb1Var);
                            zexVar3.i();
                            zexVar3.b.flush();
                        } catch (IOException unused5) {
                        }
                        return stringWriter3.toString().getBytes("utf-8");
                    }
                    jbb1 jbb1Var2 = new jbb1(ebb1Var);
                    lh91 lh91Var = new lh91();
                    wly0Var.n(lh91Var);
                    HashMap hashMap5 = new HashMap(lh91Var.a);
                    HashMap hashMap6 = new HashMap(lh91Var.b);
                    hh91 hh91Var = lh91Var.c;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        mg91Var = new mg91(byteArrayOutputStream3, hashMap5, hashMap6, hh91Var);
                        ip60Var3 = (ip60) hashMap5.get(jbb1.class);
                    } catch (IOException unused6) {
                    }
                    if (ip60Var3 == null) {
                        throw new EncodingException("No encoder for ".concat(String.valueOf(jbb1.class)));
                    }
                    ip60Var3.a(jbb1Var2, mg91Var);
                    return byteArrayOutputStream3.toByteArray();
                } catch (UnsupportedEncodingException e3) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e3);
                }
            default:
                wbz0 wbz0Var = wbz0.y;
                ekb1 ekb1Var = (ekb1) this.w;
                ((eub1) this.c).i = Boolean.valueOf(1 == (i ^ 1));
                eub1 eub1Var = (eub1) this.c;
                eub1Var.g = Boolean.FALSE;
                ekb1Var.a = new fub1(eub1Var);
                try {
                    vvb1.z();
                    if (i == 0) {
                        mkb1 mkb1Var = new mkb1(ekb1Var);
                        mcx mcxVar4 = new mcx();
                        wbz0Var.j(mcxVar4);
                        mcxVar4.d = true;
                        StringWriter stringWriter4 = new StringWriter();
                        try {
                            zex zexVar4 = new zex(stringWriter4, mcxVar4.a, mcxVar4.b, mcxVar4.c, mcxVar4.d);
                            zexVar4.g(mkb1Var);
                            zexVar4.i();
                            zexVar4.b.flush();
                        } catch (IOException unused7) {
                        }
                        return stringWriter4.toString().getBytes("utf-8");
                    }
                    mkb1 mkb1Var2 = new mkb1(ekb1Var);
                    zs91 zs91Var = new zs91();
                    wbz0Var.j(zs91Var);
                    HashMap hashMap7 = new HashMap(zs91Var.a);
                    HashMap hashMap8 = new HashMap(zs91Var.b);
                    ys91 ys91Var = zs91Var.c;
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        os91Var = new os91(byteArrayOutputStream4, hashMap7, hashMap8, ys91Var);
                        ip60Var4 = (ip60) hashMap7.get(mkb1.class);
                    } catch (IOException unused8) {
                    }
                    if (ip60Var4 == null) {
                        throw new EncodingException("No encoder for ".concat(String.valueOf(mkb1.class)));
                    }
                    ip60Var4.a(mkb1Var2, os91Var);
                    return byteArrayOutputStream4.toByteArray();
                } catch (UnsupportedEncodingException e4) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e4);
                }
        }
    }

    @Override // defpackage.au5
    public zt5 a(c5p c5pVar, long j) {
        long position = c5pVar.getPosition();
        long s = s(c5pVar);
        long L = c5pVar.L();
        c5pVar.N(Math.max(6, ((cfr) this.w).c));
        long s2 = s(c5pVar);
        return (s > j || s2 <= j) ? s2 <= j ? new zt5(-2, s2, c5pVar.L()) : new zt5(-1, s, position) : new zt5(0, -9223372036854775807L, L);
    }

    @Override // defpackage.l0r0
    public void b(ap7 ap7Var) {
        this.c = ap7Var;
    }

    @Override // defpackage.l0r0
    public void c() {
        ap7 ap7Var = (ap7) this.c;
        if (ap7Var == null) {
            ap7Var = new zo7();
        }
        Iterator it = ((List) this.w).iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).b(this.b, ap7Var);
        }
    }

    @Override // defpackage.cgg
    public dgg createDashChunkSource(tyy tyyVar, egg eggVar, jc5 jc5Var, int i, int[] iArr, loo looVar, int i2, long j, boolean z, List list, syc0 syc0Var, cj01 cj01Var, vyc0 vyc0Var, t8c t8cVar) {
        kpg createDataSource = ((ipg) this.w).createDataSource();
        if (cj01Var != null) {
            createDataSource.addTransferListener(cj01Var);
        }
        return new k9h((ru6) this.c, tyyVar, eggVar, jc5Var, i, iArr, looVar, i2, createDataSource, j, this.b, z, (ArrayList) list, syc0Var);
    }

    @Override // defpackage.kk71
    public zt5 d(w971 w971Var, long j) {
        long j2 = w971Var.w;
        long l = l(w971Var);
        long j3 = w971Var.w + w971Var.y;
        w971Var.c(Math.max(6, ((cfr) this.w).c), false);
        long l2 = l(w971Var);
        return (l > j || l2 <= j) ? l2 <= j ? new zt5(-2, l2, w971Var.w + w971Var.y) : new zt5(-1, l, j2) : new zt5(0, -9223372036854775807L, j3);
    }

    @Override // defpackage.pqg
    public void e(nqg nqgVar) {
        ((Handler) this.c).post(nqgVar.b);
    }

    @Override // defpackage.cgg
    public cgg experimentalParseSubtitlesDuringExtraction(boolean z) {
        ((ru6) this.c).b = z;
        return this;
    }

    @Override // defpackage.cgg
    public cgg experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        ((ru6) this.c).getClass();
        return this;
    }

    @Override // defpackage.m0b0
    public void f() {
        ozj0 ozj0Var = (ozj0) this.w;
        t0b0 t0b0Var = ((b) this.c).c;
        ozj0Var.a(Integer.valueOf(t0b0Var.c.a(t0b0Var.b, this.b).getValue()));
    }

    @Override // defpackage.l0r0
    public void g() {
        Iterator it = ((List) this.w).iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).c(this.b, new xo7(CameraCaptureFailure$Reason.ERROR));
        }
    }

    @Override // defpackage.cgg
    public androidx.media3.common.a getOutputTextFormat(androidx.media3.common.a aVar) {
        ru6 ru6Var = (ru6) this.c;
        if (!ru6Var.b || !ru6Var.a.supportsFormat(aVar)) {
            return aVar;
        }
        f7s a = aVar.a();
        String str = aVar.k;
        a.m = eh20.q("application/x-media3-cues");
        a.I = ru6Var.a.a(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.n);
        sb.append(str != null ? " ".concat(str) : "");
        a.j = sb.toString();
        a.r = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        return new androidx.media3.common.a(a);
    }

    @Override // defpackage.m0b0
    public void i() {
        t0b0 t0b0Var = ((b) this.c).c;
        ((ozj0) this.w).a(Integer.valueOf(t0b0Var.c.a(t0b0Var.b, this.b).getValue()));
    }

    @Override // defpackage.l0r0
    public void j() {
        Iterator it = ((List) this.w).iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).e(this.b);
        }
    }

    @Override // defpackage.pqg
    public void k() {
        HandlerThread handlerThread = (HandlerThread) this.w;
        if (handlerThread != null) {
            handlerThread.quit();
            this.w = null;
            this.c = null;
        }
    }

    public long l(w971 w971Var) {
        long j;
        long j2;
        boolean a;
        int f;
        r291 r291Var = (r291) this.c;
        cfr cfrVar = (cfr) this.w;
        while (true) {
            long j3 = w971Var.w;
            j = w971Var.c;
            long j4 = j3 + w971Var.y;
            if (j4 >= j - 6) {
                j2 = 6;
                break;
            }
            int i = this.b;
            byte[] bArr = new byte[2];
            w971Var.I(bArr, 0, 2, false);
            j2 = 6;
            if (((bArr[1] & 255) | ((bArr[0] & 255) << 8)) != i) {
                w971Var.y = 0;
                w971Var.c((int) (j4 - w971Var.w), false);
                a = false;
            } else {
                dl81 dl81Var = new dl81(16);
                System.arraycopy(bArr, 0, dl81Var.a, 0, 2);
                byte[] bArr2 = dl81Var.a;
                int i2 = 0;
                for (int i3 = 2; i2 < 14 && (f = w971Var.f(i3 + i2, 14 - i2, bArr2)) != -1; i3 = 2) {
                    i2 += f;
                }
                dl81Var.k(i2);
                w971Var.y = 0;
                w971Var.c((int) (j4 - w971Var.w), false);
                a = v3a1.a(dl81Var, cfrVar, i, r291Var);
            }
            if (a) {
                break;
            }
            w971Var.c(1, false);
        }
        long j5 = w971Var.w + w971Var.y;
        if (j5 < j - j2) {
            return r291Var.a;
        }
        w971Var.c((int) (j - j5), false);
        return cfrVar.j;
    }

    public void n(t2v[] t2vVarArr) {
        EbsVerificationActivity ebsVerificationActivity = (EbsVerificationActivity) this.w;
        int i = this.b;
        FragmentManager fragmentManager = (FragmentManager) this.c;
        for (t2v t2vVar : t2vVarArr) {
            if (t2vVar instanceof i5c) {
                ebsVerificationActivity.setResult(-1);
                ebsVerificationActivity.finish();
            } else {
                zy11 zy11Var = null;
                if (t2vVar instanceof c1j0) {
                    mds mdsVar = ((c1j0) t2vVar).a;
                    androidx.fragment.app.a h = g8e.h(fragmentManager, fragmentManager);
                    h.h(i, mdsVar.a(), null);
                    h.d();
                } else if (t2vVar instanceof d1j0) {
                    mds mdsVar2 = ((d1j0) t2vVar).a;
                    String d = qoi0.a(mdsVar2.getClass()).d();
                    Fragment F = fragmentManager.F(d);
                    if (F != null) {
                        ProcessingFragment processingFragment = F instanceof ProcessingFragment ? (ProcessingFragment) F : null;
                        if (processingFragment != null) {
                            processingFragment.triggerProcessEvent();
                            zy11Var = zy11.a;
                        }
                        if (zy11Var != null) {
                        }
                    }
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                    aVar.h(i, mdsVar2.a(), d);
                    aVar.m();
                } else if (t2vVar instanceof x550) {
                    x550 x550Var = (x550) t2vVar;
                    wfp0 wfp0Var = x550Var.a;
                    String str = x550Var.b;
                    if (fragmentManager.F(str) != null) {
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
                        aVar2.h(i, wfp0Var.a(), str);
                        aVar2.d();
                    } else {
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(fragmentManager);
                        aVar3.f(i, wfp0Var.a(), str, 1);
                        aVar3.d();
                    }
                } else {
                    if (!(t2vVar instanceof uwi0)) {
                        throw new UnsupportedCommandNavigationEbsException(t2vVar.getClass().getName());
                    }
                    Fragment F2 = fragmentManager.F(((uwi0) t2vVar).a);
                    if (F2 != null) {
                        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(fragmentManager);
                        aVar4.p(F2);
                        aVar4.d();
                    }
                }
            }
        }
    }

    public void o(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        float f = i;
        ViewPropertyAnimator translationY = ((View) ((i3y) this.w).getValue()).animate().translationY(f);
        PathInterpolator pathInterpolator = pcv0.a;
        translationY.setInterpolator(pathInterpolator).setDuration(400L).start();
        View view = (View) ((i3y) this.c).getValue();
        if (view != null) {
            view.animate().translationY(f).setInterpolator(pathInterpolator).setDuration(400L).start();
        }
    }

    @Override // defpackage.l0r0
    public void onCaptureProcessProgressed(int i) {
        Iterator it = ((List) this.w).iterator();
        while (it.hasNext()) {
            ((uo7) it.next()).d(this.b, i);
        }
    }

    public Object p(int i) {
        SparseArray sparseArray = (SparseArray) this.w;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    public long s(c5p c5pVar) {
        int p;
        yer yerVar = (yer) this.c;
        cfr cfrVar = (cfr) this.w;
        while (c5pVar.L() < c5pVar.getLength() - 6) {
            int i = this.b;
            long L = c5pVar.L();
            byte[] bArr = new byte[2];
            int i2 = 0;
            boolean b = false;
            c5pVar.g(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                c5pVar.J();
                c5pVar.N((int) (L - c5pVar.getPosition()));
            } else {
                ef90 ef90Var = new ef90(16);
                System.arraycopy(bArr, 0, ef90Var.a, 0, 2);
                byte[] bArr2 = ef90Var.a;
                while (i2 < 14 && (p = c5pVar.p(2 + i2, 14 - i2, bArr2)) != -1) {
                    i2 += p;
                }
                ef90Var.J(i2);
                c5pVar.J();
                c5pVar.N((int) (L - c5pVar.getPosition()));
                b = joa1.b(ef90Var, cfrVar, i, yerVar);
            }
            if (b) {
                break;
            }
            c5pVar.N(1);
        }
        if (c5pVar.L() < c5pVar.getLength() - 6) {
            return yerVar.a;
        }
        c5pVar.N((int) (c5pVar.getLength() - c5pVar.L()));
        return cfrVar.j;
    }

    @Override // defpackage.cgg
    public cgg setSubtitleParserFactory(o2v0 o2v0Var) {
        ru6 ru6Var = (ru6) this.c;
        ru6Var.getClass();
        ru6Var.a = (dlh) o2v0Var;
        return this;
    }

    @Override // defpackage.pqg
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.b);
        this.w = handlerThread;
        handlerThread.start();
        this.c = new Handler(((HandlerThread) this.w).getLooper());
    }

    public pjl0 t(int i, String str, Map map, Uri uri) {
        bjl0 bjl0Var = (bjl0) this.c;
        String str2 = bjl0Var.c;
        int i2 = this.b;
        this.b = i2 + 1;
        cjl0 cjl0Var = new cjl0(str2, str, i2);
        if (bjl0Var.G != null) {
            d6z.z(bjl0Var.C);
            try {
                cjl0Var.a("Authorization", bjl0Var.G.d(bjl0Var.C, uri, i));
            } catch (ParserException e) {
                bjl0.a(bjl0Var, new RtspMediaSource$RtspPlaybackException(e));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            cjl0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new pjl0(uri, i, new djl0(cjl0Var), "");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[][], java.io.Serializable] */
    public z1 u(int i) {
        r3 r3Var;
        ?? r0 = (byte[][]) this.c;
        int i2 = this.b;
        tfy tfyVar = (tfy) this.w;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (tfyVar instanceof rqv) {
            ((rqv) tfyVar).d(false);
        }
        int n = i2.n(i, tfyVar);
        int i3 = 1;
        int i4 = 4;
        int i5 = 3;
        int e = i2.e(tfyVar, i2, n == 3 || n == 4 || n == 16 || n == 17 || n == 8);
        if (e < 0) {
            if ((i & 32) == 0) {
                ny61.v("indefinite-length primitive encoding encountered");
                return null;
            }
            o3 o3Var = new o3((Object) new rqv(i2, tfyVar), i2, (Serializable) r0, (int) (z3 ? 1 : 0));
            int i6 = i & 192;
            if (i6 != 0) {
                return 64 == i6 ? new zc4(64, n, o3Var) : new vd4(i6, n, o3Var);
            }
            if (n == 3) {
                return new cd4(o3Var);
            }
            if (n == 4) {
                return new kd4(o3Var);
            }
            if (n == 8) {
                return new od4(o3Var);
            }
            if (n == 16) {
                od4 od4Var = new od4((int) (z2 ? 1 : 0));
                od4Var.b = o3Var;
                return od4Var;
            }
            if (n != 17) {
                throw new ru.domesticroots.bouncycastle.asn1.ASN1Exception(oyr.r(new StringBuilder("unknown BER object encountered: 0x"), n));
            }
            od4 od4Var2 = new od4(i3);
            od4Var2.b = o3Var;
            return od4Var2;
        }
        bph bphVar = new bph(tfyVar, e, i2);
        if ((i & 224) == 0) {
            if (n == 3) {
                return new qvf(bphVar);
            }
            if (n == 4) {
                kd4 kd4Var = new kd4();
                kd4Var.b = bphVar;
                return kd4Var;
            }
            if (n == 8) {
                throw new ru.domesticroots.bouncycastle.asn1.ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
            }
            if (n == 16) {
                throw new ru.domesticroots.bouncycastle.asn1.ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (n == 17) {
                throw new ru.domesticroots.bouncycastle.asn1.ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return i2.c(n, bphVar, r0);
            } catch (IllegalArgumentException e2) {
                throw new ru.domesticroots.bouncycastle.asn1.ASN1Exception("corrupted stream detected", e2);
            }
        }
        o3 o3Var2 = new o3((Object) bphVar, bphVar.b, (Serializable) r0, (int) (z ? 1 : 0));
        int i7 = i & 192;
        if (i7 != 0) {
            boolean z4 = (i & 32) != 0;
            if (64 != i7) {
                return new bwf(i7, n, z4, o3Var2);
            }
            if (z4) {
                r3Var = r3.p(i7, n, o3Var2.H());
            } else {
                td4 td4Var = new td4(i4, i7, n, new cqf(bphVar.c()), 2);
                r3Var = td4Var;
                if (i7 == 64) {
                    r3Var = new nvf(td4Var);
                }
            }
            return (nvf) r3Var;
        }
        if (n == 3) {
            return new cd4(o3Var2);
        }
        if (n == 4) {
            return new kd4(o3Var2);
        }
        if (n == 8) {
            return new od4(o3Var2);
        }
        if (n == 16) {
            od4 od4Var3 = new od4(i5);
            od4Var3.b = o3Var2;
            return od4Var3;
        }
        if (n != 17) {
            throw new ru.domesticroots.bouncycastle.asn1.ASN1Exception(oyr.r(new StringBuilder("unknown DL object encountered: 0x"), n));
        }
        od4 od4Var4 = new od4(4);
        od4Var4.b = o3Var2;
        return od4Var4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[][], java.io.Serializable] */
    public a2 v(int i) {
        ?? r0 = (byte[][]) this.c;
        int i2 = this.b;
        InputStream inputStream = (InputStream) this.w;
        if (inputStream instanceof sqv) {
            sqv sqvVar = (sqv) inputStream;
            sqvVar.y = false;
            sqvVar.c();
        }
        int o = j2.o(i, inputStream);
        int i3 = 1;
        int k = j2.k(inputStream, i2, o == 3 || o == 4 || o == 16 || o == 17 || o == 8);
        if (k < 0) {
            if ((i & 32) == 0) {
                ny61.v("indefinite-length primitive encoding encountered");
                return null;
            }
            o3 o3Var = new o3(new sqv(i2, inputStream), i2, (Serializable) r0, i3);
            int i4 = i & 192;
            return i4 != 0 ? new wd4(i4, o, o3Var) : o3Var.D(o);
        }
        cph cphVar = new cph(inputStream, k, i2);
        if ((i & 224) == 0) {
            return E(o, cphVar);
        }
        o3 o3Var2 = new o3(cphVar, cphVar.b, (Serializable) r0, i3);
        int i5 = i & 192;
        if (i5 != 0) {
            return new cwf(i5, o, (i & 32) != 0, o3Var2);
        }
        return o3Var2.C(o);
    }

    public boolean w() {
        ColorStateList colorStateList;
        return ((Shader) this.w) == null && (colorStateList = (ColorStateList) this.c) != null && colorStateList.isStateful();
    }

    public r3 x(int i, int i2) {
        md4 md4Var;
        int i3;
        td4 td4Var;
        b2 H = H();
        int i4 = H.b;
        int i5 = 0;
        if (i4 == 1) {
            i3 = i;
            td4Var = new td4(3, i3, i2, H.c(0), 0);
        } else {
            if (i4 < 1) {
                md4Var = ed4.a;
            } else {
                md4 md4Var2 = ed4.a;
                md4Var = new md4(H);
            }
            i3 = i;
            td4Var = new td4(4, i, i2, md4Var, 0);
        }
        return i3 != 64 ? td4Var : new yc4(td4Var, i5);
    }

    public ud4 y(int i, int i2) {
        c2 I = I();
        int i3 = I.b;
        if (i3 == 1) {
            return new ud4(3, i, i2, I.c(0));
        }
        nd4 nd4Var = fd4.a;
        return new ud4(4, i, i2, i3 < 1 ? fd4.a : new nd4(I));
    }

    public void z(String str) {
        int i = this.b;
        if (i > 1) {
            rwo rwoVar = (rwo) this.c;
            sv90 sv90Var = qv90.a;
            String str2 = (String) this.w;
            sv90Var.getClass();
            String p = g8e.p(g8e.p("Был сделан повторный запрос в дайхард: количество попыток - " + i, ", результат - ", str), ", request = ", str2);
            wj00 wj00Var = new wj00(0);
            wj00Var.k("request", str2);
            wj00Var.j(i, "attempts");
            wj00Var.k(TarifficatorScenarioActivity.RESULT_KEY, str);
            wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
            ((y22) rwoVar).a(y891.c("retry_diehard_request", wj00Var));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte[][], java.io.Serializable] */
    public o3(int i, InputStream inputStream) {
        this(inputStream, i, (Serializable) new byte[11][], 1);
        this.a = 1;
    }

    public o3(int i, String str, ArrayList arrayList) {
        this.a = 25;
        this.b = i;
        this.c = str;
        this.w = arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o3(InputStream inputStream) {
        this(zgb1.c(inputStream), inputStream);
        this.a = 1;
    }

    public /* synthetic */ o3(Object obj, int i, Serializable serializable, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = i;
        this.c = serializable;
    }

    public o3(cfr cfrVar, int i, byte b) {
        this.a = 22;
        this.w = cfrVar;
        this.b = i;
        this.c = new r291();
    }

    public /* synthetic */ o3() {
        this.a = 8;
    }

    public o3(su71 su71Var) {
        this.a = 21;
        this.w = new SparseArray();
        this.c = su71Var;
        this.b = -1;
    }

    public o3(sl81 sl81Var) {
        this.a = 24;
        z981 z981Var = z981.a;
        this.c = sl81Var;
        this.w = z981Var;
        this.b = Integer.MAX_VALUE;
    }

    public o3(rqa1 rqa1Var, int i) {
        this.a = 26;
        this.c = new u1b1();
        this.w = rqa1Var;
        dab1.t();
        this.b = i;
    }

    public o3(l8b1 l8b1Var, int i) {
        this.a = 27;
        this.c = new inb1();
        this.w = l8b1Var;
        msb1.l();
        this.b = i;
    }

    public o3(ebb1 ebb1Var, int i) {
        this.a = 28;
        this.c = new jpb1();
        this.w = ebb1Var;
        qtb1.s();
        this.b = i;
    }

    public o3(ekb1 ekb1Var, int i) {
        this.a = 29;
        this.c = new eub1();
        this.w = ekb1Var;
        vvb1.z();
        this.b = i;
    }

    public o3(EbsVerificationActivity ebsVerificationActivity, int i) {
        this.a = 17;
        FragmentManager supportFragmentManager = ebsVerificationActivity.getSupportFragmentManager();
        this.w = ebsVerificationActivity;
        this.b = i;
        this.c = supportFragmentManager;
    }

    public o3(g7t0 g7t0Var, g7t0 g7t0Var2) {
        this.a = 19;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = kotlin.a.b(lazyThreadSafetyMode, g7t0Var);
        this.c = kotlin.a.b(lazyThreadSafetyMode, g7t0Var2);
    }

    public o3(Fragment fragment) {
        this.a = 11;
        this.w = fragment;
        this.c = new SparseArray();
    }

    public o3(r3k0 r3k0Var) {
        this.a = 9;
        this.c = new int[4];
        this.b = 0;
        this.w = r3k0Var;
    }

    public o3(int i, djl0 djl0Var, String str) {
        this.a = 16;
        this.b = i;
        this.w = djl0Var;
        this.c = str;
    }

    public o3(String str, rwo rwoVar) {
        this.a = 5;
        this.w = str;
        this.c = rwoVar;
    }

    public o3(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 3;
        this.w = shader;
        this.c = colorStateList;
        this.b = i;
    }

    public o3(int i) {
        this.a = 18;
        this.b = i;
    }

    public o3(cfr cfrVar, int i) {
        this.a = 7;
        this.w = cfrVar;
        this.b = i;
        this.c = new yer();
    }

    public o3(ipg ipgVar) {
        this.a = 4;
        this.c = new ru6();
        this.w = ipgVar;
        this.b = 1;
    }

    public o3(ozj0 ozj0Var, b bVar, int i, boolean z) {
        this.a = 12;
        this.w = ozj0Var;
        this.c = bVar;
        this.b = i;
    }

    public o3(m9b m9bVar, long[] jArr) {
        this.a = 2;
        this.c = m9bVar;
        this.b = -1;
        this.w = jArr;
    }

    public o3(t3k0 t3k0Var) {
        this.a = 14;
        this.w = t3k0Var;
    }

    public o3(bjl0 bjl0Var) {
        this.a = 15;
        this.c = bjl0Var;
    }

    public o3(int i, List list) {
        this.a = 13;
        this.c = null;
        this.b = i;
        this.w = list;
    }

    public o3(g1o g1oVar) {
        this.a = 6;
        this.c = qh91.d(150, new jln(6, this));
        this.w = g1oVar;
    }
}
