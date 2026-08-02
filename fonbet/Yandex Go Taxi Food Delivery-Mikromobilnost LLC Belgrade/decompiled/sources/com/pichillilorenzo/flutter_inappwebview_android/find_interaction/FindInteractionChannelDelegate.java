package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import defpackage.b64;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
    private FindInteractionController findInteractionController;

    public FindInteractionChannelDelegate(FindInteractionController findInteractionController, ea20 ea20Var) {
        super(ea20Var);
        this.findInteractionController = findInteractionController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }

    public void onFindResultReceived(int i, int i2, boolean z) {
        FindInteractionController findInteractionController;
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        if (z && (findInteractionController = this.findInteractionController) != null && findInteractionController.webView != null) {
            findInteractionController.activeFindSession = new FindSession(i2, i);
        }
        HashMap hashMap = new HashMap();
        b64.B(i, hashMap, "activeMatchOrdinal", i2, "numberOfMatches");
        hashMap.put("isDoneCounting", Boolean.valueOf(z));
        channel.a("onFindResultReceived", hashMap, null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        FindSession findSession;
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "getSearchText":
                FindInteractionController findInteractionController = this.findInteractionController;
                if (findInteractionController == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    da20Var.success(findInteractionController.searchText);
                    break;
                }
            case "findAll":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findAll((String) x920Var.a("find"));
                }
                da20Var.success(Boolean.TRUE);
                break;
            case "findNext":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findNext(((Boolean) x920Var.a("forward")).booleanValue());
                }
                da20Var.success(Boolean.TRUE);
                break;
            case "setSearchText":
                FindInteractionController findInteractionController2 = this.findInteractionController;
                if (findInteractionController2 == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    findInteractionController2.searchText = (String) x920Var.a("searchText");
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case "clearMatches":
                FindInteractionController findInteractionController3 = this.findInteractionController;
                if (findInteractionController3 != null) {
                    findInteractionController3.clearMatches();
                }
                da20Var.success(Boolean.TRUE);
                break;
            case "getActiveFindSession":
                FindInteractionController findInteractionController4 = this.findInteractionController;
                if (findInteractionController4 != null && (findSession = findInteractionController4.activeFindSession) != null) {
                    da20Var.success(findSession.toMap());
                    break;
                } else {
                    da20Var.success(null);
                    break;
                }
                break;
            default:
                da20Var.notImplemented();
                break;
        }
    }
}
