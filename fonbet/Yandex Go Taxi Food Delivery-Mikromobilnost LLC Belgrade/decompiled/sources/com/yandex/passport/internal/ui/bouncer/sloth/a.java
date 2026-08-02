package com.yandex.passport.internal.ui.bouncer.sloth;

import com.yandex.passport.api.ProgressAnimation;
import com.yandex.passport.api.ProgressBackground;
import com.yandex.passport.api.ProgressSize;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.sloth.ui.dependencies.j;
import com.yandex.passport.sloth.ui.dependencies.l;
import com.yandex.passport.sloth.ui.dependencies.o;
import defpackage.jl40;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class a implements o {
    public final com.yandex.passport.sloth.ui.dependencies.g a;
    public final l b;
    public final com.yandex.passport.sloth.ui.dependencies.i c;
    public final com.yandex.passport.internal.ui.sloth.a d;
    public com.yandex.passport.internal.ui.sloth.e e;
    public final boolean f;

    public a(ProgressPropertiesImpl progressPropertiesImpl, com.yandex.passport.internal.ui.sloth.a aVar, p pVar) {
        com.yandex.passport.sloth.ui.dependencies.g fVar;
        l jVar;
        com.yandex.passport.sloth.ui.dependencies.i hVar;
        ProgressAnimation animation = progressPropertiesImpl.getAnimation();
        if (animation instanceof ProgressAnimation.Default) {
            fVar = com.yandex.passport.sloth.ui.dependencies.e.b;
        } else {
            if (!(animation instanceof ProgressAnimation.Lottie)) {
                w511.b();
                throw null;
            }
            fVar = new com.yandex.passport.sloth.ui.dependencies.f(((ProgressAnimation.Lottie) animation).getLottieAnimationResId());
        }
        this.a = fVar;
        ProgressSize size = progressPropertiesImpl.getSize();
        if (jl40.l(size, ProgressSize.Default.INSTANCE)) {
            jVar = com.yandex.passport.sloth.ui.dependencies.e.d;
        } else if (jl40.l(size, ProgressSize.FullSize.INSTANCE)) {
            jVar = com.yandex.passport.sloth.ui.dependencies.e.e;
        } else if (jl40.l(size, ProgressSize.WrapContent.INSTANCE)) {
            jVar = com.yandex.passport.sloth.ui.dependencies.e.f;
        } else {
            if (!(size instanceof ProgressSize.Custom)) {
                w511.b();
                throw null;
            }
            ProgressSize.Custom custom = (ProgressSize.Custom) size;
            jVar = new j(custom.getWidthPx(), custom.getHeightPx());
        }
        this.b = jVar;
        ProgressBackground background = progressPropertiesImpl.getBackground();
        if (jl40.l(background, ProgressBackground.Default.INSTANCE)) {
            hVar = com.yandex.passport.sloth.ui.dependencies.e.c;
        } else {
            if (!(background instanceof ProgressBackground.Custom)) {
                w511.b();
                throw null;
            }
            hVar = new com.yandex.passport.sloth.ui.dependencies.h(((ProgressBackground.Custom) background).getBackgroundResId());
        }
        this.c = hVar;
        this.d = aVar;
        this.e = pVar.w ? com.yandex.passport.sloth.ui.dependencies.a.a : com.yandex.passport.sloth.ui.dependencies.b.a;
        this.f = progressPropertiesImpl.getShowCancelButton();
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final boolean a() {
        return this.f;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final com.yandex.passport.sloth.ui.dependencies.i b() {
        return this.c;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final com.yandex.passport.internal.ui.sloth.e c() {
        return this.e;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final com.yandex.passport.sloth.ui.dependencies.g d() {
        return this.a;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final l e() {
        return this.b;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final com.yandex.passport.internal.ui.sloth.a f() {
        return this.d;
    }
}
