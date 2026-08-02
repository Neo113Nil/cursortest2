package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.messages.dto.MessagesSendReactionSourceDto;
import com.vk.clips.sdk.shared.api.decoration.RecommendationDecorationPayload;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsInitDecorPayload;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsPaginationDecorPayload;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.view.linkedtext.LinkedMessageView;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.reactions.api.chips.ReactionChipStyle;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.RichEditText;
import com.vk.im.ui.views.WriteBarDisabled;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.mvi.MviViewContainer;
import com.vk.stickers.keyboard.StickersView;
import com.vk.toggle.features.ImFeatures;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dob;
import xsna.gm50;
import xsna.mk50;
import xsna.r1f0;
import xsna.tob;
import xsna.v0f0;
import xsna.wmb;
import xsna.xn50;

/* compiled from: ChatClipsBottomBarDecorationView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class ynb extends MviViewContainer<ymb, dob, wmb> implements d6e {
    public static final int J = iah0.a(100);
    public View A;
    public LinearLayout B;
    public ImAvatarView C;
    public AppCompatImageView D;
    public AppCompatTextView E;
    public boolean F;
    public final bpn0 G;
    public final io.reactivex.rxjava3.disposables.b H;
    public io.reactivex.rxjava3.disposables.c I;
    public final gob f;
    public final com.vk.im.engine.models.c g;
    public final Peer h;
    public final gy0 i;
    public FrameLayout j;
    public View k;
    public oob l;
    public View m;
    public LinkedMessageView n;
    public FrameLayout o;
    public FrameLayout p;
    public v0f0 q;
    public View r;
    public final n52 s;
    public final sx3 t;
    public final Object u;
    public final Object v;
    public final Handler w;
    public final Object x;
    public final Object y;
    public boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatClipsBottomBarDecorationView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADDED;
        public static final a HIDE_RUNNING;
        public static final a NOT_ADDED;
        public static final a SHOW_RUNNING;

        static {
            a aVar = new a("NOT_ADDED", 0);
            NOT_ADDED = aVar;
            a aVar2 = new a("SHOW_RUNNING", 1);
            SHOW_RUNNING = aVar2;
            a aVar3 = new a("ADDED", 2);
            ADDED = aVar3;
            a aVar4 = new a("HIDE_RUNNING", 3);
            HIDE_RUNNING = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NOT_ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SHOW_RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ADDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HIDE_RUNNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ynb(l7s l7sVar, gob gobVar, com.vk.im.engine.models.c cVar, Peer peer, gy0 gy0Var) {
        super(l7sVar, null, 4, 0);
        this.f = gobVar;
        this.g = cVar;
        this.h = peer;
        this.i = gy0Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setClipChildren(false);
        setVisibility(8);
        this.s = new n52(this, 4);
        this.t = new sx3(this, 2);
        oo ooVar = new oo(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u = msy.a(lazyThreadSafetyMode, ooVar);
        this.v = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.h(this, 15));
        this.w = new Handler(Looper.getMainLooper());
        this.x = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.o0(6));
        this.y = msy.a(lazyThreadSafetyMode, new lk(4));
        this.z = true;
        this.G = new bpn0(new xm1(this, 15));
        this.H = new io.reactivex.rxjava3.disposables.b();
    }

    private final Drawable getCheckDrawable() {
        return (Drawable) this.G.getValue();
    }

    private final Context getContextWrapper() {
        TypedValue typedValue = krv0.a;
        Integer d2 = krv0.d();
        return d2 != null ? new cro0(getContext(), d2.intValue()) : new cro0(getContext(), ((FragmentImpl) ((Fragment) this.i.c)).vn());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final DisplayNameFormatter getDisplayNameFormatter() {
        return (DisplayNameFormatter) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ValueAnimator getHideLinkedMessageAnimator() {
        return (ValueAnimator) this.v.getValue();
    }

    private final a getLinkedMsgState() {
        LinkedMessageView linkedMessageView = this.n;
        if (linkedMessageView == null) {
            return null;
        }
        return !linkedMessageView.isAttachedToWindow() ? a.NOT_ADDED : getShowLinkedMessageAnimator().isRunning() ? a.SHOW_RUNNING : getHideLinkedMessageAnimator().isRunning() ? a.HIDE_RUNNING : a.ADDED;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final o040 getMsgTextBuilder() {
        return (o040) this.y.getValue();
    }

    private final u0f0 getReactionChipsContainerFactory() {
        a1w a1wVar;
        zdw zdwVar = i7o0.b;
        a1w a1wVar2 = null;
        if (zdwVar == null) {
            zdwVar = null;
        }
        j3f0 e = zdwVar.e();
        if (e == null) {
            return null;
        }
        Peer peer = this.h;
        if (!BuildInfo.s() || !peer.Ab(Peer.Type.GROUP) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) {
            a1wVar2 = a1wVar;
        }
        return e.e(a1wVar2);
    }

    private final paw getReactionsAnimationCoordinator() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        j3f0 e = zdwVar.e();
        if (e != null) {
            return e.a();
        }
        return null;
    }

    private final r1f0 getReactionsPickerFactory() {
        a1w a1wVar;
        zdw zdwVar = i7o0.b;
        a1w a1wVar2 = null;
        if (zdwVar == null) {
            zdwVar = null;
        }
        j3f0 e = zdwVar.e();
        if (e == null) {
            return null;
        }
        Peer peer = this.h;
        if (!BuildInfo.s() || !peer.Ab(Peer.Type.GROUP) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) {
            a1wVar2 = a1wVar;
        }
        return e.f(a1wVar2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ValueAnimator getShowLinkedMessageAnimator() {
        return (ValueAnimator) this.u.getValue();
    }

    public static View h(ynb ynbVar) {
        if (ynbVar.l != null) {
            return LayoutInflater.from(ynbVar.getContextWrapper()).inflate(R.layout.im_chat_clips_include_write_bar, (ViewGroup) null, false);
        }
        return null;
    }

    public static s3q0 i(ynb ynbVar, dob.e eVar) {
        FrameLayout frameLayout;
        DialogExt dialogExt = eVar.a;
        Msg msg = eVar.b;
        if (eVar.c) {
            r1f0 reactionsPickerFactory = ynbVar.getReactionsPickerFactory();
            FrameLayout frameLayout2 = ynbVar.o;
            if (reactionsPickerFactory != null && frameLayout2 != null) {
                frameLayout2.removeAllViews();
                ChatSettings Bb = dialogExt.Bb();
                boolean z = Bb != null ? Bb.m : false;
                onb onbVar = new onb(0, ynbVar, msg);
                String j = MessagesSendReactionSourceDto.CLIP_FULLSCREEN.j();
                ImFeatures.IM_CHAT_MODALS_REDESIGN.getClass();
                reactionsPickerFactory.a(new r1f0.b(frameLayout2, z, onbVar, j, msg, !com.vk.toggle.b.A.a(r0)));
                ynbVar.m = frameLayout2.getChildAt(0);
                RecyclerView p = p(frameLayout2);
                if (p != null) {
                    p.addOnItemTouchListener(new aob(p));
                }
            }
        } else {
            View view = ynbVar.m;
            if (view != null && (frameLayout = ynbVar.o) != null) {
                frameLayout.removeView(view);
            }
        }
        return s3q0.a;
    }

    public static void j(ynb ynbVar) {
        ynbVar.getHideLinkedMessageAnimator().start();
    }

    public static s3q0 k(ynb ynbVar, int i, long j, ImChatClipsInitDecorPayload imChatClipsInitDecorPayload, View view) {
        if (view != null) {
            oob oobVar = ynbVar.l;
            if (oobVar != null) {
                tob.a aVar = tob.b;
                kkm kkmVar = oobVar.h;
                oobVar.z = aVar;
                oobVar.r = ynbVar;
                ViewGroup viewGroup = (ViewGroup) ynbVar.findViewById(R.id.im_chat_clips_write_area);
                if (viewGroup != null) {
                    viewGroup.addView(view);
                }
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                WriteBarDisabled writeBarDisabled = (WriteBarDisabled) ynbVar.findViewById(R.id.im_chat_clips_write_bar_disabled);
                writeBarDisabled.setThemeBinder(kkmVar);
                oobVar.s = writeBarDisabled;
                WriteBar writeBar = (WriteBar) ynbVar.findViewById(R.id.im_chat_clips_write_bar);
                oobVar.q = writeBar;
                writeBar.setHidePopup(true);
                WriteBar writeBar2 = oobVar.q;
                if (writeBar2 == null) {
                    writeBar2 = null;
                }
                writeBar2.setBackgroundColor(0);
                WriteBar writeBar3 = oobVar.q;
                if (writeBar3 == null) {
                    writeBar3 = null;
                }
                oobVar.t = writeBar3.findViewById(R.id.writebar_send);
                WriteBar writeBar4 = oobVar.q;
                if (writeBar4 == null) {
                    writeBar4 = null;
                }
                oobVar.v = (RichEditText) writeBar4.findViewById(R.id.writebar_edit);
                WriteBar writeBar5 = oobVar.q;
                if (writeBar5 == null) {
                    writeBar5 = null;
                }
                oobVar.u = writeBar5.findViewById(R.id.writebar_emoji);
                oobVar.y = ynbVar.findViewById(R.id.im_chat_clips_keyboard_background);
                WriteBar writeBar6 = oobVar.q;
                if (writeBar6 == null) {
                    writeBar6 = null;
                }
                View findViewById = writeBar6.findViewById(R.id.writebar_left_button_container);
                if (findViewById != null) {
                    f4m.j(findViewById);
                }
                WriteBar writeBar7 = oobVar.q;
                if (writeBar7 == null) {
                    writeBar7 = null;
                }
                writeBar7.setDialogId(oobVar.f);
                WriteBar writeBar8 = oobVar.q;
                if (writeBar8 == null) {
                    writeBar8 = null;
                }
                writeBar8.setThemeBinder(kkmVar);
                WriteBar writeBar9 = oobVar.q;
                if (writeBar9 == null) {
                    writeBar9 = null;
                }
                writeBar9.S(oobVar.k, null);
                oobVar.x = (ImAvatarView) ynbVar.findViewById(R.id.im_chat_clips_avatar);
                ViewGroup viewGroup2 = (ViewGroup) ynbVar.findViewById(R.id.im_chat_clips_bottom_sheet_container);
                if (viewGroup2 != null) {
                    WriteBar writeBar10 = oobVar.q;
                    if (writeBar10 == null) {
                        writeBar10 = null;
                    }
                    writeBar10.setBottomSheetContainer(viewGroup2);
                }
                WriteBar writeBar11 = oobVar.q;
                if (writeBar11 == null) {
                    writeBar11 = null;
                }
                writeBar11.setOwnerId(o25.a().c());
                WriteBar writeBar12 = oobVar.q;
                if (writeBar12 == null) {
                    writeBar12 = null;
                }
                writeBar12.setIsSendButtonAlwaysEnabled(false);
                RichEditText richEditText = oobVar.v;
                if (richEditText == null) {
                    richEditText = null;
                }
                richEditText.setImeOptions(268435456);
                oobVar.w = new StickersView(ynbVar.getContext(), (StickersView.c) null, 6);
                oobVar.F();
                oobVar.I();
                p040 p040Var = (p040) oobVar.J.getValue();
                RichEditText richEditText2 = oobVar.v;
                if (richEditText2 == null) {
                    richEditText2 = null;
                }
                p040Var.a(richEditText2);
                RichEditText richEditText3 = oobVar.v;
                if (richEditText3 == null) {
                    richEditText3 = null;
                }
                oobVar.I = richEditText3.getKeyListener();
                RichEditText richEditText4 = oobVar.v;
                if (richEditText4 == null) {
                    richEditText4 = null;
                }
                oobVar.H = richEditText4.getEllipsize();
                oobVar.j = false;
            }
            oob oobVar2 = ynbVar.l;
            if (oobVar2 != null) {
                WriteBar writeBar13 = oobVar2.q;
                if (writeBar13 == null) {
                    writeBar13 = null;
                }
                writeBar13.setEmojiAllowed(false);
                WriteBar writeBar14 = oobVar2.q;
                (writeBar14 != null ? writeBar14 : null).setButtonSendAvailable(false);
            }
            ynbVar.setupWritebarClickListener(i);
            Integer num = imChatClipsInitDecorPayload.d;
            boolean z = imChatClipsInitDecorPayload.f;
            ynbVar.t();
            xn50.a.c(ynbVar, new wmb.b(j, i, num, z));
        }
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s3q0 l(ynb ynbVar, dob.j jVar) {
        View childAt;
        DialogExt dialogExt = jVar.a;
        dob.j.a aVar = jVar.c;
        boolean f = epx.f(aVar, dob.j.a.c.a);
        w0f0 w0f0Var = null;
        int i = J;
        int i2 = 1;
        if (f) {
            Msg msg = jVar.b;
            paw reactionsAnimationCoordinator = ynbVar.getReactionsAnimationCoordinator();
            if (reactionsAnimationCoordinator != null) {
                reactionsAnimationCoordinator.d(dialogExt.e);
            }
            d3m.c(ynbVar.p, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            oob oobVar = ynbVar.l;
            if (oobVar != null) {
                RichEditText richEditText = oobVar.v;
                f4m.r(i, richEditText != null ? richEditText : null);
            }
            FrameLayout frameLayout = ynbVar.p;
            if (frameLayout != null) {
                View childAt2 = frameLayout.getChildAt(0);
                boolean f2 = childAt2 != null ? epx.f(childAt2.getTag(R.id.im_chat_clips_reactions_container), Boolean.TRUE) : false;
                r1f0 reactionsPickerFactory = ynbVar.getReactionsPickerFactory();
                if (reactionsPickerFactory != null) {
                    ChatSettings Bb = dialogExt.Bb();
                    boolean z = Bb != null ? Bb.m : false;
                    l6 l6Var = new l6(3, ynbVar, msg);
                    String j = MessagesSendReactionSourceDto.CLIP_FULLSCREEN.j();
                    no noVar = new no(ynbVar, 15);
                    ImFeatures.IM_CHAT_MODALS_REDESIGN.getClass();
                    reactionsPickerFactory.f(new r1f0.a(frameLayout, z, l6Var, j, msg, noVar, !com.vk.toggle.b.A.a(r5)));
                }
                try {
                    View childAt3 = frameLayout.getChildAt(0);
                    childAt3.setTag(R.id.im_chat_clips_reactions_container, Boolean.TRUE);
                    childAt3.setTranslationX(iah0.a(8));
                    if (!f2 && !ynbVar.z) {
                        d3m.c(childAt3, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    ynbVar.z = false;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable unused) {
                }
            }
        } else if (epx.f(aVar, dob.j.a.C2746a.a)) {
            Msg msg2 = jVar.b;
            d3m.c(ynbVar.p, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            oob oobVar2 = ynbVar.l;
            if (oobVar2 != null) {
                RichEditText richEditText2 = oobVar2.v;
                if (richEditText2 == null) {
                    richEditText2 = null;
                }
                f4m.r(i, richEditText2);
            }
            if (ynbVar.q == null) {
                u0f0 reactionChipsContainerFactory = ynbVar.getReactionChipsContainerFactory();
                if (reactionChipsContainerFactory != null) {
                    w0f0Var = reactionChipsContainerFactory.a(ynbVar.getContext());
                    w0f0Var.setPadding(0, 0, 0, 0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(30));
                    layoutParams.setMarginEnd(iah0.a(8));
                    layoutParams.gravity = 16;
                    w0f0Var.setLayoutParams(layoutParams);
                }
                ynbVar.q = w0f0Var;
            }
            v0f0 v0f0Var = ynbVar.q;
            FrameLayout frameLayout2 = ynbVar.p;
            if (v0f0Var != null && frameLayout2 != null) {
                if (!v0f0Var.isAttachedToWindow()) {
                    if (frameLayout2.getChildCount() != 0) {
                        d3m.e(frameLayout2.getChildAt(0), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new qe9(1, frameLayout2, v0f0Var), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    } else {
                        frameLayout2.removeAllViews();
                        frameLayout2.addView(v0f0Var);
                    }
                    d3m.c(v0f0Var, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                aux0 aux0Var = (aux0) msg2;
                EmptyList emptyList = EmptyList.b;
                ReactionChipStyle reactionChipStyle = ReactionChipStyle.WITHOUT_BUBBLE;
                Dialog Cb = dialogExt.Cb();
                if (Cb == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                v0f0Var.setItems(new v0f0.a(aux0Var, msg2, reactionChipStyle, c4g0.t(Cb.hc()), emptyList, true, true, false, false));
                v0f0Var.setProfiles(dialogExt.b.Ob());
                v0f0Var.a(true, new nz1(2, ynbVar, msg2), new nt(13));
            }
        } else {
            if (!epx.f(aVar, dob.j.a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d3m.e(ynbVar.p, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            oob oobVar3 = ynbVar.l;
            if (oobVar3 != null) {
                int a2 = iah0.a(0);
                RichEditText richEditText3 = oobVar3.v;
                f4m.r(a2, richEditText3 != null ? richEditText3 : null);
            }
            FrameLayout frameLayout3 = ynbVar.p;
            if (frameLayout3 == null || frameLayout3.getChildCount() != 1) {
                FrameLayout frameLayout4 = ynbVar.p;
                if (frameLayout4 != null) {
                    frameLayout4.removeAllViews();
                }
            } else {
                FrameLayout frameLayout5 = ynbVar.p;
                if (frameLayout5 != null && (childAt = frameLayout5.getChildAt(0)) != null) {
                    d3m.e(childAt, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new o63(ynbVar, i2), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
            }
        }
        return s3q0.a;
    }

    public static void m(ynb ynbVar) {
        ynbVar.getShowLinkedMessageAnimator().start();
    }

    public static s3q0 n(ynb ynbVar, dob.c cVar) {
        LinearLayout linearLayout;
        if (ynbVar.k == null) {
            View view = ynbVar.A;
            if (view == null) {
                view = ynbVar.findViewById(R.id.im_chat_clips_recom_root);
                if (view != null) {
                    ynbVar.A = view;
                } else {
                    ViewStub viewStub = (ViewStub) ynbVar.findViewById(R.id.im_chat_clips_fast_rec_recom_stub);
                    if (viewStub == null) {
                        view = null;
                    } else {
                        view = viewStub.inflate();
                        ynbVar.A = view;
                    }
                }
            }
            ynbVar.k = view;
        }
        if (ynbVar.B == null) {
            View view2 = ynbVar.k;
            if (view2 == null || (linearLayout = (LinearLayout) view2.findViewById(R.id.im_chat_clips_recom_button)) == null) {
                linearLayout = null;
            } else if (!ynbVar.F) {
                float dimensionPixelSize = linearLayout.getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_border_radius);
                int m = krv0.m(R.attr.vk_ui_background_secondary_alpha, linearLayout.getContext());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(dimensionPixelSize);
                gradientDrawable.setColor(m);
                gradientDrawable.setStroke(iah0.a(1), 0);
                linearLayout.setBackground(new RippleDrawable(ro.c(m, null), gradientDrawable, new ColorDrawable(-1)));
                linearLayout.setOutlineProvider(new avj(dimensionPixelSize));
                ynbVar.F = true;
            }
            ynbVar.B = linearLayout;
            View view3 = ynbVar.k;
            ynbVar.C = view3 != null ? (ImAvatarView) view3.findViewById(R.id.im_chat_clips_recom_avatar) : null;
            View view4 = ynbVar.k;
            ynbVar.D = view4 != null ? (AppCompatImageView) view4.findViewById(R.id.im_chat_clips_recom_icon) : null;
            View view5 = ynbVar.k;
            ynbVar.E = view5 != null ? (AppCompatTextView) view5.findViewById(R.id.im_chat_clips_recom_title) : null;
        }
        VideoFile videoFile = cVar.b;
        DialogExt dialogExt = cVar.a;
        boolean z = videoFile != null && cVar.c;
        View view6 = ynbVar.k;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (z) {
            if (cVar.d) {
                ImAvatarView imAvatarView = ynbVar.C;
                if (imAvatarView != null) {
                    imAvatarView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = ynbVar.D;
                if (appCompatImageView != null) {
                    appCompatImageView.setImageDrawable(ynbVar.getCheckDrawable());
                }
                AppCompatImageView appCompatImageView2 = ynbVar.D;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                }
                AppCompatTextView appCompatTextView = ynbVar.E;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(R.string.im_chat_clips_recom_reply_btn_sent);
                }
                LinearLayout linearLayout2 = ynbVar.B;
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(null);
                }
            } else {
                AppCompatImageView appCompatImageView3 = ynbVar.D;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setImageDrawable(null);
                }
                AppCompatImageView appCompatImageView4 = ynbVar.D;
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(8);
                }
                ImAvatarView imAvatarView2 = ynbVar.C;
                if (imAvatarView2 != null) {
                    imAvatarView2.setVisibility(0);
                }
                ImAvatarView imAvatarView3 = ynbVar.C;
                if (imAvatarView3 != null) {
                    imAvatarView3.r1(dialogExt.Cb(), dialogExt.b.Ob());
                }
                AppCompatTextView appCompatTextView2 = ynbVar.E;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setText(R.string.im_chat_clips_recom_reply_btn_share);
                }
                LinearLayout linearLayout3 = ynbVar.B;
                if (linearLayout3 != null) {
                    linearLayout3.setOnClickListener(new xnb(0, ynbVar, cVar));
                }
            }
        }
        return s3q0.a;
    }

    public static s3q0 o(ynb ynbVar, dob.f fVar) {
        int i;
        FrameLayout frameLayout;
        sx3 sx3Var = ynbVar.t;
        Handler handler = ynbVar.w;
        if (ynbVar.n == null) {
            LinkedMessageView linkedMessageView = new LinkedMessageView(ynbVar.getContext(), null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int a2 = iah0.a(12);
            layoutParams.setMargins(a2, a2, a2, a2);
            linkedMessageView.setLayoutParams(layoutParams);
            ynbVar.n = linkedMessageView;
        }
        String str = fVar.b;
        DialogExt dialogExt = fVar.d;
        boolean z = str != null;
        oob oobVar = ynbVar.l;
        if (oobVar != null) {
            if (z) {
                ImAvatarView imAvatarView = oobVar.x;
                if (imAvatarView == null) {
                    imAvatarView = null;
                }
                Drawable drawable = (Drawable) oobVar.F.getValue();
                imAvatarView.y = iah0.a(7);
                imAvatarView.x = drawable;
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                imAvatarView.invalidate();
            } else {
                ImAvatarView imAvatarView2 = oobVar.x;
                if (imAvatarView2 == null) {
                    imAvatarView2 = null;
                }
                ImAvatarView.x1(imAvatarView2, null);
            }
        }
        oob oobVar2 = ynbVar.l;
        if (oobVar2 != null) {
            Dialog Cb = dialogExt.Cb();
            ImAvatarView imAvatarView3 = oobVar2.x;
            if (imAvatarView3 == null) {
                imAvatarView3 = null;
            }
            if (Cb == null || !z) {
                imAvatarView3.setImportantForAccessibility(2);
                imAvatarView3.setContentDescription("");
            } else {
                imAvatarView3.setImportantForAccessibility(1);
                imAvatarView3.setContentDescription(imAvatarView3.getContext().getString(Cb.t1() ? R.string.im_chat_clips_writebar_user_avatar_accessibility : Cb.Va() ? R.string.im_chat_clips_writebar_group_avatar_accessibility : R.string.im_chat_clips_writebar_chat_avatar_accessibility));
            }
        }
        View view = ynbVar.m;
        if (view == null || !view.isAttachedToWindow()) {
            DisplayNameFormatter displayNameFormatter = ynbVar.getDisplayNameFormatter();
            qtd0 qtd0Var = fVar.c;
            displayNameFormatter.getClass();
            String e = displayNameFormatter.e(qtd0Var, UserNameCase.NOM);
            LinkedMessageView linkedMessageView2 = ynbVar.n;
            if (linkedMessageView2 != null) {
                linkedMessageView2.setOnClickListener(new wnb(0, ynbVar, fVar));
            }
            LinkedMessageView linkedMessageView3 = ynbVar.n;
            if (linkedMessageView3 != null) {
                linkedMessageView3.setOnSpanClickListener(new sxv(dialogExt, g2v.c(), ynbVar.getContext()));
            }
            if (str == null) {
                a linkedMsgState = ynbVar.getLinkedMsgState();
                if (linkedMsgState != null && (i = b.$EnumSwitchMapping$0[linkedMsgState.ordinal()]) != 1) {
                    if (i == 2) {
                        ynbVar.getShowLinkedMessageAnimator().pause();
                        float animatedFraction = ynbVar.getShowLinkedMessageAnimator().getAnimatedFraction();
                        ynbVar.r();
                        ynbVar.q();
                        ynbVar.getHideLinkedMessageAnimator().setCurrentFraction(1 - animatedFraction);
                        ynbVar.getHideLinkedMessageAnimator().start();
                    } else if (i == 3) {
                        handler.removeCallbacks(sx3Var);
                        ynbVar.q();
                        ynbVar.getHideLinkedMessageAnimator().start();
                    } else if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                oob oobVar3 = ynbVar.l;
                if (oobVar3 != null) {
                    ImAvatarView imAvatarView4 = oobVar3.x;
                    if (imAvatarView4 == null) {
                        imAvatarView4 = null;
                    }
                    jjc.f(null, imAvatarView4);
                }
            } else {
                LinkedMessageView linkedMessageView4 = ynbVar.n;
                if (linkedMessageView4 != null) {
                    linkedMessageView4.setUserName(e);
                }
                LinkedMessageView linkedMessageView5 = ynbVar.n;
                if (linkedMessageView5 != null) {
                    linkedMessageView5.setBody(ynbVar.getMsgTextBuilder().c(str, false, false, false));
                }
                n52 n52Var = ynbVar.s;
                a linkedMsgState2 = ynbVar.getLinkedMsgState();
                if (linkedMsgState2 != null) {
                    int i2 = b.$EnumSwitchMapping$0[linkedMsgState2.ordinal()];
                    if (i2 == 1) {
                        handler.removeCallbacks(n52Var);
                        FrameLayout frameLayout2 = ynbVar.o;
                        if (frameLayout2 != null) {
                            frameLayout2.removeAllViews();
                        }
                        ynbVar.r();
                        ynbVar.getShowLinkedMessageAnimator().addListener(new znb(ynbVar));
                        handler.postDelayed(n52Var, 500L);
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            handler.removeCallbacks(sx3Var);
                            handler.postDelayed(sx3Var, 1500L);
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ynbVar.getHideLinkedMessageAnimator().pause();
                            float animatedFraction2 = ynbVar.getHideLinkedMessageAnimator().getAnimatedFraction();
                            ynbVar.q();
                            ynbVar.r();
                            ynbVar.getShowLinkedMessageAnimator().setCurrentFraction(1 - animatedFraction2);
                            ynbVar.getShowLinkedMessageAnimator().start();
                        }
                    }
                }
                oob oobVar4 = ynbVar.l;
                if (oobVar4 != null) {
                    dh0 dh0Var = new dh0(1, ynbVar, fVar);
                    ImAvatarView imAvatarView5 = oobVar4.x;
                    jjc.f(dh0Var, imAvatarView5 != null ? imAvatarView5 : null);
                }
            }
        } else {
            LinkedMessageView linkedMessageView6 = ynbVar.n;
            if (linkedMessageView6 != null && (frameLayout = ynbVar.o) != null) {
                frameLayout.removeView(linkedMessageView6);
            }
        }
        return s3q0.a;
    }

    public static RecyclerView p(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof RecyclerView) {
                return (RecyclerView) viewGroup.getChildAt(i);
            }
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                return p((ViewGroup) viewGroup.getChildAt(i));
            }
        }
        return null;
    }

    public static void s(LinkedMessageView linkedMessageView, float f) {
        linkedMessageView.setAlpha(f);
        linkedMessageView.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        linkedMessageView.setPivotY(linkedMessageView.getMeasuredHeight());
        linkedMessageView.setTranslationY((1 - f) * linkedMessageView.getMeasuredHeight() * 0.5f);
        linkedMessageView.setScaleX(f);
        linkedMessageView.setScaleY(f);
    }

    private final void setupWritebarClickListener(final int i) {
        View view = this.r;
        if (view != null) {
            bwt0.i0(view, new izs() { // from class: xsna.tnb
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    wmb.l lVar = new wmb.l(i);
                    ynb ynbVar = ynb.this;
                    ynbVar.getClass();
                    xn50.a.c(ynbVar, lVar);
                    return s3q0.a;
                }
            });
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.im_chat_clips_bottom_bar_decoration_view);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        dob dobVar = (dob) ao50Var;
        this.j = (FrameLayout) findViewById(R.id.im_chat_clips_main_container);
        this.o = (FrameLayout) findViewById(R.id.im_chat_clips_exterior_container);
        this.p = (FrameLayout) findViewById(R.id.im_chat_clips_reactions_container);
        this.r = findViewById(R.id.im_chat_clips_writebar_clickable_area);
        findViewById(R.id.im_chat_clips_touch_area_above_writebar).setOnTouchListener(new pnb(this, 0));
        gm50.a.b(this, dobVar.b, new wl0(this, 13));
        gm50.a.b(this, dobVar.c, new op1(this, 19));
    }

    @Override // com.vk.mvi.MviViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ymb) vk50Var).g.a(new com.vk.movika.sdk.base.hooks.p(this, 26), getViewOwner());
        getViewOwner().getLifecycle().addObserver(new bob(this));
        this.H.b(e4g0.a.subscribe(new da(new r6(this, 16), 8)));
    }

    @Override // xsna.d6e
    public final void d(ClipsFeedDecorationPayload clipsFeedDecorationPayload) {
        if (clipsFeedDecorationPayload instanceof ImChatClipsInitDecorPayload) {
            ImChatClipsInitDecorPayload imChatClipsInitDecorPayload = (ImChatClipsInitDecorPayload) clipsFeedDecorationPayload;
            e4g0.b = null;
            long j = imChatClipsInitDecorPayload.e;
            int i = imChatClipsInitDecorPayload.b;
            boolean z = imChatClipsInitDecorPayload.f;
            if (z || this.l != null) {
                oob oobVar = this.l;
                if (oobVar == null || !oobVar.j) {
                    Integer num = imChatClipsInitDecorPayload.d;
                    t();
                    xn50.a.c(this, new wmb.b(j, i, num, z));
                    return;
                }
                return;
            }
            bpn0 bpn0Var = uob.a;
            oob a2 = uob.a((FragmentImpl) ((Fragment) this.i.c), j);
            this.l = a2;
            a2.j = true;
            io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new qnb(this, 0));
            asu0 asu0Var = asu0.a;
            this.I = io.reactivex.rxjava3.subjects.c.b(asu0Var, vVar).m(asu0Var.d()).subscribe(new l50(new rnb(this, i, j, imChatClipsInitDecorPayload), 8), new tp0(new zx0(this, 18), 6));
            return;
        }
        if (clipsFeedDecorationPayload instanceof ImChatClipsPaginationDecorPayload) {
            ImChatClipsPaginationDecorPayload imChatClipsPaginationDecorPayload = (ImChatClipsPaginationDecorPayload) clipsFeedDecorationPayload;
            e4g0.b = null;
            t();
            xn50.a.c(this, new wmb.c(imChatClipsPaginationDecorPayload.b, imChatClipsPaginationDecorPayload.d, imChatClipsPaginationDecorPayload.e));
            return;
        }
        if (clipsFeedDecorationPayload instanceof RecommendationDecorationPayload) {
            e4g0.b = null;
            d3m.e(this.j, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            d3m.c(this.k, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            xn50.a.c(this, wmb.g.b);
            xn50.a.c(this, new wmb.a(this.f.f(((RecommendationDecorationPayload) clipsFeedDecorationPayload).b)));
            return;
        }
        View view = this.r;
        if (view != null) {
            view.setOnClickListener(null);
        }
        LinkedMessageView linkedMessageView = this.n;
        if (linkedMessageView != null) {
            linkedMessageView.setOnClickListener(null);
        }
        LinkedMessageView linkedMessageView2 = this.n;
        if (linkedMessageView2 != null) {
            linkedMessageView2.setOnSpanClickListener(null);
        }
        oob oobVar2 = this.l;
        if (oobVar2 != null) {
            ImAvatarView imAvatarView = oobVar2.x;
            if (imAvatarView == null) {
                imAvatarView = null;
            }
            jjc.f(null, imAvatarView);
        }
        d3m.e(this, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new q44(this, 2), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        xn50.a.c(this, wmb.g.b);
    }

    @Override // com.vk.mvi.MviViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = e4g0.a;
        e4g0.b = null;
        this.j = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.k = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.H.e();
    }

    public final void q() {
        getHideLinkedMessageAnimator().removeAllListeners();
        getHideLinkedMessageAnimator().cancel();
        getHideLinkedMessageAnimator().addListener(new c());
    }

    public final void r() {
        getShowLinkedMessageAnimator().removeAllListeners();
        getShowLinkedMessageAnimator().cancel();
        getShowLinkedMessageAnimator().addListener(new d());
    }

    public final void t() {
        d3m.e(this.k, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        d3m.c(this.j, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new ymb(this.f);
    }

    @Override // xsna.d6e
    public View getView() {
        return this;
    }

    /* compiled from: Animator.kt */
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            FrameLayout frameLayout;
            ynb ynbVar = ynb.this;
            LinkedMessageView linkedMessageView = ynbVar.n;
            if (linkedMessageView == null || (frameLayout = ynbVar.o) == null) {
                return;
            }
            frameLayout.removeView(linkedMessageView);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ynb ynbVar = ynb.this;
            ynbVar.q();
            ynbVar.w.postDelayed(ynbVar.t, 1500L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
