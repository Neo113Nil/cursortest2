package xsna;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.TransitionDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.stickers.StickerItem;
import com.vk.libvideo.live.api.view.WriteContract$State;
import com.vk.libvideo.live.impl.views.menubutton.MenuButtonNewView;
import com.vk.log.L;
import com.vk.stickers.ContextUser;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ify;
import xsna.m8v0;
import xsna.uko;
import xsna.xgy;

/* compiled from: WriteView.java */
/* loaded from: classes3.dex */
public final class f3y0 extends LinearLayout implements xgy.b, f2y0, gv5, l420, c30 {
    public final HashSet A;
    public int B;
    public boolean C;
    public final b D;
    public final boolean E;
    public WriteContract$State F;
    public Window G;
    public FrameLayout H;
    public boolean I;
    public boolean J;
    public boolean K;
    public StickersView L;
    public xgy M;
    public e2y0 N;
    public b30 O;
    public Toast P;
    public int Q;
    public io.reactivex.rxjava3.disposables.c R;
    public CharSequence S;
    public StickersView.c T;
    public boolean U;
    public boolean V;
    public final c W;
    public final d a0;
    public final ImageView b;

    @NonNull
    public final kcl0 b0;
    public final ImageView c;

    @NonNull
    public final dk5 c0;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final FrameLayout g;
    public final ImageView h;
    public final TextView i;
    public final FrameLayout j;
    public final VkCounter k;
    public final ImageView l;
    public final ImageView m;
    public final EditText n;
    public final ViewGroup o;
    public final ViewGroup p;
    public final ViewGroup q;
    public final MenuButtonNewView r;
    public q420 s;
    public final AutoSuggestStickersPopupWindow t;
    public final pxo0 u;
    public final TransitionDrawable v;
    public final e w;
    public izs<Boolean, s3q0> x;
    public l2i y;
    public final HashSet z;

    /* compiled from: WriteView.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WriteContract$State.values().length];
            a = iArr;
            try {
                iArr[WriteContract$State.STREAMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WriteContract$State.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WriteContract$State.NO_COMMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WriteContract$State.CLIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: WriteView.java */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ImageView imageView;
            f3y0 f3y0Var = f3y0.this;
            kcl0 kcl0Var = f3y0Var.b0;
            String action = intent.getAction() == null ? "" : intent.getAction();
            action.getClass();
            if (!action.equals("com.vkontakte.android.STICKERS_NUM_UPDATES")) {
                if (action.equals("com.vkontakte.android.STICKERS_RELOADED") && (imageView = f3y0Var.m) != null) {
                    imageView.setVisibility(kcl0Var.W() ? 0 : 8);
                    return;
                }
                return;
            }
            ImageView imageView2 = f3y0Var.l;
            if (imageView2 != null) {
                if (f3y0Var.C && kcl0Var.O0() > 0) {
                    r2 = 0;
                }
                imageView2.setVisibility(r2);
            }
        }
    }

    /* compiled from: WriteView.java */
    public class d implements ify.a {
        public d() {
        }

        @Override // xsna.ify.a
        public final void Y0() {
            f3y0 f3y0Var = f3y0.this;
            f3y0Var.V = false;
            l2i l2iVar = f3y0Var.y;
            if (l2iVar != null) {
                l2iVar.invoke(Boolean.FALSE);
            }
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
            f3y0 f3y0Var = f3y0.this;
            f3y0Var.V = false;
            l2i l2iVar = f3y0Var.y;
            if (l2iVar != null) {
                l2iVar.invoke(Boolean.TRUE);
            }
        }
    }

    /* compiled from: WriteView.java */
    public class e extends StickersView.c {
        public e() {
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final boolean a() {
            return false;
        }

        @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
        public final void b(@NonNull String str) {
            EditText editText = f3y0.this.n;
            editText.getText().insert(editText.getSelectionEnd(), str);
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        @Nullable
        public final ContextUser e() {
            return f3y0.this.getContextUser();
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        @NonNull
        public final List<UserId> h() {
            return f3y0.this.getUsersForStore();
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void j() {
            f3y0.this.n.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void n(int i) {
            f3y0 f3y0Var = f3y0.this;
            xgy xgyVar = f3y0Var.M;
            if (xgyVar != null) {
                f3y0Var.K = true;
                int i2 = xgy.F;
                xgyVar.h(null);
            }
            f3y0Var.L.g(i);
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void o(int i, @NonNull String str, @Nullable ContextUser contextUser) {
            f3y0.this.N.A(i, str);
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void p(@NonNull StickerItem stickerItem, int i, @NonNull String str) {
            f3y0.this.N.i1(stickerItem);
        }
    }

    public f3y0(Context context) {
        super(context, null, 0);
        this.s = null;
        this.u = new pxo0(300L);
        this.w = new e();
        this.z = new HashSet();
        HashSet hashSet = new HashSet();
        this.A = hashSet;
        this.B = Integer.MAX_VALUE;
        this.C = true;
        this.D = new b();
        this.E = false;
        this.I = false;
        this.J = false;
        this.S = "";
        this.U = true;
        this.V = false;
        c cVar = new c();
        this.W = cVar;
        this.a0 = new d();
        t6g0 t6g0Var = t6g0.b;
        kcl0 d2 = t6g0.d();
        this.b0 = d2;
        this.c0 = new dk5(d2);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_write_bar, (ViewGroup) this, true);
        this.E = fxc0.B().s0();
        setOrientation(0);
        setPadding(iah0.a(8.0f), 0, iah0.a(8.0f), 0);
        setClickable(true);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.liveWritebaMiddleHolder);
        this.o = viewGroup;
        EditText editText = (EditText) inflate.findViewById(R.id.liveWritebarEdit);
        this.n = editText;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.liveWritebarEmoji);
        this.b = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.liveWritebarMasks);
        this.d = imageView2;
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.liveWritebarToggle);
        this.e = imageView3;
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.liveWritebarEmojiNew);
        this.l = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.liveWritebarPackNew);
        this.m = imageView5;
        ImageView imageView6 = (ImageView) inflate.findViewById(R.id.liveWritebarSendLike);
        this.c = imageView6;
        ImageView imageView7 = (ImageView) inflate.findViewById(R.id.liveWritebarSend);
        this.f = imageView7;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.live_write_bar_action_container);
        this.g = frameLayout;
        this.h = (ImageView) inflate.findViewById(R.id.live_write_bar_action_create);
        this.i = (TextView) inflate.findViewById(R.id.live_write_bar_action_create_counter);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.live_write_bar_market_items_container);
        this.j = frameLayout2;
        awt0.o(frameLayout2, new aiw0(this, 7));
        this.k = (VkCounter) inflate.findViewById(R.id.live_write_bar_market_items_counter);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.liveWritebarHolder);
        this.p = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.liveWritebarEmojiHodler);
        this.q = viewGroup3;
        MenuButtonNewView menuButtonNewView = (MenuButtonNewView) inflate.findViewById(R.id.liveWritebarMenu);
        this.r = menuButtonNewView;
        TransitionDrawable transitionDrawable = (TransitionDrawable) imageView7.getBackground();
        this.v = transitionDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        hashSet.add(viewGroup2);
        hashSet.add(viewGroup);
        hashSet.add(imageView6);
        hashSet.add(imageView7);
        hashSet.add(imageView2);
        hashSet.add(imageView3);
        hashSet.add(frameLayout);
        hashSet.add(frameLayout2);
        hashSet.add(viewGroup3);
        hashSet.add(menuButtonNewView);
        imageView4.setVisibility(8);
        imageView5.setVisibility(8);
        menuButtonNewView.setBackgroundResource(R.drawable.stories_button_bg);
        setFocusableInTouchMode(true);
        imageView.setImageDrawable(uko.d(R.drawable.vk_icon_smile_outline_28, R.color.vk_white, getContext()));
        p0(true);
        this.C = true;
        frameLayout.setOnClickListener(new yb(this, 10));
        frameLayout2.setOnClickListener(new g3y0(this));
        imageView2.setOnClickListener(new h3y0(this));
        imageView3.setOnClickListener(new i3y0(this));
        imageView6.setOnClickListener(new j3y0(this));
        imageView.setOnClickListener(new k3y0(this));
        getViewTreeObserver().addOnPreDrawListener(new l3y0(this));
        setNoClipRecursive(this);
        editText.addTextChangedListener(cVar);
        editText.setOnClickListener(new uzb(this, 13));
        editText.setOnFocusChangeListener(new z2y0(this));
        int i = AutoSuggestStickersPopupWindow.H;
        this.t = new AutoSuggestStickersPopupWindow(getContext(), editText, d2, new a3y0(this));
        addOnLayoutChangeListener(new b3y0(this, new Point(), new int[2]));
        editText.setOnKeyListener(new c3y0(this));
        editText.setOnEditorActionListener(new d3y0(this));
        setClickable(true);
        imageView7.setOnClickListener(new e3y0(this));
    }

    public static void R(f3y0 f3y0Var) {
        if (f3y0Var.U) {
            int i = ify.a;
            boolean e2 = ify.e(ify.c);
            f3y0Var.I = e2;
            f3y0Var.setUpPosition(e2);
            int i2 = f3y0Var.getContext().getResources().getConfiguration().orientation;
            int i3 = f3y0Var.B;
            if (i2 != i3 && i3 != Integer.MAX_VALUE) {
                f3y0Var.d0();
            }
            f3y0Var.B = i2;
        }
    }

    public static void V(f3y0 f3y0Var) {
        String trim = f3y0Var.s.b().trim();
        if (!TextUtils.isEmpty(trim)) {
            b25 a2 = o25.a();
            f3y0Var.getContext();
            a2.getClass();
            f3y0Var.N.D0(trim);
            return;
        }
        Toast toast = f3y0Var.P;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(f3y0Var.getContext(), f3y0Var.getContext().getString(R.string.live_write_empty_comment_send), 0);
        f3y0Var.P = makeText;
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ContextUser getContextUser() {
        UserId c0 = this.N.c0();
        if (c0 == null) {
            return null;
        }
        return new ContextUser(c0, this.N.getTitle(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<UserId> getUsersForStore() {
        UserId c0 = this.N.c0();
        return c0 == null ? Collections.EMPTY_LIST : Collections.singletonList(c0);
    }

    private void setEditTextRightPadding(boolean z) {
        int a2 = iah0.a(54);
        if (z && this.N.T() && !this.N.isStreaming()) {
            a2 = iah0.a(94);
        }
        EditText editText = this.n;
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), a2, editText.getPaddingBottom());
    }

    public static void setNoClipRecursive(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                    setNoClipRecursive(viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpPosition(boolean z) {
        if (this.J != z) {
            this.J = z;
            ImageView imageView = this.c;
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            setState(this.N.getState());
        }
    }

    @Override // xsna.xgy.b
    public final void D() {
        this.t.g();
    }

    @Override // xsna.xgy.b
    public final void E(boolean z, xgy xgyVar) {
        izs<Boolean, s3q0> izsVar = this.x;
        if (izsVar != null) {
            izsVar.invoke(Boolean.TRUE);
        }
        m0();
        f3y0.this.setBottomMarginToBottomSheet(ify.d(3, null));
        ImageView imageView = this.b;
        if (z) {
            imageView.setImageDrawable(uko.d(R.drawable.vk_icon_smile_28, R.color.vk_white, getContext()));
            p0(true);
            this.C = false;
        } else {
            imageView.setImageDrawable(uko.d(R.drawable.vk_icon_smile_outline_28, R.color.vk_white, getContext()));
            p0(true);
            this.C = false;
        }
    }

    @Override // xsna.f2y0
    public final void F2() {
        pro0.c(new p31(this, 24));
    }

    @Override // xsna.c30
    public final void L() {
        List list;
        List list2;
        this.h.setImageDrawable(uko.d(R.drawable.vk_icon_attach_24, R.color.vk_white, getContext()));
        this.g.setBackgroundResource(R.drawable.live_write_button_background);
        ActionLinks actionLinks = ((h30) this.O).i;
        if (actionLinks == null || (list = actionLinks.d) == null) {
            list = EmptyList.b;
        }
        int size = list.size();
        TextView textView = this.i;
        if (size <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        ActionLinks actionLinks2 = ((h30) this.O).i;
        if (actionLinks2 == null || (list2 = actionLinks2.d) == null) {
            list2 = EmptyList.b;
        }
        textView.setText(String.valueOf(list2.size()));
    }

    @Override // xsna.c30
    public final void O() {
        Context context = getContext();
        uko.a aVar = uko.a;
        this.h.setImageDrawable(uko.e(m33.a(R.drawable.vk_icon_attach_24, context), ColorStateList.valueOf(-1)));
        this.g.setBackgroundResource(R.drawable.live_write_button_background);
    }

    @Override // xsna.c30
    public final void P() {
        setState(this.N.getState());
    }

    @Override // xsna.f2y0
    public final void P0() {
        EditText editText = this.n;
        if (editText.isEnabled()) {
            editText.setText("");
            editText.setHint(getContext().getString(R.string.live_msg_hint));
        }
    }

    @Override // xsna.f2y0
    public final void Z2() {
        EditText editText = this.n;
        if (editText.isEnabled()) {
            this.S = editText.getText().toString();
            editText.setHint(getContext().getString(R.string.live_msg_hint));
        }
    }

    @Override // xsna.f2y0, xsna.gv5
    public final boolean a0() {
        xgy xgyVar = this.M;
        if ((xgyVar != null && xgyVar.e()) || this.I || this.K) {
            g1();
            d0();
            this.I = false;
            return true;
        }
        d0();
        AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = this.t;
        if (autoSuggestStickersPopupWindow != null) {
            autoSuggestStickersPopupWindow.r();
        }
        return false;
    }

    public final void c0() {
        this.u.d();
        this.K = false;
        if (this.I) {
            return;
        }
        setUpPosition(false);
    }

    @Override // xsna.f2y0, xsna.c30
    public final void d0() {
        if (getContext() != null) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i = point.x;
            int i2 = point.y;
            if (rect.left < 0 || rect.right > i || rect.top < 0 || rect.bottom > i2) {
                return;
            }
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.n.getWindowToken(), 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        StickersView stickersView = this.L;
        if (stickersView != null) {
            stickersView.dispatchConfigurationChanged(configuration);
        }
        pro0.c(new j0(this, 20));
    }

    @Override // xsna.f2y0
    public final void g1() {
        xgy xgyVar = this.M;
        if (xgyVar != null) {
            this.K = false;
            xgyVar.d();
        }
    }

    public b30 getActionLinksPresenter() {
        return this.O;
    }

    public amv getAutoSuggestPopup() {
        return this.t;
    }

    public xgy getKeyboardPopup() {
        return this.M;
    }

    public MenuButtonNewView getMenuButton() {
        return this.r;
    }

    public String getText() {
        return this.n.getText().toString();
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    public Window getWindow() {
        return this.G;
    }

    @Override // xsna.f2y0
    public final void k() {
        this.V = true;
        EditText editText = this.n;
        mhy.j(editText);
        editText.requestFocus();
    }

    @Override // xsna.f2y0
    public final void k0(String str) {
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            m8v0.a.a(frameLayout, str, new qqt0(frameLayout, 10), VkTooltip$MarkerStyle.Style2, VkTooltip$MarkerSize.Size72, null, VkTooltip$BalloonPosition.TopRight, VkTooltip$BalloonTilt.Right, new kfw0(new x2j0(this, 27), 7), null, null, null, null, new q9i0(new h6m0(this, 29), 22), null, 0, false, null, null, false, null, false, 16768544);
        }
    }

    public final void l0() {
        int color = getContext().getColor(R.color.vk_white);
        EditText editText = this.n;
        editText.setHintTextColor(color);
        this.S = editText.getText();
        c cVar = this.W;
        editText.removeTextChangedListener(cVar);
        editText.setText("");
        editText.addTextChangedListener(cVar);
        editText.setHint(getContext().getString(R.string.live_msg_hint));
        editText.setCursorVisible(false);
        setEditTextRightPadding(false);
        editText.setEnabled(true);
        editText.setLongClickable(true);
        editText.setCursorVisible(true);
    }

    public final void m0() {
        int color = getContext().getColor(R.color.white_opacity40);
        EditText editText = this.n;
        editText.setHintTextColor(color);
        editText.setTextColor(getContext().getColor(R.color.vk_white));
        int length = editText.getText().length() == 0 ? this.S.length() : Math.min(this.S.length(), editText.getSelectionStart());
        editText.setText(this.S);
        editText.setSelection(length);
        editText.setCursorVisible(true);
        editText.setHint(getContext().getString(R.string.live_msg_hint));
        editText.requestFocus();
        setEditTextRightPadding(true);
    }

    public final void o0(FrameLayout frameLayout, boolean z) {
        this.H = frameLayout;
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(context);
        Window window = this.G;
        if (window == null) {
            window = h.getWindow();
        }
        Window window2 = window;
        Context context2 = getContext();
        e eVar = this.w;
        StickersView stickersView = new StickersView(context2, eVar, window2);
        this.L = stickersView;
        stickersView.setStickersKeyboardContext(b.a.a);
        this.L.setClickable(true);
        if (z) {
            this.M = new xgy(h, this.H, this.L, window2, null, 112);
        } else {
            FrameLayout frameLayout2 = this.H;
            StickersView stickersView2 = this.L;
            boolean d2 = fnj.d(h);
            int i = ify.a;
            this.M = new xgy(h, frameLayout2, stickersView2, window2, d2, new y5r0(4), false);
        }
        xgy xgyVar = this.M;
        xgyVar.l = true;
        xgyVar.n = this;
        xgyVar.h = false;
        xgyVar.m = true;
        xgyVar.o = this;
        setAutoSuggestPopupListener(eVar);
    }

    @Override // xsna.f2y0
    public final void o2(UserId userId, CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(fkq0.b(userId) ? "club" : "id");
        sb.append(fkq0.a(userId));
        sb.append('|');
        sb.append(charSequence2);
        sb.append("], ");
        this.n.setText(sb.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.STICKERS_NUM_UPDATES");
        intentFilter.addAction("com.vkontakte.android.STICKERS_RELOADED");
        anj.d(getContext(), this.D, intentFilter, hf8.a, 4);
        p0(this.C);
        this.t.q();
        io.reactivex.rxjava3.subjects.f<xvg0> fVar = h4l0.a.a;
        xx40 xx40Var = new xx40(this, 22);
        fVar.getClass();
        this.R = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, xx40Var).a0(asu0.a.d()).subscribe(new x150(this, 23));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.t.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            getContext().unregisterReceiver(this.D);
        } catch (Exception unused) {
            L.e("error unregisterReceiver");
        }
        AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = this.t;
        autoSuggestStickersPopupWindow.r();
        autoSuggestStickersPopupWindow.d();
        io.reactivex.rxjava3.disposables.c cVar = this.R;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void p0(boolean z) {
        kcl0 kcl0Var = this.b0;
        this.l.setVisibility((!z || kcl0Var.O0() <= 0) ? 8 : 0);
        this.m.setVisibility(kcl0Var.W() ? 0 : 8);
    }

    @Override // xsna.rr6
    public final void pause() {
        if (this.N != null) {
            this.U = false;
            this.I = false;
            this.B = Integer.MAX_VALUE;
            int i = ify.a;
            ify.g(this.a0);
            this.N.pause();
        }
    }

    @Override // xsna.xgy.b
    public final void q(xgy xgyVar) {
        izs<Boolean, s3q0> izsVar = this.x;
        if (izsVar != null) {
            izsVar.invoke(Boolean.FALSE);
        }
        AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = this.t;
        if (autoSuggestStickersPopupWindow != null) {
            autoSuggestStickersPopupWindow.s(true);
        }
        this.b.setImageDrawable(uko.d(R.drawable.vk_icon_smile_outline_28, R.color.vk_white, getContext()));
        p0(true);
        this.C = true;
    }

    @Override // xsna.rr6
    public final void release() {
        int i = ify.a;
        ify.g(this.a0);
        g1();
        d0();
        e2y0 e2y0Var = this.N;
        if (e2y0Var != null) {
            e2y0Var.release();
        }
        xgy xgyVar = this.M;
        if (xgyVar != null) {
            xgyVar.n = null;
            xgyVar.o = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.R;
        if (cVar != null) {
            cVar.dispose();
        }
        this.U = false;
        this.I = false;
        this.B = Integer.MAX_VALUE;
    }

    @Override // xsna.rr6
    public final void resume() {
        if (this.N != null) {
            this.U = true;
            int i = ify.a;
            ify.a(this.a0);
            this.N.resume();
        }
    }

    @Override // xsna.c30
    public final void s() {
        setState(this.N.getState());
    }

    @Override // xsna.c30
    public void setActionLinksPresenter(b30 b30Var) {
        this.O = b30Var;
    }

    public void setAutoSuggestPopupListener(StickersView.c cVar) {
        this.T = cVar;
    }

    public void setBottomSheet(@NonNull ViewGroup viewGroup) {
        this.t.setBottomSheetContainer(viewGroup);
    }

    public void setBottomSheetGradientView(@NonNull View view) {
        this.t.l(view);
    }

    public void setBottomSheetParams(@NonNull ojf0 ojf0Var) {
        this.t.k(ojf0Var);
    }

    @Override // xsna.f2y0
    public void setMarketItemsBadge(int i) {
        setState(this.N.getState());
        VkCounter vkCounter = this.k;
        if (i <= 0) {
            vkCounter.setVisibility(8);
        } else {
            vkCounter.setVisibility(0);
            vkCounter.setCounterWithoutAnimation(i);
        }
    }

    @Override // xsna.f2y0
    public void setMaskButtonState(boolean z) {
        this.d.setImageResource(z ? R.drawable.vk_icon_deprecated_ic_mask_fill_24 : R.drawable.vk_icon_deprecated_ic_mask_outline_24);
    }

    @Override // xsna.f2y0
    public void setOpenStickersMarketWithoutNavigation(boolean z) {
        this.L.setOpenStickersMarketWithoutNavigation(z);
    }

    @Override // xsna.f2y0
    public void setState(WriteContract$State writeContract$State) {
        List list;
        this.F = writeContract$State;
        HashSet hashSet = this.z;
        hashSet.clear();
        boolean z = this.J;
        ImageView imageView = this.f;
        ViewGroup viewGroup = this.q;
        ViewGroup viewGroup2 = this.p;
        ViewGroup viewGroup3 = this.o;
        if (z || this.K) {
            hashSet.add(viewGroup3);
            hashSet.add(viewGroup2);
            hashSet.add(viewGroup);
            hashSet.add(imageView);
            m0();
        } else {
            int i = a.a[this.F.ordinal()];
            if (i != 1) {
                ImageView imageView2 = this.c;
                if (i == 2) {
                    if (this.N.l2()) {
                        hashSet.add(this.j);
                    }
                    hashSet.add(viewGroup3);
                    hashSet.add(viewGroup2);
                    hashSet.add(imageView2);
                    hashSet.add(viewGroup);
                    l0();
                } else if (i == 3) {
                    hashSet.add(viewGroup3);
                    hashSet.add(viewGroup2);
                    hashSet.add(imageView2);
                    boolean z2 = !o25.a().b();
                    EditText editText = this.n;
                    editText.setEnabled(z2);
                    editText.setHintTextColor(getContext().getColor(R.color.white_opacity40));
                    editText.setHint(getContext().getString(R.string.live_comments_disabled));
                    editText.setLongClickable(false);
                    editText.setCursorVisible(false);
                } else if (i == 4) {
                    hashSet.add(viewGroup3);
                    hashSet.add(viewGroup2);
                    hashSet.add(viewGroup);
                    hashSet.add(imageView);
                    l0();
                }
            } else {
                hashSet.add(viewGroup3);
                hashSet.add(viewGroup2);
                hashSet.add(this.e);
                hashSet.add(this.g);
                hashSet.add(viewGroup);
                hashSet.add(imageView);
                h30 h30Var = (h30) this.O;
                ActionLinks actionLinks = h30Var.i;
                if (actionLinks == null || (list = actionLinks.d) == null) {
                    list = EmptyList.b;
                }
                if (list.isEmpty() && h30Var.h == null) {
                    O();
                } else {
                    L();
                }
                if (this.E) {
                    hashSet.add(this.d);
                }
                l0();
            }
            AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = this.t;
            if (autoSuggestStickersPopupWindow != null) {
                autoSuggestStickersPopupWindow.r();
            }
        }
        if (writeContract$State == WriteContract$State.CLIPS) {
            imageView.setImageDrawable(g2u0.b(R.drawable.vk_icon_arrow_up_24, imageView));
        } else {
            imageView.setImageDrawable(g2u0.b(R.drawable.vk_icon_send_24, imageView));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            if (!hashSet.contains(view)) {
                view.setVisibility(8);
            }
        }
        if (this.N.isStreaming()) {
            this.L.setAllowOpenStore(false);
            this.L.setAllowOpenSettings(false);
        } else {
            this.L.setAllowOpenStore(true);
            this.L.setAllowOpenSettings(true);
        }
    }

    public void setWindow(Window window) {
        this.G = window;
    }

    @Override // xsna.f2y0
    public final void u2(CatalogedGift catalogedGift, int i, String str, List list) {
        g2v.d().a().g(getContext(), list, catalogedGift, str);
    }

    @Override // xsna.rr6
    public e2y0 getPresenter() {
        return this.N;
    }

    @Override // xsna.rr6
    public void setPresenter(e2y0 e2y0Var) {
        this.N = e2y0Var;
        EditText editText = this.n;
        q420 q420Var = new q420(editText, this, null, 28);
        this.s = q420Var;
        q420Var.e(true);
        q420 q420Var2 = this.s;
        q420Var2.g = new hr80();
        editText.addTextChangedListener(q420Var2);
    }

    @Override // xsna.l420
    public final void Y0() {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    private void setBottomMarginToBottomSheet(int i) {
    }

    @Override // xsna.l420
    public final void N3(UserId userId) {
    }

    @Override // xsna.c30
    public void setActionButtonClickCount(int i) {
    }

    @Override // xsna.f2y0
    public void setRedDot(boolean z) {
    }

    @Override // xsna.l420
    public final void x0(@NonNull String str) {
    }

    /* compiled from: WriteView.java */
    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            f3y0 f3y0Var = f3y0.this;
            f3y0Var.S = editable;
            ucp ucpVar = ucp.a;
            ucp.i(editable);
            TransitionDrawable transitionDrawable = f3y0Var.v;
            String trim = f3y0Var.n.getText().toString().trim();
            if (f3y0Var.Q == 0 && trim.length() > 0) {
                transitionDrawable.startTransition(150);
            }
            if (f3y0Var.Q != 0 && trim.length() == 0) {
                transitionDrawable.reverseTransition(150);
            }
            f3y0Var.Q = trim.length();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
