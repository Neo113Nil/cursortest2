package com.yandex.messaging.attachments;

import android.content.Context;
import android.view.KeyEvent;
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
public final /* synthetic */ class SystemAttachmentsSelectionUi$special$$inlined$textView$default$2 extends FunctionReferenceImpl implements zls {
    public static final SystemAttachmentsSelectionUi$special$$inlined$textView$default$2 b = new SystemAttachmentsSelectionUi$special$$inlined$textView$default$2();

    public SystemAttachmentsSelectionUi$special$$inlined$textView$default$2() {
        super(3, 1, dr31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KeyEvent.Callback appCompatSeekBar;
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue != 0 || intValue2 != 0) {
            return (TextView) (TextView.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : TextView.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : TextView.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : TextView.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : TextView.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : TextView.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : TextView.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : TextView.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : TextView.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : TextView.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : TextView.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : TextView.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : TextView.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : TextView.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : TextView.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : TextView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : TextView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : TextView.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : TextView.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : TextView.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : TextView.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : TextView.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : TextView.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : TextView.class.equals(BrickSlotView.class) ? new BrickSlotView(context, null, intValue, intValue2) : TextView.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : TextView.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : TextView.class.equals(View.class) ? new View(context, null, intValue, intValue2) : TextView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : TextView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : k521.a(TextView.class, context, intValue, intValue2));
        }
        if (TextView.class.equals(TextView.class) ? true : TextView.class.equals(AppCompatTextView.class)) {
            appCompatSeekBar = new AppCompatTextView(context);
        } else if (TextView.class.equals(Button.class)) {
            appCompatSeekBar = new Button(context);
        } else {
            if (TextView.class.equals(ImageView.class) ? true : TextView.class.equals(AppCompatImageView.class)) {
                appCompatSeekBar = new AppCompatImageView(context);
            } else {
                if (TextView.class.equals(EditText.class) ? true : TextView.class.equals(AppCompatEditText.class)) {
                    appCompatSeekBar = new AppCompatEditText(context);
                } else if (TextView.class.equals(Spinner.class)) {
                    appCompatSeekBar = new Spinner(context);
                } else {
                    if (TextView.class.equals(ImageButton.class) ? true : TextView.class.equals(AppCompatImageButton.class)) {
                        appCompatSeekBar = new AppCompatImageButton(context);
                    } else {
                        if (TextView.class.equals(CheckBox.class) ? true : TextView.class.equals(AppCompatCheckBox.class)) {
                            appCompatSeekBar = new AppCompatCheckBox(context);
                        } else {
                            if (TextView.class.equals(RadioButton.class) ? true : TextView.class.equals(AppCompatRadioButton.class)) {
                                appCompatSeekBar = new AppCompatRadioButton(context);
                            } else if (TextView.class.equals(RadioGroup.class)) {
                                appCompatSeekBar = new RadioGroup(context);
                            } else if (TextView.class.equals(CheckedTextView.class)) {
                                appCompatSeekBar = new CheckedTextView(context);
                            } else if (TextView.class.equals(AutoCompleteTextView.class)) {
                                appCompatSeekBar = new AutoCompleteTextView(context);
                            } else if (TextView.class.equals(MultiAutoCompleteTextView.class)) {
                                appCompatSeekBar = new MultiAutoCompleteTextView(context);
                            } else {
                                if (TextView.class.equals(RatingBar.class) ? true : TextView.class.equals(AppCompatRatingBar.class)) {
                                    appCompatSeekBar = new AppCompatRatingBar(context);
                                } else {
                                    appCompatSeekBar = TextView.class.equals(SeekBar.class) ? true : TextView.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context) : TextView.class.equals(ProgressBar.class) ? new ProgressBar(context) : TextView.class.equals(Space.class) ? new Space(context) : TextView.class.equals(BrickSlotView.class) ? new BrickSlotView(context) : TextView.class.equals(RecyclerView.class) ? new RecyclerView(context) : TextView.class.equals(View.class) ? new View(context) : TextView.class.equals(Toolbar.class) ? new Toolbar(context) : TextView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : TextView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : k521.b(context, TextView.class);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (TextView) appCompatSeekBar;
    }
}
