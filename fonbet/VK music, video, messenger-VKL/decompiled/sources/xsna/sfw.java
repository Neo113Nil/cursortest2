package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes12.dex */
public final class sfw {
    public static final Object e = new Object();

    @Nullable
    public final Context a;
    public final String b;

    @Nullable
    public ofw c;
    public final Map<String, q800> d;

    public sfw(Drawable.Callback callback, String str, ofw ofwVar, Map<String, q800> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str.concat(DomExceptionUtils.SEPARATOR);
        }
        this.d = map;
        this.c = ofwVar;
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }

    public final void a(@Nullable Bitmap bitmap, String str) {
        synchronized (e) {
            this.d.get(str).f = bitmap;
        }
    }
}
