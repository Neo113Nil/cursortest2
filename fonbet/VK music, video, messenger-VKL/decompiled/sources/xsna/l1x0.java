package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Peer;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.di.VoipFirstCallCacheComponent;
import com.vk.voip.ui.share.link.pager_new.model.VoipShareLinkSheetButton;
import com.vk.voip.ui.share.link.pager_new.view.VoipShareLinkPagerViewNew;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.tlo0;

/* compiled from: VoipShareLinkPagerBottomSheet.kt */
/* loaded from: classes7.dex */
public final class l1x0 extends tl50<n1x0, a2x0, w1x0> {
    public static final /* synthetic */ int k1 = 0;
    public yhg i1;
    public final bpn0 j1 = new bpn0(new uyw0(this, 1));

    /* compiled from: VoipShareLinkPagerBottomSheet.kt */
    public static final class a extends dw20.b {
        public final Peer e;
        public final boolean f;

        public a(Context context, Peer peer, boolean z) {
            super(context, tzp0.a(null, 3));
            this.e = peer;
            this.f = z;
            E(true);
            F0(true);
            J();
            c(new cpo(false, iah0.a(50), 1));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            l1x0 l1x0Var = new l1x0();
            l1x0Var.setArguments(yfb.b(new Pair("key_peer", this.e), new Pair("key_is_video_enabled", Boolean.valueOf(this.f))));
            return l1x0Var;
        }
    }

    /* compiled from: VoipShareLinkPagerBottomSheet.kt */
    public static final class b {
        public final TextView a;
        public final VoipShareLinkPagerViewNew b;
        public final View c;
        public final VkButton d;
        public final VkButton e;

        public b(TextView textView, VoipShareLinkPagerViewNew voipShareLinkPagerViewNew, View view, VkButton vkButton, VkButton vkButton2) {
            this.a = textView;
            this.b = voipShareLinkPagerViewNew;
            this.c = view;
            this.d = vkButton;
            this.e = vkButton2;
        }
    }

    /* compiled from: VoipShareLinkPagerBottomSheet.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipShareLinkSheetButton.Type.values().length];
            try {
                iArr[VoipShareLinkSheetButton.Type.ForceCall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipShareLinkSheetButton.Type.ShareInChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipShareLinkSheetButton.Type.SystemSharing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_share_link_pager_bottom_sheet_view);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        a2x0 a2x0Var = (a2x0) ao50Var;
        TextView textView = (TextView) view.findViewById(R.id.title);
        VoipShareLinkPagerViewNew voipShareLinkPagerViewNew = (VoipShareLinkPagerViewNew) view.findViewById(R.id.share_link_view_pager);
        View findViewById = view.findViewById(R.id.progress_bar);
        VkButton vkButton = (VkButton) view.findViewById(R.id.share_btn);
        int[] iArr = VkButton.W;
        vkButton.a5(true, null);
        b bVar = new b(textView, voipShareLinkPagerViewNew, findViewById, vkButton, (VkButton) view.findViewById(R.id.call_btn));
        gm50.a.b(this, a2x0Var.a, new kvm0(bVar, 20));
        gm50.a.b(this, a2x0Var.b, new k1x0(0, bVar, this));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        n1x0 n1x0Var = (n1x0) vk50Var;
        n1x0Var.m.a(new gsq0(this, 13), this);
        n1x0Var.l.a(new skj0(this, 28), this);
    }

    public final void bo(b bVar, VkButton vkButton, VoipShareLinkSheetButton voipShareLinkSheetButton) {
        awt0.v(vkButton, voipShareLinkSheetButton != null);
        if (voipShareLinkSheetButton == null) {
            return;
        }
        vkButton.setText(tlo0.b.b(voipShareLinkSheetButton.a, getResources()));
        jjc.g(vkButton, new go6(voipShareLinkSheetButton, this, bVar, 10));
        vkButton.setVisibility(0);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i1 = new yhg(requireContext(), new vbs(kn()), g2v.c(), ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a(), ((VoipStereoRouterComponent) m7m.d(this).a(fpf0.a(VoipStereoRouterComponent.class))).a(), ((MaxUtilityComponent) m7m.d(this).mo408a(fpf0.a(MaxUtilityComponent.class))).j7());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r7 == null) goto L15;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Peer peer;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("key_peer", Peer.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("key_peer");
                if (!(parcelable3 instanceof Peer)) {
                    parcelable3 = null;
                }
                parcelable = (Peer) parcelable3;
            }
            peer = (Peer) parcelable;
        }
        peer = Peer.Unknown.e;
        Peer peer2 = peer;
        a1w a1wVar = q1w.a;
        a1w a1wVar2 = a1wVar != null ? a1wVar : null;
        kdw0<mdw0> Df = ((VoipAnalyticsInternalComponent) m7m.d(this).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df();
        fow0 x8 = ((VoipFirstCallCacheComponent) m7m.d(this).a(fpf0.a(VoipFirstCallCacheComponent.class))).x8();
        Bundle arguments2 = getArguments();
        return new n1x0(peer2, a1wVar2, Df, x8, arguments2 != null ? arguments2.getBoolean("key_is_video_enabled") : false);
    }
}
