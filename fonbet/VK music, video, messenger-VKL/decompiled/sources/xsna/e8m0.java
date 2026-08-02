package xsna;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StoryPhotoStickerDelegate.kt */
/* loaded from: classes16.dex */
public final class e8m0 {
    public final Activity a;
    public final u76 b;
    public final StickersDrawingViewGroup c;
    public io.reactivex.rxjava3.disposables.c e;
    public boolean f;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new f880(this, 24));

    public e8m0(Activity activity, u76 u76Var, StickersDrawingViewGroup stickersDrawingViewGroup) {
        this.a = activity;
        this.b = u76Var;
        this.c = stickersDrawingViewGroup;
    }

    public final void a(Uri uri) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = mcr0.i(uri, 1080, 1920, 94848, null, null).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        asu0.a.getClass();
        this.e = a0.r0(asu0.k()).subscribe(new t520(new qm90(12, this, uri), 22), new p350(new y510(26), 20));
    }

    public final void b(int i, Intent intent) {
        Bundle bundleExtra;
        ArrayList parcelableArrayList;
        Uri uri;
        if (i != -1) {
            this.b.i4();
            return;
        }
        if (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null || (uri = (Uri) j5g.a0(parcelableArrayList)) == null) {
            return;
        }
        if (oeq0.e(uri) || com.vk.core.files.a.x(uri.getPath()) || drm0.D(uri.toString(), "com.android.providers.media.photopicker", false)) {
            a(uri);
        }
    }
}
