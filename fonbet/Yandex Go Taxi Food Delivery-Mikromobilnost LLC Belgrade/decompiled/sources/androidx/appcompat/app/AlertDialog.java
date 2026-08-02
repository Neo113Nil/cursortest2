package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import defpackage.fah0;
import defpackage.iog0;
import defpackage.op31;
import defpackage.rq1;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    final androidx.appcompat.app.a mAlert;

    public AlertDialog(Context context, int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new androidx.appcompat.app.a(getContext(), this, getWindow());
    }

    public static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(iog0.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        androidx.appcompat.app.a aVar = this.mAlert;
        if (i == -3) {
            return aVar.v;
        }
        if (i == -2) {
            return aVar.r;
        }
        if (i == -1) {
            return aVar.n;
        }
        aVar.getClass();
        return null;
    }

    public ListView getListView() {
        return this.mAlert.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        androidx.appcompat.app.a aVar = this.mAlert;
        int i2 = aVar.I;
        int i3 = aVar.J;
        if (i3 != 0 && aVar.P == 1) {
            i2 = i3;
        }
        aVar.b.setContentView(i2);
        Context context = aVar.a;
        Window window = aVar.c;
        View findViewById2 = window.findViewById(fah0.parentPanel);
        View findViewById3 = findViewById2.findViewById(fah0.topPanel);
        View findViewById4 = findViewById2.findViewById(fah0.contentPanel);
        View findViewById5 = findViewById2.findViewById(fah0.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(fah0.customPanel);
        View view = aVar.h;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !androidx.appcompat.app.a.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(fah0.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (aVar.m) {
                frameLayout.setPadding(aVar.i, aVar.j, aVar.k, aVar.l);
            }
            if (aVar.g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(fah0.topPanel);
        View findViewById7 = viewGroup.findViewById(fah0.contentPanel);
        View findViewById8 = viewGroup.findViewById(fah0.buttonPanel);
        ViewGroup b = androidx.appcompat.app.a.b(findViewById6, findViewById3);
        ViewGroup b2 = androidx.appcompat.app.a.b(findViewById7, findViewById4);
        ViewGroup b3 = androidx.appcompat.app.a.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(fah0.scrollView);
        aVar.z = nestedScrollView;
        nestedScrollView.setFocusable(false);
        aVar.z.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(R.id.message);
        aVar.E = textView;
        if (textView != null) {
            CharSequence charSequence = aVar.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                aVar.z.removeView(aVar.E);
                if (aVar.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) aVar.z.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(aVar.z);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(aVar.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        int i4 = aVar.d;
        Button button = (Button) b3.findViewById(R.id.button1);
        aVar.n = button;
        View.OnClickListener onClickListener = aVar.R;
        button.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(aVar.o) && aVar.q == null) {
            aVar.n.setVisibility(8);
            i = 0;
        } else {
            aVar.n.setText(aVar.o);
            Drawable drawable = aVar.q;
            if (drawable != null) {
                drawable.setBounds(0, 0, i4, i4);
                aVar.n.setCompoundDrawables(aVar.q, null, null, null);
            }
            aVar.n.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) b3.findViewById(R.id.button2);
        aVar.r = button2;
        button2.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(aVar.s) && aVar.u == null) {
            aVar.r.setVisibility(8);
        } else {
            aVar.r.setText(aVar.s);
            Drawable drawable2 = aVar.u;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i4, i4);
                aVar.r.setCompoundDrawables(aVar.u, null, null, null);
            }
            aVar.r.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) b3.findViewById(R.id.button3);
        aVar.v = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(aVar.w) && aVar.y == null) {
            aVar.v.setVisibility(8);
        } else {
            aVar.v.setText(aVar.w);
            Drawable drawable3 = aVar.y;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i4, i4);
                aVar.v.setCompoundDrawables(aVar.y, null, null, null);
            }
            aVar.v.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(iog0.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = aVar.n;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = aVar.r;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = aVar.v;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (aVar.F != null) {
            b.addView(aVar.F, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(fah0.title_template).setVisibility(8);
        } else {
            aVar.C = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(aVar.e) || !aVar.O) {
                window.findViewById(fah0.title_template).setVisibility(8);
                aVar.C.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(fah0.alertTitle);
                aVar.D = textView2;
                textView2.setText(aVar.e);
                int i5 = aVar.A;
                if (i5 != 0) {
                    aVar.C.setImageResource(i5);
                } else {
                    Drawable drawable4 = aVar.B;
                    if (drawable4 != null) {
                        aVar.C.setImageDrawable(drawable4);
                    } else {
                        aVar.D.setPadding(aVar.C.getPaddingLeft(), aVar.C.getPaddingTop(), aVar.C.getPaddingRight(), aVar.C.getPaddingBottom());
                        aVar.C.setVisibility(8);
                    }
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z4 = b3.getVisibility() != 8;
        if (!z4 && (findViewById = b2.findViewById(fah0.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView2 = aVar.z;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (aVar.f == null && aVar.g == null) ? null : b.findViewById(fah0.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(fah0.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = aVar.g;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.setHasDecor(z3, z4);
        }
        if (!z2) {
            View view2 = aVar.g;
            if (view2 == null) {
                view2 = aVar.z;
            }
            if (view2 != null) {
                int i6 = z4 ? 2 : 0;
                View findViewById11 = window.findViewById(fah0.scrollIndicatorUp);
                View findViewById12 = window.findViewById(fah0.scrollIndicatorDown);
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                op31.b(view2, z3 | i6, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = aVar.g;
        if (alertController$RecycleListView2 == null || (listAdapter = aVar.G) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = aVar.H;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mAlert.z;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mAlert.z;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.c(i, charSequence, null, message, null);
    }

    public void setButtonPanelLayoutHint(int i) {
        this.mAlert.P = i;
    }

    public void setCustomTitle(View view) {
        this.mAlert.F = view;
    }

    public void setIcon(Drawable drawable) {
        androidx.appcompat.app.a aVar = this.mAlert;
        aVar.B = drawable;
        aVar.A = 0;
        ImageView imageView = aVar.C;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                aVar.C.setImageDrawable(drawable);
            }
        }
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.d(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        androidx.appcompat.app.a aVar = this.mAlert;
        aVar.f = charSequence;
        TextView textView = aVar.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        androidx.appcompat.app.a aVar = this.mAlert;
        aVar.e = charSequence;
        TextView textView = aVar.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        androidx.appcompat.app.a aVar = this.mAlert;
        aVar.h = view;
        aVar.m = true;
        aVar.i = i;
        aVar.j = i2;
        aVar.k = i3;
        aVar.l = i4;
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.c(i, charSequence, onClickListener, null, null);
    }

    public void setButton(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.c(i, charSequence, onClickListener, null, drawable);
    }

    public void setView(View view) {
        androidx.appcompat.app.a aVar = this.mAlert;
        aVar.h = view;
        aVar.m = false;
    }

    public static class a {
        public final rq1 a;
        public final int b;

        public a(Context context, int i) {
            this.a = new rq1(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.b = i;
        }

        public a a() {
            this.a.m = false;
            return this;
        }

        public a b(Drawable drawable) {
            this.a.c = drawable;
            return this;
        }

        public a c(int i) {
            rq1 rq1Var = this.a;
            rq1Var.f = rq1Var.a.getText(i);
            return this;
        }

        public AlertDialog create() {
            ListAdapter listAdapter;
            final rq1 rq1Var = this.a;
            ContextThemeWrapper contextThemeWrapper = rq1Var.a;
            final ContextThemeWrapper contextThemeWrapper2 = rq1Var.a;
            AlertDialog alertDialog = new AlertDialog(contextThemeWrapper, this.b);
            final androidx.appcompat.app.a aVar = alertDialog.mAlert;
            View view = rq1Var.e;
            if (view != null) {
                aVar.F = view;
            } else {
                CharSequence charSequence = rq1Var.d;
                if (charSequence != null) {
                    aVar.e = charSequence;
                    TextView textView = aVar.D;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = rq1Var.c;
                if (drawable != null) {
                    aVar.B = drawable;
                    aVar.A = 0;
                    ImageView imageView = aVar.C;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        aVar.C.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = rq1Var.f;
            if (charSequence2 != null) {
                aVar.f = charSequence2;
                TextView textView2 = aVar.E;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = rq1Var.g;
            if (charSequence3 != null) {
                aVar.c(-1, charSequence3, rq1Var.h, null, null);
            }
            CharSequence charSequence4 = rq1Var.i;
            if (charSequence4 != null) {
                aVar.c(-2, charSequence4, rq1Var.j, null, null);
            }
            CharSequence charSequence5 = rq1Var.k;
            if (charSequence5 != null) {
                aVar.c(-3, charSequence5, rq1Var.l, null, null);
            }
            if (rq1Var.p != null || rq1Var.q != null) {
                final AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) rq1Var.b.inflate(aVar.K, (ViewGroup) null);
                if (rq1Var.u) {
                    final int i = aVar.L;
                    final int i2 = R.id.text1;
                    final CharSequence[] charSequenceArr = rq1Var.p;
                    listAdapter = new ArrayAdapter<CharSequence>(contextThemeWrapper2, i, i2, charSequenceArr) { // from class: androidx.appcompat.app.AlertController$AlertParams$1
                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public View getView(int i3, View view2, ViewGroup viewGroup) {
                            View view3 = super.getView(i3, view2, viewGroup);
                            boolean[] zArr = rq1.this.t;
                            if (zArr != null && zArr[i3]) {
                                alertController$RecycleListView.setItemChecked(i3, true);
                            }
                            return view3;
                        }
                    };
                } else {
                    final int i3 = rq1Var.v ? aVar.M : aVar.N;
                    ListAdapter listAdapter2 = rq1Var.q;
                    if (listAdapter2 == null) {
                        final int i4 = R.id.text1;
                        final CharSequence[] charSequenceArr2 = rq1Var.p;
                        listAdapter2 = new ArrayAdapter<CharSequence>(contextThemeWrapper2, i3, i4, charSequenceArr2) { // from class: androidx.appcompat.app.AlertController$CheckedItemAdapter
                            @Override // android.widget.ArrayAdapter, android.widget.Adapter
                            public long getItemId(int i5) {
                                return i5;
                            }

                            @Override // android.widget.BaseAdapter, android.widget.Adapter
                            public boolean hasStableIds() {
                                return true;
                            }
                        };
                    }
                    listAdapter = listAdapter2;
                }
                aVar.G = listAdapter;
                aVar.H = rq1Var.w;
                if (rq1Var.r != null) {
                    alertController$RecycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController$AlertParams$3
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public void onItemClick(AdapterView<?> adapterView, View view2, int i5, long j) {
                            rq1.this.r.onClick(aVar.b, i5);
                            if (rq1.this.v) {
                                return;
                            }
                            aVar.b.dismiss();
                        }
                    });
                } else if (rq1Var.x != null) {
                    alertController$RecycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController$AlertParams$4
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public void onItemClick(AdapterView<?> adapterView, View view2, int i5, long j) {
                            boolean[] zArr = rq1.this.t;
                            if (zArr != null) {
                                zArr[i5] = alertController$RecycleListView.isItemChecked(i5);
                            }
                            rq1.this.x.onClick(aVar.b, i5, alertController$RecycleListView.isItemChecked(i5));
                        }
                    });
                }
                if (rq1Var.v) {
                    alertController$RecycleListView.setChoiceMode(1);
                } else if (rq1Var.u) {
                    alertController$RecycleListView.setChoiceMode(2);
                }
                aVar.g = alertController$RecycleListView;
            }
            View view2 = rq1Var.s;
            if (view2 != null) {
                aVar.h = view2;
                aVar.m = false;
            }
            alertDialog.setCancelable(rq1Var.m);
            if (rq1Var.m) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(rq1Var.n);
            alertDialog.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = rq1Var.o;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        public a d(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            rq1 rq1Var = this.a;
            rq1Var.i = charSequence;
            rq1Var.j = onClickListener;
            return this;
        }

        public a f(int i, DialogInterface.OnClickListener onClickListener) {
            rq1 rq1Var = this.a;
            rq1Var.k = rq1Var.a.getText(i);
            rq1Var.l = onClickListener;
            return this;
        }

        public a g(com.yandex.passport.internal.ui.e eVar) {
            this.a.n = eVar;
            return this;
        }

        public Context getContext() {
            return this.a.a;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            rq1 rq1Var = this.a;
            rq1Var.g = charSequence;
            rq1Var.h = onClickListener;
            return this;
        }

        public a i(int i) {
            rq1 rq1Var = this.a;
            rq1Var.d = rq1Var.a.getText(i);
            return this;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            rq1 rq1Var = this.a;
            rq1Var.i = rq1Var.a.getText(i);
            rq1Var.j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            rq1 rq1Var = this.a;
            rq1Var.g = rq1Var.a.getText(i);
            rq1Var.h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.a.s = view;
            return this;
        }

        public a(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }
    }

    public AlertDialog(Context context) {
        this(context, 0);
    }

    public AlertDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    public void setIcon(int i) {
        this.mAlert.d(i);
    }
}
