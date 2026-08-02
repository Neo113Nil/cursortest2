package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vk.voip.ui.view.VoipActionSectionPlaceholder;
import com.vk.voip.ui.view.VoipActionSingleLineView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.i330;
import xsna.xcw0;
import xsna.ycw0;

/* compiled from: CallParticipantSettingsView.kt */
/* loaded from: classes7.dex */
public final class a89 extends e41 {
    public final ViewGroup e;
    public final VoipActionMultiLineView f;
    public final VoipActionSingleLineView g;
    public final VoipActionMultiLineView h;
    public final VoipActionSingleLineView i;
    public final View j;
    public final VoipActionSectionPlaceholder k;

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NoiseSuppressorFeature$State.values().length];
            try {
                iArr[NoiseSuppressorFeature$State.PLATFORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NoiseSuppressorFeature$State.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NoiseSuppressorFeature$State.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ycw0.f, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.f fVar) {
            bwt0.p0(((a89) this.receiver).k, fVar.a);
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class c extends PropertyReference1Impl {
        public static final c b = new c(x79.class, "noiseSuppressor", "getNoiseSuppressor()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$NoiseSuppressor;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((x79) obj).a;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<ycw0.q, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.q qVar) {
            Context context;
            Context context2;
            Context context3;
            ycw0.q qVar2 = qVar;
            a89 a89Var = (a89) this.receiver;
            VoipActionMultiLineView voipActionMultiLineView = a89Var.f;
            bwt0.p0(voipActionMultiLineView, qVar2.a);
            voipActionMultiLineView.setEnabled(qVar2.c);
            voipActionMultiLineView.setProgressVisible(!qVar2.b);
            NoiseSuppressorFeature$State noiseSuppressorFeature$State = qVar2.d;
            ViewGroup viewGroup = a89Var.e;
            int i = a.$EnumSwitchMapping$0[noiseSuppressorFeature$State.ordinal()];
            String str = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (viewGroup != null && (context3 = viewGroup.getContext()) != null) {
                        str = context3.getString(R.string.voip_accessibility_noise_suppressor_none);
                    }
                } else if (viewGroup != null && (context2 = viewGroup.getContext()) != null) {
                    str = context2.getString(R.string.voip_accessibility_noise_suppressor_auto);
                }
            } else if (viewGroup != null && (context = viewGroup.getContext()) != null) {
                str = context.getString(R.string.voip_accessibility_noise_suppressor_platform);
            }
            voipActionMultiLineView.setContentDescription(str);
            voipActionMultiLineView.setStatus(noiseSuppressorFeature$State.i());
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class e extends PropertyReference1Impl {
        public static final e b = new e(x79.class, "beautyFilter", "getBeautyFilter()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$BeautyFilter;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((x79) obj).b;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<ycw0.c, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.c cVar) {
            ycw0.c cVar2 = cVar;
            VoipActionSingleLineView voipActionSingleLineView = ((a89) this.receiver).g;
            bwt0.p0(voipActionSingleLineView, cVar2.a);
            boolean z = cVar2.b;
            voipActionSingleLineView.setProgressVisible(!z);
            voipActionSingleLineView.setOpenIconVisible(z);
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class g extends PropertyReference1Impl {
        public static final g b = new g(x79.class, "frontCameraMirroring", "getFrontCameraMirroring()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$FrontCameraMirroring;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((x79) obj).c;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<ycw0.h, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.h hVar) {
            ycw0.h hVar2 = hVar;
            VoipActionMultiLineView voipActionMultiLineView = ((a89) this.receiver).h;
            bwt0.p0(voipActionMultiLineView, hVar2.a);
            VoipActionMultiLineView.b(voipActionMultiLineView, hVar2.b);
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class i extends PropertyReference1Impl {
        public static final i b = new i(x79.class, "gesturesFeedback", "getGesturesFeedback()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$GesturesFeedback;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((x79) obj).d;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<ycw0.i, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.i iVar) {
            ycw0.i iVar2 = iVar;
            VoipActionSingleLineView voipActionSingleLineView = ((a89) this.receiver).i;
            bwt0.p0(voipActionSingleLineView, iVar2.a);
            boolean z = iVar2.b;
            int i = VoipActionSingleLineView.i;
            voipActionSingleLineView.b(z, false);
            return s3q0.a;
        }
    }

    /* compiled from: CallParticipantSettingsView.kt */
    public static final /* synthetic */ class k extends PropertyReference1Impl {
        public static final k b = new k(x79.class, "callEffectsPlaceholder", "getCallEffectsPlaceholder()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$CallEffectsPlaceholder;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((x79) obj).e;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a89(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(r11);
        zqk0 zqk0Var;
        xdw0 xdw0Var;
        boolean z = false;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.voip_call_view_participant_settings_view, viewGroup, false);
        this.e = viewGroup;
        VoipActionMultiLineView voipActionMultiLineView = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.noise_suppressor);
        this.f = voipActionMultiLineView;
        VoipActionSingleLineView voipActionSingleLineView = (VoipActionSingleLineView) viewGroup2.findViewById(R.id.beauty_filter);
        this.g = voipActionSingleLineView;
        VoipActionSingleLineView voipActionSingleLineView2 = (VoipActionSingleLineView) viewGroup2.findViewById(R.id.change_name);
        VoipActionMultiLineView voipActionMultiLineView2 = (VoipActionMultiLineView) viewGroup2.findViewById(R.id.mirroring);
        this.h = voipActionMultiLineView2;
        VoipActionSingleLineView voipActionSingleLineView3 = (VoipActionSingleLineView) viewGroup2.findViewById(R.id.gestures_feedback_view);
        this.i = voipActionSingleLineView3;
        View findViewById = viewGroup2.findViewById(R.id.back);
        this.j = findViewById;
        VoipActionSectionPlaceholder voipActionSectionPlaceholder = (VoipActionSectionPlaceholder) viewGroup2.findViewById(R.id.video_audio_section_error_placeholder);
        this.k = voipActionSectionPlaceholder;
        dhw0 L = com.vk.voip.ui.c.b.L();
        if (L != null) {
            boolean z2 = L.O;
            boolean z3 = L.D && !com.vk.voip.ui.c.Z0;
            boolean z4 = com.vk.voip.ui.c.J().h() || !((zqk0Var = com.vk.voip.ui.c.P) == null || (xdw0Var = zqk0Var.k) == null || !xdw0Var.h);
            if (!z2 && z3 && !z4) {
                z = true;
            }
        }
        bwt0.p0(voipActionSingleLineView2, z);
        bwt0.i0(findViewById, new ha(this, 11));
        bwt0.i0(voipActionMultiLineView, new kf1(this, 7));
        bwt0.i0(voipActionSingleLineView, new ka(this, 11));
        bwt0.i0(voipActionSingleLineView2, new com.vk.voip.ui.menu.feature.a(this, 12));
        voipActionMultiLineView2.setSwitchListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.y79
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                a89.this.q(new xcw0.j(z5));
            }
        });
        voipActionSingleLineView3.setSwitchListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.z79
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                a89.this.q(new xcw0.k(z5));
            }
        });
        voipActionSectionPlaceholder.setButtonClickListener(new ka0(this, 12));
    }

    @Override // xsna.e41
    public final i330<x79> e() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(c.b, new d(1, this, a89.class, "onNoiseSuppressorChanged", "onNoiseSuppressorChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$NoiseSuppressor;)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(e.b, new f(1, this, a89.class, "onBeautyFilterChanged", "onBeautyFilterChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$BeautyFilter;)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(g.b, new h(1, this, a89.class, "onFrontCameraMirroringChanged", "onFrontCameraMirroringChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$FrontCameraMirroring;)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(i.b, new j(1, this, a89.class, "onGesturesFeedbackChanged", "onGesturesFeedbackChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$GesturesFeedback;)V", 0), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(k.b, new b(1, this, a89.class, "onCallEffectsPlaceholderChanged", "onCallEffectsPlaceholderChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$CallEffectsPlaceholder;)V", 0), new pv7((byte) 0, 3)));
        return new i330<>(arrayList, hashMap);
    }

    @Override // xsna.e41
    public final wcw0 g() {
        return new hvq();
    }

    @Override // xsna.e41
    public final void destroy() {
    }
}
