package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vk.voip.ui.view.VoipActionSingleLineView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.i330;
import xsna.xcw0;
import xsna.ycw0;

/* compiled from: CallParticipantPermissionsView.kt */
/* loaded from: classes7.dex */
public final class r79 extends e41 {
    public final VoipActionMultiLineView e;
    public final VoipActionMultiLineView f;
    public final VoipActionMultiLineView g;
    public final VoipActionSingleLineView h;
    public final View i;
    public final View j;
    public final VoipActionMultiLineView k;
    public final VoipActionMultiLineView l;
    public final im7 m;
    public final p79 n;
    public final rj o;
    public final lcz p;

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaOptionState.values().length];
            try {
                iArr[MediaOptionState.UNMUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaOptionState.MUTED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            r79 r79Var = (r79) this.receiver;
            VoipActionMultiLineView voipActionMultiLineView = r79Var.l;
            voipActionMultiLineView.setSwitchListener(null);
            VoipActionMultiLineView.b(voipActionMultiLineView, booleanValue);
            voipActionMultiLineView.setSwitchListener(r79Var.n);
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class c extends PropertyReference1Impl {
        public static final c b = new c(o79.class, "isShowChatHistoryEnabled", "isShowChatHistoryEnabled()Z", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Boolean.valueOf(((o79) obj).f);
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            r79 r79Var = (r79) this.receiver;
            VoipActionSingleLineView voipActionSingleLineView = r79Var.h;
            voipActionSingleLineView.setSwitchListener(null);
            voipActionSingleLineView.b(booleanValue, false);
            voipActionSingleLineView.setSwitchListener(r79Var.o);
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class e extends PropertyReference1Impl {
        public static final e b = new e(o79.class, "mediaSettingMicrophone", "getMediaSettingMicrophone()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$MediaSettingMicrophone;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((o79) obj).b;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<ycw0.o, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.o oVar) {
            ycw0.o oVar2 = oVar;
            VoipActionMultiLineView voipActionMultiLineView = ((r79) this.receiver).e;
            bwt0.p0(voipActionMultiLineView, oVar2.a);
            int i = a.$EnumSwitchMapping$0[oVar2.b.ordinal()];
            if (i == 1 || i == 2) {
                voipActionMultiLineView.setSubtitle(R.string.voip_call_actions_media_state_enabled);
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                voipActionMultiLineView.setSubtitle(R.string.voip_call_actions_media_state_disabled);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class g extends PropertyReference1Impl {
        public static final g b = new g(o79.class, "mediaSettingVideo", "getMediaSettingVideo()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$MediaSettingVideo;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((o79) obj).a;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<ycw0.p, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.p pVar) {
            ycw0.p pVar2 = pVar;
            VoipActionMultiLineView voipActionMultiLineView = ((r79) this.receiver).f;
            bwt0.p0(voipActionMultiLineView, pVar2.a);
            int i = a.$EnumSwitchMapping$0[pVar2.b.ordinal()];
            if (i == 1 || i == 2) {
                voipActionMultiLineView.setSubtitle(R.string.voip_call_actions_media_state_enabled);
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                voipActionMultiLineView.setSubtitle(R.string.voip_call_actions_media_state_disabled);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class i extends PropertyReference1Impl {
        public static final i b = new i(o79.class, "watchTogether", "getWatchTogether()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$WatchTogether;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((o79) obj).c;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<ycw0.w, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.w wVar) {
            ycw0.w wVar2 = wVar;
            r79 r79Var = (r79) this.receiver;
            VoipActionMultiLineView voipActionMultiLineView = r79Var.g;
            bwt0.p0(voipActionMultiLineView, wVar2.a);
            VoipActionMultiLineView.b(voipActionMultiLineView, wVar2.b);
            boolean K = bwt0.K(voipActionMultiLineView);
            bwt0.p0(r79Var.j, K);
            bwt0.p0(r79Var.i, K);
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class k extends PropertyReference1Impl {
        public static final k b = new k(o79.class, "isRecordEnabled", "isRecordEnabled()Z", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Boolean.valueOf(((o79) obj).d);
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            r79 r79Var = (r79) this.receiver;
            VoipActionMultiLineView voipActionMultiLineView = r79Var.k;
            voipActionMultiLineView.setSwitchListener(null);
            VoipActionMultiLineView.b(voipActionMultiLineView, booleanValue);
            voipActionMultiLineView.setSwitchListener(r79Var.m);
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantPermissionsView.kt */
    public static final /* synthetic */ class m extends PropertyReference1Impl {
        public static final m b = new m(o79.class, SignalingProtocol.KEY_IS_SCREEN_SHARING_ENABLED, "isScreenSharingEnabled()Z", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Boolean.valueOf(((o79) obj).e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r79(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(r12);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.voip_call_view_participant_permissions_view, viewGroup, false);
        VoipActionMultiLineView voipActionMultiLineView = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.media_setting_microphones);
        this.e = voipActionMultiLineView;
        VoipActionMultiLineView voipActionMultiLineView2 = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.media_setting_video);
        this.f = voipActionMultiLineView2;
        VoipActionMultiLineView voipActionMultiLineView3 = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.voip_toggle_watch_together);
        this.g = voipActionMultiLineView3;
        VoipActionSingleLineView voipActionSingleLineView = (VoipActionSingleLineView) viewGroup2.findViewById(R.id.allow_show_chat_history_view);
        this.h = voipActionSingleLineView;
        this.i = viewGroup2.findViewById(R.id.options_divider);
        this.j = viewGroup2.findViewById(R.id.options_description);
        VoipActionMultiLineView voipActionMultiLineView4 = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.voip_toggle_record);
        this.k = voipActionMultiLineView4;
        VoipActionMultiLineView voipActionMultiLineView5 = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.voip_toggle_screensharing);
        this.l = voipActionMultiLineView5;
        im7 im7Var = new im7(this, 1);
        this.m = im7Var;
        p79 p79Var = new p79(this, 0);
        this.n = p79Var;
        rj rjVar = new rj(this, 1);
        this.o = rjVar;
        Context context = viewGroup2.getContext();
        o25.b(o25.a());
        g2v.c().getClass();
        this.p = new lcz(context, viewGroup2, o25.a().i().c);
        View findViewById = viewGroup2.findViewById(R.id.update_link_container);
        if (findViewById != null) {
            findViewById.setClipToOutline(true);
        }
        View findViewById2 = viewGroup2.findViewById(R.id.copy_link_container);
        if (findViewById2 != null) {
            findViewById2.setClipToOutline(true);
        }
        bwt0.i0(voipActionMultiLineView, new ns1(this, 11));
        bwt0.i0(voipActionMultiLineView2, new com.vk.movika.sdk.base.hooks.p(this, 19));
        voipActionMultiLineView3.setSwitchListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.q79
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                r79.this.q(new xcw0.m0(z));
            }
        });
        voipActionSingleLineView.setSwitchListener(rjVar);
        VoipFeatures voipFeatures = VoipFeatures.VOIP_READ_CHAT_HISTORY;
        voipFeatures.getClass();
        bwt0.p0(voipActionSingleLineView, com.vk.toggle.b.A.a(voipFeatures));
        voipActionMultiLineView4.setSwitchListener(im7Var);
        voipActionMultiLineView5.setSwitchListener(p79Var);
    }

    @Override // xsna.e41
    public final void destroy() {
        lcz lczVar = this.p;
        lczVar.f.a();
        lczVar.m.j.dispose();
    }

    @Override // xsna.e41
    public final i330<o79> e() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(e.b, new f(1, this, r79.class, "onMediaSettingMicrophonesChanged", "onMediaSettingMicrophonesChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$MediaSettingMicrophone;)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(g.b, new h(1, this, r79.class, "onMediaSettingVideoChanged", "onMediaSettingVideoChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$MediaSettingVideo;)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(i.b, new j(1, this, r79.class, "onWatchTogetherChanged", "onWatchTogetherChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$WatchTogether;)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(k.b, new l(1, this, r79.class, "onRecordChanged", "onRecordChanged(Z)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(m.b, new b(1, this, r79.class, "onScreensharingChanged", "onScreensharingChanged(Z)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(c.b, new d(1, this, r79.class, "onChatHistoryEnabled", "onChatHistoryEnabled(Z)V", 0), new pv7((byte) 0, 3)));
        return new i330<>(arrayList, hashMap);
    }

    @Override // xsna.e41
    public final wcw0 g() {
        return new gvq();
    }
}
