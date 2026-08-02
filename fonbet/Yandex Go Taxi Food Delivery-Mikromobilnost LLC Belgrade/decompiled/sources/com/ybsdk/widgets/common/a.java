package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.jl40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a implements vpr {
    public final /* synthetic */ BlendingGradientView a;

    public a(BlendingGradientView blendingGradientView) {
        this.a = blendingGradientView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        BlendingGradientView.State state;
        BlendingGradientView.State state2;
        Integer num = (Integer) obj;
        BlendingGradientView blendingGradientView = this.a;
        state = blendingGradientView.state;
        boolean l = jl40.l(num, state.getColor());
        zy11 zy11Var = zy11.a;
        if (l) {
            return zy11Var;
        }
        state2 = blendingGradientView.state;
        BlendingGradientView.State copy$default = BlendingGradientView.State.copy$default(state2, num, null, 2, null);
        blendingGradientView.changeColorWithVisibility(copy$default);
        blendingGradientView.state = copy$default;
        return zy11Var;
    }
}
