package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.util.List;

/* compiled from: FrescoXmlResourceDrawableDecoder.kt */
/* loaded from: classes.dex */
public final class shs implements niw {
    public final Context a;

    public shs(Context context) {
        this.a = context;
    }

    @Override // xsna.niw
    public final svf a(rip ripVar, int i, cpe0 cpe0Var, liw liwVar) {
        Integer valueOf;
        if (!(liwVar instanceof q0v0)) {
            throw new IllegalStateException(("Invalid decode options. Make sure, that you have set \"VkImageDecodeOptions\" in \"ImageRequestBuilder::setImageDecodeOptions\", encodedImage " + ripVar + " options " + liwVar).toString());
        }
        Uri c = ((q0v0) liwVar).c();
        if (c == null) {
            throw new IllegalArgumentException("Uri is null");
        }
        if (!meq0.d(c) && !meq0.f(c)) {
            throw new DecodeException("Unknown image format", ripVar);
        }
        List<String> pathSegments = c.getPathSegments();
        int size = pathSegments.size();
        Context context = this.a;
        if (size == 2) {
            String authority = c.getAuthority();
            if (authority == null || authority.length() == 0) {
                authority = context.getPackageName();
            }
            valueOf = Integer.valueOf(context.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), authority));
        } else {
            if (pathSegments.size() == 1) {
                try {
                    valueOf = Integer.valueOf(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            valueOf = null;
        }
        if (valueOf == null) {
            throw new IllegalArgumentException(i6n0.a(c, "Unrecognized Uri format: ").toString());
        }
        if (valueOf.intValue() == 0) {
            throw new IllegalArgumentException(i6n0.a(c, "Failed to obtain resource id for: ").toString());
        }
        int intValue = valueOf.intValue();
        String authority2 = c.getAuthority();
        if (authority2 != null && authority2.length() != 0 && !authority2.equals(context.getPackageName())) {
            try {
                context = context.createPackageContext(authority2, 0);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(i6n0.a(c, "Failed to obtain context or unrecognized Uri format for: "), e);
            }
        }
        return new xgs(m33.a(intValue, context));
    }
}
