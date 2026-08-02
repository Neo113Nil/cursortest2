package xsna;

import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.xxl0;

/* compiled from: StoryAvatarConfigs.kt */
/* loaded from: classes6.dex */
public final class byl0 implements xxl0 {
    public final int a = iah0.a(72);
    public final int b = iah0.a(96);
    public final int c = iah0.a(Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
    public final int d = R.layout.story_circle_preview_animation_redesign;
    public final xxl0.a e = new xxl0.a(iah0.b(72.0f), iah0.b(3.0f), iah0.b(4.0f));
    public final xxl0.a f = new xxl0.a(iah0.b(72.0f), iah0.b(3.0f), iah0.b(2.0f));

    @Override // xsna.xxl0
    public final int a() {
        return com.vk.toggle.d.P() ? R.layout.pds_story_new_item_72_redesign_square : R.layout.pds_story_new_item_72_redesign;
    }

    @Override // xsna.xxl0
    public final boolean b() {
        return false;
    }

    @Override // xsna.xxl0
    public final int c() {
        return this.c;
    }

    @Override // xsna.xxl0
    public final int d() {
        return this.b;
    }

    @Override // xsna.xxl0
    public final xxl0.a e() {
        return this.f;
    }

    @Override // xsna.xxl0
    public final int f() {
        return this.d;
    }

    @Override // xsna.xxl0
    public final int g() {
        return 0;
    }

    @Override // xsna.xxl0
    public final xxl0.a h() {
        return this.e;
    }

    @Override // xsna.xxl0
    public final int i() {
        return this.a;
    }
}
