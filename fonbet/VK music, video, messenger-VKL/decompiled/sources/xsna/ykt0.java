package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.channels.impl.post_settings.visible_to_dons.VisibleToDonsPickerView;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.typography.FontFamily;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.avatars.stack.VoipStackAvatarView;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vk.voip.ui.share.link.pager_new.model.VoipShareLinkSheetButton;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import xsna.dp90.a;
import xsna.dp90.b;
import xsna.dw20;
import xsna.h7u0;
import xsna.p1x0;
import xsna.sew0;
import xsna.xo90;
import xsna.z1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ykt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ykt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c1, code lost:
    
        if ((r14 instanceof xsna.ka80) != false) goto L89;
     */
    /* JADX WARN: Type inference failed for: r14v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v67, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List<CallsAudioDeviceInfo> list;
        CallsAudioDeviceInfo none;
        int i = this.b;
        int i2 = 2;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj).getClass();
                ((iri0) obj2).invoke();
                return s3q0.a;
            case 1:
                return VisibleToDonsPickerView.a((VisibleToDonsPickerView) obj2);
            case 2:
                pno0 pno0Var = (pno0) obj;
                Regex regex = VkAuthPhoneView.q;
                return new ono0(pno0Var.e(), ((VkAuthPhoneView) obj2).getPhoneWithoutCode(), pno0Var.c(), pno0Var.a(), pno0Var.b());
            case 3:
                return new igu0((FrameLayout) obj, (ggu0) obj2);
            case 4:
                int i3 = VkCellSkeleton.n;
                ((vjv0) obj).setShimmer((ThemableShimmer) obj2);
                return s3q0.a;
            case 5:
                l5v0 l5v0Var = (l5v0) obj2;
                sxp sxpVar = (sxp) obj;
                l5v0Var.getClass();
                if (!(sxpVar instanceof u480)) {
                    if (!(sxpVar instanceof r480)) {
                        break;
                    } else {
                        z = ((r480) sxpVar).c.b(Long.valueOf(l5v0Var.a));
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            case 6:
                ((k7w0) obj2).l.invoke();
                return s3q0.a;
            case 7:
                lcw0 lcw0Var = (lcw0) obj2;
                Context requireContext = lcw0Var.a.requireContext();
                final gvw0 invoke = lcw0Var.b.invoke();
                EnumSet<CallsAudioManager.AudioDeviceType> enumSet = g7i0.a;
                com.vk.voip.ui.a.a.getClass();
                CallsAudioManager callsAudioManager = com.vk.voip.ui.a.d.b;
                if (callsAudioManager == null || (list = callsAudioManager.getAvailableAudioDevices()) == null) {
                    list = EmptyList.b;
                }
                final ArrayList arrayList = new ArrayList(list);
                HashMap hashMap = new HashMap(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    hashMap.put(((CallsAudioDeviceInfo) next).getDeviceType(), next);
                }
                if (epx.f(g7i0.a, hashMap.keySet())) {
                    CallsAudioManager callsAudioManager2 = com.vk.voip.ui.a.d.b;
                    if (callsAudioManager2 == null || (none = callsAudioManager2.getCurrentDevice()) == null) {
                        none = CallsAudioDeviceInfo.Companion.getNONE();
                    }
                    CallsAudioManager.AudioDeviceType deviceType = none.getDeviceType();
                    CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
                    if (deviceType == audioDeviceType) {
                        audioDeviceType = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
                    }
                    g7i0.a((CallsAudioDeviceInfo) hashMap.get(audioDeviceType), invoke);
                } else {
                    int i4 = h7u0.p;
                    h7u0.a c = h7u0.b.c(requireContext);
                    c.R(new h9m(requireContext, arrayList), new DialogInterface.OnClickListener() { // from class: xsna.f7i0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            g7i0.a((CallsAudioDeviceInfo) arrayList.get(i5), invoke);
                            dialogInterface.dismiss();
                        }
                    });
                    c.c = true;
                    c.m();
                }
                return s3q0.a;
            case 8:
                int intValue = ((Integer) obj).intValue();
                sew0.b bVar = (sew0.b) ((sew0) obj2);
                if (!bVar.d) {
                    return bVar.a();
                }
                bVar.a();
                return js5.a(intValue, bVar.a());
            case 9:
                VoipStackAvatarView voipStackAvatarView = (VoipStackAvatarView) obj2;
                List list2 = (List) obj;
                int i5 = wmw0.i1;
                List list3 = list2;
                int size = list2.size();
                voipStackAvatarView.getClass();
                for (sew0 sew0Var : j5g.H0(list3, 3)) {
                    AvatarView avatarView = new AvatarView(voipStackAvatarView.getContext(), null, 6, 0);
                    avatarView.setBackground(new rcc(voipStackAvatarView.e));
                    int i6 = voipStackAvatarView.b;
                    voipStackAvatarView.addView(avatarView, new ViewGroup.LayoutParams(i6, i6));
                    rcc rccVar = (rcc) avatarView.getBackground();
                    rccVar.c = voipStackAvatarView.e;
                    rccVar.e = true;
                    rccVar.invalidateSelf();
                    int i7 = voipStackAvatarView.d;
                    avatarView.setPadding(i7, i7, i7, i7);
                    x59.a(avatarView, sew0Var);
                }
                if (voipStackAvatarView.h && size > 3) {
                    TextView textView = new TextView(voipStackAvatarView.getContext());
                    FrameLayout frameLayout = new FrameLayout(voipStackAvatarView.getContext());
                    frameLayout.setBackground(new rcc(voipStackAvatarView.e));
                    rcc rccVar2 = (rcc) frameLayout.getBackground();
                    rccVar2.c = voipStackAvatarView.e;
                    rccVar2.e = true;
                    rccVar2.invalidateSelf();
                    int i8 = voipStackAvatarView.d;
                    frameLayout.setPadding(i8, i8, i8, i8);
                    frameLayout.addView(textView);
                    int i9 = voipStackAvatarView.b;
                    voipStackAvatarView.addView(frameLayout, new ViewGroup.LayoutParams(i9, i9));
                    textView.setBackground(new rcc(voipStackAvatarView.f));
                    textView.setGravity(17);
                    textView.setText("+" + ((Object) uqm0.o(size - 3)));
                    textView.setTextSize(0, ((float) voipStackAvatarView.b) / 2.5f);
                    com.vk.typography.b.k(textView, FontFamily.MEDIUM, null, 6);
                    textView.setTextColor(voipStackAvatarView.i);
                }
                return s3q0.a;
            case 10:
                VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj2;
                xo90 xo90Var = (xo90) obj;
                int i10 = VoipPastCallsFragment.a0;
                if (xo90Var.equals(xo90.c.a)) {
                    VoipPastCallsFragment.b bVar2 = voipPastCallsFragment.Q;
                    if (bVar2 == null) {
                        bVar2 = null;
                    }
                    dp90 dp90Var = bVar2.e;
                    dp90Var.l = null;
                    dw20 dw20Var = dp90Var.m;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    dp90Var.m = null;
                    dp90Var.a().setLayoutManager(null);
                    dp90Var.a().setAdapter(null);
                    ((cp90) dp90Var.j.getValue()).setItems(EmptyList.b);
                } else {
                    if (!(xo90Var instanceof xo90.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VoipPastCallsFragment.b bVar3 = voipPastCallsFragment.Q;
                    dp90 dp90Var2 = (bVar3 != null ? bVar3 : null).e;
                    dp90Var2.l = (xo90.e) xo90Var;
                    if (dp90Var2.m == null) {
                        bwt0.i0((VoipAvatarViewContainer) dp90Var2.f.getValue(), new l850(dp90Var2, i2));
                        dp90Var2.m = new dw20.b(dp90Var2.a, dp90Var2.d).D0(dp90Var2.b(), false).e0(dp90Var2.new b()).Z(dp90Var2.new a()).f0(new s6x(16)).I0("dp90");
                    }
                    dp90Var2.c();
                }
                return s3q0.a;
            case 11:
                return new wzw0((ViewGroup) obj, ((szw0) obj2).j);
            default:
                p1x0 p1x0Var = (p1x0) obj2;
                z1x0.a aVar = (z1x0.a) obj;
                VoipShareLinkSheetButton voipShareLinkSheetButton = p1x0Var.e;
                qtd0 qtd0Var = aVar.e;
                if (!(qtd0Var instanceof User ? ((User) qtd0Var).P : qtd0Var instanceof Contact ? ((Contact) qtd0Var).n : true)) {
                    return voipShareLinkSheetButton;
                }
                int i11 = p1x0.a.$EnumSwitchMapping$0[aVar.d.ordinal()];
                if (i11 == 1) {
                    return p1x0Var.d;
                }
                if (i11 == 2 || i11 == 3) {
                    return voipShareLinkSheetButton;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
