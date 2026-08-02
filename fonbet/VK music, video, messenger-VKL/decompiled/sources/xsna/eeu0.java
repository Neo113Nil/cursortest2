package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.eeu0;

/* compiled from: VkBaseAlertDialog.kt */
/* loaded from: classes17.dex */
public class eeu0 extends androidx.appcompat.app.d {
    public static final int i = iah0.a(400);
    public static final int j = iah0.a(8);
    public static final int k = iah0.a(14);
    public static final int l = iah0.a(16);
    public static final int m = iah0.a(10);
    public static final int n = iah0.a(2);

    /* compiled from: VkBaseAlertDialog.kt */
    public static class a extends d.a {
        public boolean c;
        public boolean d;
        public boolean e;
        public View f;
        public Integer g;
        public DialogInterface.OnShowListener h;
        public DialogInterface.OnDismissListener i;

        public a(Context context, int i) {
            super(context, i);
            this.c = true;
            super.l(R.layout.vk_alert_dialog);
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public a k(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            this.d = true;
            super.k(charSequenceArr, i, onClickListener);
            return this;
        }

        public a B(int i) {
            AlertController.b bVar = this.a;
            bVar.d = bVar.a.getText(i);
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public a setTitle(CharSequence charSequence) {
            super.setTitle(charSequence);
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public a setView(View view) {
            this.f = view;
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        public /* bridge */ /* synthetic */ d.a c(int i) {
            throw null;
        }

        @Override // androidx.appcompat.app.d.a
        public androidx.appcompat.app.d create() {
            Context context;
            Drawable a;
            androidx.appcompat.app.d create = super.create();
            create.setCancelable(this.c);
            Window window = create.getWindow();
            if (window != null) {
                TypedValue typedValue = new TypedValue();
                if (getContext().getTheme().resolveAttribute(R.attr.vkAlertDialogWindowBackground, typedValue, true)) {
                    a = getContext().getDrawable(typedValue.resourceId);
                } else {
                    Context context2 = getContext();
                    ContextThemeWrapper contextThemeWrapper = context2 instanceof ContextThemeWrapper ? (ContextThemeWrapper) context2 : null;
                    if (contextThemeWrapper == null || (context = contextThemeWrapper.getBaseContext()) == null) {
                        context = getContext();
                    }
                    a = gu9.a(context);
                }
                window.setBackgroundDrawable(a);
            }
            return create;
        }

        @Override // androidx.appcompat.app.d.a
        public /* bridge */ /* synthetic */ d.a l(int i) {
            throw null;
        }

        @Override // androidx.appcompat.app.d.a
        public final androidx.appcompat.app.d m() {
            View decorView;
            boolean z;
            Activity h = e3m.h(getContext());
            if (h == null || h.isDestroyed() || h.isFinishing()) {
                return null;
            }
            androidx.appcompat.app.d create = create();
            create.setOnShowListener(this.h);
            create.setOnDismissListener(this.i);
            create.setCancelable(this.c);
            ea0.a(h, new ikk0(create, 18));
            create.show();
            FrameLayout frameLayout = (FrameLayout) create.findViewById(R.id.customContent);
            boolean z2 = false;
            if (frameLayout != null) {
                if (this.f == null && this.g != null) {
                    this.f = LayoutInflater.from(frameLayout.getContext()).inflate(this.g.intValue(), (ViewGroup) frameLayout, false);
                }
                View view = this.f;
                if (view != null) {
                    frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
                    if (view instanceof ViewGroup) {
                        Iterator kxt0Var = new kxt0((ViewGroup) view);
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            if (!kxt0Var.hasNext()) {
                                break;
                            }
                            Object next = kxt0Var.next();
                            View view2 = (View) next;
                            ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                            kxt0 kxt0Var2 = viewGroup != null ? new kxt0(viewGroup) : null;
                            if (kxt0Var2 == null || !kxt0Var2.hasNext()) {
                                while (!kxt0Var.hasNext() && !arrayList.isEmpty()) {
                                    kxt0Var = (Iterator) j5g.i0(arrayList);
                                    g5g.I(arrayList);
                                }
                            } else {
                                arrayList.add(kxt0Var);
                                kxt0Var = kxt0Var2;
                            }
                            if (((View) next) instanceof EditText) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            ViewGroup viewGroup2 = (ViewGroup) create.findViewById(R.id.parentContent);
            if (viewGroup2 != null && (!(z = this.d) || (z && this.e))) {
                ywt0.a(viewGroup2, 0, eeu0.j, 0, eeu0.k, 5);
            }
            if (z2) {
                int i = eeu0.i;
                Window window = create.getWindow();
                if (window != null) {
                    window.clearFlags(131080);
                    window.setSoftInputMode(5);
                }
            }
            Window window2 = create.getWindow();
            if (window2 != null && (decorView = window2.getDecorView()) != null) {
                mdm0 mdm0Var = new mdm0(create, 22);
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnPreDrawListener(new nwt0(decorView, mdm0Var));
                }
            }
            return create;
        }

        public final C2801a n() {
            return new C2801a(this);
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a a(boolean z) {
            this.c = z;
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a b(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.d = true;
            super.b(charSequenceArr, onClickListener);
            return this;
        }

        public a q(int i) {
            super.c(i);
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a d(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a e(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.d = true;
            super.e(charSequenceArr, zArr, onMultiChoiceClickListener);
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            this.e = true;
            super.setNegativeButton(i, onClickListener);
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public a f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.e = true;
            super.f(charSequence, onClickListener);
            return this;
        }

        public a v(int i, DialogInterface.OnClickListener onClickListener) {
            this.e = true;
            AlertController.b bVar = this.a;
            bVar.k = bVar.a.getText(i);
            bVar.l = onClickListener;
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.e = true;
            super.g(charSequence, onClickListener);
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public a i(DialogInterface.OnDismissListener onDismissListener) {
            this.i = onDismissListener;
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            this.e = true;
            super.setPositiveButton(i, onClickListener);
            return this;
        }

        @Override // androidx.appcompat.app.d.a
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.e = true;
            super.j(charSequence, onClickListener);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            this(context, R.style.VkAlertDialogTheme);
            int i = eeu0.i;
        }

        /* compiled from: VkBaseAlertDialog.kt */
        /* renamed from: xsna.eeu0$a$a, reason: collision with other inner class name */
        public static final class C2801a {
            public final a a;
            public CharSequence b;
            public Integer c;
            public String d;
            public Integer e;
            public Integer f;
            public CharSequence g;
            public CharSequence h;
            public Integer i;
            public String j;
            public String k;
            public String l;
            public Integer m;
            public boolean n;
            public wzs<? super DialogInterface, ? super CharSequence, s3q0> o;
            public boolean q;
            public wzs<? super EditText, ? super TextView, s3q0> s;
            public wzs<? super DialogInterface, ? super CharSequence, s3q0> t;
            public wzs<? super DialogInterface, ? super CharSequence, s3q0> u;
            public boolean p = true;
            public int r = 3;

            public C2801a(a aVar) {
                this.a = aVar;
            }

            public final void a(n3x n3xVar, CharSequence charSequence) {
                CharSequence p0;
                if (this.n) {
                    boolean z = false;
                    if (charSequence != null && (p0 = drm0.p0(charSequence)) != null && p0.length() > 0) {
                        z = true;
                    }
                    TextView buttonOk = n3xVar.getButtonOk();
                    if (buttonOk != null) {
                        buttonOk.setEnabled(z);
                    }
                    TextView positiveBtn = n3xVar.getPositiveBtn();
                    if (positiveBtn != null) {
                        positiveBtn.setEnabled(z);
                    }
                }
            }

            public final void b() {
                this.n = true;
            }

            public final void c(int i, wzs wzsVar, boolean z) {
                this.j = this.a.getContext().getString(i);
                this.o = wzsVar;
                this.p = z;
            }

            public final void e(int i) {
                this.h = this.a.getContext().getString(i);
            }

            public final void f(int i) {
                this.b = this.a.getContext().getString(i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, android.app.Dialog, androidx.appcompat.app.d] */
            public final androidx.appcompat.app.d g() {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                a aVar = this.a;
                final n3x n3xVar = new n3x(aVar.getContext());
                int i = eeu0.l;
                n3xVar.setPadding(i, eeu0.m, i, eeu0.n);
                n3xVar.getEtInput().post(new ro2(5, this, n3xVar));
                n3xVar.getTvTitle().setText(this.b);
                Integer num = this.c;
                if (num != null) {
                    int intValue = num.intValue();
                    ViewGroup.LayoutParams layoutParams = n3xVar.getTvTitle().getLayoutParams();
                    LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.gravity = intValue;
                    }
                }
                n3xVar.getTvMessage().setText(this.d);
                Integer num2 = this.e;
                if (num2 != null) {
                    n3xVar.getTvMessage().setGravity(num2.intValue());
                }
                Integer num3 = this.f;
                if (num3 != null) {
                    n3xVar.getTvMessage().setMaxHeight(num3.intValue());
                    n3xVar.getTvMessage().setMovementMethod(new ScrollingMovementMethod());
                }
                n3xVar.getEtInput().setText(this.g);
                n3xVar.getEtInput().setMaxLines(this.r);
                Integer num4 = this.i;
                if (num4 != null) {
                    n3xVar.getEtInput().setMaxHeight(num4.intValue());
                }
                CharSequence charSequence = this.g;
                if (charSequence != null && charSequence.length() != 0) {
                    EditText etInput = n3xVar.getEtInput();
                    CharSequence charSequence2 = this.g;
                    etInput.setSelection(charSequence2 != null ? charSequence2.length() : 0);
                }
                n3xVar.getEtInput().setHint(this.h);
                n3xVar.getButtonOk().setText(this.j);
                Integer num5 = this.m;
                if (num5 != null) {
                    n3xVar.getButtonOk().setVisibility(num5.intValue());
                }
                n3xVar.getPositiveBtn().setText(this.k);
                n3xVar.getNegativeBtn().setText(this.l);
                TextView positiveBtn = n3xVar.getPositiveBtn();
                String str = this.k;
                positiveBtn.setVisibility((str == null || str.length() == 0) ? 8 : 0);
                TextView negativeBtn = n3xVar.getNegativeBtn();
                String str2 = this.l;
                negativeBtn.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
                if (this.t != null) {
                    jjc.g(n3xVar.getPositiveBtn(), new zu1(ref$ObjectRef, this, n3xVar, 6));
                }
                if (this.u != null) {
                    jjc.g(n3xVar.getNegativeBtn(), new nn4(ref$ObjectRef, this, n3xVar, 11));
                }
                if (this.q) {
                    mhy.j(n3xVar.getEtInput());
                }
                aVar.setView(n3xVar);
                ?? m = aVar.m();
                ref$ObjectRef.element = m;
                if (m == 0) {
                    return null;
                }
                Window window = m.getWindow();
                if (window != null) {
                    window.clearFlags(131080);
                    window.setSoftInputMode(5);
                }
                ((androidx.appcompat.app.d) ref$ObjectRef.element).setOnShowListener(new ceu0(n3xVar, 0));
                n3xVar.getButtonOk().setOnClickListener(new View.OnClickListener() { // from class: xsna.deu0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String str3;
                        eeu0.a.C2801a c2801a = eeu0.a.C2801a.this;
                        wzs<? super DialogInterface, ? super CharSequence, s3q0> wzsVar = c2801a.o;
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        if (wzsVar != null) {
                            Object obj = ref$ObjectRef2.element;
                            Editable text = n3xVar.getEtInput().getText();
                            if (text == null || (str3 = text.toString()) == null) {
                                str3 = "";
                            }
                            wzsVar.invoke(obj, str3);
                        }
                        if (c2801a.p) {
                            ((androidx.appcompat.app.d) ref$ObjectRef2.element).dismiss();
                        }
                    }
                });
                if (this.n) {
                    a(n3xVar, this.g);
                    n3xVar.getEtInput().addTextChangedListener(new C2802a(n3xVar));
                }
                return (androidx.appcompat.app.d) ref$ObjectRef.element;
            }

            /* compiled from: VkBaseAlertDialog.kt */
            /* renamed from: xsna.eeu0$a$a$a, reason: collision with other inner class name */
            public static final class C2802a implements TextWatcher {
                public final /* synthetic */ n3x c;

                public C2802a(n3x n3xVar) {
                    this.c = n3xVar;
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    C2801a.this.a(this.c, editable);
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            }
        }
    }
}
