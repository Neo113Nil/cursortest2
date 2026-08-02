package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.graphics.Color;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class PullToRefreshChannelDelegate extends ChannelDelegateImpl {
    private PullToRefreshLayout pullToRefreshView;

    public PullToRefreshChannelDelegate(PullToRefreshLayout pullToRefreshLayout, ea20 ea20Var) {
        super(ea20Var);
        this.pullToRefreshView = pullToRefreshLayout;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.pullToRefreshView = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        char c;
        String str = x920Var.a;
        str.getClass();
        switch (str.hashCode()) {
            case -1790841290:
                if (str.equals("setSlingshotDistance")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 154556713:
                if (str.equals("setRefreshing")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1235582893:
                if (str.equals("getDefaultSlingshotDistance")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1364071551:
                if (str.equals("setEnabled")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1389555745:
                if (str.equals("setColor")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743806995:
                if (str.equals("setBackgroundColor")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1807783361:
                if (str.equals("setDistanceToTriggerSync")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1849446385:
                if (str.equals("isRefreshing")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2105594551:
                if (str.equals("isEnabled")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (this.pullToRefreshView == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSlingshotDistance(((Integer) x920Var.a("slingshotDistance")).intValue());
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case 1:
                if (this.pullToRefreshView == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setRefreshing(((Boolean) x920Var.a("refreshing")).booleanValue());
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case 2:
                da20Var.success(-1);
                break;
            case 3:
                if (this.pullToRefreshView == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    Boolean bool = (Boolean) x920Var.a(BackendConfig.Restrictions.ENABLED);
                    PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshView;
                    pullToRefreshLayout.settings.enabled = bool;
                    pullToRefreshLayout.setEnabled(bool.booleanValue());
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case 4:
                if (this.pullToRefreshView == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setColorSchemeColors(Color.parseColor((String) x920Var.a("color")));
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case 5:
                if (this.pullToRefreshView == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor((String) x920Var.a("color")));
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case 6:
                if (this.pullToRefreshView == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setDistanceToTriggerSync(((Integer) x920Var.a("distanceToTriggerSync")).intValue());
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case 7:
                PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshView;
                da20Var.success(Boolean.valueOf(pullToRefreshLayout2 != null && pullToRefreshLayout2.isRefreshing()));
                break;
            case '\b':
                if (this.pullToRefreshView == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSize(((Integer) x920Var.a("size")).intValue());
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case '\t':
                PullToRefreshLayout pullToRefreshLayout3 = this.pullToRefreshView;
                if (pullToRefreshLayout3 == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    da20Var.success(Boolean.valueOf(pullToRefreshLayout3.isEnabled()));
                    break;
                }
            default:
                da20Var.notImplemented();
                break;
        }
    }

    public void onRefresh() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onRefresh", new HashMap(), null);
    }
}
