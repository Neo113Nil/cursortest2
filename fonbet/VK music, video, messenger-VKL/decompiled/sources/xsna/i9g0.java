package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: ResetCountersInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class i9g0 implements g9g0 {
    public final j9g0 a;
    public final uuf0 b;
    public io.reactivex.rxjava3.disposables.c c;
    public VkTooltip d;
    public boolean e = true;

    public i9g0(j9g0 j9g0Var, uuf0 uuf0Var) {
        this.a = j9g0Var;
        this.b = uuf0Var;
    }

    public static void g(int i, Context context, boolean z) {
        int i2 = z ? R.drawable.vk_icon_check_circle_outline_28 : R.drawable.vk_icon_error_circle_outline_28;
        int i3 = z ? R.attr.vk_ui_icon_positive : R.attr.vk_ui_icon_negative;
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(i2, Integer.valueOf(i3), (Size) null, 12);
        aVar.u = new ikv0.d(context.getString(i), (String) null, (ikv0.d.a) null, 6);
        aVar.e = 3000L;
        aVar.k = 1;
        aVar.l = 1;
        aVar.n();
    }

    @Override // xsna.g9g0
    public final void a(Context context, int i, String str, FolderType folderType) {
        h(context, Integer.valueOf(i), str, folderType);
    }

    @Override // xsna.g9g0
    public final boolean b() {
        return this.b.b() && this.e;
    }

    @Override // xsna.g9g0
    public final void c() {
        VkTooltip vkTooltip = this.d;
        if (vkTooltip != null) {
            vkTooltip.dismiss();
        }
        this.d = null;
    }

    @Override // xsna.g9g0
    public final void d() {
        this.e = true;
    }

    @Override // xsna.g9g0
    public final void e(NavigationDelegateActivity navigationDelegateActivity, j58 j58Var) {
        l5p0 l5p0Var = new l5p0(navigationDelegateActivity);
        l5p0Var.setOnClickListenerNegativeBtn(new u01(this, 14));
        l5p0Var.setOnClickListenerPositiveBtn(new ofd0(1, this, navigationDelegateActivity));
        VkTooltip.a aVar = new VkTooltip.a(navigationDelegateActivity);
        aVar.q = l5p0Var;
        aVar.g = true;
        aVar.j = false;
        aVar.p = false;
        aVar.l = iah0.a(Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE);
        aVar.e = VkTooltip.Appearance.Inversion;
        aVar.f = VkTooltip.TooltipGravity.BOTTOM;
        this.d = aVar.a(f4m.c(j58Var));
    }

    @Override // xsna.g9g0
    public final void f(Context context) {
        h(context, null, null, null);
    }

    public final void h(final Context context, final Integer num, String str, final FolderType folderType) {
        String string;
        com.vk.im.popup.b bVar = new com.vk.im.popup.b(context);
        if (str == null || (string = context.getString(R.string.vkim_reset_folder_counters_confirm_title, str)) == null) {
            string = context.getString(R.string.vkim_reset_counters_confirm_title);
        }
        com.vk.im.popup.a.d(bVar, new f9g0(0, string, 0, context.getString(R.string.vkim_reset_counters_confirm_description), R.string.vkim_reset_counters_confirm_positive, null, R.string.vkim_reset_counters_confirm_negative, 933), new gzs() { // from class: xsna.h9g0
            @Override // xsna.gzs
            public final Object invoke() {
                i9g0 i9g0Var = i9g0.this;
                j9g0 j9g0Var = i9g0Var.a;
                Context context2 = context;
                FolderType folderType2 = folderType;
                i9g0Var.c = j9g0Var.a(0, num, new kfg(i9g0Var, context2, folderType2, 3), new defpackage.g0(i9g0Var, context2, folderType2, 5));
                return s3q0.a;
            }
        }, null, null, 12);
    }
}
