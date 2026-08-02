package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.ny61;
import defpackage.qr6;
import defpackage.vg10;
import defpackage.yci0;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
    }

    public static IconCompat a(Context context, Icon icon) {
        icon.getClass();
        int type = icon.getType();
        if (type == 2) {
            String resPackage = icon.getResPackage();
            try {
                return d(resPackage, f(context, resPackage), icon.getResId());
            } catch (Resources.NotFoundException unused) {
                ny61.g("Icon resource cannot be found");
                return null;
            }
        }
        if (type == 4) {
            Uri uri = icon.getUri();
            uri.getClass();
            String uri2 = uri.toString();
            uri2.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = uri2;
            return iconCompat;
        }
        if (type != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = icon;
            return iconCompat2;
        }
        Uri uri3 = icon.getUri();
        uri3.getClass();
        String uri4 = uri3.toString();
        uri4.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.b = uri4;
        return iconCompat3;
    }

    public static IconCompat b(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(int i, Context context) {
        context.getClass();
        return d(context.getPackageName(), context.getResources(), i);
    }

    public static IconCompat d(String str, Resources resources, int i) {
        str.getClass();
        if (i == 0) {
            ny61.g("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = i;
        if (resources != null) {
            try {
                iconCompat.b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                ny61.g("Icon resource cannot be found");
                return null;
            }
        } else {
            iconCompat.b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public static Resources f(Context context, String str) {
        if (ConstantDeviceInfo.APP_PLATFORM.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", "Unable to find pkg=" + str + " for icon", e);
            return null;
        }
    }

    public final int e() {
        int i = this.a;
        if (i == -1) {
            return ((Icon) this.b).getResId();
        }
        if (i == 2) {
            return this.e;
        }
        yci0.k(this, "called getResId() on ");
        return 0;
    }

    public final Uri g() {
        int i = this.a;
        if (i == -1) {
            return ((Icon) this.b).getUri();
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.b);
        }
        yci0.k(this, "called getUri() on ");
        return null;
    }

    public final InputStream h(Context context) {
        Uri g = g();
        String scheme = g.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(g);
            } catch (Exception unused) {
                g.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.b));
        } catch (FileNotFoundException unused2) {
            g.toString();
            return null;
        }
    }

    public final Icon i(Context context) {
        Icon createWithBitmap;
        String str;
        int i = this.a;
        switch (i) {
            case -1:
                return (Icon) this.b;
            case 0:
            default:
                ny61.g("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.b);
                break;
            case 2:
                if (i == -1) {
                    str = ((Icon) this.b).getResPackage();
                } else {
                    if (i != 2) {
                        yci0.k(this, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = this.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.b).split(":", -1)[0] : this.j;
                }
                createWithBitmap = Icon.createWithResource(str, this.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.b, this.e, this.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = qr6.c(g());
                    break;
                } else {
                    if (context == null) {
                        vg10.g(g(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    InputStream h = h(context);
                    if (h == null) {
                        yci0.t(g(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(h));
                    break;
                }
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = GlobalRouterActivity.URI;
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append(RemoteBioParameters.X);
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public IconCompat(int i) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
        this.a = i;
    }
}
