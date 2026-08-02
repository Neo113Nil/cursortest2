package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.bridges.ImageViewer;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.WritePermission;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.im.engine.di.scope.ImScope;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.ui.components.chat_profile.a;
import com.vk.im.ui.fragments.ImFragment;
import com.vk.im.ui.utils.AppBarLayoutStateListener;
import com.vk.im.ui.views.WriteBarDisabledMoveToMaxBanner;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.e3m;
import xsna.kxb;
import xsna.m4a0;
import xsna.vxd0;
import xsna.w9b;
import xsna.xxd0;

/* compiled from: ChatProfileComponent.kt */
/* loaded from: classes2.dex */
public final class zwb extends j8i {
    public static final /* synthetic */ qcy<Object>[] n;
    public final Context i;
    public final com.vk.im.engine.models.c j;
    public ImFragment k;
    public final g9e0 l;
    public final txd0 m;

    /* compiled from: ChatProfileComponent.kt */
    public interface a {
        void J();
    }

    /* compiled from: ChatProfileComponent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<xxd0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(xxd0 xxd0Var) {
            zwb zwbVar = (zwb) this.receiver;
            qcy<Object>[] qcyVarArr = zwb.n;
            zwbVar.Y0(xxd0Var);
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(zwb.class, "chatProfileVc", "getChatProfileVc()Lcom/vk/im/ui/components/chat_profile/ProfileVc;", 0);
        fpf0.a.getClass();
        n = new qcy[]{propertyReference1Impl};
    }

    public zwb(Context context, final vxd0 vxd0Var, final boolean z, com.vk.im.engine.models.c cVar) {
        txd0 create;
        this.i = context;
        this.j = cVar;
        this.l = new g9e0(new gzs() { // from class: xsna.ywb
            @Override // xsna.gzs
            public final Object invoke() {
                zwb zwbVar = this;
                Context context2 = zwbVar.i;
                boolean z2 = z;
                vxd0 vxd0Var2 = vxd0Var;
                return z2 ? new w9b(context2, vxd0Var2.a(), zwbVar.j) : new com.vk.im.ui.components.chat_profile.a(context2, vxd0Var2.a());
            }
        });
        if (vxd0Var instanceof vxd0.b) {
            vxd0.b bVar = (vxd0.b) vxd0Var;
            DialogExt dialogExt = bVar.c;
            a1w a1wVar = bVar.e;
            mxv mxvVar = bVar.h;
            b25 b25Var = bVar.l;
            FragmentActivity fragmentActivity = bVar.a;
            ImScope imScope = bVar.d;
            lzv lzvVar = bVar.f;
            kbj0 kbj0Var = bVar.g;
            jbs jbsVar = bVar.k;
            com.vk.im.ui.views.avatars.b bVar2 = new com.vk.im.ui.views.avatars.b(bVar.b, true);
            FragmentActivity fragmentActivity2 = bVar.a;
            u9h0 u9h0Var = new u9h0(fragmentActivity2);
            r0n0 r0n0Var = new r0n0(fragmentActivity2);
            sj90 sj90Var = new sj90();
            g3a0 g3a0Var = new g3a0();
            a1w a1wVar2 = bVar.e;
            mxv mxvVar2 = bVar.h;
            zdw zdwVar = bVar.i;
            ImageViewer imageViewer = bVar.j;
            FragmentActivity fragmentActivity3 = bVar.a;
            Peer peer = bVar.c.f;
            kkm kkmVar = bVar.m;
            create = new rul(dialogExt, a1wVar, mxvVar, b25Var, new kxb(fragmentActivity, a1wVar, imScope, lzvVar, mxvVar, kbj0Var, b25Var, jbsVar, bVar2, u9h0Var, r0n0Var, sj90Var, g3a0Var, new e8v(a1wVar2, mxvVar2, zdwVar, imageViewer, fragmentActivity3, peer, true, kkmVar), kkmVar, imageViewer, new kxb.a(false, false, false, false, false, true)));
        } else if (vxd0Var instanceof vxd0.c) {
            vxd0.c cVar2 = (vxd0.c) vxd0Var;
            create = new m4a0(cVar2.a, cVar2.b.k(), cVar2.c, new m4a0.c(), new g3a0());
        } else {
            if (!(vxd0Var instanceof vxd0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            create = ((vxd0.a) vxd0Var).a.create();
        }
        this.m = create;
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        this.m.onConfigurationChanged(configuration);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        View c = X0().c(layoutInflater, viewGroup);
        io.reactivex.rxjava3.subjects.f p = X0().p();
        xz xzVar = new xz(new j9(this, 23), 14);
        p.getClass();
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(p, xzVar, io.reactivex.rxjava3.internal.functions.a.c);
        txd0 txd0Var = this.m;
        c0Var.subscribe(txd0Var.f());
        I0(io.reactivex.rxjava3.kotlin.c.f(2, txd0Var.getState(), null, new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 14), new b(1, this, zwb.class, "renderState", "renderState(Lcom/vk/im/ui/components/chat_profile/viewmodels/base/ProfileInfoState;)V", 0)));
        I0(txd0Var.b().a0(asu0.a.d()).subscribe(new f40(new e1(this, 20), 7), kwg0.b()));
        txd0Var.d();
        return c;
    }

    @Override // xsna.j8i
    public final void N0() {
        this.m.t();
        X0().onDestroyView();
        this.l.d();
    }

    @Override // xsna.j8i
    public final void Q0() {
        this.m.e();
        X0().h();
    }

    @Override // xsna.j8i
    public final void R0() {
        this.m.getClass();
        X0().k();
    }

    public final u0e0 X0() {
        qcy<Object> qcyVar = n[0];
        return (u0e0) this.l.b();
    }

    public final void Y0(xxd0 xxd0Var) {
        Drawable a2;
        if (xxd0Var instanceof xxd0.b) {
            xxd0.b bVar = (xxd0.b) xxd0Var;
            u0e0 X0 = X0();
            int i = 0;
            if (X0 instanceof w9b) {
                w9b w9bVar = (w9b) X0;
                AppBarLayoutStateListener appBarLayoutStateListener = w9bVar.G;
                boolean z = bVar.j;
                CharSequence charSequence = bVar.b;
                CharSequence charSequence2 = bVar.a;
                CharSequence charSequence3 = bVar.c;
                TextView textView = w9bVar.m;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(charSequence2);
                Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, bVar.e, w9bVar.b, null, 28);
                if (h != null) {
                    baf0 baf0Var = (baf0) h;
                    h.setBounds(0, cn70.b(2), baf0Var.b.getIntrinsicWidth(), cn70.b(2) + baf0Var.b.getIntrinsicHeight());
                    TextView textView2 = w9bVar.m;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setCompoundDrawablesRelative(null, null, h, null);
                }
                TextView textView3 = w9bVar.x;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText(charSequence);
                TextView textView4 = w9bVar.x;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setVisibility(charSequence.length() > 0 ? 0 : 8);
                TextView textView5 = w9bVar.y;
                if (textView5 == null) {
                    textView5 = null;
                }
                textView5.setVisibility(charSequence3.length() > 0 ? 0 : 8);
                TextView textView6 = w9bVar.y;
                if (textView6 == null) {
                    textView6 = null;
                }
                textView6.setText(charSequence3);
                TextView textView7 = w9bVar.r;
                if (textView7 == null) {
                    textView7 = null;
                }
                textView7.setText(charSequence3);
                if (bVar.h) {
                    VkImAvatar vkImAvatar = w9bVar.j;
                    if (vkImAvatar == null) {
                        vkImAvatar = null;
                    }
                    VkImAvatar.e1(vkImAvatar);
                } else if (bVar.i) {
                    VkImAvatar vkImAvatar2 = w9bVar.j;
                    if (vkImAvatar2 == null) {
                        vkImAvatar2 = null;
                    }
                    VkImAvatar.f1(vkImAvatar2);
                } else {
                    VkImAvatar vkImAvatar3 = w9bVar.j;
                    if (vkImAvatar3 == null) {
                        vkImAvatar3 = null;
                    }
                    ImageList imageList = bVar.k;
                    Drawable drawable = bVar.l;
                    qcy<Object>[] qcyVarArr = VkImAvatar.z;
                    vkImAvatar3.Z0(imageList, drawable);
                }
                w9bVar.l = z;
                w9bVar.v(appBarLayoutStateListener.c);
                boolean z2 = bVar.f;
                Toolbar toolbar = w9bVar.f;
                if (toolbar == null) {
                    toolbar = null;
                }
                MenuItem findItem = toolbar.getMenu().findItem(R.id.action_chat_profile_settings);
                if (findItem != null) {
                    findItem.setVisible(z2);
                }
                boolean z3 = bVar.g;
                Toolbar toolbar2 = w9bVar.f;
                if (toolbar2 == null) {
                    toolbar2 = null;
                }
                MenuItem findItem2 = toolbar2.getMenu().findItem(R.id.action_chat_profile_share);
                if (findItem2 != null) {
                    findItem2.setVisible(z3);
                }
                List<xub> list = bVar.n;
                List<xub> list2 = bVar.o;
                ChatProfileActionsView chatProfileActionsView = w9bVar.z;
                if (chatProfileActionsView != null) {
                    chatProfileActionsView.T4(list, list2);
                }
                w9bVar.u(appBarLayoutStateListener.c);
                List<nwb> list3 = bVar.p;
                u8b u8bVar = w9bVar.E;
                if (u8bVar == null) {
                    u8bVar = null;
                }
                u8bVar.setItems(list3);
                boolean z4 = bVar.q;
                int i2 = z4 ? -1 : -2;
                AppBarLayout appBarLayout = w9bVar.g;
                AppBarLayout appBarLayout2 = appBarLayout == null ? null : appBarLayout;
                if (appBarLayout == null) {
                    appBarLayout = null;
                }
                ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
                layoutParams.height = i2;
                appBarLayout2.setLayoutParams(layoutParams);
                if (z4) {
                    View view = w9bVar.C;
                    if (view == null) {
                        view = null;
                    }
                    a2 = new ColorDrawable(dhr0.Y(R.attr.vk_ui_background_content, view.getContext()));
                } else {
                    View view2 = w9bVar.C;
                    if (view2 == null) {
                        view2 = null;
                    }
                    Context context = view2.getContext();
                    e3m.a aVar = e3m.a;
                    a2 = m33.a(R.drawable.bg_rounded_corners_bottom_20, context);
                }
                View view3 = w9bVar.C;
                if (view3 == null) {
                    view3 = null;
                }
                view3.setBackground(a2);
                int i3 = w9b.a.$EnumSwitchMapping$2[bVar.r.ordinal()];
                hdu0 odu0Var = i3 != 1 ? i3 != 2 ? vep.a : new odu0() : new pdu0();
                VkImAvatar vkImAvatar4 = w9bVar.j;
                if (vkImAvatar4 == null) {
                    vkImAvatar4 = null;
                }
                vkImAvatar4.W0(odu0Var, false);
                String obj = charSequence2.toString();
                TextView textView8 = w9bVar.m;
                if (textView8 == null) {
                    textView8 = null;
                }
                qj80.a(textView8, new x9b(textView8, w9bVar, obj, i));
                TextView textView9 = w9bVar.m;
                (textView9 != null ? textView9 : null).setClickable(z);
            } else if (X0 instanceof com.vk.im.ui.components.chat_profile.a) {
                com.vk.im.ui.components.chat_profile.a aVar2 = (com.vk.im.ui.components.chat_profile.a) X0;
                aVar2.getClass();
                AppBarLayoutStateListener appBarLayoutStateListener2 = aVar2.G;
                List<xub> list4 = bVar.n;
                List<xub> list5 = bVar.o;
                boolean z5 = bVar.q;
                CharSequence charSequence4 = bVar.s;
                CharSequence charSequence5 = bVar.d;
                CharSequence charSequence6 = bVar.b;
                CharSequence charSequence7 = bVar.a;
                CharSequence charSequence8 = bVar.c;
                TextView textView10 = aVar2.m;
                if (textView10 == null) {
                    textView10 = null;
                }
                textView10.setText(charSequence7);
                TextView textView11 = aVar2.x;
                if (textView11 == null) {
                    textView11 = null;
                }
                textView11.setText(charSequence6);
                TextView textView12 = aVar2.x;
                if (textView12 == null) {
                    textView12 = null;
                }
                textView12.setVisibility(charSequence6.length() > 0 ? 0 : 8);
                if (o25.b(o25.a())) {
                    TextView textView13 = aVar2.y;
                    if (textView13 == null) {
                        textView13 = null;
                    }
                    textView13.setVisibility(charSequence5.length() > 0 ? 0 : 8);
                    TextView textView14 = aVar2.y;
                    if (textView14 == null) {
                        textView14 = null;
                    }
                    textView14.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
                } else {
                    TextView textView15 = aVar2.y;
                    if (textView15 == null) {
                        textView15 = null;
                    }
                    textView15.setVisibility(charSequence8.length() > 0 ? 0 : 8);
                    charSequence5 = charSequence8;
                }
                TextView textView16 = aVar2.y;
                if (textView16 == null) {
                    textView16 = null;
                }
                textView16.setText(charSequence5);
                TextView textView17 = aVar2.r;
                if (textView17 == null) {
                    textView17 = null;
                }
                textView17.setText(charSequence8);
                if (charSequence4 != null) {
                    TextView textView18 = aVar2.C;
                    if (textView18 == null) {
                        textView18 = null;
                    }
                    textView18.setVisibility(0);
                    TextView textView19 = aVar2.C;
                    if (textView19 == null) {
                        textView19 = null;
                    }
                    textView19.setText(charSequence4);
                } else {
                    TextView textView20 = aVar2.C;
                    if (textView20 == null) {
                        textView20 = null;
                    }
                    f4m.j(textView20);
                }
                if (bVar.h) {
                    VkImAvatar vkImAvatar5 = aVar2.i;
                    if (vkImAvatar5 == null) {
                        vkImAvatar5 = null;
                    }
                    VkImAvatar.e1(vkImAvatar5);
                } else if (bVar.i) {
                    VkImAvatar vkImAvatar6 = aVar2.i;
                    if (vkImAvatar6 == null) {
                        vkImAvatar6 = null;
                    }
                    VkImAvatar.f1(vkImAvatar6);
                } else {
                    VkImAvatar vkImAvatar7 = aVar2.i;
                    if (vkImAvatar7 == null) {
                        vkImAvatar7 = null;
                    }
                    ImageList imageList2 = bVar.k;
                    Drawable drawable2 = bVar.l;
                    qcy<Object>[] qcyVarArr2 = VkImAvatar.z;
                    vkImAvatar7.Z0(imageList2, drawable2);
                }
                aVar2.l = bVar.j;
                aVar2.y(appBarLayoutStateListener2.c);
                List<nwb> list6 = bVar.p;
                mwb mwbVar = aVar2.D;
                if (mwbVar == null) {
                    mwbVar = null;
                }
                mwbVar.setItems(list6);
                aVar2.u(z5);
                int i4 = a.C1143a.$EnumSwitchMapping$2[bVar.r.ordinal()];
                hdu0 odu0Var2 = i4 != 1 ? i4 != 2 ? vep.a : new odu0() : new pdu0();
                VkImAvatar vkImAvatar8 = aVar2.i;
                if (vkImAvatar8 == null) {
                    vkImAvatar8 = null;
                }
                vkImAvatar8.W0(odu0Var2, false);
                boolean z6 = !bVar.v;
                aVar2.M = z6;
                aVar2.z(z6);
                String obj2 = charSequence7.toString();
                TextView textView21 = aVar2.m;
                if (textView21 == null) {
                    textView21 = null;
                }
                qj80.a(textView21, new cyb(textView21, aVar2, obj2));
                WritePermission writePermission = bVar.t;
                if ((writePermission != null ? writePermission.a : null) == WritePermission.State.DISABLED_MOVED_TO_MAX) {
                    if (aVar2.W == null) {
                        CoordinatorLayout coordinatorLayout = aVar2.d;
                        if (coordinatorLayout == null) {
                            coordinatorLayout = null;
                        }
                        WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner = (WriteBarDisabledMoveToMaxBanner) ((ViewStub) coordinatorLayout.findViewById(R.id.write_bar_disabled_max_stub)).inflate();
                        aVar2.W = writeBarDisabledMoveToMaxBanner;
                        if (writeBarDisabledMoveToMaxBanner != null) {
                            writeBarDisabledMoveToMaxBanner.setActionBridge(g2v.c().k());
                        }
                        WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner2 = aVar2.W;
                        if (writeBarDisabledMoveToMaxBanner2 != null) {
                            writeBarDisabledMoveToMaxBanner2.setScreen(WriteBarDisabledMoveToMaxBanner.Screen.CHAT_PROFILE);
                        }
                    }
                    WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner3 = aVar2.W;
                    if (writeBarDisabledMoveToMaxBanner3 != null) {
                        writeBarDisabledMoveToMaxBanner3.setVisibility(0);
                    }
                    WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner4 = aVar2.W;
                    if (writeBarDisabledMoveToMaxBanner4 != null) {
                        TransitionData transitionData = bVar.u;
                        writeBarDisabledMoveToMaxBanner4.setLink(transitionData != null ? transitionData.c : null);
                    }
                    Toolbar toolbar3 = aVar2.e;
                    if (toolbar3 == null) {
                        toolbar3 = null;
                    }
                    MenuItem findItem3 = toolbar3.getMenu().findItem(R.id.action_chat_profile_settings);
                    if (findItem3 != null) {
                        findItem3.setVisible(false);
                    }
                    Toolbar toolbar4 = aVar2.e;
                    MenuItem findItem4 = (toolbar4 == null ? null : toolbar4).getMenu().findItem(R.id.action_chat_profile_share);
                    if (findItem4 != null) {
                        findItem4.setVisible(false);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list5) {
                        xub xubVar = (xub) obj3;
                        if ((xubVar instanceof dvb) || (xubVar instanceof fwb) || (xubVar instanceof tvb) || (xubVar instanceof yvb) || (xubVar instanceof hwb) || (xubVar instanceof lvb) || (xubVar instanceof rvb) || (xubVar instanceof jvb)) {
                            arrayList.add(obj3);
                        }
                    }
                    ChatProfileActionsView chatProfileActionsView2 = aVar2.j;
                    if (chatProfileActionsView2 != null) {
                        chatProfileActionsView2.T4(list4, arrayList);
                    }
                    ChatProfileActionsView chatProfileActionsView3 = aVar2.j;
                    if (chatProfileActionsView3 != null) {
                        chatProfileActionsView3.setTint(R.attr.vk_ui_text_accent_themed);
                    }
                    aVar2.x(appBarLayoutStateListener2.c);
                } else {
                    WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner5 = aVar2.W;
                    if (writeBarDisabledMoveToMaxBanner5 != null) {
                        writeBarDisabledMoveToMaxBanner5.setVisibility(8);
                    }
                    boolean z7 = bVar.f;
                    Toolbar toolbar5 = aVar2.e;
                    if (toolbar5 == null) {
                        toolbar5 = null;
                    }
                    MenuItem findItem5 = toolbar5.getMenu().findItem(R.id.action_chat_profile_settings);
                    if (findItem5 != null) {
                        findItem5.setVisible(z7);
                    }
                    boolean z8 = bVar.g;
                    Toolbar toolbar6 = aVar2.e;
                    MenuItem findItem6 = (toolbar6 == null ? null : toolbar6).getMenu().findItem(R.id.action_chat_profile_share);
                    if (findItem6 != null) {
                        findItem6.setVisible(z8);
                    }
                    ChatProfileActionsView chatProfileActionsView4 = aVar2.j;
                    if (chatProfileActionsView4 != null) {
                        chatProfileActionsView4.T4(list4, list5);
                    }
                    ChatProfileActionsView chatProfileActionsView5 = aVar2.j;
                    if (chatProfileActionsView5 != null) {
                        chatProfileActionsView5.setTint(R.attr.vk_ui_text_accent_themed);
                    }
                    aVar2.x(appBarLayoutStateListener2.c);
                    aVar2.u(z5);
                }
            }
            X0().l();
        } else if (xxd0Var instanceof xxd0.a) {
            X0().l();
            X0().g(((xxd0.a) xxd0Var).a);
        } else {
            if (!(xxd0Var instanceof xxd0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            X0().e0();
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
