package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.text.contextmenu.modifier.b;
import androidx.compose.material.e;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView;
import com.yandex.go.taxi.order.chat.api.data.model.Sender;
import com.yandex.go.taxi.order.listener.TaxiOrderSentActivityListener$orderSentReceiver$1;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedView;
import com.yandex.go.taxi.order.support.ui.details.SupportDetailsModalView;
import com.yandex.go.taxi.order.support.ui.support_menu.SupportMenuModalView;
import com.yandex.go.taxi.order.tariff_upgrade.ui.TariffUpgradeModalView;
import com.yandex.go.tips.ui.error.TipsErrorModalView;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.g;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.h;
import com.yandex.messaging.internal.view.timeline.overlay.f;
import com.yandex.messaging.ui.chatinfo.mediabrowser.ui.MediaBrowserTab;
import com.yandex.messaging.views.TextSwitcherView;
import com.yandex.plus.animation.taxi.TaxiAnimationLayout;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.order.modals.impl.presentation.TaxiOrderPopupView;
import ru.yandex.taxi.surge.dialog.SurgeInfoModalView;
import ru.yandex.taxi.surge.dialog.TextBlockView;
import ru.yandex.taxi.widget.TimerTextView;

/* loaded from: classes15.dex */
public final /* synthetic */ class oew0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oew0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View insetsType$lambda$0;
        View insetsType$lambda$02;
        View insetsType$lambda$03;
        zy11 loadImage$lambda$1;
        float halfWidth_delegate$lambda$0;
        f1y0 feedScrollListener_delegate$lambda$0;
        View insetsType$lambda$04;
        String onReceive$lambda$0;
        pry0 textMiddleEllipsizer_delegate$lambda$0;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        zy11 outAnimation$lambda$5;
        zy11 tickSchedule$lambda$0;
        zy11 onAttachedToWindow$lambda$1$0;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(tje.r(qug0.superapp_searchbar_size_collapsed, ((SuperappSearchbarContainerView) obj).getContext()));
            case 1:
                insetsType$lambda$0 = SupportDetailsModalView.insetsType$lambda$0((SupportDetailsModalView) obj);
                return insetsType$lambda$0;
            case 2:
                ((xiw0) obj).h();
                return zy11Var;
            case 3:
                insetsType$lambda$02 = SupportMenuModalView.insetsType$lambda$0((SupportMenuModalView) obj);
                return insetsType$lambda$02;
            case 4:
                insetsType$lambda$03 = SurgeInfoModalView.insetsType$lambda$0((SurgeInfoModalView) obj);
                return insetsType$lambda$03;
            case 5:
                return (Map) ((e) obj).h.getValue();
            case 6:
                loadImage$lambda$1 = TariffUpgradeModalView.loadImage$lambda$1((TariffUpgradeModalView) obj);
                return loadImage$lambda$1;
            case 7:
                halfWidth_delegate$lambda$0 = TaxiAnimationLayout.halfWidth_delegate$lambda$0((TaxiAnimationLayout) obj);
                return Float.valueOf(halfWidth_delegate$lambda$0);
            case 8:
                return String.format("make request [%s]", Arrays.copyOf(new Object[]{((ro70) obj).b}, 1));
            case 9:
                feedScrollListener_delegate$lambda$0 = TaxiOrderFeedView.feedScrollListener_delegate$lambda$0((TaxiOrderFeedView) obj);
                return feedScrollListener_delegate$lambda$0;
            case 10:
                return "Unsupported sender role " + ((Sender.Role) obj) + " for location message";
            case 11:
                insetsType$lambda$04 = TaxiOrderPopupView.insetsType$lambda$0((TaxiOrderPopupView) obj);
                return insetsType$lambda$04;
            case 12:
                onReceive$lambda$0 = TaxiOrderSentActivityListener$orderSentReceiver$1.onReceive$lambda$0((Intent) obj);
                return onReceive$lambda$0;
            case 13:
                return new ru8((i8y0) obj);
            case 14:
                Set<String> stringSet = ((tgy0) obj).a.getStringSet("TEST_IDS_KEY", null);
                return stringSet == null ? new LinkedHashSet() : stringSet;
            case 15:
                yjy0 yjy0Var = (yjy0) obj;
                yjy0Var.K = null;
                qje.P(yjy0Var).D();
                qje.P(yjy0Var).C();
                rzo.D(yjy0Var);
                return Boolean.TRUE;
            case 16:
                textMiddleEllipsizer_delegate$lambda$0 = TextBlockView.textMiddleEllipsizer_delegate$lambda$0((TextBlockView) obj);
                return textMiddleEllipsizer_delegate$lambda$0;
            case 17:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                } else {
                    actionIntent.send();
                }
                return zy11Var;
            case 18:
                oly0 oly0Var = (oly0) obj;
                return oly0Var.isAttached() ? b.a(oly0Var) : zky0.b;
            case 19:
                return new z5w(((f6w) obj).c());
            case 20:
                aty0 aty0Var = (aty0) obj;
                aty0Var.F = null;
                qje.P(aty0Var).D();
                qje.P(aty0Var).C();
                rzo.D(aty0Var);
                return Boolean.TRUE;
            case 21:
                return Long.valueOf(SystemClock.elapsedRealtime() - ((qty0) obj).c);
            case 22:
                outAnimation$lambda$5 = TextSwitcherView.setOutAnimation$lambda$5((TextSwitcherView) obj);
                return outAnimation$lambda$5;
            case 23:
                f fVar = (f) obj;
                ViewGroup viewGroup = fVar.D;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_v_thread_counter_label, viewGroup, false);
                if (inflate == null) {
                    ny61.t("null cannot be cast to non-null type android.view.View");
                    return null;
                }
                inflate.setOnClickListener(new vmu0(10, fVar));
                TextView textView = (TextView) inflate.findViewById(e9h0.counter);
                return new wxy0(inflate, textView, inflate.findViewById(e9h0.dot), textView.getCompoundDrawablesRelative()[2], textView.getPaddingEnd(), textView.getPaddingStart());
            case 24:
                return IconCompat.b(ffx.d0(rm91.d(vqb1.e(wwg0.msg_ic_thread_white_notification, ((g) obj).a), -1), 0, 0, 7));
            case 25:
                return IconCompat.b(ffx.d0(rm91.d(vqb1.e(wwg0.msg_ic_thread_white_notification, ((h) obj).a), -1), 0, 0, 7));
            case 26:
                com.yandex.messaging.ui.timeline.f fVar2 = (com.yandex.messaging.ui.timeline.f) obj;
                com.yandex.messaging.ui.timeline.b bVar = fVar2.I;
                odz0 odz0Var = fVar2.A;
                bVar.getClass();
                bVar.c(new d8b(bVar, i2));
                j3b j3bVar = fVar2.W;
                if (j3bVar != null) {
                    String str = j3bVar.b;
                    if (j3bVar.J) {
                        ThreadChat threadChat = new ThreadChat(str);
                        sfl0.a(odz0Var.b, new q6b(d720.d, threadChat.parent(), new ServerMessageRef(threadChat.parentChatId(), threadChat.parentMessageTimestamp()), null, null, 2097132), 4);
                    } else {
                        boolean z = j3bVar.G;
                        if (z) {
                            d720 d720Var = d720.d;
                            odz0Var.getClass();
                            ExistingChatRequest a = p8b.a(str);
                            gb10 gb10Var = MediaBrowserTab.Companion;
                            new k9x(d720Var, a);
                            odz0Var.b.getClass();
                        } else {
                            d720 d720Var2 = d720.d;
                            sfl0 sfl0Var = odz0Var.b;
                            if (j3bVar.C) {
                                String str2 = j3bVar.e;
                                if (str2 == null || z) {
                                    new w6r0(d720Var2, false);
                                    sfl0Var.getClass();
                                } else {
                                    new bae(d720Var2, str, str2);
                                    ((b0x) sfl0Var).c();
                                }
                            } else {
                                new k3b(d720Var2, str, str);
                                ((b0x) sfl0Var).a.getClass();
                            }
                        }
                    }
                }
                return zy11Var;
            case 27:
                return new jum(((jbz0) obj).h);
            case 28:
                tickSchedule$lambda$0 = TimerTextView.tickSchedule$lambda$0((TimerTextView) obj);
                return tickSchedule$lambda$0;
            default:
                onAttachedToWindow$lambda$1$0 = TipsErrorModalView.onAttachedToWindow$lambda$1$0((TipsErrorModalView) obj);
                return onAttachedToWindow$lambda$1$0;
        }
    }
}
