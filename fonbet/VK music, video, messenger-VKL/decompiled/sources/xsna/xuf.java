package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.tool.view.viewer.feed.wrapper.fragment.FragmentContainerFrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;

/* compiled from: ClipsWrapperViewsFull.kt */
/* loaded from: classes17.dex */
public final class xuf implements wuf {
    public final VkTopBar a;
    public final ife b;
    public final ViewGroup c;
    public final FragmentContainerFrameLayout d;
    public final View e;
    public final VkText f;
    public final c1u0 g;
    public final View h;
    public final View i;
    public final ClipSeekBarView j;
    public final View k;
    public final VkButton l;
    public final VkButton m;
    public d6e n = null;
    public d6e o = null;
    public final ViewGroup p;
    public final ViewGroup q;

    public xuf(VkTopBar vkTopBar, ife ifeVar, ViewGroup viewGroup, FragmentContainerFrameLayout fragmentContainerFrameLayout, View view, VkText vkText, c1u0 c1u0Var, View view2, View view3, ClipSeekBarView clipSeekBarView, View view4, VkButton vkButton, VkButton vkButton2, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        this.a = vkTopBar;
        this.b = ifeVar;
        this.c = viewGroup;
        this.d = fragmentContainerFrameLayout;
        this.e = view;
        this.f = vkText;
        this.g = c1u0Var;
        this.h = view2;
        this.i = view3;
        this.j = clipSeekBarView;
        this.k = view4;
        this.l = vkButton;
        this.m = vkButton2;
        this.p = viewGroup2;
        this.q = viewGroup3;
    }

    @Override // xsna.wuf
    public final VkText a() {
        return this.f;
    }

    @Override // xsna.wuf
    public final View b() {
        return this.i;
    }

    @Override // xsna.wuf
    public final View c() {
        return this.k;
    }

    @Override // xsna.wuf
    public final VkButton d() {
        return this.m;
    }

    @Override // xsna.wuf
    public final ife e() {
        return this.b;
    }

    @Override // xsna.wuf
    public final void f(int i) {
        p(i);
    }

    @Override // xsna.wuf
    public final ViewGroup g() {
        return this.p;
    }

    @Override // xsna.wuf
    public final View getBackground() {
        return this.h;
    }

    @Override // xsna.wuf
    public final VkTopBar getTopBar() {
        return this.a;
    }

    @Override // xsna.wuf
    public final ClipSeekBarView h() {
        return this.j;
    }

    @Override // xsna.wuf
    public final void i(d6e d6eVar) {
        this.o = d6eVar;
    }

    @Override // xsna.wuf
    public final d6e j() {
        return this.o;
    }

    @Override // xsna.wuf
    public final View k() {
        return this.e;
    }

    @Override // xsna.wuf
    public final VkButton l() {
        return this.l;
    }

    @Override // xsna.wuf
    public final ViewGroup m() {
        return this.q;
    }

    @Override // xsna.wuf
    public final void n(d6e d6eVar) {
        this.n = d6eVar;
    }

    @Override // xsna.wuf
    public final c1u0 o() {
        return this.g;
    }

    @Override // xsna.wuf
    public final void p(int i) {
        f4m.k(i, this.i);
    }

    @Override // xsna.wuf
    public final ViewGroup q() {
        return this.c;
    }

    @Override // xsna.wuf
    public final FragmentContainerFrameLayout r() {
        return this.d;
    }

    @Override // xsna.wuf
    public final d6e s() {
        return this.n;
    }
}
