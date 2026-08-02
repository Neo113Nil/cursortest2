package xsna;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.adapters.vungle.rewarded.VungleRewardedAdapter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.timeline.TimelineView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.money.MoneyTransfersFragment;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.onelog.OneLogItem;
import xsna.j9v;
import xsna.l2f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class oh implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
    @Override // java.lang.Runnable
    public final void run() {
        View r0;
        View findViewById;
        switch (this.b) {
            case 0:
                nw20 nw20Var = (nw20) this.c;
                qcy<Object>[] qcyVarArr = ph.n1;
                ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = nw20Var.i;
                if (modalBottomSheetBehavior != null) {
                    modalBottomSheetBehavior.O(3);
                    break;
                }
                break;
            case 1:
                l2f.a aVar = (l2f.a) this.c;
                Activity activity = aVar.e.get();
                if (activity != null) {
                    boolean z = aVar.d;
                    l2f l2fVar = new l2f(activity, 0);
                    o2f o2fVar = new o2f(activity);
                    o2fVar.setOnCancelClick(new i2f(0, l2fVar, l2f.class, "cancel", "cancel()V", 0, 0));
                    o2fVar.setDarkThemeEnabled(z);
                    l2fVar.h = o2fVar;
                    l2fVar.setCancelable(false);
                    l2fVar.setCanceledOnTouchOutside(false);
                    l2fVar.o(false);
                    Window window = l2fVar.getWindow();
                    if (window != null) {
                        window.clearFlags(2);
                    }
                    Window window2 = l2fVar.getWindow();
                    if (window2 != null) {
                        window2.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    float f = 8;
                    layoutParams.setMargins(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
                    s3q0 s3q0Var = s3q0.a;
                    l2fVar.setContentView(o2fVar, layoutParams);
                    aVar.f = l2fVar;
                    break;
                }
                break;
            case 2:
                ((ujm) this.c).l.e.requestLayout();
                break;
            case 3:
                ((OneLogItem) this.c).log();
                break;
            case 4:
                ymv ymvVar = (ymv) this.c;
                try {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    if (i != 100 && i != 125 && i != 200) {
                        r1 = false;
                    }
                    ymvVar.c(r1);
                } catch (RemoteException e) {
                    Log.e("m0v", "HealthDataSdkService#getIsInForeground failed: " + e.getMessage());
                    return;
                }
                break;
            case 5:
                ((j9v.a) this.c).a();
                break;
            case 6:
                ImDialogsSelectionFragment imDialogsSelectionFragment = (ImDialogsSelectionFragment) this.c;
                int i2 = ImDialogsSelectionFragment.n0;
                imDialogsSelectionFragment.finish();
                break;
            case 7:
                flz liveSeekView = ((gjz) this.c).getLiveSeekView();
                if (liveSeekView != null) {
                    liveSeekView.resume();
                    break;
                }
                break;
            case 8:
                nwq nwqVar = ((yq20) this.c).H;
                if (nwqVar != null) {
                    RecyclerView recyclerView = nwqVar.a;
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    int v = linearLayoutManager != null ? linearLayoutManager.v() : 0;
                    int x = linearLayoutManager != null ? linearLayoutManager.x() : 0;
                    if (((vq20) nwqVar.c.invoke()) != null && v <= x) {
                        while (true) {
                            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v);
                            if (findViewHolderForAdapterPosition != null && findViewHolderForAdapterPosition.getAbsoluteAdapterPosition() != -1 && findViewHolderForAdapterPosition.itemView.isShown() && epx.f(nwqVar.d.invoke(Integer.valueOf(v)), Boolean.FALSE)) {
                                View view = findViewHolderForAdapterPosition.itemView;
                                Rect rect = nwqVar.f;
                                boolean isShown = view.isShown();
                                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                if (isShown && view.getGlobalVisibleRect(rect)) {
                                    int height = view.getHeight() * view.getWidth();
                                    if (height != 0) {
                                        f2 = (rect.height() * rect.width()) / height;
                                    }
                                }
                                if (f2 >= nwqVar.g) {
                                    nwqVar.e.invoke(Integer.valueOf(v), Integer.valueOf(nwqVar.b));
                                }
                            }
                            if (v == x) {
                                break;
                            } else {
                                v++;
                            }
                        }
                    }
                }
                break;
            case 9:
                MoneyTransfersFragment moneyTransfersFragment = (MoneyTransfersFragment) this.c;
                moneyTransfersFragment.Mo(moneyTransfersFragment.Y0);
                break;
            case 10:
                yx50 yx50Var = (yx50) this.c;
                boolean h = SakFeatures.Type.CORE_CONTENT_INFO_BOTTOM_SHEET.h();
                BuildInfo.Client client = BuildInfo.a;
                VKApplication vKApplication = com.vk.core.apps.a.a;
                long j = yx50Var.w;
                long j2 = pgj.b;
                r1 = j + j2 < System.currentTimeMillis();
                if (h && r1 && (r0 = yx50Var.r0(R.id.menu_superapp)) != null && (findViewById = r0.findViewById(R.id.leftmenu_icon)) != null) {
                    long j3 = yx50Var.w;
                    if (j3 >= 0) {
                        if (j3 + j2 < System.currentTimeMillis()) {
                            findViewById.post(new qn9(5, yx50Var, findViewById));
                            break;
                        }
                    } else {
                        asu0.a.getClass();
                        asu0.h().submit(new i0(7, yx50Var, findViewById));
                        break;
                    }
                }
                break;
            case 11:
                ((ni0) this.c).invoke();
                break;
            case 12:
                ((wli0) this.c).d.n();
                break;
            case 13:
                kfj0 kfj0Var = (kfj0) this.c;
                kfj0Var.d = true;
                kfj0Var.c = false;
                break;
            case 14:
                ((Lambda) this.c).invoke();
                break;
            case 15:
                ((TimelineView) this.c).requestLayout();
                break;
            case 16:
                VungleRewardedAdapter.showAd$lambda$2((VungleRewardedAdapter) this.c);
                break;
            default:
                com.vungle.ads.internal.ui.view.g.a((com.vungle.ads.internal.ui.view.g) this.c);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oh(gzs gzsVar) {
        this.b = 14;
        this.c = (Lambda) gzsVar;
    }
}
