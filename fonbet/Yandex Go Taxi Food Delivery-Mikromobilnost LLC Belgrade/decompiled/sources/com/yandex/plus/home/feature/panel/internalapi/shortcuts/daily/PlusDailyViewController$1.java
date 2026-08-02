package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.pgz;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class PlusDailyViewController$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlusTheme plusTheme = (PlusTheme) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.h;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlusDailyViewController", "onThemeChanged() theme=" + plusTheme);
        }
        aVar.a.getContext();
        throw null;
    }
}
