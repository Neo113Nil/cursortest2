package com.yandex.messaging.ui.toolbar;

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
import com.yandex.bricks.BrickSlotView;
import defpackage.dr31;
import defpackage.k521;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* synthetic */ class MessengerToolbarUi$special$$inlined$view$default$1 extends FunctionReferenceImpl implements zls {
    public static final MessengerToolbarUi$special$$inlined$view$default$1 b = new MessengerToolbarUi$special$$inlined$view$default$1();

    public MessengerToolbarUi$special$$inlined$view$default$1() {
        super(3, 1, dr31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue != 0 || intValue2 != 0) {
            return View.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : View.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : View.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : View.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : View.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : View.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : View.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : View.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : View.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : View.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : View.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : View.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : View.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : View.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : View.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : View.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : View.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : View.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : View.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : View.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : View.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : View.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : View.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : View.class.equals(BrickSlotView.class) ? new BrickSlotView(context, null, intValue, intValue2) : View.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : View.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : View.class.equals(View.class) ? new View(context, null, intValue, intValue2) : View.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : View.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : k521.a(View.class, context, intValue, intValue2);
        }
        if (View.class.equals(TextView.class) ? true : View.class.equals(AppCompatTextView.class)) {
            return new AppCompatTextView(context);
        }
        if (View.class.equals(Button.class)) {
            return new Button(context);
        }
        if (View.class.equals(ImageView.class) ? true : View.class.equals(AppCompatImageView.class)) {
            return new AppCompatImageView(context);
        }
        if (View.class.equals(EditText.class) ? true : View.class.equals(AppCompatEditText.class)) {
            return new AppCompatEditText(context);
        }
        if (View.class.equals(Spinner.class)) {
            return new Spinner(context);
        }
        if (View.class.equals(ImageButton.class) ? true : View.class.equals(AppCompatImageButton.class)) {
            return new AppCompatImageButton(context);
        }
        if (View.class.equals(CheckBox.class) ? true : View.class.equals(AppCompatCheckBox.class)) {
            return new AppCompatCheckBox(context);
        }
        if (View.class.equals(RadioButton.class) ? true : View.class.equals(AppCompatRadioButton.class)) {
            return new AppCompatRadioButton(context);
        }
        if (View.class.equals(RadioGroup.class)) {
            return new RadioGroup(context);
        }
        if (View.class.equals(CheckedTextView.class)) {
            return new CheckedTextView(context);
        }
        if (View.class.equals(AutoCompleteTextView.class)) {
            return new AutoCompleteTextView(context);
        }
        if (View.class.equals(MultiAutoCompleteTextView.class)) {
            return new MultiAutoCompleteTextView(context);
        }
        if (View.class.equals(RatingBar.class) ? true : View.class.equals(AppCompatRatingBar.class)) {
            return new AppCompatRatingBar(context);
        }
        return View.class.equals(SeekBar.class) ? true : View.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context) : View.class.equals(ProgressBar.class) ? new ProgressBar(context) : View.class.equals(Space.class) ? new Space(context) : View.class.equals(BrickSlotView.class) ? new BrickSlotView(context) : View.class.equals(RecyclerView.class) ? new RecyclerView(context) : View.class.equals(View.class) ? new View(context) : View.class.equals(Toolbar.class) ? new Toolbar(context) : View.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : View.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : k521.b(context, View.class);
    }
}
