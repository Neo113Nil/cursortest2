package com.yandex.messaging.ui.settings.folder;

import android.app.Activity;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import defpackage.aii0;
import defpackage.bts;
import defpackage.ccg;
import defpackage.cxr;
import defpackage.did;
import defpackage.e3u;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.jjo;
import defpackage.jxr;
import defpackage.kt11;
import defpackage.kxr;
import defpackage.lnr0;
import defpackage.lxr;
import defpackage.m3u0;
import defpackage.mxr;
import defpackage.noh;
import defpackage.nxr;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.q1z;
import defpackage.q620;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.r720;
import defpackage.rs31;
import defpackage.s4f;
import defpackage.sfl0;
import defpackage.t4f;
import defpackage.tls;
import defpackage.u3a1;
import defpackage.v4;
import defpackage.v7p;
import defpackage.vfc;
import defpackage.vng;
import defpackage.w4;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wrh;
import defpackage.xvf0;
import defpackage.ybg;
import defpackage.yr31;
import defpackage.z9n;
import defpackage.zwv;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/settings/folder/FoldersSettingsFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Ljxr;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/messaging/ui/settings/folder/a;", "viewModel", "FoldersListEditorContent", "(Lf530;Lcom/yandex/messaging/ui/settings/folder/a;Lfid;II)V", "Lnoh;", "Lcxr;", ClidProvider.STATE, "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FoldersSettingsFragment extends ComposeMessengerFragment<jxr> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;

    public FoldersSettingsFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
    }

    private static final cxr FoldersListEditorContent$lambda$0(m3u0 m3u0Var) {
        return (cxr) m3u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 FoldersListEditorContent$lambda$10(FoldersSettingsFragment foldersSettingsFragment, f530 f530Var, a aVar, int i, int i2, fid fidVar, int i3) {
        foldersSettingsFragment.FoldersListEditorContent(f530Var, aVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    private static final zy11 FoldersListEditorContent$lambda$2$lambda$1(sfl0 sfl0Var, nxr nxrVar) {
        if (nxrVar.equals(kxr.a)) {
            sfl0Var.getClass();
        } else if (nxrVar instanceof mxr) {
            new t4f(q620.d, null, 0L);
            sfl0Var.getClass();
        } else {
            if (!nxrVar.equals(lxr.a)) {
                w511.b();
                return null;
            }
            new s4f(q620.d, null);
            sfl0Var.getClass();
        }
        return zy11.a;
    }

    public final void FoldersListEditorContent(f530 f530Var, a aVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar;
        a aVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-945903285);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && btsVar2.e(aVar)) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && btsVar2.E()) {
            btsVar2.Y();
            aii0 v = btsVar2.v();
            if (v != null) {
                v.d = new v4(this, f530Var, aVar, i, i2, 13);
                return;
            }
            return;
        }
        btsVar2.a0();
        if ((i & 1) != 0 && !btsVar2.C()) {
            btsVar2.Y();
        } else if ((i2 & 2) != 0) {
            btsVar2.e0(-897180073);
            rs31 b = jjo.b(btsVar2);
            hs31 a = jjo.a(btsVar2);
            btsVar2.e0(544794079);
            boolean e = btsVar2.e(a);
            Object Q = btsVar2.Q();
            if (e || Q == did.a) {
                Q = new w4(a, 11);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            yr31 G = ooc.G(qoi0.a(a.class), b, null, vfc.h(a.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
            aVar2 = (a) G;
            btsVar.u();
            androidx.lifecycle.compose.a.c(aVar2.y, null, btsVar, 0, 7);
            btsVar.m(q1z.a).getClass();
            ny61.u();
        }
        btsVar = btsVar2;
        aVar2 = aVar;
        btsVar.u();
        androidx.lifecycle.compose.a.c(aVar2.y, null, btsVar, 0, 7);
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-228062136);
        FoldersListEditorContent(u3a1.d(f530Var, "folders_list_screen"), null, btsVar, (i << 3) & 896, 2);
        btsVar.t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        FoldersSettingsFragment$getViewModelFactory$1 foldersSettingsFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof FoldersSettingsFragment$getViewModelFactory$1) {
            foldersSettingsFragment$getViewModelFactory$1 = (FoldersSettingsFragment$getViewModelFactory$1) continuation;
            int i2 = foldersSettingsFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                foldersSettingsFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = foldersSettingsFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = foldersSettingsFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    foldersSettingsFragment$getViewModelFactory$1.L$0 = this;
                    foldersSettingsFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(foldersSettingsFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (FoldersSettingsFragment) foldersSettingsFragment$getViewModelFactory$1.L$0;
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                ((jxr) this.getArguments()).getClass();
                ybg ybgVar = ccgVar.x;
                ybg ybgVar2 = ccgVar.y;
                ybg ybgVar3 = ccgVar.j;
                wrh wrhVar = new wrh(ybgVar, ybgVar2, ybgVar3, 24);
                z9n z9nVar = new z9n((v7p) wrhVar, (xvf0) ccgVar.o0, (xvf0) ccgVar.p0, (xvf0) ccgVar.P, 10);
                e3u e3uVar = new e3u((xvf0) new wrh(ybgVar2, ybgVar, ybgVar3, 26), (xvf0) ccgVar.q0, (xvf0) wrhVar, 20);
                LinkedHashMap A = gtq0.A(5);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(a.class, z9nVar);
                A.put(com.yandex.messaging.ui.settings.folder.mainFolderSettings.a.class, e3uVar);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        foldersSettingsFragment$getViewModelFactory$1 = new FoldersSettingsFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = foldersSettingsFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = foldersSettingsFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        ((jxr) this.getArguments()).getClass();
        ybg ybgVar4 = ccgVar2.x;
        ybg ybgVar22 = ccgVar2.y;
        ybg ybgVar32 = ccgVar2.j;
        wrh wrhVar2 = new wrh(ybgVar4, ybgVar22, ybgVar32, 24);
        z9n z9nVar2 = new z9n((v7p) wrhVar2, (xvf0) ccgVar2.o0, (xvf0) ccgVar2.p0, (xvf0) ccgVar2.P, 10);
        e3u e3uVar2 = new e3u((xvf0) new wrh(ybgVar22, ybgVar4, ybgVar32, 26), (xvf0) ccgVar2.q0, (xvf0) wrhVar2, 20);
        LinkedHashMap A2 = gtq0.A(5);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(a.class, z9nVar2);
        A2.put(com.yandex.messaging.ui.settings.folder.mainFolderSettings.a.class, e3uVar2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
