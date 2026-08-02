package xsna;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.PopupMenu;
import android.widget.Toast;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vk.stickers.popup.PopupStickerView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import xsna.lgg;
import xsna.mgg;
import xsna.xgy;

/* compiled from: CommentsControllerImpl.kt */
/* loaded from: classes17.dex */
public final class leg implements eeg {
    public static final Regex q = new Regex("^\\s*" + eaz.c() + ",\\s?");
    public final UserId a;
    public final mgg b;
    public final bgg c;
    public final izs<Boolean, s3q0> d;
    public final izs<UserId, Boolean> e;
    public final izs<Throwable, s3q0> f;
    public final teg g;
    public final boolean h;
    public final boolean i;
    public final Integer j;
    public final io.reactivex.rxjava3.disposables.b k;
    public final q420 l;
    public final h m;
    public StickersView n;
    public xgy o;
    public String p;

    /* compiled from: CommentsControllerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((izs) this.receiver).invoke(th);
            return s3q0.a;
        }
    }

    /* compiled from: CommentsControllerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<kgg, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(kgg kggVar) {
            leg legVar = (leg) this.receiver;
            Regex regex = leg.q;
            legVar.getClass();
            Boolean bool = kggVar.a;
            if (bool != null) {
                legVar.d.invoke(bool);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CommentsControllerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((izs) this.receiver).invoke(th);
            return s3q0.a;
        }
    }

    /* compiled from: CommentsControllerImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<rag, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(rag ragVar) {
            ArrayList<Attachment> u;
            rag ragVar2 = ragVar;
            leg legVar = (leg) this.receiver;
            mgg mggVar = legVar.b;
            c2y0 a = mggVar.a();
            if (a != null) {
                n3g0 b = mggVar.b();
                iag iagVar = ragVar2.c;
                boolean z = iagVar != null;
                n4g0 n4g0Var = ragVar2.a;
                if (z) {
                    c2y0 a2 = mggVar.a();
                    if (a2 != null) {
                        legVar.p = null;
                        n3g0 b2 = mggVar.b();
                        if (b2 != null) {
                            b2.m();
                        }
                        r9 = iagVar != null ? iagVar.getText() : null;
                        a2.setText(r9 != null ? r9 : "");
                        if (iagVar != null && (u = iagVar.u()) != null) {
                            Iterator<T> it = u.iterator();
                            while (it.hasNext()) {
                                a2.A1((Attachment) it.next());
                            }
                        }
                        a2.B();
                    }
                } else if (b == null || !b.g()) {
                    CharSequence text = a.getText();
                    String str = legVar.p;
                    if (str != null) {
                        CharSequence subSequence = drm0.e0(text, str) ? text.subSequence(str.length(), text.length()) : text.subSequence(0, text.length());
                        if (subSequence != null) {
                            text = subSequence;
                        }
                    }
                    if (n4g0Var == null) {
                        if (b != null) {
                            b.h();
                        }
                        if (drm0.N(text)) {
                            a.setText("");
                        }
                    } else {
                        String str2 = n4g0Var.d;
                        if (str2 == null) {
                            str2 = null;
                        } else if (str2.length() == 0) {
                            str2 = n4g0Var.c;
                        }
                        if (str2 == null || drm0.N(str2)) {
                            n3g0 b3 = mggVar.b();
                            if (b3 != null) {
                                b3.h();
                            }
                            a.setText(text);
                            legVar.p = null;
                        } else {
                            a.getInput().getContext();
                            UserId userId = n4g0Var.b;
                            if (userId != null) {
                                StringBuilder sb = new StringBuilder(X3.j.d);
                                sb.append(userId.b > 0 ? "id" : "club");
                                sb.append(fkq0.a(userId));
                                sb.append('|');
                                sb.append(str2);
                                sb.append("], ");
                                r9 = sb.toString();
                            }
                            a.setText((r9 != null ? r9 : "") + ((Object) text));
                            legVar.p = str2.concat(", ");
                        }
                        if (a.getText().length() > 0) {
                            a.B();
                        }
                    }
                } else {
                    legVar.p = null;
                    c2y0 a3 = mggVar.a();
                    if (a3 != null) {
                        n3g0 b4 = mggVar.b();
                        if (b4 != null) {
                            b4.h();
                        }
                        a3.setText("");
                        a3.F();
                        mhy.d(a3.getInput());
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: CommentsControllerImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((izs) this.receiver).invoke(th);
            return s3q0.a;
        }
    }

    /* compiled from: CommentsControllerImpl.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<lgg, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(lgg lggVar) {
            leg legVar = (leg) this.receiver;
            Regex regex = leg.q;
            legVar.n(lggVar);
            return s3q0.a;
        }
    }

    /* compiled from: CommentsControllerImpl.kt */
    public static final class g extends wx20 {
        public final /* synthetic */ ArrayList<e520> c;
        public final /* synthetic */ leg d;
        public final /* synthetic */ iag e;

        public g(ArrayList<e520> arrayList, leg legVar, iag iagVar) {
            this.c = arrayList;
            this.d = legVar;
            this.e = iagVar;
        }

        @Override // xsna.wx20
        public final List a() {
            return this.c;
        }

        @Override // xsna.wx20
        public final boolean e() {
            return true;
        }

        @Override // xsna.wx20
        public final void f(Context context, e520 e520Var) {
            leg legVar = this.d;
            UserId userId = legVar.a;
            bgg bggVar = legVar.c;
            int i = e520Var.a;
            iag iagVar = this.e;
            if (i == 0) {
                fvr.l(context, iagVar.getText());
                cvk.u(R.string.text_copied, false);
                return;
            }
            if (i == 1) {
                legVar.i(iagVar);
                t6g0 t6g0Var = t6g0.b;
                Group C0 = t6g0.b().C0(fkq0.e(userId));
                if (C0 != null) {
                    legVar.k(userId, C0.d);
                    return;
                }
                return;
            }
            if (i == 2) {
                bggVar.b(iagVar);
                return;
            }
            if (i == 3) {
                legVar.g.k(iagVar);
            } else if (i == 4) {
                bggVar.a(iagVar);
            } else {
                if (i != 5) {
                    return;
                }
                bggVar.c(iagVar);
            }
        }
    }

    /* compiled from: CommentsControllerImpl.kt */
    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            c2y0 a;
            EditText input;
            ucp ucpVar = ucp.a;
            ucp.i(editable);
            leg legVar = leg.this;
            q420 q420Var = legVar.l;
            boolean z = (q420Var == null ? null : q420Var).n;
            if (q420Var == null) {
                q420Var = null;
            }
            q420Var.afterTextChanged(editable);
            if (z) {
                return;
            }
            Integer num = legVar.j;
            mgg mggVar = legVar.b;
            if (num == null || (a = mggVar.a()) == null || (input = a.getInput()) == null) {
                return;
            }
            q420 q420Var2 = legVar.l;
            String b = (q420Var2 != null ? q420Var2 : null).b();
            if (b.length() > num.intValue()) {
                int selectionEnd = input.getSelectionEnd();
                c2y0 a2 = mggVar.a();
                if (a2 != null) {
                    a2.setText(erm0.D0(num.intValue(), b));
                }
                int length = input.length();
                if (selectionEnd > length) {
                    selectionEnd = length;
                }
                input.setSelection(selectionEnd);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            q420 q420Var = leg.this.l;
            if (q420Var == null) {
                q420Var = null;
            }
            q420Var.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            q420 q420Var = leg.this.l;
            if (q420Var == null) {
                q420Var = null;
            }
            q420Var.onTextChanged(charSequence, i, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public leg(UserId userId, mgg mggVar, bgg bggVar, izs<? super Boolean, s3q0> izsVar, izs<? super UserId, Boolean> izsVar2, izs<? super Throwable, s3q0> izsVar3, teg tegVar, boolean z, boolean z2, Integer num) {
        mgg.a aVar = mggVar.a;
        this.a = userId;
        this.b = mggVar;
        this.c = bggVar;
        this.d = izsVar;
        this.e = izsVar2;
        this.f = izsVar3;
        this.g = tegVar;
        this.h = z;
        this.i = z2;
        this.j = num;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.k = bVar;
        h hVar = new h();
        this.m = hVar;
        bVar.b(tegVar.h().a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new ea(new a(1, izsVar3, izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0), 21)).subscribe(new lf1(new b(1, this, leg.class, "bindCommentsUi", "bindCommentsUi(Lcom/vk/comments/api/ui/CommentsUiData;)V", 0), 13)));
        bVar.b(tegVar.i().a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new zl0(new c(1, izsVar3, izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0), 13)).subscribe(new mf1(new d(1, this, leg.class, "bindCommentBar", "bindCommentBar(Lcom/vk/comments/api/ui/CommentBarUiData;)V", 0), 13)));
        bVar.b(tegVar.d().a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new j50(new e(1, izsVar3, izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0), 13)).subscribe(new nf1(new f(1, this, leg.class, "onUiEvent", "onUiEvent(Lcom/vk/comments/api/ui/CommentsUiEvent;)V", 0), 19)));
        final c2y0 a2 = mggVar.a();
        Object[] objArr = 0;
        if (a2 != null) {
            a2.H(new com.vk.comments.impl.a(this), new m6a(this));
            a2.getSendButton().setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.keg
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    t6g0 t6g0Var = t6g0.b;
                    gxh b2 = t6g0.b();
                    final leg legVar = leg.this;
                    UserId userId2 = legVar.a;
                    final Group C0 = b2.C0(fkq0.a(userId2));
                    if (fkq0.d(userId2) || C0 == null || C0.s < 2) {
                        return false;
                    }
                    PopupMenu popupMenu = new PopupMenu(legVar.b.a.a.invoke().requireContext(), a2.getSendButton());
                    popupMenu.getMenu().add(R.string.reply_from_group);
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: xsna.jeg
                        @Override // android.widget.PopupMenu.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            leg legVar2 = leg.this;
                            legVar2.k(legVar2.a, C0.d);
                            legVar2.m();
                            return true;
                        }
                    });
                    popupMenu.show();
                    return true;
                }
            });
            FragmentImpl invoke = aVar.a.invoke();
            a2.setResultFragment(invoke);
            a2.b(userId, true);
            a2.setAttachLimits(2);
            a2.y(invoke.kn());
            a2.setHidePopup(true);
            ViewGroup invoke2 = aVar.h.invoke();
            if (invoke2 != null) {
                a2.setBottomSheetContainer(invoke2);
            }
            a2.getInput().setHint(invoke.requireContext().getString(R.string.comment_title));
            vdl0 vdl0Var = new vdl0(a2.getInput(), new b3(this, 21), new sbg(this, 1), new g84(6, this, a2));
            StickersView stickersView = new StickersView(invoke.requireContext(), vdl0Var, 4);
            this.n = stickersView;
            stickersView.setStickersKeyboardContext(b.a.a);
            final xgy xgyVar = new xgy(invoke.kn(), aVar.b.invoke(), this.n, null, null, 120);
            xgyVar.a(mggVar.a().i(), null);
            xgyVar.o = mggVar.a();
            c2y0 a3 = mggVar.a();
            if (a3 != null) {
                a3.c(new View.OnKeyListener() { // from class: xsna.heg
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                        if (i != 4) {
                            return false;
                        }
                        xgy xgyVar2 = xgy.this;
                        if (!xgyVar2.e()) {
                            return false;
                        }
                        if (keyEvent.getAction() == 1) {
                            xgyVar2.g();
                            xgy.b bVar2 = xgyVar2.o;
                            if (bVar2 != null) {
                                bVar2.D();
                            }
                        }
                        return true;
                    }
                });
            }
            this.o = xgyVar;
            a2.setAutoSuggestPopupListener(vdl0Var);
            View invoke3 = aVar.f.invoke();
            if (invoke3 != null) {
                a2.M(invoke3);
            }
            a2.setAutoSuggestTextProvider(new com.vk.ecomm.catalog.impl.geo.a(this));
            a2.getInput().addTextChangedListener(hVar);
        }
        c2y0 a4 = mggVar.a();
        if (a4 == null) {
            return;
        }
        this.l = new q420(a4.getInput(), new ine0(), objArr == true ? 1 : 0, 28);
        a4.setEditTextSelectionChangeListener(new hp7(1, a4, this));
        q420 q420Var = this.l;
        (q420Var == null ? null : q420Var).e(true);
        q420 q420Var2 = this.l;
        (q420Var2 != null ? q420Var2 : null).g = new hr80();
    }

    @Override // xsna.eeg
    public final void a(iag iagVar) {
        this.g.a(iagVar);
    }

    @Override // xsna.eeg
    public final void b(iag iagVar, ReactionMeta reactionMeta) {
        this.g.b(iagVar, reactionMeta);
    }

    @Override // xsna.eeg
    public final UserId c() {
        return this.g.c();
    }

    @Override // xsna.eeg
    public final void d(int i) {
        c2y0 a2 = this.b.a();
        if (a2 != null) {
            a2.d(i);
        }
    }

    @Override // xsna.eeg
    public final void e(StickerAttachment stickerAttachment, o4l0 o4l0Var) {
        mgg.a aVar = this.b.a;
        PopupStickerAnimation popupStickerAnimation = stickerAttachment.f.k;
        if (popupStickerAnimation == null) {
            return;
        }
        PopupStickerView popupStickerView = new PopupStickerView(aVar.a.invoke().requireContext(), null, 0, 14, 0);
        popupStickerView.setLoadingCallback(o4l0Var);
        PopupStickerView.d(popupStickerView, popupStickerAnimation, false, null, 12);
        ViewGroup invoke = aVar.h.invoke();
        if (invoke == null) {
            invoke = aVar.b.invoke();
        }
        invoke.setVisibility(0);
        invoke.addView(popupStickerView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // xsna.eeg
    public final boolean f(boolean z) {
        c2y0 a2;
        if (z && (a2 = this.b.a()) != null) {
            a2.n(false);
        }
        xgy xgyVar = this.o;
        if (xgyVar == null || !xgyVar.e()) {
            return false;
        }
        xgyVar.d();
        return true;
    }

    @Override // xsna.eeg
    public final void g(iag iagVar) {
        boolean booleanValue = this.e.invoke(iagVar.getUid()).booleanValue();
        mgg mggVar = this.b;
        boolean z = mggVar.b;
        ArrayList arrayList = new ArrayList();
        t6g0 t6g0Var = t6g0.b;
        gxh b2 = t6g0.b();
        UserId userId = this.a;
        boolean m = b2.m(userId);
        int i = 0;
        boolean z2 = iagVar.T9() > 0;
        boolean V8 = iagVar.V8();
        boolean D4 = iagVar.D4();
        boolean z3 = epx.f(iagVar.getUid(), userId) && m;
        boolean z4 = (booleanValue || z3) ? false : true;
        boolean z5 = (TextUtils.isEmpty(iagVar.getText()) || V8 || D4) ? false : true;
        boolean z6 = (booleanValue || z3) && z && iagVar.z1();
        boolean z7 = this.i && (booleanValue || m);
        if (m && this.h) {
            arrayList.add(new e520(1, R.drawable.vk_icon_reply_outline_28, R.string.reply_from_group, 1, false, 0, 0, false, null, 0, null, false, 8128));
            i = 1;
        }
        if (z2) {
            int i2 = i + 1;
            arrayList.add(new e520(5, R.drawable.vk_icon_users_outline_28, R.string.liked, i2, false, 0, 0, false, null, 0, null, false, 8128));
            i = i2;
        }
        if (z5) {
            int i3 = i + 1;
            arrayList.add(new e520(0, R.drawable.vk_icon_copy_outline_28, R.string.copy_text, i3, false, 0, 0, false, null, 0, null, false, 8128));
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            arrayList.add(new e520(2, R.drawable.vk_icon_report_outline_28, R.string.report_content, i4, false, 0, 0, false, null, 0, null, false, 8128));
            i = i4;
        }
        if (z6) {
            int i5 = i + 1;
            arrayList.add(new e520(4, R.drawable.vk_icon_edit_outline_28, R.string.edit, i5, false, 0, 0, false, null, 0, null, false, 8128));
            i = i5;
        }
        if (z7) {
            arrayList.add(new e520(3, R.drawable.vk_icon_delete_outline_28, R.string.delete_comment, i + 1, true, 0, 0, false, null, 0, null, false, 8128));
        }
        ArrayList q2 = p4g.q(arrayList);
        if (q2.isEmpty()) {
            return;
        }
        g gVar = new g(q2, this, iagVar);
        Context requireContext = mggVar.a.a.invoke().requireContext();
        gVar.b(requireContext, "market_comments", e3m.f(R.attr.vk_ui_action_sheet_text, requireContext), e3m.f(R.attr.vk_ui_text_primary, requireContext), 0);
    }

    @Override // xsna.eeg
    public final void h(boolean z) {
        this.b.b = z;
    }

    @Override // xsna.eeg
    public final void i(iag iagVar) {
        mgg mggVar = this.b;
        this.g.f(iagVar, mggVar.d.invoke(iagVar), mggVar.c);
    }

    @Override // xsna.eeg
    public final void j() {
        this.g.e();
    }

    @Override // xsna.eeg
    public final void k(UserId userId, String str) {
        this.g.g(userId);
        n3g0 b2 = this.b.b();
        if (b2 != null) {
            b2.e(str);
        }
    }

    @Override // xsna.eeg
    public final void l() {
        this.g.g(UserId.d);
        n3g0 b2 = this.b.b();
        if (b2 != null) {
            b2.c();
        }
    }

    public final void m() {
        c2y0 a2 = this.b.a();
        if (a2 == null) {
            return;
        }
        if (a2.e()) {
            this.d.invoke(Boolean.TRUE);
            a2.f(new ieg(0, this, a2), new xw1(this, 4));
        } else {
            q420 q420Var = this.l;
            if (q420Var == null) {
                q420Var = null;
            }
            this.g.j(drm0.p0(q420Var.b()).toString(), a2.l(), true);
        }
    }

    public final void n(lgg lggVar) {
        mgg mggVar = this.b;
        mgg.a aVar = mggVar.a;
        if (lggVar instanceof lgg.d) {
            this.f.invoke(((lgg.d) lggVar).a);
            return;
        }
        if (epx.f(lggVar, lgg.g.a)) {
            Toast.makeText(aVar.a.invoke().requireContext(), R.string.board_comment_sent, 0).show();
            return;
        }
        if (epx.f(lggVar, lgg.h.a)) {
            Toast.makeText(aVar.a.invoke().requireContext(), R.string.error, 0).show();
            return;
        }
        if (lggVar instanceof lgg.a) {
            c2y0 a2 = mggVar.a();
            if (a2 == null) {
                return;
            }
            a2.F();
            a2.setText("");
            mhy.d(a2.getInput());
            ofg invoke = aVar.g.invoke();
            if (invoke != null) {
                invoke.e();
                return;
            }
            return;
        }
        if (lggVar instanceof lgg.c) {
            ofg invoke2 = aVar.g.invoke();
            if (invoke2 != null) {
                invoke2.c(((lgg.c) lggVar).a);
                return;
            }
            return;
        }
        if (lggVar instanceof lgg.f) {
            ofg invoke3 = aVar.g.invoke();
            if (invoke3 != null) {
                invoke3.b(((lgg.f) lggVar).a);
                return;
            }
            return;
        }
        if (lggVar instanceof lgg.b) {
            ofg invoke4 = aVar.g.invoke();
            if (invoke4 != null) {
                iag iagVar = ((lgg.b) lggVar).a;
                invoke4.a();
                return;
            }
            return;
        }
        if (!(lggVar instanceof lgg.e)) {
            throw new NoWhenBranchMatchedException();
        }
        ofg invoke5 = aVar.g.invoke();
        if (invoke5 != null) {
            invoke5.d(((lgg.e) lggVar).a);
        }
    }

    @Override // xsna.eeg
    public final UserId p() {
        return this.g.p();
    }

    @Override // xsna.eeg
    public final void release() {
        EditText input;
        this.k.dispose();
        mgg mggVar = this.b;
        c2y0 a2 = mggVar.a();
        if (a2 != null && (input = a2.getInput()) != null) {
            input.removeTextChangedListener(this.m);
        }
        c2y0 a3 = mggVar.a();
        if (a3 != null) {
            a3.N();
        }
        this.n = null;
        this.o = null;
    }

    @Override // xsna.eeg
    public final void x(int i) {
        if (this.b.b) {
            xgy xgyVar = this.o;
            if (xgyVar != null) {
                int i2 = xgy.F;
                xgyVar.h(null);
            }
            StickersView stickersView = this.n;
            if (stickersView != null) {
                stickersView.g(i);
            }
        }
    }
}
