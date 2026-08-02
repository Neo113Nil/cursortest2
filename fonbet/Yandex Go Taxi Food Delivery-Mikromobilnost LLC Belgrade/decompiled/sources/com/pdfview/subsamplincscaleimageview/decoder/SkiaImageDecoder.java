package com.pdfview.subsamplincscaleimageview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import defpackage.kbs;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes11.dex */
public class SkiaImageDecoder {
    public final Bitmap.Config a;

    public SkiaImageDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (preferredBitmapConfig != null) {
            this.a = preferredBitmapConfig;
        } else {
            this.a = Bitmap.Config.RGB_565;
        }
    }

    public final Bitmap a(Context context, Uri uri) {
        Bitmap bitmap;
        String uri2 = uri.toString();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = this.a;
        InputStream inputStream = null;
        if (uri2.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            int i = 0;
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                i = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    i = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            bitmap = BitmapFactory.decodeResource(context.getResources(), i, options);
        } else if (uri2.startsWith(Util.ANDROID_ASSET_URL)) {
            bitmap = BitmapFactory.decodeStream(context.getAssets().open(uri2.substring(22)), null, options);
        } else if (uri2.startsWith("file://")) {
            bitmap = BitmapFactory.decodeFile(uri2.substring(7), options);
        } else {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    bitmap = decodeStream;
                } catch (Throwable th) {
                    th = th;
                    inputStream = openInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (bitmap != null) {
            return bitmap;
        }
        kbs.g("Skia image region decoder returned null bitmap - image format may not be supported");
        return null;
    }
}
