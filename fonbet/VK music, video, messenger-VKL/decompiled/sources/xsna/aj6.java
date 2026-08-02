package xsna;

import android.app.Dialog;
import android.os.SystemClock;
import android.view.View;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.dto.common.Good;
import com.vk.im.ui.fragments.ImEditChatControlParamsFragment;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.notifications.common.NotificationCSatRate;
import com.vk.sharing.core.view.l;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.as30;
import xsna.c090;
import xsna.xn50;
import xsna.zxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class aj6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aj6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ww50<?> ww50Var;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((com.vk.auth.ui.checkaccess.a) obj).un();
                break;
            case 1:
                gzs gzsVar = (gzs) obj;
                int i2 = BaseVkSearchView.P;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 2:
                nzn nznVar = (nzn) obj;
                ozn oznVar = (ozn) nznVar.C;
                if (oznVar != null) {
                    j1o.a(nznVar, nznVar.itemView.getContext(), oznVar.i, (p4r) nznVar.G.getValue(), DonutPostClickSource.Background);
                    break;
                }
                break;
            case 3:
                int i3 = ImEditChatControlParamsFragment.R;
                ((ImEditChatControlParamsFragment) obj).a0();
                break;
            case 4:
                ((as30.a) obj).a();
                break;
            case 5:
                ((FunctionReferenceImpl) obj).invoke();
                break;
            case 6:
                kux presenter = ((nux) obj).getPresenter();
                if (presenter != null) {
                    presenter.p7();
                    break;
                }
                break;
            case 7:
                LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = (LegoStickersBottomSheetDialog) obj;
                int i4 = LegoStickersBottomSheetDialog.d0;
                Dialog dialog = legoStickersBottomSheetDialog.s;
                if (dialog != null) {
                    dialog.dismiss();
                }
                LegoStickersBottomSheetDialog.a aVar = legoStickersBottomSheetDialog.b0;
                if (aVar != null && (ww50Var = aVar.b) != null) {
                    ww50Var.H(aVar);
                    break;
                }
                break;
            case 8:
                m870 m870Var = (m870) obj;
                if (m870Var.f) {
                    int rating = (int) m870Var.d.getRating();
                    izs<NotificationCSatRate, s3q0> onSubmit = m870Var.getOnSubmit();
                    if (onSubmit != null) {
                        onSubmit.invoke(rating >= 5 ? NotificationCSatRate.Star5 : rating >= 4 ? NotificationCSatRate.Star4 : rating >= 3 ? NotificationCSatRate.Star3 : rating >= 2 ? NotificationCSatRate.Star2 : NotificationCSatRate.Star1);
                        break;
                    }
                }
                break;
            case 9:
                c090.a.C2632a c2632a = (c090.a.C2632a) obj;
                Good good = ((a090) c2632a.m).a.a;
                e090 e090Var = c2632a.n;
                if (e090Var == null || (commonMarketStat$TypeRefSource = e090Var.d) == null) {
                    commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.OTHER_ITEMS;
                }
                c2632a.s.e(c2632a.itemView.getContext(), new rz00(good, commonMarketStat$TypeRefSource, e090Var != null ? e090Var.e : null, Integer.valueOf(c2632a.getAbsoluteAdapterPosition()), null, e090Var != null ? Integer.valueOf((int) e090Var.a) : null, e090Var != null ? Long.valueOf(e090Var.c) : null, e090Var != null ? e090Var.b : null, c2632a.o, c2632a.p, null, null, null, null, null, null, 64528));
                break;
            case 10:
                com.vk.sharing.core.view.f fVar = (com.vk.sharing.core.view.f) obj;
                l.a aVar2 = fVar.D;
                if (aVar2 != null) {
                    aVar2.O2(fVar.A1());
                    break;
                }
                break;
            case 11:
                int i5 = VkFriendsPickerActivity.p;
                ((VkFriendsPickerActivity) obj).onBackPressed();
                break;
            case 12:
                zzv0 zzv0Var = (zzv0) obj;
                uzv0 uzv0Var = zzv0Var.b;
                if (uzv0Var != null) {
                    uzv0Var.a(zzv0Var.getContext());
                }
                uzv0 uzv0Var2 = zzv0Var.b;
                if (uzv0Var2 != null) {
                    uzv0Var2.b(SystemClock.elapsedRealtime(), false);
                    break;
                }
                break;
            default:
                int i6 = VoipScheduledCallSettingsFragment.T;
                xn50.a.c((VoipScheduledCallSettingsFragment) obj, zxw0.a.b);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ aj6(gzs gzsVar) {
        this.b = 5;
        this.c = (FunctionReferenceImpl) gzsVar;
    }
}
