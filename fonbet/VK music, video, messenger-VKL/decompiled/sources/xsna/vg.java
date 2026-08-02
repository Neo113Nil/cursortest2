package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.newsfeed.Owner;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.permission.PermissionHelper;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import one.video.controls20.SimpleControlsView;
import xsna.w6i0;
import xsna.x6i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vg implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r13v22, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractPollView.c cVar;
        bm9 presenter;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbstractPollView abstractPollView = (AbstractPollView) obj;
                int i2 = AbstractPollView.S;
                Owner owner = abstractPollView.getPoll().w;
                if (owner != null && (cVar = abstractPollView.b) != null) {
                    cVar.s3(owner.b);
                    break;
                }
                break;
            case 1:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                if (!cameraUIView.getClickLock().a() && !cameraUIView.getShutterLock().a() && (presenter = cameraUIView.getPresenter()) != null && presenter.U3()) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context context = cameraUIView.getContext();
                    permissionHelper.getClass();
                    PermissionHelper.f(permissionHelper, context, PermissionHelper.e, R.string.vk_permissions_camera_qr_local, R.string.vk_permissions_camera_qr_local, new defpackage.g(cameraUIView, 14), null, 32);
                    break;
                }
                break;
            case 2:
                int i3 = ImSettingsDialogThemeFragment.c0;
                FragmentActivity activity = ((ImSettingsDialogThemeFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    break;
                }
                break;
            case 3:
                q5a0 q5a0Var = (q5a0) obj;
                x64 x64Var = q5a0Var.f;
                if (x64Var != null) {
                    x64Var.c(q5a0Var.c);
                    break;
                }
                break;
            case 4:
                ((qrb0) obj).n.invoke();
                break;
            case 5:
                ((ModernSearchView) obj).c(0L);
                break;
            case 6:
                x6i0.d dVar = (x6i0.d) obj;
                if (dVar.itemView.isEnabled()) {
                    x6i0.b bVar = dVar.l;
                    x6i0.c cVar2 = dVar.p;
                    bVar.a.O(new w6i0.a((cVar2 != null ? cVar2 : null).b.B7()));
                    break;
                }
                break;
            case 7:
                SimpleControlsView.Q4((SimpleControlsView) obj);
                break;
            case 8:
                ((qfk0) obj).b.e();
                break;
            case 9:
                ((ffo0) obj).b.invoke(eeo0.a);
                break;
            case 10:
                ((com.vk.video.ui.discovery.minimizable.announce.a) obj).b.invoke();
                break;
            case 11:
                ((gzs) obj).invoke();
                break;
            case 12:
                uxw0 uxw0Var = (uxw0) obj;
                uxw0Var.c.invoke(ScheduledAudioMuteOption.MutedOnJoin);
                dw20 dw20Var = uxw0Var.i;
                if (dw20Var != null) {
                    dw20Var.tn();
                    break;
                }
                break;
            default:
                ady0 ady0Var = ((dhy0) obj).q;
                WeakReference weakReference = ady0Var.x;
                Context context2 = weakReference != null ? (Context) weakReference.get() : null;
                if (context2 == null) {
                    context2 = view.getContext();
                }
                AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.requestAudioFocus(ady0Var.e, 3, 2);
                }
                if (!ady0Var.z) {
                    if (ady0Var.u == 1) {
                        ady0Var.u = 4;
                    }
                    try {
                        new j7z0(ady0Var, context2).show();
                        ady0Var.p = true;
                        break;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        gu8.e(null, "Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
                        ady0Var.m();
                    }
                }
                break;
        }
    }
}
