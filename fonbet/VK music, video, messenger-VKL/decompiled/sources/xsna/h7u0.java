package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vk.stat.scheme.SchemeStat$TypeDialogPermission;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cqu0;
import xsna.eeu0;
import xsna.i7u0;
import xsna.j7u0;
import xsna.u0q0;

/* compiled from: VkAlertDialog.kt */
/* loaded from: classes17.dex */
public final class h7u0 extends i7u0 {
    public static final /* synthetic */ int p = 0;

    /* compiled from: VkAlertDialog.kt */
    public static final class b {
        public static a a(Context context) {
            return new a(context, 0, j7u0.a.a, 2);
        }

        public static a b(Context context) {
            return new a(context, 0, j7u0.b.a, 2);
        }

        public static a c(Context context) {
            return new a(context, 0, j7u0.c.a, 2);
        }
    }

    /* compiled from: VkAlertDialog.kt */
    public static final class a extends i7u0.a {

        /* compiled from: VkAlertDialog.kt */
        /* renamed from: xsna.h7u0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2976a extends FunctionReferenceImpl implements izs<j7u0, amm> {
            @Override // xsna.izs
            public final amm invoke(j7u0 j7u0Var) {
                SchemeStat$TypeDialogPermission schemeStat$TypeDialogPermission;
                j7u0 j7u0Var2 = j7u0Var;
                ((cqu0.a) this.receiver).getClass();
                u0q0.a aVar = new u0q0.a();
                aVar.a = SchemeStat$TypeDialogItem.DialogItem.NOWHERE;
                if (!j7u0Var2.equals(j7u0.d.a)) {
                    if (j7u0Var2.equals(j7u0.a.a)) {
                        aVar.a = SchemeStat$TypeDialogItem.DialogItem.ACCEPTANCE;
                    } else if (j7u0Var2.equals(j7u0.b.a)) {
                        aVar.a = SchemeStat$TypeDialogItem.DialogItem.AGREEMENT;
                    } else if (j7u0Var2.equals(j7u0.c.a)) {
                        aVar.a = SchemeStat$TypeDialogItem.DialogItem.CONFIRMATION;
                    } else {
                        if (!(j7u0Var2 instanceof j7u0.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.a = SchemeStat$TypeDialogItem.DialogItem.PERMISSION;
                        String[] strArr = ((j7u0.e) j7u0Var2).a;
                        ArrayList arrayList = new ArrayList(strArr.length);
                        for (String str : strArr) {
                            if (cqu0.c.contains(str)) {
                                schemeStat$TypeDialogPermission = SchemeStat$TypeDialogPermission.DISK;
                            } else if (cqu0.d.contains(str)) {
                                schemeStat$TypeDialogPermission = SchemeStat$TypeDialogPermission.GEO;
                            } else if (epx.f(str, "android.permission.CAMERA")) {
                                schemeStat$TypeDialogPermission = SchemeStat$TypeDialogPermission.CAMERA;
                            } else {
                                if (!epx.f(str, "android.permission.RECORD_AUDIO")) {
                                    throw new IllegalArgumentException(zr.a("Permission ", str, " isn't supported"));
                                }
                                schemeStat$TypeDialogPermission = SchemeStat$TypeDialogPermission.MIC;
                            }
                            arrayList.add(schemeStat$TypeDialogPermission);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            SchemeStat$TypeDialogPermission schemeStat$TypeDialogPermission2 = (SchemeStat$TypeDialogPermission) it.next();
                            HashSet<SchemeStat$TypeDialogPermission> hashSet = aVar.b;
                            if (hashSet == null) {
                                aVar.b = izi0.d(schemeStat$TypeDialogPermission2);
                            } else {
                                hashSet.add(schemeStat$TypeDialogPermission2);
                            }
                        }
                    }
                }
                return new cqu0(aVar);
            }
        }

        public /* synthetic */ a(Context context, int i, j7u0 j7u0Var, int i2) {
            this(context, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? j7u0.d.a : j7u0Var);
        }

        @Override // xsna.eeu0.a
        /* renamed from: A */
        public final eeu0.a k(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            super.O(charSequenceArr, i, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a
        public final eeu0.a B(int i) {
            super.P(i);
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: C */
        public final eeu0.a setTitle(CharSequence charSequence) {
            super.Q(charSequence);
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: D */
        public final eeu0.a setView(View view) {
            this.f = view;
            return this;
        }

        public final void R(BaseAdapter baseAdapter, DialogInterface.OnClickListener onClickListener) {
            this.d = true;
            AlertController.b bVar = this.a;
            bVar.r = baseAdapter;
            bVar.s = onClickListener;
        }

        public final void S() {
            this.c = false;
        }

        public final void T(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            super.E(charSequenceArr, onClickListener);
        }

        public final void U(int i) {
            super.F(i);
        }

        public final void V(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            super.G(charSequenceArr, zArr, onMultiChoiceClickListener);
        }

        public final void W(int i, DialogInterface.OnClickListener onClickListener) {
            super.H(i, onClickListener);
        }

        public final void X(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.I(charSequence, onClickListener);
        }

        public final void Y(String str, td20 td20Var) {
            super.K(str, td20Var);
        }

        public final void Z(lad ladVar) {
            super.J(R.string.ok, ladVar);
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a a(boolean z) {
            this.c = false;
            return this;
        }

        public final void a0(DialogInterface.OnDismissListener onDismissListener) {
            super.L(onDismissListener);
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a b(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            super.E(charSequenceArr, onClickListener);
            return this;
        }

        public final void b0(DialogInterface.OnShowListener onShowListener) {
            this.h = this.j.b(onShowListener);
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a c(int i) {
            throw null;
        }

        public final void c0(int i, DialogInterface.OnClickListener onClickListener) {
            super.M(i, onClickListener);
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a d(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public final void d0(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.N(charSequence, onClickListener);
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final void e(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            super.G(charSequenceArr, zArr, onMultiChoiceClickListener);
        }

        public final void e0(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            super.O(charSequenceArr, i, onClickListener);
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.I(charSequence, onClickListener);
            return this;
        }

        public final d.a f0(int i) {
            super.P(R.string.dnd_time_chooser_title);
            return this;
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.K(charSequence, onClickListener);
        }

        public final void g0(int i) {
            super.P(i);
        }

        public final void h0(CharSequence charSequence) {
            super.Q(charSequence);
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a i(DialogInterface.OnDismissListener onDismissListener) {
            super.L(onDismissListener);
            return this;
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.N(charSequence, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final void k(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            super.O(charSequenceArr, i, onClickListener);
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a l(int i) {
            throw null;
        }

        @Override // xsna.eeu0.a
        /* renamed from: o */
        public final eeu0.a a(boolean z) {
            this.c = z;
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: p */
        public final eeu0.a b(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            super.E(charSequenceArr, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a
        public final eeu0.a q(int i) {
            super.F(i);
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: r */
        public final eeu0.a d(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: s */
        public final eeu0.a e(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            super.G(charSequenceArr, zArr, onMultiChoiceClickListener);
            return this;
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            super.H(i, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            super.M(i, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a setTitle(CharSequence charSequence) {
            super.Q(charSequence);
            return this;
        }

        @Override // xsna.eeu0.a, androidx.appcompat.app.d.a
        public final d.a setView(View view) {
            this.f = view;
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: t */
        public final eeu0.a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            super.H(i, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: u */
        public final eeu0.a f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.I(charSequence, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a
        public final eeu0.a v(int i, DialogInterface.OnClickListener onClickListener) {
            super.J(i, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: w */
        public final eeu0.a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.K(charSequence, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: x */
        public final eeu0.a i(DialogInterface.OnDismissListener onDismissListener) {
            super.L(onDismissListener);
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: y */
        public final eeu0.a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            super.M(i, onClickListener);
            return this;
        }

        @Override // xsna.eeu0.a
        /* renamed from: z */
        public final eeu0.a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            super.N(charSequence, onClickListener);
            return this;
        }

        public a(Context context, int i, j7u0 j7u0Var) {
            super(context, i, j7u0Var, new C2976a(1, cqu0.b, cqu0.a.class, "from", "from$vk_release(Lcom/vk/core/view/components/alert/VkAlertDialogType;)Lcom/vk/core/dialog/DialogTracker;", 0));
        }

        public a(Context context) {
            this(context, 0, null, 4);
        }
    }
}
