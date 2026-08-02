package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;

/* loaded from: classes11.dex */
public class ChannelDelegateImpl implements IChannelDelegate {
    private ea20 channel;

    public ChannelDelegateImpl(ea20 ea20Var) {
        this.channel = ea20Var;
        ea20Var.b(this);
    }

    public void dispose() {
        ea20 ea20Var = this.channel;
        if (ea20Var != null) {
            ea20Var.b(null);
            this.channel = null;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate
    public ea20 getChannel() {
        return this.channel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
    }
}
