package com.yandex.plus.home.feature.panel.internal.sections;

import android.content.Context;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.panel.internal.stub.PlusPanelStubShortcutConfig$WidthType;
import defpackage.ard0;
import defpackage.b2d0;
import defpackage.b5d0;
import defpackage.hb90;
import defpackage.i3y;
import defpackage.jse;
import defpackage.m7d0;
import defpackage.n4u0;
import defpackage.n7d0;
import defpackage.nvg0;
import defpackage.ovy0;
import defpackage.pgz;
import defpackage.r0d0;
import defpackage.tls;
import defpackage.vng;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelFullDailySectionView;", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelDailySectionView;", "Landroid/content/Context;", "context", "Lb5d0;", "imageLoader", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "Ln4u0;", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", "themeStateFlow", "Lovy0;", "themeContextConverter", "Lard0;", "shortcutViewAwarenessDetector", "Lb2d0;", "dailyViewStat", "Lhb90;", "loadingAnimationProvider", "", "isWidgetAnimationEnabled", "Ljse;", "mainDispatcher", "Lpgz;", "logger", "ioDispatcher", "Lkotlin/Function1;", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "Lzy11;", "onShortcutClicked", "", "onShortcutAnalyticsEvent", "<init>", "(Landroid/content/Context;Lb5d0;Lcom/yandex/plus/core/strings/PlusSdkBrandType;Ln4u0;Lovy0;Lard0;Lb2d0;Lhb90;ZLjse;Lpgz;Ljse;Ltls;Ltls;)V", "Lm7d0;", "stubConfig$delegate", "Li3y;", "getStubConfig", "()Lm7d0;", "stubConfig", "", "shortcutHeight", CA20Status.STATUS_USER_I, "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelFullDailySectionView extends PlusPanelDailySectionView {
    private final int shortcutHeight;

    /* renamed from: stubConfig$delegate, reason: from kotlin metadata */
    private final i3y stubConfig;

    public PlusPanelFullDailySectionView(Context context, b5d0 b5d0Var, PlusSdkBrandType plusSdkBrandType, n4u0 n4u0Var, ovy0 ovy0Var, ard0 ard0Var, b2d0 b2d0Var, hb90 hb90Var, boolean z, jse jseVar, pgz pgzVar, jse jseVar2, tls tlsVar, tls tlsVar2) {
        super(context, b5d0Var, plusSdkBrandType, n4u0Var, ovy0Var, ard0Var, b2d0Var, hb90Var, z, jseVar, jseVar2, pgzVar, tlsVar, tlsVar2);
        this.stubConfig = a.a(new r0d0(3, this));
        this.shortcutHeight = vng.s(nvg0.plus_sdk_panel_daily_bottom_layout_height, context) + vng.s(nvg0.plus_sdk_panel_daily_top_layout_height, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m7d0 stubConfig_delegate$lambda$0(PlusPanelFullDailySectionView plusPanelFullDailySectionView) {
        return new m7d0(Collections.singletonList(new n7d0(PlusPanelStubShortcutConfig$WidthType.MATCH_PARENT, plusPanelFullDailySectionView.shortcutHeight)));
    }

    @Override // com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView
    public m7d0 getStubConfig() {
        return (m7d0) this.stubConfig.getValue();
    }
}
