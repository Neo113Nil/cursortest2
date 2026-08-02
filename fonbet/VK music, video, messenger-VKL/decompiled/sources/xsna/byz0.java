package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class byz0 {
    public final t801 a;
    public final Context b;
    public final nxz0 c;

    @Nullable
    public PackageInfo d;

    public byz0(Context context, t801 t801Var) {
        nxz0 nxz0Var = new nxz0();
        this.a = t801Var;
        this.b = context;
        this.c = nxz0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r6.a.getName().equals("manifest") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r4 = r6.a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r5 = r6.a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r4 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        r4 = java.lang.Integer.parseInt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r4 = (java.lang.Integer.parseInt(r5) << 32) | (r4 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(xsna.go9.b("Couldn't parse versionCodeMajor to int: ", r12.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(xsna.go9.b("Couldn't parse versionCode to int: ", r12.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(File[] fileArr) throws IOException, XmlPullParserException {
        PackageInfo packageInfo;
        long parseInt;
        Context context = this.b;
        if (this.d == null) {
            try {
                this.d = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        }
        packageInfo = this.d;
        long longVersionCode = packageInfo.getLongVersionCode();
        AssetManager assetManager = (AssetManager) f370.R();
        int length = fileArr.length;
        loop0: do {
            length--;
            if (length < 0) {
                return true;
            }
            XmlResourceParser openXmlResourceParser = assetManager.openXmlResourceParser(((Integer) f370.S(assetManager, "addAssetPath", Integer.class, String.class, fileArr[length].getPath())).intValue(), "AndroidManifest.xml");
            nxz0 nxz0Var = this.c;
            nxz0Var.a = openXmlResourceParser;
            if (openXmlResourceParser == null) {
                throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
            }
            while (true) {
                int next = nxz0Var.a.next();
                if (next == 2) {
                    break;
                }
                if (next == 1) {
                    break loop0;
                }
            }
            throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
        } while (longVersionCode == parseInt);
        return false;
    }

    public final boolean b(File[] fileArr) {
        PackageInfo packageInfo;
        String absolutePath;
        X509Certificate x509Certificate;
        Context context = this.b;
        ArrayList<X509Certificate> arrayList = null;
        if (this.d == null) {
            try {
                this.d = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        }
        packageInfo = this.d;
        if (packageInfo != null && packageInfo.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfo.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException e) {
                    Log.e("SplitCompat", "Cannot decode certificate.", e);
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] a = of01.a(absolutePath);
                    if (a == null || a.length == 0 || a[0].length == 0) {
                        break;
                    }
                    if (arrayList.isEmpty()) {
                        Log.e("SplitCompat", "No certificates found for app.");
                        break;
                    }
                    for (X509Certificate x509Certificate2 : arrayList) {
                        for (X509Certificate[] x509CertificateArr : a) {
                            int i = x509CertificateArr[0].equals(x509Certificate2) ? 0 : i + 1;
                        }
                    }
                } catch (Exception e2) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e2);
                }
            } catch (Exception e3) {
                Log.e("SplitCompat", "Split verification error.", e3);
                return false;
            }
        }
        Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.");
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }
}
