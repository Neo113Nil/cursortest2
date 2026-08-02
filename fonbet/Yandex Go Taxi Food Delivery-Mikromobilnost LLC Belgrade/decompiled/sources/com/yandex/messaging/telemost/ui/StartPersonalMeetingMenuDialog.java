package com.yandex.messaging.telemost.ui;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.telemost.MeetingStartSource;
import com.yandex.messaging.telemost.domain.entities.CreateMeetingParams;
import com.yandex.messaging.views.ExpandedBottomSheetDialog;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.e9h0;
import defpackage.eja1;
import defpackage.ibt;
import defpackage.ih10;
import defpackage.jng0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.sfl0;
import defpackage.tai0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.w270;
import defpackage.wwg0;
import defpackage.y3b1;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u001d\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u00162\u001c\u0010\u001c\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/messaging/telemost/ui/StartPersonalMeetingMenuDialog;", "Lcom/yandex/messaging/views/ExpandedBottomSheetDialog;", "Landroid/app/Activity;", "activity", "Lcom/yandex/messaging/ChatRequest;", "chatRequest", "Libt;", "getPersistentChatUseCase", "Lw270;", "ongoingMeetingInteractor", "Lsfl0;", "router", "<init>", "(Landroid/app/Activity;Lcom/yandex/messaging/ChatRequest;Libt;Lw270;Lsfl0;)V", "Lzy11;", "tryStartVideoCall", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryStartAudioCall", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal$CallType;", "callType", "startMeeting", "(Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams$Personal$CallType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "icon", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "action", "bindRunnableItem", "(IILtls;)V", "Lcom/yandex/messaging/ChatRequest;", "Libt;", "Lw270;", "Lsfl0;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StartPersonalMeetingMenuDialog extends ExpandedBottomSheetDialog {
    public static final int $stable = 8;
    private final ChatRequest chatRequest;
    private final ibt getPersistentChatUseCase;
    private final w270 ongoingMeetingInteractor;
    private final sfl0 router;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.telemost.ui.StartPersonalMeetingMenuDialog$2", f = "StartPersonalMeetingMenuDialog.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.telemost.ui.StartPersonalMeetingMenuDialog$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements tls {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return StartPersonalMeetingMenuDialog.this.new AnonymousClass2(continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                StartPersonalMeetingMenuDialog startPersonalMeetingMenuDialog = StartPersonalMeetingMenuDialog.this;
                this.label = 1;
                if (startPersonalMeetingMenuDialog.tryStartAudioCall(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.telemost.ui.StartPersonalMeetingMenuDialog$3", f = "StartPersonalMeetingMenuDialog.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.telemost.ui.StartPersonalMeetingMenuDialog$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements tls {
        int label;

        public AnonymousClass3(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return StartPersonalMeetingMenuDialog.this.new AnonymousClass3(continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass3) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                StartPersonalMeetingMenuDialog startPersonalMeetingMenuDialog = StartPersonalMeetingMenuDialog.this;
                this.label = 1;
                if (startPersonalMeetingMenuDialog.tryStartVideoCall(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    public StartPersonalMeetingMenuDialog(Activity activity, ChatRequest chatRequest, ibt ibtVar, w270 w270Var, sfl0 sfl0Var) {
        super(activity);
        this.chatRequest = chatRequest;
        this.getPersistentChatUseCase = ibtVar;
        this.ongoingMeetingInteractor = w270Var;
        this.router = sfl0Var;
        setCanceledOnTouchOutside(true);
        setContentView(olh0.msg_d_chat_call_menu);
        Window window = getWindow();
        window.addFlags(131072);
        window.setDimAmount(0.3f);
        bindRunnableItem(e9h0.chat_call_menu_audio_call, wwg0.msg_ic_audio_call, new AnonymousClass2(null));
        bindRunnableItem(e9h0.chat_call_menu_video_call, wwg0.msg_ic_video_call, new AnonymousClass3(null));
    }

    private final void bindRunnableItem(int id, int icon, tls action) {
        TextView textView = (TextView) findViewById(id);
        y3b1.h(icon, jng0.messagingCommonIconsPrimaryColor, textView);
        textView.setVisibility(0);
        textView.setOnClickListener(new tai0(20, this, action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindRunnableItem$lambda$2(StartPersonalMeetingMenuDialog startPersonalMeetingMenuDialog, tls tlsVar, View view) {
        tje.N(eja1.s(startPersonalMeetingMenuDialog), null, null, new StartPersonalMeetingMenuDialog$bindRunnableItem$1$1(tlsVar, startPersonalMeetingMenuDialog, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startMeeting(CreateMeetingParams.Personal.CallType callType, Continuation<? super zy11> continuation) {
        StartPersonalMeetingMenuDialog$startMeeting$1 startPersonalMeetingMenuDialog$startMeeting$1;
        int i;
        String str;
        if (continuation instanceof StartPersonalMeetingMenuDialog$startMeeting$1) {
            startPersonalMeetingMenuDialog$startMeeting$1 = (StartPersonalMeetingMenuDialog$startMeeting$1) continuation;
            int i2 = startPersonalMeetingMenuDialog$startMeeting$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startPersonalMeetingMenuDialog$startMeeting$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startPersonalMeetingMenuDialog$startMeeting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startPersonalMeetingMenuDialog$startMeeting$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.ongoingMeetingInteractor.a.getClass();
                    tpr a = this.getPersistentChatUseCase.a(this.chatRequest);
                    startPersonalMeetingMenuDialog$startMeeting$1.L$0 = this;
                    startPersonalMeetingMenuDialog$startMeeting$1.L$1 = callType;
                    startPersonalMeetingMenuDialog$startMeeting$1.label = 1;
                    obj = e.y(a, startPersonalMeetingMenuDialog$startMeeting$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    callType = (CreateMeetingParams.Personal.CallType) startPersonalMeetingMenuDialog$startMeeting$1.L$1;
                    this = (StartPersonalMeetingMenuDialog) startPersonalMeetingMenuDialog$startMeeting$1.L$0;
                    b.b(obj);
                }
                CreateMeetingParams.Personal.CallType callType2 = callType;
                o1b0 o1b0Var = (o1b0) obj;
                str = o1b0Var.c;
                zy11 zy11Var = zy11.a;
                if (str != null) {
                    z83.i();
                    Toast.makeText(this.getContext(), oyh0.error_default, 0).show();
                    return zy11Var;
                }
                sfl0 sfl0Var = this.router;
                new CreateMeetingParams.Personal(o1b0Var.c, callType2, null, false, 12, null);
                ih10 ih10Var = MeetingStartSource.Companion;
                String str2 = o1b0Var.b;
                ih10Var.getClass();
                new MeetingStartSource("start_personal_meeting_menu", str2, null);
                sfl0Var.getClass();
                return zy11Var;
            }
        }
        startPersonalMeetingMenuDialog$startMeeting$1 = new StartPersonalMeetingMenuDialog$startMeeting$1(this, continuation);
        Object obj2 = startPersonalMeetingMenuDialog$startMeeting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startPersonalMeetingMenuDialog$startMeeting$1.label;
        if (i != 0) {
        }
        CreateMeetingParams.Personal.CallType callType22 = callType;
        o1b0 o1b0Var2 = (o1b0) obj2;
        str = o1b0Var2.c;
        zy11 zy11Var2 = zy11.a;
        if (str != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object tryStartAudioCall(Continuation<? super zy11> continuation) {
        Object startMeeting = startMeeting(CreateMeetingParams.Personal.CallType.Audio, continuation);
        return startMeeting == CoroutineSingletons.COROUTINE_SUSPENDED ? startMeeting : zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object tryStartVideoCall(Continuation<? super zy11> continuation) {
        Object startMeeting = startMeeting(CreateMeetingParams.Personal.CallType.Video, continuation);
        return startMeeting == CoroutineSingletons.COROUTINE_SUSPENDED ? startMeeting : zy11.a;
    }
}
