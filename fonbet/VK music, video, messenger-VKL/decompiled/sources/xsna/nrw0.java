package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import com.vk.voip.ui.logs.app.AppLogsSending$SendType;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vk.voip.ui.onboarding.ui.CallOnboardingView;
import com.vk.voip.ui.view.VoipActionHorizontalButtonView;
import com.vk.voip.ui.view.VoipActionMultiLineViewLight;
import com.vk.voip.ui.view.VoipActionSectionPlaceholder;
import com.vk.voip.ui.view.VoipActionSingleLineView;
import com.vk.voip.ui.view.VoipActionSingleLineViewLight;
import com.vk.voip.ui.view.VoipActionVerticalButtonView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import xsna.e3m;
import xsna.i330;
import xsna.t69;
import xsna.ycw0;

/* compiled from: VoipMainMenuActionsView.kt */
/* loaded from: classes7.dex */
public final class nrw0 extends e41 {
    public final VoipActionSingleLineViewLight A;
    public final VoipActionMultiLineViewLight B;
    public final View C;
    public final VoipActionMultiLineViewLight D;
    public final View E;
    public final View F;
    public final VoipActionSingleLineView G;
    public final VoipActionSingleLineViewLight H;
    public final VoipActionSingleLineViewLight I;
    public final io.reactivex.rxjava3.disposables.b J;
    public final MainMenuBroadcastFeature K;
    public final VoipActionSectionPlaceholder L;
    public final h69 M;
    public final u59 e;
    public final View f;
    public final CallOnboardingView g;
    public final VoipActionVerticalButtonView h;
    public final VoipActionVerticalButtonView i;
    public final VoipActionVerticalButtonView j;
    public final VoipActionVerticalButtonView k;
    public final VoipActionVerticalButtonView l;
    public final View m;
    public final VoipActionHorizontalButtonView n;
    public final VoipActionHorizontalButtonView o;
    public final VoipActionHorizontalButtonView p;
    public io.reactivex.rxjava3.disposables.c q;
    public final View r;
    public final View s;
    public final VoipActionMultiLineViewLight t;
    public final VoipActionSingleLineViewLight u;
    public final VoipActionSingleLineViewLight v;
    public final View w;
    public final VoipActionSingleLineViewLight x;
    public final VoipActionMultiLineViewLight y;
    public final VoipActionMultiLineViewLight z;

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<List<? extends t69.a>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends t69.a> list) {
            List<? extends t69.a> list2 = list;
            nrw0 nrw0Var = (nrw0) this.receiver;
            nrw0Var.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!((t69.a) obj).c) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                list2 = arrayList;
            }
            List<? extends t69.a> list3 = list2;
            boolean z = list3.size() == 1;
            nrw0Var.k.setBadgeVisible(z && list3.get(0).b == FeatureId.WATCH_TOGETHER);
            nrw0Var.p.setBadgeVisible(z && list3.get(0).b == FeatureId.VMOJI);
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class a0 extends PropertyReference1Impl {
        public static final a0 b = new a0(orw0.class, "asrOnline", "getAsrOnline()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$AsrOnline;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).r;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<tah0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(tah0 tah0Var) {
            tah0 tah0Var2 = tah0Var;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionVerticalButtonView voipActionVerticalButtonView = nrw0Var.h;
            boolean z = tah0Var2.a;
            voipActionVerticalButtonView.setEnabled(z);
            if (z) {
                if (tah0Var2.b) {
                    voipActionVerticalButtonView.post(new nx3(voipActionVerticalButtonView, 21));
                } else {
                    voipActionVerticalButtonView.post(new oo6(voipActionVerticalButtonView, 14));
                }
            }
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class b0 extends FunctionReferenceImpl implements izs<ycw0.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.a aVar) {
            ycw0.a aVar2 = aVar;
            VoipActionMultiLineViewLight voipActionMultiLineViewLight = ((nrw0) this.receiver).B;
            bwt0.p0(voipActionMultiLineViewLight, aVar2.a);
            voipActionMultiLineViewLight.setSubtitle(aVar2.b ? R.string.voip_asr_online_menu_start_subtitle_enabled : R.string.voip_asr_online_menu_start_subtitle_disabled);
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ipm0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ipm0 ipm0Var) {
            ipm0 ipm0Var2 = ipm0Var;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionVerticalButtonView voipActionVerticalButtonView = nrw0Var.i;
            boolean z = ipm0Var2.d;
            voipActionVerticalButtonView.setEnabled(z);
            if (z) {
                rdi.B(voipActionVerticalButtonView, ipm0Var2.b);
                if (ipm0Var2.c && ipm0Var2.a) {
                    VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, enj.c(R.drawable.ic_live_text_20h, e3m.f(R.attr.vk_ui_background_negative, voipActionVerticalButtonView.getContext()), voipActionVerticalButtonView.getContext()), R.attr.vk_ui_background_negative, 12);
                    voipActionVerticalButtonView.setTitleTextColor(e3m.c(R.attr.vk_ui_background_negative, voipActionVerticalButtonView.getContext()));
                } else {
                    Context context = voipActionVerticalButtonView.getContext();
                    e3m.a aVar = e3m.a;
                    VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, m33.a(R.drawable.vk_icon_live_outline_28, context), 0, 14);
                    voipActionVerticalButtonView.setTitleTextColor(anj.b(R.color.vk_ui_text_title_color, voipActionVerticalButtonView.getContext()));
                }
                nrw0Var.t();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class c0 extends PropertyReference1Impl {
        public static final c0 b = new c0(orw0.class, "callDump", "getCallDump()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$CallDump;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).s;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<mhf0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(mhf0 mhf0Var) {
            mhf0 mhf0Var2 = mhf0Var;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionVerticalButtonView voipActionVerticalButtonView = nrw0Var.j;
            boolean z = mhf0Var2.d;
            voipActionVerticalButtonView.setEnabled(z);
            if (z) {
                rdi.B(voipActionVerticalButtonView, mhf0Var2.a);
                if (!mhf0Var2.b) {
                    voipActionVerticalButtonView.setTitle(R.string.voip_call_menu_actions_record);
                    Context context = voipActionVerticalButtonView.getContext();
                    e3m.a aVar = e3m.a;
                    VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, m33.a(R.drawable.vk_icon_recorder_tape_outline_28, context), 0, 14);
                    voipActionVerticalButtonView.setTitleTextColor(anj.b(R.color.vk_ui_text_title_color, voipActionVerticalButtonView.getContext()));
                } else if (mhf0Var2.c) {
                    VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, enj.c(R.drawable.ic_record_28, e3m.f(R.attr.vk_ui_background_negative, voipActionVerticalButtonView.getContext()), voipActionVerticalButtonView.getContext()), R.attr.vk_ui_background_negative, 12);
                    voipActionVerticalButtonView.setTitle(R.string.voip_call_menu_actions_record_end);
                    voipActionVerticalButtonView.setTitleTextColor(e3m.c(R.attr.vk_ui_background_negative, voipActionVerticalButtonView.getContext()));
                } else {
                    voipActionVerticalButtonView.setTitle(R.string.voip_call_menu_actions_record_in_progress);
                    Context context2 = voipActionVerticalButtonView.getContext();
                    e3m.a aVar2 = e3m.a;
                    VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, m33.a(R.drawable.ic_record_28, context2), 0, 14);
                    voipActionVerticalButtonView.setTitleTextColor(anj.b(R.color.vk_ui_text_title_color, voipActionVerticalButtonView.getContext()));
                }
                nrw0Var.t();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class d0 extends FunctionReferenceImpl implements izs<ycw0.u, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.u uVar) {
            ycw0.u uVar2 = uVar;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionHorizontalButtonView voipActionHorizontalButtonView = nrw0Var.o;
            bwt0.p0(voipActionHorizontalButtonView, uVar2.a);
            voipActionHorizontalButtonView.setEnabled(uVar2.c);
            nrw0.s(voipActionHorizontalButtonView, uVar2.b, uVar2.d, R.drawable.vk_icon_user_background_outline_28);
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<zcx0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(zcx0 zcx0Var) {
            zcx0 zcx0Var2 = zcx0Var;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionVerticalButtonView voipActionVerticalButtonView = nrw0Var.k;
            bwt0.p0(voipActionVerticalButtonView, zcx0Var2.a);
            rdi.B(voipActionVerticalButtonView, zcx0Var2.c);
            if (zcx0Var2.b) {
                voipActionVerticalButtonView.setTitle(R.string.voip_call_menu_actions_watch_together_in_progress);
                voipActionVerticalButtonView.setTitleTextColor(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_accent, ((ViewGroup) nrw0Var.b).getContext())));
                voipActionVerticalButtonView.setIconNoTint(m33.a(R.drawable.vk_icon_logo_vk_video_color_28, voipActionVerticalButtonView.getContext()));
            } else {
                voipActionVerticalButtonView.setTitle(R.string.voip_call_menu_actions_watch_together);
                voipActionVerticalButtonView.setTitleTextColor(anj.b(R.color.vk_ui_text_title_color, voipActionVerticalButtonView.getContext()));
                VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, m33.a(R.drawable.vk_icon_logo_vk_video_outline_28, voipActionVerticalButtonView.getContext()), 0, 14);
            }
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class e0 extends FunctionReferenceImpl implements izs<ycw0.e, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.e eVar) {
            ycw0.e eVar2 = eVar;
            VoipActionVerticalButtonView voipActionVerticalButtonView = ((nrw0) this.receiver).l;
            bwt0.p0(voipActionVerticalButtonView, eVar2.a);
            voipActionVerticalButtonView.setTitle(eVar2.c);
            boolean z = eVar2.b;
            if (z) {
                VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, enj.c(R.drawable.vk_icon_sound_wave_slash_outline_28, R.attr.vk_ui_accent_red, voipActionVerticalButtonView.getContext()), R.attr.vk_ui_accent_red, 12);
                voipActionVerticalButtonView.setLongClickable(false);
            } else {
                Context context = voipActionVerticalButtonView.getContext();
                e3m.a aVar = e3m.a;
                VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, m33.a(R.drawable.vk_icon_sound_wave_outline_28, context), 0, 14);
                voipActionVerticalButtonView.setLongClickable(true);
            }
            voipActionVerticalButtonView.setTitleTextColor(z ? e3m.c(R.attr.vk_ui_accent_red, voipActionVerticalButtonView.getContext()) : anj.b(R.color.vk_ui_text_title_color, voipActionVerticalButtonView.getContext()));
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final class f extends BaseAdapter {
        public final Context b;
        public final List<MediaDumpManager.Source> c;

        /* compiled from: VoipMainMenuActionsView.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MediaDumpManager.Source.values().length];
                try {
                    iArr[MediaDumpManager.Source.IN_ENTER_PROCESSING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MediaDumpManager.Source.OUT_ENTER_PROCESSING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, List<? extends MediaDumpManager.Source> list) {
            this.b = context;
            this.c = list;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.c.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return this.c.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return this.c.get(i).ordinal();
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            MediaDumpManager.Source source = this.c.get(i);
            int a2 = iah0.a(16);
            TextView textView = new TextView(this.b);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            textView.setTextSize(2, 16.0f);
            his0.x(textView, R.color.vk_ui_text_title_color);
            textView.setPadding(a2, a2, a2, a2);
            int i2 = a.$EnumSwitchMapping$0[source.ordinal()];
            textView.setText(i2 != 1 ? i2 != 2 ? 0 : R.string.voip_dump_dialog_record_opponent_audio : R.string.voip_dump_dialog_record_own_audio);
            return textView;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class f0 extends PropertyReference1Impl {
        public static final f0 b = new f0(orw0.class, "mask", "getMask()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$Mask;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).g;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppLogsSending$SendType.values().length];
            try {
                iArr[AppLogsSending$SendType.SHARE_MENU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppLogsSending$SendType.DOCS_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppLogsSending$SendType.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class g0 extends FunctionReferenceImpl implements izs<ycw0.l, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.l lVar) {
            ycw0.l lVar2 = lVar;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionHorizontalButtonView voipActionHorizontalButtonView = nrw0Var.n;
            bwt0.p0(voipActionHorizontalButtonView, lVar2.a);
            voipActionHorizontalButtonView.setEnabled(lVar2.c);
            nrw0.s(voipActionHorizontalButtonView, lVar2.b, lVar2.d, R.drawable.vk_icon_smile_outline_28);
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<xcw0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(xcw0 xcw0Var) {
            ((nrw0) this.receiver).q(xcw0Var);
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class h0 extends PropertyReference1Impl {
        public static final h0 b = new h0(orw0.class, "mediaRequestAttention", "getMediaRequestAttention()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$MediaRequestAttention;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).i;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<ycw0.j, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.j jVar) {
            ycw0.j jVar2 = jVar;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionSingleLineView voipActionSingleLineView = nrw0Var.G;
            bwt0.p0(voipActionSingleLineView, jVar2.a);
            voipActionSingleLineView.setTitle(jVar2.b);
            voipActionSingleLineView.setIconUrl(jVar2.c);
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class i0 extends FunctionReferenceImpl implements izs<ycw0.m, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.m mVar) {
            ycw0.m mVar2 = mVar;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionMultiLineViewLight voipActionMultiLineViewLight = nrw0Var.t;
            bwt0.p0(voipActionMultiLineViewLight, mVar2.a);
            voipActionMultiLineViewLight.setTitle(mVar2.b ? R.string.voip_call_actions_media_request_attention_title : R.string.voip_participant_actions_media_request_attention);
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class j extends PropertyReference1Impl {
        public static final j b = new j(orw0.class, "asrRecordStatus", "getAsrRecordStatus()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$AsrRecordStatus;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).k;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class j0 extends PropertyReference1Impl {
        public static final j0 b = new j0(orw0.class, "mediaSettingAudio", "getMediaSettingAudio()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$MediaSettingAudio;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).h;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements izs<ycw0.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.b bVar) {
            ycw0.b bVar2 = bVar;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionSingleLineViewLight voipActionSingleLineViewLight = nrw0Var.A;
            bwt0.p0(voipActionSingleLineViewLight, bVar2.a);
            boolean z = bVar2.b;
            if (z && bVar2.c) {
                voipActionSingleLineViewLight.setTitle(R.string.voip_asr_menu_stop);
                voipActionSingleLineViewLight.setTitleTextColor(R.color.vk_red_light);
                voipActionSingleLineViewLight.a(enj.c(R.drawable.vk_icon_articles_slash_outline_28, e3m.f(R.attr.vk_ui_background_negative, voipActionSingleLineViewLight.getContext()), voipActionSingleLineViewLight.getContext()), R.attr.vk_ui_background_negative);
                rdi.B(voipActionSingleLineViewLight, true);
            } else if (z) {
                voipActionSingleLineViewLight.setTitle(R.string.voip_asr_menu_in_progress);
                voipActionSingleLineViewLight.setTitleTextColor(R.color.vk_red_light);
                voipActionSingleLineViewLight.a(enj.c(R.drawable.vk_icon_articles_outline_20, e3m.f(R.attr.vk_ui_background_negative, voipActionSingleLineViewLight.getContext()), voipActionSingleLineViewLight.getContext()), R.attr.vk_ui_background_negative);
                voipActionSingleLineViewLight.setAlpha(0.4f);
            } else {
                voipActionSingleLineViewLight.setTitle(R.string.voip_asr_menu_start);
                voipActionSingleLineViewLight.setTitleTextColor(R.color.vk_gray_100);
                voipActionSingleLineViewLight.setIcon(R.drawable.vk_icon_articles_outline_20);
                rdi.B(voipActionSingleLineViewLight, true);
            }
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class k0 extends FunctionReferenceImpl implements izs<ycw0.n, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.n nVar) {
            ycw0.n nVar2 = nVar;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionMultiLineViewLight voipActionMultiLineViewLight = nrw0Var.D;
            bwt0.p0(voipActionMultiLineViewLight, nVar2.a);
            CallsAudioDeviceInfo callsAudioDeviceInfo = nVar2.b;
            voipActionMultiLineViewLight.setIcon(um4.a(callsAudioDeviceInfo));
            voipActionMultiLineViewLight.setSubtitle(um4.b(callsAudioDeviceInfo, ((ViewGroup) nrw0Var.b).getContext()));
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class l extends PropertyReference1Impl {
        public static final l b = new l(orw0.class, "logsSending", "getLogsSending()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$LogsSending;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).l;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class l0 extends PropertyReference1Impl {
        public static final l0 b = new l0(orw0.class, "holidayInteraction", "getHolidayInteraction()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$HolidayInteraction;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).j;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements izs<ycw0.k, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.k kVar) {
            VoipActionSingleLineViewLight voipActionSingleLineViewLight = ((nrw0) this.receiver).H;
            int i = g.$EnumSwitchMapping$0[kVar.a.ordinal()];
            if (i == 1) {
                bwt0.p0(voipActionSingleLineViewLight, true);
                voipActionSingleLineViewLight.setTitle(R.string.voip_settings_send_debug_logs);
                s3q0 s3q0Var = s3q0.a;
            } else if (i == 2) {
                bwt0.p0(voipActionSingleLineViewLight, true);
                voipActionSingleLineViewLight.setTitle(R.string.voip_settings_upload_debug_logs);
                s3q0 s3q0Var2 = s3q0.a;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bwt0.p0(voipActionSingleLineViewLight, false);
                s3q0 s3q0Var3 = s3q0.a;
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class n extends PropertyReference1Impl {
        public static final n b = new n(orw0.class, "debugMenu", "getDebugMenu()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$DebugMenu;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).m;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements izs<ycw0.g, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.g gVar) {
            bwt0.p0(((nrw0) this.receiver).I, gVar.a);
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class p extends PropertyReference1Impl {
        public static final p b = new p(orw0.class, "vmojiStatus", "getVmojiStatus()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$VmojiStatus;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).n;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class q extends FunctionReferenceImpl implements izs<ycw0.v, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.v vVar) {
            ycw0.v vVar2 = vVar;
            boolean z = vVar2.a;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionHorizontalButtonView voipActionHorizontalButtonView = nrw0Var.p;
            io.reactivex.rxjava3.disposables.c cVar = nrw0Var.q;
            if (cVar != null) {
                cVar.dispose();
            }
            boolean z2 = vVar2.c;
            bwt0.p0(voipActionHorizontalButtonView, z);
            if (z) {
                voipActionHorizontalButtonView.setEnabled(z2);
                if (z2) {
                    voipActionHorizontalButtonView.setProgressVisible(false);
                    if (vVar2.b) {
                        w5w0 w5w0Var = vVar2.d;
                        int i = s5x0.e;
                        io.reactivex.rxjava3.core.x<byte[]> a = w5w0Var.a();
                        asu0 asu0Var = asu0.a;
                        asu0Var.getClass();
                        io.reactivex.rxjava3.disposables.c e = io.reactivex.rxjava3.kotlin.c.e(a.m(asu0.i()).l(new pu50(new n9t0(w5w0Var, 8), 20)).m(asu0Var.d()), new lwp0(10), new ujm0(nrw0Var, 21));
                        nrw0Var.q = e;
                        itg0.b((ViewGroup) nrw0Var.b, e);
                    } else {
                        voipActionHorizontalButtonView.setIcon(R.drawable.vk_icon_vmoji_outline_28);
                    }
                } else {
                    voipActionHorizontalButtonView.setProgressVisible(true);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class r extends PropertyReference1Impl {
        public static final r b = new r(orw0.class, "callEffectsPlaceholder", "getCallEffectsPlaceholder()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$CallEffectsPlaceholder;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).o;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class s extends PropertyReference1Impl {
        public static final s b = new s(orw0.class, "virtualBackground", "getVirtualBackground()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$VirtualBackground;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).f;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements izs<ycw0.f, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.f fVar) {
            nrw0 nrw0Var = (nrw0) this.receiver;
            bwt0.p0(nrw0Var.L, fVar.a);
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class u extends PropertyReference1Impl {
        public static final u b = new u(orw0.class, "canManageParticipantPermissions", "getCanManageParticipantPermissions()Z", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Boolean.valueOf(((orw0) obj).c);
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class v extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            nrw0 nrw0Var = (nrw0) this.receiver;
            bwt0.p0(nrw0Var.s, booleanValue);
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class w extends PropertyReference1Impl {
        public static final w b = new w(orw0.class, "sessionRooms", "getSessionRooms()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$SessionRooms;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).p;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class x extends FunctionReferenceImpl implements izs<ycw0.s, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.s sVar) {
            ycw0.s sVar2 = sVar;
            nrw0 nrw0Var = (nrw0) this.receiver;
            VoipActionMultiLineViewLight voipActionMultiLineViewLight = nrw0Var.z;
            VoipActionSingleLineViewLight voipActionSingleLineViewLight = nrw0Var.x;
            ViewGroup viewGroup = (ViewGroup) nrw0Var.b;
            VoipActionSingleLineViewLight voipActionSingleLineViewLight2 = nrw0Var.u;
            boolean z = sVar2.a;
            boolean z2 = sVar2.b;
            bwt0.p0(voipActionSingleLineViewLight2, z);
            bwt0.p0(nrw0Var.v, sVar2.i);
            boolean z3 = false;
            if (z) {
                voipActionSingleLineViewLight2.setTitle(sVar2.c);
                ColorStateList valueOf = ColorStateList.valueOf(dhr0.Y(z2 ? R.attr.vk_ui_accent_secondary : R.attr.vk_ui_text_primary, viewGroup.getContext()));
                voipActionSingleLineViewLight2.setTitleTextColor(valueOf);
                voipActionSingleLineViewLight2.a(new baf0(m33.a(z2 ? R.drawable.vk_icon_user_square_on_square_28 : R.drawable.vk_icon_user_square_on_square_outline_28, viewGroup.getContext()), valueOf), 0);
            }
            if (sVar2.d && !z) {
                z3 = true;
            }
            bwt0.p0(voipActionSingleLineViewLight, z3);
            rdi.B(voipActionSingleLineViewLight, sVar2.e);
            bwt0.p0(nrw0Var.y, sVar2.f);
            bwt0.p0(voipActionMultiLineViewLight, sVar2.g);
            voipActionMultiLineViewLight.setSubtitle(sVar2.h);
            nrw0Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class y extends PropertyReference1Impl {
        public static final y b = new y(orw0.class, "shareLink", "getShareLink()Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$ShareLink;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((orw0) obj).q;
        }
    }

    /* compiled from: VoipMainMenuActionsView.kt */
    public static final /* synthetic */ class z extends FunctionReferenceImpl implements izs<ycw0.t, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ycw0.t tVar) {
            nrw0 nrw0Var = (nrw0) this.receiver;
            bwt0.p0(nrw0Var.F, tVar.a);
            nrw0Var.t();
            return s3q0.a;
        }
    }

    public nrw0(ViewGroup viewGroup, u59 u59Var) {
        super(viewGroup);
        this.e = u59Var;
        this.f = viewGroup.findViewById(R.id.broadcast_section);
        CallOnboardingView callOnboardingView = (CallOnboardingView) viewGroup.findViewById(R.id.onboarding_view);
        this.g = callOnboardingView;
        VoipActionVerticalButtonView voipActionVerticalButtonView = (VoipActionVerticalButtonView) viewGroup.findViewById(R.id.screencast);
        this.h = voipActionVerticalButtonView;
        VoipActionVerticalButtonView voipActionVerticalButtonView2 = (VoipActionVerticalButtonView) viewGroup.findViewById(R.id.broadcast);
        this.i = voipActionVerticalButtonView2;
        VoipActionVerticalButtonView voipActionVerticalButtonView3 = (VoipActionVerticalButtonView) viewGroup.findViewById(R.id.record);
        this.j = voipActionVerticalButtonView3;
        VoipActionVerticalButtonView voipActionVerticalButtonView4 = (VoipActionVerticalButtonView) viewGroup.findViewById(R.id.watch_movie);
        this.k = voipActionVerticalButtonView4;
        VoipActionVerticalButtonView voipActionVerticalButtonView5 = (VoipActionVerticalButtonView) viewGroup.findViewById(R.id.audiodump);
        this.l = voipActionVerticalButtonView5;
        this.m = viewGroup.findViewById(R.id.effects_section);
        VoipActionHorizontalButtonView voipActionHorizontalButtonView = (VoipActionHorizontalButtonView) viewGroup.findViewById(R.id.mask);
        this.n = voipActionHorizontalButtonView;
        VoipActionHorizontalButtonView voipActionHorizontalButtonView2 = (VoipActionHorizontalButtonView) viewGroup.findViewById(R.id.virtual_background);
        this.o = voipActionHorizontalButtonView2;
        VoipActionHorizontalButtonView voipActionHorizontalButtonView3 = (VoipActionHorizontalButtonView) viewGroup.findViewById(R.id.vmoji);
        this.p = voipActionHorizontalButtonView3;
        View findViewById = viewGroup.findViewById(R.id.admin_section);
        this.r = findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.participant_permissions);
        this.s = findViewById2;
        VoipActionMultiLineViewLight voipActionMultiLineViewLight = (VoipActionMultiLineViewLight) viewGroup.findViewById(R.id.media_request_attention);
        this.t = voipActionMultiLineViewLight;
        VoipActionSingleLineViewLight voipActionSingleLineViewLight = (VoipActionSingleLineViewLight) viewGroup.findViewById(R.id.action_create_session_rooms);
        this.u = voipActionSingleLineViewLight;
        VoipActionSingleLineViewLight voipActionSingleLineViewLight2 = (VoipActionSingleLineViewLight) viewGroup.findViewById(R.id.action_write_message_to_session_rooms);
        this.v = voipActionSingleLineViewLight2;
        View findViewById3 = viewGroup.findViewById(R.id.session_room_section);
        this.w = findViewById3;
        VoipActionSingleLineViewLight voipActionSingleLineViewLight3 = (VoipActionSingleLineViewLight) viewGroup.findViewById(R.id.action_join_session_room);
        this.x = voipActionSingleLineViewLight3;
        VoipActionMultiLineViewLight voipActionMultiLineViewLight2 = (VoipActionMultiLineViewLight) viewGroup.findViewById(R.id.action_request_room_admin_attention);
        this.y = voipActionMultiLineViewLight2;
        VoipActionMultiLineViewLight voipActionMultiLineViewLight3 = (VoipActionMultiLineViewLight) viewGroup.findViewById(R.id.action_leave_room);
        this.z = voipActionMultiLineViewLight3;
        VoipActionSingleLineViewLight voipActionSingleLineViewLight4 = (VoipActionSingleLineViewLight) viewGroup.findViewById(R.id.request_asr_record);
        this.A = voipActionSingleLineViewLight4;
        VoipActionMultiLineViewLight voipActionMultiLineViewLight4 = (VoipActionMultiLineViewLight) viewGroup.findViewById(R.id.request_asr_online);
        this.B = voipActionMultiLineViewLight4;
        View findViewById4 = viewGroup.findViewById(R.id.participant_section);
        this.C = findViewById4;
        VoipActionMultiLineViewLight voipActionMultiLineViewLight5 = (VoipActionMultiLineViewLight) viewGroup.findViewById(R.id.change_speaker_mode);
        this.D = voipActionMultiLineViewLight5;
        View findViewById5 = viewGroup.findViewById(R.id.settings);
        this.E = findViewById5;
        View findViewById6 = viewGroup.findViewById(R.id.share_link);
        this.F = findViewById6;
        VoipActionSingleLineView voipActionSingleLineView = (VoipActionSingleLineView) viewGroup.findViewById(R.id.request_holiday_interaction);
        this.G = voipActionSingleLineView;
        VoipActionSingleLineViewLight voipActionSingleLineViewLight5 = (VoipActionSingleLineViewLight) viewGroup.findViewById(R.id.send_logs);
        this.H = voipActionSingleLineViewLight5;
        VoipActionSingleLineViewLight voipActionSingleLineViewLight6 = (VoipActionSingleLineViewLight) viewGroup.findViewById(R.id.debug_menu);
        this.I = voipActionSingleLineViewLight6;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.J = bVar;
        MainMenuBroadcastFeature mainMenuBroadcastFeature = new MainMenuBroadcastFeature(viewGroup.getContext(), u59Var, new h(1, this, nrw0.class, "publishEvent", "publishEvent(Lcom/vk/voip/ui/actions/view/VoipActionsViewEvent;)V", 0));
        this.K = mainMenuBroadcastFeature;
        VoipActionSectionPlaceholder voipActionSectionPlaceholder = (VoipActionSectionPlaceholder) viewGroup.findViewById(R.id.video_audio_section_error_placeholder);
        this.L = voipActionSectionPlaceholder;
        ze00 ze00Var = u59Var instanceof ze00 ? (ze00) u59Var : null;
        h69 h69Var = ze00Var != null ? ze00Var.l : null;
        this.M = h69Var;
        if (h69Var != null) {
            callOnboardingView.g = new n69(h69Var, new go1(callOnboardingView, 14), new com.vk.movika.sdk.base.observable.e(callOnboardingView, 13));
            callOnboardingView.f.b(callOnboardingView.i.a0(asu0.a.d()).U(new fq1(new i37(1, new s69(), s69.class, "transform", "transform(Lcom/vk/voip/ui/onboarding/model/CallOnboardingViewEvent;)Lcom/vk/voip/ui/onboarding/CallOnboardingAction;", 0, 1), 3)).subscribe(new ez(new com.vk.movika.sdk.base.observable.g(h69Var, 10), 2)));
            new n69(h69Var, new a(1, this, nrw0.class, "onOnboardingItemsChanged", "onOnboardingItemsChanged(Ljava/util/List;)V", 0), null);
        }
        voipActionHorizontalButtonView3.setContentDescription(viewGroup.getContext().getString(R.string.voip_accessibility_vmoji));
        new w9l0(17);
        lrw0 lrw0Var = new lrw0();
        io.reactivex.rxjava3.subjects.d<wj8> dVar = mainMenuBroadcastFeature.d;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = dVar.U(lrw0Var);
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(U, qVar, aVar).subscribe(new p9p0(new b(1, this, nrw0.class, "handleScreenCastStateChange", "handleScreenCastStateChange(Lcom/vk/voip/ui/actions/menu/features/ScreenCastState;)V", 0), 4)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar.U(new caf0(new zzl0(12))), qVar, aVar).subscribe(new xzu0(new c(1, this, nrw0.class, "handleStreamStateChange", "handleStreamStateChange(Lcom/vk/voip/ui/actions/menu/features/StreamingState;)V", 0), 3)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar.U(new azk0(new tml0(10))), qVar, aVar).subscribe(new miq0(new d(1, this, nrw0.class, "handleRecordStateChange", "handleRecordStateChange(Lcom/vk/voip/ui/actions/menu/features/RecordState;)V", 0), 4)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar.U(new alb0(new jyq0(11), 10)), qVar, aVar).subscribe(new fsq0(new e(1, this, nrw0.class, "handleWatchTogetherStateChange", "handleWatchTogetherStateChange(Lcom/vk/voip/ui/actions/menu/features/WatchTogetherState;)V", 0), 6)));
        bVar.b(mainMenuBroadcastFeature.g.b0(oe00.class).w0(50L, TimeUnit.MILLISECONDS).subscribe(new dfr0(new sxl0(this, 17), 8)));
        findViewById.setClipToOutline(true);
        findViewById4.setClipToOutline(true);
        findViewById3.setClipToOutline(true);
        bwt0.i0(voipActionVerticalButtonView, new vyq0(this, 13));
        bwt0.i0(voipActionVerticalButtonView2, new svk0(this, 23));
        bwt0.i0(voipActionVerticalButtonView3, new ptl0(this, 22));
        bwt0.i0(voipActionVerticalButtonView4, new ubt0(this, 8));
        bwt0.g0(voipActionHorizontalButtonView2, new gfv0(this, 5));
        bwt0.g0(voipActionHorizontalButtonView, new ljw0(this, 1));
        bwt0.i0(voipActionHorizontalButtonView3, new bjm0(this, 24));
        bwt0.i0(voipActionMultiLineViewLight, new biw0(this, 5));
        bwt0.i0(findViewById2, new egt0(this, 11));
        bwt0.i0(voipActionSingleLineViewLight4, new mrw0(this, 0));
        bwt0.i0(voipActionMultiLineViewLight4, new kfw0(this, 4));
        bwt0.i0(findViewById5, new q9i0(this, 18));
        bwt0.i0(findViewById6, new aer0(this, 14));
        bwt0.i0(voipActionMultiLineViewLight5, new yyl0(this, 27));
        bwt0.i0(voipActionSingleLineView, new lxh0(this, 22));
        bwt0.i0(voipActionSingleLineViewLight5, new mvl0(this, 22));
        bwt0.i0(voipActionSingleLineViewLight6, new q3s0(this, 7));
        voipActionSectionPlaceholder.setButtonClickListener(new i6m0(this, 17));
        bwt0.i0(voipActionSingleLineViewLight3, new qjm0(this, 14));
        bwt0.i0(voipActionMultiLineViewLight2, new cus0(this, 12));
        bwt0.i0(voipActionSingleLineViewLight, new rtg0(this, 29));
        bwt0.i0(voipActionSingleLineViewLight2, new pst0(this, 6));
        bwt0.i0(voipActionMultiLineViewLight3, new qyi0(this, 26));
        bwt0.i0(voipActionVerticalButtonView5, new mmm0(this, 25));
        bwt0.k0(voipActionVerticalButtonView5, new zyl0(this, 28));
    }

    public static void s(VoipActionHorizontalButtonView voipActionHorizontalButtonView, boolean z2, k5x0 k5x0Var, int i2) {
        if (!z2) {
            voipActionHorizontalButtonView.setProgressVisible(true);
            return;
        }
        voipActionHorizontalButtonView.setProgressVisible(false);
        if (k5x0Var.b()) {
            voipActionHorizontalButtonView.setIcon(i2);
            return;
        }
        String a2 = k5x0Var.a();
        Context context = voipActionHorizontalButtonView.getContext();
        e3m.a aVar = e3m.a;
        Drawable a3 = m33.a(i2, context);
        VKImageView vKImageView = voipActionHorizontalButtonView.b;
        if (a2 == null && a3 == null) {
            vKImageView.setVisibility(8);
            vKImageView.setImageDrawable(null);
        } else {
            vKImageView.setVisibility(0);
            baf0 baf0Var = a3 != null ? new baf0(a3, dhr0.Y(R.attr.vk_ui_text_primary, voipActionHorizontalButtonView.getContext())) : null;
            vKImageView.clearColorFilter();
            vKImageView.F0(baf0Var, ImageView.ScaleType.CENTER_INSIDE);
            vKImageView.O0(a2, ImageScreenSize.SIZE_28DP);
        }
        voipActionHorizontalButtonView.b();
    }

    @Override // xsna.e41
    public final void destroy() {
        this.J.dispose();
        CallOnboardingView callOnboardingView = this.g;
        callOnboardingView.f.dispose();
        n69 n69Var = callOnboardingView.g;
        if (n69Var != null) {
            n69Var.d.dispose();
        }
        callOnboardingView.g = null;
        this.K.f.dispose();
    }

    @Override // xsna.e41
    public final i330<orw0> e() {
        i330.a aVar = new i330.a();
        aVar.c(s.b, new d0(1, this, nrw0.class, "onVirtualBackgroundStateChanged", "onVirtualBackgroundStateChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$VirtualBackground;)V", 0), new pv7((byte) 0, 3));
        aVar.c(f0.b, new g0(1, this, nrw0.class, "onMaskStateChanged", "onMaskStateChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$Mask;)V", 0), new pv7((byte) 0, 3));
        aVar.c(h0.b, new i0(1, this, nrw0.class, "onMediaRequestAttentionChanged", "onMediaRequestAttentionChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$MediaRequestAttention;)V", 0), new pv7((byte) 0, 3));
        aVar.c(j0.b, new k0(1, this, nrw0.class, "onMediaSettingsAudioChanged", "onMediaSettingsAudioChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$MediaSettingAudio;)V", 0), new pv7((byte) 0, 3));
        aVar.c(l0.b, new i(1, this, nrw0.class, "onHolidayInteractionChanged", "onHolidayInteractionChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$HolidayInteraction;)V", 0), new pv7((byte) 0, 3));
        aVar.c(j.b, new k(1, this, nrw0.class, "onAsrStateChanged", "onAsrStateChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$AsrRecordStatus;)V", 0), new pv7((byte) 0, 3));
        aVar.c(l.b, new m(1, this, nrw0.class, "onLogsSendingChanged", "onLogsSendingChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$LogsSending;)V", 0), new pv7((byte) 0, 3));
        aVar.c(n.b, new o(1, this, nrw0.class, "onDebugMenuChanged", "onDebugMenuChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$DebugMenu;)V", 0), new pv7((byte) 0, 3));
        aVar.c(p.b, new q(1, this, nrw0.class, "onVmojiStatusChanged", "onVmojiStatusChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$VmojiStatus;)V", 0), new pv7((byte) 0, 3));
        aVar.c(r.b, new t(1, this, nrw0.class, "onCallEffectsPlaceholderChanged", "onCallEffectsPlaceholderChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$CallEffectsPlaceholder;)V", 0), new pv7((byte) 0, 3));
        aVar.c(u.b, new v(1, this, nrw0.class, "onParticipantPermissionsAvailabilityChanged", "onParticipantPermissionsAvailabilityChanged(Z)V", 0), new pv7((byte) 0, 3));
        aVar.c(w.b, new x(1, this, nrw0.class, "onSessionRoomsAvailabilityChanged", "onSessionRoomsAvailabilityChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$SessionRooms;)V", 0), new pv7((byte) 0, 3));
        aVar.c(y.b, new z(1, this, nrw0.class, "onShareLinkVisibilityChanged", "onShareLinkVisibilityChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$ShareLink;)V", 0), new pv7((byte) 0, 3));
        aVar.c(a0.b, new b0(1, this, nrw0.class, "onAsrOnlineChanged", "onAsrOnlineChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$AsrOnline;)V", 0), new pv7((byte) 0, 3));
        aVar.c(c0.b, new e0(1, this, nrw0.class, "onCallDumpChanged", "onCallDumpChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$CallDump;)V", 0), new pv7((byte) 0, 3));
        MainMenuBroadcastFeature mainMenuBroadcastFeature = this.K;
        mainMenuBroadcastFeature.getClass();
        aVar.c(qe00.b, new re00(1, mainMenuBroadcastFeature, MainMenuBroadcastFeature.class, "onRecordStatusChanged", "onRecordStatusChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$RecordStatus;)V", 0), new pv7((byte) 0, 3));
        aVar.c(se00.b, new te00(1, mainMenuBroadcastFeature, MainMenuBroadcastFeature.class, "onScreenCastStartedChanged", "onScreenCastStartedChanged(Z)V", 0), new pv7((byte) 0, 3));
        aVar.c(ue00.b, new ve00(1, mainMenuBroadcastFeature, MainMenuBroadcastFeature.class, "onCanScreenChanged", "onCanScreenChanged(Z)V", 0), new pv7((byte) 0, 3));
        aVar.c(we00.b, new xe00(1, mainMenuBroadcastFeature, MainMenuBroadcastFeature.class, "onBroadcastStatusChanged", "onBroadcastStatusChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$BroadcastStatus;)V", 0), new pv7((byte) 0, 3));
        aVar.c(ye00.b, new pe00(1, mainMenuBroadcastFeature, MainMenuBroadcastFeature.class, "onAsrRecordStatusChanged", "onAsrRecordStatusChanged(Lcom/vk/voip/ui/actions/view/VoipActionsViewModel$AsrRecordStatus;)V", 0), new pv7((byte) 0, 3));
        return aVar.b();
    }

    @Override // xsna.e41
    public final wcw0 g() {
        return new evq();
    }

    public final void t() {
        boolean z2 = true;
        bwt0.p0(this.f, bwt0.K(this.h) || bwt0.K(this.k) || bwt0.K(this.i) || bwt0.K(this.j));
        bwt0.p0(this.m, bwt0.K(this.n) || bwt0.K(this.o) || bwt0.K(this.p));
        bwt0.p0(this.r, bwt0.K(this.s) || bwt0.K(this.t));
        bwt0.p0(this.w, bwt0.K(this.x) || bwt0.K(this.y) || bwt0.K(this.u) || bwt0.K(this.z));
        if (!bwt0.K(this.D) && !bwt0.K(this.E) && !bwt0.K(this.F) && !bwt0.K(this.A)) {
            z2 = false;
        }
        bwt0.p0(this.C, z2);
    }
}
