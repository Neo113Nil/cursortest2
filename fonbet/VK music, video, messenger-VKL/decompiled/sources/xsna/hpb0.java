package xsna;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollOption;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.poll.views.PollSettingView;
import com.vk.poll.views.PollTimePickerView;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.hfr;

/* compiled from: PollEditorScreen.kt */
/* loaded from: classes17.dex */
public final class hpb0 implements View.OnClickListener {
    public final bpn0 A;
    public final bpn0 B;
    public final bpn0 C;
    public final bpn0 D;
    public final bpn0 E;
    public final bpn0 F;
    public final bpn0 G;
    public final bpn0 H;
    public final bpn0 I;
    public final bpn0 J;
    public rka0 K;
    public iia0 L;
    public gzs<s3q0> M;
    public wzs<? super PollAttachment, ? super String, s3q0> N;
    public zyl0 O;
    public io.reactivex.rxjava3.subjects.f P;
    public boolean Q;
    public final boolean R;
    public final c.l<? extends List<Object>> S;
    public final kpb0 T;
    public final jpb0 U;
    public final bpn0 V;
    public final UserId b;
    public final String c;
    public final PollAttachment d;
    public final int e;
    public final boolean f;
    public final long g;
    public final tpb0 h;
    public final epb0 i;
    public final boolean j;
    public final v2l0 k;
    public final io.reactivex.rxjava3.disposables.b l;
    public final io.reactivex.rxjava3.subjects.f<s3q0> m;
    public final ng<? extends Object> n;
    public final ArrayList o;
    public int p;
    public final ArrayList q;
    public io.reactivex.rxjava3.disposables.c r;
    public View s;
    public final bpn0 t;
    public final bpn0 u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;

    /* compiled from: PollEditorScreen.kt */
    public static final class a {
        public final ArrayList a;
        public final LinkedHashMap b;
        public final List<Long> c;

        public a(ArrayList arrayList, LinkedHashMap linkedHashMap, ArrayList arrayList2) {
            this.a = arrayList;
            this.b = linkedHashMap;
            this.c = arrayList2;
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public final class b implements c.l<List<? extends PollBackground>> {
        public final af50 b;

        /* compiled from: PollEditorScreen.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                h03.b(th);
                return s3q0.a;
            }
        }

        public b(af50 af50Var) {
            this.b = af50Var;
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<List<PollBackground>> hj(com.vk.lists.c cVar, boolean z) {
            return rsg0.y0(new dnb0(), null, null, 3);
        }

        @Override // com.vk.lists.c.l
        public final io.reactivex.rxjava3.core.q<List<? extends PollBackground>> ui(int i, com.vk.lists.c cVar) {
            return rsg0.y0(new dnb0(), null, null, 3);
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<List<PollBackground>> qVar, boolean z, com.vk.lists.c cVar) {
            cVar.l(0);
            hpb0 hpb0Var = hpb0.this;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new cc20(new mz80(6, hpb0Var, this), 16), new iob0(a.b, 1));
            if (subscribe != null) {
                hpb0Var.l.b(subscribe);
            }
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public final class c implements c.l<List<? extends StickerCommonStyle>> {
        public final hxl b;

        /* compiled from: PollEditorScreen.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                h03.b(th);
                return s3q0.a;
            }
        }

        public c(hxl hxlVar) {
            this.b = hxlVar;
        }

        public final List<StickerCommonStyle> a() {
            v2l0 v2l0Var = hpb0.this.k;
            return (v2l0Var == null || !v2l0Var.c()) ? e43.l(StickerCommonStyle.DARK, StickerCommonStyle.LIGHT) : e43.l(StickerCommonStyle.DARK, StickerCommonStyle.LIGHT, StickerCommonStyle.ACCENT);
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<List<StickerCommonStyle>> hj(com.vk.lists.c cVar, boolean z) {
            return io.reactivex.rxjava3.core.q.T(a());
        }

        @Override // com.vk.lists.c.l
        public final io.reactivex.rxjava3.core.q<List<? extends StickerCommonStyle>> ui(int i, com.vk.lists.c cVar) {
            return io.reactivex.rxjava3.core.q.T(a());
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<List<StickerCommonStyle>> qVar, boolean z, com.vk.lists.c cVar) {
            hpb0 hpb0Var = hpb0.this;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new wx00(new ml1(19, this, hpb0Var), 11), new m5y(a.b, 16));
            if (subscribe != null) {
                hpb0Var.l.b(subscribe);
            }
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public static final class d {
        public final String a;
        public final Long b;

        public d(String str, Long l) {
            this.a = str;
            this.b = l;
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public static final class e extends rno0 {
        public e() {
        }

        @Override // xsna.rno0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            hpb0.this.m.onNext(s3q0.a);
            ucp ucpVar = ucp.a;
            ucp.i(editable);
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((hpb0) this.receiver).getClass();
            if (th2 instanceof VKApiExecutionException) {
                rte0.n((VKApiExecutionException) th2, new oey(15), ipb0.b);
            } else {
                h03.b(th2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final h b = new h(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public hpb0(UserId userId, String str, PollAttachment pollAttachment, int i, long j, tpb0 tpb0Var, p8m0 p8m0Var, v2l0 v2l0Var, int i2) {
        int i3;
        long j2;
        ng<? extends Object> ymb0Var;
        if ((i2 & 8) != 0) {
            nub0.a().getClass();
            i3 = 80;
        } else {
            i3 = i;
        }
        boolean z = (i2 & 16) == 0;
        if ((i2 & 32) != 0) {
            nub0.a().getClass();
            j2 = 0;
        } else {
            j2 = j;
        }
        tpb0 tpb0Var2 = (i2 & 64) != 0 ? null : tpb0Var;
        epb0 rklVar = (i2 & 128) != 0 ? new rkl() : p8m0Var;
        boolean z2 = (i2 & 256) == 0;
        v2l0 v2l0Var2 = (i2 & 512) != 0 ? null : v2l0Var;
        this.b = userId;
        this.c = str;
        this.d = pollAttachment;
        this.e = i3;
        this.f = z;
        this.g = j2;
        this.h = tpb0Var2;
        this.i = rklVar;
        this.j = z2;
        this.k = v2l0Var2;
        this.l = new io.reactivex.rxjava3.disposables.b();
        this.m = new io.reactivex.rxjava3.subjects.f<>();
        if (z2) {
            ymb0Var = new anb0(v2l0Var2, new put(0, this, hpb0.class, "updateCretePollButton", "updateCretePollButton()V", 0, 4));
        } else {
            int i4 = 0;
            int i5 = 0;
            ymb0Var = new ymb0(new fa6(i5, this, hpb0.class, "openGallery", "openGallery()V", i4, 5), z, new its(i5, this, hpb0.class, "updateCretePollButton", "updateCretePollButton()V", i4, 1));
        }
        this.n = ymb0Var;
        this.o = new ArrayList();
        this.p = 10;
        this.q = new ArrayList();
        this.t = new bpn0(new re40(this, 8));
        this.u = new bpn0(new ufk(this, 28));
        this.v = new bpn0(new vt30(this, 15));
        this.w = new bpn0(new uq50(this, 16));
        this.x = new bpn0(new x850(this, 10));
        this.y = new bpn0(new l1i(this, 26));
        this.z = new bpn0(new lo10(this, 17));
        this.A = new bpn0(new ko00(this, 20));
        this.B = new bpn0(new wt30(this, 8));
        this.C = new bpn0(new hvz(this, 25));
        this.D = new bpn0(new rf20(this, 10));
        this.E = new bpn0(new hk70(this, 6));
        this.F = new bpn0(new by20(this, 15));
        this.G = new bpn0(new b410(this, 11));
        this.H = new bpn0(new pp00(this, 19));
        this.I = new bpn0(new w100(this, 22));
        this.J = new bpn0(new a040(this, 20));
        this.Q = true;
        this.R = pollAttachment != null;
        this.S = z2 ? new c(new hxl(this, 29)) : new b(new af50(this, 10));
        this.T = new kpb0(this);
        this.U = new jpb0(this);
        this.V = new bpn0(new nm60(this, 6));
    }

    public static final void a(hpb0 hpb0Var) {
        j9x it = swe0.q(0, hpb0Var.k().getChildCount()).iterator();
        while (true) {
            if (!it.d) {
                break;
            }
            View childAt = hpb0Var.k().getChildAt(it.nextInt());
            if (childAt instanceof sqb0) {
                sqb0 sqb0Var = (sqb0) childAt;
                boolean z = hpb0Var.k().getChildCount() + (-2) > 1;
                int i = sqb0.d;
                sqb0Var.a(z, true);
            }
        }
        TextView textView = (TextView) hpb0Var.x.getValue();
        boolean z2 = hpb0Var.k().getChildCount() + (-2) >= hpb0Var.p;
        textView.setEnabled(!z2);
        int i2 = z2 ? R.color.vk_gray_400 : R.color.vk_blue_400;
        Drawable drawable = (Drawable) rl3.S(0, textView.getCompoundDrawablesRelative());
        if (drawable != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            drawable.setColorFilter(context.getColor(i2), PorterDuff.Mode.SRC_IN);
        }
        hpb0Var.t();
    }

    public static /* synthetic */ void c(hpb0 hpb0Var, int i) {
        hpb0Var.b((i & 1) != 0, null, false);
    }

    public final void b(boolean z, PollOption pollOption, boolean z2) {
        String str;
        if (k().getChildCount() - 2 >= this.p) {
            return;
        }
        sqb0 sqb0Var = new sqb0(k().getContext());
        sqb0Var.setupTextViewBackground(this.Q);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (k().getChildCount() - 2 > 0) {
            layoutParams.topMargin = iah0.a(12);
        }
        if (pollOption != null) {
            sqb0Var.setTag(Long.valueOf(pollOption.b));
        }
        if (z2) {
            sqb0Var.a(false, false);
        }
        k().addView(sqb0Var, k().getChildCount() - 1, layoutParams);
        if (pollOption == null || (str = pollOption.c) == null) {
            str = "";
        }
        sqb0Var.setText(str);
        TextView textView = sqb0Var.c;
        if (z) {
            mhy.j(textView);
        }
        sqb0Var.setRemoveClickListener(new oe5(17, this, sqb0Var));
        textView.addTextChangedListener(new e());
    }

    public final void d() {
        uuk uukVar = this.n;
        if (uukVar instanceof jnb0) {
            hfr.a aVar = new hfr.a(((jnb0) uukVar).m());
            while (aVar.hasNext()) {
                nub0.a().j(((Number) aVar.next()).intValue());
            }
        }
    }

    public final void e(io.reactivex.rxjava3.subjects.f<Poll> fVar) {
        v2l0 v2l0Var;
        Activity h2 = e3m.h(k().getContext());
        if (!q() || h2 == null) {
            return;
        }
        boolean isChecked = ((PollSettingView) this.z.getValue()).b.isChecked();
        boolean isChecked2 = ((PollSettingView) this.A.getValue()).b.isChecked();
        boolean isChecked3 = ((PollSettingView) this.B.getValue()).b.isChecked();
        Pair<Integer, Integer> h3 = h();
        int intValue = h3.d().intValue();
        int intValue2 = h3.g().intValue();
        String m = m();
        ArrayList l = l();
        Long valueOf = o().b.isChecked() ? Long.valueOf(p().getUnixTime()) : null;
        Object K0 = this.n.K0();
        StickerCommonStyle stickerCommonStyle = K0 instanceof StickerCommonStyle ? (StickerCommonStyle) K0 : null;
        Integer a2 = (stickerCommonStyle != StickerCommonStyle.ACCENT || (v2l0Var = this.k) == null) ? null : v2l0Var.a();
        PollAttachment pollAttachment = this.d;
        this.l.d(hg1.m(rsg0.y0(this.i.b(new grb0(this.g, valueOf, m, l, this.b, isChecked, isChecked2, isChecked3, intValue, intValue2, a2, stickerCommonStyle, this.c, pollAttachment, pollAttachment != null ? j() : null)), null, null, 3), h2, 0L, false, 62).subscribe(new cp50(new com.vk.movika.sdk.base.logic.processor.d(24, this, fVar), 8), new j720(new f(1, this, hpb0.class, "errorHandler", "errorHandler(Ljava/lang/Throwable;)V", 0), 5)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Poll poll;
        StickerCommonStyle stickerCommonStyle;
        Bitmap bitmap;
        this.s = layoutInflater.inflate(R.layout.poll_editor_view, viewGroup, false);
        g(R.id.poll_cancel_btn).setOnClickListener(this);
        TextView textView = (TextView) g(R.id.poll_title);
        boolean z = this.R;
        textView.setText(z ? R.string.poll_edit : R.string.poll_create);
        n().addTextChangedListener(this.T);
        k15.v(n(), this.Q);
        n().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.e)});
        bwt0.h0(this, (ImageView) this.y.getValue());
        bpn0 bpn0Var = this.x;
        bwt0.h0(this, (TextView) bpn0Var.getValue());
        Drawable drawable = (Drawable) rl3.S(0, ((TextView) bpn0Var.getValue()).getCompoundDrawablesRelative());
        if (drawable != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            drawable.setColorFilter(context.getColor(R.color.vk_blue_400), PorterDuff.Mode.SRC_IN);
        }
        if (this.g > 0) {
            bwt0.p0(o(), false);
            bwt0.p0(p(), false);
        }
        VkRecyclerPaginatedView i = i();
        int a2 = iah0.a(16);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        i.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, i);
        nub0.a().getClass();
        dVar.c(2);
        dVar.f = 0;
        dVar.a();
        i.getRecyclerView().addItemDecoration(new ehk0(a2, true));
        i.getRecyclerView().setClipToPadding(false);
        i.getRecyclerView().setFocusable(false);
        i.getRecyclerView().setPadding(a2, 0, a2, 0);
        boolean z2 = this.j;
        if (z2) {
            i.getLayoutParams().height = iah0.a(116);
            f4m.q(0, k());
        } else if (this.f) {
            i.getLayoutParams().height = iah0.a(92);
        }
        i.setUiStateCallbacks(this.U);
        i.setSwipeRefreshEnabled(false);
        ng<? extends Object> ngVar = this.n;
        i.setAdapter(ngVar);
        c.h hVar = new c.h(this.S);
        hVar.s = 0;
        com.vk.lists.f.a(hVar, i);
        if (z2) {
            i.getViewTreeObserver().addOnGlobalLayoutListener(new mpb0(this, i));
        }
        ArrayList arrayList = this.o;
        arrayList.clear();
        View view = (View) this.E.getValue();
        VkRecyclerPaginatedView i2 = i();
        View view2 = (View) this.F.getValue();
        bpn0 bpn0Var2 = this.z;
        PollSettingView pollSettingView = (PollSettingView) bpn0Var2.getValue();
        bpn0 bpn0Var3 = this.A;
        PollSettingView pollSettingView2 = (PollSettingView) bpn0Var3.getValue();
        PollSettingView o = o();
        PollTimePickerView p = p();
        bpn0 bpn0Var4 = this.B;
        int i3 = 5;
        arrayList.addAll(e43.l(view, i2, view2, pollSettingView, pollSettingView2, o, p, (PollSettingView) bpn0Var4.getValue()));
        k().setOnHierarchyChangeListener(new lpb0(this));
        if (z) {
            PollAttachment pollAttachment = this.d;
            if (pollAttachment != null && (poll = pollAttachment.f) != null) {
                List<PollOption> list = poll.f;
                String str = poll.d;
                ((PollSettingView) bpn0Var2.getValue()).setChecked(poll.i);
                ((PollSettingView) bpn0Var3.getValue()).setChecked(poll.Ib());
                ((PollSettingView) bpn0Var4.getValue()).setChecked(poll.o);
                if (!this.i.a()) {
                    ((PollSettingView) bpn0Var2.getValue()).setEnabledState(false);
                    ((PollSettingView) bpn0Var3.getValue()).setEnabledState(false);
                    ((PollSettingView) bpn0Var4.getValue()).setEnabledState(false);
                }
                long j = poll.k;
                if (j > 0) {
                    p().setUnitTime(j);
                    o().setChecked(true);
                    ViewGroup.LayoutParams layoutParams = p().getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = iah0.a(68);
                    }
                    ((ViewGroup) this.t.getValue()).requestLayout();
                } else {
                    o().setChecked(false);
                }
                EditText n = n();
                n.setText(str);
                n.setSelection(str.length());
                PollBackground pollBackground = poll.s;
                if ((pollBackground instanceof PhotoPoll) && (ngVar instanceof jnb0)) {
                    PhotoPoll photoPoll = (PhotoPoll) pollBackground;
                    try {
                        bitmap = kd7.b(photoPoll.f, y8g0.a(R.dimen.poll_bg_view_holder_width), y8g0.a(R.dimen.poll_bg_small_height), false, false);
                    } catch (Exception unused) {
                        bitmap = null;
                    }
                    photoPoll.g = bitmap;
                    ((jnb0) ngVar).c0(new inb0(null, photoPoll, 100, null, 112));
                } else if ((pollBackground instanceof PollContentColor) && (ngVar instanceof anb0)) {
                    Poll poll2 = pollAttachment.f;
                    PollBackground pollBackground2 = poll2 != null ? poll2.s : null;
                    PollContentColor pollContentColor = pollBackground2 instanceof PollContentColor ? (PollContentColor) pollBackground2 : null;
                    if (pollContentColor == null || (stickerCommonStyle = pollContentColor.d) == null) {
                        stickerCommonStyle = StickerCommonStyle.DARK;
                    }
                    anb0 anb0Var = (anb0) ngVar;
                    anb0Var.i = stickerCommonStyle;
                    anb0Var.L0(((ArrayList) anb0Var.y0()).indexOf(stickerCommonStyle));
                } else {
                    ngVar.N0(pollBackground);
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    b(false, (PollOption) it.next(), list.size() == 1);
                }
            }
        } else {
            c(this, 6);
            c(this, 6);
        }
        o().setOnCheckedChangeListener(new yr00(this, 19));
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.m.v0(300L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        o060 o060Var = new o060(this, i3);
        int i4 = kwg0.a;
        this.l.b(a0.subscribe(o060Var, new iwg0()));
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(1, layoutTransition.getDuration(3) / 3);
        layoutTransition.setStartDelay(2, layoutTransition.getDuration(0) / 2);
        k().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.fpb0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                hpb0 hpb0Var = hpb0.this;
                int height = hpb0Var.k().getHeight();
                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                boolean z3 = ref$BooleanRef2.element;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                if (z3) {
                    ref$BooleanRef2.element = false;
                    height = ref$IntRef2.element;
                } else {
                    ref$IntRef2.element = height;
                }
                float measuredHeight = height - hpb0Var.k().getMeasuredHeight();
                Iterator it2 = hpb0Var.o.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).setTranslationY(measuredHeight);
                }
                return true;
            }
        });
        layoutTransition.addTransitionListener(new g(ref$BooleanRef));
        k().setLayoutTransition(layoutTransition);
        if (!z) {
            n().post(new z27(this, 9));
        }
        View view3 = this.s;
        if (view3 == null) {
            return null;
        }
        return view3;
    }

    public final <V extends View> V g(int i) {
        View view = this.s;
        if (view == null) {
            view = null;
        }
        return (V) view.findViewById(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Integer, Integer> h() {
        int i;
        int i2;
        Object K0 = this.n.K0();
        if (K0 != null) {
            if (K0 instanceof PollBackground) {
                i = ((PollBackground) K0).b;
                i2 = 0;
            } else if (K0 instanceof inb0) {
                PhotoPoll photoPoll = ((inb0) K0).b;
                i2 = photoPoll != null ? photoPoll.b : 0;
                i = 0;
            }
            return new Pair<>(Integer.valueOf(i2 == 0 ? i : 0), Integer.valueOf(i2));
        }
        i = 0;
        i2 = 0;
        return new Pair<>(Integer.valueOf(i2 == 0 ? i : 0), Integer.valueOf(i2));
    }

    public final VkRecyclerPaginatedView i() {
        return (VkRecyclerPaginatedView) this.D.getValue();
    }

    public final a j() {
        String str;
        PollAttachment pollAttachment = this.d;
        if (pollAttachment == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<PollOption> list = pollAttachment.f.f;
        HashMap hashMap = new HashMap(list.size());
        for (PollOption pollOption : list) {
            hashMap.put(Long.valueOf(pollOption.b), pollOption);
        }
        Iterator it = l().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Long l = dVar.b;
            String str2 = dVar.a;
            if (l == null || l.longValue() <= 0) {
                arrayList.add(str2);
            } else {
                PollOption pollOption2 = (PollOption) hashMap.get(l);
                if (pollOption2 == null || (str = pollOption2.c) == null) {
                    str = "";
                }
                if (!str.equals(str2)) {
                    linkedHashMap.put(l.toString(), str2);
                }
            }
        }
        return new a(arrayList, linkedHashMap, this.q);
    }

    public final ViewGroup k() {
        return (ViewGroup) this.H.getValue();
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        j9x it = swe0.q(0, k().getChildCount()).iterator();
        while (it.d) {
            View childAt = k().getChildAt(it.nextInt());
            if (childAt instanceof sqb0) {
                sqb0 sqb0Var = (sqb0) childAt;
                String obj = drm0.p0(sqb0Var.getText()).toString();
                Object tag = sqb0Var.getTag();
                Long l = (!(tag instanceof Long) || ((Number) tag).longValue() <= 0) ? null : (Long) tag;
                if (obj.length() > 0) {
                    arrayList.add(new d(obj, l));
                }
            }
        }
        return arrayList;
    }

    public final String m() {
        String obj;
        Editable text = n().getText();
        if (text == null || (obj = text.toString()) == null) {
            return null;
        }
        return drm0.p0(obj).toString();
    }

    public final EditText n() {
        return (EditText) this.G.getValue();
    }

    public final PollSettingView o() {
        return (PollSettingView) this.C.getValue();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.poll_cancel_btn) {
            view.clearFocus();
            rka0 rka0Var = this.K;
            if (rka0Var != null) {
                rka0Var.invoke();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.poll_create_btn) {
            tpb0 tpb0Var = this.h;
            if (tpb0Var != null) {
                tpb0Var.G();
            }
            e(null);
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.poll_add_option_btn) {
            c(this, 7);
        }
    }

    public final PollTimePickerView p() {
        return (PollTimePickerView) this.I.getValue();
    }

    public final boolean q() {
        Object obj;
        String m = m();
        boolean z = false;
        if (m != null && m.length() != 0 && m.length() <= this.e) {
            ArrayList l = l();
            if (!l.isEmpty()) {
                Iterator it = l.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((d) obj).a.length() == 0) {
                        break;
                    }
                }
                if (obj == null) {
                    Object K0 = this.n.K0();
                    if ((K0 instanceof inb0) && ((inb0) K0).b == null) {
                        z = true;
                    }
                    return !z;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(int i, int i2, Intent intent) {
        ArrayList arrayList;
        String str;
        if (nub0.a().b() && i2 == -1) {
            boolean hasExtra = intent != null ? intent.hasExtra("result_attachments") : false;
            if (i == 50 && hasExtra && intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
                if (parcelableArrayList == null) {
                    parcelableArrayList = new ArrayList();
                }
                boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
                if (booleanArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    qk3 qk3Var = new qk3(booleanArray);
                    int i3 = 0;
                    while (qk3Var.hasNext()) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        xtw xtwVar = new xtw(i3, qk3Var.next());
                        if (!((Boolean) xtwVar.b).booleanValue()) {
                            arrayList2.add(xtwVar);
                        }
                        i3 = i4;
                    }
                    arrayList = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Uri) parcelableArrayList.get(((xtw) it.next()).a)).toString());
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.size() != 1) {
                    StringBuilder sb = new StringBuilder("Incorrect result size ");
                    sb.append(arrayList != null ? Integer.valueOf(arrayList.size()) : null);
                    L.l(sb.toString());
                }
                if (arrayList == null || (str = (String) j5g.b0(0, arrayList)) == null || !(this.n instanceof jnb0)) {
                    return;
                }
                nub0.a().c(str, this.b, new xc50(this, 7));
            }
        }
    }

    public final void s() {
        fo foVar = new fo("polls.getAnswersLimit");
        foVar.F(this.b, "owner_id");
        this.l.b(rsg0.y0(foVar, null, null, 3).subscribe(new fl30(new ebx(this, 19), 14), new m330(h.b, 12)));
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        b690 b690Var = new b690(3);
        fVar.getClass();
        this.r = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, b690Var).a0(asu0.a.d()).subscribe(new ux00(this, 13));
    }

    public final void t() {
        boolean q = q();
        io.reactivex.rxjava3.subjects.f fVar = this.P;
        if (fVar != null) {
            fVar.onNext(Boolean.valueOf(q));
        }
        bpn0 bpn0Var = this.y;
        Drawable drawable = ((ImageView) bpn0Var.getValue()).getDrawable();
        if (drawable != null) {
            drawable.setAlpha(q ? 255 : 128);
        }
        omw.b((ImageView) bpn0Var.getValue(), q ? R.attr.vk_ui_accent_blue : R.attr.vk_ui_icon_secondary);
        zyl0 zyl0Var = this.O;
        if (zyl0Var != null) {
            zyl0Var.invoke(Boolean.valueOf(q));
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public static final class g implements LayoutTransition.TransitionListener {
        public final /* synthetic */ Ref$BooleanRef b;

        public g(Ref$BooleanRef ref$BooleanRef) {
            this.b = ref$BooleanRef;
        }

        @Override // android.animation.LayoutTransition.TransitionListener
        public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
            hpb0 hpb0Var = hpb0.this;
            if (viewGroup == hpb0Var.k() && i == 3) {
                this.b.element = true;
                return;
            }
            float height = hpb0Var.k().getHeight() - hpb0Var.k().getMeasuredHeight();
            Iterator it = hpb0Var.o.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setTranslationY(height);
            }
        }

        @Override // android.animation.LayoutTransition.TransitionListener
        public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        }
    }
}
