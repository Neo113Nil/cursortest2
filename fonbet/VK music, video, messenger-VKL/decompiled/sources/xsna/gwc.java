package xsna;

import android.content.Context;
import android.util.Size;
import android.view.Window;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.snackbar.HideReason;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ikv0;
import xsna.lgj0;
import xsna.olh0;
import xsna.v7e;

/* compiled from: ClipFeedDislikeHelper.kt */
/* loaded from: classes17.dex */
public final class gwc {
    public static final int l = cn70.b(8);
    public final Window a;
    public final zfj0 b;
    public final h3d c;
    public final xxq d;
    public final nme e;
    public final Context f;
    public ikv0 g;
    public ikv0 h;
    public SdkVideoFile i;
    public SdkVideoFile j;
    public SdkVideoFile k;

    /* compiled from: ClipFeedDislikeHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HideReason.values().length];
            try {
                iArr[HideReason.Consecutive.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HideReason.Timeout.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HideReason.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HideReason.RootViewDetached.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HideReason.Manual.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gwc(Window window, zfj0 zfj0Var, h3d h3dVar, v7e.b bVar, nme nmeVar) {
        this.a = window;
        this.b = zfj0Var;
        this.c = h3dVar;
        this.d = bVar;
        this.e = nmeVar;
        this.f = window.getContext();
    }

    public final void a(SdkVideoFile sdkVideoFile) {
        this.c.s5();
        String r1 = sdkVideoFile.r1();
        SdkVideoFile sdkVideoFile2 = this.i;
        if (epx.f(r1, sdkVideoFile2 != null ? sdkVideoFile2.r1() : null)) {
            ikv0 ikv0Var = this.g;
            if (ikv0Var != null) {
                ikv0Var.c();
                return;
            }
            return;
        }
        MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype eventSubtype = MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.WITHOUT_REASONS;
        SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.HIDE;
        nme nmeVar = this.e;
        nme.a(eventSubtype, eventType, fzc.b(nmeVar.a), sdkVideoFile);
        nmeVar.b(sdkVideoFile);
        defpackage.h0 h0Var = new defpackage.h0(5, this, sdkVideoFile);
        wd3 wd3Var = new wd3(5, this, sdkVideoFile);
        this.i = sdkVideoFile;
        this.g = k(h0Var, wd3Var);
    }

    public final void b(SdkVideoFile sdkVideoFile) {
        VideoFile A = k15.A(sdkVideoFile);
        wjs0.a(new ywr0(A));
        if (dgd.d(sdkVideoFile)) {
            return;
        }
        com.vk.movika.sdk.base.hooks.p pVar = new com.vk.movika.sdk.base.hooks.p(this, 29);
        zfj0 zfj0Var = this.b;
        mgj0 mgj0Var = (mgj0) zfj0Var.c.getValue();
        UserId I0 = A.I0();
        int o0 = A.o0();
        String r = A.r();
        if ((28 & 32) != 0) {
            r = null;
        }
        dz2 x = yfb.x(mgj0Var.s(o0, I0, r));
        ahn.D(x);
        zfj0Var.b.b(rsg0.y0(x, null, null, 3).subscribe(new cx00(new o440(A, 26), 23), new q440(new ed5(zfj0Var, pVar, A, 3), 19)));
    }

    public final void c(SdkVideoFile sdkVideoFile) {
        this.c.s5();
        String r1 = sdkVideoFile.r1();
        SdkVideoFile sdkVideoFile2 = this.k;
        if (epx.f(r1, sdkVideoFile2 != null ? sdkVideoFile2.r1() : null)) {
            ikv0 ikv0Var = this.h;
            if (ikv0Var != null) {
                ikv0Var.c();
                return;
            }
            return;
        }
        this.k = sdkVideoFile;
        Context context = this.f;
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(context.getString(R.string.clip_hide_author), (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.video_hide_cancel), new b1a(3, this, sdkVideoFile));
        aVar.h = new h57(3, this, sdkVideoFile);
        aVar.o = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height) + l);
        aVar.e = 3000L;
        aVar.i = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        aVar.c = 0.25f;
        aVar.d = true;
        this.h = aVar.p(this.a);
    }

    public final void d(String str) {
        this.g = k(new he3(8, this, str), new bp7(4, this, str));
    }

    public final void e(SdkVideoFile sdkVideoFile, gzs<s3q0> gzsVar) {
        this.c.s5();
        String r1 = sdkVideoFile.r1();
        SdkVideoFile sdkVideoFile2 = this.j;
        if (epx.f(r1, sdkVideoFile2 != null ? sdkVideoFile2.r1() : null)) {
            return;
        }
        this.j = sdkVideoFile;
        Context context = this.f;
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(context.getString(R.string.clip_do_not_show_similar), (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.video_hide_cancel), new eo6(this, sdkVideoFile, gzsVar, 2));
        aVar.h = new u9(6, this, sdkVideoFile);
        aVar.o = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height) + l);
        aVar.e = 3000L;
        aVar.i = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        aVar.c = 0.25f;
        aVar.d = true;
        this.g = aVar.p(this.a);
    }

    public final void f(SdkVideoFile sdkVideoFile) {
        zfj0.a(this.b, k15.A(sdkVideoFile), new k00(this, 24));
    }

    public final void g(SdkVideoFile sdkVideoFile) {
        c(sdkVideoFile);
    }

    public final void h() {
        SdkVideoFile sdkVideoFile = this.i;
        if (sdkVideoFile != null) {
            b(sdkVideoFile);
        }
        SdkVideoFile sdkVideoFile2 = this.j;
        if (sdkVideoFile2 != null) {
            VideoFile A = k15.A(sdkVideoFile2);
            wjs0.a(new oxr0(A, true));
            zfj0.a(this.b, A, new pd(this, 23));
        }
        SdkVideoFile sdkVideoFile3 = this.k;
        if (sdkVideoFile3 != null) {
            c(sdkVideoFile3);
        }
        ikv0 ikv0Var = this.g;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        ikv0 ikv0Var2 = this.h;
        if (ikv0Var2 != null) {
            ikv0Var2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final io.reactivex.rxjava3.core.a i(SdkVideoFile sdkVideoFile, pd pdVar) {
        Object obj;
        Object obj2;
        if (dgd.f(sdkVideoFile)) {
            return io.reactivex.rxjava3.core.a.l(new cwc(0, this, sdkVideoFile));
        }
        boolean z = sdkVideoFile instanceof SdkClipVideoFile;
        xxq xxqVar = this.d;
        if (z) {
            final SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) sdkVideoFile;
            if (sdkClipVideoFile.f7()) {
                Iterator<T> it = xxqVar.getCurrentItems().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    FeedItem feedItem = (FeedItem) obj2;
                    if (!(feedItem instanceof FeedItem.d) ? false : epx.f(((FeedItem.d) feedItem).k().r1(), sdkClipVideoFile.r1())) {
                        break;
                    }
                }
                FeedItem.d dVar = obj2 instanceof FeedItem.d ? (FeedItem.d) obj2 : null;
                final nlh0 W = dVar != null ? dVar.W() : null;
                if (W == null) {
                    return io.reactivex.rxjava3.core.a.k(new IllegalStateException("Controller for clip not found"));
                }
                SdkVideoFile k = W.k();
                final SdkClipVideoFile sdkClipVideoFile2 = k instanceof SdkClipVideoFile ? (SdkClipVideoFile) k : null;
                return sdkClipVideoFile2 == null ? io.reactivex.rxjava3.core.a.k(new IllegalStateException("Video from controller is not clip")) : io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.dwc
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        ConcurrentHashMap.KeySetView keySetView = zed.a;
                        ClipVideoFile z2 = k15.z(SdkClipVideoFile.this);
                        z2.X1 = false;
                        zed.a.remove(z2.a1());
                        W.d(Collections.singletonList(new olh0.b(false)));
                        nme.a(null, SchemeStat$TypeClipViewerItem.EventType.UNHIDE, fzc.b(this.e.a), sdkClipVideoFile);
                    }
                });
            }
        }
        if (!z) {
            return io.reactivex.rxjava3.core.a.k(new IllegalStateException("Video is not clip"));
        }
        SdkClipVideoFile sdkClipVideoFile3 = (SdkClipVideoFile) sdkVideoFile;
        Iterator<T> it2 = xxqVar.getCurrentItems().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            FeedItem feedItem2 = (FeedItem) obj;
            if (!(feedItem2 instanceof FeedItem.d) ? false : epx.f(((FeedItem.d) feedItem2).k().r1(), sdkClipVideoFile3.r1())) {
                break;
            }
        }
        FeedItem.d dVar2 = obj instanceof FeedItem.d ? (FeedItem.d) obj : null;
        nlh0 W2 = dVar2 != null ? dVar2.W() : null;
        if (W2 == null) {
            return io.reactivex.rxjava3.core.a.k(new IllegalStateException("Controller for clip not found"));
        }
        SdkVideoFile k2 = W2.k();
        SdkClipVideoFile sdkClipVideoFile4 = k2 instanceof SdkClipVideoFile ? (SdkClipVideoFile) k2 : null;
        if (sdkClipVideoFile4 == null) {
            return io.reactivex.rxjava3.core.a.k(new IllegalStateException("Video from controller is not clip"));
        }
        dz2 x = yfb.x(lgj0.a.m(sdkClipVideoFile4.o0(), sdkClipVideoFile4.I0(), (28 & 32) == 0 ? sdkClipVideoFile4.r() : null));
        ahn.D(x);
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.D0(x), new is1(new ewc(sdkClipVideoFile4, W2, this, pdVar, 0), 11)));
    }

    public final void j(String str) {
        Iterator<FeedItem> it = this.d.getCurrentItems().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            FeedItem next = it.next();
            if (((next instanceof FeedItem.d) || (next instanceof FeedItem.m) || (next instanceof FeedItem.j)) ? epx.f(next.F(), str) : false) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (!(i >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.c.ye(valueOf.intValue());
        }
    }

    public final ikv0 k(izs<? super HideReason, s3q0> izsVar, izs<? super ikv0, s3q0> izsVar2) {
        Context context = this.f;
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(context.getString(R.string.clip_dislike_message), (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.video_hide_cancel), izsVar2);
        aVar.h = izsVar;
        aVar.o = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height) + l);
        aVar.e = 3000L;
        aVar.i = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        aVar.c = 0.25f;
        aVar.d = true;
        return aVar.p(this.a);
    }
}
