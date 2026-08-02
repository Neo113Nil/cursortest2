package com.yandex.passport.api.mapper;

import com.yandex.passport.api.ProgressAnimation;
import com.yandex.passport.api.ProgressBackground;
import com.yandex.passport.api.ProgressSize;
import com.yandex.passport.api.u1;
import com.yandex.passport.common.ui.progress.c;
import com.yandex.passport.common.ui.progress.d;
import com.yandex.passport.common.ui.progress.e;
import com.yandex.passport.common.ui.progress.f;
import com.yandex.passport.common.ui.progress.g;
import com.yandex.passport.common.ui.progress.q;
import com.yandex.passport.common.ui.progress.r;
import com.yandex.passport.common.ui.progress.s;
import com.yandex.passport.common.ui.progress.t;
import com.yandex.passport.common.ui.progress.u;
import defpackage.w511;

/* loaded from: classes8.dex */
public abstract class b {
    public static final g a(u1 u1Var) {
        c bVar;
        u uVar;
        f dVar;
        ProgressAnimation animation = u1Var.getAnimation();
        if (animation instanceof ProgressAnimation.Default) {
            bVar = new com.yandex.passport.common.ui.progress.a(((ProgressAnimation.Default) animation).getVisibilityDelay());
        } else {
            if (!(animation instanceof ProgressAnimation.Lottie)) {
                w511.b();
                return null;
            }
            bVar = new com.yandex.passport.common.ui.progress.b(((ProgressAnimation.Lottie) animation).getLottieAnimationResId());
        }
        ProgressSize size = u1Var.getSize();
        if (size instanceof ProgressSize.Default) {
            uVar = r.a;
        } else if (size instanceof ProgressSize.Custom) {
            ProgressSize.Custom custom = (ProgressSize.Custom) size;
            uVar = new q(custom.getWidthPx(), custom.getHeightPx());
        } else if (size instanceof ProgressSize.FullSize) {
            uVar = s.a;
        } else {
            if (!(size instanceof ProgressSize.WrapContent)) {
                w511.b();
                return null;
            }
            uVar = t.a;
        }
        ProgressBackground background = u1Var.getBackground();
        if (background instanceof ProgressBackground.Default) {
            dVar = e.a;
        } else {
            if (!(background instanceof ProgressBackground.Custom)) {
                w511.b();
                return null;
            }
            dVar = new d(((ProgressBackground.Custom) background).getBackgroundResId());
        }
        return new g(bVar, uVar, dVar, u1Var.getShowCancelButton());
    }
}
