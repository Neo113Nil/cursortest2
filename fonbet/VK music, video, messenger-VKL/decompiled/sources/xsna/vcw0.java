package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vk.voip.ui.call_by_link.ui.a;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.hgw0;
import xsna.hgw0.a;
import xsna.izw0;
import xsna.vuw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vcw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vcw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String string;
        int i;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                com.vk.voip.ui.actions.feature.b bVar = (com.vk.voip.ui.actions.feature.b) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    bVar.c.b();
                }
                return s3q0.a;
            case 1:
                final hgw0 hgw0Var = (hgw0) obj2;
                ?? r0 = hgw0Var.l;
                ?? r3 = hgw0Var.i;
                ?? r4 = hgw0Var.g;
                VoipCallByLinkViewState.MediaSettingDialog mediaSettingDialog = (VoipCallByLinkViewState.MediaSettingDialog) obj;
                int i3 = VoipCallByLinkFragment.T;
                if (mediaSettingDialog.equals(VoipCallByLinkViewState.MediaSettingDialog.a.a)) {
                    dw20 dw20Var = hgw0Var.n;
                    if (dw20Var != null) {
                        dw20Var.hide();
                    }
                    hgw0Var.n = null;
                } else {
                    if (!(mediaSettingDialog instanceof VoipCallByLinkViewState.MediaSettingDialog.Visible)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final VoipCallByLinkViewState.MediaSettingDialog.Visible visible = (VoipCallByLinkViewState.MediaSettingDialog.Visible) mediaSettingDialog;
                    VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting setting = visible.a;
                    Context context = hgw0Var.a;
                    if (hgw0Var.n == null) {
                        hgw0Var.n = new dw20.b(context, hgw0Var.c).D0(hgw0Var.a(), false).Z(hgw0Var.new a()).x(0).u(0).c(new jgj(hgw0Var.a(), 0, 0, 14)).I0("hgw0");
                    }
                    Toolbar toolbar = (Toolbar) hgw0Var.e.getValue();
                    VoipCallByLinkViewState.MediaSettingDialog.Visible.SelectedOption selectedOption = visible.b;
                    int[] iArr = hgw0.b.$EnumSwitchMapping$0;
                    int i4 = iArr[setting.ordinal()];
                    if (i4 == 1) {
                        string = context.getString(R.string.voip_call_by_link_setting_media_microphones_title);
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = context.getString(R.string.voip_call_by_link_setting_media_video_title);
                    }
                    toolbar.setTitle(string);
                    ((RadioButton) r4.getValue()).setOnCheckedChangeListener(null);
                    ((RadioButton) r4.getValue()).setChecked(selectedOption == VoipCallByLinkViewState.MediaSettingDialog.Visible.SelectedOption.ENABLED);
                    ((RadioButton) r4.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.ggw0
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            hgw0Var.b.a(new a.b.d(VoipCallByLinkViewState.MediaSettingDialog.Visible.this.a));
                        }
                    });
                    int i5 = 5;
                    ((View) hgw0Var.f.getValue()).setOnClickListener(new eju(5, visible, hgw0Var));
                    ((RadioButton) r3.getValue()).setOnCheckedChangeListener(null);
                    ((RadioButton) r3.getValue()).setChecked(selectedOption == VoipCallByLinkViewState.MediaSettingDialog.Visible.SelectedOption.DISABLED_ON_JOIN);
                    ((RadioButton) r3.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.fgw0
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            hgw0Var.b.a(new a.b.C2037b(VoipCallByLinkViewState.MediaSettingDialog.Visible.this.a));
                        }
                    });
                    int i6 = iArr[setting.ordinal()];
                    if (i6 == 1) {
                        i = R.string.voip_call_by_link_setting_media_state_disabled_on_join_microphone;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.voip_call_by_link_setting_media_state_disabled_on_join_camera;
                    }
                    ((TextView) hgw0Var.j.getValue()).setText(i);
                    ((View) hgw0Var.h.getValue()).setOnClickListener(new c6u(5, visible, hgw0Var));
                    ((RadioButton) r0.getValue()).setOnCheckedChangeListener(null);
                    ((RadioButton) r0.getValue()).setChecked(selectedOption == VoipCallByLinkViewState.MediaSettingDialog.Visible.SelectedOption.DISABLED_PERMANENT);
                    ((RadioButton) r0.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.egw0
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            hgw0Var.b.a(new a.b.c(VoipCallByLinkViewState.MediaSettingDialog.Visible.this.a));
                        }
                    });
                    ((View) hgw0Var.k.getValue()).setOnClickListener(new te5(10, visible, hgw0Var));
                    bwt0.i0((View) hgw0Var.m.getValue(), new ftu0(hgw0Var, i5));
                }
                return s3q0.a;
            case 2:
                mjw0 mjw0Var = (mjw0) obj2;
                Boolean bool = (Boolean) obj;
                ListGroupCallView listGroupCallView = mjw0Var.f;
                listGroupCallView.b5(bool.booleanValue());
                GroupCallGridContainerView groupCallGridContainerView = mjw0Var.e;
                groupCallGridContainerView.d.U4(bool.booleanValue());
                if (!bool.booleanValue()) {
                    listGroupCallView.V4();
                    groupCallGridContainerView.d.Q4();
                }
                boolean booleanValue = bool.booleanValue();
                mjw0Var.W0.dispose();
                if (booleanValue) {
                    com.vk.voip.ui.c.b.getClass();
                    mjw0Var.W0 = io.reactivex.rxjava3.kotlin.c.f(3, com.vk.voip.ui.c.D0.b.d().a0(asu0.a.d()), null, null, new j6l0(mjw0Var, 29));
                }
                return s3q0.a;
            case 3:
                return ((kr5) obj2).b(((Integer) obj).intValue());
            case 4:
                ((puw0) obj2).T((vuw0.b) obj);
                return s3q0.a;
            default:
                VoipVideoListFragment voipVideoListFragment = (VoipVideoListFragment) obj2;
                int i7 = VoipVideoListFragment.S;
                if (!((izw0) obj).equals(izw0.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                voipVideoListFragment.getParentFragmentManager().k0(new Bundle(), "SELECTED");
                return s3q0.a;
        }
    }
}
