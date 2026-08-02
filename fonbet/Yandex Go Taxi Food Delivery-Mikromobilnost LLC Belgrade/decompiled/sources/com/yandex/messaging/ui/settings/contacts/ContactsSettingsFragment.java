package com.yandex.messaging.ui.settings.contacts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import defpackage.aii0;
import defpackage.bts;
import defpackage.ccg;
import defpackage.di9;
import defpackage.did;
import defpackage.eyc;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.gwk0;
import defpackage.hs31;
import defpackage.jjo;
import defpackage.jl40;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.m3u0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.r720;
import defpackage.rde;
import defpackage.rs31;
import defpackage.sde;
import defpackage.sjh;
import defpackage.tde;
import defpackage.tje;
import defpackage.tls;
import defpackage.ude;
import defpackage.uyj;
import defpackage.vde;
import defpackage.vfc;
import defpackage.vng;
import defpackage.vqb;
import defpackage.w4;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wls;
import defpackage.yde;
import defpackage.yr31;
import defpackage.zfa;
import defpackage.zwv;
import defpackage.zy11;
import defpackage.zyd;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0019\u001a\u00020\u000e2\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b&\u0010'R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006.²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/settings/contacts/ContactsSettingsFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Lrde;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lcom/yandex/messaging/ui/settings/contacts/c;", "viewModel", "Lzy11;", "ContactsScreen", "(Lcom/yandex/messaging/ui/settings/contacts/c;Lfid;I)V", "Lude;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "handleEvent", "(Lude;)V", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "block", "launchWhenReady", "(Lwls;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "()V", "Lf530;", "modifier", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnoh;", "Leyc;", "fragmentComponent", "Leyc;", "Lyde;", ClidProvider.STATE, "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContactsSettingsFragment extends ComposeMessengerFragment<rde> {
    public static final int $stable = 8;
    private final eyc fragmentComponent;
    private final noh profileComponentAsync;

    public ContactsSettingsFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
        this.fragmentComponent = gwk0.b();
    }

    private final void ContactsScreen(c cVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-176782031);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            di9 di9Var = cVar.c;
            btsVar.e0(1593230442);
            boolean e = btsVar.e(this);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new vqb(25, this);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            com.yandex.messaging.core.ui.a.a(di9Var, (tls) Q, btsVar, 0);
            b.a.d(ContactsScreen$lambda$2(androidx.lifecycle.compose.a.c(cVar.C, null, btsVar, 0, 7)), new vde(cVar, this), btsVar, 384);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(this, cVar, i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 ContactsScreen$lambda$1$lambda$0(ContactsSettingsFragment contactsSettingsFragment, ude udeVar) {
        contactsSettingsFragment.handleEvent(udeVar);
        return zy11.a;
    }

    private static final yde ContactsScreen$lambda$2(m3u0 m3u0Var) {
        return (yde) m3u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 ContactsScreen$lambda$3(ContactsSettingsFragment contactsSettingsFragment, c cVar, int i, fid fidVar, int i2) {
        contactsSettingsFragment.ContactsScreen(cVar, fidVar, vng.O(i | 1));
        return zy11.a;
    }

    private final void handleEvent(ude event) {
        if (event instanceof tde) {
            Toast.makeText(getActivity(), ((tde) event).a, 0).show();
        } else if (jl40.l(event, sde.a)) {
            launchWhenReady(new ContactsSettingsFragment$handleEvent$1(2, null));
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchWhenReady(wls block) {
        p a = r.a(getLifecycle());
        sjh sjhVar = uyj.a;
        tje.N(a, o400.a.x, null, new ContactsSettingsFragment$launchWhenReady$1(block, this, null), 2);
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(683519745);
        btsVar.e0(-897180073);
        rs31 b = jjo.b(btsVar);
        hs31 a = jjo.a(btsVar);
        btsVar.e0(544794079);
        boolean e = btsVar.e(a);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            Q = new w4(a, 9);
            btsVar.o0(Q);
        }
        tls tlsVar = (tls) Q;
        btsVar.t(false);
        yr31 G = ooc.G(qoi0.a(c.class), b, null, vfc.h(c.class, new zwv(), tlsVar), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
        btsVar.t(false);
        ContactsScreen((c) G, btsVar, i & 112);
        btsVar.t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        ContactsSettingsFragment$getViewModelFactory$1 contactsSettingsFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof ContactsSettingsFragment$getViewModelFactory$1) {
            contactsSettingsFragment$getViewModelFactory$1 = (ContactsSettingsFragment$getViewModelFactory$1) continuation;
            int i2 = contactsSettingsFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactsSettingsFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactsSettingsFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactsSettingsFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    contactsSettingsFragment$getViewModelFactory$1.L$0 = this;
                    contactsSettingsFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(contactsSettingsFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (ContactsSettingsFragment) contactsSettingsFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                ((rde) this.getArguments()).getClass();
                zfa zfaVar = new zfa(ccgVar.S0, ccgVar.n, ccgVar.m, 19);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(c.class, zfaVar);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        contactsSettingsFragment$getViewModelFactory$1 = new ContactsSettingsFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = contactsSettingsFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactsSettingsFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        ((rde) this.getArguments()).getClass();
        zfa zfaVar2 = new zfa(ccgVar2.S0, ccgVar2.n, ccgVar2.m, 19);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(c.class, zfaVar2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tje.N(r.a(getLifecycle()), null, null, new ContactsSettingsFragment$onCreate$1(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (((kotlinx.coroutines.c) this.fragmentComponent).k0()) {
            launchWhenReady(new ContactsSettingsFragment$onDestroy$1(2, null));
        }
    }
}
