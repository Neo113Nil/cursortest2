package com.yandex.div.core.tooltip;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.view2.BindingContext;
import xsna.m180;
import xsna.zcl;

/* compiled from: DivTooltipController.kt */
/* loaded from: classes7.dex */
final class TooltipData {
    private final BindingContext bindingContext;
    private boolean dismissed;
    private final com.yandex.div2.a div;
    private final String id;
    private final m180 onBackPressedCallback;
    private final SafePopupWindow popupWindow;
    private DivPreloader.Ticket ticket;

    public TooltipData(String str, BindingContext bindingContext, com.yandex.div2.a aVar, SafePopupWindow safePopupWindow, DivPreloader.Ticket ticket, m180 m180Var, boolean z) {
        this.id = str;
        this.bindingContext = bindingContext;
        this.div = aVar;
        this.popupWindow = safePopupWindow;
        this.ticket = ticket;
        this.onBackPressedCallback = m180Var;
        this.dismissed = z;
    }

    public final BindingContext getBindingContext() {
        return this.bindingContext;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    public final com.yandex.div2.a getDiv() {
        return this.div;
    }

    public final String getId() {
        return this.id;
    }

    public final m180 getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public final SafePopupWindow getPopupWindow() {
        return this.popupWindow;
    }

    public final DivPreloader.Ticket getTicket() {
        return this.ticket;
    }

    public final void setDismissed(boolean z) {
        this.dismissed = z;
    }

    public final void setTicket(DivPreloader.Ticket ticket) {
        this.ticket = ticket;
    }

    public /* synthetic */ TooltipData(String str, BindingContext bindingContext, com.yandex.div2.a aVar, SafePopupWindow safePopupWindow, DivPreloader.Ticket ticket, m180 m180Var, boolean z, int i, zcl zclVar) {
        this(str, bindingContext, aVar, safePopupWindow, (i & 16) != 0 ? null : ticket, m180Var, (i & 64) != 0 ? false : z);
    }
}
