package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.ProgressView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.im.ui.views.RichEditText;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.common.util.CommentDraft;
import com.vk.pending.PendingGraffitiAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import kotlin.collections.EmptyList;
import xsna.xgy;

/* compiled from: ReplyBarView.kt */
/* loaded from: classes4.dex */
public final class u3g0 implements c3g0, View.OnLongClickListener {
    public final Integer b;
    public m3g0 c;
    public gzs<Boolean> d;
    public WriteBar e;
    public EditText f;
    public ImageView g;
    public View h;
    public View i;
    public StickersView j;
    public xgy k;
    public g l;
    public q420 m;
    public boolean n;
    public int o;
    public final a p;
    public final c q;
    public final e r;
    public final b s;
    public final d t;
    public final f u;

    /* compiled from: ReplyBarView.kt */
    public static final class a extends StickersView.c {
        public a() {
        }

        @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
        public final void b(String str) {
            EditText editText = u3g0.this.f;
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.getText().insert(selectionEnd, str);
            int length = str.length() + selectionEnd;
            if (length <= editText.length()) {
                editText.setSelection(length, length);
            }
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final boolean i() {
            return his0.s(u3g0.this.f);
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void j() {
            EditText editText = u3g0.this.f;
            if (editText != null) {
                editText.dispatchKeyEvent(new KeyEvent(0, 67));
            }
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void n(int i) {
            u3g0 u3g0Var = u3g0.this;
            xgy xgyVar = u3g0Var.k;
            if (xgyVar != null) {
                int i2 = xgy.F;
                xgyVar.h(null);
            }
            StickersView stickersView = u3g0Var.j;
            if (stickersView != null) {
                stickersView.g(i);
            }
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void p(StickerItem stickerItem, int i, String str) {
            u3g0 u3g0Var = u3g0.this;
            m3g0 m3g0Var = u3g0Var.c;
            if (m3g0Var != null) {
                StickerAttachment stickerAttachment = new StickerAttachment(stickerItem, i, str);
                int i2 = stickerAttachment.f.b;
                StickerAttachment.k.getClass();
                StickerAttachment.m = i2;
                m3g0Var.D0(stickerAttachment, true);
            }
            WriteBar writeBar = u3g0Var.e;
            if (writeBar != null) {
                writeBar.t();
            }
        }
    }

    /* compiled from: ReplyBarView.kt */
    public static final class c implements z0y0 {
        public c() {
        }

        @Override // xsna.z0y0
        public final void a(boolean z, boolean z2) {
            u3g0 u3g0Var = u3g0.this;
            gzs<Boolean> gzsVar = u3g0Var.d;
            if (gzsVar == null || !gzsVar.invoke().booleanValue()) {
                WriteBar writeBar = u3g0Var.e;
                if (writeBar == null || !writeBar.e()) {
                    m3g0 m3g0Var = u3g0Var.c;
                    if (m3g0Var != null) {
                        m3g0Var.i1(z, z2);
                        return;
                    }
                    return;
                }
                ner0 G = u3g0Var.G();
                WriteBar writeBar2 = u3g0Var.e;
                if (writeBar2 != null) {
                    writeBar2.f(new r3g0(G, u3g0Var, z, z2), new m50(G, 6));
                }
            }
        }

        @Override // xsna.z0y0
        public final void b(String str) {
            m3g0 m3g0Var = u3g0.this.c;
            if (m3g0Var != null) {
                m3g0Var.b.h0(str);
            }
        }
    }

    /* compiled from: ReplyBarView.kt */
    public static final class e implements s1y0 {
        public e() {
        }

        @Override // xsna.s1y0
        public final void a(f1y0 f1y0Var) {
            u3g0 u3g0Var = u3g0.this;
            gzs<Boolean> gzsVar = u3g0Var.d;
            boolean z = true;
            if (gzsVar == null || !gzsVar.invoke().booleanValue()) {
                WriteBar writeBar = u3g0Var.e;
                boolean z2 = false;
                if (writeBar == null || !writeBar.e()) {
                    m3g0 m3g0Var = u3g0Var.c;
                    if (m3g0Var != null) {
                        m3g0Var.i1(true, false);
                        return;
                    }
                    return;
                }
                ner0 G = u3g0Var.G();
                WriteBar writeBar2 = u3g0Var.e;
                if (writeBar2 != null) {
                    writeBar2.f(new r3g0(G, u3g0Var, z, z2), new m50(G, 6));
                }
            }
        }

        @Override // xsna.s1y0
        public final void b(f1y0 f1y0Var) {
            a(f1y0Var);
        }

        @Override // xsna.s1y0
        public final boolean c() {
            return false;
        }
    }

    /* compiled from: ReplyBarView.kt */
    public static final class f implements z1y0 {
        public f() {
        }

        @Override // xsna.z1y0
        public final void f() {
            g gVar = u3g0.this.l;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // xsna.z1y0
        public final void g() {
            g gVar = u3g0.this.l;
            if (gVar != null) {
                gVar.b();
            }
        }

        @Override // xsna.z1y0
        public final void i() {
            xgy xgyVar;
            u3g0 u3g0Var = u3g0.this;
            gzs<Boolean> gzsVar = u3g0Var.d;
            if ((gzsVar == null || !gzsVar.invoke().booleanValue()) && (xgyVar = u3g0Var.k) != null) {
                xgyVar.k();
            }
        }
    }

    public u3g0() {
        this(null);
    }

    public static void B(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            B(viewGroup.getChildAt(i), z);
            i++;
        }
    }

    public final void A(float f2) {
        ViewGroup bottomSheetContainer;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = Math.abs(f2);
        }
        WriteBar writeBar = this.e;
        if (writeBar != null && (bottomSheetContainer = writeBar.getBottomSheetContainer()) != null) {
            f4m.q((int) f3, bottomSheetContainer);
        }
        WriteBar writeBar2 = this.e;
        if (writeBar2 != null) {
            writeBar2.setTranslationY(f2);
        }
    }

    public final void C(int i) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3 = this.g;
        if (imageView3 != null) {
            Context context = imageView3.getContext();
            imageView3.setImageDrawable(context != null ? enj.c(R.drawable.vk_icon_attach_outline_28, i, context) : null);
        }
        WriteBar writeBar = this.e;
        if (writeBar != null && (imageView2 = (ImageView) writeBar.findViewById(R.id.writebar_emoji)) != null) {
            imageView2.setImageTintList(ColorStateList.valueOf(i));
        }
        WriteBar writeBar2 = this.e;
        if (writeBar2 == null || (imageView = (ImageView) writeBar2.findViewById(R.id.writebar_send)) == null) {
            return;
        }
        imageView.setImageTintList(ColorStateList.valueOf(i));
    }

    public final void E(View.OnClickListener onClickListener) {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.setClickable(true);
            writeBar.setFocusable(true);
            writeBar.setOnClickListener(onClickListener);
        }
    }

    public final ner0 G() {
        ner0 ner0Var = new ner0(getContext());
        ner0Var.setMessage(ner0Var.getContext().getString(R.string.loading));
        ner0Var.setCancelable(true);
        ner0Var.setCanceledOnTouchOutside(false);
        ner0Var.show();
        return ner0Var;
    }

    public final void Ic(boolean z) {
        if (!z) {
            xgy xgyVar = this.k;
            if (xgyVar != null) {
                xgyVar.d();
                return;
            }
            return;
        }
        xgy xgyVar2 = this.k;
        if (xgyVar2 != null) {
            xgyVar2.g();
            xgy.b bVar = xgyVar2.o;
            if (bVar != null) {
                bVar.D();
            }
        }
    }

    public final void Nh(UserId userId, String str) {
        q420 q420Var = this.m;
        if (q420Var != null) {
            q420Var.Q(userId, str, (r3 & 4) == 0);
        }
    }

    public final void b() {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.setText("");
        }
        WriteBar writeBar2 = this.e;
        if (writeBar2 != null) {
            writeBar2.F();
        }
        m3g0 m3g0Var = this.c;
        if (m3g0Var != null) {
            CommentDraft commentDraft = m3g0Var.m;
            NewsComment newsComment = commentDraft.b;
            newsComment.b = "";
            newsComment.J = null;
            newsComment.k = 0;
            commentDraft.c = null;
        }
        if (m3g0Var != null) {
            m3g0Var.x();
        }
    }

    public final void c(String str) {
        if (str != null) {
            WriteBar writeBar = this.e;
            if (writeBar != null) {
                writeBar.j0(str);
                return;
            }
            return;
        }
        WriteBar writeBar2 = this.e;
        if (writeBar2 != null) {
            f4m.j(writeBar2);
        }
    }

    @Override // xsna.c3g0
    public final void ci(ResultReceiver resultReceiver, boolean z) {
        xgy xgyVar;
        if (m() && (xgyVar = this.k) != null) {
            xgyVar.d();
        }
        long j = z ? 300L : 0L;
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.postDelayed(new qyc(4, this, resultReceiver), j);
        }
    }

    public final void clearFocus() {
        EditText editText;
        EditText editText2 = this.f;
        if (editText2 == null || !editText2.hasFocus() || (editText = this.f) == null) {
            return;
        }
        editText.clearFocus();
    }

    public final void d(String str, List<? extends Attachment> list) {
        EditText editText = this.f;
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.F();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writeBar.A1((Attachment) it.next());
            }
        }
    }

    public final List<Attachment> f() {
        ArrayList<Attachment> attachments;
        WriteBar writeBar = this.e;
        return (writeBar == null || (attachments = writeBar.getAttachments()) == null) ? EmptyList.b : attachments;
    }

    public final Context getContext() {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            return writeBar.getContext();
        }
        return null;
    }

    public final CharSequence getText() {
        String b2;
        q420 q420Var = this.m;
        return (q420Var == null || (b2 = q420Var.b()) == null) ? "" : b2;
    }

    public final int h() {
        WriteBar writeBar = this.e;
        int height = writeBar != null ? writeBar.getHeight() : 0;
        if (height != 0) {
            return height;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        WriteBar writeBar2 = this.e;
        if (writeBar2 != null) {
            writeBar2.measure(makeMeasureSpec, makeMeasureSpec);
        }
        WriteBar writeBar3 = this.e;
        if (writeBar3 != null) {
            return writeBar3.getMeasuredHeight();
        }
        return 0;
    }

    public final String i() {
        Editable text;
        String obj;
        EditText editText = this.f;
        return (editText == null || (text = editText.getText()) == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final void in() {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            y0y0 y0y0Var = writeBar.D;
            WriteBar writeBar2 = y0y0Var.c;
            fcg fcgVar = (fcg) ((bxx) bay.c().a().a(m6r0.X0));
            ArrayList<String> arrayList = fcgVar != null ? fcgVar.c : null;
            if (arrayList == null || arrayList.isEmpty()) {
                z0y0 z0y0Var = y0y0Var.d;
                if (z0y0Var != null) {
                    y0y0Var.c.getInputState();
                    z0y0Var.a(true, false);
                    return;
                }
                return;
            }
            String str = arrayList.get(new Random().nextInt(arrayList.size()));
            y0y0Var.b();
            ((ViewGroup) y0y0Var.f.getValue()).setVisibility(0);
            y0y0Var.d();
            ((TextView) y0y0Var.h.getValue()).setText(str);
            y0y0Var.a().setProgressValue(0);
            y0y0Var.a().setVisibility(0);
            y0y0Var.a().setProgressDuration(fcgVar.b * 1000);
            y0y0Var.a().setProgressValue(100);
            writeBar2.setAddAttachAllowed(false);
            Timer timer = y0y0Var.k;
            if (timer != null) {
                timer.cancel();
            }
            y0y0Var.l = new x0y0(y0y0Var);
            Timer timer2 = new Timer();
            timer2.schedule(y0y0Var.l, fcgVar.b * 1000);
            y0y0Var.k = timer2;
            writeBar2.J(true);
            ProgressView a2 = y0y0Var.a();
            j6r0.a(a2);
            a2.setAlpha(1.0f);
            a2.setScaleX(1.0f);
            a2.setScaleY(1.0f);
            a2.setVisibility(0);
            a2.setEnabled(true);
        }
    }

    public final void j(boolean z) {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.n(z);
        }
    }

    public final void l() {
        ImageView imageView = this.g;
        if (imageView != null) {
            f4m.j(imageView);
        }
        EditText editText = this.f;
        RichEditText richEditText = editText instanceof RichEditText ? (RichEditText) editText : null;
        if (richEditText != null) {
            f4m.s(iah0.a(14), richEditText);
            richEditText.setExtraContentListener(null);
        }
    }

    public final boolean m() {
        xgy xgyVar = this.k;
        return xgyVar != null && xgyVar.e();
    }

    public final void n(int i, int i2, Intent intent) {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.onActivityResult(i, i2, intent);
        }
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        m3g0 m3g0Var = this.c;
        if (m3g0Var != null) {
            m3g0Var.h0(bundle);
        }
        return bundle;
    }

    public final void onDestroyView() {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.setResultFragment(null);
        }
        WriteBar writeBar2 = this.e;
        if (writeBar2 != null) {
            writeBar2.N();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (jjc.b() || view == null || !view.equals(this.h)) {
            return false;
        }
        m3g0 m3g0Var = this.c;
        if (m3g0Var != null && !t6g0.b().g0(m3g0Var.b.p())) {
            return false;
        }
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.getMenu().add(R.string.reply_from_group);
        popupMenu.setOnMenuItemClickListener(new g6h(this, 1));
        popupMenu.show();
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void p(View view, Bundle bundle, Window window) {
        m3g0 m3g0Var;
        WriteBar writeBar;
        WriteBar writeBar2;
        Context h = e3m.h(view.getContext());
        if (h == null) {
            return;
        }
        Integer num = this.b;
        if (num != null) {
            h = new l7s(h, num.intValue());
        }
        wn4 wn4Var = null;
        this.e = new WriteBar(h, null, 6);
        Activity h2 = e3m.h(view.getContext());
        if (h2 != null && (writeBar = this.e) != null) {
            ViewGroup bottomSheetContainer = writeBar.getBottomSheetContainer();
            if (bottomSheetContainer != null) {
                writeBar.setBottomSheetContainer(bottomSheetContainer);
            }
            v();
            if (view instanceof CoordinatorLayout) {
                WriteBar writeBar3 = this.e;
                if (writeBar3 != null) {
                    CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
                    fVar.c = 81;
                    writeBar3.setLayoutParams(fVar);
                }
            } else if ((view instanceof FrameLayout) && (writeBar2 = this.e) != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 81;
                writeBar2.setLayoutParams(layoutParams);
            }
            WriteBar writeBar4 = this.e;
            if (writeBar4 != null) {
                writeBar4.P.add(new View.OnKeyListener() { // from class: xsna.o3g0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                        u3g0 u3g0Var;
                        xgy xgyVar;
                        xgy xgyVar2;
                        if (i != 4 || (xgyVar = (u3g0Var = u3g0.this).k) == null || !xgyVar.e()) {
                            return false;
                        }
                        if (keyEvent.getAction() == 1 && (xgyVar2 = u3g0Var.k) != null) {
                            xgyVar2.g();
                            xgy.b bVar = xgyVar2.o;
                            if (bVar != null) {
                                bVar.D();
                            }
                        }
                        return true;
                    }
                });
            }
            writeBar.setShowKeyboardIcon(false);
            WriteBar writeBar5 = this.e;
            if (writeBar5 != null) {
                View findViewById = writeBar5.findViewById(R.id.writebar_edit);
                RichEditText richEditText = (RichEditText) findViewById;
                richEditText.setSelectionChangeListener(new s3g0(this));
                richEditText.setHint(R.string.comment);
                m3g0 m3g0Var2 = this.c;
                if (m3g0Var2 != null) {
                    q420 q420Var = new q420(richEditText, m3g0Var2, wn4Var, 28);
                    q420Var.e(true);
                    q420Var.g = new hr80();
                    richEditText.addTextChangedListener(q420Var);
                    this.m = q420Var;
                }
                richEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16384)});
                richEditText.addTextChangedListener(new t3g0(this));
                richEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.p3g0
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        EditText editText;
                        u3g0 u3g0Var = u3g0.this;
                        if (!z) {
                            u3g0Var.getClass();
                            return;
                        }
                        gzs<Boolean> gzsVar = u3g0Var.d;
                        if (gzsVar != null) {
                            if (gzsVar.invoke().booleanValue()) {
                                editText = view2 instanceof EditText ? (EditText) view2 : null;
                                if (editText != null) {
                                    editText.setCursorVisible(false);
                                }
                                view2.clearFocus();
                                return;
                            }
                            editText = view2 instanceof EditText ? (EditText) view2 : null;
                            if (editText != null) {
                                editText.setCursorVisible(true);
                            }
                        }
                    }
                });
                this.f = (EditText) findViewById;
            }
            this.g = (ImageView) writeBar.findViewById(R.id.writebar_attach);
            View findViewById2 = writeBar.findViewById(R.id.writebar_send);
            findViewById2.setOnLongClickListener(this);
            this.h = findViewById2;
            Context context = writeBar.getContext();
            Window window2 = window == null ? h2.getWindow() : window;
            a aVar = this.p;
            StickersView stickersView = new StickersView(context, aVar, window2);
            xgy xgyVar = new xgy(h2, view, stickersView, window == null ? h2.getWindow() : window, null, 112);
            xgyVar.a(writeBar.getEmojiAnchor(), null);
            xgyVar.o = writeBar;
            this.k = xgyVar;
            this.j = stickersView;
            stickersView.setStickersKeyboardContext(b.a.a);
            writeBar.setAutoSuggestPopupListener(aVar);
            m3g0 m3g0Var3 = this.c;
            if (m3g0Var3 != null) {
                b3g0 b3g0Var = m3g0Var3.b;
                writeBar.setResultFragment(b3g0Var.g());
                writeBar.b(b3g0Var.p(), true);
                writeBar.setAutoSuggestTextProvider(m3g0Var3);
            }
            writeBar.setAttachLimits(2);
            writeBar.setGraffitiAllowed(true);
            writeBar.setLocationAllowed(false);
            writeBar.setWriteBarSendListener(this.r);
            writeBar.setWriteBarCommentListener(this.q);
            writeBar.setWriteBarStickersListener(this.u);
            writeBar.setWriteBarInputListener(this.t);
            writeBar.setWriteBarAttachesListener(this.s);
            writeBar.S(h2, null);
            View inflate = View.inflate(writeBar.getContext(), R.layout.reply_bar, null);
            this.i = inflate;
            writeBar.M(inflate);
            bwt0.p0(writeBar, false);
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).addView(this.e);
        }
        m3g0 m3g0Var4 = this.c;
        if (m3g0Var4 != null) {
            zfg zfgVar = (zfg) m3g0Var4.f.getValue();
            View view2 = m3g0Var4.c.i;
            b3g0 b3g0Var2 = m3g0Var4.b;
            m3g0Var4.l = zfgVar.a(view2, b3g0Var2.p(), b3g0Var2.f0(), b3g0Var2.i0(), new pm01(m3g0Var4));
            if (fkq0.c(b3g0Var2.p())) {
                m3g0Var4.r1();
            }
            m3g0Var4.n = false;
            io.reactivex.rxjava3.core.q h3 = wmi0.a.h(m3g0Var4.Z());
            skz skzVar = new skz(new r8a0(m3g0Var4, 13), 22);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            m3g0Var4.p = itg0.m(new io.reactivex.rxjava3.internal.operators.observable.c0(h3.E(skzVar, lVar, kVar, kVar).C(new vyb(m3g0Var4, 3)).E(lVar, lVar, kVar, new shd(m3g0Var4, 4)), lVar, new jf1(m3g0Var4, 7)));
        }
        if (bundle == null || (m3g0Var = this.c) == null) {
            return;
        }
        m3g0Var.g0(bundle);
    }

    public final void r() {
        m3g0 m3g0Var = this.c;
        if (m3g0Var != null) {
            m3g0Var.u0();
        }
    }

    public final void setActive(boolean z) {
        View emojiAnchor;
        float f2 = z ? 1.0f : 0.4f;
        EditText editText = this.f;
        if (editText != null) {
            editText.setAlpha(f2);
        }
        View view = this.h;
        if (view != null) {
            view.setAlpha(f2);
        }
        WriteBar writeBar = this.e;
        if (writeBar == null || (emojiAnchor = writeBar.getEmojiAnchor()) == null) {
            return;
        }
        emojiAnchor.setAlpha(f2);
    }

    public final void u(ViewGroup viewGroup) {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.setBottomSheetContainer(viewGroup);
        }
    }

    public final void v() {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.setHidePopup(true);
        }
    }

    public final void x(int i) {
        xgy xgyVar;
        xgy xgyVar2 = this.k;
        if ((xgyVar2 == null || !xgyVar2.e()) && (xgyVar = this.k) != null) {
            int i2 = xgy.F;
            xgyVar.h(null);
        }
        StickersView stickersView = this.j;
        if (stickersView != null) {
            stickersView.g(i);
        }
    }

    public final void y(String str) {
        WriteBar writeBar = this.e;
        if (writeBar != null) {
            writeBar.setText(str);
        }
    }

    public u3g0(Integer num) {
        this.b = num;
        this.o = 8;
        this.p = new a();
        this.q = new c();
        this.r = new e();
        this.s = new b();
        this.t = new d();
        this.u = new f();
    }

    /* compiled from: ReplyBarView.kt */
    public static final class b implements s0y0 {
        public b() {
        }

        @Override // xsna.s0y0
        public final void g() {
            WriteBar writeBar;
            ArrayList<Attachment> attachments;
            m3g0 m3g0Var;
            u3g0 u3g0Var = u3g0.this;
            if (u3g0Var.n || (writeBar = u3g0Var.e) == null || (attachments = writeBar.getAttachments()) == null || (m3g0Var = u3g0Var.c) == null) {
                return;
            }
            m3g0Var.m.b.J = new ArrayList<>(attachments);
            m3g0Var.S1();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.s0y0
        public final boolean i(Attachment attachment) {
            ArrayList<Attachment> attachments;
            boolean z = attachment instanceof PendingGraffitiAttachment;
            u3g0 u3g0Var = u3g0.this;
            if (z) {
                m3g0 m3g0Var = u3g0Var.c;
                if (m3g0Var != null) {
                    ju90 ju90Var = (ju90) attachment;
                    ner0 G = m3g0Var.c.G();
                    final ecq0 ecq0Var = new ecq0(ju90Var.S(), new l3g0(G, m3g0Var));
                    final com.vk.upload.impl.b y6 = ju90Var.y6();
                    G.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.k3g0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            com.vk.upload.impl.a.b(com.vk.upload.impl.b.this.d, null);
                            ecq0 ecq0Var2 = ecq0Var;
                            io.reactivex.rxjava3.disposables.c cVar = ecq0Var2.c;
                            if (cVar != null) {
                                cVar.dispose();
                                ecq0Var2.c = null;
                            }
                        }
                    });
                    ecq0Var.a();
                    com.vk.upload.impl.a.i(y6);
                    return true;
                }
            } else {
                if (!(attachment instanceof GraffitiAttachment)) {
                    WriteBar writeBar = u3g0Var.e;
                    if (writeBar != null && (attachments = writeBar.getAttachments()) != null) {
                        if (!(attachment instanceof PendingPhotoAttachment)) {
                            if (!(attachment instanceof PendingVideoAttachment)) {
                                return attachments.contains(attachment);
                            }
                            if (!attachments.isEmpty()) {
                                for (Attachment attachment2 : attachments) {
                                    if (attachment2 instanceof VideoAttachment) {
                                        VideoAttachment videoAttachment = (VideoAttachment) attachment2;
                                        PendingVideoAttachment pendingVideoAttachment = (PendingVideoAttachment) attachment;
                                        if (videoAttachment.k.o0() != pendingVideoAttachment.getId().intValue() || pendingVideoAttachment.getId().equals(0)) {
                                            VideoUrlStorage w9 = videoAttachment.k.w9();
                                            VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                                            if (epx.f(w9.Ab(videoUrl), pendingVideoAttachment.k.w9().Ab(videoUrl))) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (!attachments.isEmpty()) {
                            for (Attachment attachment3 : attachments) {
                                if (!(attachment3 instanceof PhotoAttachment) || !epx.f(((PhotoAttachment) attachment3).o, ((PendingPhotoAttachment) attachment).f)) {
                                }
                            }
                        }
                    }
                    return false;
                }
                m3g0 m3g0Var2 = u3g0Var.c;
                if (m3g0Var2 != null) {
                    m3g0Var2.D0(attachment, false);
                    return true;
                }
            }
            return true;
        }

        @Override // xsna.s0y0
        public final void e() {
        }

        @Override // xsna.s0y0
        public final void f() {
        }

        @Override // xsna.s0y0
        public final void c(List list, List list2) {
        }
    }

    /* compiled from: ReplyBarView.kt */
    public interface g {
        default void a() {
        }

        default void b() {
        }
    }

    /* compiled from: ReplyBarView.kt */
    public static final class d implements e1y0 {
        public d() {
        }

        @Override // xsna.e1y0
        public final void j() {
            u3g0 u3g0Var = u3g0.this;
            if (u3g0Var.m()) {
                u3g0Var.Ic(false);
            }
        }

        @Override // xsna.e1y0
        public final void e(Editable editable) {
        }
    }
}
