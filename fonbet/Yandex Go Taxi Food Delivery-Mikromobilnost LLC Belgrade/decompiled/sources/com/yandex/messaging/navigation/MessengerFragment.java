package com.yandex.messaging.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.bricks.Brick;
import defpackage.e9h0;
import defpackage.eja1;
import defpackage.jum;
import defpackage.l8x;
import defpackage.noh;
import defpackage.r120;
import defpackage.s120;
import defpackage.tje;
import defpackage.u120;
import defpackage.zj6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00011B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH¤@¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0002*\u00020\u000bH\u0004¢\u0006\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010&\u001a\u00020%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/yandex/messaging/navigation/MessengerFragment;", "Ls120;", "T", "Lcom/yandex/messaging/navigation/BaseMessengerFragment;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "Lcom/yandex/bricks/Brick;", "emptyBrick", "()Lcom/yandex/bricks/Brick;", "createBrick", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/widget/FrameLayout;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/widget/FrameLayout;", "Lzy11;", "onDestroyView", "()V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "getBrickOrNull", "brick", "Lnoh;", "authBrick", "Lcom/yandex/bricks/Brick;", "getAuthBrick", "", "containerId", CA20Status.STATUS_USER_I, "getContainerId", "()I", "Ll8x;", "uiInitJob", "Ll8x;", "Lu120;", "currentUi", "Lu120;", "Companion", "r120", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MessengerFragment<T extends s120> extends BaseMessengerFragment<T> {
    public static final int $stable = 8;
    public static final r120 Companion = new r120();
    public static final String KEY_BRICK_ID = "KEY_BRICK_ID";
    public static final String KEY_BRICK_STATE = "KEY_BRICK_STATE";
    private final Brick authBrick;
    private final noh brick;
    private final int containerId;
    private u120 currentUi;
    private l8x uiInitJob;

    public MessengerFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
        this.brick = tje.h(eja1.s(this), null, CoroutineStart.LAZY, new MessengerFragment$brick$1(this, null), 1);
        this.containerId = e9h0.messenger_container_slot;
    }

    private final Brick emptyBrick() {
        return new jum(new zj6(requireContext(), 0));
    }

    public abstract Object createBrick(Continuation<? super Brick> continuation);

    public Brick getAuthBrick() {
        return this.authBrick;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Lcom/yandex/bricks/Brick;>()TT; */
    public final Brick getBrickOrNull() {
        if (!this.brick.k0()) {
            return null;
        }
        Object c = this.brick.c();
        if (c instanceof Brick) {
            return (Brick) c;
        }
        return null;
    }

    public int getContainerId() {
        return this.containerId;
    }

    @Override // androidx.fragment.app.Fragment
    public FrameLayout onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        u120 u120Var = new u120(getActivity(), getContainerId());
        this.uiInitJob = tje.N(eja1.s(this), null, null, new MessengerFragment$onCreateView$1$1(this, savedInstanceState, u120Var, null), 3);
        return (FrameLayout) u120Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        l8x l8xVar = this.uiInitJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.uiInitJob = null;
        u120 u120Var = this.currentUi;
        if (u120Var != null) {
            u120Var.c.a(emptyBrick());
            u120Var.w.a(emptyBrick());
        }
        this.currentUi = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (this.brick.k0()) {
            Bundle bundle = new Bundle();
            outState.putString(KEY_BRICK_ID, ((Brick) this.brick.c()).saveInstanceState(bundle));
            outState.putBundle(KEY_BRICK_STATE, bundle);
        }
    }
}
