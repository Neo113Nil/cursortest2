package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment;
import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerTabs;
import com.yandex.messaging.ui.chatthreadscontainer.d;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.q7u;
import defpackage.rs31;
import defpackage.sls;
import defpackage.w8f;
import defpackage.y8f;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes15.dex */
public final class aab implements zls {
    public final /* synthetic */ ChatThreadsContainerFragment a;
    public final /* synthetic */ rwi b;

    public aab(ChatThreadsContainerFragment chatThreadsContainerFragment, rwi rwiVar) {
        this.a = chatThreadsContainerFragment;
        this.b = rwiVar;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupToolbar$1$1$3$1$1$invoke$$inlined$viewModels$default$1] */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar;
        bu11 bu11Var;
        cab cabVar;
        fid fidVar = (fid) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-2050663427);
        rwi rwiVar = this.b;
        boolean e = btsVar2.e(rwiVar);
        Object Q = btsVar2.Q();
        if (e || Q == did.a) {
            Q = new y9b(rwiVar, 1);
            btsVar2.o0(Q);
        }
        sls slsVar = (sls) Q;
        btsVar2.t(false);
        final ChatThreadsContainerFragment chatThreadsContainerFragment = this.a;
        final ?? r8 = new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupToolbar$1$1$3$1$1$invoke$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Fragment.this;
            }
        };
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupToolbar$1$1$3$1$1$invoke$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r8.invoke();
            }
        });
        g0c a = qoi0.a(d.class);
        sls slsVar2 = new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupToolbar$1$1$3$1$1$invoke$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        };
        sls slsVar3 = new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupToolbar$1$1$3$1$1$invoke$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar4 = this.$extrasProducer;
                if (slsVar4 != null && (y8fVar = (y8f) slsVar4.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        };
        if (slsVar == null) {
            slsVar = new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupToolbar$1$1$3$1$1$invoke$$inlined$viewModels$default$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    hs31 defaultViewModelProviderFactory;
                    rs31 rs31Var = (rs31) b.getValue();
                    q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                    return (q7uVar == null || (defaultViewModelProviderFactory = q7uVar.getDefaultViewModelProviderFactory()) == null) ? Fragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
                }
            };
        }
        chatThreadsContainerFragment.viewModel = (d) new ls31((qs31) slsVar2.invoke(), (hs31) slsVar.invoke(), (y8f) slsVar3.invoke()).a(a);
        dVar = chatThreadsContainerFragment.viewModel;
        gci0 gci0Var = dVar != null ? dVar.y : null;
        btsVar2.e0(-2050660634);
        oz40 c = gci0Var == null ? null : androidx.lifecycle.compose.a.c(gci0Var, null, btsVar2, 0, 7);
        btsVar2.t(false);
        ChatThreadsContainerTabs chatThreadsContainerTabs = (c == null || (cabVar = (cab) c.getValue()) == null) ? null : cabVar.a;
        if (chatThreadsContainerTabs == null) {
            bu11Var = null;
        } else {
            btsVar2.e0(-618512081);
            int i = dab.a[chatThreadsContainerTabs.ordinal()];
            if (i == 1) {
                bu11Var = new bu11(oyh0.nav_item_chats);
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                bu11Var = new bu11(oyh0.nav_item_threads);
            }
            btsVar2.t(false);
        }
        String a2 = bu11Var != null ? bu11Var.a((Context) btsVar2.m(AndroidCompositionLocals_androidKt.b)) : null;
        if (a2 == null) {
            a2 = "";
        }
        zhb1.b(a2, null, chatThreadsContainerFragment.getParentFragment(), btsVar2, 0, 2);
        return zy11.a;
    }
}
