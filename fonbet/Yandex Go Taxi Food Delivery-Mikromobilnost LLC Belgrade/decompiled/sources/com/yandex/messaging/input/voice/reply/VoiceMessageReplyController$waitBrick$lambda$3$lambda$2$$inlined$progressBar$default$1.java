package com.yandex.messaging.input.voice.reply;

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
public final /* synthetic */ class VoiceMessageReplyController$waitBrick$lambda$3$lambda$2$$inlined$progressBar$default$1 extends FunctionReferenceImpl implements zls {
    public static final VoiceMessageReplyController$waitBrick$lambda$3$lambda$2$$inlined$progressBar$default$1 b = new VoiceMessageReplyController$waitBrick$lambda$3$lambda$2$$inlined$progressBar$default$1();

    public VoiceMessageReplyController$waitBrick$lambda$3$lambda$2$$inlined$progressBar$default$1() {
        super(3, 1, dr31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KeyEvent.Callback appCompatSeekBar;
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue != 0 || intValue2 != 0) {
            return (ProgressBar) (ProgressBar.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : ProgressBar.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : ProgressBar.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : ProgressBar.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : ProgressBar.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : ProgressBar.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : ProgressBar.class.equals(AppCompatEditText.class) ? new AppCompatEditText(context, null, intValue) : ProgressBar.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : ProgressBar.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : ProgressBar.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : ProgressBar.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : ProgressBar.class.equals(AppCompatCheckBox.class) ? new AppCompatCheckBox(context, null, intValue) : ProgressBar.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : ProgressBar.class.equals(AppCompatRadioButton.class) ? new AppCompatRadioButton(context, null, intValue) : ProgressBar.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : ProgressBar.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : ProgressBar.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : ProgressBar.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : ProgressBar.class.equals(AppCompatRatingBar.class) ? new AppCompatRatingBar(context, null, intValue) : ProgressBar.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : ProgressBar.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context, null, intValue) : ProgressBar.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : ProgressBar.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : ProgressBar.class.equals(BrickSlotView.class) ? new BrickSlotView(context, null, intValue, intValue2) : ProgressBar.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : ProgressBar.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : ProgressBar.class.equals(View.class) ? new View(context, null, intValue, intValue2) : ProgressBar.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : ProgressBar.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : k521.a(ProgressBar.class, context, intValue, intValue2));
        }
        if (ProgressBar.class.equals(TextView.class) ? true : ProgressBar.class.equals(AppCompatTextView.class)) {
            appCompatSeekBar = new AppCompatTextView(context);
        } else if (ProgressBar.class.equals(Button.class)) {
            appCompatSeekBar = new Button(context);
        } else {
            if (ProgressBar.class.equals(ImageView.class) ? true : ProgressBar.class.equals(AppCompatImageView.class)) {
                appCompatSeekBar = new AppCompatImageView(context);
            } else {
                if (ProgressBar.class.equals(EditText.class) ? true : ProgressBar.class.equals(AppCompatEditText.class)) {
                    appCompatSeekBar = new AppCompatEditText(context);
                } else if (ProgressBar.class.equals(Spinner.class)) {
                    appCompatSeekBar = new Spinner(context);
                } else {
                    if (ProgressBar.class.equals(ImageButton.class) ? true : ProgressBar.class.equals(AppCompatImageButton.class)) {
                        appCompatSeekBar = new AppCompatImageButton(context);
                    } else {
                        if (ProgressBar.class.equals(CheckBox.class) ? true : ProgressBar.class.equals(AppCompatCheckBox.class)) {
                            appCompatSeekBar = new AppCompatCheckBox(context);
                        } else {
                            if (ProgressBar.class.equals(RadioButton.class) ? true : ProgressBar.class.equals(AppCompatRadioButton.class)) {
                                appCompatSeekBar = new AppCompatRadioButton(context);
                            } else if (ProgressBar.class.equals(RadioGroup.class)) {
                                appCompatSeekBar = new RadioGroup(context);
                            } else if (ProgressBar.class.equals(CheckedTextView.class)) {
                                appCompatSeekBar = new CheckedTextView(context);
                            } else if (ProgressBar.class.equals(AutoCompleteTextView.class)) {
                                appCompatSeekBar = new AutoCompleteTextView(context);
                            } else if (ProgressBar.class.equals(MultiAutoCompleteTextView.class)) {
                                appCompatSeekBar = new MultiAutoCompleteTextView(context);
                            } else {
                                if (ProgressBar.class.equals(RatingBar.class) ? true : ProgressBar.class.equals(AppCompatRatingBar.class)) {
                                    appCompatSeekBar = new AppCompatRatingBar(context);
                                } else {
                                    appCompatSeekBar = ProgressBar.class.equals(SeekBar.class) ? true : ProgressBar.class.equals(AppCompatSeekBar.class) ? new AppCompatSeekBar(context) : ProgressBar.class.equals(ProgressBar.class) ? new ProgressBar(context) : ProgressBar.class.equals(Space.class) ? new Space(context) : ProgressBar.class.equals(BrickSlotView.class) ? new BrickSlotView(context) : ProgressBar.class.equals(RecyclerView.class) ? new RecyclerView(context) : ProgressBar.class.equals(View.class) ? new View(context) : ProgressBar.class.equals(Toolbar.class) ? new Toolbar(context) : ProgressBar.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : ProgressBar.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : k521.b(context, ProgressBar.class);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (ProgressBar) appCompatSeekBar;
    }
}
