package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.e3m;
import xsna.gko;
import xsna.tlo0;

/* compiled from: ClipsErrorViewController.kt */
/* loaded from: classes17.dex */
public final class u1e {
    public final VkPlaceholder a;
    public final ng1 b;
    public final ClipsGridFragment.e c;

    public u1e(VkPlaceholder vkPlaceholder, ng1 ng1Var, ClipsGridFragment.e eVar) {
        this.a = vkPlaceholder;
        this.b = ng1Var;
        this.c = eVar;
        gko.b bVar = gko.Companion;
        Context context = vkPlaceholder.getContext();
        e3m.a aVar = e3m.a;
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_error_outline_56), new b8g(context.getColor(R.color.vk_gray_600)), null, 28));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(tq.h(tlo0.Companion, R.string.error), new tlo0.f(R.string.liblists_err_text), (com.vk.core.compose.component.semantics.a) null, 10));
        vkPlaceholder.setBottom(b(R.string.liblists_retry, ng1Var));
    }

    public static VkPlaceholder.a b(int i, gzs gzsVar) {
        return new VkPlaceholder.a(new VkPlaceholder.a.C0854a(tq.h(tlo0.Companion, i), gzsVar, null, null, VkButton.Size.Small, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, null, 1596), (VkPlaceholder.a.C0854a) null, 6);
    }

    public final void a(Throwable th) {
        Pair pair;
        List<VKApiExecutionException> v;
        VKApiExecutionException vKApiExecutionException;
        VkPlaceholder.b bVar = null;
        VKApiExecutionException vKApiExecutionException2 = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        String g = (vKApiExecutionException2 == null || (v = vKApiExecutionException2.v()) == null || (vKApiExecutionException = (VKApiExecutionException) j5g.a0(v)) == null) ? null : vKApiExecutionException.g();
        boolean f = epx.f(g, "audio.getById");
        VkPlaceholder vkPlaceholder = this.a;
        if (f) {
            pair = new Pair(tq.h(tlo0.Companion, R.string.clips_grid_error_music), Boolean.TRUE);
        } else if (epx.f(g, "masks.getEffects")) {
            pair = new Pair(tq.h(tlo0.Companion, R.string.clips_grid_error_mask), Boolean.TRUE);
        } else {
            tlo0.a aVar = tlo0.Companion;
            String g2 = j03.g(vkPlaceholder.getContext(), th, R.string.liblists_err_text);
            aVar.getClass();
            pair = new Pair(new tlo0.h(g2), Boolean.FALSE);
        }
        tlo0 tlo0Var = (tlo0) pair.d();
        boolean booleanValue = ((Boolean) pair.g()).booleanValue();
        Integer valueOf = Integer.valueOf(R.string.go_to_clips_feed);
        if (!booleanValue) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : R.string.liblists_retry;
        gzs gzsVar = booleanValue ? this.c : null;
        if (gzsVar == null) {
            gzsVar = this.b;
        }
        VkPlaceholder.b middle = vkPlaceholder.getMiddle();
        if (middle != null) {
            bVar = new VkPlaceholder.b(booleanValue ? tq.h(tlo0.Companion, R.string.error) : null, middle.b, tlo0Var, middle.d);
        }
        vkPlaceholder.setMiddle(bVar);
        vkPlaceholder.setBottom(b(intValue, gzsVar));
    }

    public final boolean c() {
        VkPlaceholder vkPlaceholder = this.a;
        boolean K = bwt0.K(vkPlaceholder);
        f4m.j(vkPlaceholder);
        return K;
    }

    public final void d() {
        this.a.setVisibility(0);
    }
}
