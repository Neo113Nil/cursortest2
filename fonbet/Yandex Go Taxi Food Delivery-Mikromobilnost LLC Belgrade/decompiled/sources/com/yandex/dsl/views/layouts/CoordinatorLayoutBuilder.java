package com.yandex.dsl.views.layouts;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import defpackage.bog0;
import defpackage.eng0;
import defpackage.gog0;
import defpackage.iog0;
import defpackage.kzx;
import defpackage.mzx;
import defpackage.tls;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u000e*\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u0015*\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0019H\u0096\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/dsl/views/layouts/CoordinatorLayoutBuilder;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lkzx;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;", "Landroid/content/Context;", "context", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;II)V", "(Landroid/content/Context;)V", "Landroid/view/ViewManager;", "viewManager", "Lzy11;", "attachTo", "(Landroid/view/ViewManager;)V", "width", "height", "generateLayoutParams", "(II)Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;", "Landroid/view/View;", "addToParent", "(Landroid/view/View;)V", CA20Status.STATUS_CERTIFICATE_V, "Lkotlin/Function1;", "init", "invoke", "(Landroid/view/View;Ltls;)Landroid/view/View;", "getCtx", "()Landroid/content/Context;", "ctx", "core-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CoordinatorLayoutBuilder extends CoordinatorLayout implements kzx {
    private final /* synthetic */ kzx $$delegate_0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.dsl.views.layouts.CoordinatorLayoutBuilder$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        public static final AnonymousClass1 b = new AnonymousClass1(2, 0, CoordinatorLayout.LayoutParams.class, "<init>", "<init>(II)V");

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return new CoordinatorLayout.LayoutParams(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CoordinatorLayoutBuilder(Context context) {
        this(context, r0, 0);
        int i;
        if (CoordinatorLayout.class.equals(TextView.class) ? true : CoordinatorLayout.class.equals(AppCompatTextView.class)) {
            i = R.attr.textViewStyle;
        } else if (CoordinatorLayout.class.equals(Button.class)) {
            i = R.attr.buttonStyle;
        } else if (CoordinatorLayout.class.equals(EditText.class)) {
            i = R.attr.editTextStyle;
        } else if (CoordinatorLayout.class.equals(AppCompatEditText.class)) {
            i = iog0.editTextStyle;
        } else if (CoordinatorLayout.class.equals(Spinner.class)) {
            i = R.attr.spinnerStyle;
        } else if (CoordinatorLayout.class.equals(ImageButton.class)) {
            i = R.attr.imageButtonStyle;
        } else if (CoordinatorLayout.class.equals(AppCompatImageButton.class)) {
            i = iog0.imageButtonStyle;
        } else if (CoordinatorLayout.class.equals(CheckBox.class)) {
            i = R.attr.checkboxStyle;
        } else if (CoordinatorLayout.class.equals(AppCompatCheckBox.class)) {
            i = iog0.checkboxStyle;
        } else if (CoordinatorLayout.class.equals(RadioButton.class)) {
            i = R.attr.radioButtonStyle;
        } else if (CoordinatorLayout.class.equals(AppCompatRadioButton.class)) {
            i = iog0.radioButtonStyle;
        } else if (CoordinatorLayout.class.equals(CheckedTextView.class)) {
            i = R.attr.checkedTextViewStyle;
        } else if (CoordinatorLayout.class.equals(AutoCompleteTextView.class) || CoordinatorLayout.class.equals(MultiAutoCompleteTextView.class)) {
            i = 16842859;
        } else if (CoordinatorLayout.class.equals(RatingBar.class)) {
            i = R.attr.ratingBarStyle;
        } else if (CoordinatorLayout.class.equals(AppCompatRatingBar.class)) {
            i = iog0.ratingBarStyle;
        } else if (CoordinatorLayout.class.equals(SeekBar.class)) {
            i = R.attr.seekBarStyle;
        } else if (CoordinatorLayout.class.equals(AppCompatSeekBar.class)) {
            i = iog0.seekBarStyle;
        } else if (CoordinatorLayout.class.equals(ProgressBar.class)) {
            i = R.attr.progressBarStyle;
        } else if (CoordinatorLayout.class.equals(RecyclerView.class)) {
            i = gog0.recyclerViewStyle;
        } else if (CoordinatorLayout.class.equals(CoordinatorLayout.class)) {
            i = bog0.coordinatorLayoutStyle;
        } else if (CoordinatorLayout.class.equals(Toolbar.class)) {
            i = iog0.toolbarStyle;
        } else if (CoordinatorLayout.class.equals(FloatingActionButton.class)) {
            i = eng0.floatingActionButtonStyle;
        } else {
            i = CoordinatorLayout.class.equals(SwitchCompat.class) ? true : CoordinatorLayout.class.equals(SwitchMaterial.class) ? eng0.switchStyle : 0;
        }
    }

    @Override // defpackage.kzx
    public void addToParent(View view) {
        this.$$delegate_0.addToParent(view);
    }

    @Override // defpackage.kzx
    public void attachTo(ViewManager viewManager) {
        this.$$delegate_0.attachTo(viewManager);
    }

    @Override // defpackage.kzx
    public CoordinatorLayout.LayoutParams generateLayoutParams(int width, int height) {
        return (CoordinatorLayout.LayoutParams) this.$$delegate_0.generateLayoutParams(width, height);
    }

    @Override // defpackage.jp31
    public Context getCtx() {
        return getContext();
    }

    @Override // defpackage.kzx
    public <V extends View> V invoke(V v, tls tlsVar) {
        return (V) this.$$delegate_0.invoke(v, tlsVar);
    }

    public CoordinatorLayoutBuilder(Context context, int i, int i2) {
        super(context, null, i);
        this.$$delegate_0 = new mzx(context, AnonymousClass1.b);
        attachTo(this);
    }
}
