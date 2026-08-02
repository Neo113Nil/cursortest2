package com.yandex.go.yb.main_menu.ui;

import android.content.Context;
import android.widget.FrameLayout;
import com.ybsdk.api.widgets.YBBalanceBadgeView;
import defpackage.df51;
import defpackage.nwy0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"com/yandex/go/yb/main_menu/ui/YbWalletMenuItemViewHolderImpl$BadgeWrapper", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lcom/ybsdk/api/widgets/YBBalanceBadgeView;", "badge", "<init>", "(Landroid/content/Context;Lcom/ybsdk/api/widgets/YBBalanceBadgeView;)V", "", "allowTraverse", "()Z", "Ldf51;", ClidProvider.STATE, "Lzy11;", "render", "(Ldf51;)V", "Lcom/ybsdk/api/widgets/YBBalanceBadgeView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
final class YbWalletMenuItemViewHolderImpl$BadgeWrapper extends FrameLayout implements nwy0 {
    private final YBBalanceBadgeView badge;

    public YbWalletMenuItemViewHolderImpl$BadgeWrapper(Context context, YBBalanceBadgeView yBBalanceBadgeView) {
        super(context);
        this.badge = yBBalanceBadgeView;
        addView(yBBalanceBadgeView);
    }

    @Override // defpackage.nwy0
    public boolean allowTraverse() {
        return false;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void render(df51 state) {
        if (state == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.badge.render(state);
        }
    }
}
