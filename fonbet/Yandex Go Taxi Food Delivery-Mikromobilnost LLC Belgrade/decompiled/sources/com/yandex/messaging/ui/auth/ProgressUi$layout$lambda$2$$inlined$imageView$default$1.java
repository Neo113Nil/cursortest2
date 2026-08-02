package com.yandex.messaging.ui.auth;

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
public final /* synthetic */ class ProgressUi$layout$lambda$2$$inlined$imageView$default$1 extends FunctionReferenceImpl implements zls {
    public static final ProgressUi$layout$lambda$2$$inlined$imageView$default$1 b = new ProgressUi$layout$lambda$2$$inlined$imageView$default$1();

    public ProgressUi$layout$lambda$2$$inlined$imageView$default$1() {
        super(3, 1, dr31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KeyEvent.Callback appCompatSeekBar;
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue != 0 || intValue2 != 0) {
            return (ImageView) (ImageView.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : ImageView.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : ImageView.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : ImageView.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : ImageView.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : ImageView.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : ImageView.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : ImageView.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : ImageView.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : ImageView.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : ImageView.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : ImageView.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : ImageView.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : ImageView.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : ImageView.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : ImageView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : ImageView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : ImageView.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : ImageView.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : ImageView.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : ImageView.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : ImageView.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : ImageView.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : ImageView.class.equals(BrickSlotView.class) ? new BrickSlotView(context, null, intValue, intValue2) : ImageView.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : ImageView.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : ImageView.class.equals(View.class) ? new View(context, null, intValue, intValue2) : ImageView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : ImageView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : k521.a(ImageView.class, context, intValue, intValue2));
        }
        if (ImageView.class.equals(TextView.class) ? true : ImageView.class.equals(AppCompatTextView.class)) {
            appCompatSeekBar = new AppCompatTextView(context);
        } else if (ImageView.class.equals(Button.class)) {
            appCompatSeekBar = new Button(context);
        } else {
            if (ImageView.class.equals(ImageView.class) ? true : ImageView.class.equals(AppCompatImageView.class)) {
                appCompatSeekBar = new AppCompatImageView(context);
            } else {
                if (ImageView.class.equals(EditText.class) ? true : ImageView.class.equals(AppCompatEditText.class)) {
                    appCompatSeekBar = new AppCompatEditText(context);
                } else if (ImageView.class.equals(Spinner.class)) {
                    appCompatSeekBar = new Spinner(context);
                } else {
                    if (ImageView.class.equals(ImageButton.class) ? true : ImageView.class.equals(AppCompatImageButton.class)) {
                        appCompatSeekBar = new AppCompatImageButton(context);
                    } else {
                        if (ImageView.class.equals(CheckBox.class) ? true : ImageView.class.equals(AppCompatCheckBox.class)) {
                            appCompatSeekBar = new AppCompatCheckBox(context);
                        } else {
                            if (ImageView.class.equals(RadioButton.class) ? true : ImageView.class.equals(AppCompatRadioButton.class)) {
                                appCompatSeekBar = new AppCompatRadioButton(context);
                            } else if (ImageView.class.equals(RadioGroup.class)) {
                                appCompatSeekBar = new RadioGroup(context);
                            } else if (ImageView.class.equals(CheckedTextView.class)) {
                                appCompatSeekBar = new CheckedTextView(context);
                            } else if (ImageView.class.equals(AutoCompleteTextView.class)) {
                                appCompatSeekBar = new AutoCompleteTextView(context);
                            } else if (ImageView.class.equals(MultiAutoCompleteTextView.class)) {
                                appCompatSeekBar = new MultiAutoCompleteTextView(context);
                            } else {
                                if (ImageView.class.equals(RatingBar.class) ? true : ImageView.class.equals(AppCompatRatingBar.class)) {
                                    appCompatSeekBar = new AppCompatRatingBar(context);
                                } else {
                                    appCompatSeekBar = ImageView.class.equals(SeekBar.class) ? true : ImageView.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context) : ImageView.class.equals(ProgressBar.class) ? new ProgressBar(context) : ImageView.class.equals(Space.class) ? new Space(context) : ImageView.class.equals(BrickSlotView.class) ? new BrickSlotView(context) : ImageView.class.equals(RecyclerView.class) ? new RecyclerView(context) : ImageView.class.equals(View.class) ? new View(context) : ImageView.class.equals(Toolbar.class) ? new Toolbar(context) : ImageView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : ImageView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : k521.b(context, ImageView.class);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (ImageView) appCompatSeekBar;
    }
}
