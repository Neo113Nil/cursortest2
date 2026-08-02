package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit;

import com.yandex.div.core.expression.variables.a;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.gvy0;
import defpackage.z131;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/DivkitThemeChangeListener;", "Lgvy0;", "Lcom/yandex/div/core/expression/variables/a;", "variableController", "<init>", "(Lcom/yandex/div/core/expression/variables/a;)V", "", UrbanAdsBottomSheetFragment.THEME_ID, "Lzy11;", "onThemeChanged", "(Ljava/lang/String;)V", "Lcom/yandex/div/core/expression/variables/a;", "Lz131;", "themeVariable", "Lz131;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivkitThemeChangeListener implements gvy0 {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String THEME_VARIABLE_DEFAULT_VALUE = "DAY";

    @Deprecated
    public static final String THEME_VARIABLE_NAME = "theme";
    private final z131 themeVariable;
    private final a variableController;

    public DivkitThemeChangeListener(a aVar) {
        this.variableController = aVar;
        z131 z131Var = new z131(THEME_VARIABLE_NAME, THEME_VARIABLE_DEFAULT_VALUE);
        this.themeVariable = z131Var;
        aVar.i(z131Var);
    }

    @Override // defpackage.gvy0
    public void onThemeChanged(String themeId) {
        this.themeVariable.g(themeId);
        this.variableController.i(this.themeVariable);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/DivkitThemeChangeListener$Companion;", "", "<init>", "()V", "THEME_VARIABLE_NAME", "", "THEME_VARIABLE_DEFAULT_VALUE", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
