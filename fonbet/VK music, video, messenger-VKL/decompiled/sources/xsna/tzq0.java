package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.ecomm.design.view.productattaches.VideoProductAttachesViewImpl;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.VoipGroupSelectorFragment;
import com.vk.voip.ui.group_selector.ui.b;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.gm50;
import xsna.ikv0;
import xsna.pxw0;
import xsna.wzq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tzq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tzq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String string;
        String string2;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((rzq0) obj).b(new wow(((wzq0) obj2).b), wzq0.a.b);
                return s3q0.a;
            case 1:
                VKAnimationView vKAnimationView = (VKAnimationView) obj2;
                i700 i700Var = (i700) obj;
                a780 a780Var = vKAnimationView.p;
                if (a780Var != null) {
                    a780Var.onSuccess();
                }
                vKAnimationView.setRepeatCount(1);
                vKAnimationView.setComposition(i700Var);
                vKAnimationView.u = null;
                return s3q0.a;
            case 2:
                sns0 sns0Var = (sns0) obj2;
                if (sns0Var.hasWindowFocus()) {
                    sns0Var.h();
                }
                return s3q0.a;
            case 3:
                return VideoProductAttachesViewImpl.B((VideoProductAttachesViewImpl) obj2, ((Integer) obj).intValue());
            case 4:
                dbs0 dbs0Var = (dbs0) obj;
                ebs0 ebs0Var = ((sqt0) obj2).b;
                if (ebs0Var != null) {
                    ebs0Var.bk(dbs0Var);
                }
                return s3q0.a;
            case 5:
                uxt0 uxt0Var = (uxt0) obj2;
                boolean a = uxt0Var.C.a();
                iy0 iy0Var = new iy0(((ViewGroup) obj).getContext(), (ow0) uxt0Var.X.getValue(), uxt0Var.j, uxt0Var.A, uxt0Var.k, uxt0Var.m, uxt0Var.h, uxt0Var.i, uxt0Var.c, uxt0Var.b, a, uxt0Var.f, uxt0Var.t, uxt0Var.p.pe(), uxt0Var.f0);
                jw0 jw0Var = iy0Var.p;
                jw0Var.b();
                if (a) {
                    kw0 kw0Var = uxt0Var.T;
                    View view = kw0Var != null ? kw0Var.itemView : null;
                    if (view != null) {
                        jw0Var.setControlsView(view);
                        uxt0Var.T = null;
                    } else {
                        uxt0Var.S = new WeakReference<>(iy0Var);
                    }
                }
                return iy0Var;
            case 6:
                lcw0 lcw0Var = (lcw0) obj2;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.j0().G0();
                lcw0Var.g(false);
                lcw0Var.c.invoke();
                return s3q0.a;
            case 7:
                ngw0 ngw0Var = (ngw0) obj2;
                int i2 = ngw0.n1;
                yzt0<zkj> yzt0Var = ((pyf0) obj).a;
                o8 o8Var = new o8(ngw0Var, 14);
                ngw0Var.getClass();
                gm50.a.a(ngw0Var, yzt0Var, o8Var);
                return s3q0.a;
            case 8:
                ((VoipCallServiceFragment) obj2).R.setItems((List) obj);
                return s3q0.a;
            case 9:
                mjw0 mjw0Var = (mjw0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ikv0.a aVar = new ikv0.a(mjw0Var.getContext());
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_warning), (Size) null, 12);
                    aVar.u = new ikv0.d(mjw0Var.getContext().getString(R.string.voip_snackbar_vpn_title), mjw0Var.getContext().getString(R.string.voip_snackbar_vpn_subtitle), (ikv0.d.a) null, 4);
                    aVar.o = Integer.valueOf(cn70.b(108));
                    aVar.e = 10000L;
                    pkv0.f(aVar);
                }
                return s3q0.a;
            case 10:
                ((VoipCreateScheduleCallFragment) obj2).Q.a(new pxw0.i((mvo0) obj));
                return s3q0.a;
            case 11:
                sow0 sow0Var = (sow0) obj2;
                ?? r1 = sow0Var.l;
                ?? r6 = sow0Var.i;
                ?? r7 = sow0Var.j;
                b.a aVar2 = (b.a) obj;
                int i3 = VoipGroupSelectorFragment.R;
                Context context = sow0Var.a;
                if (aVar2 instanceof b.a.C2046b) {
                    b.a.C2046b c2046b = (b.a.C2046b) aVar2;
                    sow0Var.e();
                    if (sow0Var.d().getDisplayedChild() != 1) {
                        sow0Var.d().setDisplayedChild(1);
                    }
                    ((TextView) sow0Var.m.getValue()).setText(j03.g(context, c2046b.a, R.string.error));
                    jjc.g((VkButton) sow0Var.n.getValue(), new b3m0(sow0Var, 24));
                } else if (aVar2.equals(b.a.c.a)) {
                    dw20 dw20Var = sow0Var.o;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    sow0Var.o = null;
                    sow0Var.a().setLayoutManager(null);
                    sow0Var.a().setAdapter(null);
                    ((pow0) r6.getValue()).setItems(EmptyList.b);
                } else if (aVar2.equals(b.a.e.a)) {
                    sow0Var.e();
                    if (sow0Var.d().getDisplayedChild() != 0) {
                        sow0Var.d().setDisplayedChild(0);
                    }
                } else {
                    if (!(aVar2 instanceof b.a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b.a.g gVar = (b.a.g) aVar2;
                    sow0Var.e();
                    VoipGroupSelectorConfig voipGroupSelectorConfig = sow0Var.b;
                    if (sow0Var.d().getDisplayedChild() != 2) {
                        sow0Var.d().setDisplayedChild(2);
                    }
                    dnp0 dnp0Var = new dnp0();
                    dnp0Var.c(new biq().addTarget(sow0Var.c()).addTarget(sow0Var.b()).setDuration(200L));
                    dnp0Var.c(new biq().addTarget((TextView) r7.getValue()));
                    zmp0.a(sow0Var.d(), dnp0Var);
                    b.a.f fVar = gVar.b;
                    List<b.a.d> list = gVar.a;
                    boolean z = fVar instanceof b.a.f.C2049a;
                    if (z) {
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        if (!(fVar instanceof b.a.f.C2050b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dw20 dw20Var2 = sow0Var.o;
                        if (dw20Var2 != null) {
                            dw20Var2.On(3);
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                    }
                    if (z) {
                        bwt0.p0(sow0Var.c(), true);
                        Toolbar c = sow0Var.c();
                        VoipGroupSelectorConfig.TitleConfig titleConfig = voipGroupSelectorConfig.d;
                        if (titleConfig instanceof VoipGroupSelectorConfig.TitleConfig.Text) {
                            string2 = ((VoipGroupSelectorConfig.TitleConfig.Text) titleConfig).b;
                        } else {
                            if (!(titleConfig instanceof VoipGroupSelectorConfig.TitleConfig.ResId)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            string2 = context.getString(((VoipGroupSelectorConfig.TitleConfig.ResId) titleConfig).b);
                        }
                        c.setTitle(string2);
                        sow0Var.c().setNavigationIcon(enj.e(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_text_primary, context));
                        sow0Var.c().setNavigationContentDescription(R.string.accessibility_toolbar_return_back);
                        sow0Var.c().setNavigationOnClickListener(new i1f(sow0Var, 13));
                        bwt0.l0(sow0Var.c(), new c3k0(sow0Var, 21));
                    } else {
                        if (!(fVar instanceof b.a.f.C2050b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bwt0.p0(sow0Var.c(), false);
                    }
                    s3q0 s3q0Var3 = s3q0.a;
                    uow0 uow0Var = sow0Var.p;
                    if (z) {
                        bwt0.p0(sow0Var.b(), false);
                        sow0Var.b().T4();
                        VkSearchView b = sow0Var.b();
                        b.getClass();
                        b.postDelayed(new qd0(b, 1), 200L);
                        b.w.clearFocus();
                    } else {
                        if (!(fVar instanceof b.a.f.C2050b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bwt0.p0(sow0Var.b(), true);
                        sow0Var.b().getEditView().removeTextChangedListener(uow0Var);
                        sow0Var.b().setQuery(((b.a.f.C2050b) fVar).a);
                        sow0Var.b().getEditView().addTextChangedListener(uow0Var);
                        sow0Var.b().setOnBackClickListener(new fcs0(sow0Var, 9));
                        sow0Var.b().e5();
                        sow0Var.b().b5(200L);
                    }
                    if (sow0Var.a().getLayoutManager() == null || sow0Var.a().getAdapter() == null) {
                        sow0Var.a().setLayoutManager(new LinearLayoutManager());
                        sow0Var.a().setAdapter((pow0) r6.getValue());
                    }
                    ((pow0) r6.getValue()).setItems(list);
                    if (list.isEmpty()) {
                        bwt0.p0((TextView) r7.getValue(), true);
                        ((TextView) r7.getValue()).setText(context.getString(fVar instanceof b.a.f.C2050b ? R.string.voip_group_selector_empty_search_placeholder : R.string.voip_group_selector_empty_placeholder));
                    } else {
                        bwt0.p0((TextView) r7.getValue(), false);
                    }
                    TextView textView = (TextView) r1.getValue();
                    VoipGroupSelectorConfig.ButtonConfig buttonConfig = voipGroupSelectorConfig.e;
                    if (buttonConfig instanceof VoipGroupSelectorConfig.ButtonConfig.Text) {
                        string = ((VoipGroupSelectorConfig.ButtonConfig.Text) buttonConfig).b;
                    } else {
                        if (!(buttonConfig instanceof VoipGroupSelectorConfig.ButtonConfig.ResId)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = context.getString(((VoipGroupSelectorConfig.ButtonConfig.ResId) buttonConfig).b);
                    }
                    textView.setText(string);
                    ((TextView) r1.getValue()).setEnabled(gVar.c.a);
                    jjc.g((TextView) r1.getValue(), new ftu0(sow0Var, 7));
                }
                return s3q0.a;
            case 12:
                int i4 = qqw0.j1;
                ((com.vk.im.video.f) obj2).invoke();
                return s3q0.a;
            default:
                FragmentManager fragmentManager = ((com.vk.voip.ui.whiteboard.presentation.main.ui.a) obj2).a;
                androidx.fragment.app.a b2 = tk5.b(fragmentManager, fragmentManager);
                b2.g(R.id.voip_whiteboard_content, ((oz50) obj).f(), "Whiteboard");
                b2.k(true);
                return s3q0.a;
        }
    }
}
