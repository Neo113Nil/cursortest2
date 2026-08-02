package com.yandex.plus.home.feature.panel.internal.sections;

import android.view.View;
import com.yandex.plus.home.repository.api.model.panel.Section;
import com.yandex.plus.home.repository.api.model.panel.Shortcut;
import defpackage.cb90;
import defpackage.db90;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pld0;
import defpackage.wls;
import defpackage.wp81;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView$startPanelAnalytics$1$2", f = "PlusPanelSectionView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PlusPanelSectionView$startPanelAnalytics$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ cb90 $panel;
    final /* synthetic */ Section $section;
    final /* synthetic */ Shortcut $shortcut;
    final /* synthetic */ View $shortcutView;
    int label;
    final /* synthetic */ PlusPanelSectionView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPanelSectionView$startPanelAnalytics$1$2(PlusPanelSectionView plusPanelSectionView, View view, cb90 cb90Var, Section section, Shortcut shortcut, Continuation continuation) {
        super(2, continuation);
        this.this$0 = plusPanelSectionView;
        this.$shortcutView = view;
        this.$panel = cb90Var;
        this.$section = section;
        this.$shortcut = shortcut;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusPanelSectionView$startPanelAnalytics$1$2(this.this$0, this.$shortcutView, this.$panel, this.$section, this.$shortcut, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlusPanelSectionView$startPanelAnalytics$1$2 plusPanelSectionView$startPanelAnalytics$1$2 = (PlusPanelSectionView$startPanelAnalytics$1$2) create((zy11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        plusPanelSectionView$startPanelAnalytics$1$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        db90 childParams = this.this$0.getChildParams(this.$shortcutView);
        Section section = this.$section;
        Shortcut shortcut = this.$shortcut;
        String id = section.getId();
        String name = section.getName();
        String id2 = shortcut.getId();
        String name2 = shortcut.getName();
        if (childParams == null) {
            i3y i3yVar = db90.e;
            childParams = wp81.c();
        }
        this.this$0.onShortcutAnalyticsEvent.invoke(new pld0(null, null, id, name, id2, name2, childParams));
        return zy11.a;
    }
}
