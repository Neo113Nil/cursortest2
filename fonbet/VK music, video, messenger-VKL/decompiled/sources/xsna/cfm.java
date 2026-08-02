package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.ImageStatus;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.engine.models.typing.ComposingType;
import com.vk.im.ui.components.viewcontrollers.dialog_header.info.RefreshInfo;
import com.vk.im.ui.components.viewcontrollers.dialog_header.info.c;
import com.vk.im.ui.utils.TimeChangeReceiver;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.metrics.eventtracking.Event;
import com.vk.utils.vectordrawable.EnhancedAnimatedVectorDrawable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gko;
import xsna.u8m;

/* compiled from: DialogHeaderInfoVc.kt */
/* loaded from: classes2.dex */
public final class cfm implements dfm {
    public final jpf0 A;
    public final zri B;
    public final TimeChangeReceiver C;
    public final bpn0 D;
    public boolean E;
    public final c9m F;
    public z8m G;
    public a72 H;
    public final float I;
    public final Object J;
    public final dtk0 K;
    public final kkm a;
    public final boolean b;
    public final s2n0 c;
    public final View d;
    public efm e;
    public final Context f;
    public final Toolbar g;
    public final ViewGroup h;
    public final FrameLayout i;
    public final VkFadeText j;
    public final VkEnhancedImageView k;
    public final VkImageSimple l;
    public final VkImAvatar m;
    public final VkImageSimple n;
    public final VkImageSimple o;
    public final VkImageSimple p;
    public final VkImageSimple q;
    public final VkFadeText r;
    public final ViewGroup s;
    public final VkImageSimple t;
    public final yri u;
    public final Handler v;
    public final Object w;
    public final u9h0 x;
    public final r0n0 y;
    public final fai z;

    /* compiled from: DialogHeaderInfoVc.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RefreshInfo.values().length];
            try {
                iArr[RefreshInfo.REFRESHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImStoryState.values().length];
            try {
                iArr2[ImStoryState.SEEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ImStoryState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: DialogHeaderInfoVc.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((cfm) this.receiver).C();
            return s3q0.a;
        }
    }

    public cfm(LayoutInflater layoutInflater, ViewStub viewStub, kkm kkmVar, boolean z, s2n0 s2n0Var) {
        this.a = kkmVar;
        this.b = z;
        this.c = s2n0Var;
        if (viewStub != null) {
            viewStub.getContext();
        }
        viewStub.setLayoutResource(R.layout.vkim_dialog_header_info_v2_milkshake);
        View inflate = viewStub.inflate();
        this.d = inflate;
        Context context = layoutInflater.getContext();
        this.f = context;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.g = toolbar;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.content);
        this.h = viewGroup;
        FrameLayout frameLayout = (FrameLayout) toolbar.findViewById(R.id.avatar_wrapper);
        this.i = frameLayout;
        this.j = (VkFadeText) toolbar.findViewById(R.id.vkim_title_text);
        this.k = (VkEnhancedImageView) toolbar.findViewById(R.id.title_emoji);
        VkImageSimple vkImageSimple = (VkImageSimple) toolbar.findViewById(R.id.title_donut);
        this.l = vkImageSimple;
        this.m = (VkImAvatar) inflate.findViewById(R.id.avatar_content);
        this.n = (VkImageSimple) toolbar.findViewById(R.id.title_muted);
        this.o = (VkImageSimple) toolbar.findViewById(R.id.title_casper);
        this.p = (VkImageSimple) toolbar.findViewById(R.id.title_writing_disabled);
        VkImageSimple vkImageSimple2 = (VkImageSimple) toolbar.findViewById(R.id.title_dropdown);
        this.q = vkImageSimple2;
        this.r = (VkFadeText) toolbar.findViewById(R.id.subtitle_text);
        this.s = (ViewGroup) toolbar.findViewById(R.id.subtitle_container);
        VkImageSimple vkImageSimple3 = (VkImageSimple) toolbar.findViewById(R.id.typing_progress);
        this.t = vkImageSimple3;
        yri yriVar = new yri(context, e3m.f(R.attr.vk_ui_icon_secondary, context));
        this.u = yriVar;
        this.v = new Handler();
        this.w = new Object();
        this.x = new u9h0(context);
        this.y = new r0n0(context);
        this.z = new fai();
        this.A = new jpf0(context);
        this.B = new zri(context);
        TimeChangeReceiver timeChangeReceiver = new TimeChangeReceiver(context, new b(0, this, cfm.class, "invalidateDialogContent", "invalidateDialogContent()V", 0));
        this.C = timeChangeReceiver;
        this.D = new bpn0(new m3g(this, 9));
        this.F = new c9m(toolbar, kkmVar);
        this.I = hbh0.a(context, 12.0f);
        this.J = msy.a(LazyThreadSafetyMode.NONE, new bfm(this, 0));
        this.K = new dtk0();
        toolbar.setNavigationOnClickListener(new yg1(this, 2));
        toolbar.l(R.menu.vkim_dialog_header_info_v2_old);
        toolbar.setOnMenuItemClickListener(new k7(this, 14));
        if (!z) {
            jjc.g(viewGroup, new zqh(this, 9));
            jjc.g(frameLayout, new i4e(this, 21));
        }
        yriVar.setAlpha(127);
        vkImageSimple3.setImageDrawable(yriVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        context.registerReceiver(timeChangeReceiver.c, intentFilter);
        kkmVar.b(toolbar, R.attr.vk_ui_icon_accent_themed);
        kkmVar.d(vkImageSimple2, R.attr.vk_ui_icon_secondary);
        kkmVar.e(toolbar, new y2(this, 2));
        i(false);
        EmptyList emptyList = EmptyList.b;
        b(emptyList);
        e(null);
        q(RefreshInfo.DISCONNECTED);
        u(emptyList);
        C();
        vkImageSimple.setImageResource(R.drawable.vk_icon_donut_color_16);
    }

    public static int K(boolean z) {
        return z ? 0 : 8;
    }

    public final com.vk.im.popup.a A() {
        return (com.vk.im.popup.a) this.D.getValue();
    }

    public final void B(u8m u8mVar) {
        efm efmVar;
        v8m.a = null;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("IM.DIALOG_ACTION.SUCCEED");
        aVar.a(u8mVar, "action");
        aVar.a(Boolean.FALSE, "from_dialogs_list");
        bVar.k(aVar.e());
        if (u8mVar.equals(u8m.l0.b)) {
            efm efmVar2 = this.e;
            if (efmVar2 != null) {
                efmVar2.z();
            }
        } else if (u8mVar.equals(u8m.j0.b)) {
            efm efmVar3 = this.e;
            if (efmVar3 != null) {
                efmVar3.z();
            }
        } else if (u8mVar.equals(u8m.i0.b)) {
            efm efmVar4 = this.e;
            if (efmVar4 != null) {
                efmVar4.z();
            }
        } else if (u8mVar.equals(u8m.r0.b)) {
            efm efmVar5 = this.e;
            if (efmVar5 != null) {
                efmVar5.r();
            }
        } else if (u8mVar.equals(u8m.a.b)) {
            efm efmVar6 = this.e;
            if (efmVar6 != null) {
                efmVar6.y();
            }
        } else if (u8mVar.equals(u8m.a0.b)) {
            efm efmVar7 = this.e;
            if (efmVar7 != null) {
                efmVar7.B();
            }
        } else if (u8mVar.equals(u8m.j.b)) {
            efm efmVar8 = this.e;
            if (efmVar8 != null) {
                efmVar8.h();
            }
        } else if (u8mVar.equals(u8m.e.b) || u8mVar.equals(u8m.d.b) || u8mVar.equals(u8m.f.b)) {
            efm efmVar9 = this.e;
            if (efmVar9 != null) {
                efmVar9.u();
            }
        } else {
            if (u8mVar.equals(u8m.g0.b)) {
                efm efmVar10 = this.e;
                if (efmVar10 != null) {
                    efmVar10.m(true);
                }
            } else if (u8mVar.equals(u8m.f0.b)) {
                efm efmVar11 = this.e;
                if (efmVar11 != null) {
                    efmVar11.m(false);
                }
            } else if (u8mVar.equals(u8m.x.b)) {
                efm efmVar12 = this.e;
                if (efmVar12 != null) {
                    efmVar12.s(true);
                }
            } else if (u8mVar.equals(u8m.v.b)) {
                efm efmVar13 = this.e;
                if (efmVar13 != null) {
                    efmVar13.s(false);
                }
            } else if (u8mVar.equals(u8m.y.b)) {
                efm efmVar14 = this.e;
                if (efmVar14 != null) {
                    efmVar14.s(false);
                }
            } else if (u8mVar.equals(u8m.m.b)) {
                efm efmVar15 = this.e;
                if (efmVar15 != null) {
                    efmVar15.v();
                }
                DialogExt b2 = this.K.b();
                Dialog Cb = b2.Cb();
                if (Cb != null) {
                    com.vk.im.popup.a A = A();
                    String title = b2.getTitle();
                    Context context = this.f;
                    if (title == null || title.length() == 0) {
                        title = context.getString(R.string.vk_confirm);
                    }
                    String str = title;
                    SpannableStringBuilder c = cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_clear_history));
                    u8m.o0 o0Var = u8m.o0.b;
                    List singletonList = Collections.singletonList(new lwb0(null, R.string.vkim_chat_actions_delete_spam, null, null, 0, o0Var, false, null, false, false, 2013));
                    ArrayList arrayList = new ArrayList();
                    p4g.a(o0Var, arrayList, Cb.t1() && Cb.Cb());
                    s3q0 s3q0Var = s3q0.a;
                    A.e(new dic(0, str, R.string.vkim_msg_header_clear_submit_desc, null, c, R.string.vkim_cancel, singletonList, arrayList, 921), new t9e(this, 16));
                }
            } else if (u8mVar.equals(u8m.b0.b)) {
                J();
            } else if (u8mVar.equals(u8m.c0.b)) {
                J();
            } else if (u8mVar.equals(u8m.p0.b)) {
                efm efmVar16 = this.e;
                if (efmVar16 != null) {
                    efmVar16.b();
                }
            } else if (u8mVar.equals(u8m.q0.b)) {
                efm efmVar17 = this.e;
                if (efmVar17 != null) {
                    efmVar17.b();
                }
            } else if (u8mVar.equals(u8m.m0.b)) {
                efm efmVar18 = this.e;
                if (efmVar18 != null) {
                    efmVar18.c();
                }
            } else if (u8mVar.equals(u8m.u0.b)) {
                efm efmVar19 = this.e;
                if (efmVar19 != null) {
                    efmVar19.e();
                }
            } else if (u8mVar.equals(u8m.i.b)) {
                efm efmVar20 = this.e;
                if (efmVar20 != null) {
                    efmVar20.q();
                }
            } else if (u8mVar.equals(u8m.e0.b)) {
                efm efmVar21 = this.e;
                if (efmVar21 != null) {
                    efmVar21.d();
                }
                efm efmVar22 = this.e;
                if (efmVar22 != null) {
                    efmVar22.onClose();
                }
            } else if (u8mVar.equals(u8m.h0.b)) {
                efm efmVar23 = this.e;
                if (efmVar23 != null) {
                    efmVar23.i();
                }
            } else if (u8mVar.equals(u8m.k0.b)) {
                efm efmVar24 = this.e;
                if (efmVar24 != null) {
                    efmVar24.k();
                }
            } else if ((u8mVar instanceof u8m.r) && (efmVar = this.e) != null) {
                efmVar.t((u8m.r) u8mVar);
            }
        }
        z(u8mVar);
    }

    public final void C() {
        int i;
        dtk0 dtk0Var = this.K;
        boolean z = dtk0Var.a;
        VkImageSimple vkImageSimple = this.l;
        FrameLayout frameLayout = this.i;
        VkImAvatar vkImAvatar = this.m;
        ViewGroup viewGroup = this.h;
        Toolbar toolbar = this.g;
        Context context = this.f;
        if (z) {
            toolbar.setClipChildren(false);
            toolbar.setClipToPadding(false);
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            ImStoryState imStoryState = ImStoryState.NONE;
            vkImAvatar.setVisibility(0);
            if (vkImAvatar.getVisibility() == 0) {
                VkImAvatar.a1(vkImAvatar, null, null, 4);
                E(imStoryState);
            }
            F(false, null);
            vkImageSimple.setVisibility(K(false));
            I(false, context.getString(R.string.vkim_loading), null, false, false, false, false, false);
            H(false, "", null);
            toolbar.getMenu().findItem(R.id.chat_add_members).setVisible(false);
            G(c.d.a);
            toolbar.getMenu().findItem(R.id.more).setVisible(false);
            return;
        }
        Dialog dialog = dtk0Var.b;
        ProfilesSimpleInfo profilesSimpleInfo = dtk0Var.c;
        boolean z2 = this.G != null;
        qtd0 Ab = profilesSimpleInfo.Ab(dialog.Sb());
        ImageStatus E5 = Ab != null ? Ab.E5() : null;
        qtd0 zb = profilesSimpleInfo.zb(dialog.Zb());
        boolean k = zb != null ? qv20.k(zb) : false;
        CharSequence a2 = this.x.a(dialog, profilesSimpleInfo);
        toolbar.setClipChildren(false);
        toolbar.setClipToPadding(false);
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ImStoryState imStoryState2 = dtk0Var.l;
        vkImAvatar.setVisibility(0);
        if (vkImAvatar.getVisibility() == 0) {
            VkImAvatar.a1(vkImAvatar, dialog, profilesSimpleInfo, 4);
            E(imStoryState2);
        }
        F((dialog.Jc() || E5 == null) ? false : true, E5);
        vkImageSimple.setVisibility(K(dialog.o1()));
        this.z.getClass();
        VerifyInfo w = fai.w(dialog, profilesSimpleInfo);
        xuo0.a.getClass();
        boolean z3 = !dialog.Ac(xuo0.a());
        g2v.c().getClass();
        boolean z4 = this.E;
        n0v0 n0v0Var = n0v0.a;
        boolean c = n0v0Var.c(z4, z2);
        boolean z5 = this.b;
        I(true, a2, w, z3, c && !z5, dialog.sc(), dialog.Kc(), k);
        toolbar.getMenu().findItem(R.id.chat_add_members).setVisible(dtk0Var.j);
        G(dtk0Var.a());
        g2v.c().getClass();
        toolbar.getMenu().findItem(R.id.more).setVisible(n0v0Var.f(this.E, z2) && !z5);
        toolbar.getMenu().findItem(R.id.search).setVisible(dialog.Jc() || dialog.rc());
        RefreshInfo refreshInfo = dtk0Var.e;
        hcm hcmVar = dtk0Var.f;
        Dialog dialog2 = dtk0Var.b;
        ProfilesSimpleInfo profilesSimpleInfo2 = dtk0Var.c;
        boolean z6 = dtk0Var.m;
        if (refreshInfo != RefreshInfo.CONNECTED) {
            H(true, this.A.a(refreshInfo), null);
        } else if (dialog2.Jc()) {
            H(true, context.getString(R.string.vkim_dialog_with_self_subtitle), null);
        } else if (dialog2.rc()) {
            H(true, context.getString(R.string.vkim_business_notify_count_default), null);
        } else if (hcmVar.c()) {
            H(true, this.B.b(hcmVar, dialog2, profilesSimpleInfo2), hcmVar.b());
        } else if (z6 && dialog2.t1()) {
            H(true, context.getString(R.string.online), null);
        } else {
            boolean uc = dialog2.uc();
            r0n0 r0n0Var = this.y;
            H(!drm0.N(r1), (!uc || (i = dtk0Var.d) <= 0) ? r0n0Var.a(dialog2, profilesSimpleInfo2) : r0n0Var.b(dialog2, i), null);
        }
        int b2 = cn70.b(36);
        ViewGroup.LayoutParams layoutParams = vkImAvatar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        layoutParams2.width = b2;
        layoutParams2.height = b2;
        vkImAvatar.setLayoutParams(layoutParams2);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        bVar.i(constraintLayout);
        bVar.k(R.id.avatar_wrapper, 4, 0, 4);
        bVar.u(R.id.vkim_title_text).e.X = 2;
        bVar.b(constraintLayout);
    }

    public final void D(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.chat_add_members) {
            efm efmVar = this.e;
            if (efmVar != null) {
                efmVar.y();
                return;
            }
            return;
        }
        c9m c9mVar = this.F;
        dtk0 dtk0Var = this.K;
        if (itemId == R.id.call) {
            com.vk.im.ui.components.viewcontrollers.dialog_header.info.c a2 = dtk0Var.a();
            if ((a2 instanceof c.a) || epx.f(a2, c.f.a)) {
                if (dtk0Var.k) {
                    c9mVar.b(epx.f(a2, c.f.a) ? e43.l(u8m.w0.b, u8m.v0.b) : e43.l(u8m.g.b, u8m.h.b), new vfk(this, 1));
                    return;
                }
                efm efmVar2 = this.e;
                if (efmVar2 != null) {
                    efmVar2.o(false);
                    return;
                }
                return;
            }
            if (a2 instanceof c.e) {
                biu biuVar = ((c.e) a2).a;
                efm efmVar3 = this.e;
                if (efmVar3 != null) {
                    efmVar3.j(biuVar);
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == R.id.call_audio) {
            efm efmVar4 = this.e;
            if (efmVar4 != null) {
                efmVar4.o(false);
                return;
            }
            return;
        }
        if (itemId == R.id.call_video) {
            efm efmVar5 = this.e;
            if (efmVar5 != null) {
                efmVar5.o(true);
                return;
            }
            return;
        }
        if (itemId == R.id.call_more) {
            efm efmVar6 = this.e;
            if (efmVar6 != null) {
                efmVar6.w();
            }
            View actionView = this.g.getMenu().findItem(R.id.call_more).getActionView();
            if (actionView == null) {
                return;
            }
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            actionView.getContext();
            e.b bVar = new e.b(actionView, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            Context context = this.f;
            VkContextMenu.c.c(bVar, R.string.vkim_msg_header_menu_call_with_video, enj.c(R.drawable.vk_icon_videocam_outline_28, e3m.f(R.attr.vk_ui_icon_accent_themed, context), context), false, null, new m1i(this, 5), 24);
            VkContextMenu.c.c(bVar, R.string.vkim_msg_header_menu_call_with_max, m33.a(R.drawable.vk_icon_logo_max_color_24, context), false, null, new l9h(this, 7), 24);
            efm efmVar7 = this.e;
            if (efmVar7 != null) {
                efmVar7.x();
            }
            bVar.l(false);
            return;
        }
        if (itemId != R.id.more) {
            if (itemId == R.id.search) {
                B(u8m.r0.b);
                return;
            }
            return;
        }
        z8m z8mVar = this.G;
        n0v0 n0v0Var = n0v0.a;
        if (z8mVar == null) {
            v8m.a = new Object();
            g2v.c().getClass();
            c9mVar.b(n0v0Var.a(this.G == null, dtk0Var.g, dtk0Var.b), new wi3(1, this, cfm.class, "handleDialogActionClick", "handleDialogActionClick(Lcom/vk/im/ui/components/common/DialogAction;)V", 0, 7));
        } else {
            v8m.a = new Object();
            if (z8mVar != null) {
                g2v.c().getClass();
                z8mVar.b(n0v0Var.a(this.G == null, dtk0Var.g, dtk0Var.b), new xd8(1, this, cfm.class, "handleDialogActionClick", "handleDialogActionClick(Lcom/vk/im/ui/components/common/DialogAction;)V", 0, 5));
            }
        }
    }

    public final void E(ImStoryState imStoryState) {
        int i = a.$EnumSwitchMapping$1[imStoryState.ordinal()];
        this.m.W0(i != 1 ? i != 2 ? vep.a : new odu0() : new pdu0(), false);
    }

    public final void F(boolean z, ImageStatus imageStatus) {
        Image image;
        ImageSize Ab;
        int K = K(z);
        VkEnhancedImageView vkEnhancedImageView = this.k;
        vkEnhancedImageView.setVisibility(K);
        if (vkEnhancedImageView.getVisibility() == 0) {
            vkEnhancedImageView.o0((imageStatus == null || (image = imageStatus.d) == null || (Ab = image.Ab(cn70.b(16), false)) == null) ? null : Ab.d.d, null);
            vkEnhancedImageView.setContentDescription(imageStatus != null ? imageStatus.c : null);
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void G(com.vk.im.ui.components.viewcontrollers.dialog_header.info.c cVar) {
        Toolbar toolbar = this.g;
        MenuItem findItem = toolbar.getMenu().findItem(R.id.call);
        c.d dVar = c.d.a;
        boolean z = false;
        if (!epx.f(cVar, dVar) && !epx.f(cVar, c.b.a) && !epx.f(cVar, c.C1163c.a)) {
            if (!(cVar instanceof c.a) && !epx.f(cVar, c.f.a) && !(cVar instanceof c.e)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        findItem.setVisible(z);
        boolean z2 = cVar instanceof c.a;
        Context context = this.f;
        if (z2) {
            findItem.setIcon(R.drawable.vk_icon_phone_outline_28);
            findItem.setTitle(R.string.vkim_msg_header_menu_call);
            n720.b(findItem, ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, context)));
        } else if (cVar instanceof c.f) {
            findItem.setIcon(R.drawable.vk_icon_videocam_outline_28);
            findItem.setTitle(R.string.vkim_msg_header_menu_call);
            n720.b(findItem, ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, context)));
        } else if (cVar instanceof c.e) {
            findItem.setTitle(R.string.vkim_msg_header_menu_join_to_call);
            n720.b(findItem, null);
            ?? r6 = this.J;
            findItem.setIcon((EnhancedAnimatedVectorDrawable) r6.getValue());
            ((EnhancedAnimatedVectorDrawable) r6.getValue()).start();
        }
        Menu menu = toolbar.getMenu();
        menu.removeItem(R.id.call_audio);
        menu.removeItem(R.id.call_video);
        menu.removeItem(R.id.call_more);
        if (epx.f(cVar, c.b.a)) {
            x(R.id.call_audio, R.string.vkim_msg_header_menu_call_with_audio, R.drawable.vk_icon_phone_outline_28, 1, cn70.b(44), cn70.b(44));
            x(R.id.call_video, R.string.vkim_msg_header_menu_call_with_video, R.drawable.vk_icon_videocam_outline_28, 2, cn70.b(44), cn70.b(44));
        } else if (epx.f(cVar, c.C1163c.a)) {
            x(R.id.call_audio, R.string.vkim_msg_header_menu_call_with_audio, R.drawable.vk_icon_phone_outline_28, 1, cn70.b(44), cn70.b(44));
            x(R.id.call_more, R.string.more, R.drawable.vk_icon_more_vertical_28, 2, cn70.b(44), cn70.b(44));
        } else if (!epx.f(cVar, dVar) && !z2 && !epx.f(cVar, c.f.a) && !(cVar instanceof c.e)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void H(boolean z, String str, ComposingType composingType) {
        VkFadeText vkFadeText = this.r;
        vkFadeText.setMaxTextLines(1);
        vkFadeText.setFade(false);
        vkFadeText.setVisibility(K(z));
        vkFadeText.setText(str);
        VkImageSimple vkImageSimple = this.t;
        yri yriVar = this.u;
        if (composingType == null) {
            yriVar.setVisible(false, false);
            f4m.j(vkImageSimple);
        } else {
            yriVar.a(composingType);
            yriVar.setVisible(true, false);
            vkImageSimple.setVisibility(0);
        }
        ViewGroup viewGroup = this.s;
        if (f4m.h(viewGroup) != z) {
            viewGroup.setVisibility(K(z));
        }
    }

    public final void I(boolean z, CharSequence charSequence, VerifyInfo verifyInfo, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        VkFadeText vkFadeText = this.j;
        vkFadeText.setMaxTextLines(1);
        vkFadeText.setFade(false);
        vkFadeText.setVisibility(K(z));
        vkFadeText.setText(charSequence);
        int K = K(z4);
        VkImageSimple vkImageSimple = this.o;
        vkImageSimple.setVisibility(K);
        this.p.setVisibility(K(z5));
        Context context = this.f;
        this.i.setContentDescription(context.getString(R.string.vkim_accessibility_avatar_chat_name, charSequence));
        if (z4) {
            bwt0.o0(vkImageSimple, e3m.f(R.attr.vk_ui_icon_secondary, context));
        }
        this.n.setVisibility(K(z2));
        this.q.setVisibility(K(z3));
        VkImAvatar vkImAvatar = this.m;
        if (verifyInfo == null && vkImAvatar.U0("verified")) {
            vkImAvatar.T0("verified");
        } else if (verifyInfo != null) {
            if (o25.b(o25.a()) && verifyInfo.b && !vkImAvatar.U0("verified")) {
                vkImAvatar.Q0(new com.vk.core.view.components.avatar.badge.a((Drawable) new LayerDrawable(new Drawable[]{enj.c(R.drawable.bg_white_circle, e3m.f(R.attr.vk_ui_background_secondary, context), context), enj.c(R.drawable.vk_icon_education_12, R.attr.vk_ui_icon_accent_themed, context)}), false, VkAvatarBadge.Alignment.BottomRight, "verified", 8));
            } else if (verifyInfo.Db() && !vkImAvatar.U0("verified")) {
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                LayerDrawable g = VerifyInfoHelper.g(context, verifyInfo);
                if (g != null) {
                    vkImAvatar.Q0(new com.vk.core.view.components.avatar.badge.a((Drawable) g, false, VkAvatarBadge.Alignment.BottomRight, "verified", 8));
                }
            }
        }
        if (!z6) {
            vkImAvatar.T0("birthday");
            return;
        }
        float f = this.I;
        SizeF sizeF = new SizeF(f, f);
        vkImAvatar.getClass();
        gko.b bVar = gko.Companion;
        vkImAvatar.Q0(new com.vk.core.view.components.avatar.badge.a(gko.b(R.drawable.vk_icon_cake_circle_fill_purple_20, vkImAvatar.getContext()), true, VkAvatarBadge.Alignment.TopRight, sizeF, "birthday"));
    }

    public final void J() {
        com.vk.im.popup.a A = A();
        DialogExt b2 = this.K.b();
        EmptyList emptyList = EmptyList.b;
        boolean z = b2.i;
        int i = z ? R.string.vk_confirm : R.string.vkim_msg_header_leave_chat_submit_title;
        int i2 = z ? R.string.vkim_msg_header_leave_channel_submit_desc : R.string.vkim_msg_header_leave_chat_submit_desc;
        Context context = this.f;
        A.e(new gzy(i, null, i2, null, cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_exit)), R.string.vkim_kick_submit_no, Collections.singletonList(new lwb0(null, R.string.vkim_chat_actions_delete_spam, null, null, 0, u8m.o0.b, false, null, false, false, 2013)), emptyList, 922), new nfj(this, 8));
    }

    @Override // xsna.dfm
    public final void a() {
        A().b(new cic(R.string.vkim_msg_header_clear_progress_desc, 12, "", null, false), new wzh(this, 8));
    }

    @Override // xsna.dfm
    public final void b(List<? extends u8m> list) {
        dtk0 dtk0Var = this.K;
        if (epx.f(dtk0Var.g, list)) {
            return;
        }
        dtk0Var.g = list;
    }

    @Override // xsna.dfm
    public final void c() {
        A().dismiss();
    }

    @Override // xsna.dfm
    public final void d(Throwable th) {
        zk70.e(th);
    }

    @Override // xsna.dfm
    public final void destroy() {
        this.E = false;
        this.F.destroy();
        z8m z8mVar = this.G;
        if (z8mVar != null) {
            z8mVar.a(true);
        }
        owi.b(this.w);
        TimeChangeReceiver timeChangeReceiver = this.C;
        timeChangeReceiver.a.unregisterReceiver(timeChangeReceiver.c);
        A().dismiss();
        y();
    }

    @Override // xsna.dfm
    public final void e(z8m z8mVar) {
        if (epx.f(this.G, z8mVar)) {
            return;
        }
        this.F.a(true);
        this.G = z8mVar;
        C();
    }

    @Override // xsna.dfm
    public final void f(lfm lfmVar) {
        dtk0 dtk0Var = this.K;
        dtk0Var.a = false;
        Dialog dialog = lfmVar.a;
        if (dialog == null) {
            dialog = new Dialog();
        }
        dtk0Var.b = dialog;
        dtk0Var.c = lfmVar.b;
        dtk0Var.d = lfmVar.c;
        C();
    }

    @Override // xsna.dfm
    public final void g(efm efmVar) {
        this.e = efmVar;
    }

    @Override // xsna.dfm
    public final View getView() {
        return this.d;
    }

    @Override // xsna.dfm
    public final void h(boolean z) {
        dtk0 dtk0Var = this.K;
        if (dtk0Var.j != z) {
            dtk0Var.j = z;
            C();
        }
    }

    @Override // xsna.dfm
    public final void i(boolean z) {
        Toolbar toolbar = this.g;
        if (!z) {
            toolbar.setNavigationIcon((Drawable) null);
        } else {
            Context context = this.f;
            toolbar.setNavigationIcon(this.b ? enj.e(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed, context) : enj.e(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent_themed, context));
        }
    }

    @Override // xsna.dfm
    public final void j() {
        y();
    }

    @Override // xsna.dfm
    public final void k() {
        A().dismiss();
    }

    @Override // xsna.dfm
    public final void l() {
        A().dismiss();
    }

    @Override // xsna.dfm
    public final void m() {
        this.K.m = true;
        C();
        a72 a72Var = this.H;
        Handler handler = this.v;
        if (a72Var != null) {
            handler.removeCallbacks(a72Var);
        }
        a72 a72Var2 = new a72(this, 7);
        handler.postDelayed(a72Var2, 7000L);
        this.H = a72Var2;
    }

    @Override // xsna.dfm
    public final void n() {
        A().b(new ofg0(this.K.b().i ? R.string.vkim_msg_header_return_to_channel_progress_desc : R.string.vkim_msg_header_return_to_chat_progress_desc, 13, null, null, false), new wnh(this, 4));
    }

    @Override // xsna.dfm
    public final void o() {
        dtk0 dtk0Var = this.K;
        if (dtk0Var.a) {
            return;
        }
        dtk0Var.a = true;
        dtk0Var.b = new Dialog();
        dtk0Var.c = new ProfilesSimpleInfo();
        C();
    }

    @Override // xsna.dfm
    public final void p() {
        A().b(new fzy(this.K.b().i ? R.string.vkim_msg_header_leave_channel_progress_desc : R.string.vkim_msg_header_leave_chat_progress_desc, 13, null, null, false), new h1j(this, 5));
    }

    @Override // xsna.dfm
    public final void q(RefreshInfo refreshInfo) {
        dtk0 dtk0Var = this.K;
        if (dtk0Var.e != refreshInfo) {
            dtk0Var.e = refreshInfo;
            int i = a.$EnumSwitchMapping$0[refreshInfo.ordinal()];
            s2n0 s2n0Var = this.c;
            if (i == 1) {
                s2n0Var.b();
            } else {
                s2n0Var.a();
            }
            C();
        }
    }

    @Override // xsna.dfm
    public final void r(boolean z) {
        dtk0 dtk0Var = this.K;
        if (dtk0Var.k == z) {
            return;
        }
        dtk0Var.k = z;
        C();
    }

    @Override // xsna.dfm
    public final void s(boolean z) {
        dtk0 dtk0Var = this.K;
        if (dtk0Var.i != z) {
            dtk0Var.i = z;
            C();
        }
    }

    @Override // xsna.dfm
    public final void t(boolean z) {
        if (this.E != z) {
            this.F.a(true);
            this.E = z;
            C();
        }
    }

    @Override // xsna.dfm
    public final void u(List<vh30> list) {
        dtk0 dtk0Var = this.K;
        if (dtk0Var.f.a(list)) {
            return;
        }
        hcm hcmVar = dtk0Var.f;
        hcmVar.getClass();
        hcmVar.b = j5g.O0(list);
        dtk0Var.m = false;
        C();
    }

    @Override // xsna.dfm
    public final void v(ImStoryState imStoryState) {
        dtk0 dtk0Var = this.K;
        dtk0Var.l = imStoryState;
        E(imStoryState);
        List<Peer.Type> list = rdw.a;
        boolean a2 = rdw.a(dtk0Var.b.Zb(), dtk0Var.b.Jc());
        VkImAvatar vkImAvatar = this.m;
        if (a2 && dtk0Var.l.i()) {
            jjc.g(vkImAvatar, new qpj(this, 5));
        } else {
            g2v.c().getClass();
            if (this.b) {
                vkImAvatar.setOnClickListener(null);
            } else {
                jjc.g(vkImAvatar, new s6k(this, 3));
            }
        }
        C();
    }

    @Override // xsna.dfm
    public final void w(boolean z) {
        dtk0 dtk0Var = this.K;
        if (dtk0Var.h != z) {
            dtk0Var.h = z;
            C();
        }
    }

    @SuppressLint({"InflateParams"})
    public final void x(int i, int i2, int i3, int i4, int i5, int i6) {
        Toolbar toolbar = this.g;
        toolbar.getMenu().add(0, i, i4, i2);
        MenuItem findItem = toolbar.getMenu().findItem(i);
        Context context = this.f;
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkim_dialog_header_call_menu_item, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(i5, i6));
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.vkim_dialog_header_call_menu_icon);
        appCompatImageView.setContentDescription(context.getString(i2));
        appCompatImageView.setImageResource(i3);
        this.a.d(appCompatImageView, R.attr.vk_ui_icon_accent_themed);
        findItem.setActionView(inflate);
        findItem.setShowAsAction(2);
        jjc.g(appCompatImageView, new g84(10, this, findItem));
    }

    public final void y() {
        z8m z8mVar;
        this.v.removeCallbacksAndMessages(null);
        c9m c9mVar = this.F;
        if (c9mVar.isVisible()) {
            c9mVar.a(true);
        }
        z8m z8mVar2 = this.G;
        if (z8mVar2 == null || !z8mVar2.isVisible() || (z8mVar = this.G) == null) {
            return;
        }
        z8mVar.a(true);
    }

    public final void z(u8m u8mVar) {
        if (e43.l(u8m.l0.b, u8m.i0.b, u8m.e.b, u8m.d.b, u8m.f.b, u8m.w0.b, u8m.v0.b, u8m.g.b, u8m.h.b).contains(u8mVar)) {
            this.v.postDelayed(new kyc(this, 1), 500L);
        } else {
            y();
        }
    }
}
