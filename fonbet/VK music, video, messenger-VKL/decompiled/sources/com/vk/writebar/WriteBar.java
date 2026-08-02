package com.vk.writebar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.Document;
import com.vk.audio.AudioMsgTrackByRecord;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.Poll;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.di.DialogDraftUpdaterComponent;
import com.vk.im.ui.views.ReplyView;
import com.vk.im.ui.views.RichEditText;
import com.vk.im.ui.views.StencilLayout;
import com.vk.log.L;
import com.vk.pending.PendingAudioMessageAttachment;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingStoryAttachment;
import com.vk.permission.PermissionHelper;
import com.vk.photogallery.LocalMediaGalleryProvider;
import com.vk.richcontent.api.MimeType;
import com.vk.stickers.ContextUser;
import com.vk.stickers.autosuggest.QuickStickerSuggestState;
import com.vk.stickers.keyboard.StickersView;
import com.vk.toggle.features.ImFeatures;
import com.vk.writebar.WriteBar;
import com.vk.writebar.WriteBarPermissionsHolder;
import com.vk.writebar.a;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vk.writebar.b;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioMessageAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a24;
import xsna.abg0;
import xsna.acp0;
import xsna.ajd0;
import xsna.am;
import xsna.an10;
import xsna.anj;
import xsna.asp;
import xsna.asu0;
import xsna.awt0;
import xsna.b0y0;
import xsna.b2y0;
import xsna.bay;
import xsna.bbr;
import xsna.bpn0;
import xsna.bq80;
import xsna.bwt0;
import xsna.c1y0;
import xsna.c5g;
import xsna.c9m0;
import xsna.cbt0;
import xsna.cck0;
import xsna.cfz;
import xsna.cis0;
import xsna.clt0;
import xsna.cra;
import xsna.crx0;
import xsna.d1y0;
import xsna.d8k;
import xsna.dag0;
import xsna.dbj0;
import xsna.dck0;
import xsna.dhr0;
import xsna.e1s0;
import xsna.e1y0;
import xsna.e3m;
import xsna.e43;
import xsna.em6;
import xsna.epx;
import xsna.f1y0;
import xsna.f4m;
import xsna.f6b;
import xsna.fpf0;
import xsna.fs2;
import xsna.fy4;
import xsna.g0y0;
import xsna.g1y0;
import xsna.g2v;
import xsna.g8n0;
import xsna.ghn0;
import xsna.gsq0;
import xsna.gxw0;
import xsna.gyo0;
import xsna.gzs;
import xsna.h0y0;
import xsna.h1y0;
import xsna.h4l0;
import xsna.hf8;
import xsna.hg1;
import xsna.hlq;
import xsna.i0y0;
import xsna.iah0;
import xsna.icq0;
import xsna.icq0.a;
import xsna.ify;
import xsna.itz0;
import xsna.iut0;
import xsna.ivs0;
import xsna.izs;
import xsna.j6r0;
import xsna.jan0;
import xsna.jds0;
import xsna.jzb0;
import xsna.k0y0;
import xsna.k6n0;
import xsna.k7m;
import xsna.kcl0;
import xsna.kkm;
import xsna.kv2;
import xsna.kyq0;
import xsna.l7s;
import xsna.lk5;
import xsna.lse;
import xsna.m0y0;
import xsna.m7m;
import xsna.mhy;
import xsna.mlf0;
import xsna.msy;
import xsna.ner0;
import xsna.nzs0;
import xsna.o25;
import xsna.o34;
import xsna.o84;
import xsna.ojf0;
import xsna.p0y0;
import xsna.p34;
import xsna.pc;
import xsna.pnr0;
import xsna.po40;
import xsna.ptl0;
import xsna.pvh0;
import xsna.q1p;
import xsna.q1y0;
import xsna.q86;
import xsna.qkt0;
import xsna.qq2;
import xsna.r0y0;
import xsna.r1d;
import xsna.r1y0;
import xsna.rme0;
import xsna.rmu0;
import xsna.rno0;
import xsna.s0y0;
import xsna.s1y0;
import xsna.s3q0;
import xsna.swe0;
import xsna.sxq0;
import xsna.t0y0;
import xsna.t1y0;
import xsna.tb0;
import xsna.tn9;
import xsna.too0;
import xsna.u1u0;
import xsna.ual;
import xsna.ucp;
import xsna.ujm0;
import xsna.vgs0;
import xsna.vhk0;
import xsna.vpj0;
import xsna.vpn0;
import xsna.vq4;
import xsna.vqe0;
import xsna.w1y0;
import xsna.w29;
import xsna.wjg0;
import xsna.wzs;
import xsna.x3x0;
import xsna.x7t0;
import xsna.x9x0;
import xsna.xgy;
import xsna.xi2;
import xsna.xo2;
import xsna.xq4;
import xsna.xqc;
import xsna.xvg0;
import xsna.y0y0;
import xsna.y1y0;
import xsna.z0y0;
import xsna.z1y0;
import xsna.z4t0;
import xsna.zgv0;
import xsna.zm;
import xsna.zrp;

/* compiled from: WriteBar.kt */
/* loaded from: classes7.dex */
public final class WriteBar extends LinearLayout implements xgy.b, too0, g1y0, tb0 {
    public static final int h0 = iah0.a(110);
    public static final int i0 = iah0.a(48);
    public final q1y0 A;
    public final g B;
    public final com.vk.writebar.c C;
    public final y0y0 D;
    public final y1y0 E;
    public c1y0 F;
    public int G;
    public final c H;
    public s1y0 I;
    public r1y0 J;
    public e1y0 K;
    public t1y0 L;
    public d1y0 M;
    public wzs<? super Integer, ? super Integer, s3q0> N;
    public k0y0 O;
    public final ArrayList P;
    public final h Q;
    public final h R;
    public final h S;
    public final h T;
    public final h U;
    public final h V;
    public final h W;
    public final h a0;
    public final Object b;
    public final h b0;
    public final Object c;
    public final h c0;
    public final Object d;
    public final h d0;
    public final Object e;
    public final h e0;
    public final Object f;
    public final h f0;
    public final Object g;
    public final h g0;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public boolean v;
    public ObjectAnimator w;
    public final h x;
    public final WriteBarPermissionsHolder y;
    public final b2y0 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WriteBar.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source COMMUNITY_CHANNEL;
        public static final Source DIALOG;
        public static final Source ME_CHANNEL;

        static {
            Source source = new Source("DIALOG", 0);
            DIALOG = source;
            Source source2 = new Source("ME_CHANNEL", 1);
            ME_CHANNEL = source2;
            Source source3 = new Source("COMMUNITY_CHANNEL", 2);
            COMMUNITY_CHANNEL = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: WriteBar.kt */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            WriteBar writeBar = WriteBar.this;
            ViewParent parent = writeBar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return true;
            }
            writeBar.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            return true;
        }
    }

    /* compiled from: WriteBar.kt */
    public static final class b extends rno0 {
        public b() {
        }

        @Override // xsna.rno0, android.text.TextWatcher
        public final void afterTextChanged(final Editable editable) {
            int i = WriteBar.h0;
            Arrays.stream(editable.getSpans(0, editable.length(), Object.class)).filter(new g0y0(0)).filter(new h0y0(0)).filter(new i0y0(0)).forEach(new Consumer() { // from class: xsna.j0y0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = WriteBar.h0;
                    editable.removeSpan(obj);
                }
            });
            ucp ucpVar = ucp.a;
            ucp.i(editable);
            WriteBar writeBar = WriteBar.this;
            writeBar.I();
            writeBar.J(true);
            writeBar.postDelayed(new fy4(writeBar, 2), 0L);
            e1y0 writeBarInputListener = writeBar.getWriteBarInputListener();
            if (writeBarInputListener != null) {
                writeBarInputListener.e(editable);
            }
            writeBar.D.c("editing");
        }
    }

    /* compiled from: WriteBar.kt */
    public final class c implements View.OnLayoutChangeListener {
        public boolean b = true;
        public boolean c;

        /* compiled from: WriteBar.kt */
        public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
            public final /* synthetic */ WriteBar b;
            public final /* synthetic */ c c;

            public a(WriteBar writeBar, c cVar) {
                this.b = writeBar;
                this.c = cVar;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                WriteBar writeBar = this.b;
                writeBar.getWriteRecordTip().getViewTreeObserver().removeGlobalOnLayoutListener(this);
                int dimensionPixelSize = writeBar.getResources().getDimensionPixelSize(R.dimen.voice_rec_tip_left_padding_min);
                int dimensionPixelSize2 = writeBar.getResources().getDimensionPixelSize(R.dimen.voice_rec_tip_left_padding_max);
                int dimensionPixelSize3 = writeBar.getResources().getDimensionPixelSize(R.dimen.voice_rec_tip_right_padding);
                int width = writeBar.getWriteRecordTip().getWidth();
                int width2 = writeBar.getWidth();
                c cVar = this.c;
                if (width >= width2) {
                    cVar.b = false;
                    writeBar.getWriteRecordTip().setPadding(dimensionPixelSize, 0, dimensionPixelSize3, 0);
                } else if (!cVar.b) {
                    cVar.b = true;
                    int width3 = writeBar.getWidth() - writeBar.getWriteRecordTip().getWidth();
                    if (width3 < dimensionPixelSize2) {
                        dimensionPixelSize2 = width3;
                    }
                    writeBar.getWriteRecordTip().setPadding(dimensionPixelSize2, 0, dimensionPixelSize3, 0);
                }
                if (cVar.c) {
                    y1y0 y1y0Var = writeBar.E;
                    int width4 = writeBar.getWidth();
                    ViewGroup viewGroup = y1y0Var.i;
                    ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
                    if (layoutParams != null) {
                        layoutParams.width = width4;
                    }
                    y1y0Var.a().j();
                }
            }
        }

        public c() {
        }

        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            WriteBar writeBar = WriteBar.this;
            ((b.a) writeBar.B.p.getValue()).getClass();
            writeBar.getWriteRecordTip().getViewTreeObserver().addOnGlobalLayoutListener(new a(writeBar, this));
            com.vk.writebar.c cVar = writeBar.C;
            if (!cVar.h.isInitialized() || cVar.c().c.isEmpty() || cVar.c().e) {
                return;
            }
            if (cVar.a.getResources().getConfiguration().orientation == 2) {
                cVar.g(i2 >= 0);
            } else {
                cVar.g(true);
            }
        }
    }

    /* compiled from: View.kt */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = WriteBar.h0;
            WriteBar.this.P(false);
        }
    }

    /* compiled from: WriteBar.kt */
    public static final class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            WriteBar writeBar = WriteBar.this;
            writeBar.getBotKeyboardButton().animate().setListener(null);
            writeBar.getBotKeyboardButton().setVisibility(8);
        }
    }

    /* compiled from: View.kt */
    public static final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = WriteBar.h0;
            WriteBar.this.P(true);
        }
    }

    public WriteBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void A(ImageView imageView, boolean z, boolean z2) {
        int i = z ? 0 : 4;
        if (imageView.getVisibility() != i || j6r0.a.containsKey(new View[]{imageView}[0])) {
            if (z2) {
                j6r0.d(imageView, i, true, 150, null);
                return;
            }
            j6r0.a(imageView);
            if (i != 0) {
                imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setVisibility(i);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            imageView.setVisibility(0);
            imageView.setEnabled(true);
        }
    }

    public static void a(WriteBar writeBar) {
        RichEditText writeBarEdit = writeBar.getWriteBarEdit();
        Editable text = writeBar.getWriteBarEdit().getText();
        writeBarEdit.setSelection(text != null ? text.length() : 0);
    }

    private final boolean getAreSettingsAvailable() {
        return this.R.m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getAttachDivider() {
        return (View) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView getBotKeyboardButton() {
        return (ImageView) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView getButtonFullscreen() {
        return (ImageView) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getButtonRecordAudio() {
        return (ImageView) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getButtonRecordVideo() {
        return (ImageView) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getButtonSend() {
        return (ImageView) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getButtonSettings() {
        return (ImageView) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getButtonTemplates() {
        return (ImageView) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkAvatar getChannelAvatar() {
        return (VkAvatar) this.o.getValue();
    }

    private final int getCollapsedHeight() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (!getInputState().b.isEmpty()) {
            paddingBottom += an10.b(iah0.b(91.5f));
        }
        if (this.A.g != null) {
            paddingBottom += iah0.a(56);
        }
        RichEditText writeBarEdit = getWriteBarEdit();
        return swe0.g(writeBarEdit.getPaddingBottom() + writeBarEdit.getPaddingTop() + (writeBarEdit.getLineCount() * writeBarEdit.getLineHeight()), i0, h0) + paddingBottom;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getDividerTopWritebar() {
        return (View) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getGroupMessengerEnabled() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getLeftButtonContainer() {
        return (FrameLayout) this.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getWriteBarActionContainer() {
        return (FrameLayout) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getWriteBarAttach() {
        return (View) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getWriteBarAttachNewDot() {
        return (View) this.p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RichEditText getWriteBarEdit() {
        return (RichEditText) this.m.getValue();
    }

    private final int getWriteBarEditWidth() {
        return getWriteBarEdit().getWidth() - (getWriteBarEdit().getCompoundPaddingRight() + getWriteBarEdit().getCompoundPaddingLeft());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final NestedScrollView getWriteBarFullscreenScrollContainer() {
        return (NestedScrollView) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup getWriteContainer() {
        return (ViewGroup) this.q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getWriteRecordTip() {
        return (View) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup getWriteTextArea() {
        return (ViewGroup) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.k0y0] */
    public static s3q0 h(final WriteBar writeBar) {
        com.vk.writebar.c cVar = writeBar.C;
        if (!writeBar.getState().n) {
            writeBar.getState().n = true;
            writeBar.getWriteBarEdit().setMaxHeight(Integer.MAX_VALUE);
            f4m.r(0, writeBar.getWriteTextArea());
            float f2 = 16;
            f4m.x(iah0.a(f2), writeBar.getWriteBarEdit());
            f4m.w(iah0.a(f2), writeBar.getWriteBarEdit());
            f4m.s(0, writeBar.getWriteBarEdit());
            f4m.j(writeBar.getLeftButtonContainer());
            if (writeBar.getAreSettingsAvailable()) {
                f4m.j(writeBar.getButtonSettings());
            }
            f4m.j(writeBar.getButtonFullscreen());
            f4m.j(writeBar.getWriteBarActionContainer());
            if (writeBar.getContext() instanceof l7s) {
                cVar.c().setBackgroundColor(e3m.f(R.attr.vk_ui_background_modal, writeBar.getContext()));
            } else {
                bwt0.Z(R.attr.vk_ui_background_modal, cVar.c());
            }
            cVar.c().setTranslationZ(1.0f);
            writeBar.z(writeBar.G, true);
            writeBar.O = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.k0y0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    WriteBar.setupCursorHandlerOnLayoutChange$lambda$54(WriteBar.this);
                }
            };
            writeBar.getWriteBarEdit().getViewTreeObserver().addOnGlobalLayoutListener(writeBar.O);
        }
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    public static s3q0 j(boolean z, WriteBar writeBar) {
        if (z) {
            d1y0 d1y0Var = writeBar.M;
            if (d1y0Var != null) {
                d1y0Var.h();
            }
            c1y0 c1y0Var = writeBar.F;
            if (c1y0Var != null) {
                ((View) c1y0Var.g.getValue()).setVisibility(0);
                c1y0Var.c();
                WriteBarButtonsBubbleView b2 = c1y0Var.b();
                b2.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withStartAction(new xqc(b2, 15)).start();
            }
            bwt0.c0(-1, writeBar);
            writeBar.requestLayout();
            writeBar.postDelayed(new m0y0(writeBar), 200L);
            writeBar.I();
            writeBar.J(true);
        } else {
            com.vk.writebar.c cVar = writeBar.C;
            writeBar.getWriteBarEdit().setMaxHeight(h0);
            f4m.r(iah0.a(48), writeBar.getWriteTextArea());
            f4m.x(0, writeBar.getWriteBarEdit());
            f4m.w(0, writeBar.getWriteBarEdit());
            f4m.s(iah0.a(1), writeBar.getWriteBarEdit());
            writeBar.getLeftButtonContainer().setVisibility(0);
            if (writeBar.getAreSettingsAvailable()) {
                writeBar.getButtonSettings().setVisibility(0);
            }
            if (writeBar.S.p) {
                writeBar.getWriteBarActionContainer().setVisibility(0);
            }
            cVar.c().setBackground(null);
            cVar.c().setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            bwt0.c0(-2, writeBar);
            writeBar.requestLayout();
            writeBar.getWriteBarEdit().post(new w29(writeBar, 16));
            writeBar.I();
            writeBar.J(true);
        }
        return s3q0.a;
    }

    public static void k(WriteBar writeBar) {
        int writeBarEditWidth = writeBar.getWriteBarEditWidth();
        TextPaint paint = writeBar.getWriteBarEdit().getPaint();
        String valueOf = String.valueOf(writeBar.getWriteBarEdit().getText());
        boolean z = false;
        int lineCount = StaticLayout.Builder.obtain(valueOf, 0, valueOf.length(), paint, writeBarEditWidth).build().getLineCount();
        if (writeBar.U.l && lineCount >= 3 && !writeBar.e0.n) {
            z = true;
        }
        awt0.v(writeBar.getButtonFullscreen(), z);
    }

    public static void m(WriteBar writeBar) {
        writeBar.setTimeProgress(0);
        writeBar.getWriteBarEdit().requestFocus();
    }

    public static void o(WriteBar writeBar) {
        writeBar.setTimeProgress(0);
        writeBar.getWriteBarEdit().requestFocus();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static void p(WriteBar writeBar, MotionEvent motionEvent) {
        if (!writeBar.e0.n) {
            writeBar.getWriteBarEdit().dispatchTouchEvent(motionEvent);
            return;
        }
        c1y0 c1y0Var = writeBar.F;
        if (c1y0Var != null) {
            ?? r0 = c1y0Var.e;
            int action = motionEvent.getAction();
            if (action == 0) {
                c1y0Var.c = motionEvent.getY();
                return;
            }
            if (action != 1) {
                if (action == 2) {
                    float abs = Math.abs(motionEvent.getY() - c1y0Var.c);
                    if (c1y0Var.d || abs < c1y0.n) {
                        return;
                    }
                    if (r0.isInitialized()) {
                        WriteBarButtonsBubbleView b2 = c1y0Var.b();
                        b2.animate().translationY(b2.getHeight()).setDuration(200L).withEndAction(new tn9(b2, 25)).start();
                    }
                    c1y0Var.d = true;
                    return;
                }
                if (action != 3) {
                    return;
                }
            }
            if (c1y0Var.d) {
                if (r0.isInitialized()) {
                    WriteBarButtonsBubbleView b3 = c1y0Var.b();
                    b3.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withStartAction(new xqc(b3, 15)).start();
                }
                c1y0Var.d = false;
            }
        }
    }

    private final void setAreSettingsAvailable(boolean z) {
        this.R.m = z;
    }

    private final void setFullscreenModeAvailable(boolean z) {
        this.U.l = z;
    }

    private final void setSendButtonAvailable(boolean z) {
        this.S.p = z;
    }

    private final void setTemplatesButtonAvailable(boolean z) {
        this.T.q = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCursorHandlerOnLayoutChange$lambda$54(WriteBar writeBar) {
        if (writeBar.e0.n) {
            writeBar.P(true);
        }
    }

    public final void A1(Attachment attachment) {
        this.C.a(attachment);
    }

    public final void B() {
        getWriteBarEdit().requestFocus();
        getWriteBarEdit().setSelection(getText().length());
        mhy.j(getWriteBarEdit());
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void C() {
        g gVar = this.B;
        if (gVar.b().t != null) {
            xq4 b2 = gVar.b();
            b2.e.i(new vq4(b2, 1, null));
            gVar.h(0);
        } else {
            xq4 b3 = gVar.b();
            b3.e.i(b3.i);
            getWriteRecordTip().setVisibility(8);
            bay.c().e();
            j6r0.c(0, getButtonRecordAudio());
            j6r0.c(0, getButtonRecordVideo());
            j6r0.c(0, getWriteTextArea());
            if (gVar.h.isInitialized()) {
                j6r0.c(4, gVar.f());
                com.vk.writebar.b bVar = gVar.n;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.getClass();
            }
            postDelayed(new fs2(this, 20), 300L);
            getWriteBarEdit().setKeepFocus(false);
            AudioMsgTrackByRecord audioMsgTrackByRecord = (AudioMsgTrackByRecord) gVar.b().c.get(Long.valueOf(getState().a));
            PendingAudioMessageAttachment pendingAudioMessageAttachment = audioMsgTrackByRecord != null ? new PendingAudioMessageAttachment(audioMsgTrackByRecord) : null;
            if (pendingAudioMessageAttachment != null && com.vk.core.files.a.x(pendingAudioMessageAttachment.g)) {
                vhk0.c(pendingAudioMessageAttachment.g);
            }
            F();
        }
        com.vk.writebar.c cVar = this.C;
        if (cVar.h.isInitialized()) {
            AttachmentsEditorView c2 = cVar.c();
            c2.e = false;
            c2.b.removeAllViews();
            c2.c.clear();
            AttachmentsEditorView.j jVar = c2.d;
            if (jVar != null) {
                jVar.b(null);
            }
        }
    }

    @Override // xsna.xgy.b
    public final void D() {
        y1y0 y1y0Var = this.E;
        y1y0Var.e();
        y1y0Var.a().g();
    }

    @Override // xsna.xgy.b
    public final void E(boolean z, xgy xgyVar) {
        boolean z2 = z && getShowKeyboardIcon();
        y1y0 y1y0Var = this.E;
        b2y0 b2y0Var = y1y0Var.c;
        if (z2) {
            b2y0Var.c(R.id.writebar_emoji, R.attr.im_ic_keyboard, R.attr.vk_ui_icon_secondary);
            y1y0Var.b().setVisibility(8);
            y1y0Var.c().setVisibility(8);
            y1y0Var.u = false;
        } else {
            b2y0Var.d(R.attr.vk_ui_icon_accent);
            y1y0Var.b().setVisibility(8);
            y1y0Var.c().setVisibility(8);
            y1y0Var.u = false;
        }
        y1y0Var.q.getClass();
        y1y0Var.d();
        z1y0 z1y0Var = y1y0Var.d;
        if (z1y0Var != null) {
            z1y0Var.g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void F() {
        com.vk.writebar.c cVar = this.C;
        g gVar = cVar.c;
        long j = cVar.b.getState().a;
        if (cVar.h.isInitialized()) {
            Iterator<Attachment> it = cVar.c().c.iterator();
            while (it.hasNext()) {
                Attachment next = it.next();
                if ((next instanceof PendingAudioMessageAttachment) || (next instanceof AudioMessageAttachment)) {
                    break;
                }
            }
        }
        gVar.b().c.remove(Long.valueOf(j));
        xq4 b2 = gVar.b();
        b2.e.i(b2.i);
        icq0 icq0Var = cVar.w;
        if (icq0Var == null) {
            icq0Var = null;
        }
        HashMap hashMap = icq0Var.b;
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            ((wjg0.a) it2.next()).a();
        }
        hashMap.clear();
        if (cVar.h.isInitialized()) {
            AttachmentsEditorView c2 = cVar.c();
            c2.e = false;
            c2.b.removeAllViews();
            c2.c.clear();
            AttachmentsEditorView.j jVar = c2.d;
            if (jVar != null) {
                jVar.b(null);
            }
        }
        cVar.g(false);
        cVar.f();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void G() {
        if (this.B.f) {
            l0();
            return;
        }
        R();
        com.vk.writebar.c cVar = this.C;
        if (cVar.h.isInitialized()) {
            AttachmentsEditorView c2 = cVar.c();
            c2.e = false;
            c2.b.removeAllViews();
            c2.c.clear();
            AttachmentsEditorView.j jVar = c2.d;
            if (jVar != null) {
                jVar.b(null);
            }
        }
    }

    public final void I() {
        getButtonRecordVideo().setVisibility(this.y.a.contains(WriteBarPermissionsHolder.Permission.VIDEO_MSG) && getInputState().a() && !getState().n ? 0 : 8);
    }

    public final void J(boolean z) {
        if (this.B.e) {
            return;
        }
        if (this.D.k != null) {
            crx0.f(getButtonSend(), 4);
            crx0.f(getButtonRecordAudio(), 4);
            crx0.f(getButtonRecordVideo(), 8);
            return;
        }
        WriteBarPermissionsHolder.Permission permission = WriteBarPermissionsHolder.Permission.AUDIO_MSG;
        WriteBarPermissionsHolder writeBarPermissionsHolder = this.y;
        HashSet<WriteBarPermissionsHolder.Permission> hashSet = writeBarPermissionsHolder.a;
        HashSet<WriteBarPermissionsHolder.Permission> hashSet2 = writeBarPermissionsHolder.a;
        boolean contains = hashSet.contains(permission);
        boolean contains2 = hashSet2.contains(WriteBarPermissionsHolder.Permission.VIDEO_MSG);
        boolean z2 = (getInputState().a() && (contains || contains2)) ? false : true;
        if (z2) {
            getButtonRecordVideo().setVisibility(8);
        } else if (contains2 && !getState().n) {
            getButtonRecordVideo().setVisibility(0);
        }
        boolean z3 = hashSet2.contains(permission) && this.v;
        boolean z4 = getState().n;
        boolean z5 = !z4 && (z2 || z3);
        int a2 = iah0.a(z5 ? 48 : 4);
        boolean z6 = !z4 && z2;
        boolean z7 = (z4 || z2 || !z3) ? false : true;
        bwt0.p0(getWriteBarActionContainer(), z5);
        f4m.r(a2, getWriteTextArea());
        A(getButtonSend(), z6, z);
        A(getButtonRecordAudio(), z7, z);
        boolean z8 = !getInputState().a() || getState().r;
        getButtonSend().setEnabled(z8);
        c1y0 c1y0Var = this.F;
        if (c1y0Var != null) {
            c1y0Var.a().setEnabled(z8);
        }
        int i = R.attr.vk_ui_icon_secondary;
        b2y0 b2y0Var = this.z;
        if (!z || getState().j == getInputState().a()) {
            if (z8) {
                i = R.attr.vk_ui_text_accent;
            }
            if (i != getState().i) {
                getState().i = i;
                ObjectAnimator objectAnimator = this.w;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                int a3 = b2y0Var.a(i);
                getButtonSend().setColorFilter(a3);
                c1y0 c1y0Var2 = this.F;
                if (c1y0Var2 != null) {
                    c1y0Var2.c();
                    c1y0Var2.a().setColorFilter(a3);
                }
            }
        } else {
            int i2 = getState().i;
            if (z8) {
                i = R.attr.vk_ui_text_accent;
            }
            if (i2 != i) {
                getState().i = i;
                int a4 = b2y0Var.a(i2);
                int a5 = b2y0Var.a(i);
                ObjectAnimator ofArgb = ObjectAnimator.ofArgb(getButtonSend(), "colorFilter", a4, a5);
                hlq hlqVar = qq2.g;
                ofArgb.setInterpolator(hlqVar);
                ofArgb.start();
                this.w = ofArgb;
                c1y0 c1y0Var3 = this.F;
                if (c1y0Var3 != null) {
                    c1y0Var3.c();
                    ObjectAnimator ofArgb2 = ObjectAnimator.ofArgb(c1y0Var3.a(), "colorFilter", a4, a5);
                    ofArgb2.setInterpolator(hlqVar);
                    ofArgb2.start();
                }
            }
        }
        awt0.v(getButtonTemplates(), getInputState().a() && getState().q);
        getState().j = getInputState().a();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void K() {
        com.vk.writebar.c cVar = this.C;
        cVar.c.b().c.remove(Long.valueOf(cVar.b.getState().a));
        if (cVar.h.isInitialized() && cVar.c().e) {
            AttachmentsEditorView c2 = cVar.c();
            c2.e = false;
            c2.b.removeAllViews();
            c2.c.clear();
            AttachmentsEditorView.j jVar = c2.d;
            if (jVar != null) {
                jVar.b(null);
            }
        }
        cVar.f();
    }

    public final void L() {
        this.A.a();
    }

    public final void M(View view) {
        addView(view, indexOfChild(this.C.c()) + 1, new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void N() {
        com.vk.writebar.c cVar = this.C;
        if (cVar.h.isInitialized()) {
            o84 o84Var = cVar.l;
            if (o84Var != null) {
                o84Var.f();
            }
            cVar.l = null;
            cVar.c().setAttachmentsClickListener(null);
            cVar.c().setResultFragment(null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.too0
    public final void Ng() {
        b2y0 b2y0Var = this.z;
        int b2 = b2y0Var.b(R.attr.vk_ui_text_accent);
        this.B.a();
        c1y0 c1y0Var = this.F;
        if (c1y0Var != null) {
            c1y0Var.b().setBackground(dhr0.t.a(R.drawable.background_contrast_themed_16dp));
        }
        q1y0 q1y0Var = this.A;
        q1y0Var.f = b2;
        if (q1y0Var.d.isInitialized()) {
            ReplyView replyView = q1y0Var.e;
            if (replyView == null) {
                replyView = null;
            }
            replyView.setLineColor(q1y0Var.f);
            ReplyView replyView2 = q1y0Var.e;
            (replyView2 != null ? replyView2 : null).setTitleTextColor(q1y0Var.f);
        }
        q1p.a(getWriteBarEdit(), b2);
        getWriteBarEdit().setLinkTextColor(ColorStateList.valueOf(b2));
        if (getState().i != 0) {
            int a2 = b2y0Var.a(getState().i);
            getButtonSend().setColorFilter(a2);
            c1y0 c1y0Var2 = this.F;
            if (c1y0Var2 != null) {
                c1y0Var2.c();
                c1y0Var2.a().setColorFilter(a2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void O() {
        if (getState().n) {
            getState().n = false;
            d1y0 d1y0Var = this.M;
            if (d1y0Var != null) {
                d1y0Var.j();
            }
            z(0, false);
            c1y0 c1y0Var = this.F;
            if (c1y0Var != null) {
                f4m.j((View) c1y0Var.g.getValue());
                WriteBarButtonsBubbleView b2 = c1y0Var.b();
                b2.animate().translationY(b2.getHeight()).setDuration(200L).withEndAction(new tn9(b2, 25)).start();
            }
            k0y0 k0y0Var = this.O;
            if (k0y0Var != null) {
                getWriteBarEdit().getViewTreeObserver().removeOnGlobalLayoutListener(k0y0Var);
            }
            this.O = null;
        }
    }

    public final void P(boolean z) {
        c1y0 c1y0Var;
        Pair<Integer, Integer> selectionYCoordinates = getWriteBarEdit().getSelectionYCoordinates();
        if (selectionYCoordinates == null || (c1y0Var = this.F) == null) {
            return;
        }
        int[] iArr = new int[2];
        c1y0Var.b().getLocationOnScreen(iArr);
        Pair pair = new Pair(Integer.valueOf(iArr[1]), Integer.valueOf(c1y0Var.b().getHeight() + iArr[1]));
        if (selectionYCoordinates.i().intValue() < ((Number) pair.j()).intValue() || selectionYCoordinates.j().intValue() < ((Number) pair.j()).intValue()) {
            if (selectionYCoordinates.j().intValue() >= ((Number) pair.i()).intValue()) {
                getWriteBarFullscreenScrollContainer().scrollBy(0, iah0.a(16) + (selectionYCoordinates.j().intValue() - ((Number) pair.i()).intValue()));
            }
        } else if (z) {
            getWriteBarFullscreenScrollContainer().scrollTo(0, selectionYCoordinates.j().intValue());
        } else {
            postDelayed(new d(), 150L);
        }
    }

    public final void Q() {
        f4m.j(getChannelAvatar());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void R() {
        getWriteRecordTip().setVisibility(8);
        bay.c().e();
        getButtonRecordAudio().setVisibility(this.v ? 0 : 4);
        getButtonRecordVideo().setVisibility(0);
        getWriteTextArea().setVisibility(0);
        g gVar = this.B;
        if (gVar.h.isInitialized()) {
            gVar.f().setVisibility(4);
            com.vk.writebar.a aVar = gVar.o;
            if (aVar == null) {
                aVar = null;
            }
            if (aVar.d()) {
                aVar.b(false);
            }
        }
        gVar.e = false;
        q1y0 q1y0Var = this.A;
        if (q1y0Var.g != null) {
            q1y0Var.c();
        }
        postDelayed(new kv2(this, 19), 300L);
        getWriteBarEdit().setKeepFocus(false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void S(Activity activity, f6b f6bVar) {
        com.vk.writebar.c cVar = this.C;
        cVar.m = activity;
        cVar.i = f6bVar;
        if (cVar.h.isInitialized()) {
            cVar.e(cVar.c(), f6bVar);
        }
    }

    public final void T(boolean z, gzs<s3q0> gzsVar) {
        f4m.j(getWriteBarAttach());
        VkAvatar channelAvatar = getChannelAvatar();
        channelAvatar.setVisibility(0);
        if (z) {
            f4m.s(iah0.a(12), getWriteBarEdit());
        }
        channelAvatar.setOnClickListener(new bq80(1, gzsVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void U() {
        c1y0 c1y0Var = this.F;
        if (c1y0Var != null) {
            jds0 jds0Var = new jds0(this, 12);
            e1s0 e1s0Var = new e1s0(this, 11);
            pnr0 pnr0Var = new pnr0(this, 10);
            s1y0 s1y0Var = this.I;
            t1y0 t1y0Var = this.L;
            c1y0Var.c();
            bwt0.i0((ImageView) c1y0Var.f.getValue(), new jan0(pnr0Var, 19));
            bwt0.i0((View) c1y0Var.l.getValue(), new b0y0(jds0Var, 1));
            bwt0.i0((ImageView) c1y0Var.i.getValue(), new gyo0(t1y0Var, 26));
            bwt0.i0(c1y0Var.a(), new x7t0(7, s1y0Var, c1y0Var));
            bwt0.k0(c1y0Var.a(), new cis0(6, s1y0Var, c1y0Var));
            bwt0.i0((ImageView) c1y0Var.k.getValue(), new ptl0(e1s0Var, 27));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        if (r10 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        boolean z;
        WriteBarPermissionsHolder.Permission permission;
        boolean z2;
        Source source;
        ImFeatures imFeatures;
        kkm kkmVar;
        String str;
        Window window;
        WindowManager.LayoutParams attributes;
        com.vk.writebar.c cVar = this.C;
        ?? r1 = cVar.h;
        WriteBar writeBar = cVar.b;
        if ((r1.isInitialized() ? cVar.c().getCount() : 0) >= cVar.s) {
            cVar.h();
            return;
        }
        mhy.d(getWriteBarEdit());
        getButtonRecordAudio().setEnabled(false);
        Activity w = bwt0.w(this);
        boolean z3 = !((w == null || (window = w.getWindow()) == null || (attributes = window.getAttributes()) == null || (attributes.flags & 8192) != 0) ? false : true);
        ?? r5 = cVar.h;
        WriteBarPermissionsHolder writeBarPermissionsHolder = cVar.d;
        FragmentImpl fragmentImpl = cVar.k;
        if (fragmentImpl == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("selection_limit", cVar.s - (r5.isInitialized() ? cVar.c().getCount() : 0));
        WriteBarPermissionsHolder.Permission permission2 = WriteBarPermissionsHolder.Permission.GRAFFITY;
        HashSet<WriteBarPermissionsHolder.Permission> hashSet = writeBarPermissionsHolder.a;
        bundle.putBoolean("enable_graffiti_att", hashSet.contains(permission2));
        if (hashSet.contains(WriteBarPermissionsHolder.Permission.LOCATION)) {
            if (r5.isInitialized()) {
                Iterator<Attachment> it = cVar.c().c.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof GeoAttachment) {
                    }
                }
            }
            z = true;
            bundle.putBoolean("enable_map_attachment", z);
            permission = WriteBarPermissionsHolder.Permission.GIFT;
            bundle.putBoolean("enable_gift_attachment", hashSet.contains(permission));
            bundle.putBoolean("enable_story_attachment", hashSet.contains(WriteBarPermissionsHolder.Permission.STORY));
            bundle.putLong("peer_id", writeBar.getState().a);
            bundle.putBoolean("can_pin_attachment", cVar.z.invoke().booleanValue());
            if (hashSet.contains(WriteBarPermissionsHolder.Permission.POLL)) {
                if (r5.isInitialized()) {
                    ArrayList<Attachment> arrayList = cVar.c().c;
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            i = -1;
                            break;
                        } else if (arrayList.get(i) instanceof PollAttachment) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                z2 = true;
                bundle.putBoolean("enable_poll_attachment", z2);
                bundle.putBoolean("enable_pick_from_vk", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_VIDEO_FROM_VK));
                bundle.putBoolean("enable_documents_search", hashSet.contains(WriteBarPermissionsHolder.Permission.DOCUMENTS_SEARCH));
                bundle.putBoolean("vk_video_type", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_FROM_VK));
                bundle.putBoolean("video_from_gallery_type", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_FROM_GALLERY));
                o25.a().getClass();
                bundle.putBoolean("enable_music_attachment", true);
                writeBar.getState().getClass();
                bundle.putInt("post_id", 0);
                bundle.putParcelable("owner_id", writeBar.getState().b);
                bundle.putBoolean("attach_limit_hint", cVar.t);
                bundle.putBoolean("apps", hashSet.contains(WriteBarPermissionsHolder.Permission.APPS));
                bundle.putBoolean("is_dialog", writeBar.getState().e);
                Source source2 = writeBar.getState().o;
                source = Source.COMMUNITY_CHANNEL;
                bundle.putBoolean("is_community_channel", source2 == source);
                bundle.putBoolean("new_photo_editor_entry_points", cVar.n);
                bundle.putBoolean("achievements", hashSet.contains(WriteBarPermissionsHolder.Permission.ACHIEVEMENTS));
                bundle.putBoolean("window_flag_secure", z3);
                imFeatures = ImFeatures.BLUR_POST;
                imFeatures.getClass();
                if (!com.vk.toggle.b.A.a(imFeatures) && writeBar.getState().o == source) {
                    bundle.putBoolean("spoiler_tool_need_show", true);
                    bundle.putBoolean("spoiler_blur_enabled", false);
                    bundle.putBoolean("spoiler_donate_enabled", writeBar.getState().s);
                    bundle.putBoolean("spoiler_donate_system_need_activate", !writeBar.getState().t);
                    a24 a24Var = cVar.c().B;
                    boolean z4 = a24Var.a;
                    a24Var.a = false;
                    bundle.putBoolean("spoiler_donate_can_show_onboarding", z4);
                    Long l = writeBar.getState().u;
                    if (l != null) {
                        bundle.putLong("spoiler_group", l.longValue());
                    }
                }
                kkmVar = cVar.e.b;
                if (kkmVar != null && !bay.c().i()) {
                    bundle.putInt("inactive_background_color", kkmVar.f(R.attr.vk_ui_background_secondary));
                    bundle.putInt("active_background_color", kkmVar.f(R.attr.vk_ui_background_accent_themed));
                    bundle.putInt("inactive_icon_color", kkmVar.f(R.attr.vk_ui_icon_medium));
                    bundle.putInt("active_icon_color", kkmVar.f(R.attr.vk_ui_icon_contrast_themed));
                    bundle.putInt("inactive_text_color", kkmVar.f(R.attr.vk_ui_text_subhead));
                    bundle.putInt("active_text_color", kkmVar.f(R.attr.vk_ui_text_accent_themed));
                }
                str = writeBar.getState().d;
                if (str != null) {
                    bundle.putString("peer_title", str);
                }
                if (hashSet.contains(permission)) {
                    bundle.putParcelableArrayList("gift_users", new ArrayList<>(this.E.o));
                }
                if (bay.c().i()) {
                    bundle.putInt("attach_counter_button_color", dhr0.t.c(R.attr.vk_ui_text_accent));
                }
                bay.c().h(fragmentImpl, bundle);
            }
            z2 = false;
            bundle.putBoolean("enable_poll_attachment", z2);
            bundle.putBoolean("enable_pick_from_vk", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_VIDEO_FROM_VK));
            bundle.putBoolean("enable_documents_search", hashSet.contains(WriteBarPermissionsHolder.Permission.DOCUMENTS_SEARCH));
            bundle.putBoolean("vk_video_type", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_FROM_VK));
            bundle.putBoolean("video_from_gallery_type", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_FROM_GALLERY));
            o25.a().getClass();
            bundle.putBoolean("enable_music_attachment", true);
            writeBar.getState().getClass();
            bundle.putInt("post_id", 0);
            bundle.putParcelable("owner_id", writeBar.getState().b);
            bundle.putBoolean("attach_limit_hint", cVar.t);
            bundle.putBoolean("apps", hashSet.contains(WriteBarPermissionsHolder.Permission.APPS));
            bundle.putBoolean("is_dialog", writeBar.getState().e);
            Source source22 = writeBar.getState().o;
            source = Source.COMMUNITY_CHANNEL;
            bundle.putBoolean("is_community_channel", source22 == source);
            bundle.putBoolean("new_photo_editor_entry_points", cVar.n);
            bundle.putBoolean("achievements", hashSet.contains(WriteBarPermissionsHolder.Permission.ACHIEVEMENTS));
            bundle.putBoolean("window_flag_secure", z3);
            imFeatures = ImFeatures.BLUR_POST;
            imFeatures.getClass();
            if (!com.vk.toggle.b.A.a(imFeatures) && writeBar.getState().o == source) {
            }
            kkmVar = cVar.e.b;
            if (kkmVar != null) {
                bundle.putInt("inactive_background_color", kkmVar.f(R.attr.vk_ui_background_secondary));
                bundle.putInt("active_background_color", kkmVar.f(R.attr.vk_ui_background_accent_themed));
                bundle.putInt("inactive_icon_color", kkmVar.f(R.attr.vk_ui_icon_medium));
                bundle.putInt("active_icon_color", kkmVar.f(R.attr.vk_ui_icon_contrast_themed));
                bundle.putInt("inactive_text_color", kkmVar.f(R.attr.vk_ui_text_subhead));
                bundle.putInt("active_text_color", kkmVar.f(R.attr.vk_ui_text_accent_themed));
            }
            str = writeBar.getState().d;
            if (str != null) {
            }
            if (hashSet.contains(permission)) {
            }
            if (bay.c().i()) {
            }
            bay.c().h(fragmentImpl, bundle);
        }
        z = false;
        bundle.putBoolean("enable_map_attachment", z);
        permission = WriteBarPermissionsHolder.Permission.GIFT;
        bundle.putBoolean("enable_gift_attachment", hashSet.contains(permission));
        bundle.putBoolean("enable_story_attachment", hashSet.contains(WriteBarPermissionsHolder.Permission.STORY));
        bundle.putLong("peer_id", writeBar.getState().a);
        bundle.putBoolean("can_pin_attachment", cVar.z.invoke().booleanValue());
        if (hashSet.contains(WriteBarPermissionsHolder.Permission.POLL)) {
        }
        z2 = false;
        bundle.putBoolean("enable_poll_attachment", z2);
        bundle.putBoolean("enable_pick_from_vk", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_VIDEO_FROM_VK));
        bundle.putBoolean("enable_documents_search", hashSet.contains(WriteBarPermissionsHolder.Permission.DOCUMENTS_SEARCH));
        bundle.putBoolean("vk_video_type", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_FROM_VK));
        bundle.putBoolean("video_from_gallery_type", hashSet.contains(WriteBarPermissionsHolder.Permission.PHOTO_FROM_GALLERY));
        o25.a().getClass();
        bundle.putBoolean("enable_music_attachment", true);
        writeBar.getState().getClass();
        bundle.putInt("post_id", 0);
        bundle.putParcelable("owner_id", writeBar.getState().b);
        bundle.putBoolean("attach_limit_hint", cVar.t);
        bundle.putBoolean("apps", hashSet.contains(WriteBarPermissionsHolder.Permission.APPS));
        bundle.putBoolean("is_dialog", writeBar.getState().e);
        Source source222 = writeBar.getState().o;
        source = Source.COMMUNITY_CHANNEL;
        bundle.putBoolean("is_community_channel", source222 == source);
        bundle.putBoolean("new_photo_editor_entry_points", cVar.n);
        bundle.putBoolean("achievements", hashSet.contains(WriteBarPermissionsHolder.Permission.ACHIEVEMENTS));
        bundle.putBoolean("window_flag_secure", z3);
        imFeatures = ImFeatures.BLUR_POST;
        imFeatures.getClass();
        if (!com.vk.toggle.b.A.a(imFeatures) && writeBar.getState().o == source) {
        }
        kkmVar = cVar.e.b;
        if (kkmVar != null) {
        }
        str = writeBar.getState().d;
        if (str != null) {
        }
        if (hashSet.contains(permission)) {
        }
        if (bay.c().i()) {
        }
        bay.c().h(fragmentImpl, bundle);
    }

    public final void W() {
        ImageView buttonSend = getButtonSend();
        abg0 abg0Var = dhr0.t;
        buttonSend.setImageDrawable(abg0Var.d(R.attr.im_ic_done));
        c1y0 c1y0Var = this.F;
        if (c1y0Var != null) {
            Drawable d2 = abg0Var.d(R.attr.im_ic_done);
            c1y0Var.c();
            c1y0Var.a().setImageDrawable(d2);
        }
        J(true);
    }

    public final void X(Set<UserId> set, boolean z, boolean z2, boolean z3) {
        this.y.a(WriteBarPermissionsHolder.Permission.GIFT, z && !set.isEmpty());
        y1y0 y1y0Var = this.E;
        HashSet<UserId> hashSet = y1y0Var.o;
        hashSet.clear();
        hashSet.addAll(set);
        y1y0Var.getClass();
        y1y0Var.p = new k6n0(z3, z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void Y(MsgFromUser msgFromUser, ProfilesSimpleInfo profilesSimpleInfo, String str, boolean z) {
        AttachmentsEditorView.j jVar;
        q1y0 q1y0Var = this.A;
        if (msgFromUser == null || profilesSimpleInfo == null) {
            q1y0Var.a();
            return;
        }
        int i = 0;
        StencilLayout.a aVar = new StencilLayout.a(null, false, new int[0], q1y0Var.c.b(R.attr.vk_ui_background_modal), StencilLayout.BorderWidth.Replay);
        q1y0Var.c();
        PhotoRestriction i2 = po40.i(msgFromUser, q1y0Var.a.getContext());
        ReplyView replyView = q1y0Var.e;
        Attachment attachment = null;
        if (replyView == null) {
            replyView = null;
        }
        replyView.d(msgFromUser, i2, profilesSimpleInfo, str, aVar, msgFromUser.D);
        q1y0Var.g = msgFromUser;
        q1y0Var.h = profilesSimpleInfo;
        com.vk.writebar.c cVar = this.C;
        if (cVar.h.isInitialized()) {
            ArrayList<Attachment> arrayList = cVar.c().c;
            while (true) {
                if (i >= arrayList.size()) {
                    i = -1;
                    break;
                } else if (arrayList.get(i) instanceof FwdMessagesAttachment) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                AttachmentsEditorView c2 = cVar.c();
                c2.getClass();
                try {
                    c2.b.removeViewAt(i);
                    attachment = c2.c.remove(i);
                } catch (Exception e2) {
                    L.i(e2);
                }
                if (attachment != null && (jVar = c2.d) != null) {
                    jVar.b(attachment);
                }
            }
        }
        cVar.f();
        p0();
        r1y0 r1y0Var = this.J;
        if (r1y0Var != null) {
            r1y0Var.c();
        }
        if (z) {
            mhy.j(getWriteBarEdit());
        }
    }

    public final void Z() {
        ImageView buttonSend = getButtonSend();
        abg0 abg0Var = dhr0.t;
        buttonSend.setImageDrawable(abg0Var.d(R.attr.im_ic_send_msg));
        c1y0 c1y0Var = this.F;
        if (c1y0Var != null) {
            Drawable d2 = abg0Var.d(R.attr.im_ic_send_msg);
            c1y0Var.c();
            c1y0Var.a().setImageDrawable(d2);
        }
        J(true);
    }

    public final void b(UserId userId, boolean z) {
        com.vk.writebar.c cVar = this.C;
        cVar.v = userId;
        pc pcVar = cVar.y;
        if (pcVar == null) {
            pcVar = null;
        }
        pcVar.b(userId, z);
    }

    public final void b0() {
        ImageView buttonSend = getButtonSend();
        abg0 abg0Var = dhr0.t;
        buttonSend.setImageDrawable(abg0Var.d(R.attr.im_ic_send_postponed));
        c1y0 c1y0Var = this.F;
        if (c1y0Var != null) {
            Drawable d2 = abg0Var.d(R.attr.im_ic_send_postponed);
            c1y0Var.c();
            c1y0Var.a().setImageDrawable(d2);
        }
        J(true);
    }

    public final void c0() {
        getChannelAvatar().setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean e() {
        com.vk.writebar.c cVar = this.C;
        return cVar.h.isInitialized() && cVar.c().f();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(Runnable runnable, Runnable runnable2) {
        com.vk.writebar.c cVar = this.C;
        if (!cVar.h.isInitialized() || !cVar.c().f()) {
            runnable.run();
        } else {
            cVar.q = runnable;
            cVar.r = runnable2;
        }
    }

    public final ArrayList<Attachment> getAttachments() {
        return this.C.d();
    }

    public final StickersView.c getAutoSuggestPopupListener() {
        return this.E.j;
    }

    public final lk5 getAutoSuggestTextProvider() {
        return this.E.k;
    }

    public final ViewGroup getBottomSheetContainer() {
        return this.E.i;
    }

    public final gzs<Boolean> getCanPinAttachmentProvider() {
        return this.C.z;
    }

    public final boolean getCanPostDonut() {
        return this.a0.t;
    }

    public final long getDialogId() {
        return this.W.a;
    }

    public final String getDialogTitle() {
        return this.c0.d;
    }

    public final View getEmojiAnchor() {
        return (ImageView) this.E.f.getValue();
    }

    public final Long getGroupId() {
        return this.g0.u;
    }

    @Override // xsna.g1y0
    public EditText getInput() {
        return getWriteBarEdit();
    }

    @Override // xsna.g1y0
    public f1y0 getInputState() {
        CharSequence text = getWriteBarEdit().getText();
        if (text == null) {
            text = "";
        }
        return new f1y0(text, getAttachments());
    }

    public final d1y0 getOnFullscreenListener() {
        return this.M;
    }

    public final UserId getOwnerId() {
        return this.V.b;
    }

    public final MsgFromUser getReplyMessage() {
        return this.A.g;
    }

    public final ProfilesSimpleInfo getReplyMsgMembers() {
        return this.A.h;
    }

    @Override // xsna.g1y0
    public ImageView getSendButton() {
        return getButtonSend();
    }

    public final boolean getShowKeyboardIcon() {
        return this.Q.k;
    }

    public final Source getSource() {
        return this.f0.o;
    }

    @Override // xsna.g1y0
    public h getState() {
        return this.x;
    }

    public final View getTemplatesAnchor() {
        return getButtonTemplates();
    }

    public final CharSequence getText() {
        Editable text = getWriteBarEdit().getText();
        return text != null ? text : "";
    }

    public final int getTopicId() {
        return this.d0.c;
    }

    public final boolean getUpdateBottomSheet() {
        return this.H.c;
    }

    public final s0y0 getWriteBarAttachesListener() {
        return this.C.g;
    }

    public final z0y0 getWriteBarCommentListener() {
        return this.D.d;
    }

    public final e1y0 getWriteBarInputListener() {
        return this.K;
    }

    public final h1y0 getWriteBarMediaListener() {
        return this.B.d;
    }

    public final r1y0 getWriteBarReplyMessageListener() {
        return this.J;
    }

    public final s1y0 getWriteBarSendListener() {
        return this.I;
    }

    public final t1y0 getWriteBarSettingsListener() {
        return this.L;
    }

    public final z1y0 getWriteBarStickersListener() {
        return this.E.d;
    }

    public final void j0(String str) {
        this.A.b();
        getWriteContainer().setVisibility(8);
        y0y0 y0y0Var = this.D;
        y0y0Var.b();
        bpn0 bpn0Var = y0y0Var.g;
        ((TextView) bpn0Var.getValue()).setText(str);
        ((TextView) bpn0Var.getValue()).setVisibility(0);
    }

    public final void k0() {
        getButtonRecordAudio().setVisibility(8);
        getButtonRecordVideo().setVisibility(8);
        getWriteTextArea().setVisibility(4);
        getWriteRecordTip().setVisibility(4);
        g gVar = this.B;
        gVar.g();
        gVar.f().setVisibility(0);
        gVar.e().setAlpha(1.0f);
        gVar.e().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        gVar.d().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        gVar.c().setVisibility(8);
        gVar.d().setVisibility(0);
        gVar.e().setVisibility(0);
        ((View) gVar.l.getValue()).setVisibility(0);
    }

    public final void l0() {
        bay.c().o();
        getButtonRecordVideo().setVisibility(8);
        getButtonRecordAudio().setVisibility(8);
        getWriteTextArea().setVisibility(4);
        getWriteRecordTip().setVisibility(0);
        g gVar = this.B;
        gVar.g();
        gVar.f().setVisibility(0);
        gVar.e().setAlpha(1.0f);
        gVar.e().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        gVar.d().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        gVar.c().setVisibility(8);
        gVar.d().setVisibility(8);
        gVar.e().setVisibility(8);
        ((View) gVar.l.getValue()).setVisibility(8);
        bwt0.i(gVar.a, 300L, new vgs0(gVar, 18), null);
        gVar.e = true;
        getWriteBarEdit().setKeepFocus(true);
        this.A.b();
    }

    public final void m0() {
        bay.c().o();
        k0();
        this.A.b();
        getWriteBarEdit().setKeepFocus(true);
        g gVar = this.B;
        gVar.e = true;
        bwt0.i(gVar.a, 300L, new cbt0(gVar, 17), null);
    }

    public final void n(boolean z) {
        y1y0 y1y0Var = this.E;
        y1y0Var.a().s(y1y0Var.t && !z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void n0() {
        getWriteContainer().setVisibility(0);
        y0y0 y0y0Var = this.D;
        if (y0y0Var.e.isInitialized()) {
            ((TextView) y0y0Var.g.getValue()).setVisibility(8);
        }
    }

    public final void o0(int i) {
        this.E.c.c(R.id.writebar_emoji, R.attr.im_ic_emoji, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a0  */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.tb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        o84 o84Var;
        ArrayList parcelableArrayList;
        boolean[] zArr;
        boolean[] zArr2;
        int i3;
        boolean[] zArr3;
        boolean[] zArr4;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        long j;
        int i4;
        ArrayList parcelableArrayListExtra;
        getButtonRecordAudio().setEnabled(true);
        getButtonRecordVideo().setEnabled(true);
        if (i2 != -1 || intent == null) {
            return;
        }
        com.vk.writebar.c cVar = this.C;
        cVar.getClass();
        if (i == 10010) {
            if (intent.hasExtra("peer_id")) {
                cVar.f.a(intent.getLongExtra("peer_id", 0L));
            }
            boolean z = false;
            if (intent.hasExtra("result_new_graffiti")) {
                cVar.a((Attachment) intent.getParcelableExtra("result_new_graffiti"));
            } else if (intent.hasExtra("result_graffiti")) {
                cVar.a((Attachment) intent.getParcelableExtra("result_graffiti"));
            } else if (bay.c().p(intent)) {
                Iterator<T> it = bay.c().m(intent).iterator();
                while (it.hasNext()) {
                    cVar.a((PendingStoryAttachment) it.next());
                }
            } else if (intent.hasExtra("result_attachments")) {
                Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                if (bundleExtra.containsKey("result_files") && bundleExtra.containsKey("result_video_flags") && (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) != null) {
                    boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
                    if (booleanArray == null) {
                        booleanArray = new boolean[0];
                    }
                    boolean[] booleanArray2 = bundleExtra.getBooleanArray("result_send_as_file_flags");
                    if (booleanArray2 == null) {
                        booleanArray2 = new boolean[0];
                    }
                    boolean[] booleanArray3 = bundleExtra.getBooleanArray("result_spoiler_mask_flags");
                    if (booleanArray3 == null) {
                        booleanArray3 = new boolean[0];
                    }
                    boolean[] booleanArray4 = bundleExtra.getBooleanArray("result_donut_flags");
                    if (booleanArray4 == null) {
                        booleanArray4 = new boolean[0];
                    }
                    boolean[] zArr5 = booleanArray4;
                    int length = booleanArray.length;
                    int i5 = 0;
                    while (i5 < length) {
                        Uri uri = (Uri) parcelableArrayList.get(i5);
                        boolean z2 = (i5 < 0 || i5 >= booleanArray3.length) ? z : booleanArray3[i5];
                        boolean z3 = (i5 < 0 || i5 >= zArr5.length) ? z : zArr5[i5];
                        if (booleanArray[i5]) {
                            WriteBar writeBar = cVar.a;
                            String K = com.vk.core.files.a.K(uri);
                            if (K == null || K.length() == 0) {
                                K = uri.getEncodedPath();
                            }
                            String str = K;
                            if (str != null) {
                                try {
                                    mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                    try {
                                        try {
                                            mediaMetadataRetriever2.setDataSource(str);
                                            String extractMetadata = mediaMetadataRetriever2.extractMetadata(9);
                                            long parseLong = extractMetadata != null ? Long.parseLong(extractMetadata) : 0L;
                                            mediaMetadataRetriever2.release();
                                            long j2 = parseLong;
                                            zArr = booleanArray;
                                            j = j2;
                                        } catch (Throwable th) {
                                            th = th;
                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                            if (mediaMetadataRetriever != null) {
                                                mediaMetadataRetriever.release();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        e.toString();
                                        if (mediaMetadataRetriever2 != null) {
                                            mediaMetadataRetriever2.release();
                                        }
                                        zArr = booleanArray;
                                        j = 0;
                                        i4 = ((int) j) / 1000;
                                        if ("unknown".equals(str)) {
                                        }
                                        i5++;
                                        zArr5 = zArr3;
                                        booleanArray2 = zArr2;
                                        booleanArray3 = zArr4;
                                        booleanArray = zArr;
                                        length = i3;
                                        z = false;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    mediaMetadataRetriever2 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mediaMetadataRetriever = null;
                                }
                                i4 = ((int) j) / 1000;
                            } else {
                                zArr = booleanArray;
                                i4 = 0;
                            }
                            if ("unknown".equals(str)) {
                                zArr2 = booleanArray2;
                                zArr4 = booleanArray3;
                                i3 = length;
                                zArr3 = zArr5;
                                cVar.b(i4, uri);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(uri);
                                boolean[] zArr6 = booleanArray3;
                                Context context = writeBar.getContext();
                                zArr2 = booleanArray2;
                                zArr4 = zArr6;
                                i3 = length;
                                zArr3 = zArr5;
                                r0y0 r0y0Var = new r0y0(new ner0(context), context, cVar, i4, uri);
                                Context context2 = writeBar.getContext();
                                String string = r0y0Var.b.getString(R.string.loading);
                                ner0 ner0Var = r0y0Var.a;
                                ner0Var.setMessage(string);
                                ner0Var.show();
                                asu0.a.getClass();
                                asu0.h().execute(new bbr(arrayList, context2, r0y0Var, 0));
                            }
                        } else {
                            zArr = booleanArray;
                            zArr2 = booleanArray2;
                            i3 = length;
                            zArr3 = zArr5;
                            zArr4 = booleanArray3;
                            String authority = (!epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) || uri.getAuthority() == null) ? "" : uri.getAuthority();
                            if (zArr2.length <= i5 || !zArr2[i5]) {
                                StringBuilder sb = new StringBuilder();
                                boolean z4 = z2;
                                sb.append(uri.getScheme());
                                sb.append("://");
                                sb.append(authority);
                                sb.append(uri.getEncodedPath());
                                PendingPhotoAttachment pendingPhotoAttachment = new PendingPhotoAttachment(sb.toString());
                                pendingPhotoAttachment.l = z4 ? "" : null;
                                pendingPhotoAttachment.m = z3;
                                cVar.a(pendingPhotoAttachment);
                            } else {
                                String str2 = uri.getScheme() + "://" + authority + uri.getEncodedPath();
                                Serializer.c<PendingDocumentAttachment> cVar2 = PendingDocumentAttachment.CREATOR;
                                Uri parse = Uri.parse(str2);
                                cVar.a(new PendingDocumentAttachment(com.vk.core.files.a.F(parse), str2, ((dag0) com.vk.core.files.a.h.getValue()).a(parse), str2, UserId.d, com.vk.upload.impl.a.d.getAndIncrement(), com.vk.core.files.a.E(parse)));
                            }
                        }
                        i5++;
                        zArr5 = zArr3;
                        booleanArray2 = zArr2;
                        booleanArray3 = zArr4;
                        booleanArray = zArr;
                        length = i3;
                        z = false;
                    }
                }
            } else if (intent.hasExtra("audio")) {
                cVar.a(new AudioAttachment((MusicTrack) intent.getParcelableExtra("audio")));
            } else if (intent.hasExtra("playlist")) {
                cVar.a(new AudioPlaylistAttachment((Playlist) intent.getParcelableExtra("playlist")));
            } else if (intent.hasExtra("documents")) {
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("documents");
                if (parcelableArrayListExtra2 != null) {
                    Iterator it2 = parcelableArrayListExtra2.iterator();
                    while (it2.hasNext()) {
                        cVar.a((Attachment) ((Parcelable) it2.next()));
                    }
                }
            } else if (intent.hasExtra("video")) {
                cVar.a(new VideoAttachment((VideoFile) intent.getParcelableExtra("video")));
            } else if (intent.hasExtra("photo")) {
                cVar.a(new PhotoAttachment((Photo) intent.getParcelableExtra("photo")));
            } else if (intent.hasExtra("point")) {
                cVar.a((Attachment) intent.getParcelableExtra("point"));
            } else if (intent.hasExtra("poll")) {
                cVar.a(new PollAttachment((Poll) intent.getParcelableExtra("poll")));
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (extras.containsKey("mMusic")) {
                    ArrayList parcelableArrayListExtra3 = intent.getParcelableArrayListExtra("mMusic");
                    if (parcelableArrayListExtra3 != null) {
                        Iterator it3 = parcelableArrayListExtra3.iterator();
                        while (it3.hasNext()) {
                            cVar.a(new AudioAttachment((MusicTrack) it3.next()));
                        }
                    }
                } else if (extras.containsKey("mVideo")) {
                    ArrayList parcelableArrayListExtra4 = intent.getParcelableArrayListExtra("mVideo");
                    if (parcelableArrayListExtra4 != null) {
                        Iterator it4 = parcelableArrayListExtra4.iterator();
                        while (it4.hasNext()) {
                            cVar.a(new VideoAttachment((VideoFile) it4.next()));
                        }
                    }
                } else if (extras.containsKey("mDocuments") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("mDocuments")) != null) {
                    Iterator it5 = parcelableArrayListExtra.iterator();
                    while (it5.hasNext()) {
                        cVar.a(new DocumentAttachment((Document) it5.next()));
                    }
                }
            }
            cVar.g(cVar.h.isInitialized() && !cVar.c().c.isEmpty());
        }
        Poll j3 = bay.c().j(i, intent);
        if (j3 != null) {
            cVar.a(new PollAttachment(j3));
        }
        if (i != 10666 || (o84Var = cVar.l) == null) {
            return;
        }
        Object obj = o84Var.m;
        em6 em6Var = obj instanceof em6 ? (em6) obj : null;
        if (em6Var != null) {
            em6Var.f(10666, intent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((View) getParent()).addOnLayoutChangeListener(this.H);
        pc pcVar = this.C.y;
        if (pcVar == null) {
            pcVar = null;
        }
        pcVar.c();
        y1y0 y1y0Var = this.E;
        y1y0Var.getClass();
        kcl0 kcl0Var = y1y0Var.l;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.STICKERS_NUM_UPDATES");
        intentFilter.addAction("com.vkontakte.android.STICKERS_RELOADED");
        anj.d(y1y0Var.a.getContext(), (WriteBarStickersHolder$mReceiver$2$1) y1y0Var.r.getValue(), intentFilter, hf8.a, 4);
        int i = ify.a;
        ify.a((w1y0) y1y0Var.w.getValue());
        y1y0Var.a().q();
        boolean z = false;
        awt0.v(y1y0Var.b(), y1y0Var.v && y1y0Var.u && kcl0Var.O0() > 0);
        ImageView c2 = y1y0Var.c();
        if (y1y0Var.v && kcl0Var.W()) {
            z = true;
        }
        awt0.v(c2, z);
        io.reactivex.rxjava3.subjects.f<xvg0> fVar = h4l0.a.a;
        hg1.z4 z4Var = new hg1.z4();
        fVar.getClass();
        y1y0Var.e.b(new i0(fVar, z4Var).a0(asu0.a.d()).subscribe(new nzs0(new z4t0(y1y0Var, 17), 6)));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        y1y0 y1y0Var = this.E;
        ViewGroup viewGroup = y1y0Var.i;
        if (viewGroup != null) {
            viewGroup.getLayoutParams();
        }
        y1y0Var.a().j();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a.C2099a c2099a;
        super.onDetachedFromWindow();
        y1y0 y1y0Var = this.E;
        y1y0Var.e.dispose();
        y1y0Var.a.getContext().unregisterReceiver((WriteBarStickersHolder$mReceiver$2$1) y1y0Var.r.getValue());
        int i = ify.a;
        ify.g((w1y0) y1y0Var.w.getValue());
        y1y0Var.a().r();
        y1y0Var.a().d();
        g gVar = this.B;
        if (gVar.h.isInitialized()) {
            com.vk.writebar.b bVar = gVar.n;
            if (bVar == null) {
                bVar = null;
            }
            bVar.getClass();
            com.vk.writebar.a aVar = gVar.o;
            if (aVar == null) {
                aVar = null;
            }
            if (aVar.d() && (c2099a = aVar.j) != null) {
                c2099a.a();
            }
        }
        ((View) getParent()).removeOnLayoutChangeListener(this.H);
        com.vk.writebar.c cVar = this.C;
        cVar.f.dispose();
        pc pcVar = cVar.y;
        (pcVar != null ? pcVar : null).g();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getState().h) {
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 1 || action == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (((android.view.ViewGroup) r0.d.getValue()).getVisibility() == 0) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0() {
        com.vk.writebar.c cVar = this.C;
        if (!cVar.h.isInitialized() || cVar.c().getVisibility() != 0) {
            q1y0 q1y0Var = this.A;
            if (q1y0Var.d.isInitialized()) {
            }
            getAttachDivider().setVisibility(8);
        }
        if (getState().g != 0) {
            getAttachDivider().setVisibility(0);
            return;
        }
        getAttachDivider().setVisibility(8);
    }

    @Override // xsna.xgy.b
    public final void q(xgy xgyVar) {
        y1y0 y1y0Var = this.E;
        y1y0Var.e();
        y1y0Var.q.getClass();
        y1y0Var.a().s(true);
        z1y0 z1y0Var = y1y0Var.d;
        if (z1y0Var != null) {
            z1y0Var.f();
        }
    }

    public final void q0(boolean z) {
        int i;
        ImageView buttonTemplates = getButtonTemplates();
        if (z) {
            i = R.drawable.vk_icon_keyboard_outline_28;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_pen_stack_outline_28;
        }
        buttonTemplates.setImageResource(i);
    }

    public final void setAchievementsAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.ACHIEVEMENTS, z);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.g1y0
    public void setAddAttachAllowed(boolean z) {
        getWriteBarAttach().setAlpha(z ? 1.0f : 0.4f);
        getWriteBarAttach().setEnabled(z);
        c1y0 c1y0Var = this.F;
        if (c1y0Var != null) {
            ?? r3 = c1y0Var.l;
            c1y0Var.c();
            ((View) r3.getValue()).setAlpha(z ? 1.0f : 0.4f);
            ((View) r3.getValue()).setEnabled(z);
        }
    }

    public final void setAttachLimitHintEnabled(boolean z) {
        this.C.t = z;
    }

    public final void setAttachLimitToastEnabled(boolean z) {
        this.C.u = z;
    }

    public final void setAttachLimits(int i) {
        this.C.s = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void setAttachNewDot(boolean z) {
        bwt0.p0(getWriteBarAttachNewDot(), z);
        c1y0 c1y0Var = this.F;
        if (c1y0Var != null) {
            c1y0Var.c();
            bwt0.p0((View) c1y0Var.m.getValue(), z);
        }
    }

    public final void setAttachUploader(pc pcVar) {
        com.vk.writebar.c cVar = this.C;
        p34 p34Var = new p34(cVar);
        CopyOnWriteArrayList<o34.a> copyOnWriteArrayList = pcVar.b;
        if (!copyOnWriteArrayList.contains(p34Var)) {
            copyOnWriteArrayList.add(p34Var);
        }
        cVar.y = pcVar;
        icq0.a aVar = cVar.x;
        if (aVar == null) {
            aVar = null;
        }
        CopyOnWriteArrayList<o34.a> copyOnWriteArrayList2 = pcVar.b;
        if (copyOnWriteArrayList2.contains(aVar)) {
            return;
        }
        copyOnWriteArrayList2.add(aVar);
    }

    public final void setAudioMsgRecordingAllowed(boolean z) {
        if (getGroupMessengerEnabled()) {
            this.v = z;
        }
        if (this.y.a(WriteBarPermissionsHolder.Permission.AUDIO_MSG, z)) {
            if (z) {
                ImageView buttonRecordAudio = getButtonRecordAudio();
                iut0.q(buttonRecordAudio, new p0y0());
                am.a aVar = am.a.e;
                String string = buttonRecordAudio.getResources().getString(R.string.accessibility_msg_record_audiomsg);
                g gVar = this.B;
                iut0.o(buttonRecordAudio, aVar, string, new com.vk.movika.sdk.android.defaultplayer.container.a(buttonRecordAudio, gVar));
                ImageView buttonRecordAudio2 = getButtonRecordAudio();
                gVar.getClass();
                buttonRecordAudio2.setOnTouchListener(new t0y0(gVar));
            } else {
                getButtonRecordAudio().setOnTouchListener(null);
            }
            J(false);
        }
    }

    public final void setAutoSuggestPopupListener(StickersView.c cVar) {
        this.E.j = cVar;
    }

    public final void setAutoSuggestTextProvider(lk5 lk5Var) {
        y1y0 y1y0Var = this.E;
        y1y0Var.k = lk5Var;
        if (lk5Var != null) {
            y1y0Var.a().setAutoSuggestTextProvider(lk5Var);
        }
    }

    public final void setBotKeyboardAllowed(boolean z) {
        if (this.y.a(WriteBarPermissionsHolder.Permission.BOT_KEYBOARD, z)) {
            if (z) {
                getBotKeyboardButton().setVisibility(0);
                getBotKeyboardButton().animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(150L).start();
            } else if (getBotKeyboardButton().getVisibility() == 0) {
                getBotKeyboardButton().animate().translationX(iah0.a(24)).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(0.5f).scaleY(0.5f).setDuration(150L).setListener(new e()).start();
            }
        }
    }

    public final void setBottomGradientView(View view) {
        this.E.a().l(view);
    }

    public final void setBottomSheetContainer(ViewGroup viewGroup) {
        y1y0 y1y0Var = this.E;
        y1y0Var.i = viewGroup;
        if (viewGroup != null) {
            y1y0Var.a().setBottomSheetContainer(viewGroup);
        }
    }

    public final void setBottomSheetParams(ojf0 ojf0Var) {
        this.E.a().k(ojf0Var);
    }

    public final void setButtonSendAvailable(boolean z) {
        setSendButtonAvailable(z);
        bwt0.p0(getWriteBarActionContainer(), z);
    }

    public final void setCanPinAttachmentProvider(gzs<Boolean> gzsVar) {
        this.C.z = gzsVar;
    }

    public final void setCanPostDonut(boolean z) {
        this.a0.t = z;
    }

    public final void setContextUser(ContextUser contextUser) {
        this.E.n = contextUser;
    }

    public final void setDialogId(long j) {
        this.W.a = j;
    }

    public final void setDialogTitle(String str) {
        this.c0.d = str;
    }

    public final void setDisallowParentInterceptTouchEvent(boolean z) {
        getState().h = true;
        if (z) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    public final void setDocumentsSearchAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.DOCUMENTS_SEARCH, z);
    }

    public final void setDonutPhotos(boolean z) {
        this.b0.s = z;
    }

    public final void setEditTextSelectionChangeListener(wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        this.N = wzsVar;
    }

    public final void setEmojiAllowed(boolean z) {
        y1y0 y1y0Var = this.E;
        y1y0Var.v = z;
        kcl0 kcl0Var = y1y0Var.l;
        awt0.v((ImageView) y1y0Var.f.getValue(), z);
        boolean z2 = false;
        awt0.v(y1y0Var.b(), z && y1y0Var.u && kcl0Var.O0() > 0);
        ImageView c2 = y1y0Var.c();
        if (z && kcl0Var.W()) {
            z2 = true;
        }
        awt0.v(c2, z2);
    }

    public final void setExpanded(boolean z) {
        this.e0.n = z;
    }

    public final void setFullscreenModeAllowed(boolean z) {
        setFullscreenModeAvailable(z);
        if (z && this.F == null) {
            this.F = new c1y0(this, this);
            U();
        }
    }

    public final void setGraffitiAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.GRAFFITY, z);
    }

    public final void setGroupId(Long l) {
        this.g0.u = l;
    }

    public final void setHidePopup(boolean z) {
        this.E.t = z;
    }

    public final void setIsSendButtonAlwaysEnabled(boolean z) {
        if (getState().r == z) {
            return;
        }
        getState().r = z;
        J(true);
    }

    public final void setKeyboardHeight(int i) {
        if (i != this.G) {
            this.G = i;
        }
        if (this.G == 0) {
            postDelayed(new f(), 150L);
        }
    }

    public final void setLocationAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.LOCATION, z);
    }

    public final void setLongtapStickerPopupGravity(int i) {
        this.E.a().t(i);
    }

    public final void setLongtapStickerPopupWindowSize(jzb0 jzb0Var) {
        this.E.a().m(jzb0Var);
    }

    public final void setMoneyRequestAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.MONEY_REQUEST, z);
    }

    public final void setMoneySendAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.MONEY_SEND, z);
    }

    public final void setOnBotKeyboardButtonClick(izs<? super View, s3q0> izsVar) {
        bwt0.i0(getBotKeyboardButton(), new d8k(izsVar, 8));
    }

    public final void setOnFullscreenListener(d1y0 d1y0Var) {
        this.M = d1y0Var;
    }

    public final void setOnlyPhotoFromGalleryAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.PHOTO_FROM_GALLERY, z);
    }

    public final void setOnlyPhotoFromVkAllowed(boolean z) {
        WriteBarPermissionsHolder.Permission permission = WriteBarPermissionsHolder.Permission.PHOTO_FROM_VK;
        WriteBarPermissionsHolder writeBarPermissionsHolder = this.y;
        writeBarPermissionsHolder.a(permission, z);
        writeBarPermissionsHolder.a(WriteBarPermissionsHolder.Permission.PHOTO_VIDEO_FROM_VK, !z);
    }

    public final void setOwnerId(UserId userId) {
        this.V.b = userId;
    }

    public final void setPhotoVideoFromVkAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.PHOTO_VIDEO_FROM_VK, z);
    }

    public final void setPlaceholderHint(int i) {
        getWriteBarEdit().setHint(i);
    }

    public final void setPollAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.POLL, z);
    }

    public final void setQuickStickerSuggestState(QuickStickerSuggestState quickStickerSuggestState) {
        this.E.a().e(quickStickerSuggestState);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void setResultFragment(FragmentImpl fragmentImpl) {
        com.vk.writebar.c cVar = this.C;
        cVar.k = fragmentImpl;
        if (cVar.h.isInitialized()) {
            cVar.c().setResultFragment(fragmentImpl);
        }
    }

    public final void setSettingsAvailable(boolean z) {
        setAreSettingsAvailable(z);
        if (getState().n) {
            return;
        }
        awt0.v(getButtonSettings(), getAreSettingsAvailable());
    }

    public final void setShowKeyboardIcon(boolean z) {
        this.Q.k = z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void setShowPhotoEditorEntryPoints(boolean z) {
        com.vk.writebar.c cVar = this.C;
        cVar.n = z;
        if (cVar.h.isInitialized()) {
            cVar.c().setShowPhotoEditorEntryPoints(z);
        }
    }

    public final void setSource(Source source) {
        this.f0.o = source;
    }

    public final void setStickersSuggestEnabled(boolean z) {
        y1y0 y1y0Var = this.E;
        if (!z) {
            y1y0Var.a().disable();
        } else {
            if (y1y0Var.a().isEnabled().get()) {
                return;
            }
            y1y0Var.a().enable();
        }
    }

    public final void setStoriesAllowed(boolean z) {
        this.y.a(WriteBarPermissionsHolder.Permission.STORY, z);
    }

    public final void setTemplatesAvailable(boolean z) {
        setTemplatesButtonAvailable(z);
        awt0.v(getButtonTemplates(), z);
    }

    public final void setTemplatesButtonClick(izs<? super View, s3q0> izsVar) {
        bwt0.i0(getButtonTemplates(), new lse(izsVar, 5));
    }

    public final void setText(CharSequence charSequence) {
        getWriteBarEdit().setText(charSequence);
        J(true);
    }

    public final void setThemeBinder(kkm kkmVar) {
        b2y0 b2y0Var = this.z;
        kkm kkmVar2 = b2y0Var.b;
        if (kkmVar2 != null) {
            kkmVar2.h(b2y0Var.a);
        }
        b2y0Var.b = kkmVar;
        if (kkmVar != null) {
            kkmVar.e(this, new r1d(10));
        } else {
            Ng();
        }
    }

    public final void setTimeProgress(int i) {
        this.B.h(i);
    }

    public final void setTopicId(int i) {
        this.d0.c = i;
    }

    public final void setUpdateBottomSheet(boolean z) {
        this.H.c = z;
    }

    public final void setUseLongtapStickerScreenSize(boolean z) {
        this.E.a().h(z);
    }

    public final void setVideoMsgRecordingAllowed(boolean z) {
        if (this.y.a(WriteBarPermissionsHolder.Permission.VIDEO_MSG, z)) {
            if (z) {
                ImageView buttonRecordVideo = getButtonRecordVideo();
                final g gVar = this.B;
                gVar.getClass();
                buttonRecordVideo.setOnTouchListener(new com.vk.writebar.d(gVar));
                final ImageView buttonRecordVideo2 = getButtonRecordVideo();
                iut0.o(buttonRecordVideo2, am.a.e, buttonRecordVideo2.getResources().getString(R.string.accessibility_msg_record_videomsg), new zm() { // from class: xsna.n0y0
                    @Override // xsna.zm
                    public final boolean a(View view) {
                        Context context = buttonRecordVideo2.getContext();
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        Activity h = e3m.h(context);
                        permissionHelper.getClass();
                        String[] strArr = PermissionHelper.j;
                        com.vk.writebar.g gVar2 = gVar;
                        WriteBar writeBar = this;
                        if (!permissionHelper.d(h, strArr, R.string.vkim_permissions_microphone, R.string.vkim_permissions_microphone, new kg(29, gVar2, writeBar), new d7l0(23))) {
                            return true;
                        }
                        h1y0 h1y0Var = gVar2.d;
                        if (h1y0Var != null) {
                            h1y0Var.c(false);
                        }
                        writeBar.l0();
                        return true;
                    }
                });
                iut0.o(buttonRecordVideo2, am.a.f, buttonRecordVideo2.getResources().getString(R.string.accessibility_msg_record_videomsg), new zm() { // from class: xsna.o0y0
                    @Override // xsna.zm
                    public final boolean a(View view) {
                        Context context = buttonRecordVideo2.getContext();
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        Activity h = e3m.h(context);
                        permissionHelper.getClass();
                        String[] strArr = PermissionHelper.j;
                        com.vk.writebar.g gVar2 = gVar;
                        WriteBar writeBar = this;
                        if (permissionHelper.d(h, strArr, R.string.vkim_permissions_microphone, R.string.vkim_permissions_microphone, new kg(29, gVar2, writeBar), new d7l0(23))) {
                            h1y0 h1y0Var = gVar2.d;
                            if (h1y0Var != null) {
                                h1y0Var.c(true);
                            }
                            writeBar.m0();
                        }
                        return true;
                    }
                });
            } else {
                getButtonRecordVideo().setOnTouchListener(null);
            }
            J(false);
            I();
        }
    }

    public final void setWriteBarAttachesListener(s0y0 s0y0Var) {
        this.C.g = s0y0Var;
    }

    public final void setWriteBarCommentListener(z0y0 z0y0Var) {
        this.D.d = z0y0Var;
    }

    public final void setWriteBarDividerColor(int i) {
        y0y0 y0y0Var = this.D;
        y0y0Var.b();
        ((View) y0y0Var.i.getValue()).setBackgroundColor(i);
    }

    public final void setWriteBarDividerMarginHorizontal(int i) {
        y0y0 y0y0Var = this.D;
        y0y0Var.b();
        bpn0 bpn0Var = y0y0Var.i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) bpn0Var.getValue()).getLayoutParams();
        marginLayoutParams.setMargins(i, marginLayoutParams.topMargin, i, marginLayoutParams.bottomMargin);
        ((View) bpn0Var.getValue()).setLayoutParams(marginLayoutParams);
    }

    public final void setWriteBarDividerVisible(boolean z) {
        bwt0.p0(getDividerTopWritebar(), z);
    }

    public final void setWriteBarInputListener(e1y0 e1y0Var) {
        this.K = e1y0Var;
    }

    public final void setWriteBarMediaListener(h1y0 h1y0Var) {
        this.B.d = h1y0Var;
    }

    public final void setWriteBarReplyMessageListener(r1y0 r1y0Var) {
        this.J = r1y0Var;
    }

    public final void setWriteBarSendListener(s1y0 s1y0Var) {
        this.I = s1y0Var;
        U();
    }

    public final void setWriteBarSettingsListener(t1y0 t1y0Var) {
        this.L = t1y0Var;
        U();
    }

    public final void setWriteBarStickersListener(z1y0 z1y0Var) {
        this.E.d = z1y0Var;
    }

    public final void t() {
        this.E.a().s(false);
    }

    public final void x(List<CnvMsgId> list) {
        com.vk.writebar.c cVar;
        Attachment attachment;
        do {
            cVar = this.C;
            Iterator<Attachment> it = cVar.c().getAll().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    attachment = null;
                    break;
                }
                attachment = it.next();
                if (attachment instanceof FwdMessagesAttachment) {
                    break;
                } else {
                    i++;
                }
            }
            if (attachment != null) {
                AttachmentsEditorView c2 = cVar.c();
                c2.getClass();
                try {
                    c2.b.removeViewAt(i);
                    c2.c.remove(attachment);
                } catch (Exception unused) {
                }
            }
        } while (attachment != null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long valueOf = Long.valueOf(((CnvMsgId) obj).b);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((CnvMsgId) it2.next()).c));
            }
            arrayList.add(new FwdMessagesAttachment(longValue, arrayList2));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            cVar.a((FwdMessagesAttachment) it3.next());
        }
        this.A.a();
    }

    public final void z(int i, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(getMeasuredHeight(), z ? View.MeasureSpec.getSize(getContext().getResources().getDisplayMetrics().heightPixels) - i : getCollapsedHeight()).setDuration(300L);
        duration.addUpdateListener(new xi2(this, 3));
        xo2.h(duration, new gzs() { // from class: xsna.l0y0
            @Override // xsna.gzs
            public final Object invoke() {
                return WriteBar.j(z, this);
            }
        });
        duration.start();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WriteBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        gxw0 gxw0Var = new gxw0(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, gxw0Var);
        this.c = msy.a(lazyThreadSafetyMode, new ghn0(this, 24));
        this.d = msy.a(lazyThreadSafetyMode, new pvh0(this, 26));
        this.e = msy.a(lazyThreadSafetyMode, new rme0(this, 25));
        this.f = msy.a(lazyThreadSafetyMode, new sxq0(this, 6));
        this.g = msy.a(lazyThreadSafetyMode, new ajd0(this, 25));
        this.h = msy.a(lazyThreadSafetyMode, new vpn0(this, 21));
        this.i = msy.a(lazyThreadSafetyMode, new g8n0(this, 20));
        this.j = msy.a(lazyThreadSafetyMode, new c9m0(this, 18));
        this.k = msy.a(lazyThreadSafetyMode, new ivs0(this, 7));
        this.l = msy.a(lazyThreadSafetyMode, new acp0(this, 12));
        int i2 = 24;
        this.m = msy.a(lazyThreadSafetyMode, new cck0(this, i2));
        this.n = msy.a(lazyThreadSafetyMode, new dck0(this, i2));
        this.o = msy.a(lazyThreadSafetyMode, new clt0(this, 9));
        this.p = msy.a(lazyThreadSafetyMode, new dbj0(this, 22));
        this.q = msy.a(lazyThreadSafetyMode, new vpj0(this, 24));
        this.r = msy.a(lazyThreadSafetyMode, new mlf0(this, 29));
        this.s = msy.a(lazyThreadSafetyMode, new x3x0(this, 1));
        this.t = msy.a(lazyThreadSafetyMode, new rmu0(this, 4));
        this.u = msy.a(lazyThreadSafetyMode, new vqe0(20));
        int i3 = 1;
        this.v = true;
        h hVar = new h();
        hVar.e = true;
        hVar.g = 8;
        hVar.j = true;
        hVar.k = true;
        hVar.o = Source.DIALOG;
        hVar.p = true;
        hVar.u = 0L;
        this.x = hVar;
        WriteBarPermissionsHolder writeBarPermissionsHolder = new WriteBarPermissionsHolder();
        this.y = writeBarPermissionsHolder;
        b2y0 b2y0Var = new b2y0(this);
        this.z = b2y0Var;
        this.A = new q1y0(this, this, b2y0Var);
        g gVar = new g(this, this, b2y0Var);
        this.B = gVar;
        com.vk.writebar.c cVar = new com.vk.writebar.c(this, this, gVar, writeBarPermissionsHolder, b2y0Var, ((DialogDraftUpdaterComponent) ((k7m) m7m.c(this)).mo408a(fpf0.a(DialogDraftUpdaterComponent.class))).V1());
        this.C = cVar;
        this.D = new y0y0(this, cVar, this);
        this.E = new y1y0(this, this, b2y0Var);
        this.H = new c();
        ArrayList arrayList = new ArrayList();
        this.P = arrayList;
        this.Q = getState();
        this.R = getState();
        this.S = getState();
        this.T = getState();
        this.U = getState();
        this.V = getState();
        this.W = getState();
        this.a0 = getState();
        this.b0 = getState();
        this.c0 = getState();
        this.d0 = getState();
        this.e0 = getState();
        this.f0 = getState();
        this.g0 = getState();
        Object[] objArr = attributeSet != null && attributeSet.getAttributeBooleanValue(0, false);
        HashSet<WriteBarPermissionsHolder.Permission> hashSet = writeBarPermissionsHolder.a;
        if (objArr != false) {
            hashSet.add(WriteBarPermissionsHolder.Permission.AUDIO_MSG);
        }
        hashSet.add(WriteBarPermissionsHolder.Permission.LOCATION);
        hashSet.add(WriteBarPermissionsHolder.Permission.PHOTO_VIDEO_FROM_VK);
        hashSet.add(WriteBarPermissionsHolder.Permission.DOCUMENTS_SEARCH);
        if (context instanceof l7s) {
            setBackgroundColor(e3m.f(R.attr.vk_ui_background_modal, context));
        } else {
            bwt0.Z(R.attr.vk_ui_background_modal, this);
        }
        setOrientation(1);
        View.inflate(context, R.layout.write_bar, this);
        bwt0.i0(getButtonSettings(), new kyq0(this, 19));
        bwt0.i0(getButtonSend(), new ujm0(this, 25));
        bwt0.k0(getButtonSend(), new gsq0(this, 15));
        bwt0.i0(getWriteBarAttach(), new b0y0(this, 0));
        icq0 icq0Var = new icq0(new cfz(cVar, 24), getContext());
        cVar.w = icq0Var;
        cVar.x = icq0Var.new a();
        bpn0 bpn0Var = zgv0.a.a;
        cra a2 = ((zgv0) (bpn0Var == null ? null : bpn0Var).getValue()).a();
        ((HashSet) a2.b).add(MimeType.IMAGE);
        icq0 icq0Var2 = cVar.w;
        ((HashSet) a2.c).add(icq0Var2 == null ? null : icq0Var2);
        a2.a(getInput());
        ual ualVar = new ual(new itz0(cVar));
        p34 p34Var = new p34(cVar);
        CopyOnWriteArrayList<o34.a> copyOnWriteArrayList = ualVar.b;
        if (!copyOnWriteArrayList.contains(p34Var)) {
            copyOnWriteArrayList.add(p34Var);
        }
        cVar.y = ualVar;
        icq0.a aVar = cVar.x;
        aVar = aVar == null ? null : aVar;
        if (!copyOnWriteArrayList.contains(aVar)) {
            copyOnWriteArrayList.add(aVar);
        }
        J(false);
        getViewTreeObserver().addOnPreDrawListener(new a());
        u1u0.g(this);
        arrayList.add(new View.OnKeyListener() { // from class: xsna.c0y0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                Boolean bool;
                int i5 = WriteBar.h0;
                boolean z = keyEvent.getAction() == 0;
                boolean z2 = keyEvent.getKeyCode() == 66;
                if (z && z2 && !keyEvent.isShiftPressed()) {
                    boolean b2 = bay.c().b();
                    WriteBar writeBar = WriteBar.this;
                    boolean z3 = writeBar.getResources().getConfiguration().keyboard == 2;
                    if (writeBar.D.k == null && b2 && z3) {
                        s1y0 s1y0Var = writeBar.I;
                        if (s1y0Var != null) {
                            s1y0Var.b(writeBar.getInputState());
                            bool = Boolean.TRUE;
                        } else {
                            bool = null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        if (epx.f(bool, bool2) && writeBar.e0.n) {
                            writeBar.O();
                        }
                        return epx.f(bool, bool2);
                    }
                }
                return false;
            }
        });
        getWriteBarEdit().setOnKeyListener(new View.OnKeyListener() { // from class: xsna.d0y0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                ArrayList arrayList2 = WriteBar.this.P;
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (((View.OnKeyListener) arrayList2.get(i5)).onKey(view, i4, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
        });
        getWriteBarEdit().setOnTouchListener(new View.OnTouchListener() { // from class: xsna.e0y0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                e1y0 e1y0Var;
                int i4 = WriteBar.h0;
                if (1 != motionEvent.getAction() || (e1y0Var = WriteBar.this.K) == null) {
                    return false;
                }
                e1y0Var.j();
                return false;
            }
        });
        getWriteBarEdit().addTextChangedListener(new b());
        getWriteBarEdit().setSelectionChangeListener(new RichEditText.c() { // from class: xsna.f0y0
            @Override // com.vk.im.ui.views.RichEditText.c
            public final void b(int i4, int i5) {
                WriteBar writeBar = WriteBar.this;
                if (writeBar.e0.n) {
                    writeBar.P(false);
                }
                wzs<? super Integer, ? super Integer, s3q0> wzsVar = writeBar.N;
                if (wzsVar != null) {
                    wzsVar.invoke(Integer.valueOf(i4), Integer.valueOf(i5));
                }
            }
        });
        getWriteBarFullscreenScrollContainer().setOnTouchListener(new qkt0(this, 1));
        getWriteBarEdit().setOnTextPastedListener(new x9x0(this, 1));
        Z();
        L();
        g2v.c().k();
        LocalMediaGalleryProvider localMediaGalleryProvider = new LocalMediaGalleryProvider(null == true ? 1 : 0, i3, null == true ? 1 : 0);
        Context context2 = e43.a;
        localMediaGalleryProvider.prefetch(context2 != null ? context2 : null);
        RichEditText writeBarEdit = getWriteBarEdit();
        writeBarEdit.post(new q86(writeBarEdit, 13));
    }

    public final void setPlaceholderHint(String str) {
        getWriteBarEdit().setHint(str);
    }
}
