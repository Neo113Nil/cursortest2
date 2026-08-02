package com.yandex.passport.internal.ui.bouncer.roundabout.items;

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
import com.yandex.passport.internal.badges.MaxLinesChipGroup;
import defpackage.er31;
import defpackage.l521;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class AccountUi$special$$inlined$view$default$1 extends FunctionReferenceImpl implements zls {
    public static final AccountUi$special$$inlined$view$default$1 b = new AccountUi$special$$inlined$view$default$1();

    public AccountUi$special$$inlined$view$default$1() {
        super(3, 1, er31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue == 0 && intValue2 == 0) {
            return (MaxLinesChipGroup) ((MaxLinesChipGroup.class.equals(TextView.class) || MaxLinesChipGroup.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : MaxLinesChipGroup.class.equals(Button.class) ? new Button(context) : (MaxLinesChipGroup.class.equals(ImageView.class) || MaxLinesChipGroup.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (MaxLinesChipGroup.class.equals(EditText.class) || MaxLinesChipGroup.class.equals(AppCompatEditText.class)) ? new AppCompatEditText(context) : MaxLinesChipGroup.class.equals(Spinner.class) ? new Spinner(context) : (MaxLinesChipGroup.class.equals(ImageButton.class) || MaxLinesChipGroup.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (MaxLinesChipGroup.class.equals(CheckBox.class) || MaxLinesChipGroup.class.equals(AppCompatCheckBox.class)) ? new AppCompatCheckBox(context) : (MaxLinesChipGroup.class.equals(RadioButton.class) || MaxLinesChipGroup.class.equals(AppCompatRadioButton.class)) ? new AppCompatRadioButton(context) : MaxLinesChipGroup.class.equals(RadioGroup.class) ? new RadioGroup(context) : MaxLinesChipGroup.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : MaxLinesChipGroup.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : MaxLinesChipGroup.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (MaxLinesChipGroup.class.equals(RatingBar.class) || MaxLinesChipGroup.class.equals(AppCompatRatingBar.class)) ? new AppCompatRatingBar(context) : (MaxLinesChipGroup.class.equals(SeekBar.class) || MaxLinesChipGroup.class.equals(AppCompatSeekBar.class)) ? new AppCompatSeekBar(context) : MaxLinesChipGroup.class.equals(ProgressBar.class) ? new ProgressBar(context) : MaxLinesChipGroup.class.equals(Space.class) ? new Space(context) : MaxLinesChipGroup.class.equals(RecyclerView.class) ? new RecyclerView(context) : MaxLinesChipGroup.class.equals(View.class) ? new View(context) : MaxLinesChipGroup.class.equals(Toolbar.class) ? new Toolbar(context) : MaxLinesChipGroup.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : MaxLinesChipGroup.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : l521.b(context, MaxLinesChipGroup.class));
        }
        return (MaxLinesChipGroup) (MaxLinesChipGroup.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : MaxLinesChipGroup.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : MaxLinesChipGroup.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : MaxLinesChipGroup.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : MaxLinesChipGroup.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : MaxLinesChipGroup.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : MaxLinesChipGroup.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : MaxLinesChipGroup.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : MaxLinesChipGroup.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : MaxLinesChipGroup.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : MaxLinesChipGroup.class.equals(View.class) ? new View(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : MaxLinesChipGroup.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : MaxLinesChipGroup.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : l521.a(MaxLinesChipGroup.class, context, intValue, intValue2));
    }
}
