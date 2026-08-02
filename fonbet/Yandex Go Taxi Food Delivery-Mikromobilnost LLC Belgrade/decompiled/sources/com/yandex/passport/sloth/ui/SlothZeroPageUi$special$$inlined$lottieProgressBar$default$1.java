package com.yandex.passport.sloth.ui;

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
import com.yandex.passport.common.ui.view.LottieAnimationViewBuilder;
import defpackage.er31;
import defpackage.l521;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class SlothZeroPageUi$special$$inlined$lottieProgressBar$default$1 extends FunctionReferenceImpl implements zls {
    public static final SlothZeroPageUi$special$$inlined$lottieProgressBar$default$1 b = new SlothZeroPageUi$special$$inlined$lottieProgressBar$default$1();

    public SlothZeroPageUi$special$$inlined$lottieProgressBar$default$1() {
        super(3, 1, er31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue == 0 && intValue2 == 0) {
            return (LottieAnimationViewBuilder) ((LottieAnimationViewBuilder.class.equals(TextView.class) || LottieAnimationViewBuilder.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : LottieAnimationViewBuilder.class.equals(Button.class) ? new Button(context) : (LottieAnimationViewBuilder.class.equals(ImageView.class) || LottieAnimationViewBuilder.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (LottieAnimationViewBuilder.class.equals(EditText.class) || LottieAnimationViewBuilder.class.equals(AppCompatEditText.class)) ? new AppCompatEditText(context) : LottieAnimationViewBuilder.class.equals(Spinner.class) ? new Spinner(context) : (LottieAnimationViewBuilder.class.equals(ImageButton.class) || LottieAnimationViewBuilder.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (LottieAnimationViewBuilder.class.equals(CheckBox.class) || LottieAnimationViewBuilder.class.equals(AppCompatCheckBox.class)) ? new AppCompatCheckBox(context) : (LottieAnimationViewBuilder.class.equals(RadioButton.class) || LottieAnimationViewBuilder.class.equals(AppCompatRadioButton.class)) ? new AppCompatRadioButton(context) : LottieAnimationViewBuilder.class.equals(RadioGroup.class) ? new RadioGroup(context) : LottieAnimationViewBuilder.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : LottieAnimationViewBuilder.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : LottieAnimationViewBuilder.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (LottieAnimationViewBuilder.class.equals(RatingBar.class) || LottieAnimationViewBuilder.class.equals(AppCompatRatingBar.class)) ? new AppCompatRatingBar(context) : (LottieAnimationViewBuilder.class.equals(SeekBar.class) || LottieAnimationViewBuilder.class.equals(AppCompatSeekBar.class)) ? new AppCompatSeekBar(context) : LottieAnimationViewBuilder.class.equals(ProgressBar.class) ? new ProgressBar(context) : LottieAnimationViewBuilder.class.equals(Space.class) ? new Space(context) : LottieAnimationViewBuilder.class.equals(RecyclerView.class) ? new RecyclerView(context) : LottieAnimationViewBuilder.class.equals(View.class) ? new View(context) : LottieAnimationViewBuilder.class.equals(Toolbar.class) ? new Toolbar(context) : LottieAnimationViewBuilder.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : LottieAnimationViewBuilder.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : l521.b(context, LottieAnimationViewBuilder.class));
        }
        return (LottieAnimationViewBuilder) (LottieAnimationViewBuilder.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : LottieAnimationViewBuilder.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : LottieAnimationViewBuilder.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : LottieAnimationViewBuilder.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : LottieAnimationViewBuilder.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : LottieAnimationViewBuilder.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : LottieAnimationViewBuilder.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : LottieAnimationViewBuilder.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : LottieAnimationViewBuilder.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : LottieAnimationViewBuilder.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : LottieAnimationViewBuilder.class.equals(View.class) ? new View(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : LottieAnimationViewBuilder.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : LottieAnimationViewBuilder.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : l521.a(LottieAnimationViewBuilder.class, context, intValue, intValue2));
    }
}
