package com.yandex.runtime.image;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* loaded from: classes8.dex */
public abstract class ImageProvider {
    private final boolean cacheable;

    /* loaded from: classes2.dex */
    public static abstract class ImageProviderImpl extends ImageProvider {
        private final String id;

        public ImageProviderImpl(String str, boolean z) {
            super(z);
            this.id = str;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public Bitmap getImage() {
            return loadBitmap();
        }

        public abstract Bitmap loadBitmap();
    }

    public ImageProvider(boolean z) {
        this.cacheable = z;
    }

    public static ImageProvider fromAsset(Context context, final String str, boolean z) {
        final AssetManager assets = context.getAssets();
        return new ImageProviderImpl(g8e.o("asset:", str), z) { // from class: com.yandex.runtime.image.ImageProvider.2
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() {
                Bitmap bitmap = null;
                try {
                    InputStream open = assets.open(str);
                    try {
                        bitmap = BitmapFactory.decodeStream(open);
                        return bitmap;
                    } finally {
                        open.close();
                    }
                } catch (IOException e) {
                    Log.e("yandex.maps", "Can't load image from asset: " + str, e);
                    return bitmap;
                }
            }
        };
    }

    public static ImageProvider fromBitmap(Bitmap bitmap) {
        return fromBitmap(bitmap, true, "bitmap:" + UUID.randomUUID().toString());
    }

    public static ImageProvider fromFile(final String str, boolean z) {
        return new ImageProviderImpl(g8e.o("file:", str), z) { // from class: com.yandex.runtime.image.ImageProvider.4
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() {
                return BitmapFactory.decodeFile(str);
            }
        };
    }

    public static ImageProvider fromResource(Context context, final int i, boolean z) {
        final Resources resources = context.getResources();
        return new ImageProviderImpl(oyr.i(i, "resource:"), z) { // from class: com.yandex.runtime.image.ImageProvider.3
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() {
                return BitmapFactory.decodeResource(resources, i);
            }
        };
    }

    public Object get() {
        return getImage();
    }

    public abstract String getId();

    public abstract Bitmap getImage();

    public boolean isCacheable() {
        return this.cacheable;
    }

    public ImageProvider() {
        this(true);
    }

    public static ImageProvider fromFile(String str) {
        return fromFile(str, true);
    }

    public static ImageProvider fromAsset(Context context, String str) {
        return fromAsset(context, str, true);
    }

    public static ImageProvider fromResource(Context context, int i) {
        return fromResource(context, i, true);
    }

    public static ImageProvider fromBitmap(final Bitmap bitmap, boolean z, final String str) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return new ImageProvider(z) { // from class: com.yandex.runtime.image.ImageProvider.1
                @Override // com.yandex.runtime.image.ImageProvider
                public String getId() {
                    return str;
                }

                @Override // com.yandex.runtime.image.ImageProvider
                public Bitmap getImage() {
                    return bitmap;
                }
            };
        }
        ny61.g("Bitmap config value should be ARGB_8888");
        return null;
    }
}
