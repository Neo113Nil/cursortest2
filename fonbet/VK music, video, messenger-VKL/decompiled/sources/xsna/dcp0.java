package xsna;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoTopshelfClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bcp0;
import xsna.ybp0;

/* compiled from: TopshelfKidsView.kt */
/* loaded from: classes16.dex */
public final class dcp0 extends jp6 {
    public final Context d;
    public final boolean e;
    public final bcp0.d f;
    public final b25 g;
    public final jlu0 h;
    public final UIBlockTopshelf.TopshelfKids i;
    public final VideoTopshelfVh.d j;

    /* compiled from: TopshelfKidsView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            dcp0 dcp0Var = (dcp0) this.receiver;
            Context context = dcp0Var.d;
            jlu0 jlu0Var = dcp0Var.h;
            dcp0Var.f.invoke(ybp0.e.a);
            String str = dcp0Var.i.g;
            if (epx.f(str, "create_child_profile")) {
                und0 und0Var = new und0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoTopshelfClick(MobileOfficialAppsVideoStat$TypeVideoTopshelfClick.EventType.TOP_SHELF_CLICK, MobileOfficialAppsVideoStat$TypeVideoTopshelfClick.EventSubtype.VIDEO_CATALOG_FOR_KIDS_KID_PROFILE_CREATE), 2);
                und0Var.f = c;
                und0Var.g = b;
                und0Var.q();
                jlu0Var.l(context, dcp0Var.g.c());
            } else if (epx.f(str, "login_child_profile")) {
                und0 und0Var2 = new und0();
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoTopshelfClick(MobileOfficialAppsVideoStat$TypeVideoTopshelfClick.EventType.TOP_SHELF_CLICK, MobileOfficialAppsVideoStat$TypeVideoTopshelfClick.EventSubtype.VIDEO_CATALOG_FOR_KIDS_KID_PROFILE_GO), 2);
                und0Var2.f = c2;
                und0Var2.g = b2;
                und0Var2.q();
                bpn0 bpn0Var = enj.a;
                jlu0Var.h((FragmentActivity) e3m.h(context), MultiAccountEntryPoint.VkVideoOnboardingMainTab.d);
            }
            return s3q0.a;
        }
    }

    public dcp0(Context context, boolean z, bcp0.d dVar, b25 b25Var, jlu0 jlu0Var, UIBlockTopshelf.TopshelfKids topshelfKids, VideoTopshelfVh.d dVar2, boolean z2) {
        super(z2);
        this.d = context;
        this.e = z;
        this.f = dVar;
        this.g = b25Var;
        this.h = jlu0Var;
        this.i = topshelfKids;
        this.j = dVar2;
    }

    @Override // xsna.jp6
    public final void d(ConstraintLayout constraintLayout) {
        this.c = constraintLayout;
        VideoTopshelfVh.d dVar = this.j;
        Context context = this.d;
        UIBlockTopshelf.TopshelfKids topshelfKids = this.i;
        c(new yfw(context, topshelfKids, dVar), null);
        c(new w4j0(context), null);
        viy viyVar = new viy(context, new a(0, this, dcp0.class, "onPrimaryClick", "onPrimaryClick()V", 0));
        String str = topshelfKids.g;
        boolean f = epx.f(str, "create_child_profile");
        VkButton vkButton = viyVar.a;
        if (f) {
            vkButton.setText(R.string.topshelf_item_kid_account_create);
        } else if (epx.f(str, "login_child_profile")) {
            vkButton.setText(R.string.topshelf_item_kid_account_login);
        } else {
            vkButton.setText(R.string.watch);
        }
        wbp0.b(viyVar, new qhg0(this, 13));
        c(viyVar, null);
        vbp0 wiyVar = new wiy(context, topshelfKids, this.e);
        wbp0.b(wiyVar, new mz80(18, this, viyVar));
        c(wiyVar, null);
    }
}
