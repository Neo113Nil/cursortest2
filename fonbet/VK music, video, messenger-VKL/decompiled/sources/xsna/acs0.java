package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Attachment;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.libvideo.miniplayer.dialog.VideoMinimizableDialogHeaderViewHolder;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.sharing.api.dto.Target;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import org.chromium.base.version_info.VersionConstants;
import xsna.b25;
import xsna.bja0;
import xsna.dcs0;
import xsna.ify;
import xsna.k420;
import xsna.rdg;

/* compiled from: VideoCommentsInPlayerListViewDelegate.kt */
/* loaded from: classes4.dex */
public final class acs0 {
    public final FragmentImpl a;
    public final mdg b;
    public final int c;
    public g420 d;
    public final Object e;
    public sbs0 f;
    public PopupStickerView g;
    public final Handler h;
    public final yif0 i;
    public io.reactivex.rxjava3.disposables.b j;
    public final a k;
    public final Object l;
    public final zbs0 m;
    public u3g0 n;
    public final vdg o;
    public c p;

    /* compiled from: VideoCommentsInPlayerListViewDelegate.kt */
    public final class a implements bd70<Photo> {
        public a() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Photo photo) {
            Photo photo2 = photo;
            mdg mdgVar = acs0.this.b;
            if (i == 130) {
                mdgVar.Y7(photo2);
            } else {
                if (i != 131) {
                    return;
                }
                mdgVar.a8(photo2);
            }
        }
    }

    /* compiled from: VideoCommentsInPlayerListViewDelegate.kt */
    public final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                acs0.this.t();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            hl60 hl60Var = hl60.a;
            hl60.c(i2);
        }
    }

    /* compiled from: VideoCommentsInPlayerListViewDelegate.kt */
    public static final class c {
        public final View a;
        public final FrameLayout b;
        public final RecyclerPaginatedView c;
        public final VideoMinimizableDialogHeaderViewHolder d;
        public final CoordinatorLayout e;
        public final FrameLayout f;

        public c(View view) {
            this.a = view;
            this.b = (FrameLayout) view.findViewById(R.id.replyBarContainer);
            this.c = (RecyclerPaginatedView) view.findViewById(R.id.videoCommentPaginatedView);
            this.d = new VideoMinimizableDialogHeaderViewHolder((ViewGroup) view.findViewById(fxc0.B().J().h1() ? R.id.videoDialogHeaderRootV2 : R.id.videoDialogHeaderRoot));
            this.e = (CoordinatorLayout) view.findViewById(R.id.suggestionsCoordinatorContainer);
            this.f = (FrameLayout) view.findViewById(R.id.suggestionsContainer);
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [xsna.zbs0] */
    public acs0(FragmentImpl fragmentImpl, mdg mdgVar) {
        this.a = fragmentImpl;
        this.b = mdgVar;
        dhr0.a.getClass();
        this.c = dhr0.u().c;
        vqe0 vqe0Var = new vqe0(10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, vqe0Var);
        this.h = new Handler(Looper.getMainLooper());
        this.i = new yif0();
        this.k = new a();
        this.l = msy.a(lazyThreadSafetyMode, new nm60(this, 29));
        this.m = new b25.a() { // from class: xsna.zbs0
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                acs0 acs0Var = acs0.this;
                com.vk.lists.c cVar = acs0Var.b.P;
                if (cVar != null) {
                    cVar.p(false);
                }
                u3g0 u3g0Var = acs0Var.n;
                if (u3g0Var != null) {
                    u3g0Var.setActive(tbu0Var.b());
                }
            }
        };
        this.o = new vdg(mdgVar, mdgVar.K, new g3f0((z2f0) null, 3), new m3a(3));
    }

    public final boolean a() {
        if (this.a.getActivity() == null) {
            return true;
        }
        o25.a().getClass();
        return true;
    }

    public final void b() {
        c cVar;
        FrameLayout frameLayout;
        PopupStickerView popupStickerView = this.g;
        if (popupStickerView == null || popupStickerView.getParent() == null || (cVar = this.p) == null || (frameLayout = cVar.f) == null) {
            return;
        }
        frameLayout.removeView(this.g);
    }

    public final void c(NewsComment newsComment) {
        List<cbg> y0;
        int i = -1;
        vdg vdgVar = this.o;
        if (vdgVar != null && (y0 = vdgVar.y0()) != null) {
            Iterator it = ((ArrayList) y0).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (epx.f(((cbg) it.next()).a, newsComment)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i >= 0) {
            final prz przVar = new prz(this, i, 3);
            int i3 = ify.a;
            if (ify.e(ify.c)) {
                przVar.invoke();
                return;
            }
            final dcs0 dcs0Var = new dcs0(przVar);
            ify.a(dcs0Var);
            u3g0 u3g0Var = this.n;
            if (u3g0Var != null) {
                final Handler handler = this.h;
                c3g0.gg(u3g0Var, new ResultReceiver(handler) { // from class: com.vk.newsfeed.impl.fragments.video.VideoCommentsInPlayerListViewDelegate$onKeyboardOpened$1
                    @Override // android.os.ResultReceiver
                    public final void onReceiveResult(int i4, Bundle bundle) {
                        if (i4 == 1 || i4 == 3) {
                            int i5 = ify.a;
                            ify.g(dcs0.this);
                            przVar.invoke();
                        }
                    }
                }, 2);
            }
        }
    }

    public final void d() {
        u3g0 u3g0Var = this.n;
        if (u3g0Var != null) {
            u3g0Var.j(false);
        }
        u3g0 u3g0Var2 = this.n;
        if (u3g0Var2 != null) {
            u3g0Var2.Ic(false);
        }
        mhy.b(this.a.mo2getContext());
        u3g0 u3g0Var3 = this.n;
        if (u3g0Var3 != null) {
            u3g0Var3.clearFocus();
        }
    }

    public final void e(int i, int i2, Intent intent) {
        Target target;
        Post post;
        Integer num;
        if (i > 10000) {
            u3g0 u3g0Var = this.n;
            if (u3g0Var != null) {
                u3g0Var.n(i, i2, intent);
            }
            c cVar = this.p;
            if (cVar != null) {
                cVar.a.postDelayed(new o63(this, 13), 500L);
            }
        }
        mdg mdgVar = this.b;
        if (i == 4329 && i2 == -1) {
            if (intent == null || (post = (Post) intent.getParcelableExtra("comment")) == null || (num = post.u) == null) {
                return;
            } else {
                mdgVar.s8(post.s, post.z, num.intValue());
            }
        }
        if (i != 4331 || i2 != -1 || intent == null || (target = (Target) intent.getParcelableExtra("result_target")) == null) {
            return;
        }
        mdgVar.b8(target);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        boolean z;
        boolean z2;
        u3g0 u3g0Var;
        u3g0 u3g0Var2;
        m3g0 m3g0Var;
        g420 g420Var = this.d;
        boolean z3 = false;
        if ((g420Var != null ? g420Var.e() : null) instanceof k420.a) {
            z = false;
        } else {
            g420 g420Var2 = this.d;
            if (g420Var2 != null) {
                g420Var2.hide();
            }
            z = true;
        }
        u3g0 u3g0Var3 = this.n;
        if (u3g0Var3 != null) {
            WriteBar writeBar = u3g0Var3.e;
            if (writeBar != null ? writeBar.E.a().c() : false) {
                z2 = true;
                if (z2) {
                    u3g0 u3g0Var4 = this.n;
                    if (u3g0Var4 != null) {
                        u3g0Var4.j(true);
                    }
                    z = true;
                }
                u3g0Var = this.n;
                if (u3g0Var == null && u3g0Var.m()) {
                    u3g0 u3g0Var5 = this.n;
                    if (u3g0Var5 != null) {
                        u3g0Var5.Ic(true);
                    }
                    z = true;
                }
                u3g0Var2 = this.n;
                if (u3g0Var2 != null && (m3g0Var = u3g0Var2.c) != null) {
                    z3 = m3g0Var.e0();
                }
                if (z3) {
                    return z;
                }
                u3g0 u3g0Var6 = this.n;
                if (u3g0Var6 != null) {
                    u3g0Var6.r();
                }
                return true;
            }
        }
        z2 = false;
        if (z2) {
        }
        u3g0Var = this.n;
        if (u3g0Var == null && u3g0Var.m()) {
        }
        u3g0Var2 = this.n;
        if (u3g0Var2 != null) {
            z3 = m3g0Var.e0();
        }
        if (z3) {
        }
    }

    public final void g() {
        Bundle arguments = this.a.getArguments();
        if (arguments != null) {
            this.o.j = arguments.getString("referrer", "");
        }
        this.j = new io.reactivex.rxjava3.disposables.b();
        ce60.b.getClass();
        p870.f().b(130, this.k);
        p870 f = p870.f();
        mdg mdgVar = this.b;
        f.b(116, mdgVar);
        p870.f().b(VersionConstants.PRODUCT_MAJOR_VERSION, mdgVar);
        p870.f().b(147, mdgVar);
        p870.f().b(9, mdgVar);
    }

    public final void h() {
        ce60.b.getClass();
        p870 f = p870.f();
        mdg mdgVar = this.b;
        f.g(mdgVar);
        p870.f().g(this.k);
        io.reactivex.rxjava3.disposables.b bVar = this.j;
        if (bVar != null) {
            bVar.dispose();
        }
        b();
        this.j = null;
        mdgVar.onDestroy();
    }

    public final void i() {
        hl60 hl60Var = hl60.a;
        hl60.b();
        this.p = null;
        this.i.c.clear();
        u3g0 u3g0Var = this.n;
        if (u3g0Var != null) {
            u3g0Var.j(false);
        }
        u3g0 u3g0Var2 = this.n;
        if (u3g0Var2 != null) {
            u3g0Var2.Ic(false);
        }
        u3g0 u3g0Var3 = this.n;
        if (u3g0Var3 != null) {
            u3g0Var3.onDestroyView();
        }
        this.n = null;
        g420 g420Var = this.d;
        if (g420Var != null) {
            g420Var.onDestroyView();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(View view, Bundle bundle) {
        u3g0 u3g0Var;
        Parcelable parcelable;
        String Ab;
        Object parcelable2;
        c cVar = new c(view);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        RecyclerPaginatedView recyclerPaginatedView = cVar.c;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        recyclerView.setTag("nested_scroll_source");
        recyclerView.setItemAnimator(null);
        gd60 a2 = hd60.a();
        mdg mdgVar = this.b;
        g420 D0 = a2.D0(mdgVar);
        D0.f();
        CoordinatorLayout coordinatorLayout = cVar.e;
        coordinatorLayout.addView(D0.d(coordinatorLayout, null));
        this.d = D0;
        VideoMinimizableDialogHeaderViewHolder videoMinimizableDialogHeaderViewHolder = cVar.d;
        bwt0.i0(videoMinimizableDialogHeaderViewHolder.a, new u2k0(this, 19));
        FragmentImpl fragmentImpl = this.a;
        VideoMinimizableDialogHeaderViewHolder.IconMode jh = ((com.vk.libvideo.miniplayer.dialog.a) fragmentImpl).jh(fragmentImpl);
        Context mo2getContext = fragmentImpl.mo2getContext();
        videoMinimizableDialogHeaderViewHolder.a(jh, "", mo2getContext != null ? iah0.s(mo2getContext) : false, new wrl0(this, 15));
        dhr0.a.getClass();
        u3g0 u3g0Var2 = new u3g0(Integer.valueOf(dhr0.u().c));
        u3g0Var2.d = new pvh0(this, 16);
        m3g0 m3g0Var = new m3g0(mdgVar, u3g0Var2, this.d);
        mdgVar.S = m3g0Var;
        u3g0Var2.c = m3g0Var;
        Bundle bundle2 = bundle != null ? bundle.getBundle("STATE_REPLY_BAR_VIEW") : null;
        FrameLayout frameLayout = cVar.b;
        u3g0Var2.p(frameLayout, bundle2, null);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NO_VIDEO_COMMENT_ATTACH;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            WriteBar writeBar = u3g0Var2.e;
            if (writeBar != null) {
                writeBar.setAttachLimits(0);
            }
            WriteBar writeBar2 = u3g0Var2.e;
            if (writeBar2 != null) {
                writeBar2.setAttachLimitToastEnabled(false);
            }
        }
        ColorDrawable colorDrawable = new ColorDrawable(e3m.f(R.attr.vk_ui_background_tertiary, dhr0.s()));
        WriteBar writeBar3 = u3g0Var2.e;
        if (writeBar3 != null) {
            writeBar3.setBackground(colorDrawable);
        }
        int ceil = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 52);
        EditText editText = u3g0Var2.f;
        if (editText != null) {
            editText.setMinHeight(ceil);
        }
        EditText editText2 = u3g0Var2.f;
        if (editText2 != null) {
            editText2.setTextAppearance(R.style.VkUiTypography_Headline1Normal);
        }
        int f = e3m.f(R.attr.vk_ui_text_primary, dhr0.s());
        EditText editText3 = u3g0Var2.f;
        if (editText3 != null) {
            editText3.setTextColor(f);
        }
        int f2 = e3m.f(R.attr.vk_ui_text_subhead, dhr0.s());
        EditText editText4 = u3g0Var2.f;
        if (editText4 != null) {
            editText4.setHintTextColor(f2);
        }
        float f3 = 12;
        int a3 = iah0.a(f3);
        EditText editText5 = u3g0Var2.f;
        if (editText5 != null) {
            f4m.x(a3, editText5);
        }
        if (fxc0.B().J().h0()) {
            Context context = frameLayout.getContext();
            Bundle arguments = fragmentImpl.getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("entry", Videos.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = arguments.getParcelable("entry");
                    parcelable = (Videos) (parcelable3 instanceof Videos ? parcelable3 : null);
                }
                Videos videos = (Videos) parcelable;
                if (videos != null && (Ab = videos.Ab()) != null) {
                    qe20 qe20Var = new qe20(this, u3g0Var2, context, Ab);
                    WriteBar writeBar4 = u3g0Var2.e;
                    if (writeBar4 != null) {
                        writeBar4.T(false, qe20Var);
                    }
                    ((VideoChannelComponent) this.l.getValue()).p8();
                }
            }
        } else {
            int ceil2 = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 28);
            ImageView imageView = u3g0Var2.g;
            if (imageView != null) {
                bwt0.c0(ceil2, imageView);
            }
            ImageView imageView2 = u3g0Var2.g;
            if (imageView2 != null) {
                bwt0.r0(ceil2, imageView2);
            }
            ImageView imageView3 = u3g0Var2.g;
            if (imageView3 != null) {
                imageView3.setPadding(0, 0, 0, 0);
            }
            int a4 = iah0.a(16);
            int a5 = iah0.a(f3);
            int a6 = iah0.a(4);
            int a7 = iah0.a(f3);
            ImageView imageView4 = u3g0Var2.g;
            if (imageView4 != null) {
                bwt0.e0(imageView4, a4, a5, a6, a7);
            }
            u3g0Var2.C(e3m.f(R.attr.vk_ui_icon_secondary, dhr0.s()));
        }
        WriteBar writeBar5 = u3g0Var2.e;
        if (writeBar5 != null) {
            writeBar5.setWriteBarDividerVisible(true);
        }
        Context s = dhr0.s();
        int i = R.attr.vk_ui_separator_primary;
        int f4 = e3m.f(R.attr.vk_ui_separator_primary, s);
        WriteBar writeBar6 = u3g0Var2.e;
        if (writeBar6 != null) {
            writeBar6.setWriteBarDividerColor(f4);
        }
        WriteBar writeBar7 = u3g0Var2.e;
        if (writeBar7 != null) {
            writeBar7.setWriteBarDividerMarginHorizontal(0);
        }
        if (t11.d()) {
            i = R.attr.vk_ui_background_tertiary;
        }
        ColorDrawable colorDrawable2 = new ColorDrawable(e3m.f(i, dhr0.s()));
        WriteBar writeBar8 = u3g0Var2.e;
        if (writeBar8 != null) {
            writeBar8.setBackground(colorDrawable2);
        }
        xgy xgyVar = u3g0Var2.k;
        if (xgyVar != null) {
            xgyVar.j = true;
        }
        u3g0Var2.E(new og8(u3g0Var2, 9));
        u3g0Var2.v();
        WriteBar writeBar9 = u3g0Var2.e;
        if (writeBar9 != null) {
            writeBar9.setUseLongtapStickerScreenSize(true);
        }
        WriteBar writeBar10 = u3g0Var2.e;
        if (writeBar10 != null) {
            writeBar10.setLongtapStickerPopupGravity(85);
        }
        WriteBar writeBar11 = u3g0Var2.e;
        if (writeBar11 != null) {
            writeBar11.setDisallowParentInterceptTouchEvent(true);
        }
        u3g0Var2.setActive(o25.a().b());
        mdgVar.o8();
        mdgVar.p8(R.attr.vk_ui_text_accent);
        mdgVar.m8(e3m.f(R.attr.vk_ui_text_secondary, dhr0.s()));
        mdgVar.l8(e3m.f(R.attr.vk_ui_background_tertiary, dhr0.s()));
        u3g0Var2.u(cVar.f);
        this.n = u3g0Var2;
        if (t11.d() && (u3g0Var = this.n) != null) {
            View view2 = u3g0Var.i;
            f4m.s(iah0.a(12), view2);
            this.f = new sbs0(view2, new plq0(1, u3g0Var, view2));
        }
        this.p = cVar;
        RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new b());
            recyclerView2.addOnScrollListener(new bcs0(this));
        }
        this.i.c.add(new ccs0());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean k(rdg rdgVar) {
        boolean z = rdgVar instanceof rdg.d;
        ?? r1 = this.e;
        if (z) {
            View findViewById = ((rdg.d) rdgVar).a.itemView.findViewById(R.id.comment_author_liked_photo);
            if (findViewById == null) {
                return false;
            }
            jgg.d((jgg) r1.getValue(), findViewById, HintId.FEED_AUTHOR_LIKE_ONBOARDING.getId());
            return true;
        }
        if (rdgVar instanceof rdg.e) {
            jgg.b((jgg) r1.getValue(), ((rdg.e) rdgVar).a, HintId.FEED_AUTHOR_LIKED.getId());
            return true;
        }
        if (rdgVar instanceof rdg.f) {
            jgg.b((jgg) r1.getValue(), ((rdg.f) rdgVar).a, HintId.FEED_GROUP_LIKED.getId());
            return true;
        }
        if (!(rdgVar instanceof rdg.c)) {
            return false;
        }
        t();
        return true;
    }

    public final void l(boolean z) {
        WriteBar writeBar;
        u3g0 u3g0Var = this.n;
        if (u3g0Var != null) {
            u3g0Var.b();
            if (fxc0.B().J().h0() && (writeBar = u3g0Var.e) != null) {
                writeBar.c0();
            }
            WriteBar writeBar2 = u3g0Var.e;
            if (writeBar2 != null) {
                writeBar2.setStickersSuggestEnabled(true);
            }
            WriteBar writeBar3 = u3g0Var.e;
            if (writeBar3 != null) {
                writeBar3.setEmojiAllowed(true);
            }
            View view = u3g0Var.i;
            if (view != null) {
                u3g0.B(view, true);
            }
            if (z) {
                mhy.d(u3g0Var.e);
                u3g0Var.clearFocus();
            }
        }
    }

    public final void m(int i, int i2) {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        c cVar = this.p;
        Object layoutManager = (cVar == null || (recyclerPaginatedView = cVar.c) == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.K(i, i2);
    }

    public final void n() {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        c cVar = this.p;
        m(Math.max(0, ((cVar == null || (recyclerPaginatedView = cVar.c) == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount()) - 1), 0);
    }

    public final void o(int i) {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        c cVar = this.p;
        m(i, i < ((cVar == null || (recyclerPaginatedView = cVar.c) == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount()) + (-1) ? iah0.a(48.0f) : 0);
    }

    public final void p(int i) {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        c cVar = this.p;
        m(i, i < ((cVar == null || (recyclerPaginatedView = cVar.c) == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount()) + (-1) ? iah0.a(48.0f) : 0);
    }

    public final void q(String str, List<? extends Attachment> list) {
        WriteBar writeBar;
        u3g0 u3g0Var = this.n;
        if (u3g0Var != null) {
            u3g0Var.b();
            WriteBar writeBar2 = u3g0Var.e;
            if (writeBar2 != null) {
                writeBar2.setStickersSuggestEnabled(false);
            }
            WriteBar writeBar3 = u3g0Var.e;
            if (writeBar3 != null) {
                writeBar3.setEmojiAllowed(false);
            }
            View view = u3g0Var.i;
            if (view != null) {
                u3g0.B(view, false);
            }
            if (fxc0.B().J().h0() && (writeBar = u3g0Var.e) != null) {
                writeBar.Q();
            }
            u3g0Var.d(str, list);
            c3g0.gg(u3g0Var, null, 1);
        }
    }

    public final void r(NewsComment newsComment, aa aaVar) {
        l7s l7sVar;
        if (newsComment.u) {
            return;
        }
        View view = aaVar.itemView;
        Context context = view != null ? view.getContext() : null;
        l7s l7sVar2 = context instanceof l7s ? (l7s) context : null;
        if (l7sVar2 == null) {
            Context mo2getContext = this.a.mo2getContext();
            l7sVar = mo2getContext != null ? new l7s(mo2getContext, this.c) : null;
        } else {
            l7sVar = l7sVar2;
        }
        if (l7sVar != null) {
            wx20 a2 = this.b.Ra(newsComment, new udg(false)).a(new fx(this, newsComment, aaVar, 6));
            if (a2 != null) {
                wx20.c(a2, l7sVar, "post_view", 0, this.c, 12);
            }
        }
    }

    public final void s(bja0.a aVar) {
        qg1 qg1Var = new qg1(23, aVar, this);
        int i = ify.a;
        if (!ify.e(ify.c)) {
            qg1Var.invoke();
        } else {
            mhy.b(this.a.getActivity());
            qro0.e(300L, qg1Var);
        }
    }

    public final void t() {
        io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new dil(this, 3));
        asu0.a.getClass();
        io.reactivex.rxjava3.disposables.c l = itg0.l(mVar.q(asu0.m()));
        io.reactivex.rxjava3.disposables.b bVar = this.j;
        if (bVar != null) {
            bVar.b(l);
        }
    }

    public final void u(PopupStickerAnimation popupStickerAnimation, o4l0 o4l0Var) {
        FrameLayout frameLayout;
        b();
        Context mo2getContext = this.a.mo2getContext();
        PopupStickerView popupStickerView = null;
        if (mo2getContext != null) {
            PopupStickerView popupStickerView2 = new PopupStickerView(mo2getContext, null, 0, 14, 0);
            popupStickerView2.setLoadingCallback(o4l0Var);
            PopupStickerView.d(popupStickerView2, popupStickerAnimation, false, null, 12);
            c cVar = this.p;
            if (cVar != null && (frameLayout = cVar.f) != null) {
                frameLayout.addView(popupStickerView2, new FrameLayout.LayoutParams(-1, -1));
            }
            popupStickerView = popupStickerView2;
        }
        this.g = popupStickerView;
    }
}
