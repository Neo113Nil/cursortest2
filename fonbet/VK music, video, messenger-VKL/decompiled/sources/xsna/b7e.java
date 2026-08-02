package xsna;

import android.view.View;
import com.vk.clips.design.view.sidecontrols.renderer.model.Mode;
import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsFeedItemDislikesLiteView.kt */
/* loaded from: classes17.dex */
public final class b7e extends dh2<q6f0> {
    public final tm0 d;
    public q6f0 e;

    /* compiled from: ClipsFeedItemDislikesLiteView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReactionsLoading.values().length];
            try {
                iArr[ReactionsLoading.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReactionsLoading.LOAD_ADD_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReactionsLoading.LOAD_REMOVE_LIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReactionsLoading.LOAD_ADD_DISLIKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReactionsLoading.LOAD_REMOVE_DISLIKE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b7e(ggd ggdVar, tm0 tm0Var) {
        super(ggdVar);
        this.d = tm0Var;
    }

    @Override // xsna.dh2
    public final void b(q6f0 q6f0Var) {
        q6f0 q6f0Var2 = q6f0Var;
        ReactionsLoading reactionsLoading = q6f0Var2.c;
        if (epx.f(this.e, q6f0Var2)) {
            return;
        }
        zbn zbnVar = q6f0Var2.b;
        q6f0 q6f0Var3 = this.e;
        boolean f = epx.f(q6f0Var3 != null ? q6f0Var3.b : null, zbnVar);
        ggd ggdVar = this.a;
        if (!f) {
            boolean h = zbnVar.a.d.h();
            ybn ybnVar = zbnVar.b;
            ggdVar.c(new ch2(h, ybnVar.a, ybnVar.c, Mode.BUTTON, new afj(this.c.getContext().getResources().getString(R.string.live_dislike), 2), new ily(6), new ok2(1.3f, 1.3f, R.drawable.state_list_dislike, R.raw.thumbs_down_outline_to_fill_shadow_medium_48, R.raw.thumbs_down_fill_to_outline_shadow_medium_48)));
        }
        q6f0 q6f0Var4 = this.e;
        if ((q6f0Var4 != null ? q6f0Var4.c : null) != reactionsLoading) {
            izs<? super View, s3q0> izsVar = reactionsLoading == ReactionsLoading.NONE ? this.d : null;
            if (izsVar == null) {
                izsVar = new la2(11);
            }
            ggdVar.a(izsVar);
            int i = a.$EnumSwitchMapping$0[reactionsLoading.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ggdVar.b(false);
                } else if (i != 3) {
                    if (i == 4) {
                        ggdVar.b(true);
                    } else {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ggdVar.b(false);
                    }
                }
            }
        }
        this.e = q6f0Var2;
    }
}
