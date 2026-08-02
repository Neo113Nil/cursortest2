package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.video.polls.ui.questions.open.PollOpenView;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorResult;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.dbe0;
import xsna.e840;
import xsna.p7w0;
import xsna.s0u;
import xsna.tmw0;
import xsna.vzw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class a840 implements s0u.a, PlaybackStateListener, io.reactivex.rxjava3.functions.l, pcs, io.reactivex.rxjava3.functions.m, i0u0, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.c, s0x0, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a840(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.s0u.a
    public void a(s0u s0uVar, r0u r0uVar, long j) {
        e840 e840Var = (e840) this.c;
        fxc0.z(!e840Var.r);
        a7l.a();
        e840Var.j.add(new bwo0(r0uVar, j));
        e840Var.k.put(r0uVar.a, new e840.d(s0uVar, j));
        e840Var.o();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                int i2 = PollOpenView.e;
                return (String) ((u4u) obj2).invoke(obj);
            case 3:
                return (UserProfile) ((mi10) obj2).invoke(obj);
            case 4:
            case 5:
            case 9:
            case 13:
            default:
                return (p7w0.d.b) ((hwi0) obj2).invoke(obj);
            case 6:
                return (List) ((hwi0) obj2).invoke(obj);
            case 7:
                return (PostingSettings) ((hwi0) obj2).invoke(obj);
            case 8:
                return (Optional) ((hwi0) obj2).invoke(obj);
            case 10:
                return (it80) ((hwi0) obj2).invoke(obj);
            case 11:
                return (String) ((hwi0) obj2).invoke(obj);
            case 12:
                return (Boolean) ((o0p0) obj2).invoke(obj);
            case 14:
                return ((bnq0) obj2).invoke(obj);
        }
    }

    @Override // xsna.s0x0
    public void c(vzw0 vzw0Var) {
        com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a aVar = (com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a) this.c;
        int i = com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a.l1;
        if (vzw0Var instanceof vzw0.c) {
            xn50.a.c(aVar, tmw0.a.C3759a.b);
            return;
        }
        if (vzw0Var instanceof vzw0.a) {
            xn50.a.c(aVar, tmw0.a.b.b);
        } else if (vzw0Var instanceof vzw0.d) {
            xn50.a.c(aVar, new tmw0.c(((vzw0.d) vzw0Var).a));
        } else if (vzw0Var instanceof vzw0.b) {
            xn50.a.c(aVar, tmw0.b.b);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (s3q0) ((s0r) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference((VkButton) this.c).get();
    }

    @Override // com.vk.movika.sdk.player.base.listener.PlaybackStateListener
    public void i(PlaybackStateListener.PlaybackState playbackState) {
        mj80 mj80Var = (mj80) this.c;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"OnePlayerComponents", "stateListener: state = " + playbackState + "; wasPlaybackStateReady = " + mj80Var.u + "; lastState = " + mj80Var.q});
        }
        mj80Var.q = playbackState;
        if (mj80Var.u || playbackState != PlaybackStateListener.PlaybackState.READY) {
            return;
        }
        mj80Var.u = true;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).a((yads.kn1) this.c);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        PublishFragment publishFragment = (PublishFragment) this.c;
        qcy<Object>[] qcyVarArr = PublishFragment.Q;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("AuthorResult.MODAL_KEY_RESULT", AuthorResult.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("AuthorResult.MODAL_KEY_RESULT");
            if (!(parcelable3 instanceof AuthorResult)) {
                parcelable3 = null;
            }
            parcelable = (AuthorResult) parcelable3;
        }
        AuthorResult authorResult = (AuthorResult) parcelable;
        if (authorResult != null) {
            if (authorResult instanceof AuthorResult.Picked) {
                publishFragment.fo().b(new dbe0.c.C2719c(((AuthorResult.Picked) authorResult).b));
            } else if (authorResult instanceof AuthorResult.CreatingNewChannel) {
                publishFragment.fo().b(dbe0.c.b.b);
            } else {
                publishFragment.getClass();
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 5:
                return ((Boolean) ((u4u) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((hwi0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (VoipActionsFeatureState.u) ((dmi) this.c).invoke(obj, obj2);
    }
}
