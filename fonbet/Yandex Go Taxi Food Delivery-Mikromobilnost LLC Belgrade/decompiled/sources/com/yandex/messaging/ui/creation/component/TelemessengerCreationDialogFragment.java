package com.yandex.messaging.ui.creation.component;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import defpackage.bts;
import defpackage.ccg;
import defpackage.did;
import defpackage.ei9;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gdy0;
import defpackage.gtq0;
import defpackage.hdy0;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.idy0;
import defpackage.j1b;
import defpackage.k1b;
import defpackage.k9x;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pk3;
import defpackage.r720;
import defpackage.sls;
import defpackage.t4v0;
import defpackage.tfx;
import defpackage.tls;
import defpackage.x1b;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/yandex/messaging/ui/creation/component/TelemessengerCreationDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lk9x;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lj1b;", "arguments", "Lzy11;", "onCreateChat", "(Lj1b;)V", "Lx1b;", "onCreateChannel", "(Lx1b;)V", "Lf530;", "modifier", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "()V", "Lpk3;", "authStarterBrick", "Lpk3;", "Li3y;", "Lhdy0;", "viewComponentDelegate", "Li3y;", "getViewComponent", "()Lhdy0;", "viewComponent", "Lk1b;", "getChatCreateAuthProcessor", "()Lk1b;", "chatCreateAuthProcessor", "Lei9;", "getChannelCreateAuthProcessor", "()Lei9;", "channelCreateAuthProcessor", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TelemessengerCreationDialogFragment extends ComposeBottomSheetDialogFragment<k9x> {
    public static final int $stable = 8;
    private pk3 authStarterBrick;
    private final i3y viewComponentDelegate;

    public TelemessengerCreationDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
        this.viewComponentDelegate = kotlin.a.a(new i5y0(3, this, nohVar));
    }

    private final ei9 getChannelCreateAuthProcessor() {
        getViewComponent();
        throw null;
    }

    private final k1b getChatCreateAuthProcessor() {
        getViewComponent();
        throw null;
    }

    private final hdy0 getViewComponent() {
        if (this.viewComponentDelegate.getValue() == null) {
            return null;
        }
        ny61.u();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCreateChannel(x1b arguments) {
        getChannelCreateAuthProcessor();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCreateChat(j1b arguments) {
        getChatCreateAuthProcessor().o = new TelemessengerCreationDialogFragment$onCreateChat$1(0, this, TelemessengerCreationDialogFragment.class, "dismiss", "dismiss()V", 0);
        k1b chatCreateAuthProcessor = getChatCreateAuthProcessor();
        chatCreateAuthProcessor.n = arguments;
        chatCreateAuthProcessor.k.a = true;
        com.yandex.messaging.internal.suspend.a.b(chatCreateAuthProcessor.f(true), eja1.s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hdy0 viewComponentDelegate$lambda$1(TelemessengerCreationDialogFragment telemessengerCreationDialogFragment, noh nohVar) {
        if (telemessengerCreationDialogFragment.authStarterBrick == null) {
            throw new IllegalArgumentException("authStarterBrick must be initialized before accessing viewComponent");
        }
        nohVar.c().getClass();
        throw new ClassCastException();
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-850765686);
        btsVar.e0(487332204);
        boolean e = btsVar.e(this);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            TelemessengerCreationDialogFragment$DialogContent$1$1 telemessengerCreationDialogFragment$DialogContent$1$1 = new TelemessengerCreationDialogFragment$DialogContent$1$1(0, this, TelemessengerCreationDialogFragment.class, "dismiss", "dismiss()V", 0);
            btsVar.o0(telemessengerCreationDialogFragment$DialogContent$1$1);
            Q = telemessengerCreationDialogFragment$DialogContent$1$1;
        }
        btsVar.t(false);
        sls slsVar = (sls) ((tfx) Q);
        btsVar.e0(487333425);
        boolean e2 = btsVar.e(this);
        Object Q2 = btsVar.Q();
        if (e2 || Q2 == o430Var) {
            TelemessengerCreationDialogFragment$DialogContent$2$1 telemessengerCreationDialogFragment$DialogContent$2$1 = new TelemessengerCreationDialogFragment$DialogContent$2$1(1, this, TelemessengerCreationDialogFragment.class, "onCreateChat", "onCreateChat(Lcom/yandex/messaging/ui/chatcreate/ChatCreateArguments;)V", 0);
            btsVar.o0(telemessengerCreationDialogFragment$DialogContent$2$1);
            Q2 = telemessengerCreationDialogFragment$DialogContent$2$1;
        }
        btsVar.t(false);
        tls tlsVar = (tls) ((tfx) Q2);
        btsVar.e0(487334900);
        boolean e3 = btsVar.e(this);
        Object Q3 = btsVar.Q();
        if (e3 || Q3 == o430Var) {
            TelemessengerCreationDialogFragment$DialogContent$3$1 telemessengerCreationDialogFragment$DialogContent$3$1 = new TelemessengerCreationDialogFragment$DialogContent$3$1(1, this, TelemessengerCreationDialogFragment.class, "onCreateChannel", "onCreateChannel(Lcom/yandex/messaging/ui/chatcreate/chatcreateinfo/ChatCreateInfoArguments;)V", 0);
            btsVar.o0(telemessengerCreationDialogFragment$DialogContent$3$1);
            Q3 = telemessengerCreationDialogFragment$DialogContent$3$1;
        }
        btsVar.t(false);
        gdy0.a(slsVar, tlsVar, (tls) ((tfx) Q3), f530Var, btsVar, (i << 9) & 7168);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        TelemessengerCreationDialogFragment$getViewModelFactory$1 telemessengerCreationDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof TelemessengerCreationDialogFragment$getViewModelFactory$1) {
            telemessengerCreationDialogFragment$getViewModelFactory$1 = (TelemessengerCreationDialogFragment$getViewModelFactory$1) continuation;
            int i2 = telemessengerCreationDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                telemessengerCreationDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = telemessengerCreationDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = telemessengerCreationDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    telemessengerCreationDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(telemessengerCreationDialogFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                t4v0 t4v0Var = new t4v0(ccgVar.e0, ccgVar.E0, ccgVar.R, ccgVar.h, 10);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(idy0.class, t4v0Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        telemessengerCreationDialogFragment$getViewModelFactory$1 = new TelemessengerCreationDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = telemessengerCreationDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = telemessengerCreationDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        t4v0 t4v0Var2 = new t4v0(ccgVar2.e0, ccgVar2.E0, ccgVar2.R, ccgVar2.h, 10);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(idy0.class, t4v0Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(2);
        }
        Context requireContext = requireContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout = new FrameLayout(requireContext);
        frameLayout.setId(View.generateViewId());
        frameLayout.setLayoutParams(layoutParams);
        pk3 pk3Var = new pk3(requireActivity());
        BrickSlotView brickSlotView = new BrickSlotView(requireContext);
        brickSlotView.setId(View.generateViewId());
        frameLayout.addView(brickSlotView);
        brickSlotView.insert(pk3Var);
        this.authStarterBrick = pk3Var;
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setLayoutParams(layoutParams);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(1139135272, new a(this), true));
        frameLayout.addView(composeView);
        return frameLayout;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (!this.viewComponentDelegate.isInitialized()) {
            this.authStarterBrick = null;
        } else {
            getChatCreateAuthProcessor().o = null;
            getChannelCreateAuthProcessor();
            throw null;
        }
    }
}
