package xsna;

import com.vk.core.preference.Preference;
import com.vk.toggle.features.ContentFeatures;

/* compiled from: StoriesSettingsControllerImpl.kt */
/* loaded from: classes6.dex */
public final class fvl0 implements evl0 {
    public final b25 b;
    public final bpn0 c = new bpn0(new h13(25));

    public fvl0(b25 b25Var) {
        this.b = b25Var;
    }

    @Override // xsna.evl0
    public final boolean a() {
        return Preference.d("stories_default", "save_stories", false);
    }

    @Override // xsna.evl0
    public final void b(boolean z) {
        Preference.I("stories_default", "post_autorepost_switched_on", z);
    }

    @Override // xsna.evl0
    public final boolean c() {
        return Preference.d("stories_default", "stories_quality", true);
    }

    @Override // xsna.evl0
    public final void clear() {
        Preference.C("stories_default", "stories2");
    }

    @Override // xsna.evl0
    public final boolean d() {
        ContentFeatures contentFeatures = ContentFeatures.STORY_GIF;
        contentFeatures.getClass();
        return com.vk.toggle.b.A.a(contentFeatures) && !((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // xsna.evl0
    public final boolean e() {
        return Preference.d("stories_default", "post_autorepost_switched_on", true);
    }

    @Override // xsna.evl0
    public final boolean f() {
        return this.b.i().s;
    }

    @Override // xsna.evl0
    public final void g(boolean z) {
        Preference.I("stories_default", "save_stories", z);
    }
}
