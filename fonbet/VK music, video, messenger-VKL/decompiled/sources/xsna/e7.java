package xsna;

import android.graphics.Insets;
import android.view.View;
import androidx.preference.Preference;
import com.vk.common.links.AwayLink;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import xsna.c0e;
import xsna.dgh;
import xsna.drz;
import xsna.e5i;
import xsna.ttf;
import xsna.ub9;
import xsna.xgy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e7 implements io.reactivex.rxjava3.functions.l, ub9.c, xgy.a, saz, io.reactivex.rxjava3.functions.m, Preference.c, h9l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.saz
    public void I(AwayLink awayLink) {
        e5i.a aVar = (e5i.a) this.c;
        String str = awayLink != null ? awayLink.b : null;
        if (str == null) {
            str = "";
        }
        aVar.q6(str, "tap");
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((d7) this.c).invoke(obj);
            case 1:
                return (it80) ((pf) this.c).invoke(obj);
            case 2:
                return (Pair) ((pf) this.c).invoke(obj);
            case 3:
                return (List) ((d7) this.c).invoke(obj);
            case 4:
                return (Pair) ((d7) this.c).invoke(obj);
            case 5:
                return (ri8) ((ma) this.c).invoke(obj);
            case 6:
            case 11:
            case 12:
            case 18:
            case 19:
            case 20:
            case 22:
            default:
                return (NewsEntry) ((dkg) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((vh9) this.c).invoke(obj);
            case 8:
                return (hda) ((k6a) this.c).invoke(obj);
            case 9:
                return (hda) ((ma) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((lwa) this.c).invoke(obj);
            case 13:
                return (List) ((pf) this.c).invoke(obj);
            case 14:
                return (c0e.a) ((b0e) this.c).invoke(obj);
            case 15:
                return (ttf.e) ((pf) this.c).invoke(obj);
            case 16:
                return ((dgh.c) this.c).invoke(obj);
            case 17:
                return (VKList) ((dkg) this.c).invoke(obj);
            case 21:
                return (ConfirmResult) ((pf) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.q) ((dkg) this.c).invoke(obj);
            case 24:
                return (Set) ((nyq) this.c).invoke(obj);
            case 25:
                return (drz.a) ((nyq) this.c).invoke(obj);
            case 26:
                return (WebIdentityAddress) ((dkg) this.c).invoke(obj);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        me9 me9Var = (me9) this.c;
        me9Var.d.execute(new le9(0, me9Var, aVar));
        return "clearCaptureRequestOptions";
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        ((VkWorkoutWidgetComponent) j6i.b(m7m.f(debugDevSettingsFragment), VkWorkoutWidgetComponent.class)).v5().f();
        return true;
    }

    @Override // xsna.xgy.a
    public int getHeight() {
        Insets insets;
        int i;
        com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.c;
        int i2 = ify.a;
        int c = ify.c(aVar.o.getApplicationContext(), null);
        if (!gz80.a(30) || !aVar.k.r().h.l()) {
            return c;
        }
        View view = aVar.y;
        insets = (view != null ? view : null).getRootWindowInsets().getInsets(519);
        i = insets.bottom;
        return c - i;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new l5r((NewsfeedRouter) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 19:
                return ((Boolean) ((pf) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ci3) this.c).invoke(obj)).booleanValue();
        }
    }
}
