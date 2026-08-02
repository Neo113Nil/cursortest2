package xsna;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import kotlin.Lazy;
import xsna.yf9;

/* compiled from: CameraUIDeps.kt */
/* loaded from: classes16.dex */
public final class dm9 {
    public final xkg a;
    public final Lazy<yf9> b;
    public final Lazy<g7j0> c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;

    public dm9() {
        throw null;
    }

    public dm9(nmg0 nmg0Var, Lazy lazy, Lazy lazy2) {
        xkg xkgVar = xkg.a;
        bpn0 bpn0Var = new bpn0(new j70(nmg0Var, 9));
        bpn0 bpn0Var2 = new bpn0(new h9(nmg0Var, 9));
        bpn0 bpn0Var3 = new bpn0(new com.vk.movika.sdk.base.presenter.b(nmg0Var, 4));
        bpn0 bpn0Var4 = new bpn0(new qc(nmg0Var, 8));
        bpn0 bpn0Var5 = new bpn0(new s5(nmg0Var, 13));
        bpn0 bpn0Var6 = new bpn0(new t5(nmg0Var, 14));
        bpn0 bpn0Var7 = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(nmg0Var, 14));
        bpn0 bpn0Var8 = new bpn0(new f1(nmg0Var, 11));
        bpn0 bpn0Var9 = new bpn0(new defpackage.r(nmg0Var, 15));
        bpn0 bpn0Var10 = new bpn0(new yh(nmg0Var, 13));
        bpn0 bpn0Var11 = new bpn0(new ic(nmg0Var, 13));
        bpn0 bpn0Var12 = new bpn0(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(nmg0Var, 14));
        this.a = xkgVar;
        this.b = lazy;
        this.c = lazy2;
        this.d = bpn0Var;
        this.e = bpn0Var2;
        this.f = bpn0Var3;
        this.g = bpn0Var4;
        this.h = bpn0Var5;
        this.i = bpn0Var6;
        this.j = bpn0Var7;
        this.k = bpn0Var8;
        this.l = bpn0Var9;
        this.m = bpn0Var10;
        this.n = bpn0Var11;
        this.o = bpn0Var12;
    }

    public final b25 a() {
        return d().s();
    }

    public final Lazy<ClipsBlacklistsComponent> b() {
        return this.o;
    }

    public final kz8 c() {
        return ((CommonEditorComponent) this.f.getValue()).Ha();
    }

    public final yf9 d() {
        return this.b.getValue();
    }

    public final Lazy<CameraClipsComponent> e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm9)) {
            return false;
        }
        dm9 dm9Var = (dm9) obj;
        return epx.f(this.a, dm9Var.a) && epx.f(this.b, dm9Var.b) && epx.f(this.c, dm9Var.c) && epx.f(this.d, dm9Var.d) && epx.f(this.e, dm9Var.e) && epx.f(this.f, dm9Var.f) && epx.f(this.g, dm9Var.g) && epx.f(this.h, dm9Var.h) && epx.f(this.i, dm9Var.i) && epx.f(this.j, dm9Var.j) && epx.f(this.k, dm9Var.k) && epx.f(this.l, dm9Var.l) && epx.f(this.m, dm9Var.m) && epx.f(this.n, dm9Var.n) && epx.f(this.o, dm9Var.o);
    }

    public final pkd f() {
        return d().x();
    }

    public final Lazy<ClipsConfigAuthorsComponent> g() {
        return this.h;
    }

    public final wvw h() {
        return d().t();
    }

    public final int hashCode() {
        return this.o.hashCode() + tq.b(this.n, tq.b(this.m, tq.b(this.l, tq.b(this.k, tq.b(this.j, tq.b(this.i, tq.b(this.h, tq.b(this.g, tq.b(this.f, tq.b(this.e, tq.b(this.d, g7r0.a(this.c, g7r0.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final qdz i() {
        return d().p();
    }

    public final yf9.a j() {
        return d().f();
    }

    public final xb00 k() {
        return this.a;
    }

    public final krl0 l() {
        return d().a0();
    }

    public final Lazy<StoriesSettingsComponent> m() {
        return this.j;
    }

    public final Lazy<StoryEditorComponent> n() {
        return this.e;
    }

    public final yf9.b o() {
        return d().c();
    }

    public final o0r0 p() {
        return d().F();
    }

    public final String toString() {
        return "CameraUIDeps(ml=" + this.a + ", cameraBridgeProvider=" + this.b + ", shareBridgeProvider=" + this.c + ", storiesComponentProvider=" + this.d + ", storyEditorComponentProvider=" + this.e + ", commonEditorComponentProvider=" + this.f + ", stickersComponentProvider=" + this.g + ", clipsAuthorExperimentsProvider=" + this.h + ", cameraClipsComponent=" + this.i + ", storiesSettingsComponent=" + this.j + ", imBridgeComponent=" + this.k + ", contentPrivacyComponent=" + this.l + ", clipsViewerComponent=" + this.m + ", clipsTemplatesEditorComponent=" + this.n + ", blacklistsComponentProvider=" + this.o + ')';
    }
}
