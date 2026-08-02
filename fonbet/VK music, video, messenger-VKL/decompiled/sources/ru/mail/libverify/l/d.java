package ru.mail.libverify.l;

import ru.mail.verify.core.utils.Gsonable;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class d implements Gsonable {
    public static final a Companion = new a();
    private final boolean callEnabled;

    @ru.mail.libverify.q0.b("isCallInEnabled")
    private final boolean callInEnabled;

    @ru.mail.libverify.q0.b("isCallUIEnabled")
    private final Boolean callUIEnabled;
    private final String externalId;
    private final boolean messengerEnabled;
    private final boolean mobileIdEnabled;
    private final boolean pushEnabled;
    private final boolean smsEnabled;

    @ru.mail.libverify.q0.b("isStateChangeOnErrorEnabled")
    private final boolean stateChangeOnErrorEnabled;

    public static final class a {
    }

    public d(Boolean bool, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.callUIEnabled = bool;
        this.callInEnabled = z;
        this.externalId = str;
        this.stateChangeOnErrorEnabled = z2;
        this.callEnabled = z3;
        this.mobileIdEnabled = z4;
        this.pushEnabled = z5;
        this.smsEnabled = z6;
        this.messengerEnabled = z7;
    }

    public final boolean a() {
        return this.callEnabled;
    }

    public final boolean b() {
        return this.callInEnabled;
    }

    public final Boolean c() {
        return this.callUIEnabled;
    }

    public final String d() {
        return this.externalId;
    }

    public final boolean e() {
        return this.messengerEnabled;
    }

    public final boolean f() {
        return this.mobileIdEnabled;
    }

    public final boolean g() {
        return this.pushEnabled;
    }

    public final boolean h() {
        return this.smsEnabled;
    }

    public final boolean i() {
        return this.stateChangeOnErrorEnabled;
    }

    public /* synthetic */ d(Boolean bool, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3, (i & 32) != 0 ? true : z4, (i & 64) != 0 ? true : z5, (i & 128) != 0 ? true : z6, (i & 256) != 0 ? false : z7);
    }

    public d() {
        this(null, false, null, false, true, true, true, true, false, 4, null);
    }
}
