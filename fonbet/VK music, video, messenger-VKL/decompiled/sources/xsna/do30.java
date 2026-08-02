package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.AudioMsgStatusView;
import com.vk.im.ui.views.WaveFormView;
import com.vk.im.ui.views.msg.MsgTranscriptButton;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;

/* compiled from: MsgPartAudioMsgHolder.kt */
/* loaded from: classes2.dex */
public final class do30 extends hr30<AttachAudioMsg, eo30> {
    public View d;
    public AudioMsgStatusView e;
    public WaveFormView f;
    public TextView g;
    public TimeAndStatusView h;
    public MsgTranscriptButton i;
    public coo j;
    public StringBuilder k;
    public eo30 l;
    public pk30 m;
    public com.vk.im.engine.models.messages.a n;
    public hr4 o;
    public final v5t p = new v5t(R.layout.vkim_msg_part_audiomsg);
    public kq4 q;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            do30 do30Var = do30.this;
            pk30 pk30Var = do30Var.m;
            eo30 eo30Var = do30Var.l;
            Msg msg = eo30Var != null ? eo30Var.q : null;
            Attach attach = eo30Var != null ? eo30Var.s : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, eo30Var != null ? eo30Var.r : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            do30 do30Var = do30.this;
            pk30 pk30Var = do30Var.m;
            eo30 eo30Var = do30Var.l;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = eo30Var != null ? eo30Var.q : null;
            Attach attach = eo30Var != null ? eo30Var.s : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, eo30Var != null ? eo30Var.r : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    /* compiled from: MsgPartAudioMsgHolder.kt */
    public static final class c implements WaveFormView.a {
        public c() {
        }

        @Override // com.vk.im.ui.views.WaveFormView.a
        public final void a(float f, boolean z) {
            if (z) {
                do30 do30Var = do30.this;
                pk30 pk30Var = do30Var.m;
                eo30 eo30Var = do30Var.l;
                Msg msg = eo30Var != null ? eo30Var.q : null;
                com.vk.im.engine.models.messages.a aVar = eo30Var != null ? eo30Var.g : null;
                Parcelable parcelable = eo30Var != null ? eo30Var.s : null;
                AttachAudioMsg attachAudioMsg = parcelable instanceof AttachAudioMsg ? (AttachAudioMsg) parcelable : null;
                if (pk30Var == null || msg == null || aVar == null || attachAudioMsg == null) {
                    return;
                }
                pk30Var.V(msg, aVar, attachAudioMsg, f);
            }
        }
    }

    @Override // xsna.hr30, xsna.kq4.a
    public final void i(hr4 hr4Var) {
        this.o = hr4Var;
        s();
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        AudioMsgStatusView audioMsgStatusView = this.e;
        if (audioMsgStatusView == null) {
            audioMsgStatusView = null;
        }
        audioMsgStatusView.setColor(i);
        WaveFormView waveFormView = this.f;
        if (waveFormView == null) {
            waveFormView = null;
        }
        waveFormView.setPrimaryColor(i);
        TimeAndStatusView timeAndStatusView = this.h;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(bubbleColors.h);
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        MsgTranscriptButton msgTranscriptButton = this.i;
        bwt0.o0(msgTranscriptButton != null ? msgTranscriptButton : null, i);
    }

    @Override // xsna.hr30
    public final void p(eo30 eo30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        eo30 eo30Var2 = eo30Var;
        int i = eo30Var2.m;
        this.m = pk30Var;
        this.l = eo30Var2;
        kq4 kq4Var = eo30Var2.c;
        if (kq4Var != null) {
            kq4Var.c(this);
            this.q = kq4Var;
        }
        this.n = eo30Var2.g;
        this.o = kq4Var != null ? kq4Var.a() : null;
        WaveFormView waveFormView = this.f;
        if (waveFormView == null) {
            waveFormView = null;
        }
        waveFormView.setWaveForm(eo30Var2.o);
        if (com.vk.im.engine.utils.a.i(i) && eo30Var2.n) {
            MsgTranscriptButton msgTranscriptButton = this.i;
            if (msgTranscriptButton == null) {
                msgTranscriptButton = null;
            }
            bwt0.p0(msgTranscriptButton, true);
            MsgTranscriptButton msgTranscriptButton2 = this.i;
            if (msgTranscriptButton2 == null) {
                msgTranscriptButton2 = null;
            }
            msgTranscriptButton2.setProgressLoading(eo30Var2.p == 1);
            if (eo30Var2.j) {
                MsgTranscriptButton msgTranscriptButton3 = this.i;
                if (msgTranscriptButton3 == null) {
                    msgTranscriptButton3 = null;
                }
                msgTranscriptButton3.setImageDrawable(msgTranscriptButton3.c);
                msgTranscriptButton3.setContentDescription(msgTranscriptButton3.getContext().getText(R.string.vkim_accessibility_transcript_hide));
            } else {
                MsgTranscriptButton msgTranscriptButton4 = this.i;
                if (msgTranscriptButton4 == null) {
                    msgTranscriptButton4 = null;
                }
                msgTranscriptButton4.U();
            }
        } else {
            MsgTranscriptButton msgTranscriptButton5 = this.i;
            if (msgTranscriptButton5 == null) {
                msgTranscriptButton5 = null;
            }
            bwt0.p0(msgTranscriptButton5, false);
        }
        t(i);
        View view = this.d;
        View view2 = view == null ? null : view;
        if (view == null) {
            view = null;
        }
        Resources resources = view.getResources();
        View view3 = this.d;
        if (view3 == null) {
            view3 = null;
        }
        view2.setContentDescription(resources.getString(R.string.vkim_accessibility_audiomsg_with_duration, new coo(view3.getContext()).c(i)));
        jr30 jr30Var = eo30Var2.b;
        TimeAndStatusView timeAndStatusView = this.h;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
        s();
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        v5t v5tVar = this.p;
        this.d = v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new a());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new b());
        View view3 = this.d;
        if (view3 == null) {
            view3 = null;
        }
        this.e = (AudioMsgStatusView) view3.findViewById(R.id.icon);
        View view4 = this.d;
        if (view4 == null) {
            view4 = null;
        }
        this.f = (WaveFormView) view4.findViewById(R.id.waveform);
        View view5 = this.d;
        if (view5 == null) {
            view5 = null;
        }
        this.g = (TextView) view5.findViewById(R.id.duration);
        View view6 = this.d;
        if (view6 == null) {
            view6 = null;
        }
        this.h = (TimeAndStatusView) view6.findViewById(R.id.timeAndStatus);
        View view7 = this.d;
        if (view7 == null) {
            view7 = null;
        }
        this.i = (MsgTranscriptButton) view7.findViewById(R.id.btn_transcription);
        this.j = new coo(context);
        this.k = new StringBuilder();
        AudioMsgStatusView audioMsgStatusView = this.e;
        if (audioMsgStatusView == null) {
            audioMsgStatusView = null;
        }
        audioMsgStatusView.setPlayClickListener(new v6d(this, 4));
        MsgTranscriptButton msgTranscriptButton = this.i;
        if (msgTranscriptButton == null) {
            msgTranscriptButton = null;
        }
        jjc.g(msgTranscriptButton, new bgy(this, 9));
        AudioMsgStatusView audioMsgStatusView2 = this.e;
        if (audioMsgStatusView2 == null) {
            audioMsgStatusView2 = null;
        }
        audioMsgStatusView2.setPauseClickListener(new uzb(this, 6));
        WaveFormView waveFormView = this.f;
        if (waveFormView == null) {
            waveFormView = null;
        }
        waveFormView.setOnWaveFormChangeListener(new c());
        View view8 = this.d;
        if (view8 == null) {
            return null;
        }
        return view8;
    }

    @Override // xsna.hr30
    public final void r() {
        this.m = null;
        this.l = null;
        kq4 kq4Var = this.q;
        if (kq4Var != null) {
            kq4Var.b(this);
        }
        this.q = null;
    }

    public final void s() {
        eo30 eo30Var = this.l;
        hr4 hr4Var = this.o;
        boolean z = eo30Var != null ? eo30Var.h : false;
        boolean z2 = eo30Var != null ? eo30Var.i : false;
        if (eo30Var != null) {
            int i = eo30Var.l;
            if (hr4Var != null) {
                boolean z3 = eo30Var == null || !eo30Var.k ? z2 || z : z2 || z || (hr4Var.c && i == hr4Var.a);
                if (i != hr4Var.a) {
                    AudioMsgStatusView audioMsgStatusView = this.e;
                    if (audioMsgStatusView == null) {
                        audioMsgStatusView = null;
                    }
                    audioMsgStatusView.setPlaying(false);
                    AudioMsgStatusView audioMsgStatusView2 = this.e;
                    if (audioMsgStatusView2 == null) {
                        audioMsgStatusView2 = null;
                    }
                    audioMsgStatusView2.setListened(z3);
                    WaveFormView waveFormView = this.f;
                    if (waveFormView == null) {
                        waveFormView = null;
                    }
                    waveFormView.setProgress(1.0f);
                    WaveFormView waveFormView2 = this.f;
                    (waveFormView2 != null ? waveFormView2 : null).setEnabled(false);
                    return;
                }
                AudioMsgStatusView audioMsgStatusView3 = this.e;
                if (audioMsgStatusView3 == null) {
                    audioMsgStatusView3 = null;
                }
                audioMsgStatusView3.setPlaying(hr4Var.c);
                AudioMsgStatusView audioMsgStatusView4 = this.e;
                if (audioMsgStatusView4 == null) {
                    audioMsgStatusView4 = null;
                }
                audioMsgStatusView4.setListened(z3);
                if (hr4Var.b) {
                    WaveFormView waveFormView3 = this.f;
                    if (waveFormView3 == null) {
                        waveFormView3 = null;
                    }
                    waveFormView3.setIndeterminate(true);
                    WaveFormView waveFormView4 = this.f;
                    (waveFormView4 != null ? waveFormView4 : null).setEnabled(false);
                    return;
                }
                t((int) (hr4Var.d * eo30Var.m));
                WaveFormView waveFormView5 = this.f;
                if (waveFormView5 == null) {
                    waveFormView5 = null;
                }
                waveFormView5.setProgress(hr4Var.d);
                WaveFormView waveFormView6 = this.f;
                (waveFormView6 != null ? waveFormView6 : null).setEnabled(true);
                return;
            }
        }
        AudioMsgStatusView audioMsgStatusView5 = this.e;
        if (audioMsgStatusView5 == null) {
            audioMsgStatusView5 = null;
        }
        audioMsgStatusView5.setPlaying(false);
        AudioMsgStatusView audioMsgStatusView6 = this.e;
        if (audioMsgStatusView6 == null) {
            audioMsgStatusView6 = null;
        }
        audioMsgStatusView6.setListened(false);
        WaveFormView waveFormView7 = this.f;
        if (waveFormView7 == null) {
            waveFormView7 = null;
        }
        waveFormView7.setProgress(1.0f);
        WaveFormView waveFormView8 = this.f;
        (waveFormView8 != null ? waveFormView8 : null).setEnabled(false);
    }

    public final void t(int i) {
        StringBuilder sb = this.k;
        if (sb == null) {
            sb = null;
        }
        sb.setLength(0);
        coo cooVar = this.j;
        if (cooVar == null) {
            cooVar = null;
        }
        StringBuilder sb2 = this.k;
        if (sb2 == null) {
            sb2 = null;
        }
        cooVar.getClass();
        coo.b(i, sb2);
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        StringBuilder sb3 = this.k;
        textView.setText(sb3 != null ? sb3 : null);
    }
}
