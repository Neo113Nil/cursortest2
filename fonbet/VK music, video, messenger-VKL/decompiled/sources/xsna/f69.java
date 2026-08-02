package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.broadcast.activity.GroupRecordsWrapperActivity;
import com.vk.voip.ui.call_effects.presentation.VoipSelectEffectInCallFragment;
import com.vk.voip.ui.media_request.VoipEnableOwnMicAndVideoRequestedDialog;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.gy50;
import xsna.phw0;

/* compiled from: CallNavigation.kt */
/* loaded from: classes7.dex */
public final class f69 {
    public final Context a;
    public final phw0 b;
    public final yoa0 c;
    public final com.vk.voip.ui.hint.a d;
    public zbs e;

    /* compiled from: CallNavigation.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipEnableOwnMicAndVideoRequestedDialog.RequestMedia.values().length];
            try {
                iArr[VoipEnableOwnMicAndVideoRequestedDialog.RequestMedia.CAMERA_MICROPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipEnableOwnMicAndVideoRequestedDialog.RequestMedia.MICROPHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f69(Context context, phw0 phw0Var, yoa0 yoa0Var, com.vk.voip.ui.hint.a aVar) {
        this.a = context;
        this.b = phw0Var;
        this.c = yoa0Var;
        this.d = aVar;
    }

    public final void a(gy50 gy50Var) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        L.e("onNavigationEvent ".concat(gy50.class.getSimpleName()));
        FragmentManager fragmentManager3 = null;
        FragmentManager fragmentManager4 = null;
        FragmentManager fragmentManager5 = null;
        FragmentManager fragmentManager6 = null;
        FragmentManager fragmentManager7 = null;
        FragmentManager fragmentManager8 = null;
        if (gy50Var instanceof xp80) {
            zbs zbsVar = this.e;
            if (zbsVar != null) {
                VoipCallActivity voipCallActivity = (VoipCallActivity) ((ugm0) zbsVar).c;
                int i = VoipCallActivity.P;
                fragmentManager4 = voipCallActivity.getSupportFragmentManager();
            }
            if (fragmentManager4 != null && !fragmentManager4.T()) {
                new w59().Td(fragmentManager4, "CallMediaRequestDialog");
                s3q0 s3q0Var = s3q0.a;
            }
        } else if (gy50Var instanceof tr80) {
            tr80 tr80Var = (tr80) gy50Var;
            zbs zbsVar2 = this.e;
            if (zbsVar2 != null) {
                VoipCallActivity voipCallActivity2 = (VoipCallActivity) ((ugm0) zbsVar2).c;
                int i2 = VoipCallActivity.P;
                fragmentManager5 = voipCallActivity2.getSupportFragmentManager();
            }
            if (fragmentManager5 != null && !fragmentManager5.T()) {
                int i3 = uk90.l1;
                CallMemberId callMemberId = tr80Var.a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("participant_id_key", callMemberId);
                uk90 uk90Var = new uk90();
                uk90Var.setArguments(bundle);
                uk90Var.Td(fragmentManager5, "ParticipantMediaRequestDialog");
                s3q0 s3q0Var2 = s3q0.a;
            }
        } else {
            int i4 = 1;
            if (gy50Var instanceof rp80) {
                b(new qt5(i4, (rp80) gy50Var, this));
            } else if (gy50Var instanceof wr80) {
                wr80 wr80Var = (wr80) gy50Var;
                Context context = wr80Var.a;
                qvw0 qvw0Var = wr80Var.b;
                if (qvw0Var instanceof svw0) {
                    this.b.a(new phw0.c(new WeakReference(context)));
                } else if (qvw0Var instanceof rvw0) {
                    qvw0 qvw0Var2 = cqm0.l(((rvw0) qvw0Var).a) != 0 ? qvw0Var : null;
                    bpn0 bpn0Var = enj.a;
                    Activity h = e3m.h(context);
                    if (qvw0Var2 != null && h != null) {
                        rvw0 rvw0Var = (rvw0) qvw0Var2;
                        int i5 = GroupRecordsWrapperActivity.A;
                        long l = cqm0.l(rvw0Var.a);
                        String str = rvw0Var.h;
                        Intent intent = new Intent(h, (Class<?>) GroupRecordsWrapperActivity.class);
                        intent.putExtra("OWNER_ID", l);
                        intent.putExtra("GROUP_NAME", str);
                        h.startActivity(intent);
                    }
                }
            } else {
                boolean z = gy50Var instanceof izy;
                Context context2 = this.a;
                if (z) {
                    izy izyVar = (izy) gy50Var;
                    zbs zbsVar3 = this.e;
                    if (zbsVar3 != null) {
                        VoipCallActivity voipCallActivity3 = (VoipCallActivity) ((ugm0) zbsVar3).c;
                        int i6 = VoipCallActivity.P;
                        fragmentManager6 = voipCallActivity3.getSupportFragmentManager();
                    }
                    if (fragmentManager6 != null && !fragmentManager6.T()) {
                        new hzy(context2, new com.vk.movika.sdk.base.logic.processor.actions.i(fragmentManager6, 7)).a(izyVar.a);
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                } else if (gy50Var.equals(gy50.i.a)) {
                    zbs zbsVar4 = this.e;
                    if (zbsVar4 != null) {
                        VoipCallActivity voipCallActivity4 = (VoipCallActivity) ((ugm0) zbsVar4).c;
                        int i7 = VoipCallActivity.P;
                        fragmentManager2 = voipCallActivity4.getSupportFragmentManager();
                    } else {
                        fragmentManager2 = null;
                    }
                    if (fragmentManager2 != null && !fragmentManager2.T()) {
                        com.vk.voip.ui.sessionrooms.b.a().e(null);
                        s3q0 s3q0Var4 = s3q0.a;
                    }
                } else if (gy50Var.equals(gy50.h.a)) {
                    this.c.a = true;
                    WhiteboardFragment.a aVar = new WhiteboardFragment.a(WhiteboardFragment.class, null, null);
                    aVar.s(true);
                    dhr0.a.getClass();
                    aVar.w(dhr0.u().c);
                    aVar.k(context2);
                } else if (gy50Var.equals(gy50.n.a)) {
                    b(new m7(this, 16));
                } else if (gy50Var instanceof gy50.b) {
                    gy50.b bVar = (gy50.b) gy50Var;
                    zbs zbsVar5 = this.e;
                    if (zbsVar5 != null) {
                        VoipCallActivity voipCallActivity5 = (VoipCallActivity) ((ugm0) zbsVar5).c;
                        int i8 = VoipCallActivity.P;
                        fragmentManager = voipCallActivity5.getSupportFragmentManager();
                    } else {
                        fragmentManager = null;
                    }
                    if (fragmentManager != null && !fragmentManager.T()) {
                        Bundle b = yfb.b(new Pair("media_option", bVar.a));
                        msw0 msw0Var = new msw0();
                        msw0Var.setArguments(b);
                        msw0Var.x = null;
                        msw0Var.Td(fragmentManager, "");
                        s3q0 s3q0Var5 = s3q0.a;
                    }
                } else {
                    int i9 = 3;
                    if (gy50Var instanceof gy50.j) {
                        b(new ut6(i9, this, (gy50.j) gy50Var));
                    } else {
                        int i10 = 10;
                        if (gy50Var.equals(gy50.c.a)) {
                            int i11 = 9;
                            if (com.vk.voip.ui.c.b.s0()) {
                                b(new a60(i11));
                            } else if (com.vk.voip.ui.c.r == OKVoipEngine.b) {
                                b(new a60(i11));
                            } else {
                                b(new zx(this, i10));
                            }
                        } else if (gy50Var instanceof gy50.l) {
                            b(new jm0((gy50.l) gy50Var, 5));
                        } else {
                            int i12 = 2;
                            if (gy50Var instanceof gy50.d) {
                                b(new aq1(i12, this, (gy50.d) gy50Var));
                            } else if (gy50Var instanceof gy50.e) {
                                b(new np5(i4, (gy50.e) gy50Var, this));
                            } else if (gy50Var.equals(gy50.g.a)) {
                                b(new g20(this, i10));
                            } else if (gy50Var instanceof gy50.k) {
                                zbs zbsVar6 = this.e;
                                if (zbsVar6 != null) {
                                    VoipCallActivity voipCallActivity6 = (VoipCallActivity) ((ugm0) zbsVar6).c;
                                    int i13 = VoipCallActivity.P;
                                    fragmentManager7 = voipCallActivity6.getSupportFragmentManager();
                                }
                                if (fragmentManager7 != null && !fragmentManager7.T()) {
                                    VoipSelectEffectInCallFragment voipSelectEffectInCallFragment = new VoipSelectEffectInCallFragment();
                                    voipSelectEffectInCallFragment.setArguments(yfb.b(new Pair("ARG_EFFECT_TYPE", 1)));
                                    voipSelectEffectInCallFragment.Td(fragmentManager7, "SelectMaskFragment");
                                    s3q0 s3q0Var6 = s3q0.a;
                                }
                            } else if (gy50Var instanceof gy50.m) {
                                zbs zbsVar7 = this.e;
                                if (zbsVar7 != null) {
                                    VoipCallActivity voipCallActivity7 = (VoipCallActivity) ((ugm0) zbsVar7).c;
                                    int i14 = VoipCallActivity.P;
                                    fragmentManager8 = voipCallActivity7.getSupportFragmentManager();
                                }
                                if (fragmentManager8 != null && !fragmentManager8.T()) {
                                    VoipSelectEffectInCallFragment voipSelectEffectInCallFragment2 = new VoipSelectEffectInCallFragment();
                                    voipSelectEffectInCallFragment2.setArguments(yfb.b(new Pair("ARG_EFFECT_TYPE", 2)));
                                    voipSelectEffectInCallFragment2.Td(fragmentManager8, "SelectMaskFragment");
                                    s3q0 s3q0Var7 = s3q0.a;
                                }
                            } else if (gy50Var.equals(gy50.a.a)) {
                                this.d.h(R.string.voip_enable_your_camera_to_change_beauty_filter_message, new xkw(com.vk.voip.ui.c.b, 3));
                            } else {
                                if (!gy50Var.equals(gy50.f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zbs zbsVar8 = this.e;
                                if (zbsVar8 != null) {
                                    VoipCallActivity voipCallActivity8 = (VoipCallActivity) ((ugm0) zbsVar8).c;
                                    int i15 = VoipCallActivity.P;
                                    fragmentManager3 = voipCallActivity8.getSupportFragmentManager();
                                }
                                if (fragmentManager3 != null && !fragmentManager3.T()) {
                                    com.vk.voip.ui.c.b.getClass();
                                    fw6 fw6Var = com.vk.voip.ui.c.W;
                                    if (fw6Var != null) {
                                        fw6Var.b(fragmentManager3);
                                    }
                                    s3q0 s3q0Var8 = s3q0.a;
                                }
                            }
                        }
                    }
                }
            }
        }
        s3q0 s3q0Var9 = s3q0.a;
    }

    public final void b(izs<? super FragmentManager, s3q0> izsVar) {
        FragmentManager fragmentManager;
        zbs zbsVar = this.e;
        if (zbsVar != null) {
            VoipCallActivity voipCallActivity = (VoipCallActivity) ((ugm0) zbsVar).c;
            int i = VoipCallActivity.P;
            fragmentManager = voipCallActivity.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        if (fragmentManager == null || fragmentManager.T()) {
            return;
        }
        izsVar.invoke(fragmentManager);
    }
}
