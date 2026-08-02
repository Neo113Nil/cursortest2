package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil3.graphics.EnumC0136DataSource;
import coil3.size.Precision;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public final class p93 implements pwq {
    public final /* synthetic */ int a;
    public final cg21 b;
    public final lg70 c;

    public /* synthetic */ p93(cg21 cg21Var, lg70 lg70Var, int i) {
        this.a = i;
        this.b = cg21Var;
        this.c = lg70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    @Override // defpackage.pwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        AssetFileDescriptor openAssetFileDescriptor;
        List e;
        int size;
        Bundle bundle;
        Integer l;
        String str;
        Drawable drawable;
        int i = this.a;
        cg21 cg21Var = this.b;
        lg70 lg70Var = this.c;
        String str2 = null;
        switch (i) {
            case 0:
                String X = a.X(a.J(yri0.e(cg21Var), 1), "/", null, null, null, 62);
                bdt0 bdt0Var = new bdt0(new jci0(vng.H(lg70Var.a.getAssets().open(X))), lg70Var.e, new f93(X));
                if (!evu0.J(X)) {
                    String h0 = evu0.h0('#', X, X);
                    String h02 = evu0.h0('?', h0, h0);
                    String e0 = evu0.e0('.', evu0.e0('/', h02, h02), "");
                    if (!evu0.J(e0)) {
                        String lowerCase = e0.toLowerCase(Locale.ROOT);
                        str2 = (String) fh20.a.get(lowerCase);
                        if (str2 == null) {
                            str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new zct0(bdt0Var, str2, EnumC0136DataSource.DISK);
            case 1:
                Uri parse = Uri.parse(cg21Var.a);
                ContentResolver contentResolver = lg70Var.a.getContentResolver();
                String str3 = cg21Var.d;
                if (jl40.l(str3, "com.android.contacts") && jl40.l(a.b0(yri0.e(cg21Var)), "display_photo")) {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                    if (openAssetFileDescriptor == null) {
                        xfo.g(g8e.m(parse, "Unable to find a contact photo associated with '", "'."));
                        return null;
                    }
                } else if (jl40.l(str3, "media") && (size = (e = yri0.e(cg21Var)).size()) >= 3 && jl40.l(e.get(size - 3), MediaStreamTrack.AUDIO_TRACK_KIND) && jl40.l(e.get(size - 2), "albums")) {
                    xis0 xis0Var = lg70Var.b;
                    okj okjVar = xis0Var.a;
                    kkj kkjVar = okjVar instanceof kkj ? (kkj) okjVar : null;
                    if (kkjVar != null) {
                        int i2 = kkjVar.a;
                        okj okjVar2 = xis0Var.b;
                        kkj kkjVar2 = okjVar2 instanceof kkj ? (kkj) okjVar2 : null;
                        if (kkjVar2 != null) {
                            int i3 = kkjVar2.a;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i2, i3));
                            openAssetFileDescriptor = contentResolver.openTypedAssetFile(parse, "image/*", bundle, null);
                            if (openAssetFileDescriptor == null) {
                                xfo.g(g8e.m(parse, "Unable to find a music thumbnail associated with '", "'."));
                                return null;
                            }
                        }
                    }
                    bundle = null;
                    openAssetFileDescriptor = contentResolver.openTypedAssetFile(parse, "image/*", bundle, null);
                    if (openAssetFileDescriptor == null) {
                    }
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                    if (openAssetFileDescriptor == null) {
                        xfo.g(g8e.m(parse, "Unable to open '", "'."));
                        return null;
                    }
                }
                return new zct0(new bdt0(new jci0(vng.H(openAssetFileDescriptor.createInputStream())), lg70Var.e, new ahe(openAssetFileDescriptor)), contentResolver.getType(parse), EnumC0136DataSource.DISK);
            case 2:
                String str4 = cg21Var.a;
                String str5 = cg21Var.a;
                int H = evu0.H(str4, ";base64,", 0, false, 6);
                if (H == -1) {
                    vg10.o(cg21Var, "invalid data uri: ");
                    return null;
                }
                int G = evu0.G(str5, ':', 0, 6);
                if (G == -1) {
                    vg10.o(cg21Var, "invalid data uri: ");
                    return null;
                }
                String substring = str5.substring(G + 1, H);
                byte[] a = cw4.a(cw4.d, str5, H + 8, 4);
                yp6 yp6Var = new yp6();
                yp6Var.m968write(a);
                return new zct0(eja1.b(yp6Var, lg70Var.e), substring, EnumC0136DataSource.MEMORY);
            case 3:
                String str6 = oq90.b;
                String c = yri0.c(cg21Var);
                if (c == null) {
                    ny61.r("filePath == null");
                    return null;
                }
                oq90 f = sms.f(c);
                b0r a2 = eja1.a(f, lg70Var.e, null, null, 28);
                String e02 = evu0.e0('.', f.b(), "");
                if (!evu0.J(e02)) {
                    String lowerCase2 = e02.toLowerCase(Locale.ROOT);
                    str2 = (String) fh20.a.get(lowerCase2);
                    if (str2 == null) {
                        str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new zct0(a2, str2, EnumC0136DataSource.DISK);
            case 4:
                String str7 = cg21Var.e;
                if (str7 == null) {
                    str7 = "";
                }
                int G2 = evu0.G(str7, '!', 0, 6);
                if (G2 == -1) {
                    vg10.o(cg21Var, "Invalid jar:file URI: ");
                    return null;
                }
                String str8 = oq90.b;
                oq90 f2 = sms.f(str7.substring(0, G2));
                oq90 f3 = sms.f(str7.substring(G2 + 1, str7.length()));
                b0r a3 = eja1.a(f3, t1a1.f(f2, lg70Var.e, new ob61(2)), null, null, 28);
                String e03 = evu0.e0('.', f3.b(), "");
                if (!evu0.J(e03)) {
                    String lowerCase3 = e03.toLowerCase(Locale.ROOT);
                    str2 = (String) fh20.a.get(lowerCase3);
                    if (str2 == null) {
                        str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new zct0(a3, str2, EnumC0136DataSource.DISK);
            default:
                String str9 = cg21Var.d;
                if (str9 != null) {
                    if (evu0.J(str9)) {
                        str9 = null;
                    }
                    if (str9 != null) {
                        String str10 = (String) a.b0(yri0.e(cg21Var));
                        if (str10 == null || (l = bvu0.l(10, str10)) == null) {
                            yci0.k(cg21Var, "Invalid android.resource URI: ");
                            return null;
                        }
                        int intValue = l.intValue();
                        Context context = lg70Var.a;
                        Resources resources = str9.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str9);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        String obj = typedValue.string.toString();
                        if (!evu0.J(obj)) {
                            String h03 = evu0.h0('#', obj, obj);
                            String h04 = evu0.h0('?', h03, h03);
                            String e04 = evu0.e0('.', evu0.e0('/', h04, h04), "");
                            if (!evu0.J(e04)) {
                                String lowerCase4 = e04.toLowerCase(Locale.ROOT);
                                str = (String) fh20.a.get(lowerCase4);
                                if (str == null) {
                                    str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                                if (jl40.l(str, "text/xml")) {
                                    return new zct0(new bdt0(new jci0(vng.H(resources.openRawResource(intValue, new TypedValue()))), lg70Var.e, new luj0(str9, intValue)), str, EnumC0136DataSource.DISK);
                                }
                                if (str9.equals(context.getPackageName())) {
                                    drawable = vng.t(intValue, context);
                                    if (drawable == null) {
                                        xfo.g(oyr.i(intValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                } else {
                                    XmlResourceParser xml = resources.getXml(intValue);
                                    int next = xml.next();
                                    while (next != 2 && next != 1) {
                                        next = xml.next();
                                    }
                                    if (next != 2) {
                                        throw new XmlPullParserException("No start tag found.");
                                    }
                                    Resources.Theme theme = context.getTheme();
                                    ThreadLocal threadLocal = wuj0.a;
                                    drawable = resources.getDrawable(intValue, theme);
                                    if (drawable == null) {
                                        xfo.g(oyr.i(intValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                }
                                Drawable drawable2 = drawable;
                                Bitmap.Config[] configArr = zx21.a;
                                boolean z = (drawable2 instanceof VectorDrawable) || (drawable2 instanceof VectorDrawableCompat);
                                if (z) {
                                    drawable2 = new BitmapDrawable(context.getResources(), om91.e(drawable2, (Bitmap.Config) s8o.p(lg70Var, lev.a), lg70Var.b, lg70Var.c, (xis0) s8o.p(lg70Var, kev.b), lg70Var.d == Precision.INEXACT));
                                }
                                return new t9v(cma1.k(drawable2), z, EnumC0136DataSource.DISK);
                            }
                        }
                        str = null;
                        if (jl40.l(str, "text/xml")) {
                        }
                    }
                }
                yci0.k(cg21Var, "Invalid android.resource URI: ");
                return null;
        }
    }
}
