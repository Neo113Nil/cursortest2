package one.video.controls20;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.time.DurationUnit;
import one.video.controls.view.ButtonsLayout;
import one.video.controls.view.CastTextView;
import one.video.controls.view.CurrentIntervalTitleView;
import one.video.controls.view.EndViewLayout;
import one.video.controls.view.ErrorView;
import one.video.controls.view.FastSpeedHintView;
import one.video.controls.view.FooterLayout;
import one.video.controls.view.GradientView;
import one.video.controls.view.HeaderLayout;
import one.video.controls.view.LiveLabelView;
import one.video.controls.view.LiveTimeView;
import one.video.controls.view.NextVideoButtonView;
import one.video.controls.view.PlayPauseButtonView;
import one.video.controls.view.PositionDurationView;
import one.video.controls.view.PrevVideoButtonView;
import one.video.controls.view.ProgressView;
import one.video.controls.view.ReverseLayout;
import one.video.controls.view.SoundOnlyView;
import one.video.controls.view.VideoEndView;
import one.video.controls.view.ZoomRateView;
import one.video.controls.view.buttons.CastButton;
import one.video.controls.view.buttons.FeedbackButton;
import one.video.controls.view.buttons.FullscreenButton;
import one.video.controls.view.buttons.PipButton;
import one.video.controls.view.buttons.ScaleButton;
import one.video.controls.view.buttons.SettingsButton;
import one.video.controls.view.buttons.TechBugReportButton;
import one.video.controls.view.buttons.VKLogoButton;
import one.video.controls.view.faskseek.DownEventProcessor;
import one.video.controls.view.faskseek.FastSeekView;
import one.video.controls.view.seekbar.OneVideoSeekBarView;
import one.video.controls.view.seekbar.ProgressSeekBarView;
import one.video.controls.view.seekbar.ThumbSeekBarView;
import one.video.controls.view.seekpreview.FullSeekPreviewLayout;
import one.video.controls.view.seekpreview.SeekPreviewLayout;
import one.video.controls.view.state.Mode;
import one.video.controls20.SimpleControlsView;
import one.video.controls20.a;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import xsna.ai0;
import xsna.aqj0;
import xsna.asp;
import xsna.avt0;
import xsna.bd0;
import xsna.bh10;
import xsna.bpn0;
import xsna.bu;
import xsna.bxq;
import xsna.cdi;
import xsna.ci0;
import xsna.dei0;
import xsna.dl80;
import xsna.dno0;
import xsna.e10;
import xsna.e43;
import xsna.eoo;
import xsna.epx;
import xsna.fot;
import xsna.fzi;
import xsna.g2b0;
import xsna.gp;
import xsna.gzs;
import xsna.h10;
import xsna.hod;
import xsna.i10;
import xsna.i100;
import xsna.i5s;
import xsna.j10;
import xsna.j5g;
import xsna.jq;
import xsna.jw5;
import xsna.k10;
import xsna.k9q0;
import xsna.l10;
import xsna.mn9;
import xsna.n1j0;
import xsna.ngm;
import xsna.nn80;
import xsna.oq;
import xsna.oqt0;
import xsna.owo0;
import xsna.ozl;
import xsna.p2j0;
import xsna.pb;
import xsna.pg7;
import xsna.pi6;
import xsna.qm80;
import xsna.qoy;
import xsna.qwm;
import xsna.r3i0;
import xsna.rl3;
import xsna.rs8;
import xsna.rwm;
import xsna.s3q0;
import xsna.sox;
import xsna.srm;
import xsna.sya0;
import xsna.tg;
import xsna.tj2;
import xsna.tlt0;
import xsna.tox;
import xsna.txs;
import xsna.u3i0;
import xsna.ug;
import xsna.ulq;
import xsna.vg;
import xsna.vpj0;
import xsna.vr6;
import xsna.wn80;
import xsna.x5r0;
import xsna.xe9;
import xsna.xoa0;
import xsna.xpj0;
import xsna.y5r;
import xsna.ypj0;
import xsna.yqj;
import xsna.zh0;
import xsna.zjw;
import xsna.zno;
import xsna.zpj0;
import xsna.zrp;

/* compiled from: SimpleControlsView.kt */
/* loaded from: classes8.dex */
public class SimpleControlsView extends ConstraintLayout {
    public static final /* synthetic */ int S = 0;
    public txs A;
    public TransformController B;
    public y5r C;
    public oqt0 D;
    public final ypj0 E;
    public final srm F;
    public Runnable G;
    public final bpn0 H;
    public c I;
    public List<? extends p2j0> J;
    public f K;
    public boolean L;
    public gzs<s3q0> M;
    public boolean N;
    public boolean O;
    public final j P;
    public float Q;
    public final fot R;
    public final cdi t;
    public final nn80 u;
    public final i10 v;
    public final i w;
    public OneVideoPlayer x;
    public yqj y;
    public List<? extends ButtonType> z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SimpleControlsView.kt */
    public static final class ButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType CAST;
        public static final ButtonType FEEDBACK;
        public static final ButtonType FULLSCREEN;
        public static final ButtonType PIP;
        public static final ButtonType SCALE;
        public static final ButtonType SETTINGS;
        public static final ButtonType TECH_BUG_REPORT;
        public static final ButtonType VK_LOGO;

        static {
            ButtonType buttonType = new ButtonType("TECH_BUG_REPORT", 0);
            TECH_BUG_REPORT = buttonType;
            ButtonType buttonType2 = new ButtonType("FEEDBACK", 1);
            FEEDBACK = buttonType2;
            ButtonType buttonType3 = new ButtonType("CAST", 2);
            CAST = buttonType3;
            ButtonType buttonType4 = new ButtonType("PIP", 3);
            PIP = buttonType4;
            ButtonType buttonType5 = new ButtonType("SETTINGS", 4);
            SETTINGS = buttonType5;
            ButtonType buttonType6 = new ButtonType("SCALE", 5);
            SCALE = buttonType6;
            ButtonType buttonType7 = new ButtonType("FULLSCREEN", 6);
            FULLSCREEN = buttonType7;
            ButtonType buttonType8 = new ButtonType("VK_LOGO", 7);
            VK_LOGO = buttonType8;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3, buttonType4, buttonType5, buttonType6, buttonType7, buttonType8};
            $VALUES = buttonTypeArr;
            $ENTRIES = new asp(buttonTypeArr);
        }

        public ButtonType() {
            throw null;
        }

        public static zrp<ButtonType> h() {
            return $ENTRIES;
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SimpleControlsView.kt */
    public static final class ViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType SETTINGS;

        static {
            ViewType viewType = new ViewType("SETTINGS", 0);
            SETTINGS = viewType;
            ViewType[] viewTypeArr = {viewType};
            $VALUES = viewTypeArr;
            $ENTRIES = new asp(viewTypeArr);
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final class a implements OneVideoSeekBarView.a {
        public a() {
        }

        @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
        public final void a() {
            f uiEventsListener = SimpleControlsView.this.getUiEventsListener();
            if (uiEventsListener != null) {
                uiEventsListener.a(a.h.a);
            }
        }

        @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
        public final void c(long j, boolean z) {
            f uiEventsListener = SimpleControlsView.this.getUiEventsListener();
            if (uiEventsListener != null) {
                uiEventsListener.a(new a.f(j, z));
            }
        }

        @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
        public final void d() {
            f uiEventsListener = SimpleControlsView.this.getUiEventsListener();
            if (uiEventsListener != null) {
                uiEventsListener.a(a.g.a);
            }
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final class b {
        public final long a;
        public final long b;
        public final long c;

        public b() {
            zno.a aVar = zno.c;
            long e = eoo.e(300, DurationUnit.MILLISECONDS);
            DurationUnit durationUnit = DurationUnit.SECONDS;
            long e2 = eoo.e(3, durationUnit);
            long e3 = eoo.e(1, durationUnit);
            this.a = e;
            this.b = e2;
            this.c = e3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zno.d(this.a, bVar.a) && zno.d(this.b, bVar.b) && zno.d(this.c, bVar.c);
        }

        public final int hashCode() {
            zno.a aVar = zno.c;
            return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            String m = zno.m(this.a);
            String m2 = zno.m(this.b);
            return i5s.a(xe9.a("Config(animationDuration=", m, ", autoHideDuration=", m2, ", autoHideZoomDuration="), zno.m(this.c), ")");
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public interface c {
    }

    /* compiled from: SimpleControlsView.kt */
    public final class d implements FastSeekView.a {
        public d() {
        }

        @Override // one.video.controls.view.faskseek.FastSeekView.a
        public final void a() {
            SimpleControlsView simpleControlsView = SimpleControlsView.this;
            OneVideoPlayer player = simpleControlsView.getPlayer();
            if (player != null) {
                int i = ulq.b;
                long j = ulq.a;
                zno.a aVar = zno.c;
                long currentPosition = player.getCurrentPosition();
                DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                long f = eoo.f(currentPosition, durationUnit);
                player.seekTo(zno.e(player.o() ? zno.c(f, j) < 0 ? eoo.e(0, durationUnit) : zno.h(f, j) : zno.h(f, j)));
            }
            f uiEventsListener = simpleControlsView.getUiEventsListener();
            if (uiEventsListener != null) {
                uiEventsListener.a(a.b.a);
            }
            simpleControlsView.v.f(Mode.HIDE, false);
            simpleControlsView.L = true;
        }

        @Override // one.video.controls.view.faskseek.FastSeekView.a
        public final void b() {
            long i;
            SimpleControlsView simpleControlsView = SimpleControlsView.this;
            OneVideoPlayer player = simpleControlsView.getPlayer();
            if (player != null) {
                int i2 = ulq.b;
                long j = ulq.a;
                zno.a aVar = zno.c;
                long currentPosition = player.getCurrentPosition();
                DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                long f = eoo.f(currentPosition, durationUnit);
                if (player.o()) {
                    i = zno.i(f, ((zno) jw5.w(new zno(j), new zno(zno.h(eoo.f(player.getDuration(), durationUnit), f)))).b);
                } else {
                    i = zno.i(f, j);
                }
                player.seekTo(zno.e(i));
            }
            f uiEventsListener = simpleControlsView.getUiEventsListener();
            if (uiEventsListener != null) {
                uiEventsListener.a(a.b.a);
            }
            simpleControlsView.v.f(Mode.HIDE, false);
            simpleControlsView.L = true;
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final class e {
        public final boolean a;
        public final boolean b;
        public final a c;

        /* compiled from: SimpleControlsView.kt */
        public static final class a {
            public final String a;
            public final Integer b;
            public final Integer c;

            public a() {
                this(7, null, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.c;
                return hashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            public final String toString() {
                return oq.b(jq.d(this.b, "Separator(symbol=", this.a, ", marginLeft=", ", marginRight="), this.c, ")");
            }

            public a(int i, Integer num, Integer num2) {
                num = (i & 2) != 0 ? null : num;
                num2 = (i & 4) != 0 ? null : num2;
                this.a = "·";
                this.b = num;
                this.c = num2;
            }
        }

        public e() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder c = gp.c("IntervalsConfig(shouldShow=", ", shouldShowCounter=", ", separator=", this.a, this.b);
            c.append(this.c);
            c.append(")");
            return c.toString();
        }

        public e(boolean z, boolean z2, a aVar) {
            this.a = z;
            this.b = z2;
            this.c = aVar;
        }

        public /* synthetic */ e(int i) {
            this(false, true, new a(7, null, null));
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransformController.ScaleType.values().length];
            try {
                iArr[TransformController.ScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransformController.ScaleType.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ViewType.values().length];
            try {
                iArr2[ViewType.SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final class h {
        public h() {
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final class i implements ngm {
        public i() {
        }

        @Override // xsna.ngm
        public final void a() {
            i10.e(SimpleControlsView.this.v, false);
        }

        @Override // xsna.ngm
        public final void onDismiss() {
            int i = SimpleControlsView.S;
            SimpleControlsView simpleControlsView = SimpleControlsView.this;
            OneVideoPlayer oneVideoPlayer = simpleControlsView.x;
            if ((oneVideoPlayer != null ? oneVideoPlayer.getState() : null) == OneVideoPlayer.State.PLAYING) {
                i10.e(simpleControlsView.v, true);
            }
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final class j implements rwm {
        public j() {
        }

        @Override // xsna.rwm
        public final void a(qwm qwmVar) {
            f uiEventsListener = SimpleControlsView.this.getUiEventsListener();
            if (uiEventsListener == null) {
                return;
            }
            if (qwmVar instanceof qwm.b) {
                uiEventsListener.a(new a.e(((qwm.b) qwmVar).a));
            } else if (qwmVar instanceof qwm.c) {
                uiEventsListener.a(new a.i(((qwm.c) qwmVar).a));
            } else {
                if (!(qwmVar instanceof qwm.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                uiEventsListener.a(new a.d(((qwm.a) qwmVar).a));
            }
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final class k extends GestureDetector.SimpleOnGestureListener {
        public k() {
        }

        public final boolean a() {
            OneVideoPlayer player = SimpleControlsView.this.getPlayer();
            OneVideoPlayer.State state = player != null ? player.getState() : null;
            return state == OneVideoPlayer.State.IDLE || state == OneVideoPlayer.State.ERROR || state == OneVideoPlayer.State.ENDED;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            if (!a()) {
                SimpleControlsView simpleControlsView = SimpleControlsView.this;
                simpleControlsView.L = false;
                DownEventProcessor downEventProcessor = simpleControlsView.u.i.h;
                View view = downEventProcessor.b;
                float x = motionEvent.getX();
                View view2 = downEventProcessor.a;
                DownEventProcessor.Side side = x <= ((float) view2.getRight()) ? DownEventProcessor.Side.LEFT : motionEvent.getX() >= ((float) view.getLeft()) ? DownEventProcessor.Side.RIGHT : null;
                if (side != null && ((side != DownEventProcessor.Side.RIGHT || view.isEnabled()) && (side != DownEventProcessor.Side.LEFT || view2.isEnabled()))) {
                    if (!downEventProcessor.e) {
                        if (motionEvent.getEventTime() - downEventProcessor.d < DownEventProcessor.h) {
                            downEventProcessor.e = true;
                        }
                        downEventProcessor.d = motionEvent.getEventTime();
                    }
                    if (downEventProcessor.e) {
                        int i = DownEventProcessor.b.$EnumSwitchMapping$0[side.ordinal()];
                        if (i == 1) {
                            view2.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            view.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                        }
                        if (side != downEventProcessor.f) {
                            downEventProcessor.f = side;
                            downEventProcessor.g = 0;
                        }
                        int i2 = downEventProcessor.g + 1;
                        downEventProcessor.g = i2;
                        pb pbVar = downEventProcessor.c;
                        DownEventProcessor.a aVar = new DownEventProcessor.a();
                        aVar.a = side;
                        FastSeekView fastSeekView = (FastSeekView) pbVar.c;
                        fastSeekView.g = aVar;
                        one.video.controls.view.faskseek.a aVar2 = fastSeekView.e;
                        one.video.controls.view.faskseek.a aVar3 = fastSeekView.f;
                        dl80 dl80Var = fastSeekView.b;
                        int i3 = FastSeekView.b.$EnumSwitchMapping$0[side.ordinal()];
                        if (i3 == 1) {
                            dl80Var.b.setPressed(true);
                            dl80Var.e.setPressed(false);
                            dl80Var.d.setText(fastSeekView.getResources().getString(R.string.one_video_n_seconds, Long.valueOf(zno.l(zno.j(i2, ulq.a), DurationUnit.SECONDS))));
                            aVar2.a();
                            aVar3.c.end();
                            aVar3.d.cancel();
                            aVar3.e.end();
                            FastSeekView.a aVar4 = fastSeekView.c;
                            if (aVar4 != null) {
                                aVar4.a();
                            }
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dl80Var.e.setPressed(true);
                            dl80Var.b.setPressed(false);
                            dl80Var.g.setText(fastSeekView.getResources().getString(R.string.one_video_n_seconds, Long.valueOf(zno.l(zno.j(i2, ulq.a), DurationUnit.SECONDS))));
                            aVar3.a();
                            aVar2.c.end();
                            aVar2.d.cancel();
                            aVar2.e.end();
                            FastSeekView.a aVar5 = fastSeekView.c;
                            if (aVar5 != null) {
                                aVar5.b();
                                return true;
                            }
                        }
                    }
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            SimpleControlsView simpleControlsView = SimpleControlsView.this;
            OneVideoPlayer player = simpleControlsView.getPlayer();
            if (player != null && player.getState() == OneVideoPlayer.State.PLAYING && simpleControlsView.getControlsStyle().c && player.b() < 2.0f) {
                simpleControlsView.Q = player.b();
                player.setPlaybackSpeed(2.0f);
                simpleControlsView.v.f(Mode.SHOW_FAST_SPEED, true);
                if (simpleControlsView.isHapticFeedbackEnabled()) {
                    simpleControlsView.performHapticFeedback(11);
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!a()) {
                SimpleControlsView simpleControlsView = SimpleControlsView.this;
                if (!simpleControlsView.L) {
                    if (simpleControlsView.getCurrentState().a == Mode.SHOW) {
                        simpleControlsView.v.f(Mode.HIDE, true);
                        return true;
                    }
                    if (simpleControlsView.getCurrentState().a == Mode.HIDE || simpleControlsView.getCurrentState().a == Mode.SHOW_ZOOM_RATE) {
                        simpleControlsView.Y4();
                    }
                }
            }
            return true;
        }
    }

    /* compiled from: SimpleControlsView.kt */
    public static final class l extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int min = Math.min(view.getWidth(), view.getHeight());
            int width = (view.getWidth() - min) / 2;
            int height = (view.getHeight() - min) / 2;
            outline.setOval(width, height, width + min, min + height);
        }
    }

    /* compiled from: View.kt */
    public static final class m implements View.OnLayoutChangeListener {
        public m() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if (r3.h == true) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // android.view.View.OnLayoutChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z;
            view.removeOnLayoutChangeListener(this);
            SimpleControlsView simpleControlsView = SimpleControlsView.this;
            nn80 nn80Var = simpleControlsView.u;
            if (simpleControlsView.getControlsStyle().a) {
                g2b0 g2b0Var = simpleControlsView.v.e;
                z = true;
                if (g2b0Var != null) {
                }
                int dimension = !z ? (-nn80Var.y.getHeight()) / 2 : (int) simpleControlsView.getContext().getResources().getDimension(R.dimen.one_video_seek_view_margin_bottom);
                int i9 = !z ? -x5r0.b() : 0;
                Object obj = x5r0.a;
                x5r0.h(nn80Var.y, i9, 0, i9, dimension);
            }
            z = false;
            if (!z) {
            }
            if (!z) {
            }
            Object obj2 = x5r0.a;
            x5r0.h(nn80Var.y, i9, 0, i9, dimension);
        }
    }

    public SimpleControlsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static void P4(SimpleControlsView simpleControlsView) {
        gzs<s3q0> prevVideoClickListener = simpleControlsView.getPrevVideoClickListener();
        if (prevVideoClickListener != null) {
            prevVideoClickListener.invoke();
        }
    }

    public static void Q4(SimpleControlsView simpleControlsView) {
        gzs<s3q0> nextVideoClickListener = simpleControlsView.getNextVideoClickListener();
        if (nextVideoClickListener != null) {
            nextVideoClickListener.invoke();
        }
    }

    private final r3i0 getAnotherSeekPreview() {
        boolean z = this.y.b;
        nn80 nn80Var = this.u;
        return !z ? nn80Var.m : nn80Var.z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aqj0 getCurrentState() {
        return this.v.c;
    }

    private final gzs<s3q0> getNextVideoClickListener() {
        return this.v.t;
    }

    private final l getOvalOutlineProvider() {
        return (l) this.H.getValue();
    }

    private final gzs<s3q0> getPrevVideoClickListener() {
        return this.v.s;
    }

    private final r3i0 getSeekPreview() {
        boolean z = this.y.b;
        nn80 nn80Var = this.u;
        return z ? nn80Var.m : nn80Var.z;
    }

    private final void setControlMargins(boolean z) {
        Object obj = x5r0.a;
        int a2 = (int) x5r0.a(z ? 32 : 42, 1);
        int a3 = (int) x5r0.a(z ? 64 : 74, 1);
        nn80 nn80Var = this.u;
        NextVideoButtonView nextVideoButtonView = nn80Var.q;
        ViewGroup.LayoutParams layoutParams = nextVideoButtonView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.A = a3;
        bVar.setMarginStart(a2);
        nextVideoButtonView.setLayoutParams(bVar);
        PrevVideoButtonView prevVideoButtonView = nn80Var.u;
        ViewGroup.LayoutParams layoutParams2 = prevVideoButtonView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.B = a3;
        bVar2.setMarginEnd(a2);
        prevVideoButtonView.setLayoutParams(bVar2);
    }

    private final void setNextVideoClickListener(gzs<s3q0> gzsVar) {
        i10 i10Var = this.v;
        if (epx.f(i10Var.t, gzsVar)) {
            return;
        }
        i10Var.t = gzsVar;
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, null, null, null, null, gzsVar, null, null, null, 15359);
        i10Var.c(bu.a.h.a);
    }

    private final void setPrevVideoClickListener(gzs<s3q0> gzsVar) {
        i10 i10Var = this.v;
        if (epx.f(i10Var.s, gzsVar)) {
            return;
        }
        i10Var.s = gzsVar;
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, null, null, null, gzsVar, null, null, null, null, 15871);
        i10Var.c(bu.a.j.a);
    }

    public final void U4(aqj0 aqj0Var) {
        nn80 nn80Var = this.u;
        ButtonsLayout buttonsLayout = nn80Var.b;
        buttonsLayout.b.c(aqj0Var.b);
        CastButton castButton = nn80Var.c;
        castButton.f.c(aqj0Var.c);
        FeedbackButton feedbackButton = nn80Var.k;
        feedbackButton.b.c(aqj0Var.d);
        FullscreenButton fullscreenButton = nn80Var.n;
        fullscreenButton.b.c(aqj0Var.e);
        PipButton pipButton = nn80Var.r;
        pipButton.b.c(aqj0Var.f);
        ScaleButton scaleButton = nn80Var.x;
        scaleButton.b.c(aqj0Var.g);
        SettingsButton settingsButton = nn80Var.A;
        settingsButton.b.c(aqj0Var.h);
        TechBugReportButton techBugReportButton = nn80Var.C;
        techBugReportButton.b.c(aqj0Var.i);
        VKLogoButton vKLogoButton = nn80Var.D;
        vKLogoButton.b.c(aqj0Var.j);
        PositionDurationView positionDurationView = nn80Var.t;
        positionDurationView.c.c(aqj0Var.k);
        OneVideoSeekBarView oneVideoSeekBarView = nn80Var.y;
        oneVideoSeekBarView.e.c(aqj0Var.l);
        ProgressSeekBarView progressSeekBarView = oneVideoSeekBarView.getProgressSeekBarView();
        progressSeekBarView.d.c(aqj0Var.m);
        ThumbSeekBarView thumbSeekBarView = oneVideoSeekBarView.getThumbSeekBarView();
        thumbSeekBarView.d.c(aqj0Var.n);
        LiveTimeView liveTimeView = oneVideoSeekBarView.getLiveTimeView();
        if (liveTimeView != null) {
            liveTimeView.c.c(aqj0Var.o);
        }
        LiveLabelView liveLabelView = oneVideoSeekBarView.getLiveLabelView();
        if (liveLabelView != null) {
            liveLabelView.b.c(aqj0Var.p);
        }
        HeaderLayout headerLayout = nn80Var.p;
        headerLayout.b.c(aqj0Var.q);
        FooterLayout footerLayout = nn80Var.l;
        footerLayout.b.c(aqj0Var.r);
        ReverseLayout reverseLayout = nn80Var.w;
        reverseLayout.b.c(aqj0Var.s);
        PrevVideoButtonView prevVideoButtonView = nn80Var.u;
        prevVideoButtonView.b.c(aqj0Var.t);
        NextVideoButtonView nextVideoButtonView = nn80Var.q;
        nextVideoButtonView.b.c(aqj0Var.u);
        GradientView gradientView = nn80Var.o;
        gradientView.b.c(aqj0Var.v);
        ProgressView progressView = nn80Var.v;
        progressView.b.c(aqj0Var.w);
        PlayPauseButtonView playPauseButtonView = nn80Var.s;
        playPauseButtonView.b.c(aqj0Var.x);
        SoundOnlyView soundOnlyView = nn80Var.B;
        soundOnlyView.b.c(aqj0Var.y);
        EndViewLayout endViewLayout = nn80Var.g;
        endViewLayout.b.c(aqj0Var.z);
        ErrorView errorView = nn80Var.h;
        errorView.v.c(aqj0Var.A);
        FastSpeedHintView fastSpeedHintView = nn80Var.j;
        fastSpeedHintView.b.c(aqj0Var.B);
        CurrentIntervalTitleView currentIntervalTitleView = nn80Var.f;
        currentIntervalTitleView.d.c(aqj0Var.C);
        V4(aqj0Var.D);
        ZoomRateView zoomRateView = nn80Var.E;
        zoomRateView.b.c(aqj0Var.E);
        FastSeekView fastSeekView = nn80Var.i;
        fastSeekView.d.c(aqj0Var.F);
    }

    public final void V4(u3i0 u3i0Var) {
        getAnotherSeekPreview().a(u3i0.g);
        getSeekPreview().a(u3i0Var);
    }

    public final Rect X4(ViewType viewType) {
        Rect rect = new Rect();
        if (g.$EnumSwitchMapping$1[viewType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.u.A.getGlobalVisibleRect(rect);
        return rect;
    }

    public final void Y4() {
        Mode mode = Mode.SHOW;
        i10 i10Var = this.v;
        i10Var.f(mode, true);
        OneVideoPlayer oneVideoPlayer = this.x;
        i10.e(i10Var, (oneVideoPlayer != null ? oneVideoPlayer.getState() : null) == OneVideoPlayer.State.PLAYING);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0.h == true) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z4() {
        boolean z;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new m());
            return;
        }
        if (getControlsStyle().a) {
            g2b0 g2b0Var = this.v.e;
            z = true;
            if (g2b0Var != null) {
            }
            nn80 nn80Var = this.u;
            int dimension = !z ? (-nn80Var.y.getHeight()) / 2 : (int) getContext().getResources().getDimension(R.dimen.one_video_seek_view_margin_bottom);
            int i2 = !z ? -x5r0.b() : 0;
            Object obj = x5r0.a;
            x5r0.h(nn80Var.y, i2, 0, i2, dimension);
        }
        z = false;
        nn80 nn80Var2 = this.u;
        if (!z) {
        }
        if (!z) {
        }
        Object obj2 = x5r0.a;
        x5r0.h(nn80Var2.y, i2, 0, i2, dimension);
    }

    public final List<ButtonType> getButtonsVisibilityList() {
        return this.z;
    }

    public final b getConfig() {
        return this.v.z;
    }

    public final yqj getControlsStyle() {
        return this.y;
    }

    public final boolean getDismissSettingDialogOnChildDialogDismissed() {
        return this.O;
    }

    public final c getErrorHandler() {
        return this.I;
    }

    public final e getIntervalsConfig() {
        return this.v.A;
    }

    public final i100 getLogger() {
        return this.t;
    }

    public final OneVideoPlayer getPlayer() {
        return this.x;
    }

    public final View.OnLayoutChangeListener getSeekBarOnLayoutChangeListener() {
        return this.E;
    }

    public final List<p2j0> getSettingsOptions() {
        return this.J;
    }

    public final gzs<s3q0> getTechBugReportHandler() {
        return this.v.r;
    }

    public final f getUiEventsListener() {
        return this.K;
    }

    public final gzs<s3q0> getVkLogoHandler() {
        return this.v.l;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        srm srmVar = this.F;
        srmVar.getClass();
        n1j0 n1j0Var = srmVar.a;
        if (n1j0Var != null) {
            n1j0Var.q();
            tlt0 tlt0Var = n1j0Var.C;
            if (tlt0Var != null) {
                tlt0Var.q();
            }
            dno0 dno0Var = n1j0Var.E;
            if (dno0Var != null) {
                dno0Var.q();
            }
            sya0 sya0Var = n1j0Var.G;
            if (sya0Var != null) {
                sya0Var.q();
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        TransformController transformController = this.B;
        if (transformController != null) {
            transformController.d(motionEvent);
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && getCurrentState().a == Mode.SHOW_FAST_SPEED) {
            OneVideoPlayer oneVideoPlayer = this.x;
            if (oneVideoPlayer == null) {
                return true;
            }
            oneVideoPlayer.setPlaybackSpeed(this.Q);
            this.v.f(Mode.HIDE, true);
        }
        return this.R.a.onTouchEvent(motionEvent);
    }

    public final void setButtonsVisibilityList(List<? extends ButtonType> list) {
        if (list.equals(this.z)) {
            return;
        }
        this.z = list;
        rs8 rs8Var = new rs8(list.contains(ButtonType.TECH_BUG_REPORT), list.contains(ButtonType.FEEDBACK), list.contains(ButtonType.CAST), list.contains(ButtonType.PIP), list.contains(ButtonType.SETTINGS), list.contains(ButtonType.SCALE), list.contains(ButtonType.FULLSCREEN), list.contains(ButtonType.VK_LOGO));
        i10 i10Var = this.v;
        if (epx.f(i10Var.k, rs8Var)) {
            return;
        }
        i10Var.k = rs8Var;
        i10Var.d = fzi.a(i10Var.d, null, rs8Var, null, null, null, null, null, null, null, null, null, null, 16381);
        i10Var.c(bu.a.C2622a.a);
    }

    @ozl
    public final void setCastButtonClickListener(gzs<s3q0> gzsVar) {
        this.M = gzsVar;
    }

    public final void setConfig(b bVar) {
        this.v.z = bVar;
    }

    public final void setControlsStyle(yqj yqjVar) {
        if (epx.f(this.y, yqjVar)) {
            return;
        }
        this.y = yqjVar;
        i10 i10Var = this.v;
        if (!epx.f(i10Var.j, yqjVar)) {
            i10Var.j = yqjVar;
            i10Var.d = fzi.a(i10Var.d, yqjVar, null, null, null, null, null, null, null, null, null, null, null, 16382);
            i10Var.c(bu.a.c.a);
        }
        Z4();
    }

    public final void setDismissSettingDialogOnChildDialogDismissed(boolean z) {
        this.O = z;
    }

    public final void setDragSeekBarEnable(boolean z) {
        if (this.N != z) {
            this.N = z;
            this.u.y.setDragEnabled(z);
        }
    }

    public final void setEndView(View view) {
        nn80 nn80Var = this.u;
        nn80Var.g.removeAllViews();
        nn80Var.g.addView(view);
    }

    public final void setErrorHandler(c cVar) {
        this.I = cVar;
    }

    public final void setFeedbackController(y5r y5rVar) {
        if (epx.f(this.C, y5rVar)) {
            return;
        }
        this.C = y5rVar;
        i10 i10Var = this.v;
        if (epx.f(i10Var.q, y5rVar)) {
            return;
        }
        i10Var.q = y5rVar;
        i10Var.d = fzi.a(i10Var.d, null, null, null, y5rVar, null, null, null, null, null, null, null, null, 16375);
        i10Var.c(bu.a.e.a);
    }

    public final void setFooterView(View view) {
        nn80 nn80Var = this.u;
        nn80Var.l.removeAllViews();
        if (view != null) {
            nn80Var.l.addView(view);
        }
    }

    public final void setFullscreenController(txs txsVar) {
        if (epx.f(this.A, txsVar)) {
            return;
        }
        this.A = txsVar;
        i10 i10Var = this.v;
        h10 h10Var = i10Var.m;
        if (epx.f(i10Var.n, txsVar)) {
            return;
        }
        txs txsVar2 = i10Var.n;
        if (txsVar2 != null) {
            txsVar2.a.remove(h10Var);
        }
        if (txsVar != null) {
            txsVar.a.add(h10Var);
        }
        i10Var.n = txsVar;
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, null, txsVar, null, null, null, null, null, null, 16255);
        i10Var.c(bu.a.f.a);
    }

    public final void setHeaderView(View view) {
        nn80 nn80Var = this.u;
        nn80Var.p.removeAllViews();
        if (view != null) {
            nn80Var.p.addView(view);
        }
    }

    public final void setImageLoader(zjw zjwVar) {
        nn80 nn80Var = this.u;
        nn80Var.m.setImageLoader(zjwVar);
        nn80Var.z.setImageLoader(zjwVar);
    }

    public final void setIntervals(sox soxVar) {
        i10 i10Var = this.v;
        if (epx.f(i10Var.v, soxVar)) {
            return;
        }
        i10Var.v = soxVar;
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, null, null, null, null, null, null, soxVar, null, 12287);
        i10Var.c(bu.a.g.a);
    }

    public final void setIntervalsClickListener(tox toxVar) {
        this.u.f.setOnClickListener(new mn9(toxVar, 8));
    }

    public final void setIntervalsConfig(e eVar) {
        i10 i10Var = this.v;
        if (epx.f(i10Var.A, eVar)) {
            return;
        }
        i10Var.A = eVar;
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, null, null, null, null, null, null, null, eVar, 8191);
        i10Var.c(bu.a.d.a);
    }

    public final void setOnSkipBackClickListener(gzs<s3q0> gzsVar) {
        setPrevVideoClickListener(gzsVar);
    }

    public final void setOnSkipForwardClickListener(gzs<s3q0> gzsVar) {
        setNextVideoClickListener(gzsVar);
    }

    public final void setPipController(xoa0 xoa0Var) {
        if (epx.f(null, xoa0Var)) {
            return;
        }
        i10 i10Var = this.v;
        i10Var.getClass();
        if (epx.f(null, xoa0Var)) {
            return;
        }
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, null, null, null, null, null, null, null, null, 16351);
        i10Var.c(bu.a.i.a);
    }

    public final void setPlayer(OneVideoPlayer oneVideoPlayer) {
        if (epx.f(this.x, oneVideoPlayer)) {
            return;
        }
        OneVideoPlayer oneVideoPlayer2 = this.x;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.setPlaybackSpeed(1.0f);
        }
        this.x = oneVideoPlayer;
        i10 i10Var = this.v;
        k10 k10Var = i10Var.h;
        j10 j10Var = i10Var.g;
        if (epx.f(i10Var.i, oneVideoPlayer)) {
            return;
        }
        OneVideoPlayer oneVideoPlayer3 = i10Var.i;
        if (oneVideoPlayer3 != null) {
            oneVideoPlayer3.c0(j10Var);
        }
        OneVideoPlayer oneVideoPlayer4 = i10Var.i;
        if (oneVideoPlayer4 != null) {
            oneVideoPlayer4.T(k10Var);
        }
        i10Var.i = oneVideoPlayer;
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(j10Var);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.s(k10Var);
        }
        i10Var.e = oneVideoPlayer != null ? qm80.a(oneVideoPlayer) : null;
        i10Var.c(bu.c.a.a);
    }

    public final void setRetryHandler(Runnable runnable) {
        this.G = runnable;
    }

    public final void setReverseControlsOverlayView(View view) {
        nn80 nn80Var = this.u;
        nn80Var.w.removeAllViews();
        if (view != null) {
            nn80Var.w.addView(view);
        }
    }

    public final void setSettingsOptions(List<? extends p2j0> list) {
        this.J = list;
    }

    public final void setTechBugReportHandler(gzs<s3q0> gzsVar) {
        i10 i10Var = this.v;
        if (epx.f(i10Var.r, gzsVar)) {
            return;
        }
        i10Var.r = gzsVar;
        i10Var.d = fzi.a(i10Var.d, null, null, gzsVar, null, null, null, null, null, null, null, null, null, 16379);
        i10Var.c(bu.a.k.a);
    }

    public final void setTimelineImages(owo0 owo0Var) {
        i10 i10Var = this.v;
        if (epx.f(i10Var.u, owo0Var)) {
            return;
        }
        i10Var.u = owo0Var;
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, null, null, null, null, null, owo0Var, null, null, 14335);
        i10Var.c(bu.a.l.a);
    }

    public final void setTransformController(TransformController transformController) {
        if (epx.f(this.B, transformController)) {
            return;
        }
        this.B = transformController;
        i10 i10Var = this.v;
        l10 l10Var = i10Var.o;
        if (epx.f(i10Var.p, transformController)) {
            return;
        }
        TransformController transformController2 = i10Var.p;
        if (transformController2 != null) {
            transformController2.b.remove(l10Var);
        }
        if (transformController != null) {
            transformController.b.add(l10Var);
        }
        i10Var.p = transformController;
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, transformController, null, null, null, null, null, null, null, 16319);
        if (transformController != null) {
            transformController.d = new e10(i10Var, 0);
        }
        i10Var.c(bu.a.m.a);
    }

    public final void setUiEventsListener(f fVar) {
        this.K = fVar;
    }

    public final void setViewCachers(avt0.a... aVarArr) {
        nn80 nn80Var = this.u;
        avt0 avt0Var = new avt0(nn80Var.o);
        nn80Var.o.setViewDrawCacher(avt0Var);
        ArrayList v0 = j5g.v0(avt0Var.a, rl3.u0(aVarArr));
        NextVideoButtonView nextVideoButtonView = nn80Var.q;
        nextVideoButtonView.setDrawer(new pg7(nextVideoButtonView, v0));
        nextVideoButtonView.setOutlineProvider(getOvalOutlineProvider());
        nextVideoButtonView.setClipToOutline(true);
        PrevVideoButtonView prevVideoButtonView = nn80Var.u;
        prevVideoButtonView.setDrawer(new pg7(prevVideoButtonView, v0));
        prevVideoButtonView.setOutlineProvider(getOvalOutlineProvider());
        prevVideoButtonView.setClipToOutline(true);
        PlayPauseButtonView playPauseButtonView = nn80Var.s;
        playPauseButtonView.setDrawer(new pg7(playPauseButtonView, v0));
        playPauseButtonView.setOutlineProvider(getOvalOutlineProvider());
        playPauseButtonView.setClipToOutline(true);
    }

    public final void setVkLogoHandler(gzs<s3q0> gzsVar) {
        i10 i10Var = this.v;
        if (epx.f(i10Var.l, gzsVar)) {
            return;
        }
        i10Var.l = gzsVar;
        i10Var.d = fzi.a(i10Var.d, null, null, null, null, null, null, gzsVar, null, null, null, null, null, 16127);
        i10Var.c(bu.a.n.a);
    }

    public SimpleControlsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public SimpleControlsView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 8, 0);
    }

    public /* synthetic */ SimpleControlsView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View$OnLayoutChangeListener, xsna.ypj0] */
    public SimpleControlsView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        SimpleControlsView simpleControlsView;
        this.t = new cdi();
        LayoutInflater.from(context).inflate(R.layout.one_video_simple_controls_view, this);
        int i4 = R.id.buttons_layout;
        ButtonsLayout buttonsLayout = (ButtonsLayout) k9q0.j(R.id.buttons_layout, this);
        if (buttonsLayout != null) {
            i4 = R.id.cast_button;
            CastButton castButton = (CastButton) k9q0.j(R.id.cast_button, this);
            if (castButton != null) {
                i4 = R.id.cast_progress_view;
                if (((ProgressView) k9q0.j(R.id.cast_progress_view, this)) != null) {
                    i4 = R.id.cast_text_view;
                    CastTextView castTextView = (CastTextView) k9q0.j(R.id.cast_text_view, this);
                    if (castTextView != null) {
                        i4 = R.id.content_view;
                        ConstraintLayout constraintLayout = (ConstraintLayout) k9q0.j(R.id.content_view, this);
                        if (constraintLayout != null) {
                            i4 = R.id.current_interval_title_view;
                            CurrentIntervalTitleView currentIntervalTitleView = (CurrentIntervalTitleView) k9q0.j(R.id.current_interval_title_view, this);
                            if (currentIntervalTitleView != null) {
                                i4 = R.id.end_view_layout;
                                EndViewLayout endViewLayout = (EndViewLayout) k9q0.j(R.id.end_view_layout, this);
                                if (endViewLayout != null) {
                                    i4 = R.id.error_view;
                                    ErrorView errorView = (ErrorView) k9q0.j(R.id.error_view, this);
                                    if (errorView != null) {
                                        i4 = R.id.fast_seek_view;
                                        FastSeekView fastSeekView = (FastSeekView) k9q0.j(R.id.fast_seek_view, this);
                                        if (fastSeekView != null) {
                                            i4 = R.id.fast_speed_hint_view;
                                            FastSpeedHintView fastSpeedHintView = (FastSpeedHintView) k9q0.j(R.id.fast_speed_hint_view, this);
                                            if (fastSpeedHintView != null) {
                                                i4 = R.id.feedback_button;
                                                FeedbackButton feedbackButton = (FeedbackButton) k9q0.j(R.id.feedback_button, this);
                                                if (feedbackButton != null) {
                                                    i4 = R.id.footer_layout;
                                                    FooterLayout footerLayout = (FooterLayout) k9q0.j(R.id.footer_layout, this);
                                                    if (footerLayout != null) {
                                                        i4 = R.id.full_seek_preview;
                                                        FullSeekPreviewLayout fullSeekPreviewLayout = (FullSeekPreviewLayout) k9q0.j(R.id.full_seek_preview, this);
                                                        if (fullSeekPreviewLayout != null) {
                                                            i4 = R.id.fullscreen_button;
                                                            FullscreenButton fullscreenButton = (FullscreenButton) k9q0.j(R.id.fullscreen_button, this);
                                                            if (fullscreenButton != null) {
                                                                i4 = R.id.gradient_view;
                                                                GradientView gradientView = (GradientView) k9q0.j(R.id.gradient_view, this);
                                                                if (gradientView != null) {
                                                                    i4 = R.id.header_layout;
                                                                    HeaderLayout headerLayout = (HeaderLayout) k9q0.j(R.id.header_layout, this);
                                                                    if (headerLayout != null) {
                                                                        i4 = R.id.next_video_button_view;
                                                                        NextVideoButtonView nextVideoButtonView = (NextVideoButtonView) k9q0.j(R.id.next_video_button_view, this);
                                                                        if (nextVideoButtonView != null) {
                                                                            i4 = R.id.pip_button;
                                                                            PipButton pipButton = (PipButton) k9q0.j(R.id.pip_button, this);
                                                                            if (pipButton != null) {
                                                                                i4 = R.id.play_pause_button_view;
                                                                                PlayPauseButtonView playPauseButtonView = (PlayPauseButtonView) k9q0.j(R.id.play_pause_button_view, this);
                                                                                if (playPauseButtonView != null) {
                                                                                    i4 = R.id.position_duration_view;
                                                                                    PositionDurationView positionDurationView = (PositionDurationView) k9q0.j(R.id.position_duration_view, this);
                                                                                    if (positionDurationView != null) {
                                                                                        i4 = R.id.prev_video_button_view;
                                                                                        PrevVideoButtonView prevVideoButtonView = (PrevVideoButtonView) k9q0.j(R.id.prev_video_button_view, this);
                                                                                        if (prevVideoButtonView != null) {
                                                                                            i4 = R.id.progress_view;
                                                                                            ProgressView progressView = (ProgressView) k9q0.j(R.id.progress_view, this);
                                                                                            if (progressView != null) {
                                                                                                i4 = R.id.reverse_layout;
                                                                                                ReverseLayout reverseLayout = (ReverseLayout) k9q0.j(R.id.reverse_layout, this);
                                                                                                if (reverseLayout != null) {
                                                                                                    i4 = R.id.scale_button;
                                                                                                    ScaleButton scaleButton = (ScaleButton) k9q0.j(R.id.scale_button, this);
                                                                                                    if (scaleButton != null) {
                                                                                                        OneVideoSeekBarView oneVideoSeekBarView = (OneVideoSeekBarView) k9q0.j(R.id.seek_bar_view, this);
                                                                                                        if (oneVideoSeekBarView != 0) {
                                                                                                            CopyOnWriteArrayList<OneVideoSeekBarView.a> copyOnWriteArrayList = oneVideoSeekBarView.c;
                                                                                                            i4 = R.id.seek_preview_layout;
                                                                                                            SeekPreviewLayout seekPreviewLayout = (SeekPreviewLayout) k9q0.j(R.id.seek_preview_layout, this);
                                                                                                            if (seekPreviewLayout != null) {
                                                                                                                i4 = R.id.settings_button;
                                                                                                                SettingsButton settingsButton = (SettingsButton) k9q0.j(R.id.settings_button, this);
                                                                                                                if (settingsButton != null) {
                                                                                                                    i4 = R.id.sound_only_view;
                                                                                                                    SoundOnlyView soundOnlyView = (SoundOnlyView) k9q0.j(R.id.sound_only_view, this);
                                                                                                                    if (soundOnlyView != null) {
                                                                                                                        i4 = R.id.tech_bug_report_button;
                                                                                                                        TechBugReportButton techBugReportButton = (TechBugReportButton) k9q0.j(R.id.tech_bug_report_button, this);
                                                                                                                        if (techBugReportButton != null) {
                                                                                                                            i4 = R.id.vk_logo_button;
                                                                                                                            VKLogoButton vKLogoButton = (VKLogoButton) k9q0.j(R.id.vk_logo_button, this);
                                                                                                                            if (vKLogoButton != null) {
                                                                                                                                i4 = R.id.zoom_rate;
                                                                                                                                ZoomRateView zoomRateView = (ZoomRateView) k9q0.j(R.id.zoom_rate, this);
                                                                                                                                if (zoomRateView != null) {
                                                                                                                                    nn80 nn80Var = new nn80(this, buttonsLayout, castButton, castTextView, constraintLayout, currentIntervalTitleView, endViewLayout, errorView, fastSeekView, fastSpeedHintView, feedbackButton, footerLayout, fullSeekPreviewLayout, fullscreenButton, gradientView, headerLayout, nextVideoButtonView, pipButton, playPauseButtonView, positionDurationView, prevVideoButtonView, progressView, reverseLayout, scaleButton, oneVideoSeekBarView, seekPreviewLayout, settingsButton, soundOnlyView, techBugReportButton, vKLogoButton, zoomRateView);
                                                                                                                                    this.u = nn80Var;
                                                                                                                                    i10 i10Var = new i10(nn80Var, new xpj0(this));
                                                                                                                                    i10Var.f = new h();
                                                                                                                                    this.v = i10Var;
                                                                                                                                    this.w = new i();
                                                                                                                                    this.y = yqj.e;
                                                                                                                                    this.z = ButtonType.h();
                                                                                                                                    ?? r5 = new View.OnLayoutChangeListener() { // from class: xsna.ypj0
                                                                                                                                        @Override // android.view.View.OnLayoutChangeListener
                                                                                                                                        public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                                                                                                                                            if (SimpleControlsView.this.D != null) {
                                                                                                                                                new Rect(i5, i6, i7, i8);
                                                                                                                                                s3q0 s3q0Var = s3q0.a;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    };
                                                                                                                                    this.E = r5;
                                                                                                                                    this.F = new srm();
                                                                                                                                    this.G = new hod(this, 12);
                                                                                                                                    int i5 = 6;
                                                                                                                                    playPauseButtonView.setOnClickListener(new tg(this, i5));
                                                                                                                                    fastSeekView.setFastSeekListener(new d());
                                                                                                                                    prevVideoButtonView.setOnClickListener(new ug(this, 4));
                                                                                                                                    nextVideoButtonView.setOnClickListener(new vg(this, 7));
                                                                                                                                    int i6 = wn80.a;
                                                                                                                                    setControlMargins(false);
                                                                                                                                    oneVideoSeekBarView.setLiveButtonClickListener(new vpj0(this, 0));
                                                                                                                                    oneVideoSeekBarView.addOnLayoutChangeListener(r5);
                                                                                                                                    copyOnWriteArrayList.add(new zpj0(i10Var, this));
                                                                                                                                    copyOnWriteArrayList.add(new a());
                                                                                                                                    seekPreviewLayout.setAnchorView(oneVideoSeekBarView);
                                                                                                                                    fullSeekPreviewLayout.setAnchorView(oneVideoSeekBarView);
                                                                                                                                    techBugReportButton.setOnClickListener(new com.vk.im.video.d(this, 12));
                                                                                                                                    feedbackButton.setOnClickListener(new pi6(this, 4));
                                                                                                                                    castButton.setOnClickListener(new zh0(this, context));
                                                                                                                                    pipButton.setOnClickListener(new ai0(this, 9));
                                                                                                                                    int i7 = 3;
                                                                                                                                    settingsButton.setOnClickListener(new bxq(i7, this, context));
                                                                                                                                    scaleButton.setOnClickListener(new ci0(this, 11));
                                                                                                                                    fullscreenButton.setOnClickListener(new vr6(this, i5));
                                                                                                                                    vKLogoButton.setOnClickListener(new bd0(this, 14));
                                                                                                                                    errorView.setRetryRunnable(this.G);
                                                                                                                                    this.H = new bpn0(new tj2(22));
                                                                                                                                    this.J = e43.l(p2j0.h.a, p2j0.e.a, p2j0.a.a, p2j0.d.a);
                                                                                                                                    this.N = true;
                                                                                                                                    this.P = new j();
                                                                                                                                    if (!isInEditMode()) {
                                                                                                                                        U4(getCurrentState());
                                                                                                                                    }
                                                                                                                                    this.Q = 1.0f;
                                                                                                                                    this.R = new fot(context, new k(), null);
                                                                                                                                    setClipChildren(false);
                                                                                                                                    VideoEndView videoEndView = new VideoEndView(context, null, 0, 14, 0);
                                                                                                                                    videoEndView.setId(View.generateViewId());
                                                                                                                                    videoEndView.setLayoutParams(new ConstraintLayout.b(-1, -1));
                                                                                                                                    videoEndView.setButtonClickListener(new dei0(this, i7));
                                                                                                                                    setEndView(videoEndView);
                                                                                                                                    Z4();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            simpleControlsView = this;
                                                                                                            i4 = R.id.seek_bar_view;
                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(simpleControlsView.getResources().getResourceName(i4)));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        simpleControlsView = this;
        throw new NullPointerException("Missing required view with ID: ".concat(simpleControlsView.getResources().getResourceName(i4)));
    }

    @ozl
    private static /* synthetic */ void getCastButtonClickListener$annotations() {
    }

    /* compiled from: SimpleControlsView.kt */
    public interface f {
        default void a(one.video.controls20.a aVar) {
        }
    }

    @ozl
    public final void setCastButtonStatus(boolean z) {
    }

    @ozl
    public final void setCastButtonVisible(boolean z) {
    }
}
