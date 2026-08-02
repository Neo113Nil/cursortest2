package com.yandex.messaging.activity.calls;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AlertDialog;
import com.squareup.moshi.Moshi;
import com.yandex.alicekit.core.permissions.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.activity.MessengerActivityBase;
import com.yandex.messaging.internal.BackendCompatibilityStatus;
import defpackage.b00;
import defpackage.bwu;
import defpackage.c370;
import defpackage.ccg;
import defpackage.dz2;
import defpackage.e1k;
import defpackage.euq;
import defpackage.f0b0;
import defpackage.gsu;
import defpackage.h0w;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.i5m;
import defpackage.j40;
import defpackage.m020;
import defpackage.md6;
import defpackage.n020;
import defpackage.nka1;
import defpackage.o020;
import defpackage.oyh0;
import defpackage.p020;
import defpackage.p8g;
import defpackage.pvq;
import defpackage.q020;
import defpackage.q5z;
import defpackage.q6v;
import defpackage.sf4;
import defpackage.tje;
import defpackage.uhx;
import defpackage.vbb;
import defpackage.w0i0;
import defpackage.w3i;
import defpackage.wjm;
import defpackage.x22;
import defpackage.xbg;
import defpackage.xf7;
import defpackage.xvf0;
import defpackage.ybg;
import defpackage.zfa;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\u00020\u0001:\u0002\u001b1B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J/\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u00060\u001bR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/yandex/messaging/activity/calls/MessengerCallFeedbackActivity;", "Lcom/yandex/messaging/activity/MessengerActivityBase;", "<init>", "()V", "Lq020;", "component", "Lzy11;", "onDefaultProfile", "(Lq020;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lp020;", "componentDispatcher", "Lp020;", "Lpvq;", "ui$delegate", "Li3y;", "getUi", "()Lpvq;", "ui", "Lcom/yandex/alicekit/core/permissions/b;", "permissionManager", "Lcom/yandex/alicekit/core/permissions/b;", "Lcom/yandex/messaging/ui/calls/feedback/a;", "feedbackBrick", "Lcom/yandex/messaging/ui/calls/feedback/a;", "Le1k;", "backendCompatibilitySubscription", "Le1k;", "getDiComponent", "()Lq020;", "diComponent", "Companion", "n020", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerCallFeedbackActivity extends MessengerActivityBase {
    public static final int $stable = 8;
    public static final n020 Companion = new n020();
    private e1k backendCompatibilitySubscription;
    private com.yandex.messaging.ui.calls.feedback.a feedbackBrick;
    private final p020 componentDispatcher = new p020(this, this);

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui = kotlin.a.a(new m020(0, this));
    private final b permissionManager = new j40(this);

    private final q020 getDiComponent() {
        return this.componentDispatcher.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pvq getUi() {
        return (pvq) this.ui.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDefaultProfile(q020 component) {
        e1k e1kVar = this.backendCompatibilitySubscription;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.backendCompatibilitySubscription = null;
        ccg ccgVar = ((xbg) component).c;
        h3y a = i5m.a(ccgVar.l0);
        Looper J = ccgVar.a.J();
        q5z.h(J);
        this.backendCompatibilitySubscription = new sf4(new h0w(19, a, J), new uhx(14, this));
        xbg xbgVar = (xbg) component;
        ccg ccgVar2 = xbgVar.c;
        xbg xbgVar2 = xbgVar.d;
        MessengerCallFeedbackArguments messengerCallFeedbackArguments = xbgVar2.b;
        xvf0 xvf0Var = xbgVar2.e;
        ybg ybgVar = ccgVar2.z;
        vbb vbbVar = ccgVar2.a;
        p8g p8gVar = (p8g) vbbVar.b;
        xvf0 b = i5m.b(new zfa(xvf0Var, ybgVar, ccgVar2.A, 11));
        Activity activity = (Activity) xbgVar2.e.get();
        o020 o020Var = xbgVar2.a;
        ChatRequest chatRequest = (ChatRequest) xbgVar2.f.get();
        b00 p = vbbVar.p();
        q5z.h(p);
        md6 md6Var = new md6(7, p, (ChatRequest) xbgVar2.f.get());
        com.yandex.messaging.internal.displayname.a aVar = (com.yandex.messaging.internal.displayname.a) b.get();
        Activity activity2 = (Activity) xbgVar2.e.get();
        Context A = vbbVar.A();
        Looper J2 = vbbVar.J();
        q5z.h(J2);
        xf7 P = vbbVar.P();
        q5z.h(P);
        xf7 P2 = vbbVar.P();
        q5z.h(P2);
        com.yandex.messaging.internal.net.a aVar2 = (com.yandex.messaging.internal.net.a) ((p8g) vbbVar.b).n0.get();
        q5z.h(aVar2);
        c370 c370Var = (c370) ((p8g) vbbVar.b).i0.get();
        q5z.h(c370Var);
        x22 s = vbbVar.s();
        q5z.h(s);
        bwu bwuVar = new bwu(P2, aVar2, c370Var, s, vbbVar.K());
        q6v F = vbbVar.F();
        q5z.h(F);
        String str = p8gVar.a;
        q5z.h(str);
        String str2 = (String) ((p8g) vbbVar.b).h0.get();
        q5z.h(str2);
        Moshi N = vbbVar.N();
        q5z.h(N);
        gsu i = p8gVar.i();
        SharedPreferences sharedPreferences = (SharedPreferences) ((p8g) vbbVar.b).r.get();
        q5z.h(sharedPreferences);
        com.yandex.messaging.ui.calls.feedback.a aVar3 = new com.yandex.messaging.ui.calls.feedback.a(activity, o020Var, messengerCallFeedbackArguments, chatRequest, md6Var, aVar, new euq(activity2, new wjm(A, J2, new w3i(P, bwuVar, F, str, str2, N, i, sharedPreferences)), messengerCallFeedbackArguments));
        getUi().c.a(aVar3);
        this.feedbackBrick = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDefaultProfile$lambda$2(MessengerCallFeedbackActivity messengerCallFeedbackActivity, BackendCompatibilityStatus backendCompatibilityStatus) {
        if (backendCompatibilityStatus == BackendCompatibilityStatus.FULL_OUTDATED) {
            AlertDialog.a aVar = new AlertDialog.a(messengerCallFeedbackActivity, w0i0.Messaging_AlertDialog);
            aVar.i(oyh0.messaging_update_required_alert_title);
            aVar.c(oyh0.messaging_update_required_alert_message);
            aVar.setPositiveButton(oyh0.messaging_update_required_alert_update_button_text, new f0b0(messengerCallFeedbackActivity, 1)).setNegativeButton(oyh0.messaging_update_required_alert_cancel_button_text, new dz2(9)).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pvq ui_delegate$lambda$0(MessengerCallFeedbackActivity messengerCallFeedbackActivity) {
        return new pvq(messengerCallFeedbackActivity);
    }

    @Override // com.yandex.messaging.activity.MessengerActivityBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        applyForcedDarkThemeOverlay();
        super.onCreate(savedInstanceState);
        setContentView(getUi().getRoot());
        p020 p020Var = this.componentDispatcher;
        tje.N(nka1.c(p020Var.a), null, null, new MessengerCallFeedbackActivity$onCreate$$inlined$forEachComponent$1(p020Var, null, this), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e1k e1kVar = this.backendCompatibilitySubscription;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.backendCompatibilitySubscription = null;
    }

    @Override // com.yandex.messaging.activity.MessengerActivityBase, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        recreate();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.permissionManager.c(requestCode, permissions, grantResults);
    }
}
