package com.yandex.go.taxi.order.chat.ui.chat;

import android.app.Activity;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.chat.analytics.evgen.ChatAnalytics$CloseReasonV2;
import com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.ButtonModifierDTO;
import defpackage.a3y0;
import defpackage.a980;
import defpackage.avj0;
import defpackage.bk;
import defpackage.bzx0;
import defpackage.c3y0;
import defpackage.ce0;
import defpackage.czx0;
import defpackage.dg7;
import defpackage.e230;
import defpackage.eg7;
import defpackage.evu0;
import defpackage.ezx0;
import defpackage.ff2;
import defpackage.gs10;
import defpackage.h270;
import defpackage.hg7;
import defpackage.hpo0;
import defpackage.hs10;
import defpackage.hst;
import defpackage.isa0;
import defpackage.jst;
import defpackage.jv10;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.n20;
import defpackage.n8h0;
import defpackage.ney;
import defpackage.ngd0;
import defpackage.o2y0;
import defpackage.pav;
import defpackage.pj;
import defpackage.pw0;
import defpackage.pzt0;
import defpackage.rji0;
import defpackage.rp31;
import defpackage.rs2;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.vb3;
import defpackage.w130;
import defpackage.w511;
import defpackage.wy10;
import defpackage.x5s0;
import defpackage.xkh0;
import defpackage.xw31;
import defpackage.yh70;
import defpackage.zy11;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.utils.RecyclerShadowController$Type;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010\u0016J\u000f\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b)\u0010\u0016J\u000f\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010\u0016J\u000f\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0016J\u000f\u0010,\u001a\u00020\u0014H\u0014¢\u0006\u0004\b,\u0010\u0016J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010\u0016J\u000f\u00102\u001a\u00020\u0014H\u0016¢\u0006\u0004\b2\u0010\u0016J\u0017\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H\u0016¢\u0006\u0004\b7\u0010\u0016J\u000f\u00108\u001a\u00020\u0014H\u0016¢\u0006\u0004\b8\u0010\u0016J\u000f\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010\u0016J\u000f\u0010:\u001a\u00020\u0014H\u0016¢\u0006\u0004\b:\u0010\u0016J\u000f\u0010;\u001a\u00020\u0014H\u0016¢\u0006\u0004\b;\u0010\u0016J\u000f\u0010<\u001a\u00020$H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u000203H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0014H\u0002¢\u0006\u0004\b@\u0010\u0016J\u0017\u0010B\u001a\u00020\u00142\u0006\u0010A\u001a\u000203H\u0002¢\u0006\u0004\bB\u00106J\u0019\u0010C\u001a\u00020\u00142\b\b\u0002\u0010A\u001a\u000203H\u0002¢\u0006\u0004\bC\u00106J\u0017\u0010F\u001a\u00020\u00142\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010%\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010PR\u0014\u0010Q\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010NR\u0014\u0010R\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010NR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010NR\u0014\u0010Z\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010NR\u0014\u0010[\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010NR\u0014\u0010\\\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010NR\u0014\u0010]\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010NR\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010l\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010k\u001a\u0004\bm\u0010?\"\u0004\bn\u00106R\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006r"}, d2 = {"Lcom/yandex/go/taxi/order/chat/ui/chat/TaxiOrderChatModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lezx0;", "Landroid/app/Activity;", "activity", "Lcom/yandex/go/taxi/order/chat/ui/chat/a;", "presenter", "Lgs10;", "diffDispatcher", "Lney;", "lifecycleObservable", "Lrs2;", "appCredentials", "Lpav;", "imageLoader", "<init>", "(Landroid/app/Activity;Lcom/yandex/go/taxi/order/chat/ui/chat/a;Lgs10;Lney;Lrs2;Lpav;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onAppearAnimationComplete", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "showComing", "hideComing", "showCallButton", "hideCallButton", "onBackPressed", "Lwy10;", "messages", "invalidateMessages", "(Lwy10;)V", "hidePlaceholder", "showPlaceholder", "", "show", "setTranslationInfoVisibility", "(Z)V", "hideSendButton", "showSendButton", "addGreeting", "closeKeyboard", "dismiss", "screenName", "()Ljava/lang/String;", "canHandleScreenTracking", "()Z", "send", "smooth", "onNewMessage", "scrollToEnd", "Lt1w;", "insets", "onInsetsChanged", "(Lt1w;)V", "Lcom/yandex/go/taxi/order/chat/ui/chat/a;", "Lney;", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "statusBar", "Landroid/view/View;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "dismissButton", "translationInfo", "Landroidx/recyclerview/widget/RecyclerView;", "messageList", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "messageInput", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "sendView", "comingView", "callView", "loadingPlaceholder", "shadowView", "Lhs10;", "adapter", "Lhs10;", "Lh270;", "onFirstMessagesPart", "Lh270;", "Lc3y0;", "taxiOrderMessageItemAnimator", "Lc3y0;", "Lrji0;", "recyclerShadowController", "Lrji0;", "insetChangedFirstTime", "Z", "showKeyboard", "getShowKeyboard", "setShowKeyboard", "Landroid/text/TextWatcher;", "messageInputChangeListener", "Landroid/text/TextWatcher;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public class TaxiOrderChatModalView extends ModalView implements ezx0 {
    private final hs10 adapter;
    private final View callView;
    private final View comingView;
    private final ViewGroup content;
    private final View dismissButton;
    private boolean insetChangedFirstTime;
    private final ney lifecycleObservable;
    private final View loadingPlaceholder;
    private final KeyboardAwareRobotoEditText messageInput;
    private final TextWatcher messageInputChangeListener;
    private final RecyclerView messageList;
    private final h270 onFirstMessagesPart;
    private final a presenter;
    private rji0 recyclerShadowController;
    private final View sendView;
    private final View shadowView;
    private boolean showKeyboard;
    private final View statusBar;
    private final c3y0 taxiOrderMessageItemAnimator;
    private final TextView title;
    private final View translationInfo;

    public TaxiOrderChatModalView(Activity activity, a aVar, gs10 gs10Var, ney neyVar, rs2 rs2Var, pav pavVar) {
        super(activity);
        this.presenter = aVar;
        this.lifecycleObservable = neyVar;
        final int i = 1;
        c.q(this, xkh0.chat_modal_view, true);
        int i2 = n8h0.content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.content = (ViewGroup) ((View) rp31.d(this, i2));
        this.statusBar = (View) rp31.d(this, n8h0.status_bar);
        this.title = (TextView) ((View) rp31.d(this, n8h0.title));
        View view = (View) rp31.d(this, n8h0.dismiss);
        this.dismissButton = view;
        this.translationInfo = (View) rp31.d(this, n8h0.translation_info);
        this.messageList = (RecyclerView) ((View) rp31.d(this, n8h0.messages));
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = (KeyboardAwareRobotoEditText) ((View) rp31.d(this, n8h0.message_input));
        this.messageInput = keyboardAwareRobotoEditText;
        View view2 = (View) rp31.d(this, n8h0.send);
        this.sendView = view2;
        View view3 = (View) rp31.d(this, n8h0.coming);
        this.comingView = view3;
        View view4 = (View) rp31.d(this, n8h0.chat_call_button);
        this.callView = view4;
        this.loadingPlaceholder = (View) rp31.d(this, n8h0.loading_placeholder);
        this.shadowView = (View) rp31.d(this, n8h0.messages_bottom_shadow);
        this.onFirstMessagesPart = new h270();
        c3y0 c3y0Var = new c3y0();
        this.taxiOrderMessageItemAnimator = c3y0Var;
        this.insetChangedFirstTime = true;
        keyboardAwareRobotoEditText.setFocusableInTouchMode(true);
        this.adapter = new hs10(gs10Var, getResources(), c3y0Var, new x5s0(13, aVar), pavVar, rs2Var);
        final int i3 = 0;
        c.z(new sls(this) { // from class: dzx0
            public final /* synthetic */ TaxiOrderChatModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                zy11 _init_$lambda$2;
                zy11 _init_$lambda$3;
                int i4 = i3;
                TaxiOrderChatModalView taxiOrderChatModalView = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = TaxiOrderChatModalView._init_$lambda$0(taxiOrderChatModalView);
                        return _init_$lambda$0;
                    case 1:
                        _init_$lambda$1 = TaxiOrderChatModalView._init_$lambda$1(taxiOrderChatModalView);
                        return _init_$lambda$1;
                    case 2:
                        _init_$lambda$2 = TaxiOrderChatModalView._init_$lambda$2(taxiOrderChatModalView);
                        return _init_$lambda$2;
                    default:
                        _init_$lambda$3 = TaxiOrderChatModalView._init_$lambda$3(taxiOrderChatModalView);
                        return _init_$lambda$3;
                }
            }
        }, view);
        c.z(new sls(this) { // from class: dzx0
            public final /* synthetic */ TaxiOrderChatModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                zy11 _init_$lambda$2;
                zy11 _init_$lambda$3;
                int i4 = i;
                TaxiOrderChatModalView taxiOrderChatModalView = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = TaxiOrderChatModalView._init_$lambda$0(taxiOrderChatModalView);
                        return _init_$lambda$0;
                    case 1:
                        _init_$lambda$1 = TaxiOrderChatModalView._init_$lambda$1(taxiOrderChatModalView);
                        return _init_$lambda$1;
                    case 2:
                        _init_$lambda$2 = TaxiOrderChatModalView._init_$lambda$2(taxiOrderChatModalView);
                        return _init_$lambda$2;
                    default:
                        _init_$lambda$3 = TaxiOrderChatModalView._init_$lambda$3(taxiOrderChatModalView);
                        return _init_$lambda$3;
                }
            }
        }, view2);
        final int i4 = 2;
        c.z(new sls(this) { // from class: dzx0
            public final /* synthetic */ TaxiOrderChatModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                zy11 _init_$lambda$2;
                zy11 _init_$lambda$3;
                int i42 = i4;
                TaxiOrderChatModalView taxiOrderChatModalView = this.b;
                switch (i42) {
                    case 0:
                        _init_$lambda$0 = TaxiOrderChatModalView._init_$lambda$0(taxiOrderChatModalView);
                        return _init_$lambda$0;
                    case 1:
                        _init_$lambda$1 = TaxiOrderChatModalView._init_$lambda$1(taxiOrderChatModalView);
                        return _init_$lambda$1;
                    case 2:
                        _init_$lambda$2 = TaxiOrderChatModalView._init_$lambda$2(taxiOrderChatModalView);
                        return _init_$lambda$2;
                    default:
                        _init_$lambda$3 = TaxiOrderChatModalView._init_$lambda$3(taxiOrderChatModalView);
                        return _init_$lambda$3;
                }
            }
        }, view3);
        final int i5 = 3;
        c.z(new sls(this) { // from class: dzx0
            public final /* synthetic */ TaxiOrderChatModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                zy11 _init_$lambda$2;
                zy11 _init_$lambda$3;
                int i42 = i5;
                TaxiOrderChatModalView taxiOrderChatModalView = this.b;
                switch (i42) {
                    case 0:
                        _init_$lambda$0 = TaxiOrderChatModalView._init_$lambda$0(taxiOrderChatModalView);
                        return _init_$lambda$0;
                    case 1:
                        _init_$lambda$1 = TaxiOrderChatModalView._init_$lambda$1(taxiOrderChatModalView);
                        return _init_$lambda$1;
                    case 2:
                        _init_$lambda$2 = TaxiOrderChatModalView._init_$lambda$2(taxiOrderChatModalView);
                        return _init_$lambda$2;
                    default:
                        _init_$lambda$3 = TaxiOrderChatModalView._init_$lambda$3(taxiOrderChatModalView);
                        return _init_$lambda$3;
                }
            }
        }, view4);
        setDismissOnBackPressed(false);
        this.messageInputChangeListener = new TextWatcher() { // from class: com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView$messageInputChangeListener$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                a aVar2;
                aVar2 = TaxiOrderChatModalView.this.presenter;
                ezx0 ezx0Var = (ezx0) aVar2.Dg();
                if (aVar2.Eg()) {
                    if (!aVar2.R && aVar2.Q && !aVar2.S && (s == null || evu0.J(s))) {
                        aVar2.S = true;
                        TaxiOrder taxiOrder = aVar2.x;
                        taxiOrder.getClass();
                        synchronized (taxiOrder) {
                            TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                            taxiOrderLocalData.getClass();
                            taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -2049, 16777215);
                        }
                        aVar2.E.g(aVar2.x);
                        tje.N(aVar2.Jg(), null, null, new TaxiOrderChatPresenter$onTextChanged$1(aVar2, null), 3);
                        pj pjVar = aVar2.C;
                        String str = aVar2.x.a;
                        pjVar.getClass();
                        HashMap hashMap = new HashMap();
                        if (str != null) {
                            hashMap.put("order_id", str);
                        }
                        pjVar.a.a("Chat.GreetingClearedByUser", hashMap, 1, new HashMap());
                    }
                    if (s == null || evu0.J(s)) {
                        ezx0Var.hideSendButton();
                    } else {
                        ezx0Var.showSendButton();
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(TaxiOrderChatModalView taxiOrderChatModalView) {
        a aVar = taxiOrderChatModalView.presenter;
        ezx0 ezx0Var = (ezx0) aVar.Dg();
        if (aVar.Eg()) {
            pj.b(aVar.C, null, ChatAnalytics$CloseReasonV2.Button, HProv.PP_DELETE_KEYSET);
            ezx0Var.dismiss();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(TaxiOrderChatModalView taxiOrderChatModalView) {
        taxiOrderChatModalView.send();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(TaxiOrderChatModalView taxiOrderChatModalView) {
        a aVar = taxiOrderChatModalView.presenter;
        ezx0 ezx0Var = (ezx0) aVar.Dg();
        if (aVar.Eg()) {
            ezx0Var.hideComing();
        }
        pj pjVar = aVar.C;
        pjVar.getClass();
        pjVar.a.a("Chat.ComingSoon", new HashMap(), 1, new HashMap());
        aVar.B.a(aVar.x);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(TaxiOrderChatModalView taxiOrderChatModalView) {
        a aVar = taxiOrderChatModalView.presenter;
        if (aVar.Eg()) {
            yh70 yh70Var = aVar.D;
            yh70Var.getClass();
            yh70Var.a.a("OrderChat.PhoneCall", new HashMap(), 1, new HashMap());
            ((ezx0) aVar.Dg()).closeKeyboard();
            ((com.yandex.go.taxi.order.delegates.a) aVar.G).c(aVar.x, null);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$retry(a aVar, jv10 jv10Var) {
        aVar.getClass();
        isa0 a = jv10Var.a();
        if (a == null) {
            a3y0.d(aVar.N, "retry", new IllegalStateException("No pending message is associated with model"), null, 4);
            return;
        }
        com.yandex.go.taxi.order.chat.domain.a aVar2 = aVar.y;
        String str = aVar.x.a;
        aVar2.getClass();
        aVar2.b(new hpo0(11, aVar2, str, a));
        pj pjVar = aVar.C;
        pjVar.getClass();
        pjVar.a.a("Chat.Retry", new HashMap(), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidateMessages$lambda$0(TaxiOrderChatModalView taxiOrderChatModalView) {
        int width = (taxiOrderChatModalView.content.getWidth() * 3) / 4;
        hs10 hs10Var = taxiOrderChatModalView.adapter;
        hs10Var.z = width;
        hs10Var.x.c = width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$2(TaxiOrderChatModalView taxiOrderChatModalView, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return true;
        }
        taxiOrderChatModalView.send();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$3(TaxiOrderChatModalView taxiOrderChatModalView, View view, boolean z) {
        if (z) {
            taxiOrderChatModalView.showKeyboard = true;
            a aVar = taxiOrderChatModalView.presenter;
            if (aVar.Q || aVar.R || aVar.S) {
                return;
            }
            ((ezx0) aVar.Dg()).addGreeting();
            aVar.Q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInsetsChanged(t1w insets) {
        View view = this.statusBar;
        int i = insets.b;
        Rect rect = xw31.a;
        c.C(i, view);
        xw31.y(insets.g, this.content);
        if (this.showKeyboard && insets.f) {
            scrollToEnd(!this.insetChangedFirstTime);
            this.insetChangedFirstTime = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewMessage(boolean smooth) {
        if (smooth) {
            this.messageList.postOnAnimation(new czx0(this, 1));
        } else {
            scrollToEnd(false);
        }
    }

    private final void scrollToEnd(boolean smooth) {
        if (this.adapter.y.size() > 0) {
            RecyclerView recyclerView = this.messageList;
            if (smooth) {
                recyclerView.smoothScrollToPosition(0);
            } else {
                recyclerView.scrollToPosition(0);
            }
        }
    }

    public static /* synthetic */ void scrollToEnd$default(TaxiOrderChatModalView taxiOrderChatModalView, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: scrollToEnd");
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        taxiOrderChatModalView.scrollToEnd(z);
    }

    private final void send() {
        Editable text = this.messageInput.getText();
        a aVar = this.presenter;
        String obj = text != null ? text.toString() : null;
        aVar.getClass();
        if (obj == null || evu0.J(obj)) {
            return;
        }
        aVar.N.getClass();
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar = jst.e;
        com.yandex.go.taxi.order.chat.domain.a aVar2 = aVar.y;
        String str = aVar.x.a;
        String obj2 = evu0.k0(obj).toString();
        aVar2.getClass();
        aVar2.b(new bzx0(aVar2, str, obj2, 1));
        if (!aVar.R) {
            TaxiOrder taxiOrder = aVar.x;
            taxiOrder.getClass();
            synchronized (taxiOrder) {
                TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                taxiOrderLocalData.getClass();
                taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1025, 16777215);
            }
            aVar.E.g(aVar.x);
            tje.N(aVar.Jg(), null, null, new TaxiOrderChatPresenter$sendMessage$2(aVar, null), 3);
            aVar.R = true;
            String i = ((avj0) aVar.z).i(kyh0.chat_automatic_greeting, "");
            if (aVar.Q && !aVar.S && evu0.y(obj, i, false)) {
                pj pjVar = aVar.C;
                String str2 = aVar.x.a;
                pjVar.getClass();
                HashMap hashMap = new HashMap();
                if (str2 != null) {
                    hashMap.put("order_id", str2);
                }
                pjVar.a.a("Chat.MessageWithGreetingSent", hashMap, 1, new HashMap());
            }
        }
        ezx0 ezx0Var = (ezx0) aVar.Dg();
        if (aVar.Eg()) {
            ezx0Var.setText("");
        }
        pj pjVar2 = aVar.C;
        pjVar2.getClass();
        pjVar2.a.a("Chat.SendMessage", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.ezx0
    public void addGreeting() {
        Editable text = this.messageInput.getText();
        this.messageInput.setText(getContext().getString(kyh0.chat_automatic_greeting, text != null ? text.toString() : null));
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.messageInput;
        keyboardAwareRobotoEditText.setSelection(keyboardAwareRobotoEditText.length());
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // defpackage.ezx0
    public void closeKeyboard() {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.messageInput;
        if (keyboardAwareRobotoEditText != null) {
            keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
        }
        this.messageInput.clearFocus();
        requestFocus();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        post(new ce0(this, 15));
        super.dismiss();
    }

    public final boolean getShowKeyboard() {
        return this.showKeyboard;
    }

    @Override // defpackage.ezx0
    public void hideCallButton() {
        this.callView.setVisibility(8);
        rji0 rji0Var = this.recyclerShadowController;
        if (rji0Var != null) {
            this.shadowView.setVisibility(8);
            rji0Var.c();
            this.recyclerShadowController = null;
        }
    }

    @Override // defpackage.ezx0
    public void hideComing() {
        this.comingView.setVisibility(8);
    }

    @Override // defpackage.ezx0
    public void hidePlaceholder() {
        this.loadingPlaceholder.setVisibility(8);
    }

    @Override // defpackage.ezx0
    public void hideSendButton() {
        this.sendView.setVisibility(4);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new TaxiOrderChatModalView$insetsType$1(1, this, TaxiOrderChatModalView.class, "onInsetsChanged", "onInsetsChanged(Lru/yandex/taxi/utils/Insets;)V", 0));
    }

    @Override // defpackage.ezx0
    public void invalidateMessages(wy10 messages) {
        this.onFirstMessagesPart.a(new czx0(this, 0));
        hs10 hs10Var = this.adapter;
        x5s0 x5s0Var = new x5s0(12, this);
        gs10 gs10Var = hs10Var.a;
        gs10Var.getClass();
        List list = hs10Var.y;
        pzt0 pzt0Var = gs10Var.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        gs10Var.e = tje.N(gs10Var.a, null, null, new MessageAdapter$DiffDispatcher$dispatchUpdates$1(gs10Var, hs10Var, messages, list, x5s0Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        setBackgroundColor(getContext().getColor(mqg0.white));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        String str;
        o2y0 o2y0Var;
        super.onAttachedToWindow();
        announceForAccessibility(this.title.getText());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.c2(true);
        this.messageList.setAdapter(this.adapter);
        this.messageList.setLayoutManager(linearLayoutManager);
        this.messageList.setHasFixedSize(true);
        c3y0 c3y0Var = this.taxiOrderMessageItemAnimator;
        c3y0Var.g = false;
        this.messageList.setItemAnimator(c3y0Var);
        this.messageInput.setOnCloseListener(new pw0(9, this));
        this.messageInput.setImeOptions(4);
        int i = 15;
        this.messageInput.setOnEditorActionListener(new ff2(i, this));
        this.messageInput.setOnFocusChangeListener(new bk(28, this));
        ru.yandex.taxi.widget.b n = ngd0.n(this.title, null, 0);
        n.d(9.0f, 1);
        n.c(true);
        a aVar = this.presenter;
        aVar.Bg(this);
        hideSendButton();
        hg7 hg7Var = aVar.H;
        TaxiOrder taxiOrder = aVar.x;
        hg7Var.a.getClass();
        dg7 a = eg7.a(taxiOrder);
        if (a.c) {
            ButtonModifierDTO buttonModifierDTO = a.a;
            if (!(buttonModifierDTO != null ? buttonModifierDTO.b : false)) {
                showCallButton();
                int i2 = kyh0.order_action_communication_with_driver;
                a980 a980Var = aVar.F;
                String h = ((avj0) aVar.z).h(i2);
                str = taxiOrder.a;
                if (str == null) {
                    o2y0Var = ((com.yandex.go.taxi.order.provider.a) ((n20) a980Var.a.get())).n(str);
                } else {
                    a980Var.getClass();
                    o2y0Var = null;
                }
                if (o2y0Var != null) {
                    h = a980Var.a(o2y0Var, h);
                }
                setTitle(h);
                tje.N(aVar.Jg(), null, null, new TaxiOrderChatPresenter$attachView$1(aVar, null), 3);
                this.messageInput.addTextChangedListener(this.messageInputChangeListener);
                this.lifecycleObservable.a(new vb3(i, this), this);
            }
        }
        hideCallButton();
        int i22 = kyh0.order_action_communication_with_driver;
        a980 a980Var2 = aVar.F;
        String h2 = ((avj0) aVar.z).h(i22);
        str = taxiOrder.a;
        if (str == null) {
        }
        if (o2y0Var != null) {
        }
        setTitle(h2);
        tje.N(aVar.Jg(), null, null, new TaxiOrderChatPresenter$attachView$1(aVar, null), 3);
        this.messageInput.addTextChangedListener(this.messageInputChangeListener);
        this.lifecycleObservable.a(new vb3(i, this), this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        a aVar = this.presenter;
        ezx0 ezx0Var = (ezx0) aVar.Dg();
        if (aVar.Eg()) {
            pj.b(aVar.C, ChatAnalytics$CloseReasonV2.Back, null, HProv.PP_DELETE_SAVED_PASSWD);
            ezx0Var.dismiss();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycleObservable.d(this);
        this.presenter.Cg();
        this.messageInput.removeTextChangedListener(this.messageInputChangeListener);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        if (this.showKeyboard) {
            this.messageInput.requestFocus();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "order_chat";
    }

    public final void setShowKeyboard(boolean z) {
        this.showKeyboard = z;
    }

    @Override // defpackage.ezx0
    public void setText(CharSequence text) {
        this.messageInput.setText(text);
        this.messageInput.setSelection(text != null ? text.length() : 0);
    }

    @Override // defpackage.ezx0
    public void setTitle(String title) {
        this.title.setText(title);
    }

    @Override // defpackage.ezx0
    public void setTranslationInfoVisibility(boolean show) {
        this.translationInfo.setVisibility(show ? 0 : 8);
    }

    @Override // defpackage.ezx0
    public void showCallButton() {
        if (this.recyclerShadowController == null) {
            this.shadowView.setVisibility(0);
            rji0 rji0Var = new rji0(RecyclerShadowController$Type.BOTTOM);
            rji0Var.a(this.shadowView, this.messageList);
            this.recyclerShadowController = rji0Var;
        }
        this.callView.setVisibility(0);
    }

    @Override // defpackage.ezx0
    public void showComing() {
        this.comingView.setVisibility(0);
    }

    @Override // defpackage.ezx0
    public void showPlaceholder() {
        this.loadingPlaceholder.setVisibility(0);
    }

    @Override // defpackage.ezx0
    public void showSendButton() {
        this.sendView.setVisibility(0);
    }
}
