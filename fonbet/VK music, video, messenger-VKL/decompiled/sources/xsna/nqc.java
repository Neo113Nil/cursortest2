package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.masks.Mask;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.av20;
import xsna.dw20;

/* compiled from: ClipDialogHelper.kt */
/* loaded from: classes17.dex */
public final class nqc {
    public static final e520 a = new e520(R.id.go_to_clips, R.drawable.vk_icon_favorite_outline_28, R.string.video_go_to_clips, 0, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 b = new e520(R.id.go_to_camera, R.drawable.vk_icon_camera_outline_24, R.string.video_create_own_clip, 1, false, 0, 0, false, null, 0, null, false, 8176);

    /* JADX WARN: Type inference failed for: r6v13, types: [T, xsna.dw20] */
    public static void a(List list, Activity activity, k0d k0dVar) {
        dw20.a c;
        dw20.a i;
        l7s l7sVar = new l7s(activity, dhr0.a.v());
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ez20 p = rdi.p(activity, new kqc(ref$ObjectRef, 0));
        emc emcVar = new emc(new ah3(k0dVar, ref$ObjectRef));
        emcVar.setItems(list);
        int color = l7sVar.getColor(R.color.vk_black);
        int color2 = l7sVar.getColor(R.color.vk_gray_900);
        c = new dw20.b(l7sVar, tzp0.a(null, 3)).u0(dhr0.u().c).w0(l7sVar.getString(R.string.clip_additions_list)).S(color).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        i = ((dw20.b) c).l(color2).i(emcVar, (r3 & 2) == 0, false);
        ref$ObjectRef.element = ((dw20.b) i).d0(new eb(p, 12)).a0(new e4(p, 9)).I0("DialogEffectList");
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [T, xsna.dw20] */
    public static void b(Mask mask, Activity activity) {
        dw20.a i;
        dhr0 dhr0Var = dhr0.a;
        l7s l7sVar = new l7s(activity, dhr0Var.v());
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        l7s l7sVar2 = new l7s(activity, dhr0Var.v());
        av20.a aVar = new av20.a();
        aVar.d(R.layout.clips_modal_bottom_sheet_cell, LayoutInflater.from(l7sVar2));
        aVar.d = new lqc(false);
        aVar.e = new mqc();
        av20 b2 = aVar.b();
        b2.setItems(Collections.singletonList(mask));
        jqc jqcVar = new jqc(activity, mask, ref$ObjectRef);
        int f = e3m.f(R.attr.vk_ui_icon_contrast, l7sVar);
        int f2 = e3m.f(R.attr.vk_ui_text_contrast, l7sVar);
        int f3 = e3m.f(R.attr.vk_ui_background_negative, l7sVar);
        av20.a aVar2 = new av20.a();
        aVar2.d(R.layout.ds_internal_actions_popup_item, LayoutInflater.from(l7sVar));
        aVar2.d = new ux20(f2, l7sVar, f3, f, null);
        aVar2.e = new vx20(jqcVar);
        av20 b3 = aVar2.b();
        b3.setItems(e43.l(a, b));
        i = new dw20.b(l7sVar, tzp0.a(null, 3)).i(d920.y0(b2, b3), (r3 & 2) == 0, false);
        ref$ObjectRef.element = ((dw20.b) i).f0(new jy(ref$ObjectRef, 29)).I0("DialogEffect");
    }
}
