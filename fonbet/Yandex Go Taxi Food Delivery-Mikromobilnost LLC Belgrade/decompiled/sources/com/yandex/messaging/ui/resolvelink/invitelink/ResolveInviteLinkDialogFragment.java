package com.yandex.messaging.ui.resolvelink.invitelink;

import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import defpackage.bts;
import defpackage.ccg;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.jjo;
import defpackage.jsj0;
import defpackage.kqe0;
import defpackage.ksj0;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.lsj0;
import defpackage.m3u0;
import defpackage.n3w;
import defpackage.n620;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.osj0;
import defpackage.q1z;
import defpackage.q6b;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qrm;
import defpackage.qx5;
import defpackage.r720;
import defpackage.rs31;
import defpackage.sfl0;
import defpackage.tls;
import defpackage.tse;
import defpackage.vfc;
import defpackage.vyf0;
import defpackage.w4;
import defpackage.w511;
import defpackage.w8f;
import defpackage.yr31;
import defpackage.zwv;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0094@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/resolvelink/invitelink/ResolveInviteLinkDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Ljsj0;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Llsj0;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lsfl0;", "router", "Lzy11;", "handleEvent", "(Llsj0;Lsfl0;)V", "", "userId", "openChatAndDismiss", "(Lsfl0;Ljava/lang/String;)V", "Lf530;", "modifier", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Losj0;", "uiState", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResolveInviteLinkDialogFragment extends ComposeBottomSheetDialogFragment<jsj0> {
    public static final int $stable = 0;

    public ResolveInviteLinkDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    private static final osj0 DialogContent$lambda$0(m3u0 m3u0Var) {
        return (osj0) m3u0Var.getValue();
    }

    private static final zy11 DialogContent$lambda$3$lambda$2(tse tseVar, qrm qrmVar, ResolveInviteLinkDialogFragment resolveInviteLinkDialogFragment, sfl0 sfl0Var, lsj0 lsj0Var) {
        com.yandex.messaging.core.ui.utils.a.a(tseVar, qrmVar, new kqe0(10, resolveInviteLinkDialogFragment, lsj0Var, sfl0Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 DialogContent$lambda$3$lambda$2$lambda$1(ResolveInviteLinkDialogFragment resolveInviteLinkDialogFragment, lsj0 lsj0Var, sfl0 sfl0Var) {
        resolveInviteLinkDialogFragment.handleEvent(lsj0Var, sfl0Var);
        resolveInviteLinkDialogFragment.dismiss();
        return zy11.a;
    }

    private static final zy11 DialogContent$lambda$6$lambda$5(tse tseVar, qrm qrmVar, ResolveInviteLinkDialogFragment resolveInviteLinkDialogFragment) {
        com.yandex.messaging.core.ui.utils.a.a(tseVar, qrmVar, new vyf0(21, resolveInviteLinkDialogFragment));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 DialogContent$lambda$6$lambda$5$lambda$4(ResolveInviteLinkDialogFragment resolveInviteLinkDialogFragment) {
        resolveInviteLinkDialogFragment.dismiss();
        return zy11.a;
    }

    private final void handleEvent(lsj0 event, sfl0 router) {
        if (event instanceof ksj0) {
            openChatAndDismiss(router, ((ksj0) event).a);
        } else {
            w511.b();
        }
    }

    private final void openChatAndDismiss(sfl0 router, String userId) {
        sfl0.a(router, new q6b(n620.d, new PrivateChat(userId, getArguments().b), null, null, null, 2097148), 6);
        dismiss();
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-63310183);
        btsVar.e0(-897180073);
        rs31 b = jjo.b(btsVar);
        hs31 a = jjo.a(btsVar);
        btsVar.e0(544794079);
        boolean e = btsVar.e(a);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            Q = new w4(a, 21);
            btsVar.o0(Q);
        }
        btsVar.t(false);
        yr31 G = ooc.G(qoi0.a(a.class), b, null, vfc.h(a.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
        btsVar.t(false);
        androidx.lifecycle.compose.a.c(((a) G).z, null, btsVar, 0, 7);
        btsVar.m(q1z.a).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        ResolveInviteLinkDialogFragment$getViewModelFactory$1 resolveInviteLinkDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof ResolveInviteLinkDialogFragment$getViewModelFactory$1) {
            resolveInviteLinkDialogFragment$getViewModelFactory$1 = (ResolveInviteLinkDialogFragment$getViewModelFactory$1) continuation;
            int i2 = resolveInviteLinkDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveInviteLinkDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveInviteLinkDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveInviteLinkDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    resolveInviteLinkDialogFragment$getViewModelFactory$1.L$0 = this;
                    resolveInviteLinkDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(resolveInviteLinkDialogFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (ResolveInviteLinkDialogFragment) resolveInviteLinkDialogFragment$getViewModelFactory$1.L$0;
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                jsj0 arguments = this.getArguments();
                arguments.getClass();
                qx5 qx5Var = new qx5(n3w.a(arguments), ccgVar.R0, 14);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(a.class, qx5Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        resolveInviteLinkDialogFragment$getViewModelFactory$1 = new ResolveInviteLinkDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = resolveInviteLinkDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveInviteLinkDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        jsj0 arguments2 = this.getArguments();
        arguments2.getClass();
        qx5 qx5Var2 = new qx5(n3w.a(arguments2), ccgVar2.R0, 14);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(a.class, qx5Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
