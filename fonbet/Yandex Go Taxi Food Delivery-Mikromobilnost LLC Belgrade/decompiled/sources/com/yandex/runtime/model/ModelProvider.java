package com.yandex.runtime.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import com.yandex.runtime.ByteBufferUtils;
import com.yandex.runtime.image.ImageProvider;
import defpackage.g8e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class ModelProvider {
    public static ModelProvider fromAsset(Context context, final String str, final ImageProvider imageProvider) {
        final AssetManager assets = context.getAssets();
        final String o = g8e.o("model/asset:", str);
        return new ModelProvider() { // from class: com.yandex.runtime.model.ModelProvider.3
            @Override // com.yandex.runtime.model.ModelProvider
            public String getId() {
                return o;
            }

            @Override // com.yandex.runtime.model.ModelProvider
            public ByteBuffer getModel() {
                try {
                    return ByteBufferUtils.fromAsset(assets, str);
                } catch (IOException e) {
                    Log.e("yandex.maps", "Can't load model from asset: " + str, e);
                    return null;
                }
            }

            @Override // com.yandex.runtime.model.ModelProvider
            public ImageProvider getTexture() {
                return imageProvider;
            }
        };
    }

    public static ModelProvider fromByteArray(final byte[] bArr, final ImageProvider imageProvider) {
        final String str = "model/bytes:" + UUID.randomUUID().toString();
        return new ModelProvider() { // from class: com.yandex.runtime.model.ModelProvider.1
            @Override // com.yandex.runtime.model.ModelProvider
            public String getId() {
                return str;
            }

            @Override // com.yandex.runtime.model.ModelProvider
            public ByteBuffer getModel() {
                return ByteBufferUtils.fromByteArray(bArr);
            }

            @Override // com.yandex.runtime.model.ModelProvider
            public ImageProvider getTexture() {
                return imageProvider;
            }
        };
    }

    public static ModelProvider fromFile(final String str, final ImageProvider imageProvider) {
        final String o = g8e.o("model/file:", str);
        return new ModelProvider() { // from class: com.yandex.runtime.model.ModelProvider.4
            @Override // com.yandex.runtime.model.ModelProvider
            public String getId() {
                return o;
            }

            @Override // com.yandex.runtime.model.ModelProvider
            public ByteBuffer getModel() {
                try {
                    return ByteBufferUtils.fromFile(str);
                } catch (IOException e) {
                    Log.e("yandex.maps", "Can't load model from file: " + str, e);
                    return null;
                }
            }

            @Override // com.yandex.runtime.model.ModelProvider
            public ImageProvider getTexture() {
                return imageProvider;
            }
        };
    }

    public static ModelProvider fromResource(Context context, final int i, final ImageProvider imageProvider) {
        final Resources resources = context.getResources();
        final String str = "model/resource:" + String.valueOf(i);
        return new ModelProvider() { // from class: com.yandex.runtime.model.ModelProvider.2
            @Override // com.yandex.runtime.model.ModelProvider
            public String getId() {
                return str;
            }

            @Override // com.yandex.runtime.model.ModelProvider
            public ByteBuffer getModel() {
                try {
                    return ByteBufferUtils.fromResource(resources, i);
                } catch (IOException e) {
                    Log.e("yandex.maps", "Can't load model from resource: " + String.valueOf(i), e);
                    return null;
                }
            }

            @Override // com.yandex.runtime.model.ModelProvider
            public ImageProvider getTexture() {
                return imageProvider;
            }
        };
    }

    public abstract String getId();

    public abstract ByteBuffer getModel();

    public abstract ImageProvider getTexture();
}
