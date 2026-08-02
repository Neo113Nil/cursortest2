package com.vungle.ads.internal.downloader;

import ru.ok.android.api.core.ApiInvocationException;

/* loaded from: classes7.dex */
public abstract class a {
    public static boolean a(b bVar) {
        if (bVar.b() != 1) {
            return false;
        }
        int c = bVar.c();
        if (c != -1 && c != 408 && c != 500) {
            switch (c) {
                case 502:
                case 503:
                case ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED /* 504 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
