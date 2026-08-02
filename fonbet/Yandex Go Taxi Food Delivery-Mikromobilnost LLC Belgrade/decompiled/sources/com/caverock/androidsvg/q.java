package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import com.adjust.sdk.Constants;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.aml0;
import defpackage.anl0;
import defpackage.bml0;
import defpackage.bnl0;
import defpackage.bol0;
import defpackage.cnl0;
import defpackage.col0;
import defpackage.d7g0;
import defpackage.dml0;
import defpackage.dn60;
import defpackage.dnl0;
import defpackage.dol0;
import defpackage.eml0;
import defpackage.enl0;
import defpackage.eol0;
import defpackage.fml0;
import defpackage.fnl0;
import defpackage.fol0;
import defpackage.g8e;
import defpackage.gml0;
import defpackage.gnl0;
import defpackage.h0n;
import defpackage.hml0;
import defpackage.hnl0;
import defpackage.hxe0;
import defpackage.iml0;
import defpackage.inl0;
import defpackage.jnl0;
import defpackage.kdd0;
import defpackage.kml0;
import defpackage.knl0;
import defpackage.lml0;
import defpackage.lnl0;
import defpackage.mnl0;
import defpackage.nml0;
import defpackage.nnl0;
import defpackage.oml0;
import defpackage.onl0;
import defpackage.oyr;
import defpackage.pml0;
import defpackage.pnl0;
import defpackage.pt3;
import defpackage.qml0;
import defpackage.qnl0;
import defpackage.rml0;
import defpackage.sml0;
import defpackage.tml0;
import defpackage.uml0;
import defpackage.vml0;
import defpackage.w97;
import defpackage.wll0;
import defpackage.wml0;
import defpackage.xll0;
import defpackage.yi6;
import defpackage.yll0;
import defpackage.yml0;
import defpackage.zll0;
import defpackage.zml0;
import io.appmetrica.analytics.BuildConfig;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public final class q {
    public int d;
    public l a = null;
    public wml0 b = null;
    public boolean c = false;
    public boolean e = false;
    public SVGParser$SVGElem f = null;
    public StringBuilder g = null;
    public boolean h = false;
    public StringBuilder i = null;

    public static Matrix A(String str) {
        Matrix matrix = new Matrix();
        p pVar = new p(str);
        pVar.q();
        while (!pVar.f()) {
            String str2 = null;
            if (!pVar.f()) {
                int i = pVar.b;
                String str3 = pVar.a;
                int charAt = str3.charAt(i);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = pVar.a();
                    }
                }
                int i2 = pVar.b;
                while (p.g(charAt)) {
                    charAt = pVar.a();
                }
                if (charAt == 40) {
                    pVar.b++;
                    str2 = str3.substring(i, i2);
                } else {
                    pVar.b = i;
                }
            }
            if (str2 == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (str2) {
                case "matrix":
                    pVar.q();
                    float i3 = pVar.i();
                    pVar.p();
                    float i4 = pVar.i();
                    pVar.p();
                    float i5 = pVar.i();
                    pVar.p();
                    float i6 = pVar.i();
                    pVar.p();
                    float i7 = pVar.i();
                    pVar.p();
                    float i8 = pVar.i();
                    pVar.q();
                    if (!Float.isNaN(i8) && pVar.d(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{i3, i5, i7, i4, i6, i8, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                case "rotate":
                    pVar.q();
                    float i9 = pVar.i();
                    float o = pVar.o();
                    float o2 = pVar.o();
                    pVar.q();
                    if (Float.isNaN(i9) || !pVar.d(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(o)) {
                        matrix.preRotate(i9);
                        break;
                    } else if (!Float.isNaN(o2)) {
                        matrix.preRotate(i9, o, o2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                case "scale":
                    pVar.q();
                    float i10 = pVar.i();
                    float o3 = pVar.o();
                    pVar.q();
                    if (!Float.isNaN(i10) && pVar.d(')')) {
                        if (!Float.isNaN(o3)) {
                            matrix.preScale(i10, o3);
                            break;
                        } else {
                            matrix.preScale(i10, i10);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    pVar.q();
                    float i11 = pVar.i();
                    pVar.q();
                    if (!Float.isNaN(i11) && pVar.d(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(i11)), 0.0f);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    pVar.q();
                    float i12 = pVar.i();
                    pVar.q();
                    if (!Float.isNaN(i12) && pVar.d(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(i12)));
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    pVar.q();
                    float i13 = pVar.i();
                    float o4 = pVar.o();
                    pVar.q();
                    if (!Float.isNaN(i13) && pVar.d(')')) {
                        if (!Float.isNaN(o4)) {
                            matrix.preTranslate(i13, o4);
                            break;
                        } else {
                            matrix.preTranslate(i13, 0.0f);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new SVGParseException(oyr.p("Invalid transform list fn: ", str2, Extension.C_BRAKE));
            }
            if (pVar.f()) {
                return matrix;
            }
            pVar.p();
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void E(k kVar, String str, String str2) {
        j j;
        j jVar;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int i = n.b[SVGParser$SVGAttr.a(str).ordinal()];
        zll0 zll0Var = zll0.a;
        SVG$Style$FillRule sVG$Style$FillRule = null;
        j jVar2 = null;
        SVG$Style$RenderQuality sVG$Style$RenderQuality = null;
        SVG$Style$VectorEffect sVG$Style$VectorEffect = null;
        SVG$Style$FillRule sVG$Style$FillRule2 = null;
        r12 = null;
        r12 = null;
        kdd0 kdd0Var = null;
        Boolean bool = null;
        SVG$Style$TextAnchor sVG$Style$TextAnchor = null;
        SVG$Style$TextDirection sVG$Style$TextDirection = null;
        SVG$Style$TextDecoration sVG$Style$TextDecoration = null;
        SVG$Style$FontStyle sVG$Style$FontStyle = null;
        String str3 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        j[] jVarArr = null;
        SVG$Style$LineJoin sVG$Style$LineJoin = null;
        SVG$Style$LineCap sVG$Style$LineCap = null;
        try {
            switch (i) {
                case 47:
                    bnl0 x = x(str2);
                    kVar.b = x;
                    if (x != null) {
                        kVar.a |= 1;
                        break;
                    }
                    break;
                case 48:
                    if ("nonzero".equals(str2)) {
                        sVG$Style$FillRule = SVG$Style$FillRule.NonZero;
                    } else if ("evenodd".equals(str2)) {
                        sVG$Style$FillRule = SVG$Style$FillRule.EvenOdd;
                    }
                    kVar.c = sVG$Style$FillRule;
                    if (sVG$Style$FillRule != null) {
                        kVar.a |= 2;
                        break;
                    }
                    break;
                case 49:
                    Float w = w(str2);
                    kVar.w = w;
                    if (w != null) {
                        kVar.a |= 4;
                        break;
                    }
                    break;
                case 50:
                    bnl0 x2 = x(str2);
                    kVar.x = x2;
                    if (x2 != null) {
                        kVar.a |= 8;
                        break;
                    }
                    break;
                case SAFETY_TIPS_VALUE:
                    Float w2 = w(str2);
                    kVar.y = w2;
                    if (w2 != null) {
                        kVar.a |= 16;
                        break;
                    }
                    break;
                case 52:
                    kVar.z = t(str2);
                    kVar.a |= 32;
                    break;
                case 53:
                    if ("butt".equals(str2)) {
                        sVG$Style$LineCap = SVG$Style$LineCap.Butt;
                    } else if ("round".equals(str2)) {
                        sVG$Style$LineCap = SVG$Style$LineCap.Round;
                    } else if ("square".equals(str2)) {
                        sVG$Style$LineCap = SVG$Style$LineCap.Square;
                    }
                    kVar.A = sVG$Style$LineCap;
                    if (sVG$Style$LineCap != null) {
                        kVar.a |= 64;
                        break;
                    }
                    break;
                case 54:
                    if ("miter".equals(str2)) {
                        sVG$Style$LineJoin = SVG$Style$LineJoin.Miter;
                    } else if ("round".equals(str2)) {
                        sVG$Style$LineJoin = SVG$Style$LineJoin.Round;
                    } else if ("bevel".equals(str2)) {
                        sVG$Style$LineJoin = SVG$Style$LineJoin.Bevel;
                    }
                    kVar.B = sVG$Style$LineJoin;
                    if (sVG$Style$LineJoin != null) {
                        kVar.a |= 128;
                        break;
                    }
                    break;
                case SODA_DE_DE_VALUE:
                    kVar.C = Float.valueOf(q(str2));
                    kVar.a |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        p pVar = new p(str2);
                        pVar.q();
                        if (!pVar.f() && (j = pVar.j()) != null && !j.f()) {
                            float f = j.a;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(j);
                            while (true) {
                                if (!pVar.f()) {
                                    pVar.p();
                                    j j2 = pVar.j();
                                    if (j2 != null && !j2.f()) {
                                        arrayList.add(j2);
                                        f += j2.a;
                                    }
                                } else if (f != 0.0f) {
                                    jVarArr = (j[]) arrayList.toArray(new j[arrayList.size()]);
                                }
                            }
                        }
                        kVar.D = jVarArr;
                        if (jVarArr != null) {
                            kVar.a |= 512;
                            break;
                        }
                    } else {
                        kVar.D = null;
                        kVar.a |= 512;
                        break;
                    }
                    break;
                case SODA_ES_ES_VALUE:
                    kVar.E = t(str2);
                    kVar.a |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    break;
                case 58:
                    kVar.F = w(str2);
                    kVar.a |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    break;
                case 59:
                    kVar.G = o(str2);
                    kVar.a |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    break;
                case 60:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        p pVar2 = new p(str2);
                        Integer num = null;
                        SVG$Style$FontStyle sVG$Style$FontStyle2 = null;
                        String str4 = null;
                        while (true) {
                            String m = pVar2.m(false, '/');
                            pVar2.q();
                            if (m != null) {
                                if (num == null || sVG$Style$FontStyle2 == null) {
                                    if (!m.equals(Constants.NORMAL) && (num != null || (num = (Integer) dol0.a.get(m)) == null)) {
                                        if (sVG$Style$FontStyle2 == null) {
                                            switch (m) {
                                                case "oblique":
                                                    sVG$Style$FontStyle2 = SVG$Style$FontStyle.Oblique;
                                                    break;
                                                case "italic":
                                                    sVG$Style$FontStyle2 = SVG$Style$FontStyle.Italic;
                                                    break;
                                                case "normal":
                                                    sVG$Style$FontStyle2 = SVG$Style$FontStyle.Normal;
                                                    break;
                                                default:
                                                    sVG$Style$FontStyle2 = null;
                                                    break;
                                            }
                                            if (sVG$Style$FontStyle2 != null) {
                                                continue;
                                            }
                                        }
                                        if (str4 == null && m.equals("small-caps")) {
                                            str4 = m;
                                        }
                                    }
                                }
                                try {
                                    jVar = (j) o.a.get(m);
                                    if (jVar == null) {
                                        jVar = t(m);
                                    }
                                } catch (SVGParseException unused) {
                                    jVar = null;
                                }
                                if (pVar2.d('/')) {
                                    pVar2.q();
                                    String l = pVar2.l();
                                    if (l != null) {
                                        t(l);
                                    }
                                    pVar2.q();
                                }
                                if (!pVar2.f()) {
                                    int i2 = pVar2.b;
                                    pVar2.b = pVar2.c;
                                    str3 = pVar2.a.substring(i2);
                                }
                                kVar.H = r(str3);
                                kVar.I = jVar;
                                kVar.J = Integer.valueOf(num == null ? Constants.MINIMAL_ERROR_STATUS_CODE : num.intValue());
                                if (sVG$Style$FontStyle2 == null) {
                                    sVG$Style$FontStyle2 = SVG$Style$FontStyle.Normal;
                                }
                                kVar.K = sVG$Style$FontStyle2;
                                kVar.a |= 122880;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 61:
                    ArrayList r = r(str2);
                    kVar.H = r;
                    if (r != null) {
                        kVar.a |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        break;
                    }
                    break;
                case 62:
                    try {
                        j jVar3 = (j) o.a.get(str2);
                        jVar2 = jVar3 == null ? t(str2) : jVar3;
                    } catch (SVGParseException unused2) {
                    }
                    kVar.I = jVar2;
                    if (jVar2 != null) {
                        kVar.a |= PlaybackStateCompat.ACTION_PREPARE;
                        break;
                    }
                    break;
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    Integer num2 = (Integer) dol0.a.get(str2);
                    kVar.J = num2;
                    if (num2 != null) {
                        kVar.a |= 32768;
                        break;
                    }
                    break;
                case 64:
                    switch (str2) {
                        case "oblique":
                            sVG$Style$FontStyle = SVG$Style$FontStyle.Oblique;
                            break;
                        case "italic":
                            sVG$Style$FontStyle = SVG$Style$FontStyle.Italic;
                            break;
                        case "normal":
                            sVG$Style$FontStyle = SVG$Style$FontStyle.Normal;
                            break;
                    }
                    kVar.K = sVG$Style$FontStyle;
                    if (sVG$Style$FontStyle != null) {
                        kVar.a |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        break;
                    }
                    break;
                case 65:
                    switch (str2) {
                        case "line-through":
                            sVG$Style$TextDecoration = SVG$Style$TextDecoration.LineThrough;
                            break;
                        case "underline":
                            sVG$Style$TextDecoration = SVG$Style$TextDecoration.Underline;
                            break;
                        case "none":
                            sVG$Style$TextDecoration = SVG$Style$TextDecoration.None;
                            break;
                        case "blink":
                            sVG$Style$TextDecoration = SVG$Style$TextDecoration.Blink;
                            break;
                        case "overline":
                            sVG$Style$TextDecoration = SVG$Style$TextDecoration.Overline;
                            break;
                    }
                    kVar.L = sVG$Style$TextDecoration;
                    if (sVG$Style$TextDecoration != null) {
                        kVar.a |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        break;
                    }
                    break;
                case 66:
                    if (str2.equals("ltr")) {
                        sVG$Style$TextDirection = SVG$Style$TextDirection.LTR;
                    } else if (str2.equals("rtl")) {
                        sVG$Style$TextDirection = SVG$Style$TextDirection.RTL;
                    }
                    kVar.M = sVG$Style$TextDirection;
                    if (sVG$Style$TextDirection != null) {
                        kVar.a |= 68719476736L;
                        break;
                    }
                    break;
                case 67:
                    switch (str2) {
                        case "middle":
                            sVG$Style$TextAnchor = SVG$Style$TextAnchor.Middle;
                            break;
                        case "end":
                            sVG$Style$TextAnchor = SVG$Style$TextAnchor.End;
                            break;
                        case "start":
                            sVG$Style$TextAnchor = SVG$Style$TextAnchor.Start;
                            break;
                    }
                    kVar.N = sVG$Style$TextAnchor;
                    if (sVG$Style$TextAnchor != null) {
                        kVar.a |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        break;
                    }
                    break;
                case TRANSLATE_KIT_VALUE:
                    switch (str2) {
                        case "hidden":
                        case "scroll":
                            bool = Boolean.FALSE;
                            break;
                        case "auto":
                        case "visible":
                            bool = Boolean.TRUE;
                            break;
                    }
                    kVar.O = bool;
                    if (bool != null) {
                        kVar.a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        break;
                    }
                    break;
                case 69:
                    String s = s(str2);
                    kVar.Q = s;
                    kVar.R = s;
                    kVar.S = s;
                    kVar.a |= 14680064;
                    break;
                case 70:
                    kVar.Q = s(str2);
                    kVar.a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    break;
                case 71:
                    kVar.R = s(str2);
                    kVar.a |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                    break;
                case 72:
                    kVar.S = s(str2);
                    kVar.a |= 8388608;
                    break;
                case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                    if (str2.indexOf(HProv.PP_SAME_MEDIA) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            kVar.T = Boolean.valueOf(!str2.equals("none"));
                            kVar.a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(HProv.PP_SAME_MEDIA) < 0) {
                        if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                            kVar.U = Boolean.valueOf(str2.equals("visible"));
                            kVar.a |= 33554432;
                            break;
                        }
                    }
                    break;
                case HProv.PROV_GOST_2001_DH /* 75 */:
                    if (str2.equals("currentColor")) {
                        kVar.V = zll0Var;
                    } else {
                        kVar.V = o(str2);
                    }
                    kVar.a |= 67108864;
                    break;
                case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                    kVar.W = w(str2);
                    kVar.a |= 134217728;
                    break;
                case HProv.ALG_SID_SHA3_224 /* 77 */:
                    if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                        p pVar3 = new p(str2.substring(5));
                        pVar3.q();
                        j v = v(pVar3);
                        pVar3.p();
                        j v2 = v(pVar3);
                        pVar3.p();
                        j v3 = v(pVar3);
                        pVar3.p();
                        j v4 = v(pVar3);
                        pVar3.q();
                        if (pVar3.d(')') || pVar3.f()) {
                            kdd0Var = new kdd0();
                            kdd0Var.a = v;
                            kdd0Var.b = v2;
                            kdd0Var.c = v3;
                            kdd0Var.d = v4;
                        }
                    }
                    kVar.P = kdd0Var;
                    if (kdd0Var != null) {
                        kVar.a |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        break;
                    }
                    break;
                case HProv.ALG_SID_SHA3_256 /* 78 */:
                    kVar.Z = s(str2);
                    kVar.a |= 268435456;
                    break;
                case HProv.ALG_SID_SHA3_384 /* 79 */:
                    if ("nonzero".equals(str2)) {
                        sVG$Style$FillRule2 = SVG$Style$FillRule.NonZero;
                    } else if ("evenodd".equals(str2)) {
                        sVG$Style$FillRule2 = SVG$Style$FillRule.EvenOdd;
                    }
                    kVar.a0 = sVG$Style$FillRule2;
                    kVar.a |= 536870912;
                    break;
                case 80:
                    kVar.b0 = s(str2);
                    kVar.a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        kVar.c0 = zll0Var;
                    } else {
                        kVar.c0 = o(str2);
                    }
                    kVar.a |= 2147483648L;
                    break;
                case 82:
                    kVar.d0 = w(str2);
                    kVar.a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        kVar.e0 = zll0Var;
                    } else {
                        kVar.e0 = o(str2);
                    }
                    kVar.a |= 8589934592L;
                    break;
                case HProv.ALG_SID_NO_HASH /* 84 */:
                    kVar.f0 = w(str2);
                    kVar.a |= 17179869184L;
                    break;
                case 85:
                    if (str2.equals("none")) {
                        sVG$Style$VectorEffect = SVG$Style$VectorEffect.None;
                    } else if (str2.equals("non-scaling-stroke")) {
                        sVG$Style$VectorEffect = SVG$Style$VectorEffect.NonScalingStroke;
                    }
                    kVar.g0 = sVG$Style$VectorEffect;
                    if (sVG$Style$VectorEffect != null) {
                        kVar.a |= 34359738368L;
                        break;
                    }
                    break;
                case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                    switch (str2) {
                        case "optimizeQuality":
                            sVG$Style$RenderQuality = SVG$Style$RenderQuality.optimizeQuality;
                            break;
                        case "auto":
                            sVG$Style$RenderQuality = SVG$Style$RenderQuality.auto;
                            break;
                        case "optimizeSpeed":
                            sVG$Style$RenderQuality = SVG$Style$RenderQuality.optimizeSpeed;
                            break;
                    }
                    kVar.h0 = sVG$Style$RenderQuality;
                    if (sVG$Style$RenderQuality != null) {
                        kVar.a |= 137438953472L;
                        break;
                    }
                    break;
            }
        } catch (SVGParseException unused3) {
        }
    }

    public static int b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f8 = f7 >= 0.0f ? f7 > 1.0f ? 1.0f : f7 : 0.0f;
        float f9 = f8 <= 0.5f ? (f6 + 1.0f) * f8 : (f8 + f6) - (f6 * f8);
        float f10 = (f8 * 2.0f) - f9;
        return b(e(f10, f9, f5 - 2.0f) * 256.0f) | (b(e(f10, f9, f5 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f5) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? g8e.b(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? g8e.b(4.0f, f3, f2 - f, f) : f;
    }

    public static void g(uml0 uml0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    p pVar = new p(trim);
                    HashSet hashSet = new HashSet();
                    while (!pVar.f()) {
                        String l = pVar.l();
                        if (l.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(l.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        pVar.q();
                    }
                    uml0Var.f(hashSet);
                    break;
                case 22:
                    uml0Var.k(trim);
                    break;
                case 23:
                    p pVar2 = new p(trim);
                    HashSet hashSet2 = new HashSet();
                    while (!pVar2.f()) {
                        String l2 = pVar2.l();
                        int indexOf = l2.indexOf(45);
                        if (indexOf != -1) {
                            l2 = l2.substring(0, indexOf);
                        }
                        hashSet2.add(new Locale(l2, "", "").getLanguage());
                        pVar2.q();
                    }
                    uml0Var.h(hashSet2);
                    break;
                case 24:
                    p pVar3 = new p(trim);
                    HashSet hashSet3 = new HashSet();
                    while (!pVar3.f()) {
                        hashSet3.add(pVar3.l());
                        pVar3.q();
                    }
                    uml0Var.c(hashSet3);
                    break;
                case 25:
                    ArrayList r = r(trim);
                    uml0Var.j(r != null ? new HashSet(r) : new HashSet(0));
                    break;
            }
        }
    }

    public static void h(yml0 yml0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                yml0Var.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    yml0Var.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new SVGParseException(g8e.o("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    yml0Var.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(i iVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                switch (i2) {
                    case 32:
                        if (!"objectBoundingBox".equals(trim)) {
                            if ("userSpaceOnUse".equals(trim)) {
                                iVar.i = Boolean.TRUE;
                                break;
                            } else {
                                d7g0.k("Invalid value for attribute gradientUnits");
                                return;
                            }
                        } else {
                            iVar.i = Boolean.FALSE;
                            break;
                        }
                    case 33:
                        iVar.j = A(trim);
                        break;
                    case 34:
                        try {
                            iVar.k = SVG$GradientSpread.valueOf(trim);
                            break;
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException(oyr.p("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                        }
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                iVar.l = trim;
            }
        }
    }

    public static void j(oml0 oml0Var, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGParser$SVGAttr.a(attributes.getLocalName(i)) == SVGParser$SVGAttr.points) {
                p pVar = new p(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                pVar.q();
                while (!pVar.f()) {
                    float i2 = pVar.i();
                    if (Float.isNaN(i2)) {
                        throw new SVGParseException(oyr.p("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    pVar.p();
                    float i3 = pVar.i();
                    if (Float.isNaN(i3)) {
                        throw new SVGParseException(oyr.p("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    pVar.p();
                    arrayList.add(Float.valueOf(i2));
                    arrayList.add(Float.valueOf(i3));
                }
                oml0Var.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    oml0Var.o[i4] = ((Float) it.next()).floatValue();
                    i4++;
                }
            }
        }
    }

    public static void k(yml0 yml0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    p pVar = new p(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String m = pVar.m(false, ':');
                        pVar.q();
                        if (!pVar.d(':')) {
                            break;
                        }
                        pVar.q();
                        String m2 = pVar.m(true, ';');
                        if (m2 == null) {
                            break;
                        }
                        pVar.q();
                        if (pVar.f() || pVar.d(';')) {
                            if (yml0Var.f == null) {
                                yml0Var.f = new k();
                            }
                            E(yml0Var.f, m, m2);
                            pVar.q();
                        }
                    }
                } else if (i2 != 46) {
                    if (yml0Var.e == null) {
                        yml0Var.e = new k();
                    }
                    E(yml0Var.e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    c cVar = new c(trim);
                    ArrayList arrayList = null;
                    while (!cVar.f()) {
                        String l = cVar.l();
                        if (l != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(l);
                            cVar.q();
                        }
                    }
                    yml0Var.g = arrayList;
                }
            }
        }
    }

    public static void l(nnl0 nnl0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                nnl0Var.n = u(trim);
            } else if (i2 == 2) {
                nnl0Var.o = u(trim);
            } else if (i2 == 19) {
                nnl0Var.p = u(trim);
            } else if (i2 == 20) {
                nnl0Var.q = u(trim);
            }
        }
    }

    public static void m(eml0 eml0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGParser$SVGAttr.a(attributes.getLocalName(i)) == SVGParser$SVGAttr.transform) {
                eml0Var.l(A(attributes.getValue(i)));
            }
        }
    }

    public static void n(enl0 enl0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                y(enl0Var, trim);
            } else if (i2 != 87) {
                continue;
            } else {
                p pVar = new p(trim);
                pVar.q();
                float i3 = pVar.i();
                pVar.p();
                float i4 = pVar.i();
                pVar.p();
                float i5 = pVar.i();
                pVar.p();
                float i6 = pVar.i();
                if (Float.isNaN(i3) || Float.isNaN(i4) || Float.isNaN(i5) || Float.isNaN(i6)) {
                    d7g0.k("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (i5 < 0.0f) {
                    d7g0.k("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (i6 < 0.0f) {
                        d7g0.k("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    enl0Var.o = new pt3(i3, i4, i5, i6, 1);
                }
            }
        }
    }

    public static yll0 o(String str) {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            h0n h0nVar = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j = j2 * 16;
                            i = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 * 16) + (charAt - '0');
                    }
                    if (j2 > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    h0nVar = new h0n(j2, i2);
                }
            }
            if (h0nVar == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j3 = h0nVar.b;
            int i3 = h0nVar.a;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC;
                int i7 = i4 & 15;
                return new yll0(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new yll0(((int) j3) | ModalContentViewContainer.BASE_SHADOW_COLOR);
                }
                if (i3 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new yll0((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC;
            int i13 = i9 & 15;
            return new yll0((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            p pVar = new p(str.substring(startsWith ? 5 : 4));
            pVar.q();
            float i14 = pVar.i();
            if (!Float.isNaN(i14) && pVar.d('%')) {
                i14 = (i14 * 256.0f) / 100.0f;
            }
            float c = pVar.c(i14);
            if (!Float.isNaN(c) && pVar.d('%')) {
                c = (c * 256.0f) / 100.0f;
            }
            float c2 = pVar.c(c);
            if (!Float.isNaN(c2) && pVar.d('%')) {
                c2 = (c2 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                pVar.q();
                if (Float.isNaN(c2) || !pVar.d(')')) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new yll0((b(i14) << 16) | ModalContentViewContainer.BASE_SHADOW_COLOR | (b(c) << 8) | b(c2));
            }
            float c3 = pVar.c(c2);
            pVar.q();
            if (Float.isNaN(c3) || !pVar.d(')')) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new yll0((b(c3 * 256.0f) << 24) | (b(i14) << 16) | (b(c) << 8) | b(c2));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) col0.a.get(lowerCase);
            if (num != null) {
                return new yll0(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        p pVar2 = new p(str.substring(startsWith2 ? 5 : 4));
        pVar2.q();
        float i15 = pVar2.i();
        float c4 = pVar2.c(i15);
        if (!Float.isNaN(c4)) {
            pVar2.d('%');
        }
        float c5 = pVar2.c(c4);
        if (!Float.isNaN(c5)) {
            pVar2.d('%');
        }
        if (!startsWith2) {
            pVar2.q();
            if (Float.isNaN(c5) || !pVar2.d(')')) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new yll0(d(i15, c4, c5) | ModalContentViewContainer.BASE_SHADOW_COLOR);
        }
        float c6 = pVar2.c(c5);
        pVar2.q();
        if (Float.isNaN(c6) || !pVar2.d(')')) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new yll0((b(c6 * 256.0f) << 24) | d(i15, c4, c5));
    }

    public static float p(int i, String str) {
        float D = new dn60(0).D(0, i, str);
        if (Float.isNaN(D)) {
            throw new SVGParseException(g8e.o("Invalid float value: ", str));
        }
        return D;
    }

    public static float q(String str) {
        int length = str.length();
        if (length != 0) {
            return p(length, str);
        }
        d7g0.k("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList r(String str) {
        p pVar = new p(str);
        ArrayList arrayList = null;
        do {
            String k = pVar.k();
            if (k == null) {
                k = pVar.m(true, HexString.CHAR_COMMA);
            }
            if (k == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(k);
            pVar.p();
        } while (!pVar.f());
        return arrayList;
    }

    public static String s(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(Extension.C_BRAKE) ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static j t(String str) {
        if (str.length() == 0) {
            d7g0.k("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        SVG$Unit sVG$Unit = SVG$Unit.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            sVG$Unit = SVG$Unit.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                sVG$Unit = SVG$Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new j(p(length, str), sVG$Unit);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList u(String str) {
        String str2;
        if (str.length() == 0) {
            d7g0.k("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        p pVar = new p(str);
        pVar.q();
        while (!pVar.f()) {
            float i = pVar.i();
            if (Float.isNaN(i)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                int i2 = pVar.b;
                while (true) {
                    boolean f = pVar.f();
                    str2 = pVar.a;
                    if (f || p.g(str2.charAt(pVar.b))) {
                        break;
                    }
                    pVar.b++;
                }
                String substring = str2.substring(i2, pVar.b);
                pVar.b = i2;
                sb.append(substring);
                throw new SVGParseException(sb.toString());
            }
            SVG$Unit n = pVar.n();
            if (n == null) {
                n = SVG$Unit.px;
            }
            arrayList.add(new j(i, n));
            pVar.p();
        }
        return arrayList;
    }

    public static j v(p pVar) {
        return pVar.e("auto") ? new j(0.0f) : pVar.j();
    }

    public static Float w(String str) {
        try {
            float q = q(str);
            float f = 0.0f;
            if (q >= 0.0f) {
                f = 1.0f;
                if (q > 1.0f) {
                }
                return Float.valueOf(q);
            }
            q = f;
            return Float.valueOf(q);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static bnl0 x(String str) {
        boolean startsWith = str.startsWith("url(");
        bnl0 bnl0Var = yll0.c;
        bnl0 bnl0Var2 = zll0.a;
        bnl0 bnl0Var3 = null;
        if (!startsWith) {
            if (str.equals("none")) {
                return bnl0Var;
            }
            if (str.equals("currentColor")) {
                return bnl0Var2;
            }
            try {
                return o(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int indexOf = str.indexOf(Extension.C_BRAKE);
        if (indexOf == -1) {
            return new kml0(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            if (!trim2.equals("none")) {
                if (trim2.equals("currentColor")) {
                    bnl0Var = bnl0Var2;
                } else {
                    try {
                        bnl0Var = o(trim2);
                    } catch (SVGParseException unused2) {
                        bnl0Var = null;
                    }
                }
            }
            bnl0Var3 = bnl0Var;
        }
        return new kml0(trim, bnl0Var3);
    }

    public static void y(cnl0 cnl0Var, String str) {
        PreserveAspectRatio$Scale preserveAspectRatio$Scale;
        p pVar = new p(str);
        pVar.q();
        String l = pVar.l();
        if ("defer".equals(l)) {
            pVar.q();
            l = pVar.l();
        }
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment = (PreserveAspectRatio$Alignment) bol0.a.get(l);
        pVar.q();
        if (pVar.f()) {
            preserveAspectRatio$Scale = null;
        } else {
            String l2 = pVar.l();
            l2.getClass();
            if (l2.equals("meet")) {
                preserveAspectRatio$Scale = PreserveAspectRatio$Scale.meet;
            } else {
                if (!l2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                preserveAspectRatio$Scale = PreserveAspectRatio$Scale.slice;
            }
        }
        cnl0Var.n = new hxe0(preserveAspectRatio$Alignment, preserveAspectRatio$Scale);
    }

    public static HashMap z(p pVar) {
        HashMap hashMap = new HashMap();
        pVar.q();
        String m = pVar.m(false, '=');
        while (m != null) {
            pVar.d('=');
            hashMap.put(m, pVar.k());
            pVar.q();
            m = pVar.m(false, '=');
        }
        return hashMap;
    }

    public final void B(InputStream inputStream) {
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            eol0 eol0Var = new eol0(this);
            xMLReader.setContentHandler(eol0Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", eol0Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    public final void C(InputStream inputStream) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                fol0 fol0Var = new fol0();
                fol0Var.a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        F();
                    } else if (eventType == 8) {
                        newPullParser.getText();
                        p pVar = new p(newPullParser.getText());
                        String l = pVar.l();
                        z(pVar);
                        l.getClass();
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            G(newPullParser.getNamespace(), newPullParser.getName(), name, fol0Var);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            c(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            I(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            H(newPullParser.getText());
                        }
                    } else if (this.a.a == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            inputStream.reset();
                            B(inputStream);
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                }
            } catch (XmlPullParserException e) {
                throw new SVGParseException("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0362 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(Attributes attributes) {
        int i;
        int intValue;
        char c;
        float i2;
        float f;
        float f2;
        float f3;
        float f4;
        char charAt;
        Attributes attributes2 = attributes;
        wml0 wml0Var = this.b;
        if (wml0Var == null) {
            d7g0.k("Invalid document. Root element must be <svg>");
            return;
        }
        lml0 lml0Var = new lml0();
        lml0Var.a = this.a;
        lml0Var.b = wml0Var;
        h(lml0Var, attributes2);
        k(lml0Var, attributes2);
        m(lml0Var, attributes2);
        g(lml0Var, attributes2);
        byte b = 0;
        int i3 = 0;
        while (i3 < attributes2.getLength()) {
            String trim = attributes2.getValue(i3).trim();
            int i4 = n.b[SVGParser$SVGAttr.a(attributes2.getLocalName(i3)).ordinal()];
            float f5 = 0.0f;
            if (i4 == 8) {
                p pVar = new p(trim);
                yi6 yi6Var = new yi6(b, 6);
                yi6Var.b = b;
                yi6Var.c = b;
                yi6Var.w = new byte[8];
                yi6Var.x = new float[16];
                if (!pVar.f() && ((intValue = pVar.h().intValue()) == 77 || intValue == 109)) {
                    float f6 = 0.0f;
                    float f7 = 0.0f;
                    float f8 = 0.0f;
                    float f9 = 0.0f;
                    float f10 = 0.0f;
                    float f11 = 0.0f;
                    while (true) {
                        pVar.q();
                        float f12 = f5;
                        switch (intValue) {
                            case 65:
                            case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                                c = 'm';
                                float i5 = pVar.i();
                                float c2 = pVar.c(i5);
                                float f13 = f8;
                                float c3 = pVar.c(c2);
                                Boolean b2 = pVar.b(Float.valueOf(c3));
                                Boolean b3 = pVar.b(b2);
                                if (b3 == null) {
                                    i2 = Float.NaN;
                                } else {
                                    pVar.p();
                                    i2 = pVar.i();
                                }
                                i = i3;
                                float f14 = i2;
                                float c4 = pVar.c(f14);
                                if (!Float.isNaN(c4) && i5 >= f12 && c2 >= f12) {
                                    if (intValue == 97) {
                                        c4 += f13;
                                        f = f14 + f6;
                                    } else {
                                        f = f14;
                                    }
                                    float f15 = c4;
                                    yi6Var.S(i5, c2, c3, f, f15, b2.booleanValue(), b3.booleanValue());
                                    f6 = f;
                                    f7 = f6;
                                    f8 = f15;
                                    f9 = f8;
                                    pVar.p();
                                    if (!pVar.f()) {
                                        break;
                                    } else {
                                        int i6 = pVar.b;
                                        if (i6 != pVar.c && (((charAt = pVar.a.charAt(i6)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                            intValue = pVar.h().intValue();
                                        }
                                        f5 = f12;
                                        i3 = i;
                                    }
                                }
                                break;
                            case 67:
                            case 99:
                                float i7 = pVar.i();
                                float c5 = pVar.c(i7);
                                float c6 = pVar.c(c5);
                                float c7 = pVar.c(c6);
                                float c8 = pVar.c(c7);
                                float c9 = pVar.c(c8);
                                if (Float.isNaN(c9)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 99) {
                                        c8 += f6;
                                        c9 += f8;
                                        i7 += f6;
                                        c5 += f8;
                                        c6 += f6;
                                        c7 += f8;
                                    }
                                    float f16 = i7;
                                    f2 = c6;
                                    f3 = c9;
                                    c = 'm';
                                    f9 = c7;
                                    float f17 = c5;
                                    f4 = c8;
                                    yi6Var.V(f16, f17, f2, f9, f4, f3);
                                    f7 = f2;
                                    f6 = f4;
                                    f8 = f3;
                                    i = i3;
                                    pVar.p();
                                    if (!pVar.f()) {
                                    }
                                }
                                break;
                            case 72:
                            case 104:
                                float i8 = pVar.i();
                                if (Float.isNaN(i8)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 104) {
                                        i8 += f6;
                                    }
                                    f6 = i8;
                                    yi6Var.T(f6, f8);
                                    i = i3;
                                    c = 'm';
                                    f7 = f6;
                                    pVar.p();
                                    if (!pVar.f()) {
                                    }
                                }
                                break;
                            case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                            case 108:
                                float i9 = pVar.i();
                                float c10 = pVar.c(i9);
                                if (Float.isNaN(c10)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 108) {
                                        i9 += f6;
                                        c10 += f8;
                                    }
                                    f6 = i9;
                                    f8 = c10;
                                    yi6Var.T(f6, f8);
                                    i = i3;
                                    c = 'm';
                                    f9 = f8;
                                    f7 = f6;
                                    pVar.p();
                                    if (!pVar.f()) {
                                    }
                                }
                                break;
                            case HProv.ALG_SID_SHA3_224 /* 77 */:
                            case 109:
                                float i10 = pVar.i();
                                float c11 = pVar.c(i10);
                                if (Float.isNaN(c11)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 109 && yi6Var.b != 0) {
                                        i10 += f6;
                                        c11 += f8;
                                    }
                                    f6 = i10;
                                    f8 = c11;
                                    yi6Var.R(f6, f8);
                                    i = i3;
                                    f10 = f6;
                                    c = 'm';
                                    f9 = f8;
                                    f11 = f9;
                                    intValue = intValue != 109 ? 76 : 108;
                                    f7 = f10;
                                    pVar.p();
                                    if (!pVar.f()) {
                                    }
                                }
                                break;
                            case 81:
                            case 113:
                                float i11 = pVar.i();
                                float c12 = pVar.c(i11);
                                float c13 = pVar.c(c12);
                                float c14 = pVar.c(c13);
                                if (Float.isNaN(c14)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 113) {
                                        c13 += f6;
                                        c14 += f8;
                                        i11 += f6;
                                        c12 += f8;
                                    }
                                    f6 = c13;
                                    f8 = c14;
                                    yi6Var.U(i11, c12, f6, f8);
                                    i = i3;
                                    c = 'm';
                                    f7 = i11;
                                    f9 = c12;
                                    pVar.p();
                                    if (!pVar.f()) {
                                    }
                                }
                                break;
                            case 83:
                            case HProv.PP_CACHE_SIZE /* 115 */:
                                float f18 = (f6 * 2.0f) - f7;
                                float f19 = (2.0f * f8) - f9;
                                float i12 = pVar.i();
                                float c15 = pVar.c(i12);
                                float c16 = pVar.c(c15);
                                float c17 = pVar.c(c16);
                                if (Float.isNaN(c17)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 115) {
                                        c16 += f6;
                                        c17 += f8;
                                        i12 += f6;
                                        c15 += f8;
                                    }
                                    f2 = i12;
                                    f9 = c15;
                                    f3 = c17;
                                    c = 'm';
                                    f4 = c16;
                                    yi6Var.V(f18, f19, f2, f9, f4, f3);
                                    f7 = f2;
                                    f6 = f4;
                                    f8 = f3;
                                    i = i3;
                                    pVar.p();
                                    if (!pVar.f()) {
                                    }
                                }
                                break;
                            case HProv.ALG_SID_NO_HASH /* 84 */:
                            case BuildConfig.API_LEVEL /* 116 */:
                                f7 = (f6 * 2.0f) - f7;
                                f9 = (2.0f * f8) - f9;
                                float i13 = pVar.i();
                                float c18 = pVar.c(i13);
                                if (Float.isNaN(c18)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 116) {
                                        i13 += f6;
                                        c18 += f8;
                                    }
                                    f6 = i13;
                                    f8 = c18;
                                    yi6Var.U(f7, f9, f6, f8);
                                    i = i3;
                                    c = 'm';
                                    pVar.p();
                                    if (!pVar.f()) {
                                    }
                                }
                                break;
                            case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                            case HProv.PP_INFO /* 118 */:
                                float i14 = pVar.i();
                                if (Float.isNaN(i14)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 118) {
                                        i14 += f8;
                                    }
                                    f8 = i14;
                                    yi6Var.T(f6, f8);
                                    i = i3;
                                    f9 = f8;
                                    c = 'm';
                                    pVar.p();
                                    if (!pVar.f()) {
                                    }
                                }
                                break;
                            case 90:
                            case 122:
                                yi6Var.close();
                                i = i3;
                                f6 = f10;
                                f7 = f6;
                                f8 = f11;
                                f9 = f8;
                                c = 'm';
                                pVar.p();
                                if (!pVar.f()) {
                                }
                                break;
                        }
                    }
                }
                i = i3;
                lml0Var.o = yi6Var;
            } else {
                if (i4 == 9 && q(trim) < 0.0f) {
                    d7g0.k("Invalid <path> element. pathLength cannot be negative");
                    return;
                }
                i = i3;
            }
            i3 = i + 1;
            attributes2 = attributes;
            b = 0;
        }
        this.b.i(lml0Var);
    }

    public final void F() {
        l lVar = new l();
        lVar.a = null;
        lVar.b = new w97();
        lVar.c = new HashMap();
        this.a = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x033a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x053f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(String str, String str2, String str3, Attributes attributes) {
        boolean z;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            SVGParser$SVGElem a = SVGParser$SVGElem.a(str2.length() > 0 ? str2 : str3);
            int i = 0;
            switch (n.a[a.ordinal()]) {
                case 1:
                    tml0 tml0Var = new tml0();
                    tml0Var.a = this.a;
                    tml0Var.b = this.b;
                    h(tml0Var, attributes);
                    k(tml0Var, attributes);
                    g(tml0Var, attributes);
                    n(tml0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim = attributes.getValue(i).trim();
                        int i2 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i2 == 1) {
                            tml0Var.p = t(trim);
                        } else if (i2 == 2) {
                            tml0Var.q = t(trim);
                        } else if (i2 == 3) {
                            j t = t(trim);
                            tml0Var.r = t;
                            if (t.f()) {
                                d7g0.k("Invalid <svg> element. width cannot be negative");
                                return;
                            }
                        } else if (i2 != 4) {
                            continue;
                        } else {
                            j t2 = t(trim);
                            tml0Var.s = t2;
                            if (t2.f()) {
                                d7g0.k("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        }
                        i++;
                    }
                    wml0 wml0Var = this.b;
                    if (wml0Var == null) {
                        this.a.a = tml0Var;
                    } else {
                        wml0Var.i(tml0Var);
                    }
                    this.b = tml0Var;
                    return;
                case 2:
                case 3:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    dml0 dml0Var = new dml0();
                    dml0Var.a = this.a;
                    dml0Var.b = this.b;
                    h(dml0Var, attributes);
                    k(dml0Var, attributes);
                    m(dml0Var, attributes);
                    g(dml0Var, attributes);
                    this.b.i(dml0Var);
                    this.b = dml0Var;
                    return;
                case 4:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    aml0 aml0Var = new aml0();
                    aml0Var.a = this.a;
                    aml0Var.b = this.b;
                    h(aml0Var, attributes);
                    k(aml0Var, attributes);
                    m(aml0Var, attributes);
                    this.b.i(aml0Var);
                    this.b = aml0Var;
                    return;
                case 5:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    pnl0 pnl0Var = new pnl0();
                    pnl0Var.a = this.a;
                    pnl0Var.b = this.b;
                    h(pnl0Var, attributes);
                    k(pnl0Var, attributes);
                    m(pnl0Var, attributes);
                    g(pnl0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim2 = attributes.getValue(i).trim();
                        int i3 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i3 == 1) {
                            pnl0Var.p = t(trim2);
                        } else if (i3 == 2) {
                            pnl0Var.q = t(trim2);
                        } else if (i3 == 3) {
                            j t3 = t(trim2);
                            pnl0Var.r = t3;
                            if (t3.f()) {
                                d7g0.k("Invalid <use> element. width cannot be negative");
                                return;
                            }
                        } else if (i3 == 4) {
                            j t4 = t(trim2);
                            pnl0Var.s = t4;
                            if (t4.f()) {
                                d7g0.k("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (i3 == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                            pnl0Var.o = trim2;
                        }
                        i++;
                    }
                    this.b.i(pnl0Var);
                    this.b = pnl0Var;
                    return;
                case 6:
                    D(attributes);
                    return;
                case 7:
                    wml0 wml0Var2 = this.b;
                    if (wml0Var2 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    qml0 qml0Var = new qml0();
                    qml0Var.a = this.a;
                    qml0Var.b = wml0Var2;
                    h(qml0Var, attributes);
                    k(qml0Var, attributes);
                    m(qml0Var, attributes);
                    g(qml0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim3 = attributes.getValue(i).trim();
                        int i4 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i4 == 1) {
                            qml0Var.o = t(trim3);
                        } else if (i4 == 2) {
                            qml0Var.p = t(trim3);
                        } else if (i4 == 3) {
                            j t5 = t(trim3);
                            qml0Var.q = t5;
                            if (t5.f()) {
                                d7g0.k("Invalid <rect> element. width cannot be negative");
                                return;
                            }
                        } else if (i4 == 4) {
                            j t6 = t(trim3);
                            qml0Var.r = t6;
                            if (t6.f()) {
                                d7g0.k("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (i4 == 10) {
                            j t7 = t(trim3);
                            qml0Var.s = t7;
                            if (t7.f()) {
                                d7g0.k("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (i4 != 11) {
                            continue;
                        } else {
                            j t8 = t(trim3);
                            qml0Var.t = t8;
                            if (t8.f()) {
                                d7g0.k("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                        i++;
                    }
                    this.b.i(qml0Var);
                    return;
                case 8:
                    wml0 wml0Var3 = this.b;
                    if (wml0Var3 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    wll0 wll0Var = new wll0();
                    wll0Var.a = this.a;
                    wll0Var.b = wml0Var3;
                    h(wll0Var, attributes);
                    k(wll0Var, attributes);
                    m(wll0Var, attributes);
                    g(wll0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim4 = attributes.getValue(i).trim();
                        switch (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()]) {
                            case 12:
                                wll0Var.o = t(trim4);
                                break;
                            case 13:
                                wll0Var.p = t(trim4);
                                break;
                            case 14:
                                j t9 = t(trim4);
                                wll0Var.q = t9;
                                if (t9.f()) {
                                    d7g0.k("Invalid <circle> element. r cannot be negative");
                                    return;
                                }
                                break;
                        }
                        i++;
                    }
                    this.b.i(wll0Var);
                    return;
                case 9:
                    wml0 wml0Var4 = this.b;
                    if (wml0Var4 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    bml0 bml0Var = new bml0();
                    bml0Var.a = this.a;
                    bml0Var.b = wml0Var4;
                    h(bml0Var, attributes);
                    k(bml0Var, attributes);
                    m(bml0Var, attributes);
                    g(bml0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim5 = attributes.getValue(i).trim();
                        switch (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()]) {
                            case 10:
                                j t10 = t(trim5);
                                bml0Var.q = t10;
                                if (t10.f()) {
                                    d7g0.k("Invalid <ellipse> element. rx cannot be negative");
                                    return;
                                }
                                break;
                            case 11:
                                j t11 = t(trim5);
                                bml0Var.r = t11;
                                if (t11.f()) {
                                    d7g0.k("Invalid <ellipse> element. ry cannot be negative");
                                    return;
                                }
                                break;
                            case 12:
                                bml0Var.o = t(trim5);
                                break;
                            case 13:
                                bml0Var.p = t(trim5);
                                break;
                        }
                        i++;
                    }
                    this.b.i(bml0Var);
                    return;
                case 10:
                    wml0 wml0Var5 = this.b;
                    if (wml0Var5 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    gml0 gml0Var = new gml0();
                    gml0Var.a = this.a;
                    gml0Var.b = wml0Var5;
                    h(gml0Var, attributes);
                    k(gml0Var, attributes);
                    m(gml0Var, attributes);
                    g(gml0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim6 = attributes.getValue(i).trim();
                        switch (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()]) {
                            case 15:
                                gml0Var.o = t(trim6);
                                break;
                            case 16:
                                gml0Var.p = t(trim6);
                                break;
                            case 17:
                                gml0Var.q = t(trim6);
                                break;
                            case 18:
                                gml0Var.r = t(trim6);
                                break;
                        }
                        i++;
                    }
                    this.b.i(gml0Var);
                    return;
                case 11:
                    wml0 wml0Var6 = this.b;
                    if (wml0Var6 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    oml0 oml0Var = new oml0();
                    oml0Var.a = this.a;
                    oml0Var.b = wml0Var6;
                    h(oml0Var, attributes);
                    k(oml0Var, attributes);
                    m(oml0Var, attributes);
                    g(oml0Var, attributes);
                    j(oml0Var, attributes, "polyline");
                    this.b.i(oml0Var);
                    return;
                case 12:
                    wml0 wml0Var7 = this.b;
                    if (wml0Var7 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    pml0 pml0Var = new pml0();
                    pml0Var.a = this.a;
                    pml0Var.b = wml0Var7;
                    h(pml0Var, attributes);
                    k(pml0Var, attributes);
                    m(pml0Var, attributes);
                    g(pml0Var, attributes);
                    j(pml0Var, attributes, "polygon");
                    this.b.i(pml0Var);
                    return;
                case 13:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    jnl0 jnl0Var = new jnl0();
                    jnl0Var.a = this.a;
                    jnl0Var.b = this.b;
                    h(jnl0Var, attributes);
                    k(jnl0Var, attributes);
                    m(jnl0Var, attributes);
                    g(jnl0Var, attributes);
                    l(jnl0Var, attributes);
                    this.b.i(jnl0Var);
                    this.b = jnl0Var;
                    return;
                case 14:
                    wml0 wml0Var8 = this.b;
                    if (wml0Var8 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(wml0Var8 instanceof lnl0)) {
                        d7g0.k("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    inl0 inl0Var = new inl0();
                    inl0Var.a = this.a;
                    inl0Var.b = this.b;
                    h(inl0Var, attributes);
                    k(inl0Var, attributes);
                    g(inl0Var, attributes);
                    l(inl0Var, attributes);
                    this.b.i(inl0Var);
                    this.b = inl0Var;
                    wml0 wml0Var9 = inl0Var.b;
                    if (wml0Var9 instanceof jnl0) {
                        inl0Var.r = (jnl0) wml0Var9;
                        return;
                    } else {
                        inl0Var.r = ((knl0) wml0Var9).b();
                        return;
                    }
                case 15:
                    wml0 wml0Var10 = this.b;
                    if (wml0Var10 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(wml0Var10 instanceof lnl0)) {
                        d7g0.k("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    hnl0 hnl0Var = new hnl0();
                    hnl0Var.a = this.a;
                    hnl0Var.b = this.b;
                    h(hnl0Var, attributes);
                    k(hnl0Var, attributes);
                    g(hnl0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim7 = attributes.getValue(i).trim();
                        if (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                            hnl0Var.n = trim7;
                        }
                        i++;
                    }
                    this.b.i(hnl0Var);
                    wml0 wml0Var11 = hnl0Var.b;
                    if (wml0Var11 instanceof jnl0) {
                        hnl0Var.o = (jnl0) wml0Var11;
                        return;
                    } else {
                        hnl0Var.o = ((knl0) wml0Var11).b();
                        return;
                    }
                case 16:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    fnl0 fnl0Var = new fnl0();
                    fnl0Var.a = this.a;
                    fnl0Var.b = this.b;
                    h(fnl0Var, attributes);
                    k(fnl0Var, attributes);
                    m(fnl0Var, attributes);
                    g(fnl0Var, attributes);
                    this.b.i(fnl0Var);
                    this.b = fnl0Var;
                    return;
                case 17:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    gnl0 gnl0Var = new gnl0();
                    gnl0Var.a = this.a;
                    gnl0Var.b = this.b;
                    h(gnl0Var, attributes);
                    k(gnl0Var, attributes);
                    g(gnl0Var, attributes);
                    n(gnl0Var, attributes);
                    this.b.i(gnl0Var);
                    this.b = gnl0Var;
                    return;
                case 18:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    hml0 hml0Var = new hml0();
                    hml0Var.a = this.a;
                    hml0Var.b = this.b;
                    h(hml0Var, attributes);
                    k(hml0Var, attributes);
                    g(hml0Var, attributes);
                    n(hml0Var, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String trim8 = attributes.getValue(i5).trim();
                        switch (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i5)).ordinal()]) {
                            case 26:
                                hml0Var.q = t(trim8);
                                break;
                            case 27:
                                hml0Var.r = t(trim8);
                                break;
                            case 28:
                                j t12 = t(trim8);
                                hml0Var.s = t12;
                                if (t12.f()) {
                                    d7g0.k("Invalid <marker> element. markerWidth cannot be negative");
                                    return;
                                }
                                break;
                            case 29:
                                j t13 = t(trim8);
                                hml0Var.t = t13;
                                if (t13.f()) {
                                    d7g0.k("Invalid <marker> element. markerHeight cannot be negative");
                                    return;
                                }
                                break;
                            case 30:
                                if (!"strokeWidth".equals(trim8)) {
                                    if ("userSpaceOnUse".equals(trim8)) {
                                        hml0Var.p = true;
                                        break;
                                    } else {
                                        d7g0.k("Invalid value for attribute markerUnits");
                                        return;
                                    }
                                } else {
                                    hml0Var.p = false;
                                    break;
                                }
                            case 31:
                                if ("auto".equals(trim8)) {
                                    hml0Var.u = Float.valueOf(Float.NaN);
                                    break;
                                } else {
                                    hml0Var.u = Float.valueOf(q(trim8));
                                    break;
                                }
                        }
                    }
                    this.b.i(hml0Var);
                    this.b = hml0Var;
                    return;
                case 19:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    zml0 zml0Var = new zml0();
                    zml0Var.a = this.a;
                    zml0Var.b = this.b;
                    h(zml0Var, attributes);
                    k(zml0Var, attributes);
                    i(zml0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim9 = attributes.getValue(i).trim();
                        switch (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()]) {
                            case 15:
                                zml0Var.m = t(trim9);
                                break;
                            case 16:
                                zml0Var.n = t(trim9);
                                break;
                            case 17:
                                zml0Var.o = t(trim9);
                                break;
                            case 18:
                                zml0Var.p = t(trim9);
                                break;
                        }
                        i++;
                    }
                    this.b.i(zml0Var);
                    this.b = zml0Var;
                    return;
                case 20:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    dnl0 dnl0Var = new dnl0();
                    dnl0Var.a = this.a;
                    dnl0Var.b = this.b;
                    h(dnl0Var, attributes);
                    k(dnl0Var, attributes);
                    i(dnl0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim10 = attributes.getValue(i).trim();
                        int i6 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i6 == 35) {
                            dnl0Var.p = t(trim10);
                        } else if (i6 != 36) {
                            switch (i6) {
                                case 12:
                                    dnl0Var.m = t(trim10);
                                    break;
                                case 13:
                                    dnl0Var.n = t(trim10);
                                    break;
                                case 14:
                                    j t14 = t(trim10);
                                    dnl0Var.o = t14;
                                    if (t14.f()) {
                                        d7g0.k("Invalid <radialGradient> element. r cannot be negative");
                                        return;
                                    }
                                    break;
                            }
                        } else {
                            dnl0Var.q = t(trim10);
                        }
                        i++;
                    }
                    this.b.i(dnl0Var);
                    this.b = dnl0Var;
                    return;
                case 21:
                    wml0 wml0Var12 = this.b;
                    if (wml0Var12 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(wml0Var12 instanceof i)) {
                        d7g0.k("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    sml0 sml0Var = new sml0();
                    sml0Var.a = this.a;
                    sml0Var.b = wml0Var12;
                    h(sml0Var, attributes);
                    k(sml0Var, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String trim11 = attributes.getValue(i7).trim();
                        if (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i7)).ordinal()] == 37) {
                            if (trim11.length() == 0) {
                                d7g0.k("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = trim11.length();
                            if (g8e.a(1, trim11) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float p = p(length, trim11);
                                float f = 100.0f;
                                if (z) {
                                    p /= 100.0f;
                                }
                                if (p < 0.0f) {
                                    f = 0.0f;
                                } else if (p <= 100.0f) {
                                    f = p;
                                }
                                sml0Var.h = Float.valueOf(f);
                            } catch (NumberFormatException e) {
                                throw new SVGParseException("Invalid offset value in <stop>: ".concat(trim11), e);
                            }
                        }
                    }
                    this.b.i(sml0Var);
                    this.b = sml0Var;
                    return;
                case 22:
                case 23:
                    this.e = true;
                    this.f = a;
                    return;
                case 24:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    xll0 xll0Var = new xll0();
                    xll0Var.a = this.a;
                    xll0Var.b = this.b;
                    h(xll0Var, attributes);
                    k(xll0Var, attributes);
                    m(xll0Var, attributes);
                    g(xll0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim12 = attributes.getValue(i).trim();
                        if (n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()] == 38) {
                            if ("objectBoundingBox".equals(trim12)) {
                                xll0Var.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim12)) {
                                    d7g0.k("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                xll0Var.o = Boolean.TRUE;
                            }
                        }
                        i++;
                    }
                    this.b.i(xll0Var);
                    this.b = xll0Var;
                    return;
                case 25:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    mnl0 mnl0Var = new mnl0();
                    mnl0Var.a = this.a;
                    mnl0Var.b = this.b;
                    h(mnl0Var, attributes);
                    k(mnl0Var, attributes);
                    g(mnl0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim13 = attributes.getValue(i).trim();
                        int i8 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i8 != 6) {
                            if (i8 == 39) {
                                mnl0Var.o = t(trim13);
                            }
                        } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                            mnl0Var.n = trim13;
                        }
                        i++;
                    }
                    this.b.i(mnl0Var);
                    this.b = mnl0Var;
                    wml0 wml0Var13 = mnl0Var.b;
                    if (wml0Var13 instanceof jnl0) {
                        mnl0Var.p = (jnl0) wml0Var13;
                        return;
                    } else {
                        mnl0Var.p = ((knl0) wml0Var13).b();
                        return;
                    }
                case 26:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    nml0 nml0Var = new nml0();
                    nml0Var.a = this.a;
                    nml0Var.b = this.b;
                    h(nml0Var, attributes);
                    k(nml0Var, attributes);
                    g(nml0Var, attributes);
                    n(nml0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim14 = attributes.getValue(i).trim();
                        int i9 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i9 == 1) {
                            nml0Var.s = t(trim14);
                        } else if (i9 == 2) {
                            nml0Var.t = t(trim14);
                        } else if (i9 == 3) {
                            j t15 = t(trim14);
                            nml0Var.u = t15;
                            if (t15.f()) {
                                d7g0.k("Invalid <pattern> element. width cannot be negative");
                                return;
                            }
                        } else if (i9 == 4) {
                            j t16 = t(trim14);
                            nml0Var.v = t16;
                            if (t16.f()) {
                                d7g0.k("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (i9 != 6) {
                            switch (i9) {
                                case 40:
                                    if (!"objectBoundingBox".equals(trim14)) {
                                        if ("userSpaceOnUse".equals(trim14)) {
                                            nml0Var.p = Boolean.TRUE;
                                            break;
                                        } else {
                                            d7g0.k("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                    } else {
                                        nml0Var.p = Boolean.FALSE;
                                        break;
                                    }
                                case 41:
                                    if (!"objectBoundingBox".equals(trim14)) {
                                        if ("userSpaceOnUse".equals(trim14)) {
                                            nml0Var.q = Boolean.TRUE;
                                            break;
                                        } else {
                                            d7g0.k("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                    } else {
                                        nml0Var.q = Boolean.FALSE;
                                        break;
                                    }
                                case 42:
                                    nml0Var.r = A(trim14);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                            nml0Var.w = trim14;
                        }
                        i++;
                    }
                    this.b.i(nml0Var);
                    this.b = nml0Var;
                    return;
                case 27:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    fml0 fml0Var = new fml0();
                    fml0Var.a = this.a;
                    fml0Var.b = this.b;
                    h(fml0Var, attributes);
                    k(fml0Var, attributes);
                    m(fml0Var, attributes);
                    g(fml0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim15 = attributes.getValue(i).trim();
                        int i10 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i10 == 1) {
                            fml0Var.p = t(trim15);
                        } else if (i10 == 2) {
                            fml0Var.q = t(trim15);
                        } else if (i10 == 3) {
                            j t17 = t(trim15);
                            fml0Var.r = t17;
                            if (t17.f()) {
                                d7g0.k("Invalid <use> element. width cannot be negative");
                                return;
                            }
                        } else if (i10 == 4) {
                            j t18 = t(trim15);
                            fml0Var.s = t18;
                            if (t18.f()) {
                                d7g0.k("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (i10 != 6) {
                            if (i10 == 7) {
                                y(fml0Var, trim15);
                            }
                        } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                            fml0Var.o = trim15;
                        }
                        i++;
                    }
                    this.b.i(fml0Var);
                    this.b = fml0Var;
                    return;
                case 28:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    qnl0 qnl0Var = new qnl0();
                    qnl0Var.a = this.a;
                    qnl0Var.b = this.b;
                    h(qnl0Var, attributes);
                    g(qnl0Var, attributes);
                    n(qnl0Var, attributes);
                    this.b.i(qnl0Var);
                    this.b = qnl0Var;
                    return;
                case 29:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    iml0 iml0Var = new iml0();
                    iml0Var.a = this.a;
                    iml0Var.b = this.b;
                    h(iml0Var, attributes);
                    k(iml0Var, attributes);
                    g(iml0Var, attributes);
                    while (i < attributes.getLength()) {
                        String trim16 = attributes.getValue(i).trim();
                        int i11 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i11 == 1) {
                            t(trim16);
                        } else if (i11 == 2) {
                            t(trim16);
                        } else if (i11 == 3) {
                            j t19 = t(trim16);
                            iml0Var.p = t19;
                            if (t19.f()) {
                                d7g0.k("Invalid <mask> element. width cannot be negative");
                                return;
                            }
                        } else if (i11 == 4) {
                            j t20 = t(trim16);
                            iml0Var.q = t20;
                            if (t20.f()) {
                                d7g0.k("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (i11 != 43) {
                            if (i11 != 44) {
                                continue;
                            } else if ("objectBoundingBox".equals(trim16)) {
                                iml0Var.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim16)) {
                                    d7g0.k("Invalid value for attribute maskContentUnits");
                                    return;
                                }
                                iml0Var.o = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(trim16)) {
                            iml0Var.n = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(trim16)) {
                                d7g0.k("Invalid value for attribute maskUnits");
                                return;
                            }
                            iml0Var.n = Boolean.TRUE;
                        }
                        i++;
                    }
                    this.b.i(iml0Var);
                    this.b = iml0Var;
                    return;
                case 30:
                    if (this.b == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = "all";
                    boolean z2 = true;
                    while (i < attributes.getLength()) {
                        String trim17 = attributes.getValue(i).trim();
                        int i12 = n.b[SVGParser$SVGAttr.a(attributes.getLocalName(i)).ordinal()];
                        if (i12 == 88) {
                            z2 = trim17.equals("text/css");
                        } else if (i12 == 89) {
                            str4 = trim17;
                        }
                        i++;
                    }
                    if (z2) {
                        CSSParser$MediaType cSSParser$MediaType = CSSParser$MediaType.screen;
                        c cVar = new c(str4);
                        cVar.q();
                        Iterator it = f.c(cVar).iterator();
                        while (it.hasNext()) {
                            CSSParser$MediaType cSSParser$MediaType2 = (CSSParser$MediaType) it.next();
                            if (cSSParser$MediaType2 == CSSParser$MediaType.all || cSSParser$MediaType2 == cSSParser$MediaType) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 31:
                    wml0 wml0Var14 = this.b;
                    if (wml0Var14 == null) {
                        d7g0.k("Invalid document. Root element must be <svg>");
                        return;
                    }
                    rml0 rml0Var = new rml0();
                    rml0Var.a = this.a;
                    rml0Var.b = wml0Var14;
                    h(rml0Var, attributes);
                    k(rml0Var, attributes);
                    this.b.i(rml0Var);
                    this.b = rml0Var;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void H(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof lnl0) {
            a(str);
        }
    }

    public final void I(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.b instanceof lnl0) {
            a(new String(cArr, i, i2));
        }
    }

    public final void a(String str) {
        vml0 vml0Var = (vml0) this.b;
        int size = vml0Var.i.size();
        anl0 anl0Var = size == 0 ? null : (anl0) vml0Var.i.get(size - 1);
        if (anl0Var instanceof onl0) {
            onl0 onl0Var = (onl0) anl0Var;
            onl0Var.c = oyr.t(new StringBuilder(), onl0Var.c, str);
        } else {
            wml0 wml0Var = this.b;
            onl0 onl0Var2 = new onl0();
            onl0Var2.c = str;
            wml0Var.i(onl0Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = n.a[SVGParser$SVGElem.a(str2).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 13 && i2 != 14) {
                switch (i2) {
                    case 22:
                    case 23:
                        this.e = false;
                        if (this.g != null) {
                            SVGParser$SVGElem sVGParser$SVGElem = this.f;
                            if (sVGParser$SVGElem == SVGParser$SVGElem.title) {
                                this.a.getClass();
                            } else if (sVGParser$SVGElem == SVGParser$SVGElem.desc) {
                                this.a.getClass();
                            }
                            this.g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb = this.i;
                        if (sb != null) {
                            this.h = false;
                            String sb2 = sb.toString();
                            f fVar = new f(CSSParser$MediaType.screen, CSSParser$Source.Document);
                            l lVar = this.a;
                            c cVar = new c(sb2);
                            cVar.q();
                            lVar.b.b(fVar.e(cVar));
                            this.i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.b = ((anl0) this.b).b;
        }
    }

    public final l f(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            C(inputStream);
            return this.a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
