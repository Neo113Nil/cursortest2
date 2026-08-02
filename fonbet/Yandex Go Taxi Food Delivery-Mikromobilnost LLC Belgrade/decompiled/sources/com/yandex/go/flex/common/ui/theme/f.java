package com.yandex.go.flex.common.ui.theme;

import com.yandex.go.flex.common.api.FeedSdkTheme;
import defpackage.jy60;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.yqq;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes.dex */
public final class f implements jy60 {
    public final yqq a;
    public volatile FeedSdkTheme c;
    public final pzt0 d;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final String e = "ThemeChangedRepository";

    public f(tse tseVar, yqq yqqVar) {
        this.a = yqqVar;
        this.d = tje.N(tseVar, null, CoroutineStart.LAZY, new ThemeChangedRepositoryImpl$feedSdkThemeJob$1(this, null), 1);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.jy60
    public final void h() {
        this.d.start();
    }
}
