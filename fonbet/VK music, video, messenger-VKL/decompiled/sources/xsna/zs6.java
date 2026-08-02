package xsna;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.AbstractRunnableC4408ke;
import com.ironsource.Ef;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vkontakte.android.attachments.DisclaimerData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.protocol.impl.notifications.RtcNotificationReceiverImpl;
import xsna.bv50;
import xsna.ftn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zs6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zs6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                x9y x9yVar = new x9y();
                x9yVar.l((x9y) obj, "detail");
                String str = "window.dispatchEvent(new CustomEvent('VKWebAppEvent', " + x9yVar + "));";
                WebView r = ((bt6) obj2).r();
                if (r != null) {
                    nr2.J(r, "javascript:" + str);
                    return;
                }
                return;
            case 1:
                Ef.a((Ef) obj2, (AbstractRunnableC4408ke) obj);
                return;
            case 2:
                DisclaimerData disclaimerData = (DisclaimerData) obj2;
                bv50 bv50Var = (bv50) obj;
                FrameLayout frameLayout = bv50Var.e;
                int max = disclaimerData != null ? Math.max((int) (bv50Var.d.getHeight() * disclaimerData.c), (int) TypedValue.applyDimension(1, disclaimerData.d, bv50Var.b.getResources().getDisplayMetrics())) : 0;
                if (disclaimerData != null) {
                    frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, max));
                    float f = 16;
                    f4m.u(frameLayout, iah0.a(f), iah0.a(12), iah0.a(f), iah0.a(2));
                    int i2 = bv50.a.$EnumSwitchMapping$0[disclaimerData.b.ordinal()];
                    if (i2 == 1) {
                        drawable = (Drawable) bv50Var.j.getValue();
                    } else if (i2 == 2) {
                        drawable = (Drawable) bv50Var.k.getValue();
                    } else if (i2 == 3) {
                        drawable = (Drawable) bv50Var.l.getValue();
                    } else if (i2 == 4) {
                        drawable = (Drawable) bv50Var.m.getValue();
                    } else {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        drawable = (Drawable) bv50Var.n.getValue();
                    }
                    if (drawable != null) {
                        drawable.setTint(bv50Var.o);
                    }
                    frameLayout.setBackground(drawable);
                    frameLayout.setVisibility(0);
                } else {
                    frameLayout.setBackground(null);
                    frameLayout.setVisibility(8);
                }
                awt0.x(bv50Var.f, 0, max <= 0 ? iah0.a(4) : 0, 0, 0, 13);
                return;
            case 3:
                ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) obj2;
                int i3 = ProfileMainPhotosFragment.F0;
                profileMainPhotosFragment.Ao((Intent) obj);
                View view = profileMainPhotosFragment.getView();
                if (view != null) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                ((RtcNotificationReceiverImpl) obj2).b((RtcNotification) obj);
                return;
            case 5:
                SessionRoomListenerManagerImpl.onCurrentParticipantInvitedToRoom$lambda$0((SessionRoomListenerManagerImpl) obj2, (CallSessionRoomsListener.InvitedParams) obj);
                return;
            case 6:
                b6m.a().j(((srl0) obj2).a, ((StoriesContainer) obj).Ab());
                return;
            case 7:
                ArrayList arrayList = (ArrayList) obj2;
                ftn0 ftn0Var = (ftn0) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ftn0.a aVar = (ftn0.a) it.next();
                    ArrayList<RecyclerView.e0> arrayList2 = ftn0Var.D;
                    RecyclerView.e0 e0Var = aVar.a;
                    View view2 = e0Var != null ? e0Var.itemView : null;
                    RecyclerView.e0 e0Var2 = aVar.b;
                    View view3 = e0Var2 != null ? e0Var2.itemView : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(ftn0Var.f);
                        arrayList2.add(aVar.a);
                        duration.translationX(aVar.e - aVar.c);
                        duration.translationY(aVar.f - aVar.d);
                        duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new htn0(ftn0Var, aVar, duration, view2)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate = view3.animate();
                        arrayList2.add(aVar.b);
                        animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(ftn0Var.f).alpha(1.0f).setListener(new itn0(ftn0Var, aVar, animate, view3)).start();
                    }
                }
                arrayList.clear();
                ftn0Var.z.remove(arrayList);
                return;
            case 8:
                ((View.OnClickListener) obj2).onClick((View) obj);
                return;
            case 9:
                ((yads.cl) obj2).c((yads.pa0) obj);
                return;
            default:
                ((yads.gk3) obj2).a((yads.sk3) obj);
                return;
        }
    }
}
