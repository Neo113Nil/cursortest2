package com.yandex.passport.internal.ui.bouncer.roundabout;

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
import com.lightside.slab.SlotView;
import defpackage.er31;
import defpackage.l521;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class RoundaboutInnerUi$special$$inlined$recyclerView$default$1 extends FunctionReferenceImpl implements zls {
    public static final RoundaboutInnerUi$special$$inlined$recyclerView$default$1 b = new RoundaboutInnerUi$special$$inlined$recyclerView$default$1();

    public RoundaboutInnerUi$special$$inlined$recyclerView$default$1() {
        super(3, 1, er31.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;");
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KeyEvent.Callback a;
        KeyEvent.Callback slotView;
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue == 0 && intValue2 == 0) {
            return (RecyclerView) ((RecyclerView.class.equals(TextView.class) || RecyclerView.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : RecyclerView.class.equals(Button.class) ? new Button(context) : (RecyclerView.class.equals(ImageView.class) || RecyclerView.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (RecyclerView.class.equals(EditText.class) || RecyclerView.class.equals(AppCompatEditText.class)) ? new AppCompatEditText(context) : RecyclerView.class.equals(Spinner.class) ? new Spinner(context) : (RecyclerView.class.equals(ImageButton.class) || RecyclerView.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (RecyclerView.class.equals(CheckBox.class) || RecyclerView.class.equals(AppCompatCheckBox.class)) ? new AppCompatCheckBox(context) : (RecyclerView.class.equals(RadioButton.class) || RecyclerView.class.equals(AppCompatRadioButton.class)) ? new AppCompatRadioButton(context) : RecyclerView.class.equals(RadioGroup.class) ? new RadioGroup(context) : RecyclerView.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : RecyclerView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : RecyclerView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (RecyclerView.class.equals(RatingBar.class) || RecyclerView.class.equals(AppCompatRatingBar.class)) ? new AppCompatRatingBar(context) : (RecyclerView.class.equals(SeekBar.class) || RecyclerView.class.equals(AppCompatSeekBar.class)) ? new AppCompatSeekBar(context) : RecyclerView.class.equals(ProgressBar.class) ? new ProgressBar(context) : RecyclerView.class.equals(Space.class) ? new Space(context) : RecyclerView.class.equals(RecyclerView.class) ? new RecyclerView(context) : RecyclerView.class.equals(View.class) ? new View(context) : RecyclerView.class.equals(Toolbar.class) ? new Toolbar(context) : RecyclerView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : RecyclerView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : l521.b(context, RecyclerView.class));
        }
        if (RecyclerView.class.equals(TextView.class)) {
            a = new TextView(context, null, intValue, intValue2);
        } else {
            if (RecyclerView.class.equals(AppCompatTextView.class)) {
                slotView = new AppCompatTextView(context, null, intValue);
            } else if (RecyclerView.class.equals(Button.class)) {
                slotView = new Button(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(ImageView.class)) {
                slotView = new ImageView(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(AppCompatImageView.class)) {
                slotView = new AppCompatImageView(context, null, intValue);
            } else if (RecyclerView.class.equals(EditText.class)) {
                slotView = new EditText(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(AppCompatEditText.class)) {
                slotView = new AppCompatEditText(context, null, intValue);
            } else if (RecyclerView.class.equals(Spinner.class)) {
                slotView = new Spinner(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(ImageButton.class)) {
                slotView = new ImageButton(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(AppCompatImageButton.class)) {
                slotView = new AppCompatImageButton(context, null, intValue);
            } else if (RecyclerView.class.equals(CheckBox.class)) {
                slotView = new CheckBox(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(AppCompatCheckBox.class)) {
                slotView = new AppCompatCheckBox(context, null, intValue);
            } else if (RecyclerView.class.equals(RadioButton.class)) {
                slotView = new RadioButton(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(AppCompatRadioButton.class)) {
                slotView = new AppCompatRadioButton(context, null, intValue);
            } else if (RecyclerView.class.equals(CheckedTextView.class)) {
                slotView = new CheckedTextView(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(AutoCompleteTextView.class)) {
                slotView = new AutoCompleteTextView(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(MultiAutoCompleteTextView.class)) {
                slotView = new MultiAutoCompleteTextView(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(RatingBar.class)) {
                slotView = new RatingBar(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(AppCompatRatingBar.class)) {
                slotView = new AppCompatRatingBar(context, null, intValue);
            } else if (RecyclerView.class.equals(SeekBar.class)) {
                slotView = new SeekBar(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(AppCompatSeekBar.class)) {
                slotView = new AppCompatSeekBar(context, null, intValue);
            } else if (RecyclerView.class.equals(ProgressBar.class)) {
                slotView = new ProgressBar(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(Space.class)) {
                slotView = new Space(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(RecyclerView.class)) {
                slotView = new RecyclerView(context, null, intValue);
            } else if (RecyclerView.class.equals(Toolbar.class)) {
                slotView = new Toolbar(context, null, intValue);
            } else if (RecyclerView.class.equals(View.class)) {
                slotView = new View(context, null, intValue, intValue2);
            } else if (RecyclerView.class.equals(FloatingActionButton.class)) {
                slotView = new FloatingActionButton(context, null, intValue);
            } else if (RecyclerView.class.equals(SwitchCompat.class)) {
                slotView = new SwitchMaterial(context, null, intValue);
            } else if (RecyclerView.class.equals(SlotView.class)) {
                slotView = new SlotView(context, null, intValue, intValue2);
            } else {
                a = l521.a(RecyclerView.class, context, intValue, intValue2);
            }
            a = slotView;
        }
        return (RecyclerView) a;
    }
}
