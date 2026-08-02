package com.fluttercandies.photo_manager.core;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ea20;
import defpackage.tt5;
import defpackage.wfz;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final class a {
    public final Context a;
    public boolean b;
    public final PhotoManagerNotifyChannel$MediaObserver c;
    public final PhotoManagerNotifyChannel$MediaObserver d;
    public final PhotoManagerNotifyChannel$MediaObserver e;
    public final Uri f;
    public final Uri g;
    public final Uri h;
    public final Uri i;
    public final ea20 j;

    public a(Context context, tt5 tt5Var, Handler handler) {
        this.a = context;
        this.c = new PhotoManagerNotifyChannel$MediaObserver(this, 3, handler);
        this.d = new PhotoManagerNotifyChannel$MediaObserver(this, 1, handler);
        this.e = new PhotoManagerNotifyChannel$MediaObserver(this, 2, handler);
        com.fluttercandies.photo_manager.core.utils.b.a.getClass();
        this.f = MediaStore.Files.getContentUri("external");
        this.g = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        this.h = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        this.i = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        this.j = new ea20(tt5Var, "com.fluttercandies/photo_manager/notify");
    }

    public final void a(Uri uri, String str, Long l, Long l2, int i) {
        HashMap h = kotlin.collections.b.h(new Pair("platform", ConstantDeviceInfo.APP_PLATFORM), new Pair(LaunchBrowserActivity.KEY_URI, String.valueOf(uri)), new Pair("type", str), new Pair("mediaType", Integer.valueOf(i)));
        if (l != null) {
            h.put("id", l);
        }
        if (l2 != null) {
            h.put("galleryId", l2);
        }
        wfz.d(h);
        this.j.a("change", h, null);
    }
}
