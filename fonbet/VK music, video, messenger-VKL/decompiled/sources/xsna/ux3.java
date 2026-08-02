package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import ru.ok.gleffects.EffectHolder;
import xsna.oqg0;
import xsna.qpn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ux3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ux3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(Boolean.TRUE);
                return;
            case 1:
                pv4 pv4Var = (pv4) this.c;
                qu4 qu4Var = pv4Var.j;
                qu4 qu4Var2 = qu4Var != null ? qu4Var : null;
                zmp0.b((ViewGroup) qu4Var2.a);
                qu4Var2.n.dispose();
                pv4Var.b.onDismiss();
                return;
            case 2:
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) this.c;
                mzp0 mzp0Var = communitiesCatalogRootVh.v;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                g3a.a(communitiesCatalogRootVh.y, communitiesCatalogRootVh);
                return;
            case 3:
                o1b0.b((qkl) this.c, null, 3);
                return;
            case 4:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) this.c;
                deprecatedAttachActivity.A.setVisibility(0);
                deprecatedAttachActivity.E.X(4);
                if (deprecatedAttachActivity.E.M == 4) {
                    deprecatedAttachActivity.t0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    deprecatedAttachActivity.d2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                }
                return;
            case 5:
                ((EffectHolder) this.c).lambda$resetEffectToInitialState$29();
                return;
            case 6:
                ModalPostCommonFragment modalPostCommonFragment = (ModalPostCommonFragment) this.c;
                ModalPostCommonFragment.io(modalPostCommonFragment);
                View view = modalPostCommonFragment.U;
                ModalBottomSheetBehavior H = view != null ? ModalBottomSheetBehavior.H(view) : null;
                if (H != null) {
                    H.E = true;
                    H.F = true;
                }
                View view2 = modalPostCommonFragment.U;
                ModalBottomSheetBehavior H2 = view2 != null ? ModalBottomSheetBehavior.H(view2) : null;
                if (H2 != null) {
                    H2.O(3);
                    return;
                }
                return;
            case 7:
                yxa0 yxa0Var = ((rxa0) this.c).b;
                SQLiteDatabase writableDatabase = yxa0Var.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.execSQL("DELETE FROM current_track WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    writableDatabase.execSQL("DELETE FROM actual_tracks_order WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    writableDatabase.execSQL("DELETE FROM original_tracks_order WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    writableDatabase.execSQL("DELETE FROM cached_tracks WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    writableDatabase.execSQL("DELETE FROM play_source WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    s3q0 s3q0Var = s3q0.a;
                    writableDatabase.setTransactionSuccessful();
                    return;
                } finally {
                    writableDatabase.endTransaction();
                }
            case 8:
                oqg0.b bVar = (oqg0.b) this.c;
                pkz pkzVar = bVar.F;
                if (bVar != pkzVar.d) {
                    return;
                }
                oqg0.a aVar = pkzVar.m;
                if (aVar != null) {
                    aVar.removeMessages(234567);
                    pkzVar.m = null;
                }
                pkzVar.x.b = null;
                qkz qkzVar = pkzVar.x;
                pkz pkzVar2 = qkzVar.b;
                if (pkzVar2 != null) {
                    pkzVar2.g = true;
                }
                Handler handler = qkzVar.o;
                if (handler != null) {
                    handler.post(new po4(qkzVar, i));
                    return;
                }
                return;
            case 9:
                mhy.j((VkInputSelect) this.c);
                return;
            case 10:
                qpn0.a aVar2 = ((qpn0) this.c).a;
                ViewParent parent = aVar2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(aVar2);
                    return;
                }
                return;
            case 11:
                ((ru.ok.android.webrtc.n) this.c).a();
                return;
            default:
                yads.x02.a((yads.x02) this.c);
                return;
        }
    }
}
