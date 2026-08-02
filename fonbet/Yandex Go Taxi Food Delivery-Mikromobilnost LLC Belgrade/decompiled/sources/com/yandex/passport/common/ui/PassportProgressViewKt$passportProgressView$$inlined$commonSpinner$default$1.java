package com.yandex.passport.common.ui;

import android.content.Context;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lightside.slab.SlotView;
import com.yandex.passport.common.ui.view.CommonSpinner;
import defpackage.er31;
import defpackage.l521;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class PassportProgressViewKt$passportProgressView$$inlined$commonSpinner$default$1 extends FunctionReferenceImpl implements zls {
    public static final PassportProgressViewKt$passportProgressView$$inlined$commonSpinner$default$1 b = new PassportProgressViewKt$passportProgressView$$inlined$commonSpinner$default$1();

    public PassportProgressViewKt$passportProgressView$$inlined$commonSpinner$default$1() {
        super(3, 1, er31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue == 0 && intValue2 == 0) {
            return (CommonSpinner) ((CommonSpinner.class.equals(TextView.class) || CommonSpinner.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : CommonSpinner.class.equals(Button.class) ? new Button(context) : (CommonSpinner.class.equals(ImageView.class) || CommonSpinner.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (CommonSpinner.class.equals(EditText.class) || CommonSpinner.class.equals(AppCompatEditText.class)) ? new AppCompatEditText(context) : CommonSpinner.class.equals(Spinner.class) ? new Spinner(context) : (CommonSpinner.class.equals(ImageButton.class) || CommonSpinner.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (CommonSpinner.class.equals(CheckBox.class) || CommonSpinner.class.equals(AppCompatCheckBox.class)) ? new AppCompatCheckBox(context) : (CommonSpinner.class.equals(RadioButton.class) || CommonSpinner.class.equals(AppCompatRadioButton.class)) ? new AppCompatRadioButton(context) : CommonSpinner.class.equals(RadioGroup.class) ? new RadioGroup(context) : CommonSpinner.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : CommonSpinner.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : CommonSpinner.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (CommonSpinner.class.equals(RatingBar.class) || CommonSpinner.class.equals(AppCompatRatingBar.class)) ? new AppCompatRatingBar(context) : (CommonSpinner.class.equals(SeekBar.class) || CommonSpinner.class.equals(AppCompatSeekBar.class)) ? new AppCompatSeekBar(context) : CommonSpinner.class.equals(ProgressBar.class) ? new ProgressBar(context) : CommonSpinner.class.equals(Space.class) ? new Space(context) : CommonSpinner.class.equals(RecyclerView.class) ? new RecyclerView(context) : CommonSpinner.class.equals(View.class) ? new View(context) : CommonSpinner.class.equals(Toolbar.class) ? new Toolbar(context) : CommonSpinner.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : CommonSpinner.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : l521.b(context, CommonSpinner.class));
        }
        return (CommonSpinner) (CommonSpinner.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : CommonSpinner.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : CommonSpinner.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : CommonSpinner.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : CommonSpinner.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : CommonSpinner.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : CommonSpinner.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : CommonSpinner.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : CommonSpinner.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : CommonSpinner.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : CommonSpinner.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : CommonSpinner.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : CommonSpinner.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : CommonSpinner.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : CommonSpinner.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : CommonSpinner.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : CommonSpinner.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : CommonSpinner.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : CommonSpinner.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : CommonSpinner.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : CommonSpinner.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : CommonSpinner.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : CommonSpinner.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : CommonSpinner.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : CommonSpinner.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : CommonSpinner.class.equals(View.class) ? new View(context, null, intValue, intValue2) : CommonSpinner.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : CommonSpinner.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : CommonSpinner.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : l521.a(CommonSpinner.class, context, intValue, intValue2));
    }
}
