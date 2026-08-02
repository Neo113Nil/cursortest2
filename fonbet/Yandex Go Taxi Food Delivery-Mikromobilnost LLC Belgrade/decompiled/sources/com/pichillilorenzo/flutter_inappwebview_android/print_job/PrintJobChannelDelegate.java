package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;

/* loaded from: classes11.dex */
public class PrintJobChannelDelegate extends ChannelDelegateImpl {
    private PrintJobController printJobController;

    public PrintJobChannelDelegate(PrintJobController printJobController, ea20 ea20Var) {
        super(ea20Var);
        this.printJobController = printJobController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "cancel":
                PrintJobController printJobController = this.printJobController;
                if (printJobController == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController.cancel();
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case "getInfo":
                PrintJobController printJobController2 = this.printJobController;
                if (printJobController2 == null) {
                    da20Var.success(null);
                    break;
                } else {
                    PrintJobInfoExt info = printJobController2.getInfo();
                    da20Var.success(info != null ? info.toMap() : null);
                    break;
                }
            case "restart":
                PrintJobController printJobController3 = this.printJobController;
                if (printJobController3 == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController3.restart();
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case "dispose":
                PrintJobController printJobController4 = this.printJobController;
                if (printJobController4 == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController4.dispose();
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            default:
                da20Var.notImplemented();
                break;
        }
    }
}
