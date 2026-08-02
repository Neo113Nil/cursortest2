package xsna;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stories.model.GifItem;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.gif.di.GifSelectorComponent;
import com.vk.log.L;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
import xsna.d4l0;
import xsna.dw20;
import xsna.fov;

/* compiled from: StickerEditorViewListener.java */
/* loaded from: classes6.dex */
public final class d4l0 implements fov.a, w8i {
    public final u86 c;
    public final u76 d;
    public final b96 e;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final psj0 f = ((StoryEditorExtDepsComponent) j6i.b(m7m.f(this), StoryEditorExtDepsComponent.class)).R();

    /* compiled from: StickerEditorViewListener.java */
    public final class a implements Runnable {
        public final AtomicReference<Dialog> b = new AtomicReference<>();

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.vk.core.view.components.spinner.c e = qv20.e(d4l0.this.c.getRequireContext(), Integer.valueOf(R.string.picker_loading));
            AtomicReference<Dialog> atomicReference = this.b;
            atomicReference.set(e);
            atomicReference.get().show();
        }
    }

    /* compiled from: StickerEditorViewListener.java */
    public static class c {
        public final String a;
        public final WebStickerType b;
        public final String c;

        public c(String str, WebStickerType webStickerType, String str2) {
            this.a = str;
            this.b = webStickerType;
            this.c = str2;
        }
    }

    public d4l0(@NonNull u86 u86Var, @NonNull u76 u76Var, @NonNull b96 b96Var) {
        this.c = u86Var;
        this.d = u76Var;
        this.e = b96Var;
    }

    @Override // xsna.fov.a
    public final void a() {
        p5m0 storyLinkDelegate = this.c.getStoryLinkDelegate();
        u76 u76Var = this.d;
        if (storyLinkDelegate != null) {
            u76Var.f7();
            l7s u = bwt0.u(storyLinkDelegate.a);
            m5m0 m5m0Var = new m5m0(u, storyLinkDelegate.d, new c7l0(storyLinkDelegate.b.b7()));
            View inflate = LayoutInflater.from(u).inflate(R.layout.story_link_create_view_confirm, (ViewGroup) null, false);
            storyLinkDelegate.e = new dw20.b(u, null).D0(m5m0Var, false).l(dhr0.Y(R.attr.vk_ui_background_content, u)).c(new cpo(true, 0, 6)).F0(true).x(0).u(0).z(inflate).e0(new bu00()).n(new n5m0(m5m0Var)).Y(new nl(storyLinkDelegate, false)).I0(null);
            m5m0Var.setOnCloseBtnClickListener(new hk70(storyLinkDelegate, 25));
            m5m0Var.setOnResultListener(new o5m0(1, storyLinkDelegate, p5m0.class, "onLinkCreationResult", "onLinkCreationResult(Lcom/vk/stories/design/view/editor/StoryLinkCreateView$Result;)V", 0));
            bwt0.i0(inflate.findViewById(R.id.confirm), new e9i0(m5m0Var, 9));
        }
        u76Var.o5().j();
    }

    @Override // xsna.fov.a
    public final void b() {
        Window window;
        View decorView;
        p6m0 mentionDelegate = this.c.getMentionDelegate();
        if (mentionDelegate != null) {
            u76 u76Var = this.d;
            u76Var.f7();
            u76Var.o5().j();
            b96 b96Var = mentionDelegate.b;
            u76 u76Var2 = mentionDelegate.c;
            if (mentionDelegate.e != null) {
                return;
            }
            b96Var.d();
            b96.c(b96Var);
            q6m0 b2 = mentionDelegate.d.b(mentionDelegate.a.getContext(), new fy2(mentionDelegate), u76Var2.getTarget(), new p490(), null, u76Var2.t0(), new c7l0(u76Var2.b7()));
            mentionDelegate.e = b2;
            b2.setOnDismissListener(new o6m0(mentionDelegate, 0));
            Dialog dialog = mentionDelegate.e;
            if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setPadding(decorView.getPaddingLeft(), (int) u76Var2.getCadreSize().c, decorView.getPaddingRight(), decorView.getPaddingBottom());
            }
            Dialog dialog2 = mentionDelegate.e;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    @Override // xsna.fov.a
    public final void c() {
        xjm0 timeStickerDelegate = this.c.getTimeStickerDelegate();
        u76 u76Var = this.d;
        if (timeStickerDelegate != null) {
            u76Var.f7();
            yjm0 yjm0Var = new yjm0(new nvo0(u76Var.O2().c, u76Var.z4()));
            float f = f2l0.a;
            timeStickerDelegate.a.g(yjm0Var, new mgi(2));
            timeStickerDelegate.b.f();
        }
        u76Var.o5().j();
    }

    @Override // xsna.fov.a
    public final void close() {
        b96 b96Var = this.e;
        b96Var.d();
        b96Var.f();
        this.d.f7();
    }

    @Override // xsna.fov.a
    public final void d(@NonNull VmojiAvatar vmojiAvatar) {
        b6m.e().c(this.c.getRequireContext(), vmojiAvatar);
    }

    @Override // xsna.fov.a
    public final void e() {
        u86 u86Var = this.c;
        kh6 musicDelegate = u86Var.getMusicDelegate();
        if (musicDelegate != null) {
            u76 u76Var = this.d;
            u76Var.f7();
            u76Var.o5().j();
            musicDelegate.k(u86Var.getStickersState().i());
        }
    }

    @Override // xsna.fov.a
    public final void f() {
        c4m0 geoStickerDelegate = this.c.getGeoStickerDelegate();
        u76 u76Var = this.d;
        if (geoStickerDelegate != null) {
            Location l3 = u76Var.l3();
            l7s u = bwt0.u(geoStickerDelegate.b);
            t3m0 t3m0Var = new t3m0(u, l3);
            t3m0Var.setCallback(geoStickerDelegate);
            j1k0 j1k0Var = new j1k0(2, t3m0Var, geoStickerDelegate);
            geoStickerDelegate.f = j1k0Var;
            j1k0Var.invoke();
            dw20 I0 = new dw20.b(u, null).u0(R.style.StoryViewActivityThemeDark).v0(R.string.story_geo_sticker_title).n(new a4m0(t3m0Var)).Y(new com.vk.movika.sdk.base.data.converter.c(geoStickerDelegate)).Z(new fpd(t3m0Var, 1)).D0(t3m0Var, false).c(new ts90(0.85f, 2)).R0(false).I0(null);
            geoStickerDelegate.i = I0;
            Lifecycle lifecycle = I0.getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new b4m0(geoStickerDelegate));
            }
            this.b.postDelayed(new gv2(u76Var, 12), 400L);
        }
        u76Var.o5().j();
    }

    @Override // xsna.fov.a
    public final void g() {
        this.d.o5().g();
    }

    @Override // xsna.fov.a
    public final void h() {
        z5m0 marketItemStickerDelegate = this.c.getMarketItemStickerDelegate();
        if (marketItemStickerDelegate != null) {
            u76 u76Var = this.d;
            u76Var.f7();
            u76Var.o5().j();
            marketItemStickerDelegate.a(null);
        }
    }

    @Override // xsna.fov.a
    public final void i() {
        o8m0 pollStickerDelegate = this.c.getPollStickerDelegate();
        if (pollStickerDelegate != null) {
            u76 u76Var = this.d;
            u76Var.f7();
            u76Var.o5().j();
            pollStickerDelegate.a(null);
        }
    }

    @Override // xsna.fov.a
    public final void j() {
        x0m0 questionDelegate = this.c.getQuestionDelegate();
        if (questionDelegate != null) {
            ((StoryEditorExtDepsComponent) j6i.b(m7m.f(this), StoryEditorExtDepsComponent.class)).r8().c();
            u76 u76Var = this.d;
            u76Var.f7();
            u76Var.o5().j();
            questionDelegate.h(null);
        }
    }

    @Override // xsna.fov.a
    public final void k() {
        Window window;
        View decorView;
        m4m0 hashtagDelegate = this.c.getHashtagDelegate();
        if (hashtagDelegate != null) {
            u76 u76Var = this.d;
            u76Var.f7();
            u76Var.o5().j();
            b96 b96Var = hashtagDelegate.b;
            u76 u76Var2 = hashtagDelegate.c;
            if (hashtagDelegate.e != null) {
                L.l("Can't show hashtagDialog");
                return;
            }
            b96Var.d();
            b96.c(b96Var);
            n4m0 c2 = hashtagDelegate.d.c(hashtagDelegate.a.getContext(), new vm9(hashtagDelegate, 5), u76Var2.getTarget(), new p490(), null, u76Var2.t0(), new c7l0(u76Var2.b7()));
            hashtagDelegate.e = c2;
            c2.setOnDismissListener(new i7v(hashtagDelegate, 1));
            Dialog dialog = hashtagDelegate.e;
            if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setPadding(decorView.getPaddingLeft(), (int) u76Var2.getCadreSize().c, decorView.getPaddingRight(), decorView.getPaddingBottom());
            }
            Dialog dialog2 = hashtagDelegate.e;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    @Override // xsna.fov.a
    public final void l(String str, String str2) {
        r(new c(str, WebStickerType.EMOJI, str2));
    }

    @Override // xsna.fov.a
    public final void m(GifItem gifItem) {
        int i = this.c.getStickersDrawingView().getClickableCounter().j;
        u76 u76Var = this.d;
        z9l0.a(u76Var);
        WebStickerType webStickerType = WebStickerType.GIF;
        int a2 = this.f.a(webStickerType);
        if (i >= a2) {
            cvk.w(y8g0.f(R.string.story_limit_gif_stickers, Integer.toString(a2)), false);
            return;
        }
        io.reactivex.rxjava3.core.a c2 = ((GifSelectorComponent) j6i.b(m7m.f(this), GifSelectorComponent.class)).r9().c(gifItem);
        asu0 asu0Var = asu0.a;
        u76Var.a(c2.q(asu0Var.c()).o(asu0Var.d()).subscribe());
        ImageSize Cb = gifItem.c.Cb(400, true, false);
        String str = Cb != null ? Cb.d.d : null;
        if (str == null) {
            str = "";
        }
        r(new c(str, webStickerType, gifItem.b));
    }

    @Override // xsna.fov.a
    public final void n() {
        b6m.e().b(this.c.getRequireContext(), "keyboard_camera_editor", null);
    }

    @Override // xsna.fov.a
    public final void o() {
        u86 u86Var = this.c;
        vam0 reactionDelegate = u86Var.getReactionDelegate();
        this.d.f7();
        reactionDelegate.h(new abm0(u86Var.getRequireContext()));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fov.a
    public final void p() {
        e8m0 photoStickerDelegate = this.c.getPhotoStickerDelegate();
        this.d.o5().j();
        ((mrj0) photoStickerDelegate.g.getValue()).a(photoStickerDelegate.a, 1993, new q520(21));
        photoStickerDelegate.d.postDelayed(new vb(photoStickerDelegate, 18), 300L);
    }

    @Override // xsna.fov.a
    public final void q(fov.b bVar) {
        int i = bVar.b;
        String str = bVar.f;
        new jea0(i).p();
        String str2 = bVar.d;
        if (TextUtils.isEmpty(str2)) {
            r(new c(bVar.c, WebStickerType.STICKER, str));
        } else {
            r(new c(str2, WebStickerType.LOTTIE, str));
        }
    }

    public final void r(final c cVar) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U;
        final a aVar = new a();
        WebStickerType webStickerType = cVar.b;
        final String str = cVar.a;
        final String str2 = cVar.c;
        WebStickerType webStickerType2 = WebStickerType.EMOJI;
        final boolean z = webStickerType == webStickerType2;
        if (webStickerType == webStickerType2 || webStickerType == WebStickerType.STICKER) {
            U = mcr0.h(Uri.parse(str)).U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.a4l0
                @Override // io.reactivex.rxjava3.functions.l
                public final Object apply(Object obj) {
                    return new d4l0.b((Bitmap) obj, z, str2, str);
                }
            });
        } else {
            int i = 5;
            if (webStickerType == WebStickerType.LOTTIE) {
                if (this.f.b()) {
                    bpn0 bpn0Var = c7r0.a;
                    U = c7r0.i(str).U(new qo9(5, str2, str));
                } else {
                    bpn0 bpn0Var2 = c7r0.a;
                    U = c7r0.g(str, str2, false).U(new ro9(3, str2, str));
                }
            } else if (webStickerType == WebStickerType.GIF) {
                Uri parse = Uri.parse(str);
                Field field = mcr0.a;
                U = new io.reactivex.rxjava3.internal.operators.observable.q(new qcr0(parse)).U(new i4f0(str, i));
            } else {
                b7l.a("Can't loadAndShow sticker type: " + webStickerType);
                U = null;
            }
        }
        this.d.a(U.r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.b4l0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                nov novVar;
                d4l0.b bVar = (d4l0.b) obj;
                d4l0 d4l0Var = d4l0.this;
                u76 u76Var = d4l0Var.d;
                Handler handler = d4l0Var.b;
                d4l0.a aVar2 = aVar;
                handler.removeCallbacks(aVar2);
                qv20.b(aVar2.b.get());
                StickersDrawingViewGroup stickersDrawingView = d4l0Var.c.getStickersDrawingView();
                int min = Math.min(stickersDrawingView.getMeasuredWidth(), stickersDrawingView.getMeasuredHeight());
                WebStickerType webStickerType3 = bVar.a;
                String str3 = bVar.c;
                String str4 = bVar.i;
                boolean z2 = webStickerType3 == WebStickerType.EMOJI;
                String str5 = cVar.c;
                if (z2) {
                    min /= 2;
                }
                if (webStickerType3 == WebStickerType.LOTTIE) {
                    AnimatedStickerInfo animatedStickerInfo = bVar.h;
                    novVar = (!d4l0Var.f.b() || animatedStickerInfo == null) ? new s690(bVar.g, bVar.f, bVar.d, str5, str4 != null ? str4 : "") : new t690(bVar.g, bVar.f, animatedStickerInfo, str5, null);
                } else if (webStickerType3 == WebStickerType.GIF) {
                    if (str4 == null) {
                        str4 = "";
                    }
                    novVar = new g4m0(bVar.e, str5, str4);
                } else {
                    int i2 = bVar.f;
                    if (i2 != 0) {
                        w690 w690Var = new w690(bVar.g, i2, bVar.b, min, str5);
                        w690Var.n = str3;
                        novVar = w690Var;
                    } else {
                        ad7 ad7Var = new ad7(bVar.b, min, webStickerType3, str5);
                        ad7Var.n = str3;
                        novVar = ad7Var;
                    }
                }
                stickersDrawingView.f(novVar);
                u76Var.f7();
                if (z2) {
                    u76Var.o5().d();
                } else {
                    u76Var.o5().e();
                }
            }
        }, new io.reactivex.rxjava3.functions.f() { // from class: xsna.c4l0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                d4l0 d4l0Var = d4l0.this;
                Handler handler = d4l0Var.b;
                d4l0.a aVar2 = aVar;
                handler.removeCallbacks(aVar2);
                qv20.b(aVar2.b.get());
                u76 u76Var = d4l0Var.d;
                u76Var.f7();
                cvk.u(R.string.picker_loading_sticker_error, false);
                if (z) {
                    u76Var.o5().d();
                } else {
                    u76Var.o5().e();
                }
            }
        }));
    }

    /* compiled from: StickerEditorViewListener.java */
    public static class b {
        public final WebStickerType a;
        public final Bitmap b;
        public final String c;
        public final i700 d;
        public final wk2 e;
        public int f;
        public int g;

        @Nullable
        public final AnimatedStickerInfo h;
        public final String i;

        public b(Bitmap bitmap, boolean z, String str, String str2) {
            this.a = z ? WebStickerType.EMOJI : WebStickerType.STICKER;
            this.b = bitmap;
            this.c = str2;
            if (str != null) {
                a(str);
            }
        }

        public final void a(String str) {
            int i;
            String[] split = str.split(BundleUtil.UNDERLINE_TAG);
            if (split.length == 2) {
                int i2 = 0;
                String str2 = split[0];
                bpn0 bpn0Var = cqm0.a;
                try {
                    i = Integer.parseInt(str2);
                } catch (Throwable unused) {
                    i = 0;
                }
                this.f = i;
                try {
                    i2 = Integer.parseInt(split[1]);
                } catch (Throwable unused2) {
                }
                this.g = i2;
            }
        }

        public b(i700 i700Var, String str, String str2) {
            this.a = WebStickerType.LOTTIE;
            this.d = i700Var;
            if (str != null) {
                a(str);
            }
            this.i = str2;
        }

        public b(wk2 wk2Var, String str) {
            this.a = WebStickerType.GIF;
            this.e = wk2Var;
            this.i = str;
        }

        public b(@NonNull AnimatedStickerInfo animatedStickerInfo, String str, String str2) {
            this.a = WebStickerType.LOTTIE;
            this.h = animatedStickerInfo;
            if (str != null) {
                a(str);
            }
            this.i = str2;
        }
    }
}
