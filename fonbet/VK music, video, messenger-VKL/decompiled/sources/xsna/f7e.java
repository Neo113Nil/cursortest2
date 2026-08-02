package xsna;

import android.view.View;
import com.vk.clips.design.view.sidecontrols.models.CounterMode;
import com.vk.clips.design.view.sidecontrols.models.VisibilityConfig;
import com.vk.clips.design.view.sidecontrols.renderer.model.Mode;
import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ily;

/* compiled from: ClipsFeedItemLikesLiteView.kt */
/* loaded from: classes17.dex */
public final class f7e extends dh2<q6f0> {
    public final p4f d;
    public q6f0 e;

    /* compiled from: ClipsFeedItemLikesLiteView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReactionsLoading.values().length];
            try {
                iArr[ReactionsLoading.LOAD_ADD_LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReactionsLoading.LOAD_REMOVE_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReactionsLoading.LOAD_ADD_DISLIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReactionsLoading.LOAD_REMOVE_DISLIKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReactionsLoading.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f7e(ggd ggdVar, p4f p4fVar) {
        super(ggdVar);
        this.d = p4fVar;
    }

    @Override // xsna.dh2
    public final void b(q6f0 q6f0Var) {
        ggd ggdVar;
        q6f0 q6f0Var2 = q6f0Var;
        ReactionsLoading reactionsLoading = q6f0Var2.c;
        e7z e7zVar = q6f0Var2.a;
        if (epx.f(this.e, q6f0Var2)) {
            return;
        }
        x6z x6zVar = e7zVar.b;
        w6z w6zVar = e7zVar.a;
        q6f0 q6f0Var3 = this.e;
        boolean f = epx.f(q6f0Var3 != null ? q6f0Var3.a : null, e7zVar);
        ggd ggdVar2 = this.a;
        if (f) {
            ggdVar = ggdVar2;
        } else {
            VisibilityConfig visibilityConfig = w6zVar.d;
            CounterMode counterMode = w6zVar.c;
            u6z u6zVar = w6zVar.b;
            boolean h = visibilityConfig.h();
            boolean z = x6zVar.a;
            int i = x6zVar.c;
            boolean z2 = x6zVar.b && u6zVar.a;
            boolean h2 = counterMode.h();
            View view = this.c;
            afj afjVar = new afj(h2 ? view.getContext().getString(R.string.clips_accessibility_like_count, Integer.valueOf(i)) : view.getContext().getResources().getString(R.string.accessibility_like), u6zVar.a);
            ily ilyVar = new ily(counterMode.h(), uqm0.f(i), new ily.a((int) iah0.y(1.0f), (int) iah0.y(2.0f)));
            ggdVar = ggdVar2;
            ggdVar.c(new ch2(h, z, z2, u6zVar.a ? Mode.TOGGLE : Mode.BUTTON, afjVar, ilyVar, new ok2(1.3f, 1.3f, R.drawable.state_list_like, R.raw.like_outline_to_fill_shadow_medium_animation_48, R.raw.like_fill_to_outline_shadow_medium_animation_48)));
        }
        q6f0 q6f0Var4 = this.e;
        if ((q6f0Var4 != null ? q6f0Var4.c : null) != reactionsLoading) {
            izs<? super View, s3q0> izsVar = reactionsLoading == ReactionsLoading.NONE ? this.d : null;
            if (izsVar == null) {
                izsVar = new g8(10);
            }
            ggdVar.a(izsVar);
            if (w6zVar.b.a) {
                int i2 = a.$EnumSwitchMapping$0[reactionsLoading.ordinal()];
                if (i2 == 1) {
                    ggdVar.b(true);
                } else if (i2 == 2) {
                    ggdVar.b(false);
                } else if (i2 == 3) {
                    ggdVar.b(false);
                } else if (i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        this.e = q6f0Var2;
    }
}
