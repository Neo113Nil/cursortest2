package xsna;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.onboarding.Onboarding;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.e3m;

/* compiled from: VideoPlaylistFollowMediator.kt */
/* loaded from: classes16.dex */
public final class u4t0 implements w8i {
    public TextView b;
    public VkSimpleButton c;
    public ImageView d;
    public a e;
    public final ArrayList f = new ArrayList();
    public final Object g;
    public final Object h;
    public boolean i;
    public io.reactivex.rxjava3.disposables.c j;
    public String k;

    /* compiled from: VideoPlaylistFollowMediator.kt */
    public static abstract class a {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        public abstract void a(int i, VkButton.Mode mode);
    }

    public u4t0() {
        jds0 jds0Var = new jds0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, jds0Var);
        this.h = msy.a(lazyThreadSafetyMode, new e1s0(this, 5));
        this.i = true;
        this.j = EmptyDisposable.INSTANCE;
        this.k = "";
    }

    public final void a() {
        this.j.dispose();
        this.f.clear();
        this.e = null;
        this.c = null;
        this.b = null;
        this.d = null;
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(Context context, VideoAlbum videoAlbum) {
        boolean z = videoAlbum.l;
        videoAlbum.l = !z;
        wjs0.a(new jwr0(videoAlbum, !z ? "albums_subscribe" : "albums_unsubscribe"));
        if (videoAlbum.l) {
            be80 be80Var = (be80) this.g.getValue();
            Onboarding onboarding = Onboarding.TwoStep;
            be80Var.getClass();
        }
        f(videoAlbum.l);
        g(videoAlbum.l);
        boolean z2 = videoAlbum.l;
        Pair pair = new Pair(Integer.valueOf(z2 ? R.string.video_catalog_subscribed : R.string.video_catalog_subscribe), z2 ? VkButton.Mode.Secondary : VkButton.Mode.Primary);
        int intValue = ((Number) pair.d()).intValue();
        VkButton.Mode mode = (VkButton.Mode) pair.g();
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(intValue, mode);
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(Boolean.valueOf(videoAlbum.l));
        }
    }

    public final void c(VideoAlbum videoAlbum) {
        Context context;
        if (this.j.h()) {
            TextView textView = this.b;
            if (textView == null || (context = textView.getContext()) == null) {
                VkSimpleButton vkSimpleButton = this.c;
                context = vkSimpleButton != null ? vkSimpleButton.getContext() : null;
                if (context == null) {
                    a aVar = this.e;
                    context = aVar != null ? aVar.a : null;
                    if (context == null) {
                        return;
                    }
                }
            }
            e(context, videoAlbum);
        }
    }

    public final void d(boolean z) {
        this.i = z;
        VkSimpleButton vkSimpleButton = this.c;
        ImageView imageView = this.d;
        if (vkSimpleButton == null || imageView == null) {
            return;
        }
        vkSimpleButton.setVisibility(z ? 0 : 8);
        imageView.setVisibility(z && iah0.r(vkSimpleButton.getContext()) ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(Context context, VideoAlbum videoAlbum) {
        Activity h = e3m.h(context);
        if (h != null) {
            context = h;
        }
        ((b25) this.h.getValue()).getClass();
        int i = 6;
        if (videoAlbum.l) {
            vra.a(context, videoAlbum, this.k, new ywc(this, context, videoAlbum, i));
            return;
        }
        UserId userId = videoAlbum.c;
        int i2 = videoAlbum.b;
        UiTracker uiTracker = UiTracker.a;
        int i3 = 7;
        this.j = new io.reactivex.rxjava3.internal.operators.observable.l0(rsg0.y0(new a0u(userId, i2, UiTracker.d(), this.k, true, 32), null, null, 3), new e05(new he3(4, context, videoAlbum), i3)).subscribe(new tra(new vx(this, context, videoAlbum, i3), 0), new da(new g74(new pl2(i3), 1), i));
    }

    public final void f(boolean z) {
        int color;
        VkSimpleButton vkSimpleButton = this.c;
        if (vkSimpleButton != null) {
            int i = z ? R.drawable.vk_icon_check_square_outline_24 : R.drawable.vk_icon_add_square_outline_24;
            int i2 = z ? R.string.video_catalog_subscribed : R.string.video_catalog_subscribe;
            vkSimpleButton.setBackgroundColor(z ? vkSimpleButton.getContext().getColor(R.color.vk_white_alpha40) : vkSimpleButton.getContext().getColor(R.color.vk_white));
            if (z) {
                Context context = vkSimpleButton.getContext();
                e3m.a aVar = e3m.a;
                color = context.getColor(R.color.vk_white);
            } else {
                Context context2 = vkSimpleButton.getContext();
                e3m.a aVar2 = e3m.a;
                color = context2.getColor(R.color.vk_gray_800);
            }
            vkSimpleButton.setTextColor(color);
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setImageResource(i);
            }
            vkSimpleButton.setText(i2);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void g(boolean z) {
        TextView textView = this.b;
        if (textView != null) {
            int i = z ? R.string.video_catalog_subscribed : R.string.video_catalog_subscribe;
            int i2 = z ? R.drawable.vkui_bg_button_secondary : R.drawable.vkui_bg_button_primary;
            textView.setTextColor(dhr0.t.c(z ? R.attr.vk_ui_text_accent_themed : R.attr.vk_ui_text_contrast_themed));
            Context context = textView.getContext();
            e3m.a aVar = e3m.a;
            textView.setBackground(m33.a(i2, context));
            textView.setText(i);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
